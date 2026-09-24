/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jtwes
 */
public class VitalSigns {
    String date;
    double bloodPressure, temperature;
    int pulse;

    public String getDate() {
        return date;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getPulse() {
        return pulse;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }
    
    @Override
    public String toString(){
        return getDate();
    }
    
}
