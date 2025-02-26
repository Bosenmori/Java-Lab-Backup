package Lab7.Lib;
public abstract class Toy {
    private String category;
    private int minAge;
    public Toy(String category,int minAge){
        setCategory(category);
        setMinAge(minAge);
    }
    public int getMinAge() {
        return minAge;
    }
    public void setMinAge(int minAge){
        this.minAge =  minAge;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category ;
    }
    public abstract void play();
}
