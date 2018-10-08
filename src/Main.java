import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage window;
        window = primaryStage;
        window.setTitle("Tamagothi");
        VBox board = new VBox();
        board.setPadding(new Insets(10, 10, 10, 10));
        Scene scene = new Scene(board, 500, 500);
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setScene(scene);
//        primaryStage.setScene(new Scene(root, 300, 275));
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
