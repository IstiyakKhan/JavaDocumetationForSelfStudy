package BasicNumbersProgramming;
    //WAP to find the product of sum of all the even digits and sum of all the odd digits in a number.
class Reverse3 {
    public static void main(String[] args) {
        int input = 2514795;
        int sumeven = 0;
        int sumodd = 0;
        int prod = 1;
        while(input != 0){
            int d = input % 10;
            input = input/10;
            if(d % 2 == 0){
                sumeven = sumeven + d;
            }
            if(d % 2 != 0){
                sumodd = sumodd + d;
            }


        }
        prod = sumeven * sumodd;
        System.out.println("Output : " + prod);
    }
}
