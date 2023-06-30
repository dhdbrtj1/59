import java.awt.Desktop;
import java.net.URI;

public class Main {
    public static void main(String[] args) {
        String coinName = "Bitcoin";
        String url = "https://www.google.com/search?q=" + coinName;

        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
