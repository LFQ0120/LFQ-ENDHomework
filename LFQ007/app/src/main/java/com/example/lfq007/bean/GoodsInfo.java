package com.example.lfq007.bean;

import com.example.lfq007.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "华硕RT-AX89X", "华硕显示器", "iPhone 11", "塔式电脑主机", "保友Ergonor电脑椅", "利奥博德键盘","罗技鼠标"," AirPods Pro","雷蛇游戏耳机","梵帝莱 中式实木台灯"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "【第六代WiFi | 双10G口】华硕（ASUS）RT-AX89X高通四核/8x8MU-Mimo电竞游戏路由器/全千兆WiFi6路由器",
            "华硕（ASUS）ROG SWIFT PG65UQ 65英寸 4K高清 120Hz 电竞显示器",
            "Apple iPhone 11 (A2223) 128GB 绿色 移动联通电信4G手机 双卡双待",
            "Apple 2019款 Mac Pro 32G 256G 八核 Intel Xeon W（3.5GHz）+AMD RP580X 塔式电脑主机/工作站 Z0W300056",
            "保友Ergonor电脑椅智能网椅电竞人体工学升降旋转家用办公椅金豪+精英版带躺舒宝灰色",
            "利奥博德 Leopold FC980M OE 加厚PBT二色成型键帽 98键 紧凑型 机械键盘 白桃【OE】 紫轴",
            "罗技GPRO WIRELESS 粉色GPW狗屁王无线游戏鼠标电竞轻量化 粉GPW",
            "Apple AirPods Pro 主动降噪无线蓝牙耳机 适用iPhone/iPad/Apple Watch",
            "雷蛇 Razer 北海巨妖标准版X 北海巨妖标准版升级款 头戴式游戏耳机 电竞耳麦 7.1 电脑手机耳机 黑色",
            "梵帝莱 中式实木台灯卧室床头灯 北欧现代简约创意时尚温馨装饰复古可调光LED暖光木质台灯 A款 按钮开关 +5WLED灯泡"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {4999, 34999, 4999, 47999, 3518, 1179,1699,1999,249,108};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.lyq_s, R.drawable.xsq_s, R.drawable.sj_s,
            R.drawable.dn_s, R.drawable.djy_s, R.drawable.jp_s,
            R.drawable.sb_s,R.drawable.air_s,R.drawable.ej_s,R.drawable.td_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.lyq, R.drawable.xsq, R.drawable.sj,
            R.drawable.dn, R.drawable.djy, R.drawable.jp,
            R.drawable.sb,R.drawable.air,R.drawable.ej,R.drawable.td
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
