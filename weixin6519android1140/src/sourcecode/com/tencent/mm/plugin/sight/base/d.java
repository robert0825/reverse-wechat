package com.tencent.mm.plugin.sight.base;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Environment;
import android.os.StatFs;
import android.util.StringBuilderPrinter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.u;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.q;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

public final class d
{
  public static int mWA;
  private static int mWz;
  
  static
  {
    GMTrace.i(9374034558976L, 69842);
    mWz = 0;
    mWA = 0;
    GMTrace.o(9374034558976L, 69842);
  }
  
  public static String CG(String paramString)
  {
    GMTrace.i(9373363470336L, 69837);
    StringBuffer localStringBuffer = new StringBuffer();
    String str = a(paramString, new PInt(), new PInt(), new PInt(), new PInt(), new PInt());
    localStringBuffer.append("extInfo: \n" + str);
    localStringBuffer.append("size: " + bg.aF(FileOp.kX(paramString)) + ":" + paramString + "\n");
    str = SightVideoJNI.getMp4RecordInfo(paramString);
    if (!bg.nm(str)) {
      localStringBuffer.append(str);
    }
    localStringBuffer.append("isH265:").append(q.me(paramString));
    paramString = localStringBuffer.toString();
    GMTrace.o(9373363470336L, 69837);
    return paramString;
  }
  
  public static boolean GA(String paramString)
  {
    GMTrace.i(9373095034880L, 69835);
    if ((bg.nm(paramString)) || (!com.tencent.mm.a.e.aZ(paramString)))
    {
      GMTrace.o(9373095034880L, 69835);
      return false;
    }
    long l = bg.Pw();
    c localc = new c();
    int i = SightVideoJNI.isSightOk(paramString, localc.oRL, localc.oRM, localc.oRN, localc.oRP, localc.oRO, localc.oRO.length);
    w.d("MicroMsg.SightUtil", "ashu::check sight use %dms", new Object[] { Long.valueOf(bg.aI(l)) });
    if (i == 0)
    {
      GMTrace.o(9373095034880L, 69835);
      return true;
    }
    GMTrace.o(9373095034880L, 69835);
    return false;
  }
  
  public static a GB(String paramString)
  {
    GMTrace.i(9373631905792L, 69839);
    if (bg.nm(paramString))
    {
      GMTrace.o(9373631905792L, 69839);
      return null;
    }
    if (!com.tencent.mm.a.e.aZ(paramString))
    {
      GMTrace.o(9373631905792L, 69839);
      return null;
    }
    a locala = new a();
    try
    {
      paramString = SightVideoJNI.getSimpleMp4Info(paramString);
      w.d("MicroMsg.SightUtil", "get simple mp4 info %s", new Object[] { paramString });
      paramString = new JSONObject(paramString);
      locala.ljb = ((int)paramString.getDouble("videoDuration"));
      locala.width = paramString.getInt("videoWidth");
      locala.height = paramString.getInt("videoHeight");
      locala.ncj = ((int)paramString.getDouble("videoFPS"));
      locala.videoBitrate = paramString.getInt("videoBitrate");
      locala.gBk = paramString.getInt("audioBitrate");
      locala.oRA = paramString.getInt("audioChannel");
      w.i("MicroMsg.SightUtil", "get media %s", new Object[] { locala });
      GMTrace.o(9373631905792L, 69839);
      return locala;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.SightUtil", "get media info error %s", new Object[] { paramString.toString() });
      }
    }
  }
  
  public static String Gy(String paramString)
  {
    GMTrace.i(9372558163968L, 69831);
    paramString = bg.aq(paramString, "") + ".thumb";
    GMTrace.o(9372558163968L, 69831);
    return paramString;
  }
  
  public static String Gz(String paramString)
  {
    GMTrace.i(9372692381696L, 69832);
    paramString = bg.aq(paramString, "") + ".soundmp4";
    GMTrace.o(9372692381696L, 69832);
    return paramString;
  }
  
  public static Bitmap O(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(9372960817152L, 69834);
    if (bg.nm(paramString))
    {
      GMTrace.o(9372960817152L, 69834);
      return null;
    }
    Bitmap localBitmap = ThumbnailUtils.createVideoThumbnail(paramString, 1);
    if (localBitmap == null) {
      w.e("MicroMsg.SightUtil", "create remux thumb bmp error, target path %s", new Object[] { paramString });
    }
    for (paramString = localBitmap;; paramString = com.tencent.mm.sdk.platformtools.d.a(localBitmap, paramInt2, paramInt1, true, true))
    {
      GMTrace.o(9372960817152L, 69834);
      return paramString;
    }
  }
  
  public static String a(String paramString, PInt paramPInt1, PInt paramPInt2, PInt paramPInt3, PInt paramPInt4, PInt paramPInt5)
  {
    GMTrace.i(9373497688064L, 69838);
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      paramString = SightVideoJNI.getSimpleMp4Info(paramString);
      w.d("MicroMsg.SightUtil", "get simple mp4 info %s", new Object[] { paramString });
      paramString = new JSONObject(paramString);
      paramPInt1.value = ((int)paramString.getDouble("videoDuration"));
      paramPInt2.value = paramString.getInt("videoWidth");
      paramPInt3.value = paramString.getInt("videoHeight");
      paramPInt4.value = ((int)paramString.getDouble("videoFPS"));
      paramPInt5.value = paramString.getInt("videoBitrate");
      localStringBuffer.append("videoBitrate: ").append(paramPInt5.value).append("\n");
      localStringBuffer.append("videoWidth,videoHeight: ").append(paramPInt2.value).append("*").append(paramPInt3.value);
      localStringBuffer.append(" ").append(String.format("%.4f", new Object[] { Double.valueOf(paramPInt2.value * 1.0D / paramPInt3.value) })).append("\n");
      localStringBuffer.append("videoDuration: ").append(paramPInt1.value).append("\n");
      localStringBuffer.append("videoFPS: ").append(paramPInt4.value).append("\n");
      paramString = localStringBuffer.toString();
      GMTrace.o(9373497688064L, 69838);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.SightUtil", paramString, "get media info error", new Object[0]);
      }
    }
  }
  
  public static boolean bgh()
  {
    GMTrace.i(9372155510784L, 69828);
    if (p.fQE.fRl == 0)
    {
      GMTrace.o(9372155510784L, 69828);
      return false;
    }
    boolean bool = com.tencent.mm.compatible.util.d.et(14);
    GMTrace.o(9372155510784L, 69828);
    return bool;
  }
  
  public static String bgi()
  {
    GMTrace.i(9373229252608L, 69836);
    StringBuilder localStringBuilder = new StringBuilder(512);
    StringBuilderPrinter localStringBuilderPrinter = new StringBuilderPrinter(localStringBuilder);
    Object localObject2 = ab.getContext();
    localStringBuilderPrinter.println("#accinfo.revision=" + com.tencent.mm.sdk.platformtools.e.REV);
    localStringBuilderPrinter.println("#accinfo.build=" + com.tencent.mm.sdk.platformtools.e.TIME + ":" + com.tencent.mm.sdk.platformtools.e.HOSTNAME + ":" + f.eqV);
    Object localObject3 = new StringBuilder("#accinfo.env=");
    Object localObject1;
    if (b.foreground) {
      localObject1 = "f";
    }
    for (;;)
    {
      localStringBuilderPrinter.println((String)localObject1 + ":" + Thread.currentThread().getName() + ":" + b.vgQ);
      localStringBuilderPrinter.println("#aacinfo.device_brand=" + com.tencent.mm.protocal.d.tJv);
      localStringBuilderPrinter.println("#aacinfo.device_model=" + com.tencent.mm.protocal.d.tJw);
      localStringBuilderPrinter.println("#aacinfo.os_type=" + com.tencent.mm.protocal.d.tJx);
      localStringBuilderPrinter.println("#aacinfo.os_name=" + com.tencent.mm.protocal.d.tJy);
      localStringBuilderPrinter.println("#aacinfo.os_version=" + com.tencent.mm.protocal.d.tJz);
      localStringBuilderPrinter.println("#aacinfo.device_name=" + com.tencent.mm.protocal.d.tJA);
      try
      {
        localObject1 = Environment.getDataDirectory();
        localObject3 = new StatFs(((File)localObject1).getPath());
        StatFs localStatFs = new StatFs(com.tencent.mm.compatible.util.e.ghx);
        localObject1 = String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", new Object[] { Integer.valueOf(((ActivityManager)((Context)localObject2).getSystemService("activity")).getMemoryClass()), ((File)localObject1).getAbsolutePath(), Integer.valueOf(((StatFs)localObject3).getBlockSize()), Integer.valueOf(((StatFs)localObject3).getBlockCount()), Integer.valueOf(((StatFs)localObject3).getAvailableBlocks()), com.tencent.mm.compatible.util.e.ghx, Integer.valueOf(localStatFs.getBlockSize()), Integer.valueOf(localStatFs.getBlockCount()), Integer.valueOf(localStatFs.getAvailableBlocks()) });
        localStringBuilderPrinter.println("#accinfo.data=" + (String)localObject1);
        localObject1 = new Date();
        localObject2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
        localStringBuilderPrinter.println("#accinfo.crashTime=" + ((SimpleDateFormat)localObject2).format((Date)localObject1));
        localStringBuilderPrinter.println("#crashContent=");
        localObject1 = localStringBuilder.toString();
        GMTrace.o(9373229252608L, 69836);
        return (String)localObject1;
        localObject1 = "b";
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.SightUtil", "check data size failed :%s", new Object[] { localException.getMessage() });
          String str = "";
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\sight\base\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */