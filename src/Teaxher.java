public class Teaxher extends User{
    private String zhicheng;

    public Teaxher( String zhicheng) {
        super("123456");
        this.zhicheng = zhicheng;
    }

    public String getZhicheng() {
        return zhicheng;
    }

    public void setZhicheng(String zhicheng) {
        this.zhicheng = zhicheng;
    }

    @Override
    public String toString() {
        return "Teaxher{" +
                "zhicheng='" + zhicheng + '\'' +
                '}';
    }
}
