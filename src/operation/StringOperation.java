package operation;

public class StringOperation {
    public static String first(String docNumber) {
        String[] parts = docNumber.split("-");
        return parts[0] + " " + parts[2];
    }

    public static String second(String docNumber) {
        return docNumber.replaceAll("[a-zA-Z]{3}", "***");
    }

    public static String third(String docNumber) {
        String[] parts = docNumber.split("-");
        return parts[0].toLowerCase() + "/" + parts[1].toLowerCase() + "/" + parts[2].toLowerCase() + "/" + parts[3].toLowerCase();
    }

    public static String fourth(String docNumber) {
        String[] parts = docNumber.split("-");
        StringBuilder sb = new StringBuilder("Letters:");
        sb.append(parts[0].toUpperCase()).append("/")
                .append(parts[1].toUpperCase()).append("/")
                .append(parts[2].substring(0,1).toUpperCase()).append("/")
                .append(parts[3].substring(2,3).toUpperCase()).append("/");
        return sb.toString();
    }

    public static boolean fifth(String docNumber) {
        return docNumber.toLowerCase().contains("abc");
    }

    public static boolean sixth(String docNumber) {
        return docNumber.startsWith("555");
    }

    public static boolean seventh(String docNumber) {
        return docNumber.endsWith("1a2b");
    }
}
