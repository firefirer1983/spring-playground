import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(10);
        names.add("fyman");
        names.add("xy");
        names.add("xiaoxiao");
        names.add("Head");
        for(String name: names) {
            System.out.println(name);
        }
        String[] cars = {"BMW", "Tokyo", "Tesla"};
        for (String car: cars) {
            System.out.println(car);
        }
        String[] ary = {"hello", "baby"};
        List<String> asl = new ArrayList<>(Arrays.asList(ary));
        asl.add(new String("hello"));
        for (String s: asl) {
            System.out.println(s);
        }

    }
}
