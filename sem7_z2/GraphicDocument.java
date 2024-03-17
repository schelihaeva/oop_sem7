package sem7_z2;
public class GraphicDocument extends Document {
    @Override
    public void open() {
    System.out.println("Opening graphic document...");
    }
    
    @Override
    public void close() {
    System.out.println("Closing graphic document...");
    }
    
    @Override
    public void save() {
    System.out.println("Saving graphic document...");
    }
    }
