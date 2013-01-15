package by.minsler.bean;

import java.io.Serializable;

/**
 * User: minsler
 * Date: 1/10/13
 * Time: 6:56 PM
 */
public class NullBean implements Serializable {

    private Object o;

    public NullBean(Object o) {
        this.o = o;
    }

    public NullBean() {
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    @Override
    public boolean equals(Object o1) {
        if (this == o1) return true;
        if (o1 == null || getClass() != o1.getClass()) return false;

        NullBean nullBean = (NullBean) o1;

        if (o != null ? !o.equals(nullBean.o) : nullBean.o != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return o != null ? o.hashCode() : 0;
    }


    @Override
    public String toString() {
        return "NullBean{" +
                "o=" + o +
                '}';
    }
}
