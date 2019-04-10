/*
interface Parseable{
    //구문 분석 작업을 수행한다.
    public abstract void parse(String animalsound);
}

public class FirstTest {
    public static void main(String[] args) {

           
        public Cat(String a);

        // 메서드 오버라이딩 : 메서드명 동일,시그니처 동일
        // 메서드 오버로딩 : 메서드명 동일,시그니처 다름(자료형,자료 갯수)
        Cat cat = new Cat();
        cat.cry();

        Dog dog = new Dog();
        dog.cry();

        Tiger tiger = new Tiger();
        tiger.cry();

        Dolphin dolphin = new Dolphin();
        dolphin.cry();

        Goldfish goldfish = new Goldfish();
        goldfish.cry();

        Parrot parrot = new Parrot();
        parrot.cry();


        // Main클래스에서 랜덤으로 20마리의 동물을 생성하여 소리를 낼 수 있다.
    }
}
/*
 * int cat; int dog; int tiger; int dolphin; int goldfish = 0; int parrot;
 */
/*
class Animal {

    // String type;
   // int age;

    public void cry() {
        System.out.println("동물 울음소리");
    }
}

class Cat extends Animal {
    public void cry() {
        System.out.println("- 야옹야옹");
    }
}

class Dog extends Animal {
    public void cry() {
        System.out.println("- 멍멍");
    }
}

//자기 고유 소리
class Tiger extends Animal {
    public void cry() {

        System.out.println("- 어흥");
    }
}

//돌고래는 초음파를 사용해서 인간의 가청 범위를 벗어난다.
class Dolphin extends Animal {
    public void cry() {
        System.out.println("- 초음파");
    }
}

//금붕어는 울음소리가 없기 때문에 고유 소리가 없다.
class Goldfish extends Animal {
    public void cry() {
         System.out.println("");
    }
}
//앵무새는 직전의 동물의 울음소리를 따라한다.
class Parrot extends Animal {
    public void cry() {

        System.out.println(" 의 울음소리를 따라한다.");
    }
}
*/
/*
interface cat {
    String sound = "고양이: 야옹 (인간이 들을 수 있는 소리)";
   }
   
   interface dog {
    String sound = "강아지: 멍멍 (인간이 들을 수 있는 소리)";
   }
   
   interface tiger {
    String sound = "호랑이: 어흥 (인간이 들을 수 있는 소리)";
   }
   
   interface dolphin {
    String sound = "돌고래: 초음파 (인간이 들을 수 없는 소리)";
   }
   
   interface goldfish {
    String sound = "금붕어: 울지 못함";
   }
   
   class FirstTest implements cat, dog, tiger, dolphin, goldfish {
    public static void main(String args[]) {
     int prev = -1;
     for(int i = 0; i < 20; i++) {
      int rand = (int)(Math.random() * 7) % 6;
      switch(rand) {
       case 0:
        System.out.println(cat.sound);
        break;
       case 1:
        System.out.println(dog.sound);
        break;
       case 2:
        System.out.println(tiger.sound);
        break;
       case 3:
        System.out.println(dolphin.sound);
        break;
       case 4:
        System.out.println(goldfish.sound);
        break;
       case 5:
        if(prev != -1) {
         System.out.print("앵무새: ");
         switch(prev) {
          case 0:
           System.out.println(cat.sound);
           break;
          case 1:
           System.out.println(dog.sound);
           break;
          case 2:
           System.out.println(tiger.sound);
           break;
          case 3:
           System.out.println(dolphin.sound);
           break;
          case 4:
           System.out.println(goldfish.sound);
           break;
          default:
           System.out.println("자기 고유의 소리");
         }
        }
        break;
       default:
        System.out.println("자기 고유의 소리");
      }
      prev = rand;
     }
    }
   }
   */
  class FirstTest {
    static final int CAT = 0, DOG = 1, TIGER = 2, DOLPHIN = 3, GOLDFISH = 4, PARROT = 5;
    public static void animal(int animal, int prev) {
     switch(animal) {
      case CAT:
       System.out.println("고양이는 인간이 들을 수 있는 소리로 운다. - 야옹");
       break;
      case DOG:
       System.out.println("강아지는 인간이 들을 수 있는 소리로 운다. - 멍멍");
       break;
      case TIGER:
       System.out.println("호랑이는 인간이 들을 수 있는 소리로 운다. - 어흥");
       break;
      case DOLPHIN:
       System.out.println("돌고래는 인간이 들을 수 없는 소리로 운다. - 초음파");
       break;
      case GOLDFISH:
       System.out.println("금붕어는 울지 못한다.");
       break;
      case PARROT:
      //PARROT이 나오기 전에 계속 직전동물 = 현재동물 로 해서 값이 대입되는 중이었음 
      //근데 이제 PARROT이 나오면서 -1이 아니니까 당연히 true값이 되고 "앵무새는 인간이 들을 수 있는 소리로 운다. - "가 출력된다.
      //prev는 아까도 말했듯이 현재동물값이 들어가니까 그 값이 뒤에 앵무새가 따라할 직전 동물의 이름과 울음소리가 나온다.
      // 0,1,2,3,4,5중 하나 값이 switch(안에 들어감)
       if(prev != -1) {
        System.out.print("앵무새는 인간이 들을 수 있는 소리로 운다. - ");
        switch(prev) {
         case CAT:
          System.out.println("고양이의 울음소리를 따라한다. - 야옹");
          break;
         case DOG:
          System.out.println("강아지의 울음소리를 따라한다. - 멍멍");
          break;
         case TIGER:
          System.out.println("호랑이의 울음소리를 따라한다. - 어흥");
          break;
         case DOLPHIN:
          System.out.println("돌고래의 울음소리를 따라한다. - 초음파");
          break;
         case GOLDFISH:
          System.out.println("금붕어는 울지 못한다.");
          break;
         default:
          System.out.println("자기 고유의 소리로 운다.");
          break;
        }
       }
       break;
      default:
       System.out.println("자기 고유의 소리로 운다.");
       break;
     }
    }
   
    public static void main(String args[]) {
     int prev = -1;
     for(int i = 0; i < 20; i++) {
      int rand = (int)(Math.random() * 7) % 6;
      animal(rand, prev);
      //만약에 현재 동물이 PARROT이 아니라면 현재 동물을 직전 동물에 대입 즉, 직전동물에 현재동물이 들어감
      if(rand != PARROT) prev = rand;
     }
    }
   }
