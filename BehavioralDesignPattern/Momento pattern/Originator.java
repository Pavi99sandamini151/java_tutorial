//This is a class.  
  
public class Originator {  
      
       private String state;  
      
       public void setState(String state){  
          this.state = state;  
       }  
      
       public String getState(){  
          return state;  
       }  
      
       public Memento saveStateToMomento(){  
          return new Momento(state);  
       }  
      
       public void getStateFromMomento(Memento Momento){  
          state = Momento.getState();  
       }  
}// End of the Originator class.  