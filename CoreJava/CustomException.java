package CoreJava;
/*Custom Exception = Custom Exception is a user defined execption that is created when we need a Excetion which is not 
prebuilt in Java. There can be scenarios when Custom Exception is needed.

To create Custom Exception we need to create a class of the Custom Exception then we need to inherit any Exception class from the 
throwable Heriracy.

 * 
 */

import java.util.Scanner;

class IlligelAgeException extends RuntimeException{ //class of CustomException inheriting Exception class.

}
class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        if (a <= 18){
            throw new IlligelAgeException();
        }
        else 
        {
            System.out.println("You can enter ");
        }
    }
}
//To create an obj of the Custom Exception "throw" keyword is used
//It is created Explicily by the user
//Custom Exception can be handled same way as pre build Exception
