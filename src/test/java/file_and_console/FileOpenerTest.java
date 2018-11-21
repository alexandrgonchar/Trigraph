package file_and_console;

import org.junit.Test;

import java.util.ArrayList;

public class FileOpenerTest {

    @Test
    public void readFile() {
        ArrayList<String> list = new ArrayList<>(FileOpener.readFile("/home/azathoth/sdfsdf.txt"));


//        assertEquals(6, list.size());
    }
}