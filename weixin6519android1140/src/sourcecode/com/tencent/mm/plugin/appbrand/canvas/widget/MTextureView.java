package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.OnAttachStateChangeListener;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;

public class MTextureView
  extends TextureView
  implements TextureView.SurfaceTextureListener, a
{
  public final b hOg;
  private final Set<View.OnAttachStateChangeListener> hOh;
  private volatile ae hOj;
  private Runnable hOk;
  private volatile boolean hOm;
  private volatile Object mLock;
  
  public MTextureView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18864704323584L, 140553);
    this.hOg = new b(this);
    this.hOh = new LinkedHashSet();
    this.mLock = new Object();
    this.hOk = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17703720976384L, 131903);
        if (!MTextureView.this.isAvailable())
        {
          GMTrace.o(17703720976384L, 131903);
          return;
        }
        Canvas localCanvas = MTextureView.this.lockCanvas();
        if (localCanvas == null)
        {
          GMTrace.o(17703720976384L, 131903);
          return;
        }
        synchronized (MTextureView.a(MTextureView.this))
        {
          MTextureView.a(MTextureView.this, true);
          localCanvas.drawColor(-1);
          MTextureView.this.d(localCanvas);
          MTextureView.this.unlockCanvasAndPost(localCanvas);
        }
        synchronized (MTextureView.a(MTextureView.this))
        {
          MTextureView.a(MTextureView.this, false);
          MTextureView.a(MTextureView.this).notifyAll();
          GMTrace.o(17703720976384L, 131903);
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
      }
    };
    init();
    GMTrace.o(18864704323584L, 140553);
  }
  
  public MTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17701841928192L, 131889);
    this.hOg = new b(this);
    this.hOh = new LinkedHashSet();
    this.mLock = new Object();
    this.hOk = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17703720976384L, 131903);
        if (!MTextureView.this.isAvailable())
        {
          GMTrace.o(17703720976384L, 131903);
          return;
        }
        Canvas localCanvas = MTextureView.this.lockCanvas();
        if (localCanvas == null)
        {
          GMTrace.o(17703720976384L, 131903);
          return;
        }
        synchronized (MTextureView.a(MTextureView.this))
        {
          MTextureView.a(MTextureView.this, true);
          localCanvas.drawColor(-1);
          MTextureView.this.d(localCanvas);
          MTextureView.this.unlockCanvasAndPost(localCanvas);
        }
        synchronized (MTextureView.a(MTextureView.this))
        {
          MTextureView.a(MTextureView.this, false);
          MTextureView.a(MTextureView.this).notifyAll();
          GMTrace.o(17703720976384L, 131903);
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
      }
    };
    init();
    GMTrace.o(17701841928192L, 131889);
  }
  
  public MTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17701976145920L, 131890);
    this.hOg = new b(this);
    this.hOh = new LinkedHashSet();
    this.mLock = new Object();
    this.hOk = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17703720976384L, 131903);
        if (!MTextureView.this.isAvailable())
        {
          GMTrace.o(17703720976384L, 131903);
          return;
        }
        Canvas localCanvas = MTextureView.this.lockCanvas();
        if (localCanvas == null)
        {
          GMTrace.o(17703720976384L, 131903);
          return;
        }
        synchronized (MTextureView.a(MTextureView.this))
        {
          MTextureView.a(MTextureView.this, true);
          localCanvas.drawColor(-1);
          MTextureView.this.d(localCanvas);
          MTextureView.this.unlockCanvasAndPost(localCanvas);
        }
        synchronized (MTextureView.a(MTextureView.this))
        {
          MTextureView.a(MTextureView.this, false);
          MTextureView.a(MTextureView.this).notifyAll();
          GMTrace.o(17703720976384L, 131903);
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
      }
    };
    init();
    GMTrace.o(17701976145920L, 131890);
  }
  
  private void init()
  {
    GMTrace.i(17702110363648L, 131891);
    setSurfaceTextureListener(this);
    ((Activity)getContext()).getWindow().setFlags(16777216, 16777216);
    Paint localPaint = new Paint();
    localPaint.setColor(-1);
    this.hOg.hNw.hNR = localPaint;
    GMTrace.o(17702110363648L, 131891);
  }
  
  public final void TM()
  {
    GMTrace.i(18864838541312L, 140554);
    if (this.hOj == null)
    {
      GMTrace.o(18864838541312L, 140554);
      return;
    }
    this.hOj.removeCallbacks(this.hOk);
    this.hOj.post(this.hOk);
    GMTrace.o(18864838541312L, 140554);
  }
  
  public final void TN()
  {
    GMTrace.i(18865509629952L, 140559);
    this.hOg.TN();
    GMTrace.o(18865509629952L, 140559);
  }
  
  public final int TO()
  {
    GMTrace.i(18968723062784L, 141328);
    GMTrace.o(18968723062784L, 141328);
    return 682;
  }
  
  public final int TP()
  {
    GMTrace.i(18968857280512L, 141329);
    GMTrace.o(18968857280512L, 141329);
    return 683;
  }
  
  public final void TQ()
  {
    GMTrace.i(18866717589504L, 140568);
    this.hOg.TQ();
    GMTrace.o(18866717589504L, 140568);
  }
  
  public final void a(JSONArray paramJSONArray, a.a parama)
  {
    GMTrace.i(20784420487168L, 154856);
    this.hOg.a(paramJSONArray, parama);
    GMTrace.o(20784420487168L, 154856);
  }
  
  public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    GMTrace.i(18865778065408L, 140561);
    if (this.hOh.contains(paramOnAttachStateChangeListener))
    {
      GMTrace.o(18865778065408L, 140561);
      return;
    }
    this.hOh.add(paramOnAttachStateChangeListener);
    super.addOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    GMTrace.o(18865778065408L, 140561);
  }
  
  public final void b(JSONArray paramJSONArray, a.a parama)
  {
    GMTrace.i(20784554704896L, 154857);
    this.hOg.b(paramJSONArray, parama);
    GMTrace.o(20784554704896L, 154857);
  }
  
  public final boolean d(Canvas paramCanvas)
  {
    GMTrace.i(18865106976768L, 140556);
    boolean bool = this.hOg.d(paramCanvas);
    GMTrace.o(18865106976768L, 140556);
    return bool;
  }
  
  public final int getType()
  {
    GMTrace.i(20001394262016L, 149022);
    GMTrace.o(20001394262016L, 149022);
    return 1;
  }
  
  public final void i(Runnable paramRunnable)
  {
    GMTrace.i(18864972759040L, 140555);
    if (this.hOj == null)
    {
      GMTrace.o(18864972759040L, 140555);
      return;
    }
    this.hOj.post(paramRunnable);
    GMTrace.o(18864972759040L, 140555);
  }
  
  public final boolean isPaused()
  {
    GMTrace.i(18866314936320L, 140565);
    boolean bool = this.hOg.hNA;
    GMTrace.o(18866314936320L, 140565);
    return bool;
  }
  
  public final void oI(String paramString)
  {
    GMTrace.i(18865643847680L, 140560);
    this.hOg.oI(paramString);
    GMTrace.o(18865643847680L, 140560);
  }
  
  public final void oJ(String paramString)
  {
    GMTrace.i(18866449154048L, 140566);
    this.hOg.hNz = paramString;
    GMTrace.o(18866449154048L, 140566);
  }
  
  public final void onPause()
  {
    GMTrace.i(18866046500864L, 140563);
    this.hOg.onPause();
    GMTrace.o(18866046500864L, 140563);
  }
  
  public final void onResume()
  {
    GMTrace.i(18866180718592L, 140564);
    this.hOg.onResume();
    GMTrace.o(18866180718592L, 140564);
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(18866851807232L, 140569);
    w.v("MicroMsg.MTextureView", "onSurfaceTextureAvailable");
    if (this.hOj == null)
    {
      paramSurfaceTexture = e.cK("MTextureView#Rending-Thread", -19);
      paramSurfaceTexture.start();
      this.hOj = new ae(paramSurfaceTexture.getLooper());
    }
    paramSurfaceTexture = lockCanvas();
    if (paramSurfaceTexture == null)
    {
      GMTrace.o(18866851807232L, 140569);
      return;
    }
    paramSurfaceTexture.drawColor(-1);
    unlockCanvasAndPost(paramSurfaceTexture);
    GMTrace.o(18866851807232L, 140569);
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture arg1)
  {
    GMTrace.i(18867120242688L, 140571);
    w.v("MicroMsg.MTextureView", "onSurfaceTextureDestroyed");
    this.hOj.removeCallbacks(this.hOk);
    this.hOj.getLooper().quit();
    synchronized (this.mLock)
    {
      boolean bool = this.hOm;
      if (bool) {}
      try
      {
        this.mLock.wait(1000L);
        this.hOj = null;
        GMTrace.o(18867120242688L, 140571);
        return true;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          w.e("MicroMsg.MTextureView", "await error : %s", new Object[] { Log.getStackTraceString(localInterruptedException) });
        }
      }
    }
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(18866986024960L, 140570);
    w.v("MicroMsg.MTextureView", "onSurfaceTextureSizeChanged");
    GMTrace.o(18866986024960L, 140570);
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(18867254460416L, 140572);
    GMTrace.o(18867254460416L, 140572);
  }
  
  public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    GMTrace.i(18865912283136L, 140562);
    this.hOh.remove(paramOnAttachStateChangeListener);
    super.removeOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    GMTrace.o(18865912283136L, 140562);
  }
  
  public final void setStartTime(long paramLong)
  {
    GMTrace.i(18866583371776L, 140567);
    this.hOg.hND = paramLong;
    GMTrace.o(18866583371776L, 140567);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\widget\MTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */