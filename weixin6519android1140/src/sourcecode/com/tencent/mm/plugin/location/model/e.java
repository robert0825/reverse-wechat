package com.tencent.mm.plugin.location.model;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class e
{
  public static String a(LocationInfo paramLocationInfo)
  {
    GMTrace.i(9625961234432L, 71719);
    if (paramLocationInfo.eQm == null) {
      paramLocationInfo.eQm = "";
    }
    paramLocationInfo = "<msg><location x=\"" + paramLocationInfo.mwH + "\" y=\"" + paramLocationInfo.mwI + "\" scale=\"" + paramLocationInfo.zoom + "\" label=\"" + bg.Sw(paramLocationInfo.mwJ) + "\" poiname=\"" + bg.Sw(paramLocationInfo.eQm) + "\" maptype=\"0\" /></msg>";
    GMTrace.o(9625961234432L, 71719);
    return paramLocationInfo;
  }
  
  public static String a(String paramString1, String paramString2, View paramView)
  {
    GMTrace.i(9626095452160L, 71720);
    w.d("MicroMsg.MapUtil", "w h " + paramView.getWidth() + " " + (paramView.getHeight() / 2 + 20));
    String str = paramString1 + paramString2 + ".png";
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), (int)(paramView.getHeight() * 0.7D), Bitmap.Config.ARGB_8888);
    paramView.draw(new Canvas(localBitmap));
    try
    {
      w.d("MicroMsg.MapUtil", "saveMyBitmap " + paramString2);
      paramString1 = new File(paramString1 + paramString2 + ".png");
      paramString1.createNewFile();
      try
      {
        paramString1 = new FileOutputStream(paramString1);
        w.d("MicroMsg.MapUtil", "h " + localBitmap.getHeight() + " w:" + localBitmap.getWidth() + " ");
        localBitmap.compress(Bitmap.CompressFormat.PNG, 100, paramString1);
        if (paramString1 == null) {}
      }
      catch (FileNotFoundException paramString1)
      {
        try
        {
          paramString1.flush();
          paramString1.close();
          localBitmap.recycle();
          GMTrace.o(9626095452160L, 71720);
          return str;
          paramString1 = paramString1;
          w.printErrStackTrace("MicroMsg.MapUtil", paramString1, "", new Object[0]);
          paramString1 = null;
        }
        catch (IOException paramString1)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.MapUtil", paramString1, "", new Object[0]);
          }
        }
      }
      return null;
    }
    catch (IOException paramString1)
    {
      w.printErrStackTrace("MicroMsg.MapUtil", paramString1, "", new Object[0]);
      GMTrace.o(9626095452160L, 71720);
    }
  }
  
  public static PackageInfo an(Context paramContext, String paramString)
  {
    GMTrace.i(9625827016704L, 71718);
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 1);
      GMTrace.o(9625827016704L, 71718);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      w.printErrStackTrace("MicroMsg.MapUtil", paramContext, "", new Object[0]);
      GMTrace.o(9625827016704L, 71718);
      return null;
    }
    catch (ActivityNotFoundException paramContext)
    {
      w.printErrStackTrace("MicroMsg.MapUtil", paramContext, "", new Object[0]);
      GMTrace.o(9625827016704L, 71718);
    }
    return null;
  }
  
  public static boolean h(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(9626229669888L, 71721);
    if ((Math.abs(paramDouble2) > 180.0D) || (Math.abs(paramDouble1) > 90.0D))
    {
      GMTrace.o(9626229669888L, 71721);
      return false;
    }
    GMTrace.o(9626229669888L, 71721);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\location\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */