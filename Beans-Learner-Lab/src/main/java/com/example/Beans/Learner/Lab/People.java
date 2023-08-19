package com.example.Beans.Learner.Lab;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{

    List<PersonType> personList = new ArrayList<>();

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public boolean add(PersonType p){
        return personList.add(p);
    }
    public boolean remove(PersonType p){
        return personList.remove(p);
    }
    public int size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> peeps){
        peeps.forEach(personList::add);
    }

    public PersonType findById(Long id){
        for(PersonType p: personList){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
    public List<PersonType> findAll(Long id){
        return personList;
    }
}
