package View;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class View {
    public Image Vader = new Image("vader.jpeg");

    public void createBoard(GridPane gridPane, VBox board, Stage primaryStage) {
        primaryStage.setTitle("Tamagothi");
        ImageView LVader = new ImageView(Vader);
        gridPane.add(LVader, 400, 400, 100, 100);
        //board.getChildren().add(gridPane);
        //board.setPadding(new Insets(10, 10, 10, 10));

    }
}

