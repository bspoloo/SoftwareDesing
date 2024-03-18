package bspo.SoftwareDesing.ReadSquares;

public class Corner {
    private String cornerUpRight;
    private String cornerUpLeft;
    private String cornerBottomRight;
    private String cornerBottomLeft;
    public Corner(){
        this.cornerUpLeft = "";
        this.cornerUpRight = "";
        this.cornerBottomLeft = "";
        this.cornerBottomRight = "";
    }
    public String getCornerUpRight() {
        return cornerUpRight;
    }

    public void setCornerUpRight(String cornerUpRight) {
        this.cornerUpRight = cornerUpRight;
    }

    public String getCornerUpLeft() {
        return cornerUpLeft;
    }

    public void setCornerUpLeft(String cornerUpLeft) {
        this.cornerUpLeft = cornerUpLeft;
    }

    public String getCornerBottomRight() {
        return cornerBottomRight;
    }

    public void setCornerBottomRight(String cornerBottomRight) {
        this.cornerBottomRight = cornerBottomRight;
    }

    public String getCornerBottomLeft() {
        return cornerBottomLeft;
    }

    public void setCornerBottomLeft(String cornerBottomLeft) {
        this.cornerBottomLeft = cornerBottomLeft;
    }
}
