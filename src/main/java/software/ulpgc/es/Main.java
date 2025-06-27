package software.ulpgc.es;

import software.ulpgc.es.model.CsvPlayerDeserializer;
import software.ulpgc.es.model.FilePlayerLoader;
import software.ulpgc.es.model.Player;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/clase/Asignaturas_tercero/is2/kata3/dataset/players_data-2024_2025.csv");
        List<Player> players = new FilePlayerLoader(file, new CsvPlayerDeserializer()).load();

        Map<String, String> data = new HashMap<>();
        for (Player player: players) {
            data.put(player.getName(), player.getNacionality());
        }
        for (String playerName: data.keySet()){
            System.out.println(playerName + "\t" + data.get(playerName));
        }
    }
}
