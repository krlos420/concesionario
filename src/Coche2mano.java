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
        super.mostrarInfo();
        System.out.println("Kilómetros realizados: " + km);
        System.out.println("Años de antigüedad: " + años);
    }
}
