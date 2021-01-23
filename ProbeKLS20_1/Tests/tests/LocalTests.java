package tests;

import local.Local;
import local.LocalImpl;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class LocalTests {

    @Test
    public void test1() throws IOException {
        Local l = new LocalImpl();

        l.getLocalFileDatenspeicher().deleteFile("X");
        l.getLocalFileDatenspeicher().createFile("X"), null);
        l.getRemoteFileDatenspeicher().createFile("X"), null);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream daos = new DataOutputStream(baos);

        daos.writeUTF("Hallo");

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray);

        l.getLocalFileDatenspeicher().createFile("X", bais);

        l.copyFile("X", true);    }
}
