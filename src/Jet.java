public class Jet <T>{
    private T word;
    public Jet(T word){
        this.word=word;
    }
    public T method( ){
        return word;

    }

    public T getT() {
        return word;
    }

    public void setT(T word) {
       this.word = word;
    }
//
//    public static void main(String[] args) {
//        Jet <String>j=new Jet<>("gun");
//        System.out.println(j.method());
//    }
}
