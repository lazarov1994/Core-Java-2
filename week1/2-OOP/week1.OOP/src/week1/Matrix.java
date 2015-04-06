package week1;

public class Matrix  {
	private int height, width;
	private Pixel[][] matrix;
	
	Matrix(int height, int width){
		this.height = height;
		this.width = width;
		matrix =new Pixel[height][width];
	}
	void fillMatrix(){
		for(int i = 0 ; i <height ;i++ ){
			for(int j = 0 ; j < width ; j++ ){
				matrix[i][j] = new Pixel(5*i, 5*j, 5+i*j);
			}
		}
	}

	public Pixel[][] operate(MatrixOperation op){
	
		for(int i = 0 ; i < matrix.length ;i++ ){
			for(int j = 0 ; j < matrix[0].length ; j++){
				matrix[i][j] = op.withPixel(i, j, matrix);
			}
		}
		return matrix;
	}
	
	
	public String toString(){
		StringBuilder h = new StringBuilder();
		for(int i = 0; i < width ; i++){
			for(int j = 0 ; j < height ; j++){
				h.append(matrix[i][j].toString());
			}
				h.append(System.getProperty("line.separator"));
			//	h.append(System.getProperty("line.separator"));
		}
		return h.toString();
	}
	
	
	public static void main(String[] args) {
		MatrixOperation a = new ReduceBrightness();
		MatrixOperation b = new Grayscale();
		Matrix matrix = new Matrix(3,3);
		matrix.fillMatrix();
		System.out.println(matrix.toString());
		matrix.operate(a);
		System.out.println(matrix.toString());
		matrix.operate(b);
		System.out.println(matrix.toString());

		}
}
/*	public class BrightnessReduce implements MatrixOperation {

		public Pixel withPixel(int x, int y, Pixel[][] matrix) {
		
					return		matrix[x][y] = matrix[x-10][y-10];

			
		}
		public Pixel[][] operate(MatrixOperation op){
			
			for(int i = 0 ; i < matrix.length ;i++ ){
				for(int j = 0 ; j < matrix[0].length ; j++){
					matrix[i][j] = withPixel(i, j, matrix);
				}
			}
			return matrix;
		}
	}*/
	

