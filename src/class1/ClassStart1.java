package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String nameOfStudent1 = "학생1";
        int ageOfStudent1 = 15;
        int scoreOfStudent1 = 90;

        String nameOfStudent2 = "학생2";
        int ageOfStudent2 = 16;
        int scoreOfStudent2 = 80;

        printStudentInfo(nameOfStudent1, ageOfStudent1, scoreOfStudent1);
        printStudentInfo(nameOfStudent2, ageOfStudent2, scoreOfStudent2);
    }

    public static void printStudentInfo(String name, int age, int score) {
        System.out.println("이름: " + name + " 나이: " + age + " 성적: " + score);
    }
}
