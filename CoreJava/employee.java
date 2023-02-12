package CoreJava;
public class employee {
    int id;
    String name;
    int sal;
    
    employee(){

    }
    employee(int id){
        this.id = id;
    }
    employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    employee(int id, String name, int sal){ 
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    public static void main(String[] args){
        employee ref = new employee(1, "Bharti", 93000);
        employee ref2 = new employee(2, "Sunny", 53000);
        employee ref3 = new employee(3, "Manas", 23000);
         
        System.out.println(ref.id);
        System.out.println(ref.name);
        System.out.println(ref.sal);

        System.out.println("===========");

        System.out.println(ref2.id);
        System.out.println(ref2.name);
        System.out.println(ref2.sal);

        System.out.println("===========");

        System.out.println(ref3.id);
        System.out.println(ref3.name);
        System.out.println(ref3.sal);
    }
}
