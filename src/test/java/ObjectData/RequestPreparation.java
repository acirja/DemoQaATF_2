package ObjectData;

import java.util.HashMap;

public interface RequestPreparation {

    //aceasta interfata are ca scop sa serializeze un request body specific

    void prepareObject(HashMap<String, String> testData);
}
