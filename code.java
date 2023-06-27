
package ps;
import java.util.Scanner;
import java.util.Random;
 


public class game2 {


	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
   Random random = new Random();
   System.out.println("computer is  choosing");
  
   int round =0;
   int user_win=0;
    int com_win=0;
  while(round <5) {
   System.out.println("choose the number according to the value "+"\n1 for ROCK "+"\n2 for SCISSOR"+"\n3 for PAPER" );
   int u = s.nextInt();
   if(u>0&u<4) {
   int x = random.nextInt(1,4);

   System.out.println("the computer chooosen value is :");
   
       switch(x) {
       case 1: System.out.println(x+":ROCK");
        if (u ==1 ) { 
        
 
	    System.out.println(" no one wins ");
 }  
        else if(u==2) 
        {
	    
        com_win++;
        System.out.println("computer wins"); 
        }
     else 
     { user_win++;
    
    System.out.println("user wins");
     }
	 
break;
        case 2: System.out.println(x+":SCISSOR");
       if (u ==1 ) { user_win++;

System.out.println(" user wins ");
} 
       else if(u==2) 
       {
	  
       System.out.println(" no one wins");

}
else  
    { 
    com_win++;
     System.out.println("computer wins");
     }
break;

     case 3: System.out.println(x +":paper");
     if(u ==1)
     { 
       com_win++; 
	  System.out.println(" computer wins ");
} 
     else if(u==2) 
     {
	 user_win++;
System.out.println(" user wins");

     }
else  
{ user_win=0;
  com_win=0;
   System. out.println("no one wins");
}
break;
       	  
       }round++;}}
       System.out.println("the total game won by user is :"+user_win);
       System.out.println("the total game won by computer is :"+com_win);
       if (user_win<com_win) {
    	   System.out.println("computer won the game");
       }	  
       else if(user_win>com_win) {
    	   System.out.println("user won the game");
       }else {
    	   System.out.println("the game is tied");
    		   
    	   }

       

  s.close();
  }}
