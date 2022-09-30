package NewPackage;

public class FindMaxString {
    public static String compareTO(String x,String y,String z){

    int a = x.compareTo(y);
    int b = x.compareTo(z);
    int c = y.compareTo(z);

    if(a>b && a>c){
        return x;
    }else if(b>c){
        return y;
    }else {
        return z;
    }
}

    public static void main(String[] args)
    {
        FindMaxString m = new FindMaxString();

        System.out.println("max Number for 1st test case="+m.compareTO("Apple","banana","peach"));  // Test case 1 :given max number for 1st position.
        System.out.println("max Number for 2nd test case="+m.compareTO("peach","banana","peach"));  // for 2nd position
        System.out.println("max Number for 3rd test case="+m.compareTO("banana","apple","orange")); // for  3rd position.
    }
}
