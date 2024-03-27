package principal;

import java.util.ArrayList;
import java.util.List;

import campo_batalla.Batalla;
import mascota.FabricaPokemon;
import mascota.Pokemon;

public class Main {

	public static void main(String[] args) {
		Pokemon pikachu = FabricaPokemon.crearPokemon("Pikachu");
        Pokemon charmander = FabricaPokemon.crearPokemon("Charmander");
        Pokemon caterpie = FabricaPokemon.crearPokemon("Caterpie");
        Pokemon pidgeotto = FabricaPokemon.crearPokemon("Pidgeotto");
        Pokemon bulbasaur = FabricaPokemon.crearPokemon("Bulbasaur");
        Pokemon squirtle = FabricaPokemon.crearPokemon("Squirtle");
        
        List<Pokemon> equipo1 = new ArrayList<>();
        equipo1.add(pikachu);
        equipo1.add(caterpie);
        equipo1.add(pidgeotto);

        List<Pokemon> equipo2 = new ArrayList<>();
        equipo2.add(charmander); 
        equipo2.add(bulbasaur);
        equipo2.add(squirtle);

        Batalla batalla = new Batalla(equipo1, equipo2);
        batalla.iniciar();
	}

}
