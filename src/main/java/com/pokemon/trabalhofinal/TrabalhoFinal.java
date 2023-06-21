/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pokemon.trabalhofinal;

import com.pokemon.trabalhofinal.controller.PokedexService;
import com.pokemon.trabalhofinal.controller.PokemonService;
import com.pokemon.trabalhofinal.model.Type;

/**
 *
 * @author tales
 */
public class TrabalhoFinal {

    public static void main(String[] args) {
        PokedexService pok = new PokedexService();
        PokemonService cad = new PokemonService(pok);
        cad.cadastrar("Charizard", Type.Dragão, 10, 1, 2);
        pok.verPokedex();
    }
}
