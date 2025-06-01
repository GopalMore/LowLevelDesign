package Constructor;

public class CopyConstructor {
    private String title;
    private int duration;
    //parameterize constructor
    CopyConstructor(String title,int duration){
        this.duration=duration;
        this.title=title;
    }
    //copyConstructor
    CopyConstructor(CopyConstructor other){
        this.title= other.title;
        this.duration=other.duration;
    }
    public void display(){
        System.out.println("title is "+title+" duration is "+duration);
    }

    public static void main(String[] args) {
        CopyConstructor Movie = new CopyConstructor("openheimer",190);
        CopyConstructor duplicateMovie = new CopyConstructor(Movie);
        duplicateMovie.display();
    }
}
