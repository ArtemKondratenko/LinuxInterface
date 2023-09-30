
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class CommandTest {

    @Test
    public  void lenDirAllTest() {

        Command command = new Command();
        int expected = 30;
        int actual = command.executingLsCommand().size();
        assertEquals(expected, actual);
    }
    @Test
    public  void executingCdCommandTest() {
        Command command = new Command();
        String com = "cd API";
        int expected = 6;
        int actual = command.executingCdCommand(com).size();
        assertEquals(expected, actual);
    }
    @Test
    public  void  creatingNewFileTest() throws IOException {
        Command command = new Command();
        String com = "touch index.html";
        int expected = 6;
        int actual = command.creatingNewFile(com).size();
        assertEquals(expected, actual);
    }
    @Test
    public void creatingNewMkDirTest() throws IOException {
        Command command = new Command();
        String com = "mkdir Home";
        int expected = 7;
        int actual = command.creatingNewMkDir(com).size();
        assertEquals(expected, actual);
    }
    @Test
    public void stepBackTest() {
        Command command = new Command();
        int expected = 30;
        int actual = command.stepBack().size();
        assertEquals(expected, actual);
    }
}