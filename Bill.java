class Bill
{
    static String item[];
    static String qnty[];      
    static String unit[];
    static int price_per_unit[];
    static int count;
    static String pat_name;
    static String pat_add;
    static String pat_pin;
    static String pat_phone;
    static int pat_age;
    static int pat_gen;
    
    /**
     * use to initialize  all class variable 
     *( This method should call once at the time of whole program execution. )
     */
    static void init()
    {
        item=new String[100]; 
        qnty=new String[100];
        unit=new String[100];
        price_per_unit=new int[100];
    }

    /**
     * TO add a bill item name and its quantity,unit,and price per unit 
     * which are provide as parameter from calling method. 
     */
    static void addItem(String itm,String qty,String unt,int price)
    {
        item[count]=itm;
        qnty[count]=qty;
        unit[count]=unt;
        price_per_unit[count]=price;
        count++;
    }
    
    static void add_patient_dtls(String pname,int age,int gen, String add,String pin,String ph){
    pat_name=pname;
    pat_age=age;
    pat_gen=gen;
    pat_add=add;
    pat_pin=pin;
    pat_phone=ph;
    }

    /**
     * Use to repeat a character(from argument) t time and return created string.
     */
    static String repeat(char c,int t)
    {
        String s="";
        for(int i=1;i<=t;i++)
            s+=c;
        return s;
    }
/**
 * Use to make string specified string size
 */
    static String print(String s,int size,char align)
    { 
        int d=size-s.length();
        if(align=='R' || align=='r')
            s=repeat(' ',d)+s;
        else if(align=='L' || align=='l')
            s+=repeat(' ',d);
        else 
        {
            s=repeat(' ',d-(d/2))+s;
            s+=repeat(' ',(d/2));
        }
        return s;
    }
/**
 * to show final bill
 */
    static void showBill()
    {
        System.out.println("\f*************************************************************************************************");
        System.out.println("*                                     SERVICES FOR                                              *");
        System.out.println("**************************************CITY HOSPITAL**********************************************");
        System.out.println("*                                     GOD BLESS YOU                                             *");
        System.out.println("*************************************************************************************************");
        System.out.println("Patient Name:"+pat_name+"   Age:"+pat_age+"   Gender:"+((pat_gen==1)?"Male":"Female"));
        System.out.println("Address:"+pat_add+" Pin:"+pat_pin);
        System.out.println("Mobile:"+pat_phone);
        int total=0;
        System.out.println(repeat('=',95));
        System.out.println(print("Description",50,'M')+" || "+print("Days/Hrs",10,'M')+" || "+print("Service Code",14,'M')+" || "+print("Price",9,'M'));
        System.out.println(repeat('=',95));
        for(int i=0;i<count;i++)
        {
            System.out.println(print(item[i],50,'L')+" || "+print(qnty[i],9,'M')+" || "+print(unit[i],13,'L')+" || "+print(price_per_unit[i]+" /-",9,'R'));
            total+=(price_per_unit[i]);
        }
        System.out.println(repeat('=',95));
        System.out.println(print("Total",85,'M')+print(Integer.toString(total)+" /-",10,'R'));
        System.out.println(repeat('=',95));
    }
}
