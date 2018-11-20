/*(Display a pie chart) 
 * Write a program that uses a pie chart 
 * to display the percentages of the overall grade 
 * represented by projects, quizzes, midterm exams, 
 * and the final exam, as shown in Figure 14.46c. 
 * Suppose that projects take 20 percent and are displayed 
 * in red, quizzes take 10 percent and are displayed in blue,
 * midterm exams take 30 percent and are displayed in green, 
 * and the final exam takes 40 percent and is displayed in orange. 
 * Use the Arc class to display the pies. Interested readers may explore
 * the JavaFX PieChart class for further study.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;

public class testPieChart2 extends Application {

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Grade Pie Chart");
        stage.setWidth(550);
        stage.setHeight(500);

        ObservableList<PieChart.Data> pieChartData
                = FXCollections.observableArrayList(
                        new PieChart.Data("Midterm -- 30%", 30),
                        new PieChart.Data("Final -- 40%", 40),
                        new PieChart.Data("Project -- 20%", 20),
                        new PieChart.Data("Quiz -- 10%", 10));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Grade Pie Chart");
        
        // you can change this by specifying the false value
        // for the setClockwise method chart.setClockwise(false). 
        chart.setClockwise(false);

        // se this method in combination with 
        // the setStartAngle method to attain the desired position of the slices.
        chart.setStartAngle(100);

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        
        launch(args);
    }
}
