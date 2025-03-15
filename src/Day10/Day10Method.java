package Day10;

public class Day10Method {

//    public static void main(String[] args) {
//        int result = (int) add(1.0, 2);
//        System.out.println("result = " + result);
//
//    }
//
//
//    public static double add(double a, int b) {
//        return a + b;
//    }
//}

    public static void main(String[] args) {
        Day10Cat cat1 = new Day10Cat();
        cat1.name = "뽀삐";
        cat1.introduceMaster("54545");
        System.out.println(cat1.getName());

        Day10Cat cat2 = new Day10Cat("뽀삐");
        System.out.println(cat2.name);

        Day10Cat cat3 = new Day10Cat(2);
        System.out.println(cat3.age);

        Day10Cat cat4 = new Day10Cat("뽀삐", 2);


    }
}