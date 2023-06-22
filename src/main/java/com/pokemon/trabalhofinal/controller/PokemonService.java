/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pokemon.trabalhofinal.controller;

import com.pokemon.trabalhofinal.model.Pokemon;
import com.pokemon.trabalhofinal.model.Type;

/**
 *
 * @author tales
 */
public class PokemonService {
    private final PokedexService pokedexService;
    public PokemonService(PokedexService pokedexService) {
        this.pokedexService = pokedexService;
    }
    
    
    public Pokemon cadastrar(String nomeDoPokemon, Type tipoDoPokemon, int pontosDeVida, int ataque, int defesa){
        Pokemon pokemonCadastrado = new Pokemon(nomeDoPokemon, tipoDoPokemon, pontosDeVida,ataque,defesa);
        pokedexService.incluirPokemon(pokemonCadastrado);
        
        return pokemonCadastrado;
    }
}
