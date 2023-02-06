package hu.pit.model.service;

import java.util.List;

public class DataApi {

    private final DataParser dataParser;
    private final FileReader fileReader;

    public DataApi(FileReader fileReader, DataParser dataParser) {
        this.fileReader = fileReader;
        this.dataParser = dataParser;
    }

    public List<Integer> getData(String filename) {
        return dataParser.parse(fileReader.read(filename));
    }


}
