public class Manusia {
    String nama;
    String jenisKelamin;
    int umur;
    String alamat;

    //set
    public void setnama(String nama){
        this.nama = nama;
    }

    public void setjenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    public void setumur(int umur){
        this.umur = umur;
    }

    public void setalamat (String alamat){
        this.alamat = alamat;
    
    }

    //get

    public String getnama(){
        return this.nama;
    }

    public String getjenisKelamin(){
        return this.jenisKelamin;
    }

    public int getumur(){
        return this.umur;
    }

    public String getalamat(){
        return this.alamat;
    }


    public void cetakinfo() {
        System.out.println("Nama                : " + this.nama);
        System.out.println("Jenis Kelamin       : " + this.jenisKelamin);
        System.out.println("Umur                : " + this.umur);
        System.out.println("Alamat              : " + this.alamat);
    
    }
}