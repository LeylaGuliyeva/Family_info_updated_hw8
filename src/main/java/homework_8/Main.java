package homework_8;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        DomesticCat cat=new DomesticCat("Kandela",2,99,Arrays.stream(new String[]{"Eating","Sleeping","Creating a mess"}).collect(Collectors.toSet()));
        cat.eat();
        cat.respond();
        cat.foul();

        Dog maxie = new Dog("Max");
        maxie.eat();
        maxie.foul();
        maxie.respond();
        System.out.println(maxie);

        String sl[][]={{DayOfWeek.MONDAY.name(),DayOfWeek.TUESDAY.name(),DayOfWeek.WEDNESDAY.name(),DayOfWeek.THURSDAY.name(),DayOfWeek.FRIDAY.name(),DayOfWeek.SATURDAY.name(),DayOfWeek.SUNDAY.name()},{"Playing piano","Doing math","Yoga","Reading book","Watching AOT"}};
        byte iq=100;
        Human Samin=new Human("Samin","Alakbarov",1982);
        Human Lala=new Human("Lala","Alakbarova",2003) ;
        Family fami=new Family(Lala,Samin);
        Human Eren=new Human("Eren","Alakbarov",2029);
        Human Erem=new Human("Erem","Alakbarov",2028);
        Human Milan;
        for(int i=0;i<100000;i++){
            Milan=new Human("Milan","Muradov",2010);
        }

        fami.addChild(Eren);
        fami.addChild(Erem);
        System.out.println(Samin);
        System.out.println(Lala);
        System.out.println(cat);
        System.out.println(Eren);
        System.out.println(fami);
        System.out.println("Count : "+fami.countFamily());
    }
}
