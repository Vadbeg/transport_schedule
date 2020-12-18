package sample.screenViews;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class TransportSchedulePaneCreator {

    private GridPane transportSchedulePane;

    private Button busButton;
    private Button electricBusButton;
    private Button tramButton;
    private Button moveChooseManagementButton;

    public Button getBusButton() {
        return busButton;
    }

    public Button getElectricBusButton() {
        return electricBusButton;
    }

    public Button getMoveChooseManagementButton() {
        return moveChooseManagementButton;
    }

    public Button getTramButton() {
        return tramButton;
    }

    public TransportSchedulePaneCreator() {
        this.transportSchedulePane = buildTransportSchedulePane();
    }

    public GridPane getTransportSchedulePane() {
        return transportSchedulePane;
    }

    private GridPane buildTransportSchedulePane() {
        GridPane roadManagementPane = createRoadManagementPane();

        this.busButton = createBusButton();
        this.electricBusButton = createElectricBusButton();
        this.tramButton = createTramButton();
        this.moveChooseManagementButton = createMoveMainButton();

        roadManagementPane.add(this.busButton, 0, 1);
        GridPane.setHalignment(this.busButton, HPos.CENTER);
        GridPane.setMargin(this.busButton, new Insets(20, 0,20,0));

        roadManagementPane.add(this.electricBusButton, 0, 2);
        GridPane.setHalignment(this.electricBusButton, HPos.CENTER);
        GridPane.setMargin(this.electricBusButton, new Insets(20, 0,20,0));

        roadManagementPane.add(this.tramButton, 0, 3);
        GridPane.setHalignment(this.tramButton, HPos.CENTER);
        GridPane.setMargin(this.tramButton, new Insets(20, 0,20,0));

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

    private Button createBusButton() {

        // Add start Button
        Button addRouteButton = new Button("Bus");
        addRouteButton.setPrefHeight(40);
        addRouteButton.setDefaultButton(true);
        addRouteButton.setPrefWidth(150);

        return addRouteButton;
    }

    private Button createElectricBusButton() {

        // Add start Button
        Button changeRouteButton = new Button("Electric bus");
        changeRouteButton.setPrefHeight(40);
        changeRouteButton.setDefaultButton(true);
        changeRouteButton.setPrefWidth(150);

        return changeRouteButton;
    }

    private Button createTramButton() {

        // Add start Button
        Button removeRouteButton = new Button("Tram");
        removeRouteButton.setPrefHeight(40);
        removeRouteButton.setDefaultButton(true);
        removeRouteButton.setPrefWidth(150);

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
