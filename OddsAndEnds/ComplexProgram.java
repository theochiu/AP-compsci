
import acm.program.*;

public class ComplexProgram extends ConsoleProgram
{

	public void run(){
		ComplexNumber a = new ComplexNumber(3,4);
		ComplexNumber b = new ComplexNumber(-2,5);
		ComplexNumber c = a.add(b);
		ComplexNumber d = a.multiply(b);
		ComplexNumber e = a.squared();

		println(a.toString());
		println(b.toString());
		println(c.toString());
		println(d.toString());
		println(e.toString());
		println(f.toString());

	}


}
