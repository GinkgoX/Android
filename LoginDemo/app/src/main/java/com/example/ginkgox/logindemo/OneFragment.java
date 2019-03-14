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

public class OneFragment extends Fragment {
    protected ListView listView;
    private int[] image;

    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_one , container, false);
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

        final String[] move = new String[] { "《阿丽塔：战斗天使》", "《绿皮书》", "《疯狂的外星人》", "《飞驰人生》" , "《驯龙高手3》","《流浪地球》"};
        final String[] info = new String[] { "由二十世纪福斯公司出品，科幻电影大师詹姆斯•卡梅隆编剧及监制的科幻动作视效巨制《阿丽塔：战斗天使》正在热映。影片自2月22日在内地开画以来，票房持续飙升，截至发稿，影片累计票房已经突破8亿大关，跻身2019年内地票房榜TOP5。中国的年轻艺术家们也纷纷献出手绘作品，向影片及原著漫画作者木城雪户致敬。" ,
                "奥斯卡最佳影片《绿皮书》靠着得奖声势、暖心好评，全球票房高达1.8亿美金，北美票房7592万美金。这部影片在获得奥斯卡最佳影片后迅速登陆中国内地影市，上映4天，终于凭借良好口碑实现逆袭，拿下单日票房冠军宝座。",
                "2019年2月18日，历时13天8时8分，电影《疯狂的外星人》票房成功突破20亿大关，持续刷新宁浩个人导演作品票房纪录。正月十四，影片路演来到江城武汉站，导演宁浩、监制李修文、领衔主演黄渤联袂出席映后见面会，同武汉观众零距离互动，分享影片创作经历。映后见面会上，有热情的武汉观众，代表本地影迷向到场主创送上两筐新鲜香蕉，表达对电影和主创的喜爱，同时祝电影票房大卖。",
                "导演韩寒说：“巴音布鲁克没有海，heroes never die.”悬崖之下没有海，赛车驶向深渊意味着什么，想必大家都会懂。但是韩寒又说heroes never die。那天在影院看到这一行字，莫名感到泪水涌上心头。“热爱”的背后，饱含着多少辛酸，但却始终无怨无悔，每一份付出，都将在我们的生命中画上靓丽的一笔，它们都将成为自己最幸福的回忆。",
                "史诗动画《驯龙高手3》上映后势头强劲，作为系列动画完结篇，影片经受住观众挑剔严苛的眼光，北美烂番茄新鲜度高达92%，全球票房已达3.8亿美元。自影片上映以来，超20万人在票务平台给出了五星好评，猫眼评分高达9.1。\n" +
                        "作为改编自经典文学的动画电影，《驯龙高手》系列不仅讴歌了激昂的人龙史诗、感人的伙伴情意，更用点睛笔墨展现了独具魅力的女性精神。《驯龙高手3》作为该系列终章作品，延续了这种多层次的精神主题，在影片今日发布的“传奇女性”片段中，女性角色聪颖智慧、博大胸怀、勇敢担当的特点就得到了淋漓彰显：面对深陷“自卑”的小嗝嗝，母亲沃尔卡与女友阿丝翠德不离不弃温暖陪伴，她们指出他的弱点，并给予他无条件的相信与爱。",
                "“科幻小说把未来的各种可能性排列出来，让我们拥有一个更开放的头脑，能够面对未知世界的各种可能性。”中国科幻作家刘慈欣8日在阿联酋迪拜接受新华社记者专访时说。 当天，刘慈欣在迪拜参加阿联酋航空文学节并举行与读者见面交流会，现场座无虚席。随后，他还为大量排队等候的读者一一签名。 刘慈欣说，科幻文学作品能引导读者特别是青少年读者对科学产生兴趣，开拓他们的视野，激发他们的想象力和创新精神。青少年读者应该涉猎各类文学作品，去发现自己的兴趣所在。\n" + "刘慈欣说，他曾经喜爱过列夫·托尔斯泰、阿瑟·克拉克和王蒙的作品。“正是我阅读过的这些作品让我成为今天这个样子。 他表示，中国科幻作品要想获得世界性的影响力，得到外国读者的认可，必须要能讲出属于自己的好故事，把科幻本身不可替代的部分发挥出来，给国外读者不一样的感觉，这样才会有影响力。\n"
        };
        final String[] title = new String[] {"《阿丽塔：战斗天使》破8亿 艺术家献致敬手绘",
                                            "奥斯卡最佳《绿皮书》票房逆袭 内地上映4天夺冠",
                                            "《疯狂的外星人》票房突破20亿 宁浩黄渤武汉获赠香蕉致意",
                                            "《飞驰人生》的结局，究竟想告诉观众什么？",
                                            "《驯龙高手3》女性角色闪不凡光芒 原著作者坦言我们需女性英雄",
                                            "刘慈欣谈《流浪地球》：科幻电影不能照葫芦画瓢"};
        image = new int[] { R.drawable.move1, R.drawable.move2, R.drawable.move3, R.drawable.move4, R.drawable.move5, R.drawable.move6};

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
