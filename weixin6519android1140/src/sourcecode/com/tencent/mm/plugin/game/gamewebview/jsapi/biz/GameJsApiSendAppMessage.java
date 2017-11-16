package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.oj;
import com.tencent.mm.g.a.oj.a;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask.a;
import com.tencent.mm.plugin.webview.model.b.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.snackbar.b.c;
import com.tencent.mm.y.s;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

public final class GameJsApiSendAppMessage
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 6;
  public static final String NAME = "sendAppMessage";
  public static int eZj;
  
  public GameJsApiSendAppMessage()
  {
    GMTrace.i(17030216417280L, 126885);
    GMTrace.o(17030216417280L, 126885);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17030350635008L, 126886);
    w.i("MicroMsg.GameJsApiSendAppMessage", "invoke");
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.GameJsApiSendAppMessage", "sendAppMessage fail, appmsg is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("send_app_msg:fail_null_params", null));
      GMTrace.o(17030350635008L, 126886);
      return;
    }
    if (bg.nm(paramJSONObject.optString("link")))
    {
      w.e("MicroMsg.GameJsApiSendAppMessage", "link is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("send_app_msg:fail_invalid_params", null));
      GMTrace.o(17030350635008L, 126886);
      return;
    }
    Object localObject1;
    Object localObject2;
    switch (eZj)
    {
    default: 
      com.tencent.mm.plugin.game.gamewebview.model.h.a(paramd, paramJSONObject);
      localObject1 = new HashMap();
      ((HashMap)localObject1).put("img_url", paramJSONObject.optString("img_url"));
      ((HashMap)localObject1).put("desc", paramJSONObject.optString("desc"));
      ((HashMap)localObject1).put("title", paramJSONObject.optString("title"));
      ((HashMap)localObject1).put("url", paramJSONObject.optString("url"));
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("Select_Conv_Type", 3);
      ((Intent)localObject2).putExtra("scene_from", 2);
      ((Intent)localObject2).putExtra("mutil_select_is_ret", true);
      ((Intent)localObject2).putExtra("webview_params", (Serializable)localObject1);
      ((Intent)localObject2).putExtra("Retr_Msg_Type", 2);
      com.tencent.mm.bj.d.a(paramd.aEo(), ".ui.transmit.SelectConversationUI", (Intent)localObject2, 1, new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          GMTrace.i(17054644043776L, 127067);
          Object localObject;
          if (paramAnonymousInt1 == 1)
          {
            localObject = paramJSONObject.optString("appid");
            if ((GameJsApiSendAppMessage.this.lGy == null) || (!bg.nm((String)localObject))) {
              break label420;
            }
            localObject = GameJsApiSendAppMessage.this.lGy.getString("jsapi_args_appid");
          }
          label420:
          for (;;)
          {
            switch (paramAnonymousInt2)
            {
            }
            for (;;)
            {
              GMTrace.o(17054644043776L, 127067);
              return;
              if (paramAnonymousIntent == null) {}
              for (String str = null; (str == null) || (str.length() == 0); str = paramAnonymousIntent.getStringExtra("Select_Conv_User"))
              {
                w.e("MicroMsg.GameJsApiSendAppMessage", "mmOnActivityResult fail, toUser is null");
                paramAnonymousIntent = paramd;
                paramAnonymousInt1 = paramInt;
                localObject = GameJsApiSendAppMessage.this;
                paramAnonymousIntent.v(paramAnonymousInt1, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("send_app_msg:fail", null));
                GMTrace.o(17054644043776L, 127067);
                return;
              }
              GameJsApiSendAppMessage.SendAppMessageTask localSendAppMessageTask = new GameJsApiSendAppMessage.SendAppMessageTask(paramd.aEo());
              localSendAppMessageTask.scene = GameJsApiSendAppMessage.eZj;
              localSendAppMessageTask.appId = ((String)localObject);
              localSendAppMessageTask.toUser = str;
              localSendAppMessageTask.thumbUrl = ((String)paramJSONObject.opt("img_url"));
              localSendAppMessageTask.eTo = ((String)paramJSONObject.opt("src_username"));
              localSendAppMessageTask.lHH = ((String)paramJSONObject.opt("src_displayname"));
              localSendAppMessageTask.ikS = paramAnonymousIntent.getStringExtra("custom_send_text");
              localSendAppMessageTask.title = paramJSONObject.optString("title");
              localSendAppMessageTask.description = paramJSONObject.optString("desc");
              localSendAppMessageTask.lHI = paramd.zA(paramJSONObject.optString("link"));
              localSendAppMessageTask.eVw = bg.nl(paramd.lID);
              localSendAppMessageTask.lHJ = paramd.aEr();
              localSendAppMessageTask.verifyAppId = paramd.aEs();
              localSendAppMessageTask.extInfo = paramJSONObject.optString("review_data");
              localSendAppMessageTask.aAb();
              com.tencent.mm.ui.base.h.bm(paramd.aEo(), paramd.getResources().getString(R.l.cUy));
              paramAnonymousIntent = paramd;
              paramAnonymousInt1 = paramInt;
              localObject = GameJsApiSendAppMessage.this;
              paramAnonymousIntent.v(paramAnonymousInt1, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("send_app_msg:ok", null));
            }
          }
        }
      });
    }
    for (;;)
    {
      eZj = 0;
      GMTrace.o(17030350635008L, 126886);
      return;
      localObject1 = new SendAppMessageTask(paramd.aEo());
      ((SendAppMessageTask)localObject1).scene = eZj;
      ((SendAppMessageTask)localObject1).appId = paramJSONObject.optString("appid");
      ((SendAppMessageTask)localObject1).thumbUrl = paramJSONObject.optString("img_url");
      ((SendAppMessageTask)localObject1).eTo = paramJSONObject.optString("src_username");
      ((SendAppMessageTask)localObject1).lHH = paramJSONObject.optString("src_displayname");
      ((SendAppMessageTask)localObject1).title = paramJSONObject.optString("title");
      ((SendAppMessageTask)localObject1).description = paramJSONObject.optString("desc");
      ((SendAppMessageTask)localObject1).lHI = paramd.zA(paramJSONObject.optString("link"));
      ((SendAppMessageTask)localObject1).eVw = bg.nl(paramd.lID);
      ((SendAppMessageTask)localObject1).lHJ = paramd.aEr();
      ((SendAppMessageTask)localObject1).verifyAppId = paramd.aEs();
      ((SendAppMessageTask)localObject1).extInfo = paramJSONObject.optString("review_data");
      paramJSONObject = new Bundle();
      paramJSONObject.putString("KPublisherId", bg.nl(paramd.ui.getString("KPublisherId")));
      localObject2 = paramd.ui.getString("geta8key_username");
      int i = com.tencent.mm.plugin.game.gamewebview.a.d.aa(paramd.scene, (String)localObject2);
      paramJSONObject.putString("preChatName", paramd.ui.getString("preChatName"));
      paramJSONObject.putInt("preMsgIndex", paramd.ui.getInt("preMsgIndex", 0));
      paramJSONObject.putString("prePublishId", paramd.ui.getString("prePublishId"));
      paramJSONObject.putString("preUsername", paramd.ui.getString("preUsername"));
      paramJSONObject.putInt("getA8KeyScene", i);
      paramJSONObject.putString("referUrl", paramd.lJH);
      ((SendAppMessageTask)localObject1).lHL = paramJSONObject;
      ((SendAppMessageTask)localObject1).aAb();
      paramd.v(paramInt, "send_app_msg:ok");
    }
  }
  
  private static class SendAppMessageTask
    extends GameProcessActivityTask
  {
    public static final Parcelable.Creator<SendAppMessageTask> CREATOR;
    String appId;
    String description;
    String eTo;
    String eVw;
    String extInfo;
    String ikS;
    String lHH;
    String lHI;
    String lHJ;
    String lHK;
    Bundle lHL;
    int scene;
    String thumbUrl;
    String title;
    String toUser;
    String verifyAppId;
    
    static
    {
      GMTrace.i(17043503972352L, 126984);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17043503972352L, 126984);
    }
    
    public SendAppMessageTask(Context paramContext)
    {
      super();
      GMTrace.i(17043235536896L, 126982);
      GMTrace.o(17043235536896L, 126982);
    }
    
    public SendAppMessageTask(Parcel paramParcel)
    {
      GMTrace.i(17043369754624L, 126983);
      f(paramParcel);
      GMTrace.o(17043369754624L, 126983);
    }
    
    public final void a(Context paramContext, final GameProcessActivityTask.a parama)
    {
      GMTrace.i(17042698665984L, 126978);
      switch (this.scene)
      {
      default: 
        w.i("MicroMsg.GameJsApiSendAppMessage", "sendToFriend");
        if (bg.nm(this.toUser))
        {
          w.e("MicroMsg.GameJsApiSendAppMessage", "toUser is null");
          GMTrace.o(17042698665984L, 126978);
          return;
        }
        break;
      case 1: 
        w.i("MicroMsg.GameJsApiSendAppMessage", "favoriteUrl");
        localObject1 = new cf();
        localObject2 = new b.a();
        ((b.a)localObject2).url = this.lHI;
        ((b.a)localObject2).thumbUrl = this.thumbUrl;
        ((b.a)localObject2).title = this.title;
        ((b.a)localObject2).desc = this.description;
        ((b.a)localObject2).eSd = this.appId;
        if (this.lHL != null)
        {
          localObject3 = u.gy(bg.nl(this.lHL.getString("KPublisherId")));
          u.b localb = u.Av().p((String)localObject3, true);
          localb.o("sendAppMsgScene", Integer.valueOf(2));
          localb.o("preChatName", this.lHL.getString("preChatName"));
          localb.o("preMsgIndex", Integer.valueOf(this.lHL.getInt("preMsgIndex")));
          localb.o("prePublishId", this.lHL.getString("prePublishId"));
          localb.o("preUsername", this.lHL.getString("preUsername"));
          localb.o("getA8KeyScene", Integer.valueOf(this.lHL.getInt("getA8KeyScene")));
          localb.o("referUrl", this.lHL.getString("referUrl"));
          if (!bg.nm(null)) {
            localb.o("adExtStr", null);
          }
          ((cf)localObject1).eDv.eDA = ((String)localObject3);
        }
        if ((paramContext != null) && ((paramContext instanceof MMActivity)))
        {
          ((cf)localObject1).eDv.activity = ((Activity)paramContext);
          ((cf)localObject1).eDv.eDC = 36;
        }
        ((cf)localObject1).eDv.eDE = new b.c()
        {
          public final void aDT()
          {
            GMTrace.i(17055449350144L, 127073);
            GMTrace.o(17055449350144L, 127073);
          }
          
          public final void onHide()
          {
            GMTrace.i(17055315132416L, 127072);
            w.d("MicroMsg.GameJsApiSendAppMessage", "onHide");
            parama.WW();
            GMTrace.o(17055315132416L, 127072);
          }
          
          public final void onShow()
          {
            GMTrace.i(17055180914688L, 127071);
            GMTrace.o(17055180914688L, 127071);
          }
        };
        com.tencent.mm.plugin.webview.model.b.a((cf)localObject1, (b.a)localObject2);
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        GMTrace.o(17042698665984L, 126978);
        return;
      }
      n.IY();
      Object localObject1 = com.tencent.mm.ao.b.hC(this.thumbUrl);
      Object localObject2 = new WXWebpageObject();
      ((WXWebpageObject)localObject2).webpageUrl = this.lHI;
      ((WXWebpageObject)localObject2).extInfo = this.extInfo;
      paramContext = new WXMediaMessage();
      paramContext.mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
      paramContext.title = this.title;
      paramContext.description = this.description;
      if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
      {
        w.i("MicroMsg.GameJsApiSendAppMessage", "thumb image is not null");
        localObject2 = new ByteArrayOutputStream();
        ((Bitmap)localObject1).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject2);
        paramContext.thumbData = ((ByteArrayOutputStream)localObject2).toByteArray();
      }
      Object localObject3 = g.aP(this.appId, true);
      localObject1 = new oj();
      ((oj)localObject1).eTm.eLU = paramContext;
      ((oj)localObject1).eTm.appId = this.appId;
      localObject2 = ((oj)localObject1).eTm;
      if (localObject3 == null)
      {
        paramContext = "";
        ((oj.a)localObject2).appName = paramContext;
        ((oj)localObject1).eTm.toUser = this.toUser;
        ((oj)localObject1).eTm.eTn = 2;
        if (!bg.nm(this.eTo)) {
          break label760;
        }
        ((oj)localObject1).eTm.eTq = null;
      }
      for (;;)
      {
        ((oj)localObject1).eTm.eTr = this.eVw;
        ((oj)localObject1).eTm.eTu = this.lHK;
        paramContext = u.gy(this.lHK);
        ((oj)localObject1).eTm.eDA = paramContext;
        ((oj)localObject1).eTm.eTs = this.lHJ;
        ((oj)localObject1).eTm.eTt = this.verifyAppId;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        if (!bg.nm(this.ikS))
        {
          paramContext = new ol();
          paramContext.eTx.eTy = this.toUser;
          paramContext.eTx.content = this.ikS;
          paramContext.eTx.type = s.go(this.toUser);
          paramContext.eTx.flags = 0;
          com.tencent.mm.sdk.b.a.vgX.m(paramContext);
        }
        parama.WW();
        GMTrace.o(17042698665984L, 126978);
        return;
        paramContext = ((f)localObject3).field_appName;
        break;
        label760:
        ((oj)localObject1).eTm.eTo = this.eTo;
        ((oj)localObject1).eTm.eTp = this.lHH;
      }
    }
    
    public int describeContents()
    {
      GMTrace.i(17042967101440L, 126980);
      GMTrace.o(17042967101440L, 126980);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(17042832883712L, 126979);
      this.scene = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.eTo = paramParcel.readString();
      this.lHH = paramParcel.readString();
      this.ikS = paramParcel.readString();
      this.toUser = paramParcel.readString();
      this.thumbUrl = paramParcel.readString();
      this.title = paramParcel.readString();
      this.description = paramParcel.readString();
      this.lHI = paramParcel.readString();
      this.extInfo = paramParcel.readString();
      this.eVw = paramParcel.readString();
      this.lHJ = paramParcel.readString();
      this.verifyAppId = paramParcel.readString();
      this.lHK = paramParcel.readString();
      this.lHL = paramParcel.readBundle();
      GMTrace.o(17042832883712L, 126979);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17043101319168L, 126981);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.scene);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.eTo);
      paramParcel.writeString(this.lHH);
      paramParcel.writeString(this.ikS);
      paramParcel.writeString(this.toUser);
      paramParcel.writeString(this.thumbUrl);
      paramParcel.writeString(this.title);
      paramParcel.writeString(this.description);
      paramParcel.writeString(this.lHI);
      paramParcel.writeString(this.eVw);
      paramParcel.writeString(this.lHJ);
      paramParcel.writeString(this.verifyAppId);
      paramParcel.writeString(this.lHK);
      paramParcel.writeString(this.extInfo);
      paramParcel.writeBundle(this.lHL);
      GMTrace.o(17043101319168L, 126981);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\GameJsApiSendAppMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */