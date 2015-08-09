package JoustMain;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class UserGUI extends Application {
	@Override
	public void start(Stage window) {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(32,32,32,32));
		TextArea opponentDeckList = new TextArea(), playerDeckList = new TextArea();
		Text title = new Text("Jousting!");
		Text result = new Text();
		Label opponentLabel = new Label("Opponent's Deck:");
		Label playerLabel = new Label("Player's Deck:");
		Button calculateButton = new Button("Calculate");
		HBox hbBtn = new HBox(20);
		hbBtn.setAlignment(Pos.CENTER);
		hbBtn.getChildren().add(calculateButton);
		title.setFont(Font.font("Comic Sans", FontWeight.NORMAL, 20));
		grid.add(title, 0, 0, 2, 1);
		grid.add(opponentLabel, 0, 1);
		grid.add(playerLabel, 1, 1);
		grid.add(opponentDeckList, 0, 2);
		grid.add(playerDeckList, 1, 2);
		grid.add(hbBtn, 1, 3);
		grid.add(result, 0, 4);
		
		result.setFill(Color.INDIGO);
		result.setText("Sample results!");
		
		Scene scene = new Scene(grid, 600, 400);
		
		window.setTitle("Joust Analyzer");
		window.setScene(scene);
		window.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}