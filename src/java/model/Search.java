
package model;

import javax.servlet.http.HttpServletRequest;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSetFormatter;
import controller.sparqlSearch;

/**
 *
 * @author arthur
 */
public class Search {
    
    public void search(HttpServletRequest request, String datasetSearch, String querySearch){
        
        org.apache.log4j.Logger.getRootLogger().setLevel(org.apache.log4j.Level.OFF);
             
        // create a sparql query by hand
//        String queryString = "";
//        Query query = QueryFactory.create(queryString);
        Query query = QueryFactory.create(querySearch);
             
        // print out the query
//        query.serialize(System.out);
//        System.out.println("\nQuery utilizada: " + querySearch + "\n");
        
        // TODO Auto-generated method stub
        QueryExecution qExec = QueryExecutionFactory.sparqlService("http://"+request.getServerName()+":"+sparqlSearch.getport()+"/dadoscaruaru/" + datasetSearch, query);
//        ResultSet rs = qExec.execSelect() ;
             
//        for ( ; rs.hasNext() ; ){
//            // the next solution i.e. returned result set
//            QuerySolution rb = rs.nextSolution() ;     
//            System.out.println("aqui" + rb);
// 
//            // get nodes from the solution and cast them appropriately
//                 
//            Literal concept = (Literal) rb.get("concept") ;     // ?title is just an untyped literal
//            //Literal fileURI = (Literal) rb.get("fileURI") ;   // ?fileURI is a uri and so will be a resource
//            //  Literal bla = (Literal) rb.get("bla") ;
//                 
//            // print out the result
//            System.out.println(concept);
//        }
        
        ResultSetFormatter.out(System.out, qExec.execSelect(), query) ;
             
        qExec.close() ; 
        
    }
    
}
