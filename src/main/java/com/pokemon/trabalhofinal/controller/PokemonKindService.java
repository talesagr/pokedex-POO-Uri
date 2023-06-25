/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pokemon.trabalhofinal.controller;

import com.pokemon.trabalhofinal.model.PokemonKind;

/**
 *
 * @author tales
 */
public class PokemonKindService {

    public PokemonKind getByName(String nome) {
        String nomeLowerCase = nome.toLowerCase();

        for (PokemonKind tipo : PokemonKind.values()) {
            if (tipo.name().toLowerCase().equals(nomeLowerCase)) {
                return tipo;
            }
        }
        return null;
    }
}
