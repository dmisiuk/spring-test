package by.minsler.bean;

import java.io.Serializable;

/**
 * User: minsler
 * Date: 1/10/13
 * Time: 6:57 PM
 */
public class ConstructorBean implements Serializable {

    private String name;


    public ConstructorBean(String name) {
        this.name = name;
    }

    public ConstructorBean() {
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

        ConstructorBean that = (ConstructorBean) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ConstructorBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
