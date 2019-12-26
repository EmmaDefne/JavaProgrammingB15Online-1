package office_hour;


public class LoopPractice {
    public static void main(String[] args) {

//jumpsayisi belirliyorum
        //sonra diyorum ki 100e kadar ziplayacagim
        //her defasinda bir artir

        for (int jumpCount = 1; jumpCount <= 100; jumpCount++) {
            System.out.println("I jumped " + jumpCount + " times");
            System.out.println("++++++++++++++++++++++++++");
            for (int go = 3; go <= 7; go++) {
                System.out.println("go go ");
                System.out.println(go);
                for (int num=23; num<=30; num++){
                    System.out.println(num);
                    for (int age=90; age>=80 ; age--){
                        System.out.println(age);
                        for (int number=1; number<=10;number++ ){
                            if (number%2==0){
                                System.out.println(number);

                                }
                            }
                        }
                    }
                }
            }

        }

    }
