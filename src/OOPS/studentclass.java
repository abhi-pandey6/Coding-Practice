package OOPS;
//public class studentclass {
//
//    public static class student{
//        String name;
//        int roll_num;
//        double percentage;
//    }
//    public static void info(student s1){
//        System.out.println(s1.roll_num);
//    }
//    public static void main(String[] args) {
//
//        student s1 = new student();
//        s1.name = "abhijeet";
//        s1.roll_num = 6;
//        s1.percentage = 98;
//        info(s1);
//
//
// }
//
//}




public class studentclass {

    public static class student {
        String name;
        private int roll_num;  // Private variable
        double percentage;

        // Setter method to set value of roll_num
        public void setRollNum(int r) {
            roll_num = r;
        }

        // Getter method to get value of roll_num
        public int getRollNum() {
            return roll_num;
        }
    }

    public static void info(student s1) {
        System.out.println("Roll Number: " + s1.getRollNum());  // Access via getter
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Abhijeet";
        s1.setRollNum(6);           // Set value using setter
        s1.percentage = 98;

        info(s1);                   // Print roll number using getter inside info
    }
}

