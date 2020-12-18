package sample.screenViews;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;


public class RouteManagementPaneCreator {

    private GridPane roadManagementPane;

    private Button addRouteButton;
    private Button changeRouteButton;
    private Button removeRouteButton;
    private Button moveChooseManagementButton;

    public Button getMoveChooseManagementButton() {
        return moveChooseManagementButton;
    }

    public RouteManagementPaneCreator() {
        this.roadManagementPane = buildRoadManagementPane();
    }

    public GridPane getRoadManagementPane() {
        return roadManagementPane;
    }

    private GridPane buildRoadManagementPane() {
        GridPane roadManagementPane = createRoadManagementPane();

        this.addRouteButton = createAddRouteButton();
        this.changeRouteButton = createChangeRouteButton();
        this.removeRouteButton = createRemoveRouteButton();
        this.moveChooseManagementButton = createMoveMainButton();

        roadManagementPane.add(this.addRouteButton, 0, 1);
        GridPane.setHalignment(this.addRouteButton, HPos.CENTER);
        GridPane.setMargin(this.addRouteButton, new Insets(20, 0,20,0));

        roadManagementPane.add(this.changeRouteButton, 0, 2);
        GridPane.setHalignment(this.changeRouteButton, HPos.CENTER);
        GridPane.setMargin(this.changeRouteButton, new Insets(20, 0,20,0));

        roadManagementPane.add(this.removeRouteButton, 0, 3);
        GridPane.setHalignment(this.removeRouteButton, HPos.CENTER);
        GridPane.setMargin(this.removeRouteButton, new Insets(20, 0,20,0));

        roadManagementPane.add(this.moveChooseManagementButton, 0, 4);
        GridPane.setHalignment(this.moveChooseManagementButton, HPos.CENTER);
        GridPane.setMargin(this.moveChooseManagementButton, new Insets(20, 0,20,0));

        return roadManagementPane;
    }

    private GridPane createRoadManagementPane() {
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

    private Button createAddRouteButton() {

        // Add start Button
        Button addRouteButton = new Button("Add route");
        addRouteButton.setPrefHeight(40);
        addRouteButton.setDefaultButton(true);
        addRouteButton.setPrefWidth(250);

        return addRouteButton;
    }

    private Button createChangeRouteButton() {

        // Add start Button
        Button changeRouteButton = new Button("Change route");
        changeRouteButton.setPrefHeight(40);
        changeRouteButton.setDefaultButton(true);
        changeRouteButton.setPrefWidth(250);

        return changeRouteButton;
    }

    private Button createRemoveRouteButton() {

        // Add start Button
        Button removeRouteButton = new Button("Remove route");
        removeRouteButton.setPrefHeight(40);
        removeRouteButton.setDefaultButton(true);
        removeRouteButton.setPrefWidth(250);

        return removeRouteButton;
    }

    private Button createMoveMainButton() {

        // Add start Button
        Button removeRouteButton = new Button("Move to choose management");
        removeRouteButton.setPrefHeight(40);
        removeRouteButton.setDefaultButton(true);
        removeRouteButton.setPrefWidth(250);

        return removeRouteButton;
    }

}
