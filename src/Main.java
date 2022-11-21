import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int count=5;
        for(int i=1;i<=count;i++)
        {
            System.out.println("Enter details of Employee "+i+":");
            System.out.print("Empid:");
            int empId=input.nextInt();
            System.out.print("Name:");
            String name=input.next();
            System.out.print("Designation:");
            String designation= input.next();
            System.out.print("Company Name:");
            String companyName=input.next();
            System.out.print("Salary:");
            double salary=input.nextDouble();
            System.out.print("Phone number:");
            long phoneNUmber= input.nextLong();;

            ArrayList<employeeDetails> list = new ArrayList<employeeDetails>();
            list.add(new employeeDetails(empId,name,designation,companyName, salary, phoneNUmber));
        }


    }
}