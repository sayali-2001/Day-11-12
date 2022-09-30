package NewPackage;

public class MaximumMethod<T extends Comparable<T>>  {
    T x;
    T y;
    T z;
    T w;

    MaximumMethod(T x, T y, T z, T w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public T maximum () {

        if (x.compareTo(y) > 0) {
            return x;
        } else if (y.compareTo(z) > 0) {
            return y;
        } else if (z.compareTo(w) > 0){
            return z;
        }else{
            return w;
        }
    }


    public static void main(String[] args)
    {
        MaximumMethod compareInteger = new MaximumMethod(45, 12, 7, 10);
        System.out.println("Maximum number out of three integers is: " + compareInteger.maximum());

        MaximumMethod  comapreFloat = new MaximumMethod(123.f, 345f, 678f, 456f);
        System.out.println("Maximum number out of three float is: " + comapreFloat.maximum());

        MaximumMethod compareString = new MaximumMethod("Apple", "Orange", "potato", "PineApple");
        System.out.println("Maximum among three string is: " + compareString.maximum());
    }
}
