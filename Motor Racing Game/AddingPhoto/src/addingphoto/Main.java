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
//import javafx.application.Platform;
//import javafx.beans.binding.BooleanBinding;
//import javafx.beans.property.BooleanProperty;
//import javafx.beans.property.SimpleBooleanProperty;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.PerspectiveTransform;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCharacterCombination;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
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
public class Main extends Application {
    double x1,y1=40,x2,y2=120,x3,y3=120,x4,y4=120;
    double tt;
    int race_on=0;
    double z=0;
    
    int pos_x=500,pos_y=470;
    ImageView back1=new ImageView();
    ImageView back2=new ImageView();
    ImageView back3=new ImageView();
    
    ImageView view1=new ImageView();
           ImageView view2=new ImageView();
           ImageView view3=new ImageView();
           ImageView view4=new ImageView();
           ImageView view5=new ImageView();
           ImageView view6=new ImageView();
           ImageView view7=new ImageView();
           ImageView view8=new ImageView();
           ImageView view9=new ImageView();
           ImageView view10=new ImageView();
           ImageView view11=new ImageView();
           ImageView view12=new ImageView();
           
           
           
           
           
           
           
      //     ImageView view3=new ImageView();
           
           int speed=0;
           Text show_speed=new Text("000");
           Image pane1=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\image1.png");
           Image pane2=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\images2.png");
           Image pane3=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\images3.png");
           
           Image image1=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\road.png");
           Image image2=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\mmm.png");
           Image image3=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\sideview1.jpg");
           Image image4=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\sideview2.jpg");
           Image image5=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\biker1copy.png");
           ImageView clock=new ImageView(new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\clock.png"));
           ImageView map=new ImageView(new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\mapcopy.png"));
           Image c1=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\dgnum1.jpg");
           Image c2=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\dgnum2.jpg");
           Image c3=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\dgnum3.jpg");
           Image c4=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\raceon.png");
           Image gameover=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\gameover.png");
           Image lost=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\lost.png");
           Image win=new Image("file:C:\\Users\\Public\\Pictures\\Sample Pictures\\win.png");
           
           
           
           
           
        
           
           double k=0;
            Polygon qq=new Polygon();
            Polygon qqq=new Polygon();
         
            double present_op=0,present_player=0;
            double time=0;
            double op_velocity=0,player_velocity=0,op_acceleration=0.5,player_acceleration=5;
           int extra=0;
        
           double map_op_distance=0;
           Circle map_op=new Circle(10,Color.RED);
           Polygon map_me=new Polygon(); 
           double triangle_x=100,triangle_y=100;

           
           
           
        int countdown=0; 
    public void update(){
        if(present_op<12000 && present_player <12000){
        if(race_on==1){
            if(k>0){
               k-=0.5;
               z-=0.5;
               speed=(int)z;
           }
           time=0.1667;
           if(player_velocity>0){
               
               present_player=present_player+player_velocity*time-1.2*0.5*time*time;
                        
                        player_velocity=(player_velocity-1.2*time);
                    }
                
                if(op_velocity<100){
                present_op=present_op+op_velocity*time+0.5*op_acceleration*time*time; 
                op_velocity=op_velocity+op_acceleration*time;
                }
                else present_op+=(op_velocity*time);
                System.out.println(present_op);
           view5.setLayoutY(view2.getLayoutY()-(present_op-present_player));
        }
        map_op.setLayoutX(140);
        if(map_op.getLayoutY()>60)
        map_op.setLayoutY(400-(300*present_op/10000));
        map_me.setLayoutX(35);
      if(map_me.getLayoutY()>-60) 
          map_me.setLayoutY(269-(300*present_player/10000));
      //System.out.println("xxx"+map_me.getLayoutY());
        
        countdown++;
        if(countdown<50){
            view6.setImage(c3);
            }
        else if(countdown<100){
            view6.setImage(c2);
        }
       else if(countdown<150){
            view6.setImage(c1);
        }
        else if(countdown<200){
            view6.setImage(c4);
           }
        if(countdown==180){
            //view6.setImage(c4);
            view6.setLayoutX(1200);
            view6.setLayoutY(1000);
            
            } 
        
         
        
            y1+=k;y2+=(1.25*k);y3++;y4++;
            
           int n;
           n=(int)player_velocity;
           if(n<10)show_speed.setText("00"+n);
           else if(n<100)show_speed.setText("0"+n);
           else show_speed.setText(""+n);
           //if(k<0)k-=25;
            if(y1>700){
                y1=0;
                y2=60;
          
            }
            
        x1=(((11.0/260)*(y1-40))+9.0);
          x4=((11/260)*(y4-40))+9.0;
          tt=11*(y1-40)/260;
          x2=(((2.0/33)*(y2-120))+15.0);
          x3=((2/33)*(y3-120))+15.0;
          //System.out.println(tt+"...y="+x1);
          qq.getPoints().clear();
          
          qq.getPoints().addAll(new Double[]{
           (650.0-x1),y1,(650.0+x1),y1,(650+x2),y2,(650.0-x2),y2 
        });
       //view2.setLayoutX(pos_x);//declared globally
       //view2.setLayoutY(pos_y);//declared globally   
        }
        if(present_op>=12000 || present_player>=12000){
           view10.setImage(gameover);
           
           view10.setLayoutX(500);
           view10.setLayoutY(200);
           
       }  
        if(present_op>=12000 && present_player<12000){
            view11.setImage(lost);
           
           view11.setLayoutX(500);
           view11.setLayoutY(400);
           
    }
        else if(present_op<12000 && present_player>=12000){
            view12.setImage(win);
           
           view12.setLayoutX(500);
           view12.setLayoutY(300);
           
        }
    }
       
    @Override
    public void start(Stage primaryStage) {
        //speed materials   
       
        
        map_me.getPoints().addAll(new Double[]{
           triangle_x,triangle_y,triangle_x+15,triangle_y+15,triangle_x-15,triangle_y+15 
        });
        map_me.setFill(Color.ORANGE);
        map_me.setLayoutY(600);
            
        map_op.setLayoutY(600);
       
        qq.getPoints().addAll(new Double[]{
           641.0,40.0,659.0,40.0,665.0,120.0,635.0,120.0 
        }); 
        qq.setFill(Color.WHITE);
        
        
        qqq.getPoints().addAll(new Double[]{
           630.0,300.0,670.0,300.0,685.0,450.0,615.0,450.0 
        });
        qqq.setFill(Color.WHITE);
        
       Group g =new Group();
       Pane p=new Pane();
       //Circle cc=new Circle(1.0, 1.0,2.0);
        
        Button btn1 = new Button();
        btn1.setText("Play Again");
        btn1.setLayoutX(550);
        btn1.setPrefSize(200, 50);
        btn1.setLayoutY(590);
        btn1.setFont(new Font("Comic Sans MS", 18));
        btn1.setStyle("-fx-base:ORANGE");
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                g.getChildren().remove(back1);
                g.getChildren().add(back2);
             }
            });
       
        TextField name = new TextField(); //for writing any name  
           name.setLayoutY(290);
           name.setLayoutX(610);
           name.setPrefSize(200, 50);
           name.setFont(new Font("Comic Sans MS", 20));
           name.setStyle("-fx-base:ORANGE");
         
       Text t=new Text("SHANTANU");
       t.setLayoutX(1100);
       t.setLayoutY(100);
       t.setFont(new Font("Verdana", 20));
       t.setFill(Color.RED);
       
       Text t2=new Text("JOHN");
       t2.setLayoutX(1130);
       t2.setLayoutY(130);
       t2.setFont(new Font("Verdana", 25));
       t2.setFill(Color.BLUE);
      
           
       view3.setImage(image3);
       view3.setFitWidth(480);
       view3.setFitHeight(1000);
      // view3.relocate(-10, 30);
       view3.setLayoutX(76);
       view3.setLayoutY(-250);
       view3.getTransforms().add(new Rotate(26));
      // view1.setImage(image1);
       view4.setImage(image4);
     //  view4.setFitWidth(530);
      // view4.setFitHeight(390);
      // view3.relocate(-10, 30);
       view4.setLayoutX(812);
       view4.setLayoutY(0);
       view4.getTransforms().add(new Rotate(-26));
      
      view1.setImage(image1);
       g.getChildren().add(view1);
       g.getChildren().add(view3);
       g.getChildren().add(view4);
       
      view2.setImage(image2);
       g.getChildren().add(view2);
       view2.setLayoutX(500);
       view2.setLayoutY(470);
       
       
       view5.setImage(image5);
       g.getChildren().add(view5);
       view5.setLayoutX(500);
       view5.setLayoutY(200);
       
       g.getChildren().add(clock);
       clock.setLayoutX(930);
       clock.setLayoutY(350);
       
       g.getChildren().add(map);
       map.setLayoutX(-210);
       map.setLayoutY(-7);
      
       
      g.getChildren().add(qq); 
       
       g.getChildren().add(show_speed);
       show_speed.setLayoutX(1140);
       show_speed.setLayoutY(575);
       show_speed.setFont(new Font("Apple Casual", 50));
       show_speed.setFill(Color.BLUE);
       
       
       g.getChildren().add(map_op);
      
      
       
       view6.setImage(c2);
       g.getChildren().add(view8);
       g.getChildren().add(view7);
       g.getChildren().add(view6);
       g.getChildren().add(view9);
      
       
       g.getChildren().add(map_me);
       g.getChildren().add(t);
       g.getChildren().add(t2);
       g.getChildren().add(view11);
       g.getChildren().add(view12);
         
       
       g.getChildren().add(view10);
       
       
       view6.setLayoutX(570);
       view6.setLayoutY(250);
       
       
        
       final KeyCombination keyComb1=new KeyCodeCombination(KeyCode.Z,KeyCombination.CONTROL_DOWN);
       final KeyCombination keyComb2=new KeyCodeCombination(KeyCode.X,KeyCombination.CONTROL_DOWN);
          
          
         
       
        
        Scene scene = new Scene(g, 1300, 680);
      
         scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
      if(key.getCode()==KeyCode.UP) {
          if(k<100){
                        k+=1.5;
                        z+=2;
                        if(z<200)speed=(int)z;
                       
                        
                        present_player=present_player+player_velocity*time+0.5*player_acceleration*time*time;
                        
                        player_velocity=player_velocity+player_acceleration*time;
                         
                       }
      }
      else if(key.getCode()==KeyCode.SPACE) {
          race_on=1;
      }
      else if (key.getCode() == KeyCode.RIGHT ) {
            view2.setLayoutX(view2.getLayoutX()+2);
            
            
        } else if (key.getCode() == KeyCode.LEFT ) {
            view2.setLayoutX(view2.getLayoutX()-2);
        }
});    
        
       
        
scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
    @Override
    public void handle(KeyEvent ke) {
        
    }
});


        
        
        
        
        ///////
          new AnimationTimer() {
               @Override
               public void handle(long now) {
                   update();
               }
           }.start();
        
        primaryStage.setTitle("Motor Racing Game !!!");
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
