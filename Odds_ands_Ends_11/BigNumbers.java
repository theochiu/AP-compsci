
import acm.program.*;

public class BigNumbers extends ConsoleProgram
{

    public void run()
    {
        int num = Integer.MAX_VALUE-5;
        for (int i=0; i<10; i++)
        {
                println(num);
                num++;
        }
    }

}
