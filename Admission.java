import java.util.*;
class Admission{
    int dpt=0;
    Patie p ;
    Scanner sc;
    void Show_dpt(){
        p=new Patie();
        // addmission bill to be added
        do{
        System.out.println("\f Select Department ");
        System.out.println(" 1:Gynaecology ");
        System.out.println(" 2:Cardiology ");
        System.out.println(" 3:ENT Specialist ");
        System.out.println(" 4:Orthopadic ");
        System.out.println(" 5:Child Section ");
        System.out.println(" 6:Accident and Emergency ");
        System.out.println(" 7:Eye Specialist ");
        sc=new Scanner(System.in);
        dpt=sc.nextInt();
            switch(dpt){
                case 1: 
                Gynaecology();
                break;
                case 2: 
                cardiology();
                break;
                case 3:
                ENT_Specialist();
                break;
                case 4:
                Orthopadic();
                break;
                case 5:
                Child_Section();
                break;
                case 6:
                accident();
                break;
                case 7:
                Eye_Specialist();
                break;
                default :
                System.out.println("\fPlease Enter any number to select Department");
                System.out.println(" enter [ Zero ] for EXIT ");
            }
        }while((dpt!=0 && dpt<1) || dpt>8);
    }
    void Eye_Specialist(){
      p.input();
      int bed=0;
      int day=0,billday=0,surgery=0,ex=0;
      String test="";
    // Addmission fee bill
      do{
      System.out.println("\f Enter Bed Type :");
      System.out.println(" 1.ICU             : 1000/- per day");
      System.out.println(" 2.Normal Bed      : 200/- per day");
      System.out.println(" 3.Private AC Room : 600/- per day");
      System.out.println(" 4.Private Non-AC Room : 500/- per day");
      bed=sc.nextInt();
      switch(bed){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*200;
            Bill.addItem("General Bed Charge",day+"","7212",billday);
            break;
            case 3:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*600;
             Bill.addItem("Private AC Room Bed Charge",day+"","7213",billday);
            break;
            case 4:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*500;
           Bill.addItem("Private Non-AC Room Bed Charge",day+"","7214",billday);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        }
    }while(bed>4);
    int eye=0;
    do{
      System.out.println("\f Select Doctor of Eye Specialist Department ");  
      System.out.println(" 1: Dr.Ronok Adhikari     [V.TIME : 16:00 to 20:00]  Fee:750/- ");
      System.out.println(" 2: Dr.Debojit Poddar     [V.TIME : 18:00 to 21:00]  Fee:900/- ");
      System.out.println(" 3: Dr.Tania Banik        [V.TIME : 14:00 to 16:00]  Fee:600/- ");
      System.out.println(" 4: Dr.Snehasis Mallick   [V.TIME : 06:00 to 14:30]  Fee:500/- ");
      System.out.println(" 5: Dr.Smith Bera         [V.TIME : 16:00 to 22:00]  Fee:800/- ");
      eye=sc.nextInt();
      switch(eye){
            case 1:
            Bill.addItem("Fees of Dr.Ronok Adhikari","--","5421",750);
            break;
            case 2:
            Bill.addItem("Fees of  Dr.Debojit Poddar","--","8541",900);
            break;
            case 3:
            Bill.addItem("Fees of  Dr.Tania Banik ","--","7412",600);
            break;
            case 4:
            Bill.addItem("Fees of  Dr.Snehasis Mallick ","--","3215",500);
            break;  
            case 5:
           Bill.addItem("Fees of   Dr.Smith Bera ","--","3215",800);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        }
    }while(eye>5);
        System.out.println("Enter Medicine Charge :");
        int medicine=sc.nextInt();
         Bill.addItem("Medicine Charge","--","4521",medicine);
        System.out.println("Yes : Other Expences");
        System.out.println("No : No Other Expences");
        System.out.println("Enter Choice :");
        String ot=sc.next();
        if(ot.equalsIgnoreCase("Yes")){
            do{
            System.out.println("\fOTHER EXPENCES :");
            System.out.println("1: ICU           1000/- per day ");
            System.out.println("2: OT Charge     ");
            System.out.println("3: Ventilation   200/- per hour");
            System.out.println("4: Blood Test    ");
            System.out.println("5: Surgery");
            System.out.println("0: Exit");
            ex=sc.nextInt();
            switch(ex){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter OT Charge");
            day=sc.nextInt();
            Bill.addItem("OT Charge","--","7211",day);
            break;
            case 3:
            System.out.println("Enter the number of hours");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("Ventilation Charge",day+"","7211",billday);
            break;
            case 4:
            System.out.println("Enter Charge");
            day=sc.nextInt();
            Bill.addItem("Blood Test","--","8731",day);
            break;  
            case 5:
            System.out.println("Enter Surgery Charge :");
            surgery=sc.nextInt();
            Bill.addItem("Surgey Charge","--","4135",surgery);
            break;
            case 0:
            System.out.println("THANK YOU !!!");
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
          }
         }while(ex>5 || ex!=0);
        }
    }
    void accident(){
        p.input();
        int bed=0;
      int day=0,billday=0,surgery=0,ex=0;
      String test="";
    // Addmission fee bill
      do{
      System.out.println("\f Enter Bed Type :");
      System.out.println(" 1.ICU             : 1000/- per day");
      System.out.println(" 2.Normal Bed      : 200/- per day");
      System.out.println(" 3.Private AC Room : 600/- per day");
      System.out.println(" 4.Private Non-AC Room : 500/- per day");
      bed=sc.nextInt();
      switch(bed){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
             Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*200;
             Bill.addItem("General Bed Charge",day+"","8462",billday);
            break;
            case 3:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*600;
             Bill.addItem("Private AC Room Bed Charge",day+"","1242",billday);
            break;
            case 4:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*500;
            Bill.addItem("Private Non-AC Room Bed Charge",day+"","3216",billday);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        }
    }while(bed>4);
    int Accident=0;
    do{
        System.out.println("\f Select Doctor of Accident and Emergency Department ");
        System.out.println(" 1: Dr.Tushar Saha         [V.TIME : 11:00 to 13:30]  Fee:700/- ");
        System.out.println(" 2: Dr.Sudipta Roy         [V.TIME : 10:00 to 12:00]  Fee:800/- ");
        System.out.println(" 3: Dr.Ronoy Chakraborty   [V.TIME : 13:00 to 15:30]  Fee:600/- ");
        System.out.println(" 4: Dr.Parha Biswas        [V.TIME : 08:00 to 12:30]  Fee:500/- ");
        System.out.println(" 5: Dr.Sandip Das          [V.TIME : 10:00 to 12:00]  Fee:1200/- ");
        Accident=sc.nextInt();
        switch(Accident){
            case 1:
            Bill.addItem("Fees of Dr.Tushar Saha","--","5421",700);
            break;
            case 2:
            Bill.addItem("Fees of Dr.Sudipta Roy","--","7854",800);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Ronoy Chakraborty","--","7412",600);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Parha Biswas","--","2546",500);
            break; 
            case 5:
            Bill.addItem("Fees of Dr.Sandip Das","--","9513",1200);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        } 
    }while(Accident>5);
    System.out.println("Enter Medicine Charge :");
        int medicine=sc.nextInt();
        Bill.addItem("Medicine Charge","--","4521",medicine);
        System.out.println("Yes : Other Expences");
        System.out.println("No : No Other Expences");
        System.out.println("Enter Choice :");
        String ot=sc.next();
        if(ot.equalsIgnoreCase("Yes")){
            do{
            System.out.println("\f OTHER EXPENCES :");
            System.out.println("1: ICU           1000/- per day ");
            System.out.println("2: OT Charge     ");
            System.out.println("3: Ventilation   200/- per hour");
            System.out.println("4: Blood Test    ");
            System.out.println("5: Surgery");
            System.out.println("6: X-Ray");
            System.out.println("0: Exit");
            ex=sc.nextInt();
            switch(ex){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
             Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter OT Charge");
            day=sc.nextInt();
            Bill.addItem("OT Charge","--","7854",day);
            break;
            case 3:
            System.out.println("Enter the number of hours");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("Ventilation Charge",day+"","4319",billday);
            break;
            case 4:
            
            System.out.println("Enter Charge");
            day=sc.nextInt();
            Bill.addItem("Blood Test","--","8731",day);
            break;  
            case 5:
            System.out.println("Enter Surgery Charge :");
            surgery=sc.nextInt();
            Bill.addItem("Surgey Charge","--","4135",surgery);
            break;
            case 6:
            System.out.println("Enter X-Ray Charge :");
            surgery=sc.nextInt();
            Bill.addItem("X-Ray Charge","--","7532",surgery);
            break;
            case 0:
            System.out.println("THANK YOU !!!");
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
          }
         }while(ex>6 || ex!=0);
        }
    }
    void Gynaecology(){
        p.input();
         int bed=0;
      int day=0,billday=0,surgery=0,ex=0;
      String test="";
    // Addmission fee bill
      do{
      System.out.println("\f Enter Bed Type :");
      System.out.println(" 1.ICU             : 1000/- per day");
      System.out.println(" 2.Normal Bed      : 200/- per day");
      System.out.println(" 3.Private AC Room : 600/- per day");
      System.out.println(" 4.Private Non-AC Room : 500/- per day");
      bed=sc.nextInt();
      switch(bed){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*200;
            Bill.addItem("General Bed Charge",day+"","9156",billday);
            break;
            case 3:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*600;
            Bill.addItem("Private AC Room Bed Charge",day+"","3256",billday);
            break;
            case 4:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*500;
            Bill.addItem("Private Non-AC Room Bed Charge",day+"","7854",billday);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        }
    }while(bed>4);
    int Gynaco=0;
    do{
        System.out.println("\fEnter the Name of the Doctor of the particular Department Gynaecology");
        System.out.println(" 1: Dr.Anushka Saha     [V.TIME : 10:00 to 12:30]  Fee:800/- ");
        System.out.println(" 2: Dr.Sumita Arora     [V.TIME : 08:00 to 13:30]  Fee:600/- ");
        System.out.println(" 3: Dr.Tonmoy Bannerjee [V.TIME : 14:00 to 16:30]  Fee:950/- ");
        System.out.println(" 4: Dr.Arijit Singh     [V.TIME : 15:00 to 17:30]  Fee:1000/- ");
        System.out.println(" 5: Dr.Milind Gaba      [V.TIME : 11:00 to 13:30]  Fee:500/- ");
        Gynaco=sc.nextInt();
        switch(Gynaco){
            case 1:
             Bill.addItem("Fees of Dr.Anushka Saha","--","5421",800);
            break;
            case 2:
            Bill.addItem("Fees of Dr.Sumita Arora","--","8462",600);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Tonmoy Bannerjee","--","6428",950);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Arijit Singh","--","1234",1000);
            break; 
            case 5:
            Bill.addItem("Fees of Dr.Milind Gaba","--","7896",500);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        }
    }while(Gynaco>5);
        System.out.println("Enter Medicine Charge :");
        int medicine=sc.nextInt();
         Bill.addItem("Medicine Charge","--","4521",medicine);
        System.out.println("Yes : Other Expences");
        System.out.println("No : No Other Expences");
        System.out.println("Enter Choice :");
        String ot=sc.next();
        if(ot.equalsIgnoreCase("Yes")){
            do{
            System.out.println("\f OTHER EXPENCES :");
            System.out.println("1: ICU           1000/- per day ");
            System.out.println("2: OT Charge     ");
            System.out.println("3: Ventilation   200/- per hour");
            System.out.println("4: Blood Test    ");
            System.out.println("5: Surgery");
            System.out.println("6: X-Ray");
            System.out.println("7: Mammography   800/-");
            System.out.println("0: Exit");
            ex=sc.nextInt();
            switch(ex){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter OT Charge");
            day=sc.nextInt();
            Bill.addItem("OT Charge","--","7854",day);
            break;
            case 3:
            System.out.println("Enter the number of hours");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("Ventilation Charge",day+"","1256",billday);
            break;
            case 4:
            System.out.println("Enter Charge");
            day=sc.nextInt();
            Bill.addItem("Blood Test","--","8731",day);
            break;  
            case 5:
            System.out.println("Enter Surgery Charge :");
            surgery=sc.nextInt();
            Bill.addItem("Surgery Charge","--","7532",surgery);
            break;
            case 6:
            System.out.println("Enter X-Ray Charge :");
            surgery=sc.nextInt();
            Bill.addItem("X-Ray Charge","--","8524",surgery);
            break;
            case 7:
            Bill.addItem("Mammography","--","9631",800);
            break;
            case 0:
            System.out.println("THANK YOU !!!");
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
          }
         }while(ex>7 || ex!=0);
        }
    }
    void cardiology(){
        p.input();
        int bed=0;
      int day=0,billday=0,surgery=0,ex=0;
      String test="";
    // Addmission fee bill
      do{
      System.out.println("\f Enter Bed Type :");
      System.out.println(" 1.ICU             : 1000/- per day");
      System.out.println(" 2.Normal Bed      : 200/- per day");
      System.out.println(" 3.Private AC Room : 600/- per day");
      System.out.println(" 4.Private Non-AC Room : 500/- per day");
      bed=sc.nextInt();
      switch(bed){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*200;
            Bill.addItem("General Bed Charge",day+"","7211",billday);
            break;
            case 3:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*600;
            Bill.addItem("Private AC Room Bed Charge",day+"","7211",billday);
            break;
            case 4:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*500;
            Bill.addItem("Private Non-AC Room Bed Charge",day+"","7211",billday);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        }
    }while(bed>4);
    int Cardio=0;
    do{
        System.out.println("\fEnter the Name of the Doctor of the particular Department Cardiology");
        System.out.println(" 1: Dr.Randi Orton  [V.TIME : 10:00 to 12:30]  Fee:1000/- ");
        System.out.println(" 2: Dr.John Cena    [V.TIME : 07:00 to 13:30]  Fee:800/- ");
        System.out.println(" 3: Dr.Brock Lesner [V.TIME : 14:00 to 16:00]  Fee:900/- ");
        System.out.println(" 4: Dr.Dean Ambrose [V.TIME : 14:00 to 18:30]  Fee:600/- ");
        System.out.println(" 5: Dr.Jinder Mahal [V.TIME : 10:00 to 14:30]  Fee:500/- ");
        Cardio=sc.nextInt();
        switch(Cardio){
            case 1:
            Bill.addItem("Fees of Dr.Randi Orton","--","6524",1000);
            break;
            case 2:
            Bill.addItem("Fees of Dr.John Cena","--","7896",800);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Brock Lesner","--","3645",900);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Dean Ambrose","--","8467",600);
            break; 
            case 5:
            Bill.addItem("Fees of Dr.Jinder Mahal","--","7538",500);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        } 
    }while(Cardio>5);
    System.out.println("Enter Medicine Charge :");
        int medicine=sc.nextInt();
       Bill.addItem("Medicine Charge","--","4521",medicine);
        System.out.println("Yes : Other Expences");
        System.out.println("No : No Other Expences");
        System.out.println("Enter Choice :");
        String ot=sc.next();
        if(ot.equalsIgnoreCase("Yes")){
            do{
            System.out.println("\f OTHER EXPENCES :");
            System.out.println("1: ICU                 1000/- per day ");
            System.out.println("2: OT Charge          ");
            System.out.println("3: Ventilation         200/- per hour");
            System.out.println("4: Blood Test          ");
            System.out.println("5: Surgery");
            System.out.println("6: X-Ray");
            System.out.println("7: Echocardiology      1000/-");
            System.out.println("8: Cardiac Stress Test 900/-");
            System.out.println("0: Exit");
            ex=sc.nextInt();
            switch(ex){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter OT Charge");
            day=sc.nextInt();
            Bill.addItem("OT Charge","--","7854",day);
            break;
            case 3:
            System.out.println("Enter the number of hours");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("Ventilation Charge",day+"","1546",billday);
            break;
            case 4:
            System.out.println("Enter Charge");
            day=sc.nextInt();
            Bill.addItem("Blood Test","--","8731",day);
            break;  
            case 5:
            System.out.println("Enter Surgery Charge :");
            surgery=sc.nextInt();
            Bill.addItem("Surgery Charge","--","7532",surgery);
            break;
            case 6:
            System.out.println("Enter X-Ray Charge :");
            surgery=sc.nextInt();
            Bill.addItem("X-Ray Charge","--","9813",surgery);
            break;
            case 7:
             Bill.addItem("EchoCardiology Charge","--","6517",1000);
            break;
            case 8:
            Bill.addItem("Cardiac Stress Charge","--","8591",1000);
            break;
            case 0:
            System.out.println("THANK YOU !!!");
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
          }
         }while(ex>8 || ex!=0);
        }
    }
    void ENT_Specialist(){
        p.input();
         int bed=0;
      int day=0,billday=0,surgery=0,ex=0;
      String test="";
    // Addmission fee bill
      do{
      System.out.println("\f Enter Bed Type :");
      System.out.println(" 1.ICU             : 1000/- per day");
      System.out.println(" 2.Normal Bed      : 200/- per day");
      System.out.println(" 3.Private AC Room : 600/- per day");
      System.out.println(" 4.Private Non-AC Room : 500/- per day");
      bed=sc.nextInt();
      switch(bed){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*200;
            Bill.addItem("General Bed Charge",day+"","7412",billday);
            break;
            case 3:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*600;
            Bill.addItem("Private AC Room Bed Charge",day+"","9654",billday);
            break;
            case 4:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*500;
            Bill.addItem("Private Non-AC Room Bed Charge",day+"","2146",billday);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        }
    }while(bed>4);
    int Ent=0;
    do{
        System.out.println("\fEnter the Name of the Doctor of the particular Department ENT Specialist");
        System.out.println(" 1: Dr.Shagnik Bhattacharya [V.TIME : 18:00 to 20:30]  Fee:1000/- ");
        System.out.println(" 2: Dr.Hitler Ghosh         [V.TIME : 07:00 to 13:30]  Fee:900/- ");
        System.out.println(" 3: Dr.Mussolini Monk       [V.TIME : 14:00 to 16:00]  Fee:800/- ");
        System.out.println(" 4: Dr.Harry Potter         [V.TIME : 14:00 to 18:30]  Fee:700/- ");
        System.out.println(" 5: Dr.Ronald Wizely        [V.TIME : 10:00 to 14:30]  Fee:600/- ");
        Ent=sc.nextInt();
        switch(Ent){
            case 1:
            Bill.addItem("Fees of Dr.Shagnik Bhattacharya","--","4582",1000);
            break;
            case 2:
            Bill.addItem("Fees of Dr.Hitler Ghosh","--","6183",900);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Mussolini Monk","--","5379",800);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Harry Potter","--","8461",700);
            break; 
            case 5:
            Bill.addItem("Fees of Dr.Ronald Wizely","--","7538",600);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        } 
    }while(Ent>5);
    System.out.println("Enter Medicine Charge :");
        int medicine=sc.nextInt();
        Bill.addItem("Medicine Charge","--","4521",medicine);
        System.out.println("Yes : Other Expences");
        System.out.println("No : No Other Expences");
        System.out.println("Enter Choice :");
        String ot=sc.next();
        if(ot.equalsIgnoreCase("Yes")){
            do{
            System.out.println("\f OTHER EXPENCES :");
            System.out.println("1: ICU           1000/- per day ");
            System.out.println("2: OT Charge     ");
            System.out.println("3: Ventilation   200/- per hour");
            System.out.println("4: Blood Test    ");
            System.out.println("5: Surgery");
            System.out.println("6: X-Ray");
            System.out.println("0: Exit");
            ex=sc.nextInt();
            switch(ex){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter OT Charge");
            day=sc.nextInt();
            Bill.addItem("OT Charge","--","7854",day);
            break;
            case 3:
            System.out.println("Enter the number of hours");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("Ventilation Charge",day+"","7211",billday);
            break;
            case 4:
            System.out.println("Enter Charge");
            day=sc.nextInt();
            Bill.addItem("Blood Test","--","8731",day);
            break;  
            case 5:
            System.out.println("Enter Surgery Charge :");
            surgery=sc.nextInt();
            Bill.addItem("Surgery Charge","--","7211",surgery);
            break;
            case 6:
            System.out.println("Enter X-Ray Charge :");
            surgery=sc.nextInt();
            Bill.addItem("X-Ray Charge","--","5468",surgery);
            break;
            case 0:
            System.out.println("THANK YOU !!!");
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
          }
         }while(ex>6 || ex!=0);
        }
    }
    void Orthopadic(){
        p.input();
        int bed=0;
      int day=0,billday=0,surgery=0,ex=0;
      String test="";
    // Addmission fee bill
      do{
      System.out.println("\f Enter Bed Type :");
      System.out.println(" 1.ICU             : 1000/- per day");
      System.out.println(" 2.Normal Bed      : 200/- per day");
      System.out.println(" 3.Private AC Room : 600/- per day");
      System.out.println(" 4.Private Non-AC Room : 500/- per day");
      bed=sc.nextInt();
      switch(bed){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*200;
            Bill.addItem("General Bed Charge",day+"","6841",billday);
            break;
            case 3:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*600;
            Bill.addItem("Private AC Room Bed Charge",day+"","2486",billday);
            break;
            case 4:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*500;
            Bill.addItem("Private Non-AC Room Bed Charge",day+"","9648",billday);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        }
    }while(bed>4);
    int Ortho=0;
    do{
        System.out.println("\fEnter the Name of the Doctor of the particular Department Orthopadic");
        System.out.println(" 1: Dr.Hermine Granger      [V.TIME : 18:00 to 22:30]  Fee:1600/- ");
        System.out.println(" 2: Dr.Nevill Longbottom    [V.TIME : 07:00 to 14:30]  Fee:1800/- ");
        System.out.println(" 3: Dr.Albus Dumbledore     [V.TIME : 14:00 to 20:00]  Fee:1500/- ");
        System.out.println(" 4: Dr.Mcanoggle            [V.TIME : 14:00 to 19:30]  Fee:1000/- ");
        System.out.println(" 5: Dr.Serious Black        [V.TIME : 10:00 to 16:30]  Fee:1200/- ");
        Ortho=sc.nextInt();
        switch(Ortho){
            case 1:
            Bill.addItem("Fees of Dr.Hermine Granger","--","4582",1600);
            break;
            case 2:
            Bill.addItem("Fees of Dr.Nevill Longbottom","--","8716",1800);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Albus Dumbledore","--","3692",1500);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Mcanoggle","--","8484",1000);
            break; 
            case 5:
            Bill.addItem("Fees of Dr.Serious Black","--","7597",1200);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        } 
    }while(Ortho>5);
    System.out.println("Enter Medicine Charge :");
        int medicine=sc.nextInt();
       Bill.addItem("Medicine Charge","--","4521",medicine);
        System.out.println("Yes : Other Expences");
        System.out.println("No : No Other Expences");
        System.out.println("Enter Choice :");
        String ot=sc.next();
        if(ot.equalsIgnoreCase("Yes")){
            do{
            System.out.println("\f OTHER EXPENCES :");
            System.out.println("1: ICU           1000/- per day ");
            System.out.println("2: OT Charge     ");
            System.out.println("3: Ventilation   200/- per hour");
            System.out.println("4: Blood Test    ");
            System.out.println("5: Surgery");
            System.out.println("6: X-Ray");
            System.out.println("0: Exit");
            ex=sc.nextInt();
            switch(ex){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter OT Charge");
            day=sc.nextInt();
            Bill.addItem("OT Charge","--","7854",day);
            break;
            case 3:
            System.out.println("Enter the number of hours");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("Ventilation Charge",day+"","9462",billday);
            break;
            case 4:
            System.out.println("Enter Charge");
            day=sc.nextInt();
            Bill.addItem("Blood Test","--","8731",day);
            break;  
            case 5:
            System.out.println("Enter Surgery Charge :");
            surgery=sc.nextInt();
            Bill.addItem("Surgery Charge","--","7416",surgery);
            break;
            case 6:
            System.out.println("Enter X-Ray Charge :");
            surgery=sc.nextInt();
            Bill.addItem("X-Ray Charge","--","8619",surgery);
            break;
            case 0:
            System.out.println("THANK YOU !!!");
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
          }
         }while(ex>6 || ex!=0);
        }
    }
    void Child_Section(){
        p.input();
         int bed=0;
      int day=0,billday=0,surgery=0,ex=0;
      String test="";
    // Addmission fee bill
      do{
      System.out.println("\f Enter Bed Type :");
      System.out.println(" 1.ICU             : 1000/- per day");
      System.out.println(" 2.Normal Bed      : 200/- per day");
      System.out.println(" 3.Private AC Room : 600/- per day");
      System.out.println(" 4.Private Non-AC Room : 500/- per day");
      bed=sc.nextInt();
      switch(bed){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*200;
            Bill.addItem("General Bed Charge",day+"","7541",billday);
            break;
            case 3:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*600;
            Bill.addItem("Private AC Room Bed Charge",day+"","9536",billday);
            break;
            case 4:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*500;
            Bill.addItem("Private Non-AC Room Bed Charge",day+"","8945",billday);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        }
    }while(bed>4);
    int child=0;
    do{
        System.out.println("\fEnter the Name of the Doctor of the particular Department Child Section");
        System.out.println(" 1: Dr.Goldberg             [V.TIME : 06:00 to 12:30]  Fee:1600/- ");
        System.out.println(" 2: Dr.Jeff Hardy           [V.TIME : 09:00 to 14:30]  Fee:1800/- ");
        System.out.println(" 3: Dr.Matt Hardy           [V.TIME : 10:00 to 15:00]  Fee:1500/- ");
        System.out.println(" 4: Roman Reigns            [V.TIME : 18:00 to 22:30]  Fee:1000/- ");
        System.out.println(" 5: Dr.Seth Rollins         [V.TIME : 10:00 to 16:30]  Fee:1200/- ");
        child=sc.nextInt();
        switch(child){
            case 1:
            Bill.addItem("Fees of Dr.Goldberg","--","7597",1600);
            break;
            case 2:
           Bill.addItem("Fees of Dr.Jeff Hardy ","--","7846",1800);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Matt Hardy","--","3416",1500);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Roman Reings","--","8241",1000);
            break; 
            case 5:
            Bill.addItem("Fees of Dr.Seth Rollins","--","5242",1200);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        } 
    }while(child>5);
     System.out.println("Enter Medicine Charge :");
        int medicine=sc.nextInt();
        Bill.addItem("Medicine Charge","--","4521",medicine);
        System.out.println("Yes : Other Expences");
        System.out.println("No : No Other Expences");
        System.out.println("Enter Choice :");
        String ot=sc.next();
        if(ot.equalsIgnoreCase("Yes")){
            do{
            System.out.println("\f OTHER EXPENCES :");
            System.out.println("1: ICU           1000/- per day ");
            System.out.println("2: OT Charge     ");
            System.out.println("3: Ventilation   200/- per hour");
            System.out.println("4: Blood Test    ");
            System.out.println("5: Surgery");
            System.out.println("6: X-Ray");
            System.out.println("0: Exit");
            ex=sc.nextInt();
            switch(ex){
            case 1:
            System.out.println("Enter the number of days");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("ICU Bed Charge",day+"","7211",billday);
            break;
            case 2:
            System.out.println("Enter OT Charge");
            day=sc.nextInt();
            Bill.addItem("OT Charge","--","7854",day);
            break;
            case 3:
            System.out.println("Enter the number of hours");
            day=sc.nextInt();
            billday=(int)day*1000;
            Bill.addItem("Ventilation Charge",day+"","7211",billday);
            break;
            case 4:
            System.out.println("Enter Charge");
            day=sc.nextInt();
            Bill.addItem("Blood Test","--","8731",day);
            break;  
            case 5:
            System.out.println("Enter Surgery Charge :");
            surgery=sc.nextInt();
            Bill.addItem("Surgery",day+"","7849",billday);
            break;
            case 6:
            System.out.println("Enter X-Ray Charge :");
            surgery=sc.nextInt();
            Bill.addItem("X-Ray Bed Charge",day+"","7492",billday);
            break;
            case 0:
            System.out.println("THANK YOU !!!");
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
          }
         }while(ex>6 || ex!=0);
        }
    }
}