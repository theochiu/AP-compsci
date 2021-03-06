// Copyright 2016, Theodore Chiu, All rights reserved. 


import stanford.karel.*;

public class CleanStairs extends Karel
{

	public void run()
	{	// finds stairs
		while (frontIsClear()){
			move();
		}
		while (!frontIsClear()){
			turnLeft();
			move();
			turnRight();
			move();
			pickBeeper();
		}
	}

	public void turnRight(){
		for(int i=0;i<3;i++){
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
