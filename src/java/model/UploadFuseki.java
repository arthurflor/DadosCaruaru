
package model;

import controller.uploadConvert;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import org.apache.jena.atlas.web.auth.HttpAuthenticator;
import org.apache.jena.atlas.web.auth.SimpleAuthenticator;
import org.apache.jena.query.DatasetAccessor;
import org.apache.jena.query.DatasetAccessorFactory;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

public class UploadFuseki {
    
    public boolean uploadfuseki(HttpServletRequest request, String file, String dataset){
    
        org.apache.log4j.Logger.getRootLogger().setLevel(org.apache.log4j.Level.OFF);
        
        HttpAuthenticator admin = new SimpleAuthenticator("admin", "admin".toCharArray());
        String serviceURI = "http://"+request.getServerName()+":"+uploadConvert.getport()+"/dadoscaruaru/" + dataset;
//        String serviceURI = "http://localhost:8080/dadoscaruaru/saude";
        
        DatasetAccessor accessor;
        accessor = DatasetAccessorFactory.createHTTP(serviceURI, admin);
        
        try {
            InputStream in = new FileInputStream(file);
            Model m = ModelFactory.createDefaultModel();
            m.read(in, serviceURI, "N3");
            accessor.putModel(m);

            request.setAttribute("message", "<font color='green'><h3><b>Convert and Upload, Success!</b></h3></font>");
            return true;    
            
        } catch (Exception ex) {
            
            request.setAttribute("message", "<font color='orange'><h3><b>Convert and Upload, Error!<br>"+ex+"</b></h3></font>");    
            return false;
        }
    }
}
