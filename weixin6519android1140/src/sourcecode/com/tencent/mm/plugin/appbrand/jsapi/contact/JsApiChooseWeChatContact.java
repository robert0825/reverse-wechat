package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JsApiChooseWeChatContact
  extends a
{
  public static final int CTRL_INDEX = 195;
  public static final String NAME = "chooseWeChatContact";
  
  public JsApiChooseWeChatContact()
  {
    GMTrace.i(19806912774144L, 147573);
    GMTrace.o(19806912774144L, 147573);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19807046991872L, 147574);
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      w.e("MicroMsg.JsApiChooseWeChatContact", "ChooseWeChatContact context is null, appId is %s", new Object[] { paramj.hyD });
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(19807046991872L, 147574);
      return;
    }
    w.i("MicroMsg.JsApiChooseWeChatContact", "ChooseWeChatContact appId:%s", new Object[] { paramj.hyD });
    Intent localIntent = new Intent();
    String str2 = localMMActivity.getString(o.i.hGT);
    int j = 259;
    int[] arrayOfInt2 = new int[2];
    int[] tmp108_106 = arrayOfInt2;
    tmp108_106[0] = 131072;
    int[] tmp113_108 = tmp108_106;
    tmp113_108[1] = 131075;
    tmp113_108;
    w.i("MicroMsg.JsApiChooseWeChatContact", "ChooseWeChatContact data %s:", new Object[] { paramJSONObject });
    int[] arrayOfInt1 = arrayOfInt2;
    int i = j;
    String str1 = str2;
    if (paramJSONObject != null)
    {
      arrayOfInt1 = arrayOfInt2;
      i = j;
      str1 = str2;
      if (paramJSONObject.optJSONArray("contactMode") != null)
      {
        arrayOfInt1 = arrayOfInt2;
        i = j;
        str1 = str2;
        if (paramJSONObject.optJSONArray("contactMode").length() > 0)
        {
          paramJSONObject = paramJSONObject.optJSONArray("contactMode").toString();
          if ((!paramJSONObject.contains("singleContact")) || (paramJSONObject.contains("chatroom"))) {
            break label364;
          }
          i = 263;
          str1 = localMMActivity.getString(o.i.hGS);
          arrayOfInt1 = new int[1];
          arrayOfInt1[0] = 131072;
        }
      }
    }
    for (;;)
    {
      localIntent.putExtra("Select_Conv_Type", i);
      localIntent.putExtra("jsapi_select_mode", 1);
      localIntent.putExtra("select_is_ret", true);
      localIntent.putExtra("scene_from", 9);
      localIntent.putExtra("Select_Conv_ui_title", str1);
      localIntent.putExtra("search_range", arrayOfInt1);
      paramJSONObject = new GetUserDataTask("");
      AppBrandMainProcessService.b(paramJSONObject);
      localIntent.putExtra("Select_block_List", paramJSONObject.iec);
      com.tencent.mm.bj.d.a(localMMActivity, ".ui.transmit.SelectConversationUI", localIntent, 100, new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          GMTrace.i(19803691548672L, 147549);
          if (100 != paramAnonymousInt1)
          {
            w.e("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact requestCode not equal, requestCode = %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
            paramj.v(paramInt, JsApiChooseWeChatContact.this.d("fail", null));
            GMTrace.o(19803691548672L, 147549);
            return;
          }
          if ((paramAnonymousInt2 == 0) || (paramAnonymousInt2 == 1))
          {
            w.e("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact user cancel, resultCode = %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
            paramj.v(paramInt, JsApiChooseWeChatContact.this.d("cancel", null));
            GMTrace.o(19803691548672L, 147549);
            return;
          }
          if (paramAnonymousInt2 == -1)
          {
            if (paramAnonymousIntent == null) {}
            for (paramAnonymousIntent = null; (paramAnonymousIntent == null) || (paramAnonymousIntent.length() == 0); paramAnonymousIntent = paramAnonymousIntent.getStringExtra("Select_Conv_User"))
            {
              w.e("MicroMsg.JsApiChooseWeChatContact", "mmOnActivityResult, selectSingleContact fail, user is null");
              paramj.v(paramInt, JsApiChooseWeChatContact.this.d("fail", null));
              GMTrace.o(19803691548672L, 147549);
              return;
            }
            Object localObject = new JsApiChooseWeChatContact.GetUserDataTask(paramAnonymousIntent);
            AppBrandMainProcessService.b((MainProcessTask)localObject);
            String str1 = ((JsApiChooseWeChatContact.GetUserDataTask)localObject).aDn;
            String str2 = ((JsApiChooseWeChatContact.GetUserDataTask)localObject).aDo;
            localObject = ((JsApiChooseWeChatContact.GetUserDataTask)localObject).ied;
            HashMap localHashMap = new HashMap();
            localHashMap.put("avatarUrl", localObject);
            localHashMap.put("userName", paramAnonymousIntent);
            localHashMap.put("nickName", str1);
            localHashMap.put("remarkName", str2);
            w.i("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact: nickName:%s, remarkName:%s", new Object[] { str1, str2 });
            paramj.v(paramInt, JsApiChooseWeChatContact.this.d("ok", localHashMap));
          }
          GMTrace.o(19803691548672L, 147549);
        }
      });
      GMTrace.o(19807046991872L, 147574);
      return;
      label364:
      arrayOfInt1 = arrayOfInt2;
      i = j;
      str1 = str2;
      if (paramJSONObject.contains("chatroom"))
      {
        arrayOfInt1 = arrayOfInt2;
        i = j;
        str1 = str2;
        if (!paramJSONObject.contains("singleContact"))
        {
          i = 275;
          arrayOfInt1 = new int[1];
          arrayOfInt1[0] = 131075;
          str1 = str2;
        }
      }
    }
  }
  
  private static class GetUserDataTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetUserDataTask> CREATOR;
    String aDn;
    String aDo;
    public String iec;
    String ied;
    public String userName;
    
    static
    {
      GMTrace.i(19804496855040L, 147555);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19804496855040L, 147555);
    }
    
    public GetUserDataTask(Parcel paramParcel)
    {
      GMTrace.i(19803959984128L, 147551);
      this.ied = "";
      f(paramParcel);
      GMTrace.o(19803959984128L, 147551);
    }
    
    public GetUserDataTask(String paramString)
    {
      GMTrace.i(19803825766400L, 147550);
      this.ied = "";
      this.userName = paramString;
      GMTrace.o(19803825766400L, 147550);
    }
    
    public final void RY()
    {
      GMTrace.i(19804094201856L, 147552);
      this.iec = q.zE();
      if (!TextUtils.isEmpty(this.userName))
      {
        this.aDn = r.fr(this.userName);
        this.aDo = r.ft(this.userName);
        h localh = n.Di().ig(this.userName);
        if (localh != null)
        {
          this.ied = localh.Do();
          if (bg.nm(this.ied)) {
            this.ied = localh.Dp();
          }
        }
      }
      GMTrace.o(19804094201856L, 147552);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19804228419584L, 147553);
      this.iec = paramParcel.readString();
      this.userName = paramParcel.readString();
      this.aDn = paramParcel.readString();
      this.aDo = paramParcel.readString();
      this.ied = paramParcel.readString();
      GMTrace.o(19804228419584L, 147553);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19804362637312L, 147554);
      paramParcel.writeString(this.iec);
      paramParcel.writeString(this.userName);
      paramParcel.writeString(this.aDn);
      paramParcel.writeString(this.aDo);
      paramParcel.writeString(this.ied);
      GMTrace.o(19804362637312L, 147554);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\contact\JsApiChooseWeChatContact.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */