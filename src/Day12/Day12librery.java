package Day12;

public class Day12librery {
    String title;
    String author;
    boolean isRented;

    public Day12librery(String title, String author) {
        this.title = title;
        this.author = author;
        isRented = false;
    }

    public void rentBook() {
        if (isRented == false) {
            isRented = true;
            System.out.println(this.title + "이(가) 대여되었습니다.");

        } else {
            System.out.println(this.title + "은(는) 이미 대여중입니다.");
        }
    }

    public void introduce() {
        if (isRented == false) {
            System.out.println("제목:" + this.title + ",대여상태:가능");

        }
        else{
            System.out.println("제목:" + this.title + ",대여상태:불가능");
        }

    }
}