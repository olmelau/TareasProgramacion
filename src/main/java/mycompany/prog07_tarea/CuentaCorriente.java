/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.prog07_tarea;

/**
 *
 * @author Laura
 */
public class CuentaCorriente extends CuentaBancariaBase {
    
    
    private String listaEntidades;

    public CuentaCorriente(String listaEntidades, Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN);
        this.listaEntidades = listaEntidades;
    }

    public String getListaEntidades() {
        return listaEntidades;
    }

    public void setListaEntidades(String listaEntidades) {
        this.listaEntidades = listaEntidades;
    }
   
    
    
    
    
    
    
    
    
}
