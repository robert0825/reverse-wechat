package com.tencent.mm.compatible.d;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

public final class p
{
  public static n fQB;
  public static b fQC;
  public static a fQD;
  public static u fQE;
  public static y fQF;
  public static r fQG;
  public static t fQH;
  public static w fQI;
  public static s fQJ;
  private static int fQK;
  public static j fQL;
  public static o fQM;
  private static String fQN;
  
  static
  {
    GMTrace.i(13804293324800L, 102850);
    fQB = new n();
    fQC = new b();
    fQD = new a();
    fQE = new u();
    fQF = new y();
    fQG = new r();
    fQH = new t();
    fQI = new w();
    fQJ = new s();
    fQK = -1;
    fQL = new j();
    fQM = new o();
    fQN = null;
    GMTrace.o(13804293324800L, 102850);
  }
  
  public static String aD(Context paramContext)
  {
    GMTrace.i(13802414276608L, 102836);
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.DeviceInfo", "lm: getManufacturer CurrentLanguage is %s", new Object[] { v.eq(paramContext) });
      if ((fQH == null) || (fQH.fRc == null) || (fQH.fRc.size() == 0))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.DeviceInfo", "lm: getManufacturer return is %s", new Object[] { Build.MANUFACTURER });
        paramContext = Build.MANUFACTURER;
        GMTrace.o(13802414276608L, 102836);
        return paramContext;
      }
      paramContext = (String)fQH.fRc.get(".manufacturerName." + v.eq(paramContext));
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.DeviceInfo", "lm: getManufacturer is %s", new Object[] { paramContext });
      boolean bool = bg.nm(paramContext);
      if (!bool)
      {
        GMTrace.o(13802414276608L, 102836);
        return paramContext;
      }
      paramContext = (String)fQH.fRc.get(".manufacturerName.en");
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.DeviceInfo", "lm: getManufacturer is %s", new Object[] { paramContext });
      bool = bg.nm(paramContext);
      if (!bool)
      {
        GMTrace.o(13802414276608L, 102836);
        return paramContext;
      }
      paramContext = Build.MANUFACTURER;
      GMTrace.o(13802414276608L, 102836);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext = Build.MANUFACTURER;
      GMTrace.o(13802414276608L, 102836);
    }
    return paramContext;
  }
  
  public static String aE(Context paramContext)
  {
    GMTrace.i(13802548494336L, 102837);
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSimOperatorName();
      GMTrace.o(13802548494336L, 102837);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.DeviceInfo", paramContext, "getMobileSPType", new Object[0]);
      GMTrace.o(13802548494336L, 102837);
    }
    return "";
  }
  
  public static String aM(boolean paramBoolean)
  {
    GMTrace.i(21019838382080L, 156610);
    StringBuilder localStringBuilder;
    String str;
    if ((paramBoolean) || (fQN == null))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(Settings.Secure.getString(ab.getContext().getContentResolver(), "android_id"));
      if (paramBoolean) {
        break label185;
      }
      str = (String)k.sI().get(256);
      if (str == null) {
        break label185;
      }
      localStringBuilder.append(str);
      str = (String)k.sI().get(259);
      if (str == null) {
        break label202;
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.DeviceInfo", "getHardWareId from file " + str);
    }
    for (;;)
    {
      localStringBuilder.append(str);
      str = localStringBuilder.toString();
      fQN = "A" + g.n(str.getBytes()).substring(0, 15);
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.DeviceInfo", "guid:%s, dev=%s", new Object[] { fQN, str });
      str = fQN;
      GMTrace.o(21019838382080L, 156610);
      return str;
      label185:
      str = td();
      k.sI().set(256, str);
      break;
      label202:
      str = Build.MANUFACTURER + Build.MODEL + m.sP();
      k.sI().set(259, str);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.DeviceInfo", "getHardWareId " + str);
    }
  }
  
  public static void dO(String paramString)
  {
    GMTrace.i(13802145841152L, 102834);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.DeviceInfo", "update deviceInfo %s", new Object[] { paramString });
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(13802145841152L, 102834);
      return;
    }
    if (paramString.hashCode() == fQK)
    {
      GMTrace.o(13802145841152L, 102834);
      return;
    }
    fQK = paramString.hashCode();
    fQB.reset();
    fQC.reset();
    fQD.reset();
    fQL.reset();
    fQE.reset();
    fQF.reset();
    Object localObject = fQG;
    ((r)localObject).fQO = 0;
    ((r)localObject).fQP = 0;
    localObject = fQH;
    ((t)localObject).fRb = "";
    ((t)localObject).fRc = null;
    fQI.eVF = false;
    fQJ.reset();
    new q();
    if (!q.a(paramString, fQB, fQC, fQD, fQL, fQE, fQF, fQG, fQH, fQI, fQJ))
    {
      GMTrace.o(13802145841152L, 102834);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.DeviceInfo", "steve: mCameraInfo.mNeedEnhance = " + fQC.fPa);
    paramString = new cd();
    com.tencent.mm.sdk.b.a.vgX.m(paramString);
    GMTrace.o(13802145841152L, 102834);
  }
  
  public static String getAndroidId()
  {
    GMTrace.i(13802951147520L, 102840);
    String str = Settings.Secure.getString(ab.getContext().getContentResolver(), "android_id");
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.DeviceInfo", "androidid:[%s]", new Object[] { str });
    GMTrace.o(13802951147520L, 102840);
    return str;
  }
  
  public static String getDeviceID(Context paramContext)
  {
    GMTrace.i(13801474752512L, 102829);
    if (paramContext == null)
    {
      GMTrace.o(13801474752512L, 102829);
      return null;
    }
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext == null)
      {
        GMTrace.o(13801474752512L, 102829);
        return null;
      }
      paramContext = paramContext.getDeviceId();
      if (paramContext == null)
      {
        GMTrace.o(13801474752512L, 102829);
        return null;
      }
      paramContext = paramContext.trim();
      GMTrace.o(13801474752512L, 102829);
      return paramContext;
    }
    catch (SecurityException paramContext)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.DeviceInfo", "getDeviceId failed, security exception");
      GMTrace.o(13801474752512L, 102829);
      return null;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.DeviceInfo", paramContext, "", new Object[0]);
      }
    }
  }
  
  public static String getSimCountryIso()
  {
    GMTrace.i(13802682712064L, 102838);
    Object localObject = (TelephonyManager)ab.getContext().getSystemService("phone");
    if (localObject != null)
    {
      localObject = ((TelephonyManager)localObject).getSimCountryIso();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.DeviceInfo", "get isoCode:[%s]", new Object[] { localObject });
      GMTrace.o(13802682712064L, 102838);
      return (String)localObject;
    }
    GMTrace.o(13802682712064L, 102838);
    return null;
  }
  
  public static String sZ()
  {
    GMTrace.i(13801340534784L, 102828);
    Object localObject = (String)k.sI().get(258);
    if (localObject != null)
    {
      GMTrace.o(13801340534784L, 102828);
      return (String)localObject;
    }
    String str = getDeviceID(ab.getContext());
    localObject = str;
    if (str == null) {
      localObject = "1234567890ABCDEF";
    }
    k.sI().set(258, localObject);
    GMTrace.o(13801340534784L, 102828);
    return (String)localObject;
  }
  
  public static String ta()
  {
    GMTrace.i(13801608970240L, 102830);
    String str = aM(false);
    GMTrace.o(13801608970240L, 102830);
    return str;
  }
  
  public static String tb()
  {
    GMTrace.i(13801743187968L, 102831);
    Object localObject = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localObject == null)
    {
      localObject = null;
      if (localObject == null) {
        break label56;
      }
    }
    label56:
    for (localObject = ((WifiInfo)localObject).getMacAddress();; localObject = null)
    {
      GMTrace.o(13801743187968L, 102831);
      return (String)localObject;
      localObject = ((WifiManager)localObject).getConnectionInfo();
      break;
    }
  }
  
  public static String tc()
  {
    GMTrace.i(13801877405696L, 102832);
    String str = null;
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    if (localBluetoothAdapter != null) {
      str = localBluetoothAdapter.getAddress();
    }
    GMTrace.o(13801877405696L, 102832);
    return str;
  }
  
  private static String td()
  {
    GMTrace.i(13802011623424L, 102833);
    String str1 = bg.eC(ab.getContext());
    String str2;
    if ((str1 != null) && (str1.length() > 0))
    {
      str2 = ("A" + str1 + "123456789ABCDEF").substring(0, 15);
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.DeviceInfo", "generated deviceId=" + str2);
      GMTrace.o(13802011623424L, 102833);
      return str2;
    }
    Random localRandom = new Random();
    localRandom.setSeed(System.currentTimeMillis());
    str1 = "A";
    int i = 0;
    for (;;)
    {
      str2 = str1;
      if (i >= 15) {
        break;
      }
      str1 = str1 + (char)(localRandom.nextInt(25) + 65);
      i += 1;
    }
  }
  
  public static String te()
  {
    GMTrace.i(13802280058880L, 102835);
    String str = Build.MODEL;
    GMTrace.o(13802280058880L, 102835);
    return str;
  }
  
  /* Error */
  public static String[] tf()
  {
    // Byte code:
    //   0: ldc2_w 457
    //   3: ldc_w 459
    //   6: invokestatic 44	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: iconst_2
    //   10: anewarray 168	java/lang/String
    //   13: astore_3
    //   14: aload_3
    //   15: iconst_0
    //   16: ldc -53
    //   18: aastore
    //   19: aload_3
    //   20: iconst_1
    //   21: ldc_w 461
    //   24: aastore
    //   25: aconst_null
    //   26: astore_2
    //   27: new 463	java/io/BufferedReader
    //   30: dup
    //   31: new 465	java/io/FileReader
    //   34: dup
    //   35: ldc_w 467
    //   38: invokespecial 468	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   41: sipush 8192
    //   44: invokespecial 471	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   47: astore_1
    //   48: aload_1
    //   49: invokevirtual 474	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   52: invokestatic 478	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   55: ldc_w 480
    //   58: invokevirtual 484	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   61: astore_2
    //   62: iconst_2
    //   63: istore_0
    //   64: iload_0
    //   65: aload_2
    //   66: arraylength
    //   67: if_icmpge +41 -> 108
    //   70: aload_3
    //   71: iconst_0
    //   72: new 149	java/lang/StringBuilder
    //   75: dup
    //   76: invokespecial 209	java/lang/StringBuilder:<init>	()V
    //   79: aload_3
    //   80: iconst_0
    //   81: aaload
    //   82: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: aload_2
    //   86: iload_0
    //   87: aaload
    //   88: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: ldc_w 486
    //   94: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   100: aastore
    //   101: iload_0
    //   102: iconst_1
    //   103: iadd
    //   104: istore_0
    //   105: goto -41 -> 64
    //   108: aload_3
    //   109: iconst_1
    //   110: aload_1
    //   111: invokevirtual 474	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   114: invokestatic 478	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   117: ldc_w 480
    //   120: invokevirtual 484	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   123: iconst_2
    //   124: aaload
    //   125: aastore
    //   126: aload_1
    //   127: invokevirtual 489	java/io/BufferedReader:close	()V
    //   130: ldc2_w 457
    //   133: ldc_w 459
    //   136: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   139: aload_3
    //   140: areturn
    //   141: astore_1
    //   142: aconst_null
    //   143: astore_1
    //   144: aload_1
    //   145: ifnull -15 -> 130
    //   148: aload_1
    //   149: invokevirtual 489	java/io/BufferedReader:close	()V
    //   152: goto -22 -> 130
    //   155: astore_1
    //   156: goto -26 -> 130
    //   159: astore_1
    //   160: aload_2
    //   161: ifnull +7 -> 168
    //   164: aload_2
    //   165: invokevirtual 489	java/io/BufferedReader:close	()V
    //   168: aload_1
    //   169: athrow
    //   170: astore_1
    //   171: goto -41 -> 130
    //   174: astore_2
    //   175: goto -7 -> 168
    //   178: astore_3
    //   179: aload_1
    //   180: astore_2
    //   181: aload_3
    //   182: astore_1
    //   183: goto -23 -> 160
    //   186: astore_2
    //   187: goto -43 -> 144
    // Local variable table:
    //   start	length	slot	name	signature
    //   63	42	0	i	int
    //   47	80	1	localBufferedReader	BufferedReader
    //   141	1	1	localIOException1	IOException
    //   143	6	1	localObject1	Object
    //   155	1	1	localException1	Exception
    //   159	10	1	localObject2	Object
    //   170	10	1	localException2	Exception
    //   182	1	1	localObject3	Object
    //   26	139	2	arrayOfString1	String[]
    //   174	1	2	localException3	Exception
    //   180	1	2	localObject4	Object
    //   186	1	2	localIOException2	IOException
    //   13	127	3	arrayOfString2	String[]
    //   178	4	3	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   27	48	141	java/io/IOException
    //   148	152	155	java/lang/Exception
    //   27	48	159	finally
    //   126	130	170	java/lang/Exception
    //   164	168	174	java/lang/Exception
    //   48	62	178	finally
    //   64	101	178	finally
    //   108	126	178	finally
    //   48	62	186	java/io/IOException
    //   64	101	186	java/io/IOException
    //   108	126	186	java/io/IOException
  }
  
  public static String tg()
  {
    GMTrace.i(13803085365248L, 102841);
    Object localObject2 = null;
    try
    {
      BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
      Object localObject1 = localObject2;
      if (localBluetoothAdapter != null)
      {
        localObject1 = localObject2;
        if (localBluetoothAdapter.isEnabled()) {
          localObject1 = localBluetoothAdapter.getAddress();
        }
      }
      localObject1 = bg.nl((String)localObject1);
      GMTrace.o(13803085365248L, 102841);
      return (String)localObject1;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.DeviceInfo", "getBlueToothAddress failed: %s", new Object[] { bg.f(localException) });
      GMTrace.o(13803085365248L, 102841);
    }
    return "";
  }
  
  @SuppressLint({"NewApi"})
  public static String th()
  {
    GMTrace.i(13803219582976L, 102842);
    for (Object localObject = null;; localObject = str)
    {
      try
      {
        if (Build.VERSION.SDK_INT < 14) {
          break label41;
        }
        str = Build.getRadioVersion();
        localObject = str;
      }
      catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
      {
        String str;
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
        throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
      }
      catch (Throwable localThrowable)
      {
        label41:
        for (;;) {}
      }
      localObject = bg.nl((String)localObject);
      GMTrace.o(13803219582976L, 102842);
      return (String)localObject;
      str = Build.RADIO;
    }
  }
  
  public static String ti()
  {
    GMTrace.i(13803353800704L, 102843);
    String str = Build.VERSION.RELEASE;
    GMTrace.o(13803353800704L, 102843);
    return str;
  }
  
  public static String tj()
  {
    GMTrace.i(13803488018432L, 102844);
    try
    {
      String str = bg.nl(((TelephonyManager)ab.getContext().getSystemService("phone")).getSubscriberId());
      GMTrace.o(13803488018432L, 102844);
      return str;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.DeviceInfo", localException, "getPhoneIMSI", new Object[0]);
      GMTrace.o(13803488018432L, 102844);
    }
    return "";
  }
  
  public static String tk()
  {
    GMTrace.i(13803622236160L, 102845);
    try
    {
      String str = bg.nl(((TelephonyManager)ab.getContext().getSystemService("phone")).getSimSerialNumber());
      GMTrace.o(13803622236160L, 102845);
      return str;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.DeviceInfo", localException, "getPhoneICCID", new Object[0]);
      GMTrace.o(13803622236160L, 102845);
    }
    return "";
  }
  
  @SuppressLint({"NewApi"})
  public static String tl()
  {
    GMTrace.i(13803756453888L, 102846);
    String str = null;
    if (Build.VERSION.SDK_INT >= 9) {
      str = Build.SERIAL;
    }
    str = bg.nl(str);
    GMTrace.o(13803756453888L, 102846);
    return str;
  }
  
  public static Map<String, String> tm()
  {
    GMTrace.i(13803890671616L, 102847);
    HashMap localHashMap = new HashMap();
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder(new String[] { "/system/bin/cat", "/proc/cpuinfo" }).start().getInputStream()));
      for (;;)
      {
        Object localObject = localBufferedReader.readLine();
        if (localObject == null) {
          break;
        }
        if (!((String)localObject).trim().equals(""))
        {
          localObject = ((String)localObject).split(":");
          if (localObject.length > 1) {
            localHashMap.put(localObject[0].trim().toLowerCase(), localObject[1].trim());
          }
        }
      }
      GMTrace.o(13803890671616L, 102847);
    }
    catch (IOException localIOException) {}
    for (;;)
    {
      return localHashMap;
      localIOException.close();
    }
  }
  
  public static int tn()
  {
    GMTrace.i(13804024889344L, 102848);
    try
    {
      int i = new File("/sys/devices/system/cpu").listFiles(new a()).length;
      GMTrace.o(13804024889344L, 102848);
      return i;
    }
    catch (Exception localException)
    {
      GMTrace.o(13804024889344L, 102848);
    }
    return 1;
  }
  
  public static String to()
  {
    GMTrace.i(13804159107072L, 102849);
    String str = "android-" + Build.MODEL + "-" + Build.VERSION.SDK_INT;
    GMTrace.o(13804159107072L, 102849);
    return str;
  }
  
  final class a
    implements FileFilter
  {
    a()
    {
      GMTrace.i(13799327268864L, 102813);
      GMTrace.o(13799327268864L, 102813);
    }
    
    public final boolean accept(File paramFile)
    {
      GMTrace.i(13799461486592L, 102814);
      if (Pattern.matches("cpu[0-9]+", paramFile.getName()))
      {
        GMTrace.o(13799461486592L, 102814);
        return true;
      }
      GMTrace.o(13799461486592L, 102814);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\d\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */