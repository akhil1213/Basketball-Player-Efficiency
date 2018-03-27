import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PlayerGUI extends JFrame{  
	ArrayList<Player> seasons = new ArrayList<Player>();	
	private JTextArea bestOffensive, bestDefensive;//JTextArea class is in javax.swing
	public PlayerGUI(String title, int height, int width, ArrayList<Player> seasons) {
		setTitle(title);
		setSize(height,width);
		this.seasons = seasons;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when you press the x on the gui it automatically terminates the program, without this the program will keep running
		setLocationRelativeTo(null);//this jframe doesnt have a parent, this is setting its location to the whole window
		components();
		setVisible(true);
	}
	private void components() {
		setLayout(new GridLayout(1,2));//makes one row two columns 
		
		bestOffensive = new JTextArea();// creates a new jtextarea which is an object and extends from javax.swing
		bestOffensive.setBackground(Color.blue);
		bestOffensive.setFont(new Font(Font.DIALOG, Font.BOLD, 13));
		bestOffensive.setBorder(BorderFactory.createLineBorder(Color.black));
		selectionSortOffensive(seasons);
		for(int i = 0; i < seasons.size(); i++) {
			bestOffensive.append(seasons.get(i).offensiveToString() + "\n"); //You must add an end line or else the line would be to wide and wouldn't fit in the gui
		}

		add(bestOffensive);//adds the text areas to the grid layout, add comes with the extension of JFrame
		selectionSortDefensive(seasons); //Since your sorting a bunch of objects its permanent, therefore, you don't need to assign this to an array. Arrays are pass by reference, not by value
		bestDefensive = new JTextArea();
		bestDefensive.setBackground(Color.green);
		bestDefensive.setFont(new Font(Font.DIALOG, Font.BOLD, 13));
		bestDefensive.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		for(int i = 0; i < seasons.size(); i++) {
			bestDefensive.append(seasons.get(i).defensiveToString() + "\n");
		}
		add(bestDefensive);
	}
	 
	private static void selectionSortOffensive (ArrayList <Player> seasons) { //always need to remember the generic which in this case is <box> any type your throwing it in a function as a parameter
		int length = seasons.size();
		for ( int i = 0; i < length - 1; i++ ) { 
			int indexLowest = i; 
					for ( int j = i + 1; j < length; j++ ) 
						if ( seasons.get(j).offensiveEfficiency() > seasons.get(indexLowest).offensiveEfficiency()) {
									indexLowest = j;
						}
					if ( seasons.get(indexLowest).offensiveEfficiency() == (seasons.get(i).offensiveEfficiency()) != true ) { //if they arent equal then you must swap them, if they are there isn't a point on swapping them
						Player temp = seasons.get(indexLowest);//temperary object is set equal to the object with the bigger offensive efficiency
						seasons.set(indexLowest,seasons.get(i)); //setting the indexlowest object in set with the smaller offensive efficiency
						seasons.set(i,temp); //now setting i to become the better offensive efficiency season
					}	  
		} 
	} 


	private static void selectionSortDefensive (ArrayList <Player> seasons) { //always need to remember the generic which in this case is <box> any type your throwing it in a function as a parameter
		int length = seasons.size();
		for ( int i = 0; i < length - 1; i++ ) { 
			int indexLowest = i; 
					for ( int j = i + 1; j < length; j++ ) 
						if ( seasons.get(j).defensiveEfficiency() > seasons.get(indexLowest).defensiveEfficiency()) {
									indexLowest = j;
						}
					if ( seasons.get(indexLowest).defensiveEfficiency() == (seasons.get(i).defensiveEfficiency()) != true ) { //if they arent equal then you must swap them, if they are there isn't a point on swapping them
						Player temp = seasons.get(indexLowest);//temperary object is set equal to the object with the bigger offensive efficiency
						seasons.set(indexLowest,seasons.get(i)); //setting the indexlowest object in set with the smaller offensive efficiency
						seasons.set(i,temp); //now setting i to become the better offensive efficiency season
					}	  
			} 
		} 
	}




