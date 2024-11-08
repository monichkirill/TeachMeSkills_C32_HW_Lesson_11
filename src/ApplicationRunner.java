import operation.StringOperation;

public class ApplicationRunner {
    public static void main(String[] args) {
        String docNum = "1234-abc-5678-def-9x0y";
        System.out.println(StringOperation.first(docNum));
        System.out.println(StringOperation.second(docNum));
        System.out.println(StringOperation.third(docNum));
        System.out.println(StringOperation.fourth(docNum));
        System.out.println(StringOperation.fifth(docNum));
        System.out.println(StringOperation.sixth(docNum));
        System.out.println(StringOperation.seventh(docNum));
    }
}
