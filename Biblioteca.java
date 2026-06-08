import java.util.ArrayList;


class Libro{
    private String titulo;
    private String autor;
    private String isbn;
    private int cantidadPaginas;
    private int copiasDisponibles;
    private int totalCopias;

        public Libro(String titulo,String autor, String isbn, int cantidadPaginas, int totalCopias){
            this.titulo = titulo;
            this.autor = autor;
            this.isbn = isbn;
            this.cantidadPaginas = cantidadPaginas;
            this.totalCopias = totalCopias;
            this.copiasDisponibles = totalCopias;
        }

        public String getTitulo(){
            return titulo;
        }

        public String getAutor(){
            return autor;
        }

        public String getIsbn(){
            return isbn;
        }

        public int getCantidadPaginas(){
            return cantidadPaginas;
        }

        public int getTotalCopias(){
            return totalCopias;
        }

        public int getCopiasDisponibles(){
            return copiasDisponibles;
        }

        public void setTitulo(String titulo){
            this.titulo = titulo;
        }

        public void setAutor(String autor){
            this.autor = autor;
        }

        public boolean estaDisponible(){
            return copiasDisponibles > 0;
        }

        public void prestarCopia(){
            if(copiasDisponibles>0){
              copiasDisponibles--;
            }
        }

        public void devolverCopia(){
            if(copiasDisponibles<totalCopias){
            copiasDisponibles++;
            }
        }

        public void mostrarDatos(){
            System.out.println("Titulo: "+ titulo);
            System.out.println("Autor: "+ autor);
            System.out.println("ISBN: "+ isbn);
            System.out.println("Paginas: "+ cantidadPaginas);
            System.out.println("Copias Disponibles: "+ copiasDisponibles);
        }
}

class Miembro{

    private int id;
    private String nombre;
    private String apellido;
    private String contacto;
    private ArrayList<Libro> librosPrestados;

    public Miembro(int id, String nombre, String apellido,String contacto){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contacto = contacto;
        
        librosPrestados = new ArrayList<>();
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getContacto(){
        return contacto;
    }

    public ArrayList<Libro> getLibrosPrestados(){
        return librosPrestados;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setContacto(String contacto){
        this.contacto = contacto;
    }

    public void agregarLibro(Libro libro){
        librosPrestados.add(libro);
    }

    public void quitarLibro(Libro libro){
        librosPrestados.remove(libro);
    }


}

class Prestamo{

    private Libro libro;
    private Miembro miembro;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private boolean devuelto;

    public Prestamo(Libro libro, Miembro miembro, String fechaPrestamo, String fechaDevolucion){
        this.libro = libro;
        this.miembro = miembro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;

        this.devuelto= false;
    }

    public Libro getLibro(){
        return libro;
    }

    public Miembro getMiembro(){
        return miembro;
    }

    public String getFechaPrestamo(){
        return fechaPrestamo;
    }

    public String getFechaDevolucion(){
        return fechaDevolucion;
    
    }

    public void setFechaDevolucion(String fechaDevolucion){
        this.fechaDevolucion = fechaDevolucion;
    }

    public void mostrarDatos(){
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Miembro: "+ miembro.getNombre());
        System.out.println("Fecha de Prestamo: "+ getFechaPrestamo());
        System.out.println("Fecha de Devolucion: " + getFechaDevolucion());
        System.out.println("Devuelto?: " + (devuelto? "Si":"No"));
    }

    public void devolver(){
        devuelto = true;
    }

    public boolean isDevuelto(){
        return devuelto;
    }

}

class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Miembro> miembros;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca(){
        libros = new ArrayList<>();
        miembros = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

}