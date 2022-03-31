import java.util.Scanner;
public class UserChoice {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        String input;
        char choice;
        boolean goAgain = false;
        do{
            System.out.print("如果你键入‘a’的话，会出现“Hello World!” 如果你键入任何其他字母，会出现：¯\\_(ツ)_/¯\n>");
            input = k.next();
            choice = input.charAt(0);
            if(choice=='a'){
                System.out.println("Hello World!");
            }else{
                System.out.println("¯\\_(ツ)_/¯");
            }

            do{
                System.out.print("\n只能输入y或者n [y/n]\n>");
                input = k.next().toLowerCase();
                choice = input.charAt(0);
                    switch (choice){
                        case 'y':
                        goAgain=true;
                        break;
                        case 'n':
                        goAgain = false;
                        break;
                        default:
                        System.out.println("不对。");
                    }
            }while(choice != 'y' && choice != 'n');
        }while(goAgain);  
        k.close();
    }
}
