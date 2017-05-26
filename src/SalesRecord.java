
import java.util.Scanner;

public class SalesRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cust_id, user_cont = 1, tax_code;
		double sales_amount, tax_nrm, tax_npf, tax_biz, total_amount1, total_amount2, total_amount3;
		String cust_name;


		tax_nrm = .06;
		tax_npf = .00;
		tax_biz = .045;

		Scanner keyboard = new Scanner(System.in);


		while (user_cont == 1)
		{
			System.out.println("What is the customer id?");
			cust_id = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("What is the customer name?");
			cust_name = keyboard.nextLine();
			System.out.println("What is the sales amount?");
			sales_amount = keyboard.nextDouble();
			System.out.println("What is the tax code? 1)Normal Rate 2)NonProfit Rate or 3)Business Rate");
			tax_code = keyboard.nextInt();
			if (tax_code == 1) {
				total_amount1 = sales_amount + (tax_nrm*sales_amount);
				System.out.println("Finished, here is your data " + " CustomerID: " + cust_id + " Customer Name is: " + cust_name + " the Sales Amount is: " + sales_amount + " the Tax : " + (tax_nrm*100) + "%" + " and Total Amount is: " + total_amount1);
			} else if (tax_code == 2){
				total_amount2 = sales_amount + (tax_npf*sales_amount);
				System.out.println("Finished, here is your data " + " CustomerID: " + cust_id + " Customer Name is: " + cust_name + " the Sales Amount is: " + sales_amount + " the Tax : " + (tax_npf*100) +"%" + " and Total Amount is: " + total_amount2);
			} else if (tax_code == 3){
				total_amount3= sales_amount + (tax_biz*sales_amount);
				System.out.println("Finished, here is your data " + "CustomerID: " + cust_id + " Customer Name is: " + cust_name + " the Sales Amount is: " + sales_amount + " the Tax : " + (tax_biz*100) + "%" + " and Total Amount is: " + total_amount3);
			}
			System.out.println("Would you like to enter more records? 1)yes or 2)no");
			user_cont = keyboard.nextInt();	
			if (user_cont == 2){
				System.out.print("Thank you for inputting data :)");
			}
		}
	}
}

