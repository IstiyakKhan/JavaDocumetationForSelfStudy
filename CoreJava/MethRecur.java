package CoreJava;
//so, there might be certain scenarios where recursion is considered more preferable that the interative method. for eg a transvering a tree,
//also method recursion are considered to take more time and space, so in scenarios where a little overhead is allowed we can use recursion
//also in some sorting algorithms and also in divide and conquer type problems where a problem can be divided into sub similar problems.

//example of finding out factorial using method recursion
public class MethRecur {
    public static void main(String[] args) {
        MethRecur ref = new MethRecur();
        System.out.println(ref.fact(5));
    }
    public int fact(int n){
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            System.out.println("Number can't be negative");
            return -1;
        }
        else {
            return n * fact(n - 1);
        }
    }
}
