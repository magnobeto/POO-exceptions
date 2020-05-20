
package model.execeptions;
/**
 *
 * @author Roberto
 */
public class DomainException extends Exception {
    
    private String msg;
    
    public DomainException(String msg){
        super(msg);
    }
}
