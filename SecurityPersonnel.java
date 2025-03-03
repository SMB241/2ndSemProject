package PT;

public class SecurityPersonnel {
    private int ID;
    private String name;
    private String area;

    public SecurityPersonnel(int ID, String name, String area) {
        this.ID = ID;
        this.name = name;
        this.area = area;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }
}