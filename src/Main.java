import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int t = random.nextInt(1000);
            numbers.add(t);
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            var integer = iterator.next();
            if (integer % 2 != 0) {
                iterator.remove();
                System.out.println(integer + " ");
            }
        }
    }
    }