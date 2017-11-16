package com.tencent.mm.plugin.favorite;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.d;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ab.a;
import com.tencent.mm.y.ab.b;
import com.tencent.mm.y.q;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;

public final class c
  implements o
{
  public static m hnH;
  public static l hnI;
  
  public c()
  {
    GMTrace.i(6256022519808L, 46611);
    GMTrace.o(6256022519808L, 46611);
  }
  
  public static void a(long paramLong, to paramto, String paramString1, String paramString2, ArrayList<String> paramArrayList, Context paramContext)
  {
    GMTrace.i(6256425172992L, 46614);
    if ((paramto == null) || (paramContext == null))
    {
      GMTrace.o(6256425172992L, 46614);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("KFavLocSigleView", true);
    localIntent.putExtra("map_view_type", 2);
    localIntent.putExtra("kFavInfoLocalId", paramLong);
    localIntent.putExtra("kwebmap_slat", paramto.lat);
    localIntent.putExtra("kwebmap_lng", paramto.lng);
    localIntent.putExtra("kPoiName", paramto.eQm);
    localIntent.putExtra("Kwebmap_locaion", paramto.label);
    if (paramto.eMn >= 0) {
      localIntent.putExtra("kwebmap_scale", paramto.eMn);
    }
    localIntent.putExtra("kisUsername", paramString1);
    localIntent.putExtra("kwebmap_from_to", true);
    localIntent.putExtra("kRemark", paramString2);
    localIntent.putExtra("kTags", paramArrayList);
    localIntent.putExtra("kFavCanDel", true);
    localIntent.putExtra("kFavCanRemark", true);
    hnH.o(localIntent, paramContext);
    GMTrace.o(6256425172992L, 46614);
  }
  
  public static void a(String paramString1, String paramString2, Context paramContext)
  {
    GMTrace.i(6256827826176L, 46617);
    if (bg.nm(paramString1))
    {
      w.w("MicroMsg.FavApplication", "save image fail, path is null");
      GMTrace.o(6256827826176L, 46617);
      return;
    }
    if (!d.a(paramString1, paramContext, R.l.dmf)) {
      Toast.makeText(paramContext, paramString2, 1).show();
    }
    GMTrace.o(6256827826176L, 46617);
  }
  
  public static void c(String paramString, Context paramContext)
  {
    GMTrace.i(6256559390720L, 46615);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.FavApplication", "share image to timeline fail, filePath is null");
      GMTrace.o(6256559390720L, 46615);
      return;
    }
    Intent localIntent = new Intent();
    String str1 = "fav_" + q.zE() + "_0";
    String str2 = u.gy(str1);
    u.Av().p(str2, true).o("prePublishId", str1);
    localIntent.putExtra("reportSessionId", str2);
    hnH.a(paramString, localIntent, paramContext);
    GMTrace.o(6256559390720L, 46615);
  }
  
  public static String cb(long paramLong)
  {
    GMTrace.i(6257230479360L, 46620);
    if (paramLong == 0L)
    {
      GMTrace.o(6257230479360L, 46620);
      return "0KB";
    }
    String str;
    if (paramLong * 1.0D / 1048576.0D >= 1.0D)
    {
      str = String.format("%dMB", new Object[] { Integer.valueOf((int)(paramLong * 1.0D / 1048576.0D)) });
      GMTrace.o(6257230479360L, 46620);
      return str;
    }
    if (paramLong * 1.0D / 1024.0D >= 1.0D)
    {
      str = String.format("%dKB", new Object[] { Integer.valueOf((int)(paramLong * 1.0D / 1024.0D)) });
      GMTrace.o(6257230479360L, 46620);
      return str;
    }
    GMTrace.o(6257230479360L, 46620);
    return "1KB";
  }
  
  public static void d(String paramString, Context paramContext)
  {
    GMTrace.i(6256693608448L, 46616);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.FavApplication", "share image to friend fail, imgPath is null");
      GMTrace.o(6256693608448L, 46616);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Retr_File_Name", paramString);
    localIntent.putExtra("Retr_Compress_Type", 0);
    localIntent.putExtra("Retr_Msg_Type", 0);
    hnH.l(localIntent, paramContext);
    GMTrace.o(6256693608448L, 46616);
  }
  
  public static String getAppName(Context paramContext, String paramString)
  {
    GMTrace.i(6256962043904L, 46618);
    ab.b localb = ab.a.gmV;
    if (localb != null)
    {
      paramContext = localb.m(paramContext, paramString);
      GMTrace.o(6256962043904L, 46618);
      return paramContext;
    }
    GMTrace.o(6256962043904L, 46618);
    return "";
  }
  
  public static void j(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(6256290955264L, 46613);
    paramIntent.putExtra("geta8key_scene", 14);
    hnH.j(paramIntent, paramContext);
    GMTrace.o(6256290955264L, 46613);
  }
  
  public final void a(l paraml)
  {
    GMTrace.i(6257096261632L, 46619);
    hnI = paraml;
    GMTrace.o(6257096261632L, 46619);
  }
  
  public final void a(m paramm)
  {
    GMTrace.i(6256156737536L, 46612);
    hnH = paramm;
    GMTrace.o(6256156737536L, 46612);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */