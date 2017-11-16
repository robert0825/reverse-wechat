package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.f.b.a.c;
import com.tencent.mm.plugin.exdevice.f.b.a.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.f.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class a
{
  public static ArrayList<d> a(String paramString1, String paramString2, String paramString3, String paramString4, Map<String, String> paramMap, List<c> paramList)
  {
    GMTrace.i(11186779193344L, 83348);
    w.d("MicroMsg.ExdeviceMsgXmlParser", paramString3);
    if (bg.nm(paramString3))
    {
      w.e("MicroMsg.ExdeviceMsgXmlParser", "rank info is null or nil");
      GMTrace.o(11186779193344L, 83348);
      return null;
    }
    paramString3 = f.a.C(paramString3, paramString4);
    if (paramString3 != null)
    {
      paramString4 = paramString3.git;
      ArrayList localArrayList = new ArrayList();
      boolean bool;
      int i;
      Object localObject1;
      if (paramString4 == null)
      {
        bool = true;
        w.d("MicroMsg.ExdeviceMsgXmlParser", "map is null :%s", new Object[] { Boolean.valueOf(bool) });
        if ((paramString4 == null) || (paramString4.isEmpty())) {
          break label717;
        }
        w.d("MicroMsg.ExdeviceMsgXmlParser", "ap: map %s", new Object[] { paramString4.toString() });
        i = 0;
        localObject1 = new StringBuilder(".msg.appmsg.hardwareinfo.follows.follow");
        if (i != 0) {
          break label328;
        }
        paramString3 = "";
        label141:
        localObject1 = (String)paramString4.get(paramString3 + ".username");
        if (!bg.nm((String)localObject1)) {
          break label337;
        }
        w.i("MicroMsg.ExdeviceMsgXmlParser", "follow should break now : %d", new Object[] { Integer.valueOf(i) });
        i = 0;
        paramList = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
        if (i != 0) {
          break label511;
        }
        paramString3 = "";
        label215:
        paramList = (String)paramString4.get(paramString3 + ".username");
        localObject1 = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
        if (i != 0) {
          break label520;
        }
      }
      label328:
      label337:
      label356:
      Object localObject3;
      label502:
      label511:
      label520:
      for (paramString3 = "";; paramString3 = Integer.valueOf(i))
      {
        localObject1 = (String)paramString4.get(paramString3 + ".nickname");
        if (!bg.nm(paramList)) {
          break label529;
        }
        w.i("MicroMsg.ExdeviceMsgXmlParser", "should break now : %d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(11186779193344L, 83348);
        return localArrayList;
        bool = false;
        break;
        paramString3 = Integer.valueOf(i);
        break label141;
        localObject2 = new StringBuilder(".msg.appmsg.hardwareinfo.follows.follow");
        if (i == 0)
        {
          paramString3 = "";
          localObject2 = (String)paramString4.get(paramString3 + ".nickname");
          localObject3 = new StringBuilder(".msg.appmsg.hardwareinfo.follows.follow");
          if (i != 0) {
            break label502;
          }
        }
        for (paramString3 = "";; paramString3 = Integer.valueOf(i))
        {
          paramString3 = (String)paramString4.get(paramString3 + ".step");
          localObject3 = new c();
          ((c)localObject3).field_appusername = paramString2;
          ((c)localObject3).field_username = ((String)localObject1);
          ((c)localObject3).field_rankID = paramString1;
          ((c)localObject3).field_step = bg.getInt(paramString3, 0);
          paramList.add(localObject3);
          paramMap.put(localObject1, localObject2);
          i += 1;
          break;
          paramString3 = Integer.valueOf(i);
          break label356;
        }
        paramString3 = Integer.valueOf(i);
        break label215;
      }
      label529:
      Object localObject2 = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
      if (i == 0)
      {
        paramString3 = "";
        label548:
        localObject2 = (String)paramString4.get(paramString3 + ".rank.rankdisplay");
        localObject3 = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
        if (i != 0) {
          break label708;
        }
      }
      label708:
      for (paramString3 = "";; paramString3 = Integer.valueOf(i))
      {
        int j = bg.getInt((String)paramString4.get(paramString3 + ".score.scoredisplay"), 0);
        paramString3 = new d();
        paramString3.field_appusername = paramString2;
        paramString3.field_rankID = paramString1;
        paramString3.field_username = paramList;
        paramString3.field_ranknum = bg.getInt((String)localObject2, 0);
        paramString3.field_score = j;
        paramString3.field_selfLikeState = 2;
        paramString3.field_likecount = 0;
        localArrayList.add(paramString3);
        paramMap.put(paramList, localObject1);
        i += 1;
        break;
        paramString3 = Integer.valueOf(i);
        break label548;
      }
    }
    label717:
    GMTrace.o(11186779193344L, 83348);
    return null;
  }
  
  public static void b(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    int k = 0;
    GMTrace.i(11186913411072L, 83349);
    w.d("MicroMsg.ExdeviceMsgXmlParser", "ap: only nickname: %s", new Object[] { paramString1 });
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.ExdeviceMsgXmlParser", "rank info is null or nil");
      GMTrace.o(11186913411072L, 83349);
      return;
    }
    paramString1 = f.a.C(paramString1, paramString2);
    if (paramString1 != null)
    {
      paramString2 = paramString1.git;
      if ((paramString2 != null) && (!paramString2.isEmpty()))
      {
        int i = 0;
        Object localObject = new StringBuilder(".msg.appmsg.hardwareinfo.follows.follow");
        label97:
        int j;
        StringBuilder localStringBuilder;
        if (i == 0)
        {
          paramString1 = "";
          localObject = (String)paramString2.get(paramString1 + ".username");
          j = k;
          if (bg.nm((String)localObject)) {
            break label207;
          }
          localStringBuilder = new StringBuilder(".msg.appmsg.hardwareinfo.follows.follow");
          if (i != 0) {
            break label199;
          }
        }
        label199:
        for (paramString1 = "";; paramString1 = Integer.valueOf(i))
        {
          paramMap.put(localObject, (String)paramString2.get(paramString1 + ".nickname"));
          i += 1;
          break;
          paramString1 = Integer.valueOf(i);
          break label97;
        }
        label207:
        localObject = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
        if (j == 0)
        {
          paramString1 = "";
          label226:
          localObject = (String)paramString2.get(paramString1 + ".username");
          localStringBuilder = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
          if (j != 0) {
            break label330;
          }
        }
        label330:
        for (paramString1 = "";; paramString1 = Integer.valueOf(j))
        {
          paramString1 = (String)paramString2.get(paramString1 + ".nickname");
          if (bg.nm((String)localObject)) {
            break label339;
          }
          paramMap.put(localObject, paramString1);
          j += 1;
          break;
          paramString1 = Integer.valueOf(j);
          break label226;
        }
      }
    }
    label339:
    GMTrace.o(11186913411072L, 83349);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */