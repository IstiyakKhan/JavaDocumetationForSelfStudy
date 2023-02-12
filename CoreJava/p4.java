
package CoreJava;
public class p4 {
    
    public void sheela(){
        System.out.println("hi baby");
        System.out.println("bye baby");
        System.out.println("this : " + this);

    }

    public static void main(String[] args){
        System.out.println("ME");
        p4 ref = new p4();
        p4 ref2 = new p4();
        ref.sheela();
        ref2.sheela();

        

        System.out.println("ref :" + ref);
        System.out.println("ref 2 : " + ref);
    }
}
