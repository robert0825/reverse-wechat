package com.tencent.mm.plugin.facedetect.model;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Arrays;

public final class h
{
  public static h kST;
  public int[] kSR;
  public int kSS;
  public int kuY;
  
  public h()
  {
    GMTrace.i(5864777842688L, 43696);
    this.kuY = 0;
    this.kSR = null;
    this.kSS = -1;
    GMTrace.o(5864777842688L, 43696);
  }
  
  public static a awr()
  {
    GMTrace.i(5864912060416L, 43697);
    int i = f.kSM.awn();
    Object localObject = f.kSM.kSN.kUR;
    if (((g)localObject).kSQ == null) {
      w.e("MicroMsg.FaceDetectNativeManager", "hy: get motion data not init");
    }
    for (localObject = null;; localObject = ((g)localObject).kSQ.engineGetCurrMotionData())
    {
      localObject = new a(i, (String)localObject);
      GMTrace.o(5864912060416L, 43697);
      return (a)localObject;
    }
  }
  
  public final String toString()
  {
    GMTrace.i(5865046278144L, 43698);
    String str = "FaceDetectProcessModel{mProcessInSequence=" + Arrays.toString(this.kSR) + '}';
    GMTrace.o(5865046278144L, 43698);
    return str;
  }
  
  public static final class a
  {
    public String hvl;
    public long kSU;
    public long kSV;
    public boolean kSW;
    public long kSX;
    public String kSY;
    public boolean kSZ;
    public boolean kTa;
    public int type;
    
    public a(int paramInt, String paramString)
    {
      GMTrace.i(5867999068160L, 43720);
      this.type = paramInt;
      this.kSY = paramString;
      switch (this.type)
      {
      default: 
        w.e("MicroMsg.FaceDetectProcessModel", "hy: unknown type");
        this.type = 100;
        GMTrace.o(5867999068160L, 43720);
        return;
      case 0: 
        this.kSU = 30L;
        this.kSV = 7000L;
        this.hvl = ab.getContext().getString(a.h.kRh);
        this.kSW = true;
        this.kSX = 2500L;
        this.kSZ = false;
        this.kTa = false;
        GMTrace.o(5867999068160L, 43720);
        return;
      case 1: 
        this.kSU = 30L;
        this.kSV = 7000L;
        this.hvl = ab.getContext().getString(a.h.kQD);
        this.kSW = false;
        this.kSX = -1L;
        this.kSZ = true;
        this.kTa = true;
        GMTrace.o(5867999068160L, 43720);
        return;
      case 2: 
        this.kSU = 30L;
        this.kSV = 7000L;
        this.hvl = ab.getContext().getString(a.h.kQE);
        this.kSW = false;
        this.kSX = -1L;
        this.kSZ = true;
        this.kTa = true;
        GMTrace.o(5867999068160L, 43720);
        return;
      case 3: 
        this.kSU = 30L;
        this.kSV = 7000L;
        this.hvl = ab.getContext().getString(a.h.kQC);
        this.kSW = true;
        this.kSX = -1L;
        this.kSZ = true;
        this.kTa = true;
        GMTrace.o(5867999068160L, 43720);
        return;
      }
      this.kSU = 30L;
      this.kSV = 7000L;
      this.hvl = ab.getContext().getString(a.h.kQF);
      this.kSW = true;
      this.kSX = 1000L;
      this.kSZ = true;
      this.kTa = true;
      GMTrace.o(5867999068160L, 43720);
    }
    
    public final String toString()
    {
      GMTrace.i(5868133285888L, 43721);
      String str = "FaceProcessItem{type=" + this.type + ", frameTween=" + this.kSU + ", hintTween=" + this.kSV + ", hintStr='" + this.hvl + '\'' + ", isCheckFace=" + this.kSW + ", minSuccTime=" + this.kSX + ", actionData='" + this.kSY + '\'' + '}';
      GMTrace.o(5868133285888L, 43721);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */