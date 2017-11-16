package com.tencent.mm.plugin.favorite.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.plugin.favorite.b.ah;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.protocal.c.aox;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public final class a
{
  private static void A(j paramj)
  {
    GMTrace.i(6477884424192L, 48264);
    x.cj(paramj.field_localId);
    if (paramj.field_favProto.ulB.size() > 0)
    {
      e.post(new a(paramj), "AddFavService_copy");
      GMTrace.o(6477884424192L, 48264);
      return;
    }
    paramj.field_itemStatus = 9;
    if (!x.v(paramj)) {
      com.tencent.mm.plugin.favorite.h.axB().c(paramj);
    }
    for (;;)
    {
      com.tencent.mm.plugin.favorite.h.axr().run();
      GMTrace.o(6477884424192L, 48264);
      return;
      com.tencent.mm.plugin.favorite.h.axB().a(paramj, new String[0]);
    }
  }
  
  public static int a(cf paramcf)
  {
    GMTrace.i(6477615988736L, 48262);
    j localj1 = new j();
    localj1.field_favProto = paramcf.eDv.eDx;
    localj1.field_sessionId = paramcf.eDv.eDA;
    tw localtw = localj1.field_favProto.ulz;
    if (localtw != null)
    {
      localj1.field_sourceId = localtw.ulI;
      if ((localj1.field_sourceId == null) || (localj1.field_sourceId.equals("")))
      {
        i = 0;
        if (i == 0) {
          break label267;
        }
        w.w("MicroMsg.AddFavService", "handleEvent, msg already exist, do not insert");
      }
    }
    for (int i = 0;; i = 1)
    {
      if (i != 0) {
        break label354;
      }
      paramcf = com.tencent.mm.plugin.favorite.h.axB().xJ(localj1.field_sourceId);
      if (paramcf != null) {
        x.cs(paramcf.field_localId);
      }
      GMTrace.o(6477615988736L, 48262);
      return 0;
      j localj2 = com.tencent.mm.plugin.favorite.h.axB().xJ(localj1.field_sourceId);
      if ((localj2 != null) && (localj2.field_id > 0))
      {
        i = localj2.field_id;
        if (i > 0) {
          break label191;
        }
        w.e("MicroMsg.ModFavItemLogic", "modUpdateTime favId illegal:%d", new Object[] { Integer.valueOf(i) });
      }
      for (;;)
      {
        if (localj2 == null) {
          break label262;
        }
        i = 1;
        break;
        label191:
        Object localObject = new LinkedList();
        aox localaox = new aox();
        localaox.uEL = 1;
        localaox.uEM = ((int)(System.currentTimeMillis() / 1000L));
        ((LinkedList)localObject).add(localaox);
        localObject = new ah(i, (LinkedList)localObject, null);
        at.wS().a((com.tencent.mm.ad.k)localObject, 0);
      }
      label262:
      i = 0;
      break;
      label267:
      localj1.field_fromUser = localtw.eMI;
      localj1.field_toUser = localtw.toUser;
      localj1.field_sourceType = localtw.eDi;
      localj1.field_sourceId = localtw.ulI;
      localj1.field_sourceCreateTime = localtw.hcs;
      w.i("MicroMsg.AddFavService", "deal with source item, fromUser is %s, toUser %s, sourceId %s, sourceType %d", new Object[] { localj1.field_fromUser, localj1.field_toUser, localj1.field_sourceId, Integer.valueOf(localj1.field_sourceType) });
    }
    label354:
    localj1.field_flag = 0;
    localj1.field_updateTime = System.currentTimeMillis();
    localj1.field_localId = System.currentTimeMillis();
    x.cs(localj1.field_localId);
    localj1.field_type = paramcf.eDv.type;
    if ((paramcf.eDv.desc != null) && (paramcf.eDv.desc.length() >= 10001))
    {
      w.w("MicroMsg.AddFavService", "length more than 10000, do cut desc");
      localj1.field_favProto.QX(paramcf.eDv.desc.substring(0, 10001));
    }
    for (;;)
    {
      localj1.field_xml = j.b(localj1);
      A(localj1);
      x.r(localj1);
      localj1.xG("MicroMsg.AddFavService");
      GMTrace.o(6477615988736L, 48262);
      return 0;
      localj1.field_favProto.QX(paramcf.eDv.desc);
    }
  }
  
  public static void z(j paramj)
  {
    GMTrace.i(6477750206464L, 48263);
    paramj.field_updateTime = System.currentTimeMillis();
    if (!x.v(paramj)) {
      paramj.field_localId = System.currentTimeMillis();
    }
    A(paramj);
    x.r(paramj);
    GMTrace.o(6477750206464L, 48263);
  }
  
  private static final class a
    implements Runnable
  {
    public j lcn;
    
    public a(j paramj)
    {
      GMTrace.i(6497345994752L, 48409);
      this.lcn = paramj;
      GMTrace.o(6497345994752L, 48409);
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: ldc2_w 39
      //   3: ldc 41
      //   5: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_0
      //   9: getfield 29	com/tencent/mm/plugin/favorite/c/a$a:lcn	Lcom/tencent/mm/plugin/favorite/b/j;
      //   12: getfield 47	com/tencent/mm/plugin/favorite/b/j:field_favProto	Lcom/tencent/mm/protocal/c/tt;
      //   15: getfield 53	com/tencent/mm/protocal/c/tt:ulB	Ljava/util/LinkedList;
      //   18: astore 13
      //   20: aload 13
      //   22: invokeinterface 59 1 0
      //   27: ifle +872 -> 899
      //   30: iconst_0
      //   31: istore 4
      //   33: iconst_0
      //   34: istore_3
      //   35: aload 13
      //   37: invokeinterface 59 1 0
      //   42: istore_2
      //   43: ldc 61
      //   45: ldc 63
      //   47: iconst_1
      //   48: anewarray 4	java/lang/Object
      //   51: dup
      //   52: iconst_0
      //   53: aload_0
      //   54: getfield 29	com/tencent/mm/plugin/favorite/c/a$a:lcn	Lcom/tencent/mm/plugin/favorite/b/j;
      //   57: getfield 67	com/tencent/mm/plugin/favorite/b/j:field_type	I
      //   60: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   63: aastore
      //   64: invokestatic 78	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   67: aload_0
      //   68: getfield 29	com/tencent/mm/plugin/favorite/c/a$a:lcn	Lcom/tencent/mm/plugin/favorite/b/j;
      //   71: getfield 67	com/tencent/mm/plugin/favorite/b/j:field_type	I
      //   74: bipush 18
      //   76: if_icmpne +63 -> 139
      //   79: aload_0
      //   80: getfield 29	com/tencent/mm/plugin/favorite/c/a$a:lcn	Lcom/tencent/mm/plugin/favorite/b/j;
      //   83: getfield 81	com/tencent/mm/plugin/favorite/b/j:field_sourceType	I
      //   86: bipush 6
      //   88: if_icmpne +51 -> 139
      //   91: iconst_0
      //   92: istore_1
      //   93: iload_3
      //   94: istore 4
      //   96: iload_1
      //   97: iload_2
      //   98: if_icmpge +788 -> 886
      //   101: aload 13
      //   103: iload_1
      //   104: invokeinterface 85 2 0
      //   109: checkcast 87	com/tencent/mm/protocal/c/th
      //   112: astore 9
      //   114: aload 9
      //   116: getfield 91	com/tencent/mm/protocal/c/th:ukf	Z
      //   119: ifeq +11 -> 130
      //   122: aload 9
      //   124: getfield 94	com/tencent/mm/protocal/c/th:ukh	Z
      //   127: ifne +801 -> 928
      //   130: iconst_1
      //   131: istore_3
      //   132: iload_1
      //   133: iconst_1
      //   134: iadd
      //   135: istore_1
      //   136: goto -43 -> 93
      //   139: iconst_0
      //   140: istore_1
      //   141: iload 4
      //   143: istore_3
      //   144: iload_3
      //   145: istore 4
      //   147: iload_1
      //   148: iload_2
      //   149: if_icmpge +737 -> 886
      //   152: aload 13
      //   154: iload_1
      //   155: invokeinterface 85 2 0
      //   160: checkcast 87	com/tencent/mm/protocal/c/th
      //   163: astore 14
      //   165: aload 14
      //   167: getfield 98	com/tencent/mm/protocal/c/th:lhq	Ljava/lang/String;
      //   170: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   173: ifeq +24 -> 197
      //   176: aload 14
      //   178: aload 14
      //   180: invokevirtual 108	java/lang/Object:toString	()Ljava/lang/String;
      //   183: aload_0
      //   184: getfield 29	com/tencent/mm/plugin/favorite/c/a$a:lcn	Lcom/tencent/mm/plugin/favorite/b/j;
      //   187: getfield 67	com/tencent/mm/plugin/favorite/b/j:field_type	I
      //   190: invokestatic 114	com/tencent/mm/plugin/favorite/b/x:aX	(Ljava/lang/String;I)Ljava/lang/String;
      //   193: invokevirtual 118	com/tencent/mm/protocal/c/th:Qt	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/th;
      //   196: pop
      //   197: aload 14
      //   199: getfield 91	com/tencent/mm/protocal/c/th:ukf	Z
      //   202: ifeq +11 -> 213
      //   205: aload 14
      //   207: getfield 94	com/tencent/mm/protocal/c/th:ukh	Z
      //   210: ifne +5 -> 215
      //   213: iconst_1
      //   214: istore_3
      //   215: invokestatic 124	java/lang/System:currentTimeMillis	()J
      //   218: lstore 5
      //   220: aload 14
      //   222: getfield 127	com/tencent/mm/protocal/c/th:ujR	Ljava/lang/String;
      //   225: astore 15
      //   227: aload 15
      //   229: invokestatic 132	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
      //   232: ifeq +470 -> 702
      //   235: aload 15
      //   237: invokestatic 138	com/tencent/mm/a/g:bg	(Ljava/lang/String;)Ljava/lang/String;
      //   240: astore 9
      //   242: aload 15
      //   244: invokestatic 141	com/tencent/mm/a/g:bh	(Ljava/lang/String;)Ljava/lang/String;
      //   247: astore 10
      //   249: aload 14
      //   251: aload 9
      //   253: invokevirtual 144	com/tencent/mm/protocal/c/th:Qr	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/th;
      //   256: pop
      //   257: aload 14
      //   259: aload 10
      //   261: invokevirtual 147	com/tencent/mm/protocal/c/th:Qs	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/th;
      //   264: pop
      //   265: aload 14
      //   267: new 149	java/io/File
      //   270: dup
      //   271: aload 15
      //   273: invokespecial 152	java/io/File:<init>	(Ljava/lang/String;)V
      //   276: invokevirtual 155	java/io/File:length	()J
      //   279: invokevirtual 159	com/tencent/mm/protocal/c/th:ey	(J)Lcom/tencent/mm/protocal/c/th;
      //   282: pop
      //   283: aload 14
      //   285: invokestatic 163	com/tencent/mm/plugin/favorite/b/x:g	(Lcom/tencent/mm/protocal/c/th;)Ljava/lang/String;
      //   288: astore 9
      //   290: aload 15
      //   292: aload 9
      //   294: invokevirtual 169	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   297: ifne +11 -> 308
      //   300: aload 15
      //   302: aload 9
      //   304: invokestatic 172	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
      //   307: pop2
      //   308: aload 14
      //   310: getfield 175	com/tencent/mm/protocal/c/th:ujT	Ljava/lang/String;
      //   313: astore 9
      //   315: aload 9
      //   317: astore 11
      //   319: aload 9
      //   321: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   324: ifeq +175 -> 499
      //   327: aload 9
      //   329: astore 11
      //   331: aload 15
      //   333: invokestatic 132	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
      //   336: ifeq +163 -> 499
      //   339: aload 9
      //   341: astore 11
      //   343: aload_0
      //   344: getfield 29	com/tencent/mm/plugin/favorite/c/a$a:lcn	Lcom/tencent/mm/plugin/favorite/b/j;
      //   347: getfield 67	com/tencent/mm/plugin/favorite/b/j:field_type	I
      //   350: iconst_4
      //   351: if_icmpne +148 -> 499
      //   354: aload 9
      //   356: astore 11
      //   358: aload_0
      //   359: getfield 29	com/tencent/mm/plugin/favorite/c/a$a:lcn	Lcom/tencent/mm/plugin/favorite/b/j;
      //   362: getfield 47	com/tencent/mm/plugin/favorite/b/j:field_favProto	Lcom/tencent/mm/protocal/c/tt;
      //   365: getfield 179	com/tencent/mm/protocal/c/tt:ulz	Lcom/tencent/mm/protocal/c/tw;
      //   368: getfield 184	com/tencent/mm/protocal/c/tw:eDi	I
      //   371: bipush 13
      //   373: if_icmpne +126 -> 499
      //   376: new 186	java/lang/StringBuilder
      //   379: dup
      //   380: invokespecial 187	java/lang/StringBuilder:<init>	()V
      //   383: aload 14
      //   385: invokestatic 163	com/tencent/mm/plugin/favorite/b/x:g	(Lcom/tencent/mm/protocal/c/th;)Ljava/lang/String;
      //   388: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   391: ldc -63
      //   393: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   396: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   399: astore 12
      //   401: aload 15
      //   403: invokestatic 200	com/tencent/mm/pluginsdk/model/c:Oi	(Ljava/lang/String;)Landroid/graphics/Bitmap;
      //   406: astore 9
      //   408: aload 9
      //   410: ifnull +20 -> 430
      //   413: ldc 61
      //   415: ldc -54
      //   417: invokestatic 205	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   420: aload 9
      //   422: getstatic 211	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
      //   425: aload 12
      //   427: invokestatic 216	com/tencent/mm/pluginsdk/l/e:a	(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;)V
      //   430: aload 14
      //   432: aload 12
      //   434: invokevirtual 219	com/tencent/mm/protocal/c/th:Qv	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/th;
      //   437: pop
      //   438: ldc 61
      //   440: ldc -35
      //   442: invokestatic 205	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   445: new 223	android/media/MediaMetadataRetriever
      //   448: dup
      //   449: invokespecial 224	android/media/MediaMetadataRetriever:<init>	()V
      //   452: astore 10
      //   454: aload 10
      //   456: astore 9
      //   458: aload 10
      //   460: aload 15
      //   462: invokevirtual 227	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
      //   465: aload 10
      //   467: astore 9
      //   469: aload 14
      //   471: aload 10
      //   473: bipush 9
      //   475: invokevirtual 231	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
      //   478: iconst_0
      //   479: invokestatic 235	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
      //   482: i2l
      //   483: invokestatic 239	com/tencent/mm/sdk/platformtools/bg:eN	(J)I
      //   486: invokevirtual 243	com/tencent/mm/protocal/c/th:zQ	(I)Lcom/tencent/mm/protocal/c/th;
      //   489: pop
      //   490: aload 10
      //   492: invokevirtual 246	android/media/MediaMetadataRetriever:release	()V
      //   495: aload 12
      //   497: astore 11
      //   499: aload 11
      //   501: invokestatic 132	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
      //   504: ifeq +362 -> 866
      //   507: aconst_null
      //   508: astore 10
      //   510: aconst_null
      //   511: astore 9
      //   513: aload 11
      //   515: invokestatic 250	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
      //   518: astore 12
      //   520: aload 12
      //   522: astore 9
      //   524: aload 12
      //   526: astore 10
      //   528: aload 12
      //   530: sipush 4096
      //   533: invokestatic 253	com/tencent/mm/a/g:a	(Ljava/io/InputStream;I)Ljava/lang/String;
      //   536: invokestatic 256	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
      //   539: astore 15
      //   541: aload 12
      //   543: astore 9
      //   545: aload 12
      //   547: astore 10
      //   549: aload 11
      //   551: invokestatic 260	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
      //   554: lstore 7
      //   556: aload 12
      //   558: astore 9
      //   560: aload 12
      //   562: astore 10
      //   564: aload 12
      //   566: iconst_0
      //   567: sipush 256
      //   570: invokestatic 263	com/tencent/mm/a/g:a	(Ljava/io/InputStream;II)Ljava/lang/String;
      //   573: astore 16
      //   575: aload 12
      //   577: astore 9
      //   579: aload 12
      //   581: astore 10
      //   583: aload 14
      //   585: aload 15
      //   587: invokevirtual 266	com/tencent/mm/protocal/c/th:Qw	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/th;
      //   590: pop
      //   591: aload 12
      //   593: astore 9
      //   595: aload 12
      //   597: astore 10
      //   599: aload 14
      //   601: aload 16
      //   603: invokevirtual 269	com/tencent/mm/protocal/c/th:Qx	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/th;
      //   606: pop
      //   607: aload 12
      //   609: astore 9
      //   611: aload 12
      //   613: astore 10
      //   615: aload 14
      //   617: lload 7
      //   619: invokevirtual 272	com/tencent/mm/protocal/c/th:ez	(J)Lcom/tencent/mm/protocal/c/th;
      //   622: pop
      //   623: aload 12
      //   625: ifnull +8 -> 633
      //   628: aload 12
      //   630: invokevirtual 277	java/io/InputStream:close	()V
      //   633: aload 14
      //   635: invokestatic 280	com/tencent/mm/plugin/favorite/b/x:h	(Lcom/tencent/mm/protocal/c/th;)Ljava/lang/String;
      //   638: astore 9
      //   640: aload 11
      //   642: aload 9
      //   644: invokevirtual 169	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   647: ifne +11 -> 658
      //   650: aload 11
      //   652: aload 9
      //   654: invokestatic 172	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
      //   657: pop2
      //   658: ldc 61
      //   660: ldc_w 282
      //   663: iconst_2
      //   664: anewarray 4	java/lang/Object
      //   667: dup
      //   668: iconst_0
      //   669: aload_0
      //   670: getfield 29	com/tencent/mm/plugin/favorite/c/a$a:lcn	Lcom/tencent/mm/plugin/favorite/b/j;
      //   673: getfield 286	com/tencent/mm/plugin/favorite/b/j:field_localId	J
      //   676: invokestatic 291	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   679: aastore
      //   680: dup
      //   681: iconst_1
      //   682: invokestatic 124	java/lang/System:currentTimeMillis	()J
      //   685: lload 5
      //   687: lsub
      //   688: invokestatic 291	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   691: aastore
      //   692: invokestatic 294	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   695: iload_1
      //   696: iconst_1
      //   697: iadd
      //   698: istore_1
      //   699: goto -555 -> 144
      //   702: ldc 61
      //   704: ldc_w 296
      //   707: iconst_2
      //   708: anewarray 4	java/lang/Object
      //   711: dup
      //   712: iconst_0
      //   713: aload 14
      //   715: getfield 299	com/tencent/mm/protocal/c/th:aGU	I
      //   718: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   721: aastore
      //   722: dup
      //   723: iconst_1
      //   724: aload 15
      //   726: aastore
      //   727: invokestatic 78	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   730: goto -422 -> 308
      //   733: astore 9
      //   735: ldc 61
      //   737: aload 9
      //   739: ldc_w 301
      //   742: iconst_0
      //   743: anewarray 4	java/lang/Object
      //   746: invokestatic 305	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   749: goto -319 -> 430
      //   752: astore 11
      //   754: aconst_null
      //   755: astore 10
      //   757: aload 10
      //   759: astore 9
      //   761: ldc 61
      //   763: aload 11
      //   765: ldc_w 307
      //   768: iconst_1
      //   769: anewarray 4	java/lang/Object
      //   772: dup
      //   773: iconst_0
      //   774: aload 15
      //   776: aastore
      //   777: invokestatic 305	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   780: aload 12
      //   782: astore 11
      //   784: aload 10
      //   786: ifnull -287 -> 499
      //   789: aload 10
      //   791: invokevirtual 246	android/media/MediaMetadataRetriever:release	()V
      //   794: aload 12
      //   796: astore 11
      //   798: goto -299 -> 499
      //   801: astore 10
      //   803: aconst_null
      //   804: astore 9
      //   806: aload 9
      //   808: ifnull +8 -> 816
      //   811: aload 9
      //   813: invokevirtual 246	android/media/MediaMetadataRetriever:release	()V
      //   816: aload 10
      //   818: athrow
      //   819: astore 10
      //   821: aload 9
      //   823: astore 10
      //   825: ldc 61
      //   827: ldc_w 309
      //   830: invokestatic 312	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   833: aload 9
      //   835: ifnull -202 -> 633
      //   838: aload 9
      //   840: invokevirtual 277	java/io/InputStream:close	()V
      //   843: goto -210 -> 633
      //   846: astore 9
      //   848: goto -215 -> 633
      //   851: astore 9
      //   853: aload 10
      //   855: ifnull +8 -> 863
      //   858: aload 10
      //   860: invokevirtual 277	java/io/InputStream:close	()V
      //   863: aload 9
      //   865: athrow
      //   866: ldc 61
      //   868: ldc_w 314
      //   871: iconst_1
      //   872: anewarray 4	java/lang/Object
      //   875: dup
      //   876: iconst_0
      //   877: aload 11
      //   879: aastore
      //   880: invokestatic 78	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   883: goto -225 -> 658
      //   886: new 11	com/tencent/mm/plugin/favorite/c/a$a$1
      //   889: dup
      //   890: aload_0
      //   891: iload 4
      //   893: invokespecial 317	com/tencent/mm/plugin/favorite/c/a$a$1:<init>	(Lcom/tencent/mm/plugin/favorite/c/a$a;Z)V
      //   896: invokestatic 323	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
      //   899: ldc2_w 39
      //   902: ldc 41
      //   904: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   907: return
      //   908: astore 9
      //   910: goto -277 -> 633
      //   913: astore 10
      //   915: goto -52 -> 863
      //   918: astore 10
      //   920: goto -114 -> 806
      //   923: astore 11
      //   925: goto -168 -> 757
      //   928: goto -796 -> 132
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	931	0	this	a
      //   92	607	1	i	int
      //   42	108	2	j	int
      //   34	181	3	bool1	boolean
      //   31	861	4	bool2	boolean
      //   218	468	5	l1	long
      //   554	64	7	l2	long
      //   112	541	9	localObject1	Object
      //   733	5	9	localException1	Exception
      //   759	80	9	localObject2	Object
      //   846	1	9	localException2	Exception
      //   851	13	9	localObject3	Object
      //   908	1	9	localException3	Exception
      //   247	543	10	localObject4	Object
      //   801	16	10	localObject5	Object
      //   819	1	10	localFileNotFoundException	java.io.FileNotFoundException
      //   823	36	10	localObject6	Object
      //   913	1	10	localException4	Exception
      //   918	1	10	localObject7	Object
      //   317	334	11	localObject8	Object
      //   752	12	11	localException5	Exception
      //   782	96	11	localObject9	Object
      //   923	1	11	localException6	Exception
      //   399	396	12	localObject10	Object
      //   18	135	13	localLinkedList	LinkedList
      //   163	551	14	localth	com.tencent.mm.protocal.c.th
      //   225	550	15	str1	String
      //   573	29	16	str2	String
      // Exception table:
      //   from	to	target	type
      //   413	430	733	java/lang/Exception
      //   438	454	752	java/lang/Exception
      //   438	454	801	finally
      //   513	520	819	java/io/FileNotFoundException
      //   528	541	819	java/io/FileNotFoundException
      //   549	556	819	java/io/FileNotFoundException
      //   564	575	819	java/io/FileNotFoundException
      //   583	591	819	java/io/FileNotFoundException
      //   599	607	819	java/io/FileNotFoundException
      //   615	623	819	java/io/FileNotFoundException
      //   838	843	846	java/lang/Exception
      //   513	520	851	finally
      //   528	541	851	finally
      //   549	556	851	finally
      //   564	575	851	finally
      //   583	591	851	finally
      //   599	607	851	finally
      //   615	623	851	finally
      //   825	833	851	finally
      //   628	633	908	java/lang/Exception
      //   858	863	913	java/lang/Exception
      //   458	465	918	finally
      //   469	490	918	finally
      //   761	780	918	finally
      //   458	465	923	java/lang/Exception
      //   469	490	923	java/lang/Exception
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */