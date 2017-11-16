package com.tencent.mm.plugin.webview.wepkg.downloader;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.pluginsdk.j.a.e.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.Future;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;

public final class c
  implements Runnable
{
  private String mContentType;
  private int mStatusCode;
  f rXc;
  Future<?> rXd;
  HttpURLConnection rXe;
  private String rXf;
  private String rXg;
  private String rXh;
  boolean rXi;
  private boolean rXj;
  private boolean rXk;
  private int retCode;
  
  public c(f paramf)
  {
    GMTrace.i(12373263908864L, 92188);
    this.retCode = 0;
    this.rXk = false;
    this.rXc = paramf;
    GMTrace.o(12373263908864L, 92188);
  }
  
  private static SSLContext MO(String paramString)
  {
    GMTrace.i(12373666562048L, 92191);
    try
    {
      paramString = SSLContext.getInstance(paramString);
      GMTrace.o(12373666562048L, 92191);
      return paramString;
    }
    catch (Exception paramString)
    {
      GMTrace.o(12373666562048L, 92191);
    }
    return null;
  }
  
  private static int MP(String paramString)
  {
    GMTrace.i(12373800779776L, 92192);
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = paramString.split("/");
      if ((paramString != null) && (paramString.length == 2)) {
        try
        {
          int i = Integer.valueOf(paramString[1]).intValue();
          GMTrace.o(12373800779776L, 92192);
          return i;
        }
        catch (NumberFormatException paramString) {}
      }
    }
    GMTrace.o(12373800779776L, 92192);
    return -1;
  }
  
  private static long MQ(String paramString)
  {
    GMTrace.i(12373934997504L, 92193);
    if (!TextUtils.isEmpty(paramString)) {
      try
      {
        long l = Long.valueOf(paramString).longValue();
        GMTrace.o(12373934997504L, 92193);
        return l;
      }
      catch (NumberFormatException paramString) {}
    }
    GMTrace.o(12373934997504L, 92193);
    return -1L;
  }
  
  private void bGg()
  {
    GMTrace.i(12373532344320L, 92190);
    Closeable localCloseable = null;
    localObject1 = null;
    try
    {
      this.mStatusCode = this.rXe.getResponseCode();
      w.i("MicroMsg.Wepkg.WePkgDownloadTask", "%s: received status code = %d", new Object[] { this.rXc.rXz, Integer.valueOf(this.mStatusCode) });
      switch (this.mStatusCode)
      {
      case 200: 
        this.retCode = this.mStatusCode;
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        label96:
        localObject1 = null;
        localCloseable = null;
        localObject7 = localCloseable;
        localObject6 = localObject1;
        try
        {
          if (!this.rXi) {
            break label957;
          }
          localObject7 = localCloseable;
          localObject6 = localObject1;
          this.retCode = 1001;
          localObject7 = localCloseable;
          localObject6 = localObject1;
          w.e("MicroMsg.Wepkg.WePkgDownloadTask", "exception : %s", new Object[] { localException1.getMessage() });
          a.f((Closeable)localObject1);
          a.f(localCloseable);
          GMTrace.o(12373532344320L, 92190);
          return;
        }
        finally
        {
          for (;;)
          {
            localObject1 = localObject6;
          }
        }
        if ((this.rXf == null) || (!this.rXf.startsWith("bytes"))) {
          break label1188;
        }
        bool1 = true;
        continue;
        l2 = MP(this.rXf);
        l1 = l2;
        if (l2 == -1L)
        {
          w.i("MicroMsg.Wepkg.WePkgDownloadTask", "content-range in header is error, not support range");
          a.OS(this.rXc.mFilePath);
          l1 = MQ(this.rXg);
          bool1 = false;
          continue;
          w.i("MicroMsg.Wepkg.WePkgDownloadTask", "local dont have download file. not support range");
          l1 = MQ(this.rXg);
          bool1 = false;
          continue;
          if ((this.rXc.rXD <= 0L) || (l1 == this.rXc.rXD)) {
            break label564;
          }
          w.i("MicroMsg.Wepkg.WePkgDownloadTask", "ServerLength(%d) != HeaderLength(%d)", new Object[] { Long.valueOf(this.rXc.rXD), Long.valueOf(l1) });
          this.retCode = 1011;
        }
      }
    }
    finally
    {
      localObject1 = null;
      localObject7 = null;
    }
    a.f(localCloseable);
    a.f((Closeable)localObject1);
    GMTrace.o(12373532344320L, 92190);
    return;
    this.mContentType = this.rXe.getHeaderField("Content-Type");
    this.rXe.getHeaderFields();
    this.rXf = this.rXe.getHeaderField("Content-Range");
    this.rXg = this.rXe.getHeaderField("Content-Length");
    if ("bytes".equals(this.rXe.getHeaderField("Accept-Ranges"))) {}
    label476:
    label564:
    label729:
    label957:
    label1188:
    for (boolean bool1 = true;; bool1 = false)
    {
      long l1;
      if (this.rXj) {
        if (!bool1)
        {
          w.i("MicroMsg.Wepkg.WePkgDownloadTask", "Header no Accept-Ranges, not support range");
          a.OS(this.rXc.mFilePath);
          l1 = MQ(this.rXg);
          this.rXk = bool1;
          w.i("MicroMsg.Wepkg.WePkgDownloadTask", "%s: content-range = %s, content-length = %s, content-type = %s, isSupportRange = %b", new Object[] { this.rXc.rXz, this.rXf, this.rXg, this.mContentType, Boolean.valueOf(bool1) });
          if (l1 != -1L) {
            break label476;
          }
          this.retCode = 1010;
          break label96;
        }
      }
      for (;;)
      {
        Object localObject7;
        long l2;
        a.f((Closeable)localObject1);
        a.f((Closeable)localObject7);
        throw ((Throwable)localObject2);
        this.rXh = this.rXe.getContentEncoding();
        localObject1 = this.rXe.getInputStream();
        if ((!bg.nm(this.rXh)) && (this.rXh.equalsIgnoreCase("gzip"))) {
          localObject1 = new GZIPInputStream((InputStream)localObject1);
        }
        try
        {
          localObject3 = this.rXc.mFilePath;
          localObject6 = this.rXc.rXz;
          if ((this.rXj) && (bool1))
          {
            bool2 = true;
            w.d("MicroMsg.Wepkg.WePkgDownloadTask", "%s: getOutputStream, filePath %s", new Object[] { localObject6, localObject3 });
            if (!bg.nm((String)localObject3)) {
              break label729;
            }
            throw new FileNotFoundException(String.format("%s filePath is null or nil", new Object[] { localObject6 }));
          }
        }
        catch (Exception localException2)
        {
          boolean bool2;
          for (;;)
          {
            localObject3 = null;
            break;
            localObject1 = new BufferedInputStream((InputStream)localObject1);
            continue;
            bool2 = false;
          }
          Object localObject3 = new BufferedOutputStream(new FileOutputStream((String)localObject3, bool2));
          localObject7 = localObject3;
          localObject6 = localObject1;
          byte[] arrayOfByte;
          try
          {
            w.i("MicroMsg.Wepkg.WePkgDownloadTask", "%s: append = %b, isSupportRange = %s", new Object[] { this.rXc.rXz, Boolean.valueOf(this.rXj), Boolean.valueOf(bool1) });
            localObject7 = localObject3;
            localObject6 = localObject1;
            arrayOfByte = new byte['က'];
            i = 0;
            for (;;)
            {
              localObject7 = localObject3;
              localObject6 = localObject1;
              int j = ((InputStream)localObject1).read(arrayOfByte, 0, 4096);
              if (j == -1) {
                break;
              }
              localObject7 = localObject3;
              localObject6 = localObject1;
              ((OutputStream)localObject3).write(arrayOfByte, 0, j);
              i += j;
            }
            localObject7 = localObject3;
            localObject6 = localObject1;
            w.i("MicroMsg.Wepkg.WePkgDownloadTask", "%s: read count = %d", new Object[] { this.rXc.mUrl, Integer.valueOf(i) });
            localObject7 = localObject3;
            localObject6 = localObject1;
            ((OutputStream)localObject3).flush();
            localObject7 = localObject3;
            localObject6 = localObject1;
            w.i("MicroMsg.Wepkg.WePkgDownloadTask", "%s: download complete, flush and send complete status", new Object[] { this.rXc.mUrl });
            localObject6 = localObject1;
            localObject1 = localObject3;
            localObject3 = localObject6;
          }
          catch (Exception localException3) {}
          localObject7 = localObject3;
          localObject6 = localObject1;
          if (at.wS().DN() == 0)
          {
            localObject7 = localObject3;
            localObject6 = localObject1;
            this.retCode = 1002;
            continue;
          }
          int i = 1000;
          localObject7 = localObject3;
          localObject6 = localObject1;
          if ((arrayOfByte instanceof SSLException)) {
            i = 1013;
          }
          for (;;)
          {
            localObject7 = localObject3;
            localObject6 = localObject1;
            this.retCode = i;
            break;
            localObject7 = localObject3;
            localObject6 = localObject1;
            if ((arrayOfByte instanceof SocketTimeoutException))
            {
              i = 1003;
            }
            else
            {
              localObject7 = localObject3;
              localObject6 = localObject1;
              if ((arrayOfByte instanceof UnknownHostException))
              {
                i = 1004;
              }
              else
              {
                localObject7 = localObject3;
                localObject6 = localObject1;
                if ((arrayOfByte instanceof ConnectException))
                {
                  i = 1005;
                }
                else
                {
                  localObject7 = localObject3;
                  localObject6 = localObject1;
                  if ((arrayOfByte instanceof SocketException))
                  {
                    i = 1006;
                  }
                  else
                  {
                    localObject7 = localObject3;
                    localObject6 = localObject1;
                    if ((arrayOfByte instanceof IOException))
                    {
                      i = 1007;
                    }
                    else
                    {
                      localObject7 = localObject3;
                      localObject6 = localObject1;
                      bool1 = arrayOfByte instanceof InterruptedException;
                      if (bool1) {
                        i = 1008;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        finally
        {
          localObject7 = null;
        }
      }
      break;
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: ldc2_w 328
    //   3: ldc_w 330
    //   6: invokestatic 39	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   13: ifnonnull +13 -> 26
    //   16: ldc2_w 328
    //   19: ldc_w 330
    //   22: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   25: return
    //   26: aload_0
    //   27: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   30: getfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   33: ifnonnull +13 -> 46
    //   36: ldc2_w 328
    //   39: ldc_w 330
    //   42: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   45: return
    //   46: aload_0
    //   47: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   50: getfield 333	com/tencent/mm/plugin/webview/wepkg/downloader/f:kxh	I
    //   53: istore_3
    //   54: iconst_0
    //   55: istore_1
    //   56: new 335	java/net/URL
    //   59: dup
    //   60: aload_0
    //   61: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   64: getfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   67: invokespecial 336	java/net/URL:<init>	(Ljava/lang/String;)V
    //   70: astore 7
    //   72: aload_0
    //   73: aload 7
    //   75: invokevirtual 340	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   78: checkcast 116	java/net/HttpURLConnection
    //   81: putfield 114	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXe	Ljava/net/HttpURLConnection;
    //   84: aload_0
    //   85: getfield 114	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXe	Ljava/net/HttpURLConnection;
    //   88: aload_0
    //   89: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   92: getfield 343	com/tencent/mm/plugin/webview/wepkg/downloader/f:rXF	I
    //   95: invokevirtual 347	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   98: aload_0
    //   99: getfield 114	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXe	Ljava/net/HttpURLConnection;
    //   102: aload_0
    //   103: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   106: getfield 350	com/tencent/mm/plugin/webview/wepkg/downloader/f:rXG	I
    //   109: invokevirtual 353	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   112: aload_0
    //   113: getfield 114	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXe	Ljava/net/HttpURLConnection;
    //   116: iconst_0
    //   117: invokevirtual 357	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   120: aload_0
    //   121: getfield 114	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXe	Ljava/net/HttpURLConnection;
    //   124: iconst_1
    //   125: invokevirtual 360	java/net/HttpURLConnection:setDoInput	(Z)V
    //   128: aload_0
    //   129: getfield 114	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXe	Ljava/net/HttpURLConnection;
    //   132: ldc_w 362
    //   135: invokevirtual 365	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   138: aload_0
    //   139: getfield 114	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXe	Ljava/net/HttpURLConnection;
    //   142: iconst_0
    //   143: invokevirtual 368	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   146: aload_0
    //   147: getfield 114	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXe	Ljava/net/HttpURLConnection;
    //   150: iconst_1
    //   151: invokevirtual 371	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   154: aload_0
    //   155: getfield 114	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXe	Ljava/net/HttpURLConnection;
    //   158: ldc_w 373
    //   161: ldc_w 375
    //   164: invokevirtual 378	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   167: ldc_w 380
    //   170: invokestatic 385	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   173: astore 8
    //   175: aload 8
    //   177: invokestatic 238	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   180: ifne +15 -> 195
    //   183: aload_0
    //   184: getfield 114	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXe	Ljava/net/HttpURLConnection;
    //   187: ldc_w 387
    //   190: aload 8
    //   192: invokevirtual 378	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   195: aload_0
    //   196: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   199: getfield 390	com/tencent/mm/plugin/webview/wepkg/downloader/f:rXH	Z
    //   202: ifeq +371 -> 573
    //   205: aload_0
    //   206: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   209: getfield 182	com/tencent/mm/plugin/webview/wepkg/downloader/f:mFilePath	Ljava/lang/String;
    //   212: invokestatic 393	com/tencent/mm/pluginsdk/j/a/e/a:DI	(Ljava/lang/String;)J
    //   215: lstore 4
    //   217: ldc 123
    //   219: ldc_w 395
    //   222: iconst_2
    //   223: anewarray 4	java/lang/Object
    //   226: dup
    //   227: iconst_0
    //   228: aload_0
    //   229: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   232: getfield 130	com/tencent/mm/plugin/webview/wepkg/downloader/f:rXz	Ljava/lang/String;
    //   235: aastore
    //   236: dup
    //   237: iconst_1
    //   238: lload 4
    //   240: invokestatic 224	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   243: aastore
    //   244: invokestatic 138	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   247: lload 4
    //   249: lconst_0
    //   250: lcmp
    //   251: ifne +282 -> 533
    //   254: iconst_0
    //   255: istore 6
    //   257: aload_0
    //   258: iload 6
    //   260: putfield 174	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXj	Z
    //   263: ldc_w 397
    //   266: aload 7
    //   268: invokevirtual 400	java/net/URL:getProtocol	()Ljava/lang/String;
    //   271: invokevirtual 243	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   274: ifeq +88 -> 362
    //   277: aload_0
    //   278: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   281: getfield 343	com/tencent/mm/plugin/webview/wepkg/downloader/f:rXF	I
    //   284: istore_2
    //   285: aload_0
    //   286: getfield 114	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXe	Ljava/net/HttpURLConnection;
    //   289: checkcast 402	javax/net/ssl/HttpsURLConnection
    //   292: astore 9
    //   294: ldc_w 404
    //   297: invokestatic 406	com/tencent/mm/plugin/webview/wepkg/downloader/c:MO	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   300: astore 8
    //   302: aload 8
    //   304: astore 7
    //   306: aload 8
    //   308: ifnonnull +25 -> 333
    //   311: ldc_w 408
    //   314: invokestatic 406	com/tencent/mm/plugin/webview/wepkg/downloader/c:MO	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   317: astore 8
    //   319: aload 8
    //   321: astore 7
    //   323: aload 8
    //   325: ifnonnull +8 -> 333
    //   328: invokestatic 412	javax/net/ssl/SSLContext:getDefault	()Ljavax/net/ssl/SSLContext;
    //   331: astore 7
    //   333: aload 7
    //   335: ifnull +438 -> 773
    //   338: aload 7
    //   340: aconst_null
    //   341: aconst_null
    //   342: new 414	java/security/SecureRandom
    //   345: dup
    //   346: invokespecial 415	java/security/SecureRandom:<init>	()V
    //   349: invokevirtual 419	javax/net/ssl/SSLContext:init	([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    //   352: aload 9
    //   354: aload 7
    //   356: invokevirtual 423	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   359: invokevirtual 427	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   362: aload_0
    //   363: invokespecial 429	com/tencent/mm/plugin/webview/wepkg/downloader/c:bGg	()V
    //   366: ldc 123
    //   368: ldc_w 431
    //   371: iconst_1
    //   372: anewarray 4	java/lang/Object
    //   375: dup
    //   376: iconst_0
    //   377: aload_0
    //   378: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   381: invokestatic 133	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   384: aastore
    //   385: invokestatic 138	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: aload_0
    //   389: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   392: ifne +487 -> 879
    //   395: aload_0
    //   396: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   399: getfield 435	com/tencent/mm/plugin/webview/wepkg/downloader/f:rXI	Lcom/tencent/mm/plugin/webview/wepkg/downloader/a;
    //   402: ifnull +614 -> 1016
    //   405: aload_0
    //   406: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   409: getfield 435	com/tencent/mm/plugin/webview/wepkg/downloader/f:rXI	Lcom/tencent/mm/plugin/webview/wepkg/downloader/a;
    //   412: astore 7
    //   414: aload_0
    //   415: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   418: astore 8
    //   420: aload_0
    //   421: getfield 43	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXk	Z
    //   424: ifeq +450 -> 874
    //   427: iconst_1
    //   428: istore_2
    //   429: aload 7
    //   431: new 437	com/tencent/mm/plugin/webview/wepkg/downloader/g
    //   434: dup
    //   435: aload 8
    //   437: iconst_1
    //   438: iconst_0
    //   439: iload_2
    //   440: iload_1
    //   441: invokespecial 440	com/tencent/mm/plugin/webview/wepkg/downloader/g:<init>	(Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;IIII)V
    //   444: invokeinterface 446 2 0
    //   449: aload_0
    //   450: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   453: getfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   456: ldc_w 397
    //   459: invokevirtual 209	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   462: ifeq +61 -> 523
    //   465: aload_0
    //   466: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   469: sipush 1013
    //   472: if_icmpne +51 -> 523
    //   475: iload_1
    //   476: iload_3
    //   477: iconst_1
    //   478: isub
    //   479: if_icmplt +44 -> 523
    //   482: ldc 123
    //   484: ldc_w 448
    //   487: invokestatic 179	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   490: aload_0
    //   491: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   494: aload_0
    //   495: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   498: getfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   501: ldc_w 397
    //   504: ldc_w 450
    //   507: invokevirtual 454	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   510: putfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   513: aload_0
    //   514: iconst_0
    //   515: putfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   518: aload_0
    //   519: iconst_0
    //   520: putfield 43	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXk	Z
    //   523: ldc2_w 328
    //   526: ldc_w 330
    //   529: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   532: return
    //   533: aload_0
    //   534: getfield 114	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXe	Ljava/net/HttpURLConnection;
    //   537: ldc_w 456
    //   540: new 458	java/lang/StringBuilder
    //   543: dup
    //   544: ldc_w 460
    //   547: invokespecial 461	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   550: lload 4
    //   552: invokevirtual 465	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   555: ldc_w 467
    //   558: invokevirtual 470	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   561: invokevirtual 473	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   564: invokevirtual 476	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   567: iconst_1
    //   568: istore 6
    //   570: goto -313 -> 257
    //   573: aload_0
    //   574: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   577: getfield 182	com/tencent/mm/plugin/webview/wepkg/downloader/f:mFilePath	Ljava/lang/String;
    //   580: invokestatic 186	com/tencent/mm/pluginsdk/j/a/e/a:OS	(Ljava/lang/String;)Z
    //   583: pop
    //   584: goto -321 -> 263
    //   587: astore 7
    //   589: ldc 123
    //   591: ldc_w 478
    //   594: iconst_1
    //   595: anewarray 4	java/lang/Object
    //   598: dup
    //   599: iconst_0
    //   600: aload 7
    //   602: invokevirtual 203	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   605: aastore
    //   606: invokestatic 206	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   609: iload_1
    //   610: istore_2
    //   611: aload_0
    //   612: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   615: getfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   618: ldc_w 397
    //   621: invokevirtual 209	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   624: ifeq +67 -> 691
    //   627: iload_1
    //   628: istore_2
    //   629: aload_0
    //   630: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   633: sipush 1013
    //   636: if_icmpne +55 -> 691
    //   639: iload_1
    //   640: istore_2
    //   641: iload_1
    //   642: iload_3
    //   643: iconst_1
    //   644: isub
    //   645: if_icmplt +46 -> 691
    //   648: ldc 123
    //   650: ldc_w 448
    //   653: invokestatic 179	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   656: aload_0
    //   657: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   660: aload_0
    //   661: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   664: getfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   667: ldc_w 397
    //   670: ldc_w 450
    //   673: invokevirtual 454	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   676: putfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   679: aload_0
    //   680: iconst_0
    //   681: putfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   684: aload_0
    //   685: iconst_0
    //   686: putfield 43	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXk	Z
    //   689: iconst_m1
    //   690: istore_2
    //   691: iload_2
    //   692: iconst_1
    //   693: iadd
    //   694: istore_2
    //   695: iload_2
    //   696: istore_1
    //   697: iload_2
    //   698: iload_3
    //   699: if_icmplt -643 -> 56
    //   702: aload_0
    //   703: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   706: getfield 435	com/tencent/mm/plugin/webview/wepkg/downloader/f:rXI	Lcom/tencent/mm/plugin/webview/wepkg/downloader/a;
    //   709: ifnull +52 -> 761
    //   712: aload_0
    //   713: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   716: getfield 435	com/tencent/mm/plugin/webview/wepkg/downloader/f:rXI	Lcom/tencent/mm/plugin/webview/wepkg/downloader/a;
    //   719: astore 7
    //   721: aload_0
    //   722: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   725: astore 8
    //   727: aload_0
    //   728: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   731: istore_3
    //   732: aload_0
    //   733: getfield 43	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXk	Z
    //   736: ifeq +365 -> 1101
    //   739: iconst_1
    //   740: istore_1
    //   741: aload 7
    //   743: new 437	com/tencent/mm/plugin/webview/wepkg/downloader/g
    //   746: dup
    //   747: aload 8
    //   749: iconst_2
    //   750: iload_3
    //   751: iload_1
    //   752: iload_2
    //   753: invokespecial 440	com/tencent/mm/plugin/webview/wepkg/downloader/g:<init>	(Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;IIII)V
    //   756: invokeinterface 446 2 0
    //   761: ldc2_w 328
    //   764: ldc_w 330
    //   767: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   770: return
    //   771: astore 7
    //   773: aload 9
    //   775: iload_2
    //   776: new 480	android/net/SSLSessionCache
    //   779: dup
    //   780: invokestatic 486	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   783: invokespecial 489	android/net/SSLSessionCache:<init>	(Landroid/content/Context;)V
    //   786: invokestatic 494	android/net/SSLCertificateSocketFactory:getDefault	(ILandroid/net/SSLSessionCache;)Ljavax/net/ssl/SSLSocketFactory;
    //   789: invokevirtual 427	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   792: goto -430 -> 362
    //   795: astore 7
    //   797: aload_0
    //   798: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   801: getfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   804: ldc_w 397
    //   807: invokevirtual 209	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   810: ifeq +61 -> 871
    //   813: aload_0
    //   814: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   817: sipush 1013
    //   820: if_icmpne +51 -> 871
    //   823: iload_1
    //   824: iload_3
    //   825: iconst_1
    //   826: isub
    //   827: if_icmplt +44 -> 871
    //   830: ldc 123
    //   832: ldc_w 448
    //   835: invokestatic 179	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   838: aload_0
    //   839: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   842: aload_0
    //   843: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   846: getfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   849: ldc_w 397
    //   852: ldc_w 450
    //   855: invokevirtual 454	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   858: putfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   861: aload_0
    //   862: iconst_0
    //   863: putfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   866: aload_0
    //   867: iconst_0
    //   868: putfield 43	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXk	Z
    //   871: aload 7
    //   873: athrow
    //   874: iconst_0
    //   875: istore_2
    //   876: goto -447 -> 429
    //   879: aload_0
    //   880: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   883: sipush 1011
    //   886: if_icmpeq +45 -> 931
    //   889: aload_0
    //   890: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   893: sipush 1001
    //   896: if_icmpeq +35 -> 931
    //   899: aload_0
    //   900: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   903: sipush 1009
    //   906: if_icmpeq +25 -> 931
    //   909: aload_0
    //   910: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   913: sipush 1002
    //   916: if_icmpeq +15 -> 931
    //   919: aload_0
    //   920: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   923: istore_2
    //   924: iload_2
    //   925: sipush 1007
    //   928: if_icmpne +88 -> 1016
    //   931: iload_1
    //   932: istore_2
    //   933: aload_0
    //   934: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   937: getfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   940: ldc_w 397
    //   943: invokevirtual 209	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   946: ifeq -244 -> 702
    //   949: iload_1
    //   950: istore_2
    //   951: aload_0
    //   952: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   955: sipush 1013
    //   958: if_icmpne -256 -> 702
    //   961: iload_1
    //   962: istore_2
    //   963: iload_1
    //   964: iload_3
    //   965: iconst_1
    //   966: isub
    //   967: if_icmplt -265 -> 702
    //   970: ldc 123
    //   972: ldc_w 448
    //   975: invokestatic 179	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   978: aload_0
    //   979: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   982: aload_0
    //   983: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   986: getfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   989: ldc_w 397
    //   992: ldc_w 450
    //   995: invokevirtual 454	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   998: putfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   1001: aload_0
    //   1002: iconst_0
    //   1003: putfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   1006: aload_0
    //   1007: iconst_0
    //   1008: putfield 43	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXk	Z
    //   1011: iconst_m1
    //   1012: istore_2
    //   1013: goto -311 -> 702
    //   1016: iload_1
    //   1017: istore_2
    //   1018: aload_0
    //   1019: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   1022: getfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   1025: ldc_w 397
    //   1028: invokevirtual 209	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1031: ifeq -340 -> 691
    //   1034: iload_1
    //   1035: istore_2
    //   1036: aload_0
    //   1037: getfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   1040: sipush 1013
    //   1043: if_icmpne -352 -> 691
    //   1046: iload_1
    //   1047: istore_2
    //   1048: iload_1
    //   1049: iload_3
    //   1050: iconst_1
    //   1051: isub
    //   1052: if_icmplt -361 -> 691
    //   1055: ldc 123
    //   1057: ldc_w 448
    //   1060: invokestatic 179	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1063: aload_0
    //   1064: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   1067: aload_0
    //   1068: getfield 45	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXc	Lcom/tencent/mm/plugin/webview/wepkg/downloader/f;
    //   1071: getfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   1074: ldc_w 397
    //   1077: ldc_w 450
    //   1080: invokevirtual 454	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1083: putfield 296	com/tencent/mm/plugin/webview/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   1086: aload_0
    //   1087: iconst_0
    //   1088: putfield 41	com/tencent/mm/plugin/webview/wepkg/downloader/c:retCode	I
    //   1091: aload_0
    //   1092: iconst_0
    //   1093: putfield 43	com/tencent/mm/plugin/webview/wepkg/downloader/c:rXk	Z
    //   1096: iconst_m1
    //   1097: istore_2
    //   1098: goto -407 -> 691
    //   1101: iconst_0
    //   1102: istore_1
    //   1103: goto -362 -> 741
    //   1106: astore 7
    //   1108: aload 8
    //   1110: astore 7
    //   1112: goto -779 -> 333
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1115	0	this	c
    //   55	1048	1	i	int
    //   284	814	2	j	int
    //   53	999	3	k	int
    //   215	336	4	l	long
    //   255	314	6	bool	boolean
    //   70	360	7	localObject1	Object
    //   587	14	7	localException1	Exception
    //   719	23	7	locala	a
    //   771	1	7	localException2	Exception
    //   795	77	7	localObject2	Object
    //   1106	1	7	localException3	Exception
    //   1110	1	7	localObject3	Object
    //   173	936	8	localObject4	Object
    //   292	482	9	localHttpsURLConnection	javax.net.ssl.HttpsURLConnection
    // Exception table:
    //   from	to	target	type
    //   56	195	587	java/lang/Exception
    //   195	247	587	java/lang/Exception
    //   257	263	587	java/lang/Exception
    //   263	302	587	java/lang/Exception
    //   311	319	587	java/lang/Exception
    //   362	427	587	java/lang/Exception
    //   429	449	587	java/lang/Exception
    //   533	567	587	java/lang/Exception
    //   573	584	587	java/lang/Exception
    //   773	792	587	java/lang/Exception
    //   879	924	587	java/lang/Exception
    //   338	362	771	java/lang/Exception
    //   56	195	795	finally
    //   195	247	795	finally
    //   257	263	795	finally
    //   263	302	795	finally
    //   311	319	795	finally
    //   328	333	795	finally
    //   338	362	795	finally
    //   362	427	795	finally
    //   429	449	795	finally
    //   533	567	795	finally
    //   573	584	795	finally
    //   589	609	795	finally
    //   773	792	795	finally
    //   879	924	795	finally
    //   328	333	1106	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\downloader\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */