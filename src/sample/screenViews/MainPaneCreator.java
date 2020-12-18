package sample.screenViews;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class MainPaneCreator {
    private GridPane mainPane;
    private Button startButton;

    public MainPaneCreator() {
        this.mainPane = buildMainPane();
    }

    public GridPane getMainPane() {
        return mainPane;
    }

    public Button getStartButton() {
        return startButton;
    }

    private GridPane buildMainPane() {
        GridPane mainPane = createMainPane();
        this.startButton = createStartButton();

        mainPane.add(this.startButton, 0, 4, 2, 1);
        GridPane.setHalignment(this.startButton, HPos.CENTER);
        GridPane.setMargin(this.startButton, new Insets(20, 0,20,0));

        return mainPane;
    }

    private GridPane createMainPane() {
        GridPane gridPane = new GridPane();

        // Position the pane at the center of the screen, both vertically and horizontally
        gridPane.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        gridPane.setPadding(new Insets(40, 40, 40, 40));

        // Set the horizontal gap between columns
        gridPane.setHgap(10);

        // Set the vertical gap between rows
        gridPane.setVgap(10);

        // Add Column Constraints

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }

    private Button createStartButton() {

        // Add start Button
        Button startButton = new Button("Start");
        startButton.setPrefHeight(40);
        startButton.setDefaultButton(true);
        startButton.setPrefWidth(100);

        return startButton;
    }

}
