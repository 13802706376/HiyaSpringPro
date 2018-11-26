package com.hiya.ee.spring.ioc;

public class PersonNonCons
{
    private String name;
    private Integer id;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Person [name=" + name + ", id=" + id + "]";
    }
}
