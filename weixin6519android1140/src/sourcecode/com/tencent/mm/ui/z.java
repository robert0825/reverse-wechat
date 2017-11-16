package com.tencent.mm.ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;

public final class z
{
  private static z vNN;
  private long timestamp;
  int vNO;
  private SparseIntArray vNP;
  private SparseArray<aa.b> vNQ;
  private ArrayList<Integer> vNR;
  public SparseArray<aa.c> vNS;
  private boolean vNT;
  
  static
  {
    GMTrace.i(2083193356288L, 15521);
    vNN = null;
    GMTrace.o(2083193356288L, 15521);
  }
  
  public z()
  {
    GMTrace.i(2082522267648L, 15516);
    this.vNO = 0;
    this.vNP = new SparseIntArray();
    this.vNQ = new SparseArray();
    this.vNR = new ArrayList();
    this.vNS = new SparseArray();
    this.timestamp = 0L;
    this.vNT = false;
    GMTrace.o(2082522267648L, 15516);
  }
  
  public static z bYh()
  {
    GMTrace.i(2082656485376L, 15517);
    if (vNN == null) {
      vNN = new z();
    }
    z localz = vNN;
    GMTrace.o(2082656485376L, 15517);
    return localz;
  }
  
  private void bYi()
  {
    GMTrace.i(2083059138560L, 15520);
    this.vNP.clear();
    at.AR();
    Object localObject = (String)c.xh().get(299010, null);
    if (!bg.nm((String)localObject))
    {
      localObject = ((String)localObject).split("\\|");
      int i = 0;
      while (i < localObject.length)
      {
        String[] arrayOfString = localObject[i].split("\\:");
        if (arrayOfString.length == 2) {
          this.vNP.put(bg.Sy(arrayOfString[0]), bg.Sy(arrayOfString[1]));
        }
        i += 1;
      }
    }
    this.vNT = true;
    GMTrace.o(2083059138560L, 15520);
  }
  
  public final void Bn(int paramInt)
  {
    GMTrace.i(2082790703104L, 15518);
    if (this.vNQ.size() != 0)
    {
      Object localObject = (aa.b)this.vNQ.get(paramInt);
      if ((localObject != null) && (((aa.b)localObject).vNY == 1))
      {
        this.vNP.put(((aa.b)localObject).id, ((aa.b)localObject).gVC);
        this.vNO -= 1;
        if (this.vNT)
        {
          localObject = new StringBuffer();
          paramInt = 0;
          while (paramInt < this.vNP.size())
          {
            int i = this.vNP.keyAt(paramInt);
            int j = this.vNP.get(i);
            ((StringBuffer)localObject).append(i);
            ((StringBuffer)localObject).append(":");
            ((StringBuffer)localObject).append(Integer.valueOf(j));
            ((StringBuffer)localObject).append("|");
            paramInt += 1;
          }
          at.AR();
          c.xh().set(299010, ((StringBuffer)localObject).toString());
        }
      }
    }
    GMTrace.o(2082790703104L, 15518);
  }
  
  /* Error */
  public final void lo(boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc2_w 185
    //   3: sipush 15519
    //   6: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: iload_1
    //   10: ifne +31 -> 41
    //   13: aload_0
    //   14: getfield 55	com/tencent/mm/ui/z:vNQ	Landroid/util/SparseArray;
    //   17: invokevirtual 128	android/util/SparseArray:size	()I
    //   20: ifeq +976 -> 996
    //   23: invokestatic 192	java/lang/System:currentTimeMillis	()J
    //   26: aload_0
    //   27: getfield 64	com/tencent/mm/ui/z:timestamp	J
    //   30: lsub
    //   31: ldc2_w 193
    //   34: lcmp
    //   35: ifle +970 -> 1005
    //   38: goto +958 -> 996
    //   41: invokestatic 192	java/lang/System:currentTimeMillis	()J
    //   44: lstore 6
    //   46: invokestatic 200	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   49: ldc -54
    //   51: invokevirtual 208	com/tencent/mm/k/e:dW	(Ljava/lang/String;)Ljava/util/List;
    //   54: astore 8
    //   56: ldc -46
    //   58: ldc -44
    //   60: iconst_1
    //   61: anewarray 4	java/lang/Object
    //   64: dup
    //   65: iconst_0
    //   66: aload 8
    //   68: invokeinterface 215 1 0
    //   73: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   76: aastore
    //   77: invokestatic 220	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   80: aload_0
    //   81: monitorenter
    //   82: aload_0
    //   83: getfield 55	com/tencent/mm/ui/z:vNQ	Landroid/util/SparseArray;
    //   86: invokevirtual 221	android/util/SparseArray:clear	()V
    //   89: aload_0
    //   90: getfield 60	com/tencent/mm/ui/z:vNR	Ljava/util/ArrayList;
    //   93: invokevirtual 222	java/util/ArrayList:clear	()V
    //   96: aload 8
    //   98: invokeinterface 226 1 0
    //   103: astore 8
    //   105: aload 8
    //   107: invokeinterface 232 1 0
    //   112: ifeq +390 -> 502
    //   115: aload 8
    //   117: invokeinterface 236 1 0
    //   122: checkcast 98	java/lang/String
    //   125: ldc -18
    //   127: invokestatic 244	com/tencent/mm/sdk/platformtools/bh:q	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   130: astore 9
    //   132: aload 9
    //   134: ifnull -29 -> 105
    //   137: aload 9
    //   139: invokeinterface 247 1 0
    //   144: ifeq -39 -> 105
    //   147: aload 9
    //   149: ldc -7
    //   151: invokeinterface 252 2 0
    //   156: checkcast 98	java/lang/String
    //   159: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   162: istore_3
    //   163: aload 9
    //   165: ldc -2
    //   167: invokeinterface 252 2 0
    //   172: checkcast 98	java/lang/String
    //   175: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   178: istore_2
    //   179: aload 9
    //   181: ldc_w 256
    //   184: invokeinterface 252 2 0
    //   189: checkcast 98	java/lang/String
    //   192: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   195: istore 5
    //   197: aload 9
    //   199: ldc_w 258
    //   202: invokeinterface 252 2 0
    //   207: checkcast 98	java/lang/String
    //   210: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   213: istore 4
    //   215: aload_0
    //   216: getfield 55	com/tencent/mm/ui/z:vNQ	Landroid/util/SparseArray;
    //   219: iload_3
    //   220: new 133	com/tencent/mm/ui/aa$b
    //   223: dup
    //   224: iload_3
    //   225: iload_2
    //   226: iload 5
    //   228: iload 4
    //   230: invokespecial 261	com/tencent/mm/ui/aa$b:<init>	(IIII)V
    //   233: invokevirtual 263	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   236: iconst_0
    //   237: istore_2
    //   238: iload_2
    //   239: aload_0
    //   240: getfield 60	com/tencent/mm/ui/z:vNR	Ljava/util/ArrayList;
    //   243: invokevirtual 264	java/util/ArrayList:size	()I
    //   246: if_icmpge +42 -> 288
    //   249: aload_0
    //   250: getfield 55	com/tencent/mm/ui/z:vNQ	Landroid/util/SparseArray;
    //   253: aload_0
    //   254: getfield 60	com/tencent/mm/ui/z:vNR	Ljava/util/ArrayList;
    //   257: iload_2
    //   258: invokevirtual 265	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   261: checkcast 163	java/lang/Integer
    //   264: invokevirtual 268	java/lang/Integer:intValue	()I
    //   267: invokevirtual 131	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   270: checkcast 133	com/tencent/mm/ui/aa$b
    //   273: getfield 271	com/tencent/mm/ui/aa$b:order	I
    //   276: iload 4
    //   278: if_icmpgt +10 -> 288
    //   281: iload_2
    //   282: iconst_1
    //   283: iadd
    //   284: istore_2
    //   285: goto -47 -> 238
    //   288: aload_0
    //   289: getfield 60	com/tencent/mm/ui/z:vNR	Ljava/util/ArrayList;
    //   292: iload_2
    //   293: iload_3
    //   294: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   297: invokevirtual 274	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   300: goto -195 -> 105
    //   303: astore 8
    //   305: aload_0
    //   306: monitorexit
    //   307: aload 8
    //   309: athrow
    //   310: astore 8
    //   312: ldc -46
    //   314: aload 8
    //   316: ldc_w 276
    //   319: iconst_0
    //   320: anewarray 4	java/lang/Object
    //   323: invokestatic 280	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   326: aload_0
    //   327: getfield 62	com/tencent/mm/ui/z:vNS	Landroid/util/SparseArray;
    //   330: invokevirtual 221	android/util/SparseArray:clear	()V
    //   333: aload_0
    //   334: iconst_0
    //   335: putfield 45	com/tencent/mm/ui/z:vNO	I
    //   338: iconst_0
    //   339: istore_3
    //   340: iconst_0
    //   341: istore_2
    //   342: iload_2
    //   343: aload_0
    //   344: getfield 60	com/tencent/mm/ui/z:vNR	Ljava/util/ArrayList;
    //   347: invokevirtual 264	java/util/ArrayList:size	()I
    //   350: if_icmpge +540 -> 890
    //   353: aload_0
    //   354: getfield 60	com/tencent/mm/ui/z:vNR	Ljava/util/ArrayList;
    //   357: iload_2
    //   358: invokevirtual 265	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   361: checkcast 163	java/lang/Integer
    //   364: invokevirtual 268	java/lang/Integer:intValue	()I
    //   367: istore 5
    //   369: aload_0
    //   370: getfield 55	com/tencent/mm/ui/z:vNQ	Landroid/util/SparseArray;
    //   373: iload 5
    //   375: invokevirtual 131	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   378: checkcast 133	com/tencent/mm/ui/aa$b
    //   381: astore 8
    //   383: iload 5
    //   385: invokestatic 286	com/tencent/mm/ui/aa:Bo	(I)Lcom/tencent/mm/ui/aa$d;
    //   388: astore 9
    //   390: iload_3
    //   391: istore 4
    //   393: aload 9
    //   395: ifnull +97 -> 492
    //   398: new 288	com/tencent/mm/ui/aa$c
    //   401: dup
    //   402: aload 9
    //   404: invokespecial 291	com/tencent/mm/ui/aa$c:<init>	(Lcom/tencent/mm/ui/aa$d;)V
    //   407: astore 9
    //   409: aload_0
    //   410: getfield 62	com/tencent/mm/ui/z:vNS	Landroid/util/SparseArray;
    //   413: iload_3
    //   414: aload 9
    //   416: invokevirtual 263	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   419: aload_0
    //   420: getfield 50	com/tencent/mm/ui/z:vNP	Landroid/util/SparseIntArray;
    //   423: iload 5
    //   425: invokevirtual 152	android/util/SparseIntArray:get	(I)I
    //   428: istore 4
    //   430: aload 8
    //   432: getfield 136	com/tencent/mm/ui/aa$b:vNY	I
    //   435: iconst_1
    //   436: if_icmpne +13 -> 449
    //   439: iload 4
    //   441: aload 8
    //   443: getfield 142	com/tencent/mm/ui/aa$b:gVC	I
    //   446: if_icmpne +25 -> 471
    //   449: iload 5
    //   451: bipush 20
    //   453: if_icmpne +34 -> 487
    //   456: invokestatic 297	com/tencent/mm/s/c:vK	()Lcom/tencent/mm/s/a;
    //   459: ldc_w 298
    //   462: ldc_w 299
    //   465: invokevirtual 305	com/tencent/mm/s/a:aE	(II)Z
    //   468: ifeq +19 -> 487
    //   471: aload 9
    //   473: iconst_1
    //   474: putfield 308	com/tencent/mm/ui/aa$c:vOa	Z
    //   477: aload_0
    //   478: aload_0
    //   479: getfield 45	com/tencent/mm/ui/z:vNO	I
    //   482: iconst_1
    //   483: iadd
    //   484: putfield 45	com/tencent/mm/ui/z:vNO	I
    //   487: iload_3
    //   488: iconst_1
    //   489: iadd
    //   490: istore 4
    //   492: iload_2
    //   493: iconst_1
    //   494: iadd
    //   495: istore_2
    //   496: iload 4
    //   498: istore_3
    //   499: goto -157 -> 342
    //   502: ldc -46
    //   504: ldc_w 310
    //   507: iconst_1
    //   508: anewarray 4	java/lang/Object
    //   511: dup
    //   512: iconst_0
    //   513: aload_0
    //   514: getfield 60	com/tencent/mm/ui/z:vNR	Ljava/util/ArrayList;
    //   517: invokevirtual 264	java/util/ArrayList:size	()I
    //   520: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   523: aastore
    //   524: invokestatic 220	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   527: aload_0
    //   528: getfield 60	com/tencent/mm/ui/z:vNR	Ljava/util/ArrayList;
    //   531: invokevirtual 264	java/util/ArrayList:size	()I
    //   534: ifne +59 -> 593
    //   537: aload_0
    //   538: getfield 55	com/tencent/mm/ui/z:vNQ	Landroid/util/SparseArray;
    //   541: invokevirtual 221	android/util/SparseArray:clear	()V
    //   544: aload_0
    //   545: getfield 60	com/tencent/mm/ui/z:vNR	Ljava/util/ArrayList;
    //   548: invokevirtual 222	java/util/ArrayList:clear	()V
    //   551: invokestatic 200	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   554: ldc_w 312
    //   557: invokevirtual 316	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   560: astore 8
    //   562: aload 8
    //   564: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   567: ifne +26 -> 593
    //   570: aload 8
    //   572: ldc_w 312
    //   575: invokestatic 244	com/tencent/mm/sdk/platformtools/bh:q	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   578: astore 9
    //   580: aload 9
    //   582: ifnonnull +62 -> 644
    //   585: ldc -46
    //   587: ldc_w 318
    //   590: invokestatic 322	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   593: aload_0
    //   594: monitorexit
    //   595: aload_0
    //   596: getfield 55	com/tencent/mm/ui/z:vNQ	Landroid/util/SparseArray;
    //   599: invokevirtual 128	android/util/SparseArray:size	()I
    //   602: ifeq +7 -> 609
    //   605: aload_0
    //   606: invokespecial 324	com/tencent/mm/ui/z:bYi	()V
    //   609: aload_0
    //   610: invokestatic 192	java/lang/System:currentTimeMillis	()J
    //   613: putfield 64	com/tencent/mm/ui/z:timestamp	J
    //   616: ldc -46
    //   618: ldc_w 326
    //   621: iconst_1
    //   622: anewarray 4	java/lang/Object
    //   625: dup
    //   626: iconst_0
    //   627: aload_0
    //   628: getfield 64	com/tencent/mm/ui/z:timestamp	J
    //   631: lload 6
    //   633: lsub
    //   634: invokestatic 331	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   637: aastore
    //   638: invokestatic 334	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   641: goto -315 -> 326
    //   644: iconst_0
    //   645: istore_2
    //   646: iload_2
    //   647: bipush 100
    //   649: if_icmpge -56 -> 593
    //   652: new 336	java/lang/StringBuilder
    //   655: dup
    //   656: ldc_w 338
    //   659: invokespecial 341	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   662: astore 10
    //   664: iload_2
    //   665: ifne +216 -> 881
    //   668: ldc_w 276
    //   671: astore 8
    //   673: aload 10
    //   675: aload 8
    //   677: invokevirtual 344	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   680: invokevirtual 345	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   683: astore 11
    //   685: aload 9
    //   687: new 336	java/lang/StringBuilder
    //   690: dup
    //   691: invokespecial 346	java/lang/StringBuilder:<init>	()V
    //   694: aload 11
    //   696: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   699: ldc_w 351
    //   702: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   705: invokevirtual 345	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   708: invokeinterface 252 2 0
    //   713: checkcast 98	java/lang/String
    //   716: astore 8
    //   718: aload 8
    //   720: ifnull -127 -> 593
    //   723: aload 8
    //   725: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   728: ifne -135 -> 593
    //   731: aload 9
    //   733: new 336	java/lang/StringBuilder
    //   736: dup
    //   737: invokespecial 346	java/lang/StringBuilder:<init>	()V
    //   740: aload 11
    //   742: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   745: ldc_w 353
    //   748: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   751: invokevirtual 345	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   754: invokeinterface 252 2 0
    //   759: checkcast 98	java/lang/String
    //   762: astore 10
    //   764: aload 9
    //   766: new 336	java/lang/StringBuilder
    //   769: dup
    //   770: invokespecial 346	java/lang/StringBuilder:<init>	()V
    //   773: aload 11
    //   775: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   778: ldc_w 355
    //   781: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   784: invokevirtual 345	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   787: invokeinterface 252 2 0
    //   792: checkcast 98	java/lang/String
    //   795: astore 11
    //   797: ldc -46
    //   799: ldc_w 357
    //   802: iconst_3
    //   803: anewarray 4	java/lang/Object
    //   806: dup
    //   807: iconst_0
    //   808: aload 8
    //   810: aastore
    //   811: dup
    //   812: iconst_1
    //   813: aload 10
    //   815: aastore
    //   816: dup
    //   817: iconst_2
    //   818: aload 11
    //   820: aastore
    //   821: invokestatic 334	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   824: aload_0
    //   825: getfield 55	com/tencent/mm/ui/z:vNQ	Landroid/util/SparseArray;
    //   828: aload 8
    //   830: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   833: new 133	com/tencent/mm/ui/aa$b
    //   836: dup
    //   837: aload 8
    //   839: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   842: aload 10
    //   844: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   847: aload 11
    //   849: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   852: invokespecial 360	com/tencent/mm/ui/aa$b:<init>	(III)V
    //   855: invokevirtual 263	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   858: aload_0
    //   859: getfield 60	com/tencent/mm/ui/z:vNR	Ljava/util/ArrayList;
    //   862: aload 8
    //   864: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   867: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   870: invokevirtual 363	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   873: pop
    //   874: iload_2
    //   875: iconst_1
    //   876: iadd
    //   877: istore_2
    //   878: goto -232 -> 646
    //   881: iload_2
    //   882: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   885: astore 8
    //   887: goto -214 -> 673
    //   890: ldc -46
    //   892: ldc_w 365
    //   895: iconst_2
    //   896: anewarray 4	java/lang/Object
    //   899: dup
    //   900: iconst_0
    //   901: aload_0
    //   902: getfield 60	com/tencent/mm/ui/z:vNR	Ljava/util/ArrayList;
    //   905: invokevirtual 264	java/util/ArrayList:size	()I
    //   908: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   911: aastore
    //   912: dup
    //   913: iconst_1
    //   914: aload_0
    //   915: getfield 62	com/tencent/mm/ui/z:vNS	Landroid/util/SparseArray;
    //   918: invokevirtual 128	android/util/SparseArray:size	()I
    //   921: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   924: aastore
    //   925: invokestatic 220	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   928: invokestatic 370	com/tencent/mm/sdk/platformtools/f:bPw	()Z
    //   931: ifne +34 -> 965
    //   934: aload_0
    //   935: getfield 62	com/tencent/mm/ui/z:vNS	Landroid/util/SparseArray;
    //   938: iload_3
    //   939: new 288	com/tencent/mm/ui/aa$c
    //   942: dup
    //   943: ldc_w 371
    //   946: invokestatic 286	com/tencent/mm/ui/aa:Bo	(I)Lcom/tencent/mm/ui/aa$d;
    //   949: invokespecial 291	com/tencent/mm/ui/aa$c:<init>	(Lcom/tencent/mm/ui/aa$d;)V
    //   952: invokevirtual 263	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   955: ldc2_w 185
    //   958: sipush 15519
    //   961: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   964: return
    //   965: aload_0
    //   966: getfield 62	com/tencent/mm/ui/z:vNS	Landroid/util/SparseArray;
    //   969: iload_3
    //   970: new 288	com/tencent/mm/ui/aa$c
    //   973: dup
    //   974: ldc_w 372
    //   977: invokestatic 286	com/tencent/mm/ui/aa:Bo	(I)Lcom/tencent/mm/ui/aa$d;
    //   980: invokespecial 291	com/tencent/mm/ui/aa$c:<init>	(Lcom/tencent/mm/ui/aa$d;)V
    //   983: invokevirtual 263	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   986: ldc2_w 185
    //   989: sipush 15519
    //   992: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   995: return
    //   996: iconst_1
    //   997: istore_2
    //   998: iload_2
    //   999: ifeq -673 -> 326
    //   1002: goto -961 -> 41
    //   1005: iconst_0
    //   1006: istore_2
    //   1007: goto -9 -> 998
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1010	0	this	z
    //   0	1010	1	paramBoolean	boolean
    //   178	829	2	i	int
    //   162	808	3	j	int
    //   213	284	4	k	int
    //   195	259	5	m	int
    //   44	588	6	l	long
    //   54	62	8	localObject1	Object
    //   303	5	8	localObject2	Object
    //   310	5	8	localException	Exception
    //   381	505	8	localObject3	Object
    //   130	635	9	localObject4	Object
    //   662	181	10	localObject5	Object
    //   683	165	11	str	String
    // Exception table:
    //   from	to	target	type
    //   82	105	303	finally
    //   105	132	303	finally
    //   137	236	303	finally
    //   238	281	303	finally
    //   288	300	303	finally
    //   305	307	303	finally
    //   502	580	303	finally
    //   585	593	303	finally
    //   593	595	303	finally
    //   652	664	303	finally
    //   673	718	303	finally
    //   723	874	303	finally
    //   13	38	310	java/lang/Exception
    //   41	82	310	java/lang/Exception
    //   307	310	310	java/lang/Exception
    //   595	609	310	java/lang/Exception
    //   609	641	310	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */