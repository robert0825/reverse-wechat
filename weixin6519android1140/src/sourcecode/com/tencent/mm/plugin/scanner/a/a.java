package com.tencent.mm.plugin.scanner.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.LinkedList;
import java.util.Map;

public final class a
{
  public LinkedList<a> gVg;
  public String iconUrl;
  public int jYc;
  public int osJ;
  public int osK;
  public String osL;
  public boolean osM;
  public String title;
  public int type;
  
  public a()
  {
    GMTrace.i(6056574976000L, 45125);
    this.type = 1;
    this.gVg = new LinkedList();
    GMTrace.o(6056574976000L, 45125);
  }
  
  public static LinkedList<a> j(Map<String, String> paramMap, String paramString)
  {
    GMTrace.i(6056709193728L, 45126);
    LinkedList localLinkedList1 = new LinkedList();
    int i = 0;
    int j = 0;
    a locala;
    Object localObject1;
    boolean bool;
    LinkedList localLinkedList2;
    int k;
    if (j < 1000)
    {
      locala = new a();
      Object localObject2 = new StringBuilder().append(paramString).append(".actionlist");
      StringBuilder localStringBuilder;
      if (j > 0)
      {
        localObject1 = Integer.valueOf(j);
        localObject2 = localObject1;
        if (!bg.nm((String)paramMap.get((String)localObject2 + ".$type"))) {
          locala.type = Integer.valueOf((String)paramMap.get((String)localObject2 + ".$type")).intValue();
        }
        locala.title = bg.nl((String)paramMap.get((String)localObject2 + ".$title"));
        locala.iconUrl = bg.nl((String)paramMap.get((String)localObject2 + ".$iconurl"));
        locala.jYc = bg.getInt((String)paramMap.get((String)localObject2 + ".$iconwidth"), 34);
        locala.osJ = bg.getInt((String)paramMap.get((String)localObject2 + ".$iconheight"), 34);
        locala.osL = bg.nl((String)paramMap.get((String)localObject2 + ".$referkey"));
        locala.osK = bg.getInt((String)paramMap.get((String)localObject2 + ".$listshowtype"), 0);
        bool = false;
        localLinkedList2 = new LinkedList();
        k = 0;
        if (k >= 1000) {
          break label597;
        }
        localStringBuilder = new StringBuilder().append((String)localObject2).append(".action");
        if (k <= 0) {
          break label502;
        }
      }
      label502:
      for (localObject1 = Integer.valueOf(k);; localObject1 = "")
      {
        localObject1 = localObject1;
        if (!bg.nm((String)paramMap.get((String)localObject1 + ".$type"))) {
          break label540;
        }
        if (i == 0) {
          break label509;
        }
        GMTrace.o(6056709193728L, 45126);
        return localLinkedList1;
        localObject1 = "";
        break;
      }
      label509:
      i = 1;
      locala.gVg = localLinkedList2;
    }
    label540:
    label597:
    for (;;)
    {
      locala.osM = bool;
      localLinkedList1.add(locala);
      j += 1;
      break;
      i = 0;
      localObject1 = k(paramMap, (String)localObject1);
      if (localObject1 != null)
      {
        localLinkedList2.add(localObject1);
        if (!k.a((a)localObject1)) {
          bool = true;
        }
      }
      for (;;)
      {
        k += 1;
        break;
        GMTrace.o(6056709193728L, 45126);
        return localLinkedList1;
      }
    }
  }
  
  public static a k(Map<String, String> paramMap, String paramString)
  {
    GMTrace.i(6056843411456L, 45127);
    int i = bg.getInt((String)paramMap.get(paramString + ".$type"), 0);
    a locala = new a(i);
    locala.type = i;
    locala.osS = bg.nl((String)paramMap.get(paramString + ".statid"));
    locala.name = bg.nl((String)paramMap.get(paramString + ".name"));
    locala.desc = bg.nl((String)paramMap.get(paramString + ".desc"));
    locala.glz = bg.nl((String)paramMap.get(paramString + ".digest"));
    locala.showType = bg.getInt((String)paramMap.get(paramString + ".showtype"), 0);
    locala.osN = bg.nl((String)paramMap.get(paramString + ".image"));
    locala.amf = bg.nl((String)paramMap.get(paramString + ".$key"));
    locala.iconUrl = bg.nl((String)paramMap.get(paramString + ".iconurl"));
    if (i == 1)
    {
      locala.gVf = bg.nl((String)paramMap.get(paramString + ".link"));
      paramMap = locala;
    }
    for (;;)
    {
      GMTrace.o(6056843411456L, 45127);
      return paramMap;
      if (i == 2)
      {
        locala.username = bg.nl((String)paramMap.get(paramString + ".username"));
        locala.eCQ = bg.nl((String)paramMap.get(paramString + ".nickname"));
        locala.osW = bg.nl((String)paramMap.get(paramString + ".strbeforefollow"));
        locala.osX = bg.nl((String)paramMap.get(paramString + ".strafterfollow"));
        paramMap = locala;
      }
      else if (i == 3)
      {
        locala.thumburl = bg.nl((String)paramMap.get(paramString + ".thumburl"));
        locala.gVf = bg.nl((String)paramMap.get(paramString + ".link"));
        paramMap = locala;
      }
      else if (i == 4)
      {
        locala.thumburl = bg.nl((String)paramMap.get(paramString + ".thumburl"));
        locala.username = bg.nl((String)paramMap.get(paramString + ".username"));
        locala.eCQ = bg.nl((String)paramMap.get(paramString + ".nickname"));
        paramMap = locala;
      }
      else
      {
        if (i == 5)
        {
          locala.osP = bg.nl((String)paramMap.get(paramString + ".wifiurl"));
          locala.osQ = bg.nl((String)paramMap.get(paramString + ".wapurl"));
          locala.osR = bg.nl((String)paramMap.get(paramString + ".weburl"));
          if ((bg.nm(locala.osP)) && (bg.nm(locala.osQ)) && (bg.nm(locala.osR))) {
            paramMap = null;
          }
        }
        else if (i != 6)
        {
          if (i == 7)
          {
            locala.thumburl = bg.nl((String)paramMap.get(paramString + ".thumburl"));
            locala.osO = bg.nl((String)paramMap.get(paramString + ".playurl"));
            paramMap = locala;
            continue;
          }
          if (i == 9)
          {
            locala.osT = bg.nl((String)paramMap.get(paramString + ".productid"));
            paramMap = locala;
            continue;
          }
          if (i == 8)
          {
            locala.osU = bg.nl((String)paramMap.get(paramString + ".cardext"));
            locala.osV = bg.nl((String)paramMap.get(paramString + ".cardid"));
            paramMap = locala;
            continue;
          }
          if (i == 10)
          {
            locala.osT = bg.nl((String)paramMap.get(paramString + ".id"));
            paramMap = locala;
            continue;
          }
          if (i == 12)
          {
            locala.thumburl = bg.nl((String)paramMap.get(paramString + ".image"));
            locala.gVf = bg.nl((String)paramMap.get(paramString + ".link"));
            paramMap = locala;
            continue;
          }
          if (i == 22)
          {
            locala.content = bg.nl((String)paramMap.get(paramString + ".content"));
            locala.gVf = bg.nl((String)paramMap.get(paramString + ".link"));
            locala.eCQ = bg.nl((String)paramMap.get(paramString + ".nickname"));
            locala.thumburl = bg.nl((String)paramMap.get(paramString + ".image"));
            paramMap = locala;
            continue;
          }
          if (i == 21)
          {
            locala.osL = bg.nl((String)paramMap.get(paramString + ".referkey"));
            paramMap = locala;
            continue;
          }
          locala.gVf = bg.nl((String)paramMap.get(paramString + ".link"));
        }
        paramMap = locala;
      }
    }
  }
  
  public static final class a
  {
    public String amf;
    public String content;
    public String desc;
    public String eCQ;
    public String gVf;
    public String glz;
    public String iconUrl;
    public String name;
    public String osL;
    public String osN;
    public String osO;
    public String osP;
    public String osQ;
    public String osR;
    public String osS;
    public String osT;
    public String osU;
    public String osV;
    public String osW;
    public String osX;
    public int showType;
    public String thumburl;
    public int type;
    public String username;
    
    public a()
    {
      GMTrace.i(6049729871872L, 45074);
      this.name = "";
      this.desc = "";
      this.gVf = "";
      this.username = "";
      this.eCQ = "";
      this.glz = "";
      this.osN = "";
      this.thumburl = "";
      this.osO = "";
      this.osP = "";
      this.osQ = "";
      this.osR = "";
      this.osS = "";
      this.osT = "";
      this.osU = "";
      this.osV = "";
      this.iconUrl = "";
      GMTrace.o(6049729871872L, 45074);
    }
    
    public a(int paramInt)
    {
      GMTrace.i(6049864089600L, 45075);
      this.name = "";
      this.desc = "";
      this.gVf = "";
      this.username = "";
      this.eCQ = "";
      this.glz = "";
      this.osN = "";
      this.thumburl = "";
      this.osO = "";
      this.osP = "";
      this.osQ = "";
      this.osR = "";
      this.osS = "";
      this.osT = "";
      this.osU = "";
      this.osV = "";
      this.iconUrl = "";
      this.type = paramInt;
      GMTrace.o(6049864089600L, 45075);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */