$( document ).ready(function() {
   
        window.setTimeout(function() {

            var elts = document.getElementsByClassName('text');
            
            document.getElementById("lista_dataset_html").innerHTML += "<div class='list-group'>\n";
            
            for (var i = 0; i < elts.length; ++i) {
                
                var aux = elts[i].innerHTML.replace(/^\s+|\s+$/g,"");
                aux = aux.substring(1);
                var outString = aux.replace(/[`~!@#$%^&*()_|+\-=?;:'",.<>\{\}\[\]\\\/]/gi, " ");
                
                document.getElementById("lista_dataset_html").innerHTML += "<a href='querySearch?param="+aux+"' class='list-group-item'>" + outString + "</a>";
            }
            
            document.getElementById("lista_dataset_html").innerHTML += "</div>\n";
            
        }, 1000);
    
});