/*
    PRP : Pc Reservation Program
피시방 프로그램이랑 연동.?!?
        피시방 후기도 남길수있고, 볼수있음. 평점표시
        피시방 자리선택, 충전 회원등록 (예약가능-이미 가입되어있던 회원으로, 시간똑같이빠져나감)

<자리가 없어서 피시방 여러군데를 돌아다니지 않기 위한 프로그램,
        요즘같은 시대를 위한 사람 많이 없는곳을 찾기 위한 프로그램>

        1. 원하는 지역, 원하는 피시방 선택 (피시방 밑에 홍보문구가능-사장님등록)

        2. 현재 피시방 상황보여줌. 비어있는자리구분
        중간에 그래픽으로 구분.
        화면 상단부분에 (사용 중 : 35 / 50) 이런식으로 총 자릿수와 사용중인 자릿수 표시

        3.1 빈자리 선택
        (1) 회원 로그인 창
        (2) 로그인 완료시 현재 나의 남은시간확인 & 결제창 띄움
        결제창 : 시간선택 -> 결제(카카오페이,토스,카드결제 등등)
        남은시간 없을 시 : 다음 키를 눌러도 넘어가지않고, '현재 남은 잔액이 부족합니다' 창 띄움
        (3) 다음으로 넘기면 예약하시겠습니까? 뜸
        yes :  예약되고 남은시간 똑같이 흘러감. 컴터자동으로 켜져있음
        no  :  2번창으로 이동

        3.2 현재 내가 앉아있는 자리 선택시
        : 피시방에 현금과 카드없이 이제 핸드폰만있어도 마음껏 즐길 수 있음.
        -> 삼성페이를 쓰는 경우 핸드폰만 들고다니면 무엇이든 할수있는데
        피시방은 그렇지 않다는 점이 참으로 불편할 것이다.
        회원정보입력후 (아이디)
        충전기능 & 음식주문기능추가 (음식주문할때엔 비밀번호입력)
        //나중엔 이걸 이용해서 현재자리에서 게임중일때 시간이부족하면
        기계로 갈 필요없이 이 프로그램을 켜서 충전가능하도록

        3.2 이전으로 돌아가서 다른 피시방 선택
        (1) 이전 키 누를시 다른 지역 선택가능
        */


package pcProject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PRP {
    public static void main(String[] args) {
        System.out.println("PRP 시스템에 접속하셨습니다.");

        System.out.println();
        for(String area : PCcafe.area) {
            System.out.println(area);
        }

        System.out.print("원하시는 지역의 번호를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        switch (n){
            case 1 :
                System.out.println();
                for(String Seoul : PCcafe.SeoulPc) {
                    System.out.println(Seoul);
                }
                break;
            case 2 :
                System.out.println();
                for(String Gyeonggi : PCcafe.GyeonggiPc) {
                    System.out.println(Gyeonggi);
                }
                break;
            case 3 :
                System.out.println();
                for(String Daejeon : PCcafe.DaejeonPc) {
                    System.out.println(Daejeon);
                }
                break;
            case 4 :
                System.out.println();
                for(String Chungcheong : PCcafe.ChungcheongPc) {
                    System.out.println(Chungcheong);
                }
                break;

            default:
                System.out.println();
                for(String Chungcheong : PCcafe.ChungcheongPc) {
                    System.out.println(Chungcheong);
                }
                break;
        }

        System.out.print("원하시는 PC방의 번호를 입력하세요.");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        n1 = n1-1;

        System.out.println("\n");

        String savepc = PCcafe.areaPcname[n1];
        PCcafe pCcafe = PCcafe.getPCcafe(savepc);


        Thread loginthread = new Login();
        System.out.print("현재 선택하신 피시방을 예약하시겠습니까?(yes/no)");
        String ans = scanner.nextLine();
        System.out.println("\n");


        switch (ans){
            case "yes":
                System.out.println("로그인을 해야합니다.");
                loginthread.start(); //로그인객체생성시실행, while문 사용
                break;
            case "no":
                System.out.print("지역을 입력하세요. ");
                break;
            default:
                System.out.println("잘못 입력하셨습니다. ");

        }

        //loginthread.interrupt();

    }
}
