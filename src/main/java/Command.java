import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Command {
    public List<String> executingLsCommand() {
        File file = new File("C:\\");
        List<String> lsFiles = new ArrayList<>();
        for (File file1 : file.listFiles()) {
                lsFiles.addAll(Collections.singleton(file1.getName()));
            }
        return lsFiles;
    }

//     Переход в определенную дерикторию и получение содержимого дериктории
    public List<String> executingCdCommand(String com) {
        String[] pasCom = com.split(" ");
        String root = "C:\\";
        root = root + "\\" + pasCom[1];
        File file = new File(root);
        List<String> lsFiles = new ArrayList<>();
        for (File file1 : file.listFiles()) {
            lsFiles.addAll(Collections.singleton(file1.getName()));
        }
        return lsFiles;
    }
//    // создание нового файла
    public List<String> creatingNewFile(String com) throws IOException {
        String[] pasCom = com.split(" ");
        String root = "C:\\QA\\";
        String root1 = root + "\\" + pasCom[1];
        File file = new File(root1);
        file.createNewFile();
        File file2 = new File(root);

        List<String> lsFiles = new ArrayList<>();

        for (File file1 : Objects.requireNonNull(file2.listFiles())) {
            lsFiles.add(file1.getName());
        }
        return lsFiles;
    }
    // Создание новой папки
    public List<String> creatingNewMkDir(String com) throws IOException {

        String[] pasCom = com.split(" ");
        String root = "C:\\QA\\";
        String root1 = root + "\\" + pasCom[1];
        File file = new File(root1);
        file.mkdir();
        File file2 = new File(root);
        List<String> lsFiles = new ArrayList<>();
        for (File file1 : file2.listFiles()) {
            lsFiles.addAll(Collections.singleton(file1.getName()));
        }

        return lsFiles;
    }
// Возврат на папку назад
    public List<String> stepBack() {

        String root = "C:\\Users\\ArtemITJava\\API";
        String updatedRoot = root.replace("API", "");
        File file = new File(updatedRoot);
        List<String> lsFiles = new ArrayList<>();
        for (File file1 : file.listFiles()) {
            lsFiles.addAll(Collections.singleton(file1.getName()));
        }
        return lsFiles;
    }
}
