
package javafx;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.shape.*;

public class Experiment18_1 extends Application {
   
   // Label response;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    //override starrt method
    public void start(Stage myStage) {
       
        //pane 
        BorderPane pane = new BorderPane();
      //  pane.setPadding(new Insets(30,30,30,30));
        
        //create circle
        Circle circle = new Circle();
        
        //circle size
        circle.setCenterX(300);
        circle.setCenterY(300);
        circle.setRadius(50);
        
        //add to the scene
        pane.getChildren().add(circle);
        
        //moving circle
        pane.setOnKeyPressed(e -> {
           switch(e.getCode()) {
               case UP : circle.setCenterY(circle.getCenterY()> circle.getRadius()? circle.getCenterY() - 15 : circle.getCenterY());
               break;
               
               case DOWN : circle.setCenterY(circle.getCenterY()< pane.getHeight() - circle.getRadius()? circle.getCenterY() + 15 : circle.getCenterY());
               break;
               
               case LEFT : circle.setCenterX(circle.getCenterX()> circle.getRadius()? circle.getCenterX() - 15 : circle.getCenterX());
               break;
               
               case RIGHT : circle.setCenterX(circle.getCenterX()< pane.getWidth()- circle.getRadius()? circle.getCenterX() + 15 : circle.getCenterX());
               break;
           }
        });
        
        
        //border pane for moving cicle using button
       // BorderPane bp = new BorderPane();
      //  bp.setPadding(new Insets(30,30,30,30));
     
        //creating button //set position of button
        
        Button btntop = new Button("TOP");
        pane.setTop(btntop);
        Button btnbottom = new Button("BOTTOM");
       pane.setBottom(btnbottom);
        Button btnleft = new Button("LEFT");
       pane.setLeft(btnleft);
        Button btnright = new Button("RIGHT");
       pane.setRight(btnright);
       
        
    /*
        //add button
        bp.getChildren().addAll(btntop,btnbottom,btnleft,btnright);
        //handle the action events
        bp.setOnAction(new EventHandler<ActionEVent>() {
        
        });
        
      */ 
    /*
      pane.getChildren().add(btntop);
     pane.getChildren().add(btnbottom);
     pane.getChildren().add(btnleft);
      pane.getChildren().add(btnright);
      */
        btntop.setOnAction(e -> circle.setCenterY(circle.getCenterY() - 10));
        btnbottom.setOnAction(e -> circle.setCenterY(circle.getCenterY() + 10));
        btnleft.setOnAction(e -> circle.setCenterX(circle.getCenterX() - 10));
        btnright.setOnAction(e -> circle.setCenterX(circle.getCenterX() + 10));
       
      
        
    //create scene  
          Scene myScene = new Scene(pane,500,500);
          
           //title
        myStage.setTitle("Moving Circle");
        
          //create scene on stage
          myStage.setScene(myScene);
          
          //show
          myStage.show();
          
          //request
          pane.requestFocus();
          //bp.requestFocus();
    }
}