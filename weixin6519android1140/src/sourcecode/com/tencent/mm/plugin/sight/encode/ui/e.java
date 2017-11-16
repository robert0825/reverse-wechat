package com.tencent.mm.plugin.sight.encode.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

final class e
  implements SensorEventListener
{
  private static int mXZ;
  Camera fPj;
  private Context mContext;
  boolean mXV;
  boolean mXX;
  private int mXY;
  private boolean mYA;
  private float mYc;
  private float mYd;
  private float mYe;
  com.tencent.mm.pluginsdk.l.a oWa;
  public Camera.PreviewCallback oWb;
  a oWc;
  
  static
  {
    GMTrace.i(9338064207872L, 69574);
    mXZ = Integer.MAX_VALUE;
    GMTrace.o(9338064207872L, 69574);
  }
  
  public e()
  {
    GMTrace.i(9336050941952L, 69559);
    this.mXV = false;
    this.fPj = null;
    this.mXX = false;
    this.mXY = 0;
    this.mYc = 0.0F;
    this.mYd = 0.0F;
    this.mYe = 0.0F;
    this.oWb = null;
    this.mContext = null;
    this.mYA = false;
    this.oWc = new a(Looper.getMainLooper());
    this.oWa = com.tencent.mm.pluginsdk.l.a.bKv();
    GMTrace.o(9336050941952L, 69559);
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    GMTrace.i(9337258901504L, 69568);
    GMTrace.o(9337258901504L, 69568);
  }
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    GMTrace.i(9337393119232L, 69569);
    float f1 = paramSensorEvent.values[0];
    float f2 = paramSensorEvent.values[1];
    float f3 = paramSensorEvent.values[2];
    if ((Math.abs(this.mYc - f1) > 3.0F) || (Math.abs(this.mYd - f2) > 3.0F) || (Math.abs(this.mYe - f3) > 3.0F))
    {
      w.i("MicroMsg.SightCamera", "match accel limit %f, try auto focus", new Object[] { Float.valueOf(3.0F) });
      a.f(this.fPj);
      this.mYc = f1;
      this.mYd = f2;
      this.mYe = f3;
    }
    GMTrace.o(9337393119232L, 69569);
  }
  
  private static final class a
    extends ae
  {
    static boolean mYB;
    static Camera.AutoFocusCallback mYC;
    boolean mXV;
    int mYK;
    boolean mYL;
    boolean mYM;
    float mYN;
    int mYO;
    int mYP;
    float mps;
    
    static
    {
      GMTrace.i(9315247194112L, 69404);
      mYB = true;
      mYC = new Camera.AutoFocusCallback()
      {
        public final void onAutoFocus(boolean paramAnonymousBoolean, Camera paramAnonymousCamera)
        {
          GMTrace.i(9310818009088L, 69371);
          w.v("MicroMsg.SightCamera", "auto focus callback");
          e.a.mYB = true;
          GMTrace.o(9310818009088L, 69371);
        }
      };
      GMTrace.o(9315247194112L, 69404);
    }
    
    public a(Looper paramLooper)
    {
      super();
      GMTrace.i(9314710323200L, 69400);
      this.mYK = 0;
      this.mXV = false;
      this.mYL = false;
      this.mYM = false;
      GMTrace.o(9314710323200L, 69400);
    }
    
    private static Rect a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2)
    {
      GMTrace.i(9314307670016L, 69397);
      int i = Float.valueOf(com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 72) * paramFloat3).intValue();
      Object localObject = new RectF();
      ((RectF)localObject).set((paramFloat1 - i / 2) * 2000.0F / paramInt1 - 1000.0F, (paramFloat2 - i / 2) * 2000.0F / paramInt2 - 1000.0F, (i / 2 + paramFloat1) * 2000.0F / paramInt1 - 1000.0F, (i / 2 + paramFloat2) * 2000.0F / paramInt2 - 1000.0F);
      localObject = new Rect(qI(Math.round(((RectF)localObject).left)), qI(Math.round(((RectF)localObject).top)), qI(Math.round(((RectF)localObject).right)), qI(Math.round(((RectF)localObject).bottom)));
      GMTrace.o(9314307670016L, 69397);
      return (Rect)localObject;
    }
    
    private static int b(Camera.Parameters paramParameters)
    {
      GMTrace.i(9314844540928L, 69401);
      if (paramParameters == null)
      {
        GMTrace.o(9314844540928L, 69401);
        return 0;
      }
      try
      {
        int j = paramParameters.getMaxZoom() / 2;
        i = j;
        if (j <= 0) {
          i = paramParameters.getMaxZoom();
        }
      }
      catch (Exception paramParameters)
      {
        for (;;)
        {
          w.e("MicroMsg.SightCamera", "get target zoom value error: %s", new Object[] { paramParameters.getMessage() });
          int i = 0;
        }
      }
      GMTrace.o(9314844540928L, 69401);
      return i;
    }
    
    static int c(Camera.Parameters paramParameters)
    {
      GMTrace.i(9314978758656L, 69402);
      int j = b(paramParameters) / 6;
      int i = j;
      if (j <= 0) {
        i = 1;
      }
      GMTrace.o(9314978758656L, 69402);
      return i;
    }
    
    static void f(Camera paramCamera)
    {
      GMTrace.i(9314576105472L, 69399);
      if (paramCamera == null) {
        w.w("MicroMsg.SightCamera", "want to auto focus, but camera is null, do nothing");
      }
      if (!mYB)
      {
        w.w("MicroMsg.SightCamera", "auto focus not back");
        GMTrace.o(9314576105472L, 69399);
        return;
      }
      mYB = false;
      try
      {
        paramCamera.autoFocus(mYC);
        GMTrace.o(9314576105472L, 69399);
        return;
      }
      catch (Exception paramCamera)
      {
        w.w("MicroMsg.SightCamera", "autofocus fail, exception %s", new Object[] { paramCamera.getMessage() });
        mYB = true;
        GMTrace.o(9314576105472L, 69399);
      }
    }
    
    private static int qI(int paramInt)
    {
      GMTrace.i(9314441887744L, 69398);
      if (paramInt > 1000)
      {
        GMTrace.o(9314441887744L, 69398);
        return 1000;
      }
      if (paramInt < 64536)
      {
        GMTrace.o(9314441887744L, 69398);
        return 64536;
      }
      GMTrace.o(9314441887744L, 69398);
      return paramInt;
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(9315112976384L, 69403);
      switch (paramMessage.what)
      {
      }
      for (;;)
      {
        GMTrace.o(9315112976384L, 69403);
        return;
        paramMessage = (Camera)paramMessage.obj;
        if ((this.mYO == 0) || (this.mYO == 0) || (d.eu(14)))
        {
          f(paramMessage);
          GMTrace.o(9315112976384L, 69403);
          return;
        }
        float f1 = this.mYN;
        float f2 = this.mps;
        int i = this.mYO;
        int j = this.mYP;
        if (paramMessage == null) {
          w.w("MicroMsg.SightCamera", "want to auto focus, but camera is null, do nothing");
        }
        if (!mYB)
        {
          w.w("MicroMsg.SightCamera", "auto focus not back");
          GMTrace.o(9315112976384L, 69403);
          return;
        }
        mYB = false;
        Object localObject2;
        try
        {
          w.i("MicroMsg.SightCamera", "ashutest:: touch %f %f, display %d %d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(j) });
          localObject2 = a(f1, f2, 1.0F, i, j);
          localObject1 = a(f1, f2, 1.5F, i, j);
          w.i("MicroMsg.SightCamera", "ashutest:: focus rect %s, meter rect %s", new Object[] { localObject2, localObject1 });
          localParameters = paramMessage.getParameters();
          Object localObject3 = localParameters.getSupportedFocusModes();
          if ((localObject3 != null) && (((List)localObject3).contains("auto"))) {
            localParameters.setFocusMode("auto");
          }
          if (localParameters.getMaxNumFocusAreas() > 0)
          {
            localObject3 = new ArrayList(1);
            ((ArrayList)localObject3).add(new Camera.Area((Rect)localObject2, 1000));
            localParameters.setFocusAreas((List)localObject3);
          }
          if (localParameters.getMaxNumMeteringAreas() > 0)
          {
            localObject2 = new ArrayList(1);
            ((ArrayList)localObject2).add(new Camera.Area((Rect)localObject1, 1000));
            localParameters.setMeteringAreas((List)localObject2);
          }
          paramMessage.setParameters(localParameters);
          paramMessage.autoFocus(mYC);
          GMTrace.o(9315112976384L, 69403);
          return;
        }
        catch (Exception paramMessage)
        {
          w.w("MicroMsg.SightCamera", "autofocus with area fail, exception %s", new Object[] { paramMessage.getMessage() });
          mYB = true;
          GMTrace.o(9315112976384L, 69403);
          return;
        }
        if (this.mYM)
        {
          GMTrace.o(9315112976384L, 69403);
          return;
        }
        Object localObject1 = (Camera)paramMessage.obj;
        Camera.Parameters localParameters = ((Camera)localObject1).getParameters();
        w.i("MicroMsg.SightCamera", "zoomed %s curZoomStep %s params.getZoom() %s", new Object[] { Boolean.valueOf(this.mXV), Integer.valueOf(this.mYK), Integer.valueOf(localParameters.getZoom()) });
        i = localParameters.getZoom() + this.mYK;
        if (this.mXV)
        {
          int k = b(localParameters);
          if (i >= k)
          {
            j = 1;
            i = k;
            label527:
            localParameters.setZoom(i);
          }
        }
        try
        {
          ((Camera)localObject1).setParameters(localParameters);
          if (j == 0) {
            continue;
          }
          this.mYO = 0;
          this.mYP = 0;
          sendMessageDelayed(obtainMessage(4354, paramMessage.obj), 20L);
          continue;
          localObject2 = obtainMessage(4353, paramMessage.obj);
          if (this.mYL) {}
          for (long l = 10L;; l = 20L)
          {
            sendMessageDelayed((Message)localObject2, l);
            j = 0;
            break;
          }
          if (i <= 0)
          {
            i = 0;
            j = 1;
            break label527;
          }
          localObject2 = obtainMessage(4353, paramMessage.obj);
          if (this.mYL) {}
          for (l = 10L;; l = 20L)
          {
            sendMessageDelayed((Message)localObject2, l);
            j = 0;
            break;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.SightCamera", localException, "", new Object[0]);
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\encode\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */