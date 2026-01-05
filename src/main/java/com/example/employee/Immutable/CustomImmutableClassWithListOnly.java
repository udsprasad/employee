package com.example.employee.Immutable;

import com.example.employee.models.MutableObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class CustomImmutableClassWithListOnly {
    final String name;
    final int age;
    final List<String> hobbies;
    final List<MutableObject> mutableObjects;


    public CustomImmutableClassWithListOnly(String name, int age, List<String> hobbies, List<MutableObject> mutableObjects) {
        this.name = name;
        this.age = age;
        //this.hobbies = hobbies; // this is not immutable

        /*Collections.unmodifiableList() creates a read-only view of the list. ✅
        BUT: if the original hobbies list is modified after passing it to the constructor, your supposedly "immutable" object can see changes,
        because unmodifiableList is just a wrapper. */

        //this.hobbies = Collections.unmodifiableList(hobbies);

        //correct way is defensive copy + unmodifiable

        this.hobbies = Collections.unmodifiableList(new ArrayList<>(hobbies));
        // this works for string of list because it is immutable

        // Defensive copy + deep copy + unmodifiable
        this.mutableObjects = mutableObjects.stream().map(mutableObject ->
                new MutableObject(mutableObject.getName())).collect(Collectors.toUnmodifiableList());
    }

    public int getAge() {
        return age;
    }

    // return deep copy to avoid exposing internal state
    public List<MutableObject> getMutableObjects() {
        return mutableObjects.stream().map(mutableObject ->
                new MutableObject(mutableObject.getName()))
                .collect(Collectors.toUnmodifiableList());
    }



    public List<String> getHobbies() {
        return hobbies;
    }

    public String getName() {
        return name;
    }

}
