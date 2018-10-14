import View.View;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox board = new VBox();
        View viewObject = new View();
        viewObject.createBoard(board, primaryStage);
        Scene scene = new Scene(board, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
