package string;
public class part1 {
    public static void main(String[] args) {
        String s1 = "Anisul Islam";
        String s2 = new String ("Anisul Islam");
        char [] s3 = {'a','n','i','s'};
        System.out.println(s3);
        System.out.println("s1= "+s1);
        System.out.println("s2= "+s2);
        int len = s1.length();
        System.out.println("Length: "+len);
        if(s1.equals(s2))
        {
            System.out.println("Equal");
        }
        else
            System.out.println("Not Equal");
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        boolean con = s1.contains("Islam");
        System.out.println(con);
        boolean b = s1.isEmpty();
        System.out.println("b = "+b);
    }
}