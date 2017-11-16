package com.tencent.xweb.xwalk;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.webkit.ValueCallback;
import com.tencent.xweb.a.d;
import java.nio.ByteBuffer;
import org.xwalk.core.XWalkV8;

public final class f
  implements d
{
  XWalkV8 ypv;
  public HandlerThread ypw = new HandlerThread("j2v8");
  private Handler ypx;
  
  public f()
  {
    this.ypw.start();
    this.ypx = new Handler(this.ypw.getLooper());
  }
  
  public final int Yg()
  {
    return 0;
  }
  
  public final void a(int paramInt, ByteBuffer paramByteBuffer) {}
  
  public final void addJavascriptInterface(final Object paramObject, final String paramString)
  {
    this.ypx.post(new Runnable()
    {
      public final void run()
      {
        if (f.this.ypv == null) {
          return;
        }
        f.this.ypv.addJavascriptInterface(paramObject, paramString);
      }
    });
  }
  
  public final void cleanup()
  {
    this.ypx.post(new Runnable()
    {
      public final void run()
      {
        if (f.this.ypv == null) {
          return;
        }
        f.this.ypv.cleanup();
        f.this.ypv = null;
        f.this.ypw.getLooper().quit();
        f.this.ypw = null;
      }
    });
  }
  
  public final void evaluateJavascript(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    this.ypx.post(new Runnable()
    {
      public final void run()
      {
        if (f.this.ypv == null) {
          return;
        }
        f.this.ypv.evaluateJavascript(paramString, paramValueCallback);
      }
    });
  }
  
  public final ByteBuffer iT(int paramInt)
  {
    return null;
  }
  
  public final void init(final int paramInt)
  {
    this.ypx.post(new Runnable()
    {
      public final void run()
      {
        if (f.this.ypv != null) {
          return;
        }
        f.this.ypv = new XWalkV8();
        f.this.ypv.init(paramInt);
      }
    });
  }
  
  public final void pause() {}
  
  public final void resume() {}
  
  public final boolean wp()
  {
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\xwalk\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */