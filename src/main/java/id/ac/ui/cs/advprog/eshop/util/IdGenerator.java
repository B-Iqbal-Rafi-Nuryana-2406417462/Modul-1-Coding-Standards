package id.ac.ui.cs.advprog.eshop.util;

public class IdGenerator {
    public static String generateId() {
        return java.util.UUID.randomUUID().toString();
    }
}
