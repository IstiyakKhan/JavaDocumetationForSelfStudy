package CoreJava;
class Animal{
    int i = 10;
}
class Monkey extends Animal{
    int j = 20;
}
class UPDownCasting{
    public static void main(String[] args) {
        Animal a = new Monkey();//UPCASTING
        System.out.println(a.i);
        //System.out.println(a.j); CTE because compiler will try to find j inside a type class during compile time
        Monkey m = (Monkey)a;//DOWNCASTING (not possible without Upcasting)
        System.out.println(m.j);

    }
}