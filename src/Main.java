public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        System.out.println(Main.sumDigits(12345));
        System.out.println(Main.sumDigits(10));
        System.out.println(Main.sumDigits(5059191));

        System.out.println(Main.sumDigitsFromChar(12345));
        System.out.println(Main.sumDigitsFromChar(10));
        System.out.println(Main.sumDigitsFromChar(5059191));
    }

    public static int sumDigits(int number)
    {
        var str = String.valueOf(number);
        var sum = 0;

        for (var i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return sum;
    }

    public static int sumDigitsFromChar(int number)
    {
        var str = String.valueOf(number);
        var sum = 0;

        for (var i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }

        return sum;
    }
}
