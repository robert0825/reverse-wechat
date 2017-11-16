package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class am
  extends a
{
  public static final int CTRL_BYTE = 40;
  public static final String NAME = "queryDownloadTask";
  
  public am()
  {
    GMTrace.i(17050885947392L, 127039);
    GMTrace.o(17050885947392L, 127039);
  }
  
  private static void a(d paramd, FileDownloadTaskInfo paramFileDownloadTaskInfo, int paramInt)
  {
    GMTrace.i(18024769781760L, 134295);
    HashMap localHashMap = new HashMap();
    String str;
    switch (paramFileDownloadTaskInfo.status)
    {
    case 0: 
    default: 
      str = "default";
    }
    for (;;)
    {
      try
      {
        localHashMap.put("download_id", Long.valueOf(paramFileDownloadTaskInfo.id));
        localHashMap.put("state", str);
        if ((str == "downloading") && (paramFileDownloadTaskInfo.eJe != 0L)) {
          localHashMap.put("progress", Long.valueOf(paramFileDownloadTaskInfo.eJd / paramFileDownloadTaskInfo.eJe * 100L));
        }
        paramd.v(paramInt, d("query_download_task:ok", localHashMap));
        GMTrace.o(18024769781760L, 134295);
        return;
      }
      catch (Exception paramd)
      {
        w.e("MicroMsg.GameJsApiQueryDownloadTask", paramd.getMessage());
        GMTrace.o(18024769781760L, 134295);
      }
      str = "api_not_support";
      continue;
      str = "downloading";
      continue;
      if (e.aZ(paramFileDownloadTaskInfo.path))
      {
        str = "download_succ";
      }
      else
      {
        str = "default";
        continue;
        str = "download_pause";
        continue;
        str = "download_fail";
      }
    }
  }
  
  private static void a(JSONObject paramJSONObject, ArrayList<String> paramArrayList)
  {
    GMTrace.i(17051288600576L, 127042);
    if (bg.cc(paramArrayList))
    {
      GMTrace.o(17051288600576L, 127042);
      return;
    }
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("download_id", -1);
        localJSONObject.put("state", "default");
        paramJSONObject.put(str, localJSONObject);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.GameJsApiQueryDownloadTask", localException.getMessage());
      }
    }
    GMTrace.o(17051288600576L, 127042);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17051020165120L, 127040);
    Object localObject2 = paramJSONObject.optJSONArray("appIdArray");
    if ((localObject2 != null) && (((JSONArray)localObject2).length() > 0))
    {
      localObject1 = new JSONObject();
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (i < ((JSONArray)localObject2).length())
      {
        localArrayList.add(((JSONArray)localObject2).optString(i));
        i += 1;
      }
      paramJSONObject = new QueryDownloadInfoTask();
      paramJSONObject.type = 2;
      paramJSONObject.lHR = localArrayList;
      GameWebViewMainProcessService.b(paramJSONObject);
      paramJSONObject = paramJSONObject.kCf;
      if ((paramJSONObject != null) && (paramJSONObject.size() > 0))
      {
        localObject2 = paramJSONObject.iterator();
        if (((Iterator)localObject2).hasNext())
        {
          FileDownloadTaskInfo localFileDownloadTaskInfo = (FileDownloadTaskInfo)((Iterator)localObject2).next();
          JSONObject localJSONObject = new JSONObject();
          switch (localFileDownloadTaskInfo.status)
          {
          case 0: 
          default: 
            paramJSONObject = "default";
          }
          for (;;)
          {
            try
            {
              localJSONObject.put("download_id", localFileDownloadTaskInfo.id);
              localJSONObject.put("state", paramJSONObject);
              if ((paramJSONObject == "downloading") && (localFileDownloadTaskInfo.eJe != 0L)) {
                localJSONObject.put("progress", localFileDownloadTaskInfo.eJd / localFileDownloadTaskInfo.eJe * 100L);
              }
              ((JSONObject)localObject1).put(localFileDownloadTaskInfo.appId, localJSONObject);
              localArrayList.remove(localFileDownloadTaskInfo.appId);
            }
            catch (Exception paramJSONObject)
            {
              w.e("MicroMsg.GameJsApiQueryDownloadTask", paramJSONObject.getMessage());
            }
            break;
            paramJSONObject = "api_not_support";
            continue;
            paramJSONObject = "downloading";
            continue;
            if (e.aZ(localFileDownloadTaskInfo.path))
            {
              paramJSONObject = "download_succ";
            }
            else
            {
              paramJSONObject = "default";
              continue;
              paramJSONObject = "download_pause";
              continue;
              paramJSONObject = "download_fail";
            }
          }
        }
        a((JSONObject)localObject1, localArrayList);
        paramJSONObject = new HashMap();
        paramJSONObject.put("result", ((JSONObject)localObject1).toString());
        paramd.v(paramInt, d("query_download_task:ok", paramJSONObject));
        GMTrace.o(17051020165120L, 127040);
        return;
      }
      w.e("MicroMsg.GameJsApiQueryDownloadTask", "taskInfos is null");
      a((JSONObject)localObject1, localArrayList);
      paramJSONObject = new HashMap();
      paramJSONObject.put("result", ((JSONObject)localObject1).toString());
      paramd.v(paramInt, d("query_download_task:ok", paramJSONObject));
      GMTrace.o(17051020165120L, 127040);
      return;
    }
    Object localObject1 = new QueryDownloadInfoTask();
    long l = paramJSONObject.optLong("download_id", -1L);
    paramJSONObject = paramJSONObject.optString("appid");
    if (l > 0L)
    {
      ((QueryDownloadInfoTask)localObject1).type = 1;
      ((QueryDownloadInfoTask)localObject1).eAf = l;
      GameWebViewMainProcessService.b((GWMainProcessTask)localObject1);
      if ((((QueryDownloadInfoTask)localObject1).kCf == null) || (((QueryDownloadInfoTask)localObject1).kCf.size() == 0))
      {
        a(paramd, new FileDownloadTaskInfo(), paramInt);
        GMTrace.o(17051020165120L, 127040);
        return;
      }
      a(paramd, (FileDownloadTaskInfo)((QueryDownloadInfoTask)localObject1).kCf.get(0), paramInt);
      GMTrace.o(17051020165120L, 127040);
      return;
    }
    if (!bg.nm(paramJSONObject))
    {
      ((QueryDownloadInfoTask)localObject1).type = 2;
      ((QueryDownloadInfoTask)localObject1).lHR = new ArrayList();
      ((QueryDownloadInfoTask)localObject1).lHR.add(paramJSONObject);
      GameWebViewMainProcessService.b((GWMainProcessTask)localObject1);
      if ((((QueryDownloadInfoTask)localObject1).kCf == null) || (((QueryDownloadInfoTask)localObject1).kCf.size() == 0))
      {
        a(paramd, new FileDownloadTaskInfo(), paramInt);
        GMTrace.o(17051020165120L, 127040);
        return;
      }
      a(paramd, (FileDownloadTaskInfo)((QueryDownloadInfoTask)localObject1).kCf.get(0), paramInt);
      GMTrace.o(17051020165120L, 127040);
      return;
    }
    w.e("MicroMsg.GameJsApiQueryDownloadTask", "invalid params");
    paramd.v(paramInt, a.d("query_download_task:fail_invalid_params", null));
    GMTrace.o(17051020165120L, 127040);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */