package local;

import remote.Remote;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface Local {
    void createLocalFile(String filename, InputStream is);

    void connectToRemote(String hostname, int portnumber) throws IOException;

    void callRemoteMethods();

    void copyFileToRemote(String filename, InputStream is);

    void copyFileToLocal(String filename, OutputStream os);

    void getLocalFileDatenspeicher();

    void getRemoteFileDatenspeicher();
}
