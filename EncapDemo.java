public class EncapDemo {
    
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge > 18 && newAge< 30){  
            age = newAge;
        }
        else{
            System.out.println("Umur maksimal 30 & minimal 18");
        }
    }
}
