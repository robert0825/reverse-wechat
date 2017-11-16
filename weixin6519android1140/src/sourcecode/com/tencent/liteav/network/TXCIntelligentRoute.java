package com.tencent.liteav.network;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class TXCIntelligentRoute
{
  private static final String TAG = "TXCIntelligentRoute";
  private final String INTELLIGENT_ROUTING_CGI = "http://tcdns.myqcloud.com/queryip";
  public IntelligentRouteListener IRListener = null;
  public int TimeOut = 5;
  private final String kHEADER_NUM = "forward_num";
  private final String kHEADER_URL = "forward_stream";
  private final String kREQUEST_TYPE = "request_type";
  private final String kSDK_VERSION = "sdk_version";
  private Thread mThread = null;
  
  private InputStream getHttpConnection(String paramString, int paramInt)
  {
    Object localObject = new URL("http://tcdns.myqcloud.com/queryip").openConnection();
    try
    {
      localObject = (HttpURLConnection)localObject;
      ((HttpURLConnection)localObject).setRequestMethod("GET");
      ((HttpURLConnection)localObject).setRequestProperty("forward_stream", paramString);
      ((HttpURLConnection)localObject).setRequestProperty("forward_num", "2");
      ((HttpURLConnection)localObject).setRequestProperty("sdk_version", TXCCommonUtil.getSDKVersionStr());
      if (paramInt == 1) {
        ((HttpURLConnection)localObject).setRequestProperty("request_type", "1");
      }
      for (;;)
      {
        if (this.TimeOut > 0)
        {
          ((HttpURLConnection)localObject).setConnectTimeout(this.TimeOut * 1000);
          ((HttpURLConnection)localObject).setReadTimeout(this.TimeOut * 1000);
        }
        ((HttpURLConnection)localObject).connect();
        if (((HttpURLConnection)localObject).getResponseCode() != 200) {
          break;
        }
        return ((HttpURLConnection)localObject).getInputStream();
        if (paramInt == 2) {
          ((HttpURLConnection)localObject).setRequestProperty("request_type", "2");
        } else {
          ((HttpURLConnection)localObject).setRequestProperty("request_type", "3");
        }
      }
      return null;
    }
    catch (Exception paramString) {}
  }
  
  private IPRecord getIPRecordFromJSONObject(JSONObject paramJSONObject)
  {
    IPRecord localIPRecord = new IPRecord();
    try
    {
      localIPRecord.ip = paramJSONObject.getString("ip");
      localIPRecord.port = paramJSONObject.getString("port");
      localIPRecord.conn_times = 0;
      localIPRecord.quic_channel = false;
      if ((paramJSONObject.has("type")) && (paramJSONObject.getInt("type") == 2)) {
        localIPRecord.quic_channel = true;
      }
      return localIPRecord;
    }
    catch (JSONException paramJSONObject) {}
    return null;
  }
  
  public void fetchByUrl(final String paramString, final int paramInt)
  {
    this.mThread = new Thread("TXCPushRoute")
    {
      public void run()
      {
        if (TXCIntelligentRoute.this.IRListener == null) {
          return;
        }
        ArrayList localArrayList1 = new ArrayList();
        int i = 0;
        for (;;)
        {
          Object localObject3 = localArrayList1;
          Object localObject2;
          if (i < 5) {
            localObject2 = localArrayList1;
          }
          try
          {
            localObject3 = TXCIntelligentRoute.this.getJsonStringFromUrl(paramString, paramInt);
            try
            {
              localObject2 = new JSONObject((String)localObject3);
              if (!((JSONObject)localObject2).has("use")) {
                break label103;
              }
              int j = ((JSONObject)localObject2).getInt("use");
              if (j != 0) {
                break label103;
              }
              localObject3 = localArrayList1;
            }
            catch (Exception localException2)
            {
              do
              {
                localArrayList2 = localArrayList1;
                localArrayList1 = TXCIntelligentRoute.this.getRecordsFromJsonString((String)localObject3);
                if (localArrayList1 == null) {
                  break;
                }
                localObject3 = localArrayList1;
                localArrayList2 = localArrayList1;
              } while (localArrayList1.size() > 0);
              localArrayList2 = localArrayList1;
              sleep(1000L, 0);
            }
            TXCIntelligentRoute.this.IRListener.onFetchDone(0, (ArrayList)localObject3);
            return;
          }
          catch (Exception localException1)
          {
            for (;;)
            {
              label103:
              ArrayList localArrayList2;
              Object localObject1 = localArrayList2;
            }
          }
          i += 1;
        }
      }
    };
    this.mThread.start();
  }
  
  public String getJsonStringFromUrl(String paramString, int paramInt)
  {
    localStringBuffer = new StringBuffer("");
    try
    {
      paramString = getHttpConnection(paramString, paramInt);
      if (paramString == null) {
        return "";
      }
      paramString = new BufferedReader(new InputStreamReader(paramString));
      for (;;)
      {
        String str = paramString.readLine();
        if (str == null) {
          break;
        }
        localStringBuffer.append(str);
      }
      return localStringBuffer.toString();
    }
    catch (IOException paramString) {}
  }
  
  public ArrayList<IPRecord> getRecordsFromJsonString(String paramString)
  {
    IPRecord localIPRecord = null;
    int k = 0;
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      int i;
      int j;
      try
      {
        paramString = new JSONObject(paramString);
        if (paramString.getInt("state") != 0) {
          return null;
        }
        JSONArray localJSONArray = paramString.getJSONObject("content").getJSONArray("list");
        paramString = localIPRecord;
        if (localJSONArray != null)
        {
          i = 0;
          j = k;
          if (i < localJSONArray.length())
          {
            paramString = getIPRecordFromJSONObject((JSONObject)localJSONArray.opt(i));
            if ((paramString == null) || (!paramString.quic_channel)) {
              break label235;
            }
            localArrayList.add(paramString);
            break label235;
          }
          if (j < localJSONArray.length())
          {
            paramString = getIPRecordFromJSONObject((JSONObject)localJSONArray.opt(j));
            if ((paramString == null) || (paramString.quic_channel)) {
              break label242;
            }
            localArrayList.add(paramString);
            break label242;
          }
          paramString = localArrayList.iterator();
          if (paramString.hasNext())
          {
            localIPRecord = (IPRecord)paramString.next();
            TXCLog.e("TXCIntelligentRoute", "Nearest IP: " + localIPRecord.ip + " Port: " + localIPRecord.port + " Q Channel: " + localIPRecord.quic_channel);
            continue;
          }
        }
        return paramString;
      }
      catch (JSONException paramString)
      {
        paramString = localArrayList;
      }
      label235:
      i += 1;
      continue;
      label242:
      j += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\network\TXCIntelligentRoute.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */