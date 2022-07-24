import java.util.*;
class Patient
{
    String name,address,phone,pincode;
    int age,gen;
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
        System.out.println("Enter Patient's Gender:");
        System.out.println("1 for Male");
        System.out.println("2 for Female");
        gen=sc.nextInt();
    }while(gen<1 || gen>2);
        System.out.println("Enter Mobile No:");
        phone=sc.next();
        System.out.println("Enter Address:");
        address=sc2.nextLine(); 
        System.out.println("Enter Pincode");
        pincode=sc2.nextLine();
        
       Bill.add_patient_dtls(name,age,gen,address,pincode,phone);
    }
   
}