package net.jcornelio.projects.calculator.logic;

import net.jcornelio.projects.calculator.domain.Expression;
import net.jcornelio.projects.calculator.domain.Operators;
import net.jcornelio.projects.calculator.util.Constants;
import net.jcornelio.projects.calculator.util.NumericHelper;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 20, 2013
 * @version: 1.0
 **************************************************/
public class ComputationPerformer {
    
    private static int index;

    public static void calculateExpresion(String expression){
        ExpressionAnalyzer.getInstance().extractExpression(expression);
        parseCalculation();
        index=0;
    }
    
    private static String performOperation(String expr, String op){
        String newExpr = expr;
        
        return newExpr;
    }

    private static Double calculate(int i) throws NumberFormatException {
        
        System.out.println("Operand1 = "+Expression.getInstance().getOperand(i));
        System.out.println("Operand2 = "+Expression.getInstance().getOperand(i+1));
        System.out.println("Index = "+index);
        System.out.println("Operator = "+Constants.OPERATOR[index]);
        System.out.println("Operation is = "+Operators.getInstance().getOperation(Constants.OPERATOR[index]).toString());
        System.out.println("Answer is: "+Operators.getInstance().getOperation(Constants.OPERATOR[index])
            .performCalculation(
                Double.valueOf(Expression.getInstance().getOperand(i)),
                Double.valueOf(Expression.getInstance().getOperand(i+1)
             )
        ));
        
        return Operators.getInstance().getOperation(Constants.OPERATOR[index])
            .performCalculation(
                Double.valueOf(Expression.getInstance().getOperand(i)),
                Double.valueOf(Expression.getInstance().getOperand(i+1)
             )
        );
    }

    private static void parseCalculation() throws NumberFormatException {
        if(Expression.getInstance().getOperands().size()>=2){
            for(int i=0; i<Expression.getInstance().getOperators().size();i++){
                if(Expression.getInstance().getOperator(i).equalsIgnoreCase(Constants.OPERATOR[index])){
                    Double result = calculate(i);
                    Expression.getInstance().removeOperator(i);
                    Expression.getInstance().removeOperand(i);
                    Expression.getInstance().removeOperand(i);
                    Expression.getInstance().addOperand(result.toString(), i);
                    System.out.println(Expression.getInstance().getOperands());
                    System.out.println(Expression.getInstance().getOperators());
                }
            }
            index++;
            parseCalculation();
        }
        String result = NumericHelper.roundOff(2, Double.valueOf(Expression.getInstance().getOperands().get(0)));
        Expression.getInstance().setResult(result);
    }
    
}

