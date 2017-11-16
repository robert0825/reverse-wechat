package com.tencent.mm.plugin.aa.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.aa.a.b.d;
import com.tencent.mm.protocal.c.y;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class h
{
  public static String PP()
  {
    GMTrace.i(17092761878528L, 127351);
    com.tencent.mm.kernel.h.xz();
    String str = bg.nl((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyx, null));
    GMTrace.o(17092761878528L, 127351);
    return str;
  }
  
  private static void a(String paramString1, String paramString2, com.tencent.mm.plugin.aa.a.b.a parama, String paramString3)
  {
    try
    {
      GMTrace.i(5584531226624L, 41608);
      au localau = new au();
      localau.dC(0);
      localau.db(paramString2);
      localau.dB(3);
      localau.setContent(paramString1);
      localau.E(bc.k(paramString2, System.currentTimeMillis() / 1000L));
      localau.setType(10000);
      long l = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().P(localau);
      w.i("MicroMsg.AAUtil", "insertPaySysMsg, inserted msgId: %s", new Object[] { Long.valueOf(l) });
      paramString1 = parama;
      if (parama == null) {
        paramString1 = new com.tencent.mm.plugin.aa.a.b.a();
      }
      if (l > 0L)
      {
        paramString1.field_payMsgId = paramString3;
        paramString1.field_chatroom = paramString2;
        paramString1.field_insertmsg = true;
        paramString1.field_msgId = l;
        com.tencent.mm.plugin.aa.b.PG().a(paramString1);
      }
      GMTrace.o(5584531226624L, 41608);
      return;
    }
    finally {}
  }
  
  public static void a(String paramString, boolean paramBoolean, long paramLong)
  {
    try
    {
      GMTrace.i(5583860137984L, 41603);
      if (!bg.nm(paramString))
      {
        w.i("MicroMsg.AAUtil", "insertOrUpdateAARecord, billNo: %s, insertMsg: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
        com.tencent.mm.plugin.aa.a.b.c localc = new com.tencent.mm.plugin.aa.a.b.c();
        localc.field_billNo = paramString;
        localc.field_insertmsg = paramBoolean;
        localc.field_localMsgId = paramLong;
        com.tencent.mm.plugin.aa.b.PF().b(localc);
      }
      GMTrace.o(5583860137984L, 41603);
      return;
    }
    finally {}
  }
  
  public static boolean a(Activity paramActivity, y paramy)
  {
    GMTrace.i(5584933879808L, 41611);
    boolean bool;
    if (paramy.tMT == 1)
    {
      w.i("MicroMsg.AAUtil", "need realname verify");
      Bundle localBundle = new Bundle();
      localBundle.putString("realname_verify_process_jump_activity", ".ui.LaunchAAUI");
      localBundle.putString("realname_verify_process_jump_plugin", "aa");
      String str = paramy.mJN;
      str = paramy.mJO;
      paramy = paramy.mJP;
      bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(paramActivity, localBundle, 0);
      GMTrace.o(5584933879808L, 41611);
      return bool;
    }
    if (paramy.tMT == 2)
    {
      w.i("MicroMsg.AAUtil", "need upload credit");
      bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(paramActivity, paramy.mJN, paramy.mJQ, paramy.mJO, paramy.mJP, false, null);
      GMTrace.o(5584933879808L, 41611);
      return bool;
    }
    w.i("MicroMsg.AAUtil", "realnameGuideFlag =  " + paramy.tMT);
    GMTrace.o(5584933879808L, 41611);
    return false;
  }
  
  /* Error */
  private static void at(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc2_w 262
    //   8: ldc_w 264
    //   11: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   14: aload_0
    //   15: invokestatic 169	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   18: ifne +402 -> 420
    //   21: aload_0
    //   22: invokestatic 270	com/tencent/mm/x/f$a:eS	(Ljava/lang/String;)Lcom/tencent/mm/x/f$a;
    //   25: astore 5
    //   27: aload 5
    //   29: ifnull +391 -> 420
    //   32: aload 5
    //   34: getfield 273	com/tencent/mm/x/f$a:gkj	Ljava/lang/String;
    //   37: invokestatic 169	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   40: ifne +380 -> 420
    //   43: invokestatic 190	com/tencent/mm/plugin/aa/b:PF	()Lcom/tencent/mm/plugin/aa/a/b/d;
    //   46: aload 5
    //   48: getfield 273	com/tencent/mm/x/f$a:gkj	Ljava/lang/String;
    //   51: invokevirtual 277	com/tencent/mm/plugin/aa/a/b/d:nv	(Ljava/lang/String;)Lcom/tencent/mm/plugin/aa/a/b/c;
    //   54: astore 6
    //   56: aload 5
    //   58: getfield 273	com/tencent/mm/x/f$a:gkj	Ljava/lang/String;
    //   61: astore 7
    //   63: aload 6
    //   65: ifnull +88 -> 153
    //   68: aload 6
    //   70: getfield 183	com/tencent/mm/plugin/aa/a/b/c:field_insertmsg	Z
    //   73: ifeq +80 -> 153
    //   76: aload 6
    //   78: ifnull +80 -> 158
    //   81: aload 6
    //   83: getfield 186	com/tencent/mm/plugin/aa/a/b/c:field_localMsgId	J
    //   86: lstore_3
    //   87: ldc 119
    //   89: ldc_w 279
    //   92: iconst_5
    //   93: anewarray 4	java/lang/Object
    //   96: dup
    //   97: iconst_0
    //   98: aload 7
    //   100: aastore
    //   101: dup
    //   102: iconst_1
    //   103: aload_1
    //   104: aastore
    //   105: dup
    //   106: iconst_2
    //   107: aload 6
    //   109: aastore
    //   110: dup
    //   111: iconst_3
    //   112: iload_2
    //   113: invokestatic 176	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   116: aastore
    //   117: dup
    //   118: iconst_4
    //   119: lload_3
    //   120: invokestatic 127	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   123: aastore
    //   124: invokestatic 132	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: aload 6
    //   129: ifnonnull +34 -> 163
    //   132: ldc 119
    //   134: ldc_w 281
    //   137: invokestatic 284	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   140: ldc2_w 262
    //   143: ldc_w 264
    //   146: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   149: ldc 2
    //   151: monitorexit
    //   152: return
    //   153: iconst_0
    //   154: istore_2
    //   155: goto -79 -> 76
    //   158: lconst_0
    //   159: lstore_3
    //   160: goto -73 -> 87
    //   163: aload 6
    //   165: getfield 183	com/tencent/mm/plugin/aa/a/b/c:field_insertmsg	Z
    //   168: ifeq +13 -> 181
    //   171: aload 6
    //   173: getfield 186	com/tencent/mm/plugin/aa/a/b/c:field_localMsgId	J
    //   176: lconst_0
    //   177: lcmp
    //   178: ifgt +242 -> 420
    //   181: new 62	com/tencent/mm/storage/au
    //   184: dup
    //   185: invokespecial 66	com/tencent/mm/storage/au:<init>	()V
    //   188: astore 6
    //   190: aload 6
    //   192: aload_1
    //   193: invokestatic 288	com/tencent/mm/y/bc:gR	(Ljava/lang/String;)J
    //   196: invokevirtual 98	com/tencent/mm/storage/au:E	(J)V
    //   199: aload 6
    //   201: ldc_w 289
    //   204: invokevirtual 101	com/tencent/mm/storage/au:setType	(I)V
    //   207: invokestatic 294	com/tencent/mm/y/q:zE	()Ljava/lang/String;
    //   210: astore 7
    //   212: aload 6
    //   214: new 249	java/lang/StringBuilder
    //   217: dup
    //   218: invokespecial 295	java/lang/StringBuilder:<init>	()V
    //   221: aload 7
    //   223: invokevirtual 298	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: ldc_w 300
    //   229: invokevirtual 298	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: aload_0
    //   233: invokevirtual 298	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   239: invokevirtual 80	com/tencent/mm/storage/au:setContent	(Ljava/lang/String;)V
    //   242: new 249	java/lang/StringBuilder
    //   245: dup
    //   246: invokespecial 295	java/lang/StringBuilder:<init>	()V
    //   249: invokestatic 303	com/tencent/mm/sdk/platformtools/bg:Pv	()J
    //   252: invokevirtual 306	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   255: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   258: invokevirtual 310	java/lang/String:getBytes	()[B
    //   261: invokestatic 316	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   264: astore 7
    //   266: invokestatic 322	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
    //   269: aload 7
    //   271: invokevirtual 327	com/tencent/mm/ao/f:getFullPath	(Ljava/lang/String;)Ljava/lang/String;
    //   274: astore_0
    //   275: invokestatic 322	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
    //   278: pop
    //   279: aload 7
    //   281: invokestatic 330	com/tencent/mm/ao/f:kd	(Ljava/lang/String;)Ljava/lang/String;
    //   284: astore 7
    //   286: invokestatic 334	com/tencent/mm/ao/n:Jd	()Lcom/tencent/mm/ao/a/a;
    //   289: astore 8
    //   291: aload 5
    //   293: getfield 337	com/tencent/mm/x/f$a:gjT	Ljava/lang/String;
    //   296: astore 9
    //   298: new 339	com/tencent/mm/ao/a/a/c$a
    //   301: dup
    //   302: invokespecial 340	com/tencent/mm/ao/a/a/c$a:<init>	()V
    //   305: astore 10
    //   307: aload 10
    //   309: aload_0
    //   310: putfield 343	com/tencent/mm/ao/a/a/c$a:gKE	Ljava/lang/String;
    //   313: aload 10
    //   315: iconst_1
    //   316: putfield 346	com/tencent/mm/ao/a/a/c$a:gKC	Z
    //   319: aload 8
    //   321: aload 9
    //   323: aconst_null
    //   324: aload 10
    //   326: invokevirtual 350	com/tencent/mm/ao/a/a/c$a:Jn	()Lcom/tencent/mm/ao/a/a/c;
    //   329: invokevirtual 355	com/tencent/mm/ao/a/a:a	(Ljava/lang/String;Landroid/widget/ImageView;Lcom/tencent/mm/ao/a/a/c;)V
    //   332: aload 6
    //   334: aload 7
    //   336: invokevirtual 358	com/tencent/mm/storage/au:dc	(Ljava/lang/String;)V
    //   339: aload 6
    //   341: iconst_1
    //   342: invokevirtual 70	com/tencent/mm/storage/au:dC	(I)V
    //   345: aload 6
    //   347: aload_1
    //   348: invokevirtual 74	com/tencent/mm/storage/au:db	(Ljava/lang/String;)V
    //   351: aload 6
    //   353: iconst_3
    //   354: invokevirtual 77	com/tencent/mm/storage/au:dB	(I)V
    //   357: aload 6
    //   359: aload 6
    //   361: invokestatic 360	com/tencent/mm/y/bc:i	(Lcom/tencent/mm/storage/au;)J
    //   364: invokevirtual 363	com/tencent/mm/storage/au:C	(J)V
    //   367: ldc 119
    //   369: ldc_w 365
    //   372: invokestatic 211	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   375: aload 5
    //   377: getfield 273	com/tencent/mm/x/f$a:gkj	Ljava/lang/String;
    //   380: iconst_1
    //   381: aload 6
    //   383: getfield 368	com/tencent/mm/g/b/ce:field_msgId	J
    //   386: invokestatic 370	com/tencent/mm/plugin/aa/a/h:a	(Ljava/lang/String;ZJ)V
    //   389: new 372	com/tencent/mm/x/f
    //   392: dup
    //   393: invokespecial 373	com/tencent/mm/x/f:<init>	()V
    //   396: astore_0
    //   397: aload 5
    //   399: aload_0
    //   400: invokevirtual 376	com/tencent/mm/x/f$a:a	(Lcom/tencent/mm/x/f;)V
    //   403: aload_0
    //   404: aload 6
    //   406: getfield 368	com/tencent/mm/g/b/ce:field_msgId	J
    //   409: putfield 377	com/tencent/mm/x/f:field_msgId	J
    //   412: invokestatic 383	com/tencent/mm/plugin/x/a:aWz	()Lcom/tencent/mm/pluginsdk/model/app/k;
    //   415: aload_0
    //   416: invokevirtual 387	com/tencent/mm/pluginsdk/model/app/k:b	(Lcom/tencent/mm/sdk/e/c;)Z
    //   419: pop
    //   420: ldc2_w 262
    //   423: ldc_w 264
    //   426: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   429: goto -280 -> 149
    //   432: astore_0
    //   433: ldc 2
    //   435: monitorexit
    //   436: aload_0
    //   437: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	438	0	paramString1	String
    //   0	438	1	paramString2	String
    //   1	154	2	bool	boolean
    //   86	74	3	l	long
    //   25	373	5	locala	f.a
    //   54	351	6	localObject	Object
    //   61	274	7	str1	String
    //   289	31	8	locala1	com.tencent.mm.ao.a.a
    //   296	26	9	str2	String
    //   305	20	10	locala2	com.tencent.mm.ao.a.a.c.a
    // Exception table:
    //   from	to	target	type
    //   5	27	432	finally
    //   32	63	432	finally
    //   68	76	432	finally
    //   81	87	432	finally
    //   87	127	432	finally
    //   132	149	432	finally
    //   163	181	432	finally
    //   181	420	432	finally
    //   420	429	432	finally
  }
  
  public static void au(String paramString1, String paramString2)
  {
    boolean bool2 = true;
    for (;;)
    {
      Object localObject;
      try
      {
        GMTrace.i(5583994355712L, 41604);
        if (bg.nm(paramString1)) {
          break label347;
        }
        localObject = f.a.eS(paramString1);
        String str;
        if (localObject != null)
        {
          str = ((f.a)localObject).gkj;
          w.d("MicroMsg.AAUtil", "checkIfInsertAAMsg, billNo: %s, appMsgContent: %s", new Object[] { str, paramString1.trim().replace(" ", "") });
          if ((localObject == null) || (bg.nm(((f.a)localObject).gkj))) {
            break label347;
          }
          str = ((f.a)localObject).gkj;
          localObject = com.tencent.mm.plugin.aa.b.PF().nv(str);
          if (localObject != null) {
            break label359;
          }
          bool1 = true;
          if ((localObject == null) || (!((com.tencent.mm.plugin.aa.a.b.c)localObject).field_insertmsg)) {
            break label364;
          }
          if (localObject == null) {
            break label369;
          }
          l = ((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId;
          w.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, record==null: %s, billNo: %s, insertMsg: %s, chatroom: %s, localMsgId: %s", new Object[] { Boolean.valueOf(bool1), str, Boolean.valueOf(bool2), paramString2, Long.valueOf(l) });
          if ((localObject != null) && (((com.tencent.mm.plugin.aa.a.b.c)localObject).field_insertmsg) && (((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId > 0L) && (((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId).field_msgId <= 0L))
          {
            w.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, the oldMsgInfo has deleted, ignore this");
            com.tencent.mm.plugin.aa.b.PF().a((com.tencent.mm.plugin.aa.a.b.c)localObject, new String[0]);
            GMTrace.o(5583994355712L, 41604);
          }
        }
        else
        {
          str = "";
          continue;
        }
        if ((localObject == null) || (!((com.tencent.mm.plugin.aa.a.b.c)localObject).field_insertmsg) || (((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId <= 0L))
        {
          w.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, insert new aa msg");
          at(paramString1, paramString2);
          GMTrace.o(5583994355712L, 41604);
          continue;
        }
        w.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, update aa msg");
      }
      finally {}
      g(((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId, paramString1);
      label347:
      GMTrace.o(5583994355712L, 41604);
      continue;
      label359:
      boolean bool1 = false;
      continue;
      label364:
      bool2 = false;
      continue;
      label369:
      long l = 0L;
    }
  }
  
  public static long av(String paramString1, String paramString2)
  {
    GMTrace.i(15032117100544L, 111998);
    try
    {
      double d1 = bg.getDouble(paramString1, 0.0D);
      double d2 = bg.getDouble(paramString2, 0.0D);
      if (d1 == 0.0D) {
        paramString1 = "0";
      }
      paramString1 = new BigDecimal(paramString1);
      if (d2 == 0.0D) {
        paramString2 = "0";
      }
      long l = paramString1.multiply(new BigDecimal(paramString2)).longValue();
      GMTrace.o(15032117100544L, 111998);
      return l;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.AAUtil", paramString1, "", new Object[0]);
      GMTrace.o(15032117100544L, 111998);
    }
    return 0L;
  }
  
  public static double b(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(5585202315264L, 41613);
    try
    {
      if (bg.getDouble(paramString1.trim(), 0.0D) == 0.0D) {}
      for (paramString1 = "0";; paramString1 = paramString1.trim())
      {
        double d = new BigDecimal(paramString1).divide(new BigDecimal(paramString2.trim()), paramInt1, paramInt2).doubleValue();
        GMTrace.o(5585202315264L, 41613);
        return d;
      }
      return 0.0D;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.AAUtil", paramString1, "", new Object[0]);
      GMTrace.o(5585202315264L, 41613);
    }
  }
  
  /* Error */
  public static void b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: ldc 2
    //   5: monitorenter
    //   6: ldc2_w 469
    //   9: ldc_w 471
    //   12: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   15: ldc 119
    //   17: ldc_w 473
    //   20: iconst_3
    //   21: anewarray 4	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: aload_0
    //   27: aastore
    //   28: dup
    //   29: iconst_1
    //   30: aload_2
    //   31: aastore
    //   32: dup
    //   33: iconst_2
    //   34: aload_3
    //   35: aastore
    //   36: invokestatic 407	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: aload_0
    //   40: invokestatic 169	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   43: ifne +171 -> 214
    //   46: aload_2
    //   47: invokestatic 169	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   50: ifne +164 -> 214
    //   53: aload_3
    //   54: invokestatic 169	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   57: ifne +157 -> 214
    //   60: invokestatic 156	com/tencent/mm/plugin/aa/b:PG	()Lcom/tencent/mm/plugin/aa/a/b/b;
    //   63: aload_3
    //   64: invokevirtual 477	com/tencent/mm/plugin/aa/a/b/b:nu	(Ljava/lang/String;)Lcom/tencent/mm/plugin/aa/a/b/a;
    //   67: astore 6
    //   69: aload 6
    //   71: ifnull +156 -> 227
    //   74: aload 6
    //   76: getfield 146	com/tencent/mm/plugin/aa/a/b/a:field_insertmsg	Z
    //   79: ifeq +148 -> 227
    //   82: ldc 119
    //   84: ldc_w 479
    //   87: iconst_5
    //   88: anewarray 4	java/lang/Object
    //   91: dup
    //   92: iconst_0
    //   93: aload_0
    //   94: aastore
    //   95: dup
    //   96: iconst_1
    //   97: aload_1
    //   98: aastore
    //   99: dup
    //   100: iconst_2
    //   101: aload_3
    //   102: aastore
    //   103: dup
    //   104: iconst_3
    //   105: aload 6
    //   107: aastore
    //   108: dup
    //   109: iconst_4
    //   110: iload 5
    //   112: invokestatic 176	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   115: aastore
    //   116: invokestatic 132	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: aload 6
    //   121: ifnull +11 -> 132
    //   124: aload 6
    //   126: getfield 146	com/tencent/mm/plugin/aa/a/b/a:field_insertmsg	Z
    //   129: ifne +85 -> 214
    //   132: new 249	java/lang/StringBuilder
    //   135: dup
    //   136: ldc_w 481
    //   139: invokespecial 253	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   142: aload_2
    //   143: invokevirtual 298	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: ldc_w 483
    //   149: invokevirtual 298	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload_0
    //   153: invokevirtual 298	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: astore_2
    //   160: aload 4
    //   162: invokestatic 169	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   165: ifeq +111 -> 276
    //   168: ldc 119
    //   170: ldc_w 485
    //   173: invokestatic 211	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   176: aload_0
    //   177: invokestatic 294	com/tencent/mm/y/q:zE	()Ljava/lang/String;
    //   180: invokevirtual 489	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   183: ifeq +50 -> 233
    //   186: invokestatic 495	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   189: getstatic 500	com/tencent/mm/plugin/wxpay/a$i:sWx	I
    //   192: iconst_1
    //   193: anewarray 4	java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: aload_2
    //   199: aastore
    //   200: invokevirtual 506	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   203: astore 4
    //   205: aload 4
    //   207: aload_1
    //   208: aload 6
    //   210: aload_3
    //   211: invokestatic 508	com/tencent/mm/plugin/aa/a/h:a	(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/aa/a/b/a;Ljava/lang/String;)V
    //   214: ldc2_w 469
    //   217: ldc_w 471
    //   220: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   223: ldc 2
    //   225: monitorexit
    //   226: return
    //   227: iconst_0
    //   228: istore 5
    //   230: goto -148 -> 82
    //   233: ldc_w 510
    //   236: invokestatic 107	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   239: checkcast 510	com/tencent/mm/plugin/messenger/a/a
    //   242: aload_0
    //   243: aload_1
    //   244: invokeinterface 514 3 0
    //   249: astore_0
    //   250: invokestatic 495	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   253: getstatic 517	com/tencent/mm/plugin/wxpay/a$i:sWy	I
    //   256: iconst_2
    //   257: anewarray 4	java/lang/Object
    //   260: dup
    //   261: iconst_0
    //   262: aload_0
    //   263: aastore
    //   264: dup
    //   265: iconst_1
    //   266: aload_2
    //   267: aastore
    //   268: invokevirtual 506	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   271: astore 4
    //   273: goto -68 -> 205
    //   276: ldc 119
    //   278: ldc_w 519
    //   281: iconst_1
    //   282: anewarray 4	java/lang/Object
    //   285: dup
    //   286: iconst_0
    //   287: aload 4
    //   289: aastore
    //   290: invokestatic 407	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   293: goto -88 -> 205
    //   296: astore_0
    //   297: ldc 2
    //   299: monitorexit
    //   300: aload_0
    //   301: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	302	0	paramString1	String
    //   0	302	1	paramString2	String
    //   0	302	2	paramString3	String
    //   0	302	3	paramString4	String
    //   0	302	4	paramString5	String
    //   1	228	5	bool	boolean
    //   67	142	6	locala	com.tencent.mm.plugin.aa.a.b.a
    // Exception table:
    //   from	to	target	type
    //   6	69	296	finally
    //   74	82	296	finally
    //   82	119	296	finally
    //   124	132	296	finally
    //   132	205	296	finally
    //   205	214	296	finally
    //   214	223	296	finally
    //   233	273	296	finally
    //   276	293	296	finally
  }
  
  public static void g(long paramLong, String paramString)
  {
    for (;;)
    {
      Object localObject;
      try
      {
        GMTrace.i(5584665444352L, 41609);
        if ((paramLong <= 0L) || (bg.nm(paramString))) {
          break label402;
        }
        localObject = f.a.eS(paramString);
        if ((localObject == null) || (bg.nm(((f.a)localObject).gkj))) {
          break label371;
        }
        w.i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, msgId: %s, billNo: %s", new Object[] { Long.valueOf(paramLong), ((f.a)localObject).gkj });
        com.tencent.mm.plugin.aa.a.b.c localc = com.tencent.mm.plugin.aa.b.PF().nv(((f.a)localObject).gkj);
        if (localc != null)
        {
          long l = localc.field_localMsgId;
          localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(l);
          if (((ce)localObject).field_msgId > 0L)
          {
            String str = bc.gP(((ce)localObject).field_content);
            ((au)localObject).setContent(str + ":\n" + paramString);
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(l, (au)localObject);
            w.i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, update success, oldMsgId: %s, billNo: %s", new Object[] { Long.valueOf(l), localc.field_billNo });
            GMTrace.o(5584665444352L, 41609);
            return;
          }
          w.e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, cannot find old msg, insert new one, billNo: %s, oldMsgId: %s, newMsgId: %s, needUpdateInfo.msgId: %s", new Object[] { localc.field_billNo, Long.valueOf(localc.field_localMsgId), Long.valueOf(paramLong), Long.valueOf(((ce)localObject).field_msgId) });
          GMTrace.o(5584665444352L, 41609);
          continue;
        }
        paramString = new com.tencent.mm.plugin.aa.a.b.c();
      }
      finally {}
      paramString.field_localMsgId = paramLong;
      paramString.field_billNo = ((f.a)localObject).gkj;
      paramString.field_insertmsg = true;
      com.tencent.mm.plugin.aa.b.PF().a(paramString);
      w.i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, insert new aa record, msgId: %s, billNo: %s", new Object[] { Long.valueOf(paramLong), ((f.a)localObject).gkj });
      GMTrace.o(5584665444352L, 41609);
      continue;
      label371:
      w.e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, parse app msg failed, msgId: %s", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(5584665444352L, 41609);
      continue;
      label402:
      w.e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, msgContent is null or msgId invalid, msgId: %s, %s", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(bg.nm(paramString)) });
    }
  }
  
  public static void h(long paramLong, String paramString)
  {
    GMTrace.i(5584799662080L, 41610);
    w.i("MicroMsg.AAUtil", "do update sys msg, %s, %s", new Object[] { Long.valueOf(paramLong), paramString });
    au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramLong);
    paramString = nr(paramString);
    if (!bg.nm(paramString)) {
      localau.setContent(paramString);
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(paramLong, localau);
    GMTrace.o(5584799662080L, 41610);
  }
  
  private static String nr(String paramString)
  {
    GMTrace.i(5585068097536L, 41612);
    paramString = (String)bh.q(paramString, "sysmsg").get(".sysmsg.paymsg.appmsgcontent");
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.AAUtil", "empty appmsgcontent!");
      GMTrace.o(5585068097536L, 41612);
      return "";
    }
    for (;;)
    {
      try
      {
        paramString = URLDecoder.decode(paramString, "UTF-8");
        w.e("MicroMsg.AAUtil", localUnsupportedEncodingException1.getMessage());
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          w.d("MicroMsg.AAUtil", "msgContent: %s", new Object[] { paramString });
          GMTrace.o(5585068097536L, 41612);
          return paramString;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;) {}
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        paramString = "";
      }
    }
  }
  
  public static List<String> ns(String paramString)
  {
    GMTrace.i(5585336532992L, 41614);
    if (bg.nm(paramString))
    {
      w.i("MicroMsg.AAUtil", "illegal chatroomName");
      paramString = new ArrayList();
      GMTrace.o(5585336532992L, 41614);
      return paramString;
    }
    Object localObject;
    if (!s.eb(paramString))
    {
      localObject = new ArrayList();
      ((List)localObject).add(q.zE());
      ((List)localObject).add(paramString);
      GMTrace.o(5585336532992L, 41614);
      return (List<String>)localObject;
    }
    try
    {
      localObject = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gG(paramString);
      paramString = (String)localObject;
      if (localObject == null) {
        paramString = new ArrayList();
      }
      GMTrace.o(5585336532992L, 41614);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.AAUtil", "getChatroomMemberList error! %s", new Object[] { paramString.getMessage() });
      paramString = new ArrayList();
      GMTrace.o(5585336532992L, 41614);
    }
    return paramString;
  }
  
  public static void nt(String paramString)
  {
    GMTrace.i(17092896096256L, 127352);
    Object localObject = PP();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(",");
    if (!bg.nm((String)localObject))
    {
      localObject = ((String)localObject).split(",");
      int i = 0;
      int k;
      for (int j = 1; i < localObject.length; j = k)
      {
        String str = localObject[i];
        k = j;
        if (!str.equals(paramString))
        {
          k = j;
          if (j < 5)
          {
            localStringBuilder.append(str);
            localStringBuilder.append(",");
            k = j + 1;
          }
        }
        i += 1;
      }
    }
    localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    w.d("MicroMsg.AAUtil", "recent group: %s", new Object[] { localStringBuilder.toString() });
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vyx, localStringBuilder.toString());
    GMTrace.o(17092896096256L, 127352);
  }
  
  public static void q(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      GMTrace.i(5584128573440L, 41605);
      com.tencent.mm.plugin.aa.a.b.c localc = com.tencent.mm.plugin.aa.b.PF().nv(paramString1);
      w.i("MicroMsg.AAUtil", "setAARecordAfterLaunchAA, billNo: %s, chatroom: %s, msgContent==null:%s, oldRecord: %s", new Object[] { paramString1, paramString2, Boolean.valueOf(bg.nm(paramString3)), localc });
      if (localc == null) {
        a(paramString1, false, 0L);
      }
      au(paramString3, paramString2);
      GMTrace.o(5584128573440L, 41605);
      return;
    }
    finally {}
  }
  
  public static void r(String paramString1, String paramString2, String paramString3)
  {
    for (;;)
    {
      com.tencent.mm.plugin.aa.a.b.a locala;
      try
      {
        GMTrace.i(5584397008896L, 41607);
      }
      finally {}
      try
      {
        if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (bg.nm(paramString3))) {
          continue;
        }
        w.i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, chatroom: %s, payMsgId: %s", new Object[] { paramString2, paramString3 });
        locala = com.tencent.mm.plugin.aa.b.PG().nu(paramString3);
        if ((locala != null) && (locala.field_insertmsg)) {
          continue;
        }
        w.i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, insert new msg");
        a(paramString1, paramString2, locala, paramString3);
        GMTrace.o(5584397008896L, 41607);
      }
      catch (Exception paramString1)
      {
        w.e("MicroMsg.AAUtil", "checkIfInsertPaySysMsg error: %s", new Object[] { paramString1.getMessage() });
        GMTrace.o(5584397008896L, 41607);
        continue;
      }
      return;
      paramString2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(locala.field_msgId);
      w.i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, update old one, msgId: %s, dbMsginfo.id: %s", new Object[] { Long.valueOf(locala.field_msgId), Long.valueOf(paramString2.field_msgId) });
      paramString2.setContent(paramString1);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(locala.field_msgId, paramString2);
      GMTrace.o(5584397008896L, 41607);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\aa\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */