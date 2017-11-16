package com.tencent.mm.sdk.platformtools;

import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;

public class aj
  extends ae
{
  private static int vic;
  private final boolean mLoop;
  private boolean mStop;
  private long viL;
  private final a viM;
  private final int vid;
  
  public aj(Looper paramLooper, a parama, boolean paramBoolean)
  {
    super(paramLooper);
    GMTrace.i(13877710422016L, 103397);
    this.viL = 0L;
    this.mStop = false;
    this.viM = parama;
    this.vid = bQm();
    this.mLoop = paramBoolean;
    if (paramLooper.getThread().getName().equals("initThread")) {
      w.e("MicroMsg.MTimerHandler", "MTimerHandler can not init handler with initThread looper, stack %s", new Object[] { bg.bQW() });
    }
    GMTrace.o(13877710422016L, 103397);
  }
  
  public aj(a parama, boolean paramBoolean)
  {
    GMTrace.i(13877576204288L, 103396);
    this.viL = 0L;
    this.mStop = false;
    this.viM = parama;
    this.vid = bQm();
    this.mLoop = paramBoolean;
    if (getLooper().getThread().getName().equals("initThread")) {
      w.e("MicroMsg.MTimerHandler", "MTimerHandler can not init handler with initThread looper, stack %s", new Object[] { bg.bQW() });
    }
    GMTrace.o(13877576204288L, 103396);
  }
  
  private static int bQm()
  {
    GMTrace.i(13877844639744L, 103398);
    if (vic >= 8192) {
      vic = 0;
    }
    int i = vic + 1;
    vic = i;
    GMTrace.o(13877844639744L, 103398);
    return i;
  }
  
  public final boolean bQn()
  {
    GMTrace.i(13878515728384L, 103403);
    if ((this.mStop) || (!hasMessages(this.vid)))
    {
      GMTrace.o(13878515728384L, 103403);
      return true;
    }
    GMTrace.o(13878515728384L, 103403);
    return false;
  }
  
  protected void finalize()
  {
    GMTrace.i(13877978857472L, 103399);
    stopTimer();
    super.finalize();
    GMTrace.o(13877978857472L, 103399);
  }
  
  public void handleMessage(Message paramMessage)
  {
    GMTrace.i(13878113075200L, 103400);
    if (paramMessage.what == this.vid)
    {
      if (this.viM == null)
      {
        GMTrace.o(13878113075200L, 103400);
        return;
      }
      if (!this.viM.pM())
      {
        GMTrace.o(13878113075200L, 103400);
        return;
      }
      if ((this.mLoop) && (!this.mStop)) {
        sendEmptyMessageDelayed(this.vid, this.viL);
      }
    }
    GMTrace.o(13878113075200L, 103400);
  }
  
  public final void stopTimer()
  {
    GMTrace.i(13878247292928L, 103401);
    removeMessages(this.vid);
    this.mStop = true;
    GMTrace.o(13878247292928L, 103401);
  }
  
  public String toString()
  {
    GMTrace.i(13878649946112L, 103404);
    if (this.viM == null)
    {
      str = "MTimerHandler(" + getClass().getName() + "){mCallBack = null}";
      GMTrace.o(13878649946112L, 103404);
      return str;
    }
    String str = "MTimerHandler(" + getClass().getName() + "){mCallBack = " + this.viM.getClass().getName() + "}";
    GMTrace.o(13878649946112L, 103404);
    return str;
  }
  
  public final void z(long paramLong1, long paramLong2)
  {
    GMTrace.i(13878381510656L, 103402);
    this.viL = paramLong2;
    stopTimer();
    this.mStop = false;
    sendEmptyMessageDelayed(this.vid, paramLong1);
    GMTrace.o(13878381510656L, 103402);
  }
  
  public static abstract interface a
  {
    public abstract boolean pM();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */