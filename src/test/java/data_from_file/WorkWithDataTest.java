package data_from_file;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.*;

public class WorkWithDataTest {
    private ArrayList<String> list;
    private WorkWithData workWithData;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<>();
        list.add(null);
        list.add("Asada sd sdasd rut");
        list.add("sd fr ty ki o ");
        list.add("                         ");

        workWithData = new WorkWithData(list);
    }

    @Test
    public void addTrigraphFromLine() {
        boolean isTrigraph = true;

        for (String line : workWithData.getTrigraph()) {
            if (line.length() != 3) isTrigraph = false;
        }

        assertTrue(isTrigraph);
        assertEquals(21, workWithData.getTrigraph().size());

        boolean wrongSymbol = false;

        for (Map.Entry<String, Integer> entry : workWithData.getTrigraphMap().entrySet()) {
            if (entry.getKey().contains(" ")) wrongSymbol = true;
        }

        assertFalse(wrongSymbol);
        assertEquals(7, workWithData.getTrigraphMap().size());
    }

    @After
    public void tearDown() throws Exception {
        list = null;
        workWithData = null;
    }
}