import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class klass = new Class(12,"Aylar", new int[]{1,2,3,4,5,6,7,8,9,10,11,12});

        System.out.println(klass.getNumber());
        System.out.println(klass.getString());
        System.out.println(Arrays.toString(klass.getList()));

    }
}