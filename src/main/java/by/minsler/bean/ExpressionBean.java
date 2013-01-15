package by.minsler.bean;

import java.io.Serializable;

/**
 * User: minsler
 * Date: 1/10/13
 * Time: 7:46 PM
 */
public class ExpressionBean implements Serializable {

    private Double sum;
    private Double sub;
    private Double mod;
    private Double multi;

    public ExpressionBean() {
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getSub() {
        return sub;
    }

    public void setSub(Double sub) {
        this.sub = sub;
    }

    public Double getMod() {
        return mod;
    }

    public void setMod(Double mod) {
        this.mod = mod;
    }

    public Double getMulti() {
        return multi;
    }

    public void setMulti(Double multi) {
        this.multi = multi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExpressionBean that = (ExpressionBean) o;

        if (mod != null ? !mod.equals(that.mod) : that.mod != null) return false;
        if (multi != null ? !multi.equals(that.multi) : that.multi != null) return false;
        if (sub != null ? !sub.equals(that.sub) : that.sub != null) return false;
        if (sum != null ? !sum.equals(that.sum) : that.sum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sum != null ? sum.hashCode() : 0;
        result = 31 * result + (sub != null ? sub.hashCode() : 0);
        result = 31 * result + (mod != null ? mod.hashCode() : 0);
        result = 31 * result + (multi != null ? multi.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ExpressionBean{" +
                "sum=" + sum +
                ", sub=" + sub +
                ", mod=" + mod +
                ", multi=" + multi +
                '}';
    }
}
