package com.tencent.mm.plugin.freewifi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a
{
  private WifiManager aKk;
  public Activity activity;
  public Condition epJ;
  private long guG;
  public Lock lnP;
  public boolean lnQ;
  public boolean lnR;
  private BroadcastReceiver lnS;
  public String ssid;
  
  public a(String paramString, Activity paramActivity)
  {
    GMTrace.i(7246952005632L, 53994);
    this.lnQ = false;
    this.lnR = false;
    this.activity = paramActivity;
    this.guG = 15000L;
    this.ssid = paramString;
    this.lnP = new ReentrantLock();
    this.epJ = this.lnP.newCondition();
    this.aKk = ((WifiManager)ab.getContext().getSystemService("wifi"));
    GMTrace.o(7246952005632L, 53994);
  }
  
  private void aAr()
  {
    GMTrace.i(7247220441088L, 53996);
    try
    {
      this.activity.unregisterReceiver(this.lnS);
      GMTrace.o(7247220441088L, 53996);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      GMTrace.o(7247220441088L, 53996);
    }
  }
  
  /* Error */
  public final void a(final a parama)
  {
    // Byte code:
    //   0: ldc2_w 107
    //   3: ldc 109
    //   5: invokestatic 42	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 6	com/tencent/mm/plugin/freewifi/a$1
    //   11: dup
    //   12: aload_0
    //   13: aload_1
    //   14: invokespecial 112	com/tencent/mm/plugin/freewifi/a$1:<init>	(Lcom/tencent/mm/plugin/freewifi/a;Lcom/tencent/mm/plugin/freewifi/a$a;)V
    //   17: astore_1
    //   18: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   21: ldc 114
    //   23: invokevirtual 81	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   26: checkcast 116	android/net/ConnectivityManager
    //   29: iconst_1
    //   30: invokevirtual 120	android/net/ConnectivityManager:getNetworkInfo	(I)Landroid/net/NetworkInfo;
    //   33: invokevirtual 126	android/net/NetworkInfo:isConnected	()Z
    //   36: ifeq +31 -> 67
    //   39: aload_0
    //   40: getfield 54	com/tencent/mm/plugin/freewifi/a:ssid	Ljava/lang/String;
    //   43: invokestatic 132	com/tencent/mm/plugin/freewifi/model/d:aAY	()Ljava/lang/String;
    //   46: invokevirtual 138	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   49: ifeq +18 -> 67
    //   52: aload_1
    //   53: invokeinterface 141 1 0
    //   58: ldc2_w 107
    //   61: ldc 109
    //   63: invokestatic 88	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   66: return
    //   67: invokestatic 147	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   70: invokestatic 153	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   73: invokevirtual 156	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   76: if_acmpne +13 -> 89
    //   79: new 158	java/lang/RuntimeException
    //   82: dup
    //   83: ldc -96
    //   85: invokespecial 163	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   88: athrow
    //   89: aload_0
    //   90: new 8	com/tencent/mm/plugin/freewifi/a$2
    //   93: dup
    //   94: aload_0
    //   95: invokespecial 166	com/tencent/mm/plugin/freewifi/a$2:<init>	(Lcom/tencent/mm/plugin/freewifi/a;)V
    //   98: putfield 97	com/tencent/mm/plugin/freewifi/a:lnS	Landroid/content/BroadcastReceiver;
    //   101: aload_0
    //   102: getfield 59	com/tencent/mm/plugin/freewifi/a:lnP	Ljava/util/concurrent/locks/Lock;
    //   105: invokeinterface 169 1 0
    //   110: new 171	android/content/IntentFilter
    //   113: dup
    //   114: invokespecial 172	android/content/IntentFilter:<init>	()V
    //   117: astore 7
    //   119: aload 7
    //   121: ldc -82
    //   123: invokevirtual 177	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   126: aload 7
    //   128: ldc -77
    //   130: invokevirtual 177	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   133: aload_0
    //   134: getfield 48	com/tencent/mm/plugin/freewifi/a:activity	Landroid/app/Activity;
    //   137: aload_0
    //   138: getfield 97	com/tencent/mm/plugin/freewifi/a:lnS	Landroid/content/BroadcastReceiver;
    //   141: aload 7
    //   143: invokevirtual 183	android/app/Activity:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   146: pop
    //   147: aload_0
    //   148: getfield 85	com/tencent/mm/plugin/freewifi/a:aKk	Landroid/net/wifi/WifiManager;
    //   151: invokevirtual 186	android/net/wifi/WifiManager:isWifiEnabled	()Z
    //   154: ifne +72 -> 226
    //   157: new 188	com/tencent/mm/plugin/freewifi/e
    //   160: dup
    //   161: aload_0
    //   162: getfield 48	com/tencent/mm/plugin/freewifi/a:activity	Landroid/app/Activity;
    //   165: invokespecial 191	com/tencent/mm/plugin/freewifi/e:<init>	(Landroid/app/Activity;)V
    //   168: invokevirtual 195	com/tencent/mm/plugin/freewifi/e:aAt	()I
    //   171: istore_2
    //   172: ldc -59
    //   174: new 199	java/lang/StringBuilder
    //   177: dup
    //   178: ldc -55
    //   180: invokespecial 202	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   183: iload_2
    //   184: invokevirtual 206	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   187: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   190: invokestatic 214	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: iload_2
    //   194: ifeq +32 -> 226
    //   197: aload_1
    //   198: iload_2
    //   199: invokeinterface 218 2 0
    //   204: aload_0
    //   205: invokespecial 220	com/tencent/mm/plugin/freewifi/a:aAr	()V
    //   208: aload_0
    //   209: getfield 59	com/tencent/mm/plugin/freewifi/a:lnP	Ljava/util/concurrent/locks/Lock;
    //   212: invokeinterface 223 1 0
    //   217: ldc2_w 107
    //   220: ldc 109
    //   222: invokestatic 88	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   225: return
    //   226: aload_0
    //   227: getfield 54	com/tencent/mm/plugin/freewifi/a:ssid	Ljava/lang/String;
    //   230: invokestatic 227	com/tencent/mm/plugin/freewifi/model/d:yz	(Ljava/lang/String;)I
    //   233: istore_2
    //   234: iload_2
    //   235: ifeq +36 -> 271
    //   238: aload_0
    //   239: invokespecial 220	com/tencent/mm/plugin/freewifi/a:aAr	()V
    //   242: aload_1
    //   243: iload_2
    //   244: invokeinterface 218 2 0
    //   249: aload_0
    //   250: invokespecial 220	com/tencent/mm/plugin/freewifi/a:aAr	()V
    //   253: aload_0
    //   254: getfield 59	com/tencent/mm/plugin/freewifi/a:lnP	Ljava/util/concurrent/locks/Lock;
    //   257: invokeinterface 223 1 0
    //   262: ldc2_w 107
    //   265: ldc 109
    //   267: invokestatic 88	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   270: return
    //   271: iconst_0
    //   272: istore_3
    //   273: aload_0
    //   274: getfield 44	com/tencent/mm/plugin/freewifi/a:lnQ	Z
    //   277: ifeq +13 -> 290
    //   280: iload_3
    //   281: istore 4
    //   283: aload_0
    //   284: getfield 46	com/tencent/mm/plugin/freewifi/a:lnR	Z
    //   287: ifne +198 -> 485
    //   290: invokestatic 233	java/lang/System:currentTimeMillis	()J
    //   293: lstore 5
    //   295: aload_0
    //   296: getfield 67	com/tencent/mm/plugin/freewifi/a:epJ	Ljava/util/concurrent/locks/Condition;
    //   299: aload_0
    //   300: getfield 52	com/tencent/mm/plugin/freewifi/a:guG	J
    //   303: getstatic 239	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   306: invokeinterface 245 4 0
    //   311: istore_3
    //   312: iload_3
    //   313: istore 4
    //   315: iload_3
    //   316: ifeq +169 -> 485
    //   319: invokestatic 233	java/lang/System:currentTimeMillis	()J
    //   322: lload 5
    //   324: lsub
    //   325: lstore 5
    //   327: aload_0
    //   328: aload_0
    //   329: getfield 52	com/tencent/mm/plugin/freewifi/a:guG	J
    //   332: lload 5
    //   334: lsub
    //   335: putfield 52	com/tencent/mm/plugin/freewifi/a:guG	J
    //   338: ldc -59
    //   340: new 199	java/lang/StringBuilder
    //   343: dup
    //   344: ldc -9
    //   346: invokespecial 202	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   349: lload 5
    //   351: invokevirtual 250	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   354: ldc -4
    //   356: invokevirtual 255	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: aload_0
    //   360: getfield 52	com/tencent/mm/plugin/freewifi/a:guG	J
    //   363: invokevirtual 250	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   366: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   369: invokestatic 214	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   372: aload_0
    //   373: getfield 52	com/tencent/mm/plugin/freewifi/a:guG	J
    //   376: lconst_0
    //   377: lcmp
    //   378: ifle +99 -> 477
    //   381: aload_0
    //   382: getfield 52	com/tencent/mm/plugin/freewifi/a:guG	J
    //   385: lstore 5
    //   387: aload_0
    //   388: lload 5
    //   390: putfield 52	com/tencent/mm/plugin/freewifi/a:guG	J
    //   393: goto -120 -> 273
    //   396: astore 7
    //   398: ldc -59
    //   400: ldc_w 257
    //   403: iconst_3
    //   404: anewarray 4	java/lang/Object
    //   407: dup
    //   408: iconst_0
    //   409: aload_0
    //   410: getfield 48	com/tencent/mm/plugin/freewifi/a:activity	Landroid/app/Activity;
    //   413: invokevirtual 261	android/app/Activity:getIntent	()Landroid/content/Intent;
    //   416: invokestatic 267	com/tencent/mm/plugin/freewifi/m:C	(Landroid/content/Intent;)Ljava/lang/String;
    //   419: aastore
    //   420: dup
    //   421: iconst_1
    //   422: aload_0
    //   423: getfield 48	com/tencent/mm/plugin/freewifi/a:activity	Landroid/app/Activity;
    //   426: invokevirtual 261	android/app/Activity:getIntent	()Landroid/content/Intent;
    //   429: invokestatic 271	com/tencent/mm/plugin/freewifi/m:D	(Landroid/content/Intent;)I
    //   432: invokestatic 277	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   435: aastore
    //   436: dup
    //   437: iconst_2
    //   438: aload 7
    //   440: invokevirtual 280	java/lang/InterruptedException:getMessage	()Ljava/lang/String;
    //   443: aastore
    //   444: invokestatic 283	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   447: aload_1
    //   448: bipush -17
    //   450: invokeinterface 218 2 0
    //   455: aload_0
    //   456: invokespecial 220	com/tencent/mm/plugin/freewifi/a:aAr	()V
    //   459: aload_0
    //   460: getfield 59	com/tencent/mm/plugin/freewifi/a:lnP	Ljava/util/concurrent/locks/Lock;
    //   463: invokeinterface 223 1 0
    //   468: ldc2_w 107
    //   471: ldc 109
    //   473: invokestatic 88	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   476: return
    //   477: ldc2_w 284
    //   480: lstore 5
    //   482: goto -95 -> 387
    //   485: iload 4
    //   487: ifne +33 -> 520
    //   490: aload_1
    //   491: bipush -16
    //   493: invokeinterface 218 2 0
    //   498: aload_0
    //   499: invokespecial 220	com/tencent/mm/plugin/freewifi/a:aAr	()V
    //   502: aload_0
    //   503: getfield 59	com/tencent/mm/plugin/freewifi/a:lnP	Ljava/util/concurrent/locks/Lock;
    //   506: invokeinterface 223 1 0
    //   511: ldc2_w 107
    //   514: ldc 109
    //   516: invokestatic 88	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   519: return
    //   520: aload_1
    //   521: invokeinterface 141 1 0
    //   526: goto -28 -> 498
    //   529: astore_1
    //   530: aload_0
    //   531: invokespecial 220	com/tencent/mm/plugin/freewifi/a:aAr	()V
    //   534: aload_0
    //   535: getfield 59	com/tencent/mm/plugin/freewifi/a:lnP	Ljava/util/concurrent/locks/Lock;
    //   538: invokeinterface 223 1 0
    //   543: aload_1
    //   544: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	545	0	this	a
    //   0	545	1	parama	a
    //   171	73	2	i	int
    //   272	44	3	bool1	boolean
    //   281	205	4	bool2	boolean
    //   293	188	5	l	long
    //   117	25	7	localIntentFilter	android.content.IntentFilter
    //   396	43	7	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   273	280	396	java/lang/InterruptedException
    //   283	290	396	java/lang/InterruptedException
    //   290	312	396	java/lang/InterruptedException
    //   319	387	396	java/lang/InterruptedException
    //   387	393	396	java/lang/InterruptedException
    //   101	193	529	finally
    //   197	204	529	finally
    //   226	234	529	finally
    //   238	249	529	finally
    //   273	280	529	finally
    //   283	290	529	finally
    //   290	312	529	finally
    //   319	387	529	finally
    //   387	393	529	finally
    //   398	455	529	finally
    //   490	498	529	finally
    //   520	526	529	finally
  }
  
  public static abstract interface a
  {
    public abstract void nM(int paramInt);
    
    public abstract void onSuccess();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */