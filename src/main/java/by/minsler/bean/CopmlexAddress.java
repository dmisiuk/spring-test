package by.minsler.bean;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Map;

/**
 * User: minsler
 * Date: 1/3/13
 * Time: 8:23 PM
 */
public class CopmlexAddress implements Address {

    private String name;

    public CopmlexAddress() {
    }

    @Override
    public String printAddress() {
        return toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CopmlexAddress that = (CopmlexAddress) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CopmlexAddress{" +
                "name='" + name + '\'' +
                '}';
    }
}

