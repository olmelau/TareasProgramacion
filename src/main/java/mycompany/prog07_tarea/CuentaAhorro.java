/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.prog07_tarea;

/**
 *
 * @author Laura
 */
public class CuentaAhorro extends CuentaBancariaBase {
    
    private double tipoInteresAnual;

    public CuentaAhorro(double tipoInteresAnual, Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN);
        this.tipoInteresAnual = tipoInteresAnual;
    }

    public double getTipoInteresAnual() {
        return tipoInteresAnual;
    }

    public void setTipoInteresAnual(double tipoInteresAnual) {
        this.tipoInteresAnual = tipoInteresAnual;
    }

    @Override
    public String devolverIfoString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
