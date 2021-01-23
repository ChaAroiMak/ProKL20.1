package remote;

import java.io.IOException;
import java.io.InputStream;

public interface Remote {
    void createFile(String filename, InputStream is) throws IOException;

    void deleteFile(String filename);

}
