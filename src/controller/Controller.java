package controller;

import DAO.DAO;
import model.vo.Hero;
import model.vo.Monster;

public class Controller {
    public int inputName(String name){
        DAO dao = new DAO();
        return dao.insertName(name);
    }

    public Hero hero(String name){
        DAO dao = new DAO();
        return dao.hero(name);
    }
    public Monster monster(int i){
        DAO dao = new DAO();
        return dao.monster(i);
    }

    public void atkMonster(int atk){
        DAO dao = new DAO();
        dao.update(atk);
    }

    public void deadMonster(){

    }
}
