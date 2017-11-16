package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.gmtrace.GMTrace;

public final class aq
{
  public static void C(Context paramContext, int paramInt)
  {
    GMTrace.i(13951261736960L, 103945);
    a(paramContext, paramInt, b.vkd, false, null);
    GMTrace.o(13951261736960L, 103945);
  }
  
  /* Error */
  public static MediaPlayer a(Context paramContext, int paramInt, b paramb, boolean paramBoolean, final a parama)
  {
    // Byte code:
    //   0: ldc2_w 41
    //   3: ldc 43
    //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: ifnull +7 -> 16
    //   12: aload_2
    //   13: ifnonnull +51 -> 64
    //   16: ldc 45
    //   18: ldc 47
    //   20: iconst_5
    //   21: anewarray 4	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: aload_0
    //   27: aastore
    //   28: dup
    //   29: iconst_1
    //   30: iload_1
    //   31: invokestatic 53	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   34: aastore
    //   35: dup
    //   36: iconst_2
    //   37: aload_2
    //   38: aastore
    //   39: dup
    //   40: iconst_3
    //   41: iconst_0
    //   42: invokestatic 58	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   45: aastore
    //   46: dup
    //   47: iconst_4
    //   48: aload 4
    //   50: aastore
    //   51: invokestatic 64	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   54: ldc2_w 41
    //   57: ldc 43
    //   59: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   62: aconst_null
    //   63: areturn
    //   64: aload_0
    //   65: iload_1
    //   66: invokevirtual 70	android/content/Context:getString	(I)Ljava/lang/String;
    //   69: astore 8
    //   71: new 72	android/media/MediaPlayer
    //   74: dup
    //   75: invokespecial 76	android/media/MediaPlayer:<init>	()V
    //   78: astore 7
    //   80: aload_2
    //   81: getstatic 29	com/tencent/mm/sdk/platformtools/aq$b:vkd	Lcom/tencent/mm/sdk/platformtools/aq$b;
    //   84: if_acmpeq +20 -> 104
    //   87: aload_2
    //   88: getstatic 79	com/tencent/mm/sdk/platformtools/aq$b:vke	Lcom/tencent/mm/sdk/platformtools/aq$b;
    //   91: if_acmpne +223 -> 314
    //   94: iconst_3
    //   95: istore 5
    //   97: aload 7
    //   99: iload 5
    //   101: invokevirtual 83	android/media/MediaPlayer:setAudioStreamType	(I)V
    //   104: ldc 45
    //   106: ldc 85
    //   108: bipush 7
    //   110: anewarray 4	java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: aload 7
    //   117: invokevirtual 89	java/lang/Object:hashCode	()I
    //   120: invokestatic 53	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   123: aastore
    //   124: dup
    //   125: iconst_1
    //   126: aload 8
    //   128: aastore
    //   129: dup
    //   130: iconst_2
    //   131: aload_0
    //   132: aastore
    //   133: dup
    //   134: iconst_3
    //   135: iload_1
    //   136: invokestatic 53	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   139: aastore
    //   140: dup
    //   141: iconst_4
    //   142: aload_2
    //   143: aastore
    //   144: dup
    //   145: iconst_5
    //   146: iconst_0
    //   147: invokestatic 58	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   150: aastore
    //   151: dup
    //   152: bipush 6
    //   154: aload 4
    //   156: aastore
    //   157: invokestatic 91	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   160: aconst_null
    //   161: astore_2
    //   162: aload_0
    //   163: invokevirtual 95	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   166: aload 8
    //   168: invokevirtual 101	android/content/res/AssetManager:openFd	(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   171: astore_0
    //   172: aload 7
    //   174: aload_0
    //   175: invokevirtual 107	android/content/res/AssetFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   178: aload_0
    //   179: invokevirtual 111	android/content/res/AssetFileDescriptor:getStartOffset	()J
    //   182: aload_0
    //   183: invokevirtual 114	android/content/res/AssetFileDescriptor:getLength	()J
    //   186: invokevirtual 118	android/media/MediaPlayer:setDataSource	(Ljava/io/FileDescriptor;JJ)V
    //   189: aload 7
    //   191: iconst_0
    //   192: invokevirtual 122	android/media/MediaPlayer:setLooping	(Z)V
    //   195: aload 7
    //   197: new 6	com/tencent/mm/sdk/platformtools/aq$1
    //   200: dup
    //   201: aload 7
    //   203: invokespecial 125	com/tencent/mm/sdk/platformtools/aq$1:<init>	(Landroid/media/MediaPlayer;)V
    //   206: invokevirtual 129	android/media/MediaPlayer:setOnErrorListener	(Landroid/media/MediaPlayer$OnErrorListener;)V
    //   209: aload 7
    //   211: new 8	com/tencent/mm/sdk/platformtools/aq$2
    //   214: dup
    //   215: aload 8
    //   217: aload 7
    //   219: aload 4
    //   221: invokespecial 132	com/tencent/mm/sdk/platformtools/aq$2:<init>	(Ljava/lang/String;Landroid/media/MediaPlayer;Lcom/tencent/mm/sdk/platformtools/aq$a;)V
    //   224: invokevirtual 136	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   227: aload 7
    //   229: invokevirtual 139	android/media/MediaPlayer:prepare	()V
    //   232: aload 7
    //   234: invokevirtual 142	android/media/MediaPlayer:start	()V
    //   237: aload 7
    //   239: invokevirtual 89	java/lang/Object:hashCode	()I
    //   242: istore 5
    //   244: invokestatic 148	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   247: ifnull +73 -> 320
    //   250: iconst_1
    //   251: istore_3
    //   252: invokestatic 151	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   255: ifnull +70 -> 325
    //   258: iconst_1
    //   259: istore 6
    //   261: ldc 45
    //   263: ldc -103
    //   265: iconst_3
    //   266: anewarray 4	java/lang/Object
    //   269: dup
    //   270: iconst_0
    //   271: iload 5
    //   273: invokestatic 53	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   276: aastore
    //   277: dup
    //   278: iconst_1
    //   279: iload_3
    //   280: invokestatic 58	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   283: aastore
    //   284: dup
    //   285: iconst_2
    //   286: iload 6
    //   288: invokestatic 58	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   291: aastore
    //   292: invokestatic 91	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   295: aload_0
    //   296: ifnull +7 -> 303
    //   299: aload_0
    //   300: invokevirtual 156	android/content/res/AssetFileDescriptor:close	()V
    //   303: ldc2_w 41
    //   306: ldc 43
    //   308: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   311: aload 7
    //   313: areturn
    //   314: iconst_0
    //   315: istore 5
    //   317: goto -220 -> 97
    //   320: iconst_0
    //   321: istore_3
    //   322: goto -70 -> 252
    //   325: iconst_0
    //   326: istore 6
    //   328: goto -67 -> 261
    //   331: astore_0
    //   332: ldc 45
    //   334: aload_0
    //   335: ldc -98
    //   337: iconst_0
    //   338: anewarray 4	java/lang/Object
    //   341: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   344: goto -41 -> 303
    //   347: astore 4
    //   349: aload_2
    //   350: astore_0
    //   351: aload 4
    //   353: astore_2
    //   354: ldc 45
    //   356: ldc -92
    //   358: iconst_2
    //   359: anewarray 4	java/lang/Object
    //   362: dup
    //   363: iconst_0
    //   364: iload_1
    //   365: invokestatic 53	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   368: aastore
    //   369: dup
    //   370: iconst_1
    //   371: aload_2
    //   372: invokevirtual 168	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   375: aastore
    //   376: invokestatic 64	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   379: ldc 45
    //   381: aload_2
    //   382: ldc -98
    //   384: iconst_0
    //   385: anewarray 4	java/lang/Object
    //   388: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   391: aload 7
    //   393: invokevirtual 171	android/media/MediaPlayer:release	()V
    //   396: aload_0
    //   397: ifnull +7 -> 404
    //   400: aload_0
    //   401: invokevirtual 156	android/content/res/AssetFileDescriptor:close	()V
    //   404: ldc2_w 41
    //   407: ldc 43
    //   409: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   412: aconst_null
    //   413: areturn
    //   414: astore_0
    //   415: ldc 45
    //   417: aload_0
    //   418: ldc -98
    //   420: iconst_0
    //   421: anewarray 4	java/lang/Object
    //   424: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   427: goto -23 -> 404
    //   430: astore_2
    //   431: aconst_null
    //   432: astore_0
    //   433: aload_0
    //   434: ifnull +7 -> 441
    //   437: aload_0
    //   438: invokevirtual 156	android/content/res/AssetFileDescriptor:close	()V
    //   441: aload_2
    //   442: athrow
    //   443: astore_0
    //   444: ldc 45
    //   446: aload_0
    //   447: ldc -98
    //   449: iconst_0
    //   450: anewarray 4	java/lang/Object
    //   453: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   456: goto -15 -> 441
    //   459: astore_2
    //   460: goto -27 -> 433
    //   463: astore_2
    //   464: goto -31 -> 433
    //   467: astore_2
    //   468: goto -114 -> 354
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	471	0	paramContext	Context
    //   0	471	1	paramInt	int
    //   0	471	2	paramb	b
    //   0	471	3	paramBoolean	boolean
    //   0	471	4	parama	a
    //   95	221	5	i	int
    //   259	68	6	bool	boolean
    //   78	314	7	localMediaPlayer	MediaPlayer
    //   69	147	8	str	String
    // Exception table:
    //   from	to	target	type
    //   299	303	331	java/io/IOException
    //   162	172	347	java/lang/Exception
    //   400	404	414	java/io/IOException
    //   162	172	430	finally
    //   437	441	443	java/io/IOException
    //   172	250	459	finally
    //   252	258	459	finally
    //   261	295	459	finally
    //   354	396	463	finally
    //   172	250	467	java/lang/Exception
    //   252	258	467	java/lang/Exception
    //   261	295	467	java/lang/Exception
  }
  
  public static void a(Context paramContext, int paramInt, a parama)
  {
    GMTrace.i(13950993301504L, 103943);
    a(paramContext, paramInt, b.vke, false, parama);
    GMTrace.o(13950993301504L, 103943);
  }
  
  public static void b(Context paramContext, int paramInt, a parama)
  {
    GMTrace.i(13951127519232L, 103944);
    a(paramContext, paramInt, b.vkd, false, parama);
    GMTrace.o(13951127519232L, 103944);
  }
  
  public static abstract interface a
  {
    public abstract void onCompletion();
  }
  
  private static enum b
  {
    static
    {
      GMTrace.i(13949248471040L, 103930);
      vkd = new b("NOTSET", 0);
      vke = new b("ON", 1);
      vkf = new b("OFF", 2);
      vkg = new b[] { vkd, vke, vkf };
      GMTrace.o(13949248471040L, 103930);
    }
    
    private b()
    {
      GMTrace.i(13949114253312L, 103929);
      GMTrace.o(13949114253312L, 103929);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */