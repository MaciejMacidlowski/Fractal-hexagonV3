package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Main extends Application {

       static AnchorPane root = new AnchorPane();
    @Override
    public void start(Stage primaryStage) throws Exception{
        Scene scene = new Scene(root,1000,1000);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();


        drawPolygon(300,50,50,500,300,950,750,950,975,500,750,50);
        drawHexagaonsOut(300,50,50,500,300,950,750,950,975,500,750,50,10);
    }

    public static void drawPolygon(double x1,double y1, double x2,double y2, double x3, double y3, double x4, double y4,double x5, double y5, double x6, double y6){
        Polygon polygonSix = new Polygon(x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6);
        polygonSix.setFill(new Color(Math.random(),Math.random(),Math.random(),1));
        root.getChildren().add(polygonSix);
    }


    public static void drawHexagaonsOut(double x1,double y1, double x2,double y2, double x3, double y3, double x4, double y4,double x5, double y5, double x6, double y6,int steps){


//        Circle circle = new Circle(hexagonCenterX,hexagonCenterY,5);
//        root.getChildren().add(circle);


        if (steps>0){
            double hexagonCenterX=(x1+x6)/2;
            double hexagonCenterY= (y1+y3)/2;
            System.out.println(hexagonCenterX+"         "+hexagonCenterY);
            //calculating triangle in the 1/6 of the hexagon
            double x1v2=(hexagonCenterX-x1)/2;
            double y1v2=(hexagonCenterY-y1)/2;

            double x2v2=(hexagonCenterX-x1)/2;
            double y2v2=(hexagonCenterY-y1);

            double x3v2=
            double y3v2=

            double x4v2 =
            double y4v2 =

            double x5v2=
            double y5v2=

            double x6v2 =
            double y6v2 =






            drawPolygon(x1v2,y1v2,x2v2,y2v2,x3v2,y3v2,x4v2,y4v2,x5v2,y5v2,x6v2,y6v2);


            drawHexagaonsOut(x1v2,y1v2,x2v2,y2v2,x3v2,y3v2,x4v2,y4v2,x5v2,y5v2,x6v2,y6v2,steps-1);
            drawHexagaonsOut(x1v2,y1v2,x2v2,y2v2,x3v2,y3v2,x4v2,y4v2,x5v2,y5v2,x6v2,y6v2,steps-1);

//
//            Line linetest4 = new Line(hexagonCenterX,hexagonCenterY,x4v2,y4v2);
//            root.getChildren().add(linetest4);
//            Line linetest3 = new Line(hexagonCenterX,hexagonCenterY,x3v2,y3v2);
//            root.getChildren().add(linetest3);
//            Line linetest6 = new Line(hexagonCenterX,hexagonCenterY,x6v2,y6v2);
//            root.getChildren().add(linetest6);
//            Line linetest1 = new Line(hexagonCenterX,hexagonCenterY,x1v2,y1v2);
//            root.getChildren().add(linetest1);
//            Line linetest2 = new Line(hexagonCenterX,hexagonCenterY,x2v2,y2v2);
//            root.getChildren().add(linetest2);
//            Line linetest5 = new Line(hexagonCenterX,hexagonCenterY,x5v2,y5v2);
//            root.getChildren().add(linetest5);

        }
        else {
            return;
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
