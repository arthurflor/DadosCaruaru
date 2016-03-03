
package model;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.RDFNode;
import controller.sparqlSearch;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author arthur
 */
public class Search {
    
    public ArrayList<ArrayList> search(HttpServletRequest request, String datasetSearch, String querySearch){
        
        org.apache.log4j.Logger.getRootLogger().setLevel(org.apache.log4j.Level.OFF);
             
        Query query = QueryFactory.create(querySearch);

        QueryExecution qExec = QueryExecutionFactory.sparqlService("http://"+request.getServerName()+":"+sparqlSearch.getport()+"/dadoscaruaru/" + datasetSearch, query);
        ResultSet rs = qExec.execSelect();
        
        boolean check = false;
        ArrayList<String> colunas = new ArrayList<>();
        ArrayList<ArrayList> resultado = new ArrayList<>();
        
        while (rs.hasNext()){
            
            QuerySolution rb = rs.nextSolution() ;     
            Iterator<String> line = rb.varNames();
            ArrayList<String> arrayLine = new ArrayList<>();
                        
            if (!check){
                check=true;
                while(line.hasNext()){
                    colunas.add(line.next());
                }
            }
            
            for (int i=0; i<colunas.size(); i++){
                RDFNode concept = rb.get(colunas.get(i));
                arrayLine.add(concept.toString());
                
//                System.out.println(concept);
            }
            resultado.add(arrayLine);            
          
//            System.out.println(line.next());
//            System.out.println(concept);
        }
        
//        ResultSetFormatter.out(System.out, qExec.execSelect(), query) ;

        qExec.close();
        
        return resultado;
    }
    
}
