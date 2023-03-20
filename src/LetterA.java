public class LetterA {
    public static void main(String[] args) {
        int letter[] = {'r', 'g', 'f', 'a', 'A', 'U', 'e', 'Ż','a'};
        int j = 0;
        for (int i = 0; i < letter.length; i++) {
            if (letter[i] == 97 | letter[i] == 65) {
                j++;
            }
        }
        System.out.println(j);
    }
}
