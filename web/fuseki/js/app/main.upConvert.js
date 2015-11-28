$( document ).ready(function() {
    
    var checkGraph=false;
    var checkXls=false;
    var checkTrig=false;
                                        
    $("#nomeGraph").on("change paste keyup", function() { 
        var aux=$( "#nomeGraph" ).val();
        if (aux.length>0) checkGraph=true;
        else checkGraph=false;
                                            
        var dataset=$( "select.selectpicker option:selected" ).text();
        if(checkXls && checkTrig && dataset.length>0 && checkGraph) $("#up").removeAttr("disabled");
        else $("#up").attr("disabled","disabled");
    });
                                        
    $("#uploadBtnXls").bind("change", function() { 
        checkXls=true;
        var dataset=$( "select.selectpicker option:selected" ).text();
        if(checkXls && checkTrig && dataset.length>0 && checkGraph) $("#up").removeAttr("disabled");
    });
    
    $("#uploadBtnTrig").bind("change", function() { 
        checkTrig=true; 
        var dataset=$( "select.selectpicker option:selected" ).text();
        if(checkXls && checkTrig && dataset.length>0 && checkGraph) $("#up").removeAttr("disabled");
    });         
                  
    document.getElementById("uploadBtnXls").onchange = function () {
        document.getElementById("uploadFileXls").value = this.value;
    };
    
    document.getElementById("uploadBtnTrig").onchange = function () {
        document.getElementById("uploadFileTrig").value = this.value;
    };
    
    $("#up").click(function(){
        var aux = $( "select.selectpicker option:selected" ).text().replace(/^\s+|\s+$/g,"");
        aux = aux.replace(/[-\/\\^$*+?.()|[\]{}]/g,"");
        
        document.getElementById('dataset').setAttribute('value', aux);
    });
});