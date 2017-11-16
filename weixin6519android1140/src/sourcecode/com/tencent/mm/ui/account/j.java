package com.tencent.mm.ui.account;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.pluginsdk.h.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.regex.Pattern;

public final class j
  extends ContentObserver
{
  private final Context context;
  private Pattern lIw;
  private ContentResolver oWB;
  private final String[] oWG;
  private final a vUz;
  
  public j(Context paramContext, a parama)
  {
    super(ae.fetchFreeHandler());
    GMTrace.i(2577919901696L, 19207);
    this.lIw = Pattern.compile("\\d{4,8}");
    if ((paramContext == null) || (parama == null)) {
      throw new NullPointerException("SmsContentObserver Construction");
    }
    this.context = paramContext;
    this.oWG = paramContext.getResources().getStringArray(R.c.aMx);
    this.vUz = parama;
    GMTrace.o(2577919901696L, 19207);
  }
  
  public final void bYX()
  {
    GMTrace.i(2578054119424L, 19208);
    this.context.getContentResolver().registerContentObserver(Uri.parse("content://sms/"), true, this);
    GMTrace.o(2578054119424L, 19208);
  }
  
  public final void bYY()
  {
    GMTrace.i(2578188337152L, 19209);
    this.context.getContentResolver().unregisterContentObserver(this);
    GMTrace.o(2578188337152L, 19209);
  }
  
  /* Error */
  public final void bYZ()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: ldc2_w 114
    //   6: sipush 19211
    //   9: invokestatic 36	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: ldc 117
    //   14: invokestatic 97	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   17: astore 8
    //   19: aload_0
    //   20: aload_0
    //   21: getfield 55	com/tencent/mm/ui/account/j:context	Landroid/content/Context;
    //   24: invokevirtual 89	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   27: putfield 119	com/tencent/mm/ui/account/j:oWB	Landroid/content/ContentResolver;
    //   30: ldc 121
    //   32: astore 6
    //   34: iconst_0
    //   35: istore_1
    //   36: iload_1
    //   37: aload_0
    //   38: getfield 75	com/tencent/mm/ui/account/j:oWG	[Ljava/lang/String;
    //   41: arraylength
    //   42: if_icmpge +96 -> 138
    //   45: iload_1
    //   46: aload_0
    //   47: getfield 75	com/tencent/mm/ui/account/j:oWG	[Ljava/lang/String;
    //   50: arraylength
    //   51: iconst_1
    //   52: isub
    //   53: if_icmpne +46 -> 99
    //   56: new 123	java/lang/StringBuilder
    //   59: dup
    //   60: invokespecial 125	java/lang/StringBuilder:<init>	()V
    //   63: aload 6
    //   65: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc -125
    //   70: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: aload_0
    //   74: getfield 75	com/tencent/mm/ui/account/j:oWG	[Ljava/lang/String;
    //   77: iload_1
    //   78: aaload
    //   79: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc -123
    //   84: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: astore 6
    //   92: iload_1
    //   93: iconst_1
    //   94: iadd
    //   95: istore_1
    //   96: goto -60 -> 36
    //   99: new 123	java/lang/StringBuilder
    //   102: dup
    //   103: invokespecial 125	java/lang/StringBuilder:<init>	()V
    //   106: aload 6
    //   108: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: ldc -117
    //   113: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: aload_0
    //   117: getfield 75	com/tencent/mm/ui/account/j:oWG	[Ljava/lang/String;
    //   120: iload_1
    //   121: aaload
    //   122: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: ldc -115
    //   127: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: astore 6
    //   135: goto -43 -> 92
    //   138: new 123	java/lang/StringBuilder
    //   141: dup
    //   142: invokespecial 125	java/lang/StringBuilder:<init>	()V
    //   145: aload 6
    //   147: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: ldc -113
    //   152: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokestatic 149	java/lang/System:currentTimeMillis	()J
    //   158: ldc2_w 150
    //   161: lsub
    //   162: invokevirtual 154	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   165: ldc -100
    //   167: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: astore 6
    //   175: ldc -98
    //   177: new 123	java/lang/StringBuilder
    //   180: dup
    //   181: ldc -96
    //   183: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   186: aload 6
    //   188: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   194: invokestatic 167	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   197: aload 6
    //   199: ifnull +13 -> 212
    //   202: aload 6
    //   204: ldc -87
    //   206: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   209: ifeq +13 -> 222
    //   212: ldc2_w 114
    //   215: sipush 19211
    //   218: invokestatic 80	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   221: return
    //   222: aload_0
    //   223: getfield 119	com/tencent/mm/ui/account/j:oWB	Landroid/content/ContentResolver;
    //   226: aload 8
    //   228: iconst_3
    //   229: anewarray 171	java/lang/String
    //   232: dup
    //   233: iconst_0
    //   234: ldc -79
    //   236: aastore
    //   237: dup
    //   238: iconst_1
    //   239: ldc -77
    //   241: aastore
    //   242: dup
    //   243: iconst_2
    //   244: ldc -75
    //   246: aastore
    //   247: aload 6
    //   249: aconst_null
    //   250: aconst_null
    //   251: invokevirtual 185	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   254: astore 6
    //   256: iconst_m1
    //   257: istore_1
    //   258: lconst_0
    //   259: lstore_2
    //   260: aload 6
    //   262: invokeinterface 191 1 0
    //   267: ifeq +34 -> 301
    //   270: aload 6
    //   272: iconst_2
    //   273: invokeinterface 195 2 0
    //   278: lstore 4
    //   280: lload 4
    //   282: lload_2
    //   283: lcmp
    //   284: ifle +231 -> 515
    //   287: aload 6
    //   289: invokeinterface 199 1 0
    //   294: istore_1
    //   295: lload 4
    //   297: lstore_2
    //   298: goto +217 -> 515
    //   301: iload_1
    //   302: iflt +99 -> 401
    //   305: aload 6
    //   307: iload_1
    //   308: invokeinterface 203 2 0
    //   313: pop
    //   314: aload 6
    //   316: aload 6
    //   318: ldc -79
    //   320: invokeinterface 207 2 0
    //   325: invokeinterface 211 2 0
    //   330: astore 8
    //   332: aload_0
    //   333: getfield 46	com/tencent/mm/ui/account/j:lIw	Ljava/util/regex/Pattern;
    //   336: aload 8
    //   338: invokevirtual 215	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   341: astore 8
    //   343: aload 8
    //   345: invokevirtual 220	java/util/regex/Matcher:find	()Z
    //   348: ifeq +10 -> 358
    //   351: aload 8
    //   353: invokevirtual 223	java/util/regex/Matcher:group	()Ljava/lang/String;
    //   356: astore 7
    //   358: aload_0
    //   359: getfield 77	com/tencent/mm/ui/account/j:vUz	Lcom/tencent/mm/ui/account/j$a;
    //   362: aload 7
    //   364: invokeinterface 226 2 0
    //   369: aload 6
    //   371: ifnull +116 -> 487
    //   374: aload 6
    //   376: invokeinterface 229 1 0
    //   381: ifne +106 -> 487
    //   384: aload 6
    //   386: invokeinterface 232 1 0
    //   391: ldc2_w 114
    //   394: sipush 19211
    //   397: invokestatic 80	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   400: return
    //   401: aload_0
    //   402: getfield 77	com/tencent/mm/ui/account/j:vUz	Lcom/tencent/mm/ui/account/j$a;
    //   405: invokeinterface 235 1 0
    //   410: goto -41 -> 369
    //   413: astore 7
    //   415: ldc -98
    //   417: aload 7
    //   419: invokevirtual 236	java/lang/Exception:toString	()Ljava/lang/String;
    //   422: invokestatic 239	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   425: aload 6
    //   427: ifnull +60 -> 487
    //   430: aload 6
    //   432: invokeinterface 229 1 0
    //   437: ifne +50 -> 487
    //   440: aload 6
    //   442: invokeinterface 232 1 0
    //   447: ldc2_w 114
    //   450: sipush 19211
    //   453: invokestatic 80	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   456: return
    //   457: astore 7
    //   459: aconst_null
    //   460: astore 6
    //   462: aload 6
    //   464: ifnull +20 -> 484
    //   467: aload 6
    //   469: invokeinterface 229 1 0
    //   474: ifne +10 -> 484
    //   477: aload 6
    //   479: invokeinterface 232 1 0
    //   484: aload 7
    //   486: athrow
    //   487: ldc2_w 114
    //   490: sipush 19211
    //   493: invokestatic 80	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   496: return
    //   497: astore 7
    //   499: goto -37 -> 462
    //   502: astore 7
    //   504: goto -42 -> 462
    //   507: astore 7
    //   509: aconst_null
    //   510: astore 6
    //   512: goto -97 -> 415
    //   515: goto -255 -> 260
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	518	0	this	j
    //   35	273	1	i	int
    //   259	39	2	l1	long
    //   278	18	4	l2	long
    //   32	479	6	localObject1	Object
    //   1	362	7	str	String
    //   413	5	7	localException1	Exception
    //   457	28	7	localObject2	Object
    //   497	1	7	localObject3	Object
    //   502	1	7	localObject4	Object
    //   507	1	7	localException2	Exception
    //   17	335	8	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   260	280	413	java/lang/Exception
    //   287	295	413	java/lang/Exception
    //   305	343	413	java/lang/Exception
    //   343	358	413	java/lang/Exception
    //   358	369	413	java/lang/Exception
    //   401	410	413	java/lang/Exception
    //   222	256	457	finally
    //   260	280	497	finally
    //   287	295	497	finally
    //   305	343	497	finally
    //   343	358	497	finally
    //   358	369	497	finally
    //   401	410	497	finally
    //   415	425	502	finally
    //   222	256	507	java/lang/Exception
  }
  
  public final void onChange(boolean paramBoolean)
  {
    GMTrace.i(2578322554880L, 19210);
    super.onChange(paramBoolean);
    if ((this.context instanceof Activity))
    {
      paramBoolean = a.a((Activity)this.context, "android.permission.READ_SMS", 128, "", "");
      w.i("MicroMsg.SmsContentObserver", "summerper checkPermission checkSMS[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(paramBoolean), bg.bQW(), this.context });
      if (!paramBoolean)
      {
        GMTrace.o(2578322554880L, 19210);
        return;
      }
    }
    bYZ();
    GMTrace.o(2578322554880L, 19210);
  }
  
  public static abstract interface a
  {
    public abstract void Vr(String paramString);
    
    public abstract void bYI();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */