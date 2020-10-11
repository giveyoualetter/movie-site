package com.utils;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.movie.MovieInfo;
import org.junit.Test;

public class JsonTest {
    @Test
    public void testJson() {
        String jsonStr = "{\"id\":1," +
                "\"mtitle\":\"复仇者联盟4：终局之战\"," +
                "\"murl\":\"https://cdn.letv-cdn.com/share/z3MfxMUrYfPBsFtB*https://tv1.youkutv.cc/share/h50NbjAIvNdLhuvc\"," +
                "\"mintro\":\"复仇者联盟4：终局之战剧情介绍：漫威影业枯誉出品《复恩者同盟4：了局之战》，故事产死正在灭霸排除宇宙一半的死灵并重创复恩者同盟以后，残剩的俊杰被迫破釜沉船，为22部漫威电影写下传奇终章。<人死便如吸吸。吸，是为了给自身出心气；吸，是为了给自身争心气。>复仇者联盟4：终局之战电视剧免费在线观看全集/大结局...\"," +
                "\"mpicture\":\"https://bkimg.cdn.bcebos.com/pic/2cf5e0fe9925bc31a5ffa7e950df8db1cb137025?x-bce-process=image/watermark,image_d2F0ZXIvYmFpa2UyNzI=,g_7,xp_5,yp_5\"," +
                "\"mplace\":\"美国\"," +
                "\"mactor\":\"布丽·拉尔森 小罗伯特·唐尼 克里斯·海姆斯沃斯 斯嘉丽·约翰逊 \"," +
                "\"mpublished\":\"2019\"," +
                "\"mdirector\":\"安东尼·罗素 乔·罗素\"," +
                "\"mtype\":\"科幻\"," +
                "\"mscore\":9.0}";

        MovieInfo movieInfo = JSON.parseObject(jsonStr, MovieInfo.class);
        System.out.println(movieInfo.getMurl());
    }
}
