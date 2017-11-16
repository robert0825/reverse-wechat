package com.tencent.mm.plugin.mmsight.model;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class k
{
  public static void aPd()
  {
    GMTrace.i(7339428020224L, 54683);
    w.i("MicroMsg.MMSightRecorderIDKeyStat", "markCapture");
    g.ork.a(440L, 0L, 1L, false);
    int i = 36;
    if (j.mZc.fQQ == 1) {
      i = 39;
    }
    int j;
    if (j.mZc.mXB == 720) {
      j = i + 1;
    }
    for (;;)
    {
      g.ork.a(440L, j, 1L, false);
      GMTrace.o(7339428020224L, 54683);
      return;
      j = i;
      if (j.mZc.aPl()) {
        j = i + 2;
      }
    }
  }
  
  public static void aPe()
  {
    GMTrace.i(7339562237952L, 54684);
    w.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegInitError");
    g.ork.a(440L, 7L, 1L, false);
    GMTrace.o(7339562237952L, 54684);
  }
  
  public static void aPf()
  {
    GMTrace.i(7339696455680L, 54685);
    w.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecInitError");
    g.ork.a(440L, 8L, 1L, false);
    GMTrace.o(7339696455680L, 54685);
  }
  
  public static void aPg()
  {
    GMTrace.i(7339830673408L, 54686);
    w.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecYUVInitError");
    g.ork.a(440L, 16L, 1L, false);
    GMTrace.o(7339830673408L, 54686);
  }
  
  public static void aPh()
  {
    GMTrace.i(20197217927168L, 150481);
    w.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecWriteYUVError");
    g.ork.a(440L, 21L, 1L, false);
    GMTrace.o(20197217927168L, 150481);
  }
  
  public static void b(boolean paramBoolean, long paramLong)
  {
    GMTrace.i(7339964891136L, 54687);
    w.v("MicroMsg.MMSightRecorderIDKeyStat", "markCaptureProcessCost isPictureMode %s cost_time %s", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(paramLong) });
    a.aOR().mXI = paramLong;
    a locala = a.aOR();
    d locald1 = new d();
    d locald2 = new d();
    locald1.p("model", locala.model + ",");
    locald1.p("apiLevel", locala.mXi + ",");
    locald1.p("memoryClass", locala.kSB + ",");
    locald1.p("totalMemory", locala.mXj + ",");
    locald1.p("maxCpu", locala.mXk + ",");
    locald1.p("screenW", locala.mXl + ",");
    locald1.p("screenH", locala.mXm + ",");
    locald2.p("model", locala.model + ",");
    locald2.p("apiLevel", locala.mXi + ",");
    locald2.p("memoryClass", locala.kSB + ",");
    locald2.p("totalMemory", locala.mXj + ",");
    locald2.p("maxCpu", locala.mXk + ",");
    locald2.p("screenW", locala.mXl + ",");
    locald2.p("screenH", locala.mXm + ",");
    locald1.p("cropx", locala.mXr + ",");
    locald1.p("cropy", locala.mXs + ",");
    locald1.p("previewx", locala.mXt + ",");
    locald1.p("previewy", locala.mXu + ",");
    locald1.p("encoderx", locala.mXv + ",");
    locald1.p("encodery", locala.mXw + ",");
    locald1.p("rotate", locala.eSp + ",");
    locald1.p("deviceoutfps", locala.mXx + ",");
    locald1.p("recordfps", locala.mXy + ",");
    locald1.p("recordertype", locala.mXz + ",");
    locald1.p("videoBitrate", locala.videoBitrate + ",");
    locald1.p("needRotateEachFrame", locala.fQR + ",");
    locald1.p("isNeedRealtimeScale", locala.mXA + ",");
    locald1.p("resolutionLimit", locala.mXB + ",");
    locald1.p("outfps", locala.mXC + ",");
    locald1.p("recordTime", locala.mXD + ",");
    locald1.p("avgcpu", locala.mXE + ",");
    locald1.p("outx", locala.mXF + ",");
    locald1.p("outy", locala.mXG + ",");
    locald1.p("outbitrate", locala.mXH + ",");
    locald1.p("fileSize", locala.fileSize + ",");
    locald1.p("wait2playtime", locala.mXI + ",");
    locald1.p("useback", locala.mXJ + ",");
    int k = 0;
    int j = 0;
    Intent localIntent = ab.getContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    int i;
    if (localIntent != null)
    {
      i = localIntent.getIntExtra("status", -1);
      if ((i == 2) || (i == 5))
      {
        i = 1;
        k = localIntent.getIntExtra("level", -1);
        j = localIntent.getIntExtra("scale", -1);
      }
    }
    for (;;)
    {
      w.i("MicroMsg.CaptureStatistics", "battery %s %s %s", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j) });
      locald1.p("mIsCharging", i + ",");
      locald1.p("level", k + ",");
      locald1.p("scale", j + ",");
      locald1.p("createTime", System.currentTimeMillis() + ",");
      locald2.p("prewViewlist1", locala.mXn + ",");
      locald2.p("pictureSize1", locala.mXo + ",");
      locald2.p("prewViewlist2", locala.mXp + ",");
      locald2.p("pictureSize2", locala.mXq + ",");
      w.i("MicroMsg.CaptureStatistics", "report " + locald1.LT());
      w.v("MicroMsg.CaptureStatistics", "report " + locald2.LT());
      g.ork.A(13947, locald1.toString());
      g.ork.A(13949, locald2.toString());
      if (!paramBoolean) {
        break label1741;
      }
      g.ork.a(440L, 119L, 1L, false);
      g.ork.a(440L, 120L, paramLong, false);
      if (j.mZc.mXB != 720) {
        break label1686;
      }
      g.ork.a(440L, 122L, paramLong, false);
      GMTrace.o(7339964891136L, 54687);
      return;
      i = 0;
      break;
      i = 0;
    }
    label1686:
    if (j.mZc.aPl())
    {
      g.ork.a(440L, 123L, paramLong, false);
      GMTrace.o(7339964891136L, 54687);
      return;
    }
    g.ork.a(440L, 121L, paramLong, false);
    GMTrace.o(7339964891136L, 54687);
    return;
    label1741:
    g.ork.a(440L, 124L, 1L, false);
    g.ork.a(440L, 125L, paramLong, false);
    if (j.mZc.fQQ == 1)
    {
      g.ork.a(440L, 127L, paramLong, false);
      g.ork.a(440L, 131L, paramLong, false);
      GMTrace.o(7339964891136L, 54687);
      return;
    }
    g.ork.a(440L, 126L, paramLong, false);
    g.ork.a(440L, 130L, paramLong, false);
    GMTrace.o(7339964891136L, 54687);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */