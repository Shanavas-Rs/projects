import java.util.*;
class Election{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] count = new int[1000];
         String[] names = new String[1000];
         System.out.println("######################################################");
         System.out.println("##        ENTER THE VOTES,ONE VOTE PER LINE         ##");
         System.out.println("##        END WITH EITHER -1 OR AN EMPTY LINE       ##");
         System.out.println("######################################################");
         int n=0,s,p=0,var=1,pos=0;
         String temp;
         while(var!=0)
         {
             temp = sc.nextLine();
             if(!temp.equals("-1"))
             {
                for(int i=0;i<10;i++)
                {
                    if(temp.equals(names[i]))
                    {
                     count[i]=count[i]+1;
                     p=1;
                    }
                }
                 if(p==0)
                 {
                    names[n]=temp;
                    count[n]=1;
                     n=n+1;
                 }p=0;
             }
             else{var=0;}
         }
         for(int i=0;i<n;i++)
         {
             System.out.println(names[i]+" recieved "+count[i]+" votes ");
         }
         System.out.println("-----------------------------------------------");
	     s=count[0];
         for(int i=1;i<n;i++)
         {
            if(s<count[i])
            {
			s=count[i];
			pos=i;
			}
          }
         System.out.println("The winner is "+names[pos]+" with "+count[pos]+" votes");
     }
 }