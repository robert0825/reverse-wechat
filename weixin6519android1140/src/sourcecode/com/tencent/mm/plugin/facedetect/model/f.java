package com.tencent.mm.plugin.facedetect.model;

import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public enum f
{
  private static af kSO;
  public FaceDetectProcessService kSN;
  
  static
  {
    GMTrace.i(5864240971776L, 43692);
    kSM = new f("INSTANCE");
    kSP = new f[] { kSM };
    kSO = new af("face_process");
    GMTrace.o(5864240971776L, 43692);
  }
  
  private f()
  {
    GMTrace.i(5863301447680L, 43685);
    this.kSN = null;
    GMTrace.o(5863301447680L, 43685);
  }
  
  public static void awi()
  {
    GMTrace.i(18490505297920L, 137765);
    kSO.bQi().removeCallbacksAndMessages(null);
    GMTrace.o(18490505297920L, 137765);
  }
  
  public static ae awj()
  {
    GMTrace.i(18490639515648L, 137766);
    ae localae = kSO.bQi();
    GMTrace.o(18490639515648L, 137766);
    return localae;
  }
  
  public static boolean awk()
  {
    GMTrace.i(5863569883136L, 43687);
    boolean bool = ab.getContext().getPackageManager().hasSystemFeature("android.hardware.camera.front");
    GMTrace.o(5863569883136L, 43687);
    return bool;
  }
  
  public static boolean awl()
  {
    GMTrace.i(15372090605568L, 114531);
    boolean bool = n.awu();
    GMTrace.o(15372090605568L, 114531);
    return bool;
  }
  
  public static int awo()
  {
    GMTrace.i(5864106754048L, 43691);
    int i = FaceProNative.engineVersion();
    GMTrace.o(5864106754048L, 43691);
    return i;
  }
  
  public static void r(Runnable paramRunnable)
  {
    GMTrace.i(18490371080192L, 137764);
    kSO.A(paramRunnable);
    GMTrace.o(18490371080192L, 137764);
  }
  
  public final int awm()
  {
    GMTrace.i(5863838318592L, 43689);
    g localg = this.kSN.kUR;
    if (localg.kSQ == null)
    {
      w.e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
      GMTrace.o(5863838318592L, 43689);
      return -3;
    }
    int i = localg.kSQ.engineReleaseCurrMotion();
    GMTrace.o(5863838318592L, 43689);
    return i;
  }
  
  public final int awn()
  {
    GMTrace.i(5863972536320L, 43690);
    g localg = this.kSN.kUR;
    if (localg.kSQ == null)
    {
      w.e("MicroMsg.FaceDetectNativeManager", "hy: getCurrentMotion not init");
      GMTrace.o(5863972536320L, 43690);
      return -1;
    }
    int i = localg.kSQ.engineGetCurrMotion();
    GMTrace.o(5863972536320L, 43690);
    return i;
  }
  
  public final boolean eo(boolean paramBoolean)
  {
    GMTrace.i(5863435665408L, 43686);
    w.i("MicroMsg.FaceDetectManager", "alvinluo: face detect isCheckDynCfg: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    boolean bool1 = awk();
    boolean bool2 = n.awu();
    if (paramBoolean)
    {
      if (bg.getInt(((a)h.h(a.class)).ut().getValue("BioSigFaceEntry"), 0) == 1) {}
      for (paramBoolean = true;; paramBoolean = false)
      {
        w.i("MicroMsg.FaceDetectManager", "hy: face config support: %b, hardware support: %b, isModelFileValid: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        if ((!paramBoolean) || (!(bool1 & bool2))) {
          break;
        }
        GMTrace.o(5863435665408L, 43686);
        return true;
      }
      GMTrace.o(5863435665408L, 43686);
      return false;
    }
    w.i("MicroMsg.FaceDetectManager", "hy: hardware support: %b, isModelFileValid: %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
    if ((bool2) && (bool1))
    {
      GMTrace.o(5863435665408L, 43686);
      return true;
    }
    GMTrace.o(5863435665408L, 43686);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */