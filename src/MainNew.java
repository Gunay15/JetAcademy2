import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainNew {
    static int count=0;
    public static void main(String[] args) {

//        Map<String,Integer> map1=new HashMap<>();
//        map1.put("Gunay",90);
//        map1.put("Arzu",85);
//        map1.put("Gunel",75);
//        map1.put("Nemet",65);
//        map1.entrySet().stream()
//                .filter(e->e.getValue()>80)
//                .forEach( System.out ::println);

//        Map<String,Integer> map2=new HashMap<>();
//        map2.put("Arzu",85);
//        map2.put("Gunay",90);
//        map2.put("Nemet",45);
//        map2.put("Gunel",40);
//        map2.entrySet().stream()
//                .filter(
//                        (e) -> e.getValue()<50
//                )
//                .forEach(
//                        (e) -> {
//                            count++;
//                            System.out.println(e);
//                        }
//                );
//        System.out.println(count);


//        Map<String,Integer> map2=new HashMap<>();
//
//        List<String> list=new ArrayList<>();
//
//        map2.put("Arzu",85);
//        map2.put("Gunay",90);
//        map2.put("Nemet",45);
//        map2.put("Gunel",40);
//        map2.entrySet().stream().filter(e->e.getValue()<50).map(
//                Map.Entry::getKey
//        ).forEach(
//                list::add
//        );
//
//        for(String s: list){
//            map2.remove(s);
//        }
//        System.out.println(map2);


//        Map<String,Integer> map=new HashMap<>();
//        List<String>list=new ArrayList<>();
//
//        map.put("Gunay",5000);
//        map.put("Arzu",2500);
//        map.put("Eli",900);
//        map.put("Veli",700);
////        map.entrySet().stream().filter(e->e.getValue()>1000).map
////                (Map.Entry::getKey).forEach(list::add);
//        for(String s: list){
//            map.remove(s);
////        }
 ////        System.out.println(map);
//map.entrySet().stream().filter(r->r.getValue() >1000).forEach(
//        (e) -> {
//            size++;
//            sum+=e.getValue();
//        }
//
//);
//
//        System.out.println(sum/size);

//}
//   static double avarege=1;
//static  int sum=0;
//static int size=0;


//        Map <String,Map<String,Double>> company=new HashMap<>();
//        company.put("IT",
//                new HashMap<>(Map.of("",600.0)));
//        company.put("HR",
//                new HashMap<>(Map.of("",))



// List<Integer> num1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
// List<Integer> num2=new ArrayList<>(Arrays.asList(10,11,12,13,17));
// List<Integer>nums=new ArrayList<>();
//        nums = Stream.of(num1, num2)   // iki list-i stream-ə çeviririk
//                .flatMap(List::stream) // iç-içə list-ləri açırıq
//                .filter(n -> n % 2 == 0) // cüt ədədlər
//                .collect(Collectors.toList());
//        System.out.println(Stream.of(num1,num2).flatMap(List::stream).count());
//        System.out.println(Stream.of(num1,num2).flatMap(List::stream).max(Comparator.comparing(Integer::intValue)));
//
//        System.out.println(nums);
//
//
//List<String> list1=new ArrayList<>(Arrays.asList("alma","armud","nar","ananas"));
//List<String>list2=new ArrayList<>(Arrays.asList("biber","badimcan","pamidor","kok"));
//List<String>list=new ArrayList<>();
//
//        System.out.println(Stream.of(list1,list2).mapToLong(Collection::size).sum());
//        System.out.println(Stream.of(list1,list2).flatMap(Collection::stream).mapToInt(String::length).sum());
//        System.out.println(Stream.of(list1,list2).flatMap(Collection::stream).map(String::toUpperCase).toList());
//        System.out.println(Stream.of(list1,list2).flatMap(Collection::stream).filter(e->e.length()>5).map(MainNew::ilkHerfiBoyut).toList());
//}
//
//   public  static String ilkHerfiBoyut(String soz) {
//        return soz.substring(0,1).toUpperCase()+soz.substring(1);
//    }

//        List<Integer> nums=new ArrayList<>();
//        for(int i=1;i<=100;i++){
//           nums.add(i) ;
//
//        }
//        nums.stream().map(e->e*10)
//                .filter(n->n>300 && n%2==0).sorted(Collections.reverseOrder()).forEach(System.out::println);


//    Scanner sc = new Scanner(System.in);
//    String inputText=sc.nextLine().trim();
//    String [] arr=inputText.split("");
//    if(arr.length>3){
//        throw new RuntimeException("duzgun daxil edilmeyib example(5*10");
//    }
//    Integer num1=Integer.parseInt(arr[0]);
//    Integer num2=Integer.parseInt(arr[2]);
//
//    String op=arr[1];
//    if(op.length()>1){
//        throw  new RuntimeException("duzgun operator daxil edilmeyib");
//    }
//    switch (op){
//        case "+" -> System.out.println(num1+num2);
//        case "-" -> System.out.println(num1-num2);
//        case "*" -> System.out.println(num1*num2);
//        case "/" ->{
//            if (num2==0){
//                throw new RuntimeException("o-a bolmek olmaz");
//            }
//            System.out.println(num1/num2);
//
//
//        } default -> System.out.println("operator tanimlanmadi");
//
//    }



//        List<Integer> num=new ArrayList<>(Arrays.asList(2,4,5,6,7,8));
//        Iterator<Integer> itNum =num.iterator();
//        List<Integer> tek=new ArrayList<>();
//        List<Integer> cut=new ArrayList<>();
//int max=0;
//        while (itNum.hasNext()){
//
//            int nums = itNum.next();
//            if(max< nums){
//                max=nums;
//            }
//            if(nums%2==0){
//                cut.add(nums);
//            }else {
//                tek.add(nums);
//            }
//
//            //System.out.println(itNum.next());
//
//        }
//
//
//        System.out.println(tek);
//        System.out.println(cut);
//        System.out.println(max);



        List<Product> product = new ArrayList<>(Arrays.asList(
                new Product("Sud", 1.2, 5),
                new Product("Pendir", 6.5, 4),
                new Product("Qatiq", 2.4, 3),
                new Product("Qaymaq", 4.5, 2)));


        List<Customer>customers=new ArrayList<>(Arrays.asList(
                new Customer("Gunay",5.0),
                new Customer("Ali",2.0),
                new Customer("Veli",3.0),
                new Customer("Ayla",1.0)));



























    }
}
