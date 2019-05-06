/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import java.util.HashSet;

/**
 *
 * @author gjejen
 */
public class Libro {

    private int Codigo;
    private String Titulo;
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    
    public Libro(){
    
    }
    
    public Libro(int cod, String tit){
        setCodigo(cod);
        setTitulo(tit);
    }
}
