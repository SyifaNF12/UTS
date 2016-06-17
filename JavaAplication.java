package javaapplication7;

public class JavaApplication7 {

    public static void main(String[] args) {
      JavaApplication7 belajar = new JavaApplication7();
      belajar.tambah(1, 2);
      belajar.kurang(5, 4);
      belajar.bagi (6, 2);
     
    }
      
    
    private void tambah ( int a, int b){
        int hasil ;
        hasil = a + b;
        System.out.println(hasil);
    }
    
    private void kurang ( int a, int b){
        int hasil ;
        hasil = a - b;
        System.out.println(hasil);
    }
    
   private void bagi ( int a, int b){
        int hasil ;
        hasil = a / b;
        System.out.println(hasil);
}   
   private int fungsitambah (int a, int b){
       return a + b ;
   }
  
}
