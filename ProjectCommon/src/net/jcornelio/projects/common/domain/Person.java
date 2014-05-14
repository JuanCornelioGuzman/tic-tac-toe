package net.jcornelio.projects.common.domain;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 24, 2013
 * @version: 1.0
 **************************************************/
public class Person {
    
    private String lastName;
    private String firstName;
    private String middleName;
    private Integer age;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}

