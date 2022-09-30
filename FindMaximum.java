package NewPackage;

public class FindMaximum {
    public static Integer compareTo(Integer a,Integer b,Integer c)
    {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args)
    {
        FindMaximum s = new FindMaximum();

        System.out.println("max Number for 1st test case="+s.compareTo(5,3,9)); //Test case 1 :given max number for 1st position.
        System.out.println("max Number for 2nd test case="+s.compareTo(2,6,3)); // for 2nd position.
        System.out.println("max Number for 3rd test case="+s.compareTo(1,2,3)); // for 3rd position.
    }
}
