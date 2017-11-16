package com.tencent.tinker.lib.b;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.tencent.tinker.loader.TinkerDexOptimizer;
import com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareElfFile;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public final class d
  extends b
{
  private static ArrayList<File> ygd = new ArrayList();
  private static ArrayList<ShareDexDiffPatchInfo> yge = new ArrayList();
  private static HashMap<ShareDexDiffPatchInfo, File> ygf = new HashMap();
  private static boolean ygg = ShareTinkerInternals.cqM();
  
  private static boolean YB(String paramString)
  {
    Object localObject2 = null;
    if ((yge.isEmpty()) || (!ygg)) {
      return false;
    }
    Iterator localIterator = yge.iterator();
    Object localObject1 = null;
    if (localIterator.hasNext())
    {
      ShareDexDiffPatchInfo localShareDexDiffPatchInfo = (ShareDexDiffPatchInfo)localIterator.next();
      File localFile = new File(paramString + localShareDexDiffPatchInfo.fTy);
      String str = localFile.getName();
      if (ShareConstants.yhC.matcher(str).matches()) {
        ygf.put(localShareDexDiffPatchInfo, localFile);
      }
      if (!localShareDexDiffPatchInfo.yhD.startsWith("test.dex")) {
        break label327;
      }
      localObject1 = localShareDexDiffPatchInfo;
      localObject2 = localFile;
    }
    label327:
    for (;;)
    {
      break;
      if (localObject1 != null) {
        ygf.put(ShareTinkerInternals.a((ShareDexDiffPatchInfo)localObject1, ygf.size() + 1), localObject2);
      }
      paramString = new File(paramString, "tinker_classN.apk");
      if (paramString.exists())
      {
        localObject1 = ygf.keySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (ShareDexDiffPatchInfo)((Iterator)localObject1).next();
          if (!SharePatchFileUtil.b(paramString, ((ShareDexDiffPatchInfo)localObject2).yhD, ((ShareDexDiffPatchInfo)localObject2).yhF)) {
            com.tencent.tinker.lib.e.a.e("Tinker.DexDiffPatchInternal", "verify dex file md5 error, entry name; %s, file len: %d", new Object[] { ((ShareDexDiffPatchInfo)localObject2).yhD, Long.valueOf(paramString.length()) });
          }
        }
      }
      for (boolean bool1 = false;; bool1 = true)
      {
        boolean bool2 = bool1;
        if (!bool1) {
          SharePatchFileUtil.ab(paramString);
        }
        for (bool2 = bool1; bool2; bool2 = false)
        {
          paramString = ygf.values().iterator();
          while (paramString.hasNext()) {
            SharePatchFileUtil.ab((File)paramString.next());
          }
        }
        return bool2;
      }
    }
  }
  
  /* Error */
  private static void a(ZipFile paramZipFile1, ZipFile paramZipFile2, ZipEntry paramZipEntry1, ZipEntry paramZipEntry2, ShareDexDiffPatchInfo paramShareDexDiffPatchInfo, File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: aconst_null
    //   4: astore 10
    //   6: aconst_null
    //   7: astore 9
    //   9: new 185	java/io/BufferedInputStream
    //   12: dup
    //   13: aload_0
    //   14: aload_2
    //   15: invokevirtual 191	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   18: invokespecial 194	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   21: astore_2
    //   22: aload_3
    //   23: ifnull +183 -> 206
    //   26: new 185	java/io/BufferedInputStream
    //   29: dup
    //   30: aload_1
    //   31: aload_3
    //   32: invokevirtual 191	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   35: invokespecial 194	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   38: astore_0
    //   39: aload 4
    //   41: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   44: invokestatic 197	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:YJ	(Ljava/lang/String;)Z
    //   47: istore 6
    //   49: iload 6
    //   51: ifeq +15 -> 66
    //   54: aload 4
    //   56: getfield 200	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhK	Z
    //   59: istore 7
    //   61: iload 7
    //   63: ifeq +202 -> 265
    //   66: new 202	java/util/zip/ZipOutputStream
    //   69: dup
    //   70: new 204	java/io/BufferedOutputStream
    //   73: dup
    //   74: new 206	java/io/FileOutputStream
    //   77: dup
    //   78: aload 5
    //   80: invokespecial 209	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   83: invokespecial 212	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   86: invokespecial 213	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   89: astore 4
    //   91: aload 4
    //   93: new 215	java/util/zip/ZipEntry
    //   96: dup
    //   97: ldc -39
    //   99: invokespecial 218	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   102: invokevirtual 222	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   105: iload 6
    //   107: ifne +141 -> 248
    //   110: new 224	java/util/zip/ZipInputStream
    //   113: dup
    //   114: aload_2
    //   115: invokespecial 225	java/util/zip/ZipInputStream:<init>	(Ljava/io/InputStream;)V
    //   118: astore_3
    //   119: aload_3
    //   120: invokevirtual 229	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   123: astore_1
    //   124: aload_1
    //   125: ifnull +15 -> 140
    //   128: ldc -39
    //   130: aload_1
    //   131: invokevirtual 230	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   134: invokevirtual 234	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   137: ifeq -18 -> 119
    //   140: aload_1
    //   141: ifnonnull +70 -> 211
    //   144: new 236	com/tencent/tinker/loader/TinkerRuntimeException
    //   147: dup
    //   148: new 65	java/lang/StringBuilder
    //   151: dup
    //   152: ldc -18
    //   154: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   157: aload 5
    //   159: invokevirtual 242	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   162: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: invokespecial 243	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;)V
    //   171: athrow
    //   172: astore_1
    //   173: aload_3
    //   174: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   177: aload_1
    //   178: athrow
    //   179: astore_1
    //   180: aload 4
    //   182: astore_3
    //   183: aload_3
    //   184: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   187: aload_1
    //   188: athrow
    //   189: astore_3
    //   190: aload_2
    //   191: astore_1
    //   192: aload_0
    //   193: astore_2
    //   194: aload_3
    //   195: astore_0
    //   196: aload_1
    //   197: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   200: aload_2
    //   201: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   204: aload_0
    //   205: athrow
    //   206: aconst_null
    //   207: astore_0
    //   208: goto -169 -> 39
    //   211: new 248	com/tencent/tinker/c/a/a
    //   214: dup
    //   215: aload_3
    //   216: aload_0
    //   217: invokespecial 251	com/tencent/tinker/c/a/a:<init>	(Ljava/io/InputStream;Ljava/io/InputStream;)V
    //   220: aload 4
    //   222: invokevirtual 253	com/tencent/tinker/c/a/a:b	(Ljava/io/OutputStream;)V
    //   225: aload_3
    //   226: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   229: aload 4
    //   231: invokevirtual 256	java/util/zip/ZipOutputStream:closeEntry	()V
    //   234: aload 4
    //   236: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   239: aload_2
    //   240: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   243: aload_0
    //   244: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   247: return
    //   248: new 248	com/tencent/tinker/c/a/a
    //   251: dup
    //   252: aload_2
    //   253: aload_0
    //   254: invokespecial 251	com/tencent/tinker/c/a/a:<init>	(Ljava/io/InputStream;Ljava/io/InputStream;)V
    //   257: aload 4
    //   259: invokevirtual 253	com/tencent/tinker/c/a/a:b	(Ljava/io/OutputStream;)V
    //   262: goto -33 -> 229
    //   265: new 248	com/tencent/tinker/c/a/a
    //   268: dup
    //   269: aload_2
    //   270: aload_0
    //   271: invokespecial 251	com/tencent/tinker/c/a/a:<init>	(Ljava/io/InputStream;Ljava/io/InputStream;)V
    //   274: astore_1
    //   275: new 204	java/io/BufferedOutputStream
    //   278: dup
    //   279: new 206	java/io/FileOutputStream
    //   282: dup
    //   283: aload 5
    //   285: invokespecial 209	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   288: invokespecial 212	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   291: astore_3
    //   292: aload_1
    //   293: aload_3
    //   294: invokevirtual 253	com/tencent/tinker/c/a/a:b	(Ljava/io/OutputStream;)V
    //   297: aload_3
    //   298: invokevirtual 261	java/io/OutputStream:close	()V
    //   301: goto -62 -> 239
    //   304: astore_1
    //   305: goto -66 -> 239
    //   308: astore_1
    //   309: aload 10
    //   311: astore_3
    //   312: aload_3
    //   313: ifnull +7 -> 320
    //   316: aload_3
    //   317: invokevirtual 261	java/io/OutputStream:close	()V
    //   320: aload_1
    //   321: athrow
    //   322: astore_3
    //   323: goto -3 -> 320
    //   326: astore_0
    //   327: aconst_null
    //   328: astore_1
    //   329: aload 8
    //   331: astore_2
    //   332: goto -136 -> 196
    //   335: astore_0
    //   336: aload_2
    //   337: astore_1
    //   338: aload 8
    //   340: astore_2
    //   341: goto -145 -> 196
    //   344: astore_1
    //   345: goto -33 -> 312
    //   348: astore_1
    //   349: aload 9
    //   351: astore_3
    //   352: goto -169 -> 183
    //   355: astore_1
    //   356: aconst_null
    //   357: astore_3
    //   358: goto -185 -> 173
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	361	0	paramZipFile1	ZipFile
    //   0	361	1	paramZipFile2	ZipFile
    //   0	361	2	paramZipEntry1	ZipEntry
    //   0	361	3	paramZipEntry2	ZipEntry
    //   0	361	4	paramShareDexDiffPatchInfo	ShareDexDiffPatchInfo
    //   0	361	5	paramFile	File
    //   47	59	6	bool1	boolean
    //   59	3	7	bool2	boolean
    //   1	338	8	localObject1	Object
    //   7	343	9	localObject2	Object
    //   4	306	10	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   119	124	172	finally
    //   128	140	172	finally
    //   144	172	172	finally
    //   211	225	172	finally
    //   91	105	179	finally
    //   173	179	179	finally
    //   225	229	179	finally
    //   229	234	179	finally
    //   248	262	179	finally
    //   39	49	189	finally
    //   54	61	189	finally
    //   183	189	189	finally
    //   234	239	189	finally
    //   265	275	189	finally
    //   297	301	189	finally
    //   316	320	189	finally
    //   320	322	189	finally
    //   297	301	304	java/lang/Exception
    //   275	292	308	finally
    //   316	320	322	java/lang/Exception
    //   9	22	326	finally
    //   26	39	335	finally
    //   292	297	344	finally
    //   66	91	348	finally
    //   110	119	355	finally
  }
  
  /* Error */
  private static boolean a(Context paramContext, File paramFile, String paramString)
  {
    // Byte code:
    //   0: getstatic 27	com/tencent/tinker/lib/b/d:yge	Ljava/util/ArrayList;
    //   3: invokevirtual 46	java/util/ArrayList:isEmpty	()Z
    //   6: ifne +9 -> 15
    //   9: getstatic 40	com/tencent/tinker/lib/b/d:ygg	Z
    //   12: ifne +5 -> 17
    //   15: iconst_1
    //   16: ireturn
    //   17: new 63	java/io/File
    //   20: dup
    //   21: aload_2
    //   22: ldc 125
    //   24: invokespecial 128	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   27: astore 9
    //   29: getstatic 32	com/tencent/tinker/lib/b/d:ygf	Ljava/util/HashMap;
    //   32: invokevirtual 265	java/util/HashMap:isEmpty	()Z
    //   35: ifeq +29 -> 64
    //   38: ldc -107
    //   40: ldc_w 267
    //   43: iconst_1
    //   44: anewarray 153	java/lang/Object
    //   47: dup
    //   48: iconst_0
    //   49: getstatic 32	com/tencent/tinker/lib/b/d:ygf	Ljava/util/HashMap;
    //   52: invokevirtual 119	java/util/HashMap:size	()I
    //   55: invokestatic 272	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   58: aastore
    //   59: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: iconst_1
    //   63: ireturn
    //   64: invokestatic 280	java/lang/System:currentTimeMillis	()J
    //   67: lstore_3
    //   68: aconst_null
    //   69: astore 8
    //   71: new 282	com/tencent/tinker/d/a/h
    //   74: dup
    //   75: new 204	java/io/BufferedOutputStream
    //   78: dup
    //   79: new 206	java/io/FileOutputStream
    //   82: dup
    //   83: aload 9
    //   85: invokespecial 209	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   88: invokespecial 212	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   91: invokespecial 283	com/tencent/tinker/d/a/h:<init>	(Ljava/io/OutputStream;)V
    //   94: astore_2
    //   95: getstatic 32	com/tencent/tinker/lib/b/d:ygf	Ljava/util/HashMap;
    //   98: invokevirtual 135	java/util/HashMap:keySet	()Ljava/util/Set;
    //   101: invokeinterface 138 1 0
    //   106: astore 7
    //   108: aload 7
    //   110: invokeinterface 55 1 0
    //   115: ifeq +306 -> 421
    //   118: aload 7
    //   120: invokeinterface 59 1 0
    //   125: checkcast 61	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo
    //   128: astore 8
    //   130: getstatic 32	com/tencent/tinker/lib/b/d:ygf	Ljava/util/HashMap;
    //   133: aload 8
    //   135: invokevirtual 287	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   138: checkcast 63	java/io/File
    //   141: astore 10
    //   143: aload 8
    //   145: getfield 200	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhK	Z
    //   148: ifeq +244 -> 392
    //   151: new 289	com/tencent/tinker/d/a/g
    //   154: dup
    //   155: aload 10
    //   157: invokespecial 290	com/tencent/tinker/d/a/g:<init>	(Ljava/io/File;)V
    //   160: astore 10
    //   162: aload 10
    //   164: ldc -39
    //   166: invokevirtual 294	com/tencent/tinker/d/a/g:YM	(Ljava/lang/String;)Lcom/tencent/tinker/d/a/f;
    //   169: astore 11
    //   171: new 296	com/tencent/tinker/d/a/f
    //   174: dup
    //   175: aload 11
    //   177: aload 8
    //   179: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   182: invokespecial 299	com/tencent/tinker/d/a/f:<init>	(Lcom/tencent/tinker/d/a/f;Ljava/lang/String;)V
    //   185: astore 8
    //   187: aload 10
    //   189: aload 11
    //   191: invokevirtual 302	com/tencent/tinker/d/a/g:a	(Lcom/tencent/tinker/d/a/f;)Ljava/io/InputStream;
    //   194: astore 10
    //   196: aload 8
    //   198: aload 10
    //   200: aload_2
    //   201: invokestatic 307	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/f;Ljava/io/InputStream;Lcom/tencent/tinker/d/a/h;)V
    //   204: aload 10
    //   206: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   209: goto -101 -> 108
    //   212: astore 7
    //   214: ldc -107
    //   216: aload 7
    //   218: ldc_w 309
    //   221: iconst_0
    //   222: anewarray 153	java/lang/Object
    //   225: invokestatic 313	com/tencent/tinker/lib/e/a:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   228: aload_2
    //   229: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   232: iconst_0
    //   233: istore 5
    //   235: iload 5
    //   237: istore 6
    //   239: iload 5
    //   241: ifeq +90 -> 331
    //   244: getstatic 32	com/tencent/tinker/lib/b/d:ygf	Ljava/util/HashMap;
    //   247: invokevirtual 135	java/util/HashMap:keySet	()Ljava/util/Set;
    //   250: invokeinterface 138 1 0
    //   255: astore_2
    //   256: iload 5
    //   258: istore 6
    //   260: aload_2
    //   261: invokeinterface 55 1 0
    //   266: ifeq +65 -> 331
    //   269: aload_2
    //   270: invokeinterface 59 1 0
    //   275: checkcast 61	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo
    //   278: astore 7
    //   280: aload 9
    //   282: aload 7
    //   284: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   287: aload 7
    //   289: getfield 141	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhF	Ljava/lang/String;
    //   292: invokestatic 147	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z
    //   295: ifne -39 -> 256
    //   298: ldc -107
    //   300: ldc -105
    //   302: iconst_2
    //   303: anewarray 153	java/lang/Object
    //   306: dup
    //   307: iconst_0
    //   308: aload 7
    //   310: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   313: aastore
    //   314: dup
    //   315: iconst_1
    //   316: aload 9
    //   318: invokevirtual 157	java/io/File:length	()J
    //   321: invokestatic 163	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   324: aastore
    //   325: invokestatic 169	com/tencent/tinker/lib/e/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   328: iconst_0
    //   329: istore 6
    //   331: iload 6
    //   333: ifeq +98 -> 431
    //   336: getstatic 32	com/tencent/tinker/lib/b/d:ygf	Ljava/util/HashMap;
    //   339: invokevirtual 177	java/util/HashMap:values	()Ljava/util/Collection;
    //   342: invokeinterface 180 1 0
    //   347: astore_0
    //   348: aload_0
    //   349: invokeinterface 55 1 0
    //   354: ifeq +117 -> 471
    //   357: aload_0
    //   358: invokeinterface 59 1 0
    //   363: checkcast 63	java/io/File
    //   366: invokestatic 173	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ab	(Ljava/io/File;)Z
    //   369: pop
    //   370: goto -22 -> 348
    //   373: astore 7
    //   375: aload 10
    //   377: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   380: aload 7
    //   382: athrow
    //   383: astore_0
    //   384: aload_2
    //   385: astore_1
    //   386: aload_1
    //   387: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   390: aload_0
    //   391: athrow
    //   392: new 296	com/tencent/tinker/d/a/f
    //   395: dup
    //   396: aload 8
    //   398: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   401: invokespecial 314	com/tencent/tinker/d/a/f:<init>	(Ljava/lang/String;)V
    //   404: aload 10
    //   406: aload 8
    //   408: getfield 317	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhH	Ljava/lang/String;
    //   411: invokestatic 321	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   414: aload_2
    //   415: invokestatic 324	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/f;Ljava/io/File;JLcom/tencent/tinker/d/a/h;)V
    //   418: goto -310 -> 108
    //   421: aload_2
    //   422: invokestatic 246	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   425: iconst_1
    //   426: istore 5
    //   428: goto -193 -> 235
    //   431: ldc -107
    //   433: ldc_w 326
    //   436: iconst_0
    //   437: anewarray 153	java/lang/Object
    //   440: invokestatic 169	com/tencent/tinker/lib/e/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   443: aload 9
    //   445: invokestatic 173	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ab	(Ljava/io/File;)Z
    //   448: pop
    //   449: aload_0
    //   450: invokestatic 332	com/tencent/tinker/lib/d/a:hQ	(Landroid/content/Context;)Lcom/tencent/tinker/lib/d/a;
    //   453: getfield 336	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   456: aload_1
    //   457: aload 9
    //   459: aload 9
    //   461: invokevirtual 84	java/io/File:getName	()Ljava/lang/String;
    //   464: bipush 7
    //   466: invokeinterface 341 5 0
    //   471: ldc -107
    //   473: ldc_w 343
    //   476: iconst_4
    //   477: anewarray 153	java/lang/Object
    //   480: dup
    //   481: iconst_0
    //   482: aload 9
    //   484: invokevirtual 346	java/io/File:getPath	()Ljava/lang/String;
    //   487: aastore
    //   488: dup
    //   489: iconst_1
    //   490: iload 6
    //   492: invokestatic 351	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   495: aastore
    //   496: dup
    //   497: iconst_2
    //   498: aload 9
    //   500: invokevirtual 157	java/io/File:length	()J
    //   503: invokestatic 163	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   506: aastore
    //   507: dup
    //   508: iconst_3
    //   509: invokestatic 280	java/lang/System:currentTimeMillis	()J
    //   512: lload_3
    //   513: lsub
    //   514: invokestatic 163	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   517: aastore
    //   518: invokestatic 354	com/tencent/tinker/lib/e/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   521: iload 6
    //   523: ireturn
    //   524: astore_0
    //   525: aconst_null
    //   526: astore_1
    //   527: goto -141 -> 386
    //   530: astore_0
    //   531: aload_2
    //   532: astore_1
    //   533: goto -147 -> 386
    //   536: astore 7
    //   538: aload 8
    //   540: astore_2
    //   541: goto -327 -> 214
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	544	0	paramContext	Context
    //   0	544	1	paramFile	File
    //   0	544	2	paramString	String
    //   67	446	3	l	long
    //   233	194	5	bool1	boolean
    //   237	285	6	bool2	boolean
    //   106	13	7	localIterator	Iterator
    //   212	5	7	localThrowable1	Throwable
    //   278	31	7	localShareDexDiffPatchInfo	ShareDexDiffPatchInfo
    //   373	8	7	localObject1	Object
    //   536	1	7	localThrowable2	Throwable
    //   69	470	8	localObject2	Object
    //   27	472	9	localFile	File
    //   141	264	10	localObject3	Object
    //   169	21	11	localf	com.tencent.tinker.d.a.f
    // Exception table:
    //   from	to	target	type
    //   95	108	212	java/lang/Throwable
    //   108	196	212	java/lang/Throwable
    //   204	209	212	java/lang/Throwable
    //   375	383	212	java/lang/Throwable
    //   392	418	212	java/lang/Throwable
    //   196	204	373	finally
    //   95	108	383	finally
    //   108	196	383	finally
    //   204	209	383	finally
    //   375	383	383	finally
    //   392	418	383	finally
    //   71	95	524	finally
    //   214	228	530	finally
    //   71	95	536	java/lang/Throwable
  }
  
  private static boolean a(Context paramContext, List<File> paramList, String paramString, File paramFile)
  {
    paramContext = com.tencent.tinker.lib.d.a.hQ(paramContext);
    ygd.clear();
    File localFile = new File(paramString);
    if ((!localFile.exists()) && (!localFile.mkdirs()))
    {
      com.tencent.tinker.lib.e.a.w("Tinker.DexDiffPatchInternal", "patch recover, make optimizeDexDirectoryFile fail", new Object[0]);
      return false;
    }
    final Object localObject = paramList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = SharePatchFileUtil.m((File)((Iterator)localObject).next(), localFile);
      ygd.add(new File(str));
    }
    com.tencent.tinker.lib.e.a.i("Tinker.DexDiffPatchInternal", "patch recover, try to optimize dex file count:%d, optimizeDexDirectory:%s", new Object[] { Integer.valueOf(paramList.size()), paramString });
    paramString = new Vector();
    localObject = new Throwable[1];
    TinkerDexOptimizer.a(paramList, localFile, new TinkerDexOptimizer.ResultCallback()
    {
      long startTime;
      
      public final void S(File paramAnonymousFile)
      {
        this.startTime = System.currentTimeMillis();
        com.tencent.tinker.lib.e.a.i("Tinker.DexDiffPatchInternal", "start to parallel optimize dex %s, size: %d", new Object[] { paramAnonymousFile.getPath(), Long.valueOf(paramAnonymousFile.length()) });
      }
      
      public final void b(File paramAnonymousFile, Throwable paramAnonymousThrowable)
      {
        com.tencent.tinker.lib.e.a.i("Tinker.DexDiffPatchInternal", "fail to parallel optimize dex %s use time %d", new Object[] { paramAnonymousFile.getPath(), Long.valueOf(System.currentTimeMillis() - this.startTime) });
        this.ygh.add(paramAnonymousFile);
        localObject[0] = paramAnonymousThrowable;
      }
      
      public final void k(File paramAnonymousFile1, File paramAnonymousFile2)
      {
        com.tencent.tinker.lib.e.a.i("Tinker.DexDiffPatchInternal", "success to parallel optimize dex %s, opt file:%s, opt file size: %d, use time %d", new Object[] { paramAnonymousFile1.getPath(), paramAnonymousFile2.getPath(), Long.valueOf(paramAnonymousFile2.length()), Long.valueOf(System.currentTimeMillis() - this.startTime) });
      }
    });
    if (!paramString.isEmpty())
    {
      paramContext.ygt.a(paramFile, paramString, localObject[0]);
      return false;
    }
    return true;
  }
  
  protected static boolean a(com.tencent.tinker.lib.d.a parama, ShareSecurityCheck paramShareSecurityCheck, Context paramContext, String paramString, File paramFile)
  {
    if (!ShareTinkerInternals.Gd(parama.tinkerFlags))
    {
      com.tencent.tinker.lib.e.a.w("Tinker.DexDiffPatchInternal", "patch recover, dex is not enabled", new Object[0]);
      return true;
    }
    parama = (String)paramShareSecurityCheck.yiV.get("assets/dex_meta.txt");
    if (parama == null)
    {
      com.tencent.tinker.lib.e.a.w("Tinker.DexDiffPatchInternal", "patch recover, dex is not contained", new Object[0]);
      return true;
    }
    long l = SystemClock.elapsedRealtime();
    paramShareSecurityCheck = paramString + "/dex/";
    if (!b(paramContext, paramShareSecurityCheck, parama, paramFile)) {
      com.tencent.tinker.lib.e.a.w("Tinker.DexDiffPatchInternal", "patch recover, extractDiffInternals fail", new Object[0]);
    }
    for (boolean bool = false;; bool = a(paramContext, paramShareSecurityCheck, paramString + "/odex/", paramFile))
    {
      com.tencent.tinker.lib.e.a.i("Tinker.DexDiffPatchInternal", "recover dex result:%b, cost:%d", new Object[] { Boolean.valueOf(bool), Long.valueOf(SystemClock.elapsedRealtime() - l) });
      return bool;
      parama = new File(paramShareSecurityCheck).listFiles();
      paramShareSecurityCheck = new ArrayList();
      if (parama != null)
      {
        int j = parama.length;
        int i = 0;
        while (i < j)
        {
          Object localObject = parama[i];
          if (((File)localObject).isFile()) {
            paramShareSecurityCheck.add(localObject);
          }
          i += 1;
        }
      }
    }
  }
  
  protected static boolean a(File paramFile, com.tencent.tinker.lib.d.a parama)
  {
    if (ygd.isEmpty()) {
      return true;
    }
    int j = yge.size() * 8;
    int i = j;
    if (j > 30) {
      i = 30;
    }
    com.tencent.tinker.lib.e.a.i("Tinker.DexDiffPatchInternal", "raw dex count: %d, dex opt dex count: %d, final wait times: %d", new Object[] { Integer.valueOf(yge.size()), Integer.valueOf(ygd.size()), Integer.valueOf(i) });
    j = 0;
    for (;;)
    {
      if (j < i)
      {
        Iterator localIterator1 = ygd.iterator();
        int k;
        for (;;)
        {
          if (localIterator1.hasNext())
          {
            localObject1 = (File)localIterator1.next();
            if (!SharePatchFileUtil.Z((File)localObject1))
            {
              com.tencent.tinker.lib.e.a.e("Tinker.DexDiffPatchInternal", "parallel dex optimizer file %s is not exist, just wait %d times", new Object[] { ((File)localObject1).getName(), Integer.valueOf(j + 1) });
              k = 0;
              if (k != 0) {
                break;
              }
            }
          }
        }
        try
        {
          Thread.sleep(15000L);
          j += 1;
          continue;
          k = 1;
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            com.tencent.tinker.lib.e.a.e("Tinker.DexDiffPatchInternal", "thread sleep InterruptedException e:" + localInterruptedException, new Object[0]);
          }
        }
      }
    }
    Object localObject1 = new ArrayList();
    Iterator localIterator2 = ygd.iterator();
    Object localObject2;
    while (localIterator2.hasNext())
    {
      localObject2 = (File)localIterator2.next();
      com.tencent.tinker.lib.e.a.i("Tinker.DexDiffPatchInternal", "check dex optimizer file exist: %s, size %d", new Object[] { ((File)localObject2).getPath(), Long.valueOf(((File)localObject2).length()) });
      if (!SharePatchFileUtil.Z((File)localObject2))
      {
        com.tencent.tinker.lib.e.a.e("Tinker.DexDiffPatchInternal", "final parallel dex optimizer file %s is not exist, return false", new Object[] { ((File)localObject2).getName() });
        ((List)localObject1).add(localObject2);
      }
    }
    if (!((List)localObject1).isEmpty())
    {
      parama.ygt.a(paramFile, (List)localObject1, new TinkerRuntimeException("checkDexOptExist failed"));
      return false;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject2 = ygd.iterator();
      localIterator2 = null;
    }
    for (;;)
    {
      File localFile;
      if (((Iterator)localObject2).hasNext())
      {
        localFile = (File)((Iterator)localObject2).next();
        com.tencent.tinker.lib.e.a.i("Tinker.DexDiffPatchInternal", "check dex optimizer file format: %s, size %d", new Object[] { localFile.getName(), Long.valueOf(localFile.length()) });
      }
      try
      {
        i = ShareElfFile.X(localFile);
        if (i == 1)
        {
          try
          {
            ShareElfFile localShareElfFile = new ShareElfFile(localFile);
            try
            {
              localShareElfFile.close();
            }
            catch (IOException localIOException1) {}
            continue;
          }
          catch (Throwable localThrowable)
          {
            localThrowable = localThrowable;
            com.tencent.tinker.lib.e.a.e("Tinker.DexDiffPatchInternal", "final parallel dex optimizer file %s is not elf format, return false", new Object[] { localIOException1.getName() });
            ((List)localObject1).add(localIOException1);
            continue;
          }
          finally {}
          if (!((List)localObject1).isEmpty())
          {
            if (localThrowable == null) {}
            for (TinkerRuntimeException localTinkerRuntimeException = new TinkerRuntimeException("checkDexOptFormat failed");; localTinkerRuntimeException = new TinkerRuntimeException("checkDexOptFormat failed", localTinkerRuntimeException))
            {
              parama.ygt.a(paramFile, (List)localObject1, localTinkerRuntimeException);
              return false;
            }
          }
          return true;
        }
      }
      catch (IOException localIOException2) {}
    }
  }
  
  private static boolean a(ZipFile paramZipFile, ZipEntry paramZipEntry, File paramFile, ShareDexDiffPatchInfo paramShareDexDiffPatchInfo)
  {
    if (ygg) {}
    for (String str1 = paramShareDexDiffPatchInfo.yhF;; str1 = paramShareDexDiffPatchInfo.yhE)
    {
      String str2 = paramShareDexDiffPatchInfo.yhD;
      boolean bool = paramShareDexDiffPatchInfo.yhK;
      if ((!SharePatchFileUtil.YJ(str2)) || (!bool)) {
        break;
      }
      return b(paramZipFile, paramZipEntry, paramFile, str1);
    }
    return a(paramZipFile, paramZipEntry, paramFile, str1, true);
  }
  
  /* Error */
  private static boolean b(Context paramContext, String paramString1, String paramString2, File paramFile)
  {
    // Byte code:
    //   0: getstatic 27	com/tencent/tinker/lib/b/d:yge	Ljava/util/ArrayList;
    //   3: invokevirtual 358	java/util/ArrayList:clear	()V
    //   6: aload_2
    //   7: getstatic 27	com/tencent/tinker/lib/b/d:yge	Ljava/util/ArrayList;
    //   10: invokestatic 506	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:l	(Ljava/lang/String;Ljava/util/ArrayList;)V
    //   13: getstatic 27	com/tencent/tinker/lib/b/d:yge	Ljava/util/ArrayList;
    //   16: invokevirtual 46	java/util/ArrayList:isEmpty	()Z
    //   19: ifeq +24 -> 43
    //   22: ldc -107
    //   24: ldc_w 508
    //   27: iconst_1
    //   28: anewarray 153	java/lang/Object
    //   31: dup
    //   32: iconst_0
    //   33: iconst_3
    //   34: invokestatic 512	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Gg	(I)Ljava/lang/String;
    //   37: aastore
    //   38: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: iconst_1
    //   42: ireturn
    //   43: new 63	java/io/File
    //   46: dup
    //   47: aload_1
    //   48: invokespecial 81	java/io/File:<init>	(Ljava/lang/String;)V
    //   51: astore_2
    //   52: aload_2
    //   53: invokevirtual 131	java/io/File:exists	()Z
    //   56: ifne +8 -> 64
    //   59: aload_2
    //   60: invokevirtual 361	java/io/File:mkdirs	()Z
    //   63: pop
    //   64: aload_0
    //   65: invokestatic 332	com/tencent/tinker/lib/d/a:hQ	(Landroid/content/Context;)Lcom/tencent/tinker/lib/d/a;
    //   68: astore 10
    //   70: aload_0
    //   71: invokevirtual 518	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   74: astore_2
    //   75: aload_2
    //   76: ifnonnull +25 -> 101
    //   79: ldc -107
    //   81: ldc_w 520
    //   84: iconst_0
    //   85: anewarray 153	java/lang/Object
    //   88: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: aconst_null
    //   92: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   95: aconst_null
    //   96: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   99: iconst_0
    //   100: ireturn
    //   101: new 187	java/util/zip/ZipFile
    //   104: dup
    //   105: aload_2
    //   106: getfield 528	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   109: invokespecial 529	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   112: astore_2
    //   113: new 187	java/util/zip/ZipFile
    //   116: dup
    //   117: aload_3
    //   118: invokespecial 530	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   121: astore 7
    //   123: aload_1
    //   124: invokestatic 532	com/tencent/tinker/lib/b/d:YB	(Ljava/lang/String;)Z
    //   127: ifeq +31 -> 158
    //   130: ldc -107
    //   132: ldc_w 534
    //   135: iconst_1
    //   136: anewarray 153	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: ldc 125
    //   143: aastore
    //   144: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: aload_2
    //   148: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   151: aload 7
    //   153: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   156: iconst_1
    //   157: ireturn
    //   158: getstatic 27	com/tencent/tinker/lib/b/d:yge	Ljava/util/ArrayList;
    //   161: invokevirtual 50	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   164: astore 11
    //   166: aload 11
    //   168: invokeinterface 55 1 0
    //   173: ifeq +1224 -> 1397
    //   176: aload 11
    //   178: invokeinterface 59 1 0
    //   183: checkcast 61	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo
    //   186: astore 12
    //   188: invokestatic 280	java/lang/System:currentTimeMillis	()J
    //   191: lstore 4
    //   193: aload 12
    //   195: getfield 537	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:path	Ljava/lang/String;
    //   198: ldc_w 539
    //   201: invokevirtual 234	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   204: ifeq +137 -> 341
    //   207: aload 12
    //   209: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   212: astore 8
    //   214: aload 12
    //   216: getfield 542	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhI	Ljava/lang/String;
    //   219: astore 14
    //   221: aload 12
    //   223: getfield 545	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhG	Ljava/lang/String;
    //   226: astore 13
    //   228: getstatic 40	com/tencent/tinker/lib/b/d:ygg	Z
    //   231: ifne +147 -> 378
    //   234: aload 12
    //   236: getfield 499	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhE	Ljava/lang/String;
    //   239: ldc_w 547
    //   242: invokevirtual 234	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   245: ifeq +133 -> 378
    //   248: ldc -107
    //   250: ldc_w 549
    //   253: iconst_1
    //   254: anewarray 153	java/lang/Object
    //   257: dup
    //   258: iconst_0
    //   259: aload 8
    //   261: aastore
    //   262: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   265: goto -99 -> 166
    //   268: astore_0
    //   269: aload_2
    //   270: astore_1
    //   271: aload_0
    //   272: astore_2
    //   273: aload 7
    //   275: astore_0
    //   276: new 236	com/tencent/tinker/loader/TinkerRuntimeException
    //   279: dup
    //   280: new 65	java/lang/StringBuilder
    //   283: dup
    //   284: ldc_w 551
    //   287: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   290: iconst_3
    //   291: invokestatic 512	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Gg	(I)Ljava/lang/String;
    //   294: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: ldc_w 553
    //   300: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: aload_2
    //   304: invokevirtual 556	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   307: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: ldc_w 558
    //   313: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   319: aload_2
    //   320: invokespecial 492	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   323: athrow
    //   324: astore_3
    //   325: aload_1
    //   326: astore_2
    //   327: aload_0
    //   328: astore_1
    //   329: aload_3
    //   330: astore_0
    //   331: aload_2
    //   332: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   335: aload_1
    //   336: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   339: aload_0
    //   340: athrow
    //   341: new 65	java/lang/StringBuilder
    //   344: dup
    //   345: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   348: aload 12
    //   350: getfield 537	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:path	Ljava/lang/String;
    //   353: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: ldc_w 560
    //   359: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: aload 12
    //   364: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   367: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   373: astore 8
    //   375: goto -161 -> 214
    //   378: getstatic 40	com/tencent/tinker/lib/b/d:ygg	Z
    //   381: ifeq +76 -> 457
    //   384: aload 12
    //   386: getfield 141	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhF	Ljava/lang/String;
    //   389: astore 9
    //   391: aload 9
    //   393: invokestatic 563	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:YI	(Ljava/lang/String;)Z
    //   396: ifne +71 -> 467
    //   399: ldc -107
    //   401: ldc_w 565
    //   404: iconst_3
    //   405: anewarray 153	java/lang/Object
    //   408: dup
    //   409: iconst_0
    //   410: iconst_3
    //   411: invokestatic 512	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Gg	(I)Ljava/lang/String;
    //   414: aastore
    //   415: dup
    //   416: iconst_1
    //   417: aload 12
    //   419: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   422: aastore
    //   423: dup
    //   424: iconst_2
    //   425: aload 9
    //   427: aastore
    //   428: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   431: aload 10
    //   433: getfield 336	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   436: aload_3
    //   437: iconst_3
    //   438: invokestatic 569	com/tencent/tinker/lib/b/b:Gc	(I)I
    //   441: invokeinterface 573 3 0
    //   446: aload_2
    //   447: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   450: aload 7
    //   452: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   455: iconst_0
    //   456: ireturn
    //   457: aload 12
    //   459: getfield 499	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhE	Ljava/lang/String;
    //   462: astore 9
    //   464: goto -73 -> 391
    //   467: new 63	java/io/File
    //   470: dup
    //   471: new 65	java/lang/StringBuilder
    //   474: dup
    //   475: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   478: aload_1
    //   479: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   482: aload 12
    //   484: getfield 74	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:fTy	Ljava/lang/String;
    //   487: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   490: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   493: invokespecial 81	java/io/File:<init>	(Ljava/lang/String;)V
    //   496: astore 15
    //   498: aload 15
    //   500: invokevirtual 131	java/io/File:exists	()Z
    //   503: ifeq +162 -> 665
    //   506: aload 15
    //   508: aload 9
    //   510: invokestatic 577	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:g	(Ljava/io/File;Ljava/lang/String;)Z
    //   513: ifeq +26 -> 539
    //   516: ldc -107
    //   518: ldc_w 579
    //   521: iconst_1
    //   522: anewarray 153	java/lang/Object
    //   525: dup
    //   526: iconst_0
    //   527: aload 15
    //   529: invokevirtual 346	java/io/File:getPath	()Ljava/lang/String;
    //   532: aastore
    //   533: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   536: goto -370 -> 166
    //   539: ldc -107
    //   541: new 65	java/lang/StringBuilder
    //   544: dup
    //   545: ldc_w 581
    //   548: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   551: aload 15
    //   553: invokevirtual 346	java/io/File:getPath	()Ljava/lang/String;
    //   556: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   559: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   562: iconst_0
    //   563: anewarray 153	java/lang/Object
    //   566: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   569: aload 15
    //   571: invokevirtual 584	java/io/File:delete	()Z
    //   574: pop
    //   575: aload 7
    //   577: aload 8
    //   579: invokevirtual 588	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   582: astore 17
    //   584: aload_2
    //   585: aload 8
    //   587: invokevirtual 588	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   590: astore 16
    //   592: aload 13
    //   594: ldc_w 547
    //   597: invokevirtual 234	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   600: ifeq +151 -> 751
    //   603: aload 17
    //   605: ifnonnull +72 -> 677
    //   608: ldc -107
    //   610: new 65	java/lang/StringBuilder
    //   613: dup
    //   614: ldc_w 590
    //   617: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   620: aload 8
    //   622: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   625: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   628: iconst_0
    //   629: anewarray 153	java/lang/Object
    //   632: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   635: aload 10
    //   637: getfield 336	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   640: aload_3
    //   641: aload 15
    //   643: aload 12
    //   645: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   648: iconst_3
    //   649: invokeinterface 341 5 0
    //   654: aload_2
    //   655: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   658: aload 7
    //   660: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   663: iconst_0
    //   664: ireturn
    //   665: aload 15
    //   667: invokevirtual 594	java/io/File:getParentFile	()Ljava/io/File;
    //   670: invokevirtual 361	java/io/File:mkdirs	()Z
    //   673: pop
    //   674: goto -99 -> 575
    //   677: aload 7
    //   679: aload 17
    //   681: aload 15
    //   683: aload 12
    //   685: invokestatic 596	com/tencent/tinker/lib/b/d:a	(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Lcom/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo;)Z
    //   688: ifne -522 -> 166
    //   691: ldc -107
    //   693: new 65	java/lang/StringBuilder
    //   696: dup
    //   697: ldc_w 598
    //   700: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   703: aload 15
    //   705: invokevirtual 346	java/io/File:getPath	()Ljava/lang/String;
    //   708: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   711: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   714: iconst_0
    //   715: anewarray 153	java/lang/Object
    //   718: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   721: aload 10
    //   723: getfield 336	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   726: aload_3
    //   727: aload 15
    //   729: aload 12
    //   731: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   734: iconst_3
    //   735: invokeinterface 341 5 0
    //   740: aload_2
    //   741: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   744: aload 7
    //   746: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   749: iconst_0
    //   750: ireturn
    //   751: aload 14
    //   753: ldc_w 547
    //   756: invokevirtual 234	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   759: ifeq +235 -> 994
    //   762: getstatic 40	com/tencent/tinker/lib/b/d:ygg	Z
    //   765: ifeq -599 -> 166
    //   768: aload 16
    //   770: ifnonnull +60 -> 830
    //   773: ldc -107
    //   775: new 65	java/lang/StringBuilder
    //   778: dup
    //   779: ldc_w 600
    //   782: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   785: aload 8
    //   787: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   790: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   793: iconst_0
    //   794: anewarray 153	java/lang/Object
    //   797: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   800: aload 10
    //   802: getfield 336	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   805: aload_3
    //   806: aload 15
    //   808: aload 12
    //   810: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   813: iconst_3
    //   814: invokeinterface 341 5 0
    //   819: aload_2
    //   820: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   823: aload 7
    //   825: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   828: iconst_0
    //   829: ireturn
    //   830: aload 16
    //   832: invokevirtual 603	java/util/zip/ZipEntry:getCrc	()J
    //   835: invokestatic 606	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   838: astore 14
    //   840: aload 14
    //   842: aload 13
    //   844: invokevirtual 234	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   847: ifne +60 -> 907
    //   850: ldc -107
    //   852: ldc_w 608
    //   855: iconst_3
    //   856: anewarray 153	java/lang/Object
    //   859: dup
    //   860: iconst_0
    //   861: aload 8
    //   863: aastore
    //   864: dup
    //   865: iconst_1
    //   866: aload 13
    //   868: aastore
    //   869: dup
    //   870: iconst_2
    //   871: aload 14
    //   873: aastore
    //   874: invokestatic 169	com/tencent/tinker/lib/e/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   877: aload 10
    //   879: getfield 336	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   882: aload_3
    //   883: aload 15
    //   885: aload 12
    //   887: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   890: iconst_3
    //   891: invokeinterface 341 5 0
    //   896: aload_2
    //   897: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   900: aload 7
    //   902: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   905: iconst_0
    //   906: ireturn
    //   907: aload_2
    //   908: aload 16
    //   910: aload 15
    //   912: aload 12
    //   914: invokestatic 596	com/tencent/tinker/lib/b/d:a	(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Lcom/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo;)Z
    //   917: pop
    //   918: aload 15
    //   920: aload 9
    //   922: invokestatic 577	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:g	(Ljava/io/File;Ljava/lang/String;)Z
    //   925: ifne -759 -> 166
    //   928: ldc -107
    //   930: new 65	java/lang/StringBuilder
    //   933: dup
    //   934: ldc_w 610
    //   937: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   940: aload 15
    //   942: invokevirtual 346	java/io/File:getPath	()Ljava/lang/String;
    //   945: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   948: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   951: iconst_0
    //   952: anewarray 153	java/lang/Object
    //   955: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   958: aload 10
    //   960: getfield 336	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   963: aload_3
    //   964: aload 15
    //   966: aload 12
    //   968: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   971: iconst_3
    //   972: invokeinterface 341 5 0
    //   977: aload 15
    //   979: invokestatic 173	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ab	(Ljava/io/File;)Z
    //   982: pop
    //   983: aload_2
    //   984: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   987: aload 7
    //   989: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   992: iconst_0
    //   993: ireturn
    //   994: aload 17
    //   996: ifnonnull +60 -> 1056
    //   999: ldc -107
    //   1001: new 65	java/lang/StringBuilder
    //   1004: dup
    //   1005: ldc_w 590
    //   1008: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1011: aload 8
    //   1013: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1016: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1019: iconst_0
    //   1020: anewarray 153	java/lang/Object
    //   1023: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1026: aload 10
    //   1028: getfield 336	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   1031: aload_3
    //   1032: aload 15
    //   1034: aload 12
    //   1036: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   1039: iconst_3
    //   1040: invokeinterface 341 5 0
    //   1045: aload_2
    //   1046: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1049: aload 7
    //   1051: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1054: iconst_0
    //   1055: ireturn
    //   1056: aload 14
    //   1058: invokestatic 563	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:YI	(Ljava/lang/String;)Z
    //   1061: ifne +61 -> 1122
    //   1064: ldc -107
    //   1066: ldc_w 565
    //   1069: iconst_3
    //   1070: anewarray 153	java/lang/Object
    //   1073: dup
    //   1074: iconst_0
    //   1075: iconst_3
    //   1076: invokestatic 512	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Gg	(I)Ljava/lang/String;
    //   1079: aastore
    //   1080: dup
    //   1081: iconst_1
    //   1082: aload 12
    //   1084: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   1087: aastore
    //   1088: dup
    //   1089: iconst_2
    //   1090: aload 14
    //   1092: aastore
    //   1093: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1096: aload 10
    //   1098: getfield 336	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   1101: aload_3
    //   1102: iconst_3
    //   1103: invokestatic 569	com/tencent/tinker/lib/b/b:Gc	(I)I
    //   1106: invokeinterface 573 3 0
    //   1111: aload_2
    //   1112: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1115: aload 7
    //   1117: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1120: iconst_0
    //   1121: ireturn
    //   1122: aload 16
    //   1124: ifnonnull +60 -> 1184
    //   1127: ldc -107
    //   1129: new 65	java/lang/StringBuilder
    //   1132: dup
    //   1133: ldc_w 600
    //   1136: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1139: aload 8
    //   1141: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1144: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1147: iconst_0
    //   1148: anewarray 153	java/lang/Object
    //   1151: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1154: aload 10
    //   1156: getfield 336	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   1159: aload_3
    //   1160: aload 15
    //   1162: aload 12
    //   1164: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   1167: iconst_3
    //   1168: invokeinterface 341 5 0
    //   1173: aload_2
    //   1174: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1177: aload 7
    //   1179: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1182: iconst_0
    //   1183: ireturn
    //   1184: aload 16
    //   1186: invokevirtual 603	java/util/zip/ZipEntry:getCrc	()J
    //   1189: invokestatic 606	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   1192: astore 14
    //   1194: aload 14
    //   1196: aload 13
    //   1198: invokevirtual 234	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1201: ifne +60 -> 1261
    //   1204: ldc -107
    //   1206: ldc_w 608
    //   1209: iconst_3
    //   1210: anewarray 153	java/lang/Object
    //   1213: dup
    //   1214: iconst_0
    //   1215: aload 8
    //   1217: aastore
    //   1218: dup
    //   1219: iconst_1
    //   1220: aload 13
    //   1222: aastore
    //   1223: dup
    //   1224: iconst_2
    //   1225: aload 14
    //   1227: aastore
    //   1228: invokestatic 169	com/tencent/tinker/lib/e/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1231: aload 10
    //   1233: getfield 336	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   1236: aload_3
    //   1237: aload 15
    //   1239: aload 12
    //   1241: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   1244: iconst_3
    //   1245: invokeinterface 341 5 0
    //   1250: aload_2
    //   1251: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1254: aload 7
    //   1256: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1259: iconst_0
    //   1260: ireturn
    //   1261: aload_2
    //   1262: aload 7
    //   1264: aload 16
    //   1266: aload 17
    //   1268: aload 12
    //   1270: aload 15
    //   1272: invokestatic 612	com/tencent/tinker/lib/b/d:a	(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/util/zip/ZipEntry;Lcom/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo;Ljava/io/File;)V
    //   1275: aload 15
    //   1277: aload 9
    //   1279: invokestatic 577	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:g	(Ljava/io/File;Ljava/lang/String;)Z
    //   1282: ifne +69 -> 1351
    //   1285: ldc -107
    //   1287: new 65	java/lang/StringBuilder
    //   1290: dup
    //   1291: ldc_w 610
    //   1294: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1297: aload 15
    //   1299: invokevirtual 346	java/io/File:getPath	()Ljava/lang/String;
    //   1302: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1305: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1308: iconst_0
    //   1309: anewarray 153	java/lang/Object
    //   1312: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1315: aload 10
    //   1317: getfield 336	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   1320: aload_3
    //   1321: aload 15
    //   1323: aload 12
    //   1325: getfield 108	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:yhD	Ljava/lang/String;
    //   1328: iconst_3
    //   1329: invokeinterface 341 5 0
    //   1334: aload 15
    //   1336: invokestatic 173	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ab	(Ljava/io/File;)Z
    //   1339: pop
    //   1340: aload_2
    //   1341: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1344: aload 7
    //   1346: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1349: iconst_0
    //   1350: ireturn
    //   1351: ldc -107
    //   1353: ldc_w 614
    //   1356: iconst_3
    //   1357: anewarray 153	java/lang/Object
    //   1360: dup
    //   1361: iconst_0
    //   1362: aload 15
    //   1364: invokevirtual 346	java/io/File:getPath	()Ljava/lang/String;
    //   1367: aastore
    //   1368: dup
    //   1369: iconst_1
    //   1370: aload 15
    //   1372: invokevirtual 157	java/io/File:length	()J
    //   1375: invokestatic 163	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1378: aastore
    //   1379: dup
    //   1380: iconst_2
    //   1381: invokestatic 280	java/lang/System:currentTimeMillis	()J
    //   1384: lload 4
    //   1386: lsub
    //   1387: invokestatic 163	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1390: aastore
    //   1391: invokestatic 275	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1394: goto -1228 -> 166
    //   1397: aload_0
    //   1398: aload_3
    //   1399: aload_1
    //   1400: invokestatic 616	com/tencent/tinker/lib/b/d:a	(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z
    //   1403: istore 6
    //   1405: iload 6
    //   1407: ifne +14 -> 1421
    //   1410: aload_2
    //   1411: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1414: aload 7
    //   1416: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1419: iconst_0
    //   1420: ireturn
    //   1421: aload_2
    //   1422: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1425: aload 7
    //   1427: invokestatic 523	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1430: iconst_1
    //   1431: ireturn
    //   1432: astore_0
    //   1433: aconst_null
    //   1434: astore_2
    //   1435: aconst_null
    //   1436: astore_1
    //   1437: goto -1106 -> 331
    //   1440: astore_0
    //   1441: aconst_null
    //   1442: astore_1
    //   1443: goto -1112 -> 331
    //   1446: astore_2
    //   1447: aconst_null
    //   1448: astore_1
    //   1449: aconst_null
    //   1450: astore_0
    //   1451: goto -1175 -> 276
    //   1454: astore_3
    //   1455: aconst_null
    //   1456: astore_0
    //   1457: aload_2
    //   1458: astore_1
    //   1459: aload_3
    //   1460: astore_2
    //   1461: goto -1185 -> 276
    //   1464: astore_0
    //   1465: aload 7
    //   1467: astore_1
    //   1468: goto -1137 -> 331
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1471	0	paramContext	Context
    //   0	1471	1	paramString1	String
    //   0	1471	2	paramString2	String
    //   0	1471	3	paramFile	File
    //   191	1194	4	l	long
    //   1403	3	6	bool	boolean
    //   121	1345	7	localZipFile	ZipFile
    //   212	1004	8	str1	String
    //   389	889	9	str2	String
    //   68	1248	10	locala	com.tencent.tinker.lib.d.a
    //   164	13	11	localIterator	Iterator
    //   186	1138	12	localShareDexDiffPatchInfo	ShareDexDiffPatchInfo
    //   226	995	13	str3	String
    //   219	1007	14	str4	String
    //   496	875	15	localFile	File
    //   590	675	16	localZipEntry1	ZipEntry
    //   582	685	17	localZipEntry2	ZipEntry
    // Exception table:
    //   from	to	target	type
    //   123	147	268	java/lang/Throwable
    //   158	166	268	java/lang/Throwable
    //   166	214	268	java/lang/Throwable
    //   214	265	268	java/lang/Throwable
    //   341	375	268	java/lang/Throwable
    //   378	391	268	java/lang/Throwable
    //   391	446	268	java/lang/Throwable
    //   457	464	268	java/lang/Throwable
    //   467	536	268	java/lang/Throwable
    //   539	575	268	java/lang/Throwable
    //   575	603	268	java/lang/Throwable
    //   608	654	268	java/lang/Throwable
    //   665	674	268	java/lang/Throwable
    //   677	740	268	java/lang/Throwable
    //   751	768	268	java/lang/Throwable
    //   773	819	268	java/lang/Throwable
    //   830	896	268	java/lang/Throwable
    //   907	983	268	java/lang/Throwable
    //   999	1045	268	java/lang/Throwable
    //   1056	1111	268	java/lang/Throwable
    //   1127	1173	268	java/lang/Throwable
    //   1184	1250	268	java/lang/Throwable
    //   1261	1340	268	java/lang/Throwable
    //   1351	1394	268	java/lang/Throwable
    //   1397	1405	268	java/lang/Throwable
    //   276	324	324	finally
    //   70	75	1432	finally
    //   79	91	1432	finally
    //   101	113	1432	finally
    //   113	123	1440	finally
    //   70	75	1446	java/lang/Throwable
    //   79	91	1446	java/lang/Throwable
    //   101	113	1446	java/lang/Throwable
    //   113	123	1454	java/lang/Throwable
    //   123	147	1464	finally
    //   158	166	1464	finally
    //   166	214	1464	finally
    //   214	265	1464	finally
    //   341	375	1464	finally
    //   378	391	1464	finally
    //   391	446	1464	finally
    //   457	464	1464	finally
    //   467	536	1464	finally
    //   539	575	1464	finally
    //   575	603	1464	finally
    //   608	654	1464	finally
    //   665	674	1464	finally
    //   677	740	1464	finally
    //   751	768	1464	finally
    //   773	819	1464	finally
    //   830	896	1464	finally
    //   907	983	1464	finally
    //   999	1045	1464	finally
    //   1056	1111	1464	finally
    //   1127	1173	1464	finally
    //   1184	1250	1464	finally
    //   1261	1340	1464	finally
    //   1351	1394	1464	finally
    //   1397	1405	1464	finally
  }
  
  private static boolean b(ZipFile paramZipFile, ZipEntry paramZipEntry, File paramFile, String paramString)
  {
    Object localObject2 = null;
    boolean bool = false;
    int i = 0;
    label9:
    if ((i < 2) && (!bool))
    {
      localObject1 = new FileOutputStream(paramFile);
      localObject3 = paramZipFile.getInputStream(paramZipEntry);
      com.tencent.tinker.lib.e.a.i("Tinker.DexDiffPatchInternal", "try Extracting " + paramFile.getPath(), new Object[0]);
    }
    try
    {
      localObject1 = new ZipOutputStream(new BufferedOutputStream((OutputStream)localObject1));
    }
    finally
    {
      try
      {
        localObject3 = new BufferedInputStream((InputStream)localObject3);
      }
      finally
      {
        for (;;)
        {
          byte[] arrayOfByte;
          int j;
          label125:
          label256:
          paramZipEntry = null;
          paramFile = (File)localObject1;
        }
      }
      try
      {
        arrayOfByte = new byte['䀀'];
        ((ZipOutputStream)localObject1).putNextEntry(new ZipEntry("classes.dex"));
        j = ((BufferedInputStream)localObject3).read(arrayOfByte);
        if (j != -1)
        {
          ((ZipOutputStream)localObject1).write(arrayOfByte, 0, j);
          j = ((BufferedInputStream)localObject3).read(arrayOfByte);
          break label125;
        }
        ((ZipOutputStream)localObject1).closeEntry();
        SharePatchFileUtil.b((Closeable)localObject3);
        SharePatchFileUtil.b((Closeable)localObject1);
        bool = SharePatchFileUtil.g(paramFile, paramString);
        com.tencent.tinker.lib.e.a.i("Tinker.DexDiffPatchInternal", "isExtractionSuccessful: %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
        {
          paramFile.delete();
          if (paramFile.exists()) {
            com.tencent.tinker.lib.e.a.e("Tinker.DexDiffPatchInternal", "Failed to delete corrupted dex " + paramFile.getPath(), new Object[0]);
          }
        }
        i += 1;
        break label9;
      }
      finally
      {
        paramFile = (File)localObject1;
        paramZipEntry = (ZipEntry)localObject3;
        break label256;
      }
      paramZipFile = finally;
      paramZipEntry = null;
      paramFile = (File)localObject2;
      SharePatchFileUtil.b(paramZipEntry);
      SharePatchFileUtil.b(paramFile);
      throw paramZipFile;
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\lib\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */