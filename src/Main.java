import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите символ: ");
        char symbol = scanner.nextLine().charAt(0);
        int symbolNumber = convertSymbolToNumber(symbol);
        char symbolBack = convertNumberToSymbol(symbolNumber);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.println("Варианты хода рыцаря:");
        if (symbolNumber + 2 <= 8 && number + 1 <= 8) {
            char knightMoveSymbol = convertNumberToSymbol(symbolNumber + 2);
        System.out.println("- " + knightMoveSymbol + ", " + (number + 1));}
        if (symbolNumber + 2 <= 8 && number - 1 >= 1) {
            char knightMoveSymbol = convertNumberToSymbol(symbolNumber + 2);
        System.out.println("- " + knightMoveSymbol + ", " + (number - 1));}

        if (symbolNumber - 2 >= 1 && number + 1 <= 8) {
            char knightMoveSymbol = convertNumberToSymbol(symbolNumber - 2);
        System.out.println("- " + knightMoveSymbol + ", " + (number + 1));}
        if (symbolNumber - 2 >= 1 && number - 1 >= 1) {
            char knightMoveSymbol = convertNumberToSymbol(symbolNumber - 2);
        System.out.println("- " + knightMoveSymbol + ", " + (number - 1));}

        if (symbolNumber + 1 <= 8 && number + 2 <= 8) {
            char knightMoveSymbol = convertNumberToSymbol(symbolNumber + 1);
        System.out.println("- " + knightMoveSymbol + ", " + (number + 2));}

        if (symbolNumber - 1 >= 1 && number + 2 <= 8) {
            char knightMoveSymbol = convertNumberToSymbol(symbolNumber - 1);
        System.out.println("- " + knightMoveSymbol + ", " + (number + 2));}

        if (symbolNumber + 1 <= 8 && number - 2 >= 1) {
            char knightMoveSymbol = convertNumberToSymbol(symbolNumber + 1);
        System.out.println("- " + knightMoveSymbol + ", " + (number - 2));}

        if (symbolNumber - 1 >= 1 && number - 2 >= 1) {
            char knightMoveSymbol = convertNumberToSymbol(symbolNumber - 1);
        System.out.println("- " + knightMoveSymbol + ", " + (number - 2));}
    }

    public static int convertSymbolToNumber(char symbol) {
        // Переводим символ в нижний регистр, чтобы учесть 'A'-'H'
        symbol = Character.toLowerCase(symbol);

        // Вычисляем соответствующее число, отнимая код символа 'a'
        return symbol - 'a' + 1;
    }

    public static char convertNumberToSymbol(int number) {
        // Вычисляем соответствующий символ, прибавляя код символа 'a' и приводя к char
        return (char)(number + 'a' - 1);
    }
}
