package DAO;

import model.vo.Hero;
import model.vo.Monster;

import java.sql.*;

public class DAO {
    JdbcTemplate jdbc = new JdbcTemplate();

    public int insertName(String name){
        String sql = "INSERT INTO HERO VALUES(?,10,10,0,0,DEFAULT)";
        try {
            PreparedStatement stmt = jdbc.jdbc(sql);
            stmt.setString(1,name);
            return stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Monster monster(int i){
        String sql = "SELECT * FROM MONSTER WHERE CODE = " + i;
        try {
            PreparedStatement stmt = jdbc.jdbc(sql);
            ResultSet rset = stmt.executeQuery();
            Monster monster = new Monster();
            while(rset.next()){
                monster.setName(rset.getString(1));
                monster.setAtk(rset.getInt(2));
                monster.setDef(rset.getInt(3));
                monster.setHp(rset.getInt(4));
            }
            return monster;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Hero hero(String name){
        String sql = "SELECT NAME,ATK,DEF,HP FROM HERO WHERE NAME = '" + name+"'";
        try {
            PreparedStatement stmt = jdbc.jdbc(sql);
            ResultSet rset = stmt.executeQuery();
            Hero hero = new Hero();
            while(rset.next()){
                hero.setName(rset.getString(1));
                hero.setAtk(rset.getInt(2));
                hero.setDef(rset.getInt(3));
                hero.setHp(rset.getInt(4));
            }
            return hero;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void update(int atk){
        String sql = "UPDATE MONSTER SET HP = HP-"+atk;
        try {
            PreparedStatement stmt = jdbc.jdbc(sql);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
