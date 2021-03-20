package BB;

import java.awt.*;

public class MapGenerator {

    public int map[][];
    public int brickHeight;
    public int brickWidth;

    public MapGenerator(int col, int row) {
        map = new int[row][col];
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[0].length; j++) {
                map[i][j] = 1;
            }
        }
        brickWidth = 540/col;
        brickHeight = 150/row;
    }

    public void draw(Graphics2D g) {
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.black);
                    g.fillRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(10));
                    g.setColor(Color.white);
                    g.drawRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int col) {
        map[row][col] = value;
    }
}