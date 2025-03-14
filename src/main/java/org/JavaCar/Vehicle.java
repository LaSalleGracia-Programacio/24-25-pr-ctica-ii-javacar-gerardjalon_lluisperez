package org.JavaCar;

public abstract class  Vehicle implements Llogable {
    private String matricula;
    private String marca;
    private String model;
    private double preuBase;
    private double motor;
    private double rodes;
    private String  etiquetaAmbiental;

    public Vehicle(String matricula, String marca, String model, double preuBase, double motor, double rodes, String etiquetaAmbiental) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.motor = motor;
        this.rodes = rodes;
        this.etiquetaAmbiental = etiquetaAmbiental;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public double getMotor() {
        return motor;
    }

    public double getRodes() {
        return rodes;
    }

    public String getEtiquetaAmbiental() {
        return etiquetaAmbiental;
    }
}
