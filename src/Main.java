public class Main {
    public static void main(String[] args) {
        Mosquito m = new Mosquito();
        Mosquito [] mas = m.makeMosquitos();
        Frog f = new Frog();
        f.catchMosq(mas);
    }
}

// Сделать класс Лягушка и класс Комару комара есть поле "жив" (по умолчанию Истина)
// и метод жужжатьсоздать массив из 12 комаров сделать Лягушке метод "ловить комаров",
// параметром которого будет массив комаров// в этом методе лягушка ловит
// случайного комара из массива,если он жив, то она говорит "ква", а комар умирает

