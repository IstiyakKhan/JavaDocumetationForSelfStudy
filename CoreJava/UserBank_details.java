
package CoreJava;
class ICICIBank {
    int account_num;
    String acc_holder_name;
    double acc_balance;
    String IFSC;

    public void withdraw()
    {
        System.out.println("You can withdraw");
    }
    public void deposit(){
        System.out.println("You can deposit");
    }
}
class BankAcc extends ICICIBank{
    BankAcc(int account_num, String acc_holder_name, double acc_balance, String IFSC){
        this.account_num = account_num;
        this.acc_holder_name = acc_holder_name;
        this.acc_balance = acc_balance;
        this.IFSC = IFSC;
    }

}
class UserBank_details{

        public static void main(String[] args)
        {
            BankAcc ref = new BankAcc(134, "Sunny Jagdish Gupta", 230999, "23625dsgd");
            System.out.println("Account number : " + ref.account_num);
            System.out.println("Name : " + ref.acc_holder_name);
            System.out.println("Balance : " + ref.acc_balance);
            System.out.println("IFSC Code : " + ref.IFSC);

            ref.withdraw();
            ref.deposit();
            System.out.println("================");

            BankAcc ref2 = new BankAcc(124, "Deepak Yadav", 2330999, "2a35dsgd");
            System.out.println("Account number : " + ref2.account_num);
            System.out.println("Name : " + ref2.acc_holder_name);
            System.out.println("Balance : " + ref2.acc_balance);
            System.out.println("IFSC Code : " + ref2.IFSC);

            
            ref.withdraw();
            ref.deposit();



        }
    }
