/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.prog07_tarea;

/**
 *
 * @author Laura
 */
public class CuentaCorrientePersonal extends CuentaCorriente {

    private double comisionMantenimiento;

    public CuentaCorrientePersonal(double comisionMantenimiento, String listaEntidades, Persona titular, double saldo, String IBAN) {
        super(listaEntidades, titular, saldo, IBAN);
        this.comisionMantenimiento = comisionMantenimiento;
    }

    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }
    
    

}
