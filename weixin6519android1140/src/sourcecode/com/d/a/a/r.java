package com.d.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import org.json.JSONObject;

final class r
  extends d
{
  private static final DecimalFormat aGB = new DecimalFormat("0000000000");
  private static final DecimalFormat aGC = new DecimalFormat("0000000000000000");
  private static r aGD;
  private String aGE;
  private String aGF;
  private final b aGG = new b();
  int aGH;
  z aGI;
  private SharedPreferences aGJ;
  public f aGK;
  private final Object aGL = new Object();
  private final d aGM = new d(this);
  q aGN;
  String aGO;
  private int mRetryCount;
  
  private static String a(Long paramLong)
  {
    if (paramLong == null) {
      throw new Exception("OnlineModule: null source id");
    }
    try
    {
      paramLong = aGB.format(paramLong);
      return paramLong;
    }
    catch (NumberFormatException paramLong)
    {
      throw new Exception("OnlineModule: invalid source id");
    }
  }
  
  private static String aM(String paramString)
  {
    try
    {
      long l1 = Long.parseLong(paramString);
      long l2 = System.currentTimeMillis();
      paramString = "T" + aGC.format(l1 + l2);
      return paramString;
    }
    catch (NumberFormatException paramString)
    {
      throw new Exception("OnlineModule: invalid device id, type: 0");
    }
  }
  
  private static f b(String paramString, long paramLong1, long paramLong2)
  {
    long l;
    try
    {
      paramString = new JSONObject(paramString);
      int i = paramString.optInt("errorcode", -5);
      if (i != 0) {
        return new f(i, null, null);
      }
      l = paramString.optLong("hitarea", 0L);
      paramString = new String(Base64.decode(paramString.optString("swdata", null), 0), "UTF-8");
      if (y.aJN) {
        o.l("data_transaction_log_" + y.aJU, paramString);
      }
      if ((paramString.length() <= h.aEi) || (!paramString.startsWith("$UP,"))) {
        throw new Exception("OnlineModule: parse data upload reply and generate msg: invalid arg");
      }
    }
    catch (Exception paramString)
    {
      if (y.aJN) {
        o.l("data_transaction_log_" + y.aJU, "parse json data error");
      }
      throw new Exception("parse json data error");
    }
    switch (paramString.charAt(h.aEi))
    {
    default: 
    case '1': 
      do
      {
        throw new Exception("OnlineModule: unable to parse data upload reply");
      } while (paramString.length() <= h.aEj);
      paramString = d(paramString.substring(h.aEj), l);
      paramString.aJA = paramLong1;
      paramString.aGW = paramLong2;
      return new f(1, paramString, null);
    case '0': 
      if (paramString.length() > h.aEj) {}
      for (paramString = paramString.substring(h.aEj);; paramString = null) {
        return new f(0, null, paramString);
      }
    case '2': 
      if (paramString.length() > h.aEj) {}
      for (paramString = paramString.substring(h.aEj);; paramString = null) {
        return new f(2, null, paramString);
      }
    case '3': 
      if (paramString.length() > h.aEj) {}
      for (paramString = paramString.substring(h.aEj);; paramString = null) {
        return new f(3, null, paramString);
      }
    case '4': 
      if (paramString.length() > h.aEj) {}
      for (paramString = paramString.substring(h.aEj);; paramString = null) {
        return new f(4, null, paramString);
      }
    case '5': 
      if (paramString.length() > h.aEj) {}
      for (paramString = paramString.substring(h.aEj);; paramString = null) {
        return new f(5, null, paramString);
      }
    }
    if (paramString.length() > h.aEj) {}
    for (paramString = paramString.substring(h.aEj);; paramString = null) {
      return new f(6, null, paramString);
    }
  }
  
  private static x d(String paramString, long paramLong)
  {
    int m = 0;
    if (paramString != null)
    {
      paramString = paramString.split(",", -1);
      if (paramString.length == 10) {
        try
        {
          double d1 = Double.parseDouble(paramString[0]);
          double d2 = Double.parseDouble(paramString[1]);
          float f3 = Float.parseFloat(paramString[8]);
          try
          {
            i = Integer.parseInt(paramString[3]);
          }
          catch (NumberFormatException localNumberFormatException2)
          {
            try
            {
              j = Integer.parseInt(paramString[4]);
            }
            catch (NumberFormatException localNumberFormatException2)
            {
              try
              {
                for (;;)
                {
                  k = Integer.parseInt(paramString[5]);
                  try
                  {
                    int n = Integer.parseInt(paramString[7]);
                    m = n;
                  }
                  catch (NumberFormatException localNumberFormatException5)
                  {
                    float f1;
                    for (;;) {}
                  }
                  f1 = 0.0F;
                  try
                  {
                    float f2 = Float.parseFloat(paramString[9]);
                    f1 = f2;
                  }
                  catch (NumberFormatException localNumberFormatException4)
                  {
                    x localx;
                    for (;;) {}
                  }
                  localx = new x();
                  localx.latitude = d1;
                  localx.longitude = d2;
                  localx.aJx = paramString[2];
                  localx.level = i;
                  localx.aJz = j;
                  localx.aJC = k;
                  localx.aJy = paramString[6];
                  localx.aJD = m;
                  localx.aFG = f3;
                  if (localx.aJB == null) {
                    localx.aJB = new x.a();
                  }
                  localx.aJB.aJE = f1;
                  localx.aGm = paramLong;
                  return localx;
                  localNumberFormatException1 = localNumberFormatException1;
                  int i = 0;
                  continue;
                  localNumberFormatException2 = localNumberFormatException2;
                  int j = 0;
                }
              }
              catch (NumberFormatException localNumberFormatException3)
              {
                for (;;)
                {
                  int k = 0;
                }
              }
            }
          }
          throw new Exception("OnlineModule: unable to get location from data upload reply");
        }
        catch (NumberFormatException paramString) {}
      }
    }
  }
  
  static r nN()
  {
    if (aGD == null) {
      aGD = new r();
    }
    return aGD;
  }
  
  private String nQ()
  {
    try
    {
      String str = nS().getString("1-115-10127", "");
      return str;
    }
    catch (Exception localException) {}
    return "";
  }
  
  @SuppressLint({"NewApi"})
  private void nR()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 9)
      {
        nS().edit().remove("1-115-10127").apply();
        return;
      }
      nS().edit().remove("1-115-10127").commit();
      return;
    }
    catch (Exception localException) {}
  }
  
  private SharedPreferences nS()
  {
    if (this.aGJ == null) {
      throw new Exception("OnlineModule: data buffer unavailable");
    }
    return this.aGJ;
  }
  
  final void P(Context paramContext)
  {
    try
    {
      String str2 = this.aGO;
      String str1 = str2;
      if (TextUtils.isEmpty(str2)) {
        str1 = "0000000000";
      }
      this.aGE = aM(str1);
      this.aGF = a(Long.valueOf(System.currentTimeMillis() / 1000L));
      this.aGK = new f(paramContext);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    this.aGJ = paramContext.getSharedPreferences("0-474-85242", 0);
  }
  
  final void Q(Context paramContext) {}
  
  final void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    this.aGI = z.b(paramHandler);
    nO();
  }
  
  public final void a(String paramString, long paramLong1, long paramLong2, int paramInt, boolean paramBoolean)
  {
    if (this.aDI) {}
    label544:
    label606:
    for (;;)
    {
      synchronized (this.aGL)
      {
        String str1 = nQ();
        if (paramString == null) {
          break label606;
        }
        str1 = paramString + str1;
        int i = str1.length();
        long l;
        String str2;
        boolean bool;
        int j;
        int k;
        if (i > 0) {
          try
          {
            l = aa.s(paramLong1);
            i = this.aGH + 1;
            this.aGH = i;
            localObject3 = y.aJH;
            str2 = y.aJM;
            bool = y.aJO;
            j = y.aJI;
            k = y.aJJ;
            if ((localObject3 != null) && (str2 != null)) {
              continue;
            }
            throw new Exception("StringBuilding: null mode or user name");
          }
          catch (Exception localException)
          {
            c(new f(0, null, "connection failure"));
          }
        }
        if (paramBoolean) {
          e(paramString, aa.s(paramLong1));
        }
        return;
        Object localObject3 = new StringBuilder("ST=").append(String.valueOf(l)).append(',').append(i).append(',').append((String)localObject3).append(',').append(str2).append(',');
        if (bool)
        {
          c = '1';
          Object localObject1 = ((StringBuilder)localObject3).append(c).append(',').append(j).append(',').append(k).append(',').append(paramInt).toString() + localException;
          if (y.aJN) {
            o.l("data_transaction_log_" + y.aJU, (String)localObject1);
          }
          localObject1 = Base64.encode(g.l(((String)localObject1).getBytes("UTF-8")), 0);
          localObject3 = new byte[this.aGG.aGQ.length + localObject1.length];
          System.arraycopy(this.aGG.aGQ, 0, localObject3, 0, this.aGG.aGQ.length);
          System.arraycopy(localObject1, 0, localObject3, this.aGG.aGQ.length, localObject1.length);
          this.aGK.imei = this.aGO;
          localObject1 = this.aGK.k((byte[])localObject3).getBytes("UTF-8");
          localObject1 = new String(this.aGN.m((byte[])localObject1));
          if (y.aJN) {
            o.l("data_transaction_log_" + y.aJU, (String)localObject1);
          }
          localObject1 = b((String)localObject1, paramLong1, paramLong2);
          if (!((f)localObject1).aHa) {
            break label544;
          }
          nR();
          this.mRetryCount = 0;
          if (((f)localObject1).aGY == 4) {
            this.aGG.code = -1;
          }
          c((p)localObject1);
          bool = ((f)localObject1).aHa;
          if (!bool) {
            continue;
          }
          return;
        }
      }
      char c = '0';
      continue;
      this.mRetryCount += 1;
      paramInt = nS().getString("1-115-10127", "").length();
      if ((this.mRetryCount > 20) || ((paramInt > 10240) && (this.mRetryCount > 3))) {
        nR();
      }
    }
  }
  
  final void aK(String paramString)
  {
    if (this.aGI != null) {
      this.aGI.execute(new c(this, paramString, 0L, 1));
    }
  }
  
  /* Error */
  @SuppressLint({"NewApi"})
  public final void aL(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: getfield 75	com/d/a/a/r:aGL	Ljava/lang/Object;
    //   9: astore 5
    //   11: aload 5
    //   13: monitorenter
    //   14: new 110	java/lang/StringBuilder
    //   17: dup
    //   18: aload_0
    //   19: invokespecial 304	com/d/a/a/r:nS	()Landroid/content/SharedPreferences;
    //   22: ldc_w 306
    //   25: ldc_w 308
    //   28: invokeinterface 313 3 0
    //   33: invokestatic 402	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   36: invokespecial 113	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   39: aload_1
    //   40: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: astore 4
    //   48: aload 4
    //   50: invokevirtual 185	java/lang/String:length	()I
    //   53: ldc_w 510
    //   56: isub
    //   57: istore_2
    //   58: aload 4
    //   60: astore_1
    //   61: iload_2
    //   62: ifle +25 -> 87
    //   65: aload 4
    //   67: ldc_w 512
    //   70: iload_2
    //   71: invokevirtual 515	java/lang/String:indexOf	(Ljava/lang/String;I)I
    //   74: istore_3
    //   75: iload_3
    //   76: iload_2
    //   77: if_icmplt +51 -> 128
    //   80: aload 4
    //   82: iload_3
    //   83: invokevirtual 213	java/lang/String:substring	(I)Ljava/lang/String;
    //   86: astore_1
    //   87: getstatic 322	android/os/Build$VERSION:SDK_INT	I
    //   90: bipush 9
    //   92: if_icmplt +43 -> 135
    //   95: aload_0
    //   96: invokespecial 304	com/d/a/a/r:nS	()Landroid/content/SharedPreferences;
    //   99: invokeinterface 326 1 0
    //   104: ldc_w 306
    //   107: aload_1
    //   108: invokeinterface 519 3 0
    //   113: invokeinterface 335 1 0
    //   118: aload 5
    //   120: monitorexit
    //   121: return
    //   122: astore_1
    //   123: aload 5
    //   125: monitorexit
    //   126: aload_1
    //   127: athrow
    //   128: ldc_w 308
    //   131: astore_1
    //   132: goto -45 -> 87
    //   135: aload_0
    //   136: invokespecial 304	com/d/a/a/r:nS	()Landroid/content/SharedPreferences;
    //   139: invokeinterface 326 1 0
    //   144: ldc_w 306
    //   147: aload_1
    //   148: invokeinterface 519 3 0
    //   153: invokeinterface 339 1 0
    //   158: pop
    //   159: goto -41 -> 118
    //   162: astore_1
    //   163: goto -45 -> 118
    //   166: astore_1
    //   167: getstatic 322	android/os/Build$VERSION:SDK_INT	I
    //   170: bipush 9
    //   172: if_icmplt +31 -> 203
    //   175: aload_0
    //   176: invokespecial 304	com/d/a/a/r:nS	()Landroid/content/SharedPreferences;
    //   179: invokeinterface 326 1 0
    //   184: ldc_w 306
    //   187: ldc_w 308
    //   190: invokeinterface 519 3 0
    //   195: invokeinterface 335 1 0
    //   200: goto -82 -> 118
    //   203: aload_0
    //   204: invokespecial 304	com/d/a/a/r:nS	()Landroid/content/SharedPreferences;
    //   207: invokeinterface 326 1 0
    //   212: ldc_w 306
    //   215: ldc_w 308
    //   218: invokeinterface 519 3 0
    //   223: invokeinterface 339 1 0
    //   228: pop
    //   229: goto -111 -> 118
    //   232: astore_1
    //   233: goto -115 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	236	0	this	r
    //   0	236	1	paramString	String
    //   57	21	2	i	int
    //   74	9	3	j	int
    //   46	35	4	str	String
    // Exception table:
    //   from	to	target	type
    //   14	58	122	finally
    //   65	75	122	finally
    //   80	87	122	finally
    //   87	118	122	finally
    //   118	121	122	finally
    //   123	126	122	finally
    //   135	159	122	finally
    //   167	200	122	finally
    //   203	229	122	finally
    //   14	58	162	java/lang/Exception
    //   65	75	162	java/lang/Exception
    //   80	87	162	java/lang/Exception
    //   87	118	162	java/lang/Exception
    //   135	159	162	java/lang/Exception
    //   14	58	166	java/lang/Error
    //   65	75	166	java/lang/Error
    //   80	87	166	java/lang/Error
    //   87	118	166	java/lang/Error
    //   135	159	166	java/lang/Error
    //   167	200	232	java/lang/Exception
    //   203	229	232	java/lang/Exception
  }
  
  public final void e(String paramString, long paramLong)
  {
    Object localObject = null;
    String str = paramString;
    if (paramString != null)
    {
      if (paramString.startsWith("&OD[]=")) {
        str = paramString;
      }
    }
    else
    {
      aL(str);
      return;
    }
    paramString = v.aP(v.aQ(paramString));
    if (paramString == null)
    {
      paramString = null;
      label44:
      if (paramString != null) {
        break label78;
      }
    }
    label78:
    for (paramString = (String)localObject;; paramString = paramString.replace("&WD[]=", "|WD,"))
    {
      str = v.a(paramString, paramLong, "1");
      break;
      paramString = paramString.replace("&MD=", "|MD,");
      break label44;
    }
  }
  
  final void nC()
  {
    this.aGN = null;
  }
  
  final void nO()
  {
    if (this.aGI != null) {
      try
      {
        z localz = this.aGI;
        d locald = this.aGM;
        if (locald.aGV) {
          throw new Exception("OnlineModule: new-session runnable occupied");
        }
        locald.aGV = true;
        localz.execute(locald);
        return;
      }
      catch (Exception localException) {}
    }
  }
  
  final boolean nP()
  {
    return this.aGG.code == 1;
  }
  
  final void nT()
  {
    String str2;
    b localb;
    try
    {
      String str1 = this.aGE;
      str2 = this.aGF;
      localb = this.aGG;
      if ((str1 == null) || (str2 == null) || (localb == null)) {
        throw new Exception("OnlineModule: authenticate: null arg");
      }
    }
    finally {}
    System.arraycopy((localObject + str2).getBytes(), 0, localb.aGQ, 0, 27);
    localb.code = 1;
  }
  
  private static abstract class a
    implements Runnable
  {
    private final WeakReference<r> aGP;
    
    public a(r paramr)
    {
      this.aGP = new WeakReference(paramr);
    }
    
    final r nU()
    {
      r localr = (r)this.aGP.get();
      if (localr == null) {
        throw new Exception("OnlineModule.AbstractOnlineModuleRunnable: online module not available");
      }
      return localr;
    }
  }
  
  private static final class b
  {
    public final byte[] aGQ = new byte[27];
    private final byte[] aGR = new byte[8];
    public int code = -1;
  }
  
  private static final class c
    extends r.a
  {
    private final String aGS;
    private final long aGT;
    private final int aGU;
    
    public c(r paramr, String paramString, long paramLong, int paramInt)
    {
      super();
      this.aGS = paramString;
      this.aGT = paramLong;
      this.aGU = paramInt;
    }
    
    public final void run()
    {
      try
      {
        switch (this.aGU)
        {
        case 0: 
          nU().e(this.aGS, this.aGT);
          return;
        case 1: 
          nU().aL(this.aGS);
          return;
        }
        return;
      }
      catch (Exception localException) {}
    }
  }
  
  private static final class d
    extends r.a
  {
    boolean aGV;
    
    public d(r paramr)
    {
      super();
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual 24	com/d/a/a/r$d:nU	()Lcom/d/a/a/r;
      //   4: astore_1
      //   5: aload_1
      //   6: invokevirtual 27	com/d/a/a/r:nT	()V
      //   9: aload_1
      //   10: invokevirtual 31	com/d/a/a/r:nP	()Z
      //   13: ifeq +8 -> 21
      //   16: aload_1
      //   17: iconst_0
      //   18: putfield 35	com/d/a/a/r:aGH	I
      //   21: aload_0
      //   22: invokevirtual 24	com/d/a/a/r$d:nU	()Lcom/d/a/a/r;
      //   25: getfield 39	com/d/a/a/r:aGK	Lcom/d/a/a/f;
      //   28: astore_2
      //   29: aload_2
      //   30: getstatic 45	android/os/Build:MODEL	Ljava/lang/String;
      //   33: putfield 50	com/d/a/a/f:aDW	Ljava/lang/String;
      //   36: aload_2
      //   37: getstatic 55	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
      //   40: putfield 58	com/d/a/a/f:aDX	Ljava/lang/String;
      //   43: aload_2
      //   44: aload_2
      //   45: getfield 62	com/d/a/a/f:aDU	Landroid/content/pm/PackageInfo;
      //   48: getfield 67	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
      //   51: putfield 68	com/d/a/a/f:versionName	Ljava/lang/String;
      //   54: aload_2
      //   55: getfield 72	com/d/a/a/f:mContext	Landroid/content/Context;
      //   58: invokevirtual 78	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
      //   61: aload_2
      //   62: getfield 82	com/d/a/a/f:aDT	Landroid/content/pm/PackageManager;
      //   65: invokevirtual 88	android/content/pm/ApplicationInfo:loadLabel	(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
      //   68: astore_1
      //   69: aload_1
      //   70: ifnull +105 -> 175
      //   73: aload_1
      //   74: invokeinterface 94 1 0
      //   79: astore_1
      //   80: aload_2
      //   81: aload_1
      //   82: putfield 97	com/d/a/a/f:aDV	Ljava/lang/String;
      //   85: aload_2
      //   86: getfield 101	com/d/a/a/f:aDS	Landroid/hardware/SensorManager;
      //   89: ifnull +80 -> 169
      //   92: aload_2
      //   93: getfield 101	com/d/a/a/f:aDS	Landroid/hardware/SensorManager;
      //   96: iconst_1
      //   97: invokevirtual 107	android/hardware/SensorManager:getDefaultSensor	(I)Landroid/hardware/Sensor;
      //   100: astore_1
      //   101: aload_2
      //   102: getfield 101	com/d/a/a/f:aDS	Landroid/hardware/SensorManager;
      //   105: iconst_4
      //   106: invokevirtual 107	android/hardware/SensorManager:getDefaultSensor	(I)Landroid/hardware/Sensor;
      //   109: astore_3
      //   110: aload_2
      //   111: getfield 101	com/d/a/a/f:aDS	Landroid/hardware/SensorManager;
      //   114: iconst_2
      //   115: invokevirtual 107	android/hardware/SensorManager:getDefaultSensor	(I)Landroid/hardware/Sensor;
      //   118: astore 4
      //   120: aload_2
      //   121: getfield 101	com/d/a/a/f:aDS	Landroid/hardware/SensorManager;
      //   124: bipush 11
      //   126: invokevirtual 107	android/hardware/SensorManager:getDefaultSensor	(I)Landroid/hardware/Sensor;
      //   129: astore 5
      //   131: aload_1
      //   132: ifnull +8 -> 140
      //   135: aload_2
      //   136: iconst_1
      //   137: putfield 110	com/d/a/a/f:aEa	I
      //   140: aload_3
      //   141: ifnull +8 -> 149
      //   144: aload_2
      //   145: iconst_1
      //   146: putfield 113	com/d/a/a/f:aEb	I
      //   149: aload 4
      //   151: ifnull +8 -> 159
      //   154: aload_2
      //   155: iconst_1
      //   156: putfield 116	com/d/a/a/f:aEc	I
      //   159: aload 5
      //   161: ifnull +8 -> 169
      //   164: aload_2
      //   165: iconst_1
      //   166: putfield 119	com/d/a/a/f:aEd	I
      //   169: aload_0
      //   170: iconst_0
      //   171: putfield 121	com/d/a/a/r$d:aGV	Z
      //   174: return
      //   175: ldc 123
      //   177: astore_1
      //   178: goto -98 -> 80
      //   181: astore_1
      //   182: goto -13 -> 169
      //   185: astore_1
      //   186: goto -17 -> 169
      //   189: astore_1
      //   190: goto -21 -> 169
      //   193: astore_1
      //   194: goto -173 -> 21
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	197	0	this	d
      //   4	174	1	localObject	Object
      //   181	1	1	localException1	Exception
      //   185	1	1	localError	Error
      //   189	1	1	localException2	Exception
      //   193	1	1	localException3	Exception
      //   28	137	2	localf	f
      //   109	32	3	localSensor1	android.hardware.Sensor
      //   118	32	4	localSensor2	android.hardware.Sensor
      //   129	31	5	localSensor3	android.hardware.Sensor
      // Exception table:
      //   from	to	target	type
      //   0	5	181	java/lang/Exception
      //   21	29	181	java/lang/Exception
      //   29	69	185	java/lang/Error
      //   73	80	185	java/lang/Error
      //   80	131	185	java/lang/Error
      //   135	140	185	java/lang/Error
      //   144	149	185	java/lang/Error
      //   154	159	185	java/lang/Error
      //   164	169	185	java/lang/Error
      //   29	69	189	java/lang/Exception
      //   73	80	189	java/lang/Exception
      //   80	131	189	java/lang/Exception
      //   135	140	189	java/lang/Exception
      //   144	149	189	java/lang/Exception
      //   154	159	189	java/lang/Exception
      //   164	169	189	java/lang/Exception
      //   5	21	193	java/lang/Exception
    }
  }
  
  private static final class e
    extends r.a
  {
    private final String aGS;
    private final long aGT;
    private final long aGW;
    private final boolean aGX;
    private final int aGi;
    
    public e(r paramr, String paramString, long paramLong1, long paramLong2, int paramInt, boolean paramBoolean)
    {
      super();
      this.aGS = paramString;
      this.aGT = paramLong1;
      this.aGW = paramLong2;
      this.aGi = paramInt;
      this.aGX = true;
    }
    
    public final void run()
    {
      try
      {
        nU().a(this.aGS, this.aGT, this.aGW, this.aGi, this.aGX);
        return;
      }
      catch (Exception localException) {}
    }
  }
  
  static final class f
    extends p
  {
    final int aGY;
    final x aGZ;
    final boolean aHa;
    final String message;
    
    public f(int paramInt, x paramx, String paramString)
    {
      super();
      this.aGY = paramInt;
      this.aGZ = paramx;
      this.message = paramString;
      if ((this.aGY >= 0) && (this.aGY != 4) && (this.aGY != 2)) {}
      for (boolean bool = true;; bool = false)
      {
        this.aHa = bool;
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */