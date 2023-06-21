/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pokemon.trabalhofinal.controller;

import com.pokemon.trabalhofinal.model.Pokemon;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author tales
 */
public class PokedexService {
    
    public PokedexService() {
    }
    
    List<Pokemon> pokedex = new ArrayList<>();
    
    public void incluirPokemon(Pokemon pokemon){
        pokedex.add(pokemon);
    }
    
    public void verPokedex(){
        for(int i = 0; i < pokedex.size(); i++){
            System.out.println(pokedex.get(i).getName());
        }
    }
    
    public void deletarPokemon(Pokemon pokemon) {
        String pokemonDelete = pokemon.getName();
        Optional<Pokemon> pokemonOptional = pokedex.stream()
                .filter(p -> p.getName().equals(pokemonDelete))
                .findFirst();

        if (pokemonOptional.isPresent()) {
            Pokemon pokemonFound = pokemonOptional.get();
            pokedex.remove(pokemonFound);
            System.out.println("Pokemon " + pokemonFound.getName() + " deletado da Pokedex.");
        } else {
            System.out.println("Pokemon não encontrado na Pokedex.");
        }
    }
}
