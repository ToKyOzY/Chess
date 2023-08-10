public enum Player {
    WHITE("Beyaz", "W"),
    BLACK("Siyah", "B");

    private final String name;
    private final String colorCode;

    Player(String name, String colorCode) {
        this.name = name;
        this.colorCode = colorCode;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return colorCode;
    }
}
