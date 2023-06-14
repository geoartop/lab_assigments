package codeanalyzer;

import java.io.IOException;
import java.util.List;

public class NullFileReader implements SourceFileReader {

    @Override
    public List<String> readFileIntoList(String filepath) {

        return null;
    }

    @Override
    public String readFileIntoString(String filepath) {

        return null;
    }


}
