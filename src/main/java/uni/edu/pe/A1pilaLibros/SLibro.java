package uni.edu.pe.A1pilaLibros;

public class SLibro implements ILibro {
    SLibro next;
    private String name;
    private String autor;
    private Integer pages;


    public SLibro(String name, String autor, Integer pages) {
        this.autor = autor;
        this.name = name;
        this.pages = pages;
    }

    @Override
    public void readBook() {
        System.out.println("Leyendo el Libro...");
        System.out.println("Libro Leído Exitosamente");
    }

    @Override
    public void openBook() {
        System.out.println("Abriendo Libro");
    }

    @Override
    public void closeBook() {
        System.out.println("Cerrando Libro");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public Integer getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return ("{ Nombre del libro: " + name + " Autor: " + autor + " Paginas: " + pages + "}");
    }

}
