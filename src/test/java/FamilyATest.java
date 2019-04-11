import org.junit.Assert;
import org.junit.Test;

public class FamilyATest {

    @Test
    public void fiveToEleven_is15Dollars(){
        Family family = new Family();

        Assert.assertEquals(15,family.cost());
    }
}
