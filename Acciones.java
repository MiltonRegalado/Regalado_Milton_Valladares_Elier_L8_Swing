/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intermedio;

import Controlador.Registro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author suyen
 */
public class Acciones {
    private List<Registro> usuarios;

    public Acciones() {
        usuarios = new ArrayList<>();
    }
    public int buscar(String usuario){
        int num = -1;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getUserreg().equals(usuario)){
                num = i;
                break;
            }
        }
        return num;
    }
    public boolean agregar(Registro usuario){
        if(buscar(usuario.getUserreg())==-1){
            usuarios.add(usuario);
            return true;
        }else{
            return false;
        }
    }
    public Registro obtener(String usuario){
        if(buscar(usuario) != -1){
            return usuarios.get(buscar(usuario));
        }else{
            return null;
        }
    }
    
}
