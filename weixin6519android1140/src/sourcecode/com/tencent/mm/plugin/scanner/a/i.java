package com.tencent.mm.plugin.scanner.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.scanner.util.n;
import com.tencent.mm.plugin.scanner.util.n.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.x.f.a;
import java.util.Map;

public final class i
{
  public static String a(Context paramContext, n.a parama)
  {
    GMTrace.i(6051474702336L, 45087);
    f.a locala = new f.a();
    locala.appId = tt(parama.field_functionType);
    locala.title = parama.field_title;
    locala.description = parama.field_source;
    locala.type = 10;
    locala.url = parama.field_shareurl;
    locala.action = "";
    locala.appName = n.E(paramContext, parama.field_type);
    locala.thumburl = parama.field_thumburl;
    locala.giQ = parama.field_type;
    locala.giR = n.c(parama);
    paramContext = f.a.a(locala, null, null);
    GMTrace.o(6051474702336L, 45087);
    return paramContext;
  }
  
  public static n.a bH(String paramString, int paramInt)
  {
    GMTrace.i(6051743137792L, 45089);
    if (bg.nm(paramString))
    {
      GMTrace.o(6051743137792L, 45089);
      return null;
    }
    int i = n.FW(paramString);
    Object localObject2;
    Object localObject1;
    if (i == 3)
    {
      if (paramString == null)
      {
        GMTrace.o(6051743137792L, 45089);
        return null;
      }
      if (paramString.startsWith("<productInfo"))
      {
        localObject2 = bh.q(paramString, "productInfo");
        i = 1;
      }
      for (localObject1 = ".productInfo"; localObject2 == null; localObject1 = "")
      {
        GMTrace.o(6051743137792L, 45089);
        return null;
        localObject2 = bh.q(paramString, "product");
        i = 0;
      }
      n.a locala = new n.a();
      if (!bg.nm((String)((Map)localObject2).get((String)localObject1 + ".product.$type")))
      {
        locala.field_type = Integer.valueOf((String)((Map)localObject2).get((String)localObject1 + ".product.$type")).intValue();
        locala.field_productid = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.id"));
        locala.field_subtitle = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.subtitle"));
        locala.field_shareurl = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.shareurl"));
        locala.field_playurl = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.playurl"));
        locala.field_xmlType = 3;
        locala.field_title = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.title"));
        locala.field_thumburl = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.thumburl"));
        locala.field_source = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.source"));
        locala.field_feedbackurl = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.feedbackurl"));
        locala.field_extinfo = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.extinfo"));
        locala.field_introtitle = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.introtitle"));
        locala.field_introlink = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.introlink"));
        locala.field_getaction = bg.getInt((String)((Map)localObject2).get((String)localObject1 + ".product.getaction"), 0);
        locala.field_certification = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.certification"));
        locala.field_headerbackgroundurl = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.headerbackgroundurl"));
        locala.field_headermask = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.headermask"));
        locala.field_detailurl = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.detailurl"));
        locala.field_certificationurl = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.certificationurl"));
        locala.field_exposeurl = bg.nl((String)((Map)localObject2).get((String)localObject1 + ".product.exposeurl"));
        locala.oBs = a.j((Map)localObject2, (String)localObject1 + ".product");
        locala.l((Map)localObject2, (String)localObject1 + ".product");
        localObject1 = (String)((Map)localObject2).get((String)localObject1 + ".functionType");
        if (bg.nm((String)localObject1)) {
          break label994;
        }
        locala.field_functionType = Integer.valueOf((String)localObject1).intValue();
        label964:
        if (i == 0) {
          break label1003;
        }
      }
      for (locala.field_xml = paramString;; locala.field_xml = ((StringBuilder)localObject1).toString())
      {
        GMTrace.o(6051743137792L, 45089);
        return locala;
        locala.field_type = 0;
        break;
        label994:
        locala.field_functionType = paramInt;
        break label964;
        label1003:
        localObject1 = new StringBuilder(256);
        ((StringBuilder)localObject1).append("<productInfo>");
        ((StringBuilder)localObject1).append(paramString);
        ((StringBuilder)localObject1).append("<functionType>" + locala.field_functionType + "</functionType>");
        ((StringBuilder)localObject1).append("</productInfo>");
      }
    }
    if (i == 4)
    {
      if (paramString == null)
      {
        GMTrace.o(6051743137792L, 45089);
        return null;
      }
      localObject1 = bh.q(paramString, "search");
      if (localObject1 == null)
      {
        GMTrace.o(6051743137792L, 45089);
        return null;
      }
      localObject2 = new n.a();
      ((n.a)localObject2).field_xmlType = 4;
      ((n.a)localObject2).field_xml = paramString;
      ((n.a)localObject2).oBs = a.j((Map)localObject1, ".search");
      GMTrace.o(6051743137792L, 45089);
      return (n.a)localObject2;
    }
    GMTrace.o(6051743137792L, 45089);
    return null;
  }
  
  public static String tt(int paramInt)
  {
    GMTrace.i(6051608920064L, 45088);
    if (paramInt == 4)
    {
      GMTrace.o(6051608920064L, 45088);
      return "wxfbc915ff7c30e335";
    }
    if (paramInt == 3)
    {
      GMTrace.o(6051608920064L, 45088);
      return "wx482a4001c37e2b74";
    }
    GMTrace.o(6051608920064L, 45088);
    return "wxfbc915ff7c30e335";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */