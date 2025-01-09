import java.util.Scanner;
public class TotalIncome{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double salary=sc.nextDouble();
double bonus=sc.nextDouble();
double income=salary+bonus;
System.out.println("The salay is INR "+salary+" and bonus is INR "+bonus+" . Hence the total income is INR "+income);

}
}