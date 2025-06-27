package software.ulpgc.es.model;

import java.io.IOException;
import java.util.List;

public interface PlayerLoader {
    List<Player> load() throws IOException;
}
