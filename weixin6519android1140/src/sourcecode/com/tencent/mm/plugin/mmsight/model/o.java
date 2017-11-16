package com.tencent.mm.plugin.mmsight.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.w;

public final class o
{
  public int fQQ;
  public VideoTransPara mWP;
  public int mXB;
  public boolean mYZ;
  public int mZl;
  public boolean mZm;
  public boolean mZn;
  public boolean mZo;
  public boolean mZp;
  g.b mZq;
  public int videoBitrate;
  
  public o()
  {
    GMTrace.i(20191178129408L, 150436);
    this.fQQ = 1;
    this.mZl = -1;
    this.mYZ = false;
    this.mZm = false;
    this.mZn = false;
    this.mXB = -1;
    this.mZo = true;
    this.mZp = false;
    GMTrace.o(20191178129408L, 150436);
  }
  
  private o(int paramInt, VideoTransPara paramVideoTransPara)
  {
    GMTrace.i(7337683189760L, 54670);
    this.fQQ = 1;
    this.mZl = -1;
    this.mYZ = false;
    this.mZm = false;
    this.mZn = false;
    this.mXB = -1;
    this.mZo = true;
    this.mZp = false;
    this.mWP = paramVideoTransPara;
    this.fQQ = paramInt;
    this.videoBitrate = paramVideoTransPara.videoBitrate;
    this.mXB = paramVideoTransPara.width;
    GMTrace.o(7337683189760L, 54670);
  }
  
  public static o a(int paramInt, VideoTransPara paramVideoTransPara)
  {
    GMTrace.i(7337548972032L, 54669);
    switch (paramInt)
    {
    default: 
      GMTrace.o(7337548972032L, 54669);
      return null;
    case 1: 
      w.i("MicroMsg.RecoderParameter", "setToPresetConfig1");
      paramVideoTransPara = new o(2, paramVideoTransPara);
      paramVideoTransPara.mZn = false;
    }
    for (;;)
    {
      if (paramVideoTransPara != null) {
        paramVideoTransPara.mZl = paramInt;
      }
      GMTrace.o(7337548972032L, 54669);
      return paramVideoTransPara;
      w.i("MicroMsg.RecoderParameter", "setToPresetConfig2");
      paramVideoTransPara = new o(2, paramVideoTransPara);
      paramVideoTransPara.mZn = false;
      paramVideoTransPara = paramVideoTransPara.aPj().aPi();
      continue;
      w.i("MicroMsg.RecoderParameter", "setToPresetConfig3");
      paramVideoTransPara = new o(1, paramVideoTransPara);
      paramVideoTransPara.mZn = false;
      continue;
      w.i("MicroMsg.RecoderParameter", "setToPresetConfig4");
      paramVideoTransPara = new o(1, paramVideoTransPara);
      paramVideoTransPara.mZn = false;
      paramVideoTransPara = paramVideoTransPara.aPj().aPi();
      continue;
      w.i("MicroMsg.RecoderParameter", "setToPresetConfig5");
      paramVideoTransPara = new o(2, paramVideoTransPara);
      paramVideoTransPara.mZn = true;
      paramVideoTransPara.mZm = false;
      paramVideoTransPara = paramVideoTransPara.aPi();
      continue;
      w.i("MicroMsg.RecoderParameter", "setToPresetConfig6");
      paramVideoTransPara = new o(1, paramVideoTransPara);
      paramVideoTransPara.mZn = true;
      paramVideoTransPara = paramVideoTransPara.aPi();
      continue;
      w.i("MicroMsg.RecoderParameter", "setToPresetConfig7");
      paramVideoTransPara = new o(2, paramVideoTransPara);
      paramVideoTransPara.mZn = true;
      paramVideoTransPara = paramVideoTransPara.aPk();
      paramVideoTransPara.mZm = false;
      continue;
      w.i("MicroMsg.RecoderParameter", "setToPresetConfig8");
      paramVideoTransPara = new o(2, paramVideoTransPara);
      paramVideoTransPara.mZn = true;
      paramVideoTransPara = paramVideoTransPara.aPk();
      paramVideoTransPara.mZm = true;
      continue;
      paramVideoTransPara = new o(1, paramVideoTransPara);
      paramVideoTransPara.mZn = true;
      paramVideoTransPara = paramVideoTransPara.aPk();
      paramVideoTransPara.mZm = false;
      continue;
      w.i("MicroMsg.RecoderParameter", "setToPresetConfig10");
      paramVideoTransPara = new o(1, paramVideoTransPara);
      paramVideoTransPara.mZn = true;
      paramVideoTransPara = paramVideoTransPara.aPk();
      paramVideoTransPara.mZm = true;
      continue;
      w.i("MicroMsg.RecoderParameter", "setToPresetConfig10");
      paramVideoTransPara = new o(2, paramVideoTransPara);
      paramVideoTransPara.mZn = true;
      paramVideoTransPara = paramVideoTransPara.aPk();
      paramVideoTransPara.mZm = false;
      paramVideoTransPara = paramVideoTransPara.aPj();
    }
  }
  
  public final o aPi()
  {
    GMTrace.i(7337817407488L, 54671);
    this.mXB = 720;
    GMTrace.o(7337817407488L, 54671);
    return this;
  }
  
  public final o aPj()
  {
    GMTrace.i(7337951625216L, 54672);
    this.videoBitrate = (this.mWP.videoBitrate * 2);
    this.mZp = true;
    GMTrace.o(7337951625216L, 54672);
    return this;
  }
  
  public final o aPk()
  {
    GMTrace.i(7338085842944L, 54673);
    this.mXB = (this.mWP.width * 2);
    GMTrace.o(7338085842944L, 54673);
    return this;
  }
  
  public final boolean aPl()
  {
    GMTrace.i(7338220060672L, 54674);
    if (this.mWP.width < this.mXB)
    {
      GMTrace.o(7338220060672L, 54674);
      return true;
    }
    GMTrace.o(7338220060672L, 54674);
    return false;
  }
  
  public final String toString()
  {
    GMTrace.i(7338354278400L, 54675);
    String str = String.format("mediatype %s videoBitrate : %s isEnableLandscapeMode %s needRotateEachFrame %s isNeedRealtimeScale %s resolutionLimit %s videoParams %s", new Object[] { Integer.valueOf(this.fQQ), Integer.valueOf(this.videoBitrate), Boolean.valueOf(this.mYZ), Boolean.valueOf(this.mZm), Boolean.valueOf(this.mZn), Integer.valueOf(this.mXB), this.mWP });
    GMTrace.o(7338354278400L, 54675);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */