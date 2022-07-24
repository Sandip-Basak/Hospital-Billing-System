import java.util.*;
class Patie
{
    String name,address,phone,Pincode;
    int age,gender;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("\fEnter Patient's Name:");
        name=sc.nextLine();
        do{
        System.out.println("Enter Patient's Age:");
        age=sc.nextInt();
    }while(age>120);
    do{
        System.out.println("Enter Patient's Gender:\n[1 for Male\n 2 for Female]");
        gender=sc.nextInt();
    }while(gender<1 || gender >2);
        System.out.println("Enter Mobile No:");
        phone=sc.next();
        System.out.println("Enter Address:");
        address=sc2.nextLine();
        System.out.println("Enter Pincode");
        Pincode=sc2.nextLine();
         Bill.add_patient_dtls(name,age,gender,address,Pincode,phone);
    }
   
}