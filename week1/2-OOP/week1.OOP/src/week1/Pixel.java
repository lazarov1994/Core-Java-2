package week1;

public class Pixel {
	private float R,G,B; 
	Pixel(float r, float g, float b){
		R=r;
		G=g;
		B=b;
	}
	public String toString(){
		StringBuilder a = new StringBuilder();
		a.append(" (");
		a.append(R);
		a.append(", ");
		a.append(G);
		a.append(", ");
		a.append(B);
		a.append(") ");
		return a.toString();
		
	}
	public float getR() {
		return R;
	}
	public void setR(float r) {
		R = r;
	}
	public float getG() {
		return G;
	}
	public void setG(float g) {
		G = g;
	}
	public float getB() {
		return B;
	}
	public void setB(float b) {
		B = b;
	}
}
