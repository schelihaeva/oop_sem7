public class Main {
public static void main(String[] args) {
DocumentCreator creator = new TextDocumentCreator();
Document document = creator.createDocument();

document.open(); // "Opening text document..."
document.save(); // "Saving text document..."
document.close(); // "Closing text document..."

creator = new GraphicDocumentCreator();
document = creator.createDocument();

document.open(); // "Opening graphic document..."
// Другие операции с документом...
}
}