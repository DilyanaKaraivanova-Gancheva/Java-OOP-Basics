package ClassBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            double lenght = Double.parseDouble(reader.readLine());
            double witdth = Double.parseDouble(reader.readLine());
            double height = Double.parseDouble(reader.readLine());
        try {
            Box box = new Box(lenght, witdth, height);
            System.out.println(box);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
