package alphabet;

public class Alphabet {

    public static void main(String[] args) {

        char character='a';
        while (character<='z') {
            switch (character) {
                case 'a':
                    System.out.println("a is a vowel");
                    character ++;
                    continue;
                case 'e':
                    System.out.println("e is a vowel");
                    character ++;
                    continue;
                case 'i':
                    System.out.println("i is a vowel");
                    character ++;
                    continue;
                case 'o':
                    System.out.println("o is a vowel");
                    character ++;
                    continue;
                case 'u':
                    System.out.println("u is a vowel");
                    character ++;
                    continue;
                case 'y':
                    System.out.println("y is a vowel");

                    character ++;
                    continue;
            }
            System.out.println(character + " is a consonant");
            character++;
        }
    }
}
