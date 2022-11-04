public class MahasiswaBeraksi {
    public static void main(String[]args){

        //membuat object
        Mahasiswa anton = new Mahasiswa();

        /* memanggil atribut dan memberi nilai */
        anton.nim = ("10102020");
        anton.nama = ("Anton Santoso");
        anton.jenisKelamin = ("Laki-laki");
        anton.umur = (28);
        anton.alamat = ("Bekasi Kota");
        anton.jurusan = ("informatika");

        anton.cetakinfo();

    }
}