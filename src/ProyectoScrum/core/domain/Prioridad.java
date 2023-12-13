package ProyectoScrum.core.domain;

public enum Prioridad {
    UNO(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5);

    private final int valor;

    Prioridad(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    public static Prioridad fromValor(Prioridad prioridad2) {
        for (Prioridad prioridad : values()) {
            if (prioridad == prioridad2) {
                return prioridad;
            }
        }
        throw new IllegalArgumentException("Valor de prioridad no válido: " + prioridad2);
    }
}