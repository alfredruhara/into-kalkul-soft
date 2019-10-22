/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computersciencetools;

/**
 *
 * @author code
 */
public class ColorServerReturn {
    public int r, g, b;
		public String name;

		public ColorServerReturn(String name, int r, int g, int b) {
			this.r = r;
			this.g = g;
			this.b = b;
			this.name = name;
		}

		public int computeMSE(int pixR, int pixG, int pixB) {
			return (int) (((pixR - r) * (pixR - r) + (pixG - g) * (pixG - g) + (pixB - b)
					* (pixB - b)) / 3);
		}

		public int getR() {
			return r;
		}

		public int getG() {
			return g;
		}

		public int getB() {
			return b;
		}

		public String getName() {
			return name;
}
}

