package nilaimaksmin;
import java.util.Scanner;
public class NilaiMaksmin {

    public static void main(String[] args) {
    int N,i,Masukan,data, total; 
    int Nilaimaks = 100;
    int Nilaimin = 0;
    int jml =1;
    char pil;
        Scanner inputan = new Scanner(System.in);
        N = inputan.nextInt();
        pil = inputan.next().charAt(0);
        
        System.out.println ("Berapa banyak bilangan ?");
        N = inputan.nextInt();
        for (i = 0; i < N; i++){
        N = inputan.nextInt();    
        System.out.println("Masukan data ke-" + i +" :");

        
        if (pil == 'A'){
        for (i=0; i < N; i++){
            Masukan = inputan.nextInt();
            if (Masukan >= Nilaimin){
                if (Masukan == Nilaimin){
                    jml--;
                    System.out.println("Ini Nilai Minimum :");
                }
                Nilaimin = Masukan;
                }
        }
    }
    System.out.println("Output Nilai Minimal: " + Nilaimin);

    
    if (pil == 'B'){
        for (i=0; i>N; i++){
            Masukan = inputan.nextInt();
            if (Masukan <= Nilaimaks){
                if (Masukan == Nilaimaks){
                    jml++;
                }
                Nilaimaks = Masukan;
                }
        }
    }
    System.out.println("Output Nilai Maksimum: " + Nilaimaks);
    }
}
}
