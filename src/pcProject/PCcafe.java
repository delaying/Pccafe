package pcProject;

public class PCcafe {
    public String name;
    public String region;
    public String seat;

    PCcafe(String name, String region, String seat){
        this.name = name;
        this.region = region;
        this.seat = seat;

    }

    public static PCcafe bob = new PCcafe("BOB PC","대전","30/40");
    public static PCcafe perpact = new PCcafe("퍼팩트 피시방","대전","30/50");
    public static PCcafe newyork = new PCcafe("뉴욕 피시방","대전","30");
    public static PCcafe abc = new PCcafe("ABC PC","서울","30");
    public static PCcafe space = new PCcafe("SPACE PC","서울","30");
    public static PCcafe bab2 = new PCcafe("BOB PC","서울","30");

}



