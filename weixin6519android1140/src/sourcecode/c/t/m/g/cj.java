package c.t.m.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.tencent.map.geolocation.internal.TencentHttpClient;
import com.tencent.map.geolocation.internal.TencentHttpClientFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.eclipse.jdt.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class cj
{
  private static volatile cj m;
  public final Context a;
  private final ck b;
  private final ExecutorService c;
  private final HashMap<String, cn> d;
  private final PackageManager e;
  private final TelephonyManager f;
  private final WifiManager g;
  private final LocationManager h;
  private final TencentHttpClient i;
  public CountDownLatch j;
  private final SharedPreferences k;
  private String l;
  private List<dz> n;
  
  private cj(Context paramContext)
  {
    this.a = paramContext;
    this.e = paramContext.getPackageManager();
    this.f = ((TelephonyManager)paramContext.getSystemService("phone"));
    this.g = ((WifiManager)paramContext.getSystemService("wifi"));
    this.h = ((LocationManager)paramContext.getSystemService("location"));
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("channelId", b.a.c(paramContext.getPackageName()));
    this.i = TencentHttpClientFactory.getInstance().getTencentHttpClient(paramContext, (Bundle)localObject);
    this.k = paramContext.getSharedPreferences("LocationSDK", 0);
    localObject = new ThreadFactory()
    {
      public final Thread newThread(Runnable paramAnonymousRunnable)
      {
        return new Thread(paramAnonymousRunnable, "network_request_pool");
      }
    };
    localObject = new ThreadPoolExecutor(1, 5, 60000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), (ThreadFactory)localObject);
    if (Build.VERSION.SDK_INT >= 9) {
      ((ThreadPoolExecutor)localObject).allowCoreThreadTimeOut(true);
    }
    this.c = ((ExecutorService)localObject);
    this.d = new HashMap();
    if (Build.VERSION.SDK_INT >= 12) {
      this.d.put("cell", new co("cell"));
    }
    this.b = new ck(this);
    try
    {
      this.b.h = b(paramContext);
      a();
      return;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  public static cj a(Context paramContext)
  {
    if (m == null) {}
    try
    {
      if (m == null) {
        m = new cj(paramContext);
      }
      return m;
    }
    finally {}
  }
  
  private static String b(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData;
      if (paramContext != null)
      {
        if (paramContext.containsKey("TencentGeoLocationSDK")) {
          return paramContext.getString("TencentGeoLocationSDK");
        }
        if (paramContext.containsKey("TencentMapSDK"))
        {
          paramContext = paramContext.getString("TencentMapSDK");
          return paramContext;
        }
        return "";
      }
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  private String b(String paramString)
  {
    ck localck = this.b;
    HashMap localHashMap = new HashMap();
    localHashMap.put("version", localck.d());
    localHashMap.put("app_name", c(localck.i));
    localHashMap.put("app_label", c(localck.j));
    localHashMap.put("l", paramString);
    try
    {
      paramString = new JSONObject(localHashMap);
      localck = this.b;
      localHashMap = new HashMap();
      localHashMap.put("imei", c(localck.a()));
      localHashMap.put("imsi", c(localck.b()));
      localHashMap.put("n", c(b.a.a(localck.e)));
      localHashMap.put("qq", c(b.a.a(localck.g)));
      localHashMap.put("mac", c(localck.c().toLowerCase(Locale.ENGLISH)));
      localHashMap.put("model", c(Build.MANUFACTURER + "_" + Build.MODEL));
      paramString = paramString.put("attribute", new JSONObject(localHashMap)).toString();
      return paramString;
    }
    catch (JSONException paramString) {}
    return null;
  }
  
  private static String c(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  private PackageInfo n()
  {
    try
    {
      PackageInfo localPackageInfo = this.e.getPackageInfo(this.a.getPackageName(), 0);
      return localPackageInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return new PackageInfo();
  }
  
  /* Error */
  private String o()
  {
    // Byte code:
    //   0: ldc -51
    //   2: astore_3
    //   3: aload_0
    //   4: getfield 115	c/t/m/g/cj:k	Landroid/content/SharedPreferences;
    //   7: ldc_w 302
    //   10: ldc -51
    //   12: invokeinterface 307 3 0
    //   17: astore 4
    //   19: aload 4
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic 313	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   26: ifne +5 -> 31
    //   29: aload_3
    //   30: areturn
    //   31: invokestatic 319	java/net/NetworkInterface:getNetworkInterfaces	()Ljava/util/Enumeration;
    //   34: astore 5
    //   36: aload_3
    //   37: astore 4
    //   39: aload 4
    //   41: astore_3
    //   42: aload 5
    //   44: invokeinterface 325 1 0
    //   49: ifeq +203 -> 252
    //   52: aload 4
    //   54: astore_3
    //   55: aload 5
    //   57: invokeinterface 329 1 0
    //   62: checkcast 315	java/net/NetworkInterface
    //   65: astore 6
    //   67: aload 6
    //   69: ifnull -30 -> 39
    //   72: aload 4
    //   74: astore_3
    //   75: aload 6
    //   77: invokevirtual 332	java/net/NetworkInterface:getName	()Ljava/lang/String;
    //   80: ldc_w 334
    //   83: invokevirtual 337	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   86: ifeq -47 -> 39
    //   89: aload 4
    //   91: astore_3
    //   92: aload 6
    //   94: invokevirtual 341	java/net/NetworkInterface:getHardwareAddress	()[B
    //   97: astore 6
    //   99: aload 6
    //   101: ifnull -62 -> 39
    //   104: aload 4
    //   106: astore_3
    //   107: aload 6
    //   109: arraylength
    //   110: ifeq -71 -> 39
    //   113: aload 4
    //   115: astore_3
    //   116: new 263	java/lang/StringBuilder
    //   119: dup
    //   120: invokespecial 264	java/lang/StringBuilder:<init>	()V
    //   123: astore 7
    //   125: aload 4
    //   127: astore_3
    //   128: aload 6
    //   130: arraylength
    //   131: istore_2
    //   132: iconst_0
    //   133: istore_1
    //   134: iload_1
    //   135: iload_2
    //   136: if_icmpge +39 -> 175
    //   139: aload 4
    //   141: astore_3
    //   142: aload 7
    //   144: ldc_w 343
    //   147: iconst_1
    //   148: anewarray 4	java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload 6
    //   155: iload_1
    //   156: baload
    //   157: invokestatic 349	java/lang/Byte:valueOf	(B)Ljava/lang/Byte;
    //   160: aastore
    //   161: invokestatic 353	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   164: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: iload_1
    //   169: iconst_1
    //   170: iadd
    //   171: istore_1
    //   172: goto -38 -> 134
    //   175: aload 4
    //   177: astore_3
    //   178: aload 7
    //   180: invokevirtual 357	java/lang/StringBuilder:length	()I
    //   183: ifle +19 -> 202
    //   186: aload 4
    //   188: astore_3
    //   189: aload 7
    //   191: aload 7
    //   193: invokevirtual 357	java/lang/StringBuilder:length	()I
    //   196: iconst_1
    //   197: isub
    //   198: invokevirtual 361	java/lang/StringBuilder:deleteCharAt	(I)Ljava/lang/StringBuilder;
    //   201: pop
    //   202: aload 4
    //   204: astore_3
    //   205: aload 7
    //   207: invokevirtual 281	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   210: astore 4
    //   212: aload 4
    //   214: astore_3
    //   215: aload_0
    //   216: getfield 115	c/t/m/g/cj:k	Landroid/content/SharedPreferences;
    //   219: invokeinterface 365 1 0
    //   224: ldc_w 302
    //   227: aload 4
    //   229: invokeinterface 370 3 0
    //   234: invokeinterface 373 1 0
    //   239: goto -200 -> 39
    //   242: astore 4
    //   244: aload 4
    //   246: invokevirtual 374	java/lang/Throwable:toString	()Ljava/lang/String;
    //   249: pop
    //   250: aload_3
    //   251: areturn
    //   252: aload 4
    //   254: areturn
    //   255: astore 4
    //   257: goto -13 -> 244
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	260	0	this	cj
    //   133	39	1	i1	int
    //   131	6	2	i2	int
    //   2	249	3	localObject1	Object
    //   17	211	4	localObject2	Object
    //   242	11	4	localThrowable1	Throwable
    //   255	1	4	localThrowable2	Throwable
    //   34	22	5	localEnumeration	java.util.Enumeration
    //   65	89	6	localObject3	Object
    //   123	83	7	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   3	19	242	java/lang/Throwable
    //   42	52	242	java/lang/Throwable
    //   55	67	242	java/lang/Throwable
    //   75	89	242	java/lang/Throwable
    //   92	99	242	java/lang/Throwable
    //   107	113	242	java/lang/Throwable
    //   116	125	242	java/lang/Throwable
    //   128	132	242	java/lang/Throwable
    //   142	168	242	java/lang/Throwable
    //   178	186	242	java/lang/Throwable
    //   189	202	242	java/lang/Throwable
    //   205	212	242	java/lang/Throwable
    //   215	239	242	java/lang/Throwable
    //   22	29	255	java/lang/Throwable
    //   31	36	255	java/lang/Throwable
  }
  
  public final Bundle a(String paramString, byte[] paramArrayOfByte)
  {
    System.currentTimeMillis();
    paramArrayOfByte = this.i.postSync(paramString, paramArrayOfByte);
    System.currentTimeMillis();
    byte[] arrayOfByte = b.a.c(paramArrayOfByte.getByteArray("data_bytes"));
    paramString = "{}";
    if (arrayOfByte != null) {
      paramString = new String(arrayOfByte, paramArrayOfByte.getString("data_charset"));
    }
    paramArrayOfByte.remove("data_charset");
    paramArrayOfByte.remove("data_bytes");
    paramArrayOfByte.putString("result", paramString);
    return paramArrayOfByte;
  }
  
  public final cn a(String paramString)
  {
    paramString = (cn)this.d.get(paramString);
    if (paramString != null) {
      return paramString;
    }
    return cm.a;
  }
  
  public final void a()
  {
    this.j = new CountDownLatch(1);
    new Thread(new Runnable()
    {
      public final void run()
      {
        cj.this.m();
        cj.this.j.countDown();
      }
    }).start();
  }
  
  public final void a(Object paramObject)
  {
    for (;;)
    {
      Object localObject3;
      try
      {
        if (this.n == null) {
          this.n = new ArrayList();
        }
        Object localObject1 = this.n.iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label191;
        }
        localObject2 = ((dz)((Iterator)localObject1).next()).c;
        if (paramObject != localObject2) {
          continue;
        }
        i1 = 1;
        if (i1 != 0) {
          return;
        }
        localObject1 = paramObject.getClass().getDeclaredMethods();
        int i2 = localObject1.length;
        i1 = 0;
        if (i1 >= i2) {
          continue;
        }
        localObject2 = localObject1[i1];
        localObject3 = ((Method)localObject2).getName();
        if ((!((String)localObject3).startsWith("on")) || (!((String)localObject3).endsWith("Event"))) {
          break label184;
        }
        localObject3 = ((Method)localObject2).getParameterTypes();
        if (localObject3.length != 1) {
          throw new IllegalArgumentException("EventHandler methods must specify a single Object paramter.");
        }
      }
      finally {}
      Object localObject2 = new dz(localObject3[0], (Method)localObject2, paramObject);
      this.n.add(localObject2);
      label184:
      i1 += 1;
      continue;
      label191:
      int i1 = 0;
    }
  }
  
  @Nullable
  public final TelephonyManager b()
  {
    return this.f;
  }
  
  public final void b(Object paramObject)
  {
    List localList;
    try
    {
      localList = this.n;
      if (localList == null) {
        break label119;
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        dz localdz = (dz)localIterator.next();
        Object localObject = localdz.c;
        if ((localObject == null) || (localObject == paramObject)) {
          localArrayList.add(localdz);
        }
      }
      paramObject = localArrayList.iterator();
    }
    finally {}
    while (((Iterator)paramObject).hasNext()) {
      localList.remove((dz)((Iterator)paramObject).next());
    }
    label119:
  }
  
  @Nullable
  public final WifiManager c()
  {
    return this.g;
  }
  
  /* Error */
  public final void c(@Nullable Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnonnull +6 -> 9
    //   6: aload_0
    //   7: monitorexit
    //   8: return
    //   9: aload_0
    //   10: getfield 438	c/t/m/g/cj:n	Ljava/util/List;
    //   13: astore_3
    //   14: aload_3
    //   15: ifnull -9 -> 6
    //   18: aload_3
    //   19: invokeinterface 447 1 0
    //   24: astore_3
    //   25: aload_3
    //   26: invokeinterface 452 1 0
    //   31: ifeq -25 -> 6
    //   34: aload_3
    //   35: invokeinterface 455 1 0
    //   40: checkcast 457	c/t/m/g/dz
    //   43: astore 4
    //   45: aload_1
    //   46: invokevirtual 464	java/lang/Object:getClass	()Ljava/lang/Class;
    //   49: aload 4
    //   51: getfield 508	c/t/m/g/dz:a	Ljava/lang/Class;
    //   54: invokevirtual 511	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   57: istore_2
    //   58: iload_2
    //   59: ifeq -34 -> 25
    //   62: aload 4
    //   64: getfield 514	c/t/m/g/dz:b	Ljava/lang/reflect/Method;
    //   67: aload 4
    //   69: getfield 460	c/t/m/g/dz:c	Ljava/lang/Object;
    //   72: iconst_1
    //   73: anewarray 4	java/lang/Object
    //   76: dup
    //   77: iconst_0
    //   78: aload_1
    //   79: aastore
    //   80: invokevirtual 518	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   83: pop
    //   84: goto -59 -> 25
    //   87: astore 4
    //   89: goto -64 -> 25
    //   92: astore_1
    //   93: aload_0
    //   94: monitorexit
    //   95: aload_1
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	cj
    //   0	97	1	paramObject	Object
    //   57	2	2	bool	boolean
    //   13	22	3	localObject	Object
    //   43	25	4	localdz	dz
    //   87	1	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   62	84	87	java/lang/Exception
    //   9	14	92	finally
    //   18	25	92	finally
    //   25	58	92	finally
    //   62	84	92	finally
  }
  
  @Nullable
  public final LocationManager d()
  {
    return this.h;
  }
  
  public final boolean e()
  {
    return this.f != null;
  }
  
  public final boolean f()
  {
    return this.g != null;
  }
  
  public final boolean g()
  {
    return this.h != null;
  }
  
  public final ck h()
  {
    return this.b;
  }
  
  public final ck i()
  {
    if (-1L > 0L) {}
    try
    {
      if (!this.j.await(-1L, TimeUnit.MILLISECONDS))
      {
        return null;
        this.j.await();
      }
      return this.b;
    }
    catch (InterruptedException localInterruptedException) {}
    return null;
  }
  
  public final ExecutorService j()
  {
    return this.c;
  }
  
  public final String k()
  {
    if (!ch.a().d("up_apps")) {
      return null;
    }
    int i2 = (int)(System.currentTimeMillis() / 86400000L % 5L);
    for (;;)
    {
      try
      {
        i1 = Math.abs(this.l.hashCode()) % 5;
        if (i2 == i1) {
          if (!this.k.getBoolean("flag", false))
          {
            try
            {
              Object localObject1 = this.e.getInstalledPackages(8192);
              localStringBuilder = new StringBuilder();
              localObject1 = ((List)localObject1).iterator();
              if (!((Iterator)localObject1).hasNext()) {
                continue;
              }
              localPackageInfo = (PackageInfo)((Iterator)localObject1).next();
              i1 = localPackageInfo.applicationInfo.flags;
              localObject2 = localPackageInfo.applicationInfo;
              if ((i1 & 0x1) > 0) {
                continue;
              }
              localObject2 = localPackageInfo.applicationInfo.loadLabel(this.e).toString();
              if ((((String)localObject2).length() > 30) || (((String)localObject2).startsWith("com.")) || (((String)localObject2).contains("theme"))) {
                break label334;
              }
              if (!((String)localObject2).contains("CheilPengtai")) {
                continue;
              }
            }
            catch (Exception localException1)
            {
              StringBuilder localStringBuilder;
              PackageInfo localPackageInfo;
              Object localObject2;
              this.k.edit().putBoolean("flag", true).apply();
            }
            if (i1 != 0) {
              continue;
            }
            localStringBuilder.append((String)localObject2);
            localStringBuilder.append('_');
            localStringBuilder.append(localPackageInfo.versionName);
            localStringBuilder.append('|');
            continue;
          }
          else
          {
            return null;
          }
        }
      }
      catch (Exception localException2)
      {
        i1 = 0;
        continue;
        i1 = 0;
        continue;
        this.k.edit().putBoolean("flag", true).apply();
        String str = b(localException2.toString());
        return str;
      }
      this.k.edit().putBoolean("flag", false).apply();
      continue;
      label334:
      int i1 = 1;
    }
  }
  
  public final TencentHttpClient l()
  {
    return this.i;
  }
  
  final void m()
  {
    for (;;)
    {
      try
      {
        ck localck = this.b;
        PackageInfo localPackageInfo = n();
        int i1 = localPackageInfo.versionCode;
        localck.i = localPackageInfo.versionName;
        Object localObject1 = this.a.getApplicationInfo().loadLabel(this.e);
        if (localObject1 != null)
        {
          localObject1 = ((CharSequence)localObject1).toString();
          localck.j = ((String)localObject1);
          localObject1 = this.f;
          Object localObject2;
          if (localObject1 != null)
          {
            localObject2 = new int[2];
            dt.a((TelephonyManager)localObject1, (int[])localObject2);
            localck.k = localObject2[0];
            localck.l = localObject2[1];
            localck.b = ((TelephonyManager)localObject1).getPhoneType();
          }
          try
          {
            this.l = this.f.getDeviceId();
            this.l = dx.a(this.l, dx.a).toUpperCase(Locale.ENGLISH);
            localObject2 = dx.a(((TelephonyManager)localObject1).getSubscriberId(), dx.b);
            localObject1 = dx.a(((TelephonyManager)localObject1).getLine1Number(), dx.c);
            localck.c = this.l;
            localck.d = ((String)localObject2);
            localck.e = ((String)localObject1);
            localck.f = dx.a(o().replaceAll(":", "").toUpperCase(Locale.ENGLISH), dx.d);
            localObject1 = this.e;
            boolean bool1 = ((PackageManager)localObject1).hasSystemFeature("android.hardware.location.gps");
            boolean bool2 = ((PackageManager)localObject1).hasSystemFeature("android.hardware.wifi");
            boolean bool3 = ((PackageManager)localObject1).hasSystemFeature("android.hardware.telephony");
            new StringBuilder("doInBg: hasGps=").append(bool1).append(",hasWifi=").append(bool2).append(",hasCell=").append(bool3);
            new StringBuilder("os:").append(Build.MODEL).append(" ").append(Build.VERSION.RELEASE).append(" ").append(localck.a()).append(" net:").append(localck.k).append(" ").append(localck.l).append(" app:").append(localPackageInfo.versionCode).append(" ").append(localPackageInfo.versionName).append(" sdk: ").append(localck.d()).append(" ").append(localck.e());
            return;
          }
          catch (Throwable localThrowable2)
          {
            localThrowable2.toString();
            continue;
          }
        }
        String str = "unknown";
      }
      catch (Throwable localThrowable1)
      {
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */