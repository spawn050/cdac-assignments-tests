import java.util.*;

class ElementFrequency {
    int element;
    int frequency;

    ElementFrequency(int element, int frequency) {
        this.element = element;
        this.frequency = frequency;
    }
}

class FrequencyComparator implements Comparator<ElementFrequency> {
    public int compare(ElementFrequency ef1, ElementFrequency ef2) {
        if (ef1.frequency != ef2.frequency) {
            return ef2.frequency - ef1.frequency; // Sort by frequency in descending order
        } else {
            return ef1.element - ef2.element; // Sort by element in ascending order if frequency is same
        }
    }
}

public class SortElementsByFrequency {
    public static void sortByFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<ElementFrequency> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            list.add(new ElementFrequency(entry.getKey(), entry.getValue()));
        }

        Collections.sort(list, new FrequencyComparator());

        for (ElementFrequency ef : list) {
            for (int i = 0; i < ef.frequency; i++) {
                System.out.print(ef.element + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
        System.out.println("Array before sorting by frequency:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Array after sorting by frequency:");
        sortByFrequency(arr);
    }
}

