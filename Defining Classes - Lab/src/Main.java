import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, BankAccount> acccounts = new HashMap<>();
        String input = reader.readLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            double amount = 0;

            switch (command) {
                case "Create":
                    BankAccount account = new BankAccount();
                    acccounts.put(account.getId(), account);
                    System.out.printf("Account %s created%n", account);
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amountD = Integer.parseInt(tokens[2]);
                    if (acccounts.containsKey(id)) {
                        acccounts.get(id).deposit(amountD);
                        System.out.printf("Deposited %d to %s%n", amountD, acccounts.get(id));
                    } else {
                        System.out.printf("Account does not exist%n");
                    }

                    break;
                case "SetInterest":
                    int idRate = Integer.parseInt(tokens[1]);
                    BankAccount.setInterestRate(idRate);
                    break;
                case "GetInterest":
                    int idGet = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (acccounts.containsKey(idGet)) {
                        System.out.printf("%.2f%n", acccounts.get(idGet).getInterestRate(years));
                    } else {
                        System.out.printf("Account does not exist%n");
                    }
                    break;
            }
            input = reader.readLine();
        }
    }
}