package run;

import controller.Controller;
import view.View;

public class Run {
    public static void main(String[] args) {
        View v = new View();
        Controller c = new Controller();
        int stage = 1;
        String name = v.main();
        if(c.inputName(name) > 0){
            System.out.println("캐릭터 생성이 완료되었습니다.");
        } else {
            System.out.println("캐릭터 생성에 실패하였습니다.");
        }
        while(true){
            int atk = v.main2(stage,c.monster(stage),c.hero(name));
            c.atkMonster(atk);
            stage += v.monsterDead(c.monster(stage));
        }
    }
}
