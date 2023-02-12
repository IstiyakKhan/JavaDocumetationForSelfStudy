package CoreJava;
class Dhirubhai {
    String company = "Reliance Industries"; //States

    public void thinkingStyle(){ //Behaviours
        System.out.println("Dhirubhai's unique thinking style");
    }
    
}
class Mukesh extends Dhirubhai{
         
}
class Mumbai {
    public static void main(String[] args){
        Mukesh ref = new Mukesh();
        System.out.println(ref.company);
        ref.thinkingStyle();

    }
}
