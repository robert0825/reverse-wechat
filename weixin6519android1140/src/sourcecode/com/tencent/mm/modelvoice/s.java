package com.tencent.mm.modelvoice;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.compatible.b.i;
import com.tencent.mm.compatible.d.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class s
  implements d
{
  public String euR;
  public d.a hdU;
  public d.b hdV;
  public MediaPlayer hey;
  public b hez;
  public int status;
  
  public s()
  {
    GMTrace.i(569217384448L, 4241);
    this.euR = "";
    this.hdU = null;
    this.hdV = null;
    this.status = 0;
    this.hey = new i();
    NQ();
    NR();
    w.d("MicroMsg.VoicePlayer", "VoicePlayer");
    GMTrace.o(569217384448L, 4241);
  }
  
  public s(Context paramContext)
  {
    this();
    GMTrace.i(569351602176L, 4242);
    this.hez = new b(paramContext);
    w.d("MicroMsg.VoicePlayer", "VoicePlayer context");
    GMTrace.o(569351602176L, 4242);
  }
  
  private void NQ()
  {
    GMTrace.i(569754255360L, 4245);
    this.hey.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
    {
      public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(571499085824L, 4258);
        w.d("MicroMsg.VoicePlayer", "OnCompletionListener");
        if (s.this.hez != null)
        {
          w.d("MicroMsg.VoicePlayer", "OnCompletionListener abandonFocus");
          s.this.hez.tx();
        }
        if (s.this.hdU != null)
        {
          w.d("MicroMsg.VoicePlayer", "OnCompletionListener onCompletion");
          s.this.hdU.onCompletion();
        }
        try
        {
          w.d("MicroMsg.VoicePlayer", "OnCompletionListener release");
          s.this.hey.release();
          s.this.status = 0;
          GMTrace.o(571499085824L, 4258);
          return;
        }
        catch (Exception paramAnonymousMediaPlayer)
        {
          w.e("MicroMsg.VoicePlayer", "setCompletion File[" + s.this.euR + "] ErrMsg[" + paramAnonymousMediaPlayer.getStackTrace() + "]");
          GMTrace.o(571499085824L, 4258);
        }
      }
    });
    GMTrace.o(569754255360L, 4245);
  }
  
  private void NR()
  {
    GMTrace.i(569888473088L, 4246);
    this.hey.setOnErrorListener(new MediaPlayer.OnErrorListener()
    {
      public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(546266152960L, 4070);
        w.d("MicroMsg.VoicePlayer", "OnErrorListener");
        if (s.this.hez != null)
        {
          w.d("MicroMsg.VoicePlayer", "OnErrorListener abandonFocus");
          s.this.hez.tx();
        }
        if (s.this.hdV != null)
        {
          w.d("MicroMsg.VoicePlayer", "OnErrorListener onError");
          s.this.hdV.onError();
        }
        try
        {
          w.d("MicroMsg.VoicePlayer", "OnErrorListener release");
          s.this.hey.release();
          s.this.status = -1;
          GMTrace.o(546266152960L, 4070);
          return false;
        }
        catch (Exception paramAnonymousMediaPlayer)
        {
          for (;;)
          {
            w.e("MicroMsg.VoicePlayer", "setErrorListener File[" + s.this.euR + "] ErrMsg[" + paramAnonymousMediaPlayer.getStackTrace() + "]");
          }
        }
      }
    });
    GMTrace.o(569888473088L, 4246);
  }
  
  private void b(boolean paramBoolean, int paramInt)
  {
    int j = 3;
    GMTrace.i(570559561728L, 4251);
    if (!e.aZ(this.euR))
    {
      GMTrace.o(570559561728L, 4251);
      return;
    }
    int i;
    if (paramBoolean) {
      i = 3;
    }
    label251:
    for (;;)
    {
      try
      {
        w.d("MicroMsg.VoicePlayer", "playImp speakerOn:%s,seekTo:%s,type:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Integer.valueOf(i) });
        if (!p.fQD.fNp) {
          break label251;
        }
        p.fQD.dump();
        if (p.fQD.fNw != 1) {
          break label251;
        }
        i = j;
        if (this.hez != null)
        {
          w.d("MicroMsg.VoicePlayer", "playImp audioFocusHelper.requestFocus");
          this.hez.requestFocus();
        }
        this.hey.setAudioStreamType(i);
        this.hey.setDataSource(this.euR);
        this.hey.prepare();
        if (paramInt > 0) {
          this.hey.seekTo(paramInt);
        }
        this.hey.start();
        GMTrace.o(570559561728L, 4251);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.VoicePlayer", "playImp : fail, exception = " + localException.getMessage());
        w.e("MicroMsg.VoicePlayer", "exception:%s", new Object[] { bg.f(localException) });
        if (this.hez == null) {
          continue;
        }
        this.hez.tx();
        GMTrace.o(570559561728L, 4251);
        return;
      }
      i = 0;
    }
  }
  
  private boolean d(String paramString, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(570425344000L, 4250);
    if (this.status != 0)
    {
      w.e("MicroMsg.VoicePlayer", "startPlay error status:" + this.status);
      GMTrace.o(570425344000L, 4250);
      return false;
    }
    w.i("MicroMsg.VoicePlayer", "startPlay speakerOn:%s,seekTo:%s,", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    this.euR = paramString;
    try
    {
      b(paramBoolean, paramInt);
      this.status = 1;
      GMTrace.o(570425344000L, 4250);
      return true;
    }
    catch (Exception paramString)
    {
      try
      {
        b(true, paramInt);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.VoicePlayer", "startPlay File[" + this.euR + "] failed");
        w.e("MicroMsg.VoicePlayer", "exception:%s", new Object[] { bg.f(paramString) });
        this.status = -1;
        GMTrace.o(570425344000L, 4250);
      }
    }
    return false;
  }
  
  public final boolean F(String paramString, boolean paramBoolean)
  {
    GMTrace.i(570156908544L, 4248);
    paramBoolean = d(paramString, paramBoolean, 0);
    GMTrace.o(570156908544L, 4248);
    return paramBoolean;
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(569485819904L, 4243);
    this.hdU = parama;
    GMTrace.o(569485819904L, 4243);
  }
  
  public final void a(d.b paramb)
  {
    GMTrace.i(569620037632L, 4244);
    this.hdV = paramb;
    GMTrace.o(569620037632L, 4244);
  }
  
  public final boolean aw(boolean paramBoolean)
  {
    GMTrace.i(17482127507456L, 130252);
    if (this.status != 1)
    {
      w.e("MicroMsg.VoicePlayer", "pause not STATUS_PLAYING error status:" + this.status);
      GMTrace.o(17482127507456L, 130252);
      return false;
    }
    try
    {
      w.d("MicroMsg.VoicePlayer", "pause mediaPlayer.pause()");
      this.hey.pause();
      if ((this.hez != null) && (paramBoolean))
      {
        w.d("MicroMsg.VoicePlayer", "pause audioFocusHelper.abandonFocus()");
        this.hez.tx();
      }
      this.status = 2;
      GMTrace.o(17482127507456L, 130252);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.VoicePlayer", "pause File[" + this.euR + "] ErrMsg[" + localException.getStackTrace() + "]");
      this.status = -1;
      if ((this.hez != null) && (paramBoolean))
      {
        w.d("MicroMsg.VoicePlayer", "pause audioFocusHelper.abandonFocus()");
        this.hez.tx();
      }
      GMTrace.o(17482127507456L, 130252);
      return false;
    }
    finally
    {
      if ((this.hez != null) && (paramBoolean))
      {
        w.d("MicroMsg.VoicePlayer", "pause audioFocusHelper.abandonFocus()");
        this.hez.tx();
      }
    }
  }
  
  public final void ay(boolean paramBoolean)
  {
    GMTrace.i(570022690816L, 4247);
    w.d("MicroMsg.VoicePlayer", "setSpeakerOn=" + paramBoolean);
    if (this.hey == null)
    {
      GMTrace.o(570022690816L, 4247);
      return;
    }
    if (ap.qk())
    {
      w.v("MicroMsg.VoicePlayer", "setSpeakOn return when calling");
      GMTrace.o(570022690816L, 4247);
      return;
    }
    int i = this.hey.getCurrentPosition();
    qt();
    this.hey = new i();
    NQ();
    NR();
    d(this.euR, paramBoolean, i);
    GMTrace.o(570022690816L, 4247);
  }
  
  public final void b(b.a parama)
  {
    GMTrace.i(17482261725184L, 130253);
    if ((this.hez != null) && (parama != null)) {
      this.hez.a(parama);
    }
    GMTrace.o(17482261725184L, 130253);
  }
  
  public final boolean c(String paramString, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(570291126272L, 4249);
    paramBoolean = d(paramString, paramBoolean, paramInt);
    GMTrace.o(570291126272L, 4249);
    return paramBoolean;
  }
  
  public final int getStatus()
  {
    GMTrace.i(569083166720L, 4240);
    int i = this.status;
    GMTrace.o(569083166720L, 4240);
    return i;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(570962214912L, 4254);
    if (this.status == 1)
    {
      GMTrace.o(570962214912L, 4254);
      return true;
    }
    GMTrace.o(570962214912L, 4254);
    return false;
  }
  
  public final boolean qj()
  {
    GMTrace.i(570827997184L, 4253);
    if (this.status != 2)
    {
      w.e("MicroMsg.VoicePlayer", "resume not STATUS_PAUSE error status:" + this.status);
      GMTrace.o(570827997184L, 4253);
      return false;
    }
    try
    {
      w.d("MicroMsg.VoicePlayer", "resume mediaPlayer.start()");
      this.hey.start();
      if (this.hez != null)
      {
        w.d("MicroMsg.VoicePlayer", "resume audioFocusHelper.requestFocus()");
        this.hez.requestFocus();
      }
      this.status = 1;
      GMTrace.o(570827997184L, 4253);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.VoicePlayer", "resume File[" + this.euR + "] ErrMsg[" + localException.getStackTrace() + "]");
      this.status = -1;
      if (this.hez != null)
      {
        w.d("MicroMsg.VoicePlayer", "resume audioFocusHelper.requestFocus()");
        this.hez.requestFocus();
      }
      GMTrace.o(570827997184L, 4253);
      return false;
    }
    finally
    {
      if (this.hez != null)
      {
        w.d("MicroMsg.VoicePlayer", "resume audioFocusHelper.requestFocus()");
        this.hez.requestFocus();
      }
    }
  }
  
  public final double qm()
  {
    GMTrace.i(571230650368L, 4256);
    if ((this.status != 1) && (this.status != 2))
    {
      GMTrace.o(571230650368L, 4256);
      return 0.0D;
    }
    int i;
    int j;
    try
    {
      i = this.hey.getCurrentPosition();
      j = this.hey.getDuration();
      if (j == 0)
      {
        w.e("MicroMsg.VoicePlayer", "getDuration File[" + this.euR + "] Failed");
        GMTrace.o(571230650368L, 4256);
        return 0.0D;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.VoicePlayer", "getNowProgress File[" + this.euR + "] ErrMsg[" + localException.getStackTrace() + "]");
      qt();
      GMTrace.o(571230650368L, 4256);
      return 0.0D;
    }
    double d = i / j;
    GMTrace.o(571230650368L, 4256);
    return d;
  }
  
  public final boolean qt()
  {
    GMTrace.i(571096432640L, 4255);
    if ((this.status != 1) && (this.status != 2))
    {
      w.e("MicroMsg.VoicePlayer", "stop not STATUS_PLAYING or STATUS_PAUSE error status:" + this.status);
      GMTrace.o(571096432640L, 4255);
      return false;
    }
    try
    {
      w.d("MicroMsg.VoicePlayer", "stop mediaPlayer.stop()");
      this.hey.stop();
      this.hey.release();
      if (this.hez != null)
      {
        w.d("MicroMsg.VoicePlayer", "stop audioFocusHelper.abandonFocus()");
        this.hez.tx();
      }
      this.status = 0;
      GMTrace.o(571096432640L, 4255);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.VoicePlayer", "stop File[" + this.euR + "] ErrMsg[" + localException.getStackTrace() + "]");
      this.status = -1;
      if (this.hez != null)
      {
        w.d("MicroMsg.VoicePlayer", "stop audioFocusHelper.abandonFocus()");
        this.hez.tx();
      }
      GMTrace.o(571096432640L, 4255);
      return false;
    }
    finally
    {
      if (this.hez != null)
      {
        w.d("MicroMsg.VoicePlayer", "stop audioFocusHelper.abandonFocus()");
        this.hez.tx();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */