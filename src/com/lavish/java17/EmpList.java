//package com.lavish.java17;
//
//import com.lavish.Frequency;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Optional;
//import java.util.OptionalInt;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.SubmissionPublisher;
//import java.util.stream.Collectors;
//
//public class EmpList {
//    //Given list of emp. Return name of emp, having salary > 10000 and sorted by name
//    public static void main(String[] args) {
//        List<Frequency> frequencyList;
//        frequencyList = new ArrayList<>();
//        Optional<String> name =
//                frequencyList.stream()
//                        .filter(f -> f.getSalary() > 10000)
//                        .map(e -> e.getName())
//                        .sorted((x, y) -> y.compareTo(x))
//                        .findFirst();
//    }
//
//
//    Class Producer
//
//    {
//        Observer observer;
//
//        data.update
//        {
//            observer.onUpdate(updated items)
//        }
//
//    }
//
//    Class Observer
//
//    {
//
//        Map<Consumer, Observed> consumers;
//
//        onUpdate {
//        queue.push(event)
//    }
//    }
//
//    Class Consumr
//
//    {
//        queueCLient
//        subscribers.process(update_items);
//    }
//}
//
//
//    Class CustomPair<R, T>{
//
//    R one;
//    T two;
//
//    CustomPair(R r, T t){
//        one = r;
//        two = t;
//        }
//
//    }
//
//    @Profile(dev)
//
//@Configuration
//
//spring. fabreze
//
//
//
//
//
//CriteriaQuery cq = Session.createCriteriaQuery(EmpEntity);
//cq.criteria.add(new Criteria("salary").builder().condition(Condition.lessThan).build())
//projection.peoject(sname);
//session.execute(cq);
//
//
//
//Employees - employeeID
//
//Department - departmentID
//
//
//        Find duplicate email addresses and return the record
//with the highest user_id for each duplicate email. Schema:
//        CREATE TABLE users ( user_id INT, email VARCHAR(255), created_at TIMESTAMP );
//
//select max(user_id), email from users group by email
//
//        Given a table orders , find the most recent order (by order_date) for
//        each customer. Schema: CREATE TABLE orders ( order_id INT, customer_id INT, order_date DATE,
//        amount DECIMAL(10, 2) );
//
//select o1.order_id, o2.customer_id from order o1, order o2
//        where o1.orderId=o2.orderId group by o2.customer_id order by o1.order_date desc