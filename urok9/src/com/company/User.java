package com.company;
// Object
// все класcы в Java насследуют класс Object в неявном виде
public class User implements Hummanable, Demonable{
    public String name;
    // переопределяем метод toString из класса Object
    @Override
    public String toString () {
        return "User";
    }
    @Override
    public boolean equals (Object o) {
        // ЕСЛИ ХЭШКОДЫ ОБЪЕКТОВ СОВПАДАЮТ, ТО equals обязательно должен вернуть  true
        if (o.hashCode() == this.hashCode()) {
            return true;
        }
        // преобразуем объект класса Object в объект класса User (полиморфизм)
        //такое преобразование возможно только в том случае, если объект "o"
        // наследует класс User
        User user = (User) o;
        return this.name.equals(user.name);
        // аналогично записи
        // if (this.name.equals(user.name)) {
        //    return true;
        //}
        //return false;
    }
    // допустим, есть 2 объекта о1 и о2
    // Если о1.hashCode () == o2. hashCode (), то и o1.equals(о2) должен возвращать True
    @Override
    public int hashCode() {
        return 2;
    }


    @Override
    public void kill(User u) {
        System.out.println(u.name);
    }

    @Override
    public void walk() {

    }

    @Override
    public void eat(String food) {

    }
}
