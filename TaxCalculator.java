import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc =new Scanner(System.in);
		float tax=0;
		System.out.println("Enter your income in lakhs");
		float income=sc.nextFloat();
		if(income<=2.5){
		    tax=tax+0;
		}
		else if (income>2.5 && income<=5){
		    tax=tax+(income-2.5f)*0.05f;
		} 
		else if (income>5 && income<=10){
		    tax=tax+0.05f*(5.0f-2.5f);        //for 2.5L only 5% tax for remaining....
		    tax=tax+0.2f*(income-5.0f);      //20% tax
		} 
		else if (income>10){
		    tax=tax+0.05f*(5.0f-2.5f);
		    tax=tax+0.2f*(10.0f-5.0f);
		    tax=tax+0.3f*(income-10.0f);
		} 
		
	System.out.println("your tax is "+tax);	
	}
}
