package com.tencent.mm.plugin.mmsight.model;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.Camera.Parameters;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.s;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.t.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.u;

public final class j
{
  static int kSB;
  public static boolean mYZ;
  private static boolean mZa;
  private static boolean mZb;
  public static o mZc;
  static double mZd;
  
  static
  {
    GMTrace.i(7324261416960L, 54570);
    mYZ = true;
    mZa = false;
    mZb = false;
    GMTrace.o(7324261416960L, 54570);
  }
  
  public static void a(Camera.Parameters paramParameters, boolean paramBoolean)
  {
    GMTrace.i(7323858763776L, 54567);
    Object localObject2;
    if (mZa)
    {
      localObject1 = ab.getContext();
      localObject2 = ab.getResources();
      i = a.a.nkn;
      if (mZc == null) {}
      for (paramParameters = "";; paramParameters = Integer.valueOf(mZc.mZl))
      {
        u.makeText((Context)localObject1, ((Resources)localObject2).getString(i, new Object[] { paramParameters }), 1).show();
        GMTrace.o(7323858763776L, 54567);
        return;
      }
    }
    w.i("MicroMsg.MMSightRecorderConfig", "autoConfig, recorderOption: %s, isUseRecorderOption: %s", new Object[] { Integer.valueOf(p.fQJ.fQX), Boolean.valueOf(mZb) });
    if (mZb)
    {
      GMTrace.o(7323858763776L, 54567);
      return;
    }
    Object localObject1 = com.tencent.mm.plugin.mmsight.d.aON();
    int i = bg.getInt(CaptureMMProxy.getInstance().getDynamicConfig("SightMediaCodecMinApiLevel"), 19);
    int k = bg.getInt(CaptureMMProxy.getInstance().getDynamicConfig("Sight1080pRecordMinApiLevel"), 19);
    int j = bg.getInt(CaptureMMProxy.getInstance().getDynamicConfig("Sight720pRecordMinApiLevel"), 19);
    w.i("MicroMsg.MMSightRecorderConfig", "apiLevel: %s record1080pApiLevel: %s, record720pApiLevel: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j) });
    if ((p.fQJ.fQW == -1) || ((p.fQJ.fQW & 0x1) != 0)) {
      if ((p.fQJ.fQW != -1) && ((p.fQJ.fQW & 0x1) != 0))
      {
        mZc.aPk().mZn = true;
        i = 1;
      }
    }
    for (;;)
    {
      boolean bool;
      if (p.fQJ.fQR != -1)
      {
        localObject2 = mZc;
        if (p.fQJ.fQR == 1)
        {
          bool = true;
          label292:
          ((o)localObject2).mZm = bool;
          label299:
          if ((p.fQJ.fQW == -1) || ((p.fQJ.fQW & 0x2) != 0))
          {
            if ((p.fQJ.fQW == -1) || ((p.fQJ.fQW & 0x2) == 0)) {
              break label529;
            }
            paramParameters = mZc.aPi();
            paramParameters.mZn = false;
            paramParameters.aPj();
          }
        }
      }
      label529:
      label640:
      for (;;)
      {
        mZc.mZl = -1;
        w.i("MicroMsg.MMSightRecorderConfig", "autoConfig parameter byserver %s", new Object[] { mZc.toString() });
        GMTrace.o(7323858763776L, 54567);
        return;
        if ((!com.tencent.mm.compatible.util.d.et(k)) || (kSB < 512) || (mZd < 1725.0D) || (Math.min(((Point)localObject1).x, ((Point)localObject1).y) < 1080)) {
          break label642;
        }
        localObject2 = mZc;
        ((o)localObject2).mZq = g.b(paramParameters, com.tencent.mm.plugin.mmsight.d.aON(), ((o)localObject2).mWP.width * 2, paramBoolean);
        if ((((o)localObject2).mZq != null) && (((o)localObject2).mZq.mYQ != null)) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label642;
          }
          mZc.aPk().mZn = true;
          i = 1;
          break;
        }
        bool = false;
        break label292;
        mZc.mZm = false;
        break label299;
        if ((i == 0) && (com.tencent.mm.compatible.util.d.et(j)) && (kSB >= 512) && (mZd >= 1725.0D) && (Math.min(((Point)localObject1).x, ((Point)localObject1).y) >= 720))
        {
          localObject1 = mZc;
          ((o)localObject1).mZq = g.b(paramParameters, com.tencent.mm.plugin.mmsight.d.aON(), 720, paramBoolean);
          if ((((o)localObject1).mZq != null) && (((o)localObject1).mZq.mYQ != null)) {}
          for (i = 1;; i = 0)
          {
            if (i == 0) {
              break label640;
            }
            mZc.aPi().mZn = true;
            break;
          }
        }
      }
      label642:
      i = 0;
    }
  }
  
  public static void a(g.b paramb)
  {
    GMTrace.i(7324127199232L, 54569);
    if (paramb.mYQ == null)
    {
      w.i("MicroMsg.MMSightRecorderConfig", "checkMore start %s", new Object[] { paramb.toString() });
      paramb.mYQ = paramb.mYT;
      paramb.mYR = paramb.mYU;
      paramb.mYS = paramb.mYV;
      if (Math.min(paramb.mYR.y, paramb.mYR.x) >= mZc.mWP.width + 16)
      {
        mZc.aPj();
        mZc.mZn = false;
        mZc.mZm = false;
        w.i("MicroMsg.MMSightRecorderConfig", "checkMore out %s", new Object[] { paramb.toString() });
      }
    }
    GMTrace.o(7324127199232L, 54569);
  }
  
  public static void aPc()
  {
    GMTrace.i(20197083709440L, 150480);
    w.i("MicroMsg.MMSightRecorderConfig", "initSimple");
    o localo = new o();
    mZc = localo;
    localo.mZm = false;
    mZc.mZn = false;
    if (com.tencent.mm.compatible.util.d.et(19))
    {
      mZc.fQQ = 2;
      GMTrace.o(20197083709440L, 150480);
      return;
    }
    mZc.fQQ = 1;
    GMTrace.o(20197083709440L, 150480);
  }
  
  public static void b(VideoTransPara paramVideoTransPara)
  {
    boolean bool2 = true;
    GMTrace.i(7323992981504L, 54568);
    mZa = false;
    mZb = false;
    kSB = ((ActivityManager)ab.getContext().getSystemService("activity")).getLargeMemoryClass();
    mZd = com.tencent.mm.plugin.mmsight.d.cO(ab.getContext());
    Object localObject = ba.bUs();
    int k = bg.getInt(CaptureMMProxy.getInstance().getDynamicConfig("SightMediaCodecMinApiLevel"), 19);
    w.i("MicroMsg.MMSightRecorderConfig", "MXM_DynaCfg_AV_Item_Key_SightMediaCodecMinApiLevel: %s", new Object[] { Integer.valueOf(k) });
    if (CaptureMMProxy.getInstance() != null) {
      p.dO(CaptureMMProxy.getInstance().getDeviceInfoConfig());
    }
    w.i("MicroMsg.MMSightRecorderConfig", "init large memory class: %sMB, totalMemory: %sGB  fingerprint: %s mmSightRecorderInfo: %s", new Object[] { Integer.valueOf(kSB), Double.valueOf(mZd), localObject, p.fQJ });
    int j;
    int i;
    if (CaptureMMProxy.getInstance() != null)
    {
      j = CaptureMMProxy.getInstance().getInt(w.a.vvy, -1);
      i = CaptureMMProxy.getInstance().getInt(w.a.vvB, 1);
    }
    for (;;)
    {
      localObject = o.a(j, paramVideoTransPara);
      mZc = (o)localObject;
      if (localObject != null)
      {
        Resources localResources;
        if (i == 1)
        {
          mZc.mZo = true;
          mZa = true;
          localObject = ab.getContext();
          localResources = ab.getResources();
          i = a.a.nkn;
          if (mZc != null) {
            break label269;
          }
        }
        label269:
        for (paramVideoTransPara = "";; paramVideoTransPara = Integer.valueOf(mZc.mZl))
        {
          u.makeText((Context)localObject, localResources.getString(i, new Object[] { paramVideoTransPara }), 1).show();
          GMTrace.o(7323992981504L, 54568);
          return;
          mZc.mZo = false;
          break;
        }
      }
      j = p.fQJ.fQX;
      w.i("MicroMsg.MMSightRecorderConfig", "recorderOption: %s", new Object[] { Integer.valueOf(j) });
      if (j != -1) {
        mZc = o.a(j, paramVideoTransPara);
      }
      if (mZc != null)
      {
        if (i == 1) {}
        for (mZc.mZo = true;; mZc.mZo = false)
        {
          mZb = true;
          GMTrace.o(7323992981504L, 54568);
          return;
        }
      }
      mZc = o.a(1, paramVideoTransPara);
      if (i == 1)
      {
        mZc.mZo = true;
        if (p.fQJ.fQQ == -1) {
          break label487;
        }
        mZc.fQQ = p.fQJ.fQQ;
        label405:
        if (p.fQJ.fQT != -1)
        {
          if (p.fQJ.fQT != 1) {
            break label514;
          }
          bool1 = true;
          label428:
          mYZ = bool1;
        }
        if (p.fQJ.fQR == -1) {
          break label526;
        }
        paramVideoTransPara = mZc;
        if (p.fQJ.fQR != 1) {
          break label520;
        }
      }
      label487:
      label514:
      label520:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        paramVideoTransPara.mZm = bool1;
        GMTrace.o(7323992981504L, 54568);
        return;
        mZc.mZo = false;
        break;
        if (com.tencent.mm.compatible.util.d.et(k))
        {
          mZc.fQQ = 2;
          break label405;
        }
        mZc.fQQ = 1;
        break label405;
        bool1 = false;
        break label428;
      }
      label526:
      mZc.mZm = false;
      GMTrace.o(7323992981504L, 54568);
      return;
      i = 1;
      j = -1;
    }
  }
  
  public static boolean b(Point paramPoint)
  {
    GMTrace.i(7323724546048L, 54566);
    if (mZa)
    {
      Context localContext = ab.getContext();
      Resources localResources = ab.getResources();
      int i = a.a.nkn;
      if (mZc == null) {}
      for (paramPoint = "";; paramPoint = Integer.valueOf(mZc.mZl))
      {
        u.makeText(localContext, localResources.getString(i, new Object[] { paramPoint }), 1).show();
        GMTrace.o(7323724546048L, 54566);
        return false;
      }
    }
    w.i("MicroMsg.MMSightRecorderConfig", "checkMediaCodecHappy, deviceInfo recorderType: %s, recorderOption: %s, isUseRecorderOption: %s", new Object[] { Integer.valueOf(p.fQJ.fQQ), Integer.valueOf(p.fQJ.fQX), Boolean.valueOf(mZb) });
    if (mZb)
    {
      GMTrace.o(7323724546048L, 54566);
      return false;
    }
    if (p.fQJ.fQQ != -1)
    {
      GMTrace.o(7323724546048L, 54566);
      return true;
    }
    if ((mZc != null) && (1 == mZc.fQQ))
    {
      GMTrace.o(7323724546048L, 54566);
      return true;
    }
    if (paramPoint == null)
    {
      GMTrace.o(7323724546048L, 54566);
      return false;
    }
    if ((com.tencent.mm.plugin.mmsight.d.qE(paramPoint.x)) && (com.tencent.mm.plugin.mmsight.d.qE(paramPoint.y)))
    {
      GMTrace.o(7323724546048L, 54566);
      return true;
    }
    if (mZc != null)
    {
      w.i("MicroMsg.MMSightRecorderConfig", "checkMediaCodecHappy not happy %s", new Object[] { paramPoint.toString() });
      mZc.fQQ = 1;
    }
    GMTrace.o(7323724546048L, 54566);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */