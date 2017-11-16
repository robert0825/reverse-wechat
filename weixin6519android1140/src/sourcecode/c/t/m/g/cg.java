package c.t.m.g;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.map.geolocation.internal.TencentHttpClient;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class cg
{
  public static final String a = "ACTION." + cg.class.getSimpleName() + "." + System.nanoTime();
  private static cg b = null;
  public static Context c = null;
  public volatile boolean d = false;
  private PendingIntent e = null;
  private a f = null;
  public TencentHttpClient g = null;
  
  private cg()
  {
    if ((c == null) || (c.getApplicationContext() == null)) {
      throw new IllegalStateException("Please invoke initial(context,...) first when app started!");
    }
    this.f = new a((byte)0);
    this.e = PendingIntent.getBroadcast(c, 0, i(), 134217728);
  }
  
  public static cg a()
  {
    if (b == null) {}
    try
    {
      if (b == null) {
        b = new cg();
      }
      return b;
    }
    finally {}
  }
  
  private void a(long paramLong)
  {
    long l1 = SystemClock.elapsedRealtime();
    long l2 = System.currentTimeMillis();
    cf.a("CC_", "startSchedule: delay: " + paramLong + "ms,at: " + (l2 + paramLong) + "ms");
    if (paramLong <= 0L)
    {
      new Thread(new b(), "Th_CC").start();
      return;
    }
    h().set(2, l1 + paramLong, this.e);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramContext == null) || (paramContext.getApplicationContext() == null)) {
      throw new NullPointerException("context cannot be null!");
    }
    paramContext = paramContext.getApplicationContext();
    c = paramContext;
    ci.a(paramContext, paramString1);
    ch.a(paramString1, paramString2);
    new Thread()
    {
      public final void run()
      {
        try
        {
          cg.a();
          ci.a();
          ch.a();
          return;
        }
        catch (Throwable localThrowable) {}
      }
    }.start();
  }
  
  public static void a(String paramString)
  {
    ch.a(paramString);
  }
  
  public static void a(HashMap<String, String> paramHashMap)
  {
    ch.a(paramHashMap);
  }
  
  public static long g()
  {
    long l1 = 86400000L;
    long l2 = ch.a().c("cc_req_interval");
    if (l2 > 86400000L) {}
    for (;;)
    {
      if (l1 < 3600000L) {
        return 3600000L;
      }
      return l1;
      l1 = l2;
    }
  }
  
  private static AlarmManager h()
  {
    return (AlarmManager)c.getSystemService("alarm");
  }
  
  private static Intent i()
  {
    Intent localIntent = new Intent(a);
    try
    {
      localIntent.setPackage(c.getApplicationInfo().packageName);
      return localIntent;
    }
    catch (Throwable localThrowable)
    {
      localIntent.setPackage(null);
    }
    return localIntent;
  }
  
  public final void a(TencentHttpClient paramTencentHttpClient)
  {
    this.g = paramTencentHttpClient;
  }
  
  public void a(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        int i = ch.a().b("cc_version");
        cf.a("CC_", "schedule :" + paramBoolean + "," + i);
        if (i == -1)
        {
          if (paramBoolean)
          {
            l = 5000L;
            a(l);
          }
        }
        else
        {
          l = g();
          continue;
        }
        long l = 10800000L;
      }
      catch (Exception localException)
      {
        cf.b("CC_", localException.toString());
        return;
      }
    }
  }
  
  public final void b()
  {
    if (this.d) {
      return;
    }
    this.d = true;
    cf.a("CC_", "startUp()");
    try
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction(a);
      c.registerReceiver(this.f, localIntentFilter);
      a(true);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public final void c()
  {
    if (!this.d) {
      return;
    }
    this.d = false;
    try
    {
      ch.a().c();
      cf.a("CC_", "shutdown:pull immediately");
      a(0L);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  final class a
    extends BroadcastReceiver
  {
    private a() {}
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      if (paramIntent == null) {}
      do
      {
        return;
        paramContext = paramIntent.getAction();
      } while (!cg.a.equals(paramContext));
      cf.a("CC_Receiver", "action=" + paramContext);
      new Thread(new cg.b(cg.this), "Th_CC").start();
    }
  }
  
  final class b
    implements Runnable
  {
    private final JSONObject a = new JSONObject();
    private ch b = null;
    private ci c = null;
    
    public b() {}
    
    private JSONObject a()
    {
      if (cg.this.g == null) {
        return this.a;
      }
      cf.a("CC_Run", "cc_url:" + "https://cc.map.qq.com/?get_c");
      try
      {
        Object localObject = new JSONObject();
        ((JSONObject)localObject).put("cc_version", this.b.e("cc_version"));
        ((JSONObject)localObject).put("m_module", ch.a);
        ((JSONObject)localObject).put("m_channel", ch.b);
        ((JSONObject)localObject).put("m_version", ch.c);
        ((JSONObject)localObject).put("imei", b());
        String str = b.a.a(((JSONObject)localObject).toString(), "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q", 1);
        cf.a("CC_Run", "req:" + str);
        localObject = this.a.toString();
        if (cg.this.g != null)
        {
          localObject = cg.this.g.postSync("https://cc.map.qq.com/?get_c", str.getBytes());
          localObject = new String(((Bundle)localObject).getByteArray("data_bytes"), ((Bundle)localObject).getString("data_charset"));
          cf.a("CC_Run", "res:" + (String)localObject);
          str = this.a.toString();
          if (!str.equals(localObject)) {
            break label258;
          }
          cf.a("CC_Run", "network or server error,response empty json");
          localObject = str;
        }
        for (;;)
        {
          if (!TextUtils.isEmpty((CharSequence)localObject)) {
            break label283;
          }
          return this.a;
          cf.a("CC_Run", "httpclient is null");
          break;
          label258:
          cf.a("CC_Run", "start dec");
          localObject = b.a.a((String)localObject, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q", 2);
          cf.a("CC_Run", "end dec");
        }
        label283:
        localObject = new JSONObject((String)localObject);
        return (JSONObject)localObject;
      }
      catch (Throwable localThrowable)
      {
        cf.a("CC_Run", localThrowable.getMessage(), localThrowable);
      }
      return this.a;
    }
    
    private void a(JSONObject paramJSONObject)
    {
      Object localObject = this.c.b();
      if (localObject == null) {
        return;
      }
      int j = this.b.b("cc_version");
      try
      {
        i = Integer.parseInt(paramJSONObject.optString("version", this.b.e("cc_version")));
        if (i == j)
        {
          cf.a("CC_Run", "local version == server version");
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        int i;
        for (;;)
        {
          i = j;
        }
        paramJSONObject = paramJSONObject.optJSONObject("data");
        if (paramJSONObject == null) {
          paramJSONObject = this.a;
        }
        for (;;)
        {
          localObject = ((SharedPreferences)localObject).edit();
          Iterator localIterator = paramJSONObject.keys();
          while (localIterator.hasNext())
          {
            String str1 = (String)localIterator.next();
            try
            {
              String str2 = this.b.e(str1);
              if ((str2 != null) && (str2.length() != 0)) {
                ((SharedPreferences.Editor)localObject).putString(str1, paramJSONObject.optString(str1, str2));
              }
            }
            catch (Exception localException)
            {
              cf.b("CC_Run", localException.getMessage());
            }
          }
        }
        ((SharedPreferences.Editor)localObject).putString("cc_version", String.valueOf(i));
      }
      for (;;)
      {
        try
        {
          l2 = Long.parseLong(paramJSONObject.optString("cc_req_interval", this.b.e("cc_req_interval")));
          if (l2 >= 3600000L) {
            continue;
          }
          l1 = 3600000L;
          ((SharedPreferences.Editor)localObject).putString("cc_req_interval", String.valueOf(l1));
        }
        catch (Throwable paramJSONObject)
        {
          long l2;
          long l1;
          continue;
        }
        ((SharedPreferences.Editor)localObject).apply();
        return;
        l1 = l2;
        if (l2 > 86400000L) {
          l1 = 86400000L;
        }
      }
    }
    
    private static String b()
    {
      try
      {
        String str1 = ((TelephonyManager)cg.c.getSystemService("phone")).getDeviceId();
        String str3 = str1;
        if (TextUtils.isEmpty(str1)) {
          str3 = "";
        }
        return str3;
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          String str2 = "";
        }
      }
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 30	c/t/m/g/cg$b:b	Lc/t/m/g/ch;
      //   4: ldc_w 270
      //   7: invokevirtual 272	c/t/m/g/ch:c	(Ljava/lang/String;)J
      //   10: lstore_2
      //   11: invokestatic 278	java/lang/System:currentTimeMillis	()J
      //   14: lload_2
      //   15: lsub
      //   16: invokestatic 280	c/t/m/g/cg:g	()J
      //   19: lcmp
      //   20: iflt +315 -> 335
      //   23: aload_0
      //   24: getfield 20	c/t/m/g/cg$b:d	Lc/t/m/g/cg;
      //   27: getfield 283	c/t/m/g/cg:d	Z
      //   30: istore 4
      //   32: iload 4
      //   34: ifeq +10 -> 44
      //   37: aload_0
      //   38: getfield 32	c/t/m/g/cg$b:c	Lc/t/m/g/ci;
      //   41: invokevirtual 285	c/t/m/g/ci:c	()V
      //   44: invokestatic 291	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   47: iconst_1
      //   48: invokevirtual 295	java/lang/Thread:setPriority	(I)V
      //   51: aload_0
      //   52: invokespecial 297	c/t/m/g/cg$b:a	()Lorg/json/JSONObject;
      //   55: astore 5
      //   57: aload 5
      //   59: aload_0
      //   60: getfield 28	c/t/m/g/cg$b:a	Lorg/json/JSONObject;
      //   63: if_acmpeq +91 -> 154
      //   66: aload 5
      //   68: ldc_w 299
      //   71: ldc_w 301
      //   74: invokevirtual 181	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   77: invokestatic 186	java/lang/Integer:parseInt	(Ljava/lang/String;)I
      //   80: istore_1
      //   81: ldc 52
      //   83: new 54	java/lang/StringBuilder
      //   86: dup
      //   87: ldc_w 303
      //   90: invokespecial 59	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   93: iload_1
      //   94: invokevirtual 306	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   97: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   100: invokestatic 74	c/t/m/g/cf:a	(Ljava/lang/String;Ljava/lang/String;)V
      //   103: iload_1
      //   104: tableswitch	default:+250->354, -4:+104->208, -3:+104->208, -2:+36->140, -1:+36->140, 0:+88->192
      //   140: ldc2_w 307
      //   143: invokestatic 312	java/lang/Thread:sleep	(J)V
      //   146: ldc 52
      //   148: ldc_w 314
      //   151: invokestatic 74	c/t/m/g/cf:a	(Ljava/lang/String;Ljava/lang/String;)V
      //   154: aload_0
      //   155: getfield 30	c/t/m/g/cg$b:b	Lc/t/m/g/ch;
      //   158: invokevirtual 316	c/t/m/g/ch:b	()V
      //   161: iload 4
      //   163: ifeq +10 -> 173
      //   166: aload_0
      //   167: getfield 32	c/t/m/g/cg$b:c	Lc/t/m/g/ci;
      //   170: invokevirtual 318	c/t/m/g/ci:d	()V
      //   173: aload_0
      //   174: getfield 20	c/t/m/g/cg$b:d	Lc/t/m/g/cg;
      //   177: getfield 283	c/t/m/g/cg:d	Z
      //   180: ifeq +166 -> 346
      //   183: aload_0
      //   184: getfield 20	c/t/m/g/cg$b:d	Lc/t/m/g/cg;
      //   187: iconst_0
      //   188: invokevirtual 321	c/t/m/g/cg:a	(Z)V
      //   191: return
      //   192: aload 5
      //   194: ldc -79
      //   196: invokevirtual 325	org/json/JSONObject:has	(Ljava/lang/String;)Z
      //   199: ifeq +9 -> 208
      //   202: aload_0
      //   203: aload 5
      //   205: invokespecial 327	c/t/m/g/cg$b:a	(Lorg/json/JSONObject;)V
      //   208: invokestatic 278	java/lang/System:currentTimeMillis	()J
      //   211: lstore_2
      //   212: aload_0
      //   213: getfield 32	c/t/m/g/cg$b:c	Lc/t/m/g/ci;
      //   216: invokevirtual 172	c/t/m/g/ci:b	()Landroid/content/SharedPreferences;
      //   219: astore 5
      //   221: aload 5
      //   223: ifnull -83 -> 140
      //   226: aload 5
      //   228: invokeinterface 200 1 0
      //   233: astore 5
      //   235: aload 5
      //   237: ldc_w 270
      //   240: lload_2
      //   241: invokestatic 244	java/lang/String:valueOf	(J)Ljava/lang/String;
      //   244: invokeinterface 224 3 0
      //   249: pop
      //   250: aload 5
      //   252: invokeinterface 247 1 0
      //   257: goto -117 -> 140
      //   260: astore 5
      //   262: ldc 52
      //   264: aload 5
      //   266: invokevirtual 163	java/lang/Throwable:getMessage	()Ljava/lang/String;
      //   269: aload 5
      //   271: invokestatic 166	c/t/m/g/cf:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   274: aload_0
      //   275: getfield 30	c/t/m/g/cg$b:b	Lc/t/m/g/ch;
      //   278: invokevirtual 316	c/t/m/g/ch:b	()V
      //   281: iload 4
      //   283: ifeq -110 -> 173
      //   286: aload_0
      //   287: getfield 32	c/t/m/g/cg$b:c	Lc/t/m/g/ci;
      //   290: invokevirtual 318	c/t/m/g/ci:d	()V
      //   293: goto -120 -> 173
      //   296: astore 5
      //   298: ldc 52
      //   300: aload 5
      //   302: invokevirtual 163	java/lang/Throwable:getMessage	()Ljava/lang/String;
      //   305: aload 5
      //   307: invokestatic 166	c/t/m/g/cf:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   310: return
      //   311: astore 5
      //   313: aload_0
      //   314: getfield 30	c/t/m/g/cg$b:b	Lc/t/m/g/ch;
      //   317: invokevirtual 316	c/t/m/g/ch:b	()V
      //   320: iload 4
      //   322: ifeq +10 -> 332
      //   325: aload_0
      //   326: getfield 32	c/t/m/g/cg$b:c	Lc/t/m/g/ci;
      //   329: invokevirtual 318	c/t/m/g/ci:d	()V
      //   332: aload 5
      //   334: athrow
      //   335: ldc 52
      //   337: ldc_w 329
      //   340: invokestatic 74	c/t/m/g/cf:a	(Ljava/lang/String;Ljava/lang/String;)V
      //   343: goto -170 -> 173
      //   346: aload_0
      //   347: getfield 20	c/t/m/g/cg$b:d	Lc/t/m/g/cg;
      //   350: invokestatic 331	c/t/m/g/cg:c	(Lc/t/m/g/cg;)V
      //   353: return
      //   354: goto -214 -> 140
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	357	0	this	b
      //   80	24	1	i	int
      //   10	231	2	l	long
      //   30	291	4	bool	boolean
      //   55	196	5	localObject1	Object
      //   260	10	5	localThrowable1	Throwable
      //   296	10	5	localThrowable2	Throwable
      //   311	22	5	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   37	44	260	java/lang/Throwable
      //   44	103	260	java/lang/Throwable
      //   140	154	260	java/lang/Throwable
      //   192	208	260	java/lang/Throwable
      //   208	221	260	java/lang/Throwable
      //   226	257	260	java/lang/Throwable
      //   0	32	296	java/lang/Throwable
      //   154	161	296	java/lang/Throwable
      //   166	173	296	java/lang/Throwable
      //   173	191	296	java/lang/Throwable
      //   274	281	296	java/lang/Throwable
      //   286	293	296	java/lang/Throwable
      //   313	320	296	java/lang/Throwable
      //   325	332	296	java/lang/Throwable
      //   332	335	296	java/lang/Throwable
      //   335	343	296	java/lang/Throwable
      //   346	353	296	java/lang/Throwable
      //   37	44	311	finally
      //   44	103	311	finally
      //   140	154	311	finally
      //   192	208	311	finally
      //   208	221	311	finally
      //   226	257	311	finally
      //   262	274	311	finally
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */