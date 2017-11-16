package com.tencent.mm.pluginsdk.k.b.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.File;

public final class a
{
  public static boolean b(String paramString, Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(839397670912L, 6254);
    o.Nh();
    paramBoolean = c(s.mk(paramString), paramContext, paramBoolean);
    GMTrace.o(839397670912L, 6254);
    return paramBoolean;
  }
  
  public static boolean c(String paramString, Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(839531888640L, 6255);
    if (bg.nm(paramString))
    {
      GMTrace.o(839531888640L, 6255);
      return false;
    }
    if (paramContext == null)
    {
      GMTrace.o(839531888640L, 6255);
      return false;
    }
    Intent localIntent = new Intent("android.intent.action.VIEW").addFlags(268435456);
    localIntent.putExtra("ChannelID", "com.tencent.mm");
    localIntent.putExtra("PosID", 3);
    paramString = Uri.fromFile(new File(paramString));
    if (paramBoolean) {
      localIntent.setDataAndType(paramString, "video/quicktime");
    }
    while (!bg.j(paramContext, localIntent))
    {
      GMTrace.o(839531888640L, 6255);
      return false;
      localIntent.setDataAndType(paramString, "video/*");
    }
    paramContext.startActivity(localIntent);
    GMTrace.o(839531888640L, 6255);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\k\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */