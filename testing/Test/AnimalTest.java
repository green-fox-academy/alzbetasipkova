import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalTest {

    // [MethodName_StateUnderTest_ExpectedBehavior]
    @Test
    public void eat_PositiveInput_DecreaseByValue(){
        // call the function tested
        Animal animal = new Animal(87);
        animal.eat(20);

        // test if the result is what we expect
        assertEquals(67, animal.getHunger());
    }

    @Test
    public void eat_NegativeInput_RemainsTheSame(){
        // call the function tested
        Animal animal = new Animal(87);
        animal.eat(-20);

        // test if the result is what we expect
        assertEquals(87, animal.getHunger());
    }
}
