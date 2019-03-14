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

public class ThreeFragment extends Fragment {
    protected ListView listView;
    private int[] image;

    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_three , container, false);
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

        final String[] move = new String[] { "【1】", "【2】", "【3】", "【4】","【5】","【6】" };
        final String[] info = new String[] { "中国台湾网3月12日讯 据台湾“中时电子报”报道，高雄市长韩国瑜月底将来大陆参访，蔡英文暗酸韩国瑜是遭到“政治性采购”利诱。韩国瑜怒呛“非常厌烦!”并质疑难道希望农民辛苦出产的农产品最后都变成堆肥吗？\n" +
                "　　对于绿媒酸的“韩国瑜返台不到两周，新加坡最大连锁超市的‘高雄首选专区’就被撤掉”一事，韩国瑜澄清，新加坡超市卖的高雄水果是被采购一空，明明卖了“全垒打”，却被说成下架，太多这种无聊的语言在台湾天空转来转去，让人觉得非常厌烦。他还表示，高雄市政府知道自己权责所在，认真把农产品、水产品卖出去，有什么好说的？不用再去扣帽子。\n" ,
                "在回答记者关于“新经济和人才培养的关系”问题时，白重恩介绍，现在很多引人注目的互联网企业，提供的服务主要是消费者导向。比如社交软件、支付软件和购物应用等都是针对消费者的。但是我们会面临一个变化，就是数字经济逐渐由消费者导向转向生产者导向，因为在产业升级的过程中需要用数字经济来给企业赋能，这样的转变对人才提出了更高的要求。",
                "习近平、李克强、栗战书、汪洋、王沪宁、赵乐际、韩正、王岐山等出席会议。最高人民法院院长周强从七个方面报告了2018年主要工作：一是深入学习贯彻习近平新时代中国特色社会主义思想，坚持党对人民法院工作的绝对领导；二是依法惩罚犯罪、保护人民，坚决维护国家安全和社会稳定；三是贯彻新发展理念，服务保障经济高质量发展；四是坚持以人民为中心，努力满足人民群众司法需求；五是深化司法体制改革和智慧法院建设，推进审判体系和审判能力现代化；六是坚持全面从严治党、从严治院，建设过硬人民法院队伍；七是自觉接受监督，促进司法为民公正司法。\n",
                "“打赢脱贫攻坚战，是今明两年必须完成的硬任务”，在内蒙古、甘肃、河南、福建四个代表团，习近平都谈到脱贫攻坚工作。今明两年，脱贫攻坚“正是最吃劲的时候”，“剩下的都是贫中之贫、困中之困，都是难啃的硬骨头”，习近平鼓励广大领导干部：不获全胜、决不收兵！ 脱贫攻坚任务能否完成，关键在人，关键在干部队伍作风。\n",
                "3月5日，习近平参加内蒙古代表团审议，集中谈了一件大事——生态环境保护。习近平先是用“四个一”，强调生态文明建设重要性：在“五位一体”总体布局中生态文明建设是其中一位，在新时代坚持和发展中国特色社会主义基本方略中坚持人与自然和谐共生是其中一条基本方略，在新发展理念中绿色是其中一大理念，在三大攻坚战中污染防治是其中一大攻坚战。紧接着，习近平要求“各地区各部门要认真贯彻落实，努力推动我国生态文明建设迈上新台阶”。\n",
                "3月8日，习近平在河南代表团参加审议。来自河南农村的李连成代表谈到农民还有八个梦想：找到一个好的学校上学、找到一个好的医院、就地就业、村里面有一个好的生态环境……习近平称赞他讲得很生动，当场告诫领导干部：我们的宗旨就是为人民服务，围绕着人民群众对幸福美好生活的追求来实践。我们这个实践过程是一步一个脚印，一棒接着一棒往前走。\n"
        };
        final String[] title = new String[] {"被蔡英文酸遭政治采购利诱 韩国瑜呛:非常厌烦",
                "白重恩委员：产业升级需要数字经济赋能 对人才提出更高要求",
                "十三届全国人大二次会议举行第三次全体会议",
                "谈“脱贫攻坚”：要有顽强作风，也要有长远眼光",
                "谈“生态环境保护”：要不动摇、不松劲、不开口子",
                "谈“乡村振兴”：要一步一个脚印，一棒接着一棒往前走"
        };
        image = new int[] { R.drawable.zz1, R.drawable.zz2, R.drawable.zz3, R.drawable.zz4, R.drawable.zz5, R.drawable.zz6 };

        List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
        for(int i = 0; i < 6; i++){
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
