package chapter14;
	/* Write a program that displays a rectanguloid. The cube should grow and shrink as 
	   the window grows or shrinks. */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise_Fourteen extends Application {

	double paneWidth = 200;
    double paneHeight = 200;
    double width = paneWidth * 0.90 - 30;
    double height = paneWidth * 0.90 - 60;
    double diff = Math.min(width, height) * 0.4;
    
    // front rectangle
    Rectangle r1 = new Rectangle(10, 60, width, height);
    r1.setFill(new Color(1, 1, 1, 0));
    r1.setStroke(Color.BLACK);
    
    // back rectangle
    Rectangle r2 = new Rectangle(30, 60 - diff, width, height);
    r2.setFill(new Color(1, 1, 1, 0));
    r2.setStroke(Color.BLACK);
    
    // Lines to connect the corners
    Line line1 = new Line(10, 60, 30, 60 - diff);
    Line line2 = new Line(10, 60 + height, 30, 60 - diff + height);
    Line line3 = new Line(10 + width, 60, 30 + width, 60 - diff);
    Line line4 = new Line(10 + width, 60 + height, 30 + width, 60 - diff + height);

    pane.getChildren().addAll(r1, r2, line1, line2, line3, line4);

    Scene scene = new Scene(pane, paneWidth, paneHeight);
    primaryStage.setTitle("Exercise14_14");
    primaryStage.setScene(scene); //
    primaryStage.show(); //
  }
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
