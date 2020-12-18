package sample.screenViews;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class ChooseManagementPaneCreator {

    private GridPane chooseManagementPane;
    private Button transportScheduleButton;
    private Button routeManagementButton;
    private Button moveMainButton;

    public ChooseManagementPaneCreator() {
        this.chooseManagementPane = buildChooseManagementPane();
    }

    public GridPane getChooseManagementPane() {
        return chooseManagementPane;
    }

    public Button getMoveMainButton() {
        return moveMainButton;
    }

    public Button getRouteManagementButton() {
        return routeManagementButton;
    }

    public Button getTransportScheduleButton() {
        return transportScheduleButton;
    }

    private GridPane buildChooseManagementPane() {
        GridPane chooseManagementPane = createChooseManagementPane();
        this.transportScheduleButton = createTransportScheduleButton();
        this.routeManagementButton = createRouteManagementButton();
        this.moveMainButton = createMoveMainButton();

        chooseManagementPane.add(this.transportScheduleButton, 0, 1);
        GridPane.setHalignment(this.transportScheduleButton, HPos.CENTER);
        GridPane.setMargin(this.transportScheduleButton, new Insets(20, 0,20,0));

        chooseManagementPane.add(this.routeManagementButton, 0, 2);
        GridPane.setHalignment(this.routeManagementButton, HPos.CENTER);
        GridPane.setMargin(this.routeManagementButton, new Insets(20, 0,20,0));

        chooseManagementPane.add(this.moveMainButton, 0, 4);
        GridPane.setHalignment(this.moveMainButton, HPos.CENTER);
        GridPane.setMargin(this.moveMainButton, new Insets(20, 0,20,0));

        return chooseManagementPane;
    }

    private GridPane createChooseManagementPane() {
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
        ColumnConstraints columnOneConstraints = new ColumnConstraints(200, 200, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }

    private Button createTransportScheduleButton() {

        // Add start Button
        Button transportScheduleButton = new Button("Transport Schedule");
        transportScheduleButton.setPrefHeight(40);
        transportScheduleButton.setDefaultButton(true);
        transportScheduleButton.setPrefWidth(250);

        return transportScheduleButton;
    }

    private Button createRouteManagementButton() {

        // Add start Button
        Button routeManagementButton = new Button("Route management");
        routeManagementButton.setPrefHeight(40);
        routeManagementButton.setDefaultButton(true);
        routeManagementButton.setPrefWidth(250);

        return routeManagementButton;
    }

    private Button createMoveMainButton() {

        // Add start Button
        Button removeRouteButton = new Button("Move to main");
        removeRouteButton.setPrefHeight(40);
        removeRouteButton.setDefaultButton(true);
        removeRouteButton.setPrefWidth(250);

        return removeRouteButton;
    }

}
