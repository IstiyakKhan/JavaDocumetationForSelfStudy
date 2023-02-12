package CoreJava;
/*
 * Exception = When a problem occurs during run time because of an abnormal statement in the program.
 * Two types of Exception
 * 1)Checked Exception : Compiler aware Exception(Compiler knows which statement will give ExceptionError)
 * 2)Unchecked Exception : Compiler unaware Exception(Compiler doesnt know which statement will give ExceptionError)
 * We can handle exception with the help of Exception Handling Mechanism
 */


 class Exception {
    public static void main(String[] args) {
        System.out.println(12);
    try{       //in try block we check weather the statement might give an exception or not 
        System.out.println(24/0);//RunTimeException. Type : ArithmeticException
    }


//1)Code is paused if there is an occurence of Exception.
//2)Impilicitly Creates an Exception Object Reference
//3)Checks weather the program has any Exception handling Mechanism or not(If not present then the code will be terminated)
    

    catch(ArithmeticException ref){       //Used to catch the Exception Object Reference thrown by the try block.
        System.out.println("Handled");      //If the expection is handled it will print this statement
    }
    catch(RuntimeException ref1){       //in multiple catch we must write subclass exception type first then superclass. 
        System.out.println("try multiple catch example");
    }
    finally{
        System.out.println("try-catch-finally");     //"finally block" is used to print a statement mandatorily 
    }

    
/*
 * finally must be written after try block
 * if there is any catch statement then finally should be written after that
 * can write only one finally block after try block
 * finally block will get executed regardless of weather the exeption is handled or not.
 */

        System.out.println(21);
    }
}
/*                                          4 types of Exception Handling Mechanism
 * 1) try - catch block
 * 2) try - multiple - catch block
 * 3) try - catch - finally
 * 4) try - finally
 */
