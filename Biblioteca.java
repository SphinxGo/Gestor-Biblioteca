import java.util.ArrayList;


class Libro{
    private String titulo;
    private String autor;
    private String isbn;
    private int cantidadPaginas;
    private int cantidadCopias;

        public Libro(String titulo,String autor, String isbn, int cantidadPaginas, int cantidadCopias){
            this.titulo = titulo;
            this.autor = autor;
            this.isbn = isbn;
            this.cantidadPaginas = cantidadPaginas;
            this.cantidadCopias = cantidadCopias;
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

        public int getCantidadCopias(){
            return cantidadCopias;
        }

        public void setTitulo(String titulo){
            this.titulo = titulo;
        }

        public void setAutor(String autor){
            this.autor = autor;
        }

        public void setCantidadPaginas(int cantidadPaginas){
            this.cantidadPaginas = cantidadPaginas;
        }

        public void setCantidadCopias(int cantidadCopias){
            this.cantidadCopias = cantidadCopias;
        }

        public boolean estaDisponible(){
            return cantidadCopias > 0;
        }

        public void prestarCopia(){
            if(cantidadCopias>0){
              cantidadCopias--;
            }
        }

        public void devolverCopia(){
            cantidadCopias++;
        }

        public void mostrarDatos(){
            System.out.println("Titulo: "+ titulo);
            System.out.println("Autor: "+ autor);
            System.out.println("ISBN: "+ isbn);
            System.out.println("Paginas: "+ cantidadPaginas);
            System.out.println("Copias Disponibles: "+ cantidadCopias);
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