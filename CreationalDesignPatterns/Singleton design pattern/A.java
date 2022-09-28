class A{  
 private static A obj;  
 private A(){}  
   
 public static A getA(){  
   if (obj == null){  
      synchronized(Singleton.class){  
        if (obj == null){  
            obj = new Singleton();//instance will be created at request time  
        }  
    }              
    }  
  return obj;  
 }  
  
 public void doSomething(){  
 //write your code  
 }  
}  