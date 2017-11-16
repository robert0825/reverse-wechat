package com.tencent.mm.pluginsdk.l;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.hardware.SensorManager;
import android.media.MediaRecorder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.a.a.a;
import com.tencent.mm.compatible.d.c;
import com.tencent.mm.compatible.d.c.a.a;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.u;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class b
{
  public Context context;
  public int fileSize;
  public String filename;
  public int haG;
  private boolean mXV;
  public MediaRecorder naM;
  public a oWa;
  public f trU;
  public int trV;
  private final int trW;
  private a trX;
  
  public b()
  {
    GMTrace.i(889595101184L, 6628);
    this.trV = 0;
    this.trW = 5;
    this.mXV = false;
    this.trX = new a(Looper.getMainLooper());
    GMTrace.o(889595101184L, 6628);
  }
  
  @TargetApi(9)
  private void setOrientationHint(final int paramInt)
  {
    GMTrace.i(889863536640L, 6630);
    com.tencent.mm.compatible.a.a.a(9, new a.a()
    {
      public final void run()
      {
        GMTrace.i(889326665728L, 6626);
        if (b.this.naM != null) {
          b.this.naM.setOrientationHint(paramInt);
        }
        GMTrace.o(889326665728L, 6626);
      }
    });
    GMTrace.o(889863536640L, 6630);
  }
  
  public final int a(Activity paramActivity, boolean paramBoolean)
  {
    GMTrace.i(889997754368L, 6631);
    this.context = paramActivity;
    f localf = this.trU;
    a locala = this.oWa;
    int i;
    if (locala == null) {
      i = 0 - g.tA();
    }
    while (i != 0)
    {
      GMTrace.o(889997754368L, 6631);
      return i;
      localf.tse = locala;
      if ((localf.aDS == null) && (localf.mYb == null))
      {
        localf.aDS = ((SensorManager)paramActivity.getSystemService("sensor"));
        localf.mYb = localf.aDS.getDefaultSensor(1);
      }
      if ((paramBoolean) || (localf.fPj == null))
      {
        localf.aOV();
        if (paramBoolean) {
          f.mXY = (f.mXY ^ 0xFFFFFFFF) & 0x1;
        }
        localf.mYa = c.o(paramActivity, f.mXY);
        if (localf.mYa == null)
        {
          w.e("MicroMsg.YuvReocrder", "start camera FAILED!");
          i = 0 - g.tA();
          continue;
        }
        localf.fPj = localf.mYa.fPj;
        localf.tse.eSp = localf.mYa.eSp;
        if (localf.fPj == null)
        {
          w.e("MicroMsg.YuvReocrder", "start camera FAILED!");
          i = 0 - g.tA();
          continue;
        }
      }
      i = 0;
    }
    GMTrace.o(889997754368L, 6631);
    return 0;
  }
  
  @SuppressLint({"NewApi"})
  public final void a(Surface paramSurface, int paramInt1, int paramInt2)
  {
    GMTrace.i(889729318912L, 6629);
    for (;;)
    {
      if (this.trU == null)
      {
        w.e("MicroMsg.SceneVideo", "yuvRecoder is null");
        GMTrace.o(889729318912L, 6629);
        return;
      }
      Camera localCamera = this.trU.fPj;
      if ((paramSurface == null) || (localCamera == null))
      {
        w.e("MicroMsg.SceneVideo", "holder or cam is null ");
        GMTrace.o(889729318912L, 6629);
        return;
      }
      int i;
      int j;
      if (p.fQL.fPI == -1)
      {
        i = paramInt1;
        j = f.bKB();
      }
      try
      {
        localCamera.unlock();
        this.naM = new MediaRecorder();
        this.naM.setCamera(localCamera);
        this.naM.setAudioSource(5);
        this.naM.setVideoSource(1);
        this.naM.setOutputFormat(2);
        this.naM.setVideoSize(this.oWa.kXB, this.oWa.kXC);
        this.naM.setVideoEncoder(2);
        this.naM.setAudioEncoder(3);
        if (Build.VERSION.SDK_INT > 7) {
          this.naM.setVideoEncodingBitRate(this.oWa.mZt);
        }
      }
      catch (Exception localException1)
      {
        try
        {
          if (p.fQE.fRe)
          {
            this.naM.setVideoFrameRate(p.fQE.fRf);
            this.naM.setOutputFile(this.oWa.mZC);
            this.naM.setPreviewDisplay(paramSurface);
            w.d("MicroMsg.SceneVideo", "doStart camid[%s] params:\n%s", new Object[] { Integer.valueOf(j), this.oWa.toString() });
            if (j != 0) {
              break label404;
            }
            if (p.fQL.fPC != -1) {
              break label393;
            }
            i = 90;
            setOrientationHint(i);
          }
        }
        catch (Exception localException1)
        {
          try
          {
            for (;;)
            {
              this.naM.prepare();
              this.naM.start();
              GMTrace.o(889729318912L, 6629);
              return;
              i = p.fQL.fPI;
              break;
              localException3 = localException3;
              w.w("MicroMsg.SceneVideo", "exception in cam.unlock() [%s]", new Object[] { localException3.getMessage() });
              continue;
              this.naM.setVideoFrameRate(i);
              continue;
              localException1 = localException1;
              w.d("MicroMsg.SceneVideo", "try set fps failed: " + i);
              continue;
              label393:
              i = p.fQL.fPC;
            }
            label404:
            if (p.fQL.fPD == -1) {}
            for (i = 270;; i = p.fQL.fPD)
            {
              setOrientationHint(i);
              break;
            }
          }
          catch (Exception localException2)
          {
            w.w("MicroMsg.SceneVideo", "exception in mediaRecorder[%s] doStartCount[%s]", new Object[] { localException2.getMessage(), Integer.valueOf(this.trV) });
            w.printErrStackTrace("MicroMsg.SceneVideo", localException2, "", new Object[0]);
            this.trV += 1;
            if (this.trV < 5)
            {
              f localf = this.trU;
              if ((paramInt2 >= 0) && (paramInt2 < localf.tsf.size()))
              {
                w.d("MicroMsg.YuvReocrder", "ret fr " + localf.tsf.get(paramInt2));
                paramInt1 = ((Integer)localf.tsf.get(paramInt2)).intValue();
              }
              for (;;)
              {
                paramInt2 += 1;
                break;
                w.d("MicroMsg.YuvReocrder", "ret fr " + paramInt1);
              }
            }
            GMTrace.o(889729318912L, 6629);
          }
        }
      }
    }
  }
  
  public final int b(SurfaceHolder paramSurfaceHolder)
  {
    GMTrace.i(890266189824L, 6633);
    int i = this.trU.b(paramSurfaceHolder);
    GMTrace.o(890266189824L, 6633);
    return i;
  }
  
  public final int bKw()
  {
    GMTrace.i(890131972096L, 6632);
    this.trU.aOV();
    GMTrace.o(890131972096L, 6632);
    return 0;
  }
  
  public final int getPreviewHeight()
  {
    GMTrace.i(890534625280L, 6635);
    if (this.trU.fPj == null)
    {
      GMTrace.o(890534625280L, 6635);
      return 0;
    }
    int i = this.trU.fPj.getParameters().getPreviewSize().height;
    GMTrace.o(890534625280L, 6635);
    return i;
  }
  
  public final int getPreviewWidth()
  {
    GMTrace.i(890400407552L, 6634);
    if (this.trU.fPj == null)
    {
      GMTrace.o(890400407552L, 6634);
      return 0;
    }
    int i = this.trU.fPj.getParameters().getPreviewSize().width;
    GMTrace.o(890400407552L, 6634);
    return i;
  }
  
  private static final class a
    extends Handler
  {
    int hZC;
    boolean mXV;
    
    public a(Looper paramLooper)
    {
      super();
      GMTrace.i(892682108928L, 6651);
      this.hZC = 0;
      this.mXV = false;
      GMTrace.o(892682108928L, 6651);
    }
    
    @TargetApi(8)
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(892816326656L, 6652);
      Camera localCamera = (Camera)paramMessage.obj;
      Camera.Parameters localParameters = localCamera.getParameters();
      int i = localParameters.getZoom() + this.hZC;
      if (this.mXV) {
        if (i >= localParameters.getMaxZoom() / 2) {
          i = localParameters.getMaxZoom() / 2;
        }
      }
      for (;;)
      {
        localParameters.setZoom(i);
        localCamera.setParameters(localParameters);
        GMTrace.o(892816326656L, 6652);
        return;
        sendMessageDelayed(Message.obtain(this, 4353, 0, 0, paramMessage.obj), 20L);
        continue;
        if (i <= 0) {
          i = 0;
        } else {
          sendMessageDelayed(Message.obtain(this, 4353, 0, 0, paramMessage.obj), 20L);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\l\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */