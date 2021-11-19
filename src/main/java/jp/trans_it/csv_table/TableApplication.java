package jp.trans_it.csv_table;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TableApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(MainFrame.class.getResource("MainFrame.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("ももクロメンバー");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
