package ru.sping.lab.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sping.lab.db.DAO;
import ru.sping.lab.db.FrazaEntity;

@Controller
public class FirstControler {
    DAO dao= new DAO();
    @GetMapping("/hell")
    public String sayHello(){
        FrazaEntity fraza=new FrazaEntity();
        fraza.setId(0);
        fraza.setFraza("привет!");
        dao.saveHero(fraza);




        return "hello_world";
    }
}
