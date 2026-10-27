package mediatheque;

public class PrintOnlyBooks implements Visitor {

    @Override
    public void visit(Book b) {
        System.out.println(b);
    }

    @Override
    public void visit(CD c) {
        // on ne fait rien : ce n'est pas un livre
    }
}