package factory;

import java.io.File;

public class FileLogger implements Logger{
    @Override
    public void log(String str) {
        File file = new File("/.");
    }
}
