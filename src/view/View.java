package view;

import model.vo.Hero;
import model.vo.Monster;

import java.io.IOException;
import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);
    public String main(){
        System.out.println("=== === === 몬스터 어택 === === ===");
        System.out.println("            환영합니다.            ");
        System.out.println("     당신의 이름을 입력해 주세요.    ");
        System.out.print("이름 : ");
        return sc.next();
    }

    public void printMsg(String string){
        System.out.println(string);
    }

    public int main2(int i, Monster m, Hero h){
        System.out.println("=== === === === 몬스터 어택 === === === ===");
        System.out.println("스테이지 " + i + "\t\t"+m.getName()+"\t\t\t"+ "체력 : " + m.getHp());
        System.out.println("\t\t\t\t\t\t\t" +"공격력 : " + m.getAtk());
        System.out.println("\t\t\t\t\t\t\t" +"방어력 : " + m.getDef());
        System.out.println();
        System.out.println("이름 : " + h.getName());
        System.out.println("공격력 : "+h.getAtk()+"\t" + "방어력 : "+m.getDef() + "\t체력 : " + h.getHp());
        System.out.println("엔터를 눌러 공격하세요!");
        pause();
        return h.getAtk();
    }

    public void pause(){
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int monsterDead(Monster m){
        if(m.getHp() == 0 || m.getHp() < 0){
            System.out.println("몬스터 처치!");
            return 1;
        } else {
            return 0;
        }
    }

}