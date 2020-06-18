/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addingphoto;

/**
 *
 * @author INTERWAVE
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
        

/**
 *
 * @author INTERWAVE
 */
public class AddingPhoto extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane1 = new Pane();
        Pane pane2 = new Pane();
        Pane pane3= new Pane();
        Pane pane4=new Pane();
        Pane pane = new Pane();
      
        
        Image image1 = new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\image1.jpg");
        ImageView view = new ImageView();
        view.setImage(image1);
        view.setFitWidth(1500);
        view.setFitHeight(680);
        //view.setPreserveRatio(true);
        //view.setX(0);
       // view.setY(680);
        view.setSmooth(true);
        view.setCache(true);
        
        
        Image image2 = new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\images3.jpg");
        ImageView view2 = new ImageView();
        view2.setImage(image2);
        
        view2.setFitWidth(1500);
        view2.setFitHeight(680);
        //view.setPreserveRatio(true);
        view2.setSmooth(true);
        view2.setCache(true);
        
        Image image3 = new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\bike1.jpg");
        ImageView bike1 = new ImageView();
        bike1.setImage(image3);
        bike1.setFitWidth(500);
        bike1.setFitHeight(300);
        //view.setPreserveRatio(true);
        bike1.relocate(105, 330);
        bike1.setSmooth(true);
        bike1.setCache(true);
        
        Image image4 = new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\bike2.jpg");
        ImageView bike2 = new ImageView();
        bike2.setImage(image4);
        bike2.setFitWidth(500);
        bike2.setFitHeight(300);
        //view.setPreserveRatio(true);
        bike2.relocate(105, 350);
        bike2.setSmooth(true);
        bike2.setCache(true);
        
        
        
        
        Image image5 = new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\bike3.jpg");
        ImageView bike3 = new ImageView();
        bike3.setImage(image5);
        bike3.setFitWidth(500);
        bike3.setFitHeight(300);
        //view.setPreserveRatio(true);
        bike3.relocate(105, 350);
        bike3.setSmooth(true);
        bike3.setCache(true);
        
        Image image7 = new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\images2.jpg");
        ImageView view7 = new ImageView();
        view7.setImage(image7);
        view7.setFitWidth(1500);
        view7.setFitHeight(680);
        //view.setPreserveRatio(true);
        view7.setSmooth(true);
        view7.setCache(true);
        
        Image image8 = new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\backimage2.jpg");
        ImageView view8 = new ImageView();
        view8.setImage(image8);
        view8.setFitWidth(1500);
        view8.setFitHeight(680);
        //view.setX(0);
        //view.setY(600);
        //view.setPreserveRatio(true);
        view8.setSmooth(true);
        view8.setCache(true);
        
        Image image9 = new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\backbike1features.jpg");
        ImageView bike1f = new ImageView();
        bike1f.setImage(image9);
        bike1f.setFitWidth(300);
        bike1f.setFitHeight(480);
        bike1f.setX(1020);
        bike1f.setY(100);
        //view.setPreserveRatio(true);
        bike1f.setSmooth(true);
        bike1f.setCache(true);
        
        Image image10 = new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\backbike2features.jpg");
        ImageView bike2f = new ImageView();
        bike2f.setImage(image10);
        bike2f.setFitWidth(300);
        bike2f.setFitHeight(480);
        bike2f.setX(1020);
        bike2f.setY(100);
        //view.setPreserveRatio(true);
        bike2f.setSmooth(true);
        bike2f.setCache(true);
        
        Image image11 = new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\bike3features.jpg");
        ImageView bike3f = new ImageView();
        bike3f.setImage(image11);
        bike3f.setFitWidth(300);
        bike3f.setFitHeight(480);
        bike3f.setX(1020);
        bike3f.setY(100);
        //view.setPreserveRatio(true);
        bike3f.setSmooth(true);
        bike3f.setCache(true);
        
        Image image12 = new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\2dbackimage.jpg");
        ImageView iv02 = new ImageView();
        iv02.setImage(image12);
        iv02.setFitWidth(1500);
        iv02.setFitHeight(680);
        //iv02.setX(0);
        //iv02.setY(0);
        //iv02.setX(0);iv02.setY(680);
        //view.setPreserveRatio(true);
        iv02.setSmooth(true);
        iv02.setCache(true);
        
        
        
        
        Button btn1 = new Button();
        btn1.setText("Choose Motorcycle");
        btn1.setLayoutX(990);
        btn1.setPrefSize(200, 50);
        btn1.setLayoutY(590);
        btn1.setFont(new Font("Comic Sans MS", 18));
        btn1.setStyle("-fx-base:ORANGE");
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                pane.getChildren().remove(pane1);
                pane.getChildren().add(pane2);
             }
            });
          Button btn2 = new Button();
          btn2.setText("ENTER YOUR NAME");
          btn2.setLayoutX(610);
          btn2.setPrefSize(200, 50);
          btn2.setLayoutY(220);
          btn2.setFont(new Font("Comic Sans MS", 17));
           
        
         
        Button btn3 = new Button();
        btn3.setText(">");
        btn3.setLayoutX(630);
        btn3.setPrefSize(80, 50);
        btn3.setLayoutY(500);
        btn3.setFont(new Font("Comic Sans MS", 25));
        btn3.setStyle("-fx-base: RED");
         
       
        
        EventHandler<ActionEvent> degxx1 = new EventHandler<ActionEvent>(){
               @Override public void handle(ActionEvent e) {
                   pane1.getChildren().remove(bike3);
                   pane1.getChildren().remove(bike1);
                   pane1.getChildren().add(bike2);
                   pane1.getChildren().remove(bike3f);
                   pane1.getChildren().remove(bike1f);
                   pane1.getChildren().add(bike2f);
                   //pane1.getChildren().remove();
                   //pane1.getChildren().add(view10);
                   //pane1.getChildren().remove(view10);
                   
                   
               }};
        
        
        EventHandler<ActionEvent> degx1 = new EventHandler<ActionEvent>(){
               @Override public void handle(ActionEvent e) {
                   pane1.getChildren().remove(bike2);
                   pane1.getChildren().add(bike1);
                   pane1.getChildren().remove(bike2f);
                   pane1.getChildren().remove(bike3f);
                   pane1.getChildren().add(bike1f);
                   
                   
                   
                   //System.out.println("hello");
                   
       btn3.setOnAction(null);
       btn3.setOnAction(degxx1);
     }};
      
        btn3.setOnAction(degx1);
       //btn3.setOnAction(null);
       //btn3.removeEventHandler(ActionEvent.ACTION,degx);
       //btn3.setOnAction(degxx);
         Button btn4 = new Button();
           btn4.setText("<");
           btn4.setLayoutX(5);
           btn4.setPrefSize(80, 50);
           btn4.setLayoutY(500);
           btn4.setFont(new Font("Comic Sans MS", 25));
           btn4.setStyle("-fx-base:RED");
           
           EventHandler<ActionEvent> degxx2 = new EventHandler<ActionEvent>(){
               @Override public void handle(ActionEvent e) {
                   pane1.getChildren().remove(bike1);
                   pane1.getChildren().remove(bike2);
                   pane1.getChildren().add(bike3);
                   pane1.getChildren().remove(bike2f);
                   pane1.getChildren().remove(bike1f);
                   pane1.getChildren().add(bike3f);
                   
                  
               }};
         EventHandler<ActionEvent> degx2 = new EventHandler<ActionEvent>(){
               @Override public void handle(ActionEvent e) {
                   pane1.getChildren().remove(bike2);
                   pane1.getChildren().add(bike1);
                   pane1.getChildren().remove(bike3f);
                   pane1.getChildren().remove(bike2f);
                   pane1.getChildren().add(bike1f);
                   //System.out.println("hello");
                   
       btn4.setOnAction(null);
       btn4.setOnAction(degxx2);
     }};
         btn4.setOnAction(degx2);  
         
         
         Button btn5 = new Button();
           btn5.setText("BACK");
           btn5.setLayoutX(1200);
           btn5.setPrefSize(80, 50);
           btn5.setLayoutY(500);
           btn5.setFont(new Font("Comic Sans MS", 20));
           btn5.setStyle("-fx-base:BLUE");
          
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pane.getChildren().remove(pane2);
                pane.getChildren().add(pane1);
             
            }

        });
        
         Button btn6 = new Button();
           btn6.setText("CONTINUE");
           btn6.setLayoutX(610);
           btn6.setPrefSize(200, 50);
           btn6.setLayoutY(350);
           btn6.setFont(new Font("Comic Sans MS", 20));
           btn6.setStyle("-fx-base: GREEN");
          
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pane.getChildren().remove(pane2);
                pane.getChildren().add(pane3);
          }
       });
        
        Button btn7 = new Button();
           btn7.setText("START !");
           btn7.setLayoutX(610);
           btn7.setPrefSize(200, 50);
           btn7.setLayoutY(350);
           btn7.setFont(new Font("Comic Sans MS", 20));
           btn7.setStyle("-fx-base: PINK");
           
           btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pane.getChildren().remove(pane3);
                pane.getChildren().add(pane4);
             
            }

        });
           
          Button btn8= new Button();
           btn8.setText("EXIT");
           btn8.setLayoutX(610);
           btn8.setPrefSize(200, 50);
           btn8.setLayoutY(390);
           btn8.setFont(new Font("Comic Sans MS", 20));
           btn8.setStyle("-fx-base:BLUE");
           
           btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pane.getChildren().remove(pane3);
                //pane.getChildren().add(pane3);
                Platform.exit();     
            }});
           Button btn9= new Button();
           btn9.setText("OPTIONS");
           btn9.setLayoutX(150);
           btn9.setPrefSize(200, 50);
           btn9.setLayoutY(280);
           btn9.setFont(new Font("Comic Sans MS", 20));
           
           Button btn10= new Button();
           btn10.setText("BACK");
           btn10.setLayoutX(1200);
           btn10.setPrefSize(80, 50);
           btn10.setLayoutY(500);
           btn10.setFont(new Font("Comic Sans MS", 20));
           btn10.setStyle("-fx-base: BLUE");
           
           btn10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pane.getChildren().remove(pane3);
                pane.getChildren().add(pane2);
             
            }});
           
            Button btn11= new Button();
           btn11.setText("FEATURES");
           btn11.setLayoutX(1010);
           btn11.setPrefSize(200, 50);
           btn11.setLayoutY(24);
           btn11.setFont(new Font("Comic Sans MS", 20));
           btn11.setStyle("-fx-base:BLUE");
           
           btn11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               // pane.getChildren().remove(pane2);
                //pane.getChildren().add(pane1);
             
            }});
           
        
    
          
           TextField name = new TextField(); //for writing any name  
           name.setLayoutY(290);
           name.setLayoutX(610);
           name.setPrefSize(200, 50);
           name.setFont(new Font("Comic Sans MS", 20));
           name.setStyle("-fx-base:ORANGE");
         
        pane1.getChildren().addAll(view,bike3,bike3f,btn3,btn4,btn11,btn9, btn1);
        pane2.getChildren().addAll(view7,btn6,btn2,name,btn5);
        pane3.getChildren().addAll(view2,btn10,btn7,btn8);
        //pane4.getChildren().addAll(view8);
        
        pane.getChildren().addAll(pane1);
        
        Scene scene = new Scene(pane, 1500, 700);
        
        primaryStage.setTitle("Motor Racing Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
