package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SelectItem
{

    public static Stage whichItemStage;
    private Stage current = new Stage();

    public SelectItem(Stage current)
    {
        this.current = current;
        whichItemStage = this.current;
    }
    public SelectItem()
    {

    }

    @FXML
    private Button SelectItemToDelete;

    @FXML
    void DelItem(ActionEvent event)
    {

    }

}
