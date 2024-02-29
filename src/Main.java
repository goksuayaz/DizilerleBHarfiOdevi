public class Main {
    public static void main(String[] args) {
        int size = 7;
        String[][] array = new String[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 0 || i == size / 2 || i == size - 1) && j != size - 1 || j == 0)
                    array[i][j] = "*";
                else if (j == size - 1 && (i != 0 && i != size / 2 && i != size - 1))
                    array[i][j] = "*";
                else
                    array[i][j] = " ";
            }
        }


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}