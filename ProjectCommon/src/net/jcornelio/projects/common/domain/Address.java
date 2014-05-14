package net.jcornelio.projects.common.domain;

import net.jcornelio.projects.common.utils.checker.NullCheck;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 24, 2013
 * @version: 1.0
 **************************************************/
public class Address {
    
    private String country;
    private String province;
    private String cityOrTown;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();       
        sb.append(NullCheck.ifNullOrBlank(cityOrTown, country));
        sb.append(NullCheck.ifNullOrBlank(province, country));
        sb.append(NullCheck.ifNullOrBlank(country, country));
        return sb.toString(); 
    }
    
}

