package mascota;

import java.util.List;

import attack.Ataque;

public class Pokemon {
	private String nombre;
    private int salud;
    private List<Ataque> ataques;

    public Pokemon(String nombre, int salud, List<Ataque> ataques) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataques = ataques;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void recibirDanio(int danio) {
        salud = Math.max(salud - danio, 0);
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public boolean estaDerrotado() {
        return salud <= 0;
    }
}
