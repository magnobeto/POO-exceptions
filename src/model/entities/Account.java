
package model.entities;

import model.execeptions.DomainException;
/**
 *
 * @author Roberto
 */
public final class Account {
    
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    
    public Account(){
    }
    
    public Account(Integer number,String holder,Double balance,Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    
    public Integer getNumber(){
        return this.number;
    }
    
    public String getHolder(){
        return this.holder;
    }
    
    public void setHolder(String holder){
        this.holder = holder;
    }
    
    public Double getBalance(){
        return this.balance;
    }
    
    public Double getWithdrawLimit(){
        return this.withdrawLimit;
    }
    
    public void deposit(Double amount){
        this.balance += amount;
    }
    
    public void withdraw(Double amount) throws DomainException {
        if(amount > this.withdrawLimit){
            throw new DomainException ("the amount exceeds withdraw limit");
        }
        
        else if(amount > this.balance){
            throw new DomainException ("not enough balance");
        }
        this.balance -= amount;
    }
}
