package homework_8;
import java.util.*;

import org.testng.annotations.Test;

import static org.junit.Assert.*;



public class HumanTest {
    @Test
    public void toStringTest(){
        DomesticCat cat=new DomesticCat("Meow");
        byte iq=100;
        Map<DayOfWeek, String> sl = new HashMap<DayOfWeek, String>();
        sl.put(DayOfWeek.MONDAY, "Playing piano");
        sl.put(DayOfWeek.TUESDAY, "Playing piano");
        sl.put(DayOfWeek.WEDNESDAY,"Yoga");
        sl.put(DayOfWeek.THURSDAY,"Reading book");

        Human Samin=new Human("Samin","Alakbarov",1982);
        Human Lala=new Human("Lala","Alakbarova",2003) ;
        Family fami=new Family(Lala,Samin);
        Human Eren=new Human("Eren","Alakbarov",2029,iq=100,Map<fami,cat);
        System.out.println(Eren);
        assertTrue(Eren.toString().equals("Human{name='Eren', surname='Alakbarov', year=2029, iq=100, schedule=[[MONDAY, TUESDAY, WEDNESDAY, THURSDAY], [Playing piano, Doing math, Yoga, Reading book]]}"));
    }
}