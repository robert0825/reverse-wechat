package com.tencent.mm.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.storage.w;
import java.io.File;

public final class d
{
  private static final String esf;
  
  static
  {
    GMTrace.i(13044486766592L, 97189);
    esf = w.ghv + "channel_history.cfg";
    GMTrace.o(13044486766592L, 97189);
  }
  
  /* Error */
  public static void ag(android.content.Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 50
    //   3: ldc 52
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 57	com/tencent/mm/sdk/platformtools/f:em	(Landroid/content/Context;)V
    //   12: aload_0
    //   13: invokevirtual 63	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   16: astore_1
    //   17: aload_1
    //   18: aload_0
    //   19: invokevirtual 66	android/content/Context:getPackageName	()Ljava/lang/String;
    //   22: iconst_0
    //   23: invokevirtual 72	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   26: getfield 78	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   29: getfield 83	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   32: invokestatic 89	com/tencent/mm/c/a:bq	(Ljava/lang/String;)Lcom/tencent/mm/c/a;
    //   35: astore_0
    //   36: aload_0
    //   37: ifnull +44 -> 81
    //   40: aload_0
    //   41: getfield 93	com/tencent/mm/c/a:eqS	Lcom/tencent/mm/c/b;
    //   44: ifnull +37 -> 81
    //   47: ldc 95
    //   49: ldc 97
    //   51: invokestatic 102	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: aload_0
    //   55: getfield 93	com/tencent/mm/c/a:eqS	Lcom/tencent/mm/c/b;
    //   58: getfield 108	com/tencent/mm/c/b:eqV	I
    //   61: ifeq +20 -> 81
    //   64: aload_0
    //   65: getfield 93	com/tencent/mm/c/a:eqS	Lcom/tencent/mm/c/b;
    //   68: getfield 108	com/tencent/mm/c/b:eqV	I
    //   71: putstatic 109	com/tencent/mm/sdk/platformtools/f:eqV	I
    //   74: ldc 95
    //   76: ldc 111
    //   78: invokestatic 102	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   81: ldc 95
    //   83: ldc 113
    //   85: iconst_2
    //   86: anewarray 4	java/lang/Object
    //   89: dup
    //   90: iconst_0
    //   91: getstatic 109	com/tencent/mm/sdk/platformtools/f:eqV	I
    //   94: invokestatic 119	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   97: aastore
    //   98: dup
    //   99: iconst_1
    //   100: invokestatic 124	com/tencent/mm/sdk/platformtools/ab:vM	()Ljava/lang/String;
    //   103: aastore
    //   104: invokestatic 127	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   107: invokestatic 131	com/tencent/mm/app/d:pa	()Z
    //   110: ifeq +45 -> 155
    //   113: ldc2_w 50
    //   116: ldc 52
    //   118: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   121: return
    //   122: astore_0
    //   123: ldc 95
    //   125: ldc -123
    //   127: invokestatic 136	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   130: goto -49 -> 81
    //   133: astore_0
    //   134: ldc 95
    //   136: ldc -118
    //   138: iconst_1
    //   139: anewarray 4	java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload_0
    //   145: invokevirtual 141	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   148: aastore
    //   149: invokestatic 143	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   152: goto -71 -> 81
    //   155: new 145	java/io/RandomAccessFile
    //   158: dup
    //   159: getstatic 39	com/tencent/mm/app/d:esf	Ljava/lang/String;
    //   162: ldc -109
    //   164: invokespecial 149	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   167: astore_1
    //   168: aload_1
    //   169: astore_0
    //   170: aload_1
    //   171: ldc -105
    //   173: iconst_1
    //   174: anewarray 4	java/lang/Object
    //   177: dup
    //   178: iconst_0
    //   179: getstatic 109	com/tencent/mm/sdk/platformtools/f:eqV	I
    //   182: invokestatic 119	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   185: aastore
    //   186: invokestatic 157	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   189: invokevirtual 161	java/lang/String:getBytes	()[B
    //   192: invokevirtual 165	java/io/RandomAccessFile:write	([B)V
    //   195: aload_1
    //   196: invokevirtual 168	java/io/RandomAccessFile:close	()V
    //   199: ldc2_w 50
    //   202: ldc 52
    //   204: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   207: return
    //   208: astore_0
    //   209: ldc 95
    //   211: aload_0
    //   212: ldc -86
    //   214: iconst_1
    //   215: anewarray 4	java/lang/Object
    //   218: dup
    //   219: iconst_0
    //   220: ldc -84
    //   222: aastore
    //   223: invokestatic 176	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   226: ldc2_w 50
    //   229: ldc 52
    //   231: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   234: return
    //   235: astore_2
    //   236: aconst_null
    //   237: astore_1
    //   238: aload_1
    //   239: astore_0
    //   240: ldc 95
    //   242: aload_2
    //   243: ldc -78
    //   245: iconst_1
    //   246: anewarray 4	java/lang/Object
    //   249: dup
    //   250: iconst_0
    //   251: ldc -84
    //   253: aastore
    //   254: invokestatic 176	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   257: aload_1
    //   258: ifnull +7 -> 265
    //   261: aload_1
    //   262: invokevirtual 168	java/io/RandomAccessFile:close	()V
    //   265: ldc2_w 50
    //   268: ldc 52
    //   270: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   273: return
    //   274: astore_0
    //   275: ldc 95
    //   277: aload_0
    //   278: ldc -86
    //   280: iconst_1
    //   281: anewarray 4	java/lang/Object
    //   284: dup
    //   285: iconst_0
    //   286: ldc -84
    //   288: aastore
    //   289: invokestatic 176	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   292: ldc2_w 50
    //   295: ldc 52
    //   297: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   300: return
    //   301: astore_1
    //   302: aconst_null
    //   303: astore_0
    //   304: aload_0
    //   305: ifnull +7 -> 312
    //   308: aload_0
    //   309: invokevirtual 168	java/io/RandomAccessFile:close	()V
    //   312: aload_1
    //   313: athrow
    //   314: astore_0
    //   315: ldc 95
    //   317: aload_0
    //   318: ldc -86
    //   320: iconst_1
    //   321: anewarray 4	java/lang/Object
    //   324: dup
    //   325: iconst_0
    //   326: ldc -84
    //   328: aastore
    //   329: invokestatic 176	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   332: goto -20 -> 312
    //   335: astore_1
    //   336: goto -32 -> 304
    //   339: astore_2
    //   340: goto -102 -> 238
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	343	0	paramContext	android.content.Context
    //   16	246	1	localObject1	Object
    //   301	12	1	localObject2	Object
    //   335	1	1	localObject3	Object
    //   235	8	2	localException1	Exception
    //   339	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   17	36	122	android/content/pm/PackageManager$NameNotFoundException
    //   40	81	122	android/content/pm/PackageManager$NameNotFoundException
    //   17	36	133	java/lang/Exception
    //   40	81	133	java/lang/Exception
    //   195	199	208	java/lang/Exception
    //   155	168	235	java/lang/Exception
    //   261	265	274	java/lang/Exception
    //   155	168	301	finally
    //   308	312	314	java/lang/Exception
    //   170	195	335	finally
    //   240	257	335	finally
    //   170	195	339	java/lang/Exception
  }
  
  /* Error */
  public static void oZ()
  {
    // Byte code:
    //   0: ldc2_w 180
    //   3: ldc -74
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: invokestatic 131	com/tencent/mm/app/d:pa	()Z
    //   11: ifne +19 -> 30
    //   14: ldc 95
    //   16: ldc -72
    //   18: invokestatic 187	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: ldc2_w 180
    //   24: ldc -74
    //   26: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   29: return
    //   30: new 145	java/io/RandomAccessFile
    //   33: dup
    //   34: getstatic 39	com/tencent/mm/app/d:esf	Ljava/lang/String;
    //   37: ldc -109
    //   39: invokespecial 149	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   42: astore 7
    //   44: aload 7
    //   46: astore 5
    //   48: aload 7
    //   50: invokevirtual 191	java/io/RandomAccessFile:length	()J
    //   53: lstore_3
    //   54: aload 7
    //   56: astore 5
    //   58: ldc 95
    //   60: ldc -63
    //   62: iconst_2
    //   63: anewarray 4	java/lang/Object
    //   66: dup
    //   67: iconst_0
    //   68: lload_3
    //   69: invokestatic 198	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   72: aastore
    //   73: dup
    //   74: iconst_1
    //   75: getstatic 109	com/tencent/mm/sdk/platformtools/f:eqV	I
    //   78: invokestatic 119	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   81: aastore
    //   82: invokestatic 127	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: lload_3
    //   86: lconst_0
    //   87: lcmp
    //   88: ifgt +57 -> 145
    //   91: aload 7
    //   93: astore 5
    //   95: ldc 95
    //   97: ldc -56
    //   99: invokestatic 187	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   102: aload 7
    //   104: invokevirtual 168	java/io/RandomAccessFile:close	()V
    //   107: ldc2_w 180
    //   110: ldc -74
    //   112: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   115: return
    //   116: astore 5
    //   118: ldc 95
    //   120: aload 5
    //   122: ldc -86
    //   124: iconst_1
    //   125: anewarray 4	java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc -84
    //   132: aastore
    //   133: invokestatic 176	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: ldc2_w 180
    //   139: ldc -74
    //   141: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   144: return
    //   145: aload 7
    //   147: astore 5
    //   149: aload 7
    //   151: invokevirtual 203	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   154: astore 9
    //   156: aload 7
    //   158: astore 5
    //   160: getstatic 109	com/tencent/mm/sdk/platformtools/f:eqV	I
    //   163: istore_2
    //   164: aload 7
    //   166: astore 5
    //   168: getstatic 109	com/tencent/mm/sdk/platformtools/f:eqV	I
    //   171: istore_0
    //   172: aload 7
    //   174: astore 5
    //   176: getstatic 109	com/tencent/mm/sdk/platformtools/f:eqV	I
    //   179: putstatic 206	com/tencent/mm/sdk/platformtools/f:vhp	I
    //   182: ldc -84
    //   184: astore 6
    //   186: aload 7
    //   188: astore 5
    //   190: aload 9
    //   192: invokestatic 212	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   195: ifne +103 -> 298
    //   198: aload 7
    //   200: astore 5
    //   202: new 19	java/lang/StringBuilder
    //   205: dup
    //   206: invokespecial 22	java/lang/StringBuilder:<init>	()V
    //   209: ldc -84
    //   211: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: aload 9
    //   216: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: ldc -42
    //   221: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: invokevirtual 37	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   227: astore 8
    //   229: aload 7
    //   231: astore 5
    //   233: aload 9
    //   235: iconst_0
    //   236: invokestatic 218	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   239: istore_1
    //   240: aload 8
    //   242: astore 6
    //   244: iload_1
    //   245: istore_0
    //   246: aload 7
    //   248: astore 5
    //   250: iload_1
    //   251: getstatic 109	com/tencent/mm/sdk/platformtools/f:eqV	I
    //   254: if_icmpeq +44 -> 298
    //   257: aload 7
    //   259: astore 5
    //   261: iload_1
    //   262: putstatic 206	com/tencent/mm/sdk/platformtools/f:vhp	I
    //   265: aload 7
    //   267: astore 5
    //   269: ldc 95
    //   271: new 19	java/lang/StringBuilder
    //   274: dup
    //   275: ldc -36
    //   277: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   280: getstatic 109	com/tencent/mm/sdk/platformtools/f:eqV	I
    //   283: invokevirtual 226	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   286: invokevirtual 37	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   289: invokestatic 102	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   292: iload_1
    //   293: istore_0
    //   294: aload 8
    //   296: astore 6
    //   298: aload 7
    //   300: astore 5
    //   302: getstatic 230	com/tencent/mm/sdk/platformtools/ab:vin	Z
    //   305: ifeq +163 -> 468
    //   308: aload 7
    //   310: astore 5
    //   312: aload 7
    //   314: invokevirtual 203	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   317: astore 8
    //   319: aload 7
    //   321: astore 5
    //   323: aload 8
    //   325: invokestatic 212	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   328: ifne +48 -> 376
    //   331: aload 7
    //   333: astore 5
    //   335: new 19	java/lang/StringBuilder
    //   338: dup
    //   339: invokespecial 22	java/lang/StringBuilder:<init>	()V
    //   342: aload 6
    //   344: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: aload 8
    //   349: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: ldc -42
    //   354: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: invokevirtual 37	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   360: astore 6
    //   362: aload 7
    //   364: astore 5
    //   366: aload 8
    //   368: iconst_0
    //   369: invokestatic 218	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   372: istore_0
    //   373: goto -65 -> 308
    //   376: aload 7
    //   378: astore 5
    //   380: ldc 95
    //   382: ldc -24
    //   384: iconst_1
    //   385: anewarray 4	java/lang/Object
    //   388: dup
    //   389: iconst_0
    //   390: aload 6
    //   392: aastore
    //   393: invokestatic 127	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   396: iload_0
    //   397: iload_2
    //   398: if_icmpeq +70 -> 468
    //   401: aload 7
    //   403: astore 5
    //   405: aload 7
    //   407: lload_3
    //   408: invokevirtual 236	java/io/RandomAccessFile:seek	(J)V
    //   411: aload 7
    //   413: astore 5
    //   415: aload 7
    //   417: ldc -105
    //   419: iconst_1
    //   420: anewarray 4	java/lang/Object
    //   423: dup
    //   424: iconst_0
    //   425: iload_2
    //   426: invokestatic 119	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   429: aastore
    //   430: invokestatic 157	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   433: invokevirtual 161	java/lang/String:getBytes	()[B
    //   436: invokevirtual 165	java/io/RandomAccessFile:write	([B)V
    //   439: aload 7
    //   441: astore 5
    //   443: ldc 95
    //   445: ldc -18
    //   447: iconst_2
    //   448: anewarray 4	java/lang/Object
    //   451: dup
    //   452: iconst_0
    //   453: iload_0
    //   454: invokestatic 119	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   457: aastore
    //   458: dup
    //   459: iconst_1
    //   460: iload_2
    //   461: invokestatic 119	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   464: aastore
    //   465: invokestatic 127	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   468: aload 7
    //   470: invokevirtual 168	java/io/RandomAccessFile:close	()V
    //   473: ldc2_w 180
    //   476: ldc -74
    //   478: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   481: return
    //   482: astore 5
    //   484: ldc 95
    //   486: aload 5
    //   488: ldc -86
    //   490: iconst_1
    //   491: anewarray 4	java/lang/Object
    //   494: dup
    //   495: iconst_0
    //   496: ldc -84
    //   498: aastore
    //   499: invokestatic 176	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   502: ldc2_w 180
    //   505: ldc -74
    //   507: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   510: return
    //   511: astore 8
    //   513: aconst_null
    //   514: astore 6
    //   516: aload 6
    //   518: astore 5
    //   520: ldc 95
    //   522: aload 8
    //   524: ldc -78
    //   526: iconst_1
    //   527: anewarray 4	java/lang/Object
    //   530: dup
    //   531: iconst_0
    //   532: ldc -84
    //   534: aastore
    //   535: invokestatic 176	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   538: aload 6
    //   540: ifnull +8 -> 548
    //   543: aload 6
    //   545: invokevirtual 168	java/io/RandomAccessFile:close	()V
    //   548: ldc2_w 180
    //   551: ldc -74
    //   553: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   556: return
    //   557: astore 5
    //   559: ldc 95
    //   561: aload 5
    //   563: ldc -86
    //   565: iconst_1
    //   566: anewarray 4	java/lang/Object
    //   569: dup
    //   570: iconst_0
    //   571: ldc -84
    //   573: aastore
    //   574: invokestatic 176	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   577: ldc2_w 180
    //   580: ldc -74
    //   582: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   585: return
    //   586: astore 6
    //   588: aconst_null
    //   589: astore 5
    //   591: aload 5
    //   593: ifnull +8 -> 601
    //   596: aload 5
    //   598: invokevirtual 168	java/io/RandomAccessFile:close	()V
    //   601: aload 6
    //   603: athrow
    //   604: astore 5
    //   606: ldc 95
    //   608: aload 5
    //   610: ldc -86
    //   612: iconst_1
    //   613: anewarray 4	java/lang/Object
    //   616: dup
    //   617: iconst_0
    //   618: ldc -84
    //   620: aastore
    //   621: invokestatic 176	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   624: goto -23 -> 601
    //   627: astore 6
    //   629: goto -38 -> 591
    //   632: astore 8
    //   634: aload 7
    //   636: astore 6
    //   638: goto -122 -> 516
    // Local variable table:
    //   start	length	slot	name	signature
    //   171	283	0	i	int
    //   239	54	1	j	int
    //   163	298	2	k	int
    //   53	355	3	l	long
    //   46	48	5	localRandomAccessFile1	java.io.RandomAccessFile
    //   116	5	5	localException1	Exception
    //   147	295	5	localRandomAccessFile2	java.io.RandomAccessFile
    //   482	5	5	localException2	Exception
    //   518	1	5	localObject1	Object
    //   557	5	5	localException3	Exception
    //   589	8	5	localObject2	Object
    //   604	5	5	localException4	Exception
    //   184	360	6	localObject3	Object
    //   586	16	6	localObject4	Object
    //   627	1	6	localObject5	Object
    //   636	1	6	localRandomAccessFile3	java.io.RandomAccessFile
    //   42	593	7	localRandomAccessFile4	java.io.RandomAccessFile
    //   227	140	8	str1	String
    //   511	12	8	localException5	Exception
    //   632	1	8	localException6	Exception
    //   154	80	9	str2	String
    // Exception table:
    //   from	to	target	type
    //   102	107	116	java/lang/Exception
    //   468	473	482	java/lang/Exception
    //   30	44	511	java/lang/Exception
    //   543	548	557	java/lang/Exception
    //   30	44	586	finally
    //   596	601	604	java/lang/Exception
    //   48	54	627	finally
    //   58	85	627	finally
    //   95	102	627	finally
    //   149	156	627	finally
    //   160	164	627	finally
    //   168	172	627	finally
    //   176	182	627	finally
    //   190	198	627	finally
    //   202	229	627	finally
    //   233	240	627	finally
    //   250	257	627	finally
    //   261	265	627	finally
    //   269	292	627	finally
    //   302	308	627	finally
    //   312	319	627	finally
    //   323	331	627	finally
    //   335	362	627	finally
    //   366	373	627	finally
    //   380	396	627	finally
    //   405	411	627	finally
    //   415	439	627	finally
    //   443	468	627	finally
    //   520	538	627	finally
    //   48	54	632	java/lang/Exception
    //   58	85	632	java/lang/Exception
    //   95	102	632	java/lang/Exception
    //   149	156	632	java/lang/Exception
    //   160	164	632	java/lang/Exception
    //   168	172	632	java/lang/Exception
    //   176	182	632	java/lang/Exception
    //   190	198	632	java/lang/Exception
    //   202	229	632	java/lang/Exception
    //   233	240	632	java/lang/Exception
    //   250	257	632	java/lang/Exception
    //   261	265	632	java/lang/Exception
    //   269	292	632	java/lang/Exception
    //   302	308	632	java/lang/Exception
    //   312	319	632	java/lang/Exception
    //   323	331	632	java/lang/Exception
    //   335	362	632	java/lang/Exception
    //   366	373	632	java/lang/Exception
    //   380	396	632	java/lang/Exception
    //   405	411	632	java/lang/Exception
    //   415	439	632	java/lang/Exception
    //   443	468	632	java/lang/Exception
  }
  
  private static boolean pa()
  {
    GMTrace.i(13044352548864L, 97188);
    boolean bool = new File(esf).exists();
    GMTrace.o(13044352548864L, 97188);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */