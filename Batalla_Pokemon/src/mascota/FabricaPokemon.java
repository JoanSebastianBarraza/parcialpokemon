package mascota;

import java.util.Arrays;

import attack.Ataque;

public class FabricaPokemon {
	public static Pokemon crearPokemon(String tipo) {
        switch (tipo.toLowerCase()) {
            case "pikachu":
                return new Pokemon("Pikachu", 100, Arrays.asList(
                        new Ataque("Impactrueno", 20),
                        new Ataque("Rayo", 30),
                        new Ataque("Ataque Rápido", 40),
                        new Ataque("Placaje", 35)));
            case "charmander":
                return new Pokemon("Charmander", 100, Arrays.asList(
                        new Ataque("Lanzallamas", 20),
                        new Ataque("Gruñido", 30),
                        new Ataque("Arañazo", 40),
                        new Ataque("Ascuas", 30)));
            case "caterpie":
            	return new Pokemon("Caterpie", 100, Arrays.asList(
            			new Ataque("Placaje", 35),
            			new Ataque("Tacleada", 40),
            			new Ataque("Drenadoras", 20),
            			new Ataque("Supersónico", 10)));
            case "pidgeotto":
            	return new Pokemon("Pidgeotto", 100, Arrays.asList(
            			new Ataque("Picotazo", 10),
            			new Ataque("Remolino", 40),
            			new Ataque("Tornado", 20),
            			new Ataque("Ataque Rápido", 35)));
            case "bulbasaur":
            	return new Pokemon("Bulbasaur", 100, Arrays.asList(
            			new Ataque("Látigo Cepa", 35),
            			new Ataque("Drenadoras", 20),
            			new Ataque("Placaje", 40),
            			new Ataque("Somnífero", 10)));
            case "squirtle":
            	return new Pokemon("Squirtle", 100, Arrays.asList(
            			new Ataque("Pistola Agua", 20),
            			new Ataque("Burbuja", 35),
            			new Ataque("Ataque Rápido", 40),
            			new Ataque("Placaje", 10)));
            default:
                throw new IllegalArgumentException("Tipo de Pokémon no soportado: " + tipo);
        }
    }
}
