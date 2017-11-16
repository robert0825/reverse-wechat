package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ad
  extends a
{
  public static final int CTRL_BYTE = 242;
  public static final String NAME = "openGameRegion";
  
  public ad()
  {
    GMTrace.i(17030484852736L, 126887);
    GMTrace.o(17030484852736L, 126887);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17030619070464L, 126888);
    w.i("MicroMsg.GameJsApiOpenGameRegion", "invoke");
    paramJSONObject = paramd.aEo();
    paramJSONObject.vKC = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(17066857857024L, 127158);
        if (paramAnonymousInt1 == (ad.this.hashCode() & 0xFFFF))
        {
          if (paramAnonymousInt2 == -1)
          {
            if (paramAnonymousIntent != null)
            {
              paramAnonymousIntent = bg.aq(paramAnonymousIntent.getStringExtra("gameRegionName"), "");
              localObject = new HashMap();
              ((HashMap)localObject).put("gameRegionName", paramAnonymousIntent);
              paramd.v(paramInt, ad.d("get game region:ok", (Map)localObject));
              GMTrace.o(17066857857024L, 127158);
              return;
            }
            paramAnonymousIntent = paramd;
            paramAnonymousInt1 = paramInt;
            localObject = ad.this;
            paramAnonymousIntent.v(paramAnonymousInt1, a.d("get game region:fail", null));
            GMTrace.o(17066857857024L, 127158);
            return;
          }
          if (paramAnonymousInt2 == 1)
          {
            paramAnonymousIntent = paramd;
            paramAnonymousInt1 = paramInt;
            localObject = ad.this;
            paramAnonymousIntent.v(paramAnonymousInt1, a.d("get game region:fail", null));
            GMTrace.o(17066857857024L, 127158);
            return;
          }
          paramAnonymousIntent = paramd;
          paramAnonymousInt1 = paramInt;
          Object localObject = ad.this;
          paramAnonymousIntent.v(paramAnonymousInt1, a.d("get game region:cancel", null));
        }
        GMTrace.o(17066857857024L, 127158);
      }
    };
    com.tencent.mm.bj.d.a(paramJSONObject, "game", ".ui.GameRegionSelectUI", null, hashCode() & 0xFFFF, false);
    GMTrace.o(17030619070464L, 126888);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */