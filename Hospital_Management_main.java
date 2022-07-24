class Hospital_Management_main {
 public static void main(String args[]){
     try{
     Hospital_Management hm=new Hospital_Management();
     Bill.init();
     hm.indoor_outdoor();
     Bill.showBill();
    }catch(Exception e){
        System.out.println("Wrong Entered!!!\nError Occur :"+e.getMessage());
    }
     finally{
         System.out.println("***************************************************************************************************************");
         System.out.println("*********************************************** THANK YOU******************************************************");
         System.out.println("***************************************************************************************************************");
        }
    }
}