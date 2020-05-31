import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {

    FileOpenManager fileOpenManager = new FileOpenManager();

    @Test
    public void shouldAddOneRecord() {

        String app = "Microsoft Excel";
        String ext = "XLS";

        fileOpenManager.addExtensionForApp(app, ext);

        String ret_app = fileOpenManager.getAppNameByExt("xls");

        assertEquals(app.toLowerCase(), ret_app);

    }

}