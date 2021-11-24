package imagedisplay;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println(fileName + " was displayed");
    }

    public void loadFromDisk(String fileName) {
        System.out.println(fileName + " was loaded from disk");
    }
}
