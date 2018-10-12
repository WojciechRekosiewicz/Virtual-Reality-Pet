package View;

import Model.Feed;
import Model.Fun;
import Model.Statistics;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Buttons {
    private Fun fun = new Fun();
    private Feed feed = new Feed();
    private Statistics statistics = new Statistics();
    private Button feedButton = new Button("Feed");
    private Button funButton = new Button("Pet");

    public void useFeed(){
        feedButton.setOnAction(e -> {
            statistics.changeHungryLvl();
            //feed.feedModify();
            System.out.println();
            System.out.println(statistics.getHungryLvl());
        });
    }
    public void useFun(){
        funButton.setOnAction(e -> {
            statistics.changeFunLvl();
            // fun.funModify();
            System.out.println();
            System.out.println(statistics.getFunLvl());
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
