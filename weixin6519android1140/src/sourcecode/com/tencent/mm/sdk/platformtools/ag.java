package com.tencent.mm.sdk.platformtools;

import android.os.Debug;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import junit.framework.Assert;

final class ag
  extends Handler
  implements ak.a
{
  private String toStringResult;
  private Handler.Callback viA;
  a viB;
  private Looper viz;
  
  ag(Handler.Callback paramCallback, a parama)
  {
    super(paramCallback);
    GMTrace.i(13922002272256L, 103727);
    this.toStringResult = null;
    this.viz = getLooper();
    this.viA = paramCallback;
    this.viB = parama;
    GMTrace.o(13922002272256L, 103727);
  }
  
  ag(Looper paramLooper, Handler.Callback paramCallback, a parama)
  {
    super(paramLooper, paramCallback);
    GMTrace.i(13922136489984L, 103728);
    this.toStringResult = null;
    this.viz = getLooper();
    this.viA = paramCallback;
    this.viB = parama;
    GMTrace.o(13922136489984L, 103728);
  }
  
  ag(Looper paramLooper, a parama)
  {
    super(paramLooper);
    GMTrace.i(13921868054528L, 103726);
    this.toStringResult = null;
    this.viz = getLooper();
    this.viB = parama;
    GMTrace.o(13921868054528L, 103726);
  }
  
  ag(a parama)
  {
    GMTrace.i(13921733836800L, 103725);
    this.toStringResult = null;
    this.viz = getLooper();
    this.viB = parama;
    GMTrace.o(13921733836800L, 103725);
  }
  
  public final void a(Runnable paramRunnable, ak paramak)
  {
    GMTrace.i(13922807578624L, 103733);
    if (this.viB != null) {
      this.viB.onTaskRunEnd(paramRunnable, paramak);
    }
    GMTrace.o(13922807578624L, 103733);
  }
  
  public final void a(Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2, float paramFloat)
  {
    GMTrace.i(13922941796352L, 103734);
    if (this.viB != null) {
      this.viB.onLog(null, paramRunnable, paramThread, paramLong1, paramLong2, paramFloat);
    }
    GMTrace.o(13922941796352L, 103734);
  }
  
  public final void dispatchMessage(Message paramMessage)
  {
    GMTrace.i(13922404925440L, 103730);
    if ((paramMessage.getCallback() != null) || (this.viA != null))
    {
      super.dispatchMessage(paramMessage);
      GMTrace.o(13922404925440L, 103730);
      return;
    }
    long l1 = System.currentTimeMillis();
    long l2 = Debug.threadCpuTimeNanos();
    handleMessage(paramMessage);
    if (this.viB != null) {
      this.viB.onLog(paramMessage, null, this.viz.getThread(), System.currentTimeMillis() - l1, Debug.threadCpuTimeNanos() - l2, -1.0F);
    }
    GMTrace.o(13922404925440L, 103730);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    GMTrace.i(13922539143168L, 103731);
    if (this.viB != null) {
      this.viB.handleMessage(paramMessage);
    }
    GMTrace.o(13922539143168L, 103731);
  }
  
  public final boolean sendMessageAtTime(Message paramMessage, long paramLong)
  {
    GMTrace.i(13922270707712L, 103729);
    if (paramMessage != null) {}
    Runnable localRunnable;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("msg is null", bool);
      localRunnable = paramMessage.getCallback();
      if (localRunnable != null) {
        break;
      }
      bool = super.sendMessageAtTime(paramMessage, paramLong);
      GMTrace.o(13922270707712L, 103729);
      return bool;
    }
    long l = paramLong - SystemClock.uptimeMillis();
    if (paramMessage.getTarget() == null) {}
    Message localMessage;
    for (Object localObject = this;; localObject = paramMessage.getTarget())
    {
      localObject = new ak(this.viz.getThread(), (Handler)localObject, localRunnable, paramMessage.obj, this);
      if (l > 0L) {
        ((ak)localObject).viR = l;
      }
      localMessage = Message.obtain(paramMessage.getTarget(), (Runnable)localObject);
      localMessage.what = paramMessage.what;
      localMessage.arg1 = paramMessage.arg1;
      localMessage.arg2 = paramMessage.arg2;
      localMessage.obj = paramMessage.obj;
      localMessage.replyTo = paramMessage.replyTo;
      localMessage.setData(paramMessage.getData());
      paramMessage.recycle();
      if ((getLooper() == null) || (getLooper().getThread().isAlive())) {
        break;
      }
      w.w("MicroMsg.MMInnerHandler", "sendMessageAtTime but thread[%d, %s] is dead so return false!", new Object[] { Long.valueOf(getLooper().getThread().getId()), getLooper().getThread().getName() });
      GMTrace.o(13922270707712L, 103729);
      return false;
    }
    if (this.viB != null) {
      this.viB.onTaskAdded(localRunnable, (ak)localObject);
    }
    bool = super.sendMessageAtTime(localMessage, paramLong);
    if ((!bool) && (this.viB != null)) {
      this.viB.onTaskRunEnd(localRunnable, (ak)localObject);
    }
    GMTrace.o(13922270707712L, 103729);
    return bool;
  }
  
  public final String toString()
  {
    GMTrace.i(13922673360896L, 103732);
    if (this.toStringResult == null) {
      this.toStringResult = ("MMInnerHandler{listener = " + this.viB + "}");
    }
    String str = this.toStringResult;
    GMTrace.o(13922673360896L, 103732);
    return str;
  }
  
  public static abstract interface a
  {
    public abstract void handleMessage(Message paramMessage);
    
    public abstract void onLog(Message paramMessage, Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2, float paramFloat);
    
    public abstract void onTaskAdded(Runnable paramRunnable, ak paramak);
    
    public abstract void onTaskRunEnd(Runnable paramRunnable, ak paramak);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */