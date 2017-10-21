public class Main {
    public static int selection(int arrey[]) {
        int min = 0;
        for (int i = 0; i < arrey.length; i++){
            int min = arrey[i];
              for (int j = i; j < arrey.length; j++) {
                  if (min > arrey[j]) {
                      min = arrey[j];
                  }
              }
        }

        return min;
    }

    public static void main(String[] args) {
        int a[] = {5, 3, 7, 2, 6};
        int resultat = selection(a);
        System.out.println("MIN:  " + resultat);
    }
}
