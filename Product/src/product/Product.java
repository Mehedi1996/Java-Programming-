
package product;

public class Product {
    private String name;
    private String code;
    private String description;
    private double price;
    
    public void pName(String Name){
        this.name = Name;
    }
   
      public void pCode(String Code){
        this.code = Code;
    }
    
       public void pDes(String Description){
        this.description = Description;
    }
    
        public void pPrice(double Price){
        this.price = Price;
    }
    
         public void dispalyInfo(){
             System.err.println("Name :"+name+"\n"+"Code :"+code+"\n"+"Description :"+description
              +"\n"+"Price"+price);
    }
    
    public static void main(String[] args) {
        
        Product product1 = new Product();
        
        product1.name = "Potato";
        product1.code = "10";
        product1.description = "Healthly Food";
        product1.price = 12.5;
        
        Product product2 = new Product();
        
        product2.name = "Onion";
        product2.code = "20";
        product2.description = "Healthly Food";
        product2.price = 120.5;
        
         Product product3 = new Product();
        
        product3.name = "Meet";
        product3.code = "30";
        product3.description = "Costy Price and Popular";
        product3.price = 500;
        
        product1.dispalyInfo();
        product2.dispalyInfo();
        product3.dispalyInfo();
        
        
    }
    
}
