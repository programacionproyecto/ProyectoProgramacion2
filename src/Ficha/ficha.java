/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficha;

/**
 *
 * @author JoseLuis
 */
public abstract class ficha {
   protected String nombre;
   protected int rango;
   protected String tipo;
   protected String bando;
   
   public ficha(String nom,int rang,String tip,String ban){
   nombre=nom;
   rango=rang;
   tipo=tip;
   bando=ban;
   }
   
   public String getNombre(){
   return nombre;
   }
   public String getTipo(){
   return tipo;
   }
   public String getBando(){
   return bando;
   }
   public int getRango(){
   return rango;
   }
   
}
