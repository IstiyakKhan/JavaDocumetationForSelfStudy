package CoreJava;
/*
 * Encapsulation = The Process of binding states/properties(variable) and behavoiour(method) of an object.
 * Encapsulation can be achieved by providing private access specifiers to the variables/ Data hiding is achieved by encapsulation .
 * Private access specifier = Avoiding direct access but providing control access.
 * How to access private variables?
 *          By the help of getter and setter method
 * 
 * Advantages of encapsulation
 * It is used to acheive data hiding and code flexibily.
 * 
 * Disadvantages of encapsulation
 * Encapsulation can be a reason of code complexity/too much lines of code
 */

class ATM{

    private double money = 100000;//states

    public void withdraw()//behaviour
    {
        System.out.println("You can withdraw cash");
    }

    public double getMoney(){//getter method
        return money;
    }

    public void setMoney(double money){//setter method
        this.money = money;
    }

}
//Driver class
class Encapsulation
{
    public static void main(String[] args){
       ATM ref=  new ATM();
       ref.setMoney(80000);
       System.out.println("Total amount in the ATM : " + ref.getMoney());
       ref.withdraw();
     

    }

}