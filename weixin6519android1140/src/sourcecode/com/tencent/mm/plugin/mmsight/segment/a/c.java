package com.tencent.mm.plugin.mmsight.segment.a;

import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;

public final class c
  implements a
{
  private aj gOu;
  public a nfX;
  public int ngn;
  public int ngo;
  private a ngu;
  private HandlerThread ngv;
  public a.c ngw;
  public boolean ngx;
  private a.c ngy;
  private aj.a ngz;
  
  public c()
  {
    GMTrace.i(7461029281792L, 55589);
    this.ngv = e.cK("check auto job", 10);
    this.ngw = null;
    this.ngy = new a.c()
    {
      public final void bg(Object paramAnonymousObject)
      {
        GMTrace.i(7466666426368L, 55631);
        if (c.this.ngw != null) {
          c.this.ngw.bg(paramAnonymousObject);
        }
        GMTrace.o(7466666426368L, 55631);
      }
    };
    this.ngz = new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(7458344927232L, 55569);
        if (c.this.ngx)
        {
          GMTrace.o(7458344927232L, 55569);
          return false;
        }
        try
        {
          boolean bool = c.this.isPlaying();
          if (!bool)
          {
            GMTrace.o(7458344927232L, 55569);
            return true;
          }
          int i = c.this.getCurrentPosition();
          if (c.this.nfX != null) {
            c.this.nfX.qT(i);
          }
          w.d("MicroMsg.SectionRepeatMediaPlayer", "position[%d] repeat[%d, %d] duration[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(c.this.ngn), Integer.valueOf(c.this.ngo), Integer.valueOf(c.this.getDuration()) });
          int j = c.this.ngo;
          if (i < j)
          {
            GMTrace.o(7458344927232L, 55569);
            return true;
          }
          w.i("MicroMsg.SectionRepeatMediaPlayer", "reach repeat end time, seek to %s", new Object[] { Integer.valueOf(c.this.ngo) });
          c.this.seekTo(c.this.ngn);
          GMTrace.o(7458344927232L, 55569);
          return false;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          w.e("MicroMsg.SectionRepeatMediaPlayer", "MediaPlayer may be released. %s", new Object[] { localIllegalStateException.getMessage() });
          if (!c.this.ngx)
          {
            GMTrace.o(7458344927232L, 55569);
            return true;
          }
          GMTrace.o(7458344927232L, 55569);
        }
        return false;
      }
    };
    int i = CaptureMMProxy.getInstance().getInt(w.a.vvE, -1);
    if (i == 1)
    {
      w.i("MicroMsg.SectionRepeatMediaPlayer", "used system media player");
      this.ngu = new d();
    }
    for (;;)
    {
      this.ngv.start();
      this.gOu = new aj(this.ngv.getLooper(), this.ngz, true);
      GMTrace.o(7461029281792L, 55589);
      return;
      if (i == 2)
      {
        w.i("MicroMsg.SectionRepeatMediaPlayer", "used mm video player");
        this.ngu = new b();
      }
      else if (CaptureMMProxy.getInstance().checkUseMMVideoPlayer())
      {
        w.i("MicroMsg.SectionRepeatMediaPlayer", "default used mm video player");
        this.ngu = new b();
      }
      else
      {
        w.i("MicroMsg.SectionRepeatMediaPlayer", "default used system media player");
        this.ngu = new d();
      }
    }
  }
  
  public final void a(a.a parama)
  {
    GMTrace.i(7463176765440L, 55605);
    this.ngu.a(parama);
    GMTrace.o(7463176765440L, 55605);
  }
  
  public final void a(a.b paramb)
  {
    GMTrace.i(7463445200896L, 55607);
    this.ngu.a(paramb);
    GMTrace.o(7463445200896L, 55607);
  }
  
  public final void a(a.c paramc)
  {
    GMTrace.i(7461968805888L, 55596);
    this.ngu.a(paramc);
    GMTrace.o(7461968805888L, 55596);
  }
  
  public final void a(a.d paramd)
  {
    GMTrace.i(7463310983168L, 55606);
    this.ngu.a(paramd);
    GMTrace.o(7463310983168L, 55606);
  }
  
  public final int getCurrentPosition()
  {
    GMTrace.i(7462237241344L, 55598);
    int i = this.ngu.getCurrentPosition();
    GMTrace.o(7462237241344L, 55598);
    return i;
  }
  
  public final int getDuration()
  {
    GMTrace.i(7462371459072L, 55599);
    if (this.ngu != null)
    {
      int i = this.ngu.getDuration();
      GMTrace.o(7462371459072L, 55599);
      return i;
    }
    GMTrace.o(7462371459072L, 55599);
    return 0;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(7462639894528L, 55601);
    boolean bool = this.ngu.isPlaying();
    GMTrace.o(7462639894528L, 55601);
    return bool;
  }
  
  public final void pause()
  {
    GMTrace.i(7461700370432L, 55594);
    this.ngu.pause();
    this.gOu.stopTimer();
    GMTrace.o(7461700370432L, 55594);
  }
  
  public final void prepareAsync()
  {
    GMTrace.i(7462908329984L, 55603);
    this.ngu.prepareAsync();
    GMTrace.o(7462908329984L, 55603);
  }
  
  public final void release()
  {
    GMTrace.i(7461431934976L, 55592);
    this.ngx = true;
    this.ngu.release();
    if (this.gOu != null) {
      this.gOu.stopTimer();
    }
    if (this.ngv != null) {
      this.ngv.quit();
    }
    GMTrace.o(7461431934976L, 55592);
  }
  
  public final void seekTo(int paramInt)
  {
    GMTrace.i(7462774112256L, 55602);
    this.ngu.seekTo(paramInt);
    GMTrace.o(7462774112256L, 55602);
  }
  
  public final void setAudioStreamType(int paramInt)
  {
    GMTrace.i(7462103023616L, 55597);
    this.ngu.setAudioStreamType(paramInt);
    GMTrace.o(7462103023616L, 55597);
  }
  
  public final void setDataSource(String paramString)
  {
    GMTrace.i(7461297717248L, 55591);
    this.ngu.setDataSource(paramString);
    GMTrace.o(7461297717248L, 55591);
  }
  
  public final void setLoop(int paramInt1, int paramInt2)
  {
    GMTrace.i(7461163499520L, 55590);
    this.ngn = paramInt1;
    this.ngo = paramInt2;
    if (this.ngu != null) {
      this.ngu.setLoop(this.ngn, this.ngo);
    }
    GMTrace.o(7461163499520L, 55590);
  }
  
  public final void setLooping(boolean paramBoolean)
  {
    GMTrace.i(7463042547712L, 55604);
    this.ngu.setLooping(paramBoolean);
    GMTrace.o(7463042547712L, 55604);
  }
  
  public final void setSurface(Surface paramSurface)
  {
    GMTrace.i(7462505676800L, 55600);
    this.ngu.setSurface(paramSurface);
    GMTrace.o(7462505676800L, 55600);
  }
  
  public final void start()
  {
    GMTrace.i(7461566152704L, 55593);
    this.ngu.start();
    this.gOu.z(30L, 30L);
    GMTrace.o(7461566152704L, 55593);
  }
  
  public final void stop()
  {
    GMTrace.i(7461834588160L, 55595);
    this.ngu.stop();
    this.gOu.stopTimer();
    GMTrace.o(7461834588160L, 55595);
  }
  
  public static abstract interface a
  {
    public abstract void qT(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */