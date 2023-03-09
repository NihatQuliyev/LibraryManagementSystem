package util;

import static util.InputUtil.*;
public class MenuUtil {
    public static byte entry(){
        System.out.println("[1] -> Register\n" +
                            "[2] -> Show\n" +
                            "[3] -> Update\n" +
                            "[4] -> Delete\n" +
                            "[5] -> Search\n" +
                            "[6] -> Storage to Stock\n");
        return byteInput("Enter the option: ");
    }

    public static byte entryShow(){
        System.out.println("[1] -> Storage\n" +
                "[2] -> Stocks\n");
        return byteInput("Enter the option: ");
    }
    public static String entryDetail(){
        System.out.println("Detailed information book! ");
        return stringInput("Enter the book name: ");
    }

    public static byte entrySearch(){
        System.out.println("[1] -> Name\n" +
                           "[2] -> Author\n" +
                           "[3] -> Genre\n");

        return byteInput("Enter the option search : ");
    }
}
