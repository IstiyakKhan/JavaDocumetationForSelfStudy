package CoreJava;
class nsb
{
    static int i = 10;
    public void sunny(){
        System.out.println("Sunny Bhosdika");
        System.out.println(i);
        System.out.println(this);
    }
    public static void main(String[] args){
        nsb ref = new nsb();
        ref.sunny();
    }
}