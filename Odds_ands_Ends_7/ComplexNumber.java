

public class ComplexNumber
{
	private double realPart;
	private double imagPart;

	public ComplexNumber(double realPart, double imagPart)
	{
		this.realPart = realPart;
		this.imagPart = imagPart;
	}
	
	public CommplexNumber squared(){
		return this.multiply(this);
	}
	
	public ComplexNumber add(ComplexNumber other)
	{
		double realResult = this.realPart + other.realPart;
		double imagResult = this.imagPart + other.imagPart;

		return new ComplexNumber(realResult, imagResult);
	}
	
	public ComplexNumber multiply(ComplexNumber other)
	{
		double realResult = this.realPart*other.realPart - this.imagPart*other.imagPart;
		double imagResult = this.realPart*other.imagPart + this.imagPart*other.realPart;
		return new ComplexNumber(realResult, imagResult);
	}
	
	public String toString()
	{
		return this.realPart + " + " + this.imagPart + "i";
	}


}
