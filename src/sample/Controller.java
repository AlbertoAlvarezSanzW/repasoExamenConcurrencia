package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {


    @FXML
    public Label labelId;

    @FXML
    public Button botonId;

    @FXML
    public TextField textId;

    @FXML
    public void acciononclick(){
        labelId.setText(" ");
        for (int i = 0; i < textId.getText().length(); i++){
            try{
                Thread.sleep(1000);
                labelId.setText(labelId.getText() + textId.getText().charAt(i));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }





}
