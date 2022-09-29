/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author jose manuel
 */
public class cuidados {
    private String tipoClima;
    private String habitad;
    private float costePromedio;
    private float cantidadComidaKG;
    private int periodicidadComidadDias;
    animales animal;

    public cuidados(String tipoClima, String habitad, float costePromedio, float cantidadComidaKG, int periodicidadComidadDias, animales animal) {
        this.tipoClima = tipoClima;
        this.habitad = habitad;
        this.costePromedio = costePromedio;
        this.cantidadComidaKG = cantidadComidaKG;
        this.periodicidadComidadDias = periodicidadComidadDias;
        this.animal = animal;
    }

    public String getTipoClima() {
        return tipoClima;
    }

    public void setTipoClima(String tipoClima) {
        this.tipoClima = tipoClima;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public float getCostePromedio() {
        return costePromedio;
    }

    public void setCostePromedio(float costePromedio) {
        this.costePromedio = costePromedio;
    }

    public float getCantidadComidaKG() {
        return cantidadComidaKG;
    }

    public void setCantidadComidaKG(float cantidadComidaKG) {
        this.cantidadComidaKG = cantidadComidaKG;
    }

    public int getPeriodicidadComidadDias() {
        return periodicidadComidadDias;
    }

    public void setPeriodicidadComidadDias(int periodicidadComidadDias) {
        this.periodicidadComidadDias = periodicidadComidadDias;
    }

    public animales getAnimal() {
        return animal;
    }

    public void setAnimal(animales animal) {
        this.animal = animal;
    }
    
    
}
