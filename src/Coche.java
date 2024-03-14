import java.util.Arrays;

public class Coche {
    private String numBastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private boolean revisar;
    private boolean [] revisiones;



    public Coche(String numBastidor, String matricula, String marca, String color, String modelo, double precio, boolean revisar, boolean[] revisiones) {
        this.numBastidor = numBastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.revisar = revisar;
        this.revisiones = revisiones;
    }

    public Coche() {
    }

    public String getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(String numBastidor) {
        this.numBastidor = numBastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isRevisar() {
        return revisar;
    }

    public void setRevisar(boolean revisar) {
        this.revisar = revisar;
    }

    public boolean[] getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(boolean[] revisiones) {
        this.revisiones = revisiones;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void aumentarPrecioPorcentaje(double q){
        precio += precio * (q/100);
    }
    public void mostrarInfo(){
        System.out.println("Número de bastidor: " + numBastidor);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
        System.out.println("Revisiones:");
        for (int i = 0; i<revisiones.length;i++){
            System.out.println("Revision "+ (i+1)+ " : " + revisiones[i]);
        }
        }
        public boolean revisar() {
        for (int i =0; i<revisiones.length; i++)
            if (!revisiones[i]){
                revisiones[i] = true;
                if (i == 4){
                    revisar = false;
                    return false;
                }
                break;
            }
         return true;
    }

    @Override
    public String toString() {
        return matricula + " - " + marca + " " + modelo;
    }
}
