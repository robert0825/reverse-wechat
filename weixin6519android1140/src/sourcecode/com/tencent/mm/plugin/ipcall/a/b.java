package com.tencent.mm.plugin.ipcall.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.if;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;

public final class b
{
  private static c mix;
  
  static
  {
    GMTrace.i(11573594685440L, 86230);
    mix = new c() {};
    GMTrace.o(11573594685440L, 86230);
  }
  
  /* Error */
  public static void aHZ()
  {
    // Byte code:
    //   0: ldc2_w 34
    //   3: ldc 36
    //   5: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: invokestatic 42	com/tencent/mm/y/at:AU	()Z
    //   11: ifne +19 -> 30
    //   14: ldc 44
    //   16: ldc 46
    //   18: invokestatic 52	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: ldc2_w 34
    //   24: ldc 36
    //   26: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   29: return
    //   30: ldc 44
    //   32: ldc 54
    //   34: invokestatic 57	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: invokestatic 63	java/lang/System:currentTimeMillis	()J
    //   40: lstore_1
    //   41: new 65	com/tencent/mm/plugin/ipcall/a/g/b
    //   44: dup
    //   45: invokespecial 66	com/tencent/mm/plugin/ipcall/a/g/b:<init>	()V
    //   48: pop
    //   49: invokestatic 72	com/tencent/mm/plugin/ipcall/a/i:aIu	()Lcom/tencent/mm/plugin/ipcall/a/g/d;
    //   52: invokevirtual 78	com/tencent/mm/plugin/ipcall/a/g/d:aIX	()Ljava/util/ArrayList;
    //   55: astore 8
    //   57: aload 8
    //   59: ifnull +536 -> 595
    //   62: aload 8
    //   64: invokevirtual 84	java/util/ArrayList:size	()I
    //   67: ifle +528 -> 595
    //   70: invokestatic 88	com/tencent/mm/plugin/ipcall/a/g/b:aIW	()Ljava/util/HashMap;
    //   73: astore 7
    //   75: aload 7
    //   77: ifnull +13 -> 90
    //   80: aload 7
    //   82: invokevirtual 91	java/util/HashMap:size	()I
    //   85: istore_0
    //   86: iload_0
    //   87: ifge +12 -> 99
    //   90: ldc2_w 34
    //   93: ldc 36
    //   95: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   98: return
    //   99: invokestatic 72	com/tencent/mm/plugin/ipcall/a/i:aIu	()Lcom/tencent/mm/plugin/ipcall/a/g/d;
    //   102: invokestatic 97	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   105: invokevirtual 100	java/lang/Thread:getId	()J
    //   108: invokevirtual 104	com/tencent/mm/plugin/ipcall/a/g/d:cE	(J)J
    //   111: lstore_3
    //   112: ldc 44
    //   114: ldc 106
    //   116: invokestatic 57	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   119: ldc 44
    //   121: ldc 108
    //   123: iconst_1
    //   124: anewarray 4	java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: aload 8
    //   131: invokevirtual 84	java/util/ArrayList:size	()I
    //   134: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   137: aastore
    //   138: invokestatic 117	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: aload 8
    //   143: invokevirtual 121	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   146: astore 8
    //   148: aload 8
    //   150: invokeinterface 126 1 0
    //   155: ifeq +251 -> 406
    //   158: aload 8
    //   160: invokeinterface 130 1 0
    //   165: checkcast 132	com/tencent/mm/plugin/ipcall/a/g/c
    //   168: astore 9
    //   170: aload 7
    //   172: aload 9
    //   174: getfield 136	com/tencent/mm/plugin/ipcall/a/g/c:field_contactId	Ljava/lang/String;
    //   177: invokevirtual 140	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   180: ifne -32 -> 148
    //   183: aload 9
    //   185: getfield 144	com/tencent/mm/plugin/ipcall/a/g/c:vmr	J
    //   188: lstore 5
    //   190: invokestatic 72	com/tencent/mm/plugin/ipcall/a/i:aIu	()Lcom/tencent/mm/plugin/ipcall/a/g/d;
    //   193: lload 5
    //   195: invokevirtual 148	com/tencent/mm/plugin/ipcall/a/g/d:delete	(J)Z
    //   198: pop
    //   199: ldc 44
    //   201: ldc -106
    //   203: iconst_1
    //   204: anewarray 4	java/lang/Object
    //   207: dup
    //   208: iconst_0
    //   209: lload 5
    //   211: invokestatic 155	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   214: aastore
    //   215: invokestatic 117	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: invokestatic 159	com/tencent/mm/plugin/ipcall/a/i:aIv	()Lcom/tencent/mm/plugin/ipcall/a/g/l;
    //   221: lload 5
    //   223: invokevirtual 165	com/tencent/mm/plugin/ipcall/a/g/l:cG	(J)Landroid/database/Cursor;
    //   226: astore 9
    //   228: aload 9
    //   230: ifnull +144 -> 374
    //   233: aload 9
    //   235: invokeinterface 170 1 0
    //   240: ifeq +134 -> 374
    //   243: aload 9
    //   245: invokeinterface 173 1 0
    //   250: ifne +124 -> 374
    //   253: new 175	com/tencent/mm/plugin/ipcall/a/g/k
    //   256: dup
    //   257: invokespecial 176	com/tencent/mm/plugin/ipcall/a/g/k:<init>	()V
    //   260: astore 10
    //   262: aload 10
    //   264: aload 9
    //   266: invokevirtual 180	com/tencent/mm/plugin/ipcall/a/g/k:b	(Landroid/database/Cursor;)V
    //   269: aload 10
    //   271: ldc2_w 181
    //   274: putfield 185	com/tencent/mm/plugin/ipcall/a/g/k:field_addressId	J
    //   277: aload 10
    //   279: iconst_m1
    //   280: putfield 189	com/tencent/mm/plugin/ipcall/a/g/k:field_phoneType	I
    //   283: invokestatic 159	com/tencent/mm/plugin/ipcall/a/i:aIv	()Lcom/tencent/mm/plugin/ipcall/a/g/l;
    //   286: aload 10
    //   288: invokevirtual 193	com/tencent/mm/plugin/ipcall/a/g/l:a	(Lcom/tencent/mm/plugin/ipcall/a/g/k;)V
    //   291: aload 9
    //   293: invokeinterface 196 1 0
    //   298: pop
    //   299: goto -56 -> 243
    //   302: astore 10
    //   304: ldc 44
    //   306: ldc -58
    //   308: iconst_1
    //   309: anewarray 4	java/lang/Object
    //   312: dup
    //   313: iconst_0
    //   314: aload 10
    //   316: invokevirtual 202	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   319: aastore
    //   320: invokestatic 204	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   323: aload 9
    //   325: ifnull -177 -> 148
    //   328: aload 9
    //   330: invokeinterface 207 1 0
    //   335: goto -187 -> 148
    //   338: astore 7
    //   340: ldc 44
    //   342: new 209	java/lang/StringBuilder
    //   345: dup
    //   346: ldc -45
    //   348: invokespecial 214	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   351: aload 7
    //   353: invokevirtual 202	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   356: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   362: invokestatic 52	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   365: ldc2_w 34
    //   368: ldc 36
    //   370: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   373: return
    //   374: aload 9
    //   376: ifnull -228 -> 148
    //   379: aload 9
    //   381: invokeinterface 207 1 0
    //   386: goto -238 -> 148
    //   389: astore 7
    //   391: aload 9
    //   393: ifnull +10 -> 403
    //   396: aload 9
    //   398: invokeinterface 207 1 0
    //   403: aload 7
    //   405: athrow
    //   406: ldc 44
    //   408: ldc -33
    //   410: invokestatic 57	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   413: aload 7
    //   415: invokevirtual 227	java/util/HashMap:values	()Ljava/util/Collection;
    //   418: invokeinterface 230 1 0
    //   423: astore 7
    //   425: aload 7
    //   427: invokeinterface 126 1 0
    //   432: ifeq +133 -> 565
    //   435: aload 7
    //   437: invokeinterface 130 1 0
    //   442: checkcast 132	com/tencent/mm/plugin/ipcall/a/g/c
    //   445: astore 8
    //   447: invokestatic 72	com/tencent/mm/plugin/ipcall/a/i:aIu	()Lcom/tencent/mm/plugin/ipcall/a/g/d;
    //   450: aload 8
    //   452: getfield 136	com/tencent/mm/plugin/ipcall/a/g/c:field_contactId	Ljava/lang/String;
    //   455: invokevirtual 234	com/tencent/mm/plugin/ipcall/a/g/d:Ak	(Ljava/lang/String;)Lcom/tencent/mm/plugin/ipcall/a/g/c;
    //   458: astore 9
    //   460: aload 9
    //   462: ifnull +91 -> 553
    //   465: aload 9
    //   467: getfield 144	com/tencent/mm/plugin/ipcall/a/g/c:vmr	J
    //   470: ldc2_w 181
    //   473: lcmp
    //   474: ifeq +79 -> 553
    //   477: aload 8
    //   479: ifnull +125 -> 604
    //   482: aload 9
    //   484: getfield 136	com/tencent/mm/plugin/ipcall/a/g/c:field_contactId	Ljava/lang/String;
    //   487: aload 8
    //   489: getfield 136	com/tencent/mm/plugin/ipcall/a/g/c:field_contactId	Ljava/lang/String;
    //   492: invokestatic 238	com/tencent/mm/plugin/ipcall/a/g/c:cD	(Ljava/lang/String;Ljava/lang/String;)Z
    //   495: ifeq +109 -> 604
    //   498: aload 9
    //   500: getfield 241	com/tencent/mm/plugin/ipcall/a/g/c:field_systemAddressBookUsername	Ljava/lang/String;
    //   503: aload 8
    //   505: getfield 241	com/tencent/mm/plugin/ipcall/a/g/c:field_systemAddressBookUsername	Ljava/lang/String;
    //   508: invokestatic 238	com/tencent/mm/plugin/ipcall/a/g/c:cD	(Ljava/lang/String;Ljava/lang/String;)Z
    //   511: ifeq +93 -> 604
    //   514: aload 9
    //   516: getfield 244	com/tencent/mm/plugin/ipcall/a/g/c:field_wechatUsername	Ljava/lang/String;
    //   519: aload 8
    //   521: getfield 244	com/tencent/mm/plugin/ipcall/a/g/c:field_wechatUsername	Ljava/lang/String;
    //   524: invokestatic 238	com/tencent/mm/plugin/ipcall/a/g/c:cD	(Ljava/lang/String;Ljava/lang/String;)Z
    //   527: ifeq +77 -> 604
    //   530: iconst_1
    //   531: istore_0
    //   532: iload_0
    //   533: ifne -108 -> 425
    //   536: invokestatic 72	com/tencent/mm/plugin/ipcall/a/i:aIu	()Lcom/tencent/mm/plugin/ipcall/a/g/d;
    //   539: aload 9
    //   541: getfield 144	com/tencent/mm/plugin/ipcall/a/g/c:vmr	J
    //   544: aload 8
    //   546: invokevirtual 247	com/tencent/mm/plugin/ipcall/a/g/d:a	(JLcom/tencent/mm/sdk/e/c;)Z
    //   549: pop
    //   550: goto -125 -> 425
    //   553: invokestatic 72	com/tencent/mm/plugin/ipcall/a/i:aIu	()Lcom/tencent/mm/plugin/ipcall/a/g/d;
    //   556: aload 8
    //   558: invokevirtual 250	com/tencent/mm/plugin/ipcall/a/g/d:b	(Lcom/tencent/mm/sdk/e/c;)Z
    //   561: pop
    //   562: goto -137 -> 425
    //   565: invokestatic 72	com/tencent/mm/plugin/ipcall/a/i:aIu	()Lcom/tencent/mm/plugin/ipcall/a/g/d;
    //   568: lload_3
    //   569: invokevirtual 254	com/tencent/mm/plugin/ipcall/a/g/d:cF	(J)V
    //   572: ldc 44
    //   574: ldc_w 256
    //   577: iconst_1
    //   578: anewarray 4	java/lang/Object
    //   581: dup
    //   582: iconst_0
    //   583: invokestatic 63	java/lang/System:currentTimeMillis	()J
    //   586: lload_1
    //   587: lsub
    //   588: invokestatic 155	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   591: aastore
    //   592: invokestatic 117	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   595: ldc2_w 34
    //   598: ldc 36
    //   600: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   603: return
    //   604: iconst_0
    //   605: istore_0
    //   606: goto -74 -> 532
    // Local variable table:
    //   start	length	slot	name	signature
    //   85	521	0	i	int
    //   40	547	1	l1	long
    //   111	458	3	l2	long
    //   188	34	5	l3	long
    //   73	98	7	localHashMap	java.util.HashMap
    //   338	14	7	localException1	Exception
    //   389	25	7	localObject1	Object
    //   423	13	7	localIterator	java.util.Iterator
    //   55	502	8	localObject2	Object
    //   168	372	9	localObject3	Object
    //   260	27	10	localk	com.tencent.mm.plugin.ipcall.a.g.k
    //   302	13	10	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   233	243	302	java/lang/Exception
    //   243	299	302	java/lang/Exception
    //   8	21	338	java/lang/Exception
    //   30	57	338	java/lang/Exception
    //   62	75	338	java/lang/Exception
    //   80	86	338	java/lang/Exception
    //   99	148	338	java/lang/Exception
    //   148	228	338	java/lang/Exception
    //   328	335	338	java/lang/Exception
    //   379	386	338	java/lang/Exception
    //   396	403	338	java/lang/Exception
    //   403	406	338	java/lang/Exception
    //   406	425	338	java/lang/Exception
    //   425	460	338	java/lang/Exception
    //   465	477	338	java/lang/Exception
    //   482	530	338	java/lang/Exception
    //   536	550	338	java/lang/Exception
    //   553	562	338	java/lang/Exception
    //   565	595	338	java/lang/Exception
    //   233	243	389	finally
    //   243	299	389	finally
    //   304	323	389	finally
  }
  
  public static void init()
  {
    GMTrace.i(11573192032256L, 86227);
    a.vgX.b(mix);
    GMTrace.o(11573192032256L, 86227);
  }
  
  public static void release()
  {
    GMTrace.i(11573326249984L, 86228);
    a.vgX.c(mix);
    GMTrace.o(11573326249984L, 86228);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */