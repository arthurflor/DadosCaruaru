$( document ).ready(function() {
   
        window.setTimeout(function() {

            var elts = document.getElementsByClassName('text');
            
            for (var i = 0; i < elts.length; ++i) {
                var outString = elts[i].innerHTML.replace(/[`~!@#$%^&*()_|+\-=?;:'",.<>\{\}\[\]\\\/]/gi, '');
                document.getElementById("lista_dataset_html").innerHTML += outString + "<br>";
            }
            
        }, 1000);
    
});
