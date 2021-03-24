package pcProject;

import com.sun.jdi.Method;

import java.util.Scanner;

public class login extends Thread {
    public void run(){
        System.out.println("아이디 : ");
        Scanner idscan = new Scanner(System.in);
        String userid = idscan.nextLine();

        System.out.println("비밀번호 : ");
        Scanner pwscan = new Scanner(System.in);
        String userpw = pwscan.nextLine();

        Thread loginthread = new login();

        if (userid.equals(User.m1.UserID)){
            if(userpw.equals(User.m1.UserPassword))
                System.out.println(User.m1.Username + "회원님 로그인되었습니다.");
            else {
                System.out.println("회원정보를 다시 입력하세요.");
                loginthread.start();
            }
        }
    }

}
