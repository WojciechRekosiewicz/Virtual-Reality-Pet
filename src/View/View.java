package View;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View {
    Image Vader = new Image("vader.jpeg");
    ImageView viewVader = new ImageView(Vader);


    public ImageView getViewVader() {
        return viewVader;
    }

    public void createBoard(GridPane gridPane, VBox board, Stage primaryStage) {
        Buttons buttonsObject = new Buttons();
        primaryStage.setTitle("Tamagothi");
        buttonsObject.addButtons(board);
        gridPane.add(getViewVader(), 400, 400, 100, 100);
        board.getChildren().add(gridPane);
        board.setPadding(new Insets(10, 10, 10, 10));
    }
}

