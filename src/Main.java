import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("Hello world!");


        Fruit fruit1 = new Fruit("Mango", "5kg", 20);
        Fruit fruit2 = new Fruit("Orange", "3kg", 40);

        Fruit fruit3 = new Fruit("Banana", "2kg", 10);
        Fruit fruit4 = new Fruit("Strawberry", "6kg", 50);


        Map<String, Fruit> map = new HashMap<>();
        map.put("1",fruit1);
        map.put("2",fruit2);
        map.put("3",fruit3);
        map.put("4",fruit4);


        for ( Fruit f : map.values() ){

            System.out.println(f.getName());

        }
        for ( String id : map.keySet()){
            if (id.equals("3")){

                System.out.println("33333"+map.get("3").getName());
            }

            System.out.println(id);

        }
    }
*/


        Customer cust1 = new Customer("1", "Golam", "20");
        Customer cust2 = new Customer("2", "Sajib", "40");

        Customer cust3 = new Customer("3", "Alam", "60");
        Customer cust4 = new Customer("4", "Tapas", "80");
        Customer cust5 = cust4;
        Customer cust6= new Customer("4", "Tapas", "80");

        List<Customer> listOfCustomers= new ArrayList<>();
        listOfCustomers.add(cust1);
        listOfCustomers.add(cust2);


        Set<Customer> setOfCustomers = new HashSet<>();
        setOfCustomers.add(cust1);
        setOfCustomers.add(cust2);
        setOfCustomers.add(cust3);
        setOfCustomers.add(cust4);
        setOfCustomers.add(cust5);
        setOfCustomers.add(cust6);

        if (setOfCustomers.containsAll(listOfCustomers)){

            System.out.println("Yes found");
        }

        // setOfCustomers.addAll(Arrays.asList(cust1,cust2,cust3,cust4));
        System.out.println("BeforeSize:" + setOfCustomers.size());
        setOfCustomers.remove(cust6);
        System.out.println("AfterSize:" + setOfCustomers.size());
        for (Customer customer : setOfCustomers) {
            if (customer.getName().equals("Golam") || customer.getName().equals("Tapas")) {

                if (customer !=null){
                    System.out.println("ID:" + customer.getId());
                    System.out.println("Name:" + customer.getName());
                    System.out.println("Address:" + customer.getAddress());

                }


            }


        }


        // System.out.println(setOfCustomers.toString());
    }



    }
