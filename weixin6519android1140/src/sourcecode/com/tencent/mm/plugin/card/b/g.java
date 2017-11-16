package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.d;
import com.tencent.mm.sdk.platformtools.bh;
import java.util.Map;

public final class g
{
  public static String a(d paramd)
  {
    GMTrace.i(5058397732864L, 37688);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<from_username>").append(paramd.jyR).append("</from_username>");
    localStringBuilder.append("<card_id>").append(paramd.eTJ).append("</card_id>");
    localStringBuilder.append("<card_type>").append(paramd.jxG).append("</card_type>");
    localStringBuilder.append("<from_scene>").append(paramd.eTL).append("</from_scene>");
    localStringBuilder.append("<color>").append(paramd.gjg).append("</color>");
    localStringBuilder.append("<card_type_name>").append(paramd.jyS).append("</card_type_name>");
    localStringBuilder.append("<brand_name>").append(paramd.jyT).append("</brand_name>");
    if (TextUtils.isEmpty(paramd.eTK)) {
      localStringBuilder.append("<card_ext></card_ext>");
    }
    for (;;)
    {
      localStringBuilder.append("<is_recommend>").append(paramd.jyU).append("</is_recommend>");
      localStringBuilder.append("<recommend_card_id>").append(paramd.jyV).append("</recommend_card_id>");
      paramd = localStringBuilder.toString();
      GMTrace.o(5058397732864L, 37688);
      return paramd;
      localStringBuilder.append("<card_ext>").append(paramd.eTK).append("</card_ext>");
    }
  }
  
  private static int uA(String paramString)
  {
    GMTrace.i(5058263515136L, 37687);
    if ((TextUtils.isEmpty(paramString)) || (!l.uE(paramString)))
    {
      GMTrace.o(5058263515136L, 37687);
      return 0;
    }
    int i = Integer.valueOf(paramString).intValue();
    GMTrace.o(5058263515136L, 37687);
    return i;
  }
  
  public static d uy(String paramString)
  {
    GMTrace.i(5057995079680L, 37685);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5057995079680L, 37685);
      return null;
    }
    d locald = new d();
    paramString = bh.q(paramString, "msg");
    locald.jyR = ((String)paramString.get(".msg.appmsg.carditem.from_username"));
    locald.eTJ = ((String)paramString.get(".msg.appmsg.carditem.card_id"));
    locald.jxG = uA((String)paramString.get(".msg.appmsg.carditem.card_type"));
    locald.eTL = uA((String)paramString.get(".msg.appmsg.carditem.from_scene"));
    locald.gjg = ((String)paramString.get(".msg.appmsg.carditem.color"));
    locald.jyS = ((String)paramString.get(".msg.appmsg.carditem.card_type_name"));
    locald.jyT = ((String)paramString.get(".msg.appmsg.carditem.brand_name"));
    locald.eTK = ((String)paramString.get(".msg.appmsg.carditem.card_ext"));
    locald.jyU = uA((String)paramString.get(".msg.appmsg.carditem.is_recommend"));
    locald.jyV = ((String)paramString.get(".msg.appmsg.carditem.recommend_card_id"));
    GMTrace.o(5057995079680L, 37685);
    return locald;
  }
  
  public static String uz(String paramString)
  {
    GMTrace.i(5058129297408L, 37686);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5058129297408L, 37686);
      return null;
    }
    paramString = (String)bh.q(paramString, "msg").get(".msg.appmsg.fromusername");
    GMTrace.o(5058129297408L, 37686);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */