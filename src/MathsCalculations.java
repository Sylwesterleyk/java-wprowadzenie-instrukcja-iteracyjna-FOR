public class MathsCalculations {
    public static void main(String[] args) {
        // zbiór liczb
        int numbers[] = {1, -32, 4, 8, 11, 42, -8, 3, 8, -1};

        // suma zbioru liczb
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Suma: " + sum);

        // iloczyn zbioru liczb
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i];
        }
        System.out.println("Iloczyn: " + product);

        //znajdź najmniejszą liczbę
        int najmniejsza = numbers[0];
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] < najmniejsza) {
                najmniejsza = numbers[a];
            }
        }
        System.out.println("Najmniejsza liczba: " + najmniejsza);

        //znajdź największą liczbę
        int największa = numbers[0];
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] > największa) {
                największa = numbers[a];
            }
        }
        System.out.println("Największa liczba: " + największa);


        // uporządkowanie zbioru od największej liczby
        for (int j = 0; j < numbers.length - 1; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        // wyświetlenie uporządkowanego zbioru
        System.out.print("Zbiór uporządkowany malejąco: ");
        for (int z = 0; z < numbers.length; z++) {
            if (z < numbers.length - 1) {
                System.out.print(numbers[z] + ", ");
            } else {
                System.out.println(numbers[z]);
            }
        }

        // mediana

        // uporządkowanie zbioru od najmniejszej liczby
        for (int j = 0; j < numbers.length - 1; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        // wyświetlenie mediany dla nieparzystej liczby elementów zbioru
        if (numbers.length % 2 == 1) {
            System.out.println("Mediana: " + numbers[numbers.length / 2]);
        } else {
            double mediana = ((numbers[numbers.length / 2] + numbers[numbers.length / 2 - 1]) / 2.0);
            System.out.println("Mediana: " + mediana);
        }
    }
}



