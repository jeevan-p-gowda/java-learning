package BestPractices;
/**By using composition over inheritance, we can achieve below,
 * 1.Loose coupling
 * 2.Promote design patterns - Strategy pattern
 */
public class CompositionOverInheritance {
}
interface Displayable {
    void display();
}

class TextDisplay implements Displayable {
    @Override
    public void display() {
        System.out.println("Displaying text document");
    }
}

class PDFDisplay implements Displayable {
    @Override
    public void display() {
        System.out.println("Displaying PDF document");
    }
}

class Document {
    private Displayable displayStrategy;

    Document(Displayable displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    void display() {
        displayStrategy.display();
    }
}
class Executor{
    public static void main(String[] args) {
        Document doc = new Document(new PDFDisplay());
        doc.display();
    }
}