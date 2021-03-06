
import acm.program.*;
import acm.graphics.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MountainPathFinder extends GraphicsProgram
{
	private TopologicalMap mountainMap;

	private JButton loadButton;
	private JButton drawButton;
	private JButton findPathButton;
	private JTextField fileNameField;
	private JTextField rowsField, colsField, distanceField, elevationChangeField;

	private String distancetext = "           ";
	private String elevationtext = "           ";

	public void init()
	{
		setSize(960, 560);
		setTitle("Mountain Path Finder");
		initGUI();
	}

	public void run()
	{
		addActionListeners();
		while (true){
			elevationChangeField.setText(elevationtext);
			distanceField .setText(distancetext);
		}
	}

	private void initGUI()
	{
		// you'll do this in task #0
		JLabel filelabel = new JLabel("File name: ");
		add(filelabel,NORTH);
		fileNameField = new JTextField("Colorado_480x480.txt");
		add(fileNameField, NORTH);
		JLabel sizeLabel = new JLabel("Map size:");
		add(sizeLabel, NORTH);
		rowsField = new JTextField("480");
		add(rowsField, NORTH);
		JLabel xLabel = new JLabel("X");
		add(xLabel, NORTH);
		colsField = new JTextField("480");
		add(colsField, NORTH);
		loadButton = new JButton("Load File");
		add(loadButton, NORTH);
		drawButton = new JButton("Draw Map");
		drawButton.setEnabled(false);
		add(drawButton, NORTH);
		findPathButton = new JButton("Find Path");
		findPathButton.setEnabled(false);
		add(findPathButton, NORTH);

		//extension
		JLabel distancelabel = new JLabel("Total distance covered:");
		add(distancelabel,SOUTH);

		distanceField = new JTextField("           ");
		add(distanceField,SOUTH);

		JLabel elevationlabel = new JLabel("Total change in elevation:");
		add(elevationlabel,SOUTH);

		elevationChangeField = new JTextField("           ");
		add(elevationChangeField,SOUTH);

	}

	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == loadButton)
			handleLoadButton();
		// more to do here eventually
		if (event.getSource() == drawButton)
			handleDrawButton();
		if (event.getSource() == findPathButton)
			handlePathButton();
	}

	private void handleDrawButton(){
		mountainMap.drawMap(this);
		findPathButton.setEnabled(true);
	}

	private void handlePathButton(){

		//testing
		//mountainMap.drawLowestElevPath(this,300,Color.RED);
//		mountainMap.getIndexOfLowestElevPath(this);
		// extention p2
		double y= mountainMap.getIndexOfLowestElevPath(this);
		double x = mountainMap.getTotalDistance();

		distancetext = x+"";
		elevationtext = y+"";

		System.out.println(x+"\n"+y);

	//	distanceField.setText(x+"");
	//	elevationChangeField.setText(y+"");

	}

	private void handleLoadButton()
	{
		// you'll do this in task #2
		removeAll();
		mountainMap = new TopologicalMap(fileNameField.getText(), 
							Integer.parseInt(rowsField.getText()), 
							Integer.parseInt(colsField.getText()));
		if(mountainMap.isValid()){
			JOptionPane.showMessageDialog(null,"The map data loaded succesfully");
			drawButton.setEnabled(true);

		}else{
			JOptionPane.showMessageDialog(null,"Something went wrong loading the map data");
		}
	}




}
