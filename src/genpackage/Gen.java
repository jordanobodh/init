package genpackage;

/**
 * Created by kusumakar on 27/1/18.
 */
class Gen<T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return this.ob;
    }

    void showType() {
        System.out.println("type is" + ob.getClass().getName());
    }
}
