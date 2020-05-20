
package benimsorum;
// Huseyin Muhammed
//   180541616
//Benim sorum su :
// eleman otomasiyonu 
// bu calisan elmanlar birisi aylik bir maas alirken degeri saata gore aliyor;
// boyle bir otomasyon nasil yapilir ?? 
// ozellikler : isim , soyisim , dogumgunu , telefon numarasi , mail adresi , meslegi ,çalışan Sıralaması  ,Maaş,Bouns,kesinti , kaç saat calıstını , saat ucreti 
/// ne is yapmali bu otomasyon : bilgileri gosteme , maas hesaplama , bilgileri kaydetme
/// 
////
//////


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class benimsorum {
    private static Employee employee ; 
    private static HourlyEmployee hourlyemployee ;
    private static   Employee p1;
    private static int yesno ; 
    private static String name;
    private static String surname ; 
    private static String birthday ;
    private static String mail;
    private static String numberphone ;
    private static String  job  ;    
    private static String rank ;        
    private static int workinghours ;
    private static float hoursrate ;
    private static float salary ;
    private static float deduction ;
    private static float bouns ; 
            
    public static void main(String[] args) {
       
    setinto();
       
        p1 = new Employee();
        p1.setName("Fatih");
        p1.setSurname("Hocam");
        p1.setBirth_day("Seviyorum");
        p1.setMail("Sizi");
        p1.showalldata();
        System.out.println("//////////////////");
        saveinto();
        
        try{
        employee.showalldata();
        
           }
          catch(Exception e){
            System.out.println("An invalid value was entered");
          
        }
        
    }
    
    private static void  setinto(){
    
    Scanner input = new Scanner(System.in);
        System.out.println("If you are HourlyEmployee press 1 else press 0");
        try{
            yesno = input.nextShort();
            if(yesno==1||yesno==0){
                try{
                    if(yesno==1){
                        
                        System.out.println("Please write the information");
                        System.out.println(".........");
                        
                        
                        
                        System.out.println("What is HourlyEmployee`s Name");
                         name = input.next();
                     
                        
                        System.out.println("What is HourlyEmployee`s Sur-Name");
                         surname = input.next();
                        
                        System.out.println("What is HourlyEmployee`s BirtDay dd/mm/yyy");
                           birthday = input.next();
          
                        System.out.println("What is HourlyEmployee`s E-mail");
                          mail = input.next();
                        
                        System.out.println("What is HourlyEmployee`s Number Phone +xx-xxx-xxx-xxxx");
                         numberphone = input.next();
                      
                        
                        System.out.println("What is HourlyEmployee`s Job");
                             job = input.next();
                        
                        
                        System.out.println("What is HourlyEmployee`s Rank");
                         rank = input.next();
                      
                        System.out.println("What is HourlyEmployee`s Working Hours");
                             workinghours = input.nextInt();
                        
                        
                        System.out.println("What is HourlyEmployee`s Hours Rate");
                         hoursrate = input.nextFloat();

                     hourlyemployee = new HourlyEmployee(name,surname,birthday,mail,numberphone,job,rank,workinghours,hoursrate);
                    
                    }
                    else{
                        System.out.println("Please write the information");
                        System.out.println(".........");
                        
                        
                        
                        System.out.println("What is Employee`s Name");
                         name = input.next();
                     
                        
                        System.out.println("What is Employee`s Sur-Name");
                         surname = input.next();
                        
                        System.out.println("What is Employee`s BirtDay dd/mm/yyy");
                         birthday = input.next();
          
                        System.out.println("What is Employee`s E-mail");
                         mail = input.next();
                        
                        System.out.println("What is Employee`s Number Phone +xx-xxx-xxx-xxxx");
                         numberphone = input.next();
                      
                        
                        System.out.println("What is Employee`s Job");
                         job = input.next();
                        
                        
                        System.out.println("What is Employee`s Rank");
                         rank = input.next();
                        
                        
                        System.out.println("What is Employee`s Salary");
                         salary = input.nextFloat();
                        
                        
                        System.out.println("What is Employee`s Deduction");
                         deduction = input.nextFloat();
                        
                        System.out.println("What is Employee`s Bouns");
                         bouns = input.nextFloat();
                         employee = new Employee(name,surname,birthday,mail,numberphone,job,rank,salary,deduction,bouns);
                    }
                    }
                catch(Exception e){
            System.out.println("An invalid value was entered");
          
        }
                    
            }
            else{System.out.println("An invalid value was entered");}
        }
        catch(Exception e){
            System.out.println("An invalid value was entered");
          
        }
    
    
    }
    private static void saveinto(){
String into = null ; 
        if(yesno==1){
into = "Name-Surname : "+name+"-"+surname+"\n"+"BirthDay : "+birthday+"\n"+"E-mail : "+mail+"\n"+"Number Phone : "+numberphone+"\n"+"Job : "+job+"\n"+"Rank : "+rank+"\n"+"Working Hours : "+workinghours+"\n"+"Hours Rate : "+hoursrate+"\n"+"Salary : "+hourlyemployee.getSalary();
        }
        else if(yesno==0){
        
          into = "Name-Surname : "+name+"-"+surname+"\n"+"BirthDay : "+birthday+"\n"+"E-mail : "+mail+"\n"+"Number Phone : "+numberphone+"\n"+"Job : "+job+"\n"+"Rank : "+rank+"\n"+"Salary : "+salary+"\n"+"Deduction :"+deduction+"\n"+"Bouns : "+bouns+"\n"+"Final Salary : "+employee.getFinalsalary();
        
        }
        
 
    File fileger = new File ("D:\\","Employee");
    fileger.mkdir();
    String url = name+" "+surname+".txt";

    File file=new File("D:/Employee/"+url);   
    
 
    
    
      
        try 
        {

             
           FileOutputStream dosya=new FileOutputStream(file);
           //FileOutputStream dosya=new FileOutputStream(file,true);
            dosya.write(into.getBytes());
            dosya.flush();
            dosya.close();
            System.out.println("Kayidedildi");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }                
  
    }
    ///////////////////////////// end main class
    //////////////////////////////////////////////////
    ////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    
}
   class Employee {
   private String name ; 
   private String surname ; 
   private String birth_day;
   private String mail ; 
   private String number_phone;
   private String job;
   private String rank;
   private float salary ;
   private float deduction ; 
   private float bouns ; 
   private float finalsalary;
   
   
   
   Employee(String name,String surname, String birth_day,String mail,String number_phone,String job ,String rank , float salary ,float deduction , float bouns){
   this.name = name;
   this.surname = surname;
   this.birth_day = birth_day;
   this.mail = mail;
   this.number_phone = number_phone;
   this.job = job;
   this.rank = rank;
   this.salary = salary;
   this.deduction = deduction ;
   this.bouns = bouns ; 
   this.finalsalary = getfinalsalary();
  
   }  
   Employee(){
    this.name = "The Name was not entered";
    this.surname = "The Sur-Name was not entered";
    this.birth_day = "The Birth Day was not entered";
    this.mail = "The E-mail was not entered";
    this.number_phone = "The Number Phone was not entered";
    this.number_phone = "The Number Phone was not entered";
    this.number_phone = "The Number Phone was not entered";
    this.job = "The Job was not entered";
    this.rank = "The Rank was not entered";
    this.salary = 0;
    this.deduction=0;
    this.bouns =0;
    this.finalsalary = getfinalsalary() ; 
    
   
    
    
    
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getBirth_day() {
        return birth_day;
    }
    public String getMail() {
        return mail;
    }
    public String getNumber_phone() {
        return number_phone;
    }
    public String getJob() {
        return job;
    }
    public String getRank() {
        return rank;
    }
    public float getSalary() {
        return salary;
    }
    public float getDeduction() {
        return deduction;
    }
    public float getBouns() {
        return bouns;
    }
    public float getFinalsalary() {
        return getfinalsalary();
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public void setNumber_phone(String number_phone) {
        this.number_phone = number_phone;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void setDeduction(float deduction) {
        this.deduction = deduction;
    }
    public void setBouns(float bouns) {
        this.bouns = bouns;
    }
    public void showalldata(){
    
        System.out.println("Name : "+name);
        System.out.println("Sur-Name : "+surname);
        System.out.println("Birth Day : "+birth_day);
        System.out.println("E-mail : "+mail);
        System.out.println("Number Phone : "+number_phone);
        System.out.println("Job : "+job);
        System.out.println("Rank : "+rank);
        System.out.println("Salary : "+salary+"$");
        System.out.println("Deduction : "+deduction+"$");
        System.out.println("Bouns : "+bouns+"$");
        System.out.println("Final salary : "+getfinalsalary());
    
    
    }
    private float getfinalsalary(){
    return salary+bouns-deduction ;
    }
    ///////////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    //////////// employee class end /////////////////////////////////////////////
    ////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    
  //sub-class
   }
class HourlyEmployee extends Employee {

private int working_hours ;
private float hours_rate;


HourlyEmployee(String name,String surname, String birth_day,String mail,String number_phone,String job ,String rank ,int working_hours,float hours_rate ){
this.working_hours = working_hours;
this.hours_rate =hours_rate ; 
this.setName(name);
this.setSurname(surname);
this.setBirth_day(birth_day);
this.setMail(mail);
this.setNumber_phone(number_phone);
this.setJob(job);
this.setRank(rank);


}
HourlyEmployee(){

this.working_hours = 0;
this.hours_rate = 0 ;

}
    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }
    public void setHours_rate(float hours_rate) {
        this.hours_rate = hours_rate;
    }
    public int getWorking_hours() {
        return working_hours;
    }
    public float getHours_rate() {
        return hours_rate;
    }
@Override
    public float getSalary() {
        return working_hours* hours_rate;
    } 
@Override
    public void showalldata(){
        System.out.println("Name : "+getName());
        System.out.println("Sur-Name : "+getSurname());
        System.out.println("Birth Day : "+getBirth_day());
        System.out.println("E-mail : "+getMail());
        System.out.println("Number Phone : "+getNumber_phone());
        System.out.println("Job : "+getJob());
        System.out.println("Rank : "+getRank());
        System.out.println("Working Hours : "+working_hours);
        System.out.println("Hours Rate : "+hours_rate);
        System.out.println("Salary : "+getSalary()+"$");

    
    }
}


    
