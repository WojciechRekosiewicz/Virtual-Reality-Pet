package View;

import Model.Feed;
import Model.Fun;
import Model.Statistics;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

import java.awt.event.ActionEvent;

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

    public void test() {
        final TextArea tArea = new TextArea();
        final Button btn = new Button("Action!");

        btn.setOnAction(e -> {


        });
    }

    public void handle(ActionEvent t) {
        final TextArea tArea = new TextArea();
        tArea.appendText("Show right now!!!!");
        //Do some stuff here, but just in the end of the method, the message above is show on the text area

        //what can i do to have a refresh on text area before the end of the method?
    }

    public void addButtons(VBox board){
        useFeed();
        useFun();
        VBox rightSide = new VBox();
        rightSide.setAlignment(Pos.BOTTOM_RIGHT);
        rightSide.getChildren().add(feedButton);
        board.getChildren().addAll(funButton, feedButton);
    }
}
