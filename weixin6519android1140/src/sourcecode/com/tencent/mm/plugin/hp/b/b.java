package com.tencent.mm.plugin.hp.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ai;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;

public final class b
{
  private static long mhb;
  
  static
  {
    GMTrace.i(5749887467520L, 42840);
    mhb = 0L;
    GMTrace.o(5749887467520L, 42840);
  }
  
  public static void L(Intent paramIntent)
  {
    GMTrace.i(5747739983872L, 42824);
    KVCommCrossProcessReceiver.bbP();
    w.i("Tinker.HotPatchReportHelper", "hp_report try to apply patch service start");
    if (paramIntent == null)
    {
      g.ork.M(338, 6, 127);
      GMTrace.o(5747739983872L, 42824);
      return;
    }
    if (ShareIntentUtil.i(paramIntent, "patch_path_extra") == null)
    {
      g.ork.M(338, 6, 128);
      GMTrace.o(5747739983872L, 42824);
      return;
    }
    g.ork.a(338L, 6L, 1L, true);
    GMTrace.o(5747739983872L, 42824);
  }
  
  public static void a(int paramInt, Throwable paramThrowable)
  {
    GMTrace.i(16027878424576L, 119417);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16027878424576L, 119417);
      return;
      g.ork.a(338L, 191L, 1L, false);
      g.ork.d("Tinker", "Tinker Exception:interpret occur instruction exception " + ai.g(paramThrowable), null);
      GMTrace.o(16027878424576L, 119417);
      return;
      g.ork.a(338L, 192L, 1L, false);
      g.ork.d("Tinker", "Tinker Exception:interpret occur command exception " + ai.g(paramThrowable), null);
      GMTrace.o(16027878424576L, 119417);
      return;
      g.ork.a(338L, 193L, 1L, false);
    }
  }
  
  public static void a(Throwable paramThrowable, int paramInt)
  {
    int i = 0;
    GMTrace.i(5748947943424L, 42833);
    switch (paramInt)
    {
    }
    for (;;)
    {
      if (i == 0)
      {
        String str1 = ai.g(paramThrowable);
        paramThrowable = str1;
        if (paramInt == -4)
        {
          Context localContext = ab.getContext();
          String str2 = SharePatchFileUtil.ib(localContext);
          paramThrowable = str1;
          if (!ShareTinkerInternals.nm(str2))
          {
            paramThrowable = "tinker checkSafeModeCount fail:\n" + str2;
            SharePatchFileUtil.ab(SharePatchFileUtil.ia(localContext));
          }
        }
        g.ork.d("Tinker", "Tinker Exception:load tinker occur exception " + paramThrowable, null);
      }
      GMTrace.o(5748947943424L, 42833);
      return;
      if (paramThrowable.getMessage().contains("checkDexInstall failed"))
      {
        g.ork.a(338L, 189L, 1L, false);
        w.i("Tinker.HotPatchReportHelper", "tinker dex check fail:" + paramThrowable.getMessage());
        i = 1;
      }
      else
      {
        g.ork.a(338L, 161L, 1L, false);
        w.e("Tinker.HotPatchReportHelper", "tinker dex reflect fail:" + paramThrowable.getMessage());
        continue;
        if (paramThrowable.getMessage().contains("checkResInstall failed"))
        {
          g.ork.a(338L, 190L, 1L, false);
          i = 1;
        }
        else
        {
          g.ork.a(338L, 184L, 1L, false);
          continue;
          g.ork.a(338L, 188L, 1L, false);
          continue;
          g.ork.a(338L, 160L, 1L, false);
        }
      }
    }
  }
  
  public static void aHl()
  {
    GMTrace.i(5746934677504L, 42818);
    g.ork.a(338L, 9L, 1L, false);
    GMTrace.o(5746934677504L, 42818);
  }
  
  public static void aHm()
  {
    GMTrace.i(5748411072512L, 42829);
    g.ork.a(338L, 106L, 1L, false);
    GMTrace.o(5748411072512L, 42829);
  }
  
  public static void aHn()
  {
    GMTrace.i(5748545290240L, 42830);
    g.ork.a(338L, 116L, 1L, false);
    GMTrace.o(5748545290240L, 42830);
  }
  
  public static void aHo()
  {
    GMTrace.i(5749619032064L, 42838);
    g.ork.a(338L, 168L, 1L, false);
    GMTrace.o(5749619032064L, 42838);
  }
  
  public static void aHp()
  {
    GMTrace.i(5749753249792L, 42839);
    g.ork.a(338L, 5L, 1L, false);
    GMTrace.o(5749753249792L, 42839);
  }
  
  public static void d(Throwable paramThrowable)
  {
    GMTrace.i(5748142637056L, 42827);
    g.ork.a(338L, 104L, 1L, false);
    g.ork.d("Tinker", "Tinker Exception:apply tinker occur unknown exception " + ai.g(paramThrowable), null);
    GMTrace.o(5748142637056L, 42827);
  }
  
  public static void e(Throwable paramThrowable)
  {
    GMTrace.i(5748276854784L, 42828);
    if (paramThrowable.getMessage().contains("checkDexOptExist failed"))
    {
      g.ork.a(338L, 134L, 1L, false);
      GMTrace.o(5748276854784L, 42828);
      return;
    }
    if (paramThrowable.getMessage().contains("checkDexOptFormat failed"))
    {
      g.ork.a(338L, 135L, 1L, false);
      g.ork.d("Tinker", "Tinker Exception:apply tinker occur dexOpt format exception " + ai.g(paramThrowable), null);
      GMTrace.o(5748276854784L, 42828);
      return;
    }
    g.ork.a(338L, 105L, 1L, false);
    g.ork.d("Tinker", "Tinker Exception:apply tinker occur dexOpt exception " + ai.g(paramThrowable), null);
    GMTrace.o(5748276854784L, 42828);
  }
  
  public static void ff(boolean paramBoolean)
  {
    GMTrace.i(5747471548416L, 42822);
    w.i("Tinker.HotPatchReportHelper", "hp_report try to apply hotpatch");
    g.ork.M(338, 2, 71);
    if (paramBoolean) {
      g.ork.a(338L, 7L, 1L, true);
    }
    GMTrace.o(5747471548416L, 42822);
  }
  
  public static void g(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(5747874201600L, 42825);
    if (paramBoolean) {
      g.ork.a(338L, 3L, 1L, true);
    }
    if (paramBoolean) {
      g.ork.a(338L, 101L, 1L, false);
    }
    for (;;)
    {
      w.i("Tinker.HotPatchReportHelper", "hp_report report apply cost = %d", new Object[] { Long.valueOf(paramLong) });
      if (paramLong >= 0L) {
        break;
      }
      w.e("Tinker.HotPatchReportHelper", "hp_report report apply cost failed, invalid cost");
      GMTrace.o(5747874201600L, 42825);
      return;
      g.ork.a(338L, 103L, 1L, false);
    }
    if (paramLong <= 5000L)
    {
      if (paramBoolean)
      {
        g.ork.a(338L, 117L, 1L, false);
        GMTrace.o(5747874201600L, 42825);
        return;
      }
      g.ork.a(338L, 122L, 1L, false);
      GMTrace.o(5747874201600L, 42825);
      return;
    }
    if (paramLong <= 10000L)
    {
      if (paramBoolean)
      {
        g.ork.a(338L, 118L, 1L, false);
        GMTrace.o(5747874201600L, 42825);
        return;
      }
      g.ork.a(338L, 123L, 1L, false);
      GMTrace.o(5747874201600L, 42825);
      return;
    }
    if (paramLong <= 30000L)
    {
      if (paramBoolean)
      {
        g.ork.a(338L, 119L, 1L, false);
        GMTrace.o(5747874201600L, 42825);
        return;
      }
      g.ork.a(338L, 124L, 1L, false);
      GMTrace.o(5747874201600L, 42825);
      return;
    }
    if (paramLong <= 60000L)
    {
      if (paramBoolean)
      {
        g.ork.a(338L, 120L, 1L, false);
        GMTrace.o(5747874201600L, 42825);
        return;
      }
      g.ork.a(338L, 125L, 1L, false);
      GMTrace.o(5747874201600L, 42825);
      return;
    }
    if (paramLong >= 3600000L) {
      g.ork.a(338L, 133L, 1L, false);
    }
    if (paramBoolean)
    {
      g.ork.a(338L, 121L, 1L, false);
      GMTrace.o(5747874201600L, 42825);
      return;
    }
    g.ork.a(338L, 126L, 1L, false);
    GMTrace.o(5747874201600L, 42825);
  }
  
  public static void h(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(5748813725696L, 42832);
    g.ork.a(338L, 4L, 1L, false);
    if (!paramBoolean)
    {
      g.ork.a(338L, 159L, 1L, false);
      GMTrace.o(5748813725696L, 42832);
      return;
    }
    w.i("Tinker.HotPatchReportHelper", "hp_report report load cost = %d", new Object[] { Long.valueOf(paramLong) });
    if (paramLong < 0L)
    {
      w.e("Tinker.HotPatchReportHelper", "hp_report report load cost failed, invalid cost");
      GMTrace.o(5748813725696L, 42832);
      return;
    }
    if (paramLong <= 500L)
    {
      g.ork.a(338L, 177L, 1L, false);
      GMTrace.o(5748813725696L, 42832);
      return;
    }
    if (paramLong <= 1000L)
    {
      g.ork.a(338L, 178L, 1L, false);
      GMTrace.o(5748813725696L, 42832);
      return;
    }
    if (paramLong <= 3000L)
    {
      g.ork.a(338L, 179L, 1L, false);
      GMTrace.o(5748813725696L, 42832);
      return;
    }
    if (paramLong <= 5000L)
    {
      g.ork.a(338L, 180L, 1L, false);
      GMTrace.o(5748813725696L, 42832);
      return;
    }
    g.ork.a(338L, 181L, 1L, false);
    GMTrace.o(5748813725696L, 42832);
  }
  
  public static void k(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(5749082161152L, 42834);
    w.i("Tinker.HotPatchReportHelper", "hp_report package check failed, error = %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramBoolean) {
      g.ork.a(338L, 170L, 1L, false);
    }
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5749082161152L, 42834);
      return;
      g.ork.M(338, 169, 171);
      GMTrace.o(5749082161152L, 42834);
      return;
      g.ork.M(338, 169, 172);
      GMTrace.o(5749082161152L, 42834);
      return;
      g.ork.M(338, 169, 173);
      GMTrace.o(5749082161152L, 42834);
      return;
      g.ork.M(338, 169, 175);
      GMTrace.o(5749082161152L, 42834);
      return;
      g.ork.M(338, 169, 174);
      GMTrace.o(5749082161152L, 42834);
      return;
      g.ork.M(338, 169, 176);
      GMTrace.o(5749082161152L, 42834);
      return;
      g.ork.M(338, 107, 182);
      GMTrace.o(5749082161152L, 42834);
      return;
      g.ork.M(338, 169, 186);
    }
  }
  
  public static void pb(int paramInt)
  {
    GMTrace.i(15368332509184L, 114503);
    w.i("Tinker.HotPatchReportHelper", "hp_report new hotpatch requested");
    switch (paramInt)
    {
    }
    for (;;)
    {
      mhb = bg.Pw();
      GMTrace.o(15368332509184L, 114503);
      return;
      g.ork.a(338L, 0L, 1L, false);
      continue;
      g.ork.a(338L, 20L, 1L, false);
      continue;
      g.ork.a(614L, 0L, 1L, false);
    }
  }
  
  public static void pc(int paramInt)
  {
    GMTrace.i(15368466726912L, 114504);
    long l = bg.aI(mhb);
    w.i("Tinker.HotPatchReportHelper", "hp_report report download cost = %d", new Object[] { Long.valueOf(l) });
    switch (paramInt)
    {
    }
    while (l < 0L)
    {
      w.e("Tinker.HotPatchReportHelper", "hp_report report download cost failed, invalid cost");
      GMTrace.o(15368466726912L, 114504);
      return;
      g.ork.a(338L, 40L, 1L, false);
    }
    if (l <= 5000L)
    {
      g.ork.M(338, 1, 43);
      GMTrace.o(15368466726912L, 114504);
      return;
    }
    if (l <= 60000L)
    {
      g.ork.M(338, 1, 44);
      GMTrace.o(15368466726912L, 114504);
      return;
    }
    if (l <= 180000L)
    {
      g.ork.M(338, 1, 45);
      GMTrace.o(15368466726912L, 114504);
      return;
    }
    g.ork.M(338, 1, 46);
    GMTrace.o(15368466726912L, 114504);
  }
  
  public static void pd(int paramInt)
  {
    GMTrace.i(15368600944640L, 114505);
    w.i("Tinker.HotPatchReportHelper", "hp_report download failed");
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15368600944640L, 114505);
      return;
      g.ork.a(338L, 41L, 1L, false);
      GMTrace.o(15368600944640L, 114505);
      return;
      g.ork.a(338L, 42L, 1L, false);
      GMTrace.o(15368600944640L, 114505);
      return;
      g.ork.a(614L, 3L, 1L, false);
    }
  }
  
  public static void pe(int paramInt)
  {
    GMTrace.i(5747605766144L, 42823);
    w.i("Tinker.HotPatchReportHelper", "hp_report try to apply hotpatch fail");
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 75L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 72L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 74L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 73L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 85L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 77L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 76L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 78L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 80L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 79L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 81L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 82L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 83L, 1L, false);
      GMTrace.o(5747605766144L, 42823);
      return;
      g.ork.a(338L, 84L, 1L, false);
    }
  }
  
  public static void pf(int paramInt)
  {
    GMTrace.i(5748008419328L, 42826);
    w.i("Tinker.HotPatchReportHelper", "hp_report package check failed, error = %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5748008419328L, 42826);
      return;
      g.ork.M(338, 107, 108);
      GMTrace.o(5748008419328L, 42826);
      return;
      g.ork.M(338, 107, 109);
      GMTrace.o(5748008419328L, 42826);
      return;
      g.ork.M(338, 107, 110);
      GMTrace.o(5748008419328L, 42826);
      return;
      g.ork.M(338, 107, 112);
      GMTrace.o(5748008419328L, 42826);
      return;
      g.ork.M(338, 107, 111);
      GMTrace.o(5748008419328L, 42826);
      return;
      g.ork.M(338, 107, 113);
      GMTrace.o(5748008419328L, 42826);
      return;
      g.ork.M(338, 107, 129);
      GMTrace.o(5748008419328L, 42826);
      return;
      g.ork.M(338, 107, 131);
    }
  }
  
  public static void pg(int paramInt)
  {
    GMTrace.i(5748679507968L, 42831);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5748679507968L, 42831);
      return;
      g.ork.a(338L, 114L, 1L, false);
      GMTrace.o(5748679507968L, 42831);
      return;
      g.ork.a(338L, 115L, 1L, false);
      GMTrace.o(5748679507968L, 42831);
      return;
      g.ork.a(338L, 130L, 1L, false);
      GMTrace.o(5748679507968L, 42831);
      return;
      g.ork.a(338L, 132L, 1L, false);
      GMTrace.o(5748679507968L, 42831);
      return;
      g.ork.a(338L, 136L, 1L, false);
    }
  }
  
  public static void ph(int paramInt)
  {
    GMTrace.i(5749350596608L, 42836);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5749350596608L, 42836);
      return;
      g.ork.a(338L, 183L, 1L, false);
      GMTrace.o(5749350596608L, 42836);
      return;
      g.ork.a(338L, 164L, 1L, false);
      GMTrace.o(5749350596608L, 42836);
      return;
      g.ork.a(338L, 165L, 1L, false);
      GMTrace.o(5749350596608L, 42836);
      return;
      g.ork.a(338L, 166L, 1L, false);
      GMTrace.o(5749350596608L, 42836);
      return;
      g.ork.a(338L, 167L, 1L, false);
      GMTrace.o(5749350596608L, 42836);
      return;
      g.ork.a(338L, 187L, 1L, false);
    }
  }
  
  public static void pi(int paramInt)
  {
    GMTrace.i(5749484814336L, 42837);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5749484814336L, 42837);
      return;
      g.ork.a(338L, 162L, 1L, false);
      GMTrace.o(5749484814336L, 42837);
      return;
      g.ork.a(338L, 163L, 1L, false);
      GMTrace.o(5749484814336L, 42837);
      return;
      g.ork.a(338L, 185L, 1L, false);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */