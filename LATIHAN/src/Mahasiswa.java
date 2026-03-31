public class Mahasiswa {
    String nama;
    int umur;
    String jurusan;




    public  Mahasiswa(String nama, int umur, String jurusan){
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    public void Belajar(){
        System.out.println(nama + " sedang Belajar ");
    }

    public void Tampilkan(){
        System.out.println("nama " + nama);
        System.out.println("umur " + umur);
        System.out.println("jurusan "+ jurusan );
    }

    public void GantiProdi(String jurusan){
        this.jurusan = jurusan;
    };

    
}
