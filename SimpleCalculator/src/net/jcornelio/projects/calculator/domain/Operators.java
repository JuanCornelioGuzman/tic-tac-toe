package net.jcornelio.projects.calculator.domain;

import java.util.Collection;
import java.util.HashMap;
import javax.swing.JButton;
import net.jcornelio.projects.calculator.operation.Operation;
import net.jcornelio.projects.calculator.util.Constants;
import net.jcornelio.projects.calculator.util.SimpleOperationFactory;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 19, 2013
 * @version: 1.0
 **************************************************/
public class Operators {

    private static Operators opt;
    private HashMap<String, Operation> operations;
    private HashMap<String, JButton> operators;
    private HashMap<String, Integer> precedence;

    private Operators() {
        operations = new HashMap<String, Operation>();
        operators = new HashMap<String, JButton>();
        precedence = new  HashMap<String, Integer>();
        populatePrecedence();
    }
    
    public static Operators getInstance(){
        if(opt==null){
            opt = new Operators();
        }
        return opt;
    }
    
    private void populatePrecedence(){
        for(int i=0; i<Constants.OPERATOR.length; i++){
            precedence.put(Constants.OPERATOR[i], i+1);
        }
        System.out.println("Operator Precedence Values:");
        for(int i=0; i<precedence.size(); i++){
            System.out.print(Constants.OPERATOR[i]+"\t");
            System.out.println(precedence.get(Constants.OPERATOR[i]));
        }
    }    
    
    public void addToOperations(String operator){
        SimpleOperationFactory sof = new SimpleOperationFactory();
        operations.put(operator, sof.createOperation(operator));
    }
    
    public void addToOperators(JButton opButton){
        operators.put(opButton.getText(), opButton);
    }
    
    public Collection<JButton> getAllOperators(){
        return operators.values();
    }
    
    public Collection<String> getOperatorPrecedence(){
        return precedence.keySet();
    }
    
    public boolean containsOperator(String op){
        return operators.containsKey(op);
    }
    
    public Integer getPrecedence(String op){
        return precedence.get(op);
    }
    
    public HashMap<String, Integer> getPrecedence(){
        return precedence;
    }
    
    public Operation getOperation(String op){
        return operations.get(op);
    }
    
}

