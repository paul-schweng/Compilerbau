public class Compiler {

    public static void main(String[] args) {
        System.out.println("hee hee");
        // 3-(4+1)
        double d = (Double)new MinusExpr(new Literal(3), new PlusExpr(new Literal(4), new Literal(1))).eval();
        System.out.println(d);
    }
}

abstract class Expr{
    public Expr e1, e2;
    public Double d;

    public Expr(Expr e1, Expr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public Expr(Double d){
        this.d = d;
    }

    abstract Object eval();
}

class PlusExpr extends Expr{

    public PlusExpr(Expr e1, Expr e2) {
        super(e1, e2);
    }

    @Override
    Object eval() {
        return (Double)e1.eval() + (Double)e2.eval();
    }
}

class MinusExpr extends Expr{

    public MinusExpr(Expr e1, Expr e2) {
        super(e1, e2);
    }

    @Override
    Object eval() {
        return (Double) e1.eval() - (Double) e2.eval();
    }
}

class MultExpr extends Expr{

    public MultExpr(Expr e1, Expr e2) {
        super(e1, e2);
    }

    @Override
    Object eval() {
        return (Double)e1.eval() * (Double)e2.eval();
    }
}

class DivExpr extends Expr{

    public DivExpr(Expr e1, Expr e2) {
        super(e1, e2);
    }

    @Override
    Object eval() {
        return (Double)e1.eval() / (Double)e2.eval();
    }
}

class Literal extends Expr {

    public Literal(double d) {
        super(d);
    }


    @Override
    Object eval() {
        return d;
    }
}