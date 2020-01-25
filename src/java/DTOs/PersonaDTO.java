/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

/**
 *
 * @author Daniela
 */
public class PersonaDTO {
    private String Tipo_documento;
    private int Num_documento;
    private String Nombres;
    private String Apellido1;
    private String Apellido2;
    
    public PersonaDTO(){   
    }

    public PersonaDTO(int Num_documento) {
        this.Num_documento = Num_documento;
    }

    public String getTipo_documento() {
        return Tipo_documento;
    }

    public void setTipo_documento(String Tipo_documento) {
        this.Tipo_documento = Tipo_documento;
    }

    public int getNum_documento() {
        return Num_documento;
    }

    public void setNum_documento(int Num_documento) {
        this.Num_documento = Num_documento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    

    
}
