package Generics_lab;

public class Main {
    public static void main(String[] args) {
//        Jar<Integer> jar = new Jar<>();
//
//        jar.add(45);
//        jar.add(34);
//
//        System.out.println(jar.remove());
//        System.out.println(jar.remove());

        Integer[] arr = ArrayCreator.create(13,69);
        for (Integer integer : arr) {
            System.out.println(integer);
        }

        Integer[] arr2 = ArrayCreator.create(Integer.class, 4,13);

        for (Integer integer : arr2) {
            System.out.println(integer);
        }
    }
}
