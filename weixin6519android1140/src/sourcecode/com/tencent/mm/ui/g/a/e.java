package com.tencent.mm.ui.g.a;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.json.JSONObject;

public final class e
{
  public static void B(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(2909437689856L, 21677);
    paramContext = new AlertDialog.Builder(paramContext);
    paramContext.setTitle(paramString1);
    paramContext.setMessage(paramString2);
    paramContext.create().show();
    GMTrace.o(2909437689856L, 21677);
  }
  
  private static Bundle WI(String paramString)
  {
    GMTrace.i(2908900818944L, 21673);
    Bundle localBundle = new Bundle();
    if (paramString != null)
    {
      paramString = paramString.split("&");
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        String[] arrayOfString = paramString[i].split("=");
        localBundle.putString(URLDecoder.decode(arrayOfString[0]), URLDecoder.decode(arrayOfString[1]));
        i += 1;
      }
    }
    GMTrace.o(2908900818944L, 21673);
    return localBundle;
  }
  
  public static Bundle WJ(String paramString)
  {
    GMTrace.i(2909035036672L, 21674);
    paramString = paramString.replace("fbconnect", "http");
    try
    {
      paramString = new URL(paramString);
      Bundle localBundle = WI(paramString.getQuery());
      localBundle.putAll(WI(paramString.getRef()));
      GMTrace.o(2909035036672L, 21674);
      return localBundle;
    }
    catch (MalformedURLException paramString)
    {
      paramString = new Bundle();
      GMTrace.o(2909035036672L, 21674);
    }
    return paramString;
  }
  
  public static JSONObject WK(String paramString)
  {
    GMTrace.i(14668789710848L, 109291);
    if (paramString.equals("false")) {
      throw new d("request failed");
    }
    String str = paramString;
    if (paramString.equals("true")) {
      str = "{value : true}";
    }
    paramString = new JSONObject(str);
    if (paramString.has("error"))
    {
      paramString = paramString.getJSONObject("error");
      throw new d(paramString.getString("message"), paramString.getString("type"), 0);
    }
    if ((paramString.has("error_code")) && (paramString.has("error_msg"))) {
      throw new d(paramString.getString("error_msg"), "", Integer.parseInt(paramString.getString("error_code")));
    }
    if (paramString.has("error_code")) {
      throw new d("request failed", "", Integer.parseInt(paramString.getString("error_code")));
    }
    if (paramString.has("error_msg")) {
      throw new d(paramString.getString("error_msg"));
    }
    if (paramString.has("error_reason")) {
      throw new d(paramString.getString("error_reason"));
    }
    GMTrace.o(14668789710848L, 109291);
    return paramString;
  }
  
  public static String ak(Bundle paramBundle)
  {
    GMTrace.i(2908766601216L, 21672);
    if (paramBundle == null)
    {
      GMTrace.o(2908766601216L, 21672);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramBundle.keySet().iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (i != 0) {
        i = 0;
      }
      for (;;)
      {
        localStringBuilder.append(URLEncoder.encode(str) + "=" + URLEncoder.encode(paramBundle.getString(str)));
        break;
        localStringBuilder.append('&');
      }
    }
    paramBundle = localStringBuilder.toString();
    GMTrace.o(2908766601216L, 21672);
    return paramBundle;
  }
  
  public static String e(String paramString1, String paramString2, Bundle paramBundle)
  {
    GMTrace.i(2909169254400L, 21675);
    Object localObject1 = paramString1;
    if (paramString2.equals("GET")) {
      localObject1 = paramString1 + "?" + ak(paramBundle);
    }
    w.d("Facebook-Util", paramString2 + " URL: " + (String)localObject1);
    localObject1 = (HttpURLConnection)new URL((String)localObject1).openConnection();
    ((HttpURLConnection)localObject1).setConnectTimeout(20000);
    ((HttpURLConnection)localObject1).setReadTimeout(20000);
    ((HttpURLConnection)localObject1).setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent") + " FacebookAndroidSDK");
    if (!paramString2.equals("GET"))
    {
      paramString1 = new Bundle();
      Object localObject2 = paramBundle.keySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        if (paramBundle.getByteArray(str) != null) {
          paramString1.putByteArray(str, paramBundle.getByteArray(str));
        }
      }
      if (!paramBundle.containsKey("method")) {
        paramBundle.putString("method", paramString2);
      }
      if (paramBundle.containsKey("access_token")) {
        paramBundle.putString("access_token", URLDecoder.decode(paramBundle.getString("access_token")));
      }
      ((HttpURLConnection)localObject1).setRequestMethod("POST");
      ((HttpURLConnection)localObject1).setRequestProperty("Content-Type", "multipart/form-data;boundary=" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
      ((HttpURLConnection)localObject1).setDoOutput(true);
      ((HttpURLConnection)localObject1).setDoInput(true);
      ((HttpURLConnection)localObject1).setRequestProperty("Connection", "Keep-Alive");
      ((HttpURLConnection)localObject1).connect();
      paramString2 = new BufferedOutputStream(((HttpURLConnection)localObject1).getOutputStream());
      paramString2.write(("--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
      paramString2.write(j(paramBundle, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").getBytes());
      paramString2.write(("\r\n" + "--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
      if (!paramString1.isEmpty())
      {
        paramBundle = paramString1.keySet().iterator();
        while (paramBundle.hasNext())
        {
          localObject2 = (String)paramBundle.next();
          paramString2.write(("Content-Disposition: form-data; filename=\"" + (String)localObject2 + "\"" + "\r\n").getBytes());
          paramString2.write(("Content-Type: content/unknown" + "\r\n" + "\r\n").getBytes());
          paramString2.write(paramString1.getByteArray((String)localObject2));
          paramString2.write(("\r\n" + "--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
        }
      }
      paramString2.flush();
    }
    try
    {
      paramString1 = p(((HttpURLConnection)localObject1).getInputStream());
      GMTrace.o(2909169254400L, 21675);
      return paramString1;
    }
    catch (FileNotFoundException paramString1)
    {
      for (;;)
      {
        paramString1 = p(((HttpURLConnection)localObject1).getErrorStream());
      }
    }
  }
  
  private static String j(Bundle paramBundle, String paramString)
  {
    GMTrace.i(2908632383488L, 21671);
    if (paramBundle == null)
    {
      GMTrace.o(2908632383488L, 21671);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (paramBundle.getByteArray(str) == null)
      {
        localStringBuilder.append("Content-Disposition: form-data; name=\"" + str + "\"\r\n\r\n" + paramBundle.getString(str));
        localStringBuilder.append("\r\n--" + paramString + "\r\n");
      }
    }
    paramBundle = localStringBuilder.toString();
    GMTrace.o(2908632383488L, 21671);
    return paramBundle;
  }
  
  private static String p(InputStream paramInputStream)
  {
    GMTrace.i(2909303472128L, 21676);
    StringBuilder localStringBuilder = new StringBuilder();
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream), 1000);
    for (String str = localBufferedReader.readLine(); str != null; str = localBufferedReader.readLine()) {
      localStringBuilder.append(str);
    }
    paramInputStream.close();
    paramInputStream = localStringBuilder.toString();
    GMTrace.o(2909303472128L, 21676);
    return paramInputStream;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\g\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */