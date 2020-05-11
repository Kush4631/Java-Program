
package javafx;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Experiment20 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Text text = new Text(100,100,"Moving left to right and changing color ");
    
    public void start(Stage myStage) 
    {
        //adding left right button
        HBox LRButtons = new HBox(20);
        Button left = new Button("LEFT");
        Button right = new Button("RIGHT");
        
        LRButtons.getChildren().addAll(left,right);
        
         HBox RadioButtons = new HBox(20);
         RadioButton red = new RadioButton("Red");
         RadioButton blue = new RadioButton("Blue");
         RadioButton green = new RadioButton("Green");
        
         RadioButtons.getChildren().addAll(red,blue,green);
        
        //set together
        ToggleGroup group = new ToggleGroup();
        red.setToggleGroup(group);
        blue.setToggleGroup(group);
        green.setToggleGroup(group);
        
        Pane panetext = new Pane();
        panetext.getChildren().add(text);
        
        BorderPane bpane= new BorderPane();
        bpane.setCenter(panetext);
        bpane.setBottom(RadioButtons);
        bpane.setLeft(left);
        bpane.setRight(right);
        //handle events
        left.setOnAction(e -> text.setX(text.getY()-100));
        right.setOnAction(e -> text.setX(text.getY()+100));
        
        //color set handle
        red.setOnAction(e -> {
            if(red.isSelected())
            {
                text.setFill(Color.RED);
            }
        });
        
        blue.setOnAction(e -> {
            if(blue.isSelected())
            {
                text.setFill(Color.BLUE);
            }
        });
        
        green.setOnAction(e -> {
            if(green.isSelected())
            {
                text.setFill(Color.GREEN);
            }
        });
        
        Scene scene = new Scene(bpane,400,400);
        myStage.setScene(scene);
        myStage.setTitle("Moving Text and Changing Color");
        myStage.show();
    }
}
