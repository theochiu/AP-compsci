// Copyright Theodore Chiu 2016, All rights reserved 

import stanford.karel.*;

public class RepairQuad extends Karel
{

	public void run()
	{
		while (frontisClear()){
			repairColumn();
			moveNext();
		}
	}

	public void moveNext(){
		for (int i=0;i<4;i++){
			move();
		}
	}

	public void repairColumn(){
		ascendFix();
		// goes up fixing the column
		turnAround();
		descend();
	}

	public void turnAround(){
		turnLeft();
		turnLeft();
	}

	public void descend(){
		
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
