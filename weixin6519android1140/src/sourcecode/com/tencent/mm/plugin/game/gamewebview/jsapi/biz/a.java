package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 269;
  public static final String NAME = "addDownloadTaskStraight";
  
  public a()
  {
    GMTrace.i(17045248802816L, 126997);
    GMTrace.o(17045248802816L, 126997);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17045383020544L, 126998);
    w.i("MicroMsg.GameJsApiAddDownloadTaskStraight", "invoke");
    GameWebViewUI localGameWebViewUI = paramd.aEo();
    String str = paramJSONObject.optString("task_url");
    long l = paramJSONObject.optLong("task_size");
    if (bg.nm(str))
    {
      w.e("MicroMsg.GameJsApiAddDownloadTaskStraight", "url is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("add_download_task:fail", null));
      GMTrace.o(17045383020544L, 126998);
      return;
    }
    if (!am.isNetworkConnected(paramd.getContext()))
    {
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("add_download_task:fail_network_not_connected", null));
      com.tencent.mm.plugin.game.gamewebview.a.d.runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17037732610048L, 126941);
          Toast.makeText(paramd.getContext(), paramd.getContext().getString(R.l.dzS), 0).show();
          GMTrace.o(17037732610048L, 126941);
        }
      });
      w.i("MicroMsg.GameJsApiAddDownloadTaskStraight", " fail, network not ready");
      GMTrace.o(17045383020544L, 126998);
      return;
    }
    if (!f.ty())
    {
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("add_download_task:fail_sdcard_not_ready", null));
      com.tencent.mm.plugin.game.gamewebview.a.d.runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17045651456000L, 127000);
          Toast.makeText(paramd.getContext(), paramd.getContext().getString(R.l.dzU), 0).show();
          GMTrace.o(17045651456000L, 127000);
        }
      });
      w.i("MicroMsg.GameJsApiAddDownloadTaskStraight", " fail, sdcard not ready");
      GMTrace.o(17045383020544L, 126998);
      return;
    }
    if ((l > 0L) && (!f.L(l)))
    {
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("add_download_task:fail_has_not_enough_space", null));
      com.tencent.mm.plugin.game.gamewebview.a.d.runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17051557036032L, 127044);
          Toast.makeText(paramd.getContext(), paramd.getContext().getString(R.l.dzT), 0).show();
          GMTrace.o(17051557036032L, 127044);
        }
      });
      w.i("MicroMsg.GameJsApiAddDownloadTaskStraight", "fail, not enough space, require size = " + l);
      GMTrace.o(17045383020544L, 126998);
      return;
    }
    if (am.isWifi(localGameWebViewUI))
    {
      b(paramd, paramJSONObject, paramInt);
      GMTrace.o(17045383020544L, 126998);
      return;
    }
    h.a(localGameWebViewUI, localGameWebViewUI.getString(R.l.ejO), localGameWebViewUI.getString(R.l.ejP), localGameWebViewUI.getString(R.l.ejJ), localGameWebViewUI.getString(R.l.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(18025172434944L, 134298);
        a.this.b(paramd, paramJSONObject, paramInt);
        paramAnonymousDialogInterface.dismiss();
        GMTrace.o(18025172434944L, 134298);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(18024635564032L, 134294);
        paramAnonymousDialogInterface.dismiss();
        paramAnonymousDialogInterface = paramd;
        paramAnonymousInt = paramInt;
        a locala = a.this;
        paramAnonymousDialogInterface.v(paramAnonymousInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("add_download_task:fail_network_not_wifi", null));
        GMTrace.o(18024635564032L, 134294);
      }
    }, R.e.aPp);
    GMTrace.o(17045383020544L, 126998);
  }
  
  public final void b(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(18025709305856L, 134302);
    Object localObject = paramJSONObject.optString("task_name");
    String str1 = paramJSONObject.optString("task_url");
    String str2 = paramJSONObject.optString("alternative_url");
    long l = paramJSONObject.optLong("task_size");
    String str3 = paramJSONObject.optString("file_md5");
    String str4 = paramJSONObject.optString("extInfo");
    String str5 = paramJSONObject.optString("fileType");
    String str6 = paramJSONObject.optString("appid");
    String str7 = paramJSONObject.optString("packageName");
    int i = paramJSONObject.optInt("scene", 1000);
    paramJSONObject = new DoDownloadTask();
    paramJSONObject.type = 1;
    paramJSONObject.lGL = ((String)localObject);
    paramJSONObject.url = str1;
    paramJSONObject.lGM = str2;
    paramJSONObject.eDW = str3;
    paramJSONObject.extInfo = str4;
    paramJSONObject.lGN = str5;
    paramJSONObject.appId = str6;
    paramJSONObject.packageName = str7;
    paramJSONObject.lGO = l;
    paramJSONObject.scene = i;
    GameWebViewMainProcessService.b(paramJSONObject);
    if (paramJSONObject.eAf <= 0L)
    {
      w.e("MicroMsg.GameJsApiAddDownloadTaskStraight", "fail, downloadId = " + paramJSONObject.eAf);
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("add_download_task:fail", null));
      GMTrace.o(18025709305856L, 134302);
      return;
    }
    localObject = new HashMap();
    ((Map)localObject).put("download_id", Long.valueOf(paramJSONObject.eAf));
    paramd.v(paramInt, d("add_download_task:ok", (Map)localObject));
    GMTrace.o(18025709305856L, 134302);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */