import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class WhiskyCollectorTest {

    WhiskyCollector john;

    @Before
    public void setUp(){
        john = new WhiskyCollector("John Harper");
        Whisky aberlour = new Whisky("Aberlour", 12, WhiskyType.SINGLEMALT);
        Whisky highlandPark = new Whisky("Highland Park - Viking Scar", 12, WhiskyType.SINGLEMALT);
        Whisky glenfarclas = new Whisky("Glenfarclas", 16, WhiskyType.SINGLEMALT);
        Whisky johnnieWalker = new Whisky("Johnnie Walker - Red Label", 4, WhiskyType.BLENDED);
        Whisky chivasRegal = new Whisky("Chivas Regal", 10, WhiskyType.BLENDED);
        Whisky makersMark = new Whisky("Marker's Mark", 8, WhiskyType.BOURBON);
        Whisky bulleitBourbon = new Whisky("Bulleit", 6, WhiskyType.BOURBON);

        john.addWhisky(aberlour);
        john.addWhisky(highlandPark);
        john.addWhisky(glenfarclas);
        john.addWhisky(johnnieWalker);
        john.addWhisky(chivasRegal);
        john.addWhisky(makersMark);
        john.addWhisky(bulleitBourbon);
    }

    @Test
    public void johnHasSevenWhiskys(){
        assertEquals(7, john.numberOfWhiskys());
    }

    @Test
    public void findAllWhiskyByType(){
        ArrayList<Whisky> result = john.findAllWhiskyByType(WhiskyType.SINGLEMALT);
        assertEquals(3, result.size());
    }

    @Test
    public void canCountItemsByType(){
        HashMap<WhiskyType, Integer> whiskysByType = john.countWhiskysByType();
        assertEquals(3, whiskysByType.get(WhiskyType.SINGLEMALT).intValue());
        assertEquals(2, whiskysByType.get(WhiskyType.BLENDED).intValue());
        assertEquals(2, whiskysByType.get(WhiskyType.BOURBON).intValue());
    }
}
