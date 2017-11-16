package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.nfc.HCEService;
import com.tencent.mm.plugin.nfc.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends JsApiAppBrandNFCBase
{
  public static final int CTRL_INDEX = 352;
  public static final String NAME = "startHCE";
  private int hXU;
  MMActivity hyB;
  public j hyI;
  private JSONObject idm;
  
  public d()
  {
    GMTrace.i(20712748220416L, 154322);
    this.hyB = null;
    this.hyI = null;
    this.hXU = -1;
    GMTrace.o(20712748220416L, 154322);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(20712882438144L, 154323);
    w.i("MicroMsg.JsApiNFCStartHCE", "alvinluo appbrand start HCE, data: %s", new Object[] { paramJSONObject.toString() });
    this.hyI = paramj;
    this.hXU = paramInt;
    this.idm = paramJSONObject;
    a(new JsApiAppBrandNFCBase.a()
    {
      public final void z(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(20715566792704L, 154343);
        Object localObject = new HashMap();
        ((Map)localObject).put("errCode", Integer.valueOf(paramAnonymousInt));
        if (paramAnonymousInt == 0)
        {
          paramAnonymousString = d.this;
          paramAnonymousString.hyB = paramAnonymousString.a(paramAnonymousString.hyI);
          if (paramAnonymousString.hyB == null)
          {
            paramAnonymousString.qp(paramAnonymousString.d("fail: unknown error", null));
            GMTrace.o(20715566792704L, 154343);
            return;
          }
          localObject = new Intent();
          d.2 local2 = new d.2(paramAnonymousString);
          paramAnonymousString.hyB.vKC = local2;
          com.tencent.mm.bj.d.b(paramAnonymousString.hyB, "nfc", "com.tencent.mm.plugin.hce.ui.HCETransparentUI", (Intent)localObject, 1);
          GMTrace.o(20715566792704L, 154343);
          return;
        }
        a.bz(d.this.hyI.hyD, paramAnonymousInt);
        d.this.qp(d.this.d("fail: " + paramAnonymousString, (Map)localObject));
        GMTrace.o(20715566792704L, 154343);
      }
    });
    GMTrace.o(20712882438144L, 154323);
  }
  
  final void onSuccess()
  {
    int i = 0;
    GMTrace.i(20713150873600L, 154325);
    final HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    try
    {
      localObject = this.idm.getJSONArray("aid_list");
      int j = ((JSONArray)localObject).length();
      w.i("MicroMsg.JsApiNFCStartHCE", "alvinluo mData: %s, aidList: %s, length: %d", new Object[] { this.idm.toString(), ((JSONArray)localObject).toString(), Integer.valueOf(j) });
      while (i < j)
      {
        localArrayList.add(((JSONArray)localObject).get(i).toString());
        i += 1;
      }
      HCEEventLogic.a.Xc();
    }
    catch (Exception localException)
    {
      localHashMap.put("errCode", Integer.valueOf(13003));
      qp(d("fail: aid_list invalid", localHashMap));
      a.bz(this.hyI.hyD, 13003);
      GMTrace.o(20713150873600L, 154325);
      return;
    }
    Object localObject = new Intent(this.hyB, HCEService.class);
    ((Intent)localObject).putExtra("key_appid", this.hyI.hyD);
    ((Intent)localObject).putStringArrayListExtra("key_aid_list", localException);
    this.hyB.startService((Intent)localObject);
    HCEEventLogic.a(new HCEEventLogic.b()
    {
      public final void k(String paramAnonymousString1, int paramAnonymousInt, String paramAnonymousString2)
      {
        GMTrace.i(20718116929536L, 154362);
        if ((paramAnonymousString1 != null) && (!paramAnonymousString1.equals(d.this.hyI.hyD)))
        {
          w.e("MicroMsg.JsApiNFCStartHCE", "alvinluo start HCESevice callback appId invalid, appId: %s", new Object[] { paramAnonymousString1 });
          localHashMap.put("errCode", Integer.valueOf(13010));
          a.bz(d.this.hyI.hyD, 13010);
          d.this.qp(d.this.d("fail: unknown error", localHashMap));
          d.this.release();
          GMTrace.o(20718116929536L, 154362);
          return;
        }
        w.i("MicroMsg.JsApiNFCStartHCE", "alvinluo HCE start HCEService callback onFinish errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString2 });
        if (paramAnonymousInt == 0)
        {
          HCEEventLogic.qJ(d.this.hyI.hyD);
          localHashMap.put("errCode", Integer.valueOf(0));
          d.this.qp(d.this.d("ok", localHashMap));
        }
        for (;;)
        {
          a.bz(d.this.hyI.hyD, paramAnonymousInt);
          d.this.release();
          GMTrace.o(20718116929536L, 154362);
          return;
          localHashMap.put("errCode", Integer.valueOf(paramAnonymousInt));
          d.this.qp(d.this.d("fail: " + paramAnonymousString2, localHashMap));
        }
      }
    });
    GMTrace.o(20713150873600L, 154325);
  }
  
  public final void qp(String paramString)
  {
    GMTrace.i(20713016655872L, 154324);
    w.i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE callback result: %s", new Object[] { paramString });
    if (this.hyI != null) {
      this.hyI.v(this.hXU, paramString);
    }
    GMTrace.o(20713016655872L, 154324);
  }
  
  public final void release()
  {
    GMTrace.i(20713285091328L, 154326);
    HCEEventLogic.a(null);
    this.hyI = null;
    GMTrace.o(20713285091328L, 154326);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\nfc\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */