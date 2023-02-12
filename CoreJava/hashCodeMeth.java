package CoreJava;
/*
 * hashCode Method = It is a non static method defined inside Object class .It returns unique interger number for every object.
 * Why do we need to override hashCode method ?
 * When we want to return a number based on the data of an object./Or we want to generate a specific address of an object
 */



public class hashCodeMeth {

    public int hashCode(){
        return 10;
    }

    public static void main(String[] args) {
        hashCodeMeth ref = new hashCodeMeth();
        System.out.println(ref);//decimal value will be converted to hexadecimal
        System.out.println(ref.hashCode());
    }
    
}
