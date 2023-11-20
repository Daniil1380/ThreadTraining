import java.lang.reflect.Method;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        Method[] methods = Person.class.getMethods();

        int a = methods[0].getParameterCount();

        System.out.println(Arrays.toString(methods));
        System.out.println(a);
    }
}
