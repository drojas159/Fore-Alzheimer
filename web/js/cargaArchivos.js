/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function cargarArchivo() {
    var file = document.formulario.csv1.files[0];
    //var file02 = document.formulario.csv2.files[0];

    

    var objHidden;
    //var objHidden02;
    //var objHidden03 ;

    objHidden = document.formulario.nombre;
    objHidden.value = file.name;
    alert(file.name);
    document.formulario.target = "null";
    document.formulario.action = "ProcesoArchivo";
    //document.formulario.submit();

}

