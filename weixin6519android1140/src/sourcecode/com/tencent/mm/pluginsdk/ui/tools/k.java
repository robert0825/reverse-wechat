package com.tencent.mm.pluginsdk.ui.tools;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.ag.a.a;
import com.tencent.mm.plugin.ag.a.h;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import java.io.File;

public final class k
{
  private static String filePath;
  
  static
  {
    GMTrace.i(1114812448768L, 8306);
    filePath = null;
    GMTrace.o(1114812448768L, 8306);
  }
  
  public static boolean P(Activity paramActivity)
  {
    GMTrace.i(1112396529664L, 8288);
    a(paramActivity, 2, 1, 0, 1, false, null);
    GMTrace.o(1112396529664L, 8288);
    return true;
  }
  
  public static String Pk()
  {
    GMTrace.i(1114678231040L, 8305);
    String str = com.tencent.mm.platformtools.d.Pk();
    GMTrace.o(1114678231040L, 8305);
    return str;
  }
  
  public static boolean Q(Activity paramActivity)
  {
    GMTrace.i(1112530747392L, 8289);
    a(paramActivity, 205, 1, 11, null);
    GMTrace.o(1112530747392L, 8289);
    return true;
  }
  
  public static boolean R(Activity paramActivity)
  {
    GMTrace.i(1112799182848L, 8291);
    a(paramActivity, 2, 1, 5, null);
    GMTrace.o(1112799182848L, 8291);
    return true;
  }
  
  public static void S(Activity paramActivity)
  {
    GMTrace.i(1113470271488L, 8296);
    a(paramActivity, 2, 1, 10, 1, true, null);
    GMTrace.o(1113470271488L, 8296);
  }
  
  public static void a(Activity paramActivity, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, Intent paramIntent)
  {
    GMTrace.i(1113336053760L, 8295);
    Intent localIntent = new Intent();
    if (paramIntent != null) {
      localIntent.putExtras(paramIntent.getExtras());
    }
    localIntent.putExtra("max_select_count", paramInt2);
    localIntent.putExtra("query_source_type", paramInt3);
    localIntent.putExtra("query_media_type", paramInt4);
    localIntent.putExtra("show_header_view", paramBoolean);
    localIntent.addFlags(67108864);
    com.tencent.mm.bj.d.b(paramActivity, "gallery", ".ui.GalleryEntryUI", localIntent, paramInt1);
    GMTrace.o(1113336053760L, 8295);
  }
  
  public static void a(Activity paramActivity, int paramInt1, int paramInt2, int paramInt3, Intent paramIntent)
  {
    GMTrace.i(1113201836032L, 8294);
    Intent localIntent = new Intent();
    if (paramIntent != null) {
      localIntent.putExtras(paramIntent.getExtras());
    }
    localIntent.putExtra("max_select_count", paramInt2);
    localIntent.putExtra("query_source_type", paramInt3);
    localIntent.addFlags(67108864);
    com.tencent.mm.bj.d.b(paramActivity, "gallery", ".ui.GalleryEntryUI", localIntent, paramInt1);
    GMTrace.o(1113201836032L, 8294);
  }
  
  public static void a(Activity paramActivity, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    GMTrace.i(1113872924672L, 8299);
    paramString = new File(paramString);
    if (paramString.exists()) {
      paramString.delete();
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("output", Uri.fromFile(paramString));
    localIntent.putExtra("android.intent.extra.videoQuality", paramInt3);
    if (paramBoolean) {}
    for (paramInt3 = 1;; paramInt3 = 0)
    {
      localIntent.putExtra("android.intent.extras.CAMERA_FACING", paramInt3);
      if (paramInt2 > 0) {
        localIntent.putExtra("android.intent.extra.durationLimit", paramInt2);
      }
      localIntent.setAction("android.media.action.VIDEO_CAPTURE");
      localIntent.addCategory("android.intent.category.DEFAULT");
      paramActivity.startActivityForResult(localIntent, paramInt1);
      GMTrace.o(1113872924672L, 8299);
      return;
    }
  }
  
  private static void a(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, String paramString2)
  {
    GMTrace.i(1113604489216L, 8297);
    Intent localIntent = new Intent();
    if (!bg.nm(paramString2))
    {
      localIntent.putExtra("GalleryUI_FromUser", paramString1);
      localIntent.putExtra("GalleryUI_ToUser", paramString2);
    }
    localIntent.putExtra("max_select_count", paramInt2);
    localIntent.putExtra("query_source_type", paramInt3);
    localIntent.putExtra("query_media_type", paramInt4);
    if (r.hlf) {
      localIntent.putExtra("show_header_view", true);
    }
    for (;;)
    {
      localIntent.addFlags(67108864);
      com.tencent.mm.bj.d.a(paramFragment, "gallery", ".ui.AlbumPreviewUI", localIntent, paramInt1);
      GMTrace.o(1113604489216L, 8297);
      return;
      localIntent.putExtra("show_header_view", false);
    }
  }
  
  public static void a(Fragment paramFragment, int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(1112933400576L, 8292);
    a(paramFragment, 217, 9, paramInt, 1, paramString1, paramString2);
    GMTrace.o(1112933400576L, 8292);
  }
  
  public static boolean a(Activity paramActivity, int paramInt, Intent paramIntent)
  {
    GMTrace.i(1112262311936L, 8287);
    a(paramActivity, paramInt, 1, 0, paramIntent);
    GMTrace.o(1112262311936L, 8287);
    return true;
  }
  
  public static boolean a(Context paramContext, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3)
  {
    GMTrace.i(1111322787840L, 8280);
    boolean bool = a(paramContext, paramInt1, paramIntent, paramInt2, "", paramInt3);
    GMTrace.o(1111322787840L, 8280);
    return bool;
  }
  
  public static boolean a(Context paramContext, int paramInt1, Intent paramIntent, int paramInt2, String paramString, int paramInt3)
  {
    GMTrace.i(1111457005568L, 8281);
    Object localObject1 = null;
    if (paramIntent != null) {
      localObject1 = (SightParams)paramIntent.getParcelableExtra("KEY_SIGHT_PARAMS");
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new SightParams(paramInt2, paramInt3);
    }
    if (paramInt2 == 1)
    {
      paramString = s.mj(paramString);
      o.Nh();
      localObject1 = s.mk(paramString);
      o.Nh();
      ((SightParams)localObject2).h(paramString, (String)localObject1, s.ml(paramString), com.tencent.mm.compatible.util.e.fRZ + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" }));
    }
    if (localObject2 == null) {
      w.e("MicroMsg.TakePhotoUtil", "videoParams takeMMSight is null");
    }
    paramIntent.putExtra("KEY_SIGHT_PARAMS", (Parcelable)localObject2);
    com.tencent.mm.bj.d.b(paramContext, "mmsight", ".ui.SightCaptureUI", paramIntent, paramInt1);
    if ((paramContext instanceof Activity)) {
      ((Activity)paramContext).overridePendingTransition(a.a.qzt, -1);
    }
    GMTrace.o(1111457005568L, 8281);
    return true;
  }
  
  public static boolean a(Fragment paramFragment, Intent paramIntent, String paramString, int paramInt)
  {
    GMTrace.i(1111054352384L, 8278);
    SightParams localSightParams = new SightParams(1, paramInt);
    paramString = s.mj(paramString);
    o.Nh();
    String str = s.mk(paramString);
    o.Nh();
    localSightParams.h(paramString, str, s.ml(paramString), com.tencent.mm.compatible.util.e.fRZ + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" }));
    paramIntent.putExtra("KEY_SIGHT_PARAMS", localSightParams);
    com.tencent.mm.bj.d.a(paramFragment, "mmsight", ".ui.SightCaptureUI", paramIntent, 226);
    paramFragment.aG().overridePendingTransition(a.a.qzt, -1);
    GMTrace.o(1111054352384L, 8278);
    return true;
  }
  
  public static boolean a(u paramu, String paramString1, String paramString2)
  {
    GMTrace.i(1111591223296L, 8282);
    boolean bool = a(paramu, paramString1, paramString2, 201);
    w.i("MicroMsg.TakePhotoUtil", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", new Object[] { paramString1, paramString2, Integer.valueOf(201), Boolean.valueOf(bool) });
    GMTrace.o(1111591223296L, 8282);
    return bool;
  }
  
  private static boolean a(u paramu, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(1111725441024L, 8283);
    if ((com.tencent.mm.p.a.aQ(paramu.vKB.vKW)) || (com.tencent.mm.p.a.aP(paramu.vKB.vKW)))
    {
      GMTrace.o(1111725441024L, 8283);
      return false;
    }
    filePath = paramString1 + paramString2;
    w.i("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), filePath = " + filePath);
    aY(paramu.vKB.vKW, filePath);
    paramString2 = new Intent("android.media.action.IMAGE_CAPTURE");
    File localFile = new File(paramString1);
    if (!localFile.exists()) {}
    try
    {
      localFile.mkdirs();
      if (!localFile.exists())
      {
        w.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), dir not exist. " + paramString1);
        GMTrace.o(1111725441024L, 8283);
        return false;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.TakePhotoUtil", localException, "", new Object[0]);
      }
      paramString2.putExtra("output", Uri.fromFile(new File(filePath)));
      try
      {
        paramu.startActivityForResult(paramString2, 201);
        GMTrace.o(1111725441024L, 8283);
        return true;
      }
      catch (ActivityNotFoundException paramu)
      {
        w.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), " + paramu.getMessage());
        GMTrace.o(1111725441024L, 8283);
      }
    }
    return false;
  }
  
  private static void aY(Context paramContext, String paramString)
  {
    GMTrace.i(1112128094208L, 8286);
    paramContext = paramContext.getSharedPreferences("system_config_prefs", 0).edit();
    paramContext.putString("camera_file_path", paramString);
    paramContext.commit();
    GMTrace.o(1112128094208L, 8286);
  }
  
  public static String b(Context paramContext, Intent paramIntent, String paramString)
  {
    GMTrace.i(1114007142400L, 8300);
    if (filePath == null) {
      filePath = paramContext.getSharedPreferences("system_config_prefs", 0).getString("camera_file_path", null);
    }
    if ((filePath == null) || (!com.tencent.mm.a.e.aZ(filePath))) {
      filePath = com.tencent.mm.ui.tools.a.c(paramContext, paramIntent, paramString);
    }
    com.tencent.mm.platformtools.d.b(filePath, paramContext);
    paramContext = filePath;
    GMTrace.o(1114007142400L, 8300);
    return paramContext;
  }
  
  public static void b(Fragment paramFragment, int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(1113067618304L, 8293);
    a(paramFragment, 217, 9, paramInt, 3, paramString1, paramString2);
    GMTrace.o(1113067618304L, 8293);
  }
  
  public static void b(String paramString, Context paramContext)
  {
    GMTrace.i(15306323918848L, 114041);
    com.tencent.mm.platformtools.d.b(paramString, paramContext);
    GMTrace.o(15306323918848L, 114041);
  }
  
  @TargetApi(8)
  public static String bNn()
  {
    GMTrace.i(1114544013312L, 8304);
    String str = com.tencent.mm.compatible.util.e.fRZ;
    GMTrace.o(1114544013312L, 8304);
    return str;
  }
  
  public static void c(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(1113738706944L, 8298);
    paramIntent.putExtra("max_select_count", paramInt1);
    paramIntent.putExtra("query_media_type", 2);
    paramIntent.putExtra("query_source_type", paramInt2);
    paramIntent.addFlags(67108864);
    com.tencent.mm.bj.d.b(paramActivity, "gallery", ".ui.GalleryEntryUI", paramIntent, 4);
    GMTrace.o(1113738706944L, 8298);
  }
  
  public static boolean c(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(1111859658752L, 8284);
    boolean bool = d(paramActivity, paramString1, paramString2, paramInt);
    w.i("MicroMsg.TakePhotoUtil", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), Boolean.valueOf(bool) });
    GMTrace.o(1111859658752L, 8284);
    return bool;
  }
  
  private static boolean d(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(1111993876480L, 8285);
    if ((com.tencent.mm.p.a.aQ(paramActivity)) || (com.tencent.mm.p.a.aP(paramActivity)))
    {
      GMTrace.o(1111993876480L, 8285);
      return false;
    }
    filePath = paramString1 + paramString2;
    w.i("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), filePath = " + filePath);
    aY(paramActivity, filePath);
    paramString2 = new Intent("android.media.action.IMAGE_CAPTURE");
    File localFile = new File(paramString1);
    if (!localFile.exists()) {}
    try
    {
      localFile.mkdirs();
      if (!localFile.exists())
      {
        w.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), dir not exist. " + paramString1);
        GMTrace.o(1111993876480L, 8285);
        return false;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.TakePhotoUtil", localException, "", new Object[0]);
      }
      paramString2.putExtra("output", Uri.fromFile(new File(filePath)));
      try
      {
        paramActivity.startActivityForResult(paramString2, paramInt);
        GMTrace.o(1111993876480L, 8285);
        return true;
      }
      catch (Exception paramActivity)
      {
        w.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), " + paramActivity.getMessage());
        GMTrace.o(1111993876480L, 8285);
      }
    }
    return false;
  }
  
  public static void h(String paramString, Context paramContext)
  {
    GMTrace.i(1114141360128L, 8301);
    com.tencent.mm.platformtools.d.a(paramString, paramContext, a.h.qzz);
    GMTrace.o(1114141360128L, 8301);
  }
  
  public static boolean k(Fragment paramFragment)
  {
    GMTrace.i(1112664965120L, 8290);
    a(paramFragment, 200, 1, 0, 1, "", "");
    GMTrace.o(1112664965120L, 8290);
    return true;
  }
  
  public static String nd(String paramString)
  {
    GMTrace.i(1114275577856L, 8302);
    paramString = com.tencent.mm.platformtools.d.nd(paramString);
    GMTrace.o(1114275577856L, 8302);
    return paramString;
  }
  
  public static boolean x(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(1111188570112L, 8279);
    boolean bool = a(paramContext, 17, paramIntent, 2, 0);
    GMTrace.o(1111188570112L, 8279);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */