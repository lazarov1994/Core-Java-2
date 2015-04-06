package week1;

public class BrightnessReduce implements MatrixOperation {

	BrightnessReduce(int height, int weight) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pixel withPixel(int x, int y, Pixel[][] matrix) {
		// TODO Auto-generated method stub
						matrix[x][y] = matrix[x-10][y-10];

		return null;
	}
	

}
