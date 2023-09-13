/**
 * @aouther: Trever Hartman
 * @auther: Nyrijah Adams
 */

public class HelloXwing {
    /**
     * Returns a String containing a X-Wing ASCII-Art
     *
     * @return Ascii-Art String of an X-Wing
     */
    static String xwing() {
        return """
                           __
                .-.__      \\ .-.  ___  __
                |_|  '--.-.-(   \\/\\;;\\_\\.-._______.-.
                (-)___     \\ \\ .-\\ \\;;\\(   \\       \\ \\
                 Y    '---._\\_((Q)) \\;;\\\\ .-\\     __(_)
                 I           __'-' / .--.((Q))---'    \\,
                 I     ___.-:    \\|  |   \\'-'_          \\
                 A  .-'      \\ .-.\\   \\   \\ \\ '--.__     '\\
                 |  |____.----((Q))\\   \\__|--\\_      \\     '
                    ( )        '-'  \\_  :  \\-' '--.___\\
                     Y                \\  \\  \\       \\(_)
                     I                 \\  \\  \\         \\,
                     I                  \\  \\  \\          \\
                     A                   \\  \\  \\          '\\
                     |                    \\  \\__|           '
                                           \\_:.  \\
                                             \\ \\  \\
                                              \\ \\  \\
                                               \\_\\_|""";
    }

    public static void main(String[] args) {
        int number = 1;
        while (true) {
            System.out.println(HelloXwing.xwing());
            if (number >= 5) {
                break;
            }
            number = number + 1;
        }
        System.out.println(HelloXwing.xwing());
        // I made it post then I looked up how to make it reapt a limted amount. EX 5 times
    }
}
