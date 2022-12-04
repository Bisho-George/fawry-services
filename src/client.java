public class client {
    Context cont;
    public client(Context obj){
        cont=obj;
    }

    public void go(User obj){
        cont.setU(obj);
    }

    public Context getCont() {
        return cont;
    }
}
