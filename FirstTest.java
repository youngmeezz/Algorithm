/*
interface Parseable{
    //���� �м� �۾��� �����Ѵ�.
    public abstract void parse(String animalsound);
}

public class FirstTest {
    public static void main(String[] args) {

           
        public Cat(String a);

        // �޼��� �������̵� : �޼���� ����,�ñ״�ó ����
        // �޼��� �����ε� : �޼���� ����,�ñ״�ó �ٸ�(�ڷ���,�ڷ� ����)
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


        // MainŬ�������� �������� 20������ ������ �����Ͽ� �Ҹ��� �� �� �ִ�.
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
        System.out.println("���� �����Ҹ�");
    }
}

class Cat extends Animal {
    public void cry() {
        System.out.println("- �߿˾߿�");
    }
}

class Dog extends Animal {
    public void cry() {
        System.out.println("- �۸�");
    }
}

//�ڱ� ���� �Ҹ�
class Tiger extends Animal {
    public void cry() {

        System.out.println("- ����");
    }
}

//������ �����ĸ� ����ؼ� �ΰ��� ��û ������ �����.
class Dolphin extends Animal {
    public void cry() {
        System.out.println("- ������");
    }
}

//�ݺؾ�� �����Ҹ��� ���� ������ ���� �Ҹ��� ����.
class Goldfish extends Animal {
    public void cry() {
         System.out.println("");
    }
}
//�޹����� ������ ������ �����Ҹ��� �����Ѵ�.
class Parrot extends Animal {
    public void cry() {

        System.out.println(" �� �����Ҹ��� �����Ѵ�.");
    }
}
*/
/*
interface cat {
    String sound = "�����: �߿� (�ΰ��� ���� �� �ִ� �Ҹ�)";
   }
   
   interface dog {
    String sound = "������: �۸� (�ΰ��� ���� �� �ִ� �Ҹ�)";
   }
   
   interface tiger {
    String sound = "ȣ����: ���� (�ΰ��� ���� �� �ִ� �Ҹ�)";
   }
   
   interface dolphin {
    String sound = "����: ������ (�ΰ��� ���� �� ���� �Ҹ�)";
   }
   
   interface goldfish {
    String sound = "�ݺؾ�: ���� ����";
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
         System.out.print("�޹���: ");
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
           System.out.println("�ڱ� ������ �Ҹ�");
         }
        }
        break;
       default:
        System.out.println("�ڱ� ������ �Ҹ�");
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
       System.out.println("����̴� �ΰ��� ���� �� �ִ� �Ҹ��� ���. - �߿�");
       break;
      case DOG:
       System.out.println("�������� �ΰ��� ���� �� �ִ� �Ҹ��� ���. - �۸�");
       break;
      case TIGER:
       System.out.println("ȣ���̴� �ΰ��� ���� �� �ִ� �Ҹ��� ���. - ����");
       break;
      case DOLPHIN:
       System.out.println("������ �ΰ��� ���� �� ���� �Ҹ��� ���. - ������");
       break;
      case GOLDFISH:
       System.out.println("�ݺؾ�� ���� ���Ѵ�.");
       break;
      case PARROT:
      //PARROT�� ������ ���� ��� �������� = ���絿�� �� �ؼ� ���� ���ԵǴ� ���̾��� 
      //�ٵ� ���� PARROT�� �����鼭 -1�� �ƴϴϱ� �翬�� true���� �ǰ� "�޹����� �ΰ��� ���� �� �ִ� �Ҹ��� ���. - "�� ��µȴ�.
      //prev�� �Ʊ ���ߵ��� ���絿������ ���ϱ� �� ���� �ڿ� �޹����� ������ ���� ������ �̸��� �����Ҹ��� ���´�.
      // 0,1,2,3,4,5�� �ϳ� ���� switch(�ȿ� ��)
       if(prev != -1) {
        System.out.print("�޹����� �ΰ��� ���� �� �ִ� �Ҹ��� ���. - ");
        switch(prev) {
         case CAT:
          System.out.println("������� �����Ҹ��� �����Ѵ�. - �߿�");
          break;
         case DOG:
          System.out.println("�������� �����Ҹ��� �����Ѵ�. - �۸�");
          break;
         case TIGER:
          System.out.println("ȣ������ �����Ҹ��� �����Ѵ�. - ����");
          break;
         case DOLPHIN:
          System.out.println("������ �����Ҹ��� �����Ѵ�. - ������");
          break;
         case GOLDFISH:
          System.out.println("�ݺؾ�� ���� ���Ѵ�.");
          break;
         default:
          System.out.println("�ڱ� ������ �Ҹ��� ���.");
          break;
        }
       }
       break;
      default:
       System.out.println("�ڱ� ������ �Ҹ��� ���.");
       break;
     }
    }
   
    public static void main(String args[]) {
     int prev = -1;
     for(int i = 0; i < 20; i++) {
      int rand = (int)(Math.random() * 7) % 6;
      animal(rand, prev);
      //���࿡ ���� ������ PARROT�� �ƴ϶�� ���� ������ ���� ������ ���� ��, ���������� ���絿���� ��
      if(rand != PARROT) prev = rand;
     }
    }
   }
