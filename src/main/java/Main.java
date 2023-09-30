import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//ls, cd, touch, mkdir, cat, nano - писать в файл, cd ..
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Command command = new Command();
        while (true) {
            String com = sc.nextLine();
            String[] pasCom = com.split(" ");
            if(pasCom[0].equals("Exit")){
                break;
            }
            if (pasCom[0].equals("ls")) {
                System.out.println(command.executingLsCommand());
            } else if (pasCom[0].equals("cd")) {
                System.out.println(command.executingCdCommand(com));
            } else if (pasCom[0].equals("touch")) {
                System.out.println(command.creatingNewFile(com));
            } else if (pasCom[0].equals("mkdir")) {
                System.out.println(command.creatingNewMkDir(com));
            } else if (pasCom[0].equals("cd..")) {
                System.out.println(command.stepBack());
            }
        }
    }
}