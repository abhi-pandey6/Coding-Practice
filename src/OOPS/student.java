package OOPS;

 class students {
     String name;
     int age;

     public void getInfo() {
         System.out.println("The name of this Student is " + this.name);
         System.out.println("The age of this Student is " + this.age);
     }
 }


public class student {
    public static void main(String args[]) {
        students s1 = new students();
        s1.name = "Abhijeet";
        s1.age = 21;
        s1.getInfo();

        students s2 = new students();
        s2.name = "Abhinav";
        s2.age = 20;
        s2.getInfo();
    }
}


