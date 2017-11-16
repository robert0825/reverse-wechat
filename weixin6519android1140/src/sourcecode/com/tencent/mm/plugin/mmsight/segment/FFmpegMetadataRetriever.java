package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FFmpegMetadataRetriever
{
  public static final String METADATA_CHAPTER_COUNT = "chapter_count";
  public static final String METADATA_KEY_ALBUM = "album";
  public static final String METADATA_KEY_ALBUM_ARTIST = "album_artist";
  public static final String METADATA_KEY_ARTIST = "artist";
  public static final String METADATA_KEY_AUDIO_CODEC = "audio_codec";
  public static final String METADATA_KEY_CHAPTER_END_TIME = "chapter_end_time";
  public static final String METADATA_KEY_CHAPTER_START_TIME = "chapter_start_time";
  public static final String METADATA_KEY_COMMENT = "comment";
  public static final String METADATA_KEY_COMPOSER = "composer";
  public static final String METADATA_KEY_COPYRIGHT = "copyright";
  public static final String METADATA_KEY_CREATION_TIME = "creation_time";
  public static final String METADATA_KEY_DATE = "date";
  public static final String METADATA_KEY_DISC = "disc";
  public static final String METADATA_KEY_DURATION = "duration";
  public static final String METADATA_KEY_ENCODED_BY = "encoded_by";
  public static final String METADATA_KEY_ENCODER = "encoder";
  public static final String METADATA_KEY_FILENAME = "filename";
  public static final String METADATA_KEY_FILESIZE = "filesize";
  public static final String METADATA_KEY_FRAMERATE = "framerate";
  public static final String METADATA_KEY_GENRE = "genre";
  public static final String METADATA_KEY_ICY_METADATA = "icy_metadata";
  public static final String METADATA_KEY_LANGUAGE = "language";
  public static final String METADATA_KEY_PERFORMER = "performer";
  public static final String METADATA_KEY_PUBLISHER = "publisher";
  public static final String METADATA_KEY_SERVICE_NAME = "service_name";
  public static final String METADATA_KEY_SERVICE_PROVIDER = "service_provider";
  public static final String METADATA_KEY_TITLE = "title";
  public static final String METADATA_KEY_TRACK = "track";
  public static final String METADATA_KEY_VARIANT_BITRATE = "bitrate";
  public static final String METADATA_KEY_VIDEO_CODEC = "video_codec";
  public static final String METADATA_KEY_VIDEO_HEIGHT = "video_height";
  public static final String METADATA_KEY_VIDEO_ROTATION = "rotate";
  public static final String METADATA_KEY_VIDEO_WIDTH = "video_width";
  public static final int OPTION_CLOSEST = 3;
  public static final int OPTION_CLOSEST_SYNC = 2;
  public static final int OPTION_NEXT_SYNC = 1;
  public static final int OPTION_PREVIOUS_SYNC = 0;
  private static final String TAG = "FFmpegMetadataRetriever";
  private long mNativeContext;
  private Bitmap reuse;
  
  static
  {
    GMTrace.i(7483309424640L, 55755);
    native_init();
    GMTrace.o(7483309424640L, 55755);
  }
  
  public FFmpegMetadataRetriever()
  {
    GMTrace.i(7479417110528L, 55726);
    native_setup();
    GMTrace.o(7479417110528L, 55726);
  }
  
  private native byte[] _getFrameAtTime(long paramLong, int paramInt);
  
  private native byte[] _getScaledFrameAtTime(long paramLong, int paramInt1, int paramInt2, int paramInt3);
  
  private native void _setDataSource(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2);
  
  private Bitmap getBitmapFromPixels(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(7481833029632L, 55744);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(7481833029632L, 55744);
      return null;
    }
    int i = paramInt1;
    if (paramInt1 == -1) {
      i = getVideoWidth();
    }
    paramInt1 = paramInt2;
    if (paramInt2 == -1) {
      paramInt1 = getVideoHeight();
    }
    if ((i <= 0) || (paramInt1 <= 0)) {
      throw new IllegalStateException(String.format(Locale.CHINA, "Can not get bitmap width and height [%d, %d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) }));
    }
    Bitmap localBitmap2 = this.reuse;
    Bitmap localBitmap1 = localBitmap2;
    if (localBitmap2 == null) {
      localBitmap1 = Bitmap.createBitmap(i, paramInt1, Bitmap.Config.ARGB_8888);
    }
    localBitmap1.copyPixelsFromBuffer(ByteBuffer.wrap(paramArrayOfByte));
    GMTrace.o(7481833029632L, 55744);
    return localBitmap1;
  }
  
  private native void native_finalize();
  
  private final native HashMap<String, String> native_getMetadata(boolean paramBoolean1, boolean paramBoolean2, HashMap<String, String> paramHashMap);
  
  private static native void native_init();
  
  private native void native_setup();
  
  public native String extractMetadata(String paramString);
  
  public native String extractMetadataFromChapter(String paramString, int paramInt);
  
  protected void finalize()
  {
    GMTrace.i(7483175206912L, 55754);
    try
    {
      native_finalize();
      super.finalize();
      GMTrace.o(7483175206912L, 55754);
      return;
    }
    catch (Exception localException)
    {
      w.e("FFmpegMetadataRetriever", "do nothing");
      super.finalize();
      GMTrace.o(7483175206912L, 55754);
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public Bitmap getFrameAtTime()
  {
    GMTrace.i(7481161940992L, 55739);
    Bitmap localBitmap = getFrameAtTime(-1L, 2);
    GMTrace.o(7481161940992L, 55739);
    return localBitmap;
  }
  
  public Bitmap getFrameAtTime(long paramLong)
  {
    GMTrace.i(7481027723264L, 55738);
    Bitmap localBitmap = null;
    byte[] arrayOfByte = _getFrameAtTime(paramLong, 2);
    if (arrayOfByte != null) {
      localBitmap = getBitmapFromPixels(arrayOfByte, -1, -1);
    }
    GMTrace.o(7481027723264L, 55738);
    return localBitmap;
  }
  
  public Bitmap getFrameAtTime(long paramLong, int paramInt)
  {
    GMTrace.i(7480893505536L, 55737);
    if ((paramInt < 0) || (paramInt > 3)) {
      throw new IllegalArgumentException("Unsupported option: " + paramInt);
    }
    Bitmap localBitmap = null;
    byte[] arrayOfByte = _getFrameAtTime(paramLong, paramInt);
    if (arrayOfByte != null) {
      localBitmap = getBitmapFromPixels(arrayOfByte, -1, -1);
    }
    GMTrace.o(7480893505536L, 55737);
    return localBitmap;
  }
  
  public a getMetadata()
  {
    int i = 0;
    GMTrace.i(7480625070080L, 55735);
    a locala = new a();
    HashMap localHashMap = native_getMetadata(false, false, null);
    if (localHashMap == null)
    {
      GMTrace.o(7480625070080L, 55735);
      return null;
    }
    if (localHashMap == null) {}
    while (i == 0)
    {
      GMTrace.o(7480625070080L, 55735);
      return null;
      locala.ndt = localHashMap;
      i = 1;
    }
    GMTrace.o(7480625070080L, 55735);
    return locala;
  }
  
  public Bitmap getScaledFrameAtTime(long paramLong, int paramInt1, int paramInt2)
  {
    GMTrace.i(7481564594176L, 55742);
    Bitmap localBitmap = null;
    byte[] arrayOfByte = _getScaledFrameAtTime(paramLong, 0, paramInt1, paramInt2);
    if (arrayOfByte != null) {
      localBitmap = getBitmapFromPixels(arrayOfByte, paramInt1, paramInt2);
    }
    GMTrace.o(7481564594176L, 55742);
    return localBitmap;
  }
  
  public Bitmap getScaledFrameAtTime(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(7481430376448L, 55741);
    if ((paramInt1 < 0) || (paramInt1 > 3)) {
      throw new IllegalArgumentException("Unsupported option: " + paramInt1);
    }
    Bitmap localBitmap = null;
    byte[] arrayOfByte = _getScaledFrameAtTime(paramLong, paramInt1, paramInt2, paramInt3);
    if (arrayOfByte != null) {
      localBitmap = getBitmapFromPixels(arrayOfByte, paramInt2, paramInt3);
    }
    GMTrace.o(7481430376448L, 55741);
    return localBitmap;
  }
  
  public byte[] getScaledFrameAtTimeUndecoded(long paramLong, int paramInt1, int paramInt2)
  {
    GMTrace.i(7482369900544L, 55748);
    byte[] arrayOfByte = _getScaledFrameAtTime(paramLong, 2, paramInt1, paramInt2);
    GMTrace.o(7482369900544L, 55748);
    return arrayOfByte;
  }
  
  public int getVideoHeight()
  {
    int i = 0;
    GMTrace.i(7482235682816L, 55747);
    for (;;)
    {
      try
      {
        String str2 = extractMetadata("rotate");
        if ((!"90".equals(str2)) && (!"270".equals(str2))) {
          continue;
        }
        str1 = extractMetadata("video_width");
        w.d("FFmpegMetadataRetriever", "video height %s rotate %s", new Object[] { str1, str2 });
        int j = Integer.valueOf(str1).intValue();
        i = j;
      }
      catch (Exception localException)
      {
        String str1;
        w.e("FFmpegMetadataRetriever", "can not get video height %s", new Object[] { localException.getMessage() });
        continue;
      }
      GMTrace.o(7482235682816L, 55747);
      return i;
      str1 = extractMetadata("video_height");
    }
  }
  
  public int getVideoRotation()
  {
    int i = 0;
    GMTrace.i(7482101465088L, 55746);
    try
    {
      int j = Integer.valueOf(extractMetadata("rotate")).intValue();
      i = j;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("FFmpegMetadataRetriever", "can not get video rotation. %s", new Object[] { localException.getMessage() });
      }
    }
    GMTrace.o(7482101465088L, 55746);
    return i;
  }
  
  public int getVideoWidth()
  {
    int i = 0;
    GMTrace.i(7481967247360L, 55745);
    for (;;)
    {
      try
      {
        str = extractMetadata("rotate");
        if ((!"90".equals(str)) && (!"270".equals(str))) {
          continue;
        }
        str = extractMetadata("video_height");
        int j = Integer.valueOf(str).intValue();
        i = j;
      }
      catch (Exception localException)
      {
        String str;
        w.e("FFmpegMetadataRetriever", "can not get video width %s", new Object[] { localException.getMessage() });
        continue;
      }
      GMTrace.o(7481967247360L, 55745);
      return i;
      str = extractMetadata("video_width");
    }
  }
  
  public native void release();
  
  public void reuseBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(7481698811904L, 55743);
    if (paramBitmap == null)
    {
      GMTrace.o(7481698811904L, 55743);
      return;
    }
    if (this.reuse != null) {
      this.reuse.recycle();
    }
    this.reuse = paramBitmap;
    GMTrace.o(7481698811904L, 55743);
  }
  
  /* Error */
  public void setDataSource(android.content.Context paramContext, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: ldc2_w 370
    //   3: ldc_w 372
    //   6: invokestatic 134	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_2
    //   10: ifnonnull +11 -> 21
    //   13: new 265	java/lang/IllegalArgumentException
    //   16: dup
    //   17: invokespecial 373	java/lang/IllegalArgumentException:<init>	()V
    //   20: athrow
    //   21: aload_2
    //   22: invokevirtual 378	android/net/Uri:getScheme	()Ljava/lang/String;
    //   25: astore_3
    //   26: aload_3
    //   27: ifnull +13 -> 40
    //   30: aload_3
    //   31: ldc_w 380
    //   34: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   37: ifeq +21 -> 58
    //   40: aload_0
    //   41: aload_2
    //   42: invokevirtual 383	android/net/Uri:getPath	()Ljava/lang/String;
    //   45: invokevirtual 385	com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   48: ldc2_w 370
    //   51: ldc_w 372
    //   54: invokestatic 140	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   57: return
    //   58: aconst_null
    //   59: astore_3
    //   60: aload_1
    //   61: invokevirtual 391	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   64: astore_1
    //   65: aload_1
    //   66: aload_2
    //   67: ldc_w 393
    //   70: invokevirtual 399	android/content/ContentResolver:openAssetFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   73: astore_1
    //   74: aload_1
    //   75: ifnonnull +53 -> 128
    //   78: new 265	java/lang/IllegalArgumentException
    //   81: dup
    //   82: invokespecial 373	java/lang/IllegalArgumentException:<init>	()V
    //   85: athrow
    //   86: astore_3
    //   87: aload_1
    //   88: ifnull +7 -> 95
    //   91: aload_1
    //   92: invokevirtual 404	android/content/res/AssetFileDescriptor:close	()V
    //   95: aload_0
    //   96: aload_2
    //   97: invokevirtual 405	android/net/Uri:toString	()Ljava/lang/String;
    //   100: invokevirtual 385	com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   103: ldc2_w 370
    //   106: ldc_w 372
    //   109: invokestatic 140	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   112: return
    //   113: astore_1
    //   114: new 265	java/lang/IllegalArgumentException
    //   117: dup
    //   118: invokespecial 373	java/lang/IllegalArgumentException:<init>	()V
    //   121: athrow
    //   122: astore_1
    //   123: aload_3
    //   124: astore_1
    //   125: goto -38 -> 87
    //   128: aload_1
    //   129: invokevirtual 409	android/content/res/AssetFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   132: astore_3
    //   133: aload_3
    //   134: invokevirtual 415	java/io/FileDescriptor:valid	()Z
    //   137: ifne +26 -> 163
    //   140: new 265	java/lang/IllegalArgumentException
    //   143: dup
    //   144: invokespecial 373	java/lang/IllegalArgumentException:<init>	()V
    //   147: athrow
    //   148: astore_3
    //   149: aload_1
    //   150: astore_2
    //   151: aload_3
    //   152: astore_1
    //   153: aload_2
    //   154: ifnull +7 -> 161
    //   157: aload_2
    //   158: invokevirtual 404	android/content/res/AssetFileDescriptor:close	()V
    //   161: aload_1
    //   162: athrow
    //   163: aload_1
    //   164: invokevirtual 419	android/content/res/AssetFileDescriptor:getDeclaredLength	()J
    //   167: lconst_0
    //   168: lcmp
    //   169: ifge +26 -> 195
    //   172: aload_0
    //   173: aload_3
    //   174: invokevirtual 422	com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever:setDataSource	(Ljava/io/FileDescriptor;)V
    //   177: aload_1
    //   178: ifnull +7 -> 185
    //   181: aload_1
    //   182: invokevirtual 404	android/content/res/AssetFileDescriptor:close	()V
    //   185: ldc2_w 370
    //   188: ldc_w 372
    //   191: invokestatic 140	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   194: return
    //   195: aload_0
    //   196: aload_3
    //   197: aload_1
    //   198: invokevirtual 425	android/content/res/AssetFileDescriptor:getStartOffset	()J
    //   201: aload_1
    //   202: invokevirtual 419	android/content/res/AssetFileDescriptor:getDeclaredLength	()J
    //   205: invokevirtual 428	com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever:setDataSource	(Ljava/io/FileDescriptor;JJ)V
    //   208: goto -31 -> 177
    //   211: astore_1
    //   212: ldc2_w 370
    //   215: ldc_w 372
    //   218: invokestatic 140	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   221: return
    //   222: astore_1
    //   223: goto -128 -> 95
    //   226: astore_2
    //   227: goto -66 -> 161
    //   230: astore_1
    //   231: aconst_null
    //   232: astore_2
    //   233: goto -80 -> 153
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	236	0	this	FFmpegMetadataRetriever
    //   0	236	1	paramContext	android.content.Context
    //   0	236	2	paramUri	android.net.Uri
    //   25	35	3	str	String
    //   86	38	3	localSecurityException	SecurityException
    //   132	2	3	localFileDescriptor1	FileDescriptor
    //   148	49	3	localFileDescriptor2	FileDescriptor
    // Exception table:
    //   from	to	target	type
    //   78	86	86	java/lang/SecurityException
    //   128	148	86	java/lang/SecurityException
    //   163	177	86	java/lang/SecurityException
    //   195	208	86	java/lang/SecurityException
    //   65	74	113	java/io/FileNotFoundException
    //   60	65	122	java/lang/SecurityException
    //   65	74	122	java/lang/SecurityException
    //   114	122	122	java/lang/SecurityException
    //   78	86	148	finally
    //   128	148	148	finally
    //   163	177	148	finally
    //   195	208	148	finally
    //   181	185	211	java/io/IOException
    //   91	95	222	java/io/IOException
    //   157	161	226	java/io/IOException
    //   60	65	230	finally
    //   65	74	230	finally
    //   114	122	230	finally
  }
  
  public void setDataSource(FileDescriptor paramFileDescriptor)
  {
    GMTrace.i(7480088199168L, 55731);
    setDataSource(paramFileDescriptor, 0L, 576460752303423487L);
    GMTrace.o(7480088199168L, 55731);
  }
  
  public native void setDataSource(FileDescriptor paramFileDescriptor, long paramLong1, long paramLong2);
  
  public void setDataSource(String paramString)
  {
    GMTrace.i(7479551328256L, 55727);
    _setDataSource(paramString, null, null);
    GMTrace.o(7479551328256L, 55727);
  }
  
  public void setDataSource(String paramString, Map<String, String> paramMap)
  {
    GMTrace.i(7479685545984L, 55728);
    String[] arrayOfString1 = new String[paramMap.size()];
    String[] arrayOfString2 = new String[paramMap.size()];
    paramMap = paramMap.entrySet().iterator();
    int i = 0;
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      arrayOfString1[i] = ((String)localEntry.getKey());
      arrayOfString2[i] = ((String)localEntry.getValue());
      i += 1;
    }
    _setDataSource(paramString, arrayOfString1, arrayOfString2);
    GMTrace.o(7479685545984L, 55728);
  }
  
  public final class a
  {
    HashMap<String, String> ndt;
    
    public a()
    {
      GMTrace.i(7440896622592L, 55439);
      GMTrace.o(7440896622592L, 55439);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\FFmpegMetadataRetriever.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */