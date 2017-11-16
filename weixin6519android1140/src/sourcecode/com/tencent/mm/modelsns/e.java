package com.tencent.mm.modelsns;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.br.a;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anw;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.bfe;
import com.tencent.mm.protocal.c.bhq;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.brn;
import com.tencent.mm.protocal.c.cm;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.ct;
import com.tencent.mm.protocal.c.cu;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Map;

public final class e
{
  public static biz LU()
  {
    GMTrace.i(4464350068736L, 33262);
    biz localbiz = new biz();
    Object localObject = new oa();
    localbiz.uUb = new cs();
    localbiz.uUc = ((oa)localObject);
    localbiz.uCQ = 0;
    localbiz.nFd = 0;
    localbiz.mmR = "";
    localObject = new amc();
    ((amc)localObject).tYz = 0.0F;
    ((amc)localObject).tYy = 0.0F;
    localbiz.uUa = ((amc)localObject);
    localbiz.pRQ = "";
    localbiz.uUi = new brn();
    GMTrace.o(4464350068736L, 33262);
    return localbiz;
  }
  
  public static anu LV()
  {
    GMTrace.i(4464484286464L, 33263);
    anu localanu = new anu();
    localanu.lPj = "";
    localanu.uCQ = 0;
    GMTrace.o(4464484286464L, 33263);
    return localanu;
  }
  
  public static Pair<Integer, Integer> a(biz parambiz, Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(4465155375104L, 33268);
    int j = 0;
    if ((parambiz != null) && (parambiz.uUc != null) && (parambiz.uUc.ueW != null) && (parambiz.uUc.ueW.size() > 0))
    {
      parambiz = (anu)parambiz.uUc.ueW.get(0);
      if ((parambiz != null) && (parambiz.uCR != null) && (parambiz.uCR.uDE > 0.0F) && (parambiz.uCR.uDF > 0.0F)) {
        j = (int)parambiz.uCR.uDE;
      }
    }
    for (int i = (int)parambiz.uCR.uDF;; i = 0)
    {
      int m = j;
      if (j <= 0) {
        m = 320;
      }
      if (i <= 0) {}
      for (int n = 240;; n = i)
      {
        if (paramContext == null)
        {
          w.e("MicroMsg.TimeLineHelper", "the context is null");
          parambiz = Pair.create(Integer.valueOf(m), Integer.valueOf(n));
          GMTrace.o(4465155375104L, 33268);
          return parambiz;
        }
        parambiz = paramContext.getResources().getDisplayMetrics();
        if (parambiz != null) {}
        for (i = (int)Math.min(parambiz.widthPixels * 0.63F, parambiz.heightPixels * 0.63F);; i = m)
        {
          i = i >> 5 << 5;
          j = i;
          if (m < n)
          {
            j = i;
            if (paramContext != null) {
              j = Math.min(BackwardSupportUtil.b.a(paramContext, 160.0F), i);
            }
          }
          int i2 = (int)(j * 1.0D * n / m);
          i = i2;
          int k = j;
          int i3;
          int i1;
          if (!paramBoolean)
          {
            i3 = a.fromDPToPix(paramContext, 200);
            i1 = a.fromDPToPix(paramContext, 44);
            if (i2 >= j)
            {
              i = i2;
              if (i2 > i3) {
                i = i3;
              }
              j = (int)(m * 1.0F / n * i);
              k = j;
              if (j >= i1) {
                break label484;
              }
              i = (int)(i1 * 1.0D * n / m);
              j = i1;
            }
          }
          for (;;)
          {
            w.i("MicroMsg.TimeLineHelper", "getTimelineVideoSize: width %d, height %d, expectWidth %d,expectHeight %d, isAd: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(paramBoolean) });
            parambiz = Pair.create(Integer.valueOf(j), Integer.valueOf(i));
            GMTrace.o(4465155375104L, 33268);
            return parambiz;
            k = j;
            if (j > i3) {
              k = i3;
            }
            j = (int)(n * 1.0F / m * k);
            i = j;
            if (j < i1)
            {
              j = (int)(i1 * 1.0D * m / n);
              i = i1;
            }
            else
            {
              label484:
              j = k;
            }
          }
        }
      }
    }
  }
  
  public static anu a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, int paramInt4, String paramString4, anw paramanw)
  {
    GMTrace.i(4464752721920L, 33265);
    anu localanu = new anu();
    localanu.mmR = ly(paramString1);
    localanu.jib = paramInt1;
    localanu.lPj = ly(paramString4);
    localanu.lPM = ly(paramString2);
    localanu.uCN = paramInt2;
    localanu.uCO = ly(paramString3);
    localanu.uCP = paramInt3;
    localanu.uCQ = paramInt4;
    localanu.uCR = paramanw;
    if (paramString2 == null) {}
    for (paramString1 = "".getBytes();; paramString1 = paramString2.getBytes())
    {
      localanu.uDc = g.n(paramString1);
      GMTrace.o(4464752721920L, 33265);
      return localanu;
    }
  }
  
  public static anu a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, String paramString4)
  {
    GMTrace.i(4464618504192L, 33264);
    anu localanu = new anu();
    localanu.mmR = paramString1;
    localanu.jib = paramInt1;
    localanu.lPM = paramString2;
    localanu.uCO = paramString3;
    localanu.uCN = paramInt2;
    localanu.uCP = paramInt3;
    localanu.lPj = paramString4;
    paramString1 = new anw();
    paramString1.uDF = 0.0F;
    paramString1.uDE = 0.0F;
    paramString1.uDG = 0.0F;
    localanu.uCR = paramString1;
    if (paramString2 == null) {}
    for (paramString1 = "".getBytes();; paramString1 = paramString2.getBytes())
    {
      localanu.uDc = g.n(paramString1);
      GMTrace.o(4464618504192L, 33264);
      return localanu;
    }
  }
  
  private static ct lA(String paramString)
  {
    GMTrace.i(4465021157376L, 33267);
    if (bg.nm(paramString))
    {
      GMTrace.o(4465021157376L, 33267);
      return null;
    }
    Object localObject = new StringBuilder(paramString.length());
    int i = 0;
    int j = paramString.length();
    while (i < j)
    {
      char c = paramString.charAt(i);
      if (c != '&')
      {
        ((StringBuilder)localObject).append(c);
        i += 1;
      }
      else if (paramString.startsWith("&amp;", i))
      {
        ((StringBuilder)localObject).append('&');
        i += 5;
      }
      else if (paramString.startsWith("&apos;", i))
      {
        ((StringBuilder)localObject).append('\'');
        i += 6;
      }
      else if (paramString.startsWith("&quot;", i))
      {
        ((StringBuilder)localObject).append('"');
        i += 6;
      }
      else if (paramString.startsWith("&lt;", i))
      {
        ((StringBuilder)localObject).append('<');
        i += 4;
      }
      else if (paramString.startsWith("&gt;", i))
      {
        ((StringBuilder)localObject).append('>');
        i += 4;
      }
    }
    paramString = ((StringBuilder)localObject).toString();
    paramString = bh.q("<root>" + paramString + "</root>", "root");
    localObject = new ct();
    ((ct)localObject).tQH = ly((String)paramString.get(".root.en"));
    ((ct)localObject).tQI = ly((String)paramString.get(".root.zh-CN"));
    ((ct)localObject).tQJ = ly((String)paramString.get(".root.zh-TW"));
    GMTrace.o(4465021157376L, 33267);
    return (ct)localObject;
  }
  
  private static float lx(String paramString)
  {
    GMTrace.i(4464081633280L, 33260);
    if (paramString == null)
    {
      GMTrace.o(4464081633280L, 33260);
      return 0.0F;
    }
    float f = bg.getFloat(paramString, 0.0F);
    GMTrace.o(4464081633280L, 33260);
    return f;
  }
  
  private static String ly(String paramString)
  {
    GMTrace.i(4464215851008L, 33261);
    if (paramString == null)
    {
      GMTrace.o(4464215851008L, 33261);
      return "";
    }
    GMTrace.o(4464215851008L, 33261);
    return paramString;
  }
  
  public static biz lz(String paramString)
  {
    GMTrace.i(4464886939648L, 33266);
    Map localMap = bh.q(paramString, "TimelineObject");
    biz localbiz = LU();
    int i;
    label1293:
    label2363:
    label2375:
    int j;
    if (localMap != null)
    {
      localbiz.mmR = ly((String)localMap.get(".TimelineObject.id"));
      localbiz.jhi = ly((String)localMap.get(".TimelineObject.username"));
      localbiz.uCQ = bg.getInt((String)localMap.get(".TimelineObject.private"), 0);
      localbiz.nFd = bg.getInt((String)localMap.get(".TimelineObject.createTime"), 0);
      localbiz.uTZ = ly((String)localMap.get(".TimelineObject.contentDesc"));
      localbiz.uUe = bg.getInt((String)localMap.get(".TimelineObject.contentDescShowType"), 0);
      localbiz.uUf = bg.getInt((String)localMap.get(".TimelineObject.contentDescScene"), 0);
      localbiz.pTh = ly((String)localMap.get(".TimelineObject.statExtStr"));
      localbiz.uUj = bg.getInt((String)localMap.get(".TimelineObject.sightFolded"), 0);
      Object localObject1 = new amc();
      ((amc)localObject1).tYy = lx((String)localMap.get(".TimelineObject.location.$longitude"));
      ((amc)localObject1).tYz = lx((String)localMap.get(".TimelineObject.location.$latitude"));
      ((amc)localObject1).gCz = ly((String)localMap.get(".TimelineObject.location.$city"));
      ((amc)localObject1).uAZ = bg.getInt((String)localMap.get(".TimelineObject.location.$poiScale"), 0);
      ((amc)localObject1).uAX = ly((String)localMap.get(".TimelineObject.location.$poiClassifyId"));
      ((amc)localObject1).pTM = bg.getInt((String)localMap.get(".TimelineObject.location.$poiClassifyType"), 0);
      ((amc)localObject1).pTK = ly((String)localMap.get(".TimelineObject.location.$poiAddress"));
      ((amc)localObject1).mzo = ly((String)localMap.get(".TimelineObject.location.$poiName"));
      ((amc)localObject1).uBa = bg.getInt((String)localMap.get(".TimelineObject.location.$poiClickableStatus"), 0);
      localbiz.uUa = ((amc)localObject1);
      if (localbiz.uUc == null) {
        localbiz.uUc = new oa();
      }
      localbiz.uUc.lPj = ly((String)localMap.get(".TimelineObject.ContentObject.description"));
      localbiz.uUc.ueV = bg.getInt((String)localMap.get(".TimelineObject.ContentObject.contentStyle"), 0);
      localbiz.uUc.ueX = bg.getInt((String)localMap.get(".TimelineObject.ContentObject.contentSubStyle"), 0);
      localbiz.uUc.eBt = ly((String)localMap.get(".TimelineObject.ContentObject.title"));
      localbiz.uUc.lPM = ly((String)localMap.get(".TimelineObject.ContentObject.contentUrl"));
      i = 0;
      Object localObject6;
      String str23;
      String str22;
      String str21;
      String str20;
      String str17;
      String str18;
      String str16;
      String str15;
      String str19;
      String str12;
      String str11;
      Object localObject5;
      String str14;
      String str13;
      String str10;
      String str9;
      String str8;
      String str7;
      String str6;
      String str5;
      String str4;
      String str3;
      String str2;
      Object localObject4;
      Object localObject3;
      String str1;
      Object localObject2;
      Object localObject7;
      Object localObject8;
      if (i != 0)
      {
        localObject6 = ".TimelineObject.ContentObject.mediaList.media" + i + ".id";
        str23 = ".TimelineObject.ContentObject.mediaList.media" + i + ".type";
        str22 = ".TimelineObject.ContentObject.mediaList.media" + i + ".title";
        str21 = ".TimelineObject.ContentObject.mediaList.media" + i + ".description";
        str20 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url";
        str17 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$videomd5";
        str18 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb";
        str16 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$type";
        str15 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$type";
        str19 = ".TimelineObject.ContentObject.mediaList.media" + i + ".private";
        str12 = ".TimelineObject.ContentObject.mediaList.media" + i + ".subType";
        str11 = ".TimelineObject.ContentObject.mediaList.media" + i + ".userData";
        localObject5 = ".TimelineObject.ContentObject.mediaList.media" + i;
        str14 = ".TimelineObject.ContentObject.mediaList.media" + i + ".lowBandUrl";
        str13 = ".TimelineObject.ContentObject.mediaList.media" + i + ".lowBandUrl.$type";
        str10 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachUrl";
        str9 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachUrl.$md5";
        str8 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$md5";
        str7 = ".TimelineObject.ContentObject.mediaList.media" + i + ".videosize.$attachTotalTime";
        str6 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachThumbUrl";
        str5 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachShareTitle";
        str4 = ".TimelineObject.ContentObject.mediaList.media" + i + ".enc";
        str3 = ".TimelineObject.ContentObject.mediaList.media" + i + ".enc.$key";
        str2 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$token";
        localObject4 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$enc_idx";
        localObject3 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$key";
        str1 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$token";
        localObject2 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$enc_idx";
        localObject1 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$key";
        localObject7 = localObject6;
        localObject6 = str23;
        str23 = (String)localObject5 + ".size.$width";
        localObject8 = (String)localObject5 + ".size.$height";
        localObject5 = (String)localObject5 + ".size.$totalSize";
        str23 = (String)localMap.get(str23);
        localObject8 = (String)localMap.get(localObject8);
        String str24 = (String)localMap.get(localObject5);
        localObject5 = new anw();
        ((anw)localObject5).uDF = 0.0F;
        ((anw)localObject5).uDE = 0.0F;
        ((anw)localObject5).uDG = 0.0F;
        if (str23 != null) {
          ((anw)localObject5).uDE = lx(str23);
        }
        if (localObject8 != null) {
          ((anw)localObject5).uDF = lx((String)localObject8);
        }
        if (str24 != null) {
          ((anw)localObject5).uDG = lx(str24);
        }
        localObject7 = (String)localMap.get(localObject7);
        localObject6 = (String)localMap.get(localObject6);
        str22 = (String)localMap.get(str22);
        str21 = (String)localMap.get(str21);
        str20 = (String)localMap.get(str20);
        str19 = (String)localMap.get(str19);
        str18 = (String)localMap.get(str18);
        str17 = (String)localMap.get(str17);
        str16 = (String)localMap.get(str16);
        str15 = (String)localMap.get(str15);
        str14 = (String)localMap.get(str14);
        str13 = (String)localMap.get(str13);
        str12 = (String)localMap.get(str12);
        str11 = (String)localMap.get(str11);
        str10 = (String)localMap.get(str10);
        str9 = (String)localMap.get(str9);
        str8 = (String)localMap.get(str8);
        str7 = (String)localMap.get(str7);
        str6 = (String)localMap.get(str6);
        str5 = (String)localMap.get(str5);
        str4 = (String)localMap.get(str4);
        str3 = (String)localMap.get(str3);
        str2 = (String)localMap.get(str2);
        localObject4 = (String)localMap.get(localObject4);
        localObject3 = (String)localMap.get(localObject3);
        str1 = (String)localMap.get(str1);
        localObject2 = (String)localMap.get(localObject2);
        str23 = (String)localMap.get(localObject1);
        if ((localObject6 == null) || (localObject7 == null)) {
          break label2375;
        }
        localObject8 = new anu();
        ((anu)localObject8).mmR = ly((String)localObject7);
        ((anu)localObject8).jib = bg.getInt((String)localObject6, 0);
        ((anu)localObject8).eBt = ly(str22);
        ((anu)localObject8).lPj = ly(str21);
        ((anu)localObject8).lPM = ly(str20);
        ((anu)localObject8).uCN = bg.getInt(str16, 0);
        ((anu)localObject8).uCO = ly(str18);
        ((anu)localObject8).uCP = bg.getInt(str15, 0);
        ((anu)localObject8).uCQ = bg.getInt(str19, 0);
        ((anu)localObject8).uCR = ((anw)localObject5);
        ((anu)localObject8).uCS = ly(str14);
        ((anu)localObject8).uCT = bg.getInt(str13, 0);
        ((anu)localObject8).pPP = ly(str11);
        ((anu)localObject8).eCt = bg.getInt(str12, 0);
        ((anu)localObject8).uCV = ly(str10);
        ((anu)localObject8).uCX = ly(str9);
        ((anu)localObject8).uCW = ly(str8);
        ((anu)localObject8).uDj = ly(str17);
        ((anu)localObject8).qkw = bg.getInt(str7, 0);
        ((anu)localObject8).uCY = ly(str6);
        ((anu)localObject8).uCZ = ly(str5);
        ((anu)localObject8).uDa = bg.getInt(str4, 0);
        ((anu)localObject8).uDb = bg.getLong(str3, 0L);
        if (((anu)localObject8).lPM != null) {
          break label2363;
        }
      }
      for (localObject1 = "".getBytes();; localObject1 = ((anu)localObject8).lPM.getBytes())
      {
        ((anu)localObject8).uDc = g.n((byte[])localObject1);
        ((anu)localObject8).uDd = str2;
        ((anu)localObject8).uDe = bg.getInt((String)localObject4, 0);
        ((anu)localObject8).uDf = ((String)localObject3);
        ((anu)localObject8).uDg = str1;
        ((anu)localObject8).uDh = bg.getInt((String)localObject2, 0);
        ((anu)localObject8).uDi = str23;
        localbiz.uUc.ueW.add(localObject8);
        i += 1;
        break;
        str22 = ".TimelineObject.ContentObject.mediaList.media.title";
        str13 = ".TimelineObject.ContentObject.mediaList.media.lowBandUrl.$type";
        str21 = ".TimelineObject.ContentObject.mediaList.media.description";
        localObject1 = ".TimelineObject.ContentObject.mediaList.media.thumb.$key";
        localObject5 = ".TimelineObject.ContentObject.mediaList.media";
        localObject2 = ".TimelineObject.ContentObject.mediaList.media.thumb.$enc_idx";
        str9 = ".TimelineObject.ContentObject.mediaList.media.attachUrl.$md5";
        str12 = ".TimelineObject.ContentObject.mediaList.media.subType";
        str7 = ".TimelineObject.ContentObject.mediaList.media.videosize.$attachTotalTime";
        str14 = ".TimelineObject.ContentObject.mediaList.media.lowBandUrl";
        str10 = ".TimelineObject.ContentObject.mediaList.media.attachUrl";
        str11 = ".TimelineObject.ContentObject.mediaList.media.userData";
        str8 = ".TimelineObject.ContentObject.mediaList.media.url.$md5";
        str20 = ".TimelineObject.ContentObject.mediaList.media.url";
        str1 = ".TimelineObject.ContentObject.mediaList.media.thumb.$token";
        localObject7 = ".TimelineObject.ContentObject.mediaList.media.id";
        str2 = ".TimelineObject.ContentObject.mediaList.media.url.$token";
        str19 = ".TimelineObject.ContentObject.mediaList.media.private";
        str6 = ".TimelineObject.ContentObject.mediaList.media.attachThumbUrl";
        str15 = ".TimelineObject.ContentObject.mediaList.media.thumb.$type";
        str5 = ".TimelineObject.ContentObject.mediaList.media.attachShareTitle";
        str16 = ".TimelineObject.ContentObject.mediaList.media.url.$type";
        str4 = ".TimelineObject.ContentObject.mediaList.media.enc";
        str17 = ".TimelineObject.ContentObject.mediaList.media.url.$videomd5";
        localObject3 = ".TimelineObject.ContentObject.mediaList.media.url.$key";
        localObject6 = ".TimelineObject.ContentObject.mediaList.media.type";
        str3 = ".TimelineObject.ContentObject.mediaList.media.enc.$key";
        str18 = ".TimelineObject.ContentObject.mediaList.media.thumb";
        localObject4 = ".TimelineObject.ContentObject.mediaList.media.url.$enc_idx";
        break label1293;
      }
      i = paramString.indexOf("<noteinfo>");
      j = paramString.indexOf("</noteinfo>");
      if ((i < 0) || (j < 0))
      {
        paramString = localbiz;
        localObject1 = new cs();
        localObject2 = ly((String)localMap.get(".TimelineObject.appInfo.id"));
        str1 = ly((String)localMap.get(".TimelineObject.appInfo.version"));
        localObject3 = ly((String)localMap.get(".TimelineObject.appInfo.appName"));
        localObject4 = ly((String)localMap.get(".TimelineObject.appInfo.installUrl "));
        str2 = ly((String)localMap.get(".TimelineObject.appInfo.fromUrl "));
        ((cs)localObject1).mmR = ((String)localObject2);
        ((cs)localObject1).lRT = ((String)localObject3);
        ((cs)localObject1).tQE = ((String)localObject4);
        ((cs)localObject1).tQF = str2;
        ((cs)localObject1).jhO = str1;
        ((cs)localObject1).tQG = bg.getInt((String)localMap.get(".TimelineObject.appInfo.clickable"), 0);
        paramString.uUb = ((cs)localObject1);
        localObject1 = new brn();
        localObject2 = ly((String)localMap.get(".TimelineObject.weappInfo.appUserName"));
        str1 = ly((String)localMap.get(".TimelineObject.weappInfo.pagePath"));
        ((brn)localObject1).username = ((String)localObject2);
        ((brn)localObject1).path = str1;
        paramString.uUi = ((brn)localObject1);
        localObject1 = new bhq();
        localObject2 = ly((String)localMap.get(".TimelineObject.streamvideo.streamvideotitle"));
        str1 = ly((String)localMap.get(".TimelineObject.streamvideo.streamvideototaltime"));
        localObject3 = ly((String)localMap.get(".TimelineObject.streamvideo.streamvideourl"));
        localObject4 = ly((String)localMap.get(".TimelineObject.streamvideo.streamvideoweburl"));
        str2 = ly((String)localMap.get(".TimelineObject.streamvideo.streamvideowording"));
        str3 = ly((String)localMap.get(".TimelineObject.streamvideo.streamvideothumburl"));
        str4 = ly((String)localMap.get(".TimelineObject.streamvideo.streamvideoaduxinfo"));
        str5 = ly((String)localMap.get(".TimelineObject.streamvideo.streamvideopublishid"));
        ((bhq)localObject1).gkK = ((String)localObject2);
        ((bhq)localObject1).gkJ = bg.Sy(str1);
        ((bhq)localObject1).gkI = ((String)localObject3);
        ((bhq)localObject1).gkM = ((String)localObject4);
        ((bhq)localObject1).gkL = str2;
        ((bhq)localObject1).gkN = str3;
        ((bhq)localObject1).gkO = str4;
        ((bhq)localObject1).gkP = str5;
        paramString.uUh = ((bhq)localObject1);
        localObject1 = new bfe();
        localObject2 = ly((String)localMap.get(".TimelineObject.redEnvelopesInfo.sendId"));
        str1 = ly((String)localMap.get(".TimelineObject.redEnvelopesInfo.ticket"));
        ((bfe)localObject1).mFr = ((String)localObject2);
        ((bfe)localObject1).eEU = str1;
        localObject1 = new as();
        i = bg.getInt((String)localMap.get(".TimelineObject.actionInfo.scene"), 0);
        localObject2 = ly((String)localMap.get(".TimelineObject.actionInfo.appid"));
        j = bg.getInt((String)localMap.get(".TimelineObject.actionInfo.type"), 0);
        str1 = ly((String)localMap.get(".TimelineObject.actionInfo.url"));
        localObject3 = ly((String)localMap.get(".TimelineObject.actionInfo.mediaTagName"));
        localObject4 = ly((String)localMap.get(".TimelineObject.actionInfo.wordingKey"));
        ((as)localObject1).tOH = ((String)localObject2);
        ((as)localObject1).tOG = i;
        ((as)localObject1).jib = j;
        ((as)localObject1).lPM = str1;
        ((as)localObject1).tOI = ((String)localObject3);
        ((as)localObject1).tOJ = ((String)localObject4);
        localObject2 = new aq();
        str1 = ly((String)localMap.get(".TimelineObject.actionInfo.appMsg.appid"));
        localObject3 = ly((String)localMap.get(".TimelineObject.actionInfo.appMsg.mediaTagName"));
        localObject4 = ly((String)localMap.get(".TimelineObject.actionInfo.appMsg.messageExt"));
        str2 = ly((String)localMap.get(".TimelineObject.actionInfo.appMsg.messageAction"));
        ((aq)localObject2).lQa = str1;
        ((aq)localObject2).tOD = ((String)localObject3);
        ((aq)localObject2).tOE = ((String)localObject4);
        ((aq)localObject2).tOF = str2;
        ((as)localObject1).tOK = ((aq)localObject2);
        i = bg.getInt((String)localMap.get(".TimelineObject.actionInfo.appActionScene.installedActionScene"), 0);
        j = bg.getInt((String)localMap.get(".TimelineObject.actionInfo.appActionScene.uninstalledActionScene"), 0);
        localObject2 = ly((String)localMap.get(".TimelineObject.actionInfo.appJumpWordingKey.installedWordingKey"));
        str1 = ly((String)localMap.get(".TimelineObject.actionInfo.appJumpWordingKey.uninstalledWordingKey"));
        ((as)localObject1).tOL = ly((String)localMap.get(".TimelineObject.actionInfo.newWordingKey"));
        localObject3 = new cm();
        ((cm)localObject3).tQx = i;
        ((cm)localObject3).tQy = j;
        localObject4 = new cu();
        ((cu)localObject4).tQK = ((String)localObject2);
        ((cu)localObject4).tQL = str1;
        ((as)localObject1).tOM = ((cm)localObject3);
        ((as)localObject1).tON = ((cu)localObject4);
        ((as)localObject1).tOO = lA((String)localMap.get(".TimelineObject.actionInfo.installedWording"));
        ((as)localObject1).tOP = lA((String)localMap.get(".TimelineObject.actionInfo.uninstalledWording"));
        paramString.pwN = ((as)localObject1);
        paramString.twr = ly((String)localMap.get(".TimelineObject.sourceUserName"));
        paramString.tws = ly((String)localMap.get(".TimelineObject.sourceNickName"));
        paramString.uUd = ly((String)localMap.get(".TimelineObject.publicUserName"));
        paramString.uUg = ly((String)localMap.get(".TimelineObject.statisticsData"));
        paramString.pRQ = ly((String)localMap.get(".TimelineObject.canvasInfoXml"));
        paramString.giA = bg.getInt((String)localMap.get(".TimelineObject.contentattr"), 0);
      }
    }
    for (;;)
    {
      GMTrace.o(4464886939648L, 33266);
      return localbiz;
      localbiz.uUc.ueY = paramString.substring(i, j + 11);
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\modelsns\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */