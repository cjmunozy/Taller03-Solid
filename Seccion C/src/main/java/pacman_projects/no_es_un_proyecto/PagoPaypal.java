/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman_projects.no_es_un_proyecto;

/**
 *
 * @author USUARIO
 */
public class PagoPaypal extends Pago implements Pagable{
    private boolean loggedIn;
    
    private void iniciarSesion(){
        
    }
    @Override
    public void realizarCobro(double monto){
        if(!loggedIn){
            
            iniciarSesion();
        }
        //cargar el monto de compra al medio de pago
    }
}
