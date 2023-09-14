fun main(args: Array<String>) {
   //task1
   fun printFullName(firstName:String, lastName:String){
      println(firstName + " "+ lastName);
   }
   printFullName("Angela", "Lypinova");
   //----


   //task2
   val firstName="Angela";
   val lastName="Lypinova";
   printFullName(firstName,lastName);
   //----

   //task3
   fun calculateFullName(firstName:String, lastName:String):String{
      return "${firstName} ${lastName}";
   }
   val name=calculateFullName("Angela", "Lypinova");
   //----

   //task4
   fun calculateFullNameAndLength(firstName:String, lastName:String):Pair<String, Int>{
      val fullName="${firstName} ${lastName}";
      return Pair(fullName,fullName.length-1);
   }
   println(calculateFullNameAndLength(firstName,lastName));
   //---

   //task5
   fun isSimple(n: Int): Boolean {
      if (n < 2) return false

   }

   //---


}
