package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_BYTE = 111;
  public static final String NAME = "batchViewCard";
  
  public e()
  {
    GMTrace.i(17031692812288L, 126896);
    GMTrace.o(17031692812288L, 126896);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17031827030016L, 126897);
    w.i("MicroMsg.GameJsApiBatchViewCard", "invoke");
    Object localObject = paramJSONObject.optString("card_list");
    String str = paramJSONObject.optString("tempalate_id");
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("card_list", (String)localObject);
    paramJSONObject.putExtra("key_template_id", str);
    paramJSONObject.putExtra("key_from_scene", 7);
    localObject = paramd.aEo();
    ((MMActivity)localObject).vKC = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(17033571860480L, 126910);
        if (paramAnonymousInt1 == (e.this.hashCode() & 0xFFFF))
        {
          if (paramAnonymousInt2 == -1)
          {
            paramAnonymousIntent = paramd;
            paramAnonymousInt1 = paramInt;
            locale = e.this;
            paramAnonymousIntent.v(paramAnonymousInt1, a.d("batch_view_card:ok", null));
            GMTrace.o(17033571860480L, 126910);
            return;
          }
          paramAnonymousIntent = paramd;
          paramAnonymousInt1 = paramInt;
          e locale = e.this;
          paramAnonymousIntent.v(paramAnonymousInt1, a.d("batch_view_card:fail", null));
        }
        GMTrace.o(17033571860480L, 126910);
      }
    };
    com.tencent.mm.bj.d.a((Context)localObject, "card", ".ui.CardViewEntranceUI", paramJSONObject, hashCode() & 0xFFFF, false);
    GMTrace.o(17031827030016L, 126897);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */