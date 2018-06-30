import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(reader.readLine());

            for (int i = 0; i < num; i++) {
                String [] tokens = reader.readLine().split(" ");
                String model = tokens[0];
                double fuelAmount = Double.parseDouble(tokens[1]);
                double fuelCostForkm = Double.parseDouble(tokens[2]);
            }
        }
}
