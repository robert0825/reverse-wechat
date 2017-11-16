package com.tencent.mm.pluginsdk.l;

import android.annotation.TargetApi;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.view.SurfaceHolder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.b;
import com.tencent.mm.compatible.d.c.a.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class f
  implements SensorEventListener
{
  static int mXY;
  SensorManager aDS;
  Camera fPj;
  private boolean mXX;
  c.a.a mYa;
  Sensor mYb;
  private float mYc;
  private float mYd;
  private float mYe;
  public Camera.PreviewCallback oWb;
  private SurfaceHolder qzd;
  a tse;
  List<Integer> tsf;
  private boolean tsg;
  public boolean tsh;
  private Camera.AutoFocusCallback tsi;
  
  static
  {
    GMTrace.i(888118706176L, 6617);
    mXY = 0;
    GMTrace.o(888118706176L, 6617);
  }
  
  public f()
  {
    GMTrace.i(887044964352L, 6609);
    this.fPj = null;
    this.mXX = false;
    this.qzd = null;
    this.tsf = new ArrayList();
    this.tsg = true;
    this.mYc = 0.0F;
    this.mYd = 0.0F;
    this.mYe = 0.0F;
    this.oWb = null;
    this.tsh = true;
    this.tsi = new Camera.AutoFocusCallback()
    {
      public final void onAutoFocus(boolean paramAnonymousBoolean, Camera paramAnonymousCamera)
      {
        GMTrace.i(890803060736L, 6637);
        w.d("MicroMsg.YuvReocrder", "auto focus callback");
        f.this.tsh = true;
        GMTrace.o(890803060736L, 6637);
      }
    };
    GMTrace.o(887044964352L, 6609);
  }
  
  public static int bKB()
  {
    GMTrace.i(887179182080L, 6610);
    int i = mXY;
    GMTrace.o(887179182080L, 6610);
    return i;
  }
  
  @TargetApi(9)
  private static void d(Camera.Parameters paramParameters)
  {
    GMTrace.i(887447617536L, 6612);
    if (p.fQC.fOP > 0)
    {
      GMTrace.o(887447617536L, 6612);
      return;
    }
    if (Build.VERSION.SDK_INT < 9)
    {
      GMTrace.o(887447617536L, 6612);
      return;
    }
    List localList = paramParameters.getSupportedPreviewFpsRange();
    if ((localList == null) || (localList.size() == 0))
    {
      GMTrace.o(887447617536L, 6612);
      return;
    }
    int i = Integer.MIN_VALUE;
    int j = Integer.MIN_VALUE;
    int i1 = localList.size();
    int k = 0;
    int m;
    if (k < i1)
    {
      int[] arrayOfInt = (int[])localList.get(k);
      if ((arrayOfInt == null) || (arrayOfInt.length <= 1)) {
        break label298;
      }
      int n = arrayOfInt[0];
      m = arrayOfInt[1];
      w.d("MicroMsg.YuvReocrder", "dkfps %d:[%d %d]", new Object[] { Integer.valueOf(k), Integer.valueOf(n), Integer.valueOf(m) });
      if ((n < 0) || (m < n) || (m < j)) {
        break label298;
      }
      j = n;
      i = m;
    }
    for (;;)
    {
      m = k + 1;
      k = j;
      j = i;
      i = k;
      k = m;
      break;
      w.d("MicroMsg.YuvReocrder", "dkfps get fit  [%d %d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      if ((i == Integer.MAX_VALUE) || (j == Integer.MAX_VALUE))
      {
        GMTrace.o(887447617536L, 6612);
        return;
      }
      try
      {
        paramParameters.setPreviewFpsRange(i, j);
        GMTrace.o(887447617536L, 6612);
        return;
      }
      catch (Exception paramParameters)
      {
        w.printErrStackTrace("MicroMsg.YuvReocrder", paramParameters, "", new Object[0]);
        GMTrace.o(887447617536L, 6612);
        return;
      }
      label298:
      m = i;
      i = j;
      j = m;
    }
  }
  
  public final void aOV()
  {
    GMTrace.i(887313399808L, 6611);
    if ((this.aDS != null) && (this.mYb != null)) {
      this.aDS.unregisterListener(this);
    }
    if (this.fPj != null)
    {
      w.d("MicroMsg.YuvReocrder", "release camera");
      this.fPj.setPreviewCallback(null);
      this.fPj.stopPreview();
      this.fPj.release();
      this.fPj = null;
      this.mXX = false;
    }
    GMTrace.o(887313399808L, 6611);
  }
  
  public final int b(SurfaceHolder paramSurfaceHolder)
  {
    GMTrace.i(887581835264L, 6613);
    if (this.mXX)
    {
      GMTrace.o(887581835264L, 6613);
      return 0;
    }
    int i;
    if (paramSurfaceHolder == null)
    {
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(887581835264L, 6613);
      return 0 - i;
    }
    for (;;)
    {
      Object localObject;
      int k;
      try
      {
        this.qzd = paramSurfaceHolder;
        localParameters = this.fPj.getParameters();
        locala = this.tse;
        w.d("MicroMsg.YuvReocrder", "getFitRecordSize");
        j = Integer.MAX_VALUE;
        if (Build.VERSION.SDK_INT < 11) {
          break label736;
        }
        new com.tencent.mm.compatible.d.g();
        localObject = localParameters.getSupportedVideoSizes();
        if (localObject != null) {
          break label714;
        }
        w.d("MicroMsg.YuvReocrder", "getFitRecordSize getSupportedVideoSizes null, use getSupportedPreviewSizes instead");
        new com.tencent.mm.compatible.d.f();
        localObject = localParameters.getSupportedPreviewSizes();
      }
      catch (Exception paramSurfaceHolder)
      {
        Camera.Parameters localParameters;
        a locala;
        int j;
        int n;
        int i1;
        int m;
        w.printErrStackTrace("MicroMsg.YuvReocrder", paramSurfaceHolder, "", new Object[0]);
        w.e("MicroMsg.YuvReocrder", "Start preview FAILED :" + paramSurfaceHolder.getMessage());
        i = com.tencent.mm.compatible.util.g.tA();
        GMTrace.o(887581835264L, 6613);
        return 0 - i;
      }
      if (k < ((List)localObject).size())
      {
        n = ((Camera.Size)((List)localObject).get(k)).height;
        i1 = ((Camera.Size)((List)localObject).get(k)).width;
        w.d("MicroMsg.YuvReocrder", "supp w:" + i1 + " h:" + n);
        m = n * i1;
        if (((locala.eSp != 0) && (locala.eSp != 180)) || (((n >= locala.mZu) && (i1 >= locala.mZv)) || (((locala.eSp == 90) || (locala.eSp == 270)) && (i1 >= locala.mZu) && (n >= locala.mZv) && (m < j))))
        {
          i = 1;
          locala.kXB = i1;
          locala.kXC = n;
          j = m;
          break label727;
        }
      }
      else
      {
        if (i == 0)
        {
          localObject = localParameters.getPreviewSize();
          locala.kXC = ((Camera.Size)localObject).height;
          locala.kXB = ((Camera.Size)localObject).width;
        }
        w.d("MicroMsg.YuvReocrder", " rotate:" + locala.eSp + " w:" + locala.kXB + " h:" + locala.kXC);
        localParameters.setPreviewSize(this.tse.kXB, this.tse.kXC);
        d(localParameters);
        localObject = localParameters.getSupportedPreviewFrameRates();
        this.tsf.clear();
        this.tsf.addAll((Collection)localObject);
        localParameters.setPreviewFormat(17);
        localObject = localParameters.getSupportedFocusModes();
        if (localObject != null)
        {
          if ((d.ev(9)) && (true == ((List)localObject).contains("continuous-video")))
          {
            w.i("MicroMsg.YuvReocrder", "support continous-video");
            this.tsg = false;
            localParameters.setFocusMode("continuous-video");
          }
        }
        else
        {
          this.fPj.setParameters(localParameters);
          this.fPj.setPreviewDisplay(paramSurfaceHolder);
          this.fPj.startPreview();
          if ((this.aDS != null) && (this.mYb != null) && (this.tsg)) {
            this.aDS.registerListener(this, this.mYb, 2);
          }
          this.mXX = true;
          GMTrace.o(887581835264L, 6613);
          return 0;
          localObject = localParameters.getPreviewSize();
          locala.kXC = ((Camera.Size)localObject).height;
          locala.kXB = ((Camera.Size)localObject).width;
          continue;
        }
        if (((List)localObject).contains("auto")) {
          continue;
        }
        w.i("MicroMsg.YuvReocrder", "don't support auto");
        this.tsg = false;
        continue;
      }
      label714:
      if (localObject != null)
      {
        i = 0;
        k = 0;
        continue;
        label727:
        k += 1;
        continue;
        label736:
        localObject = null;
      }
    }
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    GMTrace.i(887716052992L, 6614);
    GMTrace.o(887716052992L, 6614);
  }
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    GMTrace.i(887850270720L, 6615);
    float f1 = paramSensorEvent.values[0];
    float f2 = paramSensorEvent.values[1];
    float f3 = paramSensorEvent.values[2];
    if (((Math.abs(this.mYc - f1) > 2.0F) || (Math.abs(this.mYd - f2) > 2.0F) || (Math.abs(this.mYe - f3) > 2.0F)) && (this.fPj != null) && (this.tsh) && (true == this.tsg)) {}
    try
    {
      w.d("MicroMsg.YuvReocrder", "auto focus");
      this.fPj.autoFocus(this.tsi);
      this.tsh = false;
      this.mYc = f1;
      this.mYd = f2;
      this.mYe = f3;
      GMTrace.o(887850270720L, 6615);
      return;
    }
    catch (Exception paramSensorEvent)
    {
      for (;;)
      {
        w.d("MicroMsg.YuvReocrder", "auto focus failed");
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\l\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */