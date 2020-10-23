package ru.avalon.java.dev.j10.labs;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ExactPerson implements Person{

    private String name;
    private Date birthday;
    
    public ExactPerson(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthday;
    }

//    При сравнении одного человека с другим следует
//    * учитывать, что больше будет тот человек, чьё имя должно
//    * быть ниже в списке имён, отсортированном по возрастанию.
//    * Из двух людей с одним и тем же именем больше будет тот,
//    * который старше.
    
    @Override
    public int compareTo(Object t) {
        //приведение входного параметра к необходимому типу.
        ExactPerson person = (ExactPerson)t;
        
        if(name.compareTo(person.getName()) > 0){
            return 1;
        }else if(name.compareTo(person.getName()) < 0){
            return -1;
        }
        
        else if(birthday.before(person.getBirthDate())){
            return 1;
        }else if(birthday.after(person.getBirthDate())){
            return -1;
        }else{
            return 0;
        }

    }
    
    @Override
    public String toString(){
        SimpleDateFormat f = new SimpleDateFormat("yyyy, MM, d");
        return "Person: " + name + ", birthday: " + f.format(birthday);
    }
    
}
