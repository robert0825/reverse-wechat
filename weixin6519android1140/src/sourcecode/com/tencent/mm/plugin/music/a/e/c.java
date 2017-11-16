package com.tencent.mm.plugin.music.a.e;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.music.a.b.b;
import com.tencent.mm.plugin.music.a.b.d;
import com.tencent.mm.plugin.music.a.b.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownServiceException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
  implements IMediaHTTPConnection
{
  private boolean mAllowCrossDomainRedirect;
  private boolean mAllowCrossProtocolRedirect;
  private HttpURLConnection mConnection;
  private long mCurrentOffset;
  private Map<String, String> mHeaders;
  private InputStream mInputStream;
  private String mMimeType;
  private long mTotalSize;
  private URL mURL;
  private b nrv;
  public URL nrw;
  
  public c()
  {
    GMTrace.i(15028224786432L, 111969);
    this.mCurrentOffset = -1L;
    this.mURL = null;
    this.nrw = null;
    this.mHeaders = null;
    this.mConnection = null;
    this.mTotalSize = -1L;
    this.mMimeType = "";
    this.mInputStream = null;
    this.mAllowCrossDomainRedirect = true;
    this.mAllowCrossProtocolRedirect = true;
    GMTrace.o(15028224786432L, 111969);
  }
  
  private static final boolean isLocalHost(URL paramURL)
  {
    GMTrace.i(15028761657344L, 111973);
    if (paramURL == null)
    {
      GMTrace.o(15028761657344L, 111973);
      return false;
    }
    paramURL = paramURL.getHost();
    if (paramURL == null)
    {
      GMTrace.o(15028761657344L, 111973);
      return false;
    }
    try
    {
      boolean bool = paramURL.equalsIgnoreCase("localhost");
      if (bool)
      {
        GMTrace.o(15028761657344L, 111973);
        return true;
      }
    }
    catch (IllegalArgumentException paramURL)
    {
      Logger.e("MicroMsg.MMMediaHTTPConnection", "isLocalHost IllegalArgumentException:%s", new Object[] { String.valueOf(paramURL) });
      GMTrace.o(15028761657344L, 111973);
    }
    return false;
  }
  
  private void seekTo(long paramLong)
  {
    GMTrace.i(15028895875072L, 111974);
    teardownConnection();
    j = 0;
    int i = j;
    try
    {
      localObject1 = this.mURL;
      i = j;
      bool1 = isLocalHost((URL)localObject1);
      k = 0;
      j = 0;
    }
    catch (IOException localIOException2)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool1;
        int k;
        int m;
        continue;
        j = m;
      }
    }
    if (bool1) {}
    label270:
    label907:
    for (;;)
    {
      try
      {
        this.mConnection = ((HttpURLConnection)((URL)localObject1).openConnection(Proxy.NO_PROXY));
        this.mConnection.setConnectTimeout(30000);
        this.mConnection.setInstanceFollowRedirects(this.mAllowCrossDomainRedirect);
        m = 0;
        i = 0;
        if (this.mHeaders == null) {
          break label270;
        }
        localObject1 = this.mHeaders.entrySet().iterator();
        m = i;
        if (!((Iterator)localObject1).hasNext()) {
          break label270;
        }
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject1).next();
        this.mConnection.setRequestProperty((String)localEntry.getKey(), (String)localEntry.getValue());
        if ((i != 0) || (!"Accept-Encoding".equals(localEntry.getKey()))) {
          break label907;
        }
        i = 1;
      }
      catch (IOException localIOException1)
      {
        i = j;
        this.mTotalSize = -1L;
        this.mInputStream = null;
        this.mConnection = null;
        this.mCurrentOffset = -1L;
        Logger.e("MicroMsg.MMMediaHTTPConnection", "seekTo exception:%s", new Object[] { localIOException1 + ", response:" + i });
        throw localIOException1;
      }
      this.mConnection = ((HttpURLConnection)((URL)localObject1).openConnection());
      continue;
      if (paramLong > 0L) {
        this.mConnection.setRequestProperty("Range", "bytes=" + paramLong + "-");
      }
      if (m == 0) {
        this.mConnection.setRequestProperty("Accept-Encoding", "");
      }
      m = this.mConnection.getResponseCode();
      d.bu(this.nrw.toString(), m);
      Object localObject2;
      if ((m == 300) || (m == 301) || (m == 302) || (m == 303) || (m == 307))
      {
        k += 1;
        if (k > 20)
        {
          i = m;
          throw new NoRouteToHostException("Too many redirects: " + k);
        }
        i = m;
        localObject2 = this.mConnection.getRequestMethod();
        if (m == 307)
        {
          i = m;
          if (!((String)localObject2).equals("GET"))
          {
            i = m;
            if (!((String)localObject2).equals("HEAD"))
            {
              i = m;
              throw new NoRouteToHostException("Invalid redirect");
            }
          }
        }
        i = m;
        localObject2 = this.mConnection.getHeaderField("Location");
        if (localObject2 == null)
        {
          i = m;
          throw new NoRouteToHostException("Invalid redirect");
        }
        i = m;
        localObject2 = new URL(this.mURL, (String)localObject2);
        i = m;
        if (!((URL)localObject2).getProtocol().equals("https"))
        {
          i = m;
          if (!((URL)localObject2).getProtocol().equals("http"))
          {
            i = m;
            throw new NoRouteToHostException("Unsupported protocol redirect");
          }
        }
        i = m;
        boolean bool2 = this.mURL.getProtocol().equals(((URL)localObject2).getProtocol());
        i = m;
        if ((!this.mAllowCrossProtocolRedirect) && (!bool2))
        {
          i = m;
          throw new NoRouteToHostException("Cross-protocol redirects are disallowed");
        }
        i = m;
        bool2 = this.mURL.getHost().equals(((URL)localObject2).getHost());
        i = m;
        if ((!this.mAllowCrossDomainRedirect) && (!bool2))
        {
          i = m;
          throw new NoRouteToHostException("Cross-domain redirects are disallowed");
        }
        if (m == 307) {
          break;
        }
        i = m;
        this.mURL = ((URL)localObject2);
        break;
      }
      i = m;
      if (this.mAllowCrossDomainRedirect)
      {
        i = m;
        this.mURL = this.mConnection.getURL();
      }
      if (m == 206)
      {
        i = m;
        localObject2 = this.mConnection.getHeaderField("Content-Range");
        i = m;
        this.mTotalSize = -1L;
        if (localObject2 != null)
        {
          i = m;
          j = ((String)localObject2).lastIndexOf('/');
          if (j >= 0)
          {
            i = m;
            localObject2 = ((String)localObject2).substring(j + 1);
            i = m;
          }
        }
      }
      try
      {
        for (this.mTotalSize = bg.getLong((String)localObject2, 0L); (paramLong > 0L) && (m != 206); this.mTotalSize = this.mConnection.getContentLength())
        {
          i = m;
          throw new ProtocolException();
          if (m != 200)
          {
            i = m;
            throw new IOException();
          }
          i = m;
        }
        i = m;
        this.mInputStream = new BufferedInputStream(this.mConnection.getInputStream());
        i = m;
        this.mCurrentOffset = paramLong;
        GMTrace.o(15028895875072L, 111974);
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
    }
  }
  
  private void teardownConnection()
  {
    GMTrace.i(15028627439616L, 111972);
    if (this.mConnection != null)
    {
      this.mInputStream = null;
      this.mConnection.disconnect();
      this.mConnection = null;
      this.mCurrentOffset = -1L;
    }
    GMTrace.o(15028627439616L, 111972);
  }
  
  /* Error */
  public final boolean connect(URL paramURL, Map<String, String> paramMap)
  {
    // Byte code:
    //   0: ldc2_w 305
    //   3: ldc_w 307
    //   6: invokestatic 39	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc 90
    //   11: ldc_w 308
    //   14: invokestatic 310	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: ldc 90
    //   19: new 183	java/lang/StringBuilder
    //   22: dup
    //   23: ldc_w 312
    //   26: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: aload_1
    //   30: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   33: ldc_w 314
    //   36: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: aload_2
    //   40: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: invokestatic 310	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   49: aload_0
    //   50: invokevirtual 315	com/tencent/mm/plugin/music/a/e/c:disconnect	()V
    //   53: aload_0
    //   54: iconst_1
    //   55: putfield 61	com/tencent/mm/plugin/music/a/e/c:mAllowCrossDomainRedirect	Z
    //   58: aload_0
    //   59: aload_1
    //   60: putfield 45	com/tencent/mm/plugin/music/a/e/c:mURL	Ljava/net/URL;
    //   63: aload_0
    //   64: aload_1
    //   65: putfield 47	com/tencent/mm/plugin/music/a/e/c:nrw	Ljava/net/URL;
    //   68: aload_0
    //   69: aload_2
    //   70: putfield 49	com/tencent/mm/plugin/music/a/e/c:mHeaders	Ljava/util/Map;
    //   73: aload_0
    //   74: ldc2_w 40
    //   77: putfield 53	com/tencent/mm/plugin/music/a/e/c:mTotalSize	J
    //   80: aload_0
    //   81: ldc 55
    //   83: putfield 57	com/tencent/mm/plugin/music/a/e/c:mMimeType	Ljava/lang/String;
    //   86: aload_0
    //   87: getfield 45	com/tencent/mm/plugin/music/a/e/c:mURL	Ljava/net/URL;
    //   90: ifnull +36 -> 126
    //   93: aload_0
    //   94: getfield 45	com/tencent/mm/plugin/music/a/e/c:mURL	Ljava/net/URL;
    //   97: invokevirtual 216	java/net/URL:toString	()Ljava/lang/String;
    //   100: aload_2
    //   101: invokestatic 319	com/tencent/mm/plugin/music/a/b/d:g	(Ljava/lang/String;Ljava/util/Map;)V
    //   104: ldc 90
    //   106: new 183	java/lang/StringBuilder
    //   109: dup
    //   110: ldc_w 321
    //   113: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   116: aload_2
    //   117: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   120: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokestatic 310	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   126: aload_0
    //   127: new 323	com/tencent/mm/plugin/music/a/b/b
    //   130: dup
    //   131: aload_0
    //   132: invokespecial 326	com/tencent/mm/plugin/music/a/b/b:<init>	(Lcom/tencent/mm/plugin/music/a/e/c;)V
    //   135: putfield 328	com/tencent/mm/plugin/music/a/e/c:nrv	Lcom/tencent/mm/plugin/music/a/b/b;
    //   138: aload_0
    //   139: getfield 328	com/tencent/mm/plugin/music/a/e/c:nrv	Lcom/tencent/mm/plugin/music/a/b/b;
    //   142: astore_1
    //   143: aload_1
    //   144: new 330	com/tencent/mm/plugin/music/a/b/c
    //   147: dup
    //   148: aload_1
    //   149: getfield 334	com/tencent/mm/plugin/music/a/b/b:nrc	Lcom/tencent/mm/plugin/music/a/e/c;
    //   152: getfield 47	com/tencent/mm/plugin/music/a/e/c:nrw	Ljava/net/URL;
    //   155: invokevirtual 216	java/net/URL:toString	()Ljava/lang/String;
    //   158: invokespecial 335	com/tencent/mm/plugin/music/a/b/c:<init>	(Ljava/lang/String;)V
    //   161: putfield 339	com/tencent/mm/plugin/music/a/b/b:nrd	Lcom/tencent/mm/plugin/music/a/b/c;
    //   164: aload_1
    //   165: getfield 339	com/tencent/mm/plugin/music/a/b/b:nrd	Lcom/tencent/mm/plugin/music/a/b/c;
    //   168: aload_1
    //   169: getfield 334	com/tencent/mm/plugin/music/a/b/b:nrc	Lcom/tencent/mm/plugin/music/a/e/c;
    //   172: invokevirtual 343	com/tencent/mm/plugin/music/a/e/c:getSize	()J
    //   175: putfield 346	com/tencent/mm/plugin/music/a/b/c:hmS	J
    //   178: aload_1
    //   179: getfield 339	com/tencent/mm/plugin/music/a/b/b:nrd	Lcom/tencent/mm/plugin/music/a/b/c;
    //   182: astore_2
    //   183: ldc_w 348
    //   186: ldc_w 350
    //   189: invokestatic 353	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   192: aload_2
    //   193: getfield 346	com/tencent/mm/plugin/music/a/b/c:hmS	J
    //   196: lconst_0
    //   197: lcmp
    //   198: ifgt +300 -> 498
    //   201: ldc_w 348
    //   204: ldc_w 355
    //   207: invokestatic 357	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   210: aload_1
    //   211: new 359	com/tencent/mm/plugin/music/a/b/e
    //   214: dup
    //   215: aload_1
    //   216: getfield 334	com/tencent/mm/plugin/music/a/b/b:nrc	Lcom/tencent/mm/plugin/music/a/e/c;
    //   219: getfield 47	com/tencent/mm/plugin/music/a/e/c:nrw	Ljava/net/URL;
    //   222: invokevirtual 216	java/net/URL:toString	()Ljava/lang/String;
    //   225: invokespecial 360	com/tencent/mm/plugin/music/a/b/e:<init>	(Ljava/lang/String;)V
    //   228: putfield 364	com/tencent/mm/plugin/music/a/b/b:nre	Lcom/tencent/mm/plugin/music/a/b/e;
    //   231: new 366	java/io/File
    //   234: dup
    //   235: aload_1
    //   236: getfield 364	com/tencent/mm/plugin/music/a/b/b:nre	Lcom/tencent/mm/plugin/music/a/b/e;
    //   239: getfield 369	com/tencent/mm/plugin/music/a/b/e:euR	Ljava/lang/String;
    //   242: invokespecial 370	java/io/File:<init>	(Ljava/lang/String;)V
    //   245: invokevirtual 373	java/io/File:exists	()Z
    //   248: ifne +673 -> 921
    //   251: ldc_w 375
    //   254: ldc_w 377
    //   257: invokestatic 353	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   260: aload_1
    //   261: getfield 339	com/tencent/mm/plugin/music/a/b/b:nrd	Lcom/tencent/mm/plugin/music/a/b/c;
    //   264: invokevirtual 380	com/tencent/mm/plugin/music/a/b/c:clearCache	()V
    //   267: aload_1
    //   268: getfield 364	com/tencent/mm/plugin/music/a/b/b:nre	Lcom/tencent/mm/plugin/music/a/b/e;
    //   271: astore_2
    //   272: ldc_w 382
    //   275: ldc_w 384
    //   278: invokestatic 310	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   281: new 366	java/io/File
    //   284: dup
    //   285: aload_2
    //   286: getfield 369	com/tencent/mm/plugin/music/a/b/e:euR	Ljava/lang/String;
    //   289: invokespecial 370	java/io/File:<init>	(Ljava/lang/String;)V
    //   292: astore_3
    //   293: aload_3
    //   294: invokevirtual 373	java/io/File:exists	()Z
    //   297: ifne +26 -> 323
    //   300: ldc_w 382
    //   303: ldc_w 386
    //   306: iconst_1
    //   307: anewarray 4	java/lang/Object
    //   310: dup
    //   311: iconst_0
    //   312: aload_3
    //   313: invokevirtual 389	java/io/File:createNewFile	()Z
    //   316: invokestatic 394	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   319: aastore
    //   320: invokestatic 396	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   323: aload_2
    //   324: new 398	java/io/RandomAccessFile
    //   327: dup
    //   328: aload_3
    //   329: ldc_w 400
    //   332: invokespecial 403	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   335: putfield 407	com/tencent/mm/plugin/music/a/b/e:randomAccessFile	Ljava/io/RandomAccessFile;
    //   338: ldc_w 382
    //   341: ldc_w 409
    //   344: iconst_1
    //   345: anewarray 4	java/lang/Object
    //   348: dup
    //   349: iconst_0
    //   350: aload_2
    //   351: getfield 369	com/tencent/mm/plugin/music/a/b/e:euR	Ljava/lang/String;
    //   354: aastore
    //   355: invokestatic 102	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   358: aload_1
    //   359: getfield 364	com/tencent/mm/plugin/music/a/b/b:nre	Lcom/tencent/mm/plugin/music/a/b/e;
    //   362: aload_1
    //   363: getfield 334	com/tencent/mm/plugin/music/a/b/b:nrc	Lcom/tencent/mm/plugin/music/a/e/c;
    //   366: invokevirtual 343	com/tencent/mm/plugin/music/a/e/c:getSize	()J
    //   369: l2i
    //   370: invokevirtual 412	com/tencent/mm/plugin/music/a/b/e:setLength	(I)V
    //   373: ldc_w 375
    //   376: new 183	java/lang/StringBuilder
    //   379: dup
    //   380: ldc_w 414
    //   383: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   386: aload_1
    //   387: getfield 334	com/tencent/mm/plugin/music/a/b/b:nrc	Lcom/tencent/mm/plugin/music/a/e/c;
    //   390: invokevirtual 343	com/tencent/mm/plugin/music/a/e/c:getSize	()J
    //   393: invokevirtual 209	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   396: ldc_w 416
    //   399: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: aload_1
    //   403: getfield 364	com/tencent/mm/plugin/music/a/b/b:nre	Lcom/tencent/mm/plugin/music/a/b/e;
    //   406: invokevirtual 419	com/tencent/mm/plugin/music/a/b/e:getLength	()I
    //   409: invokevirtual 196	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   412: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   415: invokestatic 353	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   418: aload_1
    //   419: getfield 334	com/tencent/mm/plugin/music/a/b/b:nrc	Lcom/tencent/mm/plugin/music/a/e/c;
    //   422: invokevirtual 422	com/tencent/mm/plugin/music/a/e/c:getMIMEType	()Ljava/lang/String;
    //   425: invokestatic 428	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   428: ifne +39 -> 467
    //   431: ldc_w 430
    //   434: aload_1
    //   435: getfield 334	com/tencent/mm/plugin/music/a/b/b:nrc	Lcom/tencent/mm/plugin/music/a/e/c;
    //   438: invokevirtual 422	com/tencent/mm/plugin/music/a/e/c:getMIMEType	()Ljava/lang/String;
    //   441: invokevirtual 88	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   444: ifne +23 -> 467
    //   447: aload_1
    //   448: getfield 334	com/tencent/mm/plugin/music/a/b/b:nrc	Lcom/tencent/mm/plugin/music/a/e/c;
    //   451: getfield 47	com/tencent/mm/plugin/music/a/e/c:nrw	Ljava/net/URL;
    //   454: invokevirtual 216	java/net/URL:toString	()Ljava/lang/String;
    //   457: aload_1
    //   458: getfield 334	com/tencent/mm/plugin/music/a/b/b:nrc	Lcom/tencent/mm/plugin/music/a/e/c;
    //   461: invokevirtual 422	com/tencent/mm/plugin/music/a/e/c:getMIMEType	()Ljava/lang/String;
    //   464: invokestatic 433	com/tencent/mm/plugin/music/a/b/d:dd	(Ljava/lang/String;Ljava/lang/String;)V
    //   467: aload_1
    //   468: iconst_m1
    //   469: putfield 437	com/tencent/mm/plugin/music/a/b/b:vq	I
    //   472: aload_1
    //   473: iconst_0
    //   474: putfield 440	com/tencent/mm/plugin/music/a/b/b:mSize	I
    //   477: aload_1
    //   478: iconst_m1
    //   479: putfield 443	com/tencent/mm/plugin/music/a/b/b:nrf	I
    //   482: aload_1
    //   483: iconst_0
    //   484: putfield 446	com/tencent/mm/plugin/music/a/b/b:nrg	I
    //   487: ldc2_w 305
    //   490: ldc_w 307
    //   493: invokestatic 66	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   496: iconst_1
    //   497: ireturn
    //   498: aload_2
    //   499: getfield 346	com/tencent/mm/plugin/music/a/b/c:hmS	J
    //   502: ldc2_w 447
    //   505: lrem
    //   506: lconst_0
    //   507: lcmp
    //   508: ifeq +14 -> 522
    //   511: aload_2
    //   512: getfield 346	com/tencent/mm/plugin/music/a/b/c:hmS	J
    //   515: ldc2_w 447
    //   518: lcmp
    //   519: ifge +122 -> 641
    //   522: aload_2
    //   523: aload_2
    //   524: getfield 346	com/tencent/mm/plugin/music/a/b/c:hmS	J
    //   527: ldc2_w 447
    //   530: ldiv
    //   531: l2i
    //   532: putfield 451	com/tencent/mm/plugin/music/a/b/c:count	I
    //   535: aload_2
    //   536: getfield 346	com/tencent/mm/plugin/music/a/b/c:hmS	J
    //   539: ldc2_w 447
    //   542: lcmp
    //   543: ifgt +17 -> 560
    //   546: ldc_w 348
    //   549: ldc_w 453
    //   552: invokestatic 353	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   555: aload_2
    //   556: iconst_1
    //   557: putfield 451	com/tencent/mm/plugin/music/a/b/c:count	I
    //   560: ldc_w 348
    //   563: ldc_w 455
    //   566: iconst_2
    //   567: anewarray 4	java/lang/Object
    //   570: dup
    //   571: iconst_0
    //   572: aload_2
    //   573: getfield 346	com/tencent/mm/plugin/music/a/b/c:hmS	J
    //   576: invokestatic 460	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   579: aastore
    //   580: dup
    //   581: iconst_1
    //   582: aload_2
    //   583: getfield 451	com/tencent/mm/plugin/music/a/b/c:count	I
    //   586: invokestatic 465	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   589: aastore
    //   590: invokestatic 396	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   593: aload_2
    //   594: new 467	java/util/BitSet
    //   597: dup
    //   598: aload_2
    //   599: getfield 451	com/tencent/mm/plugin/music/a/b/c:count	I
    //   602: invokespecial 469	java/util/BitSet:<init>	(I)V
    //   605: putfield 473	com/tencent/mm/plugin/music/a/b/c:nrh	Ljava/util/BitSet;
    //   608: aload_2
    //   609: aload_2
    //   610: getfield 476	com/tencent/mm/plugin/music/a/b/c:mUrl	Ljava/lang/String;
    //   613: invokestatic 479	com/tencent/mm/plugin/music/a/b/d:DG	(Ljava/lang/String;)Ljava/lang/String;
    //   616: putfield 482	com/tencent/mm/plugin/music/a/b/c:nri	Ljava/lang/String;
    //   619: aload_2
    //   620: getfield 482	com/tencent/mm/plugin/music/a/b/c:nri	Ljava/lang/String;
    //   623: invokestatic 428	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   626: ifeq +33 -> 659
    //   629: ldc_w 348
    //   632: ldc_w 484
    //   635: invokestatic 357	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   638: goto -428 -> 210
    //   641: aload_2
    //   642: aload_2
    //   643: getfield 346	com/tencent/mm/plugin/music/a/b/c:hmS	J
    //   646: ldc2_w 447
    //   649: ldiv
    //   650: l2i
    //   651: iconst_1
    //   652: iadd
    //   653: putfield 451	com/tencent/mm/plugin/music/a/b/c:count	I
    //   656: goto -121 -> 535
    //   659: ldc_w 348
    //   662: ldc_w 486
    //   665: iconst_1
    //   666: anewarray 4	java/lang/Object
    //   669: dup
    //   670: iconst_0
    //   671: aload_2
    //   672: getfield 482	com/tencent/mm/plugin/music/a/b/c:nri	Ljava/lang/String;
    //   675: aastore
    //   676: invokestatic 396	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   679: invokestatic 492	com/tencent/mm/plugin/music/a/h:aSw	()Lcom/tencent/mm/plugin/music/a/g/c;
    //   682: aload_2
    //   683: getfield 482	com/tencent/mm/plugin/music/a/b/c:nri	Ljava/lang/String;
    //   686: invokevirtual 498	com/tencent/mm/plugin/music/a/g/c:DP	(Ljava/lang/String;)Lcom/tencent/mm/plugin/music/a/g/b;
    //   689: astore_3
    //   690: aload_3
    //   691: ifnonnull +15 -> 706
    //   694: ldc_w 348
    //   697: ldc_w 500
    //   700: invokestatic 357	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   703: goto -493 -> 210
    //   706: ldc_w 348
    //   709: ldc_w 502
    //   712: iconst_1
    //   713: anewarray 4	java/lang/Object
    //   716: dup
    //   717: iconst_0
    //   718: aload_3
    //   719: getfield 507	com/tencent/mm/plugin/music/a/g/b:field_fileCacheComplete	I
    //   722: invokestatic 465	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   725: aastore
    //   726: invokestatic 396	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   729: aload_3
    //   730: getfield 511	com/tencent/mm/plugin/music/a/g/b:field_indexBitData	[B
    //   733: ifnonnull +15 -> 748
    //   736: ldc_w 348
    //   739: ldc_w 513
    //   742: invokestatic 357	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   745: goto -535 -> 210
    //   748: aload_2
    //   749: aload_3
    //   750: getfield 511	com/tencent/mm/plugin/music/a/g/b:field_indexBitData	[B
    //   753: invokestatic 519	com/tencent/mm/plugin/music/a/b/c$a:az	([B)Ljava/util/BitSet;
    //   756: putfield 473	com/tencent/mm/plugin/music/a/b/c:nrh	Ljava/util/BitSet;
    //   759: aload_2
    //   760: getfield 473	com/tencent/mm/plugin/music/a/b/c:nrh	Ljava/util/BitSet;
    //   763: ifnonnull +101 -> 864
    //   766: ldc_w 348
    //   769: ldc_w 521
    //   772: invokestatic 357	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   775: aload_2
    //   776: new 467	java/util/BitSet
    //   779: dup
    //   780: aload_2
    //   781: getfield 451	com/tencent/mm/plugin/music/a/b/c:count	I
    //   784: invokespecial 469	java/util/BitSet:<init>	(I)V
    //   787: putfield 473	com/tencent/mm/plugin/music/a/b/c:nrh	Ljava/util/BitSet;
    //   790: ldc_w 348
    //   793: new 183	java/lang/StringBuilder
    //   796: dup
    //   797: ldc_w 523
    //   800: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   803: aload_2
    //   804: getfield 473	com/tencent/mm/plugin/music/a/b/c:nrh	Ljava/util/BitSet;
    //   807: invokevirtual 524	java/util/BitSet:toString	()Ljava/lang/String;
    //   810: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   813: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   816: invokestatic 353	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   819: ldc_w 348
    //   822: new 183	java/lang/StringBuilder
    //   825: dup
    //   826: ldc_w 526
    //   829: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   832: aload_2
    //   833: getfield 451	com/tencent/mm/plugin/music/a/b/c:count	I
    //   836: invokevirtual 196	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   839: ldc_w 528
    //   842: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   845: aload_2
    //   846: getfield 473	com/tencent/mm/plugin/music/a/b/c:nrh	Ljava/util/BitSet;
    //   849: invokevirtual 531	java/util/BitSet:cardinality	()I
    //   852: invokevirtual 196	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   855: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   858: invokestatic 353	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   861: goto -651 -> 210
    //   864: aload_2
    //   865: getfield 451	com/tencent/mm/plugin/music/a/b/c:count	I
    //   868: aload_2
    //   869: getfield 473	com/tencent/mm/plugin/music/a/b/c:nrh	Ljava/util/BitSet;
    //   872: invokevirtual 531	java/util/BitSet:cardinality	()I
    //   875: if_icmpge -85 -> 790
    //   878: ldc_w 348
    //   881: ldc_w 533
    //   884: iconst_2
    //   885: anewarray 4	java/lang/Object
    //   888: dup
    //   889: iconst_0
    //   890: aload_2
    //   891: getfield 451	com/tencent/mm/plugin/music/a/b/c:count	I
    //   894: invokestatic 465	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   897: aastore
    //   898: dup
    //   899: iconst_1
    //   900: aload_2
    //   901: getfield 473	com/tencent/mm/plugin/music/a/b/c:nrh	Ljava/util/BitSet;
    //   904: invokevirtual 531	java/util/BitSet:cardinality	()I
    //   907: invokestatic 465	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   910: aastore
    //   911: invokestatic 534	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   914: aload_2
    //   915: invokevirtual 380	com/tencent/mm/plugin/music/a/b/c:clearCache	()V
    //   918: goto -128 -> 790
    //   921: aload_1
    //   922: getfield 364	com/tencent/mm/plugin/music/a/b/b:nre	Lcom/tencent/mm/plugin/music/a/b/e;
    //   925: invokevirtual 537	com/tencent/mm/plugin/music/a/b/e:aTe	()J
    //   928: aload_1
    //   929: getfield 334	com/tencent/mm/plugin/music/a/b/b:nrc	Lcom/tencent/mm/plugin/music/a/e/c;
    //   932: invokevirtual 343	com/tencent/mm/plugin/music/a/e/c:getSize	()J
    //   935: lcmp
    //   936: ifeq +57 -> 993
    //   939: aload_1
    //   940: getfield 334	com/tencent/mm/plugin/music/a/b/b:nrc	Lcom/tencent/mm/plugin/music/a/e/c;
    //   943: invokevirtual 343	com/tencent/mm/plugin/music/a/e/c:getSize	()J
    //   946: ldc2_w 40
    //   949: lcmp
    //   950: ifeq +43 -> 993
    //   953: ldc_w 375
    //   956: ldc_w 539
    //   959: invokestatic 353	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   962: aload_1
    //   963: getfield 339	com/tencent/mm/plugin/music/a/b/b:nrd	Lcom/tencent/mm/plugin/music/a/b/c;
    //   966: invokevirtual 380	com/tencent/mm/plugin/music/a/b/c:clearCache	()V
    //   969: aload_1
    //   970: getfield 364	com/tencent/mm/plugin/music/a/b/b:nre	Lcom/tencent/mm/plugin/music/a/b/e;
    //   973: astore_2
    //   974: ldc_w 382
    //   977: ldc_w 541
    //   980: invokestatic 310	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   983: aload_2
    //   984: getfield 369	com/tencent/mm/plugin/music/a/b/e:euR	Ljava/lang/String;
    //   987: invokestatic 544	com/tencent/mm/plugin/music/a/b/e:vd	(Ljava/lang/String;)V
    //   990: goto -723 -> 267
    //   993: aload_1
    //   994: getfield 334	com/tencent/mm/plugin/music/a/b/b:nrc	Lcom/tencent/mm/plugin/music/a/e/c;
    //   997: invokevirtual 343	com/tencent/mm/plugin/music/a/e/c:getSize	()J
    //   1000: ldc2_w 40
    //   1003: lcmp
    //   1004: ifne +15 -> 1019
    //   1007: ldc_w 375
    //   1010: ldc_w 546
    //   1013: invokestatic 353	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1016: goto -749 -> 267
    //   1019: ldc_w 375
    //   1022: ldc_w 548
    //   1025: invokestatic 353	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1028: goto -761 -> 267
    //   1031: astore_3
    //   1032: ldc_w 382
    //   1035: ldc_w 550
    //   1038: aload_3
    //   1039: invokestatic 553	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1042: ldc_w 382
    //   1045: ldc_w 409
    //   1048: iconst_1
    //   1049: anewarray 4	java/lang/Object
    //   1052: dup
    //   1053: iconst_0
    //   1054: aload_2
    //   1055: getfield 369	com/tencent/mm/plugin/music/a/b/e:euR	Ljava/lang/String;
    //   1058: aastore
    //   1059: invokestatic 102	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1062: goto -704 -> 358
    //   1065: astore_3
    //   1066: ldc_w 382
    //   1069: ldc_w 555
    //   1072: aload_3
    //   1073: invokestatic 553	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1076: ldc_w 382
    //   1079: ldc_w 409
    //   1082: iconst_1
    //   1083: anewarray 4	java/lang/Object
    //   1086: dup
    //   1087: iconst_0
    //   1088: aload_2
    //   1089: getfield 369	com/tencent/mm/plugin/music/a/b/e:euR	Ljava/lang/String;
    //   1092: aastore
    //   1093: invokestatic 102	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1096: goto -738 -> 358
    //   1099: astore_1
    //   1100: ldc_w 382
    //   1103: ldc_w 409
    //   1106: iconst_1
    //   1107: anewarray 4	java/lang/Object
    //   1110: dup
    //   1111: iconst_0
    //   1112: aload_2
    //   1113: getfield 369	com/tencent/mm/plugin/music/a/b/e:euR	Ljava/lang/String;
    //   1116: aastore
    //   1117: invokestatic 102	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1120: aload_1
    //   1121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1122	0	this	c
    //   0	1122	1	paramURL	URL
    //   0	1122	2	paramMap	Map<String, String>
    //   292	458	3	localObject	Object
    //   1031	8	3	localFileNotFoundException	java.io.FileNotFoundException
    //   1065	8	3	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   281	323	1031	java/io/FileNotFoundException
    //   323	338	1031	java/io/FileNotFoundException
    //   281	323	1065	java/io/IOException
    //   323	338	1065	java/io/IOException
    //   281	323	1099	finally
    //   323	338	1099	finally
    //   1032	1042	1099	finally
    //   1066	1076	1099	finally
  }
  
  public final void disconnect()
  {
    GMTrace.i(15028493221888L, 111971);
    Logger.i("MicroMsg.MMMediaHTTPConnection", "disconnect");
    teardownConnection();
    this.mHeaders = null;
    this.mURL = null;
    if (this.nrv != null)
    {
      b localb = this.nrv;
      localb.aTc();
      localb.nrd.aTd();
      localb.nre.close();
      localb.nrc = null;
      w.i("MicroMsg.FileBytesCacheMgr", "detach()");
      this.nrv = null;
    }
    GMTrace.o(15028493221888L, 111971);
  }
  
  public final String getMIMEType()
  {
    GMTrace.i(15029298528256L, 111977);
    String str1;
    if (!TextUtils.isEmpty(this.mMimeType))
    {
      Logger.i("MicroMsg.MMMediaHTTPConnection", "getMIMEType mimeType:" + this.mMimeType);
      str1 = this.mMimeType;
      GMTrace.o(15029298528256L, 111977);
      return str1;
    }
    if (this.mConnection == null) {}
    for (;;)
    {
      try
      {
        seekTo(0L);
        str1 = this.mConnection.getContentType();
        this.mMimeType = str1;
        if (TextUtils.isEmpty(str1)) {
          break;
        }
        GMTrace.o(15029298528256L, 111977);
        return str1;
      }
      catch (IOException localIOException)
      {
        Logger.e("MicroMsg.MMMediaHTTPConnection", "getMIMEType exception:%s", new Object[] { String.valueOf(localIOException) });
        str2 = "";
        continue;
      }
      str2 = this.mConnection.getContentType();
      Logger.i("MicroMsg.MMMediaHTTPConnection", "getMIMEType mimeType:" + str2);
    }
    String str2 = d.DH(this.nrw.toString());
    this.mMimeType = str2;
    if (!TextUtils.isEmpty(str2))
    {
      GMTrace.o(15029298528256L, 111977);
      return str2;
    }
    GMTrace.o(15029298528256L, 111977);
    return "application/octet-stream";
  }
  
  public final long getSize()
  {
    GMTrace.i(15029164310528L, 111976);
    long l;
    if (this.mTotalSize > 0L)
    {
      l = this.mTotalSize;
      GMTrace.o(15029164310528L, 111976);
      return l;
    }
    if (this.mConnection == null) {}
    try
    {
      seekTo(0L);
      if (this.mTotalSize > 0L)
      {
        l = this.mTotalSize;
        GMTrace.o(15029164310528L, 111976);
        return l;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Logger.e("MicroMsg.MMMediaHTTPConnection", "getSize exception:%s", new Object[] { String.valueOf(localIOException) });
        this.mTotalSize = -1L;
      }
      if (d.DI(this.nrw.toString()) > 0L)
      {
        this.mTotalSize = d.DI(this.nrw.toString());
        l = this.mTotalSize;
        GMTrace.o(15029164310528L, 111976);
        return l;
      }
      GMTrace.o(15029164310528L, 111976);
    }
    return -1L;
  }
  
  public final String getUri()
  {
    GMTrace.i(15029432745984L, 111978);
    String str = this.mURL.toString();
    GMTrace.o(15029432745984L, 111978);
    return str;
  }
  
  public final int readAt(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(15029030092800L, 111975);
    for (;;)
    {
      b localb;
      try
      {
        if (this.nrv == null) {
          continue;
        }
        localb = this.nrv;
        if ((paramArrayOfByte != null) && (paramInt1 >= 0) && (paramInt2 >= 0)) {
          continue;
        }
        w.e("MicroMsg.FileBytesCacheMgr", "read() params is invalid, offset:%d, size:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      }
      catch (ProtocolException paramArrayOfByte)
      {
        Logger.e("MicroMsg.MMMediaHTTPConnection", "readAt " + paramInt1 + " / " + paramInt2 + " => " + paramArrayOfByte);
        d.bv(this.nrw.toString(), 750);
        GMTrace.o(15029030092800L, 111975);
        return 64526;
        i = paramInt1 + paramInt2;
        l = i;
        if (l <= localb.nrc.getSize()) {
          break label1034;
        }
        w.e("MicroMsg.FileBytesCacheMgr", "read() endOffset is error,  startOffset %d, endOffset:%d, file length:%d ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i), Long.valueOf(localb.nrc.getSize()) });
        i = (int)localb.nrc.getSize() - paramInt1;
        if (!localb.nrd.cA(paramInt1, i)) {
          break label1040;
        }
        i = localb.nre.a(paramArrayOfByte, paramInt1, i);
        continue;
        Logger.d("MicroMsg.MMMediaHTTPConnection", "read from network");
        if (paramInt1 == this.mCurrentOffset) {
          continue;
        }
        seekTo(paramInt1);
        j = this.mInputStream.read(paramArrayOfByte, 0, paramInt2);
        i = j;
        if (j != -1) {
          continue;
        }
        i = 0;
        this.mCurrentOffset += i;
        if (this.nrv == null) {
          continue;
        }
        localb = this.nrv;
        if ((paramArrayOfByte != null) && (paramInt1 >= 0) && (i >= 0)) {
          continue;
        }
        w.e("MicroMsg.FileBytesCacheMgr", "write() params is invalid, offset:%d, size:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i) });
        GMTrace.o(15029030092800L, 111975);
        return i;
        if (localb.nrc.getSize() > 0L) {
          continue;
        }
        w.e("MicroMsg.FileBytesCacheMgr", "write() fileLength is error, file length is " + localb.nrc.getSize());
        continue;
      }
      catch (NoRouteToHostException paramArrayOfByte)
      {
        Logger.e("MicroMsg.MMMediaHTTPConnection", "readAt " + paramInt1 + " / " + paramInt2 + " => " + paramArrayOfByte);
        d.bv(this.nrw.toString(), 751);
        GMTrace.o(15029030092800L, 111975);
        return 64526;
        j = paramInt1 + i;
        l = j;
        if (l <= localb.nrc.getSize()) {
          continue;
        }
        w.e("MicroMsg.FileBytesCacheMgr", "write() endOffset is error, endOffset:%d, file length:%d", new Object[] { Integer.valueOf(j), Long.valueOf(localb.nrc.getSize()) });
        continue;
      }
      catch (UnknownServiceException paramArrayOfByte)
      {
        Logger.e("MicroMsg.MMMediaHTTPConnection", "readAt " + paramInt1 + " / " + paramInt2 + " => " + paramArrayOfByte);
        d.bv(this.nrw.toString(), 752);
        GMTrace.o(15029030092800L, 111975);
        return 64526;
        long l = j;
        if (l != localb.nrc.getSize()) {
          continue;
        }
        localb.aTc();
        localb.rs(paramInt1);
        localb.e(paramArrayOfByte, paramInt1, i);
        localb.aTc();
        localb.rs(paramInt1);
        continue;
      }
      catch (IOException paramArrayOfByte)
      {
        int j;
        Logger.e("MicroMsg.MMMediaHTTPConnection", "readAt " + paramInt1 + " / " + paramInt2 + " => -1 " + paramArrayOfByte);
        d.bv(this.nrw.toString(), 753);
        GMTrace.o(15029030092800L, 111975);
        return -1;
        if ((!localb.rq(paramInt1)) || (!localb.rq(j))) {
          break label1010;
        }
        if ((localb.rr(paramInt1)) && (localb.rr(j))) {
          continue;
        }
        if (!localb.rr(paramInt1)) {
          break label986;
        }
        localb.e(paramArrayOfByte, paramInt1, i);
        continue;
      }
      catch (Exception paramArrayOfByte)
      {
        Logger.e("MicroMsg.MMMediaHTTPConnection", "unknown exception " + paramArrayOfByte);
        Logger.e("MicroMsg.MMMediaHTTPConnection", "readAt " + paramInt1 + " / " + paramInt2 + " => -1");
        d.bv(this.nrw.toString(), 754);
        GMTrace.o(15029030092800L, 111975);
        return -1;
      }
      if (i > 0)
      {
        if (i != paramInt2) {
          Logger.i("MicroMsg.MMMediaHTTPConnection", "read from cache, n%d, size %d " + i + "," + paramInt2);
        }
        GMTrace.o(15029030092800L, 111975);
        return i;
        if (localb.nrc.getSize() <= 0L)
        {
          w.e("MicroMsg.FileBytesCacheMgr", "read()，fileLength is error, file length is " + localb.nrc.getSize());
          break label1040;
        }
      }
      label986:
      localb.aTc();
      localb.rs(paramInt1);
      localb.e(paramArrayOfByte, paramInt1, i);
      continue;
      label1010:
      localb.aTc();
      localb.rs(paramInt1);
      localb.e(paramArrayOfByte, paramInt1, i);
      continue;
      label1034:
      int i = paramInt2;
      continue;
      label1040:
      i = -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */