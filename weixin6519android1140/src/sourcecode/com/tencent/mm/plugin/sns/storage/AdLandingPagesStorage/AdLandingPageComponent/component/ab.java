package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.support.v4.content.d;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URI;
import java.net.URISyntaxException;

public final class ab
{
  public static int[] df(Context paramContext)
  {
    GMTrace.i(17129940189184L, 127628);
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    Point localPoint;
    int j;
    int i;
    if (Build.VERSION.SDK_INT >= 13)
    {
      localPoint = new Point();
      if (Build.VERSION.SDK_INT >= 17)
      {
        paramContext.getRealSize(localPoint);
        j = localPoint.x;
        i = localPoint.y;
      }
    }
    for (;;)
    {
      GMTrace.o(17129940189184L, 127628);
      return new int[] { j, i };
      paramContext.getSize(localPoint);
      j = localPoint.x;
      i = localPoint.y;
      continue;
      j = paramContext.getWidth();
      i = paramContext.getHeight();
    }
  }
  
  public static void dg(Context paramContext)
  {
    GMTrace.i(17130074406912L, 127629);
    d.l(paramContext).a(new Intent("com.tencent.mm.adlanding.set_uioption"));
    GMTrace.o(17130074406912L, 127629);
  }
  
  public static String k(String paramString, String... paramVarArgs)
  {
    GMTrace.i(20065147682816L, 149497);
    try
    {
      URI localURI = new URI(paramString);
      Object localObject = new StringBuilder();
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        ((StringBuilder)localObject).append(paramVarArgs[i]).append("&");
        i += 1;
      }
      if (((StringBuilder)localObject).length() > 1)
      {
        paramVarArgs = ((StringBuilder)localObject).deleteCharAt(((StringBuilder)localObject).length() - 1);
        localObject = localURI.getQuery();
        if (localObject == null) {}
        for (paramVarArgs = paramVarArgs.toString();; paramVarArgs = (String)localObject + "&" + paramVarArgs.toString())
        {
          paramVarArgs = new URI(localURI.getScheme(), localURI.getAuthority(), localURI.getPath(), paramVarArgs, localURI.getFragment()).toString();
          GMTrace.o(20065147682816L, 149497);
          return paramVarArgs;
        }
      }
      return paramString;
    }
    catch (URISyntaxException paramVarArgs)
    {
      w.printErrStackTrace("LandingPageUtil", paramVarArgs, "", new Object[0]);
      GMTrace.o(20065147682816L, 149497);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */