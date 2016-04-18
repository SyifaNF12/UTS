package jam;

public class Jam {

    public static void main(String[] args) {
        
        ClassJam waktu = new ClassJam ();
        ClassJam waktu1 = new ClassJam (3, 1, 60);
        ClassJam waktu2 = new ClassJam (2, 1, 0);
        ClassJam waktu3 = new ClassJam (2, 2, 60);        
        
        System.out.println(waktu.convertJamToMenit(10));
        System.out.println(waktu.convertJamToDetik(10));
        System.out.println(waktu.convertMenitToDetik(10));
    }
    
}
