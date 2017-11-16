package com.tencent.mm.plugin.backup.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class f
{
  public static int iXa;
  public static int iXb;
  public static int iXc;
  public static int iXd;
  public static int iXe;
  public static int iXf;
  public static int iXg;
  public static long iXh;
  public static long iXi;
  public static long iXj;
  
  public static void aeA()
  {
    GMTrace.i(14730932518912L, 109754);
    w.d("MicroMsg.TestInfo", "netTime" + (bg.Pv() - iXi));
    GMTrace.o(14730932518912L, 109754);
  }
  
  public static void aez()
  {
    GMTrace.i(14730798301184L, 109753);
    w.d("MicroMsg.TestInfo", "total_count: " + iXg + "text_count: " + iXc + "normal_count : " + iXb + " image_count: " + iXa + " voice_count : " + iXe + " video_count " + iXd + " app_count : " + iXf + " time: " + (bg.Pv() - iXh) + " net: " + iXj);
    GMTrace.o(14730798301184L, 109753);
  }
  
  public static void kv(int paramInt)
  {
    GMTrace.i(14730664083456L, 109752);
    switch (paramInt)
    {
    }
    for (;;)
    {
      iXg += 1;
      GMTrace.o(14730664083456L, 109752);
      return;
      iXc += 1;
      continue;
      iXf += 1;
      continue;
      iXe += 1;
      continue;
      iXd += 1;
      continue;
      iXa += 1;
      continue;
      iXb += 1;
    }
  }
  
  public static void reset()
  {
    GMTrace.i(14730529865728L, 109751);
    iXa = 0;
    iXb = 0;
    iXc = 0;
    iXd = 0;
    iXe = 0;
    iXf = 0;
    iXg = 0;
    long l = bg.Pv();
    iXh = l;
    iXj = l - iXi;
    GMTrace.o(14730529865728L, 109751);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */