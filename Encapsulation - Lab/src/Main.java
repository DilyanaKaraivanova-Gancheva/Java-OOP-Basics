import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

       Team team = new Team("Name");

        for (int i = 0; i < num; i++) {
            String[] input = reader.readLine().split(" ");
            Person person = null;
            try {
                person =  new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            team.addPlayer(person);
        }

        System.out.printf(team.toString());
    }
}
