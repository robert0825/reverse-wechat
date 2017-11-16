package com.tencent.mm.compatible.b;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class i
  extends MediaPlayer
{
  public i()
  {
    GMTrace.i(18796790153216L, 140047);
    e.el(hashCode());
    GMTrace.o(18796790153216L, 140047);
  }
  
  public static i a(Context paramContext, Uri paramUri)
  {
    GMTrace.i(18796924370944L, 140048);
    try
    {
      i locali = new i();
      locali.setDataSource(paramContext, paramUri);
      locali.prepare();
      GMTrace.o(18796924370944L, 140048);
      return locali;
    }
    catch (IOException paramContext)
    {
      w.d("MicroMsg.MediaPlayerWrapper", "create failed:", new Object[] { paramContext });
      GMTrace.o(18796924370944L, 140048);
      return null;
    }
    catch (IllegalArgumentException paramContext)
    {
      for (;;)
      {
        w.d("MicroMsg.MediaPlayerWrapper", "create failed:", new Object[] { paramContext });
      }
    }
    catch (SecurityException paramContext)
    {
      for (;;)
      {
        w.d("MicroMsg.MediaPlayerWrapper", "create failed:", new Object[] { paramContext });
      }
    }
  }
  
  public final void release()
  {
    GMTrace.i(18797058588672L, 140049);
    super.release();
    e.em(hashCode());
    GMTrace.o(18797058588672L, 140049);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */