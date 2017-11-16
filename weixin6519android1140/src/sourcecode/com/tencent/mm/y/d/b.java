package com.tencent.mm.y.d;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.IPackageStatsObserver.Stub;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.database.Cursor;
import android.os.Process;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.aw.m;
import com.tencent.mm.aw.n;
import com.tencent.mm.aw.t;
import com.tencent.mm.bu.g;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class b
  implements c.a
{
  private static final String esG;
  private static final String esH;
  private static b gqB;
  public static final String gqC;
  public static List<String> gqL;
  public long[] esK;
  private SharedPreferences ghC;
  public long gqD;
  public long gqE;
  public long gqF;
  public long gqG;
  public long gqH;
  public long gqI;
  public long gqJ;
  private long gqK;
  public long gqh;
  public volatile boolean gqi;
  
  static
  {
    GMTrace.i(610288009216L, 4547);
    String str = p.ta();
    esG = str;
    esH = o.getString(str.hashCode());
    gqC = com.tencent.mm.compatible.util.e.ghx + "/tencent/MicroMsg/SQLTrace/";
    gqL = Arrays.asList(new String[] { "FTS5IndexMicroMsg.db" });
    GMTrace.o(610288009216L, 4547);
  }
  
  public b()
  {
    GMTrace.i(606261477376L, 4517);
    this.gqi = false;
    this.esK = new long[] { 0L, 0L, 0L };
    this.gqh = 0L;
    this.ghC = ab.bPV();
    CB();
    GMTrace.o(606261477376L, 4517);
  }
  
  public static b CA()
  {
    GMTrace.i(606127259648L, 4516);
    if (gqB == null) {
      gqB = new b();
    }
    b localb = gqB;
    GMTrace.o(606127259648L, 4516);
    return localb;
  }
  
  private void CB()
  {
    GMTrace.i(606395695104L, 4518);
    this.gqD = this.ghC.getLong("sql_trace_main_thread_select_interval_time", 300L);
    this.gqE = this.ghC.getLong("sql_trace_main_thread_update_interval_time", 500L);
    this.gqF = this.ghC.getLong("sql_trace_child_thread_interval_time", 1500L);
    long l = aY(ab.getContext());
    if (l > 0L)
    {
      this.gqD += l;
      this.gqE += l;
      this.gqF += l;
      w.i("MicroMsg.SQLTraceManager", "auto adapte Time %d", new Object[] { Long.valueOf(l) });
    }
    this.gqG = this.ghC.getLong("sql_trace_child_transaction_interval_time", 5000L);
    this.gqK = this.ghC.getLong("sql_trace_file_full_size", 30720L);
    this.gqH = this.ghC.getLong("sql_trace_log_file_max_size", 35840L);
    this.gqI = this.ghC.getLong("sql_trace_upload_file_min_size", 10240L);
    this.gqJ = this.ghC.getLong("sql_upload_time_interval", 21600000L);
    k(new File(gqC, "MMSQL.trace"));
    w.i("MicroMsg.SQLTraceManager", "update arg %d %d %d %d %d %d %d %d", new Object[] { Long.valueOf(this.gqD), Long.valueOf(this.gqE), Long.valueOf(this.gqF), Long.valueOf(this.gqG), Long.valueOf(this.gqK), Long.valueOf(this.gqH), Long.valueOf(this.gqI), Long.valueOf(this.gqJ) });
    GMTrace.o(606395695104L, 4518);
  }
  
  private String Cx()
  {
    GMTrace.i(607066783744L, 4523);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
    localPrintStream.println("#client.version=" + d.tJC);
    localPrintStream.println("#accinfo.revision=" + com.tencent.mm.sdk.platformtools.e.REV);
    localPrintStream.println("#accinfo.uin=" + as.gnb.B("last_login_uin", esH));
    localPrintStream.println("#accinfo.dev=" + esG);
    localPrintStream.println("#accinfo.build=" + com.tencent.mm.sdk.platformtools.e.TIME + ":" + com.tencent.mm.sdk.platformtools.e.HOSTNAME + ":" + f.eqV);
    try
    {
      localObject1 = com.tencent.mm.compatible.util.h.getDataDirectory();
      Object localObject2 = new StatFs(((File)localObject1).getPath());
      StatFs localStatFs = new StatFs(com.tencent.mm.compatible.util.e.ghx);
      localObject1 = String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", new Object[] { Integer.valueOf(((ActivityManager)ab.getContext().getSystemService("activity")).getMemoryClass()), ((File)localObject1).getAbsolutePath(), Integer.valueOf(((StatFs)localObject2).getBlockSize()), Integer.valueOf(((StatFs)localObject2).getBlockCount()), Integer.valueOf(((StatFs)localObject2).getAvailableBlocks()), com.tencent.mm.compatible.util.e.ghx, Integer.valueOf(localStatFs.getBlockSize()), Integer.valueOf(localStatFs.getBlockCount()), Integer.valueOf(localStatFs.getAvailableBlocks()) });
      localPrintStream.println("#accinfo.data=" + (String)localObject1);
      localObject1 = new Date();
      localObject2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
      localPrintStream.println("#accinfo.uploadTime=" + ((SimpleDateFormat)localObject2).format((Date)localObject1));
      long l1 = aY(ab.getContext());
      if (l1 > 0L) {
        localPrintStream.println("#logfile.autoAdapteTime :" + l1);
      }
      if (aX(ab.getContext()) != 0L)
      {
        long l2 = aX(ab.getContext()) - aW(ab.getContext());
        localPrintStream.println("#logfile.fulllast :" + l2);
        if ((l2 > 0L) && (l2 < 28800000L))
        {
          l1 += 100L;
          PreferenceManager.getDefaultSharedPreferences(ab.getContext()).edit().putLong("sql_trace_log_autoAdaptaTime", l1).commit();
          w.i("MicroMsg.SQLTraceManager", "auto Adapte Time to %d", new Object[] { Long.valueOf(l1) });
          CB();
        }
        localObject1 = t.Kj().gJ(21);
        if ((localObject1 != null) && (localObject1.length != 0) && (localObject1[0] != null)) {
          break label989;
        }
        localPrintStream.println("#traceconfig hardcode");
        if (this.esK[1] != -1L) {
          localPrintStream.println("#wxpackage :cache size=" + this.esK[0] + " data size= " + this.esK[1] + " code size =" + this.esK[2]);
        }
        localObject1 = new StringBuilder("#dbsize : EnMicroMsg.db size=");
        at.AR();
        localPrintStream.println(new File(c.xf()).length());
        localObject1 = new StringBuilder("#dbsize : SnsMicroMsg.db size=");
        localObject2 = new StringBuilder();
        at.AR();
        localPrintStream.println(new File(((StringBuilder)localObject2).append(c.zn()).append("SnsMicroMsg.db").toString()).length());
        at.AR();
        a(c.yI(), localPrintStream, Arrays.asList(new String[] { "message", "rconversation", "rcontact", "ImgInfo2", "BizInfo", "img_flag", "fmessage_conversation", "AppInfo", "AppMessage", "EmojiInfo", "EmojiGroupInfo", "bottleconversation", "bottlemessage", "chatroom", "rbottleconversation", "userinfo" }));
        localPrintStream.println("#sql.content:");
        localObject1 = localByteArrayOutputStream.toString();
      }
    }
    catch (Exception localException1)
    {
      try
      {
        String str;
        for (;;)
        {
          Object localObject1;
          localByteArrayOutputStream.close();
          GMTrace.o(607066783744L, 4523);
          return (String)localObject1;
          localException1 = localException1;
          w.e("MicroMsg.SQLTraceManager", "check data size failed :%s", new Object[] { localException1.getMessage() });
          str = "";
          continue;
          localPrintStream.println("#logfile.fullTimelast :" + (System.currentTimeMillis() - aW(ab.getContext())));
        }
        label989:
        localPrintStream.println("#traceconfig id=" + str[0].id + " version=" + str[0].version);
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
    }
  }
  
  private static long a(String paramString, g paramg)
  {
    GMTrace.i(606932566016L, 4522);
    paramString = paramg.a("select count(*) from " + paramString, null, 2);
    long l = 0L;
    if (paramString.moveToFirst()) {
      l = paramString.getLong(0);
    }
    paramString.close();
    GMTrace.o(606932566016L, 4522);
    return l;
  }
  
  private static void a(g paramg, PrintStream paramPrintStream, List<String> paramList)
  {
    GMTrace.i(607201001472L, 4524);
    if ((paramg == null) || (!paramg.isOpen()))
    {
      w.i("MicroMsg.SQLTraceManager", "db is not open!");
      GMTrace.o(607201001472L, 4524);
      return;
    }
    long l = System.currentTimeMillis();
    if ((paramList != null) && (paramList.size() > 0)) {
      paramList = paramList.iterator();
    }
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      paramPrintStream.println("#table : " + str + " count=" + a(str, paramg));
      continue;
      paramList = paramg.a("select name from sqlite_master where type='table' ", null, 2);
      while (paramList.moveToNext())
      {
        str = paramList.getString(0);
        paramPrintStream.println("#table : " + str + " count=" + a(str, paramg));
      }
      paramList.close();
    }
    w.i("MicroMsg.SQLTraceManager", "dump all table count last %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(607201001472L, 4524);
  }
  
  public static void a(String paramString1, String paramString2, StringBuilder paramStringBuilder)
  {
    GMTrace.i(607335219200L, 4525);
    paramStringBuilder.append(paramString1).append(":").append(paramString2).append(" ");
    GMTrace.o(607335219200L, 4525);
  }
  
  public static long aV(Context paramContext)
  {
    GMTrace.i(607872090112L, 4529);
    long l = PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("sql_report_lastUploadTime", 0L);
    GMTrace.o(607872090112L, 4529);
    return l;
  }
  
  private static long aW(Context paramContext)
  {
    GMTrace.i(608006307840L, 4530);
    long l = PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("sql_trace_log_file_create_time", 0L);
    GMTrace.o(608006307840L, 4530);
    return l;
  }
  
  private static long aX(Context paramContext)
  {
    GMTrace.i(608274743296L, 4532);
    long l = PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("sql_trace_log_file_full_time", 0L);
    GMTrace.o(608274743296L, 4532);
    return l;
  }
  
  private static long aY(Context paramContext)
  {
    GMTrace.i(608408961024L, 4533);
    long l = PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("sql_trace_log_autoAdaptaTime", 0L);
    GMTrace.o(608408961024L, 4533);
    return l;
  }
  
  public static void b(Context paramContext, long paramLong)
  {
    GMTrace.i(607737872384L, 4528);
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putLong("sql_report_lastUploadTime", paramLong).commit();
    GMTrace.o(607737872384L, 4528);
  }
  
  private static void c(Context paramContext, long paramLong)
  {
    GMTrace.i(608140525568L, 4531);
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putLong("sql_trace_log_file_full_time", paramLong).commit();
    GMTrace.o(608140525568L, 4531);
  }
  
  /* Error */
  public static String hm(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 619
    //   3: sipush 4521
    //   6: invokestatic 47	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 212	java/io/File
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 439	java/io/File:<init>	(Ljava/lang/String;)V
    //   17: astore_0
    //   18: new 622	java/io/FileInputStream
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 624	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   26: astore_0
    //   27: aload_0
    //   28: invokevirtual 627	java/io/FileInputStream:available	()I
    //   31: newarray <illegal type>
    //   33: astore_1
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual 631	java/io/FileInputStream:read	([B)I
    //   39: pop
    //   40: new 57	java/lang/String
    //   43: dup
    //   44: aload_1
    //   45: invokestatic 637	com/tencent/mm/bw/e:bt	([B)[B
    //   48: invokespecial 640	java/lang/String:<init>	([B)V
    //   51: astore_1
    //   52: aload_0
    //   53: invokevirtual 641	java/io/FileInputStream:close	()V
    //   56: ldc2_w 619
    //   59: sipush 4521
    //   62: invokestatic 103	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   65: aload_1
    //   66: areturn
    //   67: astore_0
    //   68: ldc -89
    //   70: aload_0
    //   71: ldc_w 506
    //   74: iconst_0
    //   75: anewarray 4	java/lang/Object
    //   78: invokestatic 645	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: goto -25 -> 56
    //   84: astore_0
    //   85: aconst_null
    //   86: astore_0
    //   87: aload_0
    //   88: ifnull +7 -> 95
    //   91: aload_0
    //   92: invokevirtual 641	java/io/FileInputStream:close	()V
    //   95: ldc2_w 619
    //   98: sipush 4521
    //   101: invokestatic 103	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   104: aconst_null
    //   105: areturn
    //   106: astore_0
    //   107: ldc -89
    //   109: aload_0
    //   110: ldc_w 506
    //   113: iconst_0
    //   114: anewarray 4	java/lang/Object
    //   117: invokestatic 645	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: goto -25 -> 95
    //   123: astore_1
    //   124: aconst_null
    //   125: astore_0
    //   126: aload_0
    //   127: ifnull +7 -> 134
    //   130: aload_0
    //   131: invokevirtual 641	java/io/FileInputStream:close	()V
    //   134: aload_1
    //   135: athrow
    //   136: astore_0
    //   137: ldc -89
    //   139: aload_0
    //   140: ldc_w 506
    //   143: iconst_0
    //   144: anewarray 4	java/lang/Object
    //   147: invokestatic 645	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: goto -16 -> 134
    //   153: astore_1
    //   154: goto -28 -> 126
    //   157: astore_1
    //   158: goto -71 -> 87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	paramString	String
    //   33	33	1	localObject1	Object
    //   123	12	1	localObject2	Object
    //   153	1	1	localObject3	Object
    //   157	1	1	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   52	56	67	java/lang/Exception
    //   18	27	84	java/io/IOException
    //   91	95	106	java/lang/Exception
    //   18	27	123	finally
    //   130	134	136	java/lang/Exception
    //   27	52	153	finally
    //   27	52	157	java/io/IOException
  }
  
  public static void setup()
  {
    GMTrace.i(606529912832L, 4519);
    if (ab.vin)
    {
      boolean bool = com.tencent.mm.loader.stub.b.deleteFile(gqC + "MMSQL.trace");
      w.i("MicroMsg.SQLTraceManager", "trace setup delete old file ret: " + bool);
    }
    GMTrace.o(606529912832L, 4519);
  }
  
  public final void Cy()
  {
    GMTrace.i(608543178752L, 4534);
    w.i("MicroMsg.SQLTraceManager", "updateIntervalArg ");
    CB();
    GMTrace.o(608543178752L, 4534);
  }
  
  public final void a(File paramFile, boolean paramBoolean)
  {
    GMTrace.i(607603654656L, 4527);
    w.i("MicroMsg.SQLTraceManager", "build log file ,needRecreate %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramFile.exists())
    {
      if (!paramBoolean) {
        break label90;
      }
      paramFile.delete();
    }
    try
    {
      paramFile.createNewFile();
      Context localContext = ab.getContext();
      long l = System.currentTimeMillis();
      PreferenceManager.getDefaultSharedPreferences(localContext).edit().putLong("sql_trace_log_file_create_time", l).commit();
      c(ab.getContext(), 0L);
      label90:
      k(paramFile);
      GMTrace.o(607603654656L, 4527);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.e("MicroMsg.SQLTraceManager", "recreate log file fail");
      }
    }
  }
  
  public final void hn(String paramString)
  {
    GMTrace.i(607469436928L, 4526);
    String str1 = paramString;
    if (paramString == null) {
      str1 = "";
    }
    Intent localIntent = new Intent();
    localIntent.setClassName(ab.getPackageName(), "com.tencent.mm.sandbox.monitor.ExceptionMonitorService");
    localIntent.setAction("uncatch_exception");
    localIntent.putExtra("exceptionPid", Process.myPid());
    String str2 = as.gnb.B("login_weixin_username", "");
    paramString = str2;
    if (bg.nm(str2)) {
      paramString = as.gnb.B("login_user_name", "never_login_crash");
    }
    localIntent.putExtra("userName", paramString);
    localIntent.putExtra("tag", "SqlTrace");
    localIntent.putExtra("exceptionMsg", Base64.encodeToString((Cx() + str1).getBytes(), 2));
    ab.getContext().startService(localIntent);
    GMTrace.o(607469436928L, 4526);
  }
  
  void k(File paramFile)
  {
    boolean bool2 = true;
    GMTrace.i(606664130560L, 4520);
    if (paramFile.exists())
    {
      long l;
      if (paramFile.length() > this.gqK)
      {
        bool1 = true;
        this.gqi = bool1;
        if (!this.gqi) {
          break label121;
        }
        l = aX(ab.getContext());
        if (l == 0L) {
          break label111;
        }
      }
      label111:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        w.i("MicroMsg.SQLTraceManager", "has mark lastFullTime %b", new Object[] { Boolean.valueOf(bool1) });
        if (l == 0L) {
          c(ab.getContext(), System.currentTimeMillis());
        }
        GMTrace.o(606664130560L, 4520);
        return;
        bool1 = false;
        break;
      }
    }
    else
    {
      this.gqi = false;
    }
    label121:
    GMTrace.o(606664130560L, 4520);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */