package week1;

public class Grayscale implements MatrixOperation {
	public Pixel withPixel(int x, int y, Pixel[][] matrix) {
		float r = matrix[x][y].getR();
		float g = matrix[x][y].getG();
		float b = matrix[x][y].getB();
		float sum = (float) (r*0.21 + g*0.72 + b*0.07);
		matrix[x][y] = new Pixel(sum, sum, sum);
		return matrix[x][y];
	}

}
