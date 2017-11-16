package c.t.m.g;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ai
  extends ad
{
  private String A;
  private a B = new a();
  public String l;
  long m;
  boolean n = false;
  boolean o = false;
  int p = 0;
  boolean q = false;
  private HttpURLConnection r;
  private DataOutputStream s;
  private DataInputStream t;
  private ah u;
  private boolean v;
  private boolean w;
  private String x = "";
  private int y;
  private long z = 0L;
  
  public ai(String paramString1, String paramString2, boolean paramBoolean, Map<String, String> paramMap, byte[] paramArrayOfByte, int paramInt, String paramString3)
  {
    this.l = paramString1;
    this.a = paramString2;
    this.b = paramBoolean;
    this.c = paramMap;
    this.d = paramArrayOfByte;
    int i;
    if (o.g() == 2)
    {
      i = u.a("direct_access_time_out", 1000, 60000, 15000);
      if (paramInt >= i) {
        break label144;
      }
    }
    for (;;)
    {
      this.e = ce.a(paramInt, 200, 60000, 10000);
      this.f = paramString3;
      return;
      i = u.a("direct_access_time_out", 1000, 60000, 10000);
      break;
      label144:
      paramInt = i;
    }
  }
  
  private void a(int paramInt)
  {
    int i1 = 0;
    for (;;)
    {
      try
      {
        localBufferedInputStream = new BufferedInputStream(this.r.getInputStream());
        localByteArrayOutputStream = new ByteArrayOutputStream();
        arrayOfByte = new byte['က'];
        i = 0;
        j = i;
      }
      catch (OutOfMemoryError localOutOfMemoryError1)
      {
        try
        {
          BufferedInputStream localBufferedInputStream;
          ByteArrayOutputStream localByteArrayOutputStream;
          byte[] arrayOfByte;
          int i;
          int k;
          localByteArrayOutputStream.close();
          return;
        }
        catch (Exception localException2)
        {
          int j;
          return;
        }
        localOutOfMemoryError1 = localOutOfMemoryError1;
        j = 0;
        this.u.a = 65230;
        this.u.b = ("no-content-length:" + j);
        return;
      }
      catch (Exception localException1)
      {
        this.u.a = 65249;
        this.u.b = "read without content-length error";
        return;
      }
      try
      {
        k = localBufferedInputStream.read(arrayOfByte);
        if (k == -1) {
          break label218;
        }
        j = i;
        localByteArrayOutputStream.write(arrayOfByte, 0, k);
        k = i + k;
        i = k;
        if (k > paramInt)
        {
          j = k;
          this.u.a = 65233;
          j = k;
          this.u.b = "no-content-length";
          paramInt = i1;
          i = k;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError2)
      {
        continue;
        paramInt = 1;
      }
    }
    if (paramInt != 0)
    {
      j = i;
      this.u.d = localByteArrayOutputStream.toByteArray();
      j = i;
      this.B.f = SystemClock.elapsedRealtime();
    }
    j = i;
  }
  
  private void b()
  {
    int j = 0;
    int i = j;
    if (this.c != null)
    {
      i = j;
      if (this.c.size() > 0)
      {
        Iterator localIterator = this.c.keySet().iterator();
        i = 0;
        if (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          String str2 = (String)this.c.get(str1);
          this.r.addRequestProperty(str1, str2);
          if (!str1.toLowerCase().contains("host")) {
            break label225;
          }
          i = 1;
        }
      }
    }
    label225:
    for (;;)
    {
      break;
      if (i == 0) {
        this.r.setRequestProperty("Host", this.l);
      }
      this.r.setRequestProperty("Halley", this.f + "-" + this.p + "-" + System.currentTimeMillis());
      if (this.o) {
        this.r.setRequestProperty("Connection", "close");
      }
      if (this.n)
      {
        this.r.setRequestProperty("X-Online-Host", this.l);
        this.r.setRequestProperty("x-tx-host", this.l);
      }
      return;
    }
  }
  
  private void c()
  {
    try
    {
      if (this.r != null) {
        this.r.disconnect();
      }
      if (this.s != null) {
        this.s.close();
      }
      if (this.t != null) {
        this.t.close();
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  /* Error */
  public final ah a()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 148	android/os/SystemClock:elapsedRealtime	()J
    //   4: putfield 262	c/t/m/g/ai:m	J
    //   7: aload_0
    //   8: getfield 47	c/t/m/g/ai:B	Lc/t/m/g/ai$a;
    //   11: aload_0
    //   12: getfield 262	c/t/m/g/ai:m	J
    //   15: putfield 264	c/t/m/g/ai$a:a	J
    //   18: aload_0
    //   19: new 131	c/t/m/g/ah
    //   22: dup
    //   23: iconst_0
    //   24: ldc 40
    //   26: invokespecial 267	c/t/m/g/ah:<init>	(ILjava/lang/String;)V
    //   29: putfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   32: new 269	java/net/URL
    //   35: dup
    //   36: aload_0
    //   37: getfield 59	c/t/m/g/ai:a	Ljava/lang/String;
    //   40: invokespecial 270	java/net/URL:<init>	(Ljava/lang/String;)V
    //   43: astore_2
    //   44: aload_0
    //   45: aload_2
    //   46: invokevirtual 273	java/net/URL:getProtocol	()Ljava/lang/String;
    //   49: invokevirtual 208	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   52: ldc_w 275
    //   55: invokevirtual 279	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   58: putfield 281	c/t/m/g/ai:v	Z
    //   61: aload_0
    //   62: aload_2
    //   63: invokevirtual 284	java/net/URL:getHost	()Ljava/lang/String;
    //   66: invokestatic 286	c/t/m/g/ce:d	(Ljava/lang/String;)Z
    //   69: putfield 288	c/t/m/g/ai:w	Z
    //   72: aload_0
    //   73: getfield 281	c/t/m/g/ai:v	Z
    //   76: ifeq +476 -> 552
    //   79: aload_0
    //   80: getfield 49	c/t/m/g/ai:n	Z
    //   83: ifeq +455 -> 538
    //   86: invokestatic 292	c/t/m/g/o:k	()Ljava/net/Proxy;
    //   89: ifnull +449 -> 538
    //   92: aload_2
    //   93: invokestatic 292	c/t/m/g/o:k	()Ljava/net/Proxy;
    //   96: invokevirtual 296	java/net/URL:openConnection	(Ljava/net/Proxy;)Ljava/net/URLConnection;
    //   99: checkcast 298	javax/net/ssl/HttpsURLConnection
    //   102: astore_2
    //   103: aload_2
    //   104: astore_3
    //   105: aload_0
    //   106: getfield 288	c/t/m/g/ai:w	Z
    //   109: ifeq +39 -> 148
    //   112: aload_2
    //   113: ldc -40
    //   115: aload_0
    //   116: getfield 57	c/t/m/g/ai:l	Ljava/lang/String;
    //   119: invokevirtual 299	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   122: aload_2
    //   123: new 301	c/t/m/g/ag
    //   126: dup
    //   127: aload_2
    //   128: invokespecial 304	c/t/m/g/ag:<init>	(Ljavax/net/ssl/HttpsURLConnection;)V
    //   131: invokevirtual 308	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   134: aload_2
    //   135: new 310	c/t/m/g/aj
    //   138: dup
    //   139: aload_0
    //   140: invokespecial 313	c/t/m/g/aj:<init>	(Lc/t/m/g/ai;)V
    //   143: invokevirtual 317	javax/net/ssl/HttpsURLConnection:setHostnameVerifier	(Ljavax/net/ssl/HostnameVerifier;)V
    //   146: aload_2
    //   147: astore_3
    //   148: aload_0
    //   149: aload_3
    //   150: putfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   153: aload_0
    //   154: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   157: astore_3
    //   158: aload_0
    //   159: getfield 62	c/t/m/g/ai:b	Z
    //   162: ifeq +1098 -> 1260
    //   165: ldc_w 319
    //   168: astore_2
    //   169: aload_3
    //   170: aload_2
    //   171: invokevirtual 322	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   174: aload_0
    //   175: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   178: aload_0
    //   179: getfield 92	c/t/m/g/ai:e	I
    //   182: invokevirtual 325	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   185: aload_0
    //   186: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   189: aload_0
    //   190: getfield 92	c/t/m/g/ai:e	I
    //   193: invokevirtual 328	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   196: aload_0
    //   197: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   200: iconst_0
    //   201: invokevirtual 332	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   204: aload_0
    //   205: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   208: iconst_1
    //   209: invokevirtual 335	java/net/HttpURLConnection:setDoInput	(Z)V
    //   212: aload_0
    //   213: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   216: iconst_0
    //   217: invokevirtual 338	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   220: aload_0
    //   221: invokespecial 340	c/t/m/g/ai:b	()V
    //   224: getstatic 345	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   227: ifnull +21 -> 248
    //   230: getstatic 348	android/os/Build$VERSION:SDK_INT	I
    //   233: bipush 8
    //   235: if_icmpge +13 -> 248
    //   238: ldc_w 350
    //   241: ldc_w 352
    //   244: invokestatic 356	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   247: pop
    //   248: aload_0
    //   249: getfield 62	c/t/m/g/ai:b	Z
    //   252: ifne +31 -> 283
    //   255: aload_0
    //   256: getfield 70	c/t/m/g/ai:d	[B
    //   259: invokestatic 359	c/t/m/g/ce:a	([B)Z
    //   262: ifne +21 -> 283
    //   265: aload_0
    //   266: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   269: iconst_1
    //   270: invokevirtual 362	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   273: aload_0
    //   274: aload_0
    //   275: getfield 70	c/t/m/g/ai:d	[B
    //   278: arraylength
    //   279: i2l
    //   280: putfield 44	c/t/m/g/ai:z	J
    //   283: aload_0
    //   284: getfield 47	c/t/m/g/ai:B	Lc/t/m/g/ai$a;
    //   287: invokestatic 148	android/os/SystemClock:elapsedRealtime	()J
    //   290: putfield 364	c/t/m/g/ai$a:b	J
    //   293: aload_0
    //   294: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   297: invokevirtual 367	java/net/HttpURLConnection:connect	()V
    //   300: aload_0
    //   301: getfield 47	c/t/m/g/ai:B	Lc/t/m/g/ai$a;
    //   304: invokestatic 148	android/os/SystemClock:elapsedRealtime	()J
    //   307: putfield 369	c/t/m/g/ai$a:c	J
    //   310: aload_0
    //   311: getfield 62	c/t/m/g/ai:b	Z
    //   314: ifne +49 -> 363
    //   317: aload_0
    //   318: getfield 70	c/t/m/g/ai:d	[B
    //   321: invokestatic 359	c/t/m/g/ce:a	([B)Z
    //   324: ifne +39 -> 363
    //   327: aload_0
    //   328: new 251	java/io/DataOutputStream
    //   331: dup
    //   332: aload_0
    //   333: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   336: invokevirtual 373	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   339: invokespecial 376	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   342: putfield 249	c/t/m/g/ai:s	Ljava/io/DataOutputStream;
    //   345: aload_0
    //   346: getfield 249	c/t/m/g/ai:s	Ljava/io/DataOutputStream;
    //   349: aload_0
    //   350: getfield 70	c/t/m/g/ai:d	[B
    //   353: invokevirtual 379	java/io/DataOutputStream:write	([B)V
    //   356: aload_0
    //   357: getfield 249	c/t/m/g/ai:s	Ljava/io/DataOutputStream;
    //   360: invokevirtual 382	java/io/DataOutputStream:flush	()V
    //   363: aload_0
    //   364: getfield 47	c/t/m/g/ai:B	Lc/t/m/g/ai$a;
    //   367: invokestatic 148	android/os/SystemClock:elapsedRealtime	()J
    //   370: putfield 384	c/t/m/g/ai$a:d	J
    //   373: aload_0
    //   374: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   377: invokevirtual 387	java/net/HttpURLConnection:getResponseCode	()I
    //   380: istore_1
    //   381: aload_0
    //   382: getfield 47	c/t/m/g/ai:B	Lc/t/m/g/ai$a;
    //   385: invokestatic 148	android/os/SystemClock:elapsedRealtime	()J
    //   388: putfield 389	c/t/m/g/ai$a:e	J
    //   391: aload_0
    //   392: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   395: iload_1
    //   396: putfield 391	c/t/m/g/ah:c	I
    //   399: aload_0
    //   400: aload_0
    //   401: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   404: invokevirtual 394	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
    //   407: putfield 42	c/t/m/g/ai:x	Ljava/lang/String;
    //   410: new 396	java/util/HashMap
    //   413: dup
    //   414: invokespecial 397	java/util/HashMap:<init>	()V
    //   417: astore_2
    //   418: aload_0
    //   419: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   422: invokevirtual 401	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   425: invokeinterface 404 1 0
    //   430: invokeinterface 185 1 0
    //   435: astore_3
    //   436: aload_3
    //   437: invokeinterface 191 1 0
    //   442: ifeq +151 -> 593
    //   445: aload_3
    //   446: invokeinterface 195 1 0
    //   451: checkcast 406	java/util/Map$Entry
    //   454: astore 4
    //   456: aload 4
    //   458: invokeinterface 409 1 0
    //   463: ifnull -27 -> 436
    //   466: aload_2
    //   467: aload 4
    //   469: invokeinterface 409 1 0
    //   474: aload 4
    //   476: invokeinterface 412 1 0
    //   481: checkcast 414	java/util/List
    //   484: iconst_0
    //   485: invokeinterface 417 2 0
    //   490: invokeinterface 421 3 0
    //   495: pop
    //   496: goto -60 -> 436
    //   499: astore_2
    //   500: aload_0
    //   501: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   504: sipush 65236
    //   507: putfield 133	c/t/m/g/ah:a	I
    //   510: aload_0
    //   511: invokespecial 423	c/t/m/g/ai:c	()V
    //   514: aload_0
    //   515: invokestatic 148	android/os/SystemClock:elapsedRealtime	()J
    //   518: aload_0
    //   519: getfield 262	c/t/m/g/ai:m	J
    //   522: lsub
    //   523: putfield 262	c/t/m/g/ai:m	J
    //   526: aload_0
    //   527: getfield 47	c/t/m/g/ai:B	Lc/t/m/g/ai$a;
    //   530: invokevirtual 425	c/t/m/g/ai$a:a	()V
    //   533: aload_0
    //   534: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   537: areturn
    //   538: aload_2
    //   539: getstatic 431	java/net/Proxy:NO_PROXY	Ljava/net/Proxy;
    //   542: invokevirtual 296	java/net/URL:openConnection	(Ljava/net/Proxy;)Ljava/net/URLConnection;
    //   545: checkcast 298	javax/net/ssl/HttpsURLConnection
    //   548: astore_2
    //   549: goto -446 -> 103
    //   552: aload_0
    //   553: getfield 49	c/t/m/g/ai:n	Z
    //   556: ifeq +23 -> 579
    //   559: invokestatic 292	c/t/m/g/o:k	()Ljava/net/Proxy;
    //   562: ifnull +17 -> 579
    //   565: aload_2
    //   566: invokestatic 292	c/t/m/g/o:k	()Ljava/net/Proxy;
    //   569: invokevirtual 296	java/net/URL:openConnection	(Ljava/net/Proxy;)Ljava/net/URLConnection;
    //   572: checkcast 109	java/net/HttpURLConnection
    //   575: astore_3
    //   576: goto -428 -> 148
    //   579: aload_2
    //   580: getstatic 431	java/net/Proxy:NO_PROXY	Ljava/net/Proxy;
    //   583: invokevirtual 296	java/net/URL:openConnection	(Ljava/net/Proxy;)Ljava/net/URLConnection;
    //   586: checkcast 109	java/net/HttpURLConnection
    //   589: astore_3
    //   590: goto -442 -> 148
    //   593: aload_0
    //   594: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   597: aload_2
    //   598: invokevirtual 434	c/t/m/g/ah:a	(Ljava/util/Map;)V
    //   601: aload_0
    //   602: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   605: getfield 391	c/t/m/g/ah:c	I
    //   608: sipush 200
    //   611: if_icmplt +370 -> 981
    //   614: aload_0
    //   615: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   618: getfield 391	c/t/m/g/ah:c	I
    //   621: sipush 300
    //   624: if_icmpge +357 -> 981
    //   627: aload_0
    //   628: aload_0
    //   629: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   632: invokevirtual 437	java/net/HttpURLConnection:getContentLength	()I
    //   635: putfield 439	c/t/m/g/ai:y	I
    //   638: ldc_w 441
    //   641: ldc_w 442
    //   644: ldc_w 443
    //   647: ldc_w 444
    //   650: invokestatic 84	c/t/m/g/u:a	(Ljava/lang/String;III)I
    //   653: istore_1
    //   654: aload_0
    //   655: getfield 439	c/t/m/g/ai:y	I
    //   658: ifge +34 -> 692
    //   661: aload_0
    //   662: iload_1
    //   663: invokespecial 446	c/t/m/g/ai:a	(I)V
    //   666: aload_0
    //   667: invokespecial 423	c/t/m/g/ai:c	()V
    //   670: aload_0
    //   671: invokestatic 148	android/os/SystemClock:elapsedRealtime	()J
    //   674: aload_0
    //   675: getfield 262	c/t/m/g/ai:m	J
    //   678: lsub
    //   679: putfield 262	c/t/m/g/ai:m	J
    //   682: aload_0
    //   683: getfield 47	c/t/m/g/ai:B	Lc/t/m/g/ai$a;
    //   686: invokevirtual 425	c/t/m/g/ai$a:a	()V
    //   689: goto -156 -> 533
    //   692: aload_0
    //   693: getfield 439	c/t/m/g/ai:y	I
    //   696: ifne +122 -> 818
    //   699: aload_0
    //   700: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   703: aconst_null
    //   704: putfield 142	c/t/m/g/ah:d	[B
    //   707: aload_0
    //   708: getfield 47	c/t/m/g/ai:B	Lc/t/m/g/ai$a;
    //   711: invokestatic 148	android/os/SystemClock:elapsedRealtime	()J
    //   714: putfield 150	c/t/m/g/ai$a:f	J
    //   717: goto -51 -> 666
    //   720: astore_2
    //   721: aload_0
    //   722: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   725: sipush 65249
    //   728: putfield 133	c/t/m/g/ah:a	I
    //   731: aload_0
    //   732: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   735: new 155	java/lang/StringBuilder
    //   738: dup
    //   739: invokespecial 222	java/lang/StringBuilder:<init>	()V
    //   742: aload_2
    //   743: invokevirtual 452	java/lang/Object:getClass	()Ljava/lang/Class;
    //   746: invokevirtual 457	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   749: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   752: ldc_w 459
    //   755: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   758: aload_2
    //   759: invokevirtual 462	java/lang/Throwable:getLocalizedMessage	()Ljava/lang/String;
    //   762: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   765: ldc_w 464
    //   768: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   771: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   774: putfield 137	c/t/m/g/ah:b	Ljava/lang/String;
    //   777: invokestatic 467	c/t/m/g/o:h	()Z
    //   780: ifne +258 -> 1038
    //   783: aload_0
    //   784: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   787: bipush -4
    //   789: putfield 133	c/t/m/g/ah:a	I
    //   792: aload_0
    //   793: invokespecial 423	c/t/m/g/ai:c	()V
    //   796: aload_0
    //   797: invokestatic 148	android/os/SystemClock:elapsedRealtime	()J
    //   800: aload_0
    //   801: getfield 262	c/t/m/g/ai:m	J
    //   804: lsub
    //   805: putfield 262	c/t/m/g/ai:m	J
    //   808: aload_0
    //   809: getfield 47	c/t/m/g/ai:B	Lc/t/m/g/ai$a;
    //   812: invokevirtual 425	c/t/m/g/ai$a:a	()V
    //   815: goto -282 -> 533
    //   818: aload_0
    //   819: getfield 439	c/t/m/g/ai:y	I
    //   822: iload_1
    //   823: if_icmple +66 -> 889
    //   826: aload_0
    //   827: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   830: sipush 65233
    //   833: putfield 133	c/t/m/g/ah:a	I
    //   836: aload_0
    //   837: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   840: new 155	java/lang/StringBuilder
    //   843: dup
    //   844: invokespecial 222	java/lang/StringBuilder:<init>	()V
    //   847: aload_0
    //   848: getfield 439	c/t/m/g/ai:y	I
    //   851: invokevirtual 164	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   854: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   857: putfield 137	c/t/m/g/ah:b	Ljava/lang/String;
    //   860: goto -194 -> 666
    //   863: astore_2
    //   864: aload_0
    //   865: invokespecial 423	c/t/m/g/ai:c	()V
    //   868: aload_0
    //   869: invokestatic 148	android/os/SystemClock:elapsedRealtime	()J
    //   872: aload_0
    //   873: getfield 262	c/t/m/g/ai:m	J
    //   876: lsub
    //   877: putfield 262	c/t/m/g/ai:m	J
    //   880: aload_0
    //   881: getfield 47	c/t/m/g/ai:B	Lc/t/m/g/ai$a;
    //   884: invokevirtual 425	c/t/m/g/ai$a:a	()V
    //   887: aload_2
    //   888: athrow
    //   889: aload_0
    //   890: getfield 439	c/t/m/g/ai:y	I
    //   893: newarray <illegal type>
    //   895: astore_2
    //   896: aload_0
    //   897: new 256	java/io/DataInputStream
    //   900: dup
    //   901: aload_0
    //   902: getfield 107	c/t/m/g/ai:r	Ljava/net/HttpURLConnection;
    //   905: invokevirtual 113	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   908: invokespecial 468	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   911: putfield 254	c/t/m/g/ai:t	Ljava/io/DataInputStream;
    //   914: aload_0
    //   915: getfield 254	c/t/m/g/ai:t	Ljava/io/DataInputStream;
    //   918: aload_2
    //   919: invokevirtual 471	java/io/DataInputStream:readFully	([B)V
    //   922: aload_0
    //   923: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   926: aload_2
    //   927: putfield 142	c/t/m/g/ah:d	[B
    //   930: aload_0
    //   931: getfield 47	c/t/m/g/ai:B	Lc/t/m/g/ai$a;
    //   934: invokestatic 148	android/os/SystemClock:elapsedRealtime	()J
    //   937: putfield 150	c/t/m/g/ai$a:f	J
    //   940: goto -274 -> 666
    //   943: astore_2
    //   944: aload_0
    //   945: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   948: sipush 65230
    //   951: putfield 133	c/t/m/g/ah:a	I
    //   954: aload_0
    //   955: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   958: new 155	java/lang/StringBuilder
    //   961: dup
    //   962: invokespecial 222	java/lang/StringBuilder:<init>	()V
    //   965: aload_0
    //   966: getfield 439	c/t/m/g/ai:y	I
    //   969: invokevirtual 164	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   972: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   975: putfield 137	c/t/m/g/ah:b	Ljava/lang/String;
    //   978: goto -312 -> 666
    //   981: aload_0
    //   982: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   985: getfield 391	c/t/m/g/ah:c	I
    //   988: sipush 300
    //   991: if_icmplt +33 -> 1024
    //   994: aload_0
    //   995: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   998: getfield 391	c/t/m/g/ah:c	I
    //   1001: sipush 400
    //   1004: if_icmpge +20 -> 1024
    //   1007: aload_0
    //   1008: aload_0
    //   1009: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   1012: ldc_w 473
    //   1015: invokevirtual 476	c/t/m/g/ah:a	(Ljava/lang/String;)Ljava/lang/String;
    //   1018: putfield 478	c/t/m/g/ai:g	Ljava/lang/String;
    //   1021: goto -355 -> 666
    //   1024: aload_0
    //   1025: aload_0
    //   1026: getfield 57	c/t/m/g/ai:l	Ljava/lang/String;
    //   1029: invokestatic 480	c/t/m/g/ce:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1032: putfield 482	c/t/m/g/ai:A	Ljava/lang/String;
    //   1035: goto -369 -> 666
    //   1038: aload_0
    //   1039: iconst_1
    //   1040: putfield 484	c/t/m/g/ai:h	Z
    //   1043: aload_0
    //   1044: getfield 47	c/t/m/g/ai:B	Lc/t/m/g/ai$a;
    //   1047: getfield 389	c/t/m/g/ai$a:e	J
    //   1050: lconst_0
    //   1051: lcmp
    //   1052: ifne +14 -> 1066
    //   1055: aload_0
    //   1056: aload_0
    //   1057: getfield 57	c/t/m/g/ai:l	Ljava/lang/String;
    //   1060: invokestatic 480	c/t/m/g/ce:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1063: putfield 482	c/t/m/g/ai:A	Ljava/lang/String;
    //   1066: aload_2
    //   1067: invokevirtual 487	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1070: ifnull +42 -> 1112
    //   1073: aload_2
    //   1074: invokevirtual 487	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1077: invokevirtual 208	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   1080: ldc_w 489
    //   1083: invokevirtual 214	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1086: ifeq +26 -> 1112
    //   1089: aload_0
    //   1090: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   1093: sipush 65255
    //   1096: putfield 133	c/t/m/g/ah:a	I
    //   1099: aload_0
    //   1100: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   1103: ldc_w 491
    //   1106: putfield 137	c/t/m/g/ah:b	Ljava/lang/String;
    //   1109: goto -317 -> 792
    //   1112: aload_2
    //   1113: instanceof 493
    //   1116: ifeq +16 -> 1132
    //   1119: aload_0
    //   1120: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   1123: sipush 65252
    //   1126: putfield 133	c/t/m/g/ah:a	I
    //   1129: goto -337 -> 792
    //   1132: aload_2
    //   1133: instanceof 495
    //   1136: ifeq +15 -> 1151
    //   1139: aload_0
    //   1140: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   1143: bipush -42
    //   1145: putfield 133	c/t/m/g/ah:a	I
    //   1148: goto -356 -> 792
    //   1151: aload_2
    //   1152: instanceof 497
    //   1155: ifeq +62 -> 1217
    //   1158: aload_2
    //   1159: invokevirtual 462	java/lang/Throwable:getLocalizedMessage	()Ljava/lang/String;
    //   1162: astore_2
    //   1163: aload_2
    //   1164: ifnull +41 -> 1205
    //   1167: aload_2
    //   1168: invokevirtual 208	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   1171: ldc_w 498
    //   1174: invokevirtual 214	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1177: ifne +16 -> 1193
    //   1180: aload_2
    //   1181: invokevirtual 208	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   1184: ldc_w 500
    //   1187: invokevirtual 214	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1190: ifeq +15 -> 1205
    //   1193: aload_0
    //   1194: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   1197: bipush -10
    //   1199: putfield 133	c/t/m/g/ah:a	I
    //   1202: goto -410 -> 792
    //   1205: aload_0
    //   1206: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   1209: bipush -13
    //   1211: putfield 133	c/t/m/g/ah:a	I
    //   1214: goto -422 -> 792
    //   1217: aload_2
    //   1218: instanceof 502
    //   1221: ifeq +15 -> 1236
    //   1224: aload_0
    //   1225: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   1228: bipush -41
    //   1230: putfield 133	c/t/m/g/ah:a	I
    //   1233: goto -441 -> 792
    //   1236: aload_2
    //   1237: instanceof 504
    //   1240: ifeq -448 -> 792
    //   1243: aload_0
    //   1244: getfield 129	c/t/m/g/ai:u	Lc/t/m/g/ah;
    //   1247: sipush 65250
    //   1250: putfield 133	c/t/m/g/ah:a	I
    //   1253: goto -461 -> 792
    //   1256: astore_2
    //   1257: goto -1009 -> 248
    //   1260: ldc_w 506
    //   1263: astore_2
    //   1264: goto -1095 -> 169
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1267	0	this	ai
    //   380	444	1	i	int
    //   43	424	2	localObject1	Object
    //   499	40	2	localMalformedURLException	java.net.MalformedURLException
    //   548	50	2	localHttpsURLConnection	javax.net.ssl.HttpsURLConnection
    //   720	39	2	localThrowable	Throwable
    //   863	25	2	localObject2	Object
    //   895	32	2	arrayOfByte	byte[]
    //   943	216	2	localOutOfMemoryError	OutOfMemoryError
    //   1162	75	2	str1	String
    //   1256	1	2	localException	Exception
    //   1263	1	2	str2	String
    //   104	486	3	localObject3	Object
    //   454	21	4	localEntry	java.util.Map.Entry
    // Exception table:
    //   from	to	target	type
    //   32	103	499	java/net/MalformedURLException
    //   105	146	499	java/net/MalformedURLException
    //   148	165	499	java/net/MalformedURLException
    //   169	224	499	java/net/MalformedURLException
    //   224	248	499	java/net/MalformedURLException
    //   248	283	499	java/net/MalformedURLException
    //   283	363	499	java/net/MalformedURLException
    //   363	436	499	java/net/MalformedURLException
    //   436	496	499	java/net/MalformedURLException
    //   538	549	499	java/net/MalformedURLException
    //   552	576	499	java/net/MalformedURLException
    //   579	590	499	java/net/MalformedURLException
    //   593	666	499	java/net/MalformedURLException
    //   692	717	499	java/net/MalformedURLException
    //   818	860	499	java/net/MalformedURLException
    //   889	940	499	java/net/MalformedURLException
    //   944	978	499	java/net/MalformedURLException
    //   981	1021	499	java/net/MalformedURLException
    //   1024	1035	499	java/net/MalformedURLException
    //   32	103	720	java/lang/Throwable
    //   105	146	720	java/lang/Throwable
    //   148	165	720	java/lang/Throwable
    //   169	224	720	java/lang/Throwable
    //   224	248	720	java/lang/Throwable
    //   248	283	720	java/lang/Throwable
    //   283	363	720	java/lang/Throwable
    //   363	436	720	java/lang/Throwable
    //   436	496	720	java/lang/Throwable
    //   538	549	720	java/lang/Throwable
    //   552	576	720	java/lang/Throwable
    //   579	590	720	java/lang/Throwable
    //   593	666	720	java/lang/Throwable
    //   692	717	720	java/lang/Throwable
    //   818	860	720	java/lang/Throwable
    //   889	940	720	java/lang/Throwable
    //   944	978	720	java/lang/Throwable
    //   981	1021	720	java/lang/Throwable
    //   1024	1035	720	java/lang/Throwable
    //   32	103	863	finally
    //   105	146	863	finally
    //   148	165	863	finally
    //   169	224	863	finally
    //   224	248	863	finally
    //   248	283	863	finally
    //   283	363	863	finally
    //   363	436	863	finally
    //   436	496	863	finally
    //   500	510	863	finally
    //   538	549	863	finally
    //   552	576	863	finally
    //   579	590	863	finally
    //   593	666	863	finally
    //   692	717	863	finally
    //   721	792	863	finally
    //   818	860	863	finally
    //   889	940	863	finally
    //   944	978	863	finally
    //   981	1021	863	finally
    //   1024	1035	863	finally
    //   1038	1066	863	finally
    //   1066	1109	863	finally
    //   1112	1129	863	finally
    //   1132	1148	863	finally
    //   1151	1163	863	finally
    //   1167	1193	863	finally
    //   1193	1202	863	finally
    //   1205	1214	863	finally
    //   1217	1233	863	finally
    //   1236	1253	863	finally
    //   889	940	943	java/lang/OutOfMemoryError
    //   224	248	1256	java/lang/Exception
  }
  
  public final void a(boolean paramBoolean)
  {
    a(paramBoolean, null, null);
  }
  
  public final void a(boolean paramBoolean, Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    HashMap localHashMap = new HashMap();
    if (paramMap1 != null) {
      localHashMap.putAll(paramMap1);
    }
    localHashMap.put("B59", this.m);
    if (paramBoolean) {
      localHashMap.put("B46", "1");
    }
    if (this.v) {
      localHashMap.put("B85", "1");
    }
    int i;
    if (this.b)
    {
      localHashMap.put("B95", "1");
      if (!this.w) {
        localHashMap.put("B23", "1");
      }
      paramMap1 = new HashMap();
      if (paramMap2 != null) {
        paramMap1.putAll(paramMap2);
      }
      paramMap1.put("B87", this.x);
      paramMap1.put("B88", this.y);
      paramMap1.put("B90", this.B.g);
      paramMap1.put("B91", this.B.h);
      paramMap1.put("B92", this.B.i);
      paramMap1.put("B93", this.B.j);
      paramMap1.put("B94", this.B.k);
      if (!TextUtils.isEmpty(this.g)) {
        paramMap1.put("B47", ce.b(this.g));
      }
      if (!TextUtils.isEmpty(this.A)) {
        paramMap1.put("B41", this.A);
      }
      paramMap1.put("B82", this.f);
      if (this.u.a == 0) {
        break label488;
      }
      i = this.u.a;
    }
    for (;;)
    {
      if (this.q) {
        break label519;
      }
      ca.b("HLHttpDirect", l.b(), i, this.u.b, localHashMap, paramMap1, this.h);
      return;
      localHashMap.put("B96", this.z);
      break;
      label488:
      if (this.u.c == 200) {
        i = 0;
      } else {
        i = this.u.c;
      }
    }
    label519:
    ca.a("HLHttpDirect", l.b(), i, this.u.b, localHashMap, paramMap1, this.h);
  }
  
  static final class a
  {
    long a;
    long b;
    long c;
    long d;
    long e;
    long f;
    long g = -1L;
    long h = -1L;
    long i = -1L;
    long j = -1L;
    long k = -1L;
    
    public final void a()
    {
      long l2 = -1L;
      this.g = (this.b - this.a);
      this.h = (this.c - this.b);
      this.i = (this.d - this.c);
      this.j = (this.e - this.d);
      this.k = (this.f - this.e);
      long l1 = this.g;
      if (l1 >= 0L)
      {
        this.g = l1;
        l1 = this.h;
        if (l1 < 0L) {
          break label164;
        }
        label96:
        this.h = l1;
        l1 = this.i;
        if (l1 < 0L) {
          break label171;
        }
        label112:
        this.i = l1;
        l1 = this.j;
        if (l1 < 0L) {
          break label178;
        }
      }
      for (;;)
      {
        this.j = l1;
        long l3 = this.k;
        l1 = l2;
        if (l3 >= 0L) {
          l1 = l3;
        }
        this.k = l1;
        return;
        l1 = -1L;
        break;
        label164:
        l1 = -1L;
        break label96;
        label171:
        l1 = -1L;
        break label112;
        label178:
        l1 = -1L;
      }
    }
    
    public final String toString()
    {
      return "Stat{startToTryConnect=" + this.g + ", connectCost=" + this.h + ", connectToPost=" + this.i + ", postToRsp=" + this.j + ", rspToRead=" + this.k + '}';
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */