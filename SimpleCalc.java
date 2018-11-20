/* (Create a simple calculator) 
 * Write a program to perform addition, subtraction, 
 * multiplication, and division, as shown in Figure 15.25a.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

/**
 *
 * @author gringuitolokito
 */
public class SimpleCalc extends Application {

    // Create Textfileds
    private final TextField tfnumber1 = new TextField();
    private final TextField tfnumber2 = new TextField();
    private final TextField tfresult = new TextField();

    // Create Buttons
    private final Button btAdd = new Button("Add");
    private final Button btSubtract = new Button("Subtract");
    private final Button btMultiply = new Button("Multiply");
    private final Button btDivide = new Button("DIvide");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create UI
        // Set width for textfield
        tfnumber1.setPrefWidth(50);
        tfnumber2.setPrefWidth(50);
        tfresult.setPrefWidth(60);

        // Set UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Number1: "), 0, 0);
        gridPane.add(tfnumber1, 1, 0);
        gridPane.add(new Label("Number2: "), 2, 0);
        gridPane.add(tfnumber2, 3, 0);
        gridPane.add(new Label("Result: "), 4, 0);
        gridPane.add(tfresult, 5, 0);
        
        // Buttons
        gridPane.add(btAdd, 1, 1);
        gridPane.add(btSubtract, 2, 1);
        gridPane.add(btMultiply, 3, 1);
        gridPane.add(btDivide, 4, 1);

        // Position the content center
        gridPane.setAlignment(Pos.CENTER);
      
        // Process events 
        btAdd.setOnAction(e -> {
            tfresult.setText(Double.parseDouble(tfnumber1.getText())
                    + Double.parseDouble(tfnumber2.getText()) + "");
        });

        btSubtract.setOnAction(e -> {
            tfresult.setText(Double.parseDouble(tfnumber1.getText())
                    - Double.parseDouble(tfnumber2.getText()) + "");
        });

        btMultiply.setOnAction(e -> {
            tfresult.setText(Double.parseDouble(tfnumber1.getText())
                    * Double.parseDouble(tfnumber2.getText()) + "");
        });

        btDivide.setOnAction(e -> {
            tfresult.setText(Double.parseDouble(tfnumber1.getText())
                    / Double.parseDouble(tfnumber2.getText()) + "");
        });
        
        // Create a scene and place it in the stage 
        Scene scene = new Scene(gridPane, 700, 250);
        primaryStage.setTitle("Simple Calculator"); // Set title 
        primaryStage.setScene(scene); // Place the scene in the stage 
        primaryStage.show(); // Display the stage
    }
}
