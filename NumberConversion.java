/* (Convert numbers)
 * Write a program that converts between decimal, hex, and binary numbers.
 * When you enter a decimal value in the decimalvalue text field 
 * and press the Enter key, its corresponding hex and binary numbers are
 * displayed in the other two text fields. 
 * Likewise, you can enter values in the other fields and convert them accordingly. 
 * (Hint: Use the Integer.parseInt(s, radix) method to parse a string 
 * to a decimal and use Integer.toHexString(decimal) 
 * and Integer.toBinaryString(decimal) to obtain a hex number 
 * or a binary number from a decimal.)
 */

/**
 *
 * @author gringuitolokito
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;

public class NumberConversion extends Application {

    // Create Textfield
    private final TextField tfDecimal = new TextField();
    private final TextField tfHex = new TextField();
    private final TextField tfBinary = new TextField();

    // Main mehtod
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Decimal: "), 0, 0);
        gridPane.add(tfDecimal, 1, 0);
        gridPane.add(new Label("Hex: "), 0, 2);
        gridPane.add(tfHex, 1, 2);
        gridPane.add(new Label("Binary: "), 0, 3);
        gridPane.add(tfBinary, 1, 3);

        // Position the content center
        gridPane.setAlignment(Pos.CENTER);
        
        // Create and register handlers
        tfDecimal.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                tfHex.setText(Integer.toHexString(
                        Integer.parseInt(tfDecimal.getText())));

                tfBinary.setText(Integer.toBinaryString(
                        Integer.parseInt(tfDecimal.getText())));
            }
        });

        tfHex.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                tfDecimal.setText(String.valueOf(
                        Integer.parseInt(tfHex.getText(), 16)));

                tfBinary.setText(Integer.toBinaryString(
                        Integer.parseInt(tfHex.getText(), 16)));
            }
        });

        tfBinary.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                tfDecimal.setText(String.valueOf(
                        Integer.parseInt(tfBinary.getText(), 2)));

                tfHex.setText(Integer.toHexString(
                        Integer.parseInt(tfBinary.getText(), 2)));
            }
        });

        // Create a scene and place it in the stage 
        Scene scene = new Scene(gridPane, 700, 250);
        primaryStage.setTitle("Number Conversion"); // Set title 
        primaryStage.setScene(scene); // Place the scene in the stage 
        primaryStage.show(); // Display the stage
    }
}
