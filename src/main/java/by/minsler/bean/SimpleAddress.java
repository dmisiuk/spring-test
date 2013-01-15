package by.minsler.bean;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Map;

/**
 * User: minsler
 * Date: 1/3/13
 * Time: 8:23 PM
 */
public class SimpleAddress implements Address {

    private static Logger logger = Logger.getLogger(SimpleAddress.class);


    private String[] alias;

    private Map<String, String> BuildingMap;

    private String street;

    public SimpleAddress() {
        logger.info("instantiate simpleaddress: " + this);
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String printAddress() {
        StringBuilder sb = new StringBuilder();
        sb.append("address........" + street);
        sb.append("\nalias:");
        for (String a : alias) {
            sb.append("\n\t" + a);
        }
        return sb.toString();
    }


    public void destroy() throws Exception {
        logger.info("destroyed simpleaddress: " + this);
    }

    public void afterPropertiesSet() throws Exception {
        logger.info("set properties for simpleaddress: " + this);
    }

    public String[] getAlias() {
        return alias;
    }

    public void setAlias(String[] alias) {
        this.alias = alias;
    }


    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        SimpleAddress.logger = logger;
    }

    public Map getBuildingMap() {
        return BuildingMap;
    }

    public void setBuildingMap(Map buildingMap) {
        BuildingMap = buildingMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleAddress that = (SimpleAddress) o;

        if (BuildingMap != null ? !BuildingMap.equals(that.BuildingMap) : that.BuildingMap != null) return false;
        if (!Arrays.equals(alias, that.alias)) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = alias != null ? Arrays.hashCode(alias) : 0;
        result = 31 * result + (BuildingMap != null ? BuildingMap.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SimpleAddress{" +
                "alias=" + (alias == null ? null : Arrays.asList(alias)) +
                ", BuildingMap=" + BuildingMap +
                ", street='" + street + '\'' +
                '}';
    }
}

