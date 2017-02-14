package org.omidbiz.seamcat;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "customer")
public class Customer implements Serializable
{

    private Long id;
    private String name;
    private int age;
    
    
    @Transient
    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Id
    @GeneratedValue
    @Column(name="id")
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    @Column(name="customer_name")
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
