package Day9;

import Day7.Day7Array;

public class Day9ClassAndObject {
    public static void main(String[] args) {

        Day9Dog dog1 = new Day9Dog();
        dog1.name = "김율";
        dog1.age = 2;
        dog1.gender = "여자";

        dog1.bark();
        System.out.println(dog1.name + dog1.age + dog1.gender);

        Day9Dog dog2 = new Day9Dog();
        dog2.name = "뽀삐";
        dog2.age = 4;
        dog2.gender = "미정";

        String s = null;
    }
}

