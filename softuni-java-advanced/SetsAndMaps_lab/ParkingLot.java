package SetsAndMaps_lab;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();
        String input = scanner.nextLine();
        while (!input.equals("END")){
            String[] data = input.split(", ");
            String direction = data[0];
            String carNumber = data[1];
            switch (direction){
                case "IN":
                    parkingLot.add(carNumber);
                    break;
                case "OUT":
                    parkingLot.remove(carNumber);
                    break;
            }


            input = scanner.nextLine();
        }
        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for(String number : parkingLot){
                System.out.println(number);
            }
        }
    }
}
