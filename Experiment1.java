
package javafx;
import java.io.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.stage.*;

public class Experiment17 extends Application 
{
 @Override 
 public void start(Stage primaryStage) throws FileNotFoundException 
 {
  
  GridPane pane = new GridPane();
  Image img;
  ImageView img_view;
  for (int i = 0; i < 3; i++) 
  {
   for (int j = 0; j < 3; j++) 
   {
    int n = (int)(Math.random() * 2);
      if(n==0)
      {
          FileInputStream fin = new FileInputStream("E:/Vishal/savan/cllge/4 sem/javafx practical photos/O.png"); 
          img = new Image(fin);
          img_view = new ImageView(img);
          
          pane.add(img_view, j, i);
      }
      else if(n == 1)
      {
          FileInputStream fin = new FileInputStream("E:/Vishal/savan/cllge/4 sem/javafx practical photos/X.png"); 
          img = new Image(fin);
          img_view = new ImageView(img);
          
          pane.add(img_view, j, i);
      }
      else
          continue;
   }
  }

  Scene scene = new Scene(pane, 250, 250);
  primaryStage.setTitle("Tic-Tac-Toe Board"); 
  primaryStage.setScene(scene); 
  primaryStage.show(); 
 }
	public static void main(String[] args){
		launch(args);
	}
}