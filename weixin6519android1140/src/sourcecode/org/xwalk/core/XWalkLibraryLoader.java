package org.xwalk.core;

import android.content.Context;
import android.os.AsyncTask;
import com.tencent.xweb.util.e;
import java.io.File;

public class XWalkLibraryLoader
{
  private static final String DEFAULT_DOWNLOAD_FILE_NAME = "xwalk_download.tmp";
  private static final String DOWNLOAD_WITHOUT_NOTIFICATION = "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION";
  private static final String TAG = "XWalkLib";
  public static AsyncTask<Void, Integer, Integer> sActiveTask;
  
  public static boolean cancelHttpDownload()
  {
    return (sActiveTask != null) && ((sActiveTask instanceof HttpDownloadTask)) && (sActiveTask.cancel(true));
  }
  
  public static void finishInit(Context paramContext)
  {
    XWalkCoreWrapper.handlePostInit(paramContext.getClass().getName());
  }
  
  public static int getLibraryStatus()
  {
    return XWalkCoreWrapper.getCoreStatus();
  }
  
  public static boolean isDownloading()
  {
    return (sActiveTask != null) && ((sActiveTask instanceof HttpDownloadTask));
  }
  
  public static boolean isInitializing()
  {
    return false;
  }
  
  public static boolean isLibraryReady()
  {
    return XWalkCoreWrapper.getInstance() != null;
  }
  
  public static boolean isSharedLibrary()
  {
    return XWalkCoreWrapper.getInstance().isSharedMode();
  }
  
  public static void prepareToInit(Context paramContext)
  {
    XWalkEnvironment.init(paramContext);
    XWalkCoreWrapper.handlePreInit(paramContext.getClass().getName());
  }
  
  public static void startHttpDownload(DownloadListener paramDownloadListener, Context paramContext, XWalkUpdater.UpdateConfig paramUpdateConfig)
  {
    new HttpDownloadTask(paramDownloadListener, paramContext, paramUpdateConfig).execute(new Void[0]);
  }
  
  public static abstract interface ActivateListener
  {
    public abstract void onActivateCompleted();
    
    public abstract void onActivateFailed();
    
    public abstract void onActivateStarted();
  }
  
  public static abstract interface DecompressListener
  {
    public abstract void onDecompressCancelled();
    
    public abstract void onDecompressCompleted();
    
    public abstract void onDecompressStarted();
  }
  
  public static abstract interface DownloadListener
  {
    public abstract void onDownloadCancelled();
    
    public abstract void onDownloadCompleted(XWalkUpdater.UpdateConfig paramUpdateConfig);
    
    public abstract void onDownloadFailed(int paramInt1, int paramInt2);
    
    public abstract void onDownloadStarted();
    
    public abstract void onDownloadUpdated(int paramInt);
  }
  
  private static class HttpDownloadTask
    extends AsyncTask<Void, Integer, Integer>
  {
    private static final int DOWNLOAD_FAILED = -1;
    private static final int DOWNLOAD_SUCCESS = 0;
    private static final int UPDATE_INTERVAL_MS = 500;
    private static final String XWALK_DOWNLOAD_DIR = "xwalk_download";
    private Context mContext;
    private XWalkUpdater.UpdateConfig mDownloadConfig;
    private File mDownloadedFile;
    private XWalkLibraryLoader.DownloadListener mListener;
    private long mProgressUpdateTime;
    private long mStartTimestamp = 0L;
    
    HttpDownloadTask(XWalkLibraryLoader.DownloadListener paramDownloadListener, Context paramContext, XWalkUpdater.UpdateConfig paramUpdateConfig)
    {
      this.mListener = paramDownloadListener;
      this.mContext = paramContext;
      this.mDownloadConfig = paramUpdateConfig;
    }
    
    /* Error */
    protected Integer doInBackground(Void... paramVarArgs)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 43	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mDownloadConfig	Lorg/xwalk/core/XWalkUpdater$UpdateConfig;
      //   4: ifnonnull +12 -> 16
      //   7: iconst_m1
      //   8: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   11: astore 12
      //   13: aload 12
      //   15: areturn
      //   16: aconst_null
      //   17: astore 21
      //   19: aconst_null
      //   20: astore 20
      //   22: aconst_null
      //   23: astore 19
      //   25: aconst_null
      //   26: astore 22
      //   28: aconst_null
      //   29: astore 17
      //   31: aconst_null
      //   32: astore 18
      //   34: aconst_null
      //   35: astore 12
      //   37: aconst_null
      //   38: astore_1
      //   39: aload_1
      //   40: astore 13
      //   42: aload 22
      //   44: astore 15
      //   46: aload 21
      //   48: astore 16
      //   50: aload 12
      //   52: astore 14
      //   54: new 58	java/net/URL
      //   57: dup
      //   58: aload_0
      //   59: getfield 43	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mDownloadConfig	Lorg/xwalk/core/XWalkUpdater$UpdateConfig;
      //   62: getfield 63	org/xwalk/core/XWalkUpdater$UpdateConfig:downUrl	Ljava/lang/String;
      //   65: invokespecial 66	java/net/URL:<init>	(Ljava/lang/String;)V
      //   68: astore 23
      //   70: aload_1
      //   71: astore 13
      //   73: aload 22
      //   75: astore 15
      //   77: aload 21
      //   79: astore 16
      //   81: aload 12
      //   83: astore 14
      //   85: aload 23
      //   87: invokevirtual 70	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   90: checkcast 72	java/net/HttpURLConnection
      //   93: astore_1
      //   94: aload_1
      //   95: astore 12
      //   97: aload_1
      //   98: astore 13
      //   100: aload_1
      //   101: sipush 30000
      //   104: invokevirtual 76	java/net/HttpURLConnection:setConnectTimeout	(I)V
      //   107: aload_1
      //   108: astore 12
      //   110: aload_1
      //   111: astore 13
      //   113: aload_1
      //   114: sipush 30000
      //   117: invokevirtual 79	java/net/HttpURLConnection:setReadTimeout	(I)V
      //   120: aload_1
      //   121: astore 12
      //   123: aload_1
      //   124: astore 13
      //   126: aload_1
      //   127: invokevirtual 82	java/net/HttpURLConnection:connect	()V
      //   130: aload_1
      //   131: astore 12
      //   133: aload_1
      //   134: astore 13
      //   136: aload_1
      //   137: invokevirtual 86	java/net/HttpURLConnection:getResponseCode	()I
      //   140: sipush 200
      //   143: if_icmpeq +74 -> 217
      //   146: aload_1
      //   147: astore 12
      //   149: aload_1
      //   150: astore 13
      //   152: aload_1
      //   153: invokevirtual 86	java/net/HttpURLConnection:getResponseCode	()I
      //   156: sipush 206
      //   159: if_icmpeq +58 -> 217
      //   162: aload_1
      //   163: astore 12
      //   165: aload_1
      //   166: astore 13
      //   168: ldc 88
      //   170: new 90	java/lang/StringBuilder
      //   173: dup
      //   174: ldc 92
      //   176: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   179: aload_1
      //   180: invokevirtual 86	java/net/HttpURLConnection:getResponseCode	()I
      //   183: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   186: ldc 99
      //   188: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   191: aload_1
      //   192: invokevirtual 106	java/net/HttpURLConnection:getResponseMessage	()Ljava/lang/String;
      //   195: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   198: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   201: invokestatic 115	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   204: aload_1
      //   205: ifnull +7 -> 212
      //   208: aload_1
      //   209: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
      //   212: iconst_m1
      //   213: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   216: areturn
      //   217: aload_1
      //   218: astore 12
      //   220: aload_1
      //   221: astore 13
      //   223: aload_1
      //   224: invokevirtual 121	java/net/HttpURLConnection:getContentLength	()I
      //   227: istore_2
      //   228: aload_1
      //   229: astore 12
      //   231: aload_1
      //   232: astore 13
      //   234: aload_0
      //   235: getfield 123	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mDownloadedFile	Ljava/io/File;
      //   238: invokevirtual 129	java/io/File:exists	()Z
      //   241: ifeq +695 -> 936
      //   244: aload_1
      //   245: astore 12
      //   247: aload_1
      //   248: astore 13
      //   250: aload_0
      //   251: getfield 123	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mDownloadedFile	Ljava/io/File;
      //   254: invokevirtual 133	java/io/File:length	()J
      //   257: lstore 4
      //   259: iload_2
      //   260: i2l
      //   261: lload 4
      //   263: lcmp
      //   264: ifne +29 -> 293
      //   267: aload_1
      //   268: astore 12
      //   270: aload_1
      //   271: astore 13
      //   273: ldc 88
      //   275: ldc -121
      //   277: invokestatic 138	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   280: aload_1
      //   281: ifnull +7 -> 288
      //   284: aload_1
      //   285: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
      //   288: iconst_0
      //   289: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   292: areturn
      //   293: aload_1
      //   294: astore 12
      //   296: aload_1
      //   297: astore 13
      //   299: aload_1
      //   300: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
      //   303: aload_1
      //   304: astore 12
      //   306: aload_1
      //   307: astore 13
      //   309: aload 23
      //   311: invokevirtual 70	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   314: checkcast 72	java/net/HttpURLConnection
      //   317: astore_1
      //   318: aload_1
      //   319: astore 12
      //   321: aload_1
      //   322: astore 13
      //   324: aload_1
      //   325: sipush 30000
      //   328: invokevirtual 76	java/net/HttpURLConnection:setConnectTimeout	(I)V
      //   331: aload_1
      //   332: astore 12
      //   334: aload_1
      //   335: astore 13
      //   337: aload_1
      //   338: sipush 30000
      //   341: invokevirtual 79	java/net/HttpURLConnection:setReadTimeout	(I)V
      //   344: aload_1
      //   345: astore 12
      //   347: aload_1
      //   348: astore 13
      //   350: aload_1
      //   351: ldc -116
      //   353: new 90	java/lang/StringBuilder
      //   356: dup
      //   357: ldc -114
      //   359: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   362: lload 4
      //   364: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   367: ldc -109
      //   369: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   372: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   375: invokevirtual 150	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   378: aload_1
      //   379: astore 12
      //   381: aload_1
      //   382: astore 13
      //   384: ldc 88
      //   386: new 90	java/lang/StringBuilder
      //   389: dup
      //   390: ldc -104
      //   392: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   395: lload 4
      //   397: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   400: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   403: invokestatic 138	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   406: aload_1
      //   407: astore 12
      //   409: aload_1
      //   410: astore 13
      //   412: aload_1
      //   413: invokevirtual 82	java/net/HttpURLConnection:connect	()V
      //   416: aload_1
      //   417: astore 12
      //   419: aload_1
      //   420: astore 13
      //   422: aload_1
      //   423: invokevirtual 86	java/net/HttpURLConnection:getResponseCode	()I
      //   426: sipush 200
      //   429: if_icmpeq +74 -> 503
      //   432: aload_1
      //   433: astore 12
      //   435: aload_1
      //   436: astore 13
      //   438: aload_1
      //   439: invokevirtual 86	java/net/HttpURLConnection:getResponseCode	()I
      //   442: sipush 206
      //   445: if_icmpeq +58 -> 503
      //   448: aload_1
      //   449: astore 12
      //   451: aload_1
      //   452: astore 13
      //   454: ldc 88
      //   456: new 90	java/lang/StringBuilder
      //   459: dup
      //   460: ldc 92
      //   462: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   465: aload_1
      //   466: invokevirtual 86	java/net/HttpURLConnection:getResponseCode	()I
      //   469: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   472: ldc 99
      //   474: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   477: aload_1
      //   478: invokevirtual 106	java/net/HttpURLConnection:getResponseMessage	()Ljava/lang/String;
      //   481: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   484: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   487: invokestatic 115	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   490: aload_1
      //   491: ifnull +7 -> 498
      //   494: aload_1
      //   495: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
      //   498: iconst_m1
      //   499: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   502: areturn
      //   503: aload_1
      //   504: astore 12
      //   506: aload_1
      //   507: astore 13
      //   509: aload_1
      //   510: invokevirtual 121	java/net/HttpURLConnection:getContentLength	()I
      //   513: istore_2
      //   514: aload_1
      //   515: astore 13
      //   517: aload 22
      //   519: astore 15
      //   521: aload 21
      //   523: astore 16
      //   525: aload_1
      //   526: astore 14
      //   528: aload_1
      //   529: invokevirtual 156	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   532: astore 12
      //   534: new 158	java/io/FileOutputStream
      //   537: dup
      //   538: aload_0
      //   539: getfield 123	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mDownloadedFile	Ljava/io/File;
      //   542: iconst_1
      //   543: invokespecial 161	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
      //   546: astore 13
      //   548: sipush 4096
      //   551: newarray <illegal type>
      //   553: astore 14
      //   555: lconst_0
      //   556: lstore 6
      //   558: aload 12
      //   560: aload 14
      //   562: invokevirtual 167	java/io/InputStream:read	([B)I
      //   565: istore_3
      //   566: iload_3
      //   567: iconst_m1
      //   568: if_icmpeq +173 -> 741
      //   571: aload_0
      //   572: invokevirtual 170	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:isCancelled	()Z
      //   575: ifeq +39 -> 614
      //   578: iconst_m1
      //   579: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   582: astore 14
      //   584: aload 13
      //   586: invokevirtual 175	java/io/OutputStream:close	()V
      //   589: aload 12
      //   591: ifnull +8 -> 599
      //   594: aload 12
      //   596: invokevirtual 176	java/io/InputStream:close	()V
      //   599: aload 14
      //   601: astore 12
      //   603: aload_1
      //   604: ifnull -591 -> 13
      //   607: aload_1
      //   608: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
      //   611: aload 14
      //   613: areturn
      //   614: lload 6
      //   616: iload_3
      //   617: i2l
      //   618: ladd
      //   619: lstore 8
      //   621: aload 13
      //   623: aload 14
      //   625: iconst_0
      //   626: iload_3
      //   627: invokevirtual 180	java/io/OutputStream:write	([BII)V
      //   630: invokestatic 185	android/os/SystemClock:uptimeMillis	()J
      //   633: lstore 10
      //   635: lload 8
      //   637: lstore 6
      //   639: lload 10
      //   641: aload_0
      //   642: getfield 187	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mProgressUpdateTime	J
      //   645: lsub
      //   646: ldc2_w 188
      //   649: lcmp
      //   650: ifle -92 -> 558
      //   653: aload_0
      //   654: lload 10
      //   656: putfield 187	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mProgressUpdateTime	J
      //   659: aload_0
      //   660: iconst_2
      //   661: anewarray 52	java/lang/Integer
      //   664: dup
      //   665: iconst_0
      //   666: lload 8
      //   668: lload 4
      //   670: ladd
      //   671: l2i
      //   672: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   675: aastore
      //   676: dup
      //   677: iconst_1
      //   678: iload_2
      //   679: i2l
      //   680: lload 4
      //   682: ladd
      //   683: l2i
      //   684: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   687: aastore
      //   688: invokevirtual 193	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:publishProgress	([Ljava/lang/Object;)V
      //   691: lload 8
      //   693: lstore 6
      //   695: goto -137 -> 558
      //   698: astore 14
      //   700: iconst_m1
      //   701: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   704: astore 14
      //   706: aload 13
      //   708: ifnull +8 -> 716
      //   711: aload 13
      //   713: invokevirtual 175	java/io/OutputStream:close	()V
      //   716: aload 12
      //   718: ifnull +8 -> 726
      //   721: aload 12
      //   723: invokevirtual 176	java/io/InputStream:close	()V
      //   726: aload 14
      //   728: astore 12
      //   730: aload_1
      //   731: ifnull -718 -> 13
      //   734: aload_1
      //   735: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
      //   738: aload 14
      //   740: areturn
      //   741: aload 13
      //   743: invokevirtual 196	java/io/OutputStream:flush	()V
      //   746: aload 13
      //   748: invokevirtual 175	java/io/OutputStream:close	()V
      //   751: aload 12
      //   753: ifnull +8 -> 761
      //   756: aload 12
      //   758: invokevirtual 176	java/io/InputStream:close	()V
      //   761: aload_1
      //   762: ifnull +7 -> 769
      //   765: aload_1
      //   766: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
      //   769: iconst_0
      //   770: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   773: areturn
      //   774: astore 12
      //   776: aload 16
      //   778: astore_1
      //   779: aload 15
      //   781: astore 14
      //   783: aload 14
      //   785: ifnull +8 -> 793
      //   788: aload 14
      //   790: invokevirtual 175	java/io/OutputStream:close	()V
      //   793: aload_1
      //   794: ifnull +7 -> 801
      //   797: aload_1
      //   798: invokevirtual 176	java/io/InputStream:close	()V
      //   801: aload 13
      //   803: ifnull +8 -> 811
      //   806: aload 13
      //   808: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
      //   811: aload 12
      //   813: athrow
      //   814: astore_1
      //   815: goto -14 -> 801
      //   818: astore_1
      //   819: aload 12
      //   821: astore 13
      //   823: aload_1
      //   824: astore 12
      //   826: aload 17
      //   828: astore 14
      //   830: aload 20
      //   832: astore_1
      //   833: goto -50 -> 783
      //   836: astore 13
      //   838: aload 12
      //   840: astore 15
      //   842: aload 13
      //   844: astore 12
      //   846: aload_1
      //   847: astore 13
      //   849: aload 17
      //   851: astore 14
      //   853: aload 15
      //   855: astore_1
      //   856: goto -73 -> 783
      //   859: astore 16
      //   861: aload 13
      //   863: astore 14
      //   865: aload 12
      //   867: astore 15
      //   869: aload 16
      //   871: astore 12
      //   873: aload_1
      //   874: astore 13
      //   876: aload 15
      //   878: astore_1
      //   879: goto -96 -> 783
      //   882: astore 12
      //   884: goto -158 -> 726
      //   887: astore_1
      //   888: aload 14
      //   890: astore_1
      //   891: aload 18
      //   893: astore 13
      //   895: aload 19
      //   897: astore 12
      //   899: goto -199 -> 700
      //   902: astore_1
      //   903: aload 13
      //   905: astore_1
      //   906: aload 18
      //   908: astore 13
      //   910: aload 19
      //   912: astore 12
      //   914: goto -214 -> 700
      //   917: astore 13
      //   919: aload 18
      //   921: astore 13
      //   923: goto -223 -> 700
      //   926: astore 12
      //   928: goto -167 -> 761
      //   931: astore 12
      //   933: goto -334 -> 599
      //   936: lconst_0
      //   937: lstore 4
      //   939: goto -425 -> 514
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	942	0	this	HttpDownloadTask
      //   0	942	1	paramVarArgs	Void[]
      //   227	452	2	i	int
      //   565	62	3	j	int
      //   257	681	4	l1	long
      //   556	138	6	l2	long
      //   619	73	8	l3	long
      //   633	22	10	l4	long
      //   11	746	12	localObject1	Object
      //   774	46	12	localObject2	Object
      //   824	48	12	localObject3	Object
      //   882	1	12	localIOException1	java.io.IOException
      //   897	16	12	localObject4	Object
      //   926	1	12	localIOException2	java.io.IOException
      //   931	1	12	localIOException3	java.io.IOException
      //   40	782	13	localObject5	Object
      //   836	7	13	localObject6	Object
      //   847	62	13	localObject7	Object
      //   917	1	13	localException1	Exception
      //   921	1	13	localObject8	Object
      //   52	572	14	localObject9	Object
      //   698	1	14	localException2	Exception
      //   704	185	14	localObject10	Object
      //   44	833	15	localObject11	Object
      //   48	729	16	localObject12	Object
      //   859	11	16	localObject13	Object
      //   29	821	17	localObject14	Object
      //   32	888	18	localObject15	Object
      //   23	888	19	localObject16	Object
      //   20	811	20	localObject17	Object
      //   17	505	21	localObject18	Object
      //   26	492	22	localObject19	Object
      //   68	242	23	localURL	java.net.URL
      // Exception table:
      //   from	to	target	type
      //   548	555	698	java/lang/Exception
      //   558	566	698	java/lang/Exception
      //   571	578	698	java/lang/Exception
      //   621	635	698	java/lang/Exception
      //   639	691	698	java/lang/Exception
      //   741	746	698	java/lang/Exception
      //   54	70	774	finally
      //   85	94	774	finally
      //   528	534	774	finally
      //   788	793	814	java/io/IOException
      //   797	801	814	java/io/IOException
      //   100	107	818	finally
      //   113	120	818	finally
      //   126	130	818	finally
      //   136	146	818	finally
      //   152	162	818	finally
      //   168	204	818	finally
      //   223	228	818	finally
      //   234	244	818	finally
      //   250	259	818	finally
      //   273	280	818	finally
      //   299	303	818	finally
      //   309	318	818	finally
      //   324	331	818	finally
      //   337	344	818	finally
      //   350	378	818	finally
      //   384	406	818	finally
      //   412	416	818	finally
      //   422	432	818	finally
      //   438	448	818	finally
      //   454	490	818	finally
      //   509	514	818	finally
      //   534	548	836	finally
      //   548	555	859	finally
      //   558	566	859	finally
      //   571	578	859	finally
      //   621	635	859	finally
      //   639	691	859	finally
      //   741	746	859	finally
      //   711	716	882	java/io/IOException
      //   721	726	882	java/io/IOException
      //   54	70	887	java/lang/Exception
      //   85	94	887	java/lang/Exception
      //   528	534	887	java/lang/Exception
      //   100	107	902	java/lang/Exception
      //   113	120	902	java/lang/Exception
      //   126	130	902	java/lang/Exception
      //   136	146	902	java/lang/Exception
      //   152	162	902	java/lang/Exception
      //   168	204	902	java/lang/Exception
      //   223	228	902	java/lang/Exception
      //   234	244	902	java/lang/Exception
      //   250	259	902	java/lang/Exception
      //   273	280	902	java/lang/Exception
      //   299	303	902	java/lang/Exception
      //   309	318	902	java/lang/Exception
      //   324	331	902	java/lang/Exception
      //   337	344	902	java/lang/Exception
      //   350	378	902	java/lang/Exception
      //   384	406	902	java/lang/Exception
      //   412	416	902	java/lang/Exception
      //   422	432	902	java/lang/Exception
      //   438	448	902	java/lang/Exception
      //   454	490	902	java/lang/Exception
      //   509	514	902	java/lang/Exception
      //   534	548	917	java/lang/Exception
      //   746	751	926	java/io/IOException
      //   756	761	926	java/io/IOException
      //   584	589	931	java/io/IOException
      //   594	599	931	java/io/IOException
    }
    
    protected void onCancelled(Integer paramInteger)
    {
      Log.d("XWalkLib", "HttpDownloadTask cancelled");
      XWalkLibraryLoader.sActiveTask = null;
      this.mListener.onDownloadCancelled();
    }
    
    protected void onPostExecute(Integer paramInteger)
    {
      Log.d("XWalkLib", "HttpDownloadTask finished, " + paramInteger);
      XWalkLibraryLoader.sActiveTask = null;
      if (paramInteger.intValue() == 0)
      {
        this.mListener.onDownloadCompleted(this.mDownloadConfig);
        if (this.mDownloadConfig.isPatchUpdate)
        {
          e.fC(System.currentTimeMillis() - this.mStartTimestamp);
          return;
        }
        e.fA(System.currentTimeMillis() - this.mStartTimestamp);
        return;
      }
      this.mListener.onDownloadFailed(-1, 0);
      if (this.mDownloadConfig.isPatchUpdate)
      {
        e.css();
        return;
      }
      e.cso();
    }
    
    protected void onPreExecute()
    {
      Log.d("XWalkLib", "HttpDownloadTask started, config:" + this.mDownloadConfig.getLogSelf());
      XWalkLibraryLoader.sActiveTask = this;
      this.mDownloadedFile = new File(this.mDownloadConfig.getDownloadPath());
      this.mListener.onDownloadStarted();
      this.mStartTimestamp = System.currentTimeMillis();
      if (this.mDownloadConfig.isPatchUpdate)
      {
        e.csr();
        return;
      }
      e.csn();
    }
    
    protected void onProgressUpdate(Integer... paramVarArgs)
    {
      int i = 0;
      Log.d("XWalkLib", "HttpDownloadTask updated: " + paramVarArgs[0] + "/" + paramVarArgs[1]);
      if (paramVarArgs[1].intValue() > 0) {
        i = (int)(paramVarArgs[0].intValue() * 100.0D / paramVarArgs[1].intValue());
      }
      this.mListener.onDownloadUpdated(i);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\org\xwalk\core\XWalkLibraryLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */