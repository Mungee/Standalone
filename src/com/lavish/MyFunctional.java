package com.lavish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyFunctional {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        BinaryOperator<Integer> getSum = (acc,x)->{
            int result = (acc + x);
            System.out.println(acc + " "+x+" "+result);
            return result;
        };

        System.out.println(integers.stream()
                .reduce(getSum).map(x->x/integers.size()));


        Function<Integer, Predicate<String>> createTestOf = (minLength)->(str)-> str.length() > minLength;

        List<String> words = new ArrayList<>(Arrays.asList(new String[]{"one", "two", "three", "four"}));

        words.stream()
                .filter(createTestOf.apply(3))
                .forEach(System.out::println);


        BiFunction<Integer, Integer, Integer> add = (x,y)->x+y;
        Integer result = add.apply(2,3);
        System.out.println(result);

        TriFunction<Integer, Integer, Integer, Integer> add3 = (x, y, z)->x+y+z;
        System.out.println(add3.apply(2,4,2));

        final boolean isDevelopment = false;

        DataLoader dataLoader = new DataLoader(isDevelopment);
        System.out.println(dataLoader.loadPerson.apply());

        NoArgFunction<NoArgFunction<String>> createGreeter = ()->{
            String name = "Vishal";
            return ()->"Hello " + name;
        };

        NoArgFunction<String> greeter = createGreeter.apply();

        System.out.println(greeter.apply());



        Function<Integer, Integer> timesTwo = createMultiplier(2);

        System.out.println(timesTwo.apply(3));
    }

    public static Function<Integer, Integer> createMultiplier(Integer y) {
        return x -> x * y;
    }
}

interface TriFunction<T,U,V,R> {
    R apply(T t,U u,V v);
}

interface NoArgFunction <R>{
    R apply();
}

class Person{
    String name;
    Integer age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}

class DataLoader{

    public final NoArgFunction<Person> loadPerson;

    public DataLoader(boolean isDevelopment){
        this.loadPerson = isDevelopment ? this::loadPersonFake : this::loadPersonReal;
    }

    private Person loadPersonReal(){
        System.out.println("loading real person ...");
        return new Person("Real Man",40);
    }

    private Person loadPersonFake(){
        System.out.println("loading fake person object...");
        return new Person("Fake",23);
    }
}


