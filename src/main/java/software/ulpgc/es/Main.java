package software.ulpgc.es;

import software.ulpgc.es.control.ToggleChartCommand;
import software.ulpgc.es.model.BarChartCreator;
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
        MainFrame mainFrame = new MainFrame();
        mainFrame.put("toggle", new ToggleChartCommand(mainFrame.getBarChartDisplay(), new BarChartCreator().getBarCharts()));
        mainFrame.setVisible(true);
    }
}
