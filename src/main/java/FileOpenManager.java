import javax.lang.model.element.NestingKind;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileOpenManager {

    private Map<String, String> keyMap;

    FileOpenManager() {
         keyMap = new HashMap<String, String>();
    }

    String getAppNameByExt(String ext) {

        ext = ext.toLowerCase();

        return keyMap.get(ext);
    }

    void addExtensionForApp(String app, String ext) {
        ext = ext.toLowerCase();
        app = app.toLowerCase();

        keyMap.put(ext, app);
    }

    void removeExtensipnForApp(String app, String ext) {
        ext = ext.toLowerCase();
        app = app.toLowerCase();

        keyMap.remove(ext, app);

    }

    List<String> getListOfRegisteredExtensions() {
        return (List<String>) keyMap.keySet();
    }

    List<String> getListOfApps() {
        return (List<String>) keyMap.values();
    }

}
