package Day12;

public class Day12me {
    public static void main(String[] args) {
        Day12Student[] st = new Day12Student[3];
        st[0]=new Day12Student("펄수",16);
        st[1]=new Day12Student("영희",15);
        st[2]=new Day12Student("민수",16);

        for (int i = 0; i < 3; i++) {
            st[i].introduce();
        }

        for (Day12Student s : st) {
            s.introduce();
        }


    }
}
