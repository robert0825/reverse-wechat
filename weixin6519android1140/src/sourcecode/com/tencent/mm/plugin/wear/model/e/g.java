package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public final class g
  extends a
{
  public g()
  {
    GMTrace.i(9207067705344L, 68598);
    GMTrace.o(9207067705344L, 68598);
  }
  
  public final List<Integer> bBA()
  {
    GMTrace.i(9207201923072L, 68599);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11005));
    localArrayList.add(Integer.valueOf(11006));
    localArrayList.add(Integer.valueOf(11007));
    GMTrace.o(9207201923072L, 68599);
    return localArrayList;
  }
  
  /* Error */
  protected final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 52
    //   3: ldc 54
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: iload_1
    //   9: sipush 11005
    //   12: if_icmpne +159 -> 171
    //   15: new 56	com/tencent/mm/protocal/c/bro
    //   18: dup
    //   19: invokespecial 57	com/tencent/mm/protocal/c/bro:<init>	()V
    //   22: astore_3
    //   23: aload_3
    //   24: aload_2
    //   25: invokevirtual 61	com/tencent/mm/protocal/c/bro:aD	([B)Lcom/tencent/mm/bm/a;
    //   28: pop
    //   29: new 63	com/tencent/mm/protocal/c/brp
    //   32: dup
    //   33: invokespecial 64	com/tencent/mm/protocal/c/brp:<init>	()V
    //   36: astore_2
    //   37: aload_3
    //   38: getfield 68	com/tencent/mm/protocal/c/bro:tRz	Ljava/lang/String;
    //   41: invokestatic 74	com/tencent/mm/plugin/wear/model/h:KW	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   44: astore 4
    //   46: aload 4
    //   48: ifnull +102 -> 150
    //   51: aload_2
    //   52: invokestatic 80	java/lang/System:currentTimeMillis	()J
    //   55: putfield 84	com/tencent/mm/protocal/c/brp:vbl	J
    //   58: aload 4
    //   60: invokestatic 88	com/tencent/mm/plugin/wear/model/h:K	(Landroid/graphics/Bitmap;)[B
    //   63: astore 4
    //   65: ldc 90
    //   67: ldc 92
    //   69: iconst_1
    //   70: anewarray 94	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: aload_3
    //   76: getfield 68	com/tencent/mm/protocal/c/bro:tRz	Ljava/lang/String;
    //   79: aastore
    //   80: invokestatic 99	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: aload_2
    //   84: new 101	com/tencent/mm/bm/b
    //   87: dup
    //   88: aload 4
    //   90: invokespecial 104	com/tencent/mm/bm/b:<init>	([B)V
    //   93: putfield 108	com/tencent/mm/protocal/c/brp:jgP	Lcom/tencent/mm/bm/b;
    //   96: aload_2
    //   97: invokevirtual 112	com/tencent/mm/protocal/c/brp:toByteArray	()[B
    //   100: astore_2
    //   101: ldc2_w 52
    //   104: ldc 54
    //   106: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   109: aload_2
    //   110: areturn
    //   111: astore_2
    //   112: ldc 90
    //   114: aload_2
    //   115: ldc 114
    //   117: iconst_0
    //   118: anewarray 94	java/lang/Object
    //   121: invokestatic 118	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: goto -95 -> 29
    //   127: astore_2
    //   128: ldc 90
    //   130: aload_2
    //   131: ldc 114
    //   133: iconst_0
    //   134: anewarray 94	java/lang/Object
    //   137: invokestatic 118	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: ldc2_w 52
    //   143: ldc 54
    //   145: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   148: aconst_null
    //   149: areturn
    //   150: ldc 90
    //   152: ldc 120
    //   154: iconst_1
    //   155: anewarray 94	java/lang/Object
    //   158: dup
    //   159: iconst_0
    //   160: aload_3
    //   161: getfield 68	com/tencent/mm/protocal/c/bro:tRz	Ljava/lang/String;
    //   164: aastore
    //   165: invokestatic 123	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   168: goto -28 -> 140
    //   171: iload_1
    //   172: sipush 11006
    //   175: if_icmpne +204 -> 379
    //   178: new 125	java/lang/String
    //   181: dup
    //   182: aload_2
    //   183: ldc 127
    //   185: invokespecial 130	java/lang/String:<init>	([BLjava/lang/String;)V
    //   188: astore_2
    //   189: ldc -124
    //   191: invokestatic 138	com/tencent/mm/kernel/h:j	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   194: checkcast 132	com/tencent/mm/plugin/emoji/b/c
    //   197: invokeinterface 142 1 0
    //   202: aload_2
    //   203: invokeinterface 148 2 0
    //   208: astore_2
    //   209: aload_2
    //   210: ifnull -70 -> 140
    //   213: aload_2
    //   214: invokevirtual 154	com/tencent/mm/storage/emotion/EmojiInfo:bJs	()Z
    //   217: ifeq +47 -> 264
    //   220: aload_2
    //   221: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   224: invokevirtual 164	com/tencent/mm/storage/emotion/EmojiInfo:eU	(Landroid/content/Context;)Landroid/graphics/Bitmap;
    //   227: invokestatic 88	com/tencent/mm/plugin/wear/model/h:K	(Landroid/graphics/Bitmap;)[B
    //   230: astore_2
    //   231: ldc2_w 52
    //   234: ldc 54
    //   236: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   239: aload_2
    //   240: areturn
    //   241: astore_2
    //   242: ldc 90
    //   244: aload_2
    //   245: ldc 114
    //   247: iconst_0
    //   248: anewarray 94	java/lang/Object
    //   251: invokestatic 118	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   254: ldc2_w 52
    //   257: ldc 54
    //   259: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   262: aconst_null
    //   263: areturn
    //   264: aload_2
    //   265: getfield 168	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   268: getstatic 173	com/tencent/mm/storage/emotion/EmojiGroupInfo:vCl	I
    //   271: if_icmpne +78 -> 349
    //   274: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   277: aload_2
    //   278: invokevirtual 177	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   281: invokestatic 181	com/tencent/mm/storage/emotion/EmojiInfo:bd	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   284: astore_3
    //   285: aload_3
    //   286: astore_2
    //   287: aload_3
    //   288: invokestatic 187	com/tencent/mm/loader/stub/b:c	(Ljava/io/InputStream;)[B
    //   291: astore 4
    //   293: aload_3
    //   294: invokestatic 193	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   297: ldc2_w 52
    //   300: ldc 54
    //   302: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   305: aload 4
    //   307: areturn
    //   308: astore 4
    //   310: aconst_null
    //   311: astore_3
    //   312: aload_3
    //   313: astore_2
    //   314: ldc 90
    //   316: ldc -61
    //   318: iconst_1
    //   319: anewarray 94	java/lang/Object
    //   322: dup
    //   323: iconst_0
    //   324: aload 4
    //   326: invokestatic 201	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   329: aastore
    //   330: invokestatic 204	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   333: aload_3
    //   334: invokestatic 193	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   337: goto -197 -> 140
    //   340: astore_3
    //   341: aconst_null
    //   342: astore_2
    //   343: aload_2
    //   344: invokestatic 193	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   347: aload_3
    //   348: athrow
    //   349: ldc -124
    //   351: invokestatic 138	com/tencent/mm/kernel/h:j	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   354: checkcast 132	com/tencent/mm/plugin/emoji/b/c
    //   357: invokeinterface 142 1 0
    //   362: aload_2
    //   363: invokeinterface 208 2 0
    //   368: astore_2
    //   369: ldc2_w 52
    //   372: ldc 54
    //   374: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   377: aload_2
    //   378: areturn
    //   379: iload_1
    //   380: sipush 11007
    //   383: if_icmpne -243 -> 140
    //   386: new 210	com/tencent/mm/protocal/c/bsg
    //   389: dup
    //   390: invokespecial 211	com/tencent/mm/protocal/c/bsg:<init>	()V
    //   393: astore_3
    //   394: aload_3
    //   395: aload_2
    //   396: invokevirtual 212	com/tencent/mm/protocal/c/bsg:aD	([B)Lcom/tencent/mm/bm/a;
    //   399: pop
    //   400: invokestatic 218	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   403: pop
    //   404: invokestatic 224	com/tencent/mm/y/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
    //   407: aload_3
    //   408: getfield 227	com/tencent/mm/protocal/c/bsg:vbw	J
    //   411: invokeinterface 233 3 0
    //   416: astore_2
    //   417: aload_3
    //   418: getfield 237	com/tencent/mm/protocal/c/bsg:vbA	Z
    //   421: ifne +84 -> 505
    //   424: invokestatic 243	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
    //   427: aload_2
    //   428: getfield 248	com/tencent/mm/g/b/ce:field_imgPath	Ljava/lang/String;
    //   431: invokevirtual 254	com/tencent/mm/ao/f:ke	(Ljava/lang/String;)Ljava/lang/String;
    //   434: astore_2
    //   435: aload_2
    //   436: invokestatic 258	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   439: ifne -299 -> 140
    //   442: new 260	com/tencent/mm/protocal/c/bsh
    //   445: dup
    //   446: invokespecial 261	com/tencent/mm/protocal/c/bsh:<init>	()V
    //   449: astore_3
    //   450: aload_3
    //   451: invokestatic 80	java/lang/System:currentTimeMillis	()J
    //   454: putfield 262	com/tencent/mm/protocal/c/bsh:vbl	J
    //   457: aload_3
    //   458: new 101	com/tencent/mm/bm/b
    //   461: dup
    //   462: aload_2
    //   463: iconst_0
    //   464: iconst_m1
    //   465: invokestatic 267	com/tencent/mm/modelsfs/FileOp:c	(Ljava/lang/String;II)[B
    //   468: invokespecial 104	com/tencent/mm/bm/b:<init>	([B)V
    //   471: putfield 268	com/tencent/mm/protocal/c/bsh:jgP	Lcom/tencent/mm/bm/b;
    //   474: aload_3
    //   475: invokevirtual 269	com/tencent/mm/protocal/c/bsh:toByteArray	()[B
    //   478: astore_2
    //   479: ldc2_w 52
    //   482: ldc 54
    //   484: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   487: aload_2
    //   488: areturn
    //   489: astore_2
    //   490: ldc 90
    //   492: aload_2
    //   493: ldc 114
    //   495: iconst_0
    //   496: anewarray 94	java/lang/Object
    //   499: invokestatic 118	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   502: goto -102 -> 400
    //   505: new 260	com/tencent/mm/protocal/c/bsh
    //   508: dup
    //   509: invokespecial 261	com/tencent/mm/protocal/c/bsh:<init>	()V
    //   512: astore 5
    //   514: aload 5
    //   516: invokestatic 80	java/lang/System:currentTimeMillis	()J
    //   519: putfield 262	com/tencent/mm/protocal/c/bsh:vbl	J
    //   522: aload_2
    //   523: getfield 272	com/tencent/mm/g/b/ce:field_isSend	I
    //   526: iconst_1
    //   527: if_icmpne +109 -> 636
    //   530: invokestatic 243	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
    //   533: aload_2
    //   534: getfield 275	com/tencent/mm/g/b/ce:field_msgId	J
    //   537: invokevirtual 279	com/tencent/mm/ao/f:aq	(J)Lcom/tencent/mm/ao/d;
    //   540: astore_3
    //   541: invokestatic 243	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
    //   544: invokestatic 243	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
    //   547: aload_3
    //   548: invokevirtual 283	com/tencent/mm/ao/f:d	(Lcom/tencent/mm/ao/d;)Ljava/lang/String;
    //   551: ldc 114
    //   553: ldc 114
    //   555: invokevirtual 287	com/tencent/mm/ao/f:l	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   558: astore_2
    //   559: aload_2
    //   560: invokestatic 290	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
    //   563: ifeq +44 -> 607
    //   566: aload_2
    //   567: invokestatic 258	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   570: ifne -430 -> 140
    //   573: aload 5
    //   575: new 101	com/tencent/mm/bm/b
    //   578: dup
    //   579: aload_2
    //   580: iconst_0
    //   581: iconst_m1
    //   582: invokestatic 267	com/tencent/mm/modelsfs/FileOp:c	(Ljava/lang/String;II)[B
    //   585: invokespecial 104	com/tencent/mm/bm/b:<init>	([B)V
    //   588: putfield 268	com/tencent/mm/protocal/c/bsh:jgP	Lcom/tencent/mm/bm/b;
    //   591: aload 5
    //   593: invokevirtual 269	com/tencent/mm/protocal/c/bsh:toByteArray	()[B
    //   596: astore_2
    //   597: ldc2_w 52
    //   600: ldc 54
    //   602: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   605: aload_2
    //   606: areturn
    //   607: invokestatic 243	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
    //   610: aload_3
    //   611: getfield 295	com/tencent/mm/ao/d:gGS	Ljava/lang/String;
    //   614: ldc 114
    //   616: ldc 114
    //   618: invokevirtual 287	com/tencent/mm/ao/f:l	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   621: astore_3
    //   622: aload_3
    //   623: astore_2
    //   624: aload_3
    //   625: invokestatic 290	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
    //   628: ifne -62 -> 566
    //   631: aconst_null
    //   632: astore_2
    //   633: goto -67 -> 566
    //   636: invokestatic 243	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
    //   639: aload_2
    //   640: getfield 298	com/tencent/mm/g/b/ce:field_msgSvrId	J
    //   643: invokevirtual 301	com/tencent/mm/ao/f:ap	(J)Lcom/tencent/mm/ao/d;
    //   646: astore 4
    //   648: aload 4
    //   650: invokevirtual 304	com/tencent/mm/ao/d:IH	()Z
    //   653: ifeq -22 -> 631
    //   656: aload 4
    //   658: invokevirtual 307	com/tencent/mm/ao/d:II	()Z
    //   661: ifeq +88 -> 749
    //   664: invokestatic 243	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
    //   667: invokestatic 243	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
    //   670: aload 4
    //   672: invokevirtual 283	com/tencent/mm/ao/f:d	(Lcom/tencent/mm/ao/d;)Ljava/lang/String;
    //   675: ldc 114
    //   677: ldc 114
    //   679: invokevirtual 287	com/tencent/mm/ao/f:l	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   682: astore_3
    //   683: aload_3
    //   684: invokestatic 290	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
    //   687: ifeq +62 -> 749
    //   690: aload_3
    //   691: astore_2
    //   692: aload_3
    //   693: invokestatic 258	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   696: ifeq -130 -> 566
    //   699: invokestatic 243	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
    //   702: aload 4
    //   704: getfield 295	com/tencent/mm/ao/d:gGS	Ljava/lang/String;
    //   707: ldc 114
    //   709: ldc 114
    //   711: invokevirtual 287	com/tencent/mm/ao/f:l	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   714: astore 4
    //   716: aload_3
    //   717: astore_2
    //   718: aload 4
    //   720: invokestatic 290	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
    //   723: ifeq -157 -> 566
    //   726: aload 4
    //   728: astore_2
    //   729: goto -163 -> 566
    //   732: astore_2
    //   733: goto -593 -> 140
    //   736: astore_2
    //   737: goto -597 -> 140
    //   740: astore_3
    //   741: goto -398 -> 343
    //   744: astore 4
    //   746: goto -434 -> 312
    //   749: aconst_null
    //   750: astore_3
    //   751: goto -61 -> 690
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	754	0	this	g
    //   0	754	1	paramInt	int
    //   0	754	2	paramArrayOfByte	byte[]
    //   22	312	3	localObject1	Object
    //   340	8	3	localObject2	Object
    //   393	324	3	localObject3	Object
    //   740	1	3	localObject4	Object
    //   750	1	3	localObject5	Object
    //   44	262	4	localObject6	Object
    //   308	17	4	localException1	Exception
    //   646	81	4	localObject7	Object
    //   744	1	4	localException2	Exception
    //   512	80	5	localbsh	com.tencent.mm.protocal.c.bsh
    // Exception table:
    //   from	to	target	type
    //   23	29	111	java/io/IOException
    //   96	101	127	java/io/IOException
    //   178	189	241	java/io/UnsupportedEncodingException
    //   274	285	308	java/lang/Exception
    //   274	285	340	finally
    //   394	400	489	java/io/IOException
    //   474	479	732	java/io/IOException
    //   591	597	736	java/io/IOException
    //   287	293	740	finally
    //   314	333	740	finally
    //   287	293	744	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */