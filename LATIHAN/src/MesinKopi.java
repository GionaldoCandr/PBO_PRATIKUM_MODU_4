public class MesinKopi {
    int bijiKopi ;
    int air ;
    int susu ;

    public MesinKopi() {
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
        System.out.println("Mesin Kopi tank kosong");
    }

    public void isiUlangBahan(int tambahKopi, int tambahAir , int tambahSusu){

        this.bijiKopi += tambahKopi;
        this.air += tambahAir;
        this.susu += tambahSusu;

     System.out.println("Bahan Baku udah berhasil dimasuk");
     System.out.println("total stokkopi saat ini: " + "\nBiji Kopi: " + bijiKopi + "gram"+
                                                        "\nSusu: " + susu + "ml"+         
                                                            "\nAir: " + air + "ml"); 
    }

     public boolean cekKetersediaanCappuccino() {
        if (this.bijiKopi >= 15 && this.air >= 50 && this.susu >= 100) {
            return true;  
        } else {
            return false; 
        }
    }
}
    



