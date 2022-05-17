package ptiPOO;
import java.lang.Math;

public class Ponto {

		private int x, y;
		
		public Ponto() {
			x = 0;
			y = 0;
		}
		
		public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		void setX(int newX){
		    this.x = newX;
		}

		void setY(int newY){
		    this.y = newY;
		}
		
		public boolean equals(Ponto p) {
		    return this.x == ((Ponto)p).x && this.y == ((Ponto)p).y;
		}
			
		public double calculoDistancia (Ponto p) {
			return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
			
			}
		}



	



