package net.jcornelio.projects.calculator.domain;

import java.util.ArrayList;
import java.util.HashMap;
import net.jcornelio.projects.calculator.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: September 09, 2013
 * @version: 1.0
 **************************************************/
public class Expression {

    private ArrayList<String> operands;
    private ArrayList<String> operators;
    private HashMap<String, Integer> operationExecution;
    private String result;
    private static Expression expr;
    
    private Expression(){
        operands = new ArrayList<String>();
        operators = new ArrayList<String>();
        operationExecution = new HashMap<String, Integer>();
    }
    
    public static Expression getInstance(){
        if(expr==null){
            expr = new Expression();
        }
        return expr;
    }
    
    public void addOperator(String opr){
        operators.add(opr);
    }
    
    public void removeOperator(String opr){
        operators.remove(opr);
    }
    
    public void removeOperator(int index){
        operators.remove(index);
    }
    
    public void addOperand(String opd){
        operands.add(opd);
    }
    
    public void addOperand(String opd, int index){
        operands.add(index, opd);
    }
    
    public void removeOperand(String opd){
        operands.remove(opd);
    }
    
    public void removeOperand(int index){
        operands.remove(index);
    }
    
    public ArrayList<String> getOperands() {
        return operands;
    }

    public void setOperands(ArrayList<String> operands) {
        this.operands = operands;
    }

    public ArrayList<String> getOperators() {
        return operators;
    }

    public void setOperators(ArrayList<String> operators) {
        this.operators = operators;
    }
    
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    public void addOperationInExecution(String op, Integer precedence){
        operationExecution.put(op, precedence);
    }
    
    public HashMap<String, Integer> getOperationExecution(){
        return operationExecution;
    }
    
    public void clearOperators(){
        operators.clear();
    }
    
    public void clearOperands(){
        operands.clear();
    }
    
    public String getOperand(int index){
        return operands.get(index);
    }
    
    public String getOperator(int index){
        return operators.get(index);
    }
    
    public void clearAll(){
        operators.clear();
        operands.clear();
        operationExecution.clear();
        result = Constants.BLANK;
    }
}
