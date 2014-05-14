package net.jcornelio.projects.calculator.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.jcornelio.projects.calculator.domain.Expression;
import net.jcornelio.projects.calculator.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 18, 2013
 * @version: 1.0
 **************************************************/
public class ExpressionAnalyzer {
    
    private static ExpressionAnalyzer expAnalyzer;
    private StringBuilder operatorRegEx;
    private StringBuilder operandRegEx;
    
    private ExpressionAnalyzer(){
        constructOperatorRegEx();
        constructOperandRegEx();
    }
    
    public static ExpressionAnalyzer getInstance(){
        if(expAnalyzer==null){
            expAnalyzer = new ExpressionAnalyzer();
        }
        return expAnalyzer;
    }
        
    public void extractExpression(String expr){
        String[] opd = expr.split(operatorRegEx.toString());
        for(String i: opd){
            Expression.getInstance().addOperand(i);
            System.out.println(i+" was added to operands");
        }
        System.out.println("Number of operands: "+Expression.getInstance().getOperands().size());
        
        String[] opr = expr.split(operandRegEx.toString());
        for(String i: opr){
            if(isValidOperator(i)){
                Expression.getInstance().addOperator(i);
                System.out.println(i+" was added to operators");
            }
        }
        System.out.println("Number of operators: "+Expression.getInstance().getOperators().size());
    }
    
    public void addToOperatorRegEx(String token){
        operatorRegEx.insert(operatorRegEx.toString().indexOf(Constants.CLOSE_BRACKET), Constants.BACKSLASH+token);
        System.out.println(Constants.BACKSLASH+token+" was added to the REGEX");
        System.out.println("REGEX value is now: "+operatorRegEx.toString());
    }
    
    public boolean isValidOperator(String operator){
        Pattern pattern = Pattern.compile(operatorRegEx.toString());
        Matcher matcher = pattern.matcher(operator);
	return matcher.matches();
    }

    private void constructOperandRegEx() {
        operandRegEx =  new StringBuilder(Constants.BLANK);
        operandRegEx.append(Constants.OPEN_BRACKET);
        operandRegEx.append(Constants.NUMBER_REGEX);
        operandRegEx.append(Constants.BACKSLASH+Constants.DOT);
        operandRegEx.append(Constants.CLOSE_BRACKET);
    }

    private void constructOperatorRegEx() {
        operatorRegEx = new StringBuilder(Constants.BLANK);
        operatorRegEx.append(Constants.OPEN_BRACKET);
        operatorRegEx.append(Constants.CLOSE_BRACKET);
    }
}

