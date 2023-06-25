/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pokemon.trabalhofinal;

import com.pokemon.trabalhofinal.controller.PokedexService;
import com.pokemon.trabalhofinal.controller.PokemonService;
import com.pokemon.trabalhofinal.model.PokemonKind;

/**
 *
 * @author tales
 */
public class TrabalhoFinal {

    public static void main(String[] args) {
        PokedexService pok = new PokedexService();
        PokemonService cad = new PokemonService(pok);
        
        cad.cadastrar("Charizard", PokemonKind.Dragao, 10, 1, 2);
        cad.cadastrar("Pikachu", PokemonKind.Elétrico, 8, 2, 1);
        cad.cadastrar("Bulbasaur", PokemonKind.Grama, 7, 3, 2);
        cad.cadastrar("Gyarados", PokemonKind.Agua, 9, 2, 3);

        pok.verPokedex();
    }
}
