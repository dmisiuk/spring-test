package by.minsler.bean;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.Serializable;

/**
 * User: minsler
 * Date: 1/3/13
 * Time: 8:05 PM
 */
public class Person implements Serializable {

    private static Logger logger = Logger.getLogger(Person.class);

    private String name;
    private Long id;

    @Autowired
    @Qualifier("simpleAddress")
    private Address address;

    public Person(Address address) {
        this.address = address;
    }

    public Person() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String printSimpleAddress() {
        return address.printAddress();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != null ? !id.equals(person.id) : person.id != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (address != null ? !address.equals(person.address) : person.address != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }

    public void init() {
        logger.info("init person ");
    }

    public void destroy() {
        logger.info("destroy person ");
    }


}


