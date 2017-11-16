package com.tencent.mm.plugin.mmsight.model;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.s;
import com.tencent.mm.plugin.mmsight.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class a
{
  static a mXh;
  public int eSp;
  public int fQR;
  public long fileSize;
  int kSB;
  public int mXA;
  public int mXB;
  public int mXC;
  public int mXD;
  int mXE;
  public int mXF;
  public int mXG;
  public int mXH;
  public long mXI;
  public int mXJ;
  JSONObject mXK;
  String mXi;
  int mXj;
  String mXk;
  int mXl;
  int mXm;
  public String mXn;
  public String mXo;
  public String mXp;
  public String mXq;
  public int mXr;
  public int mXs;
  public int mXt;
  public int mXu;
  public int mXv;
  public int mXw;
  public int mXx;
  public int mXy;
  public int mXz;
  String model;
  public int videoBitrate;
  
  public a()
  {
    GMTrace.i(7335401488384L, 54653);
    this.model = Build.MODEL;
    this.mXi = Build.VERSION.SDK_INT;
    this.eSp = 0;
    this.mXK = null;
    GMTrace.o(7335401488384L, 54653);
  }
  
  public static a aOR()
  {
    GMTrace.i(7335535706112L, 54654);
    if (mXh == null) {
      reset();
    }
    a locala = mXh;
    GMTrace.o(7335535706112L, 54654);
    return locala;
  }
  
  public static void reset()
  {
    GMTrace.i(7335669923840L, 54655);
    Object localObject = new a();
    mXh = (a)localObject;
    ((a)localObject).kSB = ((ActivityManager)ab.getContext().getSystemService("activity")).getLargeMemoryClass();
    mXh.mXj = d.cO(ab.getContext());
    mXh.mXk = l.sL();
    localObject = d.cN(ab.getContext());
    mXh.mXl = ((Point)localObject).x;
    mXh.mXm = ((Point)localObject).y;
    GMTrace.o(7335669923840L, 54655);
  }
  
  public final String aOS()
  {
    GMTrace.i(7335804141568L, 54656);
    if (this.mXK == null) {}
    for (;;)
    {
      try
      {
        this.mXK = new JSONObject();
        localObject = new JSONObject();
        this.mXK.put("wxcamera", localObject);
        ((JSONObject)localObject).put("model", this.model);
        ((JSONObject)localObject).put("apiLevel", this.mXi);
        ((JSONObject)localObject).put("screen", String.format("%dx%d", new Object[] { Integer.valueOf(this.mXl), Integer.valueOf(this.mXm) }));
        ((JSONObject)localObject).put("crop", String.format("%dx%d", new Object[] { Integer.valueOf(this.mXr), Integer.valueOf(this.mXs) }));
        ((JSONObject)localObject).put("preview", String.format("%dx%d", new Object[] { Integer.valueOf(this.mXt), Integer.valueOf(this.mXu) }));
        ((JSONObject)localObject).put("encoder", String.format("%dx%d", new Object[] { Integer.valueOf(this.mXv), Integer.valueOf(this.mXw) }));
        ((JSONObject)localObject).put("rotate", this.eSp);
        ((JSONObject)localObject).put("deviceoutfps", this.mXx);
        ((JSONObject)localObject).put("recordfps", this.mXy);
        ((JSONObject)localObject).put("recordertype", this.mXz);
        ((JSONObject)localObject).put("needRotateEachFrame", this.fQR);
        ((JSONObject)localObject).put("isNeedRealtimeScale", this.mXA);
        ((JSONObject)localObject).put("resolutionLimit", this.mXB);
        ((JSONObject)localObject).put("videoBitrate", this.videoBitrate);
        ((JSONObject)localObject).put("wait2playtime", this.mXI);
        ((JSONObject)localObject).put("useback", this.mXJ);
        if (j.mZc == null) {
          continue;
        }
        i = j.mZc.mZl;
        ((JSONObject)localObject).put("presetIndex", i);
        ((JSONObject)localObject).put("recorderOption", p.fQJ.fQX);
      }
      catch (Exception localException)
      {
        Object localObject;
        int i;
        w.printErrStackTrace("MicroMsg.CaptureStatistics", localException, "buildJson error", new Object[0]);
        continue;
      }
      localObject = this.mXK.toString();
      GMTrace.o(7335804141568L, 54656);
      return (String)localObject;
      i = -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */