package com.tencent.mm.plugin.mmsight.segment.a;

import android.os.Looper;
import android.view.Surface;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.s.c;
import com.tencent.mm.plugin.s.i;
import com.tencent.mm.plugin.s.j;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  implements a
{
  public boolean GI;
  public boolean grS;
  public boolean isStart;
  public i ngl;
  public int ngm;
  public int ngn;
  private int ngo;
  public a.a ngp;
  public a.d ngq;
  public a.b ngr;
  public a.c ngs;
  
  public b()
  {
    GMTrace.i(7463579418624L, 55608);
    this.grS = false;
    this.isStart = false;
    this.GI = false;
    this.ngn = 0;
    this.ngo = 0;
    this.ngl = new i(Looper.getMainLooper());
    Object localObject = this.ngl;
    if (((i)localObject).mWb != null)
    {
      localObject = ((i)localObject).mWb;
      if (((j)localObject).mVD != null) {
        ((j)localObject).mVD.mVx = false;
      }
    }
    this.ngl.fT(false);
    this.ngl.mWc = new c()
    {
      public final void F(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(7468008603648L, 55641);
        b.this.ngm = paramAnonymousInt3;
        if (b.this.ngq != null) {
          b.this.ngq.H(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
        }
        GMTrace.o(7468008603648L, 55641);
      }
      
      public final void Xq()
      {
        GMTrace.i(7467471732736L, 55637);
        if (b.this.ngr != null) {
          b.this.ngr.bf(b.this.ngl);
        }
        if (b.this.isStart) {
          b.this.ngl.start();
        }
        b.this.GI = true;
        GMTrace.o(7467471732736L, 55637);
      }
      
      public final void aOx()
      {
        GMTrace.i(7467874385920L, 55640);
        w.i("MicroMsg.MMSegmentVideoPlayer", "onSeekComplete, onSeekCompleteListener: %s", new Object[] { b.this.ngs });
        if (b.this.ngs != null)
        {
          b.this.ngs.bg(b.this.ngl);
          GMTrace.o(7467874385920L, 55640);
          return;
        }
        if (b.this.isStart) {
          b.this.ngl.start();
        }
        GMTrace.o(7467874385920L, 55640);
      }
      
      public final void onCompletion()
      {
        GMTrace.i(7467605950464L, 55638);
        if (b.this.grS) {
          b.this.ngl.qz(b.this.ngn);
        }
        GMTrace.o(7467605950464L, 55638);
      }
      
      public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(7467740168192L, 55639);
        if (b.this.ngp != null) {
          b.this.ngp.cv(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(7467740168192L, 55639);
      }
    };
    GMTrace.o(7463579418624L, 55608);
  }
  
  public final void a(a.a parama)
  {
    GMTrace.i(7465995337728L, 55626);
    this.ngp = parama;
    GMTrace.o(7465995337728L, 55626);
  }
  
  public final void a(a.b paramb)
  {
    GMTrace.i(7465592684544L, 55623);
    this.ngr = paramb;
    GMTrace.o(7465592684544L, 55623);
  }
  
  public final void a(a.c paramc)
  {
    GMTrace.i(7465726902272L, 55624);
    this.ngs = paramc;
    GMTrace.o(7465726902272L, 55624);
  }
  
  public final void a(a.d paramd)
  {
    GMTrace.i(7465861120000L, 55625);
    this.ngq = paramd;
    GMTrace.o(7465861120000L, 55625);
  }
  
  public final int getCurrentPosition()
  {
    GMTrace.i(7464787378176L, 55617);
    int i = this.ngl.aOH();
    GMTrace.o(7464787378176L, 55617);
    return i;
  }
  
  public final int getDuration()
  {
    GMTrace.i(7464921595904L, 55618);
    int i = (int)this.ngl.mWb.mVK;
    GMTrace.o(7464921595904L, 55618);
    return i;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(7464518942720L, 55615);
    boolean bool = this.ngl.isPlaying();
    GMTrace.o(7464518942720L, 55615);
    return bool;
  }
  
  public final void pause()
  {
    GMTrace.i(7464384724992L, 55614);
    this.ngl.pause();
    GMTrace.o(7464384724992L, 55614);
  }
  
  public final void prepareAsync()
  {
    GMTrace.i(7463982071808L, 55611);
    this.ngl.aOG();
    GMTrace.o(7463982071808L, 55611);
  }
  
  public final void release()
  {
    GMTrace.i(7465055813632L, 55619);
    this.ngl.release();
    GMTrace.o(7465055813632L, 55619);
  }
  
  public final void seekTo(int paramInt)
  {
    GMTrace.i(7464653160448L, 55616);
    if (this.ngl != null)
    {
      w.i("MicroMsg.MMSegmentVideoPlayer", "seekTo: %s", new Object[] { Integer.valueOf(paramInt) });
      this.ngl.qz(paramInt);
    }
    GMTrace.o(7464653160448L, 55616);
  }
  
  public final void setAudioStreamType(int paramInt)
  {
    GMTrace.i(7465190031360L, 55620);
    GMTrace.o(7465190031360L, 55620);
  }
  
  public final void setDataSource(String paramString)
  {
    GMTrace.i(7463847854080L, 55610);
    this.ngl.setPath(paramString);
    GMTrace.o(7463847854080L, 55610);
  }
  
  public final void setLoop(int paramInt1, int paramInt2)
  {
    GMTrace.i(7465458466816L, 55622);
    this.ngn = paramInt1;
    this.ngo = paramInt2;
    GMTrace.o(7465458466816L, 55622);
  }
  
  public final void setLooping(boolean paramBoolean)
  {
    GMTrace.i(7465324249088L, 55621);
    this.grS = paramBoolean;
    GMTrace.o(7465324249088L, 55621);
  }
  
  public final void setSurface(Surface paramSurface)
  {
    GMTrace.i(7463713636352L, 55609);
    this.ngl.setSurface(paramSurface);
    GMTrace.o(7463713636352L, 55609);
  }
  
  public final void start()
  {
    GMTrace.i(7464116289536L, 55612);
    if (this.GI) {
      this.ngl.start();
    }
    this.isStart = true;
    GMTrace.o(7464116289536L, 55612);
  }
  
  public final void stop()
  {
    GMTrace.i(7464250507264L, 55613);
    this.ngl.mWb.stop();
    this.isStart = false;
    GMTrace.o(7464250507264L, 55613);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */