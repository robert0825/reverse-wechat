package com.tencent.mm.plugin.music.a;

import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  public AudioManager.OnAudioFocusChangeListener npB;
  
  public c()
  {
    GMTrace.i(4852507738112L, 36154);
    this.npB = new AudioManager.OnAudioFocusChangeListener()
    {
      public final void onAudioFocusChange(int paramAnonymousInt)
      {
        GMTrace.i(4846602158080L, 36110);
        w.i("MicroMsg.Music.MusicAudioFocusHelper", "focus change %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if ((paramAnonymousInt == -2) || (paramAnonymousInt == -3))
        {
          w.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus lossTransient");
          if (h.aSs().aSk().JR())
          {
            h.aSs().aSk().aSH();
            GMTrace.o(4846602158080L, 36110);
          }
        }
        else if ((paramAnonymousInt == 1) || (paramAnonymousInt == 2) || (paramAnonymousInt == 3))
        {
          w.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus gain");
          if (h.aSs().aSk().JR())
          {
            h.aSs().aSk().resume();
            GMTrace.o(4846602158080L, 36110);
          }
        }
        else if (paramAnonymousInt == -1)
        {
          w.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus loss, passive pause");
          if (h.aSs().aSk().JR())
          {
            h.aSs().aSk().aSH();
            h.aSs();
            e.aSn();
            h.aSs().aSo();
          }
          h.aSu().abandonAudioFocus(c.this.npB);
        }
        GMTrace.o(4846602158080L, 36110);
      }
    };
    GMTrace.o(4852507738112L, 36154);
  }
  
  public final void aSh()
  {
    GMTrace.i(4852776173568L, 36156);
    w.i("MicroMsg.Music.MusicAudioFocusHelper", "abandonFocus");
    h.aSu().abandonAudioFocus(this.npB);
    GMTrace.o(4852776173568L, 36156);
  }
  
  public final boolean requestFocus()
  {
    GMTrace.i(4852641955840L, 36155);
    int i = h.aSu().requestAudioFocus(this.npB, 3, 2);
    if (i == 1) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.Music.MusicAudioFocusHelper", "request audio focus %b", new Object[] { Boolean.valueOf(bool) });
      if (i != 1) {
        break;
      }
      GMTrace.o(4852641955840L, 36155);
      return true;
    }
    GMTrace.o(4852641955840L, 36155);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */