package Counter;

public class Counter {

   public int value;
   public int initialValue;

   public Counter (int value) {

       this.value = value;
       this.initialValue = this.value;
   }

   public Counter(){

       this.value = 0;
       this.initialValue = this.value;

   }

   public void add(int number){

       this.value = this.value + number;

   }

   public int get() {

       return this.value;
   }

   public void reset() {

       this.value = this.initialValue;
   }

   public void callThePolice() {
       System.out.println("911");
   }

}


