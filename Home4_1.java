//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.LinkedList;
import java.util.List;

public class Home4_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        System.out.println("Исходный список:");
        for (int num : numbers) {
            System.out.print(num+" ");
        }
        System.out.println();

        List<Integer> reversedNumbers = reverseList(numbers);

        System.out.println("Перевернутый список:");
        for (int num : reversedNumbers) {
            System.out.print(num+" ");
        }
    }

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new LinkedList<>();
        
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        
        return reversedList;
    }
}
