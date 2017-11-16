package com.tencent.mm.plugin.webview.fts.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper;
import com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  implements b.a
{
  public aj imK;
  public int imL;
  private com.tencent.mm.plugin.webview.ui.tools.jsapi.d rBw;
  private b.b rDJ;
  public FtsWebVideoView rDS;
  
  public d(FtsWebVideoView paramFtsWebVideoView, b.b paramb, com.tencent.mm.plugin.webview.ui.tools.jsapi.d paramd)
  {
    GMTrace.i(20489812574208L, 152661);
    this.rDS = paramFtsWebVideoView;
    this.rDJ = paramb;
    this.rDJ.a(this);
    this.rBw = paramd;
    GMTrace.o(20489812574208L, 152661);
  }
  
  public final void WU()
  {
    GMTrace.i(20490752098304L, 152668);
    GMTrace.o(20490752098304L, 152668);
  }
  
  public final void Wb()
  {
    GMTrace.i(20490483662848L, 152666);
    GMTrace.o(20490483662848L, 152666);
  }
  
  public final void Wz()
  {
    GMTrace.i(20490349445120L, 152665);
    GMTrace.o(20490349445120L, 152665);
  }
  
  public final void X(JSONObject paramJSONObject)
  {
    GMTrace.i(20489946791936L, 152662);
    this.rBw.a("onVideoPlayerCallback", null, paramJSONObject);
    GMTrace.o(20489946791936L, 152662);
  }
  
  public final JSONObject XK()
  {
    GMTrace.i(20490081009664L, 152663);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("data", this.rDS.ilT);
    GMTrace.o(20490081009664L, 152663);
    return localJSONObject;
  }
  
  public final void XL()
  {
    GMTrace.i(20490215227392L, 152664);
    if (this.imK != null) {
      this.imK.stopTimer();
    }
    GMTrace.o(20490215227392L, 152664);
  }
  
  public final boolean Yb()
  {
    GMTrace.i(20490886316032L, 152669);
    GMTrace.o(20490886316032L, 152669);
    return false;
  }
  
  public final JSONObject a(int paramInt, JSONObject paramJSONObject)
  {
    GMTrace.i(20491288969216L, 152672);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("playerId", this.rDS.ilU);
    localJSONObject.put("event", paramInt);
    if (paramJSONObject != null) {
      localJSONObject.put("detail", paramJSONObject);
    }
    GMTrace.o(20491288969216L, 152672);
    return localJSONObject;
  }
  
  public final void bBZ()
  {
    GMTrace.i(20491020533760L, 152670);
    GMTrace.o(20491020533760L, 152670);
  }
  
  public final void bCa()
  {
    GMTrace.i(20491154751488L, 152671);
    GMTrace.o(20491154751488L, 152671);
  }
  
  public final void clean()
  {
    GMTrace.i(21050440024064L, 156838);
    w.i("MicroMsg.JsApiVideoCallback", "clean %s", new Object[] { toString() });
    XL();
    GMTrace.o(21050440024064L, 156838);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(20490617880576L, 152667);
    w.d("MicroMsg.JsApiVideoCallback", "onDestroy clean");
    clean();
    this.rDS.rDp = null;
    GMTrace.o(20490617880576L, 152667);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */