package com.tencent.mm.y;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.a.g;
import java.util.ArrayList;
import java.util.List;

public class bb
{
  private static bb gnF;
  public b gnE;
  
  private bb()
  {
    GMTrace.i(687865856000L, 5125);
    GMTrace.o(687865856000L, 5125);
  }
  
  public static bb Bc()
  {
    GMTrace.i(687731638272L, 5124);
    try
    {
      if (gnF == null) {
        gnF = new bb();
      }
      bb localbb = gnF;
      GMTrace.o(687731638272L, 5124);
      return localbb;
    }
    finally {}
  }
  
  public static ba Bd()
  {
    GMTrace.i(688134291456L, 5127);
    at.AR();
    Object localObject = c.eN("banner");
    if (localObject == null)
    {
      GMTrace.o(688134291456L, 5127);
      return null;
    }
    int i = ((SharedPreferences)localObject).getInt("CurrentType", -1);
    int j = ((SharedPreferences)localObject).getInt("CurrentShowType", -1);
    localObject = ((SharedPreferences)localObject).getString("CurrentData", "");
    if (i != -1)
    {
      switch (i)
      {
      case 4: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      default: 
      case 1: 
      case 3: 
      case 2: 
        do
        {
          int k;
          do
          {
            localObject = new ba(i, j, (String)localObject);
            GMTrace.o(688134291456L, 5127);
            return (ba)localObject;
            k = Be();
          } while ((k != a.gnI) && (k != a.gnJ) && (!g.BY().BW()));
          if (g.BY().BW()) {
            w.i("MicorMsg.MainFrameBannerStorage", "has abtest case. ignore bind bind contacts banner.");
          }
          for (;;)
          {
            GMTrace.o(688134291456L, 5127);
            return null;
            w.i("MicorMsg.MainFrameBannerStorage", "already Bind the Mobile");
          }
          w.i("MicorMsg.MainFrameBannerStorage", "avatar already existed");
          GMTrace.o(688134291456L, 5127);
          return null;
        } while ((Be() != a.gnI) && (!g.BY().BW()));
        if (g.BY().BW()) {
          w.i("MicorMsg.MainFrameBannerStorage", "has abtest case. ignore bind upload contacts banner.");
        }
        for (;;)
        {
          GMTrace.o(688134291456L, 5127);
          return null;
          w.i("MicorMsg.MainFrameBannerStorage", "already upload the contacts");
        }
      case 10000: 
      case 57005: 
        GMTrace.o(688134291456L, 5127);
        return null;
      }
      GMTrace.o(688134291456L, 5127);
      return null;
    }
    GMTrace.o(688134291456L, 5127);
    return null;
  }
  
  public static int Be()
  {
    GMTrace.i(688671162368L, 5131);
    for (;;)
    {
      try
      {
        at.AR();
        localObject3 = (String)c.xh().get(4097, "");
        at.AR();
        String str = (String)c.xh().get(6, "");
        boolean bool = q.Ah();
        w.d("MicorMsg.MainFrameBannerStorage", "isUpload " + bool + " stat " + q.zI());
        if (localObject3 != null)
        {
          Object localObject1 = localObject3;
          if (((String)localObject3).length() > 0)
          {
            if (str == null) {
              break label219;
            }
            localObject3 = str;
            if (str.length() <= 0) {
              break label219;
            }
            if ((localObject1 == null) && (localObject3 == null))
            {
              i = a.gnG;
              GMTrace.o(688671162368L, 5131);
              return i;
            }
            if ((localObject1 != null) && (localObject3 == null))
            {
              i = a.gnH;
              GMTrace.o(688671162368L, 5131);
              return i;
            }
            if (bool)
            {
              i = a.gnI;
              GMTrace.o(688671162368L, 5131);
              return i;
            }
            i = a.gnJ;
            GMTrace.o(688671162368L, 5131);
            return i;
          }
        }
      }
      catch (Exception localException)
      {
        int i = a.gnG;
        GMTrace.o(688671162368L, 5131);
        return i;
      }
      Object localObject2 = null;
      continue;
      label219:
      Object localObject3 = null;
    }
  }
  
  private static boolean b(String paramString, List<Integer> paramList)
  {
    GMTrace.i(688402726912L, 5129);
    at.AR();
    Object localObject = c.eN("banner");
    if (localObject == null)
    {
      GMTrace.o(688402726912L, 5129);
      return false;
    }
    localObject = ((SharedPreferences)localObject).edit();
    ((SharedPreferences.Editor)localObject).putInt(paramString + "ArraySize", paramList.size());
    int i = 0;
    while (i < paramList.size())
    {
      ((SharedPreferences.Editor)localObject).putInt(paramString + i, ((Integer)paramList.get(i)).intValue());
      i += 1;
    }
    boolean bool = ((SharedPreferences.Editor)localObject).commit();
    GMTrace.o(688402726912L, 5129);
    return bool;
  }
  
  private static List<Integer> gN(String paramString)
  {
    GMTrace.i(688536944640L, 5130);
    at.AR();
    SharedPreferences localSharedPreferences = c.eN("banner");
    if (localSharedPreferences == null)
    {
      GMTrace.o(688536944640L, 5130);
      return null;
    }
    int j = localSharedPreferences.getInt(paramString + "ArraySize", 0);
    ArrayList localArrayList = new ArrayList(j);
    int i = 0;
    while (i < j)
    {
      localArrayList.add(Integer.valueOf(localSharedPreferences.getInt(paramString + i, 0)));
      i += 1;
    }
    GMTrace.o(688536944640L, 5130);
    return localArrayList;
  }
  
  public final boolean a(ba paramba)
  {
    boolean bool = true;
    GMTrace.i(688000073728L, 5126);
    if (paramba.type == 10000)
    {
      at.AR();
      paramba = c.eN("banner");
      if (paramba != null) {
        paramba.edit().clear().commit();
      }
      if (this.gnE != null) {
        this.gnE.Bf();
      }
      GMTrace.o(688000073728L, 5126);
      return true;
    }
    if (paramba.type == 57005)
    {
      GMTrace.o(688000073728L, 5126);
      return false;
    }
    at.AR();
    Object localObject = c.eN("banner");
    if (localObject == null)
    {
      GMTrace.o(688000073728L, 5126);
      return false;
    }
    localObject = ((SharedPreferences)localObject).edit();
    ba localba = Bd();
    if (!gN("HistoryInfo").contains(Integer.valueOf(paramba.type))) {}
    for (;;)
    {
      if ((localba != null) && (localba.showType == 2))
      {
        List localList = gN("HistoryInfo");
        if (!localList.contains(Integer.valueOf(localba.type))) {
          localList.add(Integer.valueOf(localba.type));
        }
        b("HistoryInfo", localList);
      }
      if (bool) {
        ((SharedPreferences.Editor)localObject).putInt("CurrentType", paramba.type).putInt("CurrentShowType", paramba.showType).putString("CurrentData", paramba.data).commit();
      }
      if (this.gnE != null) {
        this.gnE.Bf();
      }
      GMTrace.o(688000073728L, 5126);
      return bool;
      bool = false;
    }
  }
  
  public final void aK(int paramInt1, int paramInt2)
  {
    GMTrace.i(688268509184L, 5128);
    at.AR();
    Object localObject = c.eN("banner");
    if (localObject == null)
    {
      GMTrace.o(688268509184L, 5128);
      return;
    }
    localObject = ((SharedPreferences)localObject).edit();
    switch (paramInt2)
    {
    }
    for (;;)
    {
      if (this.gnE != null) {
        this.gnE.Bf();
      }
      GMTrace.o(688268509184L, 5128);
      return;
      ((SharedPreferences.Editor)localObject).remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
      continue;
      ((SharedPreferences.Editor)localObject).remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
      localObject = gN("HistoryInfo");
      if (!((List)localObject).contains(Integer.valueOf(paramInt1))) {
        ((List)localObject).add(Integer.valueOf(paramInt1));
      }
      b("HistoryInfo", (List)localObject);
      continue;
      if (paramInt1 == 3) {
        ((SharedPreferences.Editor)localObject).remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
      }
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(630823321600L, 4700);
      gnG = 1;
      gnH = 2;
      gnI = 3;
      gnJ = 4;
      gnK = new int[] { gnG, gnH, gnI, gnJ };
      GMTrace.o(630823321600L, 4700);
    }
  }
  
  public static abstract interface b
  {
    public abstract void Bf();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */