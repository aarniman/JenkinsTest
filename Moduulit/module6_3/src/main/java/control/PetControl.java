package control;

import model.Pet;
import view.PetView;

public class PetControl {
    private Pet pet;
    private PetView petView;

    public static void main(String[] args) {
        PetView.launch(PetView.class);
    }

    public PetControl(Pet pet, PetView petView) {
        this.pet = pet;
        this.petView = petView;
        this.pet.setX(200);
        this.pet.setY(200);
    }

    public void startPet() {
        this.petView.drawPet(this.pet.getX(), this.pet.getY());
    }

    public void movePet(double mouseX, double mouseY) {
        double petX = pet.getX();
        double petY = pet.getY();

        double dx = mouseX - petX;
        double dy = mouseY - petY;
        double angle = Math.atan2(dy, dx);
        double speed = 2.0;

        petX += Math.cos(angle) * speed;
        petY += Math.sin(angle) * speed;

        if (Math.abs(petX - mouseX) < speed && Math.abs(petY - mouseY) < speed) {
            petX = mouseX;
            petY = mouseY;
        }

        pet.setX(petX);
        pet.setY(petY);
        petView.drawPet(petX, petY);
    }

    public void stopPet() {

    }
}
