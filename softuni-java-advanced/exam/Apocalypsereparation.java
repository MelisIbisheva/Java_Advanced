import java.util.*;
import java.util.stream.Collectors;

public class Apocalypsereparation {

    private static final int PATCH_VALUE = 30;
    private static final int BANDAGE_VALUE = 40;
    private static final int MEDkIT_VALUE = 100;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String [] textilesInfo = scanner.nextLine().split(" ");

        Deque<Integer> textiles = new ArrayDeque<>();

        for(String textile : textilesInfo){
            textiles.offer(Integer.parseInt(textile));
        }

        String[] medicamentInfo = scanner.nextLine().split(" ");

        Deque<Integer> medicaments = new ArrayDeque<>();

        for(String medicament : medicamentInfo){
            medicaments.push(Integer.parseInt(medicament));
        }

        int patchCount = 0, bandageCount = 0, medKitCount = 0;

        while (!textiles.isEmpty() && !medicaments.isEmpty()){
            int textile = textiles.poll();
            int medicament = medicaments.pop();
            int possible = textile + medicament;

            switch (possible){
                case PATCH_VALUE: patchCount++; break;
                case BANDAGE_VALUE: bandageCount++; break;
                case MEDkIT_VALUE: medKitCount++; break;
                default:
                    if(possible>MEDkIT_VALUE){
                        medKitCount++;
                        int minusSum = possible - MEDkIT_VALUE;
                        int currentMed = medicaments.pop();
                        medicaments.push(currentMed+minusSum);
                    } else {
                        medicaments.push(medicament + 10);
                    }
            }
        }

        if(textiles.isEmpty() && medicaments.isEmpty()){

            System.out.println("Textiles and medicaments are both empty.");
        } else if (medicaments.isEmpty()) {
            System.out.println("Medicaments are empty.");

        } else if (textiles.isEmpty()) {
            System.out.println("Textiles are empty.");

        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Patch", patchCount);
        map.put("Bandage", bandageCount);
        map.put("MedKit", medKitCount);

        Map<String, Integer> sortedMap = map.entrySet().stream()
                .filter(entry -> entry.getValue() != 0)
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        for (Map.Entry<String, Integer> e : sortedMap.entrySet()){
            System.out.printf("%s - %d%n", e.getKey(), e.getValue());
        }




        if(!textiles.isEmpty()){
            System.out.print("Textiles left: ");
            System.out.println(textiles.toString().replaceAll("[\\[\\]]",""));

        } else if (!medicaments.isEmpty()) {
            System.out.print("Medicaments left: ");
            System.out.println(medicaments.toString().replaceAll("[\\[\\]]",""));


        }
    }
}
