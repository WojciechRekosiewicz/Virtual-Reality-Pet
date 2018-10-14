package View;

import Model.Statistics;
import Model.Timers;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class Buttons extends Statistics {
    private Statistics statistics = new Statistics();
    private Button feedButton = new Button("Feed");
    private Button funButton = new Button("Kill Yedi");

//    public void useFeed(){
//        feedButton.setOnAction(e -> {
//            changeHungryLvl();
//            //feed.feedModify();
//            System.out.println();
//            System.out.println(getHungryLvl());
//        });
//    }

//    public void useChangeFunLvl(Label label){
//        feedButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
//
//            @Override
//            public void handle(javafx.event.ActionEvent event) {
//                label.setText("Energy: " + Integer.toString(getSleepLvl()) + "\nFun: " + Integer.toString(getFunLvl()) +
//                        "\nFeed: " + Integer.toString(getHungryLvl()));
//
//            }
//        });
//    }

//    public void useFun(Button funButton){
//        funButton.setOnAction(e -> {
//            changeFunLvl();
//            // fun.funModify();
//            System.out.println();
//            System.out.println(getFunLvl());
//        });
//    }


    public void addButtons(VBox board, Label labelFun, Label labelFeed, Label notificationFeed, Label notificationFun) {
        View view = new View();
        Timers timers = new Timers();
        //view.useFun(funButton);
        timers.useChangeFunLvl(labelFun, funButton, notificationFun);
        timers.useChangeFeedLvl(labelFeed, feedButton, notificationFeed);
        board.getChildren().addAll(funButton, feedButton);
    }
}
