
import stanford.karel.*;

public class MailToChair extends Karel
{

	public void run()
	{
		move();
		turnLeft();
		move();
		turnRight();
		move();
		pickBeeper();
		turnLeft();
		turnLeft();
		for (int i=0;i<3;i++){
			move();
		}
		putBeeper();
		turnLeft();
		turnLeft();
		move();
		turnRight();
		move();
		turnLeft();
	}

	public void turnRight(){
		for (int i=0; i<3; i++){
			turnLeft();
		}
	}

	/* IGNORE THE CODE BELOW.  (Don't delete it, but we
	 * had to include it to get Karel to play nicely with
	 * BlueJ.  You don't need to understand what it means
	 * at all.  */
	public static void launchKarelEnvironment()
	{
		String[] args = new String[1];
		String name = new SecurityManager() {
			public String className() 
				{return this.getClassContext()[1].getCanonicalName();}
			}.className();
		args[0] = "code=" + name;         
		Karel.main(args);
	}
}


