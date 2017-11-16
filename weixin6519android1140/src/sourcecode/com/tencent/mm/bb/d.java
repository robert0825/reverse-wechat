package com.tencent.mm.bb;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.m;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class d
  implements com.tencent.mm.ad.e
{
  public static int chatType;
  private static d gVY;
  public static final f<Integer, a> gli;
  public boolean gqR;
  private int retryTimes;
  
  static
  {
    GMTrace.i(3500800999424L, 26083);
    gli = new f(5);
    chatType = 0;
    GMTrace.o(3500800999424L, 26083);
  }
  
  public d()
  {
    GMTrace.i(3499861475328L, 26076);
    this.gqR = false;
    this.retryTimes = 3;
    GMTrace.o(3499861475328L, 26076);
  }
  
  public static d LX()
  {
    GMTrace.i(3499995693056L, 26077);
    if (gVY == null) {
      gVY = new d();
    }
    d locald = gVY;
    GMTrace.o(3499995693056L, 26077);
    return locald;
  }
  
  public static void LY()
  {
    GMTrace.i(3500398346240L, 26080);
    h.xz();
    h.xy().xh().set(16646145, Integer.valueOf(0));
    GMTrace.o(3500398346240L, 26080);
  }
  
  public static void LZ()
  {
    GMTrace.i(3500532563968L, 26081);
    h.xz();
    Integer localInteger2 = Integer.valueOf(bg.e((Integer)h.xy().xh().get(16646145, null)));
    Integer localInteger1 = localInteger2;
    if (localInteger2.intValue() < 0) {
      localInteger1 = Integer.valueOf(0);
    }
    h.xz();
    h.xy().xh().set(16646145, Integer.valueOf(localInteger1.intValue() + 1));
    GMTrace.o(3500532563968L, 26081);
  }
  
  public static String getPrefix()
  {
    GMTrace.i(3499593039872L, 26074);
    switch (chatType)
    {
    default: 
      GMTrace.o(3499593039872L, 26074);
      return "single_";
    case 0: 
      GMTrace.o(3499593039872L, 26074);
      return "single_";
    case 1: 
      GMTrace.o(3499593039872L, 26074);
      return "chatroom_";
    }
    GMTrace.o(3499593039872L, 26074);
    return "app_";
  }
  
  public static int lB(String paramString)
  {
    int i = 5;
    GMTrace.i(3499727257600L, 26075);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(3499727257600L, 26075);
      return 5;
    }
    if ((!paramString.startsWith("single")) || (paramString.startsWith("chatroom"))) {
      i = 7;
    }
    if (paramString.startsWith("app")) {
      i = 8;
    }
    w.d("upload", "type " + i);
    GMTrace.o(3499727257600L, 26075);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(3500264128512L, 26079);
    if ((!(paramk instanceof m)) || (((m)paramk).DM() != 9))
    {
      w.d("upload", "another scene");
      GMTrace.o(3500264128512L, 26079);
      return;
    }
    if (paramk.getType() == 159)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label103;
      }
      h.xz();
      h.xy().xh().set(81944, Long.valueOf(bg.Pu()));
    }
    for (;;)
    {
      release();
      GMTrace.o(3500264128512L, 26079);
      return;
      label103:
      paramInt1 = this.retryTimes - 1;
      this.retryTimes = paramInt1;
      if (paramInt1 < 0)
      {
        h.xz();
        h.xy().xh().set(81944, Long.valueOf((bg.Pv() - 86400000L + 3600000L) / 1000L));
        this.retryTimes = 3;
      }
    }
  }
  
  public final void release()
  {
    GMTrace.i(3500129910784L, 26078);
    this.gqR = false;
    h.wS().b(159, this);
    GMTrace.o(3500129910784L, 26078);
  }
  
  public static final class a
  {
    public int fja;
    public String gVZ;
    public int gWa;
    public int gWb;
    public int gWc;
    public int gWd;
    public int gWe;
    public int gWf;
    public int gWg;
    public int gWh;
    public int gWi;
    public Random gWj;
    public List<String> gWk;
    
    public a()
    {
      GMTrace.i(3500935217152L, 26084);
      this.gVZ = "BeiJing;GuangZhou;ShangHai;";
      this.fja = 0;
      this.gWa = 0;
      this.gWb = 2;
      this.gWc = 2;
      this.gWd = 2;
      this.gWe = 10240;
      this.gWf = 10240000;
      this.gWg = 100;
      this.gWh = 100;
      this.gWi = 100;
      this.gWj = new Random();
      this.gWk = null;
      GMTrace.o(3500935217152L, 26084);
    }
    
    public static a Md()
    {
      GMTrace.i(3501472088064L, 26088);
      w.d("upload", "parseFromFile");
      Object localObject1 = com.tencent.mm.aw.t.Kj();
      localObject1 = com.tencent.mm.aw.n.Kf() + ((com.tencent.mm.aw.n)localObject1).aT(1, 9);
      int i = com.tencent.mm.a.e.aY((String)localObject1);
      if (i == -1)
      {
        w.e("upload", "read file failed " + i + (String)localObject1);
        GMTrace.o(3501472088064L, 26088);
        return null;
      }
      Object localObject3 = com.tencent.mm.a.e.c((String)localObject1, 0, i);
      if (localObject3 == null)
      {
        w.e("upload", "read file failed " + i + (String)localObject1);
        GMTrace.o(3501472088064L, 26088);
        return null;
      }
      localObject1 = new String((byte[])localObject3);
      if (bg.nm((String)localObject1))
      {
        GMTrace.o(3501472088064L, 26088);
        return null;
      }
      i = ((String)localObject1).indexOf('<');
      int k;
      if (i > 0)
      {
        localObject1 = ((String)localObject1).substring(i);
        k = ((String)localObject1).hashCode();
        localObject3 = (a)d.gli.get(Integer.valueOf(k));
        if (localObject3 != null)
        {
          GMTrace.o(3501472088064L, 26088);
          return (a)localObject3;
        }
        localObject3 = bh.q((String)localObject1, "Config");
        if (localObject3 == null)
        {
          w.e("upload", "parse msg failed");
          GMTrace.o(3501472088064L, 26088);
          return null;
        }
      }
      for (;;)
      {
        a locala;
        StringBuilder localStringBuilder;
        int j;
        try
        {
          locala = new a();
          i = 0;
          localStringBuilder = new StringBuilder(".Config.Item");
          if (i == 0)
          {
            localObject1 = "";
            localObject1 = (String)((Map)localObject3).get(localObject1 + ".$key");
            w.d("upload", "key " + (String)localObject1);
            if (localObject1 == null) {
              break label1183;
            }
            if (!((String)localObject1).equals("region")) {
              continue;
            }
            localStringBuilder = new StringBuilder(".Config.Item");
            if (i == 0)
            {
              localObject1 = "";
              locala.gVZ = ((String)((Map)localObject3).get(localObject1));
              if ((locala.gVZ == null) || (locala.gVZ.length() <= 0)) {
                break label1503;
              }
              localObject1 = locala.gVZ.split(";");
              locala.gWk = new ArrayList();
              if ((localObject1 == null) || (localObject1.length <= 0)) {
                break label1503;
              }
              j = 0;
              if (j >= localObject1.length) {
                break label1503;
              }
              if ((localObject1[j] == null) || (localObject1[j].length() <= 0)) {
                break label1496;
              }
              locala.gWk.add(localObject1[j]);
              break label1496;
            }
          }
          else
          {
            localObject1 = Integer.valueOf(i);
            continue;
          }
          localObject1 = Integer.valueOf(i);
          continue;
          if (((String)localObject1).equals("sex"))
          {
            localStringBuilder = new StringBuilder(".Config.Item");
            if (i == 0)
            {
              localObject1 = "";
              locala.fja = bg.getInt((String)((Map)localObject3).get(localObject1), 0);
            }
            else
            {
              localObject1 = Integer.valueOf(i);
              continue;
            }
          }
          else if (((String)localObject1).equals("rate"))
          {
            localStringBuilder = new StringBuilder(".Config.Item");
            if (i == 0)
            {
              localObject1 = "";
              locala.gWa = bg.getInt((String)((Map)localObject3).get(localObject1), 0);
            }
          }
        }
        catch (Exception localException)
        {
          w.e("upload", "exception:%s", new Object[] { bg.f(localException) });
          GMTrace.o(3501472088064L, 26088);
          return null;
        }
        Object localObject2 = Integer.valueOf(i);
        continue;
        if (((String)localObject2).equals("minsize"))
        {
          localStringBuilder = new StringBuilder(".Config.Item");
          if (i == 0) {}
          for (localObject2 = "";; localObject2 = Integer.valueOf(i))
          {
            locala.gWe = bg.getInt((String)((Map)localObject3).get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("maxsize"))
        {
          localStringBuilder = new StringBuilder(".Config.Item");
          if (i == 0) {}
          for (localObject2 = "";; localObject2 = Integer.valueOf(i))
          {
            locala.gWf = bg.getInt((String)((Map)localObject3).get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("daycount_single"))
        {
          localStringBuilder = new StringBuilder(".Config.Item");
          if (i == 0) {}
          for (localObject2 = "";; localObject2 = Integer.valueOf(i))
          {
            locala.gWg = bg.getInt((String)((Map)localObject3).get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("daycount_chatroom"))
        {
          localStringBuilder = new StringBuilder(".Config.Item");
          if (i == 0) {}
          for (localObject2 = "";; localObject2 = Integer.valueOf(i))
          {
            locala.gWh = bg.getInt((String)((Map)localObject3).get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("daycount_app"))
        {
          localStringBuilder = new StringBuilder(".Config.Item");
          if (i == 0) {}
          for (localObject2 = "";; localObject2 = Integer.valueOf(i))
          {
            locala.gWi = bg.getInt((String)((Map)localObject3).get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("rate_single"))
        {
          localStringBuilder = new StringBuilder(".Config.Item");
          if (i == 0) {}
          for (localObject2 = "";; localObject2 = Integer.valueOf(i))
          {
            locala.gWb = bg.getInt((String)((Map)localObject3).get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("rate_chatroom"))
        {
          localStringBuilder = new StringBuilder(".Config.Item");
          if (i == 0) {}
          for (localObject2 = "";; localObject2 = Integer.valueOf(i))
          {
            locala.gWc = bg.getInt((String)((Map)localObject3).get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("rate_app"))
        {
          localStringBuilder = new StringBuilder(".Config.Item");
          if (i == 0) {}
          for (localObject2 = "";; localObject2 = Integer.valueOf(i))
          {
            locala.gWd = bg.getInt((String)((Map)localObject3).get(localObject2), 0);
            break;
          }
          label1183:
          w.d("upload", "sex " + locala.fja);
          w.d("upload", "rate_single " + locala.gWb);
          w.d("upload", "rate_chatroom " + locala.gWc);
          w.d("upload", "rate_app " + locala.gWd);
          w.d("upload", "rate " + locala.gWa);
          w.d("upload", "minsize " + locala.gWe);
          w.d("upload", "maxsize " + locala.gWf);
          w.d("upload", "daycount_single " + locala.gWg);
          w.d("upload", "daycount_chatroom " + locala.gWh);
          w.d("upload", "daycount_app " + locala.gWi);
          w.d("upload", "region " + locala.gVZ);
          d.gli.m(Integer.valueOf(k), locala);
          GMTrace.o(3501472088064L, 26088);
          return locala;
          break;
          label1496:
          j += 1;
          continue;
        }
        label1503:
        i += 1;
      }
    }
    
    public final boolean Ma()
    {
      GMTrace.i(3501069434880L, 26085);
      Object localObject2 = q.Ak();
      Object localObject1;
      int i;
      if ("  getRegionCode " + localObject2 != null)
      {
        localObject1 = ((af)localObject2).fjq;
        w.d("upload", (String)localObject1);
        localObject1 = ((af)localObject2).fjq;
        if ((localObject1 != null) && (((String)localObject1).length() > 0) && (this.gWk != null) && (this.gWk.size() > 0))
        {
          localObject1 = ((String)localObject1).split("_");
          if ((localObject1 != null) && (localObject1.length > 0)) {
            i = 0;
          }
        }
      }
      else
      {
        for (;;)
        {
          if (i >= localObject1.length) {
            break label200;
          }
          if ((localObject1[i] != null) && (localObject1[i].length() > 0))
          {
            localObject2 = this.gWk.iterator();
            for (;;)
            {
              if (((Iterator)localObject2).hasNext()) {
                if (((String)((Iterator)localObject2).next()).trim().toLowerCase().equals(localObject1[i].trim().toLowerCase()))
                {
                  w.d("upload", "isInRegion");
                  GMTrace.o(3501069434880L, 26085);
                  return true;
                  localObject1 = "";
                  break;
                }
              }
            }
          }
          i += 1;
        }
      }
      label200:
      GMTrace.o(3501069434880L, 26085);
      return false;
    }
    
    public final int Mb()
    {
      GMTrace.i(3501203652608L, 26086);
      switch (d.chatType)
      {
      default: 
        i = this.gWb;
        GMTrace.o(3501203652608L, 26086);
        return i;
      case 0: 
        i = this.gWb;
        GMTrace.o(3501203652608L, 26086);
        return i;
      case 1: 
        i = this.gWc;
        GMTrace.o(3501203652608L, 26086);
        return i;
      }
      int i = this.gWd;
      GMTrace.o(3501203652608L, 26086);
      return i;
    }
    
    public final int Mc()
    {
      GMTrace.i(3501337870336L, 26087);
      switch (d.chatType)
      {
      default: 
        i = this.gWg;
        GMTrace.o(3501337870336L, 26087);
        return i;
      case 0: 
        i = this.gWg;
        GMTrace.o(3501337870336L, 26087);
        return i;
      case 1: 
        i = this.gWh;
        GMTrace.o(3501337870336L, 26087);
        return i;
      }
      int i = this.gWi;
      GMTrace.o(3501337870336L, 26087);
      return i;
    }
  }
  
  public static final class b
  {
    public String gTl;
    public int gVQ;
    public int gVR;
    public int sampleRate;
    
    public b()
    {
      GMTrace.i(3499458822144L, 26073);
      this.gTl = "";
      this.sampleRate = 0;
      this.gVQ = 0;
      this.gVR = 0;
      GMTrace.o(3499458822144L, 26073);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bb\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */