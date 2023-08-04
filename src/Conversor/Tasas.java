package Conversor;

import java.util.HashMap;
import java.util.Map;

public class Tasas {
    public static Map<String, Float> hash = new HashMap<>();
    static {
        hash.put("ARG", 1F);
        hash.put("USD", 0.00383436F);
        hash.put("EU", 0.0034931118F);
        hash.put("GBP", 0.0029863955F);
        hash.put("JPY", 0.54495122F);
        hash.put("KRW", 4.9785451F);

    }

    public static Float getHash(String arg) {
        return hash.get(arg);
    }

    public Tasas() {
    }





}
