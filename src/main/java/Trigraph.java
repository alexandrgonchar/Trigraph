import data_from_file.WorkWithData;
import file_and_console.FileOpener;


public class Trigraph {
    public static void main(String[] args) {
        WorkWithData data = new WorkWithData(FileOpener.readFile(FileOpener.readFileName()));

        data.printMap();
    }
}
