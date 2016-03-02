$( document ).ready(function() {
   
        window.setTimeout(function() {

            var elts = document.getElementsByClassName('text');
            
            document.getElementById("lista_dataset_html").innerHTML += "<div class='list-group'>\n";
            
            for (var i = 0; i < elts.length; ++i) {
                var aux = elts[i].innerHTML.replace(/[`~!@#$%^&*()_|+\-=?;:'",.<>\{\}\[\]\\\/]/gi, '');
                var outString = aux.replace(/^\s+|\s+$/g,"");
                document.getElementById("lista_dataset_html").innerHTML += "<a href='querySearch?param="+outString+"' class='list-group-item'>" + outString + "</a>";
            }
            
            document.getElementById("lista_dataset_html").innerHTML += "</div>\n";
            
        }, 500);
    
});