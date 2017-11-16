package com.tencent.mm.plugin.normsg;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.util.Base64;
import com.tencent.c.e.a.a.f;
import com.tencent.c.e.a.d.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.x;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.normsg.utils.NativeLogic;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;

 enum b
  implements com.tencent.mm.plugin.normsg.a.b
{
  private static final af nxD;
  
  static
  {
    GMTrace.i(17532056502272L, 130624);
    nxC = new b("INSTANCE");
    nxE = new b[] { nxC };
    nxD = new af("NormsgWorker");
    GMTrace.o(17532056502272L, 130624);
  }
  
  private b()
  {
    GMTrace.i(17529909018624L, 130608);
    GMTrace.o(17529909018624L, 130608);
  }
  
  private static String A(Map<String, String> paramMap)
  {
    GMTrace.i(17530714324992L, 130614);
    paramMap = (String)paramMap.get("hardware");
    GMTrace.o(17530714324992L, 130614);
    return paramMap;
  }
  
  private static String B(Map<String, String> paramMap)
  {
    GMTrace.i(17530848542720L, 130615);
    paramMap = (String)paramMap.get("revision");
    GMTrace.o(17530848542720L, 130615);
    return paramMap;
  }
  
  private static String C(Map<String, String> paramMap)
  {
    GMTrace.i(17530982760448L, 130616);
    paramMap = (String)paramMap.get("serial");
    GMTrace.o(17530982760448L, 130616);
    return paramMap;
  }
  
  private static String DY(String paramString)
  {
    GMTrace.i(18976507691008L, 141386);
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramString.length();
    int i = 0;
    if (i < j)
    {
      char c = paramString.charAt(i);
      switch (c)
      {
      default: 
        if (c > '~') {
          localStringBuilder.append("&#").append(c).append(';');
        }
        break;
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append("&quot;");
        continue;
        localStringBuilder.append("&amp;");
        continue;
        localStringBuilder.append("&apos;");
        continue;
        localStringBuilder.append("&lt;");
        continue;
        localStringBuilder.append("&gt;");
        continue;
        localStringBuilder.append("&#").append(c).append(';');
        continue;
        localStringBuilder.append(c);
      }
    }
    paramString = localStringBuilder.toString();
    GMTrace.o(18976507691008L, 141386);
    return paramString;
  }
  
  private static String Ku()
  {
    GMTrace.i(17531653849088L, 130621);
    for (;;)
    {
      try
      {
        localObject = ((ConnectivityManager)ab.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (((NetworkInfo)localObject).getType() != 1) {
          continue;
        }
        localObject = "wifi";
      }
      catch (Exception localException)
      {
        Object localObject;
        w.e("MicroMsg.NormsgSourceImpl", "getNetTypeStr: %s", new Object[] { bg.f(localException) });
        String str = "";
        continue;
      }
      GMTrace.o(17531653849088L, 130621);
      return (String)localObject;
      localObject = ((NetworkInfo)localObject).getSubtype();
    }
  }
  
  private static boolean aUl()
  {
    GMTrace.i(17530311671808L, 130611);
    Context localContext = ab.getContext();
    if (localContext == null)
    {
      w.w("MicroMsg.NormsgSourceImpl", "Failed checking mock location: application context not initialized.");
      GMTrace.o(17530311671808L, 130611);
      return false;
    }
    if (Settings.Secure.getInt(localContext.getContentResolver(), "mock_location", 0) != 0)
    {
      GMTrace.o(17530311671808L, 130611);
      return true;
    }
    GMTrace.o(17530311671808L, 130611);
    return false;
  }
  
  private static String aUm()
  {
    GMTrace.i(17531116978176L, 130617);
    Object localObject = ((ConnectivityManager)ab.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
    if (localObject != null) {}
    for (localObject = ((NetworkInfo)localObject).getExtraInfo();; localObject = null)
    {
      GMTrace.o(17531116978176L, 130617);
      return (String)localObject;
    }
  }
  
  private static String aUn()
  {
    GMTrace.i(17531251195904L, 130618);
    String str2 = bg.nl(bg.eE(ab.getContext()));
    String str1 = str2;
    if (str2.length() > 0) {
      str1 = com.tencent.mm.a.g.n(str2.getBytes());
    }
    GMTrace.o(17531251195904L, 130618);
    return str1;
  }
  
  private String ao(Context paramContext, String paramString)
  {
    GMTrace.i(19010598993920L, 141640);
    for (;;)
    {
      if (paramContext != null) {}
      try
      {
        if ((paramContext instanceof ContextWrapper))
        {
          paramContext = ((ContextWrapper)paramContext).getBaseContext();
        }
        else
        {
          Object localObject1 = Class.forName(DX("\034\023\020T\032\026\035\004\030\035\021\\\032\036\005\013\035\002\f\006E\007\032H%\r\013\006\006\022(0+9/4:4")).getDeclaredMethod(DX("./?\017\" ;%96\f&/#$,"), new Class[0]);
          ((Method)localObject1).setAccessible(true);
          Object localObject2 = ((Method)localObject1).invoke(null, new Object[0]);
          Object localObject3 = Class.forName(DX("'+ 1-($a!>b\030/;>>50\0312<07:,\023=/3/="));
          localObject1 = Class.forName(DX("*&-< %)l,3o\017\005-+>>*"));
          localObject3 = ((Class)localObject3).getDeclaredMethod(DX("3\"\0319\"0&=;:="), new Class[] { localObject1 });
          ((Method)localObject3).setAccessible(true);
          localObject2 = ((Method)localObject3).invoke(null, new Object[] { localObject2 });
          localObject3 = Class.forName(DX("#+=-c\"..&l\02007/)?"));
          localObject3 = localObject2.getClass().getDeclaredMethod(DX("45%\0052&#38="), new Class[] { localObject3 });
          ((Method)localObject3).setAccessible(true);
          localObject2 = ((Method)localObject3).invoke(localObject2, new Object[] { DX(".<?0;>=") });
          localObject1 = Class.forName(DX("\037\023\030\t\025\020\034Y\025\032\032\007\027\037\004A\036\000B\":\b\013\f\007\002\001.\003\017\0018;/x\b.,:")).getDeclaredMethod(DX("3\"\0319\"0&=;:="), new Class[] { localObject1 });
          ((Method)localObject1).setAccessible(true);
          localObject2 = ((Method)localObject1).invoke(null, new Object[] { localObject2 });
          localObject1 = Class.forName(DX("\035\021\032\013\027\022\036[\025\007\006_1\003\002\001\005\f\017\035\001\004\0045\005\004\r\000\007\006/<2>9<*"));
          localObject3 = ((Class)localObject1).getDeclaredConstructor(new Class[] { Class.forName(DX("/#(9% ,i'54m\001..+;%(\0227)4")), Class.forName(DX("\032\026\035\f\020\025\031\\\020\037\037\002\022\032\001D\033\005G'?\r\016\t\002\007\004+\006\n\004=>*")) });
          ((Constructor)localObject3).setAccessible(true);
          paramContext = ((Constructor)localObject3).newInstance(new Object[] { paramContext, localObject2 });
          localObject1 = ((Class)localObject1).getDeclaredMethod(DX("*+;\001'9?%)*\"$\021# 7<9:+"), new Class[] { Integer.TYPE });
          ((Method)localObject1).setAccessible(true);
          localObject2 = (List)((Method)localObject1).invoke(paramContext, new Object[] { Integer.valueOf(0) });
          if (localObject2 != null)
          {
            localObject1 = new StringBuilder();
            localObject2 = ((List)localObject2).iterator();
            int i = 1;
            if (((Iterator)localObject2).hasNext())
            {
              Object localObject4 = ((Iterator)localObject2).next();
              if (i != 0) {
                i = 0;
              }
              for (;;)
              {
                localObject3 = (String)localObject4.getClass().getDeclaredField(DX("\"03<721\025;4=")).get(localObject4);
                localObject4 = localObject4.getClass().getDeclaredField(DX("7%$?;21+722\0224?7")).get(localObject4);
                Object localObject5 = Class.forName(DX("\032\026\035\f\020\025\031\\\020\037\037\002\022\032\001D\033\005G>\016\017\006\003\004\005(\022\002\t,4=7"));
                Class localClass = Class.forName(DX("\031\025\036\017\023\026\032_\023\034\034\001\021\031\002G\030\006D=\r\f\005\000\007\006/\004\n\006\001<*"));
                localObject5 = ((Class)localObject5).getDeclaredMethod(DX("<<31\03064<4"), new Class[] { localClass });
                ((Method)localObject5).setAccessible(true);
                localObject4 = ((Method)localObject5).invoke(localObject4, new Object[] { paramContext }).toString();
                ((StringBuilder)localObject1).append((String)localObject3).append('#').append((String)localObject4);
                break;
                ((StringBuilder)localObject1).append(paramString);
              }
            }
            paramContext = ((StringBuilder)localObject1).toString();
            GMTrace.o(19010598993920L, 141640);
            return paramContext;
          }
          GMTrace.o(19010598993920L, 141640);
          return "";
        }
      }
      catch (Throwable paramContext)
      {
        w.printErrStackTrace("MicroMsg.NormsgSourceImpl", paramContext, "unexpected exception.", new Object[0]);
        GMTrace.o(19010598993920L, 141640);
      }
    }
    return "";
  }
  
  private static String cC(int paramInt1, int paramInt2)
  {
    GMTrace.i(17531385413632L, 130619);
    localObject1 = "";
    Object localObject2 = ab.getContext().getPackageManager();
    try
    {
      localObject2 = ((PackageManager)localObject2).getPackageInfo(ab.getPackageName(), 0);
      if (localObject2 != null) {
        localObject1 = ((PackageInfo)localObject2).applicationInfo.sourceDir;
      }
      try
      {
        localObject2 = com.tencent.mm.c.c.j(new File((String)localObject1));
        localObject1 = localObject2;
        if (bg.nm((String)localObject2))
        {
          com.tencent.mm.plugin.report.d.oqe.a(322L, 13L, 1L, true);
          com.tencent.mm.plugin.report.d.oqe.i(11098, new Object[] { Integer.valueOf(4013), String.format("%s|%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }) });
          localObject1 = localObject2;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject3;
          w.w("MicroMsg.NormsgSourceImpl", "summertoken getSecurityCode e: " + localException.getMessage());
          localObject1 = "0";
          com.tencent.mm.plugin.report.d.oqe.a(322L, 12L, 1L, true);
          com.tencent.mm.plugin.report.d.oqe.i(11098, new Object[] { Integer.valueOf(4012), String.format("%s|%s|%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), localException.getMessage() }) });
        }
      }
      GMTrace.o(17531385413632L, 130619);
      return (String)localObject1;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        localObject3 = null;
        w.w("MicroMsg.NormsgSourceImpl", "app not installed, packageName = " + ab.getPackageName());
      }
    }
  }
  
  private static int getVersionCode()
  {
    int i = 0;
    GMTrace.i(17531519631360L, 130620);
    Object localObject1 = ab.getContext().getPackageManager();
    try
    {
      localObject1 = ((PackageManager)localObject1).getPackageInfo(ab.getPackageName(), 0);
      if (localObject1 != null) {
        i = ((PackageInfo)localObject1).versionCode;
      }
      GMTrace.o(17531519631360L, 130620);
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2 = null;
        w.w("MicroMsg.NormsgSourceImpl", "app not installed, packageName = " + ab.getPackageName());
      }
    }
  }
  
  private static String y(Map<String, String> paramMap)
  {
    GMTrace.i(17530445889536L, 130612);
    String str = (String)paramMap.get("model name");
    paramMap = str;
    if (str == null) {
      paramMap = p.tf()[0];
    }
    GMTrace.o(17530445889536L, 130612);
    return paramMap;
  }
  
  private static String z(Map<String, String> paramMap)
  {
    GMTrace.i(17530580107264L, 130613);
    String str2 = (String)paramMap.get("features");
    String str1 = str2;
    if (str2 == null) {
      str1 = (String)paramMap.get("flags");
    }
    GMTrace.o(17530580107264L, 130613);
    return str1;
  }
  
  public final String DX(String paramString)
  {
    GMTrace.i(18976373473280L, 141385);
    int j = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(j);
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append((char)(paramString.charAt(i) ^ 0xFFFFFFA7 ^ (byte)(i + 1 ^ j ^ 0xFFFFFFFF)));
      i += 1;
    }
    paramString = localStringBuilder.toString();
    GMTrace.o(18976373473280L, 141385);
    return paramString;
  }
  
  public final void K(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(20847234383872L, 155324);
    Object localObject = ab.getContext();
    if ((paramInt2 <= 0) || (paramInt2 > 4)) {
      throw new IllegalArgumentException("action invalid: " + paramInt2);
    }
    localObject = new d.a((Context)localObject, paramInt1, paramInt2);
    long l = paramInt3 * 1000;
    if (l < f.xSg) {
      ((d.a)localObject).xRL = f.xSg;
    }
    for (;;)
    {
      ((d.a)localObject).xRL = l;
      localObject = new com.tencent.c.e.a.d((d.a)localObject);
      com.tencent.c.e.a.e.cnz().a((com.tencent.c.e.a.d)localObject);
      GMTrace.o(20847234383872L, 155324);
      return;
      if (l > f.xSd * 12L) {
        ((d.a)localObject).xRL = (f.xSd * 12L);
      }
    }
  }
  
  public final String a(Object[][] paramArrayOfObject)
  {
    GMTrace.i(20847368601600L, 155325);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<st>");
    int j = paramArrayOfObject.length;
    int i = 0;
    while (i < j)
    {
      Object[] arrayOfObject = paramArrayOfObject[i];
      String str = DY(DX((String)arrayOfObject[0]));
      localStringBuilder.append('<').append(str).append('>').append(DY(String.valueOf(arrayOfObject[1]))).append('<').append('/').append(str).append('>');
      i += 1;
    }
    localStringBuilder.append("</st>");
    paramArrayOfObject = new CRC32();
    paramArrayOfObject.update(localStringBuilder.toString().getBytes());
    localStringBuilder.append("<ccdcc>").append(paramArrayOfObject.getValue()).append("</ccdcc>");
    localStringBuilder.append("<ccdts>").append(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).append("</ccdts>");
    paramArrayOfObject = localStringBuilder.toString();
    GMTrace.o(20847368601600L, 155325);
    return paramArrayOfObject;
  }
  
  public final boolean a(Object paramObject, Class paramClass)
  {
    GMTrace.i(17814316384256L, 132727);
    boolean bool = NativeLogic.a(paramObject, paramClass);
    GMTrace.o(17814316384256L, 132727);
    return bool;
  }
  
  public final String aUo()
  {
    GMTrace.i(18976776126464L, 141388);
    Object localObject2 = ab.getContext().getPackageManager().getInstalledPackages(0);
    Object localObject1 = new StringBuilder(8192);
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((StringBuilder)localObject1).append(((PackageInfo)((Iterator)localObject2).next()).packageName).append('\n');
    }
    localObject1 = ((StringBuilder)localObject1).toString();
    GMTrace.o(18976776126464L, 141388);
    return (String)localObject1;
  }
  
  public final boolean aUp()
  {
    GMTrace.i(17531922284544L, 130623);
    boolean bool = NativeLogic.aUp();
    GMTrace.o(17531922284544L, 130623);
    return bool;
  }
  
  public final byte[] aUq()
  {
    GMTrace.i(18976910344192L, 141389);
    int i;
    int j;
    try
    {
      localObject6 = ab.getContext().getApplicationContext();
      localObject2 = ((Context)localObject6).getApplicationInfo().sourceDir;
      localObject1 = ((WifiManager)((Context)localObject6).getSystemService("wifi")).getConnectionInfo();
      localObject5 = ((WifiInfo)localObject1).getSSID();
      str4 = ((WifiInfo)localObject1).getBSSID();
      n = getVersionCode();
      if (!aUl()) {
        break label1514;
      }
      i = 1;
      if (!NativeLogic.aUp()) {
        break label1519;
      }
      j = 1;
      label77:
      if (!Debug.isDebuggerConnected()) {
        break label1524;
      }
      m = 1;
      label86:
      h.xw();
      localObject1 = NativeLogic.bA((String)localObject2, com.tencent.mm.kernel.a.ww());
      h.xw();
      localObject2 = NativeLogic.h((Context)localObject6, (String)localObject2, com.tencent.mm.kernel.a.ww());
      localObject3 = NativeLogic.cW((Context)localObject6);
      localObject1 = com.tencent.mm.plugin.normsg.utils.a.f((byte[])localObject1, 0, localObject1.length);
      localObject2 = com.tencent.mm.plugin.normsg.utils.a.f((byte[])localObject2, 0, localObject2.length);
      str1 = com.tencent.mm.plugin.normsg.utils.a.f((byte[])localObject3, 0, localObject3.length);
      if ((com.tencent.mm.plugin.normsg.utils.c.nxS) || (com.tencent.mm.plugin.normsg.utils.c.nxT)) {
        break label1509;
      }
      if (!com.tencent.mm.plugin.normsg.utils.c.nxU) {
        break label1530;
      }
    }
    catch (Throwable localThrowable)
    {
      Object localObject6;
      Object localObject1;
      Object localObject5;
      String str4;
      int n;
      String str1;
      label177:
      String str9;
      Object localObject4;
      Object[] arrayOfObject1;
      Object[] arrayOfObject2;
      Object[] arrayOfObject3;
      Object[] arrayOfObject4;
      Object[] arrayOfObject5;
      Object[] arrayOfObject6;
      Object[] arrayOfObject7;
      int i1;
      Object[] arrayOfObject8;
      Object[] arrayOfObject9;
      String str2;
      String str3;
      Object[] arrayOfObject10;
      Object[] arrayOfObject11;
      Object[] arrayOfObject12;
      String str5;
      String str6;
      Object[] arrayOfObject13;
      String str7;
      Object[] arrayOfObject14;
      Object[] arrayOfObject15;
      Object[] arrayOfObject16;
      Object[] arrayOfObject17;
      String str8;
      Object[] arrayOfObject18;
      Object[] arrayOfObject19;
      Object localObject2 = new StringWriter();
      Object localObject3 = new PrintWriter((Writer)localObject2);
      localThrowable.printStackTrace((PrintWriter)localObject3);
      ((PrintWriter)localObject3).flush();
      com.tencent.mm.plugin.report.service.g.ork.d("BriefSecInfoCrash", ((StringWriter)localObject2).toString(), null);
      ((PrintWriter)localObject3).close();
      GMTrace.o(18976910344192L, 141389);
      return new byte[0];
    }
    localObject3 = ((Context)localObject6).getApplicationInfo();
    str9 = ((Context)localObject6).getPackageManager().getApplicationLabel((ApplicationInfo)localObject3).toString();
    localObject4 = p.tm();
    localObject3 = new Object[] { "\036'\02104\023>019>.><", Integer.valueOf(m) };
    arrayOfObject1 = new Object[] { "\00194\0344%?k", str1 };
    arrayOfObject2 = new Object[] { "\023#'\006 %?7?", y((Map)localObject4) };
    arrayOfObject3 = new Object[] { "\0011%?8\022\"\f>*", p.th() };
    str1 = p.ti();
    arrayOfObject4 = new Object[] { "\024\023\032\021", p.sZ() };
    arrayOfObject5 = new Object[] { "\021=6';>2\020\034", p.getAndroidId() };
    arrayOfObject6 = new Object[] { "\0029?93\0061)384", p.tl() };
    arrayOfObject7 = new Object[] { "\0038>82\031:>>4", p.te() };
    i1 = p.tn();
    arrayOfObject8 = new Object[] { "\037/+\021\017", A((Map)localObject4) };
    arrayOfObject9 = new Object[] { "\034,(\b>.", B((Map)localObject4) };
    str2 = C((Map)localObject4);
    str3 = p.tb();
    localObject4 = z((Map)localObject4);
    localObject5 = new Object[] { "\016\r\026\034", localObject5 };
    localObject6 = p.aE((Context)localObject6);
    arrayOfObject10 = new Object[] { "\036\f\r\020\034", str4 };
    str4 = aUm();
    arrayOfObject11 = new Object[] { "\0166;\025;4=", ab.getPackageName() };
    arrayOfObject12 = new Object[] { "\034(57>\037\b", x.get("ro.build.fingerprint") };
    str5 = Build.BOARD;
    str6 = Build.BOOTLOADER;
    arrayOfObject13 = new Object[] { "\021%8:3\026';5<", Build.BRAND };
    str7 = Build.DEVICE;
    arrayOfObject14 = new Object[] { "\034(57>\021\017", Build.HARDWARE };
    arrayOfObject15 = new Object[] { "\027#><5\002!39+<,", Build.PRODUCT };
    arrayOfObject16 = new Object[] { "\03079%730((,:*", x.get("ro.product.manufacturer") };
    arrayOfObject17 = new Object[] { "\001:<:0\030\"5", aUn() };
    str8 = Ku();
    arrayOfObject18 = new Object[] { "\0253'5\00798,", com.tencent.mm.compatible.util.e.ghu };
    if (com.tencent.mm.plugin.normsg.utils.b.nxM)
    {
      m = 1;
      label647:
      arrayOfObject19 = new Object[] { "\0302!\021!'\0062?", Integer.valueOf(m) };
      if (!com.tencent.mm.plugin.normsg.utils.d.nxV) {
        break label1541;
      }
    }
    label1509:
    label1514:
    label1519:
    label1524:
    label1530:
    label1541:
    for (int m = 1;; m = 0)
    {
      Object[] arrayOfObject20 = { "\0346%\00098'\0164>:6/", Integer.valueOf(m) };
      Object[] arrayOfObject21 = { "\0044\"$?::\0305==", Integer.valueOf(n) };
      Object[] arrayOfObject22 = { "\013#89+'+\"\005)%01\r/>:8.\025;4=", ab.getContext().getClassLoader().getClass().getName() };
      Object[] arrayOfObject24 = { "\037-,\025;4=", str9 };
      Object[] arrayOfObject25 = { "\005\006\032?#,\002.!''!\002.*<+", gv(true) };
      Object[] arrayOfObject26 = { "\0333*\0313-+", Long.valueOf(NativeLogic.aUr()) };
      str9 = NativeLogic.DZ(",");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<st>");
      m = 0;
      while (m < 44)
      {
        Object[] arrayOfObject23 = new Object[][] { { "\035$\033>\"8\0362?\020.<6", Integer.valueOf(i) }, { "\034!4\0300 24", Integer.valueOf(j) }, localObject3, { "\00194\0344%?i", localObject1 }, { "\00194\0344%?j", localObject2 }, arrayOfObject1, arrayOfObject2, arrayOfObject3, { "\036!\00119\0002*", str1 }, arrayOfObject4, arrayOfObject5, arrayOfObject6, arrayOfObject7, { "\026&\"\023> 6\0372+1,", Integer.valueOf(i1) }, arrayOfObject8, arrayOfObject9, { "\023#'\0061%?84", str2 }, { "\r80=\027\030\033", str3 }, { "\021!%\02134 .(<+", localObject4 }, localObject5, { "\f,\0244=7", localObject6 }, arrayOfObject10, { "\037\r\022\0224?7", str4 }, arrayOfObject11, arrayOfObject12, { "\021%8:3\026:;)<", str5 }, { "\024 =?6\023?0*13:><*", str6 }, arrayOfObject13, { "\020$9;2\0211-3:=", str7 }, arrayOfObject14, arrayOfObject15, { "\031 \00309\"\0237.", Integer.valueOf(k) }, arrayOfObject16, arrayOfObject17, { "\0208(\017#)=", str8 }, arrayOfObject18, arrayOfObject19, arrayOfObject20, arrayOfObject21, arrayOfObject22, arrayOfObject24, arrayOfObject25, arrayOfObject26, { "\002*$ /%%\017,/(98!+?;=!+\0005#(6?8\023?+", str9 } }[m];
        String str10 = DY(DX((String)arrayOfObject23[0]));
        localStringBuilder.append('<').append(str10).append('>').append(DY(String.valueOf(arrayOfObject23[1]))).append('<').append('/').append(str10).append('>');
        m += 1;
      }
      localStringBuilder.append("</st>");
      localObject1 = localStringBuilder.toString().getBytes();
      GMTrace.o(18976910344192L, 141389);
      return (byte[])localObject1;
      int k = 1;
      break label177;
      i = 0;
      break;
      j = 0;
      break label77;
      m = 0;
      break label86;
      k = 0;
      break label177;
      m = 0;
      break label647;
    }
  }
  
  public final boolean bh(Object paramObject)
  {
    GMTrace.i(20149570633728L, 150126);
    boolean bool = NativeLogic.bh(paramObject);
    GMTrace.o(20149570633728L, 150126);
    return bool;
  }
  
  public final String gv(boolean paramBoolean)
  {
    GMTrace.i(18976641908736L, 141387);
    Object localObject2 = new TreeSet();
    NativeLogic.a(ab.getContext(), (Set)localObject2, paramBoolean);
    Object localObject1 = new StringBuilder(8192);
    localObject2 = ((TreeSet)localObject2).iterator();
    int i = 1;
    if (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      if (i != 0) {
        i = 0;
      }
      for (;;)
      {
        ((StringBuilder)localObject1).append(str);
        break;
        ((StringBuilder)localObject1).append(',');
      }
    }
    localObject1 = ((StringBuilder)localObject1).toString();
    GMTrace.o(18976641908736L, 141387);
    return (String)localObject1;
  }
  
  public final String n(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(20149436416000L, 150125);
    Object localObject8 = ab.getContext().getApplicationContext();
    Object localObject1 = ((Context)localObject8).getApplicationInfo().sourceDir;
    Object localObject2 = ((WifiManager)((Context)localObject8).getSystemService("wifi")).getConnectionInfo();
    Object localObject7 = ((WifiInfo)localObject2).getSSID();
    String str3 = ((WifiInfo)localObject2).getBSSID();
    int n = getVersionCode();
    int i;
    int j;
    label78:
    label87:
    Object localObject3;
    String str1;
    Object localObject5;
    String str2;
    int m;
    label178:
    Object localObject4;
    Object localObject6;
    Object[] arrayOfObject1;
    Object[] arrayOfObject2;
    Object[] arrayOfObject3;
    Object[] arrayOfObject4;
    Object[] arrayOfObject5;
    Object[] arrayOfObject6;
    Object[] arrayOfObject7;
    Object[] arrayOfObject8;
    Object[] arrayOfObject9;
    Object[] arrayOfObject10;
    Object[] arrayOfObject11;
    Object[] arrayOfObject12;
    Object[] arrayOfObject13;
    Object[] arrayOfObject14;
    Object[] arrayOfObject15;
    Object[] arrayOfObject16;
    Object[] arrayOfObject17;
    Object[] arrayOfObject18;
    Object[] arrayOfObject19;
    Object[] arrayOfObject20;
    String str4;
    String str5;
    Object[] arrayOfObject21;
    String str6;
    Object[] arrayOfObject22;
    Object[] arrayOfObject23;
    String str7;
    if (aUl())
    {
      i = 1;
      if (!NativeLogic.aUp()) {
        break label1465;
      }
      j = 1;
      if (!Debug.isDebuggerConnected()) {
        break label1471;
      }
      k = 1;
      h.xw();
      localObject2 = NativeLogic.bA((String)localObject1, com.tencent.mm.kernel.a.ww());
      h.xw();
      localObject3 = NativeLogic.h((Context)localObject8, (String)localObject1, com.tencent.mm.kernel.a.ww());
      localObject1 = NativeLogic.cW((Context)localObject8);
      str1 = com.tencent.mm.plugin.normsg.utils.a.f((byte[])localObject2, 0, localObject2.length);
      localObject5 = com.tencent.mm.plugin.normsg.utils.a.f((byte[])localObject3, 0, localObject3.length);
      str2 = com.tencent.mm.plugin.normsg.utils.a.f((byte[])localObject1, 0, localObject1.length);
      if ((!com.tencent.mm.plugin.normsg.utils.c.nxS) && (!com.tencent.mm.plugin.normsg.utils.c.nxT) && (!com.tencent.mm.plugin.normsg.utils.c.nxU)) {
        break label1477;
      }
      m = 1;
      localObject1 = ((Context)localObject8).getApplicationInfo();
      localObject3 = ((Context)localObject8).getPackageManager().getApplicationLabel((ApplicationInfo)localObject1).toString();
      localObject2 = "";
      localObject1 = localObject2;
      if (paramBoolean1)
      {
        localObject4 = com.tencent.mm.lib.riskscanner.a.a.aU((Context)localObject8);
        localObject1 = localObject2;
        if (localObject4 != null)
        {
          localObject1 = localObject2;
          if (((Bundle)localObject4).getInt("errCode", -100) == 0)
          {
            localObject4 = ((Bundle)localObject4).getByteArray("reqBufferBase64");
            localObject1 = localObject2;
            if (localObject4 != null) {
              localObject1 = Base64.encodeToString((byte[])localObject4, 2);
            }
          }
        }
      }
      localObject2 = "";
      if (paramBoolean2) {
        localObject2 = ao((Context)localObject8, ",");
      }
      localObject6 = p.tm();
      localObject4 = new Object[] { "\034!4\0300 24", Integer.valueOf(j) };
      arrayOfObject1 = new Object[] { "\036'\02104\023>019>.><", Integer.valueOf(k) };
      localObject5 = new Object[] { "\00194\0344%?j", localObject5 };
      arrayOfObject2 = new Object[] { "\00194\0344%?k", str2 };
      arrayOfObject3 = new Object[] { "\023#'\006 %?7?", y((Map)localObject6) };
      arrayOfObject4 = new Object[] { "\0011%?8\022\"\f>*", p.th() };
      arrayOfObject5 = new Object[] { "\036!\00119\0002*", p.ti() };
      arrayOfObject6 = new Object[] { "\024\023\032\021", p.sZ() };
      arrayOfObject7 = new Object[] { "\021=6';>2\020\034", p.getAndroidId() };
      arrayOfObject8 = new Object[] { "\0029?93\0061)384", p.tl() };
      str2 = p.te();
      arrayOfObject9 = new Object[] { "\026&\"\023> 6\0372+1,", Integer.valueOf(p.tn()) };
      arrayOfObject10 = new Object[] { "\037/+\021\017", A((Map)localObject6) };
      arrayOfObject11 = new Object[] { "\034,(\b>.", B((Map)localObject6) };
      arrayOfObject12 = new Object[] { "\023#'\0061%?84", C((Map)localObject6) };
      arrayOfObject13 = new Object[] { "\r80=\027\030\033", p.tb() };
      localObject6 = new Object[] { "\021!%\02134 .(<+", z((Map)localObject6) };
      localObject7 = new Object[] { "\016\r\026\034", localObject7 };
      localObject8 = new Object[] { "\f,\0244=7", p.aE((Context)localObject8) };
      arrayOfObject14 = new Object[] { "\036\f\r\020\034", str3 };
      arrayOfObject15 = new Object[] { "\037\r\022\0224?7", aUm() };
      str3 = ab.getPackageName();
      arrayOfObject16 = new Object[] { "\034(57>\037\b", x.get("ro.build.fingerprint") };
      arrayOfObject17 = new Object[] { "\021%8:3\026:;)<", Build.BOARD };
      arrayOfObject18 = new Object[] { "\024 =?6\023?0*13:><*", Build.BOOTLOADER };
      arrayOfObject19 = new Object[] { "\021%8:3\026';5<", Build.BRAND };
      arrayOfObject20 = new Object[] { "\020$9;2\0211-3:=", Build.DEVICE };
      str4 = Build.HARDWARE;
      str5 = Build.PRODUCT;
      arrayOfObject21 = new Object[] { "\031 \00309\"\0237.", Integer.valueOf(m) };
      str6 = x.get("ro.product.manufacturer");
      arrayOfObject22 = new Object[] { "\001:<:0\030\"5", aUn() };
      arrayOfObject23 = new Object[] { "\0208(\017#)=", Ku() };
      str7 = com.tencent.mm.compatible.util.e.ghu;
      if (!com.tencent.mm.plugin.normsg.utils.b.nxM) {
        break label1483;
      }
      j = 1;
      label864:
      if (!com.tencent.mm.plugin.normsg.utils.d.nxV) {
        break label1489;
      }
    }
    label1465:
    label1471:
    label1477:
    label1483:
    label1489:
    for (int k = 1;; k = 0)
    {
      Object[] arrayOfObject24 = { "\013#89+'+\"\005)%01\r/>:8.\025;4=", ab.getContext().getClassLoader().getClass().getName() };
      localObject3 = new Object[] { "\037-,\025;4=", localObject3 };
      Object[] arrayOfObject25 = { "\005\006\032?#,\002.!''!\002.*<+", gv(false) };
      localObject1 = new Object[] { "\032\"9&\037,//\022&3\0071! <*", localObject1 };
      Object[] arrayOfObject26 = { "\0333*\0313-+", Long.valueOf(NativeLogic.aUr()) };
      Object[] arrayOfObject27 = { "\002*$ /%%\017,/(98!+?;=!+\0005#(6?8\023?+", NativeLogic.DZ(",") };
      localObject2 = new Object[] { "\005!==)'&  \027'\"+\"%8\025186+", localObject2 };
      localObject1 = a(new Object[][] { { "\035$\033>\"8\0362?\020.<6", Integer.valueOf(i) }, localObject4, arrayOfObject1, { "\00194\0344%?i", str1 }, localObject5, arrayOfObject2, arrayOfObject3, arrayOfObject4, arrayOfObject5, arrayOfObject6, arrayOfObject7, arrayOfObject8, { "\0038>82\031:>>4", str2 }, arrayOfObject9, arrayOfObject10, arrayOfObject11, arrayOfObject12, arrayOfObject13, localObject6, localObject7, localObject8, arrayOfObject14, arrayOfObject15, { "\0166;\025;4=", str3 }, arrayOfObject16, arrayOfObject17, arrayOfObject18, arrayOfObject19, arrayOfObject20, { "\034(57>\021\017", str4 }, { "\027#><5\002!39+<,", str5 }, arrayOfObject21, { "\03079%730((,:*", str6 }, arrayOfObject22, arrayOfObject23, { "\0253'5\00798,", str7 }, { "\0302!\021!'\0062?", Integer.valueOf(j) }, { "\0346%\00098'\0164>:6/", Integer.valueOf(k) }, { "\0044\"$?::\0305==", Integer.valueOf(n) }, arrayOfObject24, localObject3, arrayOfObject25, localObject1, arrayOfObject26, arrayOfObject27, localObject2 });
      GMTrace.o(20149436416000L, 150125);
      return (String)localObject1;
      i = 0;
      break;
      j = 0;
      break label78;
      k = 0;
      break label87;
      m = 0;
      break label178;
      j = 0;
      break label864;
    }
  }
  
  public final String rR(int paramInt)
  {
    GMTrace.i(17530177454080L, 130610);
    if (h.xw().wL()) {}
    for (String str2 = (String)h.xy().xh().get(79, "");; str2 = "")
    {
      h.xB().h(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17528701059072L, 130599);
          if (!h.xw().wL())
          {
            GMTrace.o(17528701059072L, 130599);
            return;
          }
          try
          {
            long l1 = System.currentTimeMillis();
            Object localObject2 = ab.getContext();
            Object localObject3 = ((Context)localObject2).getApplicationInfo().sourceDir;
            h.xw();
            Object localObject1 = NativeLogic.bA((String)localObject3, com.tencent.mm.kernel.a.ww());
            h.xw();
            localObject3 = NativeLogic.h((Context)localObject2, (String)localObject3, com.tencent.mm.kernel.a.ww());
            long l2 = System.currentTimeMillis();
            localObject2 = String.format("<k25>%s</k25>", new Object[] { com.tencent.mm.plugin.normsg.utils.a.f((byte[])localObject1, 0, localObject1.length) });
            localObject1 = localObject2;
            if (localObject3 != null)
            {
              if (localObject3.length != 8) {
                break label358;
              }
              int i = localObject3[0];
              localObject3[0] = localObject3[3];
              localObject3[3] = i;
              i = localObject3[1];
              localObject3[1] = localObject3[2];
              localObject3[2] = i;
              i = localObject3[4];
              localObject3[4] = localObject3[7];
              localObject3[7] = i;
              i = localObject3[5];
              localObject3[5] = localObject3[6];
              localObject3[6] = i;
            }
            for (localObject1 = (String)localObject2 + String.format("<k28>%s</k28><k29>%s</k29>", new Object[] { com.tencent.mm.plugin.normsg.utils.a.f((byte[])localObject3, 0, 4), com.tencent.mm.plugin.normsg.utils.a.f((byte[])localObject3, 4, 8) });; localObject1 = (String)localObject2 + String.format("<k27>%s</k27>", new Object[] { com.tencent.mm.plugin.normsg.utils.a.f((byte[])localObject3, 0, localObject3.length) }))
            {
              try
              {
                localObject2 = Inet4Address.getByName("mp.weixin.qq.com").getHostAddress();
                localObject2 = (String)localObject1 + String.format("<k32>%s</k32>", new Object[] { bg.nl((String)localObject2) });
                localObject1 = localObject2;
              }
              catch (Exception localException2)
              {
                for (;;)
                {
                  label358:
                  w.e("MicroMsg.NormsgSourceImpl", "exception:%s", new Object[] { bg.f(localException2) });
                }
              }
              w.i("MicroMsg.NormsgSourceImpl", "checkSoftType2 [time: " + (l2 - l1) + ", value: " + (String)localObject1 + "]");
              h.xy().xh().set(79, localObject1);
              GMTrace.o(17528701059072L, 130599);
              return;
            }
            return;
          }
          catch (Exception localException1)
          {
            w.printErrStackTrace("MicroMsg.NormsgSourceImpl", localException1, "Failed checkSoftType2.", new Object[0]);
            GMTrace.o(17528701059072L, 130599);
          }
        }
        
        public final String toString()
        {
          GMTrace.i(17528835276800L, 130600);
          String str = super.toString() + "|checkSoftTypeExtra";
          GMTrace.o(17528835276800L, 130600);
          return str;
        }
      }, 5000L);
      String str1;
      if (h.xw().wL()) {
        if (h.xy().fYV.vDv.vCV) {
          str1 = "1";
        }
      }
      for (;;)
      {
        Context localContext = ab.getContext().getApplicationContext();
        Object localObject = ((WifiManager)localContext.getSystemService("wifi")).getConnectionInfo();
        String str3 = ((WifiInfo)localObject).getSSID();
        String str4 = ((WifiInfo)localObject).getBSSID();
        int i;
        label128:
        int j;
        label136:
        int k;
        label145:
        int m;
        label166:
        int n;
        label175:
        int i1;
        if (aUl())
        {
          i = 1;
          if (!NativeLogic.aUp()) {
            break label894;
          }
          j = 1;
          if (!Debug.isDebuggerConnected()) {
            break label899;
          }
          k = 1;
          if ((!com.tencent.mm.plugin.normsg.utils.c.nxS) && (!com.tencent.mm.plugin.normsg.utils.c.nxT) && (!com.tencent.mm.plugin.normsg.utils.c.nxU)) {
            break label905;
          }
          m = 1;
          if (!com.tencent.mm.plugin.normsg.utils.b.nxM) {
            break label911;
          }
          n = 1;
          if (!com.tencent.mm.plugin.normsg.utils.d.nxV) {
            break label917;
          }
          i1 = 1;
          label184:
          localObject = NativeLogic.cW(localContext);
          if (localObject == null) {
            break label923;
          }
        }
        label894:
        label899:
        label905:
        label911:
        label917:
        label923:
        for (localObject = com.tencent.mm.plugin.normsg.utils.a.f((byte[])localObject, 0, localObject.length);; localObject = "")
        {
          int i2 = getVersionCode();
          String str5 = cC(i2, paramInt);
          Map localMap = p.tm();
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("<softtype><lctmoc>").append(i).append("</lctmoc><level>").append(j).append("</level>").append(str2).append("<k1>").append(y(localMap)).append("</k1><k2>").append(p.th()).append("</k2><k3>").append(p.ti()).append("</k3><k4>").append(p.sZ()).append("</k4><k5>").append(p.tj()).append("</k5><k6>").append(p.tk()).append("</k6><k7>").append(p.getAndroidId()).append("</k7><k8>").append(p.tl()).append("</k8><k9>").append(p.te()).append("</k9><k10>").append(p.tn()).append("</k10><k11>").append(bg.nl(A(localMap))).append("</k11><k12>").append(bg.nl(B(localMap))).append("</k12><k13>").append(bg.nl(C(localMap))).append("</k13><k14>").append(p.tb()).append("</k14><k15>").append(p.tg()).append("</k15><k16>").append(bg.nl(z(localMap))).append("</k16><k18>").append((String)localObject).append("</k18><k21>").append(bg.nl(str3)).append("</k21><k22>").append(bg.nl(p.aE(localContext))).append("</k22><k24>").append(bg.nl(str4)).append("</k24><k26>").append(k).append("</k26><k30>").append(bg.nl(aUm())).append("</k30><k33>").append(ab.getPackageName()).append("</k33><k34>").append(bg.nl(x.get("ro.build.fingerprint"))).append("</k34><k35>").append(bg.nl(Build.BOARD)).append("</k35><k36>").append(bg.nl(Build.BOOTLOADER)).append("</k36><k37>").append(bg.nl(Build.BRAND)).append("</k37><k38>").append(bg.nl(Build.DEVICE)).append("</k38><k39>").append(bg.nl(Build.HARDWARE)).append("</k39><k40>").append(bg.nl(Build.PRODUCT)).append("</k40><k41>").append(m).append("</k41><k42>").append(bg.nl(x.get("ro.product.manufacturer"))).append("</k42><k43>").append(Settings.System.getString(ab.getContext().getContentResolver(), "89884a87498ef44f")).append("</k43><k44>0").append("</k44><k45>").append(aUn()).append("</k45><k46>").append(str1).append("</k46><k47>").append(Ku()).append("</k47><k48>").append(p.sZ()).append("</k48><k49>").append(com.tencent.mm.compatible.util.e.ghu).append("</k49><k52>").append(n).append("</k52><k53>").append(i1).append("</k53><k57>").append(i2).append("</k57><k58>").append(bg.nl(str5)).append("</k58><k59>").append(paramInt).append("</k59></softtype>");
          str1 = localStringBuilder.toString();
          GMTrace.o(17530177454080L, 130610);
          return str1;
          str1 = "0";
          break;
          i = 0;
          break label128;
          j = 0;
          break label136;
          k = 0;
          break label145;
          m = 0;
          break label166;
          n = 0;
          break label175;
          i1 = 0;
          break label184;
        }
        str1 = "";
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\normsg\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */