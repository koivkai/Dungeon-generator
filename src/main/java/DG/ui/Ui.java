package DG.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ui extends Application {

    @Override
    public void start(Stage window) {
        window.setTitle("Dungeon Generator");

        BorderPane layout = new BorderPane();
        VBox controlPanel = new VBox(8);
        controlPanel.getChildren().add(new Button("Generate"));

        ScrollPane mapView = new ScrollPane();
        GridPane map = new GridPane();
        
        layout.setLeft(controlPanel);
        layout.setCenter(mapView);
        mapView.setContent(map);
        for(int x=0;x<10;x++) {
            for(int y=0;y<10;y++) {
                map.add(new Button("asd"), x, y);
            }
        }
        
        window.setScene(new Scene(layout));
        window.show();
    }
}