package DefiningClasses_lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countCar = Integer.parseInt(scanner.nextLine());
        while (countCar-->0){
            String[] carData = scanner.nextLine().split("\\s+");

            String brand = carData[0];
            Car car;

            if(carData.length==1){
                car = new Car(brand);
            }else {
                String model = carData[1];
                int horsePower = Integer.parseInt(carData[2]);
                car = new Car(brand,model,horsePower);
            }

            System.out.println(car.carInfo());
        }

    }
}
