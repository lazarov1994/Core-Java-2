package week1;

public class ReduceBrightness implements MatrixOperation {
	Pixel[][] matrix;
	int height, width;
	Pixel a;

/*	ReduceBrightness(int height, int width) {
		this.height = height;
		this.width = width;
		matrix = new Pixel[height][width];
		
	}*/
	/*void fillMatrix(){
		for(int i = 0 ; i <height ;i++ ){
			for(int j = 0 ; j < width ; j++ ){
				matrix[i][j] = new Pixel(5, 5, 5);
			}
		}
	}

	void setMatrix(Pixel[][] m) {
		this.matrix = m;
	} */

	
	@Override
	public Pixel withPixel(int x, int y, Pixel[][] matrix) {
		float r = matrix[x][y].getR();
		float g = matrix[x][y].getG();
		float b = matrix[x][y].getB();
		matrix[x][y] = new Pixel(r/2, g/2 , b/2);
		return matrix[x][y];
	}

}
