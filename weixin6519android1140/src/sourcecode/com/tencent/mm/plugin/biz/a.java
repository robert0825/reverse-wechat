package com.tencent.mm.plugin.biz;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.j;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.k.b;
import com.tencent.mm.sdk.platformtools.aw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.k;
import com.tencent.mm.x.l;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class a
  implements com.tencent.mm.plugin.biz.a.a
{
  public a()
  {
    GMTrace.i(18487418290176L, 137742);
    GMTrace.o(18487418290176L, 137742);
  }
  
  public final String bv(String paramString1, String paramString2)
  {
    GMTrace.i(18487552507904L, 137743);
    paramString1 = bh.q(paramString1, "msg");
    if (paramString1 == null)
    {
      w.e("MicroMsg.AppMsgBizHelper", "getAppMsgDyeingTempFromUser fail, values is null");
      paramString1 = null;
      if ((!bg.nm(paramString1)) || (s.gc(paramString2))) {
        break label151;
      }
    }
    for (;;)
    {
      if (!bg.nm(paramString2))
      {
        if (com.tencent.mm.x.h.eU(paramString2))
        {
          paramString1 = ((b)com.tencent.mm.kernel.h.h(b.class)).pn(paramString2);
          if ((paramString1 != null) && (!TextUtils.isEmpty(paramString1.field_nickname)))
          {
            paramString1 = paramString1.field_nickname;
            GMTrace.o(18487552507904L, 137743);
            return paramString1;
            paramString1 = (String)paramString1.get(".msg.fromusername");
            break;
          }
        }
        paramString1 = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fs(paramString2);
        GMTrace.o(18487552507904L, 137743);
        return paramString1;
      }
      GMTrace.o(18487552507904L, 137743);
      return "";
      label151:
      paramString2 = paramString1;
    }
  }
  
  public final boolean eU(String paramString)
  {
    GMTrace.i(18487686725632L, 137744);
    boolean bool = com.tencent.mm.x.h.eU(paramString);
    GMTrace.o(18487686725632L, 137744);
    return bool;
  }
  
  public final k tA(String paramString)
  {
    GMTrace.i(18488089378816L, 137747);
    Object localObject1 = aw.Se(paramString);
    if (localObject1 == null)
    {
      paramString = com.tencent.mm.x.h.eV(paramString);
      GMTrace.o(18488089378816L, 137747);
      return paramString;
    }
    int i = bg.getInt((String)((Map)localObject1).get(".msg.appmsg.mmreader.category.$type"), 0);
    paramString = bg.nl((String)((Map)localObject1).get(".msg.appmsg.mmreader.name"));
    int k = bg.getInt((String)((Map)localObject1).get(".msg.appmsg.mmreader.forbid_forward"), 0);
    int j = bg.getInt((String)((Map)localObject1).get(".msg.appmsg.mmreader.category.$count"), 0);
    Object localObject2 = (String)((Map)localObject1).get(".msg.commenturl");
    k localk = new k();
    localk.type = i;
    localk.name = paramString;
    localk.fwt = ((String)localObject2);
    localk.gls = k;
    i = 0;
    if (i < j)
    {
      localObject2 = new l();
      StringBuilder localStringBuilder = new StringBuilder(".msg.appmsg.mmreader.category.item");
      if (i == 0) {}
      for (paramString = "";; paramString = String.valueOf(i))
      {
        paramString = paramString;
        ((l)localObject2).title = ((String)((Map)localObject1).get(paramString + ".title"));
        ((l)localObject2).url = ((String)((Map)localObject1).get(paramString + ".url"));
        ((l)localObject2).glv = ((String)((Map)localObject1).get(paramString + ".shorturl"));
        ((l)localObject2).glw = ((String)((Map)localObject1).get(paramString + ".longurl"));
        ((l)localObject2).time = bg.getLong((String)((Map)localObject1).get(paramString + ".pub_time"), 0L);
        ((l)localObject2).gly = ((String)((Map)localObject1).get(paramString + ".tweetid"));
        ((l)localObject2).glz = ((String)((Map)localObject1).get(paramString + ".digest"));
        ((l)localObject2).type = bg.getInt((String)((Map)localObject1).get(paramString + ".itemshowtype"), 0);
        ((l)localObject2).glB = bg.getInt((String)((Map)localObject1).get(paramString + ".play_length"), 0);
        ((l)localObject2).glx = ((String)((Map)localObject1).get(paramString + ".cover"));
        ((l)localObject2).glA = bg.getInt((String)((Map)localObject1).get(paramString + ".del_flag"), 0);
        ((l)localObject2).glC = ((String)((Map)localObject1).get(paramString + ".weapp_username"));
        ((l)localObject2).glD = ((String)((Map)localObject1).get(paramString + ".weapp_path"));
        ((l)localObject2).glE = bg.getInt((String)((Map)localObject1).get(paramString + ".weapp_version"), 0);
        ((l)localObject2).glF = bg.getInt((String)((Map)localObject1).get(paramString + ".weapp_state"), 0);
        ((l)localObject2).glG = ((String)((Map)localObject1).get(paramString + ".weapp_appid"));
        ((l)localObject2).glH = ((String)((Map)localObject1).get(paramString + ".weapp_image_url"));
        ((l)localObject2).glI = ((String)((Map)localObject1).get(paramString + ".weapp_icon"));
        ((l)localObject2).glJ = ((String)((Map)localObject1).get(paramString + ".weapp_nickname"));
        localk.glr.add(localObject2);
        i += 1;
        break;
      }
    }
    localk.gir = j.m((Map)localObject1);
    paramString = bg.nl((String)((Map)localObject1).get(".msg.fromusername"));
    if (!bg.nm(paramString))
    {
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString).vj();
      localk.eTo = paramString;
      localk.eTp = ((String)localObject1);
    }
    GMTrace.o(18488089378816L, 137747);
    return localk;
  }
  
  public final String ty(String paramString)
  {
    GMTrace.i(18487820943360L, 137745);
    paramString = bh.q(paramString, "msg");
    if (paramString == null)
    {
      w.e("MicroMsg.AppMsgBizHelper", "getAppMsgDyeingTempTitle fail, values is null");
      GMTrace.o(18487820943360L, 137745);
      return " ";
    }
    int i = bg.getInt((String)paramString.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
    String str = bg.aq((String)paramString.get(".msg.appmsg.ext_pay_info.pay_type"), "");
    if ((str.equals("wx_f2f")) || (str.equals("wx_md"))) {
      paramString = bg.nl((String)paramString.get(".msg.appmsg.title"));
    }
    for (;;)
    {
      str = paramString;
      if (bg.nm(paramString)) {
        str = " ";
      }
      GMTrace.o(18487820943360L, 137745);
      return str;
      if (i != 0) {
        paramString = bg.nl((String)paramString.get(".msg.appmsg.mmreader.template_header.title"));
      } else {
        paramString = (String)paramString.get(".msg.appmsg.mmreader.category.item.title");
      }
    }
  }
  
  public final String tz(String paramString)
  {
    GMTrace.i(18487955161088L, 137746);
    Object localObject = aw.Se(paramString);
    if (localObject == null)
    {
      localObject = com.tencent.mm.x.h.eV(paramString);
      paramString = new StringBuilder("");
      localObject = ((k)localObject).glr.iterator();
      while (((Iterator)localObject).hasNext())
      {
        l locall = (l)((Iterator)localObject).next();
        if (!bg.nm(locall.title)) {
          paramString.append(locall.title);
        }
      }
      paramString = paramString.toString();
      GMTrace.o(18487955161088L, 137746);
      return paramString;
    }
    paramString = (String)((Map)localObject).get(".msg.appmsg.mmreader.category.item.title");
    if (paramString == null)
    {
      GMTrace.o(18487955161088L, 137746);
      return "";
    }
    GMTrace.o(18487955161088L, 137746);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\biz\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */