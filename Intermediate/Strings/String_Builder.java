package Intermediate.Strings;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hehe");
        sb.append("a");
        sb.append("b");
        sb.append("c");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        System.out.println(sb.capacity());
        sb.delete(0, 4);
        System.out.println(sb);
        sb.setCharAt(0, 's');
        System.out.println(sb);
        sb.insert(1, 'a');
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.toString();
        System.out.println(sb);
    }
}
