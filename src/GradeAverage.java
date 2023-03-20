public class GradeAverage {
    public static void main(String[] args) {
        int grades[] = {1, 3, 5, 4, 5};
        double gradeAverage = 0;
        for (int i = 0; i < grades.length; i++) {
            gradeAverage+= grades[i];
        }
        System.out.println("Średnia to: "+(gradeAverage/grades.length));
    }
}