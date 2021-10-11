
package string;

public class part4 {
    public static void main(String[] args) {
        String s1 = "this is sakib";
        System.out.println(s1);
        String s2 = s1.replace('i','k');
        System.out.println(s2);
        String[] s3 = s1.split(" ");
        for(String x : s3)
        {
            System.out.println(x);
        }
    }
}
