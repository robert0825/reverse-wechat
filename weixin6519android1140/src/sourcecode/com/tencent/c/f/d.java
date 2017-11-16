package com.tencent.c.f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.Proxy;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public static String XV(String paramString)
  {
    try
    {
      Object localObject = Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class });
      ((Method)localObject).setAccessible(true);
      localObject = (String)((Method)localObject).invoke(null, new Object[] { paramString });
      paramString = (String)localObject;
      if (localObject == null) {
        paramString = "";
      }
      return paramString;
    }
    catch (Throwable paramString)
    {
      h.cd(" getBuildPropByReflect: " + paramString);
    }
    return "";
  }
  
  public static int cmR()
  {
    try
    {
      int i = Integer.parseInt(Build.VERSION.SDK);
      return i;
    }
    catch (Throwable localThrowable)
    {
      h.cd("getSDKVersion: " + localThrowable);
    }
    return 0;
  }
  
  /* Error */
  public static String cnI()
  {
    // Byte code:
    //   0: new 81	java/io/FileInputStream
    //   3: dup
    //   4: ldc 83
    //   6: invokespecial 84	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   9: astore_0
    //   10: new 86	java/io/BufferedReader
    //   13: dup
    //   14: new 88	java/io/InputStreamReader
    //   17: dup
    //   18: aload_0
    //   19: invokespecial 91	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   22: sipush 8192
    //   25: invokespecial 94	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   28: astore_2
    //   29: new 41	java/lang/StringBuilder
    //   32: dup
    //   33: ldc 39
    //   35: invokespecial 47	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: astore_1
    //   39: aload_2
    //   40: invokevirtual 97	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   43: astore_3
    //   44: aload_3
    //   45: ifnull +38 -> 83
    //   48: aload_1
    //   49: aload_3
    //   50: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: goto -15 -> 39
    //   57: astore_3
    //   58: aload_3
    //   59: invokestatic 103	com/tencent/c/f/h:ce	(Ljava/lang/Object;)V
    //   62: aload_2
    //   63: invokevirtual 107	java/io/BufferedReader:close	()V
    //   66: aload_0
    //   67: invokevirtual 110	java/io/InputStream:close	()V
    //   70: aload_1
    //   71: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: areturn
    //   75: astore_0
    //   76: aload_0
    //   77: invokestatic 103	com/tencent/c/f/h:ce	(Ljava/lang/Object;)V
    //   80: ldc 39
    //   82: areturn
    //   83: aload_2
    //   84: invokevirtual 107	java/io/BufferedReader:close	()V
    //   87: aload_0
    //   88: invokevirtual 110	java/io/InputStream:close	()V
    //   91: aload_1
    //   92: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   95: areturn
    //   96: astore_2
    //   97: aload_2
    //   98: invokestatic 103	com/tencent/c/f/h:ce	(Ljava/lang/Object;)V
    //   101: goto -14 -> 87
    //   104: astore_0
    //   105: aload_0
    //   106: invokestatic 103	com/tencent/c/f/h:ce	(Ljava/lang/Object;)V
    //   109: goto -18 -> 91
    //   112: astore_2
    //   113: aload_2
    //   114: invokestatic 103	com/tencent/c/f/h:ce	(Ljava/lang/Object;)V
    //   117: goto -51 -> 66
    //   120: astore_0
    //   121: aload_0
    //   122: invokestatic 103	com/tencent/c/f/h:ce	(Ljava/lang/Object;)V
    //   125: goto -55 -> 70
    //   128: astore_1
    //   129: aload_2
    //   130: invokevirtual 107	java/io/BufferedReader:close	()V
    //   133: aload_0
    //   134: invokevirtual 110	java/io/InputStream:close	()V
    //   137: aload_1
    //   138: athrow
    //   139: astore_2
    //   140: aload_2
    //   141: invokestatic 103	com/tencent/c/f/h:ce	(Ljava/lang/Object;)V
    //   144: goto -11 -> 133
    //   147: astore_0
    //   148: aload_0
    //   149: invokestatic 103	com/tencent/c/f/h:ce	(Ljava/lang/Object;)V
    //   152: goto -15 -> 137
    // Local variable table:
    //   start	length	slot	name	signature
    //   9	58	0	localFileInputStream	java.io.FileInputStream
    //   75	13	0	localThrowable1	Throwable
    //   104	2	0	localThrowable2	Throwable
    //   120	14	0	localThrowable3	Throwable
    //   147	2	0	localThrowable4	Throwable
    //   38	54	1	localStringBuilder	StringBuilder
    //   128	10	1	localObject	Object
    //   28	56	2	localBufferedReader	java.io.BufferedReader
    //   96	2	2	localThrowable5	Throwable
    //   112	18	2	localThrowable6	Throwable
    //   139	2	2	localThrowable7	Throwable
    //   43	7	3	str	String
    //   57	2	3	localThrowable8	Throwable
    // Exception table:
    //   from	to	target	type
    //   39	44	57	java/lang/Throwable
    //   48	54	57	java/lang/Throwable
    //   0	10	75	java/lang/Throwable
    //   83	87	96	java/lang/Throwable
    //   87	91	104	java/lang/Throwable
    //   62	66	112	java/lang/Throwable
    //   66	70	120	java/lang/Throwable
    //   39	44	128	finally
    //   48	54	128	finally
    //   58	62	128	finally
    //   129	133	139	java/lang/Throwable
    //   133	137	147	java/lang/Throwable
  }
  
  private static String cnJ()
  {
    try
    {
      Object localObject1 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (NetworkInterface)((Iterator)localObject1).next();
        if (((NetworkInterface)localObject2).getName().equalsIgnoreCase("wlan0"))
        {
          localObject2 = ((NetworkInterface)localObject2).getHardwareAddress();
          if (localObject2 != null)
          {
            localObject1 = new StringBuilder();
            int j = localObject2.length;
            int i = 0;
            while (i < j)
            {
              ((StringBuilder)localObject1).append(String.format("%02x:", new Object[] { Byte.valueOf(localObject2[i]) }));
              i += 1;
            }
            if (((StringBuilder)localObject1).length() > 0) {
              ((StringBuilder)localObject1).deleteCharAt(((StringBuilder)localObject1).length() - 1);
            }
            localObject1 = ((StringBuilder)localObject1).toString();
            return (String)localObject1;
          }
        }
      }
    }
    catch (Throwable localThrowable)
    {
      h.cd("getMac2: " + localThrowable);
    }
    return "";
  }
  
  public static String fX(Context paramContext)
  {
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      h.cd("getIMEI: " + paramContext);
    }
    return "";
  }
  
  public static String fY(Context paramContext)
  {
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      h.cd("getIMSI: " + paramContext);
    }
    return "";
  }
  
  public static String fZ(Context paramContext)
  {
    try
    {
      paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      h.cd("getAndroidId: " + paramContext);
    }
    return "";
  }
  
  public static int ga(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || ((localNetworkInfo.getState() != NetworkInfo.State.CONNECTING) && (localNetworkInfo.getState() != NetworkInfo.State.CONNECTED))) {
      return a.xSV;
    }
    if (localNetworkInfo.getType() == 1) {
      return a.xSS;
    }
    if (localNetworkInfo.getType() == 0)
    {
      if ((Proxy.getDefaultHost() != null) || (Proxy.getHost(paramContext) != null)) {
        return a.xST;
      }
      return a.xSU;
    }
    return a.xSV;
  }
  
  public static String gb(Context paramContext)
  {
    try
    {
      paramContext = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo();
      if (paramContext == null) {
        break label69;
      }
      paramContext = paramContext.getMacAddress();
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        Object localObject;
        h.cd("getMac: " + paramContext);
        label69:
        paramContext = "";
      }
    }
    if (!TextUtils.isEmpty(paramContext))
    {
      localObject = paramContext;
      if (!paramContext.equals("02:00:00:00:00:00")) {}
    }
    else
    {
      localObject = cnJ();
    }
    return (String)localObject;
  }
  
  /* Error */
  public static String mV(boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 6
    //   9: iload_0
    //   10: ifeq +136 -> 146
    //   13: ldc_w 298
    //   16: astore_3
    //   17: ldc_w 300
    //   20: astore_1
    //   21: new 86	java/io/BufferedReader
    //   24: dup
    //   25: new 302	java/io/FileReader
    //   28: dup
    //   29: new 41	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   36: aload_3
    //   37: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: ldc_w 304
    //   43: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: invokespecial 305	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   52: invokespecial 308	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   55: astore_2
    //   56: aload_2
    //   57: invokevirtual 97	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   60: astore 7
    //   62: aload 6
    //   64: astore 4
    //   66: aload 7
    //   68: ifnull +92 -> 160
    //   71: aload 6
    //   73: astore 4
    //   75: aload 7
    //   77: invokevirtual 311	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   80: aload_1
    //   81: invokevirtual 288	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   84: ifeq +76 -> 160
    //   87: new 86	java/io/BufferedReader
    //   90: dup
    //   91: new 302	java/io/FileReader
    //   94: dup
    //   95: new 41	java/lang/StringBuilder
    //   98: dup
    //   99: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   102: aload_3
    //   103: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: ldc_w 313
    //   109: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokespecial 305	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   118: invokespecial 308	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   121: astore_1
    //   122: aload_1
    //   123: invokevirtual 97	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   126: astore_3
    //   127: aload_3
    //   128: ifnull +29 -> 157
    //   131: aload_3
    //   132: invokevirtual 316	java/lang/String:trim	()Ljava/lang/String;
    //   135: astore_3
    //   136: aload_2
    //   137: invokevirtual 107	java/io/BufferedReader:close	()V
    //   140: aload_1
    //   141: invokevirtual 107	java/io/BufferedReader:close	()V
    //   144: aload_3
    //   145: areturn
    //   146: ldc_w 318
    //   149: astore_3
    //   150: ldc_w 320
    //   153: astore_1
    //   154: goto -133 -> 21
    //   157: aload_1
    //   158: astore 4
    //   160: aload_2
    //   161: invokevirtual 107	java/io/BufferedReader:close	()V
    //   164: aload 4
    //   166: ifnull +8 -> 174
    //   169: aload 4
    //   171: invokevirtual 107	java/io/BufferedReader:close	()V
    //   174: ldc 39
    //   176: areturn
    //   177: astore_3
    //   178: aconst_null
    //   179: astore_1
    //   180: aload 4
    //   182: astore_2
    //   183: new 41	java/lang/StringBuilder
    //   186: dup
    //   187: ldc_w 322
    //   190: invokespecial 47	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   193: aload_3
    //   194: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   197: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   200: invokestatic 61	com/tencent/c/f/h:cd	(Ljava/lang/Object;)V
    //   203: aload_2
    //   204: ifnull +7 -> 211
    //   207: aload_2
    //   208: invokevirtual 107	java/io/BufferedReader:close	()V
    //   211: aload_1
    //   212: ifnull -38 -> 174
    //   215: aload_1
    //   216: invokevirtual 107	java/io/BufferedReader:close	()V
    //   219: goto -45 -> 174
    //   222: astore_1
    //   223: goto -49 -> 174
    //   226: astore_1
    //   227: aconst_null
    //   228: astore_2
    //   229: aload 5
    //   231: astore_3
    //   232: aload_2
    //   233: ifnull +7 -> 240
    //   236: aload_2
    //   237: invokevirtual 107	java/io/BufferedReader:close	()V
    //   240: aload_3
    //   241: ifnull +7 -> 248
    //   244: aload_3
    //   245: invokevirtual 107	java/io/BufferedReader:close	()V
    //   248: aload_1
    //   249: athrow
    //   250: astore_2
    //   251: goto -111 -> 140
    //   254: astore_1
    //   255: aload_3
    //   256: areturn
    //   257: astore_1
    //   258: goto -94 -> 164
    //   261: astore_1
    //   262: goto -88 -> 174
    //   265: astore_2
    //   266: goto -55 -> 211
    //   269: astore_2
    //   270: goto -30 -> 240
    //   273: astore_2
    //   274: goto -26 -> 248
    //   277: astore_1
    //   278: aload 5
    //   280: astore_3
    //   281: goto -49 -> 232
    //   284: astore 4
    //   286: aload_1
    //   287: astore_3
    //   288: aload 4
    //   290: astore_1
    //   291: goto -59 -> 232
    //   294: astore 4
    //   296: aload_1
    //   297: astore_3
    //   298: aload 4
    //   300: astore_1
    //   301: goto -69 -> 232
    //   304: astore_3
    //   305: aconst_null
    //   306: astore_1
    //   307: goto -124 -> 183
    //   310: astore_3
    //   311: goto -128 -> 183
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	314	0	paramBoolean	boolean
    //   20	196	1	localObject1	Object
    //   222	1	1	localIOException1	java.io.IOException
    //   226	23	1	localObject2	Object
    //   254	1	1	localIOException2	java.io.IOException
    //   257	1	1	localIOException3	java.io.IOException
    //   261	1	1	localIOException4	java.io.IOException
    //   277	10	1	localObject3	Object
    //   290	17	1	localObject4	Object
    //   55	182	2	localObject5	Object
    //   250	1	2	localIOException5	java.io.IOException
    //   265	1	2	localIOException6	java.io.IOException
    //   269	1	2	localIOException7	java.io.IOException
    //   273	1	2	localIOException8	java.io.IOException
    //   16	134	3	str1	String
    //   177	17	3	localThrowable1	Throwable
    //   231	67	3	localObject6	Object
    //   304	1	3	localThrowable2	Throwable
    //   310	1	3	localThrowable3	Throwable
    //   1	180	4	localObject7	Object
    //   284	5	4	localObject8	Object
    //   294	5	4	localObject9	Object
    //   4	275	5	localObject10	Object
    //   7	65	6	localObject11	Object
    //   60	16	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   21	56	177	java/lang/Throwable
    //   215	219	222	java/io/IOException
    //   21	56	226	finally
    //   136	140	250	java/io/IOException
    //   140	144	254	java/io/IOException
    //   160	164	257	java/io/IOException
    //   169	174	261	java/io/IOException
    //   207	211	265	java/io/IOException
    //   236	240	269	java/io/IOException
    //   244	248	273	java/io/IOException
    //   56	62	277	finally
    //   75	122	277	finally
    //   122	127	284	finally
    //   131	136	284	finally
    //   183	203	294	finally
    //   56	62	304	java/lang/Throwable
    //   75	122	304	java/lang/Throwable
    //   122	127	310	java/lang/Throwable
    //   131	136	310	java/lang/Throwable
  }
  
  public static enum a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */