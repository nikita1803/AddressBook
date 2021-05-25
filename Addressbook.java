package addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created a address book main class inside this there are functions to add edit and delete 
 * @author OM NAMO NAMAH
 *
 */

public class Addressbook 
{
	/**
	 * create contact is a function in which we add the contact details
	 * @return array list
	 */
	boolean check=false;
	public static ArrayList<ContactDetails> createContact()
	{
		ArrayList<ContactDetails> PersonDetail = new ArrayList<ContactDetails>();
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
        int zip = input.nextInt();

        System.out.print("Enter the phone number: ");
        int phone = input.nextInt();input.nextLine();
        System.out.print("Enter the Email: ");
        String email = input.nextLine();
        PersonDetail.add(new ContactDetails(fname, lname, address, city, state, zip, phone, email));

        for (ContactDetails str : PersonDetail)
        {
            System.out.println(str + " "); 
        }
        return PersonDetail;
	}
	/**
	 * check name is function which is use to check whether the user is exist or not.
	 * @param personDetail
	 * @return boolean value
	 */
	public static boolean checkName(ArrayList<ContactDetails> personDetail) 
	{
		Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = input.nextLine();
        System.out.println("Enter Last Name");
        String lastName = input.nextLine();

        for (int indexNum = 0; indexNum < personDetail.size(); indexNum++) 
        {
            if (firstName.equals(personDetail.get(indexNum).getFirstName()) && lastName.equals(personDetail.get(indexNum).getLastName())) 
            {
                System.out.println("Contact Name Exists");
                return true;
            }
        }
        return false;
    }
	/**
	 * created a function to edit the details from the console.
	 * @param personDetail , check
	 * first it check the value is equal to the original value if exist then you can edit the existing value. 
	 */
	public static void editContact( ArrayList<ContactDetails> personDetail, boolean check)
	{
		if(check)
		{
			System.out.println("enter old value");
			Scanner input = new Scanner(System.in);
			int i=0;
			String originalValue = input.nextLine();
			
			System.out.println("enter new value");
			String value = input.nextLine();
		
			for(i=0;i<personDetail.size();i++)
			{
			
				if(personDetail.get(i).getFirstName().equals(originalValue))
				{
				personDetail.get(i).setFirstName(value);
				}
				if(personDetail.get(i).getLastName().equals(originalValue))
				{
				personDetail.get(i).setLastName(value);
				}
				if(personDetail.get(i).getArea().equals(originalValue))
				{
				personDetail.get(i).setArea(value);
				}
				if(personDetail.get(i).getCity().equals(originalValue))
				{
				personDetail.get(i).setCity(value);
				}
				if(personDetail.get(i).getState().equals(originalValue))
				{
				personDetail.get(i).setState(value);
				}
				if(personDetail.get(i).getEmail().equals(originalValue))
				{
				personDetail.get(i).setEmail(value);
				}
			}
			for (ContactDetails str : personDetail)
	        {
	            System.out.println(str + " "); 
	        }
		}
		else
		{
			System.out.println("Contact not exist");
		}
	}
	/**
	 * delete contact is a function is use to delete the value 
	 * @param personDetail
	 * iterator is use to iterate all the details person
	 * hasNext keyword is use to iterate next value till the array length.
	 */
	public static void deleteContact(ArrayList<ContactDetails> personDetail)
	{
		Iterator itr = personDetail.iterator();
		System.out.println("enter value to delete");
		Scanner input = new Scanner(System.in);
		String deleteValue = input.nextLine();
        while (itr.hasNext())
        {
            String x = (String)itr.next();
            if (x.equals(deleteValue))
                itr.remove();
        }
        for (ContactDetails str : personDetail)
        {
            System.out.println(str + " "); 
        }
	}
	/**
	 * all functions are passes in main function to perform .
	 * @param args
	 */
	public static void main(String[] args) 
	{
        System.out.println("Welcome in Address Book");
        ArrayList<ContactDetails> PersonDetail = new ArrayList<ContactDetails>();
        ArrayList<ContactDetails> personDetail= createContact();
        MultipleAddressBook.addAdressBookDetails();
        MultipleAddressBook.addAdressBookDetails();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First name : ");
        String fname=input.nextLine();
        System.out.print("What you want to perform ? Press 1 for Add the details , press 2 for edit the details , press 3 for delete the details : ");
        int option = input.nextInt();
        switch(option)
        {
        	case 1:
        		createContact();
        		for (ContactDetails str : personDetail)
    	        {
    	            System.out.println(str + " "); 
    	        }
        	break;
        	case 2:
        		boolean check=checkName(personDetail);
        		editContact(personDetail,check);
        	break;
        	case 3:
        		deleteContact(personDetail);
        	break;
        	default:
        		System.out.print("Please enter the valid number : ");	
        }  
	}
}
/**
 * contact details is a class to store the details of contact
 * @author OM NAMO NAMAH
 */
class ContactDetails
{
    private String firstName;
    private String lastName;
    private String area;
    private String city;
    private String state;
    private int zip;
    private int phoneNumber;
    private String email;
    
    /**
     * here is a parameterized constructor of the the class
     * having parameters are the variable declare in the class of private type. 
     */

    public ContactDetails(String firstName, String lastName, String area, String city, String state, int zip, int phoneNumber, String email) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.area = area;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getFirstName() 
    {
        return this.firstName;
    }
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    public String getLastName() 
    {
        return this.lastName;
    }
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    public String getArea()
    {
    	return this.area;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }
    public String getCity() 
    {
        return this.city;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }
    public String getState() 
    {
        return this.state;
    }
    public void setState(String state) 
    {
        this.state = state;
    }
    public int getZip()
    {
    	return this.zip;
    }
    public void setZip(int zip) 
    {
        this.zip = zip;
    }
    public int getPhoneNumber()
    {
    	return this.phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail()
    {
    	return this.email;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }
    public String toString() 
    {
        return "Details of: " + firstName + " " + lastName + "\n"
                + "Address: " + area + "\n"
                + "City: " + city + "\n"
                + "State: " + state + "\n"
                + "Zip: " + zip + "\n"
                + "Phone Number: " + phoneNumber + "\n"
                + "Email: " + email;
    }
  }
/**
 * Multiple address book is a class which is use to store the multiple address book with unique name.
 */
class MultipleAddressBook
{
	public static int indexNum;
	public static ArrayList<ContactDetails> list = new ArrayList<>();
	public String addressBookName;
	public String firstName;
	public String lastName;
	public String area, city, state, email;
	public int zip, phoneNumber;

	/**
	 * parameterized constructor of the class
	 * @param addressBookName
	 */
	public MultipleAddressBook(String addressBookName) 
	{
		this.addressBookName = addressBookName;
	}
	public static Scanner sc = new Scanner(System.in);
	public static List<String> allDetails = new ArrayList<>();
	public static ArrayList<MultipleAddressBook > addressBook = new ArrayList<>();
	private static int bookNumber = 0;
	/**
 	*this is function which is use to add the address book . 
 	*/
	public static void addAdressBookDetails() 
	{
		System.out.println("Enter Name of Address Book");
		String name = sc.next();
		addressBook.add(new MultipleAddressBook(name));
	}
}