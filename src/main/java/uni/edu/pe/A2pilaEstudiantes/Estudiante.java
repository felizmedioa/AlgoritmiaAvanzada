package uni.edu.pe.A2pilaEstudiantes;

import java.util.Objects;

public class Estudiante {
    public int cod;
    public float promFinal;
    public String nombre;

    public Estudiante(int cod, float promFinal, String nombre) {
        this.cod= cod;
        this.promFinal= promFinal;
        this.nombre= nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "cod=" + cod +
                ", promFinal=" + promFinal +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return cod == that.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }
}
