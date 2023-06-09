package pilisaru.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import pilisaru.model.EmployeeModel;

import java.sql.SQLException;
import java.util.List;

public class employeeFormController {
    public ComboBox cmbEmp;
    public Button updatebtn;

    @FXML
    void initialize(){
        setNicNUmbers();
    }

    private void setNicNUmbers() {
        ObservableList nic= FXCollections.observableArrayList();
        try {
            List<String> nics= EmployeeModel.getNicNumbers();

            for(String s : nics){
                nic.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        cmbEmp.setItems(nic);
    }

    public void buttonPressed(ActionEvent event) {

    }
}
