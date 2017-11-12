package results;


public class OutOfMemory {
    public static void main(String[] args) {
        int i = 10000000;
        int j = 10000000;
        int k = 10000000;

        Long[][][] l = new Long[i][j][k];
        Long ll = 999999999999999999L;
        for (int a=1; j<i ;a++) {
            for (int b = 0; b <j ; b++) {
                for (int c = 0; c <k ; c++) {
                    l[a][b][c]=ll;
                }
            }
        }
    }
}
