package com.tencent.mm.e.b;

import android.media.AudioRecord;
import android.media.AudioRecord.OnRecordPositionUpdateListener;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Arrays;

public final class d
  extends f
{
  public boolean exC;
  public AudioRecord exQ;
  public c.a exR;
  public byte[] eya;
  private int eyb;
  public int eyc;
  private AudioRecord.OnRecordPositionUpdateListener eyd;
  private HandlerThread mHandlerThread;
  public boolean mIsMute;
  
  public d(AudioRecord paramAudioRecord, c.a parama, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(4483945857024L, 33408);
    this.mHandlerThread = null;
    this.eya = null;
    this.eyd = new AudioRecord.OnRecordPositionUpdateListener()
    {
      public final void onMarkerReached(AudioRecord paramAnonymousAudioRecord)
      {
        GMTrace.i(4479785107456L, 33377);
        GMTrace.o(4479785107456L, 33377);
      }
      
      public final void onPeriodicNotification(AudioRecord paramAnonymousAudioRecord)
      {
        GMTrace.i(4479919325184L, 33378);
        if (d.this.mIsPause)
        {
          GMTrace.o(4479919325184L, 33378);
          return;
        }
        if (d.this.exQ != null)
        {
          if ((d.this.exC) || (d.this.eya == null)) {
            d.this.eya = new byte[d.this.eyc];
          }
          int j = d.this.exQ.read(d.this.eya, 0, d.this.eyc);
          w.d("MicroMsg.RecordModeAsyncCallback", "OnRecordPositionUpdateListener, read ret: " + j);
          if (d.this.exY != null) {
            d.this.exY.c(j, d.this.eya);
          }
          int i = j;
          if (j > d.this.eya.length) {
            i = d.this.eya.length;
          }
          if ((d.this.mIsMute) && (i > 0)) {
            Arrays.fill(d.this.eya, 0, i, (byte)0);
          }
          if ((d.this.exR != null) && (i > 0)) {
            d.this.exR.d(d.this.eya, i);
          }
        }
        GMTrace.o(4479919325184L, 33378);
      }
    };
    this.exQ = paramAudioRecord;
    this.exR = parama;
    this.exC = paramBoolean;
    this.eyb = paramInt1;
    this.eyc = paramInt2;
    GMTrace.o(4483945857024L, 33408);
  }
  
  public final void aC(boolean paramBoolean)
  {
    GMTrace.i(4484348510208L, 33411);
    this.mIsMute = paramBoolean;
    GMTrace.o(4484348510208L, 33411);
  }
  
  public final void pL()
  {
    GMTrace.i(4484214292480L, 33410);
    this.exQ.setRecordPositionUpdateListener(null);
    this.exQ = null;
    this.mHandlerThread.quit();
    this.mHandlerThread = null;
    GMTrace.o(4484214292480L, 33410);
  }
  
  public final boolean qw()
  {
    GMTrace.i(4484080074752L, 33409);
    if (this.mHandlerThread != null)
    {
      w.e("MicroMsg.RecordModeAsyncCallback", "alreay started record");
      GMTrace.o(4484080074752L, 33409);
      return false;
    }
    this.mHandlerThread = e.cK("RecordModeAsyncCallback_handlerThread", 10);
    this.mHandlerThread.start();
    this.exQ.setRecordPositionUpdateListener(this.eyd, ae.fetchFreeHandler(this.mHandlerThread.getLooper()));
    this.exQ.setPositionNotificationPeriod(this.eyb);
    if ((this.exC) || (this.eya == null)) {
      this.eya = new byte[this.eyc];
    }
    int i = this.exQ.read(this.eya, 0, this.eyc);
    w.d("MicroMsg.RecordModeAsyncCallback", "startRecord, read ret: " + i);
    if ((this.exR != null) && (i > 0)) {
      this.exR.d(this.eya, i);
    }
    GMTrace.o(4484080074752L, 33409);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\e\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */