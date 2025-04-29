enum Operator {
  ADD, SUBTRACT, MULTIPLY, DIVIDE
}

//Should not be instanciated with right_==0 and op_==DIVIDE
class Expression {
  double left_, right_;
  Operator op_;

  // added requirement
  Expression(double left, double right, Operator op){
    if (op == Operator.DIVIDE && right == 0.0) {
      throw new IllegalArgumentException("Division by zero");
    }
    this.left_ = left;
    this.right_ = right;
    this.op_ = op;
  }
  

  double evaluate() {  
    switch (this.op_) {
      case Operator.ADD:
        return this.left_ + this.right_;
      case Operator.SUBTRACT:
        return this.left_ - this.right_;
      case Operator.MULTIPLY:
        return this.left_ * this.right_;
      case Operator.DIVIDE:
        return this.left_ / this.right_;
      default:
        return 0.0;
    }
  }
}

class Debug {

  public static void main(String[] args) {
    // array too big so null was operator
    Operator[] ops = new Operator[4];
    ops[0] = Operator.SUBTRACT;
    ops[1] = Operator.MULTIPLY;
    ops[2] = Operator.ADD;
    // Moved division so it doesnt divide by zero
    ops[3] = Operator.DIVIDE;


    Expression[] exp = new Expression[ops.length];
    for (int i = 0; i < ops.length; ++i) {
      exp[i] = new Expression(i + 1, i, ops[i]);
    }

    for (int i = 0; i < ops.length; ++i) {
      System.out.println(exp[i].evaluate());
    }
  }
}

// 1. Null PointerException
// 2. division by 0
// 3. added comment requirements