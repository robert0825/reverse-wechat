package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class r
  extends a
{
  public static final int CTRL_INDEX = 286;
  public static final String NAME = "chooseInvoiceTitle";
  
  public r()
  {
    GMTrace.i(18200729223168L, 135606);
    GMTrace.o(18200729223168L, 135606);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(18200863440896L, 135607);
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("req_scene", 0);
    paramJSONObject.putExtra("launch_from_appbrand", true);
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(18200863440896L, 135607);
      return;
    }
    localMMActivity.vKC = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(18203010924544L, 135623);
        if (paramAnonymousInt1 != (r.this.hashCode() & 0xFFFF))
        {
          GMTrace.o(18203010924544L, 135623);
          return;
        }
        if ((paramAnonymousInt2 == -1) && (paramAnonymousIntent != null))
        {
          HashMap localHashMap = new HashMap();
          paramAnonymousIntent = bg.aq(paramAnonymousIntent.getStringExtra("choose_invoice_title_info"), "");
          w.i("MicroMsg.JsApiChooseInvoiceTitle", "choose_invoice_title_info is : " + paramAnonymousIntent);
          localHashMap.put("invoiceTitleInfo", paramAnonymousIntent);
          paramj.v(paramInt, r.this.d("ok", localHashMap));
          GMTrace.o(18203010924544L, 135623);
          return;
        }
        if (paramAnonymousInt2 == 0)
        {
          paramj.v(paramInt, r.this.d("cancel", null));
          GMTrace.o(18203010924544L, 135623);
          return;
        }
        paramj.v(paramInt, r.this.d("fail", null));
        GMTrace.o(18203010924544L, 135623);
      }
    };
    com.tencent.mm.bj.d.a(localMMActivity, "address", ".ui.InvoiceListUI", paramJSONObject, hashCode() & 0xFFFF, false);
    GMTrace.o(18200863440896L, 135607);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */