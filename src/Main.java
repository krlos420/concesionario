public class Main {
    public static void main(String[] args) {
        Coche c1 = new Coche("12345", "1234A", "Ford", "Roig", "Focus", 20000, false, new boolean[]{false, false, false, false, false} );
        c1.mostrarInfo();
        c1.revisar();
        c1.mostrarInfo();
        c1.revisar();
        c1.mostrarInfo();
        System.out.println(c1);
    }
}