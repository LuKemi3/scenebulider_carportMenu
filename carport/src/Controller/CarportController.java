package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import model.cars;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


import java.util.logging.Logger;
import java.util.logging.Level;

public class CarportController implements Initializable {
    @FXML
    private Label exit;
    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;

    private List<cars> car=new ArrayList<>();
    private List<cars> getData(){
        List<cars> car =new ArrayList<>();
        cars car1;
        car1=new cars();
        car1.setName("S_YELLOW1");
        car1.setPrice(6);
        car1.setImgSrc("../picture/sYELLOW1.png");
        car1.setColor("#B0C4DE");
        car.add(car1);

        car1=new cars();
        car1.setName("S_BLACK1");
        car1.setPrice(5);
        car1.setImgSrc("../picture/sBLACK1.png");
        car1.setColor("#B0C4DE");
        car.add(car1);

        car1=new cars();
        car1.setName("S_BLUE1");
        car1.setPrice(6);
        car1.setImgSrc("../picture/sBLUE1.png");
        car1.setColor("#B0C4DE");
        car.add(car1);

        car1=new cars();
        car1.setName("S_BLUE2");
        car1.setPrice(5);
        car1.setImgSrc("../picture/sBLUE2.png");
        car1.setColor("#B0C4DE");
        car.add(car1);
        return car;
    }


    public CarportController() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        exit.setOnMouseClicked(e -> {
            System.exit(0);
        });

    }
    @FXML
   private void allcars(MouseEvent event){
        loadPage("allcars");

   }
    @FXML
    private void slevel(MouseEvent event){
        loadPage("slevel");

    }
    @FXML
    private void alevel(MouseEvent event){
        loadPage("alevel");

    }
    @FXML
    private void blevel(MouseEvent event){
          loadPage("blevel");

    }
    @FXML
    private void clevel(MouseEvent event){
        loadPage("clevel");

    }
    public void choose(MouseEvent mouseEvent) {

    }
    private void loadPage(String page){
        Parent fxm=null;
        try{
            fxm=FXMLLoader.load(getClass().getResource("../views/"+page+".fxml"));
        }catch(IOException ex){
            Logger.getLogger(CarportController.class.getName()).log(Level.SEVERE, null, ex);
        }
        bp.setCenter(fxm);

    }


}

