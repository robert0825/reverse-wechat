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
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.aw.m;
import com.tencent.mm.aw.n;
import com.tencent.mm.aw.t;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ae.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ai.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

public class a
  implements c.a
{
  private static final String esG;
  private static final String esH;
  public static String esI;
  private static a gqe;
  static final String gqf;
  public static final String gqg;
  public static final long gqj;
  public static SimpleDateFormat sDateFormat;
  public long[] esK;
  public SharedPreferences ghC;
  public long gqh;
  public volatile boolean gqi;
  public long gqk;
  public long gql;
  private long gqm;
  public long gqn;
  public long gqo;
  private long gqp;
  public long gqq;
  public int gqr;
  public int gqs;
  public int gqt;
  public Long[] gqu;
  public long gqv;
  private String gqw;
  public LinkedList<a> gqx;
  
  static
  {
    GMTrace.i(605724606464L, 4513);
    String str = p.ta();
    esG = str;
    esH = o.getString(str.hashCode());
    gqf = com.tencent.mm.compatible.util.e.ghx + "/tencent/MicroMsg/Handler/";
    gqg = gqf + "Handler.trace";
    gqj = Looper.getMainLooper().getThread().getId();
    sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");
    esI = "";
    GMTrace.o(605724606464L, 4513);
  }
  
  private a()
  {
    GMTrace.i(601295421440L, 4480);
    this.esK = new long[] { 0L, 0L, 0L };
    this.gqh = 0L;
    this.gqi = false;
    this.gqk = 8000L;
    this.gql = 800L;
    this.gqm = 25600L;
    this.gqn = 35840L;
    this.gqo = 86400000L;
    this.gqp = 180000L;
    this.gqq = 5000L;
    this.gqr = 120;
    this.gqs = 50;
    this.gqt = 1800000;
    this.ghC = ab.bPV();
    this.gqu = new Long[18];
    this.gqv = 0L;
    this.gqw = "";
    this.gqx = new LinkedList();
    this.gqk = this.ghC.getLong("handler_debug_log_time", 8000L);
    this.gql = this.ghC.getLong("handler_debug_log_time_main", 800L);
    this.gqm = this.ghC.getLong("handler_trace_file_full_size", 25600L);
    this.gqn = this.ghC.getLong("handler_log_file_max_size", 35840L);
    this.gqo = this.ghC.getLong("handler_upload_time_interval", 86400000L);
    Arrays.fill(this.gqu, Long.valueOf(0L));
    GMTrace.o(601295421440L, 4480);
  }
  
  public static a Cw()
  {
    GMTrace.i(601429639168L, 4481);
    if (gqe == null) {}
    try
    {
      if (gqe == null) {
        gqe = new a();
      }
      a locala = gqe;
      GMTrace.o(601429639168L, 4481);
      return locala;
    }
    finally {}
  }
  
  /* Error */
  public static String hm(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 253
    //   3: sipush 4484
    //   6: invokestatic 66	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 256	java/io/File
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 257	java/io/File:<init>	(Ljava/lang/String;)V
    //   17: astore_0
    //   18: new 259	java/io/FileInputStream
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 262	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   26: astore_0
    //   27: aload_0
    //   28: invokevirtual 265	java/io/FileInputStream:available	()I
    //   31: newarray <illegal type>
    //   33: astore_1
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual 269	java/io/FileInputStream:read	([B)I
    //   39: pop
    //   40: new 76	java/lang/String
    //   43: dup
    //   44: aload_1
    //   45: invokestatic 275	com/tencent/mm/bw/e:bt	([B)[B
    //   48: invokespecial 278	java/lang/String:<init>	([B)V
    //   51: astore_1
    //   52: aload_0
    //   53: invokevirtual 281	java/io/FileInputStream:close	()V
    //   56: ldc2_w 253
    //   59: sipush 4484
    //   62: invokestatic 147	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   65: aload_1
    //   66: areturn
    //   67: astore_0
    //   68: aconst_null
    //   69: astore_0
    //   70: aload_0
    //   71: ifnull +7 -> 78
    //   74: aload_0
    //   75: invokevirtual 281	java/io/FileInputStream:close	()V
    //   78: ldc2_w 253
    //   81: sipush 4484
    //   84: invokestatic 147	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   87: aconst_null
    //   88: areturn
    //   89: astore_1
    //   90: aconst_null
    //   91: astore_0
    //   92: aload_0
    //   93: ifnull +7 -> 100
    //   96: aload_0
    //   97: invokevirtual 281	java/io/FileInputStream:close	()V
    //   100: aload_1
    //   101: athrow
    //   102: astore_0
    //   103: goto -47 -> 56
    //   106: astore_0
    //   107: goto -29 -> 78
    //   110: astore_0
    //   111: goto -11 -> 100
    //   114: astore_1
    //   115: goto -23 -> 92
    //   118: astore_1
    //   119: goto -49 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	paramString	String
    //   33	33	1	localObject1	Object
    //   89	12	1	localObject2	Object
    //   114	1	1	localObject3	Object
    //   118	1	1	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   18	27	67	java/io/IOException
    //   18	27	89	finally
    //   52	56	102	java/lang/Exception
    //   74	78	106	java/lang/Exception
    //   96	100	110	java/lang/Exception
    //   27	52	114	finally
    //   27	52	118	java/io/IOException
  }
  
  final String Cx()
  {
    GMTrace.i(601698074624L, 4483);
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
      long l1 = this.ghC.getLong("handler_trace_log_file_full_time", 0L);
      long l2 = this.ghC.getLong("handler_trace_log_file_create_time", 0L);
      localPrintStream.println("#logfile.fulllast :" + (l1 - l2));
      if (this.esK[1] != -1L) {
        localPrintStream.println("#wxpackage :cache size=" + this.esK[0] + " data size=" + this.esK[1] + " code size=" + this.esK[2]);
      }
      localObject1 = t.Kj().gJ(21);
      if ((localObject1 == null) || (localObject1.length == 0) || (localObject1[0] == null))
      {
        localPrintStream.println("#traceconfig hardcode");
        localPrintStream.println("#handler.content:");
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
          GMTrace.o(601698074624L, 4483);
          return (String)localObject1;
          localException1 = localException1;
          w.e("MicroMsg.HandlerTraceManager", "summer check data size failed :%s", new Object[] { localException1.getMessage() });
          str = "";
        }
        localPrintStream.println("#traceconfig id=" + str[0].id + " version=" + str[0].version);
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
    }
  }
  
  public final void Cy()
  {
    GMTrace.i(602100727808L, 4486);
    w.i("MicroMsg.HandlerTraceManager", "summerc onUpdateComplete");
    this.gqk = this.ghC.getLong("handler_debug_log_time", 8000L);
    this.gql = this.ghC.getLong("handler_debug_log_time_main", 800L);
    this.gqm = this.ghC.getLong("handler_trace_file_full_size", 25600L);
    this.gqn = this.ghC.getLong("handler_log_file_max_size", 35840L);
    this.gqo = this.ghC.getLong("handler_upload_time_interval", 86400000L);
    this.gqp = this.ghC.getLong("handler_worker_assert_time", 180000L);
    this.gqq = this.ghC.getLong("handler_worker_warn_time", 5000L);
    this.gqr = ((int)this.ghC.getLong("handler_worker_warn_task_max_size", 120L));
    this.gqs = ((int)this.ghC.getLong("handler_worker_warn_task_keep_size", 50L));
    this.gqt = ((int)this.ghC.getLong("handler_worker_warn_task_keep_size", 1800000L));
    k(new File(gqg));
    GMTrace.o(602100727808L, 4486);
  }
  
  public final void a(File paramFile, boolean paramBoolean)
  {
    GMTrace.i(601966510080L, 4485);
    w.i("MicroMsg.HandlerTraceManager", "build log file ,needRecreate %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramFile.exists())
    {
      if (!paramBoolean) {
        break label89;
      }
      paramFile.delete();
    }
    try
    {
      paramFile.createNewFile();
      SharedPreferences.Editor localEditor = this.ghC.edit();
      localEditor.putLong("handler_trace_log_file_create_time", System.currentTimeMillis());
      localEditor.putLong("handler_trace_log_file_full_time", 0L).commit();
      label89:
      k(paramFile);
      GMTrace.o(601966510080L, 4485);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.e("MicroMsg.HandlerTraceManager", "recreate log file fail");
      }
    }
  }
  
  void k(File paramFile)
  {
    boolean bool2 = true;
    GMTrace.i(601563856896L, 4482);
    if (paramFile.exists())
    {
      long l;
      if (paramFile.length() > this.gqm)
      {
        bool1 = true;
        this.gqi = bool1;
        if (!this.gqi) {
          break label146;
        }
        l = this.ghC.getLong("handler_trace_log_file_full_time", 0L);
        if (l == 0L) {
          break label136;
        }
      }
      label136:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        w.i("MicroMsg.HandlerTraceManager", "has mark lastFullTime %b", new Object[] { Boolean.valueOf(bool1) });
        if (l == 0L) {
          this.ghC.edit().putLong("handler_trace_log_file_full_time", System.currentTimeMillis()).commit();
        }
        GMTrace.o(601563856896L, 4482);
        return;
        bool1 = false;
        break;
      }
    }
    else
    {
      this.gqi = false;
    }
    label146:
    GMTrace.o(601563856896L, 4482);
  }
  
  static final class a
    implements Comparable<a>
  {
    long gqA;
    String info;
    
    a()
    {
      GMTrace.i(613911887872L, 4574);
      GMTrace.o(613911887872L, 4574);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */