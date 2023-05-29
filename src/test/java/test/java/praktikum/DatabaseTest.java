package praktikum;

import org.junit.Assert;
import org.junit.Test;


public class DatabaseTest {

    private final Database db = new Database();

    @Test
    public void availableBunsReturnedListOfBuns() {
        Assert.assertFalse(db.availableBuns().isEmpty());
    }

    @Test
    public void availableIngredientsReturnedListOfIngredients() {
        Assert.assertFalse(db.availableIngredients().isEmpty());
    }

}