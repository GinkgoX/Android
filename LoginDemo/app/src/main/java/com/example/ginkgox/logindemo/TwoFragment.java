package com.example.ginkgox.logindemo;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoFragment extends Fragment {
    protected ListView listView;
    private int[] image;

    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_two , container, false);
        listView = (ListView)view.findViewById(R.id.listview);
        final List<Map<String, Object>> list=getData();
        listView.setAdapter(new ListViewAdapter(getActivity(), list));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra("image",image[i]);
                intent.putExtra("title", list.get(i).get("title").toString());
                intent.putExtra("info", list.get(i).get("info").toString());
                startActivity(intent);
            }
        });
        return view;
    }

    public List<Map<String, Object>> getData(){

        final String[] move = new String[] { "来源：机车萌娃", "来源：猫眼娱乐", "来源：阿金香", "来源：雪儿侃娱乐","来源：小肥聊娱乐" };
        final String[] info = new String[] { "'冯绍峰晒老婆，霍建华晒老婆，罗晋晒老婆，都不及他','虽然杨幂和刘恺威离婚了，又让很多人直呼不相信爱情了，但是娱乐圈中模范夫妻还是挺多的，今天就来看看这些晒妻狂魔，冯绍峰晒老婆，霍建华晒老婆，罗晋晒老婆，都不及他晒老婆。冯绍峰和赵丽颖在去年结婚后，虽然很少露面，但是在之前的一些活动中还是可以看见两人的身影的，从两人的状态来看，就知道婚后的生活有多甜蜜了。霍建华和林心如两人都是比较低调的，现在也有一个女儿了，霍建华也从一个宠妻狂魔，变成了一个女儿奴，甚至连林心如有时也会吃醋呢。罗晋有多疼唐嫣，大家都是看在眼里的，在没结婚之前就对唐嫣呵护倍置，两人的婚姻也受到了很多粉丝和好友的祝福，现在两人真的非常甜蜜呢。不过要说晒老婆，还是这位最厉害，那就是吴奇隆，吴奇隆真是实力宠妻啊，两人虽然相差一定年龄岁数，但是两人站在一起真是非常的养眼和搭配啊。",
                "'王菲带女儿与好友聚会，12岁李嫣身高已超妈妈肩膀','近日，有媒体拍到王菲带李嫣参加与好友的聚会。王菲身穿黑色厚重羽绒服，戴着毛线帽搭配喇叭裤，而李嫣则是身穿白色长款羽绒服，也带着帽子。母女两人看起来包裹的都非常严实，照片中，刚刚在去年8月做完兔唇修复手术的李嫣状态不错，与妈妈有说有笑，两人不时交谈着，看起来心情非常不错。而网友也发现，年仅12岁的李嫣身高却比同龄人高了不少，与妈妈站在一起，都超过了王菲肩膀位置，身材也非常不错，看来也的确是继承了爸爸妈妈身高的优势。前不久，有媒体拍到王菲带李嫣去香港购物，虽然从小与爸爸李亚鹏一起生活，但还是能从她的身上看出妈妈非常随性的气质，网友也说：“真是越来越像妈妈了。”看来王菲平时也没少与女儿相处，又陪着购物又带去跟朋友聚会，看得出来她做妈妈的用心。可能是因为李嫣从小就被王菲带着出席各种社交场合，有先天性缺陷的她无论是在陌生人面前还是在镜头前，都是非常有自信的，从她拍的杂志封面中就能看出。",
                "'邓超去吃饭刷卡却没钱，打电话怒问孙俪，娘娘的回答笑翻全场','邓超去吃饭刷卡却没钱, 打电话怒问孙俪, 娘娘的回答笑翻全场众所周知，在娱乐界找到真诚的爱情并不容易，比如赵丽颖冯绍峰，唐嫣罗晋，谢娜张杰。这些对比较着名，但在网友眼中，圈内是真正的“模范夫妻”，一定是邓超和孙俪。邓超和孙俪在拍摄中相遇。那时，两人共同主演了电视剧《幸福像花儿一样》。因此，他们彼此联系在一起。后来，他们在2010年登记结婚。不久之后，孙俪怀孕了，邓超推了所有的通告。为了照顾怀孕的孙俪，可以看出邓超绝对是个好丈夫。这两个人已经结婚8年了。在这八年中，邓超和孙俪仍然像以往一样热爱。这两个人经常在微博上展示对狗食的热爱。邓超和孙俪结婚到现在。八卦绯闻都没有，特别宠爱孙俪，所以大家都说邓超是一个不可多得的好人，他们经常开个玩笑。邓超曾在一个节目中透露他遇到了一件非常尴尬的事情。有一次邓超邀请朋友吃饭，并提前安排好，但当他终于付账时，邓超想要交卡，但服务员说卡没钱，场面非常尴尬，而邓超作为公众人物，这样的事情发生了，难免有些面临失落。那时，邓超感到很生气。他立即打了个电话问孙俪，说我的卡怎么没有钱呢？接到邓超电话的孙俪也一脸无辜。后来，她的回答笑了起来，转向观众。事实证明，孙俪忘了给邓超转钱。他听到了孙俪的无辜回答。所有的网友都笑了，但这看起来也很明白这两个人真的很有爱心。邓超常常在节目中声称自己是家中最高的，但这次卡里没有钱付钱，而且还打电话给孙俪，这真是令人痛苦，但邓超做了，这也说明他是难怪邓超和孙俪可以成为娱乐业的“模范夫妻”。事实证明，每天都是如此的爱。邓超和他的妻子都是娱乐界的强大演员。孙俪的精湛演技在《甄嬛传》已经是证明了。即使是现在，很多人都会称孙俪是少女，而邓超的表演更不用说他是在处于《李米的猜想》、《烈日灼心》和《狄仁杰之通天帝国》和其他知名电影都表现出非凡的表现。",
                "'42岁黄奕与女儿合照，嘟嘴相拥画面温馨，看着都觉得甜蜜'，'黄奕，相信大家之前都有看过《还珠格格》第三部吧，其中里面的“小燕子”扮演者黄奕当时也是继赵薇后被大家喜欢的女演员，之后她所饰演的电视剧也是非常的受到很多观众喜爱，不过虽然在事业上很成功的黄奕，在感情上的黄奕则是非常的坎坷了，如今42岁的黄奕与女儿合照同框，俩人嘟嘴相拥画面超显温馨，看着都觉得很幸福呢，究竟是怎么样的呢？如今跟女儿一起生活的黄奕也是无时无刻体现出了一种母爱的模样，穿着一身印花的衬衫搭配黑色的裙子，扎起丸子头从侧面上看去也是显得很少女感的模样，在粉色系的气球跟墙面上的正在跟女儿嘟着嘴的黄奕看起来也是非常的显幸福的画面感啊，看到这样的画面是不是要被她们的爱深深的吸引住了呢？",
                "'电影版的《一吻定情》由王大陆和林允共同演绎“女追男的必修课”'，'由《我的少女时代》导演陈玉珊执导，王大陆、林允主演的爱情电影《一吻定情》将于情人节上映。电影曝光了一支“女追男必修课”的花絮视频。从追男神需要的体能到心理，林允在片场身体力行地为大家传授了“女追男”的四大必备技能。逗趣的同时，还让人窥见了电影中“原湘琴”对“江直树”的种种追爱勇事，也令人对这部甜甜的“女追男”爱情电影有了更多的好奇。王大陆，林允主演电影《一吻定情》发布终极海报和新剧照。林允清新学生气质令人心动，王大陆则是身着校服有一丝丝学霸的气场呢。影片由陈玉珊(《我的少女时代》)执导，讲述勇气少女原湘琴猛追天才少年江直树的校园爱情故事，，将于2019年2月14日情人节上映，期待了！'"
        };
        final String[] title = new String[] {"明星秀恩爱",
                "王菲女儿超有气质",
                "邓超和孙俪的爱情",
                "黄奕与女儿合照",
                "《一吻定情》翻拍"
        };
        image = new int[] { R.drawable.mx1, R.drawable.mx2, R.drawable.mx3, R.drawable.mx4, R.drawable.mx5};

        List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
        for(int i = 0; i < 5; i++){
            Map<String, Object> map=new HashMap<String, Object>();
            map.put("image", image[i]);
            map.put("title", title[i]);
            map.put("move", move[i]);
            map.put("info", info[i]);
            list.add(map);
        }
        return list;
    }
}
