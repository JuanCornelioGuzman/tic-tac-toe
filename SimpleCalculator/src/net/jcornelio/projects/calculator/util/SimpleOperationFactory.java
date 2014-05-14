package net.jcornelio.projects.calculator.util;

import net.jcornelio.projects.calculator.operation.*;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: September 09, 2013
 * @version: 1.0
 **************************************************/
public class SimpleOperationFactory {
	
    public Operation createOperation(String operator){
            
        Operation operation = null;

        if(Constants.OPERATOR[0].equals(operator)){
            operation = new MultiplicationOperation();
        }else if(Constants.OPERATOR[1].equals(operator)){
            operation = new DivisionOperation();
        }else if(Constants.OPERATOR[2].equals(operator)){
            operation = new AdditionOperation();
        }else if(Constants.OPERATOR[3].equals(operator)){
            operation = new SubtractionOperation();
        }else{
            operation = new DefaultOperation();
        }
        return operation;
    }

}
