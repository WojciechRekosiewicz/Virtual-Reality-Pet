package View;

import Model.Feed;
import Model.Fun;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import java.awt.*;

public class Buttons {
    private Fun fun = new Fun();
    private Feed feed = new Feed();
    private Button feedButton = new Button("Feed");
    private Button funButton = new Button("Pet");

    public void useFeed(){
        feedButton.setOnAction(e -> {
            feed.feedModify();
            System.out.println("Feed");
        });
    }
    public void useFun(){
        funButton.setOnAction(e -> {
            fun.funModify();
            System.out.println("Fun");
        });
    }

    public void addButtons(VBox board){
        useFeed();
        useFun();
        VBox rightSide = new VBox();
        rightSide.setAlignment(Pos.BOTTOM_RIGHT);
        rightSide.getChildren().add(feedButton);
        board.getChildren().addAll(funButton, rightSide);
    }
}
