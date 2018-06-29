package Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carInfo = reader.readLine().split(" ");
        String[] truckInfo = reader.readLine().split(" ");
        String[] busInfo = reader.readLine().split(" ");

        Vehicles car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));
        Vehicles truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));
        Vehicles bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));

        int n = Integer.parseInt(reader.readLine());

        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 0; i < n; i++) {

            String[] commands = reader.readLine().split(" ");
            try {

                if (commands[0].equals("Drive")) {
                    if (commands[1].equals("Car")) {
                        car.drive(Double.parseDouble(commands[2]));
                    } else if ("Truck".equals(commands[1])) {
                        truck.drive(Double.parseDouble(commands[2]));
                    } else {
                        bus.drive(Double.parseDouble(commands[2]));
                    }
                    System.out.println(commands[1] + " travelled " + df.format(Double.parseDouble(commands[2])) + " km");
                } else if ("Refuel".equals(commands[0])) {
                    if (commands[1].equals("Car")) {
                        car.refuel(Double.parseDouble(commands[2]));
                    } else if ("Truck".equals(commands[1])) {
                        truck.refuel(Double.parseDouble(commands[2]));
                    } else {
                        bus.refuel(Double.parseDouble(commands[2]));
                    }
                } else {
                    ((Bus) bus).driveEmpty(Double.parseDouble(commands[2]));
                    System.out.println(commands[1] + " travelled " + df.format(Double.parseDouble(commands[2])) + " km");
                }
            } catch (
                    IllegalArgumentException ex)

            {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}
