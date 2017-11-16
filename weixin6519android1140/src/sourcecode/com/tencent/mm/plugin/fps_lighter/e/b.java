package com.tencent.mm.plugin.fps_lighter.e;

import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

public final class b
{
  private static final FileFilter lnN;
  
  static
  {
    GMTrace.i(5217445740544L, 38873);
    lnN = new FileFilter()
    {
      public final boolean accept(File paramAnonymousFile)
      {
        GMTrace.i(5218251046912L, 38879);
        paramAnonymousFile = paramAnonymousFile.getName();
        if (paramAnonymousFile.startsWith("cpu"))
        {
          int i = 3;
          while (i < paramAnonymousFile.length())
          {
            if (!Character.isDigit(paramAnonymousFile.charAt(i)))
            {
              GMTrace.o(5218251046912L, 38879);
              return false;
            }
            i += 1;
          }
          GMTrace.o(5218251046912L, 38879);
          return true;
        }
        GMTrace.o(5218251046912L, 38879);
        return false;
      }
    };
    GMTrace.o(5217445740544L, 38873);
  }
  
  private static int a(String paramString, FileInputStream paramFileInputStream)
  {
    GMTrace.i(5217311522816L, 38872);
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int m;
      int i;
      try
      {
        m = paramFileInputStream.read(arrayOfByte);
        j = 0;
      }
      catch (NumberFormatException paramString)
      {
        int n;
        GMTrace.o(5217311522816L, 38872);
        return -1;
      }
      catch (IOException paramString)
      {
        continue;
      }
      int k = i;
      if (j < m)
      {
        n = j - i;
        k = i;
        if (arrayOfByte[j] == paramString.charAt(n))
        {
          if (n == paramString.length() - 1)
          {
            if ((j < 1024) && (arrayOfByte[j] != 10))
            {
              if (Character.isDigit(arrayOfByte[j]))
              {
                i = j + 1;
                if ((i < 1024) && (Character.isDigit(arrayOfByte[i])))
                {
                  i += 1;
                  continue;
                }
                i = bg.Sy(new String(arrayOfByte, 0, j, i - j));
                GMTrace.o(5217311522816L, 38872);
                return i;
              }
              j += 1;
              continue;
            }
            GMTrace.o(5217311522816L, 38872);
            return -1;
          }
          j += 1;
          continue;
        }
      }
      int j = k + 1;
      if (j < m) {
        if (arrayOfByte[j] != 10)
        {
          k = j;
          if (j != 0) {}
        }
        else
        {
          i = j;
          if (arrayOfByte[j] == 10) {
            i = j + 1;
          }
          j = i;
        }
      }
    }
  }
  
  public static int aAp()
  {
    GMTrace.i(5216774651904L, 38868);
    if (Build.VERSION.SDK_INT <= 10)
    {
      GMTrace.o(5216774651904L, 38868);
      return 1;
    }
    try
    {
      i = yk("/sys/devices/system/cpu/possible");
      int j = i;
      if (i == -1) {
        j = yk("/sys/devices/system/cpu/present");
      }
      i = j;
      if (j == -1) {
        i = new File("/sys/devices/system/cpu/").listFiles(lnN).length;
      }
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        i = -1;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;)
      {
        int i = -1;
      }
    }
    GMTrace.o(5216774651904L, 38868);
    return i;
  }
  
  /* Error */
  public static int aAq()
  {
    // Byte code:
    //   0: ldc2_w 102
    //   3: ldc 104
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: iconst_0
    //   9: istore_2
    //   10: iconst_m1
    //   11: istore_0
    //   12: iload_2
    //   13: invokestatic 106	com/tencent/mm/plugin/fps_lighter/e/b:aAp	()I
    //   16: if_icmpge +166 -> 182
    //   19: new 91	java/io/File
    //   22: dup
    //   23: new 108	java/lang/StringBuilder
    //   26: dup
    //   27: ldc 110
    //   29: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   32: iload_2
    //   33: invokevirtual 115	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   36: ldc 117
    //   38: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: invokespecial 96	java/io/File:<init>	(Ljava/lang/String;)V
    //   47: astore_3
    //   48: iload_0
    //   49: istore_1
    //   50: aload_3
    //   51: invokevirtual 128	java/io/File:exists	()Z
    //   54: ifeq +183 -> 237
    //   57: sipush 128
    //   60: newarray <illegal type>
    //   62: astore 4
    //   64: new 39	java/io/FileInputStream
    //   67: dup
    //   68: aload_3
    //   69: invokespecial 131	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   72: astore_3
    //   73: aload_3
    //   74: aload 4
    //   76: invokevirtual 43	java/io/FileInputStream:read	([B)I
    //   79: pop
    //   80: iconst_0
    //   81: istore_1
    //   82: aload 4
    //   84: iload_1
    //   85: baload
    //   86: invokestatic 59	java/lang/Character:isDigit	(I)Z
    //   89: ifeq +17 -> 106
    //   92: iload_1
    //   93: sipush 128
    //   96: if_icmpge +10 -> 106
    //   99: iload_1
    //   100: iconst_1
    //   101: iadd
    //   102: istore_1
    //   103: goto -21 -> 82
    //   106: new 45	java/lang/String
    //   109: dup
    //   110: aload 4
    //   112: iconst_0
    //   113: iload_1
    //   114: invokespecial 134	java/lang/String:<init>	([BII)V
    //   117: invokestatic 68	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   120: invokestatic 140	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   123: astore 4
    //   125: iload_0
    //   126: istore_1
    //   127: aload 4
    //   129: invokevirtual 143	java/lang/Integer:intValue	()I
    //   132: iload_0
    //   133: if_icmple +9 -> 142
    //   136: aload 4
    //   138: invokevirtual 143	java/lang/Integer:intValue	()I
    //   141: istore_1
    //   142: aload_3
    //   143: invokevirtual 146	java/io/FileInputStream:close	()V
    //   146: goto +91 -> 237
    //   149: astore 4
    //   151: aload_3
    //   152: invokevirtual 146	java/io/FileInputStream:close	()V
    //   155: iload_0
    //   156: istore_1
    //   157: goto +80 -> 237
    //   160: astore_3
    //   161: iconst_m1
    //   162: istore_1
    //   163: ldc2_w 102
    //   166: ldc 104
    //   168: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   171: iload_1
    //   172: ireturn
    //   173: astore 4
    //   175: aload_3
    //   176: invokevirtual 146	java/io/FileInputStream:close	()V
    //   179: aload 4
    //   181: athrow
    //   182: iload_0
    //   183: istore_1
    //   184: iload_0
    //   185: iconst_m1
    //   186: if_icmpne -23 -> 163
    //   189: new 39	java/io/FileInputStream
    //   192: dup
    //   193: ldc -108
    //   195: invokespecial 149	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   198: astore_3
    //   199: ldc -105
    //   201: aload_3
    //   202: invokestatic 153	com/tencent/mm/plugin/fps_lighter/e/b:a	(Ljava/lang/String;Ljava/io/FileInputStream;)I
    //   205: istore_1
    //   206: iload_1
    //   207: sipush 1000
    //   210: imul
    //   211: istore_2
    //   212: iload_0
    //   213: istore_1
    //   214: iload_2
    //   215: iload_0
    //   216: if_icmple +5 -> 221
    //   219: iload_2
    //   220: istore_1
    //   221: aload_3
    //   222: invokevirtual 146	java/io/FileInputStream:close	()V
    //   225: goto -62 -> 163
    //   228: astore 4
    //   230: aload_3
    //   231: invokevirtual 146	java/io/FileInputStream:close	()V
    //   234: aload 4
    //   236: athrow
    //   237: iload_2
    //   238: iconst_1
    //   239: iadd
    //   240: istore_2
    //   241: iload_1
    //   242: istore_0
    //   243: goto -231 -> 12
    // Local variable table:
    //   start	length	slot	name	signature
    //   11	232	0	i	int
    //   49	193	1	j	int
    //   9	232	2	k	int
    //   47	105	3	localObject1	Object
    //   160	16	3	localIOException	IOException
    //   198	33	3	localFileInputStream	FileInputStream
    //   62	75	4	localObject2	Object
    //   149	1	4	localNumberFormatException	NumberFormatException
    //   173	7	4	localObject3	Object
    //   228	7	4	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   73	80	149	java/lang/NumberFormatException
    //   82	92	149	java/lang/NumberFormatException
    //   106	125	149	java/lang/NumberFormatException
    //   127	142	149	java/lang/NumberFormatException
    //   12	48	160	java/io/IOException
    //   50	73	160	java/io/IOException
    //   142	146	160	java/io/IOException
    //   151	155	160	java/io/IOException
    //   175	182	160	java/io/IOException
    //   189	199	160	java/io/IOException
    //   221	225	160	java/io/IOException
    //   230	237	160	java/io/IOException
    //   73	80	173	finally
    //   82	92	173	finally
    //   106	125	173	finally
    //   127	142	173	finally
    //   199	206	228	finally
  }
  
  /* Error */
  @android.annotation.TargetApi(16)
  public static long cu(android.content.Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 159
    //   3: ldc -95
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: getstatic 82	android/os/Build$VERSION:SDK_INT	I
    //   11: bipush 16
    //   13: if_icmplt +42 -> 55
    //   16: new 163	android/app/ActivityManager$MemoryInfo
    //   19: dup
    //   20: invokespecial 164	android/app/ActivityManager$MemoryInfo:<init>	()V
    //   23: astore 4
    //   25: aload_0
    //   26: ldc -90
    //   28: invokevirtual 172	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   31: checkcast 174	android/app/ActivityManager
    //   34: aload 4
    //   36: invokevirtual 178	android/app/ActivityManager:getMemoryInfo	(Landroid/app/ActivityManager$MemoryInfo;)V
    //   39: aload 4
    //   41: getfield 182	android/app/ActivityManager$MemoryInfo:totalMem	J
    //   44: lstore_2
    //   45: ldc2_w 159
    //   48: ldc -95
    //   50: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   53: lload_2
    //   54: lreturn
    //   55: new 39	java/io/FileInputStream
    //   58: dup
    //   59: ldc -72
    //   61: invokespecial 149	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   64: astore_0
    //   65: ldc -70
    //   67: aload_0
    //   68: invokestatic 153	com/tencent/mm/plugin/fps_lighter/e/b:a	(Ljava/lang/String;Ljava/io/FileInputStream;)I
    //   71: istore_1
    //   72: iload_1
    //   73: i2l
    //   74: ldc2_w 187
    //   77: lmul
    //   78: lstore_2
    //   79: aload_0
    //   80: invokevirtual 146	java/io/FileInputStream:close	()V
    //   83: ldc2_w 159
    //   86: ldc -95
    //   88: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   91: lload_2
    //   92: lreturn
    //   93: astore 4
    //   95: aload_0
    //   96: invokevirtual 146	java/io/FileInputStream:close	()V
    //   99: aload 4
    //   101: athrow
    //   102: astore_0
    //   103: ldc2_w 189
    //   106: lstore_2
    //   107: goto -24 -> 83
    //   110: astore_0
    //   111: goto -28 -> 83
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	paramContext	android.content.Context
    //   71	2	1	i	int
    //   44	63	2	l	long
    //   23	17	4	localMemoryInfo	android.app.ActivityManager.MemoryInfo
    //   93	7	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   65	72	93	finally
    //   55	65	102	java/io/IOException
    //   95	102	102	java/io/IOException
    //   79	83	110	java/io/IOException
  }
  
  /* Error */
  private static int yk(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: iconst_m1
    //   4: istore_2
    //   5: ldc2_w 192
    //   8: ldc -62
    //   10: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: new 39	java/io/FileInputStream
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 149	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   21: astore 4
    //   23: new 196	java/io/BufferedReader
    //   26: dup
    //   27: new 198	java/io/InputStreamReader
    //   30: dup
    //   31: aload 4
    //   33: invokespecial 201	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   36: invokespecial 204	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   39: astore 5
    //   41: aload 5
    //   43: invokevirtual 207	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   46: astore_0
    //   47: iload_2
    //   48: istore_1
    //   49: aload_0
    //   50: ifnull +16 -> 66
    //   53: aload_0
    //   54: ldc -47
    //   56: invokevirtual 213	java/lang/String:matches	(Ljava/lang/String;)Z
    //   59: istore_3
    //   60: iload_3
    //   61: ifne +25 -> 86
    //   64: iload_2
    //   65: istore_1
    //   66: aload 5
    //   68: invokevirtual 214	java/io/BufferedReader:close	()V
    //   71: aload 4
    //   73: invokevirtual 217	java/io/InputStream:close	()V
    //   76: ldc2_w 192
    //   79: ldc -62
    //   81: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   84: iload_1
    //   85: ireturn
    //   86: aload_0
    //   87: iconst_2
    //   88: invokevirtual 221	java/lang/String:substring	(I)Ljava/lang/String;
    //   91: invokestatic 224	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   94: invokevirtual 143	java/lang/Integer:intValue	()I
    //   97: istore_1
    //   98: iload_1
    //   99: iconst_1
    //   100: iadd
    //   101: istore_1
    //   102: goto -36 -> 66
    //   105: astore_0
    //   106: ldc -30
    //   108: aload_0
    //   109: ldc -28
    //   111: iconst_0
    //   112: anewarray 4	java/lang/Object
    //   115: invokestatic 234	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: goto -42 -> 76
    //   121: astore_0
    //   122: aconst_null
    //   123: astore 4
    //   125: aload 6
    //   127: astore_0
    //   128: aload_0
    //   129: ifnull +7 -> 136
    //   132: aload_0
    //   133: invokevirtual 214	java/io/BufferedReader:close	()V
    //   136: aload 4
    //   138: ifnull +8 -> 146
    //   141: aload 4
    //   143: invokevirtual 217	java/io/InputStream:close	()V
    //   146: ldc2_w 192
    //   149: ldc -62
    //   151: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   154: iconst_m1
    //   155: ireturn
    //   156: astore_0
    //   157: ldc -30
    //   159: aload_0
    //   160: ldc -28
    //   162: iconst_0
    //   163: anewarray 4	java/lang/Object
    //   166: invokestatic 234	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: goto -23 -> 146
    //   172: astore_0
    //   173: aconst_null
    //   174: astore 6
    //   176: aconst_null
    //   177: astore 4
    //   179: aload 4
    //   181: ifnull +8 -> 189
    //   184: aload 4
    //   186: invokevirtual 214	java/io/BufferedReader:close	()V
    //   189: aload 6
    //   191: ifnull +8 -> 199
    //   194: aload 6
    //   196: invokevirtual 217	java/io/InputStream:close	()V
    //   199: aload_0
    //   200: athrow
    //   201: astore 4
    //   203: ldc -30
    //   205: aload 4
    //   207: ldc -28
    //   209: iconst_0
    //   210: anewarray 4	java/lang/Object
    //   213: invokestatic 234	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   216: goto -17 -> 199
    //   219: astore_0
    //   220: aconst_null
    //   221: astore 5
    //   223: aload 4
    //   225: astore 6
    //   227: aload 5
    //   229: astore 4
    //   231: goto -52 -> 179
    //   234: astore_0
    //   235: aload 4
    //   237: astore 6
    //   239: aload 5
    //   241: astore 4
    //   243: goto -64 -> 179
    //   246: astore_0
    //   247: aload 6
    //   249: astore_0
    //   250: goto -122 -> 128
    //   253: astore_0
    //   254: aload 5
    //   256: astore_0
    //   257: goto -129 -> 128
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	260	0	paramString	String
    //   48	54	1	i	int
    //   4	61	2	j	int
    //   59	2	3	bool	boolean
    //   21	164	4	localFileInputStream	FileInputStream
    //   201	23	4	localIOException	IOException
    //   229	13	4	localObject1	Object
    //   39	216	5	localBufferedReader	java.io.BufferedReader
    //   1	247	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   66	76	105	java/io/IOException
    //   13	23	121	java/io/IOException
    //   132	136	156	java/io/IOException
    //   141	146	156	java/io/IOException
    //   13	23	172	finally
    //   184	189	201	java/io/IOException
    //   194	199	201	java/io/IOException
    //   23	41	219	finally
    //   41	47	234	finally
    //   53	60	234	finally
    //   86	98	234	finally
    //   23	41	246	java/io/IOException
    //   41	47	253	java/io/IOException
    //   53	60	253	java/io/IOException
    //   86	98	253	java/io/IOException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */