package CoreJava;
class incre{
     int i = 1;
    public void increment(){
        i++;
        System.out.println(i);
    }
    

}
class statandnonstat{
    public static void main(String[] args) {
        incre ref = new incre();
        incre ref2 = new incre();
        incre ref3 = new incre();
        incre ref4 = new incre();

        ref.increment(); 
        ref2.increment();
        ref3.increment();
        ref4.increment();
    }
}