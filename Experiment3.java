
package javafx;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
public class Experiment19 extends Application {
    
    public void start(Stage myStage) {
        Circle circle = new Circle(25,25,25);
        circle.setFill(Color.BLACK);
        Text text = new Text(500,100, "Click mouse to change color");
        
        //handle mouse event
        
        circle.setOnMousePressed(e -> {
            circle.setFill(Color.RED);
        });
        
        circle.setOnMouseReleased(e -> {
            circle.setFill(Color.BLUE);
        });
        
          circle.setOnMouseDragged(e -> {
            circle.setCenterX(e.getX());
            circle.setCenterY(e.getY());
        });
       
        
        Group root = new Group(circle,text);
        
        Scene scene = new Scene(root,300,200);
        myStage.setScene(scene);
        myStage.setTitle("Mouse Clicked Color Changed");
        myStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}
