public class Main{
    
    public static void main (String[] args){
    Vehicle v1 = new Vehicle ("Toyata", "Toyota GR Supra", 2026);
    v1.displayInfo();
    System.out.println("Age: "+ v1.calculateAge());
    System.out.println("is this Vintage?: "+ v1.isVintage());
    System.out.println();
    
    Vehicle v2 = new Vehicle ("Lamborghini", " Lamborghini urus", 2017);
    v2.displayInfo();
    System.out.println("Age: "+ v2.calculateAge());
    System.out.println("is this Vintage: "+ v2.isVintage());
    System.out.println();  
    
    Vehicle v3 = new Vehicle ("Honda", "Honda Civic", 1972);
    v3.displayInfo();
    System.out.println("Age: "+ v3.calculateAge());
    System.out.println("is this Vintage?: "+ v3.isVintage());
    System.out.println();

    }

}