package com.tencent.mm.sandbox.monitor;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.c;
import com.tencent.mm.a.g;
import com.tencent.mm.a.o;
import com.tencent.mm.a.q;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sandbox.updater.AppUpdaterUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public final class a
{
  static final HashMap<String, Integer> fTt;
  
  static
  {
    GMTrace.i(3601866948608L, 26836);
    HashMap localHashMap = new HashMap(16);
    fTt = localHashMap;
    localHashMap.put("exception", Integer.valueOf(10001));
    fTt.put("anr", Integer.valueOf(10002));
    fTt.put("handler", Integer.valueOf(10003));
    fTt.put("sql", Integer.valueOf(10004));
    fTt.put("permission", Integer.valueOf(10005));
    fTt.put("main_thread_watch", Integer.valueOf(10006));
    GMTrace.o(3601866948608L, 26836);
  }
  
  public static int a(String paramString1, String paramString2, b.a parama)
  {
    GMTrace.i(3601330077696L, 26832);
    if (bg.nm(parama.toString()))
    {
      GMTrace.o(3601330077696L, 26832);
      return -1;
    }
    Object localObject = new File(com.tencent.mm.storage.w.ghv + "crash/");
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdir();
    }
    localObject = com.tencent.mm.storage.w.ghv + "crash/" + paramString1 + "." + paramString2 + ".crashini";
    com.tencent.mm.sdk.e.a.e((String)localObject, "count", bg.c(com.tencent.mm.sdk.e.a.eY((String)localObject, "count")) + 1L);
    if (bg.c(com.tencent.mm.sdk.e.a.eY((String)localObject, "lasttime")) == 0L) {
      com.tencent.mm.sdk.e.a.e((String)localObject, "lasttime", bg.Pv());
    }
    localObject = com.tencent.mm.storage.w.ghv + "crash/" + paramString1 + "." + paramString2 + ".crashlog";
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CrashUpload", "crash:[%s] len:[%d]", new Object[] { localObject, Integer.valueOf(parama.toString().length()) });
    a(parama);
    a((String)localObject, parama);
    int i = eO(paramString1, paramString2);
    GMTrace.o(3601330077696L, 26832);
    return i;
  }
  
  private static void a(b.a parama)
  {
    GMTrace.i(3601464295424L, 26833);
    if (!parama.veM)
    {
      GMTrace.o(3601464295424L, 26833);
      return;
    }
    Object localObject = new File(com.tencent.mm.compatible.util.e.ghA);
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdirs();
    }
    localObject = ((File)localObject).listFiles();
    if (localObject != null)
    {
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        localSimpleDateFormat = localObject[i];
        if (bg.aH(localSimpleDateFormat.lastModified()) > 604800000L)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CrashUpload", "dealWithSdcardCrash del old file: %s", new Object[] { localSimpleDateFormat.getPath() });
          localSimpleDateFormat.delete();
        }
        i += 1;
      }
    }
    localObject = new Date();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    localObject = com.tencent.mm.compatible.util.e.ghA + "crash_" + localSimpleDateFormat.format((Date)localObject) + ".txt";
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CrashUpload", "dealWithSdcardCrash %s", new Object[] { localObject });
    a((String)localObject, parama);
    GMTrace.o(3601464295424L, 26833);
  }
  
  private static void a(String paramString, b.a parama)
  {
    GMTrace.i(3601598513152L, 26834);
    int i;
    StringBuilder localStringBuilder;
    Object localObject;
    if (!new File(paramString).exists())
    {
      i = ab.getContext().getSharedPreferences("system_config_prefs", 0).getInt("default_uin", 0);
      localStringBuilder = new StringBuilder();
      if (i != 0) {
        break label346;
      }
      localObject = bg.eC(ab.getContext());
      if (bg.nm((String)localObject)) {
        break label274;
      }
      localStringBuilder.append("uin[" + (String)localObject + "] ");
    }
    for (;;)
    {
      localStringBuilder.append(com.tencent.mm.sdk.platformtools.w.bPO());
      localStringBuilder.append(" BRAND:[" + Build.BRAND + "] ");
      localObject = p.tf();
      localStringBuilder.append("c1[" + localObject[0] + "] ");
      localStringBuilder.append("c2[" + localObject[1] + "] ");
      localStringBuilder.append("\n");
      com.tencent.mm.a.e.d(paramString, localStringBuilder.toString().getBytes());
      if (com.tencent.mm.a.e.aY(paramString) > 10485760) {
        b.deleteFile(paramString);
      }
      com.tencent.mm.a.e.d(paramString, (parama.toString() + "\n").getBytes());
      GMTrace.o(3601598513152L, 26834);
      return;
      label274:
      localObject = Build.DEVICE + Build.FINGERPRINT + Build.MANUFACTURER + Build.MODEL;
      localStringBuilder.append("uin[" + Integer.toString(((String)localObject).hashCode()) + "] ");
      continue;
      label346:
      localStringBuilder.append("uin[" + o.getString(i) + "] ");
    }
  }
  
  public static int bOI()
  {
    GMTrace.i(3601061642240L, 26830);
    Object localObject = new File(com.tencent.mm.storage.w.ghv + "crash/");
    if (!((File)localObject).exists())
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.CrashUpload", "dkcrash checkUpload dir never create ?");
      GMTrace.o(3601061642240L, 26830);
      return -1;
    }
    if (((File)localObject).isFile())
    {
      ((File)localObject).delete();
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.CrashUpload", "dkcrash is the fucking file ??");
      GMTrace.o(3601061642240L, 26830);
      return -1;
    }
    String[] arrayOfString = ((File)localObject).list(new FilenameFilter()
    {
      public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        GMTrace.i(3604685520896L, 26857);
        boolean bool = paramAnonymousString.endsWith(".crashlog");
        GMTrace.o(3604685520896L, 26857);
        return bool;
      }
    });
    if ((arrayOfString == null) || (arrayOfString.length == 0))
    {
      GMTrace.o(3601061642240L, 26830);
      return -1;
    }
    Pattern localPattern = Pattern.compile(".");
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      localObject = localPattern.split(arrayOfString[i]);
      String str;
      if ((localObject != null) && (localObject.length > 0))
      {
        str = localObject[0];
        if (localObject.length < 2) {
          break label191;
        }
      }
      label191:
      for (localObject = localObject[1];; localObject = "")
      {
        eO(str, (String)localObject);
        i += 1;
        break;
      }
    }
    GMTrace.o(3601061642240L, 26830);
    return 1;
  }
  
  private static int eO(final String paramString1, final String paramString2)
  {
    GMTrace.i(3601195859968L, 26831);
    String str1 = com.tencent.mm.storage.w.ghv + "crash/" + paramString1 + "." + paramString2 + ".crashini";
    long l1 = bg.c(com.tencent.mm.sdk.e.a.eY(str1, "count"));
    long l2 = bg.c(com.tencent.mm.sdk.e.a.eY(str1, "lasttime"));
    long l3 = bg.Pv();
    String str2 = com.tencent.mm.storage.w.ghv + "crash/" + paramString1 + "." + paramString2 + ".crashlog";
    int i = com.tencent.mm.a.e.aY(str2);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CrashUpload", "dkcrash count:" + l1 + " t:" + (l3 - l2) + " len:" + i);
    if (i < 5242880)
    {
      byte[] arrayOfByte = com.tencent.mm.a.e.d(str2, 0, -1);
      if (!bg.bq(arrayOfByte))
      {
        i = arrayOfByte.length;
        final String str3 = g.n(String.format("weixin#$()%d%d", new Object[] { Integer.valueOf(d.tJC), Integer.valueOf(i) }).getBytes()).toLowerCase();
        arrayOfByte = q.l(arrayOfByte);
        final PByteArray localPByteArray = new PByteArray();
        c.a(localPByteArray, arrayOfByte, str3.getBytes());
        com.tencent.mm.sdk.f.e.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(3600927424512L, 26829);
            Object localObject = ab.getContext().getSharedPreferences("system_config_prefs", 0);
            localObject = "http://" + ((SharedPreferences)localObject).getString("support.weixin.qq.com", "support.weixin.qq.com");
            localObject = new StringBuilder().append((String)localObject).append("/cgi-bin/mmsupport-bin/stackreport?version=").append(Integer.toHexString(d.tJC)).append("&devicetype=").append(d.DEVICE_TYPE).append("&filelength=").append(this.qAj).append("&sum=").append(str3).append("&reporttype=1&NewReportType=").append(bg.e((Integer)a.fTt.get(paramString2)));
            if ((paramString1 != null) && (!paramString1.equals(""))) {
              ((StringBuilder)localObject).append("&username=").append(paramString1);
            }
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CrashUpload", "dkcrash sb:" + ((StringBuilder)localObject).toString());
            a.v(((StringBuilder)localObject).toString(), localPByteArray.value);
            GMTrace.o(3600927424512L, 26829);
          }
        }, "CrashUpload_upload");
      }
    }
    b.deleteFile(str2);
    new com.tencent.mm.sdk.e.a(str1).cI("count", 0);
    com.tencent.mm.sdk.e.a.e(str1, "lasttime", bg.Pv());
    GMTrace.o(3601195859968L, 26831);
    return 1;
  }
  
  public static void v(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(16022643933184L, 119378);
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CrashUpload", "doPost : url = " + paramString + ", data.length = " + paramArrayOfByte.length);
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
    paramString = new HttpPost(paramString);
    try
    {
      paramArrayOfByte = new ByteArrayEntity(paramArrayOfByte);
      paramArrayOfByte.setContentType("binary/octet-stream");
      paramString.setEntity(paramArrayOfByte);
      paramString = bg.convertStreamToString(localDefaultHttpClient.execute(paramString).getEntity().getContent());
      if ((paramString != null) && (paramString.length() > 0))
      {
        paramArrayOfByte = bh.q(paramString, "Response");
        if ((paramArrayOfByte != null) && ("-1000".equalsIgnoreCase((String)paramArrayOfByte.get(".Response.retCode"))) && (paramArrayOfByte.get(".Response.url") != null)) {
          new Timer().schedule(new TimerTask()
          {
            public final void run()
            {
              GMTrace.i(3602135384064L, 26838);
              Intent localIntent = new Intent(ab.getContext(), AppUpdaterUI.class);
              localIntent.addFlags(268435456);
              localIntent.putExtra("intent_extra_desc", (String)this.veL.get(".Response.desc"));
              localIntent.putExtra("intent_update_type", 999);
              localIntent.putExtra("intent_extra_download_url", new String[] { (String)this.veL.get(".Response.url") });
              ab.getContext().startActivity(localIntent);
              GMTrace.o(3602135384064L, 26838);
            }
          }, 500L);
        }
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CrashUpload", paramString);
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CrashUpload", "doPost: returnConnection = %s", new Object[] { paramString });
      GMTrace.o(16022643933184L, 119378);
      return;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CrashUpload", paramString, "", new Object[0]);
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CrashUpload", "doPost e type: %s, msg: %s", new Object[] { paramString.getClass().getSimpleName(), paramString.getMessage() });
      GMTrace.o(16022643933184L, 119378);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\monitor\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */