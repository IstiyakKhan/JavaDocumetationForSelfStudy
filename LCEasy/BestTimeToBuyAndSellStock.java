package LCEasy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] a = {98,94,92,102,105,110,94,39,42,54,46};
        int Smallest = Integer.MAX_VALUE;
        int daytobuy = 0;
        int daytosell = 0;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if(a[i] < Smallest){
                Smallest = a[i];
            }
        }
        int indexs = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == Smallest){
                indexs = i;
            }
        }
        for (int i = indexs; i < a.length; i++) {
            if(a[i] > largest){
                largest = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] == largest){
                daytosell = i+1;
            }
            if(a[i] == Smallest){
                daytobuy = i+1;
            }
        }
        System.out.println("Day to Buy : " + daytobuy + " | At Price : " + Smallest + "$");
        System.out.println("Day to Sell : " + daytosell + " | At Price : " + largest + "$");
        System.out.println("Profit = " + (largest - Smallest + "$"));
    }
}
