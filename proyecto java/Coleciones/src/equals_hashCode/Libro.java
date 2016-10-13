package equals_hashCode;

/**
 *
 * @author jhone
 */
public class Libro {

    @SuppressWarnings("FieldMayBeFinal")
    private String titulo;
    @SuppressWarnings("FieldMayBeFinal")
    private String autor;

    @SuppressWarnings("FieldMayBeFinal")
    private int isbn;

    public Libro(String titulo, String autor, int isbn) {
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public String getDatos() {
        return "El titulo del libro es: " + titulo + ".\nel nombre del autor es: "
                + autor + ".\nEl ibn es: " + isbn + ".";
    }

//    public boolean equals(Object obj) {
//        if (obj instanceof Libro) {
//            Libro otro = (Libro) obj;
//            if (this.isbn == otro.isbn) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            return false;
//
//        }
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.isbn;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.isbn != other.isbn) {
            return false;
        }
        return true;
    }


}
