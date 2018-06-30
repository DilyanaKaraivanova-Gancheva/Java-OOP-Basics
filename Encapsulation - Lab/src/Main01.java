import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] input = reader.readLine().split(" ");
            try {
                people.add(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        double bonus = Double.parseDouble(reader.readLine());

        for (Person person : people) {
            person.increseSlary(bonus);
            System.out.println(person.toString());
        }
    }
}
