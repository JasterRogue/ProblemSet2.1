import javax.swing.*;
import java.awt.Font;

public class MyFlicks {

    public  static void main(String[] args)
    {
        //Film m = new Film();
        Film movie = new Film();
        Film catalog[] = new Film[10];
        String mov="";
        JTextArea textArea = new JTextArea(12,30);
        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(textAreaFont);

        for(int i=0;i<catalog.length;i++)
        {
        	Film m = new Film(); //moved this here from above, this is vital so that you're creating
        	                     //a new Film object each time the loop iterates
        	                     //otherwise you have a logical error as you just keep overwriting the same one
            mov = (JOptionPane.showInputDialog("Enter movie title"));
            
            if(mov.equals(""))
                break; 
                
            m.setTitle(mov);
            m.setDirector(JOptionPane.showInputDialog("Enter movie director"));
            m.setDuration(Integer.parseInt(JOptionPane.showInputDialog("Enter film duration")));
            catalog[i] = m;
            movie.numberOfFilms++;
        }

        textArea.append("Number of Films: " + movie.getNumberOfFilms() + "\n");

        for(int i=0;i<catalog.length;i++)
        {
        	if(catalog[i]==null) //check against null here, if this slot of the array is null then
        	                     //it stores no Film object and we can just exit the loop
                break;
        	
            textArea.append("\nFilm: " + catalog[i].getTitle() +
                            "\nDirector: " + catalog[i].getDirector() +
                            "\nDuration: " + catalog[i].getDuration() + "\n\n");

            
        }

        JOptionPane.showMessageDialog(null,textArea);
       // displayFilms(catalog);
    }

    /*public void displayFilms(Film[] catalog)
    {


    }*/
}
