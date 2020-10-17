import java.util.*;
class Quizapp{

    public static void main(String[] args){
     
        String q1 = "What color are apples?\n"+ "(a)Red\n(b)Green\n(c)Yellow\n(d)Magenta";

        String q2 = "What color are banannas?\n"+ "(a)Red\n(b)Green\n(c)Yellow\n(d)Blue";

        String q3 = "What color are grapes?\n"+ "(a)Red\n(b)Green\n(c)Yellow\n(d)Black";

        String q4 = "What color are tomatoes?\n"+ "(a)Red\n(b)Green\n(c)Yellow\n(d)Black";

        String q5 = "What color are water melons?\n"+ "(a)Red\n(b)Green\n(c)Yellow\n(d)Black";

        Question[] Ques ={
              new Question(q1, "a"),
              new Question(q2, "c"),
              new Question(q3, "b"),
              new Question(q4, "a"),
              new Question(q5, "b")};

        takeTest(Ques);
     }


     public static void takeTest(Question[] ques){
         int score = 0;
         Scanner sc = new Scanner(System.in);
         for(int i = 0; i<ques.length; i++){
           System.out.println(ques[i].prompt);
           String answer = sc.nextLine();
           if(answer.equals(ques[i].answer)){
               score++;
           }
         }
         System.out.println("Your score is" + " " + score);
     }
}