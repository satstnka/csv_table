package jp.trans_it.csv_table;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainFrame implements Initializable {
	@FXML
	private TableView<Member> table;

	@FXML
	private TableColumn<Member, String> nameColumn;

	@FXML
	private TableColumn<Member, String> colorColumn;

	@FXML
	private TableColumn<Member, String> birthdayColumn;

	public void initialize(URL location, ResourceBundle resources) {
		try {
			List<Member> members = Member.getMembers();
			for(Member member : members) {
				this.table.getItems().add(member);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		this.nameColumn.setCellValueFactory(new PropertyValueFactory<Member, String>("name"));
		this.colorColumn.setCellValueFactory(new PropertyValueFactory<Member, String>("color"));
		this.birthdayColumn.setCellValueFactory(new PropertyValueFactory<Member, String>("birthday"));
	}



}
