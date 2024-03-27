package attack;

public class Ataque {
	private String nombre;
    private int daño;

    public Ataque(String nombre, int danio) {
        this.nombre = nombre;
        this.daño = danio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDaño() {
        return daño;
    }
}
