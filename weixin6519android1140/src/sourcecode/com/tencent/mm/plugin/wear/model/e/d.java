package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public final class d
  extends a
{
  public d()
  {
    GMTrace.i(9200088383488L, 68546);
    GMTrace.o(9200088383488L, 68546);
  }
  
  public final List<Integer> bBA()
  {
    GMTrace.i(9200222601216L, 68547);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11001));
    localArrayList.add(Integer.valueOf(11004));
    GMTrace.o(9200222601216L, 68547);
    return localArrayList;
  }
  
  /* Error */
  protected final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 48
    //   3: ldc 50
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: iload_1
    //   9: sipush 11001
    //   12: if_icmpne +105 -> 117
    //   15: new 52	com/tencent/mm/protocal/c/brs
    //   18: dup
    //   19: invokespecial 53	com/tencent/mm/protocal/c/brs:<init>	()V
    //   22: astore_3
    //   23: aload_3
    //   24: aload_2
    //   25: invokevirtual 57	com/tencent/mm/protocal/c/brs:aD	([B)Lcom/tencent/mm/bm/a;
    //   28: pop
    //   29: invokestatic 63	com/tencent/mm/bt/b:bRv	()Lcom/tencent/mm/bt/b;
    //   32: getfield 67	com/tencent/mm/bt/b:vnr	J
    //   35: aload_3
    //   36: getfield 70	com/tencent/mm/protocal/c/brs:urf	J
    //   39: lcmp
    //   40: ifle +286 -> 326
    //   43: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   46: invokevirtual 82	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   49: ldc 84
    //   51: invokevirtual 90	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   54: astore_3
    //   55: aload_3
    //   56: astore_2
    //   57: aload_3
    //   58: invokestatic 96	com/tencent/mm/loader/stub/b:c	(Ljava/io/InputStream;)[B
    //   61: astore 4
    //   63: aload 4
    //   65: astore_2
    //   66: aload_3
    //   67: invokestatic 102	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   70: ldc2_w 48
    //   73: ldc 50
    //   75: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   78: aload_2
    //   79: areturn
    //   80: astore 4
    //   82: aconst_null
    //   83: astore_3
    //   84: aload_3
    //   85: astore_2
    //   86: ldc 104
    //   88: aload 4
    //   90: ldc 106
    //   92: iconst_0
    //   93: anewarray 108	java/lang/Object
    //   96: invokestatic 114	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   99: aload_3
    //   100: invokestatic 102	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   103: aconst_null
    //   104: astore_2
    //   105: goto -35 -> 70
    //   108: astore_3
    //   109: aconst_null
    //   110: astore_2
    //   111: aload_2
    //   112: invokestatic 102	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   115: aload_3
    //   116: athrow
    //   117: iload_1
    //   118: sipush 11004
    //   121: if_icmpne +205 -> 326
    //   124: bipush 9
    //   126: invokestatic 120	com/tencent/mm/plugin/wear/model/c/a:xi	(I)V
    //   129: new 122	com/tencent/mm/protocal/c/brt
    //   132: dup
    //   133: invokespecial 123	com/tencent/mm/protocal/c/brt:<init>	()V
    //   136: astore_3
    //   137: aload_3
    //   138: aload_2
    //   139: invokevirtual 124	com/tencent/mm/protocal/c/brt:aD	([B)Lcom/tencent/mm/bm/a;
    //   142: pop
    //   143: new 126	com/tencent/mm/protocal/c/bru
    //   146: dup
    //   147: invokespecial 127	com/tencent/mm/protocal/c/bru:<init>	()V
    //   150: astore_2
    //   151: ldc -127
    //   153: invokestatic 135	com/tencent/mm/kernel/h:j	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   156: checkcast 129	com/tencent/mm/plugin/emoji/b/c
    //   159: invokeinterface 139 1 0
    //   164: ifnull +90 -> 254
    //   167: ldc -127
    //   169: invokestatic 135	com/tencent/mm/kernel/h:j	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   172: checkcast 129	com/tencent/mm/plugin/emoji/b/c
    //   175: invokeinterface 139 1 0
    //   180: aload_3
    //   181: getfield 143	com/tencent/mm/protocal/c/brt:tXF	Ljava/lang/String;
    //   184: invokeinterface 149 2 0
    //   189: astore 4
    //   191: aload 4
    //   193: ifnull +61 -> 254
    //   196: aload 4
    //   198: invokeinterface 153 1 0
    //   203: astore 4
    //   205: aload 4
    //   207: invokeinterface 159 1 0
    //   212: ifeq +42 -> 254
    //   215: aload 4
    //   217: invokeinterface 163 1 0
    //   222: checkcast 165	com/tencent/mm/storage/emotion/EmojiInfo
    //   225: astore 5
    //   227: aload 5
    //   229: invokevirtual 169	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
    //   232: invokestatic 175	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   235: ifne -30 -> 205
    //   238: aload_2
    //   239: getfield 179	com/tencent/mm/protocal/c/bru:tSJ	Ljava/util/LinkedList;
    //   242: aload 5
    //   244: invokevirtual 169	com/tencent/mm/storage/emotion/EmojiInfo:GS	()Ljava/lang/String;
    //   247: invokevirtual 182	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   250: pop
    //   251: goto -46 -> 205
    //   254: aload_2
    //   255: getfield 179	com/tencent/mm/protocal/c/bru:tSJ	Ljava/util/LinkedList;
    //   258: invokevirtual 186	java/util/LinkedList:size	()I
    //   261: ifne +49 -> 310
    //   264: new 188	com/tencent/mm/g/a/td
    //   267: dup
    //   268: invokespecial 189	com/tencent/mm/g/a/td:<init>	()V
    //   271: astore 4
    //   273: aload 4
    //   275: getfield 193	com/tencent/mm/g/a/td:eYI	Lcom/tencent/mm/g/a/td$a;
    //   278: iconst_1
    //   279: anewarray 195	java/lang/String
    //   282: dup
    //   283: iconst_0
    //   284: aload_3
    //   285: getfield 143	com/tencent/mm/protocal/c/brt:tXF	Ljava/lang/String;
    //   288: aastore
    //   289: putfield 201	com/tencent/mm/g/a/td$a:eYJ	[Ljava/lang/String;
    //   292: aload 4
    //   294: getfield 193	com/tencent/mm/g/a/td:eYI	Lcom/tencent/mm/g/a/td$a;
    //   297: iconst_1
    //   298: putfield 205	com/tencent/mm/g/a/td$a:eCx	I
    //   301: getstatic 211	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   304: aload 4
    //   306: invokevirtual 214	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   309: pop
    //   310: aload_2
    //   311: invokevirtual 218	com/tencent/mm/protocal/c/bru:toByteArray	()[B
    //   314: astore_2
    //   315: ldc2_w 48
    //   318: ldc 50
    //   320: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   323: aload_2
    //   324: areturn
    //   325: astore_2
    //   326: ldc2_w 48
    //   329: ldc 50
    //   331: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   334: aconst_null
    //   335: areturn
    //   336: astore_2
    //   337: goto -308 -> 29
    //   340: astore_2
    //   341: goto -198 -> 143
    //   344: astore_3
    //   345: goto -234 -> 111
    //   348: astore 4
    //   350: goto -266 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	353	0	this	d
    //   0	353	1	paramInt	int
    //   0	353	2	paramArrayOfByte	byte[]
    //   22	78	3	localObject1	Object
    //   108	8	3	localObject2	Object
    //   136	149	3	localbrt	com.tencent.mm.protocal.c.brt
    //   344	1	3	localObject3	Object
    //   61	3	4	arrayOfByte	byte[]
    //   80	9	4	localIOException1	java.io.IOException
    //   189	116	4	localObject4	Object
    //   348	1	4	localIOException2	java.io.IOException
    //   225	18	5	localEmojiInfo	com.tencent.mm.storage.emotion.EmojiInfo
    // Exception table:
    //   from	to	target	type
    //   43	55	80	java/io/IOException
    //   43	55	108	finally
    //   310	315	325	java/io/IOException
    //   23	29	336	java/io/IOException
    //   137	143	340	java/io/IOException
    //   57	63	344	finally
    //   86	99	344	finally
    //   57	63	348	java/io/IOException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */