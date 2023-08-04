package Conversor;

import java.util.HashMap;
import java.util.Map;

public class Tasas {
    public static Map<String, Double> hash = new HashMap<>();
    static {
        hash.put("ARG", 1D);
        hash.put("USD", 0.00358767D);
        hash.put("EU", 0.00325895D);
        hash.put("GBP", 0.00281492D);
        hash.put("JPY", 0.508612D);
        hash.put("KRW", 4.67811D);

    }

    public static Double getHash(String arg) {
        return hash.get(arg);
    }

    public Tasas() {
    }





}
