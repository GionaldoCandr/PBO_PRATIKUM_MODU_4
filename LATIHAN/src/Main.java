public class Main {
    public static void main(String[] args) {
        // Mahasiswa mhsBaru = new Mahasiswa("nama", 20 , "prodi");

        // mhsBaru.Belajar();
        // mhsBaru.Tampilkan();
        // mhsBaru.GantiProdi("SOSOS");
        // mhsBaru.Tampilkan();

        MesinKopi mesinLobby = new MesinKopi();


        System.out.println("MESIN KOPI");

        boolean statusAwal = mesinLobby.cekKetersediaanCappuccino();
        mesinLobby.isiUlangBahan(0, 0 ,0);
        System.out.println("Apa ada sedia kopi nyee? " + statusAwal );
 

        mesinLobby.isiUlangBahan(50, 100 ,200);
        System.out.println("MEnambahkan Sediaan kopi....");
        System.out.println("MEnambahkan Sediaan kopi....");
        System.out.println("MEnambahkan Sediaan kopi....");
        System.out.println("MEnambahkan Sediaan kopi....");
        boolean statusAkhir = mesinLobby.cekKetersediaanCappuccino();
        System.out.println("apa ada sedia kopi nyaa?   " + statusAkhir);



    }
}
