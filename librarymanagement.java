import java.lang.*;
import java.util.*;

class LibraryManagement
{
   Scanner sc=new Scanner(System.in);
   //Global Declaration Part
   int n=10,i=0;
String[] book={"C Programming","Data Structure","Operating System","Unix","Management","Business Law","EVS"," Algorithms","Data Mining","Computer Networks"};
          String author[]={"Brian W Kernighan","A K Sharma","Silberschatz","P.G.M.Bach","H.Koontz","M.Kuchhal","R.Bhatia","T.H.Cormen","Jiawei Han","D.J.Wetherall"};
         
     
          int accno[]={5679,7591,7670,4333,1438,5737,2133,3614,7588,8848};
          int availstock[]={50,40,45,60,78,56,38,48,55,52};

          String name[]={"Rahul Mishra","David Sharma","Smith Kumar","Neha Gupta","Aastha Dey","Sachin Mehta","Rohan Mehra","Harsh Prasad","Isha Sahu ","James Paul"};
          String branch[]={"BCA","MCA","BBA","BCA","BCA","MBA","BCA","BBA","BBA","MCA"};
          String roll[]={"BCA/40067/22","MCA/40521/22","BBA/41067/22","BCA/40007/22","BCA/40045/22","MBA/41530/22","BCA/40001/22","BBA/41037/22","BBA/41002/22","MCA/40567/22"};
          String addr[]={"Kolkata","Bihar","U.P","M.P","Odisha","Delhi","Goa","Punjab","Haryana","Mumbai"};
          int ticket[]={45,36,67,90,86,83,66,44,65,35};
          int max[]={2,2,0,1,1,1,2,0,2,1};
         
         
   public void book_stock()
   {
      System.out.println("Details of Book Stocks!!");
      System.out.println("Title of Book\t\tAuthir of Book\tPublisher of Book\tAccount no.\tAvailable Sock");
      for(i=0;i<n;i++)
      {
         System.out.println(book[i]+"\t\t"+author[i]+"\t\t"+accno[i]+"\t"+availstock[i]+"\n");
      }
     
   }
   public void user_info()
   {
      System.out.println("Details of Registered User Information!!");
      System.out.println("Name\t\tBranch\tRoll no.\t\tAddress\tTicket No.\tMaximum Book Borrowed");
      for(i=0;i<n;i++)
      {
         System.out.println(name[i]+"\t"+branch[i]+"\t"+roll[i]+"\t\t"+addr[i]+"\t\t"+ticket[i]+"\t\t"+max[i]+"\n");
      }
   }
   public void avail_book1()
   {
      Scanner sc=new Scanner(System.in);
      int acc;
      System.out.println("Enter book account no.");
      acc=sc.nextInt();
      for(i=0;i<n;i++)
      {
          if(acc==accno[i] && availstock[i]>=0)
          {
              System.out.println("Book is Available");
              availstock[i]=availstock[i]-1;
              max[i]=max[i]-1;
          }
          else
              System.out.println("Out of Stock!!");
       }
       
   }
   public void avail_book2()
   {
       Scanner sc=new Scanner(System.in);
       int acc1,acc2;
       System.out.println("Enter book account no.-1");
       acc1=sc.nextInt();
       System.out.println("Enter book account no.-2");
       acc2=sc.nextInt();
       for(i=0;i<n;i++)
       {
           if(acc1==accno[i] && availstock[i]>=0)
           {
               System.out.println("Book is Available");
               availstock[i]=availstock[i]-1;
               max[i]=max[i]-2;
           }
           else
               System.out.println("Out of Stock!!");
           if(acc2==accno[i] && availstock[i]>=0)
           {
               System.out.println("Book is Available");
               availstock[i]=availstock[i]-1;
               max[i]=max[i]-2;
           }
           else
               System.out.println("Out of Stock!!");
        }
       
   }
   public void book_borrow_status()
   {
      Scanner sc=new Scanner(System.in);
      int tic,ch;
      String date="";
      System.out.println("Enter Ticket No.:");
      tic=sc.nextInt();
      for(i=0;i<n;i++)
      {
         if(tic==ticket[i])
         {
            if(max[i]>=2)
               System.out.println("Already Borrowed 2 Book!!");
            else
            {
               if(max[i]==0)
               {
                  System.out.println("Press 1 to borrow 1 book & Press 2 to borrow 2 book");
                  ch=sc.nextInt();
                  switch(ch)
                  {
                     case 1:avail_book1();
                            break;
                     case 2:avail_book2();
                            break;
                     default:System.out.println("Invalid Choice!!");
                   }
               }
               else
               {    
                   System.out.println("Only 1 Book can be borrowed!!");
                   avail_book1();
               }
               System.out.println("See the Updated Information of User!!");
               user_info();
               System.out.println("Enter Issued Date in the format dd-mm-yyyy:");
               date=sc.nextLine();
               System.out.println("Return book after 14 days from the issued date!!");
               System.out.println("Otherwise fine will be calculated!!");
               System.out.println("First 5 days Rs.10, next 5 days Rs.20 and afterwards Rs. 30");
            }
         }
      }
   }
   public void fine_calc()
   {
      Scanner sc=new Scanner(System.in);
      int days;
      System.out.println("Enter no. of days book borrowed:");
      days=sc.nextInt();
      if(days<=14)
         System.out.println("No Fine Calculation!!");
      else if(days>=15 && days<=19)
         System.out.println("Fine = Rs. "+(days-14)*10);
      else if(days>=20 && days<=24)
         System.out.println("Fine = Rs. "+((5*10)+((days-19)*20)));
      else
         System.out.println("Fine = Rs. "+((5*10)+(5*20)+((days-24)*30)));
   }
   public static void main(String args[])
   {
         
 
          String[] book={"The C Programming Language","Data Structure Using C","Operating System Concepts","Design of the Unix OperatingSystems","fshjk","ghgh","ghhj","mj","fg","ggj"};
          String author[]={"Brian W Kernighan","A K Sharma","Avi Silberschatz","Peter Galvin Maurice Bach","fdjm","hjfgb","ilo","ghjo","dfdsf","gdf"};
         
          String publisher[]={"djk","hdjdk","hjgs","hjsjj","ksjh","jhkh","gjh","dfdvfvs","dffgf","hdhjd"};
          int accno[]={5679,7591,7670,4333,1438,5737,2133,3614,7588,8848};
          int availstock[]={50,40,45,60,78,56,38,48,55,52};

          String name[]={"A","B","C","D","E","F","G","H","I","J"};
          String branch[]={"BCA","MCA","BBA","BCA","BCA","MBA","BCA","BBA","BBA","MCA"};
          String roll[]={"BCA/40067/22","MCA/40521/22","BBA/41067/22","BCA/40007/22","BCA/40045/22","MBA/41530/22","BCA/40001/22","BBA/41037/22","BBA/41002/22","MCA/40567/22"};
          String addr[]={"ghg","ghg","hfh","dhj","dgf","fgh","dfdgh","dsdd","ddas","sfd"};
          int ticket[]={45,36,67,90,86,83,66,44,65,35};
          int max[]={2,2,0,1,1,1,2,0,2,1};
         
          LibraryManagement obj=new LibraryManagement();
          obj.book_stock();
          obj.user_info();
          obj.book_borrow_status();
          obj.fine_calc();
   }
}
