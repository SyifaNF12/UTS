package nilaiip;
import java.util.Scanner;
public class NilaiIP {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rata, jml;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0; 
        double[] nilai = new double [100];
        int valid = 0;
        double min = 2.75;
        int max;
        double ip;
        isWithinRange range = new isWithinRange();
    
        ip = input.nextDouble();
        while (ip != -999){
            ip = input.nextDouble(); 
            if (range.isWithinRange(3, 0, 4) == 1){
                valid = 1;
            }
            else {
                valid = 0;
            }
        }
        System.out.println("Jumlah IPK: ");
        jml = input.nextDouble();
        
        double sum = 0;
        for (int i = 1; i <= jml; i++) {

                System.out.println("Nilai IPK " + i + ": " );
                nilai[i] = input.nextDouble();                
                sum += nilai[i];
                
            }
        
        rata = sum / jml;
        int jmls = (int) (jml);
        for (int i = 1; i <=rata; i++) {
            if (rata >= min && rata <= 4.00) {
                jumlahLulus = jumlahLulus + 1;                
            } else if (rata >= 0 && rata < min){
                jumlahTidakLulus = jumlahTidakLulus + i;                      
            }
        }
        System.out.println("Jumlah Yang Lulus : " + jumlahLulus);
        System.out.println("Jumlah Yang Tidak Lulus : " + jumlahTidakLulus);
        
        System.out.println("Total nilai: " + " " + sum);
        System.out.println("IP:" + rata);
        
        if (rata >= min && rata <= 4.00)
            System.out.println("Lulus");
        else if (rata >= 0 && rata < min){
            System.out.println("Data IP tidak valid");       
        }
    }
}

