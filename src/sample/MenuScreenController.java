package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import javafx.stage.Stage;
import sample.screenViews.ChooseManagementPaneCreator;
import sample.screenViews.MainPaneCreator;
import sample.screenViews.RouteManagementPaneCreator;
import sample.screenViews.TransportSchedulePaneCreator;


public class MenuScreenController {
    private Stage primaryStage;
    private Scene scene;

    private MainPaneCreator mainPaneCreator;
    private RouteManagementPaneCreator routeManagementPaneCreator;
    private ChooseManagementPaneCreator chooseManagementPaneCreator;
    private TransportSchedulePaneCreator transportSchedulePaneCreator;

    public MenuScreenController(Stage primaryStage) {
        this.primaryStage = primaryStage;

        this.mainPaneCreator = new MainPaneCreator();
        this.routeManagementPaneCreator = new RouteManagementPaneCreator();
        this.chooseManagementPaneCreator = new ChooseManagementPaneCreator();
        this.transportSchedulePaneCreator = new TransportSchedulePaneCreator();

        createChooseManagementMainScreenConnection();
        createMainChooseManagementScreenConnection();
        createChooseManagementRouteManagementConnection();
        createRouteManagementChooseManagementConnection();
        createChooseManagementTransportScheduleConnection();
        createTransportScheduleChooseManagementConnection();
    }

    public void showMainScreen() {
        GridPane mainPane = this.mainPaneCreator.getMainPane();

        this.scene = new Scene(mainPane, 800, 500);

        this.primaryStage.setScene(this.scene);
        this.primaryStage.show();
    }

    public void showMainScreenAgain() {
        GridPane mainPane = this.mainPaneCreator.getMainPane();

        this.scene.setRoot(mainPane);
    }

    public void showRouteManagementPane() {
        GridPane routeManagementPane = this.routeManagementPaneCreator.getRoadManagementPane();

        this.scene.setRoot(routeManagementPane);
    }

    public void showChooseManagementPane() {
        GridPane routeManagementPane = this.chooseManagementPaneCreator.getChooseManagementPane();

        this.scene.setRoot(routeManagementPane);
    }

    public void showTransportSchedulePane() {
        GridPane transportSchedulePane = this.transportSchedulePaneCreator.getTransportSchedulePane();

        this.scene.setRoot(transportSchedulePane);
    }

    private void createMainChooseManagementScreenConnection() {
        Button startButton = this.mainPaneCreator.getStartButton();

        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showChooseManagementPane();
            }
        });
    }

    private void createChooseManagementMainScreenConnection() {
        Button moveMainButton = this.chooseManagementPaneCreator.getMoveMainButton();

        moveMainButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showMainScreenAgain();
            }
        });
    }

    private void createChooseManagementRouteManagementConnection() {
        Button routeManagementButton = this.chooseManagementPaneCreator.getRouteManagementButton();

        routeManagementButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showRouteManagementPane();
            }
        });
    }

    private void createRouteManagementChooseManagementConnection() {
        Button moveChooseManagementButton = this.routeManagementPaneCreator.getMoveChooseManagementButton();

        moveChooseManagementButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showChooseManagementPane();
            }
        });
    }

    private void createChooseManagementTransportScheduleConnection() {
        Button transportScheduleButton = this.chooseManagementPaneCreator.getTransportScheduleButton();

        transportScheduleButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showTransportSchedulePane();
            }
        });
    }

    private void createTransportScheduleChooseManagementConnection() {
        Button moveChooseManagementButton = this.transportSchedulePaneCreator.getMoveChooseManagementButton();

        moveChooseManagementButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showChooseManagementPane();
            }
        });
    }

}
