import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int count=5;
        ArrayList<employeeDetails> list = new ArrayList<employeeDetails>();
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
            System.out.println("\n");


            list.add(new employeeDetails(empId,name,designation,companyName, salary, phoneNUmber));
        }

        System.out.println("Enter option: \n 1.View employees");
        int option= input.nextInt();

        switch (option)
        {
            case 1:
                for (int i=0;i<list.size();i++)
                {
                    System.out.println("Employee"+i+" details are:");
                    System.out.println("Empid: "+list.get(i).empId);
                    System.out.println("Name: "+list.get(i).name);
                    System.out.println("Designation: "+list.get(i).designation);
                    System.out.println("Company Name: "+list.get(i).companyName);
                    System.out.println("Salary: "+list.get(i).salary);
                    System.out.println("Phone Number: "+list.get(i).phoneNumber);


                }


        }


    }
}