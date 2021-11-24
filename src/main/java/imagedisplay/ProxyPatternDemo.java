package imagedisplay;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage img = new ProxyImage("cat.png");
        img.display();
        // Won't print
        img.display();
    }
}
