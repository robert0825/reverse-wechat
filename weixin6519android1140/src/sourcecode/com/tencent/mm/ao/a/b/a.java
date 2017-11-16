package com.tencent.mm.ao.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.c.f;
import com.tencent.mm.ao.a.g.b;
import com.tencent.mm.modelsfs.SFSContext;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class a
  implements com.tencent.mm.ao.a.c.a
{
  private f gLf;
  
  public a()
  {
    GMTrace.i(13720541462528L, 102226);
    GMTrace.o(13720541462528L, 102226);
  }
  
  private String a(String paramString, c paramc)
  {
    GMTrace.i(13720675680256L, 102227);
    Object localObject2 = paramc.gKE;
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((String)localObject2).length() != 0) {}
    }
    else
    {
      localObject2 = paramc.gKF;
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((String)localObject2).length() != 0) {
          localObject1 = (String)localObject2 + File.separator + this.gLf.kt(paramString);
        }
      }
    }
    localObject2 = localObject1;
    if (paramc.gKB)
    {
      localObject2 = localObject1;
      if (bg.nm((String)localObject1)) {
        localObject2 = b.Jp() + File.separator + this.gLf.kt(paramString);
      }
    }
    if ((localObject2 == null) || (((String)localObject2).length() == 0))
    {
      GMTrace.o(13720675680256L, 102227);
      return null;
    }
    GMTrace.o(13720675680256L, 102227);
    return (String)localObject2;
  }
  
  private String b(String paramString, c paramc)
  {
    GMTrace.i(13720809897984L, 102228);
    String str1 = paramc.gKG;
    Object localObject;
    if (str1 != null)
    {
      localObject = str1;
      if (str1.length() != 0) {}
    }
    else
    {
      String str2 = paramc.gKE;
      localObject = str1;
      if (str2 != null)
      {
        localObject = str1;
        if (str2.length() > 0)
        {
          paramc = paramc.gKF;
          if ((paramc == null) || (paramc.length() == 0) || (!str2.startsWith(paramc)))
          {
            w.e("MicroMsg.imageloader.DefaultImageDiskCache", "[johnw] SFS can't deal with absolute path: %s", new Object[] { str2 });
            throw new IllegalArgumentException("SFS can't deal with absolute path: " + str2);
          }
          paramc = str2.substring(paramc.length());
          localObject = paramc;
          if (paramc.startsWith("/")) {
            localObject = paramc.substring(1);
          }
        }
      }
    }
    if (localObject != null)
    {
      paramc = (c)localObject;
      if (((String)localObject).length() != 0) {}
    }
    else
    {
      paramc = this.gLf.kt(paramString);
    }
    if ((paramc == null) || (paramc.length() == 0))
    {
      GMTrace.o(13720809897984L, 102228);
      return null;
    }
    GMTrace.o(13720809897984L, 102228);
    return paramc;
  }
  
  public final void Jo()
  {
    GMTrace.i(13721212551168L, 102231);
    b.Jr();
    GMTrace.o(13721212551168L, 102231);
  }
  
  public final void a(f paramf)
  {
    GMTrace.i(13721480986624L, 102233);
    this.gLf = paramf;
    GMTrace.o(13721480986624L, 102233);
  }
  
  /* Error */
  public final boolean a(String paramString, byte[] paramArrayOfByte, c paramc)
  {
    // Byte code:
    //   0: ldc2_w 136
    //   3: ldc -118
    //   5: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_3
    //   9: getfield 142	com/tencent/mm/ao/a/a/c:gKX	Lcom/tencent/mm/modelsfs/SFSContext;
    //   12: astore 7
    //   14: aload 7
    //   16: ifnull +157 -> 173
    //   19: aload_0
    //   20: aload_1
    //   21: aload_3
    //   22: invokespecial 144	com/tencent/mm/ao/a/b/a:b	(Ljava/lang/String;Lcom/tencent/mm/ao/a/a/c;)Ljava/lang/String;
    //   25: astore 6
    //   27: aload 6
    //   29: ifnonnull +13 -> 42
    //   32: ldc2_w 136
    //   35: ldc -118
    //   37: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   40: iconst_0
    //   41: ireturn
    //   42: aconst_null
    //   43: astore 5
    //   45: aload 5
    //   47: astore_3
    //   48: aload 7
    //   50: getfield 150	com/tencent/mm/modelsfs/SFSContext:mNativePtr	J
    //   53: lconst_0
    //   54: lcmp
    //   55: ifne +35 -> 90
    //   58: aload 5
    //   60: astore_3
    //   61: new 106	java/lang/IllegalArgumentException
    //   64: dup
    //   65: ldc -104
    //   67: invokespecial 112	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   70: athrow
    //   71: astore_1
    //   72: aload_3
    //   73: ifnull +7 -> 80
    //   76: aload_3
    //   77: invokevirtual 157	java/io/OutputStream:close	()V
    //   80: ldc2_w 136
    //   83: ldc -118
    //   85: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   88: iconst_0
    //   89: ireturn
    //   90: ldc -97
    //   92: astore 4
    //   94: aload 5
    //   96: astore_3
    //   97: aload 6
    //   99: astore_1
    //   100: aload 6
    //   102: invokestatic 164	com/tencent/mm/modelsfs/f:le	(Ljava/lang/String;)Z
    //   105: ifeq +22 -> 127
    //   108: aload 5
    //   110: astore_3
    //   111: aload 6
    //   113: invokestatic 167	com/tencent/mm/modelsfs/f:lh	(Ljava/lang/String;)Ljava/lang/String;
    //   116: astore 4
    //   118: aload 5
    //   120: astore_3
    //   121: aload 6
    //   123: invokestatic 170	com/tencent/mm/modelsfs/f:lf	(Ljava/lang/String;)Ljava/lang/String;
    //   126: astore_1
    //   127: aload 5
    //   129: astore_3
    //   130: aload 7
    //   132: aload_1
    //   133: aload 4
    //   135: invokevirtual 174	com/tencent/mm/modelsfs/SFSContext:aj	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/OutputStream;
    //   138: astore_1
    //   139: aload_1
    //   140: astore_3
    //   141: aload_1
    //   142: aload_2
    //   143: invokevirtual 178	java/io/OutputStream:write	([B)V
    //   146: aload_1
    //   147: invokevirtual 157	java/io/OutputStream:close	()V
    //   150: ldc2_w 136
    //   153: ldc -118
    //   155: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   158: iconst_1
    //   159: ireturn
    //   160: astore_1
    //   161: aconst_null
    //   162: astore_2
    //   163: aload_2
    //   164: ifnull +7 -> 171
    //   167: aload_2
    //   168: invokevirtual 157	java/io/OutputStream:close	()V
    //   171: aload_1
    //   172: athrow
    //   173: aload_0
    //   174: aload_1
    //   175: aload_3
    //   176: invokespecial 180	com/tencent/mm/ao/a/b/a:a	(Ljava/lang/String;Lcom/tencent/mm/ao/a/a/c;)Ljava/lang/String;
    //   179: astore_1
    //   180: aload_1
    //   181: ifnonnull +13 -> 194
    //   184: ldc2_w 136
    //   187: ldc -118
    //   189: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   192: iconst_0
    //   193: ireturn
    //   194: new 54	java/io/File
    //   197: dup
    //   198: aload_1
    //   199: invokespecial 181	java/io/File:<init>	(Ljava/lang/String;)V
    //   202: invokevirtual 185	java/io/File:getParentFile	()Ljava/io/File;
    //   205: astore_3
    //   206: aload_3
    //   207: ifnull +15 -> 222
    //   210: aload_3
    //   211: invokevirtual 188	java/io/File:exists	()Z
    //   214: ifne +8 -> 222
    //   217: aload_3
    //   218: invokevirtual 191	java/io/File:mkdirs	()Z
    //   221: pop
    //   222: new 54	java/io/File
    //   225: dup
    //   226: aload_1
    //   227: invokespecial 181	java/io/File:<init>	(Ljava/lang/String;)V
    //   230: astore_3
    //   231: aload_3
    //   232: invokevirtual 188	java/io/File:exists	()Z
    //   235: ifne +8 -> 243
    //   238: aload_3
    //   239: invokevirtual 194	java/io/File:createNewFile	()Z
    //   242: pop
    //   243: aload_2
    //   244: ifnull -94 -> 150
    //   247: aload_1
    //   248: aload_2
    //   249: aload_2
    //   250: arraylength
    //   251: invokestatic 199	com/tencent/mm/a/e:b	(Ljava/lang/String;[BI)I
    //   254: ifge -104 -> 150
    //   257: ldc2_w 136
    //   260: ldc -118
    //   262: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   265: iconst_0
    //   266: ireturn
    //   267: astore_3
    //   268: ldc 96
    //   270: aload_3
    //   271: invokestatic 203	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   274: invokestatic 206	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   277: goto -34 -> 243
    //   280: astore_1
    //   281: goto -131 -> 150
    //   284: astore_1
    //   285: goto -205 -> 80
    //   288: astore_2
    //   289: goto -118 -> 171
    //   292: astore_3
    //   293: aload_1
    //   294: astore_2
    //   295: aload_3
    //   296: astore_1
    //   297: goto -134 -> 163
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	300	0	this	a
    //   0	300	1	paramString	String
    //   0	300	2	paramArrayOfByte	byte[]
    //   0	300	3	paramc	c
    //   92	42	4	str1	String
    //   43	85	5	localObject	Object
    //   25	97	6	str2	String
    //   12	119	7	localSFSContext	SFSContext
    // Exception table:
    //   from	to	target	type
    //   48	58	71	java/io/IOException
    //   61	71	71	java/io/IOException
    //   100	108	71	java/io/IOException
    //   111	118	71	java/io/IOException
    //   121	127	71	java/io/IOException
    //   130	139	71	java/io/IOException
    //   141	146	71	java/io/IOException
    //   48	58	160	finally
    //   61	71	160	finally
    //   100	108	160	finally
    //   111	118	160	finally
    //   121	127	160	finally
    //   130	139	160	finally
    //   238	243	267	java/lang/Exception
    //   146	150	280	java/io/IOException
    //   76	80	284	java/io/IOException
    //   167	171	288	java/io/IOException
    //   141	146	292	finally
  }
  
  public final boolean c(String paramString, c paramc)
  {
    GMTrace.i(13721078333440L, 102230);
    SFSContext localSFSContext = paramc.gKX;
    if (localSFSContext != null)
    {
      paramString = b(paramString, paramc);
      if (paramString == null)
      {
        GMTrace.o(13721078333440L, 102230);
        return false;
      }
      bool = localSFSContext.hB(paramString);
      GMTrace.o(13721078333440L, 102230);
      return bool;
    }
    paramString = a(paramString, paramc);
    if (paramString == null)
    {
      GMTrace.o(13721078333440L, 102230);
      return false;
    }
    boolean bool = new File(paramString).delete();
    GMTrace.o(13721078333440L, 102230);
    return bool;
  }
  
  public final InputStream d(String paramString, c paramc)
  {
    GMTrace.i(13721346768896L, 102232);
    try
    {
      SFSContext localSFSContext = paramc.gKX;
      if (localSFSContext != null)
      {
        paramString = b(paramString, paramc);
        if (paramString == null)
        {
          GMTrace.o(13721346768896L, 102232);
          return null;
        }
        paramString = localSFSContext.openRead(paramString);
        GMTrace.o(13721346768896L, 102232);
        return paramString;
      }
      paramString = a(paramString, paramc);
      if (paramString == null)
      {
        GMTrace.o(13721346768896L, 102232);
        return null;
      }
      paramString = new FileInputStream(paramString);
      GMTrace.o(13721346768896L, 102232);
      return paramString;
    }
    catch (FileNotFoundException paramString)
    {
      GMTrace.o(13721346768896L, 102232);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */