import java.util.Scanner;
public class Q15{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int unit=sc.nextInt();
int qty=sc.nextInt();
double price=unit*qty;
System.out.println("The total purchase price is INR "+price+" if the quantity "+qty+" and unit price is INR "+unit);
}
}