import java.util.ArrayList;
public class Main {
    private static ArrayList<Coche> vehiculos = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("-----");
        System.out.println("1. Propuesto");
        System.out.println("2. Información de vehiculo");
        System.out.println("3. Alta vehiculo");
        System.out.println("4. Baja vehiculo");
        System.out.println("5. Imprimir todos los vehiculos");
        System.out.println("6. Borrado total");
        System.out.println("7. Salir");
        int menu = Leer.leerEntero("Que quieres ver?: ");
        if (menu == 1) {
            Coche cocheNu = new Coche("12345", "1234A", "Ford", "Roig", "Focus", 20000, false, new boolean[]{false, false, false, false, false});
            cocheNu.aumentarPrecioPorcentaje(3);
            cocheNu.mostrarInfo();
            Coche2mano cocheAnt = new Coche2mano("56789", "2122B", "Honda", "rojo", "Civic", 5000, false, new boolean[]{false, false, false, false, false}, 200000, 15);
            cocheAnt.mostrarInfo();
            Coche[] coches = new Coche[4];
            coches[0] = new Coche("78459", "4554M", "Hyundai", "Blanc", "i30", 20000, false, new boolean[]{false, false, false, false, false});
            coches[1] = new Coche("25143", "2548L", "Ford", "Verd", "Fiesta", 5000, false, new boolean[]{false, false, false, false, false});
            coches[2] = new Coche2mano("74213", "2716Q", "Peugeot", "Roig", "207", 1000, false, new boolean[]{false, false, false, false, false}, 300000, 4);
            coches[3] = new Coche2mano("32138", "8732Z", "Ferrari", "Roig", "Roma", 100000, false, new boolean[]{false, false, false, false, false}, 400000, 7);
            coches[3].revisar();
            coches[3].revisar();
            coches[3].revisar();
            System.out.println("INFORMACIÓN DE LOS COCHES");
            for (int i = 0; i < coches.length; i++) {
                coches[i].mostrarInfo();
            }
            System.out.println("COCHES DE LA LISTA");
            for (int i = 0; i < coches.length; i++) {
                System.out.println(coches[i]);
            }
        }
        if (menu ==2){
            if (vehiculos.isEmpty()){
                System.out.println("No hay vehiculos registrados");
            } else {
                for (int i = 0; i < vehiculos.size(); i++) {
                    vehiculos.get(i).mostrarInfo();
                }
            }
        }
        if (menu == 3){
            String volver = "s";
            do{
                System.out.println("1. Coche");
                System.out.println("2. Coche de segunda mano");
                int tipo = Leer.leerEntero("Que tipo de vehiculo quieres dar de alta? ");
                if (tipo == 1) {
                    String bastidor = Leer.leerTexto("Indique el numero de bastidor ");
                    String matricula = Leer.leerTexto("Indique la matrícula ");
                    String marca = Leer.leerTexto("Indique la marca ");
                    String color = Leer.leerTexto("Indique el color del vehiculo ");
                    String modelo = Leer.leerTexto("Indique el modelo ");
                    Double precio = Leer.leerDouble("Indique el precio ");
                    Boolean revisar = Leer.leerBoolean("Tiene la revision pasada? true/false ");
                    boolean[] revisiones = new boolean[]{false, false, false, false, false};
                    Coche coche = new Coche(bastidor, matricula, marca, color, modelo, precio, revisar, revisiones);
                    vehiculos.add(coche);
                    volver = Leer.leerTexto("Quieres introducir otro vehiculo? s/n ");
                }
            } while(volver.equalsIgnoreCase("s"));
        }
    }
}