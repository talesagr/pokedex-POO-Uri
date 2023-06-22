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
        cad.cadastrar("Pikachu", Type.Elétrico, 8, 2, 1);
        cad.cadastrar("Bulbasaur", Type.Grama, 7, 3, 2);
        cad.cadastrar("Gyarados", Type.Água, 9, 2, 3);

        pok.verPokedex();
    }
}
