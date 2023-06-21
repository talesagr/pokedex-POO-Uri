/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pokemon.trabalhofinal.model;

/**
 *
 * @author tales
 */
public class Pokemon extends Dados{
    private Type type;
    private int hp;
    private int atk;
    private int def;

    public Pokemon(String name, Type type, int hp, int atk, int def) {
        this.nome = name;
        this.type = type;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public String getName() {
        return nome;
    }

    public Type getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
    
}
