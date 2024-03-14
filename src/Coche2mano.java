public class Coche2mano extends Coche{

    private int km;
    private int años;


    public Coche2mano(String numBastidor, String matricula, String marca, String color, String modelo, double precio, boolean revisar, boolean[] revisiones, int km, int años) {
        super(numBastidor, matricula, marca, color, modelo, precio, revisar, revisiones);
        this.km = km;
        this.años = años;
    }
    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Número de bastidor: " + getNumBastidor());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Kilómetros realizados: " + km);
        System.out.println("Años de antigüedad: " + años);
        System.out.println("Revisiones:");
        for (int i = 0; i < getRevisiones().length; i++) {
            System.out.println("Revision "+ (i+1)+ " : " + getRevisiones()[i]);
        }
    }
}
