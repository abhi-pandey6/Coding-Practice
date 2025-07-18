package E.Strings;

public class SBstring {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abhijeet");
        System.out.println(sb);

        System.out.println(sb.charAt(2));

        sb.setCharAt(2, 'i');
        System.out.println(sb);

    }
}
