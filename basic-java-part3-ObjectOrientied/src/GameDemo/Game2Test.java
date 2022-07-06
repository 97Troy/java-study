package GameDemo;

public class Game2Test {
    public static void main(String[] args) {
        AdvancedRole r1 = new AdvancedRole("alex",200,'男');
        AdvancedRole r2 = new AdvancedRole("jinx", 200, '女');

        while(true){
            //r1攻击r2
            r1.attack(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }

        r1.showRoleInfo();
        r2.showRoleInfo();
    }
}
