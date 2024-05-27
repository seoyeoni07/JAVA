package assignment2;

public class DObjectMain {

	public static void main(String[] args) {
	        DObject start, n, obi;

	        start = new Line();
	        n = start;
	        obi = new Rect();
	        n.next = obi;
	        n = obi;
	        obi = new Line();
	        n.next = obi;
	        n = obi;
	        obi = new Circle();
	        n.next = obi;

	        while (start != null) {
	            start.draw();
	            start = start.next;
	        }
	    }
	}