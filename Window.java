import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public interface Window {
    static void open(String path) {
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
