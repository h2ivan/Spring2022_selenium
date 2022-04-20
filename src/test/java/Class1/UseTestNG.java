package Class1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UseTestNG {

    @Test
    public void verify2plus2Is4()  {

        //Assert
        Assert.assertEquals(2+2 , 4, "2+2 is not coming as expected");
    }
    @Test
    public void verify3plus3Is6() {

        //Assert
        Assert.assertEquals(3 + 3, 6, "3+3 is not coming as expected");
    }
}
