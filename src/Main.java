public class Main {
    public static void main(String[] args) {
        Coche cocheNu = new Coche("12345", "1234A", "Ford", "Roig", "Focus", 20000, false, new boolean[]{false, false, false, false, false} );
        cocheNu.aumentarPrecioPorcentaje(3);
        cocheNu.mostrarInfo();
        Coche2mano cocheAnt = new Coche2mano("56789", "2122B", "Honda", "rojo", "Civic", 5000, false, new boolean[]{false, false, false, false, false}, 200000, 15);
        cocheAnt.mostrarInfo();
        Coche [] coches = new Coche[4];
        coches[0] = new Coche("78459", "4554M", "Hyundai", "Blanc", "i30", 20000, false, new boolean[]{false, false, false, false, false} );
        coches[1] = new Coche("25143", "2548L", "Ford", "Verd", "Fiesta", 5000, false, new boolean[]{false, false, false, false, false} );
        coches[2] = new Coche2mano("74213", "2716Q", "Peugeot", "Roig", "207", 1000, false, new boolean[]{false, false, false, false, false}, 300000, 4 );
        coches[3] = new Coche2mano("32138", "8732Z", "Ferrari", "Roig", "Roma", 100000, false, new boolean[]{false, false, false, false, false}, 400000, 7 );
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
}