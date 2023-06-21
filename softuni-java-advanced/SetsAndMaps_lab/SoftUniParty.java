package SetsAndMaps_lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        String reservationNumber = scanner.nextLine();
        while (!reservationNumber.equals("PARTY")){
            if(Character.isDigit(reservationNumber.charAt(0))){
                vip.add(reservationNumber);
            }else {
                regular.add(reservationNumber);
            }


            reservationNumber = scanner.nextLine();
        }

        String guestReservation = scanner.nextLine();
        while (!guestReservation.equals("END")){
            vip.remove(guestReservation);
            regular.remove(guestReservation);
            guestReservation = scanner.nextLine();
        }

        int countNotCome = vip.size() + regular.size();
        System.out.println(countNotCome);
        if(!vip.isEmpty()){
            System.out.println(String.join(System.lineSeparator(), vip));
        }
        if (!regular.isEmpty()) {
            System.out.println(String.join(System.lineSeparator(), regular));

        }

    }
}
