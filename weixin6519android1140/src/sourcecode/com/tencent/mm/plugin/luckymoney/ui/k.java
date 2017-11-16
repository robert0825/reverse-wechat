package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.i;
import com.tencent.mm.k.a;
import com.tencent.mm.sdk.platformtools.w;

public final class k
{
  public static void C(Context paramContext, int paramInt)
  {
    GMTrace.i(9881646006272L, 73624);
    a locala = a.mQX;
    if ((paramContext == null) || (locala == null))
    {
      w.e("MicroMsg.LuckySoundUtil", "play Err context:%s pathId:%d speekeron:%s looping:%b", new Object[] { paramContext, Integer.valueOf(paramInt), locala, Boolean.valueOf(false) });
      GMTrace.o(9881646006272L, 73624);
      return;
    }
    if ((a.tK()) && (a.tN()))
    {
      String str = paramContext.getString(paramInt);
      i locali = new i();
      if (locala != a.mQX) {
        if (locala != a.mQY) {
          break label246;
        }
      }
      for (int i = 5;; i = 0)
      {
        locali.setAudioStreamType(i);
        w.i("MicroMsg.LuckySoundUtil", "play start mp:%d path:%s context:%s pathId:%d speakerOn:%s looping:%b ", new Object[] { Integer.valueOf(locali.hashCode()), str, paramContext, Integer.valueOf(paramInt), locala, Boolean.valueOf(false) });
        try
        {
          paramContext = paramContext.getAssets().openFd(str);
          locali.setDataSource(paramContext.getFileDescriptor(), paramContext.getStartOffset(), paramContext.getLength());
          paramContext.close();
          locali.setLooping(false);
          locali.prepare();
          locali.start();
          locali.setOnErrorListener(new MediaPlayer.OnErrorListener()
          {
            public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
            {
              GMTrace.i(9874129813504L, 73568);
              w.i("MicroMsg.LuckySoundUtil", "onError, what: %d, extra: %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
              GMTrace.o(9874129813504L, 73568);
              return false;
            }
          });
          locali.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
          {
            public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
            {
              GMTrace.i(9816684625920L, 73140);
              if (paramAnonymousMediaPlayer == null) {}
              for (int i = -1;; i = paramAnonymousMediaPlayer.hashCode())
              {
                w.i("MicroMsg.LuckySoundUtil", "play completion mp:%d  path:%s", new Object[] { Integer.valueOf(i), this.fMt });
                if (paramAnonymousMediaPlayer != null) {
                  paramAnonymousMediaPlayer.release();
                }
                GMTrace.o(9816684625920L, 73140);
                return;
              }
            }
          });
          GMTrace.o(9881646006272L, 73624);
          return;
        }
        catch (Exception paramContext)
        {
          label246:
          w.e("MicroMsg.LuckySoundUtil", "play failed pathId:%d e:%s", new Object[] { Integer.valueOf(paramInt), paramContext.getMessage() });
          w.printErrStackTrace("MicroMsg.LuckySoundUtil", paramContext, "", new Object[0]);
        }
      }
    }
    GMTrace.o(9881646006272L, 73624);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(9843528171520L, 73340);
      mQX = new a("NOTSET", 0);
      mQY = new a("ON", 1);
      mQZ = new a("OFF", 2);
      mRa = new a[] { mQX, mQY, mQZ };
      GMTrace.o(9843528171520L, 73340);
    }
    
    private a()
    {
      GMTrace.i(9843393953792L, 73339);
      GMTrace.o(9843393953792L, 73339);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */