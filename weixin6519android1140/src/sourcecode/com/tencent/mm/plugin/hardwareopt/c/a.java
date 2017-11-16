package com.tencent.mm.plugin.hardwareopt.c;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.protocal.c.ahg;
import com.tencent.mm.protocal.c.aof;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  implements com.tencent.mm.vending.c.a<ahg, Context>
{
  private Context mContext;
  
  public a()
  {
    GMTrace.i(18661767118848L, 139041);
    this.mContext = null;
    GMTrace.o(18661767118848L, 139041);
  }
  
  private static String Ad(String paramString)
  {
    GMTrace.i(18662035554304L, 139043);
    Object localObject2 = null;
    String str2 = null;
    String str1 = str2;
    Object localObject1 = localObject2;
    try
    {
      if (Build.VERSION.SDK_INT >= 18)
      {
        str1 = str2;
        localObject1 = localObject2;
        paramString = MediaCodec.createEncoderByType(paramString);
        str1 = paramString;
        localObject1 = paramString;
        str2 = paramString.getName();
        if (paramString != null) {
          paramString.release();
        }
        GMTrace.o(18662035554304L, 139043);
        return str2;
      }
      GMTrace.o(18662035554304L, 139043);
      return "too low version";
    }
    catch (Exception paramString)
    {
      localObject1 = str1;
      w.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", paramString, "hy: error in handle media codec", new Object[0]);
      if (str1 != null) {
        str1.release();
      }
      GMTrace.o(18662035554304L, 139043);
      return "undefined";
    }
    finally
    {
      if (localObject1 != null) {
        ((MediaCodec)localObject1).release();
      }
    }
  }
  
  private static LinkedList<aof> aHi()
  {
    GMTrace.i(18662169772032L, 139044);
    int k = MediaCodecList.getCodecCount();
    LinkedList localLinkedList = new LinkedList();
    Object localObject3 = new HashMap();
    int i = 0;
    Object localObject4;
    Object localObject2;
    while (i < k)
    {
      localObject4 = MediaCodecList.getCodecInfoAt(i);
      if (((MediaCodecInfo)localObject4).isEncoder())
      {
        String[] arrayOfString = ((MediaCodecInfo)localObject4).getSupportedTypes();
        int m = arrayOfString.length;
        int j = 0;
        while (j < m)
        {
          String str = arrayOfString[j];
          localObject2 = (Set)((Map)localObject3).get(str.toLowerCase());
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = new HashSet();
          }
          ((Set)localObject1).add(((MediaCodecInfo)localObject4).getName());
          ((Map)localObject3).put(str.toLowerCase(), localObject1);
          j += 1;
        }
      }
      i += 1;
    }
    w.i("MicroMsg.TaskFindHardwareInfo", "hy: allCodecNames: %s", new Object[] { localObject3 });
    Object localObject1 = ((Map)localObject3).entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = new aof();
      ((aof)localObject3).mVJ = ((String)((Map.Entry)localObject2).getKey());
      localObject4 = new LinkedList();
      if (((Map.Entry)localObject2).getValue() != null) {
        ((LinkedList)localObject4).addAll((Collection)((Map.Entry)localObject2).getValue());
      }
      ((aof)localObject3).uEg = ((LinkedList)localObject4);
      localLinkedList.add(localObject3);
    }
    GMTrace.o(18662169772032L, 139044);
    return localLinkedList;
  }
  
  /* Error */
  private ahg cG(Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 182
    //   3: ldc -72
    //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: aload_1
    //   10: putfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   13: invokestatic 190	java/lang/System:nanoTime	()J
    //   16: lstore 4
    //   18: new 192	com/tencent/mm/protocal/c/eq
    //   21: dup
    //   22: invokespecial 193	com/tencent/mm/protocal/c/eq:<init>	()V
    //   25: astore_1
    //   26: aload_1
    //   27: aload_0
    //   28: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   31: invokestatic 199	com/tencent/mm/sdk/platformtools/bg:eC	(Landroid/content/Context;)Ljava/lang/String;
    //   34: putfield 202	com/tencent/mm/protocal/c/eq:imei	Ljava/lang/String;
    //   37: aload_1
    //   38: getfield 202	com/tencent/mm/protocal/c/eq:imei	Ljava/lang/String;
    //   41: invokestatic 206	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   44: ifeq +56 -> 100
    //   47: ldc 61
    //   49: ldc -48
    //   51: invokestatic 212	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: new 9	com/tencent/mm/plugin/hardwareopt/c/a$a
    //   57: dup
    //   58: invokespecial 213	com/tencent/mm/plugin/hardwareopt/c/a$a:<init>	()V
    //   61: athrow
    //   62: astore_1
    //   63: ldc 61
    //   65: aload_1
    //   66: ldc -41
    //   68: iconst_0
    //   69: anewarray 5	java/lang/Object
    //   72: invokestatic 69	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: invokestatic 221	com/tencent/mm/vending/g/g:ckq	()Lcom/tencent/mm/vending/g/b;
    //   78: astore_1
    //   79: aload_1
    //   80: ifnull +10 -> 90
    //   83: aload_1
    //   84: aconst_null
    //   85: invokeinterface 227 2 0
    //   90: ldc2_w 182
    //   93: ldc -72
    //   95: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   98: aconst_null
    //   99: areturn
    //   100: aload_1
    //   101: getstatic 232	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   104: putfield 235	com/tencent/mm/protocal/c/eq:tTx	Ljava/lang/String;
    //   107: aload_1
    //   108: getstatic 238	android/os/Build:MODEL	Ljava/lang/String;
    //   111: putfield 241	com/tencent/mm/protocal/c/eq:tTy	Ljava/lang/String;
    //   114: aload_1
    //   115: getstatic 244	android/os/Build$VERSION:INCREMENTAL	Ljava/lang/String;
    //   118: putfield 247	com/tencent/mm/protocal/c/eq:tTz	Ljava/lang/String;
    //   121: invokestatic 253	com/tencent/mm/plugin/hardwareopt/b/a:aHg	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   124: invokevirtual 257	com/tencent/mm/plugin/hardwareopt/b/a:aHh	()Lcom/tencent/mm/protocal/c/ahg;
    //   127: aload_1
    //   128: putfield 263	com/tencent/mm/protocal/c/ahg:uwD	Lcom/tencent/mm/protocal/c/eq;
    //   131: ldc 61
    //   133: ldc_w 265
    //   136: iconst_4
    //   137: anewarray 5	java/lang/Object
    //   140: dup
    //   141: iconst_0
    //   142: aload_1
    //   143: getfield 202	com/tencent/mm/protocal/c/eq:imei	Ljava/lang/String;
    //   146: aastore
    //   147: dup
    //   148: iconst_1
    //   149: aload_1
    //   150: getfield 235	com/tencent/mm/protocal/c/eq:tTx	Ljava/lang/String;
    //   153: aastore
    //   154: dup
    //   155: iconst_2
    //   156: aload_1
    //   157: getfield 241	com/tencent/mm/protocal/c/eq:tTy	Ljava/lang/String;
    //   160: aastore
    //   161: dup
    //   162: iconst_3
    //   163: aload_1
    //   164: getfield 247	com/tencent/mm/protocal/c/eq:tTz	Ljava/lang/String;
    //   167: aastore
    //   168: invokestatic 268	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   171: new 270	com/tencent/mm/protocal/c/jc
    //   174: dup
    //   175: invokespecial 271	com/tencent/mm/protocal/c/jc:<init>	()V
    //   178: astore 9
    //   180: aload 9
    //   182: getstatic 274	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   185: putfield 277	com/tencent/mm/protocal/c/jc:tYM	Ljava/lang/String;
    //   188: invokestatic 283	com/tencent/mm/compatible/d/m:sO	()Ljava/util/Map;
    //   191: astore_1
    //   192: aload 9
    //   194: aload_1
    //   195: ldc_w 285
    //   198: invokeinterface 113 2 0
    //   203: checkcast 104	java/lang/String
    //   206: ldc_w 287
    //   209: invokestatic 291	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   212: putfield 294	com/tencent/mm/protocal/c/jc:tYK	Ljava/lang/String;
    //   215: aload 9
    //   217: aload_1
    //   218: ldc_w 296
    //   221: invokeinterface 113 2 0
    //   226: checkcast 104	java/lang/String
    //   229: putfield 297	com/tencent/mm/protocal/c/jc:tTy	Ljava/lang/String;
    //   232: aload 9
    //   234: aload_1
    //   235: ldc_w 299
    //   238: invokeinterface 113 2 0
    //   243: checkcast 104	java/lang/String
    //   246: putfield 302	com/tencent/mm/protocal/c/jc:tYN	Ljava/lang/String;
    //   249: new 304	java/io/RandomAccessFile
    //   252: dup
    //   253: ldc_w 306
    //   256: ldc_w 308
    //   259: invokespecial 310	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   262: astore 7
    //   264: aload 7
    //   266: astore_1
    //   267: aload 9
    //   269: aload 7
    //   271: invokevirtual 313	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   274: iconst_m1
    //   275: invokestatic 317	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   278: sipush 1000
    //   281: idiv
    //   282: putfield 320	com/tencent/mm/protocal/c/jc:tYL	I
    //   285: aload 7
    //   287: invokevirtual 323	java/io/RandomAccessFile:close	()V
    //   290: invokestatic 253	com/tencent/mm/plugin/hardwareopt/b/a:aHg	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   293: invokevirtual 257	com/tencent/mm/plugin/hardwareopt/b/a:aHh	()Lcom/tencent/mm/protocal/c/ahg;
    //   296: aload 9
    //   298: putfield 327	com/tencent/mm/protocal/c/ahg:uwE	Lcom/tencent/mm/protocal/c/jc;
    //   301: ldc 61
    //   303: ldc_w 329
    //   306: iconst_5
    //   307: anewarray 5	java/lang/Object
    //   310: dup
    //   311: iconst_0
    //   312: aload 9
    //   314: getfield 277	com/tencent/mm/protocal/c/jc:tYM	Ljava/lang/String;
    //   317: aastore
    //   318: dup
    //   319: iconst_1
    //   320: aload 9
    //   322: getfield 294	com/tencent/mm/protocal/c/jc:tYK	Ljava/lang/String;
    //   325: aastore
    //   326: dup
    //   327: iconst_2
    //   328: aload 9
    //   330: getfield 320	com/tencent/mm/protocal/c/jc:tYL	I
    //   333: invokestatic 335	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   336: aastore
    //   337: dup
    //   338: iconst_3
    //   339: aload 9
    //   341: getfield 297	com/tencent/mm/protocal/c/jc:tTy	Ljava/lang/String;
    //   344: aastore
    //   345: dup
    //   346: iconst_4
    //   347: aload 9
    //   349: getfield 302	com/tencent/mm/protocal/c/jc:tYN	Ljava/lang/String;
    //   352: aastore
    //   353: invokestatic 268	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   356: aload_0
    //   357: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   360: ldc_w 337
    //   363: invokevirtual 343	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   366: checkcast 345	android/app/ActivityManager
    //   369: astore 7
    //   371: new 347	android/app/ActivityManager$MemoryInfo
    //   374: dup
    //   375: invokespecial 348	android/app/ActivityManager$MemoryInfo:<init>	()V
    //   378: astore_1
    //   379: aload 7
    //   381: aload_1
    //   382: invokevirtual 352	android/app/ActivityManager:getMemoryInfo	(Landroid/app/ActivityManager$MemoryInfo;)V
    //   385: new 354	com/tencent/mm/protocal/c/aoa
    //   388: dup
    //   389: invokespecial 355	com/tencent/mm/protocal/c/aoa:<init>	()V
    //   392: astore 7
    //   394: aload 7
    //   396: aload_1
    //   397: getfield 359	android/app/ActivityManager$MemoryInfo:totalMem	J
    //   400: ldc2_w 360
    //   403: ldiv
    //   404: ldc2_w 360
    //   407: ldiv
    //   408: l2i
    //   409: putfield 364	com/tencent/mm/protocal/c/aoa:uDU	I
    //   412: aload 7
    //   414: aload_1
    //   415: getfield 367	android/app/ActivityManager$MemoryInfo:threshold	J
    //   418: ldc2_w 360
    //   421: ldiv
    //   422: ldc2_w 360
    //   425: ldiv
    //   426: l2i
    //   427: putfield 370	com/tencent/mm/protocal/c/aoa:uDV	I
    //   430: aload 7
    //   432: aload_0
    //   433: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   436: ldc_w 337
    //   439: invokevirtual 343	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   442: checkcast 345	android/app/ActivityManager
    //   445: invokevirtual 373	android/app/ActivityManager:getLargeMemoryClass	()I
    //   448: putfield 376	com/tencent/mm/protocal/c/aoa:uDW	I
    //   451: aload 7
    //   453: aload_0
    //   454: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   457: ldc_w 337
    //   460: invokevirtual 343	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   463: checkcast 345	android/app/ActivityManager
    //   466: invokevirtual 379	android/app/ActivityManager:getMemoryClass	()I
    //   469: putfield 382	com/tencent/mm/protocal/c/aoa:uDX	I
    //   472: invokestatic 253	com/tencent/mm/plugin/hardwareopt/b/a:aHg	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   475: invokevirtual 257	com/tencent/mm/plugin/hardwareopt/b/a:aHh	()Lcom/tencent/mm/protocal/c/ahg;
    //   478: aload 7
    //   480: putfield 386	com/tencent/mm/protocal/c/ahg:uwF	Lcom/tencent/mm/protocal/c/aoa;
    //   483: ldc 61
    //   485: ldc_w 388
    //   488: iconst_4
    //   489: anewarray 5	java/lang/Object
    //   492: dup
    //   493: iconst_0
    //   494: aload 7
    //   496: getfield 364	com/tencent/mm/protocal/c/aoa:uDU	I
    //   499: invokestatic 335	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   502: aastore
    //   503: dup
    //   504: iconst_1
    //   505: aload 7
    //   507: getfield 370	com/tencent/mm/protocal/c/aoa:uDV	I
    //   510: invokestatic 335	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   513: aastore
    //   514: dup
    //   515: iconst_2
    //   516: aload 7
    //   518: getfield 376	com/tencent/mm/protocal/c/aoa:uDW	I
    //   521: invokestatic 335	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   524: aastore
    //   525: dup
    //   526: iconst_3
    //   527: aload 7
    //   529: getfield 382	com/tencent/mm/protocal/c/aoa:uDX	I
    //   532: invokestatic 335	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   535: aastore
    //   536: invokestatic 268	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   539: new 390	android/os/StatFs
    //   542: dup
    //   543: getstatic 395	com/tencent/mm/compatible/util/e:ghx	Ljava/lang/String;
    //   546: invokespecial 398	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   549: astore_1
    //   550: new 400	com/tencent/mm/protocal/c/bho
    //   553: dup
    //   554: invokespecial 401	com/tencent/mm/protocal/c/bho:<init>	()V
    //   557: astore 7
    //   559: getstatic 44	android/os/Build$VERSION:SDK_INT	I
    //   562: bipush 18
    //   564: if_icmplt +1163 -> 1727
    //   567: aload 7
    //   569: aload_1
    //   570: invokevirtual 404	android/os/StatFs:getTotalBytes	()J
    //   573: ldc2_w 360
    //   576: ldiv
    //   577: ldc2_w 360
    //   580: ldiv
    //   581: l2i
    //   582: putfield 407	com/tencent/mm/protocal/c/bho:uTx	I
    //   585: aload 7
    //   587: invokestatic 412	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   590: ldc_w 414
    //   593: invokevirtual 417	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   596: putfield 421	com/tencent/mm/protocal/c/bho:uTy	Z
    //   599: invokestatic 253	com/tencent/mm/plugin/hardwareopt/b/a:aHg	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   602: invokevirtual 257	com/tencent/mm/plugin/hardwareopt/b/a:aHh	()Lcom/tencent/mm/protocal/c/ahg;
    //   605: aload 7
    //   607: putfield 425	com/tencent/mm/protocal/c/ahg:uwG	Lcom/tencent/mm/protocal/c/bho;
    //   610: ldc 61
    //   612: ldc_w 427
    //   615: iconst_2
    //   616: anewarray 5	java/lang/Object
    //   619: dup
    //   620: iconst_0
    //   621: aload 7
    //   623: getfield 407	com/tencent/mm/protocal/c/bho:uTx	I
    //   626: invokestatic 335	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   629: aastore
    //   630: dup
    //   631: iconst_1
    //   632: aload 7
    //   634: getfield 421	com/tencent/mm/protocal/c/bho:uTy	Z
    //   637: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   640: aastore
    //   641: invokestatic 268	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   644: aload_0
    //   645: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   648: ldc_w 337
    //   651: invokevirtual 343	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   654: checkcast 345	android/app/ActivityManager
    //   657: invokevirtual 436	android/app/ActivityManager:getDeviceConfigurationInfo	()Landroid/content/pm/ConfigurationInfo;
    //   660: astore_1
    //   661: new 438	com/tencent/mm/protocal/c/uv
    //   664: dup
    //   665: invokespecial 439	com/tencent/mm/protocal/c/uv:<init>	()V
    //   668: astore 7
    //   670: aload_1
    //   671: getfield 444	android/content/pm/ConfigurationInfo:reqGlEsVersion	I
    //   674: ldc_w 445
    //   677: if_icmplt +1146 -> 1823
    //   680: iconst_1
    //   681: istore 6
    //   683: aload 7
    //   685: iload 6
    //   687: putfield 448	com/tencent/mm/protocal/c/uv:una	Z
    //   690: aload_1
    //   691: getfield 444	android/content/pm/ConfigurationInfo:reqGlEsVersion	I
    //   694: ldc_w 449
    //   697: if_icmplt +1132 -> 1829
    //   700: iconst_1
    //   701: istore 6
    //   703: aload 7
    //   705: iload 6
    //   707: putfield 452	com/tencent/mm/protocal/c/uv:unb	Z
    //   710: invokestatic 253	com/tencent/mm/plugin/hardwareopt/b/a:aHg	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   713: invokevirtual 257	com/tencent/mm/plugin/hardwareopt/b/a:aHh	()Lcom/tencent/mm/protocal/c/ahg;
    //   716: aload 7
    //   718: putfield 456	com/tencent/mm/protocal/c/ahg:uwK	Lcom/tencent/mm/protocal/c/uv;
    //   721: ldc 61
    //   723: ldc_w 458
    //   726: iconst_3
    //   727: anewarray 5	java/lang/Object
    //   730: dup
    //   731: iconst_0
    //   732: aload 7
    //   734: getfield 448	com/tencent/mm/protocal/c/uv:una	Z
    //   737: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   740: aastore
    //   741: dup
    //   742: iconst_1
    //   743: aload 7
    //   745: getfield 452	com/tencent/mm/protocal/c/uv:unb	Z
    //   748: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   751: aastore
    //   752: dup
    //   753: iconst_2
    //   754: aload_1
    //   755: getfield 444	android/content/pm/ConfigurationInfo:reqGlEsVersion	I
    //   758: invokestatic 335	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   761: aastore
    //   762: invokestatic 268	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   765: aload_0
    //   766: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   769: ldc_w 460
    //   772: invokevirtual 343	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   775: checkcast 462	android/view/WindowManager
    //   778: invokeinterface 466 1 0
    //   783: astore_1
    //   784: new 468	android/graphics/Point
    //   787: dup
    //   788: invokespecial 469	android/graphics/Point:<init>	()V
    //   791: astore 7
    //   793: aload_1
    //   794: aload 7
    //   796: invokevirtual 475	android/view/Display:getSize	(Landroid/graphics/Point;)V
    //   799: aload 7
    //   801: getfield 478	android/graphics/Point:x	I
    //   804: istore_2
    //   805: aload 7
    //   807: getfield 481	android/graphics/Point:y	I
    //   810: istore_3
    //   811: new 483	com/tencent/mm/protocal/c/bab
    //   814: dup
    //   815: invokespecial 484	com/tencent/mm/protocal/c/bab:<init>	()V
    //   818: astore_1
    //   819: aload_1
    //   820: new 486	java/lang/StringBuilder
    //   823: dup
    //   824: invokespecial 487	java/lang/StringBuilder:<init>	()V
    //   827: iload_2
    //   828: invokestatic 490	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   831: invokevirtual 494	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   834: ldc_w 495
    //   837: invokevirtual 494	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   840: iload_3
    //   841: invokevirtual 498	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   844: invokevirtual 501	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   847: putfield 504	com/tencent/mm/protocal/c/bab:uOb	Ljava/lang/String;
    //   850: aload_1
    //   851: aload_0
    //   852: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   855: invokevirtual 508	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   858: invokevirtual 514	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   861: getfield 520	android/util/DisplayMetrics:density	F
    //   864: f2i
    //   865: putfield 522	com/tencent/mm/protocal/c/bab:density	I
    //   868: invokestatic 253	com/tencent/mm/plugin/hardwareopt/b/a:aHg	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   871: invokevirtual 257	com/tencent/mm/plugin/hardwareopt/b/a:aHh	()Lcom/tencent/mm/protocal/c/ahg;
    //   874: aload_1
    //   875: putfield 526	com/tencent/mm/protocal/c/ahg:uwH	Lcom/tencent/mm/protocal/c/bab;
    //   878: ldc 61
    //   880: ldc_w 528
    //   883: iconst_2
    //   884: anewarray 5	java/lang/Object
    //   887: dup
    //   888: iconst_0
    //   889: aload_1
    //   890: getfield 504	com/tencent/mm/protocal/c/bab:uOb	Ljava/lang/String;
    //   893: aastore
    //   894: dup
    //   895: iconst_1
    //   896: aload_1
    //   897: getfield 522	com/tencent/mm/protocal/c/bab:density	I
    //   900: invokestatic 335	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   903: aastore
    //   904: invokestatic 268	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   907: new 530	com/tencent/mm/protocal/c/nm
    //   910: dup
    //   911: invokespecial 531	com/tencent/mm/protocal/c/nm:<init>	()V
    //   914: astore_1
    //   915: aload_1
    //   916: ldc_w 533
    //   919: invokestatic 535	com/tencent/mm/plugin/hardwareopt/c/a:Ad	(Ljava/lang/String;)Ljava/lang/String;
    //   922: putfield 538	com/tencent/mm/protocal/c/nm:uek	Ljava/lang/String;
    //   925: aload_1
    //   926: ldc_w 540
    //   929: invokestatic 535	com/tencent/mm/plugin/hardwareopt/c/a:Ad	(Ljava/lang/String;)Ljava/lang/String;
    //   932: putfield 543	com/tencent/mm/protocal/c/nm:uel	Ljava/lang/String;
    //   935: aload_1
    //   936: invokestatic 545	com/tencent/mm/plugin/hardwareopt/c/a:aHi	()Ljava/util/LinkedList;
    //   939: putfield 548	com/tencent/mm/protocal/c/nm:uem	Ljava/util/LinkedList;
    //   942: invokestatic 253	com/tencent/mm/plugin/hardwareopt/b/a:aHg	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   945: invokevirtual 257	com/tencent/mm/plugin/hardwareopt/b/a:aHh	()Lcom/tencent/mm/protocal/c/ahg;
    //   948: aload_1
    //   949: putfield 552	com/tencent/mm/protocal/c/ahg:uwI	Lcom/tencent/mm/protocal/c/nm;
    //   952: aload_1
    //   953: getfield 538	com/tencent/mm/protocal/c/nm:uek	Ljava/lang/String;
    //   956: astore 7
    //   958: aload_1
    //   959: getfield 543	com/tencent/mm/protocal/c/nm:uel	Ljava/lang/String;
    //   962: astore 8
    //   964: aload_1
    //   965: getfield 548	com/tencent/mm/protocal/c/nm:uem	Ljava/util/LinkedList;
    //   968: ifnull +867 -> 1835
    //   971: aload_1
    //   972: getfield 548	com/tencent/mm/protocal/c/nm:uem	Ljava/util/LinkedList;
    //   975: invokevirtual 555	java/util/LinkedList:size	()I
    //   978: istore_2
    //   979: ldc 61
    //   981: ldc_w 557
    //   984: iconst_3
    //   985: anewarray 5	java/lang/Object
    //   988: dup
    //   989: iconst_0
    //   990: aload 7
    //   992: aastore
    //   993: dup
    //   994: iconst_1
    //   995: aload 8
    //   997: aastore
    //   998: dup
    //   999: iconst_2
    //   1000: iload_2
    //   1001: invokestatic 335	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1004: aastore
    //   1005: invokestatic 268	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1008: new 559	com/tencent/mm/protocal/c/ug
    //   1011: dup
    //   1012: invokespecial 560	com/tencent/mm/protocal/c/ug:<init>	()V
    //   1015: astore_1
    //   1016: aload_1
    //   1017: aload_0
    //   1018: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1021: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1024: ldc_w 566
    //   1027: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1030: putfield 574	com/tencent/mm/protocal/c/ug:umk	Z
    //   1033: getstatic 44	android/os/Build$VERSION:SDK_INT	I
    //   1036: bipush 18
    //   1038: if_icmplt +717 -> 1755
    //   1041: aload_1
    //   1042: aload_0
    //   1043: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1046: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1049: ldc_w 576
    //   1052: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1055: putfield 579	com/tencent/mm/protocal/c/ug:uml	Z
    //   1058: aload_1
    //   1059: aload_0
    //   1060: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1063: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1066: ldc_w 581
    //   1069: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1072: putfield 584	com/tencent/mm/protocal/c/ug:umm	Z
    //   1075: aload_1
    //   1076: aload_0
    //   1077: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1080: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1083: ldc_w 586
    //   1086: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1089: putfield 589	com/tencent/mm/protocal/c/ug:umn	Z
    //   1092: aload_1
    //   1093: aload_0
    //   1094: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1097: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1100: ldc_w 591
    //   1103: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1106: putfield 594	com/tencent/mm/protocal/c/ug:umo	Z
    //   1109: aload_1
    //   1110: aload_0
    //   1111: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1114: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1117: ldc_w 596
    //   1120: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1123: putfield 599	com/tencent/mm/protocal/c/ug:ump	Z
    //   1126: aload_1
    //   1127: aload_0
    //   1128: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1131: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1134: ldc_w 601
    //   1137: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1140: putfield 604	com/tencent/mm/protocal/c/ug:umq	Z
    //   1143: getstatic 44	android/os/Build$VERSION:SDK_INT	I
    //   1146: bipush 19
    //   1148: if_icmplt +615 -> 1763
    //   1151: aload_1
    //   1152: aload_0
    //   1153: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1156: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1159: ldc_w 606
    //   1162: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1165: putfield 609	com/tencent/mm/protocal/c/ug:umB	Z
    //   1168: aload_1
    //   1169: aload_0
    //   1170: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1173: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1176: ldc_w 601
    //   1179: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1182: putfield 612	com/tencent/mm/protocal/c/ug:umr	Z
    //   1185: getstatic 44	android/os/Build$VERSION:SDK_INT	I
    //   1188: bipush 23
    //   1190: if_icmplt +581 -> 1771
    //   1193: aload_1
    //   1194: aload_0
    //   1195: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1198: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1201: ldc_w 614
    //   1204: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1207: putfield 617	com/tencent/mm/protocal/c/ug:ums	Z
    //   1210: aload_1
    //   1211: aload_0
    //   1212: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1215: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1218: ldc_w 619
    //   1221: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1224: putfield 622	com/tencent/mm/protocal/c/ug:umt	Z
    //   1227: aload_1
    //   1228: aload_0
    //   1229: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1232: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1235: ldc_w 624
    //   1238: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1241: putfield 627	com/tencent/mm/protocal/c/ug:umu	Z
    //   1244: aload_1
    //   1245: aload_0
    //   1246: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1249: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1252: ldc_w 629
    //   1255: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1258: putfield 632	com/tencent/mm/protocal/c/ug:umv	Z
    //   1261: aload_1
    //   1262: aload_0
    //   1263: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1266: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1269: ldc_w 634
    //   1272: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1275: putfield 637	com/tencent/mm/protocal/c/ug:umw	Z
    //   1278: getstatic 44	android/os/Build$VERSION:SDK_INT	I
    //   1281: bipush 19
    //   1283: if_icmplt +514 -> 1797
    //   1286: aload_1
    //   1287: aload_0
    //   1288: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1291: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1294: ldc_w 639
    //   1297: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1300: putfield 642	com/tencent/mm/protocal/c/ug:umx	Z
    //   1303: getstatic 44	android/os/Build$VERSION:SDK_INT	I
    //   1306: bipush 19
    //   1308: if_icmplt +497 -> 1805
    //   1311: aload_1
    //   1312: aload_0
    //   1313: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1316: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1319: ldc_w 644
    //   1322: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1325: putfield 647	com/tencent/mm/protocal/c/ug:umy	Z
    //   1328: aload_1
    //   1329: aload_0
    //   1330: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1333: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1336: ldc_w 649
    //   1339: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1342: putfield 652	com/tencent/mm/protocal/c/ug:umz	Z
    //   1345: aload_1
    //   1346: aload_0
    //   1347: getfield 27	com/tencent/mm/plugin/hardwareopt/c/a:mContext	Landroid/content/Context;
    //   1350: invokevirtual 564	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1353: ldc_w 654
    //   1356: invokevirtual 571	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   1359: putfield 657	com/tencent/mm/protocal/c/ug:umA	Z
    //   1362: invokestatic 253	com/tencent/mm/plugin/hardwareopt/b/a:aHg	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   1365: invokevirtual 257	com/tencent/mm/plugin/hardwareopt/b/a:aHh	()Lcom/tencent/mm/protocal/c/ahg;
    //   1368: aload_1
    //   1369: putfield 661	com/tencent/mm/protocal/c/ahg:uwJ	Lcom/tencent/mm/protocal/c/ug;
    //   1372: ldc 61
    //   1374: ldc_w 663
    //   1377: bipush 18
    //   1379: anewarray 5	java/lang/Object
    //   1382: dup
    //   1383: iconst_0
    //   1384: aload_1
    //   1385: getfield 574	com/tencent/mm/protocal/c/ug:umk	Z
    //   1388: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1391: aastore
    //   1392: dup
    //   1393: iconst_1
    //   1394: aload_1
    //   1395: getfield 579	com/tencent/mm/protocal/c/ug:uml	Z
    //   1398: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1401: aastore
    //   1402: dup
    //   1403: iconst_2
    //   1404: aload_1
    //   1405: getfield 584	com/tencent/mm/protocal/c/ug:umm	Z
    //   1408: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1411: aastore
    //   1412: dup
    //   1413: iconst_3
    //   1414: aload_1
    //   1415: getfield 589	com/tencent/mm/protocal/c/ug:umn	Z
    //   1418: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1421: aastore
    //   1422: dup
    //   1423: iconst_4
    //   1424: aload_1
    //   1425: getfield 594	com/tencent/mm/protocal/c/ug:umo	Z
    //   1428: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1431: aastore
    //   1432: dup
    //   1433: iconst_5
    //   1434: aload_1
    //   1435: getfield 599	com/tencent/mm/protocal/c/ug:ump	Z
    //   1438: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1441: aastore
    //   1442: dup
    //   1443: bipush 6
    //   1445: aload_1
    //   1446: getfield 604	com/tencent/mm/protocal/c/ug:umq	Z
    //   1449: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1452: aastore
    //   1453: dup
    //   1454: bipush 7
    //   1456: aload_1
    //   1457: getfield 609	com/tencent/mm/protocal/c/ug:umB	Z
    //   1460: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1463: aastore
    //   1464: dup
    //   1465: bipush 8
    //   1467: aload_1
    //   1468: getfield 612	com/tencent/mm/protocal/c/ug:umr	Z
    //   1471: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1474: aastore
    //   1475: dup
    //   1476: bipush 9
    //   1478: aload_1
    //   1479: getfield 617	com/tencent/mm/protocal/c/ug:ums	Z
    //   1482: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1485: aastore
    //   1486: dup
    //   1487: bipush 10
    //   1489: aload_1
    //   1490: getfield 622	com/tencent/mm/protocal/c/ug:umt	Z
    //   1493: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1496: aastore
    //   1497: dup
    //   1498: bipush 11
    //   1500: aload_1
    //   1501: getfield 627	com/tencent/mm/protocal/c/ug:umu	Z
    //   1504: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1507: aastore
    //   1508: dup
    //   1509: bipush 12
    //   1511: aload_1
    //   1512: getfield 632	com/tencent/mm/protocal/c/ug:umv	Z
    //   1515: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1518: aastore
    //   1519: dup
    //   1520: bipush 13
    //   1522: aload_1
    //   1523: getfield 637	com/tencent/mm/protocal/c/ug:umw	Z
    //   1526: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1529: aastore
    //   1530: dup
    //   1531: bipush 14
    //   1533: aload_1
    //   1534: getfield 642	com/tencent/mm/protocal/c/ug:umx	Z
    //   1537: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1540: aastore
    //   1541: dup
    //   1542: bipush 15
    //   1544: aload_1
    //   1545: getfield 647	com/tencent/mm/protocal/c/ug:umy	Z
    //   1548: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1551: aastore
    //   1552: dup
    //   1553: bipush 16
    //   1555: aload_1
    //   1556: getfield 652	com/tencent/mm/protocal/c/ug:umz	Z
    //   1559: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1562: aastore
    //   1563: dup
    //   1564: bipush 17
    //   1566: aload_1
    //   1567: getfield 657	com/tencent/mm/protocal/c/ug:umA	Z
    //   1570: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1573: aastore
    //   1574: invokestatic 268	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1577: ldc 61
    //   1579: ldc_w 665
    //   1582: iconst_1
    //   1583: anewarray 5	java/lang/Object
    //   1586: dup
    //   1587: iconst_0
    //   1588: invokestatic 190	java/lang/System:nanoTime	()J
    //   1591: lload 4
    //   1593: lsub
    //   1594: ldc2_w 666
    //   1597: ldiv
    //   1598: ldc2_w 666
    //   1601: ldiv
    //   1602: invokestatic 672	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1605: aastore
    //   1606: invokestatic 132	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1609: invokestatic 253	com/tencent/mm/plugin/hardwareopt/b/a:aHg	()Lcom/tencent/mm/plugin/hardwareopt/b/a;
    //   1612: invokevirtual 257	com/tencent/mm/plugin/hardwareopt/b/a:aHh	()Lcom/tencent/mm/protocal/c/ahg;
    //   1615: astore_1
    //   1616: ldc2_w 182
    //   1619: ldc -72
    //   1621: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1624: aload_1
    //   1625: areturn
    //   1626: astore_1
    //   1627: ldc 61
    //   1629: aload_1
    //   1630: ldc_w 674
    //   1633: iconst_0
    //   1634: anewarray 5	java/lang/Object
    //   1637: invokestatic 69	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1640: goto -1350 -> 290
    //   1643: astore 8
    //   1645: aconst_null
    //   1646: astore 7
    //   1648: aload 7
    //   1650: astore_1
    //   1651: ldc 61
    //   1653: aload 8
    //   1655: ldc_w 676
    //   1658: iconst_0
    //   1659: anewarray 5	java/lang/Object
    //   1662: invokestatic 69	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1665: aload 7
    //   1667: ifnull -1377 -> 290
    //   1670: aload 7
    //   1672: invokevirtual 323	java/io/RandomAccessFile:close	()V
    //   1675: goto -1385 -> 290
    //   1678: astore_1
    //   1679: ldc 61
    //   1681: aload_1
    //   1682: ldc_w 674
    //   1685: iconst_0
    //   1686: anewarray 5	java/lang/Object
    //   1689: invokestatic 69	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1692: goto -1402 -> 290
    //   1695: astore 7
    //   1697: aconst_null
    //   1698: astore_1
    //   1699: aload_1
    //   1700: ifnull +7 -> 1707
    //   1703: aload_1
    //   1704: invokevirtual 323	java/io/RandomAccessFile:close	()V
    //   1707: aload 7
    //   1709: athrow
    //   1710: astore_1
    //   1711: ldc 61
    //   1713: aload_1
    //   1714: ldc_w 674
    //   1717: iconst_0
    //   1718: anewarray 5	java/lang/Object
    //   1721: invokestatic 69	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1724: goto -17 -> 1707
    //   1727: aload 7
    //   1729: aload_1
    //   1730: invokevirtual 679	android/os/StatFs:getBlockSize	()I
    //   1733: i2l
    //   1734: aload_1
    //   1735: invokevirtual 682	android/os/StatFs:getAvailableBlocks	()I
    //   1738: i2l
    //   1739: lmul
    //   1740: ldc2_w 360
    //   1743: ldiv
    //   1744: ldc2_w 360
    //   1747: ldiv
    //   1748: l2i
    //   1749: putfield 407	com/tencent/mm/protocal/c/bho:uTx	I
    //   1752: goto -1167 -> 585
    //   1755: aload_1
    //   1756: iconst_0
    //   1757: putfield 579	com/tencent/mm/protocal/c/ug:uml	Z
    //   1760: goto -702 -> 1058
    //   1763: aload_1
    //   1764: iconst_0
    //   1765: putfield 609	com/tencent/mm/protocal/c/ug:umB	Z
    //   1768: goto -600 -> 1168
    //   1771: getstatic 688	com/tencent/mm/compatible/d/p:fQG	Lcom/tencent/mm/compatible/d/r;
    //   1774: getfield 693	com/tencent/mm/compatible/d/r:fQO	I
    //   1777: iconst_1
    //   1778: if_icmpne +11 -> 1789
    //   1781: aload_1
    //   1782: iconst_1
    //   1783: putfield 617	com/tencent/mm/protocal/c/ug:ums	Z
    //   1786: goto -576 -> 1210
    //   1789: aload_1
    //   1790: iconst_0
    //   1791: putfield 617	com/tencent/mm/protocal/c/ug:ums	Z
    //   1794: goto -584 -> 1210
    //   1797: aload_1
    //   1798: iconst_0
    //   1799: putfield 642	com/tencent/mm/protocal/c/ug:umx	Z
    //   1802: goto -499 -> 1303
    //   1805: aload_1
    //   1806: iconst_0
    //   1807: putfield 647	com/tencent/mm/protocal/c/ug:umy	Z
    //   1810: goto -482 -> 1328
    //   1813: astore 7
    //   1815: goto -116 -> 1699
    //   1818: astore 8
    //   1820: goto -172 -> 1648
    //   1823: iconst_0
    //   1824: istore 6
    //   1826: goto -1143 -> 683
    //   1829: iconst_0
    //   1830: istore 6
    //   1832: goto -1129 -> 703
    //   1835: iconst_0
    //   1836: istore_2
    //   1837: goto -858 -> 979
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1840	0	this	a
    //   0	1840	1	paramContext	Context
    //   804	1033	2	i	int
    //   810	31	3	j	int
    //   16	1576	4	l	long
    //   681	1150	6	bool	boolean
    //   262	1409	7	localObject1	Object
    //   1695	33	7	localObject2	Object
    //   1813	1	7	localObject3	Object
    //   962	34	8	str	String
    //   1643	11	8	localIOException1	java.io.IOException
    //   1818	1	8	localIOException2	java.io.IOException
    //   178	170	9	localjc	com.tencent.mm.protocal.c.jc
    // Exception table:
    //   from	to	target	type
    //   18	62	62	java/lang/Exception
    //   100	249	62	java/lang/Exception
    //   285	290	62	java/lang/Exception
    //   290	585	62	java/lang/Exception
    //   585	680	62	java/lang/Exception
    //   683	700	62	java/lang/Exception
    //   703	979	62	java/lang/Exception
    //   979	1058	62	java/lang/Exception
    //   1058	1168	62	java/lang/Exception
    //   1168	1210	62	java/lang/Exception
    //   1210	1303	62	java/lang/Exception
    //   1303	1328	62	java/lang/Exception
    //   1328	1616	62	java/lang/Exception
    //   1627	1640	62	java/lang/Exception
    //   1670	1675	62	java/lang/Exception
    //   1679	1692	62	java/lang/Exception
    //   1703	1707	62	java/lang/Exception
    //   1707	1710	62	java/lang/Exception
    //   1711	1724	62	java/lang/Exception
    //   1727	1752	62	java/lang/Exception
    //   1755	1760	62	java/lang/Exception
    //   1763	1768	62	java/lang/Exception
    //   1771	1786	62	java/lang/Exception
    //   1789	1794	62	java/lang/Exception
    //   1797	1802	62	java/lang/Exception
    //   1805	1810	62	java/lang/Exception
    //   285	290	1626	java/io/IOException
    //   249	264	1643	java/io/IOException
    //   1670	1675	1678	java/io/IOException
    //   249	264	1695	finally
    //   1703	1707	1710	java/io/IOException
    //   267	285	1813	finally
    //   1651	1665	1813	finally
    //   267	285	1818	java/io/IOException
  }
  
  static final class a
    extends Exception
  {
    a()
    {
      super();
      GMTrace.i(18661632901120L, 139040);
      GMTrace.o(18661632901120L, 139040);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hardwareopt\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */