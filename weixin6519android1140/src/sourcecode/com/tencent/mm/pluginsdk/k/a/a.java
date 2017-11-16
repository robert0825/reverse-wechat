package com.tencent.mm.pluginsdk.k.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class a
{
  public static final String[] trP;
  public String desc;
  public String gpC;
  public String gpD;
  public String id;
  public int ofc;
  public String platform;
  public String title;
  public String trI;
  public boolean trJ;
  public boolean trK;
  public int trL;
  public Rect trM;
  public Rect trN;
  public Map<String, String> trO;
  public String url;
  
  static
  {
    GMTrace.i(840739848192L, 6264);
    trP = new String[] { "LDPI", "HDPI", "MDPI" };
    GMTrace.o(840739848192L, 6264);
  }
  
  private a(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(839666106368L, 6256);
    this.id = paramString1;
    this.platform = paramString2;
    this.trI = paramString3;
    this.trJ = paramBoolean1;
    this.trK = paramBoolean2;
    GMTrace.o(839666106368L, 6256);
  }
  
  public static String OT(String paramString)
  {
    GMTrace.i(840068759552L, 6259);
    Object localObject = OU(paramString);
    if (localObject == a.trQ)
    {
      GMTrace.o(840068759552L, 6259);
      return paramString;
    }
    if (localObject == a.trR)
    {
      if (paramString == null) {
        paramString = null;
      }
      while (paramString == null)
      {
        GMTrace.o(840068759552L, 6259);
        return null;
        int i = paramString.lastIndexOf("/");
        if ((i < 0) || (i >= paramString.length() - 1)) {
          paramString = null;
        } else {
          paramString = paramString.substring(i + 1);
        }
      }
      localObject = new StringBuilder();
      at.AR();
      paramString = c.yU() + paramString;
      GMTrace.o(840068759552L, 6259);
      return paramString;
    }
    GMTrace.o(840068759552L, 6259);
    return null;
  }
  
  public static a OU(String paramString)
  {
    GMTrace.i(840202977280L, 6260);
    if (paramString.indexOf("tips/") == 0)
    {
      paramString = a.trQ;
      GMTrace.o(840202977280L, 6260);
      return paramString;
    }
    if (paramString.indexOf("weixin://") == 0)
    {
      paramString = a.trR;
      GMTrace.o(840202977280L, 6260);
      return paramString;
    }
    paramString = a.trS;
    GMTrace.o(840202977280L, 6260);
    return paramString;
  }
  
  public static ArrayList<a> aU(Context paramContext, String paramString)
  {
    GMTrace.i(840337195008L, 6261);
    if ((paramString == null) || (paramString.length() < 0))
    {
      GMTrace.o(840337195008L, 6261);
      return null;
    }
    Object localObject1 = paramContext.getResources().getDisplayMetrics();
    Object localObject2 = ((DisplayMetrics)localObject1).heightPixels + "x" + ((DisplayMetrics)localObject1).widthPixels;
    if (localObject2 == null)
    {
      paramContext = null;
      if ((paramContext == null) || (paramContext.size() <= 0))
      {
        GMTrace.o(840337195008L, 6261);
        return null;
      }
    }
    else
    {
      localObject1 = new HashSet();
      ((HashSet)localObject1).add(localObject2);
      paramContext = BackwardSupportUtil.b.el(paramContext);
      w.d("MicroMsg.PushMessage", "getDisplaySizeType :" + paramContext);
      if (paramContext != null)
      {
        paramContext = paramContext.split("_");
        if ((paramContext != null) && (paramContext.length >= 2)) {
          break label224;
        }
      }
      label224:
      for (paramContext = null;; paramContext = paramContext[0])
      {
        ((HashSet)localObject1).add(paramContext + "_L");
        ((HashSet)localObject1).add(paramContext + "_P");
        paramContext = (Context)localObject1;
        break;
      }
    }
    localObject1 = bh.q(paramString, "tips");
    if (localObject1 == null)
    {
      GMTrace.o(840337195008L, 6261);
      return null;
    }
    localObject2 = new ArrayList();
    int i = 0;
    for (;;)
    {
      Object localObject3 = new StringBuilder(".tips.tip");
      Object localObject4;
      int j;
      HashMap localHashMap;
      label1190:
      Object localObject5;
      if (i > 0)
      {
        paramString = Integer.valueOf(i);
        localObject3 = paramString;
        if (((Map)localObject1).get(localObject3) == null) {
          break;
        }
        paramString = (String)((Map)localObject1).get((String)localObject3 + ".$id");
        w.d("MicroMsg.PushMessage", "parseMessages id:" + paramString);
        localObject4 = (String)((Map)localObject1).get((String)localObject3 + ".$platform");
        if (!((String)localObject4).equals("android")) {
          break label1390;
        }
        localObject4 = new a(paramString, (String)localObject4, (String)((Map)localObject1).get((String)localObject3 + ".$device"), bg.a(Boolean.valueOf((String)((Map)localObject1).get((String)localObject3 + ".$enableclose"))), bg.a(Boolean.valueOf((String)((Map)localObject1).get((String)localObject3 + ".$transparentclose"))));
        j = bg.getInt((String)((Map)localObject1).get((String)localObject3 + ".title.$x"), 0);
        int k = bg.getInt((String)((Map)localObject1).get((String)localObject3 + ".title.$y"), 0);
        int m = bg.getInt((String)((Map)localObject1).get((String)localObject3 + ".title.$width"), 0);
        int n = bg.getInt((String)((Map)localObject1).get((String)localObject3 + ".title.$font"), 0);
        int i1 = bg.Sq((String)((Map)localObject1).get((String)localObject3 + ".title.$color"));
        ((a)localObject4).title = ((String)((Map)localObject1).get((String)localObject3 + ".title"));
        ((a)localObject4).trL = i1;
        ((a)localObject4).trM = new Rect(j, k, m + j, n + k);
        j = bg.getInt((String)((Map)localObject1).get((String)localObject3 + ".description.$x"), 0);
        k = bg.getInt((String)((Map)localObject1).get((String)localObject3 + ".description.$y"), 0);
        m = bg.getInt((String)((Map)localObject1).get((String)localObject3 + ".description.$width"), 0);
        n = bg.getInt((String)((Map)localObject1).get((String)localObject3 + ".description.$font"), 0);
        i1 = bg.Sq((String)((Map)localObject1).get((String)localObject3 + ".description.$color"));
        ((a)localObject4).desc = ((String)((Map)localObject1).get((String)localObject3 + ".description"));
        ((a)localObject4).ofc = i1;
        ((a)localObject4).trN = new Rect(j, k, m + j, n + k);
        ((a)localObject4).url = ((String)((Map)localObject1).get((String)localObject3 + ".url"));
        ((a)localObject4).gpC = ((String)((Map)localObject1).get((String)localObject3 + ".time.start"));
        ((a)localObject4).gpD = ((String)((Map)localObject1).get((String)localObject3 + ".time.end"));
        w.d("MicroMsg.PushMessage", "parseMessages id:" + ((a)localObject4).id + " start:" + ((a)localObject4).gpC + " end:" + ((a)localObject4).gpD);
        localHashMap = new HashMap();
        j = 0;
        localObject5 = new StringBuilder().append((String)localObject3).append(".images.image");
        if (j <= 0) {
          break label1334;
        }
      }
      label1334:
      for (paramString = Integer.valueOf(j);; paramString = "")
      {
        localObject5 = paramString;
        paramString = (String)((Map)localObject1).get(localObject5);
        w.d("MicroMsg.PushMessage", " img res:" + paramString);
        if (paramString == null) {
          break label1341;
        }
        localObject5 = (String)((Map)localObject1).get((String)localObject5 + ".$type");
        if (paramContext.contains(localObject5)) {
          localHashMap.put(localObject5, paramString);
        }
        j += 1;
        break label1190;
        paramString = "";
        break;
      }
      label1341:
      if (localHashMap.size() > 0) {
        ((a)localObject4).trO = localHashMap;
      }
      w.d("MicroMsg.PushMessage", "msgid :" + ((a)localObject4).id);
      ((ArrayList)localObject2).add(localObject4);
      label1390:
      i += 1;
    }
    w.d("MicroMsg.PushMessage", "msgs size: " + ((ArrayList)localObject2).size());
    if (((ArrayList)localObject2).size() > 0)
    {
      GMTrace.o(840337195008L, 6261);
      return (ArrayList<a>)localObject2;
    }
    GMTrace.o(840337195008L, 6261);
    return null;
  }
  
  private boolean bKs()
  {
    GMTrace.i(839800324096L, 6257);
    long l3 = bg.Pv();
    long l1 = Long.MAX_VALUE;
    long l2 = 0L;
    try
    {
      if (this.gpD != null) {
        l1 = new SimpleDateFormat("yyyy-MM-dd-HH").parse(this.gpD).getTime();
      }
      if (this.gpC != null) {
        l2 = new SimpleDateFormat("yyyy-MM-dd-HH").parse(this.gpC).getTime();
      }
      w.d("MicroMsg.PushMessage", "CHECKTIME : [" + l2 + "," + l1 + "]");
      if (l1 <= l3) {
        break label163;
      }
      if (l2 > l3)
      {
        GMTrace.o(839800324096L, 6257);
        return false;
      }
    }
    catch (Exception localException)
    {
      GMTrace.o(839800324096L, 6257);
      return true;
    }
    GMTrace.o(839800324096L, 6257);
    return true;
    label163:
    GMTrace.o(839800324096L, 6257);
    return false;
  }
  
  public static void bKt()
  {
    GMTrace.i(840471412736L, 6262);
    at.AR();
    c.xh().set(8193, "");
    at.AR();
    c.xh().set(8449, Long.valueOf(0L));
    GMTrace.o(840471412736L, 6262);
  }
  
  public static a dS(Context paramContext)
  {
    int i = 1;
    GMTrace.i(840605630464L, 6263);
    at.AR();
    long l1 = bg.m(c.xh().get(8449, null), 0);
    long l2 = bg.Pu();
    if ((l1 > 0L) && (l2 - l1 >= 86400L)) {
      bKt();
    }
    for (;;)
    {
      GMTrace.o(840605630464L, 6263);
      return null;
      at.AR();
      localObject = (String)c.xh().get(8193, null);
      if (!bg.nm((String)localObject)) {
        if (((String)localObject).contains("id=\"setavatar\""))
        {
          bKt();
        }
        else
        {
          if (bg.nm((String)localObject)) {
            break label196;
          }
          paramContext = aU(paramContext, (String)localObject);
          if ((paramContext != null) && (paramContext.size() == 1)) {
            break;
          }
          paramContext = null;
          if (paramContext != null) {
            break label206;
          }
          bKt();
        }
      }
    }
    Object localObject = (a)paramContext.get(0);
    if ((((a)localObject).trO != null) && (((a)localObject).trO.size() > 0)) {}
    for (;;)
    {
      if (i != 0)
      {
        paramContext = (Context)localObject;
        if (((a)localObject).bKs()) {
          break;
        }
      }
      label196:
      paramContext = null;
      break;
      i = 0;
    }
    label206:
    GMTrace.o(840605630464L, 6263);
    return paramContext;
  }
  
  public final String toString()
  {
    GMTrace.i(839934541824L, 6258);
    StringBuilder localStringBuilder = new StringBuilder("ad.id=").append(this.id).append(", platform=").append(this.platform).append(", device=").append(this.trI);
    if (this.trJ)
    {
      str = ", closable";
      localStringBuilder = localStringBuilder.append(str);
      if (!this.trK) {
        break label108;
      }
    }
    label108:
    for (String str = ", trans-closable";; str = "")
    {
      str = str;
      GMTrace.o(839934541824L, 6258);
      return str;
      str = "";
      break;
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(841276719104L, 6268);
      trQ = new a("ASSET", 0);
      trR = new a("DOWNLOAD", 1);
      trS = new a("ERROR", 2);
      trT = new a[] { trQ, trR, trS };
      GMTrace.o(841276719104L, 6268);
    }
    
    private a()
    {
      GMTrace.i(841142501376L, 6267);
      GMTrace.o(841142501376L, 6267);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\k\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */