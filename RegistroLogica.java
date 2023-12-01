/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Controlador.Registro;
import Intermedio.Acciones;

/**
 *
 * @author suyen
 */
public class RegistroLogica {
    static private Acciones acc = new Acciones();
    
    public static boolean autentificar(String usuario, String contrasena){
        if(obtener(usuario) != null){
            Registro consult = obtener(usuario);
            if(consult.getUserreg().equals(usuario)&&consult.getPassreg().equals(contrasena)){
                return true;
            }else{
                return false;
            }
            
        }else{
            return false;
        }
    }
    public static boolean insertar(Registro usuario){
        return acc.agregar(usuario);
    }
    public static Registro obtener(String usuario){
        return acc.obtener(usuario);
    }
}
