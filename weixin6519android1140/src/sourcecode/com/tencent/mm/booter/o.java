package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.s;
import com.tencent.mm.y.at;

public final class o
{
  static long fJz;
  
  static
  {
    GMTrace.i(498753077248L, 3716);
    fJz = 0L;
    GMTrace.o(498753077248L, 3716);
  }
  
  private static String d(String[] paramArrayOfString)
  {
    GMTrace.i(498484641792L, 3714);
    String str1 = "";
    int j = 1;
    int k = paramArrayOfString.length;
    int i = 0;
    if (i < k)
    {
      String str2 = paramArrayOfString[i];
      if (j != 0) {
        j = 0;
      }
      for (;;)
      {
        str1 = str1 + str2;
        i += 1;
        break;
        str1 = str1 + "=";
      }
    }
    GMTrace.o(498484641792L, 3714);
    return str1;
  }
  
  private static void dp(String paramString)
  {
    GMTrace.i(498216206336L, 3712);
    paramString = ab.getContext().getSharedPreferences(paramString, 0);
    Object localObject = paramString.getString("startup_info", "").split("=");
    if ((localObject == null) || (localObject.length == 0))
    {
      GMTrace.o(498216206336L, 3712);
      return;
    }
    a locala = new a();
    if (locala.dr(localObject[(localObject.length - 1)]))
    {
      locala.fJC = 2;
      localObject[(localObject.length - 1)] = locala.toString();
    }
    localObject = d((String[])localObject);
    w.d("MicroMsg.ProcessReport", "uerExit new info %s", new Object[] { localObject });
    paramString.edit().putString("startup_info", (String)localObject).commit();
    GMTrace.o(498216206336L, 3712);
  }
  
  public static void dq(String paramString)
  {
    GMTrace.i(16010027466752L, 119284);
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences(paramString, 0);
    String[] arrayOfString = localSharedPreferences.getString("startup_info", "").split("=");
    if ((arrayOfString == null) || (arrayOfString.length <= 1))
    {
      w.i("MicroMsg.ProcessReport", "nothing to reprot");
      GMTrace.o(16010027466752L, 119284);
      return;
    }
    int i = 0;
    while (i < arrayOfString.length - 1)
    {
      w.i("MicroMsg.ProcessReport", "reprot %s: %s", new Object[] { paramString, arrayOfString[i] });
      g.ork.A(10667, arrayOfString[i]);
      i += 1;
    }
    localSharedPreferences.edit().putString("startup_info", arrayOfString[(arrayOfString.length - 1)]).commit();
    GMTrace.o(16010027466752L, 119284);
  }
  
  private static void l(String paramString, int paramInt)
  {
    GMTrace.i(497947770880L, 3710);
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences(paramString, 0);
    paramString = localSharedPreferences.getString("startup_info", "").split("=");
    if ((paramString != null) && (paramString.length > 0))
    {
      localObject = new a();
      if (((a)localObject).dr(paramString[(paramString.length - 1)]))
      {
        ((a)localObject).fJF = Process.myPid();
        paramString[(paramString.length - 1)] = ((a)localObject).toString();
      }
    }
    Object localObject = new a();
    ((a)localObject).fJB = paramInt;
    ((a)localObject).fJD = Process.myPid();
    ((a)localObject).fJE = ((int)bg.Pu());
    String str = d(paramString);
    localObject = ((a)localObject).toString();
    paramString = (String)localObject;
    if (str.length() > 0) {
      paramString = str + "=" + (String)localObject;
    }
    w.d("MicroMsg.ProcessReport", "startProc new info %s", new Object[] { paramString });
    localSharedPreferences.edit().putString("startup_info", paramString).commit();
    GMTrace.o(497947770880L, 3710);
  }
  
  public static void onCreate(boolean paramBoolean)
  {
    GMTrace.i(497813553152L, 3709);
    if (paramBoolean)
    {
      l("mm_proc_startup", 2);
      GMTrace.o(497813553152L, 3709);
      return;
    }
    l("push_proc_startup", 1);
    GMTrace.o(497813553152L, 3709);
  }
  
  public static void px()
  {
    GMTrace.i(498081988608L, 3711);
    dp("mm_proc_startup");
    dp("push_proc_startup");
    GMTrace.o(498081988608L, 3711);
  }
  
  public static void rw()
  {
    GMTrace.i(498350424064L, 3713);
    if ((fJz != 0L) && (bg.aI(fJz) < 3600000L))
    {
      GMTrace.o(498350424064L, 3713);
      return;
    }
    int i = ((Integer)at.AP().get(37, Integer.valueOf(0))).intValue();
    if (d.tJC != i)
    {
      at.AP().set(37, Integer.valueOf(d.tJC));
      new ae(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(501303214080L, 3735);
          g.ork.A(10675, this.fJA + "," + f.eqV);
          GMTrace.o(501303214080L, 3735);
        }
      });
    }
    fJz = bg.Pw();
    new ae(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(501571649536L, 3737);
        o.dq("mm_proc_startup");
        o.dq("push_proc_startup");
        GMTrace.o(501571649536L, 3737);
      }
    });
    GMTrace.o(498350424064L, 3713);
  }
  
  static final class a
  {
    int fJB;
    int fJC;
    int fJD;
    int fJE;
    int fJF;
    
    a()
    {
      GMTrace.i(494592327680L, 3685);
      this.fJC = 1;
      GMTrace.o(494592327680L, 3685);
    }
    
    public final boolean dr(String paramString)
    {
      GMTrace.i(494726545408L, 3686);
      paramString = paramString.split(",");
      if ((paramString == null) || (paramString.length != 5))
      {
        w.e("MicroMsg.ProcessReport", "error format");
        GMTrace.o(494726545408L, 3686);
        return false;
      }
      try
      {
        this.fJB = bg.getInt(paramString[0], 0);
        this.fJC = bg.getInt(paramString[1], 0);
        this.fJD = bg.getInt(paramString[2], 0);
        this.fJE = bg.getInt(paramString[3], 0);
        this.fJF = bg.getInt(paramString[4], 0);
        GMTrace.o(494726545408L, 3686);
        return true;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.ProcessReport", "ParseFrom parse failed");
        w.printErrStackTrace("MicroMsg.ProcessReport", paramString, "", new Object[0]);
        GMTrace.o(494726545408L, 3686);
      }
      return false;
    }
    
    public final String toString()
    {
      GMTrace.i(494860763136L, 3687);
      String str = String.format("%d,%d,%d,%d,%d", new Object[] { Integer.valueOf(this.fJB), Integer.valueOf(this.fJC), Integer.valueOf(this.fJD), Integer.valueOf(this.fJE), Integer.valueOf(this.fJF) });
      GMTrace.o(494860763136L, 3687);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */