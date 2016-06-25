package inheritancepewarisan;

public class Ali extends Manusia{

public Ali(){
    System.out.println("Inside Ali: Constructor");
    setName("Ali");
    setAddress("Ciamis");
    System.out.println("Name:"+getName()+"\nAddress:"+getAddress());
}    
    @Override
    public void belajar() {
        super.belajar(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void melihat() {
        System.out.println("Ali"+' '+super.mata); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void lari() {
        System.out.println("Ali"+' '+super.kaki); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void minum() {
        super.minum(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void makan() {
        super.makan(); //To change body of generated methods, choose Tools | Templates.
    }
}
