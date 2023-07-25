package WorkingWithAbstractions_exercise.TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> colors = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        List<TrafficLights> trafficLights = new ArrayList<>();
        for (String color : colors) {
            Color currentColor = Color.valueOf(color);
            TrafficLights currentTrafficLights = new TrafficLights(currentColor);
            trafficLights.add(currentTrafficLights);
        }

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            //change color
            for(TrafficLights trafficLight: trafficLights){
                trafficLight.changeColor();
                System.out.print(trafficLight.getCurrentColor() + " ");
            }
            System.out.println();
            //print traffic lights

        }
    }
}
