package software.ulpgc.es;

import software.ulpgc.es.control.ToggleChartCommand;
import software.ulpgc.es.model.CsvPlayerDeserializer;
import software.ulpgc.es.model.FilePlayerLoader;
import software.ulpgc.es.model.Player;
import software.ulpgc.es.view.MainFrame;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/clase/Asignaturas_tercero/is2/kata3/dataset/players_data-2024_2025.csv");
        List<Player> players = new FilePlayerLoader(file, new CsvPlayerDeserializer()).load();

        MainFrame mainFrame = new MainFrame();
        mainFrame.put("toggle", new ToggleChartCommand());
        mainFrame.setVisible(true);
    }
}
