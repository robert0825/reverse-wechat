package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 277;
  public static final String NAME = "startSoterAuthentication";
  
  public b()
  {
    GMTrace.i(16542737629184L, 123253);
    GMTrace.o(16542737629184L, 123253);
  }
  
  public final void a(j paramj, int paramInt, Bundle paramBundle, String paramString)
  {
    GMTrace.i(16543006064640L, 123255);
    int j = -1;
    String str1 = "not returned";
    String str3 = "";
    String str2 = "";
    int i = 0;
    if (paramBundle != null)
    {
      j = paramBundle.getInt("err_code");
      str1 = paramBundle.getString("err_msg");
      str3 = paramBundle.getString("result_json");
      str2 = paramBundle.getString("result_json_signature");
      i = paramBundle.getByte("use_mode");
    }
    JSONArray localJSONArray = a.iC(i);
    Object localObject = "";
    paramBundle = (Bundle)localObject;
    if (localJSONArray.length() > 0) {}
    try
    {
      paramBundle = localJSONArray.getString(0);
      localObject = new HashMap(5);
      ((Map)localObject).put("authMode", paramBundle);
      ((Map)localObject).put("errCode", Integer.valueOf(j));
      ((Map)localObject).put("resultJSON", str3);
      ((Map)localObject).put("resultJSONSignature", str2);
      paramBundle = paramString;
      if ("fail".equals(paramString)) {
        paramBundle = paramString + " " + str1;
      }
      paramj.v(paramInt, d(paramBundle, (Map)localObject));
      GMTrace.o(16543006064640L, 123255);
      return;
    }
    catch (JSONException paramBundle)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.JsApiStartSoterAuthentication", paramBundle, "hy: json error in callback", new Object[0]);
        paramBundle = (Bundle)localObject;
      }
    }
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(16542871846912L, 123254);
    w.i("MicroMsg.JsApiStartSoterAuthentication", "hy: JsApiStartSoterAuthentication");
    super.a(paramj, paramJSONObject, paramInt);
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      w.e("MicroMsg.JsApiStartSoterAuthentication", "JsApiStartSoterAuthentication context is null, appId is %s", new Object[] { paramj.hyD });
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(16542871846912L, 123254);
      return;
    }
    JSONArray localJSONArray = paramJSONObject.optJSONArray("requestAuthModes");
    String str = paramJSONObject.optString("challenge");
    paramJSONObject = paramJSONObject.optString("authContent");
    Intent localIntent = new Intent();
    localIntent.putExtra("auth_mode", a.g(localJSONArray));
    localIntent.putExtra("challenge", str);
    localIntent.putExtra("auth_content", paramJSONObject);
    localIntent.putExtra("key_soter_fp_mp_scene", 0);
    localMMActivity.vKC = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        b localb = null;
        Object localObject2 = null;
        Object localObject1 = null;
        GMTrace.i(16540455927808L, 123236);
        if (paramAnonymousInt1 == 1000)
        {
          if (paramAnonymousInt2 == -1)
          {
            w.i("MicroMsg.JsApiStartSoterAuthentication", "hy: soter auth ok");
            localb = b.this;
            localObject2 = paramj;
            paramAnonymousInt1 = paramInt;
            if (paramAnonymousIntent != null) {
              localObject1 = paramAnonymousIntent.getExtras();
            }
            localb.a((j)localObject2, paramAnonymousInt1, (Bundle)localObject1, "ok");
            GMTrace.o(16540455927808L, 123236);
            return;
          }
          if (paramAnonymousInt2 == 1)
          {
            w.w("MicroMsg.JsApiStartSoterAuthentication", "hy: soter auth failed");
            localObject2 = b.this;
            localj = paramj;
            paramAnonymousInt1 = paramInt;
            localObject1 = localb;
            if (paramAnonymousIntent != null) {
              localObject1 = paramAnonymousIntent.getExtras();
            }
            ((b)localObject2).a(localj, paramAnonymousInt1, (Bundle)localObject1, "fail");
            GMTrace.o(16540455927808L, 123236);
            return;
          }
          w.e("MicroMsg.JsApiStartSoterAuthentication", "hy: soter user cancelled");
          localb = b.this;
          j localj = paramj;
          paramAnonymousInt1 = paramInt;
          localObject1 = localObject2;
          if (paramAnonymousIntent != null) {
            localObject1 = paramAnonymousIntent.getExtras();
          }
          localb.a(localj, paramAnonymousInt1, (Bundle)localObject1, "cancel");
        }
        GMTrace.o(16540455927808L, 123236);
      }
    };
    com.tencent.mm.bj.d.b(localMMActivity, "soter_mp", ".ui.SoterAuthenticationUI", localIntent, 1000);
    GMTrace.o(16542871846912L, 123254);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bio\soter\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */