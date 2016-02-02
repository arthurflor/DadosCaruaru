
package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Convert;
import model.Upload;
import model.UploadFuseki;
import org.apache.commons.io.FileUtils;

@WebServlet(name = "uploadConvert")
@MultipartConfig
public class uploadConvert extends HttpServlet {
     
    private static final String port="8080";
    
    // location to store file uploaded
    private static final String UPLOAD_DIRECTORY = "/fuseki/upload/tables";
    private static final String UPLOAD_DIRECTORY_N3 = "/fuseki/upload/n3";
    
    private static String xls;
    private static String trig;
    private static String n3;
    private static String nomeGraph;
    private static String dataset;
    
    public static String getport() {
        return port;
    }
    
    public static String getXls() {
        return xls;
    }

    public static String getTrig() {
        return trig;
    }
    
    public static String getN3() {
        return n3;
    }

    public static void setXls(String aXls) {
        xls = aXls;
    }

    public static void setTrig(String aTrig) {
        trig = aTrig;
    }
    
    public static void setN3(String an3) {
        n3 = an3;
    }

    public static String getNomeGraph() {
        return nomeGraph;
    }

    public static void setNomeGraph(String aNomeGraph) {
        nomeGraph = aNomeGraph;
    }

    public static String getDataset() {
        return dataset;
    }

    public static void setDataset(String aDataset) {
        dataset = aDataset;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet upConvert</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet upConvert at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {      
        
        uploadConvert.setDataset(request.getParameter("nomeDataset"));
        uploadConvert.setNomeGraph(request.getParameter("nomeGraph"));
        uploadConvert.setN3(request.getParameter("nomeGraph"));
        
        String uploadPath = getServletContext().getRealPath("") +
                            UPLOAD_DIRECTORY + File.separator + 
                            uploadConvert.getDataset() + File.separator + 
                            uploadConvert.getNomeGraph();
        
        boolean checkUploadXls = new Upload().upXLSTRIG(request, "fileXls", uploadPath);
        boolean checkUploadTrig = false;
        boolean checkConvertN3 = false;
        boolean checkUploadFuseki = false;
        String uploadPathN3="";
        
        if (checkUploadXls) checkUploadTrig = new Upload().upXLSTRIG(request, "fileTrig", uploadPath);
        
        if(checkUploadXls && checkUploadTrig){
            uploadPathN3 = getServletContext().getRealPath("") + 
                                    UPLOAD_DIRECTORY_N3 + File.separator + 
                                    uploadConvert.getDataset();
            
            checkConvertN3 = new Convert().n3(uploadPath + File.separator + uploadConvert.getTrig(), uploadPathN3);
            
            if(!checkConvertN3){
                request.setAttribute("message", "<font color='red'><h3><b>Conversion error!</b></h3></font>");
            
            } else {
                String uploadPathFuseki =   getServletContext().getRealPath("") + 
                                            UPLOAD_DIRECTORY_N3 + File.separator + 
                                            uploadConvert.getDataset() + File.separator +
                                            uploadConvert.getN3()+".n3";
           
                checkUploadFuseki = new UploadFuseki().uploadfuseki(request, uploadPathFuseki, uploadConvert.getDataset());
            }
        }
        
        if (!checkUploadXls || !checkUploadTrig || !checkConvertN3 || !checkUploadFuseki) {
            FileUtils.deleteDirectory(new File(uploadPath));
            FileUtils.deleteDirectory(new File(uploadPathN3));
        }
        
        getServletContext().getRequestDispatcher("/fuseki/uploadMessage.jsp").forward(request, response);
        
    }
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}