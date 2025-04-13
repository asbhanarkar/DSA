
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


class Test {
    public static void main(String[] args) {
        // String str = "All,my,day";



        // List<String> lis = Arrays.stream(str.split(",")).collect(Collectors.toList());

        // System.out.println(lis);

        //second highest

        // List<Integer> nums = Arrays.asList(10,14,58,10,18);

        // Optional<Integer> res = nums.stream().distinct()
                        // .sorted((a,b) -> b-a)
                        // .skip(1)
                        // .findFirst();

        // System.out.println(res);

        //freq using grouping by

        String str = "adityaiiiii";

        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors
                    .groupingBy( Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}

