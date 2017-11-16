package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.modelappbrand.j;
import com.tencent.mm.plugin.webview.fts.a.1;
import com.tencent.mm.plugin.webview.fts.a.2;
import com.tencent.mm.plugin.webview.fts.a.3;
import com.tencent.mm.plugin.webview.fts.a.4;
import com.tencent.mm.plugin.webview.fts.a.a;
import com.tencent.mm.plugin.webview.fts.c.b.a;
import com.tencent.mm.plugin.webview.fts.c.b.b;
import com.tencent.mm.plugin.webview.model.z;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.24;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.26;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseSearchWebviewUI
  extends WebViewUI
  implements b.b
{
  private View itY;
  protected boolean rOD;
  private com.tencent.mm.plugin.webview.fts.c.b rOE;
  private Set<b.a> rOF;
  
  public BaseSearchWebviewUI()
  {
    GMTrace.i(19406272856064L, 144588);
    this.rOF = new HashSet();
    GMTrace.o(19406272856064L, 144588);
  }
  
  private static int Y(Bundle paramBundle)
  {
    GMTrace.i(20427938201600L, 152200);
    int i = bg.Sy(paramBundle.getString("playerId"));
    GMTrace.o(20427938201600L, 152200);
    return i;
  }
  
  private void Z(Bundle paramBundle)
  {
    GMTrace.i(19406809726976L, 144592);
    Object localObject1 = new ArrayList();
    String str1 = paramBundle.getString("title");
    String str2 = paramBundle.getString("desc");
    Object localObject2 = paramBundle.getString("items");
    try
    {
      JSONArray localJSONArray = new JSONArray((String)localObject2);
      i = 0;
      if (i < localJSONArray.length())
      {
        localObject3 = localJSONArray.optJSONObject(i);
        z localz;
        if (localObject3 != null)
        {
          localz = new z();
          localz.iconUrl = ((JSONObject)localObject3).optString("icon");
          localz.title = ((JSONObject)localObject3).optString("title");
          if (((JSONObject)localObject3).optInt("selected") != 1) {
            break label157;
          }
        }
        label157:
        for (boolean bool = true;; bool = false)
        {
          localz.mbA = bool;
          localz.desc = ((JSONObject)localObject3).optString("desc");
          ((List)localObject1).add(localz);
          i += 1;
          break;
        }
      }
      localObject2 = com.tencent.mm.plugin.webview.fts.a.bBG();
    }
    catch (JSONException localJSONException)
    {
      w.e("BaseSearchWebviewUI", bg.f(localJSONException));
      w.v("BaseSearchWebviewUI", "doShowSearchActionSheet args: title %s,subTitle %s,items %s", new Object[] { str1, str2, localObject2 });
      if (((List)localObject1).isEmpty()) {
        break label414;
      }
    }
    Object localObject3 = new a.a()
    {
      public final void dD(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19410836258816L, 144622);
        if (BaseSearchWebviewUI.a(BaseSearchWebviewUI.this) != null)
        {
          com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald = BaseSearchWebviewUI.b(BaseSearchWebviewUI.this);
          if (!locald.rSa)
          {
            w.e("MicroMsg.JsApiHandler", "onSearchActionSheetClick fail, not ready");
            GMTrace.o(19410836258816L, 144622);
            return;
          }
          w.i("MicroMsg.JsApiHandler", "onSearchActionSheetClick success, ready");
          HashMap localHashMap = new HashMap();
          localHashMap.put("index", Integer.valueOf(paramAnonymousInt1));
          localHashMap.put("actionSheetId", Integer.valueOf(paramAnonymousInt2));
          af.t(new d.24(locald, i.a.a("onSearchActionSheetClick", localHashMap, locald.rSc, locald.rSd)));
        }
        GMTrace.o(19410836258816L, 144622);
      }
    };
    f localf = new f(this, f.xpR, true);
    int i = localf.hashCode();
    localf.xhT = new a.1((com.tencent.mm.plugin.webview.fts.a)localObject2, (List)localObject1);
    localf.qik = new a.2((com.tencent.mm.plugin.webview.fts.a)localObject2, (List)localObject1, localf);
    localf.qil = new a.3((com.tencent.mm.plugin.webview.fts.a)localObject2, (a.a)localObject3, i);
    localf.xqc = new a.4((com.tencent.mm.plugin.webview.fts.a)localObject2, (a.a)localObject3, i);
    localObject1 = View.inflate(this, R.i.cFs, null);
    if (!TextUtils.isEmpty(str1))
    {
      ((TextView)((View)localObject1).findViewById(R.h.title)).setText(str1);
      if (TextUtils.isEmpty(str2)) {
        break label439;
      }
      ((TextView)((View)localObject1).findViewById(R.h.cfZ)).setText(str2);
    }
    for (;;)
    {
      localf.xpY = true;
      localf.dH((View)localObject1);
      localf.bFk();
      ((com.tencent.mm.plugin.webview.fts.a)localObject2).rBm.put(Integer.valueOf(i), localf);
      paramBundle.putInt("actionSheetId", i);
      label414:
      GMTrace.o(19406809726976L, 144592);
      return;
      ((View)localObject1).findViewById(R.h.title).setVisibility(8);
      break;
      label439:
      ((View)localObject1).findViewById(R.h.cfZ).setVisibility(8);
    }
  }
  
  public final void a(b.a parama)
  {
    GMTrace.i(20427803983872L, 152199);
    this.rOF.add(parama);
    GMTrace.o(20427803983872L, 152199);
  }
  
  public void aaO()
  {
    GMTrace.i(20427669766144L, 152198);
    super.aaO();
    this.rOE.rBw = this.rBw;
    GMTrace.o(20427669766144L, 152198);
  }
  
  public final void bCb()
  {
    GMTrace.i(20428609290240L, 152205);
    if (this.itY == null)
    {
      GMTrace.o(20428609290240L, 152205);
      return;
    }
    Object localObject = (ViewGroup)getWindow().getDecorView();
    ((ViewGroup)localObject).setSystemUiVisibility(0);
    ((ViewGroup)localObject).removeView(this.itY);
    getWindow().clearFlags(1024);
    if (getRequestedOrientation() == 0) {
      setRequestedOrientation(1);
    }
    this.itY = null;
    localObject = this.rOF.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((b.a)((Iterator)localObject).next()).WU();
    }
    GMTrace.o(20428609290240L, 152205);
  }
  
  protected com.tencent.mm.plugin.webview.fts.b bES()
  {
    GMTrace.i(19406675509248L, 144591);
    GMTrace.o(19406675509248L, 144591);
    return null;
  }
  
  public void g(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(19406541291520L, 144590);
    switch (paramInt)
    {
    default: 
      super.g(paramInt, paramBundle);
    case 137: 
      do
      {
        GMTrace.o(19406541291520L, 144590);
        return;
        paramBundle = paramBundle.getString("fts_key_json_data");
      } while (this.rBw == null);
      try
      {
        localObject1 = this.rBw;
        af.t(new d.26((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1, i.a.a("onGetMatchContactList", new JSONObject(paramBundle), ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).rSc, ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).rSd)));
        GMTrace.o(19406541291520L, 144590);
        return;
      }
      catch (JSONException paramBundle)
      {
        w.printErrStackTrace("BaseSearchWebviewUI", paramBundle, "", new Object[0]);
        GMTrace.o(19406541291520L, 144590);
        return;
      }
    case 133: 
      Z(paramBundle);
      GMTrace.o(19406541291520L, 144590);
      return;
    case 134: 
      localObject1 = com.tencent.mm.plugin.webview.fts.a.bBG();
      paramInt = paramBundle.getInt("actionSheetId");
      paramBundle = (f)((com.tencent.mm.plugin.webview.fts.a)localObject1).rBm.remove(Integer.valueOf(paramInt));
      if (paramBundle != null) {
        paramBundle.bFl();
      }
      GMTrace.o(19406541291520L, 144590);
      return;
    case 100002: 
      localObject1 = bES();
      if (localObject1 != null)
      {
        paramInt = paramBundle.getInt("x", -1);
        int i = paramBundle.getInt("y", -1);
        String str = paramBundle.getString("widgetId");
        paramBundle = paramBundle.getString("eventId");
        w.v("FTSSearchWidgetMgr", "tapSearchWAWidgetView x %d, y %d, widgetId %s, eventId %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), str, paramBundle });
        Object localObject2 = (View)((com.tencent.mm.plugin.webview.fts.b)localObject1).rBr.get(str);
        if (localObject2 != null)
        {
          localObject2 = ((com.tencent.mm.plugin.webview.fts.b)localObject1).rBv.bB((View)localObject2);
          com.tencent.mm.plugin.webview.fts.b.a.b localb = new com.tencent.mm.plugin.webview.fts.b.a.b(paramInt, i, paramBundle);
          if (localObject2 == null) {
            w.e("BaseJsapiEvent", "null JSBridgeAccessible ");
          }
          for (boolean bool = false;; bool = ((j)localObject2).Q(localb.getName(), localb.bBO()))
          {
            if (!bool)
            {
              w.i("FTSSearchWidgetMgr", "onTap fail: exec js event %s ", new Object[] { str });
              ((com.tencent.mm.plugin.webview.fts.b)localObject1).rBw.a(paramBundle, false, "onTap fail: exec js event  " + str, str);
            }
            GMTrace.o(19406541291520L, 144590);
            return;
          }
        }
        w.i("FTSSearchWidgetMgr", "onTap fail: can not find Widget by widgetId %s", new Object[] { str });
        ((com.tencent.mm.plugin.webview.fts.b)localObject1).rBw.a(paramBundle, false, "onTap fail: can not find Widget by widgetId " + str, str);
        GMTrace.o(19406541291520L, 144590);
        return;
      }
      w.e("BaseSearchWebviewUI", "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView");
      this.rBw.a(paramBundle.getString(""), false, "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView", paramBundle.getString("widgetId"));
      GMTrace.o(19406541291520L, 144590);
      return;
    case 200000: 
      localObject1 = this.rOE;
      if (localObject1 != null) {
        ((com.tencent.mm.plugin.webview.fts.c.e)localObject1).t(Y(paramBundle), paramBundle.getString("viewProps"), paramBundle.getString("videoProps"));
      }
      GMTrace.o(19406541291520L, 144590);
      return;
    case 200001: 
      localObject1 = this.rOE;
      if (localObject1 != null) {
        ((com.tencent.mm.plugin.webview.fts.c.e)localObject1).u(Y(paramBundle), paramBundle.getString("viewProps"), paramBundle.getString("videoProps"));
      }
      GMTrace.o(19406541291520L, 144590);
      return;
    case 200002: 
      localObject1 = this.rOE;
      if (localObject1 != null) {
        ((com.tencent.mm.plugin.webview.fts.c.e)localObject1).xs(Y(paramBundle));
      }
      GMTrace.o(19406541291520L, 144590);
      return;
    }
    Object localObject1 = this.rOE;
    if (localObject1 != null) {
      ((com.tencent.mm.plugin.webview.fts.c.e)localObject1).aA(Y(paramBundle), paramBundle.getString("type"));
    }
    GMTrace.o(19406541291520L, 144590);
  }
  
  public final void j(View paramView, boolean paramBoolean)
  {
    GMTrace.i(20428475072512L, 152204);
    bCb();
    this.itY = paramView;
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    ViewGroup localViewGroup = (ViewGroup)getWindow().getDecorView();
    localViewGroup.addView(paramView, localLayoutParams);
    paramView.setX(0.0F);
    paramView.setY(0.0F);
    if (com.tencent.mm.compatible.util.d.eu(19)) {
      localViewGroup.setSystemUiVisibility(2);
    }
    for (;;)
    {
      getWindow().addFlags(1024);
      if (paramBoolean) {
        setRequestedOrientation(0);
      }
      GMTrace.o(20428475072512L, 152204);
      return;
      localViewGroup.setSystemUiVisibility(4098);
    }
  }
  
  public void onBackPressed()
  {
    GMTrace.i(20428743507968L, 152206);
    Iterator localIterator = this.rOF.iterator();
    for (boolean bool = false; localIterator.hasNext(); bool = ((b.a)localIterator.next()).Yb() | bool) {}
    if (!bool) {
      super.onBackPressed();
    }
    GMTrace.o(20428743507968L, 152206);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19406407073792L, 144589);
    super.onCreate(paramBundle);
    if (getIntent() != null) {
      this.rOD = getIntent().getBooleanExtra("jumpto_sns_contact_page", false);
    }
    this.rOE = new com.tencent.mm.plugin.webview.fts.c.b(this.vKB.vKW, this.nXD, this);
    GMTrace.o(19406407073792L, 144589);
  }
  
  public void onDestroy()
  {
    GMTrace.i(20428340854784L, 152203);
    super.onDestroy();
    Iterator localIterator = this.rOF.iterator();
    while (localIterator.hasNext()) {
      ((b.a)localIterator.next()).onDestroy();
    }
    this.rOF.clear();
    GMTrace.o(20428340854784L, 152203);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(20428877725696L, 152207);
    Iterator localIterator;
    if (paramInt == 25)
    {
      localIterator = this.rOF.iterator();
      while (localIterator.hasNext()) {
        ((b.a)localIterator.next()).bBZ();
      }
    }
    if (paramInt == 24)
    {
      localIterator = this.rOF.iterator();
      while (localIterator.hasNext()) {
        ((b.a)localIterator.next()).bCa();
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(20428877725696L, 152207);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(20428206637056L, 152202);
    super.onPause();
    Iterator localIterator = this.rOF.iterator();
    while (localIterator.hasNext()) {
      ((b.a)localIterator.next()).Wb();
    }
    GMTrace.o(20428206637056L, 152202);
  }
  
  protected void onResume()
  {
    GMTrace.i(20428072419328L, 152201);
    super.onResume();
    Iterator localIterator = this.rOF.iterator();
    while (localIterator.hasNext()) {
      ((b.a)localIterator.next()).Wz();
    }
    GMTrace.o(20428072419328L, 152201);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\fts\BaseSearchWebviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */