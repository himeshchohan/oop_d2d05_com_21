import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class p34 extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        Label rollLabel = new Label("Roll No:");
        TextField rollField = new TextField();

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitBtn, 1, 4);

        submitBtn.setOnAction(e -> {
            try {
                // Validate Roll No and Age
                int rollNo = Integer.parseInt(rollField.getText());
                int age = Integer.parseInt(ageField.getText());
                String name = nameField.getText();
                String email = emailField.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    showError("Invalid Email! Must contain @ and .");
                    return;
                }

                if (name.isEmpty()) {
                    showError("Name cannot be empty!");
                    return;
                }

                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Registration Successful");
                success.setHeaderText("Details Submitted Successfully");
                success.setContentText(
                        "Roll No: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.showAndWait();

                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Data");
                fileChooser.getExtensionFilters().add(
                        new FileChooser.ExtensionFilter("Text Files", "*.txt")
                );

                File file = fileChooser.showSaveDialog(stage);

                if (file != null) {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                    writer.write(rollNo + "," + name + "," + age + "," + email);
                    writer.newLine();
                    writer.close();
                }

            } 
            catch (NumberFormatException ex) {
                showError("Roll No and Age must be integers!");
            } 
            catch (Exception ex) {
                showError("Error: " + ex.getMessage());
            }
        });

        Scene scene = new Scene(grid, 400, 250);
        stage.setTitle("Student Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    private void showError(String message) {
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle("Validation Error");
        error.setHeaderText("Invalid Input");
        error.setContentText(message);
        error.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}