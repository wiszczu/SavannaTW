package pl.twisz.animals;

import pl.twisz.Cell;
import pl.twisz.plants.Grass;
import pl.twisz.plants.Plant;

public class Zebra extends Herbivore {

    @Override
    public void eat(Cell cell) {
        Plant currentPlant = cell.getPlant();
        if (currentPlant instanceof Grass) {
            currentPlant.beEaten(this);
        } else {
            this.setStarvingDays(this.getStarvingDays() + 1);
        }
    }
}
