package objectarray;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] girlFriends = new GirlFriend[4];
        GirlFriend gf1 = new GirlFriend("小诗诗",18,"萌妹子","吃零食");
        GirlFriend gf2 = new GirlFriend("小丹丹",19,"萌妹子","玩游戏");
        GirlFriend gf3 = new GirlFriend("小惠惠",20,"萌妹子","看书，学习");
        GirlFriend gf4 = new GirlFriend("小莉莉",21,"憨妹子","睡觉");

        girlFriends[0] = gf1;
        girlFriends[1] = gf2;
        girlFriends[2] = gf3;
        girlFriends[3] = gf4;
        //平均年龄
        int sum = 0;
        for (GirlFriend girlFriend : girlFriends){
            sum += girlFriend.getAge();
        }
        int avgAge = sum / girlFriends.length;
        System.out.println(avgAge);

        for(GirlFriend girlFriend : girlFriends){
            if (girlFriend.getAge() < avgAge){
                girlFriend.showInfo();
            }
        }

    }
}
