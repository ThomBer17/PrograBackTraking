public class Main {

    static int N = 4; 
    static int soluciones = 0;

    public static void main(String[] args) {
        int[] tablero = new int[N];
        colocar(0, tablero);
        System.out.println("Cantidad total de soluciones: " + soluciones);
    }

    
    public static void colocar(int fila, int[] tablero) {
        if (fila == N) { 
            soluciones++;
            imprimirTablero(tablero);
            return;
        }

        for (int col = 0; col < N; col++) {
            if (esValido(fila, col, tablero)) {
                tablero[fila] = col;
                colocar(fila + 1, tablero);
            }
        }
    }

    public static boolean esValido(int fila, int col, int[] tablero) {
        for (int i = 0; i < fila; i++) {
            if (tablero[i] == col) { 
                return false;
            }
        }
        return true;
    }

    public static void imprimirTablero(int[] tablero) {
        System.out.println("Solución:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (tablero[i] == j) {
                    System.out.print("E "); 
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
