public class Mahasiswa extends Manusia {
    String nim;
    String jurusan;

//set 
    public void setnim(String nim){
        this.nim = nim;
    }
    public void setjurusan(String jurusan){
    this.jurusan = jurusan;
     }


//get
     public String getnim(){
        return this.nim;
     }

     public String getjurusan(){
        return this.jurusan;
     }


     public void cetakinfo() {
        super.cetakinfo();
        System.out.println("nim           : " + this.nim);
        System.out.println("jurusan       : " + this.jurusan);

    
       
    }
}

