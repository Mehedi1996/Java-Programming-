
package employee;

public class Employee {
    private String name;
    private String id;
    private int age;
    private String designation;
    private double salary;

   
    
    public void empName(String Name,String Id){
        this.name = Name;
        this.id = Id;
    }
  
    public void empAgeDesignation(int Age,String Designation){
        this.age = Age;
        this.designation = Designation;
    }

     public void empSalary(double Salary){
        this.salary = Salary;
        
    }
     public  void display_Info(){
         System.out.println("Name :"+name+"\n"+"Id :"+id);
     }
   
    public static void main(String[] args) {
        
       Employee employee1 = new Employee();
       employee1.name = "mehedi";
       employee1.id = "12";
       employee1.display_Info();
       
      Employee employee2 = new Employee();
      employee2.name = "Hasan";
       employee2.id = "152-15-6103";
       employee2.display_Info();
     
        
        
    }
    
}
