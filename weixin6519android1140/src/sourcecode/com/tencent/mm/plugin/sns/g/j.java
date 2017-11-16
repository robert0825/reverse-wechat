package com.tencent.mm.plugin.sns.g;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anw;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.protocal.c.bhq;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.brn;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class j
{
  public static String iZZ;
  public static String jaa;
  public static String jab;
  
  static
  {
    GMTrace.i(8868704813056L, 66077);
    jab = "]]>";
    iZZ = "<TimelineObject>";
    jaa = "</TimelineObject>";
    GMTrace.o(8868704813056L, 66077);
  }
  
  private static String Ia(String paramString)
  {
    GMTrace.i(8868302159872L, 66074);
    if (paramString == null)
    {
      GMTrace.o(8868302159872L, 66074);
      return "";
    }
    GMTrace.o(8868302159872L, 66074);
    return paramString;
  }
  
  private static String Ib(String paramString)
  {
    GMTrace.i(8868436377600L, 66075);
    if (bg.nm(paramString))
    {
      GMTrace.o(8868436377600L, 66075);
      return "";
    }
    if (paramString.matches("\\d*")) {}
    for (int i = 1; i != 0; i = 0)
    {
      GMTrace.o(8868436377600L, 66075);
      return paramString;
    }
    GMTrace.o(8868436377600L, 66075);
    return "";
  }
  
  public static String b(biz parambiz)
  {
    GMTrace.i(8868570595328L, 66076);
    a locala = new a();
    Object localObject1 = new HashMap();
    locala.to("TimelineObject");
    locala.to("id");
    Object localObject2;
    label1434:
    Object localObject3;
    if ((parambiz.mmR == null) || (parambiz.mmR.equals("")))
    {
      locala.setText("0");
      locala.tp("id");
      if (parambiz.jhi != null)
      {
        locala.to("username");
        locala.setText(parambiz.jhi);
        locala.tp("username");
      }
      locala.to("createTime");
      locala.setText(parambiz.nFd);
      locala.tp("createTime");
      locala.to("contentDescShowType");
      locala.uG(parambiz.uUe);
      locala.tp("contentDescShowType");
      locala.to("contentDescScene");
      locala.uG(parambiz.uUf);
      locala.tp("contentDescScene");
      locala.to("private");
      locala.setText(parambiz.uCQ);
      locala.tp("private");
      if ((parambiz.uUb != null) && (!bg.nm(parambiz.uUb.mmR)))
      {
        locala.to("appInfo");
        locala.to("id");
        locala.setText(Ia(parambiz.uUb.mmR));
        locala.tp("id");
        locala.to("version");
        locala.setText(Ia(parambiz.uUb.jhO));
        locala.tp("version");
        locala.to("appName");
        locala.setText(Ia(parambiz.uUb.lRT));
        locala.tp("appName");
        locala.to("installUrl");
        locala.setText(Ia(parambiz.uUb.tQE));
        locala.tp("installUrl");
        locala.to("fromUrl");
        locala.setText(Ia(parambiz.uUb.tQF));
        locala.tp("fromUrl");
        locala.tp("appInfo");
      }
      if ((parambiz.uUh != null) && (!bg.nm(parambiz.uUh.gkI)))
      {
        locala.to("streamvideo");
        locala.to("streamvideourl");
        locala.setText(Ia(parambiz.uUh.gkI));
        locala.tp("streamvideourl");
        locala.to("streamvideototaltime");
        locala.uG(parambiz.uUh.gkJ);
        locala.tp("streamvideototaltime");
        locala.to("streamvideotitle");
        locala.setText(Ia(parambiz.uUh.gkK));
        locala.tp("streamvideotitle");
        locala.to("streamvideowording");
        locala.setText(Ia(parambiz.uUh.gkL));
        locala.tp("streamvideowording");
        locala.to("streamvideoweburl");
        locala.setText(Ia(parambiz.uUh.gkM));
        locala.tp("streamvideoweburl");
        locala.to("streamvideothumburl");
        locala.setText(Ia(parambiz.uUh.gkN));
        locala.tp("streamvideothumburl");
        locala.to("streamvideoaduxinfo");
        locala.setText(Ia(parambiz.uUh.gkO));
        locala.tp("streamvideoaduxinfo");
        locala.to("streamvideopublishid");
        locala.setText(Ia(parambiz.uUh.gkP));
        locala.tp("streamvideopublishid");
        locala.tp("streamvideo");
      }
      locala.to("contentDesc");
      locala.setText(Ia(parambiz.uTZ));
      locala.tp("contentDesc");
      locala.to("contentattr");
      locala.setText(parambiz.giA);
      locala.tp("contentattr");
      locala.to("sourceUserName");
      locala.setText(Ia(parambiz.twr));
      locala.tp("sourceUserName");
      locala.to("sourceNickName");
      locala.setText(Ia(parambiz.tws));
      locala.tp("sourceNickName");
      locala.to("statisticsData");
      locala.setText(Ia(parambiz.uUg));
      locala.tp("statisticsData");
      locala.to("weappInfo");
      locala.to("appUserName");
      locala.setText(Ia(parambiz.uUi.username));
      locala.tp("appUserName");
      locala.to("pagePath");
      locala.setText(Ia(parambiz.uUi.path));
      locala.tp("pagePath");
      locala.tp("weappInfo");
      locala.to("canvasInfoXml");
      locala.setText(Ia(parambiz.pRQ));
      locala.tp("canvasInfoXml");
      if (parambiz.uUa != null)
      {
        float f1 = parambiz.uUa.tYy;
        float f2 = parambiz.uUa.tYz;
        if ((f1 != -1000.0F) && (f2 != -1000.0F))
        {
          ((Map)localObject1).clear();
          ((Map)localObject1).put("longitude", parambiz.uUa.tYy);
          ((Map)localObject1).put("latitude", parambiz.uUa.tYz);
          ((Map)localObject1).put("city", bg.Sw(Ia(parambiz.uUa.gCz)));
          ((Map)localObject1).put("poiName", bg.Sw(Ia(parambiz.uUa.mzo)));
          ((Map)localObject1).put("poiAddress", bg.Sw(Ia(parambiz.uUa.pTK)));
          ((Map)localObject1).put("poiScale", parambiz.uUa.uAZ);
          ((Map)localObject1).put("poiClassifyId", Ia(parambiz.uUa.uAX));
          ((Map)localObject1).put("poiClassifyType", parambiz.uUa.pTM);
          ((Map)localObject1).put("poiClickableStatus", parambiz.uUa.uBa);
          locala.f("location", (Map)localObject1);
          locala.tp("location");
        }
      }
      locala.to("ContentObject");
      locala.to("contentStyle");
      locala.setText(parambiz.uUc.ueV);
      locala.tp("contentStyle");
      locala.to("contentSubStyle");
      locala.setText(parambiz.uUc.ueX);
      locala.tp("contentSubStyle");
      locala.to("title");
      locala.setText(Ia(parambiz.uUc.eBt));
      locala.tp("title");
      locala.to("description");
      locala.setText(Ia(parambiz.uUc.lPj));
      locala.tp("description");
      locala.to("contentUrl");
      locala.setText(Ia(parambiz.uUc.lPM));
      locala.tp("contentUrl");
      if (parambiz.uUc.ueW.size() <= 0) {
        break label2267;
      }
      locala.to("mediaList");
      localObject2 = parambiz.uUc.ueW.iterator();
      if (!((Iterator)localObject2).hasNext()) {
        break label2259;
      }
      localObject3 = (anu)((Iterator)localObject2).next();
      locala.to("media");
      locala.to("id");
      if (!Ib(((anu)localObject3).mmR).equals("")) {
        break label2243;
      }
      locala.setText("0");
    }
    for (;;)
    {
      locala.tp("id");
      locala.to("type");
      locala.setText(((anu)localObject3).jib);
      locala.tp("type");
      locala.to("title");
      locala.setText(Ia(((anu)localObject3).eBt));
      locala.tp("title");
      locala.to("description");
      locala.setText(Ia(((anu)localObject3).lPj));
      locala.tp("description");
      locala.to("private");
      locala.setText(((anu)localObject3).uCQ);
      locala.tp("private");
      ((Map)localObject1).clear();
      ((Map)localObject1).put("type", ((anu)localObject3).uCN);
      if (!bg.nm(((anu)localObject3).eDW)) {
        ((Map)localObject1).put("md5", ((anu)localObject3).eDW);
      }
      if (!bg.nm(((anu)localObject3).uDj)) {
        ((Map)localObject1).put("videomd5", ((anu)localObject3).uDj);
      }
      locala.f("url", (Map)localObject1);
      locala.setText(Ia(((anu)localObject3).lPM));
      locala.tp("url");
      if ((((anu)localObject3).uCO != null) && (!((anu)localObject3).uCO.equals("")))
      {
        ((Map)localObject1).clear();
        ((Map)localObject1).put("type", ((anu)localObject3).uCP);
        locala.f("thumb", (Map)localObject1);
        locala.setText(Ia(((anu)localObject3).uCO));
        locala.tp("thumb");
      }
      if (((anu)localObject3).eCt > 0)
      {
        locala.to("subType");
        locala.setText(((anu)localObject3).eCt);
        locala.tp("subType");
      }
      if (!bg.nm(((anu)localObject3).pPP))
      {
        locala.to("userData");
        locala.setText(((anu)localObject3).pPP);
        locala.tp("userData");
      }
      if ((((anu)localObject3).uCS != null) && (!((anu)localObject3).uCS.equals("")))
      {
        ((Map)localObject1).clear();
        ((Map)localObject1).put("type", ((anu)localObject3).uCT);
        locala.f("lowBandUrl", (Map)localObject1);
        locala.setText(Ia(((anu)localObject3).uCS));
        locala.tp("lowBandUrl");
      }
      if (((anu)localObject3).uCR != null)
      {
        ((Map)localObject1).clear();
        if (((anu)localObject3).uCR.uDE > 0.0F) {
          ((Map)localObject1).put("width", ((anu)localObject3).uCR.uDE);
        }
        if (((anu)localObject3).uCR.uDF > 0.0F) {
          ((Map)localObject1).put("height", ((anu)localObject3).uCR.uDF);
        }
        if (((anu)localObject3).uCR.uDG > 0.0F) {
          ((Map)localObject1).put("totalSize", ((anu)localObject3).uCR.uDG);
        }
        locala.f("size", (Map)localObject1);
        locala.tp("size");
      }
      locala.tp("media");
      break label1434;
      locala.setText(parambiz.mmR);
      break;
      label2243:
      locala.setText(Ib(((anu)localObject3).mmR));
    }
    label2259:
    locala.tp("mediaList");
    label2267:
    locala.jae.append(Ia(parambiz.uUc.ueY));
    locala.tp("ContentObject");
    if (parambiz.pwN != null)
    {
      locala.to("actionInfo");
      if (parambiz.pwN.tOK != null)
      {
        locala.to("appMsg");
        locala.to("mediaTagName");
        locala.setText(parambiz.pwN.tOK.tOD);
        locala.tp("mediaTagName");
        locala.to("messageExt");
        locala.setText(parambiz.pwN.tOK.tOE);
        locala.tp("messageExt");
        locala.to("messageAction");
        locala.setText(parambiz.pwN.tOK.tOF);
        locala.tp("messageAction");
        locala.tp("appMsg");
      }
      locala.tp("actionInfo");
    }
    if ((parambiz.uUb != null) && (!bg.nm(parambiz.uUb.mmR)))
    {
      localObject1 = parambiz.pTh;
      localObject2 = new bhf();
      if (localObject1 != null) {
        localObject3 = Base64.decode((String)localObject1, 0);
      }
    }
    try
    {
      ((bhf)localObject2).aD((byte[])localObject3);
      ((bhf)localObject2).uTd = new bhd();
      ((bhf)localObject2).uTd.lMv = parambiz.uUb.mmR;
      try
      {
        localObject2 = Base64.encodeToString(((bhf)localObject2).toByteArray(), 0);
        localObject1 = localObject2;
        localObject2 = ((String)localObject2).replace("\n", "");
        localObject1 = localObject2;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.TimelineConvert", localIOException, "", new Object[0]);
        }
        GMTrace.o(8868570595328L, 66076);
        return parambiz;
      }
      parambiz.pTh = ((String)localObject1);
      if (parambiz.pTh != null)
      {
        locala.to("statExtStr");
        locala.setText(parambiz.pTh);
        locala.tp("statExtStr");
      }
      locala.tp("TimelineObject");
      parambiz = locala.jae.toString();
      w.d("MicroMsg.TimelineConvert", "xmlContent: " + parambiz);
      if (bh.q(parambiz, "TimelineObject") == null)
      {
        w.e("MicroMsg.TimelineConvert", "xml is error");
        GMTrace.o(8868570595328L, 66076);
        return "";
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  static final class a
  {
    StringBuffer jae;
    
    a()
    {
      GMTrace.i(8866691547136L, 66062);
      this.jae = new StringBuffer();
      GMTrace.o(8866691547136L, 66062);
    }
    
    public final void f(String paramString, Map<String, String> paramMap)
    {
      GMTrace.i(8867362635776L, 66067);
      this.jae.append("<" + paramString);
      paramString = paramMap.keySet().iterator();
      while (paramString.hasNext())
      {
        String str1 = (String)paramString.next();
        String str2 = (String)paramMap.get(str1);
        this.jae.append(" " + str1 + "=\"" + str2 + "\" ");
      }
      this.jae.append(">");
      paramMap.clear();
      GMTrace.o(8867362635776L, 66067);
    }
    
    public final void setText(String paramString)
    {
      GMTrace.i(8867094200320L, 66065);
      if (bg.nm(paramString))
      {
        GMTrace.o(8867094200320L, 66065);
        return;
      }
      if (paramString.contains(j.jab))
      {
        this.jae.append("<![CDATA[" + bg.Sw(paramString) + "]]>");
        GMTrace.o(8867094200320L, 66065);
        return;
      }
      this.jae.append("<![CDATA[" + paramString + "]]>");
      GMTrace.o(8867094200320L, 66065);
    }
    
    public final void to(String paramString)
    {
      GMTrace.i(8866825764864L, 66063);
      this.jae.append("<" + paramString + ">");
      GMTrace.o(8866825764864L, 66063);
    }
    
    public final void tp(String paramString)
    {
      GMTrace.i(8866959982592L, 66064);
      this.jae.append("</" + paramString + ">");
      GMTrace.o(8866959982592L, 66064);
    }
    
    public final void uG(int paramInt)
    {
      GMTrace.i(8867228418048L, 66066);
      this.jae.append(paramInt);
      GMTrace.o(8867228418048L, 66066);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\g\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */