package software.ulpgc.es.model;

public class CsvPlayerDeserializer implements PlayerDeserializer {
    @Override
    public Player deserialize(String line) {
        return deserialize(line.split(","));
    }

    private Player deserialize(String[] values) {
        return new Player(values[1], values[2], values[3], values[4]);
    }
}
