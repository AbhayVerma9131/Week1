public class Q7{
public static void main(String[] args){
double radious=6378;
double volumekm=(4/3)*3.14*radious*radious*radious;
double volumemile=volumekm*1.6;
System.out.println("The volume of earth in cubic kilometers is "+volumekm+" and cubic miles is "+volumemile);
}
}