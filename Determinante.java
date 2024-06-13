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
    public void run() {
        sarrus(matriz);
    }

    private void ac_4_matriz(float[][] m) {
        
    }

    private float sarrus(float[][] m) {
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
    
// Get
    public float getValor() {
        return det_sarrus;
    }


}