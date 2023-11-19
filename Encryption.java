import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        menu.mainMenu();
    }
}
class MainMenu{
    MainMethods codding = new MainMethods();
    void mainMenu(){
        int choice;
        Scanner ask = new Scanner(System.in);
        Scanner ask2 = new Scanner(System.in);
        String sentence;
        int key;
        System.out.print("Which codding method do you want to use?\n1.1337\n2.Change letters\n3.Caesar method\n4.Column Method\n");
        choice = ask.nextInt();
        switch(choice){
            case 1:
                System.out.print("Do you want to code or decode?\n1.Code\n2.Decode\n");
                choice = ask.nextInt();
                switch(choice){
                    case 1:
                        System.out.print("Type a sentence to code: ");
                        sentence = ask2.nextLine();
                        codding.code1337(sentence);
                        break;
                    case 2:
                        System.out.print("Type a sentence to decode: ");
                        sentence = ask2.nextLine();
                        codding.decode1337(sentence);
                        break;
                    default:
                        System.out.println("Invalid operation number\nTry again later....");
                }
                break;
            case 2:
                System.out.print("Do you want to code or decode? \n1.Code\n2.Decode\n3.Receive more information about the key\n");
                choice = ask.nextInt();
                switch(choice){
                    case 1:
                        System.out.print("Type a sentence to code: ");
                        sentence = ask2.nextLine();
                        codding.codeChange(sentence);
                        break;
                    case 2:
                        System.out.print("Type a sentence to decode: ");
                        sentence = ask2.nextLine();
                        codding.decodeChange(sentence);
                        break;
                    case 3:
                        System.out.println("This key matches qwerty keyboards");
                        System.out.println("The first letter of latin alphabet(a) equals first letter of keyboard (q)");
                        System.out.println("And that is all for example c = e etc.");
                        break;
                    default:
                        System.out.println("Invalid operation number\nTry again later....");
                }
                break;
            case 3:
                System.out.print("Do you want to code or decode?\n1.Code\n2.Decode\n");
                choice = ask.nextInt();
                switch(choice){
                    case 1:
                        System.out.print("Type a sentence to code: ");
                        sentence = ask2.nextLine();
                        System.out.print("Type a integer value key that you want to use: ");
                        key = ask2.nextInt();
                        codding.codeCeasar(key, sentence);
                        break;
                    case 2:
                        System.out.print("Type a sentence to decode: ");
                        sentence = ask2.nextLine();
                        System.out.print("Type a key that was used to code this sentence: ");
                        key = ask2.nextInt();
                        codding.decodeCeasar(key, sentence);
                        break;
                    default:
                        System.out.println("Invalid operation number\nTry again later....");
                }
                break;
            case 4:
                System.out.print("Do you want to code or decode?\n1.Code\n2.Decode\n");
                choice = ask.nextInt();
                switch(choice){
                    case 1:
                        System.out.print("Type a sentence to code: ");
                        sentence = ask2.nextLine();
                        System.out.printf("Type a integer value key (more than 1 and less than %d): ",sentence.length());
                        key = ask2.nextInt();
                        codding.codeColumns(key, sentence);
                        break;
                    case 2:
                        System.out.print("Type a sentence to decode: ");
                        sentence = ask2.nextLine();
                        System.out.print("Type a key that was used to code this sentence: ");
                        key = ask2.nextInt();
                        codding.decodeColumns(key, sentence);
                        break;
                    default:
                        System.out.println("Invalid operation number\nTry again later....");
                }
                break;
            default:
                System.out.println("Invalid operation number\nTry again later....");
        }
    }
}
class MainMethods {
    void code1337(String sentence) {
        char letter;
        for (int i = 0; i < sentence.length(); i++) {
            letter = sentence.toLowerCase().charAt(i);
            switch (letter) {
                case 'a':
                    System.out.print("4");
                    break;
                case 'b':
                    System.out.print("8");
                    break;
                case 'e':
                    System.out.print("3");
                    break;
                case 'g':
                    System.out.print("6");
                    break;
                case 'l':
                    System.out.print("1");
                    break;
                case 'o':
                    System.out.print('0');
                    break;
                case 'r':
                    System.out.print("9");
                    break;
                case 's':
                    System.out.print("5");
                    break;
                case 't':
                    System.out.print("7");
                    break;
                case 'z':
                    System.out.print("2");
                    break;
                default:
                    System.out.print(sentence.charAt(i));
            }
        }
    }

    void decode1337(String sentence) {
        char letter;
        for (int i = 0; i < sentence.length(); i++) {
            letter = sentence.charAt(i);
            switch (letter) {
                case '4':
                    System.out.print("a");
                    break;
                case '8':
                    System.out.print("b");
                    break;
                case '3':
                    System.out.print("e");
                    break;
                case '6':
                    System.out.print("g");
                    break;
                case '1':
                    System.out.print("l");
                    break;
                case '0':
                    System.out.print("o");
                    break;
                case '9':
                    System.out.print("r");
                    break;
                case '5':
                    System.out.print('s');
                    break;
                case '7':
                    System.out.print("t");
                    break;
                case '2':
                    System.out.print("z");
                    break;
                default:
                    System.out.print(letter);
            }
        }
    }

    void codeChange(String sentence) {
        char letter;
        for (int i = 0; i < sentence.length(); i++) {
            letter = sentence.toLowerCase().charAt(i);
            switch (letter) {
                case 'a':
                    System.out.print('q');
                    break;
                case 'b':
                    System.out.print('w');
                    break;
                case 'c':
                    System.out.print('e');
                    break;
                case 'd':
                    System.out.print('r');
                    break;
                case 'e':
                    System.out.print('t');
                    break;
                case 'f':
                    System.out.print('y');
                    break;
                case 'g':
                    System.out.print("u");
                    break;
                case 'h':
                    System.out.print('i');
                    break;
                case 'i':
                    System.out.print('o');
                    break;
                case 'j':
                    System.out.print("p");
                    break;
                case 'k':
                    System.out.print("a");
                    break;
                case 'l':
                    System.out.print("s");
                    break;
                case 'm':
                    System.out.print("d");
                    break;
                case 'n':
                    System.out.print("f");
                    break;
                case 'o':
                    System.out.print("g");
                    break;
                case 'p':
                    System.out.print("h");
                    break;
                case 'r':
                    System.out.print("j");
                    break;
                case 's':
                    System.out.print("k");
                    break;
                case 't':
                    System.out.print("l");
                    break;
                case 'u':
                    System.out.print("z");
                    break;
                case 'w':
                    System.out.print("x");
                    break;
                case 'y':
                    System.out.print("c");
                    break;
                case 'z':
                    System.out.print("v");
                    break;
                default:
                    System.out.print(sentence.charAt(i));
            }
        }
    }

    void decodeChange(String sentence) {
        char letter;
        for (int i = 0; i < sentence.length(); i++) {
            letter = sentence.toLowerCase().charAt(i);
            switch (letter) {
                case 'q':
                    System.out.print('a');
                    break;
                case 'w':
                    System.out.print('b');
                    break;
                case 'e':
                    System.out.print('c');
                    break;
                case 'r':
                    System.out.print('d');
                    break;
                case 't':
                    System.out.print('e');
                    break;
                case 'y':
                    System.out.print('f');
                    break;
                case 'u':
                    System.out.print("g");
                    break;
                case 'i':
                    System.out.print('h');
                    break;
                case 'o':
                    System.out.print('i');
                    break;
                case 'p':
                    System.out.print("j");
                    break;
                case 'a':
                    System.out.print("k");
                    break;
                case 's':
                    System.out.print("l");
                    break;
                case 'd':
                    System.out.print("m");
                    break;
                case 'f':
                    System.out.print("n");
                    break;
                case 'g':
                    System.out.print("o");
                    break;
                case 'h':
                    System.out.print("p");
                    break;
                case 'j':
                    System.out.print("r");
                    break;
                case 'k':
                    System.out.print("s");
                    break;
                case 'l':
                    System.out.print("t");
                    break;
                case 'z':
                    System.out.print("u");
                    break;
                case 'x':
                    System.out.print("w");
                    break;
                case 'c':
                    System.out.print("y");
                    break;
                case 'v':
                    System.out.print("z");
                    break;
                default:
                    System.out.print(sentence.charAt(i));
            }
        }
    }

    void codeCeasar(int key, String sentence){
        int index;
        char letter;
        char[] word = new char[sentence.length()];
        for(int i = 0; i < sentence.length(); i++){
            letter = sentence.charAt(i);
            index = (int)letter + key;
            letter = (char) index;
            word[i] = letter;
        }
        for(char elem : word){
            System.out.print(elem);
        }
    }

    void decodeCeasar(int key, String sentence){
        int index;
        char letter;
        char[] word = new char[sentence.length()];
        for(int i = 0 ; i < sentence.length(); i++){
            letter = sentence.charAt(i);
            index = (int) letter - key;
            letter = (char) index;
            word[i] = letter;
        }
        for(char elem : word){
            System.out.print(elem);
        }
    }

    void codeColumns(int key, String sentence){
        HelpMethods columns = new HelpMethods();
        char[] array = new char[sentence.length()];
        int currentElement  = 1;
        int currentLine = 1;
        int operator = -3;
        int toAdd = 0;
        for(int i = 1; i <= sentence.length(); i++){
            if(currentElement == 1){
                array[currentLine + currentElement * 2 + operator] = sentence.charAt(i-1);
                currentElement ++;
            }else{
                toAdd += columns.calculatePieces(sentence, key, currentElement - 1);
                array[toAdd + currentLine - 1] = sentence.charAt(i - 1);
                currentElement ++;
                if(i % key == 0){
                    toAdd = 0;
                    currentElement = 1;
                    currentLine ++;
                }
            }
        }
        for(char elem : array){
            System.out.print(elem);
        }
    }

    void decodeColumns(int key, String sentence){
        HelpMethods columns = new HelpMethods();
        char[] array = new char[sentence.length()];
        int currentElement = 1;
        int currentLine = 1;
        int operator = -3;
        int toAdd = 0;
        for(int i = 1; i <= sentence.length(); i++){
            if(currentElement == 1){
                array[i - 1] = sentence.charAt(currentLine + currentElement * 2 + operator);
                currentElement ++;
            }else{
                toAdd += columns.calculatePieces(sentence, key, currentElement - 1);
                array[i - 1] = sentence.charAt(toAdd + currentLine - 1);
                currentElement ++;
                if(i % key == 0){
                    toAdd = 0;
                    currentElement = 1;
                    currentLine ++;
                }
            }
        }
        for(char elem : array){
            System.out.print(elem);
        }
    }
}
class HelpMethods{
    int calculatePieces(String word, int key, int column){
        int score = 0;
        int cycle = 1;
        for(int i = 1 ;i <= word.length(); i++){
            if(cycle == column){
                score ++;
            }
            cycle ++;
            if(i % key == 0){
                cycle = 1;
            }
        }
        return score;
    }
}