package NewPackage;

public class Refactor2<T extends Comparable<T>> {
    T x;
    T y;
    T z;

    Refactor2(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum () {

        if (x.compareTo(y) > 0) {
            return x;
        } else if (y.compareTo(z) > 0) {
            return y;
        } else {
            return z;
        }
    }


    public static void main(String[] args)
    {
        Refactor2 compareInteger = new Refactor2(45, 12, 7);
        System.out.println("Maximum number out of three integers is: " + compareInteger.maximum());

        Refactor2  compareFloat = new Refactor2(123.f, 345f, 678f);
        System.out.println("Maximum number out of three float is: " + compareFloat.maximum());

        Refactor2 compareString = new Refactor2("Apple", "Orange", "potato");
        System.out.println("Maximum among three string is: " + compareString.maximum());
    }
}
