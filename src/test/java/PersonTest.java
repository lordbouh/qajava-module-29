import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class PersonTest {
    @DataProvider(name = "CheckTeenager")
    Object[][] CheckTeenager() {
        return new Object[][] {
                {-1, false},
                {0, false},
                {12, false},
                {13,true},
                {15,true},
                {18,true},
                {19,false},
                {20,false}
        };
    }
    @Test(dataProvider = "CheckTeenager")
    void testPersonIsTeenager(int age, boolean expected) {
        boolean result = Person.isTeenager(age);
        System.out.println("Age " + age + ": " + result);
        assertEquals(result, expected);

    }
}