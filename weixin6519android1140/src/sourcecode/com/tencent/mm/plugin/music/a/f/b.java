package com.tencent.mm.plugin.music.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.at.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;

public abstract class b
{
  protected a eNq;
  protected i nry;
  protected j nrz;
  
  public b()
  {
    GMTrace.i(4862037196800L, 36225);
    this.nrz = new j();
    GMTrace.o(4862037196800L, 36225);
  }
  
  public abstract void DM(String paramString);
  
  public final void a(i parami)
  {
    GMTrace.i(4862171414528L, 36226);
    this.nry = parami;
    GMTrace.o(4862171414528L, 36226);
  }
  
  public abstract boolean aTg();
  
  public abstract int aTh();
  
  public abstract String aTi();
  
  public final void d(a parama)
  {
    GMTrace.i(4862574067712L, 36229);
    this.eNq = parama;
    GMTrace.o(4862574067712L, 36229);
  }
  
  public abstract int getDuration();
  
  protected void gp(final boolean paramBoolean)
  {
    GMTrace.i(4863647809536L, 36237);
    if (this.nry != null) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4866600599552L, 36259);
          w.i("MicroMsg.Music.BasePlayer", "onError, needRetry:%b", new Object[] { Boolean.valueOf(paramBoolean) });
          b.this.nry.f(b.this.eNq, paramBoolean);
          GMTrace.o(4866600599552L, 36259);
        }
      });
    }
    GMTrace.o(4863647809536L, 36237);
  }
  
  protected void gq(final boolean paramBoolean)
  {
    GMTrace.i(4864050462720L, 36240);
    if (this.nry != null) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4864318898176L, 36242);
          w.i("MicroMsg.Music.BasePlayer", "onStop, isComplete:%b", new Object[] { Boolean.valueOf(paramBoolean) });
          b.this.nry.e(b.this.eNq, paramBoolean);
          GMTrace.o(4864318898176L, 36242);
        }
      });
    }
    GMTrace.o(4864050462720L, 36240);
  }
  
  public abstract boolean isPlaying();
  
  protected final void onStart()
  {
    GMTrace.i(4863782027264L, 36238);
    if (this.nry != null) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4865795293184L, 36253);
          w.i("MicroMsg.Music.BasePlayer", "onStart %b", new Object[] { Boolean.valueOf(b.this.isPlaying()) });
          b.this.nry.f(b.this.eNq);
          GMTrace.o(4865795293184L, 36253);
        }
      });
    }
    GMTrace.o(4863782027264L, 36238);
  }
  
  public abstract void pause();
  
  public abstract void play();
  
  protected final void rz(final int paramInt)
  {
    GMTrace.i(4863916244992L, 36239);
    if (this.nry != null) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4861902979072L, 36224);
          if (b.this.aTg()) {
            b.this.nry.g(b.this.eNq);
          }
          GMTrace.o(4861902979072L, 36224);
        }
      });
    }
    GMTrace.o(4863916244992L, 36239);
  }
  
  public abstract void seek(long paramLong);
  
  public abstract void stop();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */