
package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import at.jku.xlwrap.common.XLWrapException;
import at.jku.xlwrap.exec.XLWrapMaterializer;
import at.jku.xlwrap.map.MappingParser;
import at.jku.xlwrap.map.XLWrapMapping;
import com.hp.hpl.jena.rdf.model.Model;
import controller.uploadConvert;
import java.io.File;

public class Convert {
    
    public boolean n3(String origem, String destino) {
     
        XLWrapMapping map;

        File uploadDir = new File(destino);
        if (!uploadDir.exists()) {  
            uploadDir.mkdirs();
        } 
        
        try {
            map = MappingParser.parse(origem);
            XLWrapMaterializer mat = new XLWrapMaterializer();
            Model m = mat.generateModel(map);
            setPrefixes(m);
            m.write(new FileOutputStream(uploadDir + File.separator + uploadConvert.getN3() + ".n3"),"N3");
            
            return true;
            
        } catch (XLWrapException e) {
            return false;
        } 
        catch (FileNotFoundException e) {
            return false;
        }
    }
	
    private static void setPrefixes(Model m) {
        m.setNsPrefix("rdfs", "http://www.w3.org/2000/01/rdf-schema#");
        m.setNsPrefix("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        m.setNsPrefix("xsd", "http://www.w3.org/2001/XMLSchema#");
        m.setNsPrefix("owl", "http://www.w3.org/2002/07/owl#");
        m.setNsPrefix("ex", "http://example.org/");
        m.setNsPrefix("dc", "http://purl.org/dc/elements/1.1/");
        m.setNsPrefix("xl", "http://purl.org/NET/xlwrap#");
        m.setNsPrefix("dbpedia-owl", "http://dbpedia.org/ontology/");
        m.setNsPrefix("xvcard", "http://www.bcn.cat/data/v8y/xvcard#");
        m.setNsPrefix("cin", "http://www.cin.ufpe.br/ConsumerComplaint/");
        m.setNsPrefix("foaf", "http://xmlns.com/foaf/0.1/");
        m.setNsPrefix("dbpprop", "http://dbpedia.org/property/");
        m.setNsPrefix("upe", "http://www.upe.br/");

    }
}
