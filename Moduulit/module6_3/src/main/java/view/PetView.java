package view;

import control.PetControl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Pet;

public class PetView extends Application {

    private Canvas canvas;
    private GraphicsContext gc;
    private Image petImage;

    public void start(Stage primaryStage) {
        canvas = new Canvas(400, 400);
        gc = canvas.getGraphicsContext2D();
        petImage = new Image("file:pet_icon.png");
        Pet pet = new Pet();
        PetView petView = new PetView();
        PetControl petController = new PetControl(pet, petView);
        petController.startPet();

        StackPane root = new StackPane();
        root.getChildren().add(petView.getCanvas());

        Scene scene = new Scene(root, 400, 400);
        scene.setOnMouseMoved(event -> petController.movePet(event.getX(), event.getY()));
        scene.setOnMouseExited(event -> petController.stopPet());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Virtual Pet");
        primaryStage.show();
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void drawPet(double x, double y) {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage(petImage, x, y);
    }
}
