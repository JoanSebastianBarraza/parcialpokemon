package campo_batalla;
import java.util.List;
import java.util.Scanner;

import attack.Ataque;
import mascota.Pokemon;

public class Batalla {
	private List<Pokemon> equipo1;
    private List<Pokemon> equipo2;
    private Scanner scanner;

    public Batalla(List<Pokemon> equipo1, List<Pokemon> equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int turno = 0; 
        while (!equipoDerrotado(equipo1) && !equipoDerrotado(equipo2)) {
            System.out.println("Turno del equipo " + (turno + 1));

            List<Pokemon> equipoActivo = (turno == 0) ? equipo1 : equipo2;
            List<Pokemon> equipoOponente = (turno == 0) ? equipo2 : equipo1;

            Pokemon atacante = seleccionarPokemon(equipoActivo);
            Pokemon defensor = seleccionarPokemon(equipoOponente);

            realizarAtaque(atacante, defensor);

            if (equipoDerrotado(equipoOponente)) {
                System.out.println("El equipo " + (turno + 1) + " ha ganado!");
                break;
            }

            turno = 1 - turno;
        }

        scanner.close();
    }

    private Pokemon seleccionarPokemon(List<Pokemon> equipo) {
        for (int i = 0; i < equipo.size(); i++) {
            Pokemon pokemon = equipo.get(i);
            if (!pokemon.estaDerrotado()) {
                System.out.println((i + 1) + ". " + pokemon.getNombre() + " - Salud: " + pokemon.getSalud());
            }
        }
        System.out.println("Elige un Pokémon (por número):");
        int eleccion = scanner.nextInt();
        return equipo.get(eleccion - 1);
    }

    private void realizarAtaque(Pokemon atacante, Pokemon defensor) {
        System.out.println("Ataques disponibles para " + atacante.getNombre() + ":");
        List<Ataque> ataques = atacante.getAtaques();
        for (int i = 0; i < ataques.size(); i++) {
            System.out.println((i + 1) + ". " + ataques.get(i).getNombre() + " - Daño: " + ataques.get(i).getDaño());
        }
        System.out.println("Elige un ataque (por número):");
        int eleccionAtaque = scanner.nextInt();
        Ataque ataqueElegido = ataques.get(eleccionAtaque - 1);

        System.out.println(atacante.getNombre() + " usa " + ataqueElegido.getNombre() + " contra " + defensor.getNombre());
        defensor.recibirDanio(ataqueElegido.getDaño());

        if (defensor.estaDerrotado()) {
            System.out.println(defensor.getNombre() + " ha sido derrotado!");
        } else {
            System.out.println("La salud de " + defensor.getNombre() + " ahora es " + defensor.getSalud());
        }
    }

    private boolean equipoDerrotado(List<Pokemon> equipo) {
        return equipo.stream().allMatch(Pokemon::estaDerrotado);
    }
}
