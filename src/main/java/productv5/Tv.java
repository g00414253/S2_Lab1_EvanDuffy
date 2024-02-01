package productv5;

public class Tv extends Product{
    private String Manufacture;
    private String Size;

    public Tv() {
        super();
        Manufacture = "";
        Size = "";
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String manufacture) {
        Manufacture = manufacture;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Manufacturer:" + Manufacture + "\n" + "Size:" + Size;
    }
}
