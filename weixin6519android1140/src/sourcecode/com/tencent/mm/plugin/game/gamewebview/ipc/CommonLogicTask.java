package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.a.gl;
import com.tencent.mm.g.a.gl.b;
import com.tencent.mm.plugin.game.c.ce;
import com.tencent.mm.plugin.webview.model.ad;
import com.tencent.mm.plugin.webview.model.ai;
import com.tencent.mm.plugin.webview.modeltools.f;
import com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.v;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public class CommonLogicTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<CommonLogicTask> CREATOR;
  public Runnable lGk;
  public Bundle ler;
  public int type;
  
  static
  {
    GMTrace.i(16941632716800L, 126225);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16941632716800L, 126225);
  }
  
  public CommonLogicTask()
  {
    GMTrace.i(16941364281344L, 126223);
    this.ler = new Bundle();
    GMTrace.o(16941364281344L, 126223);
  }
  
  CommonLogicTask(Parcel paramParcel)
  {
    GMTrace.i(16941498499072L, 126224);
    this.ler = new Bundle();
    f(paramParcel);
    GMTrace.o(16941498499072L, 126224);
  }
  
  private static int na(String paramString)
  {
    int i = 1;
    GMTrace.i(16940827410432L, 126219);
    try
    {
      int j = bg.getInt(com.tencent.mm.k.g.ut().getValue(paramString), 1);
      i = j;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.ComonLogicTask", "getIntValFromDynamicConfig parseInt failed, val: " + paramString);
      }
    }
    GMTrace.o(16940827410432L, 126219);
    return i;
  }
  
  public final void RY()
  {
    int i = 0;
    boolean bool2 = true;
    boolean bool1 = true;
    GMTrace.i(16940693192704L, 126218);
    switch (this.type)
    {
    }
    for (;;)
    {
      VL();
      GMTrace.o(16940693192704L, 126218);
      return;
      if (this.ler != null)
      {
        bool1 = this.ler.getBoolean("permission_allow", false);
        Object localObject1 = this.ler.getString("url");
        if (bg.nm((String)localObject1))
        {
          w.e("MicroMsg.ComonLogicTask", "ACTIVITY_JUMP_HANDLER, url is null");
          GMTrace.o(16940693192704L, 126218);
          return;
        }
        p.a.tme.a(ab.getContext(), (String)localObject1, bool1);
        continue;
        if (this.ler != null)
        {
          localObject1 = this.ler.getIntArray("getConfigStgKey");
          if ((localObject1 == null) || (localObject1.length == 0))
          {
            GMTrace.o(16940693192704L, 126218);
            return;
          }
          Object localObject2 = new ArrayList();
          int j = localObject1.length;
          while (i < j)
          {
            int k = localObject1[i];
            at.AR();
            ((ArrayList)localObject2).add(bg.nl((String)com.tencent.mm.y.c.xh().get(k, null)));
            i += 1;
          }
          this.ler.putStringArrayList("getConfigStgValue", (ArrayList)localObject2);
          continue;
          if (this.ler != null)
          {
            localObject1 = this.ler.getString("localId");
            localObject1 = f.bCW().Lk((String)localObject1);
            if (localObject1 != null)
            {
              this.ler.putParcelable("item", (Parcelable)localObject1);
              continue;
              i = na("WebViewDownLoadFileSwitch");
              if (this.ler == null) {
                this.ler = new Bundle();
              }
              localObject1 = this.ler;
              if (i == 1) {}
              for (;;)
              {
                ((Bundle)localObject1).putBoolean("allowDownloadFile", bool1);
                break;
                bool1 = false;
              }
              i = na("EnableWebviewScanQRCode");
              localObject1 = this.ler;
              if (i == 1) {}
              for (bool1 = bool2;; bool1 = false)
              {
                ((Bundle)localObject1).putBoolean("allow_webview_scan", bool1);
                break;
              }
              this.ler.putBoolean("has_set_uin", at.AU());
              continue;
              localObject1 = new cf();
              com.tencent.mm.pluginsdk.model.e.a((cf)localObject1, 1, this.ler.getString("image_path", ""));
              a.vgX.m((b)localObject1);
              this.ler.putInt("fav_simple_img_result", ((cf)localObject1).eDw.ret);
              continue;
              localObject1 = ai.Lo(this.ler.getString("localId"));
              this.ler.putString("file_path", (String)localObject1);
              continue;
              localObject1 = this.ler.getString("game_hv_menu_appid");
              localObject2 = new gl();
              ((gl)localObject2).eJz.nJ = 3;
              ((gl)localObject2).eJz.eJB = ((String)localObject1);
              a.vgX.m((b)localObject2);
              this.ler.putString("game_hv_menu_pbcache", ((gl)localObject2).eJA.result);
              continue;
              localObject1 = com.tencent.mm.plugin.game.model.g.aFi().aFk();
              if (localObject1 != null)
              {
                localObject2 = new GameSettingParams();
                ((GameSettingParams)localObject2).eKs = ((ce)localObject1).gjg;
                ((GameSettingParams)localObject2).eKt = ((ce)localObject1).lSU;
                this.ler.putParcelable("game_setting_params", (Parcelable)localObject2);
                continue;
                com.tencent.mm.plugin.webview.ui.tools.game.c.aa(this.ler);
              }
            }
          }
        }
      }
    }
  }
  
  public final void VK()
  {
    GMTrace.i(16940558974976L, 126217);
    if (this.lGk != null) {
      this.lGk.run();
    }
    GMTrace.o(16940558974976L, 126217);
  }
  
  public int describeContents()
  {
    GMTrace.i(16940961628160L, 126220);
    GMTrace.o(16940961628160L, 126220);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(16941230063616L, 126222);
    this.type = paramParcel.readInt();
    this.ler = paramParcel.readBundle(getClass().getClassLoader());
    GMTrace.o(16941230063616L, 126222);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16941095845888L, 126221);
    paramParcel.writeInt(this.type);
    paramParcel.writeBundle(this.ler);
    GMTrace.o(16941095845888L, 126221);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ipc\CommonLogicTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */