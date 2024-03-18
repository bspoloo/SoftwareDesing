package bspo.SoftwareDesing.ReadSquares;

import java.util.List;

public class Reader {
    private char[][] screen;
    public Reader(char[][] screen) {
        this.screen = screen;
    }

    public void getFrames(List<Frame> frames) {

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 50; j++) {

                if (screen[i][j] == '┌') {
                    frames.add(findFrame(i, j));
                }
            }
        }
    }

    public Frame findFrame(int x, int y) {
        int side = 2;

        boolean isLessLength = x + side <= 19;
        boolean isLessWidth = y + side <= 49;
        boolean isHorizontal = this.screen[x][y + side] == '─';
        boolean isVertical = this.screen[x + side][y] == '│';


        while (isLessLength && isLessWidth && isHorizontal && isVertical) {
            side++;
        }
        return new Frame(x, y, side);
    }

}
