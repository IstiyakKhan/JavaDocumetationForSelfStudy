package CoreJava;

/*Array = Group of objects inside another object.
 * Characteristics of Array
 * 1) Only HomoGenous(objects of same type) are allowed.
 * 2) It has fixed size.
 * 3) Operations such as as CRUD,searching, sorting is not possible.\
 * 4) To find the length of an array we have length() method.
 */


class Coll{
    int[] array = new int[5];

    Coll(int[] array){
        this.array = array;
    }

}


 class CollectionArray {

    static Integer arr[] = new Integer[2];//Fixed Size

    public String toString(){
        for(int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
           }
        return "";
    }
    public static void main(String[] args) {
       arr[0] = 1;
       arr[1] = 31;
       System.out.println(arr.toString());
       System.out.println(arr.length);


       String arr1[] = new String[3];
       arr1[0] = "ian";
       arr1[1] = "vs";
       arr1[2] = "afn";

       for(int i = 0; i < arr1.length; i++ ){
        System.out.println(arr1[i]);
       }
    }
}
