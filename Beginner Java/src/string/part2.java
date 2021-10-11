package string;

public class part2 {
    public static void main(String[] args) {
        
    String firstName = "Anisul";
    String lastName = "Islam";
    
    String fullName = firstName + lastName;
        System.out.println("Full Name: "+fullName);
    String upperName = fullName.toUpperCase();
        System.out.println("uppercase = "+upperName);
    String lowerName = fullName.toLowerCase();
        System.out.println("uppercase = "+lowerName);
    boolean b = firstName.startsWith("Ani");
        System.out.println("b = "+b);
    boolean last = lastName.endsWith("an");
        System.out.println("last = "+last);
    String [] names = {"anis","sobuj","neloy"};
    for (String x : names) {
        System.out.println(x);
        }
    }
}
