package practica_poo;
/** * * @author jhone */
public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    private String Marca="BMW";
        private String Descripcion;
    public Coche(){}
    public Coche(int ancho,int largo,int motor,int ruedas,int peso,String Descripcion){
        this.ancho=ancho;
        this.largo=largo;
        this.motor=motor;
        this.ruedas=ruedas;
        this.peso=peso;
        this.Descripcion=Descripcion;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
   
    @Override
    public String toString() {
        return "LA "+Marca +Descripcion+ " \nruedas de tipo A CANT-> " + ruedas
                + "\nlargo->" + largo + "cn\nancho->" 
                + ancho + "cm\n motor-> " + motor + "cn\npeso->" + peso +"KL";
    }
    
}
