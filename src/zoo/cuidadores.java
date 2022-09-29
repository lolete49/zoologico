/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author jose manuel
 */
public class cuidadores {
    private String nombre;
    private int idCuidador;
    private String apellido;
    private especialidad especialidad;
    
     public cuidadores(String nombre, int idCuidador, String apellido, especialidad especialidad) {
        this.nombre = nombre;
        this.idCuidador = idCuidador;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(int idCuidador) {
        this.idCuidador = idCuidador;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(especialidad especialidad) {
        this.especialidad = especialidad;
    }

   
}
