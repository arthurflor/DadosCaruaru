
package model;

import controller.uploadConvert;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

public class Upload {
        
    public boolean upXLSTRIG(HttpServletRequest request, String name, String uploadPath) throws ServletException, IOException {
        
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {  
            uploadDir.mkdirs();
        }  
        
        if(uploadDir.list().length<=1){
            
            Part filePart = request.getPart(name);
            String fileName="";

            for (String content : filePart.getHeader("content-disposition").split(";")) {
                if (content.trim().startsWith("filename")) {
                    fileName = content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
                    break;
                }
            }
            
            if (name.equals("fileXls")) uploadConvert.setXls(fileName);
            else if (name.equals("fileTrig")) uploadConvert.setTrig(fileName);

            String uploadPathFinal = uploadPath + File.separator + fileName;

            OutputStream out = null;
            InputStream filecontent = null;

            try {
                out = new FileOutputStream(new File(uploadPathFinal));
                filecontent = filePart.getInputStream();

                int read;
                byte[] bytes = new byte[1024];

                while ((read = filecontent.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
                
                
                if (name.equals("fileTrig")){
                      
                    String arquivo = uploadPathFinal;
                    String arquivoTmp = uploadPath + File.separator + "tmp.trig";

                    BufferedReader reader;
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoTmp))) {
                        
                        reader = new BufferedReader(new FileReader(arquivo));
                        String linha;
                        while ((linha = reader.readLine()) != null) {
                            if (linha.contains("xl:fileName")) {
                                linha = "\t\txl:fileName \""+ uploadPath + File.separator + uploadConvert.getXls() + "\";";
                            }
                            writer.write(linha + "\n");
                        }
                    }
                    
                    reader.close();

                    new File(arquivo).delete();
                    new File(arquivoTmp).renameTo(new File(arquivo));
                }
                
//                request.setAttribute("message", "<font color='green'><h3><b>Convert and Upload, Success!</b></h3></font>");
                return true;

            } catch (FileNotFoundException ex) {
                
                request.setAttribute("message", "<font color='red'><h3><b>Convert and Upload, Error!<br>"+ex+"</b></h3></font>");
                return false;

            } finally {
                if (out != null) {
                    out.close();
                }
                if (filecontent != null) {
                    filecontent.close();
                }
            }
                
        } else {
            request.setAttribute("message", "<font color='red'><h3><b>First upload Error!<br>Exists another file with the same name.</b></h3></font>");
            return false;
        }
    }
}