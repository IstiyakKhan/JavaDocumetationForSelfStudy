package CoreJava;


/*Final is a keyword which is used to set the value to the variable to be im-modifiable. Which means one the variable is
   initialized it cannot be re-initialized*/

/*
Final Variable : There are two types of final variable
1) Global Final Variable : They must be initialized with a value during declaration because global variables have a
   concept of pre-defined values.
2) Local Final Variable  : We can declare a final variable and initialized them at two different points.
 */


final class fc1 extends nfc1{//final class
    int a = 13;
    public void Test(){

    }
}
class nfc1 {
    int b = 12;

    final public void finalMethod(){
        System.out.println("This is a Final Method");
    }
        }

public class FinalKeyWord {
    final int a = 12;//Global Final Variable\


    public static void main(String[] args) {
        final int a; //Local Final Variable
        a = 13;
        fc1 ref = new fc1();


    }
}
/*
    Final Class : We can use final keyword on class too. A Final Class cannot be inherited, but it can inherit any class.
    We can also create an object of final class.

    Final Method : We can use final keyword on methods too. A Final Method cannot be overridden and im-modifiable ,
    but we can inherit it.
 */
