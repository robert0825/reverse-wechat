package com.tencent.mm.plugin.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.bj;

public final class b
{
  private static int HH()
  {
    GMTrace.i(13180851978240L, 98205);
    int i = ab.getContext().getSharedPreferences(ab.bPU(), 0).getInt("reg_style_id", 0);
    GMTrace.o(13180851978240L, 98205);
    return i;
  }
  
  public static String Qu()
  {
    GMTrace.i(13181120413696L, 98207);
    String str = ab.getContext().getSharedPreferences(ab.bPU(), 0).getString("reg_last_exit_ui", "");
    GMTrace.o(13181120413696L, 98207);
    return str;
  }
  
  public static void b(boolean paramBoolean, String paramString)
  {
    GMTrace.i(13181523066880L, 98210);
    if (paramBoolean) {}
    for (paramString = paramString + "," + HH() + "," + bg.Pv() + "," + Qu();; paramString = paramString + "," + HH() + "," + bg.Pv() + "," + ab.getContext().getSharedPreferences(ab.bPU(), 0).getString("reg_next_enter_ui", ""))
    {
      d.oqe.a(10645, paramString, true, true);
      GMTrace.o(13181523066880L, 98210);
      return;
    }
  }
  
  public static void hI(int paramInt)
  {
    GMTrace.i(13180717760512L, 98204);
    if (paramInt > 0) {
      if (bj.BC().BD() > 0)
      {
        bj.BC();
        if (paramInt != 20) {}
      }
      else
      {
        ab.getContext().getSharedPreferences(ab.bPU(), 0).edit().putInt("reg_style_id", paramInt).commit();
      }
    }
    GMTrace.o(13180717760512L, 98204);
  }
  
  public static void nA(String paramString)
  {
    GMTrace.i(13181388849152L, 98209);
    paramString = paramString + "," + HH() + "," + bg.Pv() + "," + Qu();
    d.oqe.a(10645, paramString, true, true);
    GMTrace.o(13181388849152L, 98209);
  }
  
  public static void ny(String paramString)
  {
    GMTrace.i(13180986195968L, 98206);
    ab.getContext().getSharedPreferences(ab.bPU(), 0).edit().putString("reg_last_exit_ui", paramString).commit();
    GMTrace.o(13180986195968L, 98206);
  }
  
  public static void nz(String paramString)
  {
    GMTrace.i(13181254631424L, 98208);
    ab.getContext().getSharedPreferences(ab.bPU(), 0).edit().putString("reg_next_enter_ui", paramString).commit();
    GMTrace.o(13181254631424L, 98208);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */