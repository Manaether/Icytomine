package plugins.faubin.cytomine.gui.tileViewer;



import java.awt.image.BufferedImage;

public class Tile {
	
	String url;
	int c,r;
	public BufferedImage image;
	
	public Tile(String url, int c, int r) {
		super();
		this.url = url;
		this.c = c;
		this.r = r;
	}
	
	public int getC() {
		return c;
	}
	
	public int getR() {
		return r;
	}
	
	public String getUrl() {
		return url;
	}
	
}