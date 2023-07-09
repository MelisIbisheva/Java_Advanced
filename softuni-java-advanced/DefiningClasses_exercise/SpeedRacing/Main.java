package DefiningClasses_exercise.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countOfCar = Integer.parseInt(scanner.nextLine());

        Map<String, Car> carMap = new LinkedHashMap<>();

        for (int i = 0; i < countOfCar; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String model = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double consumption = Double.parseDouble(tokens[2]);

            Car car = new Car(model, fuelAmount, consumption);
            carMap.put(model, car);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] commandParts = input.split(" ");
            String model = commandParts[1];
            int kilometers = Integer.parseInt(commandParts[2]);
            Car currentCar = carMap.get(model);
            if(!currentCar.hasEnoughFuel(kilometers)){
                System.out.println("Insufficient fuel for the drive");
            }else {
                currentCar.drive(kilometers);

            }

            input = scanner.nextLine();
        }

        carMap.values().stream().forEach(System.out::println);

    }
}
