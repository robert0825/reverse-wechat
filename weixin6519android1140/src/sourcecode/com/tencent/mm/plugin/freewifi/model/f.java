package com.tencent.mm.plugin.freewifi.model;

import android.net.wifi.WifiInfo;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.w;

public final class f
{
  private b lqf;
  
  public f()
  {
    GMTrace.i(7141054218240L, 53205);
    GMTrace.o(7141054218240L, 53205);
  }
  
  public final boolean a(WifiInfo paramWifiInfo)
  {
    boolean bool = false;
    for (;;)
    {
      try
      {
        GMTrace.i(7141322653696L, 53207);
        if ((paramWifiInfo == null) || (paramWifiInfo.getSSID() == null) || (paramWifiInfo.getBSSID() == null) || (paramWifiInfo.getMacAddress() == null))
        {
          w.i("MicroMsg.FreeWifi.FreeWifiNetChangeManager.onNetworkChangeFreeWifi", "WifiInfo got Currently is null. Cannot compared with last WifiInfo.");
          GMTrace.o(7141322653696L, 53207);
          return bool;
        }
        if (this.lqf != null)
        {
          w.i("MicroMsg.FreeWifi.FreeWifiNetChangeManager.onNetworkChangeFreeWifi", "last WifiInfo stored in memmory : ssid=%s, bssid=%s ", new Object[] { this.lqf.lqh, this.lqf.lqi });
          if ((m.yq(paramWifiInfo.getSSID()).equals(this.lqf.lqh)) && (paramWifiInfo.getBSSID().equalsIgnoreCase(this.lqf.lqi))) {
            GMTrace.o(7141322653696L, 53207);
          }
        }
        else
        {
          w.i("MicroMsg.FreeWifi.FreeWifiNetChangeManager.onNetworkChangeFreeWifi", "last WifiInfo stored in memmory is null.");
        }
      }
      finally {}
      String str2 = paramWifiInfo.getMacAddress();
      String str1 = str2;
      if (Build.VERSION.SDK_INT > 22) {
        if (str2 != null)
        {
          str1 = str2;
          if (!str2.equals("02:00:00:00:00:00")) {}
        }
        else
        {
          str1 = m.aAG();
        }
      }
      this.lqf = new b(m.yq(paramWifiInfo.getSSID()), paramWifiInfo.getBSSID(), str1, System.currentTimeMillis());
      w.i("MicroMsg.FreeWifi.FreeWifiNetChangeManager.onNetworkChangeFreeWifi", "new WifiInfo stored in memmory : ssid=%s, bssid=%s ", new Object[] { this.lqf.lqh, this.lqf.lqi });
      GMTrace.o(7141322653696L, 53207);
      bool = true;
    }
  }
  
  /* Error */
  public final void aAZ()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 110
    //   5: ldc 112
    //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 56	com/tencent/mm/plugin/freewifi/model/f:lqf	Lcom/tencent/mm/plugin/freewifi/model/f$b;
    //   14: ifnull +57 -> 71
    //   17: ldc 47
    //   19: ldc 58
    //   21: iconst_2
    //   22: anewarray 4	java/lang/Object
    //   25: dup
    //   26: iconst_0
    //   27: aload_0
    //   28: getfield 56	com/tencent/mm/plugin/freewifi/model/f:lqf	Lcom/tencent/mm/plugin/freewifi/model/f$b;
    //   31: getfield 62	com/tencent/mm/plugin/freewifi/model/f$b:lqh	Ljava/lang/String;
    //   34: aastore
    //   35: dup
    //   36: iconst_1
    //   37: aload_0
    //   38: getfield 56	com/tencent/mm/plugin/freewifi/model/f:lqf	Lcom/tencent/mm/plugin/freewifi/model/f$b;
    //   41: getfield 65	com/tencent/mm/plugin/freewifi/model/f$b:lqi	Ljava/lang/String;
    //   44: aastore
    //   45: invokestatic 68	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   48: aload_0
    //   49: aconst_null
    //   50: putfield 56	com/tencent/mm/plugin/freewifi/model/f:lqf	Lcom/tencent/mm/plugin/freewifi/model/f$b;
    //   53: ldc 47
    //   55: ldc 114
    //   57: invokestatic 54	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   60: ldc2_w 110
    //   63: ldc 112
    //   65: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   68: aload_0
    //   69: monitorexit
    //   70: return
    //   71: ldc 47
    //   73: ldc 86
    //   75: invokestatic 54	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   78: goto -30 -> 48
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_1
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	f
    //   81	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	48	81	finally
    //   48	68	81	finally
    //   71	78	81	finally
  }
  
  public final b aBa()
  {
    try
    {
      GMTrace.i(7141456871424L, 53208);
      b localb = this.lqf;
      GMTrace.o(7141456871424L, 53208);
      return localb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void aBb()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 121
    //   5: ldc 123
    //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 56	com/tencent/mm/plugin/freewifi/model/f:lqf	Lcom/tencent/mm/plugin/freewifi/model/f$b;
    //   14: ifnull +20 -> 34
    //   17: aload_0
    //   18: getfield 56	com/tencent/mm/plugin/freewifi/model/f:lqf	Lcom/tencent/mm/plugin/freewifi/model/f$b;
    //   21: astore_1
    //   22: aload_1
    //   23: getfield 127	com/tencent/mm/plugin/freewifi/model/f$b:lqk	Z
    //   26: ifeq +19 -> 45
    //   29: aload_0
    //   30: aload_1
    //   31: putfield 56	com/tencent/mm/plugin/freewifi/model/f:lqf	Lcom/tencent/mm/plugin/freewifi/model/f$b;
    //   34: ldc2_w 121
    //   37: ldc 123
    //   39: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: new 9	com/tencent/mm/plugin/freewifi/model/f$b
    //   48: dup
    //   49: aload_1
    //   50: getfield 62	com/tencent/mm/plugin/freewifi/model/f$b:lqh	Ljava/lang/String;
    //   53: aload_1
    //   54: getfield 65	com/tencent/mm/plugin/freewifi/model/f$b:lqi	Ljava/lang/String;
    //   57: aload_1
    //   58: getfield 130	com/tencent/mm/plugin/freewifi/model/f$b:lqj	Ljava/lang/String;
    //   61: aload_1
    //   62: getfield 134	com/tencent/mm/plugin/freewifi/model/f$b:lpX	J
    //   65: invokespecial 106	com/tencent/mm/plugin/freewifi/model/f$b:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    //   68: astore_1
    //   69: aload_1
    //   70: iconst_1
    //   71: putfield 127	com/tencent/mm/plugin/freewifi/model/f$b:lqk	Z
    //   74: goto -45 -> 29
    //   77: astore_1
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_1
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	f
    //   21	49	1	localb	b
    //   77	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	29	77	finally
    //   29	34	77	finally
    //   34	42	77	finally
    //   45	74	77	finally
  }
  
  private static final class a
  {
    public static f lqg;
    
    static
    {
      GMTrace.i(7143201701888L, 53221);
      lqg = new f();
      GMTrace.o(7143201701888L, 53221);
    }
  }
  
  public static final class b
  {
    public long lpX;
    public String lqh;
    public String lqi;
    public String lqj;
    public boolean lqk;
    
    public b(String paramString1, String paramString2, String paramString3, long paramLong)
    {
      GMTrace.i(7144946532352L, 53234);
      this.lqh = m.yq(paramString1);
      this.lqi = paramString2;
      this.lqj = paramString3;
      this.lpX = paramLong;
      this.lqk = false;
      GMTrace.o(7144946532352L, 53234);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */