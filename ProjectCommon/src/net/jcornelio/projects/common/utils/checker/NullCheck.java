package net.jcornelio.projects.common.utils.checker;

import net.jcornelio.projects.common.utils.Constant;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 24, 2013
 * @version: 1.0
 **************************************************/
public class NullCheck {
    
    public static String ifNull(String str, String defaultValue){
        if(str==null){
            return defaultValue;
        }else{
            return str;
        }
    }
    
    public static String ifNullOrBlank(String str, String defaultValue){
        if(str==null||Constant.BLANK.equals(str)){
            return defaultValue;
        }else{
            return str;
        }
    }

}

