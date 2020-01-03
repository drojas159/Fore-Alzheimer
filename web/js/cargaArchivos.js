/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function cargarArchivo(elemento){
    var file = elemento.files[0];
    var objHidden = document.formulario.nombre;
    objHidden.value = file.name;
    document.formulario.target = "null";
    document.formulario.action = "ProcesoArchivo";
    document.formulario.submit();
    alert("Proceso terminado");
}

