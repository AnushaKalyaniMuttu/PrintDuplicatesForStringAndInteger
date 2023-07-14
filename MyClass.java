import java.util.*;
import java.util.stream.*;
public class MyClass {
    public static void main(String args[]) {
    List<String> elements = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Banana", "Durian", "Cherry"));
       List<Integer> ele = new ArrayList<>(Arrays.asList(1,23,4,5,2,3,4,1,2,4,5));

       List<String> duplicatesOfString = elements.stream()
               .filter(element -> elements.indexOf(element) != elements.lastIndexOf(element))
               .distinct()
               .collect(Collectors.toList());

       System.out.println("Duplicates: " + duplicatesOfString);

       List<Integer> duplicates = ele.stream()
               .filter(element -> ele.indexOf(element) != ele.lastIndexOf(element))
               .distinct()
               .collect(Collectors.toList());

       System.out.println("Duplicates: " + duplicates);
    }
}
