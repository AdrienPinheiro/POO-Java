package tp_14_fichier;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ManipulationFichier {

    // copie de + de 25000 fait => copier que les 3 colonnes demandées.
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Workplace\\IntelliJ\\POO\\src\\tp_14_fichier\\recensement.csv");
        boolean estFichier = Files.isDirectory(path);
        boolean estLisible = Files.isReadable(path);
        System.out.println(path.getRoot()); // D:\
        System.out.println(path.getParent()); // D:\Workplace\IntelliJ\POO\src\tp_14_fichier
        System.out.println(path.getFileName()); // recensement.csv
        System.out.println(estFichier); // false
        System.out.println(estLisible); // true

        List<String> inputLines = Files.readAllLines(path);
        List<String> outputLines = new ArrayList<>();

        int nbrLine = 0;
        for(String line: inputLines){
            nbrLine++;
            line = line.trim().replaceAll(" ", "");
            String[] items = line.split(";");
            if(nbrLine == 1){
                List<String> finalmenu = new ArrayList<>();
                finalmenu.add(items[2]);
                finalmenu.add(items[6]);
                finalmenu.add(items[9]);
                outputLines.add(String.valueOf(finalmenu));
                continue;
            }
            if(parseInt(items[9]) > 25000){
                List<String> finalItem = new ArrayList<>();
                finalItem.add(items[2]);
                finalItem.add(items[6]);
                finalItem.add(items[9]);
                outputLines.add(String.valueOf(finalItem));
            }
        }
        System.out.println(outputLines.get(0));

        Path newPath = Paths.get("D:\\Workplace\\IntelliJ\\POO\\src\\tp_14_fichier\\recensement2.csv");
        Files.delete(newPath);
        Files.write(newPath, outputLines);
    }
}
