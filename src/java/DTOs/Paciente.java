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
public class Paciente extends PersonaDTO{
    private String Rol3;

    public Paciente(int Num_documento) {
        super(Num_documento);
    }

    public String getRol3() {
        return Rol3;
    }
    
    
    
}
