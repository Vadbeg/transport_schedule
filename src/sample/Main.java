package sample;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Registration Form JavaFX Application");

        MenuScreenController menuScreenController = new MenuScreenController(primaryStage);

        menuScreenController.showMainScreen();
    }

    public static void main(String[] args) {
        launch(args);
    }
}