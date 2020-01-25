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
public class Auxiliar extends PersonaDTO{

    private String Contrasena;
    private String Rol2;

    public Auxiliar(int Num_documento) {
        super(Num_documento);
    }

    public String getContrasena() {
        return Contrasena;
    }

    public String getRol2() {
        return Rol2;
    }
    
    
}
