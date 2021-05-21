package addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addressbook 
{
	public static void main(String[] args) 
	{
        System.out.println("Welcome in Address Book");
        List<String> PersonDetail = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First name : ");
        String fname = input.nextLine();

        System.out.print("Enter the Last name : ");
        String lname = input.nextLine();

        System.out.print("Enter the Address : ");
        String address = input.nextLine();

        System.out.print("Enter the City : ");
        String city = input.nextLine();

        System.out.print("Enter the state : ");
        String state = input.nextLine();

        System.out.print("Enter the Zip Code : ");
        String zip = input.nextLine();

        System.out.print("Enter the phone number: ");
        String phone = input.nextLine();
        
        System.out.print("Enter the Email: ");
        String email = input.nextLine();

        PersonDetail.add(fname);
        PersonDetail.add(lname);
        PersonDetail.add(address);
        PersonDetail.add(city);
        PersonDetail.add(state);
        PersonDetail.add(zip);
        PersonDetail.add(phone);
        PersonDetail.add(email);

	}
}

