//Создать классы Собака и Кот с наследованием от класса Животное.
//Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения
// действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//Добавить подсчет созданных котов, собак и животных.

public class OOP {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Bobik");
        Cat cat1 = new Cat("Tom");
        Dog dog1 = new Dog("Tuzik");

        cat.run(200);
        cat1.run(201);
        cat1.swim(1);

        dog.run(500);
        dog1.run(501);
        dog.swim(10);
        dog1.swim(11);

        System.out.println("Total cats: " + Cat.getCountCat());
        System.out.println("Total dogs: " + Dog.getCountDod());

    }
}

