import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    @Test
    public void shouldGetLisrOfApps() {


        fileOpenManager.addExtensionForApp("VLC Viewer", "mpg");
        fileOpenManager.addExtensionForApp("PyCharm", "py");
        fileOpenManager.addExtensionForApp("Microsoft Word", "doc");


        String[] ret_apps = fileOpenManager.getListOfApps();

        String[] expected_apps = new String[] {
            "vlc viewer","pycharm","microsoft word"
        };

        assertArrayEquals (expected_apps, ret_apps);

    }
}