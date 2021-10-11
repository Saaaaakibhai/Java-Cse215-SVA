package string;

public class part3 {
    public static void main(String[] args) {
        String country = "My Name is     Sakib  king   ";
        System.out.println(country);
        String s3 = country.trim();
        System.out.println(s3);//they trim
        char ch = country.charAt(0);
        System.out.println("Ch = "+ch);
        int value = country.codePointAt(0);//they show the first char
        System.out.println("Value = "+value);//show the value of char
        int pos = country.indexOf("is");
        System.out.println("first position of is = "+pos);
        pos = country.lastIndexOf('n');
        System.out.println("last position of n "+pos);
    }
}
