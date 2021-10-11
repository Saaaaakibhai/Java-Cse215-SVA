package Day2;


public class MathDemo {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int max = Math.max(x, y);
        System.out.println("Maximum = "+max);
        int min = Math.min(x, y);
        System.out.println("Minimum = "+min);
        
        int absolute = Math.abs(y);
        System.out.println("Absolute Value of y: "+absolute);
        double power = Math.pow(x,y);
        System.out.println("X to the power Y = "+power);
        int round = Math.round(8.8f);
        System.out.println("Round of 8.8 ="+round);
        double pi = Math.PI;
        System.out.println("Value Of Pie = "+pi);
        
    }
}
