import java.util.*;
class PasswordChecking
{
	public static void main(String[] args) throws InterruptedException
	 {
		Scanner sc = new Scanner(System.in);

		int attempt = 1;
		outerloop:
		for(; ;) 
		{
			int storedPin = 123;
			int count = 3;
			
			do{
				System.out.print("Enter your pin:");
				int userPin = sc.nextInt();
				if(userPin==storedPin)
				{
					System.out.println("WELCOME");
					break outerloop;
				}else 
				{
					System.out.println("Wrong pin Attempts left" +(count-1));
					System.out.println(count);
				}
			if (count ==1)
			{
				Thread.sleep(5000);
				System.out.println("you can try to enter your pin again");
			}
			count--;
		}
		       while(count>=1);

		if(attempt++==2)
		{
			break;
		}

		}
	}
}