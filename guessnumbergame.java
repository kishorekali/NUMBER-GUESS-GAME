import java.util.*;

public class Guessnumbergame
{
	public static void main(String[] args) {
		int radom=(int)(Math.random()*100+1);
		Scanner s=new Scanner(System.in);
		int count=1,usrno;
		while(count<6)
		{
		    System.out.println("Guess Number between 1-100:");
		    usrno=s.nextInt();
		    if(usrno<0||usrno>100) System.out.println("Invalid!!");
		    else if(usrno==radom) 
		    {
		        System.out.println("Congrats");
		        break;
		    }
		    else if (usrno>radom) System.out.println("Guess is larger Try again!!");
		    else System.out.println("Guess is smaller Try again!!");
		    count++;
		}
		switch(count){
		    case 6: 
		        System.out.println("Game over");
		        break;
		    default: 
		        System.out.println("you got "+(6-count)+" STARS");
		}
	}
}