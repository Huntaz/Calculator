package symbolic;

public abstract class Unary extends Sexpr{

    private Sexpr argument;
    
    public Unary(Sexpr a){
	argument = a;
    }

    public String toString() {
	return getName() + "(" + argument.toString() + ")";
    }
    
    public int priority() {
    }
}
