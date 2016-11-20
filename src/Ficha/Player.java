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
public class Player {
    String user,password;
    int ranking;
    public static String LOGGED_USER;
    public Player(String use,String pass){
    user=use;
    password=pass;
    ranking =0;
    }
    public String getUser(){
    return user;
    }
    public int getRank(){
    return ranking;
    }
    public void setLog(String user){
        LOGGED_USER=user;
    }
}
