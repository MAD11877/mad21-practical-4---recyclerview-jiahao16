package sg.edu.np.myapplication;

public class User {
    public String name;
    public String desc;
    public int id;
    public boolean followed;

    public User(){ }

    public User(String n, String d, int i, boolean f){
        name = n;
        desc = d;
        id = i;
        followed = f;
    }

}
