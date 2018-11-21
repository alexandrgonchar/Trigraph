package data_from_file;

import java.util.*;

public class WorkWithData {

    private ArrayList<String> trigraph = new ArrayList<>();
    private Map<String, Integer> trigraphMap = new TreeMap<>(Comparator.naturalOrder());

    public WorkWithData(List<String> lines) {
        for (String line : lines) {
            addTrigraphFromLine(line);
        }

        fillMap();
    }

    private void addTrigraphFromLine (String line) {
        for (int i = 0; i < line.length() - 2; i++) {
            StringBuilder build = new StringBuilder();

            if (line.charAt(i) != ' ') {
                build.append(line.charAt(i));
                build.append(line.charAt(i + 1));
                build.append(line.charAt(i + 2));

                trigraph.add(build.toString());
            }
        }
    }

    private void fillMap () {
        for (String string : trigraph) {
            if (!string.contains(" ")) {
                if (!trigraphMap.containsKey(string)) trigraphMap.put(string, 1);

                else trigraphMap.put(string, trigraphMap.get(string) + 1);
            }
        }
    }

    public void printMap () {
        for (Map.Entry<String, Integer> entry : trigraphMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
