import java.security.cert.TrustAnchor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Task of teacher
         * Deadline : 23.02.2024 / 17:00
         * Animal деген класс тузунуз жана бир метод кошунуз.
         * Анын 3 наследнигин тузунуз.
         *
         * Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
         * Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
         * instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
         * чыгарыныз.
         * Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз.
         *
         *
         *
         * Создайте класс Animal с одним методом которые есть 3 наследника такие как
         *
         * Shark, с методом attack(), Turtle с методом swim(), Eagle с методом fly().
         *
         * Создайте массив используя Animal и положите туда всех наследников.
         *
         * Используя instanceOf и getClass() вызовите свои методы животных из массива Animal.
         *
         * Для каждого объекта по отдельности создайте массив и разделите животных из Animal massiva и положите в свои массивы.
         */

        Animal[]animals = new Animal[3];
        animals[0] = new Shark();
        animals[1] = new Turtle();
        animals[2] = new Eagle();

        for(Animal animal : animals){
            if(animal instanceof Shark){
                ((Shark)animal).attack();
            }else if (animal instanceof Turtle){
                ((Turtle)animal).swim();
            }else if(animal instanceof Eagle){
                ((Eagle)animal).fly();
            }
        }

        Shark[]sharks = new Shark[1];
        Turtle[]turtles = new Turtle[1];
        Eagle[]eagles = new Eagle[1];

        for(Animal animal : animals){
            if(animal instanceof Shark){
                sharks[0] = (Shark) animal;
            }else if(animal instanceof Turtle){
                turtles[0] = (Turtle) animal;
            }else if(animal instanceof Eagle){
                eagles[0] = (Eagle) animal;
            }
        }
        for(Shark shark : sharks){
            shark.attack();
        }
        for(Turtle turtle : turtles){
            turtle.swim();
        }
        for(Eagle eagle : eagles){
            eagle.fly();
        }
    }
}