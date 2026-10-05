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


    System.out.println("Getters");
    System.out.println("brand: " + v1.getBrand());
    System.out.println("model: " + v1.getModel());
    System.out.println("year: " + v1.getYear());
    System.out.println();
    
    System.out.println("brand: " + v2.getBrand());
    System.out.println("model: " + v2.getModel());
    System.out.println("year: " + v2.getYear());
    System.out.println();
    
    System.out.println("brand: " + v2.getBrand());
    System.out.println("model: " + v2.getModel());
    System.out.println("year: " + v2.getYear());
    System.out.println();
    
    System.out.println("setyear() Tests");
    
    boolean result;


        result = v3.setYear(2000);
   
        System.out.println("setYear(2000): " + result);
        System.out.println("Stored year: " + v3.getYear());
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());
        System.out.println();

        result = v3.setYear(1885);
        System.out.println("setYear(1885): " + result);
        System.out.println("Stored year: " + v3.getYear());
        System.out.println();

        result = v3.setYear(2027);
        System.out.println("setYear(2027): " + result);
        System.out.println("Stored year: " + v3.getYear());
        System.out.println();

        System.out.println("Invalid Constructor Tests");

        Vehicle invalidV1 = new Vehicle("Test", "OldCar", 1885);
        System.out.println("Invalid year 1885 -> stored year: " + invalidV1.getYear());

        Vehicle invalidV2 = new Vehicle("Test", "NewCar", 2027);
        System.out.println("Invalid year 2027 -> stored year: " + invalidV2.getYear());
    }
}