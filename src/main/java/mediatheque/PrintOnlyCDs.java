package mediatheque;

public class PrintOnlyCDs implements Visitor {

    @Override
    public void visit(Book b) {
        // on ne fait rien : ce n'est pas un CD
    }

    @Override
    public void visit(CD c) {
        System.out.println(c);
    }
}