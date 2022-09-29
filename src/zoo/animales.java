/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

import java.io.Serializable;

/**
 *
 * @author jose manuel
 */
public class animales implements Serializable{
    private String especie;
    private String subespecie;
    private float peso;
    private String nombre;

    public animales(String especie, String subespecie, float peso, String nombre) {
        this.especie = especie;
        this.subespecie = subespecie;
        this.peso = peso;
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSubespecie() {
        return subespecie;
    }

    public void setSubespecie(String subespecie) {
        this.subespecie = subespecie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
   
}
