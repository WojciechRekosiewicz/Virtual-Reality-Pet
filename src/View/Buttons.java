package View;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class Buttons {
    private Button feedButton = new Button("Feed");
    private Button funButton = new Button("Pet");

    public void useFeed(){
        feedButton.setOnAction(e -> {
            System.out.println("Feed");
        });
    }
    public void useFun(){
        funButton.setOnAction(e -> {
            System.out.println("Fun");
        });
    }

    public void addButtons(VBox board){
        useFeed();
        useFun();
        board.getChildren().addAll(feedButton, funButton);
    }
}
