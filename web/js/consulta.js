function searchDatasetJS(){
    
    var input, filter, ul, li, a, i;
    
    input = document.getElementById('input_searchDataset');
    filter = input.value.toUpperCase();
    ul = document.getElementById("ul_searchDataset");
    li = ul.getElementsByTagName('li');

    for (i = 0; i < li.length; i++) {
        a = li[i].getElementsByTagName("a")[0];
        if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        } else {
            li[i].style.display = "none";
        }
    }
}

$( document ).ready(function() {
    
    waitingDialog.show('Carregando...');

        window.setTimeout(function() {

            var elts = document.getElementsByClassName('text');
            
            document.getElementById("lista_dataset_html").innerHTML += '<input type="text" id="input_searchDataset" onkeyup="searchDatasetJS()" placeholder="Procure por Datasets.."> <ul id="ul_searchDataset">\n';
            
            for (var i = 0; i < elts.length; ++i) {
                
                var aux = elts[i].innerHTML.replace(/^\s+|\s+$/g,"");
                aux = aux.substring(1);
                var outString = aux.replace(/[`~!@#$%^&*()_|+\-=?;:'",.<>\{\}\[\]\\\/]/gi, " ");
                
                document.getElementById("ul_searchDataset").innerHTML += '<li><a href="querySearch?param='+aux+'">' + outString + '</a></li>';    
            }
            
            document.getElementById("lista_dataset_html").innerHTML += "</ul>\n";
            
            waitingDialog.hide();
        }, 1000);

});

// loading
!function(e,d){"use strict";"function"==typeof define&&define.amd?define(["jquery"],function(a){return e.waitingDialog=d(a)}):e.waitingDialog=e.waitingDialog||d(e.jQuery)}(this,function(e){"use strict";function d(d){return d&&d.remove(),e('<div class="modal fade" data-backdrop="static" data-keyboard="false" tabindex="-1" role="dialog" aria-hidden="true" style="padding-top:15%; overflow-y:visible;"><div class="modal-dialog modal-m"><div class="modal-content"><div class="modal-header" style="display: none;"></div><div class="modal-body"><div class="progress progress-striped active" style="margin-bottom:0;"><div class="progress-bar" style="width: 100%"></div></div></div></div></div></div>')}var a,o;return{show:function(n,i){"undefined"==typeof i&&(i={}),"undefined"==typeof n&&(n="Loading"),o=e.extend({headerText:"",headerSize:3,headerClass:"",dialogSize:"m",progressType:"warning",contentElement:"p",contentClass:"content",onHide:null,onShow:null},i);var s,t;a=d(a),a.find(".modal-dialog").attr("class","modal-dialog").addClass("modal-"+o.dialogSize),a.find(".progress-bar").attr("class","progress-bar"),o.progressType&&a.find(".progress-bar").addClass("progress-bar-"+o.progressType),s=e("<h"+o.headerSize+" />"),s.css({margin:0}),o.headerClass&&s.addClass(o.headerClass),t=e("<"+o.contentElement+" />"),o.contentClass&&t.addClass(o.contentClass),o.headerText===!1?(t.html(n),a.find(".modal-body").prepend(t)):o.headerText?(s.html(o.headerText),a.find(".modal-header").html(s).show(),t.html(n),a.find(".modal-body").prepend(t)):(s.html(n),a.find(".modal-header").html(s).show()),"function"==typeof o.onHide&&a.off("hidden.bs.modal").on("hidden.bs.modal",function(){o.onHide.call(a)}),"function"==typeof o.onShow&&a.off("shown.bs.modal").on("shown.bs.modal",function(){o.onShow.call(a)}),a.modal()},hide:function(){"undefined"!=typeof a&&a.modal("hide")},message:function(e){return"undefined"!=typeof a?"undefined"!=typeof e?a.find(".modal-header>h"+o.headerSize).html(e):a.find(".modal-header>h"+o.headerSize).html():void 0}}});
