ans : - == is a reference comparison operator. It checks whether two references point to the same object in memory.

      .equals() is a method used to compare the content of two objects.
      
String a = new String("Hello");
String b = new String("Hello");

System.out.println(a == b);       // false (different memory locations)
System.out.println(a.equals(b));  // true (same content)
