import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class p35 extends Application {

    @Override
    public void start(Stage stage) {
        double scale = 5;

        VBox projectBox = createBar("Projects — 20%", 20, Color.RED, scale);
        VBox quizBox = createBar("Quizzes — 10%", 10, Color.BLUE, scale);
        VBox midtermBox = createBar("Midterm Exams — 30%", 30, Color.GREEN, scale);
        VBox finalBox = createBar("Final Exam — 40%", 40, Color.ORANGE, scale);

        HBox root = new HBox(20, projectBox, quizBox, midtermBox, finalBox);
        root.setAlignment(Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String labelText, int percentage, Color color, double scale) {
        
        Rectangle bar = new Rectangle(50, percentage * scale);
        bar.setFill(color);
        Label label = new Label(labelText);
        VBox box = new VBox(10, bar, label);
        box.setAlignment(Pos.BOTTOM_CENTER);
        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}