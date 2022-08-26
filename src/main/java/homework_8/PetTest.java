package homework_8;



import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

import static org.junit.Assert.*;


public class PetTest {
    @Test
    public void toStringTest(){
        Set<String> x = new HashSet<String>();
        x.add("Eating");
        x.add("Sleeping");
        x.add("Creating a mess");
        DomesticCat cat=new DomesticCat("Kandela",2,99,x);
        assertTrue(cat.toString().equals("DomesticCat{nickname='Kandela', age=2, trickLevel=99, habits=[Eating, Sleeping, Creating a mess]}"));
    }
}
}
