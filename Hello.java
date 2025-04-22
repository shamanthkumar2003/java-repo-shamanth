package operator;
public class Hello {
    public static void main(String[] args) {
        int age =25;
        String name="Shamanth";
        float salary=23400.5f;
        char b_group='O';
        String[] hobbies={"cricket","coding"};
        System.out.println(age+" "+name+" "+salary+" "+b_group);
        for (String item:hobbies){
            System.out.println(item+" ");
        }

            int n_age=age+100;
            int nn_age=age/10;
            if(nn_age>=18){
                System.out.println("he is an adult");
            }


            n_age-=100;

            if(n_age==age){
                System.out.println("Correct");

            }
            int res=n_age & 0x0f;
            System.out.println(res);

            if(age>10 && name=="Shamanth"){
                System.out.println("allow him to pub");

            }


            System.out.println(age > 18 ? "Allow him to vote" : "Do not allow him to vote");


          if(4=='a'){
            System.out.println("working");
          }
          else{
            System.out.println(" not working");
          }
          
          int leftShift = 10 >> 9;
          System.out.println(leftShift);

          int  rightShift = 10 << 7;
          System.out.println(rightShift);

          int orOperator = 3 | 4;
          System.out.println(orOperator);

          int power = 3 ^ 4;
          System.out.println(power);

          int difference = 3 - 9 ;
          System.out.println(difference);

          int unary = ++power - difference--;
          System.out.println(unary);

          boolean bool= true;
          System.out.println(bool);

           int negation= 5;
           negation=~negation;
           System.out.println("i="+negation);

           if(difference!= 9  || unary ==6){
            System.out.println(difference+unary);

           }
            else {
                
            System.out.println(difference+unary);
            }

           //if else

           if(3==4){
            System.out.println("true");
           }
           else{
            System.out.println("false");
           }

           //for

           for(int i=0;i<5;i++){
            System.out.println(i+" ");
           }

           //for-each

           for (String item:hobbies){
            System.out.println(item+" ");
           }

          //switch
          
            
           int num=randomNumber();

           switch(num){
                case 1-> System.out.println("mon"); 
            
                case 2-> System.out.println("tue"); 

                case 3-> System.out.println("Wed");

                case 4->System.out.println("Thu");  

                case 5-> System.out.println("fri");

                case 6-> System.out.println("sat");

                case 7-> System.out.println("sun");
                 }

         //while

         int i=0;
         while(i<10){
            i=i+1;
         }

         //do while

        
        







    }

    public static  int randomNumber(){
        int num=(int)(Math.random() * 7) +1;
        return num;

  }




}