package com.tencent.liteav.network;

import android.content.Context;
import android.os.Handler;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.Vector;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class TXRTMPAccUrlFetcher
{
  private static final String CGI_GET_RTMP_ACC_STREAM_URL = "https://livepull.myqcloud.com/getpulladdr";
  private static final String CGI_GET_RTMP_ACC_STREAM_URL_TEST = "https://livepulltest.myqcloud.com/getpulladdr";
  public static final int RTMP_CHANNEL_TYPE_AUTO = 0;
  public static final int RTMP_CHANNEL_TYPE_PRIVATE = 2;
  public static final int RTMP_CHANNEL_TYPE_STANDARD = 1;
  public static final String TAG = "TXRTMPAccUrlFetcher";
  public String mBizid = "";
  public int mErrorCode = 0;
  public String mErrorInfo = "";
  public Handler mHandler;
  public String mStreamId = "";
  
  public TXRTMPAccUrlFetcher(Context paramContext)
  {
    if (paramContext != null) {
      this.mHandler = new Handler(paramContext.getMainLooper());
    }
  }
  
  private void getAccerateStreamPlayUrl(final String paramString1, final String paramString2, final String paramString3, final String paramString4, final int paramInt, final OnGetAccerateStreamPlayUrl paramOnGetAccerateStreamPlayUrl)
  {
    new Thread("getRTMPAccUrl")
    {
      public void run()
      {
        final int j = -1;
        Object localObject1 = "";
        int m = 5;
        Object localObject3;
        int k;
        Object localObject4;
        final Object localObject5;
        int i;
        if (m > 0)
        {
          localObject3 = localObject1;
          k = j;
          label726:
          do
          {
            try
            {
              localObject4 = new JSONObject();
              localObject3 = localObject1;
              k = j;
              ((JSONObject)localObject4).put("bizid", Integer.valueOf(paramString2).intValue());
              localObject3 = localObject1;
              k = j;
              ((JSONObject)localObject4).put("stream_id", paramString1);
              localObject3 = localObject1;
              k = j;
              ((JSONObject)localObject4).put("txSecret", paramString3);
              localObject3 = localObject1;
              k = j;
              ((JSONObject)localObject4).put("txTime", paramString4);
              localObject3 = localObject1;
              k = j;
              ((JSONObject)localObject4).put("type", 1);
              localObject3 = localObject1;
              k = j;
              localObject4 = ((JSONObject)localObject4).toString();
              localObject3 = localObject1;
              k = j;
              localObject5 = (HttpsURLConnection)new URL("https://livepull.myqcloud.com/getpulladdr").openConnection();
              localObject3 = localObject1;
              k = j;
              ((HttpsURLConnection)localObject5).setDoOutput(true);
              localObject3 = localObject1;
              k = j;
              ((HttpsURLConnection)localObject5).setDoInput(true);
              localObject3 = localObject1;
              k = j;
              ((HttpsURLConnection)localObject5).setUseCaches(false);
              localObject3 = localObject1;
              k = j;
              ((HttpsURLConnection)localObject5).setConnectTimeout(5000);
              localObject3 = localObject1;
              k = j;
              ((HttpsURLConnection)localObject5).setReadTimeout(5000);
              localObject3 = localObject1;
              k = j;
              ((HttpsURLConnection)localObject5).setRequestMethod("POST");
              localObject3 = localObject1;
              k = j;
              ((HttpsURLConnection)localObject5).setRequestProperty("Charsert", "UTF-8");
              localObject3 = localObject1;
              k = j;
              ((HttpsURLConnection)localObject5).setRequestProperty("Content-Type", "text/plain;");
              localObject3 = localObject1;
              k = j;
              ((HttpsURLConnection)localObject5).setRequestProperty("Content-Length", String.valueOf(((String)localObject4).length()));
              localObject3 = localObject1;
              k = j;
              TXCLog.e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: sendHttpRequest[ " + (String)localObject4 + "] retryIndex = " + m);
              localObject3 = localObject1;
              k = j;
              new DataOutputStream(((HttpsURLConnection)localObject5).getOutputStream()).write(((String)localObject4).getBytes());
              localObject3 = localObject1;
              k = j;
              localObject5 = new BufferedReader(new InputStreamReader(((HttpsURLConnection)localObject5).getInputStream()));
              for (localObject4 = "";; localObject4 = (String)localObject4 + (String)localObject6)
              {
                localObject3 = localObject1;
                k = j;
                localObject6 = ((BufferedReader)localObject5).readLine();
                if (localObject6 == null) {
                  break;
                }
                localObject3 = localObject1;
                k = j;
              }
              localObject3 = localObject1;
              k = j;
              TXCLog.e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: receive response, strResponse = " + (String)localObject4);
              localObject3 = localObject1;
              k = j;
              localObject6 = (JSONObject)new JSONTokener((String)localObject4).nextValue();
              i = j;
              localObject3 = localObject1;
              k = j;
              if (((JSONObject)localObject6).has("code"))
              {
                localObject3 = localObject1;
                k = j;
                i = ((JSONObject)localObject6).getInt("code");
              }
              localObject4 = localObject1;
              if (i != 0)
              {
                localObject4 = localObject1;
                localObject3 = localObject1;
                k = i;
                if (((JSONObject)localObject6).has("message"))
                {
                  localObject3 = localObject1;
                  k = i;
                  localObject4 = ((JSONObject)localObject6).getString("message");
                }
                localObject3 = localObject4;
                k = i;
                TXCLog.e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: errorCode = " + i + " errorMessage = " + (String)localObject4);
              }
              localObject3 = localObject4;
              k = i;
              localObject1 = new Vector();
              localObject3 = localObject4;
              k = i;
              localObject5 = new Vector();
              localObject3 = localObject4;
              k = i;
              localObject6 = ((JSONObject)localObject6).getJSONArray("pull_addr");
              if (localObject6 != null)
              {
                localObject3 = localObject4;
                k = i;
                if (((JSONArray)localObject6).length() != 0) {
                  break label1157;
                }
              }
              localObject3 = localObject4;
              k = i;
              TXCLog.e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: no pull_addr");
              localObject3 = localObject4;
              k = i;
              if (paramInt != 1) {
                break;
              }
              localObject3 = localObject4;
              k = i;
              if (((Vector)localObject5).size() <= 0) {
                break label1114;
              }
              localObject3 = localObject4;
              k = i;
              TXRTMPAccUrlFetcher.this.mHandler.post(new Runnable()
              {
                public void run()
                {
                  if (TXRTMPAccUrlFetcher.2.this.val$listener != null) {
                    TXRTMPAccUrlFetcher.2.this.val$listener.onGetAccelerateStreamPlayUrl(0, "Success", localObject5);
                  }
                }
              });
              return;
            }
            catch (Exception localException)
            {
              Object localObject6;
              Object localObject7;
              String str;
              localObject2 = localObject3;
              i = k;
              TXCLog.e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl exception");
            }
            localObject3 = localObject4;
            k = i;
          } while (j >= ((JSONArray)localObject6).length());
          localObject3 = localObject4;
          k = i;
          localObject7 = (JSONObject)((JSONArray)localObject6).get(j);
          if (localObject7 == null) {
            break label1162;
          }
          localObject3 = localObject4;
          k = i;
          str = ((JSONObject)localObject7).getString("rtmp_url");
          localObject3 = localObject4;
          k = i;
          if (((JSONObject)localObject7).getInt("proto") != 1) {
            break label1169;
          }
        }
        label1114:
        label1157:
        label1162:
        label1169:
        for (boolean bool = true;; bool = false)
        {
          localObject3 = localObject4;
          k = i;
          TXCLog.e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: streamUrl = " + str + " Q channel = " + bool);
          localObject3 = localObject4;
          k = i;
          localObject7 = TXRTMPAccUrlFetcher.this.getStreamIDByStreamUrl(str);
          if (localObject7 != null)
          {
            localObject3 = localObject4;
            k = i;
            if (((String)localObject7).equalsIgnoreCase(paramString1)) {
              if (bool)
              {
                localObject3 = localObject4;
                k = i;
                ((Vector)localObject1).add(new TXCStreamPlayUrl(str, true));
              }
              else
              {
                localObject3 = localObject4;
                k = i;
                ((Vector)localObject5).add(new TXCStreamPlayUrl(str, false));
                break label1162;
                final Object localObject2;
                for (;;)
                {
                  m -= 1;
                  j = i;
                  break;
                  localObject3 = localObject4;
                  k = i;
                  if (paramInt == 2)
                  {
                    localObject3 = localObject4;
                    k = i;
                    if (((Vector)localObject2).size() > 0)
                    {
                      localObject3 = localObject4;
                      k = i;
                      TXRTMPAccUrlFetcher.this.mHandler.post(new Runnable()
                      {
                        public void run()
                        {
                          if (TXRTMPAccUrlFetcher.2.this.val$listener != null) {
                            TXRTMPAccUrlFetcher.2.this.val$listener.onGetAccelerateStreamPlayUrl(0, "Success", localObject2);
                          }
                        }
                      });
                    }
                  }
                  else
                  {
                    localObject3 = localObject4;
                    k = i;
                    localObject5 = ((Vector)localObject5).iterator();
                    for (;;)
                    {
                      localObject3 = localObject4;
                      k = i;
                      if (!((Iterator)localObject5).hasNext()) {
                        break;
                      }
                      localObject3 = localObject4;
                      k = i;
                      ((Vector)localObject2).add((TXCStreamPlayUrl)((Iterator)localObject5).next());
                    }
                    localObject3 = localObject4;
                    k = i;
                    if (((Vector)localObject2).size() > 0)
                    {
                      localObject3 = localObject4;
                      k = i;
                      TXRTMPAccUrlFetcher.this.mHandler.post(new Runnable()
                      {
                        public void run()
                        {
                          if (TXRTMPAccUrlFetcher.2.this.val$listener != null) {
                            TXRTMPAccUrlFetcher.2.this.val$listener.onGetAccelerateStreamPlayUrl(0, "Success", localObject2);
                          }
                        }
                      });
                      return;
                    }
                  }
                  localObject3 = localObject4;
                  k = i;
                  sleep(1000L, 0);
                  localObject2 = localObject4;
                }
                TXRTMPAccUrlFetcher.this.mHandler.post(new Runnable()
                {
                  public void run()
                  {
                    if (TXRTMPAccUrlFetcher.2.this.val$listener != null) {
                      TXRTMPAccUrlFetcher.2.this.val$listener.onGetAccelerateStreamPlayUrl(j, localObject2, null);
                    }
                  }
                });
                return;
                j = 0;
                break label726;
              }
            }
          }
          j += 1;
          break label726;
        }
      }
    }.start();
  }
  
  private String getParamsFromStreamUrl(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0))
    {
      paramString1 = null;
      return paramString1;
    }
    String str = paramString1.toLowerCase();
    paramString2 = paramString2.split("[?&]");
    int j = paramString2.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label112;
      }
      paramString1 = paramString2[i];
      if (paramString1.indexOf("=") != -1)
      {
        paramString1 = paramString1.split("[=]");
        if (paramString1.length == 2)
        {
          Object localObject = paramString1[0];
          paramString1 = paramString1[1];
          if ((localObject != null) && (((String)localObject).toLowerCase().equalsIgnoreCase(str))) {
            break;
          }
        }
      }
      i += 1;
    }
    label112:
    return null;
  }
  
  public int getAccerateStreamPlayUrl(final String paramString, int paramInt, final OnGetAccerateStreamPlayUrl paramOnGetAccerateStreamPlayUrl)
  {
    this.mStreamId = "";
    this.mBizid = "";
    this.mErrorCode = 0;
    this.mErrorInfo = "";
    if ((paramString == null) || (paramString.isEmpty())) {
      return -1;
    }
    final String str1 = getStreamIDByStreamUrl(paramString);
    if ((str1 == null) || (str1.isEmpty())) {
      return -2;
    }
    final String str2 = getParamsFromStreamUrl("bizid", paramString);
    final String str3 = getParamsFromStreamUrl("txSecret", paramString);
    paramString = getParamsFromStreamUrl("txTime", paramString);
    if ((str2 == null) || (str2.isEmpty()) || (str3 == null) || (str3.isEmpty()) || (paramString == null) || (paramString.isEmpty())) {
      return -3;
    }
    getAccerateStreamPlayUrl(str1, str2, str3, paramString, paramInt, new OnGetAccerateStreamPlayUrl()
    {
      public void onGetAccelerateStreamPlayUrl(int paramAnonymousInt, String paramAnonymousString, Vector<TXCStreamPlayUrl> paramAnonymousVector)
      {
        TXRTMPAccUrlFetcher.this.mStreamId = str1;
        TXRTMPAccUrlFetcher.this.mBizid = str2;
        TXRTMPAccUrlFetcher.this.mErrorCode = paramAnonymousInt;
        TXRTMPAccUrlFetcher.this.mErrorInfo = paramAnonymousString;
        if ((paramAnonymousVector != null) && (!paramAnonymousVector.isEmpty()))
        {
          localVector = new Vector();
          localIterator = paramAnonymousVector.iterator();
          while (localIterator.hasNext())
          {
            localTXCStreamPlayUrl = (TXCStreamPlayUrl)localIterator.next();
            localObject = localTXCStreamPlayUrl.strStreamUrl;
            paramAnonymousVector = (Vector<TXCStreamPlayUrl>)localObject;
            if (((String)localObject).indexOf("?") != -1) {
              paramAnonymousVector = ((String)localObject).substring(0, ((String)localObject).indexOf("?"));
            }
            localVector.add(new TXCStreamPlayUrl(paramAnonymousVector + "?txSecret=" + str3 + "&txTime=" + paramString + "&bizid=" + str2, localTXCStreamPlayUrl.quicChannel));
          }
          if (paramOnGetAccerateStreamPlayUrl != null)
          {
            paramAnonymousVector = localVector.iterator();
            while (paramAnonymousVector.hasNext())
            {
              localObject = (TXCStreamPlayUrl)paramAnonymousVector.next();
              TXCLog.e("TXRTMPAccUrlFetcher", "accurl = " + ((TXCStreamPlayUrl)localObject).strStreamUrl + " quic = " + ((TXCStreamPlayUrl)localObject).quicChannel);
            }
            paramOnGetAccerateStreamPlayUrl.onGetAccelerateStreamPlayUrl(paramAnonymousInt, paramAnonymousString, localVector);
          }
        }
        while (paramOnGetAccerateStreamPlayUrl == null)
        {
          Vector localVector;
          Iterator localIterator;
          TXCStreamPlayUrl localTXCStreamPlayUrl;
          Object localObject;
          return;
        }
        paramOnGetAccerateStreamPlayUrl.onGetAccelerateStreamPlayUrl(paramAnonymousInt, paramAnonymousString, null);
      }
    });
    return 0;
  }
  
  public String getBizid()
  {
    return this.mBizid;
  }
  
  public int getErrorCode()
  {
    return this.mErrorCode;
  }
  
  public String getErrorInfo()
  {
    return this.mErrorInfo;
  }
  
  public String getStreamIDByStreamUrl(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    do
    {
      int i;
      do
      {
        return null;
        i = paramString.toLowerCase().indexOf("/live/");
      } while (i == -1);
      paramString = paramString.substring(i + "/live/".length()).split("[?.]");
    } while (paramString.length <= 0);
    return paramString[0];
  }
  
  public String getStreamId()
  {
    return this.mStreamId;
  }
  
  public static abstract interface OnGetAccerateStreamPlayUrl
  {
    public abstract void onGetAccelerateStreamPlayUrl(int paramInt, String paramString, Vector<TXCStreamPlayUrl> paramVector);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\network\TXRTMPAccUrlFetcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */