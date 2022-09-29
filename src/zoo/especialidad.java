 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author jose manuel
 */
public class especialidad {
    private String nombreEspecialidad;
    private float salarioMedio;
    private float extraEspecialidad;

    public especialidad(String nombreEspecialidad, float salarioMedio, float extraEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
        this.salarioMedio = salarioMedio;
        this.extraEspecialidad = extraEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public float getSalarioMedio() {
        return salarioMedio;
    }

    public void setSalarioMedio(float salarioMedio) {
        this.salarioMedio = salarioMedio;
    }

    public float getExtraEspecialidad() {
        return extraEspecialidad;
    }

    public void setExtraEspecialidad(float extraEspecialidad) {
        this.extraEspecialidad = extraEspecialidad;
    }
    
    
}
