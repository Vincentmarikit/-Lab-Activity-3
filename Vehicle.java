public class Vehicle{
    private String brand;
    private String model;
    private int year;

   Vehicle(String brand, String model, int year){
    this.brand = brand;
    this.model = model;
    
   if (year >= 1886 && year <= 2026)    {
      this.year = year;
   
    }else{ 
      this.year = 2026;
    
      }
    }
    
    public String getbrand(){
      return brand;
    }
    public String getmodel(){
      return model;
    }
    public int getyear(){
      return year;
    }
    
    boolean setYear (int year){
      if (year >=1886 && year <= 2026){
         this.year = year;
         return true;
         }
         
            return false;
    
    }
    
    
    void displayInfo(){ 
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        }
         
    int calculateAge(){ 
        return 2026 - year;
    }
    boolean isVintage(){
        return calculateAge() > 25;
        
    }
        
 }
    

