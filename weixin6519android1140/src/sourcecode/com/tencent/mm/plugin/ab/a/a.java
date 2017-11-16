package com.tencent.mm.plugin.ab.a;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.scanner.util.f;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Set;

public final class a
{
  Set<Integer> eRr;
  boolean hy;
  a nYK;
  long nYL;
  
  public a()
  {
    GMTrace.i(6673037000704L, 49718);
    this.nYK = null;
    this.nYL = 0L;
    this.hy = false;
    GMTrace.o(6673037000704L, 49718);
  }
  
  private d a(com.tencent.mm.plugin.scanner.util.d paramd, Bitmap paramBitmap, int paramInt)
  {
    GMTrace.i(6673305436160L, 49720);
    paramBitmap = new f(paramBitmap, paramInt, paramInt);
    if ((paramBitmap.bdo() == null) || (paramBitmap.width <= 0) || (paramBitmap.height <= 0))
    {
      GMTrace.o(6673305436160L, 49720);
      return null;
    }
    paramd = paramd.a(paramBitmap, this.eRr);
    GMTrace.o(6673305436160L, 49720);
    return paramd;
  }
  
  /* Error */
  final d Fj(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 78
    //   3: ldc 80
    //   5: invokestatic 34	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: ifnull +10 -> 19
    //   12: aload_1
    //   13: invokevirtual 86	java/lang/String:length	()I
    //   16: ifgt +20 -> 36
    //   19: ldc 88
    //   21: ldc 90
    //   23: invokestatic 96	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: ldc2_w 78
    //   29: ldc 80
    //   31: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: aconst_null
    //   35: areturn
    //   36: aload_1
    //   37: invokestatic 102	com/tencent/mm/sdk/platformtools/d:RB	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   40: astore 10
    //   42: aload 10
    //   44: ifnull +17 -> 61
    //   47: aload 10
    //   49: iconst_0
    //   50: putfield 107	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   53: aload 10
    //   55: getstatic 113	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
    //   58: putfield 116	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   61: aload_0
    //   62: getfield 40	com/tencent/mm/plugin/ab/a/a:hy	Z
    //   65: ifne +418 -> 483
    //   68: aload_1
    //   69: aload 10
    //   71: invokestatic 120	com/tencent/mm/sdk/platformtools/d:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   74: astore 11
    //   76: aload 11
    //   78: ifnonnull +20 -> 98
    //   81: ldc 88
    //   83: ldc 122
    //   85: invokestatic 96	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   88: ldc2_w 78
    //   91: ldc 80
    //   93: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   96: aconst_null
    //   97: areturn
    //   98: new 70	com/tencent/mm/plugin/scanner/util/d
    //   101: dup
    //   102: aconst_null
    //   103: iconst_0
    //   104: iconst_0
    //   105: invokespecial 125	com/tencent/mm/plugin/scanner/util/d:<init>	(Lcom/tencent/mm/plugin/scanner/util/b$a;IZ)V
    //   108: astore 12
    //   110: invokestatic 131	android/os/SystemClock:elapsedRealtime	()J
    //   113: lstore 5
    //   115: aload_0
    //   116: aload 12
    //   118: aload 11
    //   120: iconst_3
    //   121: invokespecial 133	com/tencent/mm/plugin/ab/a/a:a	(Lcom/tencent/mm/plugin/scanner/util/d;Landroid/graphics/Bitmap;I)Lcom/tencent/mm/plugin/ab/a/d;
    //   124: astore 10
    //   126: getstatic 139	com/tencent/mm/plugin/scanner/a/l:oto	Lcom/tencent/mm/plugin/scanner/a/l;
    //   129: invokevirtual 142	com/tencent/mm/plugin/scanner/a/l:bcs	()V
    //   132: invokestatic 131	android/os/SystemClock:elapsedRealtime	()J
    //   135: lload 5
    //   137: lsub
    //   138: lstore 7
    //   140: ldc 88
    //   142: new 144	java/lang/StringBuilder
    //   145: dup
    //   146: ldc -110
    //   148: invokespecial 149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   151: lload 7
    //   153: invokevirtual 153	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   156: invokevirtual 157	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: invokestatic 160	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   162: aload 10
    //   164: ifnull +325 -> 489
    //   167: aload 10
    //   169: astore_1
    //   170: aload 10
    //   172: getfield 166	com/tencent/mm/plugin/ab/a/d:result	Ljava/lang/String;
    //   175: invokestatic 172	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   178: ifeq +182 -> 360
    //   181: goto +308 -> 489
    //   184: ldc2_w 173
    //   187: lload 5
    //   189: ldiv
    //   190: l2i
    //   191: istore_3
    //   192: ldc 88
    //   194: ldc -80
    //   196: iconst_1
    //   197: anewarray 4	java/lang/Object
    //   200: dup
    //   201: iconst_0
    //   202: iload_3
    //   203: invokestatic 182	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   206: aastore
    //   207: invokestatic 185	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   210: iconst_1
    //   211: istore_2
    //   212: aload 10
    //   214: astore_1
    //   215: iload_2
    //   216: iload_3
    //   217: if_icmpge +143 -> 360
    //   220: aload 10
    //   222: astore_1
    //   223: aload_0
    //   224: getfield 40	com/tencent/mm/plugin/ab/a/a:hy	Z
    //   227: ifne +133 -> 360
    //   230: iload_2
    //   231: bipush 8
    //   233: imul
    //   234: iconst_3
    //   235: iadd
    //   236: istore 4
    //   238: aload 10
    //   240: astore_1
    //   241: iload 4
    //   243: aload 11
    //   245: invokevirtual 190	android/graphics/Bitmap:getWidth	()I
    //   248: if_icmpge +112 -> 360
    //   251: aload 10
    //   253: astore_1
    //   254: iload 4
    //   256: aload 11
    //   258: invokevirtual 193	android/graphics/Bitmap:getHeight	()I
    //   261: if_icmpge +99 -> 360
    //   264: aload 10
    //   266: astore_1
    //   267: invokestatic 198	java/lang/System:currentTimeMillis	()J
    //   270: aload_0
    //   271: getfield 38	com/tencent/mm/plugin/ab/a/a:nYL	J
    //   274: lsub
    //   275: ldc2_w 199
    //   278: lcmp
    //   279: ifgt +81 -> 360
    //   282: aload_0
    //   283: aload 12
    //   285: aload 11
    //   287: iload 4
    //   289: invokespecial 133	com/tencent/mm/plugin/ab/a/a:a	(Lcom/tencent/mm/plugin/scanner/util/d;Landroid/graphics/Bitmap;I)Lcom/tencent/mm/plugin/ab/a/d;
    //   292: astore_1
    //   293: getstatic 139	com/tencent/mm/plugin/scanner/a/l:oto	Lcom/tencent/mm/plugin/scanner/a/l;
    //   296: invokevirtual 142	com/tencent/mm/plugin/scanner/a/l:bcs	()V
    //   299: aload_1
    //   300: ifnull +125 -> 425
    //   303: aload_1
    //   304: getfield 166	com/tencent/mm/plugin/ab/a/d:result	Ljava/lang/String;
    //   307: invokestatic 172	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   310: ifne +115 -> 425
    //   313: ldc 88
    //   315: ldc -54
    //   317: iconst_4
    //   318: anewarray 4	java/lang/Object
    //   321: dup
    //   322: iconst_0
    //   323: iload_2
    //   324: invokestatic 182	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   327: aastore
    //   328: dup
    //   329: iconst_1
    //   330: iload_3
    //   331: invokestatic 182	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   334: aastore
    //   335: dup
    //   336: iconst_2
    //   337: aload 11
    //   339: invokevirtual 190	android/graphics/Bitmap:getWidth	()I
    //   342: invokestatic 182	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   345: aastore
    //   346: dup
    //   347: iconst_3
    //   348: aload 11
    //   350: invokevirtual 193	android/graphics/Bitmap:getHeight	()I
    //   353: invokestatic 182	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   356: aastore
    //   357: invokestatic 204	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   360: aload 12
    //   362: invokevirtual 207	com/tencent/mm/plugin/scanner/util/d:releaseDecoder	()V
    //   365: aload_1
    //   366: ifnonnull +69 -> 435
    //   369: iconst_1
    //   370: istore 9
    //   372: ldc 88
    //   374: ldc -47
    //   376: iconst_1
    //   377: anewarray 4	java/lang/Object
    //   380: dup
    //   381: iconst_0
    //   382: iload 9
    //   384: invokestatic 214	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   387: aastore
    //   388: invokestatic 204	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   391: aload_1
    //   392: astore 10
    //   394: aload_1
    //   395: ifnull +72 -> 467
    //   398: aload_1
    //   399: getfield 166	com/tencent/mm/plugin/ab/a/d:result	Ljava/lang/String;
    //   402: invokestatic 172	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   405: istore 9
    //   407: aload_1
    //   408: astore 10
    //   410: iload 9
    //   412: ifne +55 -> 467
    //   415: ldc2_w 78
    //   418: ldc 80
    //   420: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   423: aload_1
    //   424: areturn
    //   425: iload_2
    //   426: iconst_1
    //   427: iadd
    //   428: istore_2
    //   429: aload_1
    //   430: astore 10
    //   432: goto -220 -> 212
    //   435: iconst_0
    //   436: istore 9
    //   438: goto -66 -> 372
    //   441: astore 10
    //   443: aconst_null
    //   444: astore_1
    //   445: ldc 88
    //   447: ldc -40
    //   449: iconst_1
    //   450: anewarray 4	java/lang/Object
    //   453: dup
    //   454: iconst_0
    //   455: aload 10
    //   457: invokevirtual 219	java/lang/OutOfMemoryError:getMessage	()Ljava/lang/String;
    //   460: aastore
    //   461: invokestatic 221	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   464: aload_1
    //   465: astore 10
    //   467: ldc2_w 78
    //   470: ldc 80
    //   472: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   475: aload 10
    //   477: areturn
    //   478: astore 10
    //   480: goto -35 -> 445
    //   483: aconst_null
    //   484: astore 10
    //   486: goto -19 -> 467
    //   489: lload 7
    //   491: lstore 5
    //   493: lload 7
    //   495: lconst_0
    //   496: lcmp
    //   497: ifne -313 -> 184
    //   500: lconst_1
    //   501: lstore 5
    //   503: goto -319 -> 184
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	506	0	this	a
    //   0	506	1	paramString	String
    //   211	218	2	i	int
    //   191	140	3	j	int
    //   236	52	4	k	int
    //   113	389	5	l1	long
    //   138	356	7	l2	long
    //   370	67	9	bool	boolean
    //   40	391	10	localObject1	Object
    //   441	15	10	localOutOfMemoryError1	OutOfMemoryError
    //   465	11	10	str	String
    //   478	1	10	localOutOfMemoryError2	OutOfMemoryError
    //   484	1	10	localObject2	Object
    //   74	275	11	localBitmap	Bitmap
    //   108	253	12	locald	com.tencent.mm.plugin.scanner.util.d
    // Exception table:
    //   from	to	target	type
    //   68	76	441	java/lang/OutOfMemoryError
    //   81	88	441	java/lang/OutOfMemoryError
    //   98	162	441	java/lang/OutOfMemoryError
    //   170	181	441	java/lang/OutOfMemoryError
    //   184	210	441	java/lang/OutOfMemoryError
    //   223	230	441	java/lang/OutOfMemoryError
    //   241	251	441	java/lang/OutOfMemoryError
    //   254	264	441	java/lang/OutOfMemoryError
    //   267	299	441	java/lang/OutOfMemoryError
    //   303	360	441	java/lang/OutOfMemoryError
    //   360	365	441	java/lang/OutOfMemoryError
    //   372	391	478	java/lang/OutOfMemoryError
    //   398	407	478	java/lang/OutOfMemoryError
  }
  
  public static abstract interface a
  {
    public abstract int a(d paramd);
  }
  
  final class b
    extends AsyncTask<String, Integer, d>
  {
    b()
    {
      GMTrace.i(6670084210688L, 49696);
      GMTrace.o(6670084210688L, 49696);
    }
    
    private d x(String... paramVarArgs)
    {
      Object localObject4 = null;
      Object localObject3 = null;
      GMTrace.i(6670218428416L, 49697);
      w.d("dktest", "doInBackground :" + paramVarArgs);
      if ((paramVarArgs == null) || (paramVarArgs.length != 1))
      {
        GMTrace.o(6670218428416L, 49697);
        return null;
      }
      localObject1 = localObject3;
      localObject2 = localObject4;
      try
      {
        a.this.nYL = System.currentTimeMillis();
        localObject1 = localObject3;
        localObject2 = localObject4;
        g.a locala = new g.a();
        localObject1 = localObject3;
        localObject2 = localObject4;
        paramVarArgs = a.this.Fj(paramVarArgs[0]);
        localObject1 = paramVarArgs;
        localObject2 = paramVarArgs;
        w.d("MicroMsg.scanner.DecodeFile", "time: " + locala.tD());
      }
      catch (OutOfMemoryError paramVarArgs)
      {
        for (;;)
        {
          w.e("MicroMsg.scanner.DecodeFile", "decode failed, OutOfMemoryError");
          paramVarArgs = (String[])localObject1;
        }
      }
      catch (Exception paramVarArgs)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.scanner.DecodeFile", paramVarArgs, "decode failed due to Exception", new Object[] { "" });
          paramVarArgs = (String[])localObject2;
        }
      }
      GMTrace.o(6670218428416L, 49697);
      return paramVarArgs;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ab\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */