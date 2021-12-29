import java.util.*;
class Product{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
	int ip=0,sa=0,hu=0,op=0,s=0;
	 while(s==0){
        System.out.println("*********************PRODUCTS********************\n"); 
         System.out.println("1. IPHONE :-$1000\n2. SAMSUNG :-$750\n3. HUWAEI :-$500\n4. OPPO :-$250\n5. EXIT");
          System.out.println("ENTER YOUR CHOICE :");
          int choice = sc.nextInt();
          switch (choice)
          {
              case 1:
                   System.out.println("ENTER THE QUANTITY TO BUY :");
                   int temp=sc.nextInt();
                   ip=ip+temp;
                   break;
            case 2:
                   System.out.println("ENTER THE QUANTITY TO BUY :");
                    temp=sc.nextInt();
                   sa=sa+temp;
                   break;
            case 3:
                   System.out.println("ENTER THE QUANTITY TO BUY :");
                   temp=sc.nextInt();
                   hu=hu+temp;
                   break;
            case 4:
                   System.out.println("ENTER THE QUANTITY TO BUY :");
                   temp=sc.nextInt();
                   op=op+temp;
                   break;
            case 5:
                    s=1;break;
           }}
          int sum;
                    sum=ip*1000+sa*750+hu*500+op*250;
                     System.out.println("THE TOTAL AMMOUNT =$"+sum);
    }
   
    
}