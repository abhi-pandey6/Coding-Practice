package OOPS;
class pen {
    String color;

    public pen(String color){
        this.color = color;
    }

    public void printColor(){
        System.out.println("pen color is: "+color);
    }
}
public class Example2 {
    public static void main(String[] args) {
        pen p1 = new pen("blue");
        p1.printColor();
    }

}
