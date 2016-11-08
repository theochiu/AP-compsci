import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments 
	 */
	public Picture ()
	{
		/* not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor 
		 */
		super();  
	}

	/**
	 * Constructor that takes a file name and creates the picture 
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName)
	{
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * @param height the height of the desired picture
	 * @param width the width of the desired picture
	 */
	public Picture(int height, int width)
	{
		// let the parent class handle this width and height
		super(width,height);
	}

	/**
	 * Constructor that takes a picture and creates a 
	 * copy of that picture
	 * @param copyPicture the picture to copy
	 */
	public Picture(Picture copyPicture)
	{
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * @param image the buffered image to use
	 */
	public Picture(BufferedImage image)
	{
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * @return a string with information about the picture such as fileName,
	 * height and width.
	 */
	public String toString()
	{
		String output = "Picture, filename " + getFileName() + 
			" height " + getHeight() 
			+ " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue()
	{
		Pixel[] pixels = getPixels();

		for (Pixel pixel : pixels)
		{
			pixel.setBlue(0);
		}

	}

	public void maxGreen()
	{
		Pixel[] pixels = getPixels();

		for (Pixel pixel : pixels)
		{
			pixel.setGreen(255);
		}

	}

	public void greyscale(){
		Pixel[] pixels = getPixels();

		for (Pixel[] pixels : pixels) {
			int a = (pixel.getBlue() + pixel.getRed() + pixel.getGreen())/3
		}
	}
	
	public void solveGold()
	{
		Pixel[] pixels = getPixels();

		for (Pixel pixel : pixels)
		{
			pixel.setBlue(0);
						pixel.setGreen(0);
						pixel.setRed(pixel.getRed()*10);
		}
	}

	/* Main method for testing - each class in Java can have a main 
	 * method 
	 */
	public static void main(String[] args) 
	{
		Picture beach = new Picture("images/" + "beach.jpg");
		beach.explore();
		//beach.zeroBlue();
		beach.explore();
		//beach.maxGreen();
	}

} // this } is the end of class Picture, put all new methods before this
