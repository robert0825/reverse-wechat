package com.tencent.tmassistantsdk.downloadservice;

import android.text.TextUtils;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class HttpClientUtil
{
  public static HttpClient createHttpClient()
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 30000);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, 30000);
    HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, 4096);
    HttpClientParams.setRedirecting(localBasicHttpParams, false);
    return new DefaultHttpClient(localBasicHttpParams);
  }
  
  public static void setProxy(HttpClient paramHttpClient)
  {
    Object localObject = DownloadHelper.getNetStatus();
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      if ((!((String)localObject).equalsIgnoreCase("cmwap")) && (!((String)localObject).equalsIgnoreCase("3gwap")) && (!((String)localObject).equalsIgnoreCase("uniwap"))) {
        break label66;
      }
      localObject = new HttpHost("10.0.0.172", 80);
      paramHttpClient.getParams().setParameter("http.route.default-proxy", localObject);
    }
    label66:
    while (!((String)localObject).equalsIgnoreCase("ctwap")) {
      return;
    }
    localObject = new HttpHost("10.0.0.200", 80);
    paramHttpClient.getParams().setParameter("http.route.default-proxy", localObject);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\downloadservice\HttpClientUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */