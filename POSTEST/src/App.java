import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Duitku anton = new Duitku("Anton", "081234567");

        System.out.println("\netor Awal ");
        anton.isiDana(50000);

        System.out.println("\nBayar Listrik 1 ");
        anton.lunasiTagihan(60000);

        System.out.println("\nSetor Tambahan");
        anton.isiDana(20000);

        System.out.println("\nPercobaan Bayar Listrik 2");
        anton.lunasiTagihan(60000);

        System.out.println("\nHasil");
        anton.tampilkanSisaUang();


    // Bonus
    Scanner input = new Scanner(System.in);
    



    }
}

