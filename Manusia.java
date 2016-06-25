package inheritancepewarisan;

public class Manusia {
    
String mata ="Melihat", kaki="Lari";
private String name;
private String address;

public Manusia(){
    System.out.println("Inside Manusia: Constructor");
    name="";
    address="";
    
    
    
    
    
    
    
    
    
    
}

public String getName(){
    return name;
}

public String getAddress(){
    return address;
}
public void setName(String name){
    this.name = name;}
public void setAddress(String address){
    this.address = address;}
    public Manusia(String name, String address) {
        this.name = name;
        this.address = address;}
public void makan(){
    System.out.println("Manusia Makan");}
public void minum(){
    System.out.println("Manusia Minum");}
public void lari(){
    System.out.println("Manusia Lari" + kaki);}
public void melihat(){
    System.out.println("Manusia" + mata);}
public void belajar(){
    System.out.println("Ali Belajar");
}
}