package GameDemo;

import java.util.Random;

public class AdvancedRole {
    private String name;
    private int blood;
    private char gender;
    private String face;

    public AdvancedRole() {
    }

    public AdvancedRole(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    String[] boyFaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlFaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //attack 攻击描述：
    String[] attackDesc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    String[] injuredDesc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };


    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }
//随机校色的面貌
    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            int index = r.nextInt(boyFaces.length);
            this.face = boyFaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlFaces.length);
            this.face = boyFaces[index];
        }
    }
//攻击
    public void attack(AdvancedRole role){
        Random r = new Random();
        int hurt = r.nextInt(50);
        //设置被攻击者血量，如果小于0时调整为0
        role.setBlood(role.getBlood() - hurt);
        role.setBlood(role.getBlood() > 0?role.getBlood() : 0);
        //选择随机招式
        int index = r.nextInt(attackDesc.length);
        System.out.printf(attackDesc[index],this.name,role.getName());
        System.out.printf("对%s造成了%d伤害，还剩下%d血量",role.getName(),hurt,role.getBlood());
        System.out.println();
        if (role.getBlood() > 90) {
            System.out.printf(injuredDesc[0], role.getName());
        }else if(role.getBlood() > 80 && role.getBlood() <= 90){
            System.out.printf(injuredDesc[1], role.getName());
        }else if(role.getBlood() > 70 && role.getBlood() <= 80){
            System.out.printf(injuredDesc[2], role.getName());
        }else if(role.getBlood() > 60 && role.getBlood() <= 70){
            System.out.printf(injuredDesc[3], role.getName());
        }else if(role.getBlood() > 40 && role.getBlood() <= 60){
            System.out.printf(injuredDesc[4], role.getName());
        }else if(role.getBlood() > 20 && role.getBlood() <= 40){
            System.out.printf(injuredDesc[5], role.getName());
        }else if(role.getBlood() > 10 && role.getBlood() <= 20){
            System.out.printf(injuredDesc[6], role.getName());
        }else{
            System.out.printf(injuredDesc[7], role.getName());
        }
        System.out.println();
    }

    public void showRoleInfo(){
        System.out.println("姓名：" + name);
        System.out.println("血量：" + blood);
        System.out.println("性别：" + gender);
        System.out.println("面貌：" + face);
    }

}

