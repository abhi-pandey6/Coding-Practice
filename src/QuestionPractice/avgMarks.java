package QuestionPractice;

public class avgMarks {
    public static void main(String[] args) {
        int [] physicsMarks = {74,58,96,77,15,29};

        int sum = 0 ;
        for (int marks : physicsMarks){
            sum += marks;
        }
         double average = (double)sum / physicsMarks.length;
        System.out.println("Average marks is: "+average);
    }
}
