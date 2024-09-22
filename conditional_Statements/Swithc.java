
package conditional_Statements;

import java.util.*;;
/*syntax
Switch(variable){
case 1: st1;
break;
case 2: st2;
break;
case 3: st3;
break;
default:st4
}
 */

public class Swithc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");

        }
    }

}
