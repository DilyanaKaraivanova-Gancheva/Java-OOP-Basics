package MethodOverriding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n  = Integer.parseInt(reader.readLine());

        List<Rectangle1> rectangleList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
           String[] inputs = reader.readLine().split(" ");

           if (inputs.length == 1) {
               rectangleList.add(new Square(Double.parseDouble(inputs[0])));
           }else{
               rectangleList.add(new Rectangle1(Double.parseDouble(inputs[0]), Double.parseDouble(inputs[1])));
           }

        }
        for (Rectangle1 rectangle : rectangleList) {
            System.out.println(rectangle.area());
        }
    }
}
