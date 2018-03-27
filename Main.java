import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) {
		ArrayList<Player> seasons = new ArrayList<Player>();	
		TextFileInput reader = new TextFileInput("BoxInfo.txt");
		String line;
			 while((line = reader.readLine() ) != null){
				 System.out.println(line);
		    		StringTokenizer copyLine = new StringTokenizer(line, ",	");//Separates each line whenever it sees a space which is its delimiter,and that becomes the first token, there would be three tokens.
		    		String season = copyLine.nextToken();
		    		String age = (copyLine.nextToken());
		    		String team = copyLine.nextToken();
		    		String league = copyLine.nextToken();
		    		String position = copyLine.nextToken();;
		    		int gamesPlayed = Integer.parseInt(copyLine.nextToken());
		    		int gamesStarted = Integer.parseInt(copyLine.nextToken());
		    		double offensiveReboundsPerGame = Double.parseDouble(copyLine.nextToken());
		    		double defensiveReboundsPerGame = Double.parseDouble(copyLine.nextToken());
		    		double totalRebounds = Double.parseDouble(copyLine.nextToken());
		    		double assistsPerGame = Double.parseDouble(copyLine.nextToken());
		    		double steals = Double.parseDouble(copyLine.nextToken());
		    		double blocks = Double.parseDouble(copyLine.nextToken());
		    		double turnovers = Double.parseDouble(copyLine.nextToken());
		    		double personalFouls = Double.parseDouble(copyLine.nextToken());
		    		double pointsPerGame = Double.parseDouble(copyLine.nextToken());
		    		Player obj = new Player( season, age,  team, league, position, gamesPlayed, gamesStarted, offensiveReboundsPerGame,
		    		  defensiveReboundsPerGame,
		    			totalRebounds,
		    			  assistsPerGame,
		    			 steals,
		    			 blocks,
		    			  turnovers,
		    			  personalFouls,
		    			  pointsPerGame);//Create an object of the Player class calling the Player constructor sending in parameters from the file.
		    		seasons.add(obj); //add the object we just created to the players list
		     
		    		
		    }
		}catch( IOException e) {
			e.printStackTrace();
		}
	   
	

	   

	    	PlayerGUI gui = new PlayerGUI("Top Offensive/Defensive NBA Season for Dwyane Wade", 1600,1600,seasons);
	  }
}
