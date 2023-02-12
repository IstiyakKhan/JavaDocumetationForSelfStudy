package BasicNumbersProgramming;
//WAP to print GCD and LCM of 2 numbers
class GCDandLCM{
    public static void main(String[] args) {
        int n1 = 42;
        int n2 = 66;
        int GCD = 0;
        int LCM = 1;
        int temp = 1;

        for(int i = 1;i <= n1; i++){
            if(n1 % i == 0 && n2 % i == 0){//To Print out common divisior between the two numbers
                GCD = i;
            }
        }
        System.out.println("GCD : " + GCD);

        temp = n1 * n2;
        LCM = GCD * LCM;
        LCM = temp/LCM;
        System.out.println("LCM " + LCM);
    }
}
