/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set_HashSet;

import java.util.Objects;

/**
 *
 * @author jhone
 */
public class Cliente {
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    @SuppressWarnings("FieldMayBeFinal")
    private String n_Account;
    @SuppressWarnings("FieldMayBeFinal")
    private double cash;

    public Cliente(String name, String n_Account, double cash) {
        this.name = name;
        this.n_Account = n_Account;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getN_Account() {
        return n_Account;
    }

    public void setN_Account(String n_Account) {
        this.n_Account = n_Account;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.n_Account);
        return hash;
    }

    @Override   
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.n_Account, other.n_Account)) {
            return false;
        }
        return true;
    }
    

}
