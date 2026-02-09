import java.util.*;
import java.util.function.Predicate;
 import java.util.Arrays;
 import java.util.List;
 import java.util.stream.Stream;

 import static java.util.Arrays.compare;
 import static java.util.Arrays.stream;

 public class Main {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(3,2,6,9,4,5,7);


         nums.stream() //3,2,6,9,4,5,7
                .filter(n -> n % 2==1)
                .map(n -> n*3)
                .forEach(n-> System.out.print(n+ " "));




    }

}