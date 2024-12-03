package software.ulpgc.kata2;

public class TsvTitleDeserializer implements TitleDeserializer{

    @Override
    public Title deserialize(String line) {
        return deserialize(line.split("\t"));
    }
    private Title deserialize(String[] split){
        return new Title(split[3],
                toInt(split[5]),
                toInt(split[7]));
    }

    private Integer toInt(String fields) {
        return fields.equals("\\N")?0 : Integer.parseInt(fields);
    }
}
