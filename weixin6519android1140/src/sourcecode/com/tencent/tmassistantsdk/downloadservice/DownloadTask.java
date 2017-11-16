package com.tencent.tmassistantsdk.downloadservice;

import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

public class DownloadTask
{
  public static final String TAG = "_DownloadTask";
  protected DownloadInfo mDownloadInfo = null;
  HttpClient mHttpClient = null;
  HttpGet mHttpGet = null;
  protected final byte[] mRecvBuf = new byte['က'];
  TMAssistantFile mSaveFile;
  protected boolean mStopTask = false;
  protected final int mTaskId = GlobalUtil.getMemUUID();
  
  public DownloadTask(DownloadInfo paramDownloadInfo)
  {
    this.mDownloadInfo = paramDownloadInfo;
  }
  
  private void handleResponseCode(HttpResponse paramHttpResponse, DownloadChunkLogInfo paramDownloadChunkLogInfo)
  {
    int i = paramHttpResponse.getStatusLine().getStatusCode();
    TMLog.i("_DownloadTask", "httpResponseCode = " + i + " " + Thread.currentThread().getName());
    paramDownloadChunkLogInfo.readHeaderTime = System.currentTimeMillis();
    paramDownloadChunkLogInfo.responseHttpCode = i;
    if ((i == 200) || (i == 206)) {
      this.mDownloadInfo.mRetryCnt = 0;
    }
    Object localObject;
    switch (i)
    {
    default: 
      throw new StopRequestException(i, "HTTP response code error, code = " + i);
    case 200: 
      localObject = paramHttpResponse.getHeaders("Content-Type");
      if ((localObject != null) && (localObject.length > 0))
      {
        if (!this.mDownloadInfo.mContentType.equals("resource/tm.android.unknown")) {
          break label253;
        }
        localObject = DownloadHelper.renameAPKFileName(this.mDownloadInfo.mFileName);
        this.mDownloadInfo.mFileName = ((String)localObject);
      }
      for (;;)
      {
        onReceivedResponseData(paramHttpResponse, paramDownloadChunkLogInfo);
        return;
        localObject = localObject[0].getValue();
        if ((!TextUtils.isEmpty((CharSequence)localObject)) && (((String)localObject).startsWith("text"))) {
          throw new StopRequestException(708, "Return contenttype = text " + Thread.currentThread().getName());
        }
        renameApkFileName(paramHttpResponse);
      }
    case 206: 
      if (this.mDownloadInfo.mContentType.equals("resource/tm.android.unknown"))
      {
        localObject = DownloadHelper.renameAPKFileName(this.mDownloadInfo.mFileName);
        this.mDownloadInfo.mFileName = ((String)localObject);
      }
      for (;;)
      {
        onReceivedResponseData(paramHttpResponse, paramDownloadChunkLogInfo);
        return;
        renameApkFileName(paramHttpResponse);
      }
    case 301: 
    case 302: 
    case 303: 
    case 307: 
      if (this.mDownloadInfo.mRedirectCnt > 5)
      {
        TMLog.i("_DownloadTask", "mRedirectCnt = " + this.mDownloadInfo.mRedirectCnt + ",MAX_REDIRESTS = 5");
        throw new StopRequestException(709, "Redirect cnt many times.");
      }
      paramHttpResponse = paramHttpResponse.getFirstHeader("location");
      if (paramHttpResponse != null)
      {
        paramHttpResponse = paramHttpResponse.getValue();
        TMLog.i("_DownloadTask", "jumpURL = " + paramHttpResponse);
        if (DownloadHelper.isValidURL(paramHttpResponse))
        {
          this.mDownloadInfo.mRequestURL = DownloadHelper.correctURL(paramHttpResponse);
          paramHttpResponse = this.mDownloadInfo;
          paramHttpResponse.mRedirectCnt += 1;
          return;
        }
        throw new StopRequestException(700, "Jump url is not valid. httpResponseCode = " + i + " url: " + paramHttpResponse);
      }
      TMLog.e("_DownloadTask", "location header is null. httpResponseCode = " + i);
      throw new StopRequestException(702, "location header is null. httpResponseCode = " + i);
    case 416: 
      throw new StopRequestException(i, "HTTP response code error, code = " + i);
    case 503: 
      label253:
      throw new StopRequestException(i, "HTTP response code error, code = " + i);
    }
    throw new StopRequestException(i, "HTTP response code error, code = " + i);
  }
  
  private void onDownloadError(Throwable paramThrowable)
  {
    if (paramThrowable != null) {
      w.printErrStackTrace("_DownloadTask", paramThrowable, "", new Object[0]);
    }
  }
  
  /* Error */
  private void onReceivedResponseData(HttpResponse paramHttpResponse, DownloadChunkLogInfo paramDownloadChunkLogInfo)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 226 1 0
    //   6: astore 9
    //   8: aload_0
    //   9: aload_1
    //   10: aload 9
    //   12: invokespecial 230	com/tencent/tmassistantsdk/downloadservice/DownloadTask:verifyTotalLen	(Lorg/apache/http/HttpResponse;Lorg/apache/http/HttpEntity;)Z
    //   15: ifne +23 -> 38
    //   18: ldc 8
    //   20: ldc -24
    //   22: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: new 116	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   28: dup
    //   29: sipush 705
    //   32: ldc -22
    //   34: invokespecial 121	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   37: athrow
    //   38: aload_0
    //   39: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   42: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   45: lconst_0
    //   46: lcmp
    //   47: ifne +395 -> 442
    //   50: aload_1
    //   51: invokeinterface 54 1 0
    //   56: invokeinterface 59 1 0
    //   61: sipush 200
    //   64: if_icmpne +261 -> 325
    //   67: aload_0
    //   68: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   71: aload 9
    //   73: invokeinterface 242 1 0
    //   78: invokevirtual 246	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:setTotalSize	(J)V
    //   81: ldc 8
    //   83: new 61	java/lang/StringBuilder
    //   86: dup
    //   87: ldc -8
    //   89: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   92: aload_0
    //   93: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   96: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   99: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   102: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   108: ldc 8
    //   110: new 61	java/lang/StringBuilder
    //   113: dup
    //   114: ldc -3
    //   116: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   119: aload_0
    //   120: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   123: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   126: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   129: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: invokestatic 256	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   135: aload_1
    //   136: ldc_w 258
    //   139: invokeinterface 188 2 0
    //   144: astore_1
    //   145: aload_1
    //   146: ifnull +36 -> 182
    //   149: aload_1
    //   150: invokeinterface 155 1 0
    //   155: invokestatic 264	com/tencent/tmassistantsdk/downloadservice/ByteRange:parseContentRange	(Ljava/lang/String;)Lcom/tencent/tmassistantsdk/downloadservice/ByteRange;
    //   158: astore_1
    //   159: aload_2
    //   160: aload_1
    //   161: invokevirtual 267	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   164: putfield 270	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseRangePosition	J
    //   167: aload_2
    //   168: aload_1
    //   169: invokevirtual 273	com/tencent/tmassistantsdk/downloadservice/ByteRange:getEnd	()J
    //   172: aload_1
    //   173: invokevirtual 267	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   176: lsub
    //   177: lconst_1
    //   178: ladd
    //   179: putfield 276	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseRangeLength	J
    //   182: aload_2
    //   183: aload_0
    //   184: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   187: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   190: putfield 279	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseContentLength	J
    //   193: aload_0
    //   194: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   197: ifnonnull +28 -> 225
    //   200: aload_0
    //   201: new 283	com/tencent/tmassistantsdk/storage/TMAssistantFile
    //   204: dup
    //   205: aload_0
    //   206: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   209: getfield 286	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mTempFileName	Ljava/lang/String;
    //   212: aload_0
    //   213: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   216: getfield 141	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   219: invokespecial 288	com/tencent/tmassistantsdk/storage/TMAssistantFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   222: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   225: lconst_0
    //   226: lstore 6
    //   228: lload 6
    //   230: lstore 4
    //   232: aload 9
    //   234: invokeinterface 292 1 0
    //   239: astore_1
    //   240: lload 6
    //   242: lstore 4
    //   244: ldc 8
    //   246: new 61	java/lang/StringBuilder
    //   249: dup
    //   250: ldc_w 294
    //   253: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   256: aload_0
    //   257: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   260: getfield 141	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   263: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   272: lconst_0
    //   273: lstore 4
    //   275: aload_1
    //   276: aload_0
    //   277: getfield 37	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRecvBuf	[B
    //   280: invokevirtual 300	java/io/InputStream:read	([B)I
    //   283: istore_3
    //   284: iload_3
    //   285: ifle +14 -> 299
    //   288: aload_0
    //   289: getfield 29	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   292: ifeq +474 -> 766
    //   295: aload_1
    //   296: invokevirtual 303	java/io/InputStream:close	()V
    //   299: aload_0
    //   300: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   303: ifnull +15 -> 318
    //   306: aload_0
    //   307: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   310: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   313: aload_0
    //   314: aconst_null
    //   315: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   318: aload_2
    //   319: lload 4
    //   321: putfield 307	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:receiveDataSize	J
    //   324: return
    //   325: aload_1
    //   326: invokeinterface 54 1 0
    //   331: invokeinterface 59 1 0
    //   336: sipush 206
    //   339: if_icmpne +62 -> 401
    //   342: aload_1
    //   343: ldc_w 258
    //   346: invokeinterface 188 2 0
    //   351: astore 10
    //   353: aload_0
    //   354: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   357: aload 10
    //   359: invokeinterface 155 1 0
    //   364: invokestatic 310	com/tencent/tmassistantsdk/downloadservice/ByteRange:getTotalSize	(Ljava/lang/String;)J
    //   367: invokevirtual 246	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:setTotalSize	(J)V
    //   370: ldc 8
    //   372: new 61	java/lang/StringBuilder
    //   375: dup
    //   376: ldc_w 312
    //   379: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   382: aload_0
    //   383: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   386: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   389: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   392: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   395: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   398: goto -290 -> 108
    //   401: ldc 8
    //   403: new 61	java/lang/StringBuilder
    //   406: dup
    //   407: ldc_w 314
    //   410: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   413: aload_1
    //   414: invokeinterface 54 1 0
    //   419: invokeinterface 59 1 0
    //   424: invokevirtual 70	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   427: ldc_w 316
    //   430: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   436: invokestatic 256	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   439: goto -331 -> 108
    //   442: aload_1
    //   443: invokeinterface 54 1 0
    //   448: invokeinterface 59 1 0
    //   453: sipush 206
    //   456: if_icmpne -263 -> 193
    //   459: aload_1
    //   460: ldc_w 258
    //   463: invokeinterface 188 2 0
    //   468: astore_1
    //   469: aload_1
    //   470: invokeinterface 155 1 0
    //   475: invokestatic 264	com/tencent/tmassistantsdk/downloadservice/ByteRange:parseContentRange	(Ljava/lang/String;)Lcom/tencent/tmassistantsdk/downloadservice/ByteRange;
    //   478: astore 10
    //   480: aload_1
    //   481: invokeinterface 155 1 0
    //   486: invokestatic 310	com/tencent/tmassistantsdk/downloadservice/ByteRange:getTotalSize	(Ljava/lang/String;)J
    //   489: lstore 4
    //   491: aload_2
    //   492: aload 10
    //   494: invokevirtual 267	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   497: putfield 270	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseRangePosition	J
    //   500: aload_2
    //   501: aload 10
    //   503: invokevirtual 273	com/tencent/tmassistantsdk/downloadservice/ByteRange:getEnd	()J
    //   506: aload 10
    //   508: invokevirtual 267	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   511: lsub
    //   512: lconst_1
    //   513: ladd
    //   514: putfield 276	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseRangeLength	J
    //   517: aload_2
    //   518: lload 4
    //   520: putfield 279	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseContentLength	J
    //   523: ldc 8
    //   525: new 61	java/lang/StringBuilder
    //   528: dup
    //   529: ldc_w 318
    //   532: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   535: lload 4
    //   537: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   540: ldc_w 320
    //   543: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   546: aload_0
    //   547: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   550: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   553: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   556: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   559: invokestatic 256	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   562: ldc 8
    //   564: new 61	java/lang/StringBuilder
    //   567: dup
    //   568: ldc_w 322
    //   571: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   574: aload_0
    //   575: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   578: getfield 325	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   581: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   584: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   587: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   590: ldc 8
    //   592: new 61	java/lang/StringBuilder
    //   595: dup
    //   596: ldc_w 327
    //   599: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   602: aload 10
    //   604: invokevirtual 267	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   607: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   610: ldc_w 329
    //   613: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   616: aload 10
    //   618: invokevirtual 273	com/tencent/tmassistantsdk/downloadservice/ByteRange:getEnd	()J
    //   621: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   624: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   627: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   630: aload 10
    //   632: invokevirtual 267	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   635: aload_0
    //   636: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   639: getfield 325	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   642: lcmp
    //   643: ifeq +52 -> 695
    //   646: new 116	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   649: dup
    //   650: sipush 706
    //   653: ldc_w 331
    //   656: invokespecial 121	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   659: athrow
    //   660: astore_1
    //   661: new 116	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   664: dup
    //   665: sipush 704
    //   668: aload_1
    //   669: invokespecial 334	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/Throwable;)V
    //   672: athrow
    //   673: astore_1
    //   674: aload_0
    //   675: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   678: ifnull +15 -> 693
    //   681: aload_0
    //   682: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   685: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   688: aload_0
    //   689: aconst_null
    //   690: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   693: aload_1
    //   694: athrow
    //   695: lload 4
    //   697: aload_0
    //   698: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   701: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   704: lcmp
    //   705: ifeq +17 -> 722
    //   708: new 116	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   711: dup
    //   712: sipush 705
    //   715: ldc_w 336
    //   718: invokespecial 121	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   721: athrow
    //   722: ldc 8
    //   724: new 61	java/lang/StringBuilder
    //   727: dup
    //   728: ldc_w 338
    //   731: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   734: aload_1
    //   735: invokevirtual 341	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   738: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   741: invokestatic 344	com/tencent/tmassistantsdk/util/TMLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   744: aload_0
    //   745: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   748: ifnull -555 -> 193
    //   751: aload_0
    //   752: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   755: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   758: aload_0
    //   759: aconst_null
    //   760: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   763: goto -570 -> 193
    //   766: aload_0
    //   767: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   770: getfield 325	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   773: iload_3
    //   774: i2l
    //   775: ladd
    //   776: lstore 6
    //   778: lload 6
    //   780: aload_0
    //   781: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   784: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   787: lcmp
    //   788: ifgt +408 -> 1196
    //   791: lload 6
    //   793: aload_0
    //   794: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   797: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   800: lcmp
    //   801: ifne +202 -> 1003
    //   804: iconst_1
    //   805: istore 8
    //   807: aload_0
    //   808: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   811: aload_0
    //   812: getfield 37	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRecvBuf	[B
    //   815: iconst_0
    //   816: iload_3
    //   817: aload_0
    //   818: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   821: getfield 325	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   824: iload 8
    //   826: invokevirtual 348	com/tencent/tmassistantsdk/storage/TMAssistantFile:write	([BIIJZ)Z
    //   829: ifne +348 -> 1177
    //   832: invokestatic 351	com/tencent/tmassistantsdk/storage/TMAssistantFile:getSavePathRootDir	()Ljava/lang/String;
    //   835: aload_0
    //   836: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   839: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   842: invokestatic 355	com/tencent/tmassistantsdk/downloadservice/DownloadHelper:isSpaceEnough	(Ljava/lang/String;J)Z
    //   845: ifeq +248 -> 1093
    //   848: invokestatic 359	com/tencent/tmassistantsdk/storage/TMAssistantFile:isSDCardExistAndCanWrite	()Z
    //   851: ifeq +158 -> 1009
    //   854: new 61	java/lang/StringBuilder
    //   857: dup
    //   858: ldc_w 361
    //   861: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   864: aload_0
    //   865: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   868: getfield 141	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   871: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   874: ldc_w 363
    //   877: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   880: aload_0
    //   881: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   884: getfield 325	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   887: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   890: ldc_w 365
    //   893: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   896: iload_3
    //   897: invokevirtual 70	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   900: ldc_w 367
    //   903: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   906: aload_0
    //   907: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   910: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   913: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   916: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   919: astore_1
    //   920: ldc 8
    //   922: aload_1
    //   923: invokestatic 256	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   926: new 116	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   929: dup
    //   930: sipush 703
    //   933: aload_1
    //   934: invokespecial 121	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   937: athrow
    //   938: astore_1
    //   939: lload 4
    //   941: lstore 6
    //   943: lload 6
    //   945: lstore 4
    //   947: ldc 8
    //   949: aload_1
    //   950: ldc -44
    //   952: iconst_0
    //   953: anewarray 4	java/lang/Object
    //   956: invokestatic 218	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   959: lload 6
    //   961: lstore 4
    //   963: new 116	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   966: dup
    //   967: sipush 605
    //   970: aload_1
    //   971: invokespecial 334	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/Throwable;)V
    //   974: athrow
    //   975: astore_1
    //   976: aload_0
    //   977: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   980: ifnull +15 -> 995
    //   983: aload_0
    //   984: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   987: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   990: aload_0
    //   991: aconst_null
    //   992: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   995: aload_2
    //   996: lload 4
    //   998: putfield 307	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:receiveDataSize	J
    //   1001: aload_1
    //   1002: athrow
    //   1003: iconst_0
    //   1004: istore 8
    //   1006: goto -199 -> 807
    //   1009: new 61	java/lang/StringBuilder
    //   1012: dup
    //   1013: ldc_w 369
    //   1016: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1019: aload_0
    //   1020: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1023: getfield 141	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   1026: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1029: ldc_w 363
    //   1032: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1035: aload_0
    //   1036: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1039: getfield 325	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   1042: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1045: ldc_w 365
    //   1048: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1051: iload_3
    //   1052: invokevirtual 70	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1055: ldc_w 367
    //   1058: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1061: aload_0
    //   1062: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1065: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   1068: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1071: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1074: astore_1
    //   1075: ldc 8
    //   1077: aload_1
    //   1078: invokestatic 256	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1081: new 116	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   1084: dup
    //   1085: sipush 711
    //   1088: aload_1
    //   1089: invokespecial 121	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   1092: athrow
    //   1093: new 61	java/lang/StringBuilder
    //   1096: dup
    //   1097: ldc_w 371
    //   1100: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1103: aload_0
    //   1104: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1107: getfield 141	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   1110: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1113: ldc_w 363
    //   1116: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1119: aload_0
    //   1120: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1123: getfield 325	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   1126: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1129: ldc_w 365
    //   1132: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1135: iload_3
    //   1136: invokevirtual 70	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1139: ldc_w 367
    //   1142: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1145: aload_0
    //   1146: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1149: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   1152: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1155: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1158: astore_1
    //   1159: ldc 8
    //   1161: aload_1
    //   1162: invokestatic 256	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1165: new 116	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   1168: dup
    //   1169: sipush 710
    //   1172: aload_1
    //   1173: invokespecial 121	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   1176: athrow
    //   1177: aload_0
    //   1178: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1181: iload_3
    //   1182: i2l
    //   1183: invokevirtual 374	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:updateReceivedSize	(J)V
    //   1186: lload 4
    //   1188: iload_3
    //   1189: i2l
    //   1190: ladd
    //   1191: lstore 4
    //   1193: goto -918 -> 275
    //   1196: ldc 8
    //   1198: new 61	java/lang/StringBuilder
    //   1201: dup
    //   1202: ldc_w 376
    //   1205: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1208: iload_3
    //   1209: invokevirtual 70	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1212: ldc_w 378
    //   1215: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1218: aload_0
    //   1219: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1222: getfield 325	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   1225: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1228: ldc_w 380
    //   1231: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1234: aload_0
    //   1235: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1238: invokevirtual 237	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   1241: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1244: ldc_w 382
    //   1247: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1250: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1253: invokestatic 256	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1256: new 116	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   1259: dup
    //   1260: sipush 703
    //   1263: ldc_w 384
    //   1266: invokespecial 121	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   1269: athrow
    //   1270: astore_1
    //   1271: goto -328 -> 943
    //   1274: astore_1
    //   1275: goto -299 -> 976
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1278	0	this	DownloadTask
    //   0	1278	1	paramHttpResponse	HttpResponse
    //   0	1278	2	paramDownloadChunkLogInfo	DownloadChunkLogInfo
    //   283	926	3	i	int
    //   230	962	4	l1	long
    //   226	734	6	l2	long
    //   805	200	8	bool	boolean
    //   6	227	9	localHttpEntity	HttpEntity
    //   351	280	10	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   459	660	660	java/lang/Throwable
    //   695	722	660	java/lang/Throwable
    //   722	744	660	java/lang/Throwable
    //   459	660	673	finally
    //   661	673	673	finally
    //   695	722	673	finally
    //   722	744	673	finally
    //   275	284	938	java/net/SocketException
    //   288	299	938	java/net/SocketException
    //   766	804	938	java/net/SocketException
    //   807	938	938	java/net/SocketException
    //   1009	1093	938	java/net/SocketException
    //   1093	1177	938	java/net/SocketException
    //   1177	1186	938	java/net/SocketException
    //   1196	1270	938	java/net/SocketException
    //   232	240	975	finally
    //   244	272	975	finally
    //   947	959	975	finally
    //   963	975	975	finally
    //   232	240	1270	java/net/SocketException
    //   244	272	1270	java/net/SocketException
    //   275	284	1274	finally
    //   288	299	1274	finally
    //   766	804	1274	finally
    //   807	938	1274	finally
    //   1009	1093	1274	finally
    //   1093	1177	1274	finally
    //   1177	1186	1274	finally
    //   1196	1270	1274	finally
  }
  
  private void renameApkFileName(HttpResponse paramHttpResponse)
  {
    if (paramHttpResponse == null) {}
    for (;;)
    {
      return;
      if (this.mDownloadInfo.mContentType.equals("application/vnd.android.package-archive"))
      {
        Object localObject = null;
        paramHttpResponse = paramHttpResponse.getHeaders("Content-Disposition");
        if ((paramHttpResponse != null) && (paramHttpResponse.length > 0))
        {
          paramHttpResponse = paramHttpResponse[0].getValue();
          TMLog.i("_DownloadTask", "headerFileName = " + paramHttpResponse);
          if ((!TextUtils.isEmpty(paramHttpResponse)) && (paramHttpResponse.contains("filename=\"")))
          {
            String str = paramHttpResponse.substring(paramHttpResponse.indexOf("filename=\"") + 10);
            paramHttpResponse = (HttpResponse)localObject;
            if (!TextUtils.isEmpty(str))
            {
              paramHttpResponse = str.substring(0, str.indexOf("\""));
              TMLog.i("_DownloadTask", "header file Name =" + paramHttpResponse);
            }
          }
        }
        while (!TextUtils.isEmpty(paramHttpResponse))
        {
          paramHttpResponse = DownloadHelper.correctFileName(DownloadHelper.decodeFileName(paramHttpResponse));
          this.mDownloadInfo.mFileName = paramHttpResponse;
          return;
          paramHttpResponse = DownloadHelper.genAPKFileName(this.mDownloadInfo.mRequestURL);
          continue;
          paramHttpResponse = DownloadHelper.genAPKFileName(this.mDownloadInfo.mRequestURL);
        }
      }
    }
  }
  
  private void setExtraHeaderParam(HttpGet paramHttpGet, Map<String, String> paramMap)
  {
    if ((paramHttpGet != null) && (paramMap != null) && (paramMap.size() > 0))
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        paramHttpGet.addHeader((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
  }
  
  private void setRangeHeader(HttpGet paramHttpGet, DownloadChunkLogInfo paramDownloadChunkLogInfo)
  {
    String str = DownloadHelper.getNetStatus();
    this.mDownloadInfo.mNetType = str;
    if ((!TextUtils.isEmpty(str)) && ((str.contains("wap")) || ((str.contains("net")) && (this.mDownloadInfo.mRetryCnt > 0)))) {
      try
      {
        int i = DownloadSetting.getSplitSizeInBytes(str);
        long l3 = this.mDownloadInfo.mReceivedBytes;
        if (this.mDownloadInfo.getTotalSize() > 0L)
        {
          long l2 = this.mDownloadInfo.mReceivedBytes + i - 1L;
          l1 = l2;
          if (l2 < this.mDownloadInfo.getTotalSize()) {}
        }
        for (long l1 = this.mDownloadInfo.getTotalSize() - 1L;; l1 = i - 1)
        {
          str = "bytes=" + l3 + "-" + l1;
          paramHttpGet.addHeader("range", str);
          TMLog.d("_DownloadTask", "set range header: " + str);
          paramDownloadChunkLogInfo.responseContentLength = this.mDownloadInfo.getTotalSize();
          paramDownloadChunkLogInfo.requestRanagePosition = l3;
          paramDownloadChunkLogInfo.requestRanageSize = i;
          return;
        }
        str = "bytes=" + this.mDownloadInfo.mReceivedBytes + "-";
      }
      catch (UnsupportedOperationException paramHttpGet)
      {
        w.printErrStackTrace("_DownloadTask", paramHttpGet, "", new Object[0]);
        return;
      }
    }
    paramHttpGet.addHeader("range", str);
    TMLog.d("_DownloadTask", "set range header: " + str);
    paramDownloadChunkLogInfo.responseContentLength = this.mDownloadInfo.getTotalSize();
    paramDownloadChunkLogInfo.requestRanagePosition = this.mDownloadInfo.mReceivedBytes;
    paramDownloadChunkLogInfo.requestRanageSize = 0L;
  }
  
  private boolean shouldRetryConnect()
  {
    boolean bool2 = false;
    if (this.mStopTask)
    {
      TMLog.i("_DownloadTask", "mStopTask = " + this.mStopTask);
      return false;
    }
    try
    {
      Thread.sleep(5000L);
      if (!DownloadHelper.isNetworkConncted())
      {
        int i = 0;
        for (;;)
        {
          if ((!DownloadHelper.isNetworkConncted()) && (i < 5))
          {
            i += 1;
            try
            {
              Thread.sleep(10000L);
            }
            catch (InterruptedException localInterruptedException1)
            {
              this.mDownloadInfo.mDownloadFailedErrCode = 600;
            }
          }
        }
      }
      if (!DownloadHelper.isNetworkConncted())
      {
        TMLog.i("_DownloadTask", "network unconnected");
        return false;
      }
      bool1 = bool2;
      if (this.mDownloadInfo.hasRetryChance())
      {
        DownloadInfo localDownloadInfo = this.mDownloadInfo;
        localDownloadInfo.mRetryCnt += 1;
        this.mDownloadInfo.mRedirectCnt = 0;
      }
      try
      {
        Thread.sleep(5000L);
        bool1 = true;
      }
      catch (InterruptedException localInterruptedException2)
      {
        for (;;)
        {
          this.mDownloadInfo.mDownloadFailedErrCode = 600;
          bool1 = bool2;
        }
      }
      TMLog.i("_DownloadTask", "shouldRetryConnect(" + bool1 + "), retryCnt = " + this.mDownloadInfo.mRetryCnt);
      return bool1;
    }
    catch (InterruptedException localInterruptedException3)
    {
      boolean bool1;
      for (;;) {}
    }
  }
  
  private boolean verifyTotalLen(HttpResponse paramHttpResponse, HttpEntity paramHttpEntity)
  {
    long l;
    if (paramHttpResponse.getStatusLine().getStatusCode() == 200)
    {
      l = paramHttpEntity.getContentLength();
      TMLog.i("_DownloadTask", "verifyTotalLen,totalLen = " + l + "mRequestFileSize = " + this.mDownloadInfo.mRequestFileSize);
      if ((l != -1L) && ((this.mDownloadInfo.mRequestFileSize.longValue() <= 0L) || (l == this.mDownloadInfo.mRequestFileSize.longValue()))) {}
    }
    else
    {
      do
      {
        return false;
        if (paramHttpResponse.getStatusLine().getStatusCode() != 206) {
          break;
        }
        l = ByteRange.getTotalSize(paramHttpResponse.getFirstHeader("content-range").getValue());
        TMLog.i("_DownloadTask", "verifyTotalLen,totalLen = " + l + "mRequestFileSize = " + this.mDownloadInfo.mRequestFileSize);
      } while ((l == -1L) || ((this.mDownloadInfo.mRequestFileSize.longValue() > 0L) && (l != this.mDownloadInfo.mRequestFileSize.longValue())));
    }
    return true;
  }
  
  public void cancel()
  {
    TMLog.i("_DownloadTask", "DownloadTask::cancel url: " + this.mDownloadInfo.mURL);
    this.mStopTask = true;
    if ((this.mHttpGet != null) && (!this.mHttpGet.isAborted())) {
      this.mHttpGet.abort();
    }
  }
  
  /* Error */
  public void exec(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   4: iconst_1
    //   5: putfield 563	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mTaskIsRunning	Z
    //   8: aload_0
    //   9: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   12: iconst_2
    //   13: iconst_0
    //   14: invokevirtual 567	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:updateStatus	(IZ)V
    //   17: iconst_0
    //   18: istore_3
    //   19: iconst_1
    //   20: istore_2
    //   21: iload_2
    //   22: ifeq +1909 -> 1931
    //   25: invokestatic 573	com/tencent/tmassistantsdk/logreport/DownloadReportManager:getInstance	()Lcom/tencent/tmassistantsdk/logreport/DownloadReportManager;
    //   28: iconst_0
    //   29: invokevirtual 577	com/tencent/tmassistantsdk/logreport/DownloadReportManager:createNewChunkLogInfo	(B)Lcom/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo;
    //   32: astore 5
    //   34: aload 5
    //   36: aload_0
    //   37: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   40: getfield 580	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mUUID	Ljava/lang/String;
    //   43: putfield 583	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:UUID	Ljava/lang/String;
    //   46: aload 5
    //   48: aload_0
    //   49: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   52: getfield 114	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mRetryCnt	I
    //   55: i2b
    //   56: putfield 587	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:currentRetryCnt	B
    //   59: aload 5
    //   61: aload_0
    //   62: invokevirtual 590	com/tencent/tmassistantsdk/downloadservice/DownloadTask:getDownloadURI	()Ljava/lang/String;
    //   65: putfield 593	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:requestUrl	Ljava/lang/String;
    //   68: aload_0
    //   69: getfield 29	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   72: ifne +1859 -> 1931
    //   75: iload_3
    //   76: ifeq +354 -> 430
    //   79: aload_0
    //   80: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   83: getfield 596	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mSecondaryUrl	Ljava/lang/String;
    //   86: astore_1
    //   87: ldc 8
    //   89: new 61	java/lang/StringBuilder
    //   92: dup
    //   93: ldc_w 598
    //   96: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   99: iload_3
    //   100: invokevirtual 500	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   103: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   109: ldc 8
    //   111: new 61	java/lang/StringBuilder
    //   114: dup
    //   115: ldc_w 600
    //   118: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   121: aload_1
    //   122: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   131: aload_0
    //   132: invokestatic 606	com/tencent/tmassistantsdk/downloadservice/HttpClientUtil:createHttpClient	()Lorg/apache/http/client/HttpClient;
    //   135: putfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   138: aload_0
    //   139: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   142: invokestatic 610	com/tencent/tmassistantsdk/downloadservice/HttpClientUtil:setProxy	(Lorg/apache/http/client/HttpClient;)V
    //   145: aload_0
    //   146: new 454	org/apache/http/client/methods/HttpGet
    //   149: dup
    //   150: invokespecial 611	org/apache/http/client/methods/HttpGet:<init>	()V
    //   153: putfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   156: new 613	java/net/URI
    //   159: dup
    //   160: aload_1
    //   161: invokespecial 614	java/net/URI:<init>	(Ljava/lang/String;)V
    //   164: astore_1
    //   165: aload_0
    //   166: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   169: aload_1
    //   170: invokevirtual 618	org/apache/http/client/methods/HttpGet:setURI	(Ljava/net/URI;)V
    //   173: aload_0
    //   174: aload_0
    //   175: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   178: aload_0
    //   179: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   182: invokevirtual 622	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getHeaderParams	()Ljava/util/HashMap;
    //   185: invokespecial 624	com/tencent/tmassistantsdk/downloadservice/DownloadTask:setExtraHeaderParam	(Lorg/apache/http/client/methods/HttpGet;Ljava/util/Map;)V
    //   188: aload_0
    //   189: aload_0
    //   190: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   193: aload 5
    //   195: invokespecial 626	com/tencent/tmassistantsdk/downloadservice/DownloadTask:setRangeHeader	(Lorg/apache/http/client/methods/HttpGet;Lcom/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo;)V
    //   198: aload_1
    //   199: invokevirtual 629	java/net/URI:getScheme	()Ljava/lang/String;
    //   202: ldc_w 631
    //   205: invokevirtual 138	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   208: ifeq +48 -> 256
    //   211: invokestatic 637	org/apache/http/conn/ssl/SSLSocketFactory:getSocketFactory	()Lorg/apache/http/conn/ssl/SSLSocketFactory;
    //   214: astore_1
    //   215: aload_1
    //   216: getstatic 641	org/apache/http/conn/ssl/SSLSocketFactory:BROWSER_COMPATIBLE_HOSTNAME_VERIFIER	Lorg/apache/http/conn/ssl/X509HostnameVerifier;
    //   219: invokevirtual 645	org/apache/http/conn/ssl/SSLSocketFactory:setHostnameVerifier	(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
    //   222: new 647	org/apache/http/conn/scheme/Scheme
    //   225: dup
    //   226: ldc_w 631
    //   229: aload_1
    //   230: sipush 443
    //   233: invokespecial 650	org/apache/http/conn/scheme/Scheme:<init>	(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
    //   236: astore_1
    //   237: aload_0
    //   238: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   241: invokeinterface 656 1 0
    //   246: invokeinterface 662 1 0
    //   251: aload_1
    //   252: invokevirtual 668	org/apache/http/conn/scheme/SchemeRegistry:register	(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
    //   255: pop
    //   256: ldc 8
    //   258: new 61	java/lang/StringBuilder
    //   261: dup
    //   262: ldc_w 670
    //   265: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   268: invokestatic 81	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   271: invokevirtual 85	java/lang/Thread:getName	()Ljava/lang/String;
    //   274: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   280: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   283: aload_0
    //   284: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   287: aload_0
    //   288: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   291: invokeinterface 674 2 0
    //   296: astore_1
    //   297: aload_1
    //   298: ifnonnull +143 -> 441
    //   301: new 116	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   304: dup
    //   305: sipush 701
    //   308: new 61	java/lang/StringBuilder
    //   311: dup
    //   312: ldc_w 676
    //   315: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   318: invokestatic 81	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   321: invokevirtual 85	java/lang/Thread:getName	()Ljava/lang/String;
    //   324: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   330: invokespecial 121	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   333: athrow
    //   334: astore_1
    //   335: aload_0
    //   336: getfield 29	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   339: istore_2
    //   340: iload_2
    //   341: ifeq +211 -> 552
    //   344: iconst_0
    //   345: istore 4
    //   347: aload_0
    //   348: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   351: ifnull +25 -> 376
    //   354: aload_0
    //   355: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   358: invokevirtual 546	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   361: ifne +10 -> 371
    //   364: aload_0
    //   365: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   368: invokevirtual 549	org/apache/http/client/methods/HttpGet:abort	()V
    //   371: aload_0
    //   372: aconst_null
    //   373: putfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   376: aload_0
    //   377: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   380: ifnull +22 -> 402
    //   383: aload_0
    //   384: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   387: invokeinterface 656 1 0
    //   392: invokeinterface 679 1 0
    //   397: aload_0
    //   398: aconst_null
    //   399: putfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   402: iload 4
    //   404: istore_2
    //   405: aload_0
    //   406: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   409: ifnull -388 -> 21
    //   412: aload_0
    //   413: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   416: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   419: aload_0
    //   420: aconst_null
    //   421: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   424: iload 4
    //   426: istore_2
    //   427: goto -406 -> 21
    //   430: aload_0
    //   431: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   434: getfield 199	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mRequestURL	Ljava/lang/String;
    //   437: astore_1
    //   438: goto -351 -> 87
    //   441: aload_0
    //   442: aload_1
    //   443: aload 5
    //   445: invokespecial 681	com/tencent/tmassistantsdk/downloadservice/DownloadTask:handleResponseCode	(Lorg/apache/http/HttpResponse;Lcom/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo;)V
    //   448: aload_0
    //   449: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   452: invokevirtual 684	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:hasReceivedAllDataBytes	()Z
    //   455: istore_2
    //   456: iload_2
    //   457: ifne +89 -> 546
    //   460: iconst_1
    //   461: istore 4
    //   463: aload_0
    //   464: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   467: ifnull +25 -> 492
    //   470: aload_0
    //   471: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   474: invokevirtual 546	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   477: ifne +10 -> 487
    //   480: aload_0
    //   481: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   484: invokevirtual 549	org/apache/http/client/methods/HttpGet:abort	()V
    //   487: aload_0
    //   488: aconst_null
    //   489: putfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   492: aload_0
    //   493: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   496: ifnull +22 -> 518
    //   499: aload_0
    //   500: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   503: invokeinterface 656 1 0
    //   508: invokeinterface 679 1 0
    //   513: aload_0
    //   514: aconst_null
    //   515: putfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   518: iload 4
    //   520: istore_2
    //   521: aload_0
    //   522: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   525: ifnull -504 -> 21
    //   528: aload_0
    //   529: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   532: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   535: aload_0
    //   536: aconst_null
    //   537: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   540: iload 4
    //   542: istore_2
    //   543: goto -522 -> 21
    //   546: iconst_0
    //   547: istore 4
    //   549: goto -86 -> 463
    //   552: ldc 8
    //   554: new 61	java/lang/StringBuilder
    //   557: dup
    //   558: ldc_w 686
    //   561: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   564: invokestatic 81	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   567: invokevirtual 85	java/lang/Thread:getName	()Ljava/lang/String;
    //   570: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   573: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   576: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   579: ldc 8
    //   581: aload_1
    //   582: ldc -44
    //   584: iconst_0
    //   585: anewarray 4	java/lang/Object
    //   588: invokestatic 218	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   591: aload_0
    //   592: invokespecial 688	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   595: istore_2
    //   596: iload_2
    //   597: istore 4
    //   599: iload_2
    //   600: ifne -253 -> 347
    //   603: aload_0
    //   604: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   607: sipush 601
    //   610: putfield 513	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   613: iload_2
    //   614: istore 4
    //   616: goto -269 -> 347
    //   619: astore_1
    //   620: aload_0
    //   621: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   624: ifnull +25 -> 649
    //   627: aload_0
    //   628: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   631: invokevirtual 546	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   634: ifne +10 -> 644
    //   637: aload_0
    //   638: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   641: invokevirtual 549	org/apache/http/client/methods/HttpGet:abort	()V
    //   644: aload_0
    //   645: aconst_null
    //   646: putfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   649: aload_0
    //   650: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   653: ifnull +22 -> 675
    //   656: aload_0
    //   657: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   660: invokeinterface 656 1 0
    //   665: invokeinterface 679 1 0
    //   670: aload_0
    //   671: aconst_null
    //   672: putfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   675: aload_0
    //   676: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   679: ifnull +15 -> 694
    //   682: aload_0
    //   683: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   686: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   689: aload_0
    //   690: aconst_null
    //   691: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   694: aload_1
    //   695: athrow
    //   696: astore_1
    //   697: aload_0
    //   698: getfield 29	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   701: istore_2
    //   702: iload_2
    //   703: ifeq +89 -> 792
    //   706: iconst_0
    //   707: istore 4
    //   709: aload_0
    //   710: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   713: ifnull +25 -> 738
    //   716: aload_0
    //   717: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   720: invokevirtual 546	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   723: ifne +10 -> 733
    //   726: aload_0
    //   727: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   730: invokevirtual 549	org/apache/http/client/methods/HttpGet:abort	()V
    //   733: aload_0
    //   734: aconst_null
    //   735: putfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   738: aload_0
    //   739: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   742: ifnull +22 -> 764
    //   745: aload_0
    //   746: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   749: invokeinterface 656 1 0
    //   754: invokeinterface 679 1 0
    //   759: aload_0
    //   760: aconst_null
    //   761: putfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   764: iload 4
    //   766: istore_2
    //   767: aload_0
    //   768: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   771: ifnull -750 -> 21
    //   774: aload_0
    //   775: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   778: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   781: aload_0
    //   782: aconst_null
    //   783: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   786: iload 4
    //   788: istore_2
    //   789: goto -768 -> 21
    //   792: ldc 8
    //   794: new 61	java/lang/StringBuilder
    //   797: dup
    //   798: ldc_w 690
    //   801: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   804: invokestatic 81	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   807: invokevirtual 85	java/lang/Thread:getName	()Ljava/lang/String;
    //   810: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   813: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   816: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   819: ldc 8
    //   821: aload_1
    //   822: ldc -44
    //   824: iconst_0
    //   825: anewarray 4	java/lang/Object
    //   828: invokestatic 218	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   831: aload_0
    //   832: invokespecial 688	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   835: istore_2
    //   836: iload_2
    //   837: istore 4
    //   839: iload_2
    //   840: ifne -131 -> 709
    //   843: aload_0
    //   844: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   847: sipush 602
    //   850: putfield 513	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   853: iload_2
    //   854: istore 4
    //   856: goto -147 -> 709
    //   859: astore_1
    //   860: aload_0
    //   861: getfield 29	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   864: istore_2
    //   865: iload_2
    //   866: ifeq +89 -> 955
    //   869: iconst_0
    //   870: istore 4
    //   872: aload_0
    //   873: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   876: ifnull +25 -> 901
    //   879: aload_0
    //   880: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   883: invokevirtual 546	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   886: ifne +10 -> 896
    //   889: aload_0
    //   890: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   893: invokevirtual 549	org/apache/http/client/methods/HttpGet:abort	()V
    //   896: aload_0
    //   897: aconst_null
    //   898: putfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   901: aload_0
    //   902: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   905: ifnull +22 -> 927
    //   908: aload_0
    //   909: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   912: invokeinterface 656 1 0
    //   917: invokeinterface 679 1 0
    //   922: aload_0
    //   923: aconst_null
    //   924: putfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   927: iload 4
    //   929: istore_2
    //   930: aload_0
    //   931: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   934: ifnull -913 -> 21
    //   937: aload_0
    //   938: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   941: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   944: aload_0
    //   945: aconst_null
    //   946: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   949: iload 4
    //   951: istore_2
    //   952: goto -931 -> 21
    //   955: ldc 8
    //   957: new 61	java/lang/StringBuilder
    //   960: dup
    //   961: ldc_w 692
    //   964: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   967: invokestatic 81	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   970: invokevirtual 85	java/lang/Thread:getName	()Ljava/lang/String;
    //   973: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   976: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   979: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   982: ldc 8
    //   984: aload_1
    //   985: ldc -44
    //   987: iconst_0
    //   988: anewarray 4	java/lang/Object
    //   991: invokestatic 218	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   994: aload_0
    //   995: invokespecial 688	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   998: istore_2
    //   999: iload_2
    //   1000: istore 4
    //   1002: iload_2
    //   1003: ifne -131 -> 872
    //   1006: aload_0
    //   1007: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1010: sipush 603
    //   1013: putfield 513	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1016: iload_2
    //   1017: istore 4
    //   1019: goto -147 -> 872
    //   1022: astore_1
    //   1023: aload_0
    //   1024: getfield 29	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1027: istore_2
    //   1028: iload_2
    //   1029: ifeq +82 -> 1111
    //   1032: aload_0
    //   1033: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1036: ifnull +25 -> 1061
    //   1039: aload_0
    //   1040: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1043: invokevirtual 546	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1046: ifne +10 -> 1056
    //   1049: aload_0
    //   1050: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1053: invokevirtual 549	org/apache/http/client/methods/HttpGet:abort	()V
    //   1056: aload_0
    //   1057: aconst_null
    //   1058: putfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1061: aload_0
    //   1062: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1065: ifnull +22 -> 1087
    //   1068: aload_0
    //   1069: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1072: invokeinterface 656 1 0
    //   1077: invokeinterface 679 1 0
    //   1082: aload_0
    //   1083: aconst_null
    //   1084: putfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1087: aload_0
    //   1088: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1091: ifnull +1007 -> 2098
    //   1094: aload_0
    //   1095: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1098: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1101: aload_0
    //   1102: aconst_null
    //   1103: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1106: iconst_0
    //   1107: istore_2
    //   1108: goto -1087 -> 21
    //   1111: ldc 8
    //   1113: new 61	java/lang/StringBuilder
    //   1116: dup
    //   1117: ldc_w 694
    //   1120: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1123: invokestatic 81	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1126: invokevirtual 85	java/lang/Thread:getName	()Ljava/lang/String;
    //   1129: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1132: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1135: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1138: ldc 8
    //   1140: aload_1
    //   1141: ldc -44
    //   1143: iconst_0
    //   1144: anewarray 4	java/lang/Object
    //   1147: invokestatic 218	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1150: aload_0
    //   1151: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1154: sipush 600
    //   1157: putfield 513	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1160: goto -128 -> 1032
    //   1163: astore_1
    //   1164: aload_0
    //   1165: getfield 29	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1168: istore_2
    //   1169: iload_2
    //   1170: ifeq +82 -> 1252
    //   1173: aload_0
    //   1174: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1177: ifnull +25 -> 1202
    //   1180: aload_0
    //   1181: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1184: invokevirtual 546	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1187: ifne +10 -> 1197
    //   1190: aload_0
    //   1191: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1194: invokevirtual 549	org/apache/http/client/methods/HttpGet:abort	()V
    //   1197: aload_0
    //   1198: aconst_null
    //   1199: putfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1202: aload_0
    //   1203: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1206: ifnull +22 -> 1228
    //   1209: aload_0
    //   1210: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1213: invokeinterface 656 1 0
    //   1218: invokeinterface 679 1 0
    //   1223: aload_0
    //   1224: aconst_null
    //   1225: putfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1228: aload_0
    //   1229: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1232: ifnull +866 -> 2098
    //   1235: aload_0
    //   1236: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1239: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1242: aload_0
    //   1243: aconst_null
    //   1244: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1247: iconst_0
    //   1248: istore_2
    //   1249: goto -1228 -> 21
    //   1252: ldc 8
    //   1254: new 61	java/lang/StringBuilder
    //   1257: dup
    //   1258: ldc_w 696
    //   1261: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1264: invokestatic 81	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1267: invokevirtual 85	java/lang/Thread:getName	()Ljava/lang/String;
    //   1270: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1273: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1276: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1279: ldc 8
    //   1281: aload_1
    //   1282: ldc -44
    //   1284: iconst_0
    //   1285: anewarray 4	java/lang/Object
    //   1288: invokestatic 218	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1291: aload_0
    //   1292: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1295: sipush 607
    //   1298: putfield 513	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1301: goto -128 -> 1173
    //   1304: astore_1
    //   1305: aload_0
    //   1306: getfield 29	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1309: istore_2
    //   1310: iload_2
    //   1311: ifeq +89 -> 1400
    //   1314: iconst_0
    //   1315: istore 4
    //   1317: aload_0
    //   1318: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1321: ifnull +25 -> 1346
    //   1324: aload_0
    //   1325: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1328: invokevirtual 546	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1331: ifne +10 -> 1341
    //   1334: aload_0
    //   1335: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1338: invokevirtual 549	org/apache/http/client/methods/HttpGet:abort	()V
    //   1341: aload_0
    //   1342: aconst_null
    //   1343: putfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1346: aload_0
    //   1347: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1350: ifnull +22 -> 1372
    //   1353: aload_0
    //   1354: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1357: invokeinterface 656 1 0
    //   1362: invokeinterface 679 1 0
    //   1367: aload_0
    //   1368: aconst_null
    //   1369: putfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1372: iload 4
    //   1374: istore_2
    //   1375: aload_0
    //   1376: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1379: ifnull -1358 -> 21
    //   1382: aload_0
    //   1383: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1386: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1389: aload_0
    //   1390: aconst_null
    //   1391: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1394: iload 4
    //   1396: istore_2
    //   1397: goto -1376 -> 21
    //   1400: ldc 8
    //   1402: new 61	java/lang/StringBuilder
    //   1405: dup
    //   1406: ldc_w 698
    //   1409: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1412: invokestatic 81	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1415: invokevirtual 85	java/lang/Thread:getName	()Ljava/lang/String;
    //   1418: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1421: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1424: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1427: ldc 8
    //   1429: aload_1
    //   1430: ldc -44
    //   1432: iconst_0
    //   1433: anewarray 4	java/lang/Object
    //   1436: invokestatic 218	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1439: aload_0
    //   1440: invokespecial 688	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   1443: istore_2
    //   1444: iload_2
    //   1445: istore 4
    //   1447: iload_2
    //   1448: ifne -131 -> 1317
    //   1451: aload_0
    //   1452: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1455: sipush 606
    //   1458: putfield 513	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1461: iload_2
    //   1462: istore 4
    //   1464: goto -147 -> 1317
    //   1467: astore_1
    //   1468: aload_0
    //   1469: getfield 29	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1472: istore_2
    //   1473: iload_2
    //   1474: ifeq +92 -> 1566
    //   1477: iload_3
    //   1478: istore_2
    //   1479: iconst_0
    //   1480: istore_3
    //   1481: aload_0
    //   1482: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1485: ifnull +25 -> 1510
    //   1488: aload_0
    //   1489: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1492: invokevirtual 546	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1495: ifne +10 -> 1505
    //   1498: aload_0
    //   1499: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1502: invokevirtual 549	org/apache/http/client/methods/HttpGet:abort	()V
    //   1505: aload_0
    //   1506: aconst_null
    //   1507: putfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1510: aload_0
    //   1511: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1514: ifnull +22 -> 1536
    //   1517: aload_0
    //   1518: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1521: invokeinterface 656 1 0
    //   1526: invokeinterface 679 1 0
    //   1531: aload_0
    //   1532: aconst_null
    //   1533: putfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1536: aload_0
    //   1537: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1540: ifnull +547 -> 2087
    //   1543: aload_0
    //   1544: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1547: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1550: aload_0
    //   1551: aconst_null
    //   1552: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1555: iload_2
    //   1556: istore 4
    //   1558: iload_3
    //   1559: istore_2
    //   1560: iload 4
    //   1562: istore_3
    //   1563: goto -1542 -> 21
    //   1566: ldc 8
    //   1568: new 61	java/lang/StringBuilder
    //   1571: dup
    //   1572: ldc_w 700
    //   1575: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1578: aload_1
    //   1579: getfield 703	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1582: invokevirtual 70	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1585: ldc 72
    //   1587: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1590: invokestatic 81	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1593: invokevirtual 85	java/lang/Thread:getName	()Ljava/lang/String;
    //   1596: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1599: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1602: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1605: ldc 8
    //   1607: aload_1
    //   1608: ldc -44
    //   1610: iconst_0
    //   1611: anewarray 4	java/lang/Object
    //   1614: invokestatic 218	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1617: aload_0
    //   1618: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1621: aload_1
    //   1622: getfield 703	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1625: putfield 513	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1628: aload_1
    //   1629: getfield 703	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1632: sipush 703
    //   1635: if_icmpeq +468 -> 2103
    //   1638: aload_1
    //   1639: getfield 703	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1642: sipush 710
    //   1645: if_icmpeq +458 -> 2103
    //   1648: aload_1
    //   1649: getfield 703	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1652: sipush 711
    //   1655: if_icmpne +6 -> 1661
    //   1658: goto +445 -> 2103
    //   1661: sipush 704
    //   1664: aload_1
    //   1665: getfield 703	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1668: if_icmpne +42 -> 1710
    //   1671: aload_0
    //   1672: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1675: lconst_0
    //   1676: invokevirtual 246	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:setTotalSize	(J)V
    //   1679: new 283	com/tencent/tmassistantsdk/storage/TMAssistantFile
    //   1682: dup
    //   1683: aload_0
    //   1684: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1687: getfield 286	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mTempFileName	Ljava/lang/String;
    //   1690: aload_0
    //   1691: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1694: getfield 141	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   1697: invokespecial 288	com/tencent/tmassistantsdk/storage/TMAssistantFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1700: invokevirtual 706	com/tencent/tmassistantsdk/storage/TMAssistantFile:deleteTempFile	()V
    //   1703: iload_3
    //   1704: istore_2
    //   1705: iconst_0
    //   1706: istore_3
    //   1707: goto -226 -> 1481
    //   1710: sipush 705
    //   1713: aload_1
    //   1714: getfield 703	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1717: if_icmpne +37 -> 1754
    //   1720: iload_3
    //   1721: ifne +389 -> 2110
    //   1724: aload_0
    //   1725: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1728: invokevirtual 518	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:hasRetryChance	()Z
    //   1731: ifeq +379 -> 2110
    //   1734: aload_0
    //   1735: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1738: getfield 596	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mSecondaryUrl	Ljava/lang/String;
    //   1741: invokestatic 161	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1744: ifne +366 -> 2110
    //   1747: iconst_1
    //   1748: istore_2
    //   1749: iconst_1
    //   1750: istore_3
    //   1751: goto -270 -> 1481
    //   1754: aload_0
    //   1755: invokespecial 688	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   1758: istore 4
    //   1760: iload_3
    //   1761: istore_2
    //   1762: iload 4
    //   1764: istore_3
    //   1765: goto -284 -> 1481
    //   1768: astore_1
    //   1769: aload_0
    //   1770: getfield 29	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1773: istore_2
    //   1774: iload_2
    //   1775: ifeq +89 -> 1864
    //   1778: iconst_0
    //   1779: istore 4
    //   1781: aload_0
    //   1782: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1785: ifnull +25 -> 1810
    //   1788: aload_0
    //   1789: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1792: invokevirtual 546	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1795: ifne +10 -> 1805
    //   1798: aload_0
    //   1799: getfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1802: invokevirtual 549	org/apache/http/client/methods/HttpGet:abort	()V
    //   1805: aload_0
    //   1806: aconst_null
    //   1807: putfield 33	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1810: aload_0
    //   1811: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1814: ifnull +22 -> 1836
    //   1817: aload_0
    //   1818: getfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1821: invokeinterface 656 1 0
    //   1826: invokeinterface 679 1 0
    //   1831: aload_0
    //   1832: aconst_null
    //   1833: putfield 31	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1836: iload 4
    //   1838: istore_2
    //   1839: aload_0
    //   1840: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1843: ifnull -1822 -> 21
    //   1846: aload_0
    //   1847: getfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1850: invokevirtual 304	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1853: aload_0
    //   1854: aconst_null
    //   1855: putfield 281	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1858: iload 4
    //   1860: istore_2
    //   1861: goto -1840 -> 21
    //   1864: ldc 8
    //   1866: new 61	java/lang/StringBuilder
    //   1869: dup
    //   1870: ldc_w 708
    //   1873: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1876: invokestatic 81	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1879: invokevirtual 85	java/lang/Thread:getName	()Ljava/lang/String;
    //   1882: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1885: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1888: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1891: ldc 8
    //   1893: aload_1
    //   1894: ldc -44
    //   1896: iconst_0
    //   1897: anewarray 4	java/lang/Object
    //   1900: invokestatic 218	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1903: aload_0
    //   1904: invokespecial 688	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   1907: istore_2
    //   1908: iload_2
    //   1909: istore 4
    //   1911: iload_2
    //   1912: ifne -131 -> 1781
    //   1915: aload_0
    //   1916: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1919: sipush 604
    //   1922: putfield 513	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1925: iload_2
    //   1926: istore 4
    //   1928: goto -147 -> 1781
    //   1931: ldc 8
    //   1933: new 61	java/lang/StringBuilder
    //   1936: dup
    //   1937: ldc_w 497
    //   1940: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1943: aload_0
    //   1944: getfield 29	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1947: invokevirtual 500	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   1950: ldc 72
    //   1952: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1955: invokestatic 81	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1958: invokevirtual 85	java/lang/Thread:getName	()Ljava/lang/String;
    //   1961: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1964: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1967: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1970: aload_0
    //   1971: getfield 29	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1974: ifne +102 -> 2076
    //   1977: ldc 8
    //   1979: new 61	java/lang/StringBuilder
    //   1982: dup
    //   1983: ldc_w 710
    //   1986: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1989: invokestatic 81	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1992: invokevirtual 85	java/lang/Thread:getName	()Ljava/lang/String;
    //   1995: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1998: ldc_w 712
    //   2001: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2004: aload_0
    //   2005: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2008: getfield 715	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mStatus	I
    //   2011: invokevirtual 70	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2014: ldc_w 717
    //   2017: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2020: aload_0
    //   2021: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2024: getfield 513	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   2027: invokevirtual 70	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2030: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2033: invokestatic 94	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2036: aload_0
    //   2037: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2040: invokevirtual 684	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:hasReceivedAllDataBytes	()Z
    //   2043: ifeq +21 -> 2064
    //   2046: aload_0
    //   2047: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2050: iconst_4
    //   2051: iload_3
    //   2052: invokevirtual 567	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:updateStatus	(IZ)V
    //   2055: aload_0
    //   2056: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2059: iconst_0
    //   2060: putfield 563	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mTaskIsRunning	Z
    //   2063: return
    //   2064: aload_0
    //   2065: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2068: iconst_5
    //   2069: iload_3
    //   2070: invokevirtual 567	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:updateStatus	(IZ)V
    //   2073: goto -18 -> 2055
    //   2076: aload_0
    //   2077: getfield 35	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2080: iconst_0
    //   2081: putfield 513	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   2084: goto -29 -> 2055
    //   2087: iload_2
    //   2088: istore 4
    //   2090: iload_3
    //   2091: istore_2
    //   2092: iload 4
    //   2094: istore_3
    //   2095: goto -2074 -> 21
    //   2098: iconst_0
    //   2099: istore_2
    //   2100: goto -2079 -> 21
    //   2103: iload_3
    //   2104: istore_2
    //   2105: iconst_0
    //   2106: istore_3
    //   2107: goto -626 -> 1481
    //   2110: iload_3
    //   2111: istore_2
    //   2112: iconst_0
    //   2113: istore_3
    //   2114: goto -633 -> 1481
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2117	0	this	DownloadTask
    //   0	2117	1	paramString	String
    //   20	2092	2	bool1	boolean
    //   18	2096	3	bool2	boolean
    //   345	1748	4	bool3	boolean
    //   32	412	5	localDownloadChunkLogInfo	DownloadChunkLogInfo
    // Exception table:
    //   from	to	target	type
    //   79	87	334	org/apache/http/conn/ConnectTimeoutException
    //   87	256	334	org/apache/http/conn/ConnectTimeoutException
    //   256	297	334	org/apache/http/conn/ConnectTimeoutException
    //   301	334	334	org/apache/http/conn/ConnectTimeoutException
    //   430	438	334	org/apache/http/conn/ConnectTimeoutException
    //   441	456	334	org/apache/http/conn/ConnectTimeoutException
    //   79	87	619	finally
    //   87	256	619	finally
    //   256	297	619	finally
    //   301	334	619	finally
    //   335	340	619	finally
    //   430	438	619	finally
    //   441	456	619	finally
    //   552	596	619	finally
    //   603	613	619	finally
    //   697	702	619	finally
    //   792	836	619	finally
    //   843	853	619	finally
    //   860	865	619	finally
    //   955	999	619	finally
    //   1006	1016	619	finally
    //   1023	1028	619	finally
    //   1111	1160	619	finally
    //   1164	1169	619	finally
    //   1252	1301	619	finally
    //   1305	1310	619	finally
    //   1400	1444	619	finally
    //   1451	1461	619	finally
    //   1468	1473	619	finally
    //   1566	1658	619	finally
    //   1661	1703	619	finally
    //   1710	1720	619	finally
    //   1724	1747	619	finally
    //   1754	1760	619	finally
    //   1769	1774	619	finally
    //   1864	1908	619	finally
    //   1915	1925	619	finally
    //   79	87	696	java/net/SocketTimeoutException
    //   87	256	696	java/net/SocketTimeoutException
    //   256	297	696	java/net/SocketTimeoutException
    //   301	334	696	java/net/SocketTimeoutException
    //   430	438	696	java/net/SocketTimeoutException
    //   441	456	696	java/net/SocketTimeoutException
    //   79	87	859	java/net/UnknownHostException
    //   87	256	859	java/net/UnknownHostException
    //   256	297	859	java/net/UnknownHostException
    //   301	334	859	java/net/UnknownHostException
    //   430	438	859	java/net/UnknownHostException
    //   441	456	859	java/net/UnknownHostException
    //   79	87	1022	java/lang/InterruptedException
    //   87	256	1022	java/lang/InterruptedException
    //   256	297	1022	java/lang/InterruptedException
    //   301	334	1022	java/lang/InterruptedException
    //   430	438	1022	java/lang/InterruptedException
    //   441	456	1022	java/lang/InterruptedException
    //   79	87	1163	javax/net/ssl/SSLHandshakeException
    //   87	256	1163	javax/net/ssl/SSLHandshakeException
    //   256	297	1163	javax/net/ssl/SSLHandshakeException
    //   301	334	1163	javax/net/ssl/SSLHandshakeException
    //   430	438	1163	javax/net/ssl/SSLHandshakeException
    //   441	456	1163	javax/net/ssl/SSLHandshakeException
    //   79	87	1304	java/io/IOException
    //   87	256	1304	java/io/IOException
    //   256	297	1304	java/io/IOException
    //   301	334	1304	java/io/IOException
    //   430	438	1304	java/io/IOException
    //   441	456	1304	java/io/IOException
    //   79	87	1467	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   87	256	1467	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   256	297	1467	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   301	334	1467	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   430	438	1467	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   441	456	1467	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   79	87	1768	java/lang/Throwable
    //   87	256	1768	java/lang/Throwable
    //   256	297	1768	java/lang/Throwable
    //   301	334	1768	java/lang/Throwable
    //   430	438	1768	java/lang/Throwable
    //   441	456	1768	java/lang/Throwable
  }
  
  public String getDownloadURI()
  {
    return this.mDownloadInfo.mURL;
  }
  
  public int getPriority()
  {
    return this.mDownloadInfo.mPriority;
  }
  
  public int getTaskId()
  {
    return this.mTaskId;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\downloadservice\DownloadTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */