import java.util.*;
class Outdoor {
    int ch_dpt=0,ch_doc=0,ch_card=0,ch_ent=0,ch_oro=0,ch_eye=0;
    Patient p ;
    Scanner sc;
    void showDptList(){
        p=new Patient();
        do{
        System.out.println("\f Select Department ");
        System.out.println(" 1:Accident and Emergency ");
        System.out.println(" 2:Cardiology ");
        System.out.println(" 3:ENT Specialist ");
        System.out.println(" 4:Orthopadic ");
        System.out.println(" 5:Eye Specialist ");
        System.out.println(" 6:Child Section ");
        System.out.println(" 7:Gynaecology ");
        sc=new Scanner(System.in);
        ch_dpt=sc.nextInt();
            switch(ch_dpt){
                case 1: 
                medicine();
                break;
                case 2: 
                cardiologist();
                break;
                case 3:
                ENT_Specialist();
                break;
                case 4:
                Orthopadic();
                break;
                case 5:
                Eye_Specialist();
                break;
                case 6:
                Child_Section();
                break;
                case 7:
                Gynaecology();
                break;
                default :
                System.out.println(" Please Enter any number to select Department");
                System.out.println(" Enter [ Zero ] for EXIT ");
            }
        }while((ch_dpt!=0 && ch_dpt<1) || ch_dpt>8);
    }
        void Gynaecology(){
        p.input();
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
            Bill.addItem("Fees of Dr.Anushka Saha","--","4582",800);
            break;
            case 2:
            Bill.addItem("Fees of Dr.Sumita Arora","--","8749",600);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Tonmay Bannerjee","--","4918",950);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Arijit Shing","--","6482",1000);
            break; 
            case 5:
            Bill.addItem("Fees of Dr.Milind Gaba","--","5825",500);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        } 
    }while(Gynaco>5);
    }
void Child_Section(){
        int child=0;
        p.input();
        do{
        System.out.println("\fEnter the Name of the Doctor of the particular Department Child Section");
        System.out.println(" 1: Dr.Goldberg             [V.TIME : 06:00 to 12:30]  Fee:1600/- ");
        System.out.println(" 2: Dr.Jeff Hardy           [V.TIME : 09:00 to 14:30]  Fee:1800/- ");
        System.out.println(" 3: Dr.Matt Hardy           [V.TIME : 10:00 to 15:00]  Fee:1500/- ");
        System.out.println(" 4: Dr.Roman Reigns            [V.TIME : 18:00 to 22:30]  Fee:1000/- ");
        System.out.println(" 5: Dr.Seth Rollins         [V.TIME : 10:00 to 16:30]  Fee:1200/- ");
        child=sc.nextInt();
        switch(child){
            case 1:
            Bill.addItem("Fees of Dr.Goldberg","--","5846",1600);
            break;
            case 2:
            Bill.addItem("Fees of Dr.Jeff Hardy","--","4582",1800);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Matt Hardy","--","7948",1500);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Roman Reigns","--","8452",1000);
            break; 
            case 5:
            Bill.addItem("Fees of Dr.Seth Rollins","--","1542",1200);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        } 
    }while(child>5);
    }
    void medicine(){
        p.input();
        do{
        System.out.println("\f Select Doctor of Accident and Emergency Department ");
        System.out.println(" 1: Dr.Tushar Saha         [V.TIME : 11:00 to 13:30]  Fee:700/- ");
        System.out.println(" 2: Dr.Sudipta Roy         [V.TIME : 10:00 to 12:00]  Fee:800/- ");
        System.out.println(" 3: Dr.Ronoy Chakraborty   [V.TIME : 13:00 to 15:30]  Fee:600/- ");
        System.out.println(" 4: Dr.Parha Biswas        [V.TIME : 08:00 to 12:30]  Fee:500/- ");
        System.out.println(" 5: Dr.Sandip Das          [V.TIME : 10:00 to 12:00]  Fee:1200/- ");
        ch_doc=sc.nextInt();
        switch(ch_doc){
            case 1:
            Bill.addItem("Fees of Dr.Tushar Saha","--","6826",700);
            break;
            case 2:
            Bill.addItem("Fees of Dr.Sudipta Roy","--","4582",800);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Ronoy Chakraborty","--","8799",600);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Shagnik Bhattacharya","--","5599",500);
            break; 
            case 5:
            Bill.addItem("Fees of Dr.Sandip Das","--","9898",1200);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        } 
    }while(ch_doc>5);
    }
    void cardiologist()
    {
        p.input();
        do{
      System.out.println("\f Select Doctor of Cardiology Department ");  
      System.out.println(" 1: Dr.Ramadhan Mishra   [V.TIME : 14:00 to 16:30]  Fee:1000/- ");
      System.out.println(" 2: Dr.Mohorshi Dayanand [V.TIME : 16:00 to 19:30]  Fee:600/- ");
      System.out.println(" 3: Dr.Sudhir Basak      [V.TIME : 10:15 to 12:30]  Fee:1200/- ");
      System.out.println(" 4: Dr.Sneha Shing       [V.TIME : 09:00 to 13:30]  Fee:400/- ");
      System.out.println(" 5: Dr.Tanmoy Sengupta   [V.TIME : 11:00 to 12:00]  Fee:800/- ");
      ch_card=sc.nextInt();
      switch(ch_card){
            case 1:
            Bill.addItem("Fees of Dr.Ramadhan Mishra","--","4582",1000);
            break;
            case 2:
            Bill.addItem("Fees of Dr.Moharshi Dayanand","--","5544",600);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Sudhir Basak","--","8789",1200);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Shena Shing","--","3333",400);
            break;  
            case 5:
            Bill.addItem("Fees of Dr.Tonmoy Sengupta","--","6666",800);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        } 
    }while(ch_card>5);
    }
    void ENT_Specialist()
    {
        p.input();
        do{
       System.out.println("\f Select Doctor of ENT_Specialist Department ");  
      System.out.println(" 1: Dr.Srikant Manik  [V.TIME : 12:00 to 14:30]  Fee:550/- ");
      System.out.println(" 2: Dr.Varun Gupta    [V.TIME : 08:00 to 10:30]  Fee:650/- ");
      System.out.println(" 3: Dr.Bhaswar Das    [V.TIME : 19:15 to 22:30]  Fee:520/- ");
      System.out.println(" 4: Dr.Sayan Basak    [V.TIME : 06:00 to 12:00]  Fee:800/- ");
      System.out.println(" 5: Dr.Ayush Jaiswal  [V.TIME : 18:00 to 22:00]  Fee:1500/- ");
      ch_ent=sc.nextInt();
      switch(ch_ent){
            case 1:
            Bill.addItem("Fees of Dr.Srikant Manik","--","9896",550);
            break;
            case 2:
            Bill.addItem("Fees of Dr.Varun Gupta","--","6635",650);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Bhaswar Das","--","2122",520);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Sayan Basak","--","9887",800);
            break;  
            case 5:
            Bill.addItem("Fees of Dr.Ayush Jaiswal","--","1595",1500);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        } 
     }while(ch_ent>5);
    }

    void Orthopadic()
    {
        p.input();
        do{
      System.out.println("\f Select Doctor of Orthopadic Department ");  
      System.out.println(" 1: Dr.Sanjib Basu        [V.TIME : 09:00 to 12:00]  Fee:850/- ");
      System.out.println(" 2: Dr.Debasis Das        [V.TIME : 12:00 to 14:00]  Fee:700/- ");
      System.out.println(" 3: Dr.Ritesh Gupta       [V.TIME : 18:00 to 22:00]  Fee:500/- ");
      System.out.println(" 4: Dr.Sayanton Majumder  [V.TIME : 06:00 to 10:30]  Fee:600/- ");
      System.out.println(" 5: Dr.Govind Jaiswal     [V.TIME : 16:00 to 18:00]  Fee:900/- ");
      ch_oro=sc.nextInt();
      switch(ch_oro){
            case 1:
            Bill.addItem("Fees of Dr.Sanjib Basu","--","4512",850);
            break;
            case 2:
            Bill.addItem("Fees of Dr.Debasis Das","--","8588",700);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Ritesh Gupta","--","6546",500);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Sayantan Mojumdar","--","3213",600);
            break;  
            case 5:
            Bill.addItem("Fees of Dr.Govind Jaiswal","--","9639",900);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        } 
     }while(ch_oro>5);
    }
    void Eye_Specialist(){
        p.input();
        do{
       System.out.println("\f Select Doctor of Eye Specialist Department ");  
      System.out.println(" 1: Dr.Ronok Adhikari     [V.TIME : 16:00 to 20:00]  Fee:750/- ");
      System.out.println(" 2: Dr.Debojit Poddar     [V.TIME : 18:00 to 21:00]  Fee:900/- ");
      System.out.println(" 3: Dr.Tania Banik        [V.TIME : 14:00 to 16:00]  Fee:600/- ");
      System.out.println(" 4: Dr.Snehasis Mallick   [V.TIME : 06:00 to 14:30]  Fee:500/- ");
      System.out.println(" 5: Dr.Smith Bera         [V.TIME : 16:00 to 22:00]  Fee:800/- ");
      ch_eye=sc.nextInt();
      switch(ch_eye){
            case 1:
            Bill.addItem("Fees of Dr.Ronoy Adhikari","--","9686",750);
            break;
            case 2:
            Bill.addItem("Fees of Dr.Debojit Poddar","--","4545",900);
            break;
            case 3:
            Bill.addItem("Fees of Dr.Tania Banik","--","1212",600);
            break;
            case 4:
            Bill.addItem("Fees of Dr.Shagnik Bhattacharya","--","1221",500);
            break;  
            case 5:
            Bill.addItem("Fees of Dr.Snehasis Mallick","--","4251",800);
            break;
            default:
            System.out.println("Wrong Choice Entered!!! Please try again");
        } 
    }while(ch_eye>5);
    }
}