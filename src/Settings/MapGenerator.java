package Settings;

import java.awt.*;

public class MapGenerator {
		
	public int map[][];
	public int brickWidth;
	public int brickHeight;

	public MapGenerator(int row, int col) {
		
		map = new int [row][col];

		for (int i=0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = 1;
			}
		}
		
		brickWidth = 540 / col;
		brickHeight = 135 / row;
	}
	
	public void draw(Graphics2D g) {
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] > 0) {

					if (i == 0)
						g.setColor(Color.RED);

					else if (i == 1)
						g.setColor(Color.GREEN);

					else if (i == 2)
						g.setColor(Color.CYAN);

					else if (i == 3)
						g.setColor(Color.ORANGE);

					else
						g.setColor(Color.WHITE);

					g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
					g.setStroke(new BasicStroke(3));

					g.setColor(Color.black);
					g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
				}
			}
		}
	}
	
	public void setBrickValue(int value, int row, int col){

		map[row][col] = value;
	}

}
