package View;

import Model.Statistics;
import Model.Timers;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class Buttons extends Statistics {
    private Button feedButton = new Button("Feed Vader");
    private Button funButton = new Button("Kill Yedi");

    public void addButtons(VBox board, Label labelFun, Label labelFeed, Label notificationFeed, Label notificationFun) {
        Timers timers = new Timers();
        timers.useChangeFunLvl(labelFun, funButton, notificationFun);
        timers.useChangeFeedLvl(labelFeed, feedButton, notificationFeed);
        board.getChildren().addAll(funButton, feedButton);
    }
}
