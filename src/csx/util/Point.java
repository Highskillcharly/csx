package csx.util;

public class Point {

	int x, y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){return x;}
	public int getY(){return y;}
	
	public void move(Direction d){
		switch (d) {
		case EAST:	x++;	break;
		case NORTH:	y--;	break;
		case SOUTH:	y++;	break;
		case WEST:	x--;	break;
		case NORTHWEST:	y--; x--;break;
		case SOUTHWEST:	y++; x--;break;
		case NORTHEAST:	y--; x++;break;
		case SOUTHEAST:	y++; x++;break;
		default: break;
		}
	}
	
	
}