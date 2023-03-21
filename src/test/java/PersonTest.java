
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PersonTest {
    @Test
    void mustCookPasta(){
        AbstractFoodFactory factory = new PastaFactory();
        Person person = new Person(factory);
        assertEquals("Cooked the Pasta", person.cookFood());
    }

    @Test
    void mustEatPasta(){
        AbstractFoodFactory factory = new PastaFactory();
        Person person = new Person(factory);
        assertEquals("Eat the pasta", person.eatFood());
    }

    @Test
    void mustRecipePasta(){
        AbstractFoodFactory factory = new PastaFactory();
        Person person = new Person(factory);
        assertEquals("Recipe for the pasta", person.recipeFood());
    }

    @Test
    void mustCookStrogonoff(){
        AbstractFoodFactory factory = new StrogonoffFactory();
        Person person = new Person(factory);
        assertEquals("Cooked the Strogonoff", person.cookFood());
    }

    @Test
    void mustEatStrogonoff(){
        AbstractFoodFactory factory = new StrogonoffFactory();
        Person person = new Person(factory);
        assertEquals("Eat the Strogonoff", person.eatFood());
    }

    @Test
    void mustRecipeStrogonoff(){
        AbstractFoodFactory factory = new StrogonoffFactory();
        Person person = new Person(factory);
        assertEquals("Recipe for the Strogonoff", person.recipeFood());
    }
}
