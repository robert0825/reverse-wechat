package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bsb;
import java.util.ArrayList;
import java.util.List;

public final class i
  extends a
{
  public bsb rAy;
  
  public i()
  {
    GMTrace.i(9207470358528L, 68601);
    GMTrace.o(9207470358528L, 68601);
  }
  
  public final List<Integer> bBA()
  {
    GMTrace.i(9207604576256L, 68602);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11002));
    GMTrace.o(9207604576256L, 68602);
    return localArrayList;
  }
  
  /* Error */
  protected final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 52
    //   3: ldc 54
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: iload_1
    //   9: sipush 11002
    //   12: if_icmpne +291 -> 303
    //   15: iconst_1
    //   16: iconst_0
    //   17: invokestatic 60	com/tencent/mm/plugin/wear/model/c/a:dC	(II)V
    //   20: iconst_0
    //   21: invokestatic 64	com/tencent/mm/plugin/wear/model/c/a:xi	(I)V
    //   24: new 66	com/tencent/mm/g/a/td
    //   27: dup
    //   28: invokespecial 67	com/tencent/mm/g/a/td:<init>	()V
    //   31: astore 4
    //   33: aload 4
    //   35: getfield 71	com/tencent/mm/g/a/td:eYI	Lcom/tencent/mm/g/a/td$a;
    //   38: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   41: invokevirtual 83	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   44: getstatic 89	com/tencent/mm/R$c:aMn	I
    //   47: invokevirtual 95	android/content/res/Resources:getStringArray	(I)[Ljava/lang/String;
    //   50: putfield 101	com/tencent/mm/g/a/td$a:eYJ	[Ljava/lang/String;
    //   53: aload 4
    //   55: getfield 71	com/tencent/mm/g/a/td:eYI	Lcom/tencent/mm/g/a/td$a;
    //   58: iconst_1
    //   59: putfield 104	com/tencent/mm/g/a/td$a:eCx	I
    //   62: getstatic 110	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   65: aload 4
    //   67: invokevirtual 113	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   70: pop
    //   71: invokestatic 119	com/tencent/mm/plugin/wear/model/a:bBm	()Lcom/tencent/mm/plugin/wear/model/a;
    //   74: getfield 123	com/tencent/mm/plugin/wear/model/a:rzt	Lcom/tencent/mm/plugin/wear/model/d;
    //   77: aload_2
    //   78: invokevirtual 129	com/tencent/mm/plugin/wear/model/d:aR	([B)[B
    //   81: astore_2
    //   82: aload_2
    //   83: ifnull +220 -> 303
    //   86: new 131	com/tencent/mm/protocal/c/bsb
    //   89: dup
    //   90: invokespecial 132	com/tencent/mm/protocal/c/bsb:<init>	()V
    //   93: astore 5
    //   95: aload 5
    //   97: aload_2
    //   98: invokevirtual 136	com/tencent/mm/protocal/c/bsb:aD	([B)Lcom/tencent/mm/bm/a;
    //   101: pop
    //   102: new 138	com/tencent/mm/protocal/c/bsc
    //   105: dup
    //   106: invokespecial 139	com/tencent/mm/protocal/c/bsc:<init>	()V
    //   109: astore 6
    //   111: bipush 20
    //   113: istore_1
    //   114: aconst_null
    //   115: astore_2
    //   116: aload_2
    //   117: astore 4
    //   119: iload_1
    //   120: ifle +32 -> 152
    //   123: invokestatic 145	com/tencent/mm/y/q:zE	()Ljava/lang/String;
    //   126: astore_2
    //   127: aload_2
    //   128: invokestatic 151	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   131: istore_3
    //   132: aload_2
    //   133: astore 4
    //   135: iload_3
    //   136: ifeq +16 -> 152
    //   139: ldc2_w 152
    //   142: invokestatic 159	java/lang/Thread:sleep	(J)V
    //   145: iload_1
    //   146: iconst_1
    //   147: isub
    //   148: istore_1
    //   149: goto -33 -> 116
    //   152: aload 4
    //   154: invokestatic 151	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   157: istore_3
    //   158: iload_3
    //   159: ifeq +13 -> 172
    //   162: ldc2_w 52
    //   165: ldc 54
    //   167: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   170: aconst_null
    //   171: areturn
    //   172: aload 6
    //   174: aload 4
    //   176: putfield 163	com/tencent/mm/protocal/c/bsc:tRz	Ljava/lang/String;
    //   179: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   182: invokestatic 166	com/tencent/mm/sdk/platformtools/ab:bPU	()Ljava/lang/String;
    //   185: iconst_0
    //   186: invokevirtual 170	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   189: invokestatic 176	com/tencent/mm/sdk/platformtools/v:e	(Landroid/content/SharedPreferences;)Ljava/lang/String;
    //   192: astore_2
    //   193: invokestatic 179	com/tencent/mm/sdk/platformtools/v:bPK	()Ljava/lang/String;
    //   196: astore 4
    //   198: aload_2
    //   199: ldc -75
    //   201: invokevirtual 186	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   204: ifeq +77 -> 281
    //   207: aload 6
    //   209: aload 4
    //   211: putfield 189	com/tencent/mm/protocal/c/bsc:kBh	Ljava/lang/String;
    //   214: aload 6
    //   216: invokevirtual 193	com/tencent/mm/protocal/c/bsc:toByteArray	()[B
    //   219: astore_2
    //   220: invokestatic 119	com/tencent/mm/plugin/wear/model/a:bBm	()Lcom/tencent/mm/plugin/wear/model/a;
    //   223: getfield 123	com/tencent/mm/plugin/wear/model/a:rzt	Lcom/tencent/mm/plugin/wear/model/d;
    //   226: aload_2
    //   227: invokevirtual 196	com/tencent/mm/plugin/wear/model/d:aS	([B)[B
    //   230: astore_2
    //   231: aload_2
    //   232: ifnull +81 -> 313
    //   235: aload_0
    //   236: aload 5
    //   238: putfield 198	com/tencent/mm/plugin/wear/model/e/i:rAy	Lcom/tencent/mm/protocal/c/bsb;
    //   241: new 200	com/tencent/mm/g/a/te
    //   244: dup
    //   245: invokespecial 201	com/tencent/mm/g/a/te:<init>	()V
    //   248: astore 4
    //   250: aload 4
    //   252: getfield 205	com/tencent/mm/g/a/te:eYK	Lcom/tencent/mm/g/a/te$a;
    //   255: bipush 9
    //   257: putfield 208	com/tencent/mm/g/a/te$a:eCx	I
    //   260: getstatic 110	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   263: aload 4
    //   265: invokestatic 214	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   268: invokevirtual 218	com/tencent/mm/sdk/b/a:a	(Lcom/tencent/mm/sdk/b/b;Landroid/os/Looper;)V
    //   271: ldc2_w 52
    //   274: ldc 54
    //   276: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   279: aload_2
    //   280: areturn
    //   281: aload 6
    //   283: aload_2
    //   284: putfield 189	com/tencent/mm/protocal/c/bsc:kBh	Ljava/lang/String;
    //   287: goto -73 -> 214
    //   290: astore_2
    //   291: ldc -36
    //   293: aload_2
    //   294: ldc -34
    //   296: iconst_0
    //   297: anewarray 224	java/lang/Object
    //   300: invokestatic 230	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   303: ldc2_w 52
    //   306: ldc 54
    //   308: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   311: aconst_null
    //   312: areturn
    //   313: ldc2_w 52
    //   316: ldc 54
    //   318: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   321: aconst_null
    //   322: areturn
    //   323: astore 4
    //   325: goto -180 -> 145
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	328	0	this	i
    //   0	328	1	paramInt	int
    //   0	328	2	paramArrayOfByte	byte[]
    //   131	28	3	bool	boolean
    //   31	233	4	localObject	Object
    //   323	1	4	localInterruptedException	InterruptedException
    //   93	144	5	localbsb	bsb
    //   109	173	6	localbsc	com.tencent.mm.protocal.c.bsc
    // Exception table:
    //   from	to	target	type
    //   86	111	290	java/io/IOException
    //   123	132	290	java/io/IOException
    //   139	145	290	java/io/IOException
    //   152	158	290	java/io/IOException
    //   172	214	290	java/io/IOException
    //   214	231	290	java/io/IOException
    //   235	271	290	java/io/IOException
    //   281	287	290	java/io/IOException
    //   139	145	323	java/lang/InterruptedException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */