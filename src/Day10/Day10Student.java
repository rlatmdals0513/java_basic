package Day10;

public class Day10Student {


    public String name;
    public int age;


    public Day10Student(String name,int age) {
        this.name = name;
        this.age = age;
    }



    public void introduce() {
        System.out.println("안녕하세요.저는" + age + "살이고 " + name + "입니다.");

    }
}


