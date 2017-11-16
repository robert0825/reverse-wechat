package com.tencent.mm.compatible.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

@TargetApi(8)
public final class c
  implements b.b
{
  private Context context;
  private AudioManager fRS;
  public b.a fRT;
  private AudioManager.OnAudioFocusChangeListener fRU;
  
  public c(Context paramContext)
  {
    GMTrace.i(13784026447872L, 102699);
    this.fRU = new AudioManager.OnAudioFocusChangeListener()
    {
      public final void onAudioFocusChange(int paramAnonymousInt)
      {
        GMTrace.i(13784831754240L, 102705);
        if (c.this.fRT != null)
        {
          w.d("MicroMsg.AudioFocusHelper", "jacks change: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          c.this.fRT.dd(paramAnonymousInt);
        }
        GMTrace.o(13784831754240L, 102705);
      }
    };
    this.context = paramContext;
    GMTrace.o(13784026447872L, 102699);
  }
  
  public final void a(b.a parama)
  {
    GMTrace.i(13783892230144L, 102698);
    this.fRT = parama;
    GMTrace.o(13783892230144L, 102698);
  }
  
  public final boolean requestFocus()
  {
    GMTrace.i(13784160665600L, 102700);
    if ((this.fRS == null) && (this.context != null)) {
      this.fRS = ((AudioManager)this.context.getSystemService("audio"));
    }
    boolean bool;
    if (this.fRS != null) {
      if (1 == this.fRS.requestAudioFocus(this.fRU, 3, 2)) {
        bool = true;
      }
    }
    for (;;)
    {
      w.k("MicroMsg.AudioFocusHelper", "jacks requestFocus: %B, %x", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.fRU.hashCode()) });
      GMTrace.o(13784160665600L, 102700);
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }
  
  public final boolean tx()
  {
    GMTrace.i(13784294883328L, 102701);
    if ((this.fRS == null) && (this.context != null)) {
      this.fRS = ((AudioManager)this.context.getSystemService("audio"));
    }
    boolean bool;
    if (this.fRS != null) {
      if (1 == this.fRS.abandonAudioFocus(this.fRU)) {
        bool = true;
      }
    }
    for (;;)
    {
      w.k("MicroMsg.AudioFocusHelper", "jacks abandonFocus: %B, %x", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.fRU.hashCode()) });
      GMTrace.o(13784294883328L, 102701);
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\util\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */