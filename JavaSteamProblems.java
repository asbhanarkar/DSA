import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import java.util.stream.Collectors;

public class JavaSteamProblems  {

    public static void main(String[] args) {
       // filter even numbers

       List<Integer> list = Arrays.asList(1,2,3,4,3,6,8);

       List<Integer> evenNum = list.stream()
                                .filter(n -> n%2 ==0 )
                                .collect(Collectors.toList());

        System.out.println("Evene Num List : " +evenNum);

        // convert List of String to Upper Case

        List<String> strs = Arrays.asList("data", "streaM", "Space","friction");

        List<String> upperCaseList = strs.stream()
                                        .map(str -> str.toUpperCase())
                                        .collect(Collectors.toList());
        
        System.out.println("convert String to upper Case : " + upperCaseList);


        //Find max num in List
        List<Integer> list1 = Arrays.asList(1,2,3,4,3,6,8);   
        
        Optional<Integer> maxNum = list1.stream()
                        .max((a, b) -> a.compareTo(b));

        System.out.println("Find Max Num : "+ maxNum.get());

        //Find the first Non-repating char in a string

        String str = "swiss";

        Character ch = str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream()
                        .filter(e -> e.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null);

        System.out.println("Find first Non repeating chat in a string : " + ch);

        //Find the first repating char in a string

        String str1 = "aditya";

        Character ch1 = str1.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream()
                        .filter(e -> e.getValue() > 1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null);

        System.out.println("Find first repeating chat in a string : " + ch1);


        // Find the freq of the element in a list

        List<Integer> list2 = Arrays.asList(1,2,3,4,3,6,8,1,1,8,8,8);  

        Map<Integer, Long> freq = list2.stream()
                                    .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println("Freq of the element from list : " + freq);

        //Find the freq of char from a String

        String str2 = "adityabhanarkar";

        Map<Character, Long> charFreq = str2.chars()
                                            .mapToObj(c -> (char) c)
                                            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("Freq of the element from string : " + charFreq);

        // second highest number in a List

        List<Integer> list3 = Arrays.asList(5,2,1,8,6);

        Optional<Integer> secHighest = list3.stream()
                                        .sorted((a,b) -> b-a) // Comparator.reverseOrder()
                                        .skip(1)
                                        .findFirst();
        System.out.println("Second Highest Number from list: " + secHighest.get());


        // Find the most frequent element in a list
        List<Integer> list4 = Arrays.asList(1, 2, 3, 3, 4,2,3,4,5,6);
       
        Optional<Integer> mostFrequentNum = list4.stream()
                                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                                .entrySet().stream()
                                .max(Comparator.comparingLong(Map.Entry::getValue))
                                .map(Map.Entry::getKey);

        System.out.println("Most frequent Element in a List: " + mostFrequentNum.get());
                                
    }

    
}



