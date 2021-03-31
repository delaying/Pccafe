package pcProject;

import java.util.LinkedList;

public class PCcafe {
    public String name;
    public String region;
    public String seat;

    PCcafe(String name, String region, String seat){
        this.name = name;
        this.region = region;
        this.seat = seat;
    }

    //배열생성
    public static String[] area = {"1.서울","2.경기","3.충청도","4.대전","5.세종", "6.강원도", "7.경상도", "8.전라도"};
    public static String[] areaPcname = {"bob", "perpact", "newyork", "space","abc"};
    public static String[] SeoulPc = {"1.BOB", "2. 퍼펙트", "3.NEWYORK", "4.SPACE","5.ABC"};
    public static String[] GyeonggiPc = {"1.BOB", "2. 퍼펙트", "3.NEWYORK", "4.SPACE","5.ABC"};
    public static String[] DaejeonPc = {"1.BOB", "2. 퍼펙트", "3.NEWYORK", "4.SPACE","5.ABC"};
    public static String[] ChungcheongPc = {"1.BOB", "2. 퍼펙트", "3.NEWYORK", "4.SPACE","5.ABC"};

    public static PCcafe bob = new PCcafe("BOB","대전","20/60");
    public static PCcafe perpact = new PCcafe("퍼팩트","대전","15/50");
    public static PCcafe newyork = new PCcafe("NEWYORK","대전","50/55");
    public static PCcafe space = new PCcafe("SPACE PC","서울","30/70");
    public static PCcafe abc = new PCcafe("ABC PC","서울","32/77");

    public static PCcafe getPCcafe(String pcCafeName) {
        switch (pcCafeName) {
            case "bob":
                System.out.println("피시방 이름 : " + bob.name + "\n"+"현재 좌석 현황 : "+ bob.seat);
                return bob;
            case "perpact":
                System.out.println("피시방 이름 : " + perpact.name + "\n"+"현재 좌석 현황 : "+ perpact.seat);
                return perpact;
            default:
                return null;
        }
    }
}




