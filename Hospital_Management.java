import java.util.*;
class Hospital_Management {
 void indoor_outdoor(){
     Scanner sc=new Scanner(System.in);
     System.out.println("\f***********************************************************************************************************************************");
     System.out.println("************************************************* Hospital Management System *******************************************************");
     System.out.println("************************************************************************************************************************************");
     System.out.println();
     System.out.println();
     System.out.println("************************************************************************************************************************************");
     System.out.println("*********************************************************CITY HOSPITAL**************************************************************");
     System.out.println("************************************************************************************************************************************");
     System.out.println();
     System.out.println();
     System.out.println();
     int n=0;
     do{
     System.out.println("Enter Choice");
     System.out.println("1: TO ADMIT THE PATIENT");
     System.out.println("2: TO VISIT OUTDOOR");
     n=sc.nextInt();
     switch(n){
         case 1:
         Admission ad=new Admission();
         ad.Show_dpt();
         break;
         case 2:
         Outdoor out=new Outdoor();
         out.showDptList();
         break;
         default:
         System.out.println("Sorry! Invalid Input");
         System.out.println("Please Try Again");
        }
    }while(n>2 || n<1);
       }
}