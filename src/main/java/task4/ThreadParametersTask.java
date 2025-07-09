package task4;

public class ThreadParametersTask {
    public static void main(String[] args) {
        String[][] messages = {
            {"Loading config...", "Config loaded", "System ready"},
            {"Connecting to server...", "Connection established", "Receiving data"},
            {"Starting engine...", "Engine running", "All systems go"},
            {"Initializing modules...", "Modules active", "Application running"},
            {"User login...", "Authentication successful", "Session started"},
            {"Scanning files...", "No threats found", "System secure"}
        };

        for (int i = 0; i < messages.length; i++) {
            Thread thread = new Thread(new TextSequencePrinter(messages[i]), "Worker-" + (i + 1));
            thread.start();
        }
    }
}
