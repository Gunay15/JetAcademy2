import java.sql.SQLOutput;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int max;
    public static void main(String[] args) {


//        Student <String,Integer> student =new Student<>("Gunay","Allahverdiyeva",new String[]{
//                "Java","Phyton"},27);
//        System.out.println(student);


//     Random rand =new Random();
//     int randomNumber=rand.nextInt(0,10); // 6
////        System.out.println(randomNumber);
//        Scanner sc = new Scanner(System.in);
//        int heal=5;
//
//        while (heal>0){
//            int num = sc.nextInt();
//          try{
//              if(num==randomNumber){
//                  System.out.println("duzgundur");
//                  break;
//              }else {
//                  heal--;
//                  throw  new LogInException("wrong number heal = " + heal);
//              }
//          }catch (LogInException e ){
//              System.out.println(e.getMessage());
//          }
//
//
//        }

//         StringAltClass stringAltClass =new StringAltClass();
//        System.out.println( stringAltClass.method("salam"));
//        IntegerAltClass integerAltClass = new IntegerAltClass();
//        System.out.println(integerAltClass.method(25));
//        BooleanAltClass booleanAltClass = new BooleanAltClass();
//        System.out.println(booleanAltClass.method(true));


//        int[] arr = {1, 2, 3, 4, 5, 6};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("daxil et: ");
//        int num = sc.nextInt();
//        boolean b = false;
//
//        try {
//            for (int my : arr) {
//                if (num == my) {
//                    b = true;
//                    System.out.println("eded var: " + my);
//                }
//            }
//            if (!b) {
//                throw new LogInException("eded yoxdur");
//
//            }
//        } catch (LogInException l) {
//            System.out.println(l.getMessage());
////          l.printStackTrace();
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("daxil et: ");
//        int h=3;
//         while(h>0){
//             String a = sc.next();
//             try{
//             int i = Integer.parseInt(a);
//                 System.out.println(i);
//                 break;
//         }
//         catch(Exception e){
//                 h--;
//             System.out.println(e.getMessage());
//        }}
//        Telephone t1 = new Telephone("Iphone 17", 2025, 256, Color.ORANGE.getValue());
//        Telephone t2 = new Telephone("Iphone 16", 2024, 128, Color.BLUE.getValue());
//        Telephone[] arr={t1,t2} ;
//        Brend brend = new Brend("Apple",arr);
//        System.out.println(brend.name);
//        for(Telephone t:arr){
//            System.out.println(t);
//        }

//        int []arr={1,5,6,7};
//      try{  System.out.println(arr[5]);
//
//        }catch (RuntimeException r){
//          System.out.println(r.getMessage());
//      }

//        ArrayList <Integer> list=new ArrayList<>();
//        list.add(2);
//        list.add(4);
//        list.add(7);
//        System.out.println(list);
//        for(Integer l:list){
//            if(l%2==0){
//                System.out.println("Cut eded: " +l);
//            }else {
//                System.out.println("Tek eded: " + l);
//            }
//        }

//        int[] array={2,4,6,8,9,12,15,17,18};
//        int target=5;
//        int left=0;
//        int right=array.length-1;
//        while (left<=right){
//            int mid=left+(right-left)/2;
//            if(array[mid]==target){
//                System.out.println("hedef tapildi");
//            }
//            if(array[mid]<target){
//                left=mid+1;//saga get
//            }else {
//                right=mid-1;//sola get
//            }
//
//
//        } System.out.println("tapilmadi");


//   ArrayList <Integer> tek=new ArrayList<>();
//   ArrayList <Integer> cut=new ArrayList<>();
//   for(int i=0;i<=100;i++){
//       if(i%2==0){
//           cut.add(i);
//       }else {
//           tek.add(i);
//       }
//   }
//        System.out.println(cut);
//        System.out.println(tek);

//  ArrayList <Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,2,3,4,5));
//  ArrayList<Integer> list2=new ArrayList<>();
//  for(int i=0;i<list1.size();i++){
//      for(int j=0;j<list1.size();j++){
//          boolean isDublicate=false;
//          if(list1.get(i).equals(list1.get(j))){
//

//     ArrayList <String> fruits=new ArrayList<>();
//
//     fruits.add("alma");
//     fruits.add("armud");
//     fruits.add("banan");
//     fruits.add("alca");
//     fruits.add("alma");
//     fruits.add("banan");
//     int count=0;
//     int index=0;
//     String tekrar="alma";
//
//     for(String f: fruits){
//         if(f.contains(tekrar)){
//             System.out.print("rast gelindiyi index: "+index+"\n");
//             count++;
//
//         }
//       index++;
//
//     }
//        System.out.println("\nsayi "+count+" "+tekrar);

//
//      Student student1=new Student("Gunay","Allahverdiyeva",27);
//      Student student2=new Student("Arzu","Nusretova",23);
//      Student student3=new Student("Gunel","Suleymanova",24);
//
//      Student.addStudent(student1);
//        Student.addStudent(student2);
//      Student.addStudent(student3);
//        System.out.println(Student.getStudent());

//
//        List<Integer> number=new ArrayList<>();
//        for(int i=1;i<=10;i++){
//            number.add(i);
//            number.stream()
//                    .filter(n->n %2!=0)
//                    .forEach(System.out::println);
//        }


//        List<String> words = new ArrayList<>(Arrays.asList("alma", "banan", "armud", "alca", "nar"));
//
//        words.stream()
//                .filter(m -> m.startsWith("a") || m.startsWith("A"))
//                .filter(m->m.endsWith("a") )
//                .forEach(System.out::println);

//List<Integer> num=new ArrayList<>(Arrays.asList(1,2,3,4,1,2,5));
//num.stream().distinct()//tekrarlananlari silir
//        .forEach(System.out::println);

//List<Integer> num=new ArrayList<>(Arrays.asList(14,15,74,52));
//max=num.getFirst();
//num.forEach(
//        (e)->{
//            if(max<e){
//                max=e;
//        }
//        });
//        System.out.println(max);
//
//        List<Integer> num=new ArrayList<>(Arrays.asList(12,14,11,13,15,17,18));
//        for(Integer n: num){
//            System.out.println((n%2==0)? n+ " cut " : n+" tek");
//        }
//        num.stream().forEach(
//                e->{
//                    System.out.println((e%2==0)? ));
//                }
//        );


//        List<Integer>num1=new ArrayList<>(Arrays.asList(2,4,6,5,2,5,7,8,9));
//        Set<Integer>num2=new HashSet<>();
//        num1.forEach(
//                (e) -> {
//
//                    for(Integer i: num1){
//                        if(e.equals(i)){
//                            a++;
//                        }
//                    }
//                    if(a>1){
//
//                        num2.add(e);
//
//                    }
//                    a=0;
//                }
//        );
//        System.out.println(num2);


//        List <String> word=new ArrayList<>(Arrays.asList("Gunay","Lale","Cavidan"));
//        word.stream().max(Comparator.comparing(String::length))
//                .ifPresent(System.out::println);
//
//
//   List<Integer> nums=new ArrayList<>(Arrays.asList(2,4,5,6,7,8,9,10,11,12,13));
//   nums.stream()
//           .forEach(
//                   (e)->{
//                       if(a<4){
//                           a++;
//                           System.out.println(e);
//                       }
//
//
//        }
//           );
//
//
//
//    }
//    static int a=0;


//        List<Integer> nums=new ArrayList<>(Arrays.asList(2,4,5,6));
//        nums.stream()
//                .map(e->mult = e*mult).forEach((e) ->{});
//        nums.stream().map(
//                (e) -> sum = e+sum
//        ).forEach(e -> {});
//        System.out.println(mult);
//        System.out.println(sum);


// List <Integer> num=new ArrayList<>(Arrays.asList(2,4,5,6));
//
//        System.out.println(num.stream()
//                .mapToInt(e-> e.intValue()).count());





    }
//  static   int sum=0;
//   static int mult=1;
}
