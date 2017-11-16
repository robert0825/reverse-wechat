package com.tencent.mm.plugin.backup.e;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.al;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.t;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class f
  implements e
{
  public f()
  {
    GMTrace.i(14814684381184L, 110378);
    GMTrace.o(14814684381184L, 110378);
  }
  
  private static boolean tg(String paramString)
  {
    GMTrace.i(14814818598912L, 110379);
    int i = paramString.indexOf('<');
    String str = paramString;
    if (i > 0) {
      str = paramString.substring(i);
    }
    if (bh.q(str, "msg") != null)
    {
      GMTrace.o(14814818598912L, 110379);
      return true;
    }
    GMTrace.o(14814818598912L, 110379);
    return false;
  }
  
  public final int a(ek paramek, boolean paramBoolean1, au paramau, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, a.c> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    GMTrace.i(14814952816640L, 110380);
    if (bg.nm(paramau.field_content)) {}
    for (int i = 0;; i = paramau.field_content.getBytes().length)
    {
      paramHashMap = aj.Uf(paramau.field_content).vAJ.trim();
      paramString = paramHashMap;
      if (!tg(paramHashMap))
      {
        paramHashMap = paramau.field_content;
        paramString = paramHashMap;
        if (!tg(paramHashMap))
        {
          paramHashMap = a.a(paramau, paramek);
          paramString = paramHashMap;
          if (paramau.field_isSend != 1)
          {
            paramString = paramHashMap;
            if (com.tencent.mm.plugin.backup.g.d.eb(paramau.field_talker)) {
              paramString = paramau.field_talker + " :\n " + paramHashMap;
            }
          }
        }
      }
      if ((paramString != null) && (tg(paramString))) {
        break;
      }
      w.d("MicroMsg.MMBakEmoji", "emoji error" + paramString);
      GMTrace.o(14814952816640L, 110380);
      return -1;
    }
    paramHashMap = new azq();
    paramHashMap.Rq(bg.aq(paramString, ""));
    paramek.tPY = paramHashMap;
    paramau = a.afG().afH().afO().UK(paramau.field_imgPath);
    if ((paramau != null) && (paramau.bUP()))
    {
      GMTrace.o(14814952816640L, 110380);
      return i;
    }
    if (paramau != null) {
      if (TextUtils.isEmpty(paramau.field_groupId))
      {
        paramString = a.afG().afH().zb();
        paramString = paramString + paramau.GS() + "_thumb";
        if (com.tencent.mm.a.e.aY(paramString) < 0)
        {
          GMTrace.o(14814952816640L, 110380);
          return -1;
        }
        i += b.a(new b.a(paramString, paramek, paramLinkedList, 4, paramBoolean1, "_thumb", paramBoolean2));
      }
    }
    for (;;)
    {
      if (paramau != null) {
        if ((TextUtils.isEmpty(paramau.field_groupId)) && (paramau.bUN()))
        {
          paramString = a.afG().afH().zb();
          paramau = paramString + paramau.GS();
          paramString = aj.Uf(n.a(paramek.tPY));
          i = b.a(new b.a(paramau, paramek, paramLinkedList, paramBoolean1, paramBoolean2, a.afG().afH().afO().UK(paramString.eDW))) + i;
        }
      }
      label759:
      for (;;)
      {
        GMTrace.o(14814952816640L, 110380);
        return i;
        paramString = a.afG().afH().zb();
        paramString = paramString + paramau.field_groupId + File.separator + paramau.GS() + "_cover";
        if (com.tencent.mm.a.e.aY(paramString) < 0)
        {
          GMTrace.o(14814952816640L, 110380);
          return -1;
        }
        i += b.a(new b.a(paramString, paramek, paramLinkedList, 4, paramBoolean1, "_thumb", paramBoolean2));
        break;
        if ((paramau.field_catalog == EmojiInfo.vCq) || (paramau.field_catalog == EmojiInfo.vCt) || (paramau.field_catalog == EmojiInfo.vCs)) {}
        for (boolean bool = true;; bool = new File(paramau.nSe + paramau.field_groupId + File.separator + paramau.GS()).exists())
        {
          if (!bool) {
            break label759;
          }
          paramString = a.afG().afH().zb();
          paramau = paramString + paramau.field_groupId + File.separator + paramau.GS();
          paramString = aj.Uf(n.a(paramek.tPY));
          i = b.a(new b.a(paramau, paramek, paramLinkedList, paramBoolean1, paramBoolean2, a.afG().afH().afO().UK(paramString.eDW))) + i;
          break;
        }
      }
    }
  }
  
  public final int a(String paramString, ek paramek, au paramau)
  {
    GMTrace.i(14815087034368L, 110381);
    paramau.setContent(paramek.tPY.uNR);
    paramString = paramek.tPW.uNR;
    Object localObject1 = paramek.tPX.uNR;
    if (((String)a.afG().afH().xh().get(2, null)).equals(paramString)) {
      paramString = (String)localObject1;
    }
    for (;;)
    {
      localObject2 = paramek.tPY.uNR;
      localObject1 = bh.q((String)localObject2, "msg");
      paramString = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().bT((String)localObject2, paramString);
      if (paramString != null) {
        break;
      }
      w.w("MicroMsg.MMBakEmoji", "EmojiMsgInfo is null");
      GMTrace.o(14815087034368L, 110381);
      return -1;
    }
    Object localObject2 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramString.eDW);
    if (localObject2 == null)
    {
      w.w("MicroMsg.MMBakEmoji", "EmojiInfo is null");
      GMTrace.o(14815087034368L, 110381);
      return -1;
    }
    if (((Map)localObject1).get(".msg.emoji.$androidmd5") == null)
    {
      localObject3 = a.tm(paramString.eDW);
      if (!bg.nm((String)localObject3))
      {
        paramString.eDW = ((String)localObject3);
        w.d("MicroMsg.MMBakEmoji", "convert ip to android md5 %s", new Object[] { localObject3 });
      }
    }
    localObject1 = (String)((Map)localObject1).get(".msg.emoji.$productid");
    if (!TextUtils.isEmpty((CharSequence)localObject1)) {
      paramString.eEa = ((String)localObject1);
    }
    paramau.setType(47);
    paramau.dc(paramString.eDW);
    Object localObject3 = paramString.hcn;
    boolean bool;
    if ((!((EmojiInfo)localObject2).bJs()) && (!((EmojiInfo)localObject2).isGif()))
    {
      bool = true;
      paramau.setContent(aj.a((String)localObject3, 0L, bool, paramString.eDW, false, ""));
      if ((localObject2 == null) || (!((EmojiInfo)localObject2).bUN()))
      {
        localObject2 = a.afG().afH().zb();
        if (!TextUtils.isEmpty((CharSequence)localObject1)) {
          break label557;
        }
        com.tencent.mm.plugin.backup.a.h.b(paramek, 4, (String)localObject2 + paramString.eDW + "_thumb");
        com.tencent.mm.plugin.backup.a.h.b(paramek, 5, (String)localObject2 + paramString.eDW);
      }
    }
    for (;;)
    {
      paramek = new EmojiInfo((String)localObject2);
      paramek.field_md5 = paramString.eDW;
      paramek.field_svrid = paramString.id;
      paramek.field_catalog = EmojiInfo.vCo;
      paramek.field_type = paramString.vAP;
      paramek.field_size = paramString.vAQ;
      paramek.field_state = EmojiInfo.vCA;
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        paramek.field_groupId = ((String)localObject1);
      }
      if (!bg.nm(paramString.vAY)) {
        paramek.field_activityid = paramString.vAY;
      }
      a.afG().afH().afO().a(paramek);
      long l = com.tencent.mm.plugin.backup.g.d.i(paramau);
      w.d("MicroMsg.MMBakEmoji", "id " + l);
      GMTrace.o(14815087034368L, 110381);
      return 0;
      bool = false;
      break;
      label557:
      localObject3 = new File((String)localObject2 + (String)localObject1);
      if (!((File)localObject3).exists()) {
        ((File)localObject3).mkdirs();
      }
      com.tencent.mm.plugin.backup.a.h.b(paramek, 4, (String)localObject2 + (String)localObject1 + File.separator + paramString.eDW + "_cover");
      com.tencent.mm.plugin.backup.a.h.b(paramek, 5, (String)localObject2 + (String)localObject1 + File.separator + paramString.eDW);
    }
  }
  
  private static final class a
  {
    public static String iZZ;
    public static String jaa;
    
    static
    {
      GMTrace.i(14813207986176L, 110367);
      iZZ = "<msg>";
      jaa = "</msg>";
      GMTrace.o(14813207986176L, 110367);
    }
    
    /* Error */
    public static String a(au paramau, ek paramek)
    {
      // Byte code:
      //   0: ldc2_w 45
      //   3: ldc 47
      //   5: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: invokestatic 53	com/tencent/mm/plugin/backup/g/a:afG	()Lcom/tencent/mm/plugin/backup/g/a;
      //   11: invokevirtual 57	com/tencent/mm/plugin/backup/g/a:afH	()Lcom/tencent/mm/plugin/backup/g/c;
      //   14: invokevirtual 63	com/tencent/mm/plugin/backup/g/c:afO	()Lcom/tencent/mm/storage/emotion/d;
      //   17: aload_0
      //   18: getfield 68	com/tencent/mm/g/b/ce:field_imgPath	Ljava/lang/String;
      //   21: invokevirtual 74	com/tencent/mm/storage/emotion/d:UK	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
      //   24: astore 4
      //   26: aload 4
      //   28: ifnonnull +13 -> 41
      //   31: ldc2_w 45
      //   34: ldc 47
      //   36: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   39: aconst_null
      //   40: areturn
      //   41: aload 4
      //   43: invokevirtual 80	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
      //   46: invokestatic 86	com/tencent/mm/plugin/backup/e/d:tl	(Ljava/lang/String;)Lcom/tencent/mm/plugin/backup/e/d$a;
      //   49: astore_2
      //   50: aload_2
      //   51: astore_0
      //   52: aload_2
      //   53: ifnonnull +47 -> 100
      //   56: new 88	com/tencent/mm/plugin/backup/e/d$a
      //   59: dup
      //   60: invokespecial 91	com/tencent/mm/plugin/backup/e/d$a:<init>	()V
      //   63: astore_0
      //   64: aload_0
      //   65: aload 4
      //   67: invokevirtual 80	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
      //   70: putfield 94	com/tencent/mm/plugin/backup/e/d$a:iZW	Ljava/lang/String;
      //   73: aload_0
      //   74: aload 4
      //   76: invokevirtual 80	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
      //   79: putfield 97	com/tencent/mm/plugin/backup/e/d$a:iZX	Ljava/lang/String;
      //   82: aload_0
      //   83: aload 4
      //   85: invokevirtual 80	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
      //   88: putfield 100	com/tencent/mm/plugin/backup/e/d$a:iZY	Ljava/lang/String;
      //   91: aload_0
      //   92: aload 4
      //   94: invokevirtual 80	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
      //   97: putfield 103	com/tencent/mm/plugin/backup/e/d$a:iZV	Ljava/lang/String;
      //   100: new 105	java/io/StringWriter
      //   103: dup
      //   104: invokespecial 106	java/io/StringWriter:<init>	()V
      //   107: astore_2
      //   108: invokestatic 112	org/xmlpull/v1/XmlPullParserFactory:newInstance	()Lorg/xmlpull/v1/XmlPullParserFactory;
      //   111: invokevirtual 116	org/xmlpull/v1/XmlPullParserFactory:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
      //   114: astore_3
      //   115: aload_3
      //   116: aload_2
      //   117: invokeinterface 122 2 0
      //   122: aload_3
      //   123: ldc 124
      //   125: iconst_1
      //   126: invokestatic 130	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   129: invokeinterface 134 3 0
      //   134: aload_3
      //   135: aconst_null
      //   136: ldc -120
      //   138: invokeinterface 140 3 0
      //   143: pop
      //   144: aload_3
      //   145: aconst_null
      //   146: ldc -114
      //   148: invokeinterface 140 3 0
      //   153: pop
      //   154: aload_3
      //   155: aconst_null
      //   156: ldc -112
      //   158: aload_1
      //   159: getfield 150	com/tencent/mm/protocal/c/ek:tPW	Lcom/tencent/mm/protocal/c/azq;
      //   162: getfield 155	com/tencent/mm/protocal/c/azq:uNR	Ljava/lang/String;
      //   165: invokeinterface 159 4 0
      //   170: pop
      //   171: aload_3
      //   172: aconst_null
      //   173: ldc -95
      //   175: aload_1
      //   176: getfield 164	com/tencent/mm/protocal/c/ek:tPX	Lcom/tencent/mm/protocal/c/azq;
      //   179: getfield 155	com/tencent/mm/protocal/c/azq:uNR	Ljava/lang/String;
      //   182: invokeinterface 159 4 0
      //   187: pop
      //   188: aload_3
      //   189: aconst_null
      //   190: ldc -90
      //   192: new 168	java/lang/StringBuilder
      //   195: dup
      //   196: invokespecial 169	java/lang/StringBuilder:<init>	()V
      //   199: aload 4
      //   201: getfield 173	com/tencent/mm/storage/emotion/EmojiInfo:field_type	I
      //   204: invokevirtual 177	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   207: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   210: invokeinterface 159 4 0
      //   215: pop
      //   216: aload 4
      //   218: getfield 183	com/tencent/mm/storage/emotion/EmojiInfo:field_svrid	Ljava/lang/String;
      //   221: ifnonnull +190 -> 411
      //   224: ldc -71
      //   226: astore_1
      //   227: aload_3
      //   228: aconst_null
      //   229: ldc -69
      //   231: aload_1
      //   232: invokeinterface 159 4 0
      //   237: pop
      //   238: aload_3
      //   239: aconst_null
      //   240: ldc -67
      //   242: aload_0
      //   243: getfield 94	com/tencent/mm/plugin/backup/e/d$a:iZW	Ljava/lang/String;
      //   246: invokeinterface 159 4 0
      //   251: pop
      //   252: aload_3
      //   253: aconst_null
      //   254: ldc -65
      //   256: ldc -63
      //   258: invokeinterface 159 4 0
      //   263: pop
      //   264: aload_3
      //   265: aconst_null
      //   266: ldc -61
      //   268: aload_0
      //   269: getfield 103	com/tencent/mm/plugin/backup/e/d$a:iZV	Ljava/lang/String;
      //   272: invokeinterface 159 4 0
      //   277: pop
      //   278: aload_3
      //   279: aconst_null
      //   280: ldc -59
      //   282: ldc -63
      //   284: invokeinterface 159 4 0
      //   289: pop
      //   290: aload_3
      //   291: aconst_null
      //   292: ldc -57
      //   294: aload 4
      //   296: getfield 202	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
      //   299: invokeinterface 159 4 0
      //   304: pop
      //   305: aload_3
      //   306: aconst_null
      //   307: ldc -114
      //   309: invokeinterface 205 3 0
      //   314: pop
      //   315: aload 4
      //   317: invokevirtual 209	com/tencent/mm/storage/emotion/EmojiInfo:bJs	()Z
      //   320: ifeq +132 -> 452
      //   323: aload_3
      //   324: aconst_null
      //   325: ldc -45
      //   327: invokeinterface 140 3 0
      //   332: pop
      //   333: aload 4
      //   335: invokevirtual 214	com/tencent/mm/storage/emotion/EmojiInfo:rc	()Ljava/lang/String;
      //   338: ldc -45
      //   340: invokestatic 220	com/tencent/mm/sdk/platformtools/bh:q	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
      //   343: astore_1
      //   344: aload_1
      //   345: ldc -34
      //   347: invokeinterface 228 2 0
      //   352: checkcast 230	java/lang/String
      //   355: ldc -71
      //   357: invokestatic 236	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   360: astore_0
      //   361: aload_1
      //   362: ldc -18
      //   364: invokeinterface 228 2 0
      //   369: checkcast 230	java/lang/String
      //   372: ldc -71
      //   374: invokestatic 236	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   377: astore_1
      //   378: aload_0
      //   379: ldc -71
      //   381: invokevirtual 242	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   384: ifne +12 -> 396
      //   387: aload_1
      //   388: ldc -71
      //   390: invokevirtual 242	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   393: ifeq +27 -> 420
      //   396: aload_2
      //   397: invokevirtual 245	java/io/StringWriter:close	()V
      //   400: ldc2_w 45
      //   403: ldc 47
      //   405: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   408: ldc -71
      //   410: areturn
      //   411: aload 4
      //   413: getfield 183	com/tencent/mm/storage/emotion/EmojiInfo:field_svrid	Ljava/lang/String;
      //   416: astore_1
      //   417: goto -190 -> 227
      //   420: aload_3
      //   421: aconst_null
      //   422: ldc -90
      //   424: aload_0
      //   425: invokeinterface 159 4 0
      //   430: pop
      //   431: aload_3
      //   432: aconst_null
      //   433: ldc -9
      //   435: aload_1
      //   436: invokeinterface 159 4 0
      //   441: pop
      //   442: aload_3
      //   443: aconst_null
      //   444: ldc -45
      //   446: invokeinterface 205 3 0
      //   451: pop
      //   452: aload_3
      //   453: aconst_null
      //   454: ldc -120
      //   456: invokeinterface 205 3 0
      //   461: pop
      //   462: aload_3
      //   463: invokeinterface 250 1 0
      //   468: aload_2
      //   469: invokevirtual 253	java/io/StringWriter:flush	()V
      //   472: aload_2
      //   473: invokevirtual 245	java/io/StringWriter:close	()V
      //   476: aload_2
      //   477: invokevirtual 257	java/io/StringWriter:getBuffer	()Ljava/lang/StringBuffer;
      //   480: invokevirtual 260	java/lang/StringBuffer:toString	()Ljava/lang/String;
      //   483: astore_0
      //   484: aload_0
      //   485: aload_0
      //   486: getstatic 25	com/tencent/mm/plugin/backup/e/f$a:iZZ	Ljava/lang/String;
      //   489: invokevirtual 264	java/lang/String:indexOf	(Ljava/lang/String;)I
      //   492: aload_0
      //   493: getstatic 29	com/tencent/mm/plugin/backup/e/f$a:jaa	Ljava/lang/String;
      //   496: invokevirtual 264	java/lang/String:indexOf	(Ljava/lang/String;)I
      //   499: getstatic 29	com/tencent/mm/plugin/backup/e/f$a:jaa	Ljava/lang/String;
      //   502: invokevirtual 268	java/lang/String:length	()I
      //   505: iadd
      //   506: invokevirtual 272	java/lang/String:substring	(II)Ljava/lang/String;
      //   509: astore_0
      //   510: ldc_w 274
      //   513: new 168	java/lang/StringBuilder
      //   516: dup
      //   517: ldc_w 276
      //   520: invokespecial 279	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   523: aload_0
      //   524: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   527: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   530: invokestatic 288	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
      //   533: ldc2_w 45
      //   536: ldc 47
      //   538: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   541: aload_0
      //   542: areturn
      //   543: astore_0
      //   544: ldc_w 274
      //   547: aload_0
      //   548: ldc -71
      //   550: iconst_0
      //   551: anewarray 4	java/lang/Object
      //   554: invokestatic 292	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   557: ldc2_w 45
      //   560: ldc 47
      //   562: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   565: ldc -71
      //   567: areturn
      //   568: astore_0
      //   569: ldc_w 274
      //   572: aload_0
      //   573: ldc -71
      //   575: iconst_0
      //   576: anewarray 4	java/lang/Object
      //   579: invokestatic 292	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   582: ldc2_w 45
      //   585: ldc 47
      //   587: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   590: ldc -71
      //   592: areturn
      //   593: astore_0
      //   594: ldc_w 274
      //   597: aload_0
      //   598: ldc -71
      //   600: iconst_0
      //   601: anewarray 4	java/lang/Object
      //   604: invokestatic 292	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   607: ldc2_w 45
      //   610: ldc 47
      //   612: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   615: ldc -71
      //   617: areturn
      //   618: astore_0
      //   619: ldc_w 274
      //   622: aload_0
      //   623: ldc -71
      //   625: iconst_0
      //   626: anewarray 4	java/lang/Object
      //   629: invokestatic 292	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   632: ldc2_w 45
      //   635: ldc 47
      //   637: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   640: ldc -71
      //   642: areturn
      //   643: astore_0
      //   644: ldc2_w 45
      //   647: ldc 47
      //   649: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   652: ldc -71
      //   654: areturn
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	655	0	paramau	au
      //   0	655	1	paramek	ek
      //   49	428	2	localObject	Object
      //   114	349	3	localXmlSerializer	org.xmlpull.v1.XmlSerializer
      //   24	388	4	localEmojiInfo	EmojiInfo
      // Exception table:
      //   from	to	target	type
      //   108	224	543	org/xmlpull/v1/XmlPullParserException
      //   227	396	543	org/xmlpull/v1/XmlPullParserException
      //   396	400	543	org/xmlpull/v1/XmlPullParserException
      //   411	417	543	org/xmlpull/v1/XmlPullParserException
      //   420	452	543	org/xmlpull/v1/XmlPullParserException
      //   452	476	543	org/xmlpull/v1/XmlPullParserException
      //   108	224	568	java/lang/IllegalArgumentException
      //   227	396	568	java/lang/IllegalArgumentException
      //   396	400	568	java/lang/IllegalArgumentException
      //   411	417	568	java/lang/IllegalArgumentException
      //   420	452	568	java/lang/IllegalArgumentException
      //   452	476	568	java/lang/IllegalArgumentException
      //   108	224	593	java/lang/IllegalStateException
      //   227	396	593	java/lang/IllegalStateException
      //   396	400	593	java/lang/IllegalStateException
      //   411	417	593	java/lang/IllegalStateException
      //   420	452	593	java/lang/IllegalStateException
      //   452	476	593	java/lang/IllegalStateException
      //   108	224	618	java/io/IOException
      //   227	396	618	java/io/IOException
      //   396	400	618	java/io/IOException
      //   411	417	618	java/io/IOException
      //   420	452	618	java/io/IOException
      //   452	476	618	java/io/IOException
      //   484	533	643	java/lang/Exception
    }
    
    public static String tm(String paramString)
    {
      GMTrace.i(14812939550720L, 110365);
      paramString = d.tk(paramString);
      if (paramString == null)
      {
        GMTrace.o(14812939550720L, 110365);
        return null;
      }
      paramString = paramString.iZV;
      GMTrace.o(14812939550720L, 110365);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */