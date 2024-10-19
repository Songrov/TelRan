package telran.homework.lesson10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentString {

    public static String mostFrequentString(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return null;
        }

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String str : strings) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        String mostFrequent = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        String mostFrequent = mostFrequentString(strings);
        System.out.println("Most frequent string: " + mostFrequent);  // Output: Most frequent string: apple
    }
}
