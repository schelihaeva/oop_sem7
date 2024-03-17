package sem7_z2;

public class TextDocument extends Document {
    @Override
    public void open() {
    System.out.println("Opening text document...");
    }
    
    @Override
    public void close() {
    System.out.println("Closing text document...");
    }
    
    @Override
    public void save() {
    System.out.println("Saving text document...");
    }
    }
