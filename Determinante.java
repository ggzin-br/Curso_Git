import java.util.ArrayList;

class Determinante { // -> Reduzir até o método de Sarrus
// Atributos
private int i, j;
private float[][] matriz = new float[i][j];

public Determinante(float[][] matriz, int i, int j) {
    this.matriz = matriz;
    this.i = i;
    this.j = j;
}

// Métodos

    public float run() {

        ac_4_matriz(matriz);


    }

    private ArrayList<Float[][]> conversor_mat3(ArrayList<Float[][]> m) {
    // Atributos
    ArrayList<Float[][]> lista_mat = new ArrayList<Float[][]>();
    Float[][] matriz_temp = new Float[m.length][m[0].length];

    for (int array = 0; array < m.size(); array++) {

        if (m.get(array)[0].length >= 3) { //
            for (int j = 0; j < this.j; j++) {
                if (m.get(array)[0][j] != 0) {

                    for (int i = 0; i < this.i; i++) {
                        for (int k = 0; j < this.j; j++) {

                            if (k != j || i != 0) {
                                matriz_temp[i][k] = matriz[i][k];
                            }

                        }
                    }

                    lista_mat.add(matriz_temp);

                }
            }
        }
    }
    if (lista_mat.getFirst().length > 3) {
        conversor_mat3(lista_mat);
    }
    else {
        for (int i = 0; i < lista_mat.size(); i++) {
            sarrus(lista_mat.get(i));
        }
    }

    }

    private float sarrus(Float[][] m) {
    return (
                (
                m[0][0] * m[1][1] * m[2][2] +
                m[0][1] * m[1][2] * m[2][0] +
                m[0][2] * m[1][0] * m[2][1]
                )
                -
                (
                m[0][2] * m[1][1] * m[2][0] +
                m[0][0] * m[1][2] * m[2][1] +
                m[0][1] * m[1][0] * m[2][2]
                )
            );
    }

}

class Print {
    public static void main(String[] args) {

        float[][] mat = {
                        {1, 2, 1},
                        {1, 2, 1},
                        {1, 2, 1}
                        };

        Determinante det = new Determinante(mat, 3, 3);
        System.out.println(det.run());
    }
}