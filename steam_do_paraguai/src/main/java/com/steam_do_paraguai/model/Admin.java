/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steam_do_paraguai.model;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class Admin extends User{

    public Admin(String n, String s) {
        super(n, s);
    }
    
    @Override
    public String acessoAoSistema() {
       return "Admin";
    }
    
}
