import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive number : ");
        Converter convert = new Converter(input.nextInt());
        System.out.println("Binary :"+convert.toBinary());
        System.out.println("Octal  :"+convert.toOctal());
        System.out.println("Hex    :"+convert.toHex());
    }
}
