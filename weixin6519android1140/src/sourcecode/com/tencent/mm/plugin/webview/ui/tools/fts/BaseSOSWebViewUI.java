package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.ImageButton;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.az.q;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.webview.fts.b;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.i;
import com.tencent.mm.plugin.webview.ui.tools.f;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.27;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.a;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.b;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
import com.tencent.mm.ui.fts.widget.a.b;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseSOSWebViewUI
  extends BaseSearchWebviewUI
  implements FTSEditTextView.a
{
  String eDA;
  protected ImageButton nta;
  private boolean rNN;
  View rOk;
  protected SOSEditTextView rOl;
  protected View rOm;
  private List<c> rOn;
  protected int rOo;
  protected int rOp;
  private b rOq;
  boolean rOr;
  boolean rOs;
  int scene;
  int type;
  
  public BaseSOSWebViewUI()
  {
    GMTrace.i(16213367324672L, 120799);
    this.rOp = 0;
    GMTrace.o(16213367324672L, 120799);
  }
  
  protected static boolean bEQ()
  {
    GMTrace.i(16215246372864L, 120813);
    GMTrace.o(16215246372864L, 120813);
    return true;
  }
  
  protected static boolean bER()
  {
    GMTrace.i(16215380590592L, 120814);
    GMTrace.o(16215380590592L, 120814);
    return true;
  }
  
  public void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    GMTrace.i(16893985423360L, 125870);
    w.i("MicroMsg.FTS.BaseSOSWebViewUI", "onEditTextChange %s %s %s", new Object[] { paramString1, paramString2, paramb });
    if ((paramb == FTSEditTextView.b.xda) || (paramb == FTSEditTextView.b.xdb)) {
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16221688823808L, 120861);
          if (BaseSOSWebViewUI.h(BaseSOSWebViewUI.this) != null) {
            BaseSOSWebViewUI.i(BaseSOSWebViewUI.this).b(BaseSOSWebViewUI.this.bET(), BaseSOSWebViewUI.this.bEV(), BaseSOSWebViewUI.this.bEW());
          }
          GMTrace.o(16221688823808L, 120861);
        }
      });
    }
    GMTrace.o(16893985423360L, 125870);
  }
  
  public boolean aaM()
  {
    GMTrace.i(16215112155136L, 120812);
    this.rOl.wjB.clearFocus();
    aLo();
    if (this.rOl.bET().length() > 0)
    {
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17832435777536L, 132862);
          if (BaseSOSWebViewUI.l(BaseSOSWebViewUI.this) != null)
          {
            HashMap localHashMap1 = new HashMap();
            if (BaseSOSWebViewUI.this.bEO() != 0)
            {
              localHashMap1.put("sugClickType", Integer.valueOf(BaseSOSWebViewUI.this.bEO()));
              localHashMap1.put("sugId", BaseSOSWebViewUI.this.bEN());
            }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald = BaseSOSWebViewUI.m(BaseSOSWebViewUI.this);
            String str1 = BaseSOSWebViewUI.this.bET();
            String str2 = BaseSOSWebViewUI.this.bEV();
            JSONArray localJSONArray = BaseSOSWebViewUI.this.bEW();
            HashMap localHashMap2 = new HashMap();
            localHashMap2.putAll(localHashMap1);
            localHashMap2.put("query", str1);
            localHashMap2.put("custom", str2);
            localHashMap2.put("tagList", localJSONArray);
            locald.a("onSearchInputConfirm", localHashMap2, null);
          }
          GMTrace.o(17832435777536L, 132862);
        }
      });
      aLo();
      this.rOr = true;
      GMTrace.o(16215112155136L, 120812);
      return true;
    }
    GMTrace.o(16215112155136L, 120812);
    return true;
  }
  
  protected void aaO()
  {
    GMTrace.i(16213769977856L, 120802);
    super.aaO();
    this.type = getIntent().getIntExtra("ftsType", 0);
    this.rOo = this.type;
    this.scene = getIntent().getIntExtra("ftsbizscene", 3);
    this.rNN = getIntent().getBooleanExtra("ftsneedkeyboard", false);
    this.eDA = getIntent().getStringExtra("ftssessionid");
    this.rOk = findViewById(R.h.cax);
    this.rOl = ((SOSEditTextView)findViewById(R.h.cfw));
    this.rOl.xcX = this;
    this.rOl.Jd(getHint());
    this.rOm = findViewById(R.h.biN);
    this.rOm.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16212159365120L, 120790);
        BaseSOSWebViewUI.this.bEL();
        GMTrace.o(16212159365120L, 120790);
      }
    });
    this.nta = ((ImageButton)findViewById(R.h.bfv));
    this.nta.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16212964671488L, 120796);
        BaseSOSWebViewUI.this.bEI();
        GMTrace.o(16212964671488L, 120796);
      }
    });
    this.nXD.setWebViewClient(new b());
    this.nXD.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16229473452032L, 120919);
        BaseSOSWebViewUI.this.bEP().wjB.clearFocus();
        BaseSOSWebViewUI.this.aLo();
        GMTrace.o(16229473452032L, 120919);
        return false;
      }
    });
    if (this.rMj != null) {
      this.rMj.jw(true);
    }
    this.nXD.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(16226789097472L, 120899);
        GMTrace.o(16226789097472L, 120899);
        return true;
      }
    });
    this.rOq.rBw = this.rBw;
    GMTrace.o(16213769977856L, 120802);
  }
  
  protected final int bDV()
  {
    GMTrace.i(16213635760128L, 120801);
    int i = this.iDc;
    GMTrace.o(16213635760128L, 120801);
    return i;
  }
  
  protected final void bEI()
  {
    GMTrace.i(16213904195584L, 120803);
    aLo();
    if ((this.rOn != null) && (this.rOn.size() > 1))
    {
      this.rOn.remove(0);
      final c localc = (c)this.rOn.get(0);
      this.rOl.s(localc.rOB, localc.qfY);
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16221957259264L, 120863);
          if (BaseSOSWebViewUI.a(BaseSOSWebViewUI.this) != null)
          {
            BaseSOSWebViewUI.this.bEJ();
            int i = BaseSOSWebViewUI.this.rOo;
            BaseSOSWebViewUI.this.rOo = localc.type;
            BaseSOSWebViewUI.this.bEK();
            Bundle localBundle = new Bundle();
            localBundle.putInt("type", BaseSOSWebViewUI.this.rOo);
            localBundle.putBoolean("isHomePage", true);
            if (BaseSOSWebViewUI.this.rOo != 0) {
              localBundle.putInt("scene", 22);
            }
            try
            {
              for (;;)
              {
                localBundle = BaseSOSWebViewUI.b(BaseSOSWebViewUI.this).n(4, localBundle);
                HashMap localHashMap = new HashMap();
                localHashMap.put("isBackButtonClick", "1");
                localHashMap.put("custom", BaseSOSWebViewUI.this.bEV());
                if (BaseSOSWebViewUI.this.rOo == i) {
                  break;
                }
                BaseSOSWebViewUI.c(BaseSOSWebViewUI.this).a(localBundle.getString("scene", "0"), localBundle.getString("type", "0"), localBundle.getString("isSug", "0"), localBundle.getString("isLocalSug", "0"), BaseSOSWebViewUI.this.eDA, localHashMap, localc.rOC);
                GMTrace.o(16221957259264L, 120863);
                return;
                localBundle.putInt("scene", 20);
              }
              BaseSOSWebViewUI.d(BaseSOSWebViewUI.this).a(BaseSOSWebViewUI.this.bET(), BaseSOSWebViewUI.this.bEV(), BaseSOSWebViewUI.this.bEW(), 1, localc.rOC);
              GMTrace.o(16221957259264L, 120863);
              return;
            }
            catch (RemoteException localRemoteException) {}
          }
          GMTrace.o(16221957259264L, 120863);
        }
      });
      GMTrace.o(16213904195584L, 120803);
      return;
    }
    if (this.rOr)
    {
      bEL();
      GMTrace.o(16213904195584L, 120803);
      return;
    }
    finish();
    GMTrace.o(16213904195584L, 120803);
  }
  
  protected void bEJ()
  {
    GMTrace.i(16893582770176L, 125867);
    GMTrace.o(16893582770176L, 125867);
  }
  
  protected void bEK()
  {
    GMTrace.i(16893716987904L, 125868);
    GMTrace.o(16893716987904L, 125868);
  }
  
  protected void bEL()
  {
    GMTrace.i(16214038413312L, 120804);
    this.rOl.s("", null);
    aLo();
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16211622494208L, 120786);
        if (BaseSOSWebViewUI.e(BaseSOSWebViewUI.this) != null)
        {
          com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald = BaseSOSWebViewUI.g(BaseSOSWebViewUI.this);
          int i = BaseSOSWebViewUI.f(BaseSOSWebViewUI.this);
          HashMap localHashMap = new HashMap();
          localHashMap.put("isCancelButtonClick", Integer.valueOf(1));
          localHashMap.put("isInputChange", Integer.valueOf(1));
          localHashMap.put("scene", Integer.valueOf(i));
          locald.a("onSearchInputChange", localHashMap, null);
        }
        GMTrace.o(16211622494208L, 120786);
      }
    });
    this.rOn = null;
    this.rOr = false;
    this.rOq.onDestroy();
    GMTrace.o(16214038413312L, 120804);
  }
  
  protected void bEM()
  {
    GMTrace.i(19407749251072L, 144599);
    GMTrace.o(19407749251072L, 144599);
  }
  
  protected String bEN()
  {
    GMTrace.i(16265846456320L, 121190);
    GMTrace.o(16265846456320L, 121190);
    return "";
  }
  
  protected int bEO()
  {
    GMTrace.i(16265980674048L, 121191);
    GMTrace.o(16265980674048L, 121191);
    return 0;
  }
  
  public final SOSEditTextView bEP()
  {
    GMTrace.i(16894119641088L, 125871);
    SOSEditTextView localSOSEditTextView = this.rOl;
    GMTrace.o(16894119641088L, 125871);
    return localSOSEditTextView;
  }
  
  protected final b bES()
  {
    GMTrace.i(19407883468800L, 144600);
    b localb = this.rOq;
    GMTrace.o(19407883468800L, 144600);
    return localb;
  }
  
  protected final String bET()
  {
    GMTrace.i(16894253858816L, 125872);
    String str = this.rOl.bET();
    GMTrace.o(16894253858816L, 125872);
    return str;
  }
  
  protected final int bEU()
  {
    GMTrace.i(20429548814336L, 152212);
    int i = this.rOo;
    GMTrace.o(20429548814336L, 152212);
    return i;
  }
  
  protected final String bEV()
  {
    GMTrace.i(16894388076544L, 125873);
    String str = this.rOl.bEV();
    GMTrace.o(16894388076544L, 125873);
    return str;
  }
  
  public final JSONArray bEW()
  {
    GMTrace.i(16216051679232L, 120819);
    Object localObject = this.rOl.qfY;
    JSONArray localJSONArray = new JSONArray();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("tagName", locala.rOy);
        localJSONObject.put("tagType", locala.rOz);
        localJSONObject.put("userName", locala.userName);
        localJSONArray.put(localJSONObject);
      }
      catch (JSONException localJSONException) {}
    }
    GMTrace.o(16216051679232L, 120819);
    return localJSONArray;
  }
  
  protected boolean bEX()
  {
    GMTrace.i(20429683032064L, 152213);
    GMTrace.o(20429683032064L, 152213);
    return true;
  }
  
  protected final void bEb()
  {
    GMTrace.i(16215649026048L, 120816);
    bEI();
    GMTrace.o(16215649026048L, 120816);
  }
  
  protected final boolean bEf()
  {
    GMTrace.i(16214441066496L, 120807);
    GMTrace.o(16214441066496L, 120807);
    return false;
  }
  
  protected final boolean bEo()
  {
    GMTrace.i(16214172631040L, 120805);
    GMTrace.o(16214172631040L, 120805);
    return true;
  }
  
  protected final boolean bEt()
  {
    GMTrace.i(16215514808320L, 120815);
    GMTrace.o(16215514808320L, 120815);
    return false;
  }
  
  public final void bdJ()
  {
    GMTrace.i(16214843719680L, 120810);
    if (this.rOl != null)
    {
      if (!this.rOl.wjB.hasFocus())
      {
        this.rOl.chz();
        aLs();
      }
      this.rOl.Jd(getHint());
    }
    GMTrace.o(16214843719680L, 120810);
  }
  
  public final void bdN()
  {
    GMTrace.i(16893851205632L, 125869);
    if (!this.rOl.wjB.hasFocus())
    {
      this.rOl.chz();
      aLs();
    }
    GMTrace.o(16893851205632L, 125869);
  }
  
  protected void g(final int paramInt, final Bundle paramBundle)
  {
    GMTrace.i(16215917461504L, 120818);
    final Object localObject1;
    Object localObject2;
    switch (paramInt)
    {
    default: 
      super.g(paramInt, paramBundle);
    case 128: 
    case 119: 
    case 143: 
    case 120: 
    case 121: 
    case 122: 
      for (;;)
      {
        GMTrace.o(16215917461504L, 120818);
        return;
        paramBundle.getString("fts_key_json_data");
        paramBundle.getBoolean("fts_key_new_query", true);
        localObject1 = new HashMap();
        localObject2 = paramBundle.keySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (String)((Iterator)localObject2).next();
          ((Map)localObject1).put(localObject3, paramBundle.get((String)localObject3));
        }
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16213233106944L, 120798);
            if (BaseSOSWebViewUI.p(BaseSOSWebViewUI.this) != null) {
              BaseSOSWebViewUI.q(BaseSOSWebViewUI.this).ab(localObject1);
            }
            GMTrace.o(16213233106944L, 120798);
          }
        });
        GMTrace.o(16215917461504L, 120818);
        return;
        localObject1 = paramBundle.getString("fts_key_json_data");
        final boolean bool = paramBundle.getBoolean("fts_key_new_query", true);
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16222494130176L, 120867);
            if (BaseSOSWebViewUI.r(BaseSOSWebViewUI.this) != null) {
              BaseSOSWebViewUI.s(BaseSOSWebViewUI.this).aH(localObject1, bool);
            }
            GMTrace.o(16222494130176L, 120867);
          }
        });
        GMTrace.o(16215917461504L, 120818);
        return;
        paramBundle = paramBundle.getString("data");
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16207327526912L, 120754);
            if (BaseSOSWebViewUI.t(BaseSOSWebViewUI.this) != null)
            {
              com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald = BaseSOSWebViewUI.u(BaseSOSWebViewUI.this);
              String str = paramBundle;
              if (!locald.rSa)
              {
                w.e("MicroMsg.JsApiHandler", "onSearchHistoryReady fail, not ready");
                GMTrace.o(16207327526912L, 120754);
                return;
              }
              w.i("MicroMsg.JsApiHandler", "onSearchHistoryReady success, ready");
              try
              {
                af.t(new d.27(locald, i.a.a("onSearchHistoryReady", new JSONObject(str), locald.rSc, locald.rSd)));
                GMTrace.o(16207327526912L, 120754);
                return;
              }
              catch (JSONException localJSONException)
              {
                w.printErrStackTrace("MicroMsg.JsApiHandler", localJSONException, "", new Object[0]);
              }
            }
            GMTrace.o(16207327526912L, 120754);
          }
        });
        GMTrace.o(16215917461504L, 120818);
        return;
        paramInt = paramBundle.getInt("fts_key_ret", 0);
        paramBundle = paramBundle.getString("fts_key_data");
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16229741887488L, 120921);
            if (BaseSOSWebViewUI.v(BaseSOSWebViewUI.this) != null) {
              BaseSOSWebViewUI.w(BaseSOSWebViewUI.this).aC(paramInt, paramBundle);
            }
            GMTrace.o(16229741887488L, 120921);
          }
        });
        GMTrace.o(16215917461504L, 120818);
        return;
        localObject1 = paramBundle.getString("fts_key_json_data");
        paramInt = paramBundle.getInt("fts_key_teach_request_type", 0);
        final int i = paramBundle.getInt("fts_key_is_cache_data", 0);
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16206790656000L, 120750);
            if (BaseSOSWebViewUI.x(BaseSOSWebViewUI.this) != null) {
              BaseSOSWebViewUI.y(BaseSOSWebViewUI.this).d(paramInt, localObject1, i);
            }
            GMTrace.o(16206790656000L, 120750);
          }
        });
        GMTrace.o(16215917461504L, 120818);
        return;
        localObject1 = paramBundle.getString("fts_key_new_query");
        localObject2 = paramBundle.getString("fts_key_custom_query");
        bool = paramBundle.getBoolean("fts_key_need_keyboard", false);
        Object localObject3 = paramBundle.getString("fts_key_tag_list");
        w.i("MicroMsg.FTS.BaseSOSWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange %b", new Object[] { localObject1, Boolean.valueOf(bool) });
        paramBundle = new ArrayList();
        try
        {
          if (!bg.nm((String)localObject3))
          {
            localObject3 = new JSONArray((String)localObject3);
            paramInt = 0;
            while (paramInt < ((JSONArray)localObject3).length())
            {
              JSONObject localJSONObject = ((JSONArray)localObject3).getJSONObject(paramInt);
              a locala = new a();
              locala.rOy = localJSONObject.getString("tagName");
              locala.rOz = localJSONObject.getInt("tagType");
              locala.userName = localJSONObject.getString("userName");
              paramBundle.add(locala);
              paramInt += 1;
            }
          }
          if (this.rOl == null) {}
        }
        catch (Exception localException)
        {
          if (this.rOl != null)
          {
            if (paramBundle.size() <= 0) {
              break label699;
            }
            this.rOl.s((String)localObject2, paramBundle);
          }
          while (bool)
          {
            this.handler.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(16220346646528L, 120851);
                if (BaseSOSWebViewUI.z(BaseSOSWebViewUI.this) != null) {
                  BaseSOSWebViewUI.A(BaseSOSWebViewUI.this).b(BaseSOSWebViewUI.this.bET(), BaseSOSWebViewUI.this.bEV(), BaseSOSWebViewUI.this.bEW());
                }
                GMTrace.o(16220346646528L, 120851);
              }
            });
            if (this.rOl != null) {
              this.rOl.chz();
            }
            bEv();
            GMTrace.o(16215917461504L, 120818);
            return;
            this.rOl.s((String)localObject1, paramBundle);
            this.rOl.chC();
          }
        }
      }
      this.rOl.wjB.clearFocus();
      GMTrace.o(16215917461504L, 120818);
      return;
    case 124: 
      paramBundle = paramBundle.getString("fts_key_json_data");
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16910896857088L, 125996);
          if (BaseSOSWebViewUI.B(BaseSOSWebViewUI.this) != null) {
            BaseSOSWebViewUI.C(BaseSOSWebViewUI.this).Mu(paramBundle);
          }
          GMTrace.o(16910896857088L, 125996);
        }
      });
      GMTrace.o(16215917461504L, 120818);
      return;
    case 125: 
      localObject1 = paramBundle.getString("fts_key_sns_id");
      paramInt = paramBundle.getInt("fts_key_status", 0);
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20435320176640L, 152255);
          if (BaseSOSWebViewUI.D(BaseSOSWebViewUI.this) != null) {
            BaseSOSWebViewUI.E(BaseSOSWebViewUI.this).cu(localObject1, paramInt);
          }
          GMTrace.o(20435320176640L, 152255);
        }
      });
      GMTrace.o(16215917461504L, 120818);
      return;
    case 60: 
      b.bBH();
      q.kP("");
      if (!bEX())
      {
        w.w("MicroMsg.FTS.BaseSOSWebViewUI", "current state is not search");
        GMTrace.o(16215917461504L, 120818);
        return;
      }
      this.rOq.a(paramBundle, this.scene);
      GMTrace.o(16215917461504L, 120818);
      return;
    case 100001: 
      this.rOq.N(paramBundle);
      GMTrace.o(16215917461504L, 120818);
      return;
    case 61: 
      this.rOq.O(paramBundle);
      GMTrace.o(16215917461504L, 120818);
      return;
    case 62: 
      this.rOq.P(paramBundle);
      GMTrace.o(16215917461504L, 120818);
      return;
    case 135: 
      paramInt = paramBundle.getInt("FTS_KEY_onStartWebSearch_type", 0);
      localObject1 = paramBundle.getString("FTS_KEY_onStartWebSearch_query");
      paramBundle = (Map)paramBundle.getSerializable("FTS_KEY_onStartWebSearch_params");
      w.v("MicroMsg.FTS.BaseSOSWebViewUI", "adding history cgi params type %d, inEditQuery %s, params %s", new Object[] { Integer.valueOf(paramInt), localObject1, paramBundle });
      if (this.rOn == null) {
        this.rOn = new ArrayList();
      }
      c localc;
      if (bET().length() > 0)
      {
        localObject2 = new c();
        ((c)localObject2).type = this.rOo;
        ((c)localObject2).qfY = new ArrayList(this.rOl.qfY);
        ((c)localObject2).rOB = this.rOl.bEV();
        ((c)localObject2).rOA = this.rOl.bET();
        if (this.rOn.size() == 0) {
          this.rOn.add(localObject2);
        }
      }
      else if ((this.rOn != null) && (!this.rOn.isEmpty()))
      {
        localObject2 = (c)this.rOn.get(0);
        localc = new c();
        localc.type = paramInt;
        localc.rOA = ((String)localObject1);
        localc.rOC = paramBundle;
        if (localObject2 != null)
        {
          if (localObject2 != localc) {
            break label1243;
          }
          paramInt = 1;
        }
      }
      for (;;)
      {
        if (paramInt != 0) {
          ((c)localObject2).rOC = paramBundle;
        }
        GMTrace.o(16215917461504L, 120818);
        return;
        if (((c)localObject2).equals((c)this.rOn.get(0))) {
          break;
        }
        this.rOn.add(0, localObject2);
        break;
        localObject1 = (c)localc;
        if ((((c)localObject1).type == ((c)localObject2).type) && (((c)localObject1).rOA.trim().equals(((c)localObject2).rOA.trim()))) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
      }
    case 138: 
      label699:
      label1243:
      paramBundle = paramBundle.getString("fts_key_data");
      if (!bg.nm(paramBundle))
      {
        if ("index".equals(paramBundle))
        {
          this.rOp = 1;
          GMTrace.o(16215917461504L, 120818);
          return;
        }
        if ("result".equals(paramBundle))
        {
          this.rOp = 2;
          GMTrace.o(16215917461504L, 120818);
          return;
        }
        if ("suggestion".equals(paramBundle))
        {
          this.rOp = 3;
          GMTrace.o(16215917461504L, 120818);
          return;
        }
        if ("teach".equals(paramBundle))
        {
          this.rOp = 4;
          GMTrace.o(16215917461504L, 120818);
          return;
        }
        if ("local".equals(paramBundle))
        {
          this.rOp = 5;
          GMTrace.o(16215917461504L, 120818);
          return;
        }
        this.rOp = 0;
        GMTrace.o(16215917461504L, 120818);
        return;
      }
      this.rOp = 0;
      GMTrace.o(16215917461504L, 120818);
      return;
    }
    b.bBH();
    q.kO(paramBundle.getString("appid"));
    GMTrace.o(16215917461504L, 120818);
  }
  
  protected String getHint()
  {
    GMTrace.i(16214977937408L, 120811);
    GMTrace.o(16214977937408L, 120811);
    return null;
  }
  
  public void he(boolean paramBoolean)
  {
    GMTrace.i(16214709501952L, 120809);
    if ((paramBoolean) && (!bg.nm(this.rOl.bET()))) {
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16212427800576L, 120792);
          if (BaseSOSWebViewUI.j(BaseSOSWebViewUI.this) != null) {
            BaseSOSWebViewUI.k(BaseSOSWebViewUI.this).b(BaseSOSWebViewUI.this.bET(), BaseSOSWebViewUI.this.bEV(), BaseSOSWebViewUI.this.bEW());
          }
          GMTrace.o(16212427800576L, 120792);
        }
      });
    }
    GMTrace.o(16214709501952L, 120809);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(16894522294272L, 125874);
    bEI();
    GMTrace.o(16894522294272L, 125874);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(16213501542400L, 120800);
    super.onCreate(paramBundle);
    cN().cO().hide();
    this.rOq = new b(this.vKB.vKW, this.nXD);
    GMTrace.o(16213501542400L, 120800);
  }
  
  public void onDestroy()
  {
    GMTrace.i(16215783243776L, 120817);
    try
    {
      if (this.ioh != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putInt("webview_id", hashCode());
        this.ioh.g(1, localBundle);
      }
      this.rOq.onDestroy();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
    aLo();
    super.onDestroy();
    GMTrace.o(16215783243776L, 120817);
  }
  
  protected void onPause()
  {
    GMTrace.i(17825188020224L, 132808);
    super.onPause();
    this.rOq.onPause();
    GMTrace.o(17825188020224L, 132808);
  }
  
  protected void onResume()
  {
    GMTrace.i(17825053802496L, 132807);
    super.onResume();
    this.rOq.onResume();
    GMTrace.o(17825053802496L, 132807);
  }
  
  public final String ya(int paramInt)
  {
    GMTrace.i(20429817249792L, 152214);
    try
    {
      Object localObject1 = new Bundle();
      ((Bundle)localObject1).putString("key", "educationTab");
      Object localObject2 = this.ioh.n(2, (Bundle)localObject1);
      localObject1 = ((Bundle)localObject2).getString("result");
      localObject2 = ((Bundle)localObject2).getString("result_1");
      if (localObject2 == null) {}
      for (;;)
      {
        localObject1 = new JSONObject((String)localObject1).optJSONArray("items");
        if (localObject1 != null) {
          break;
        }
        GMTrace.o(20429817249792L, 152214);
        return "";
        localObject1 = localObject2;
      }
      int i = 0;
      while (i < ((JSONArray)localObject1).length())
      {
        localObject2 = ((JSONArray)localObject1).optJSONObject(i);
        if (((JSONObject)localObject2).optInt("businessType") == paramInt)
        {
          localObject1 = ((JSONObject)localObject2).optString("hotword");
          GMTrace.o(20429817249792L, 152214);
          return (String)localObject1;
        }
        i += 1;
      }
      return "";
    }
    catch (Exception localException)
    {
      GMTrace.o(20429817249792L, 152214);
    }
  }
  
  public final class a
    implements a.b
  {
    String rOy;
    int rOz;
    String userName;
    
    public a()
    {
      GMTrace.i(16228668145664L, 120913);
      GMTrace.o(16228668145664L, 120913);
    }
    
    public final int compareTo(Object paramObject)
    {
      GMTrace.i(16228936581120L, 120915);
      if ((paramObject == null) || (!(paramObject instanceof FTSBaseWebViewUI.a)))
      {
        GMTrace.o(16228936581120L, 120915);
        return -1;
      }
      paramObject = (FTSBaseWebViewUI.a)paramObject;
      int i = this.rOy.compareTo(((FTSBaseWebViewUI.a)paramObject).rOy);
      GMTrace.o(16228936581120L, 120915);
      return i;
    }
    
    public final String getTagName()
    {
      GMTrace.i(16228802363392L, 120914);
      String str = this.rOy;
      GMTrace.o(16228802363392L, 120914);
      return str;
    }
  }
  
  private final class b
    extends WebViewUI.i
  {
    public b()
    {
      super();
      GMTrace.i(16226923315200L, 120900);
      GMTrace.o(16226923315200L, 120900);
    }
    
    private static k Mo(String paramString)
    {
      GMTrace.i(19417815580672L, 144674);
      w.i("MicroMsg.FTS.BaseSOSWebViewUI", "url=%s | thread=%d", new Object[] { paramString, Long.valueOf(Thread.currentThread().getId()) });
      paramString = Uri.parse(paramString);
      try
      {
        paramString = FileOp.openRead(paramString.getQueryParameter("path"));
        if (paramString != null)
        {
          paramString = new k("image/*", "utf8", paramString);
          GMTrace.o(19417815580672L, 144674);
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          paramString = null;
        }
        GMTrace.o(19417815580672L, 144674);
      }
      return null;
    }
    
    public final k a(WebView paramWebView, j paramj)
    {
      GMTrace.i(19417547145216L, 144672);
      if ((paramj != null) && (paramj.getUrl() != null) && (paramj.getUrl().toString().startsWith("weixin://fts")))
      {
        k localk = Mo(paramj.getUrl().toString());
        if (localk != null)
        {
          GMTrace.o(19417547145216L, 144672);
          return localk;
        }
      }
      paramWebView = super.a(paramWebView, paramj);
      GMTrace.o(19417547145216L, 144672);
      return paramWebView;
    }
    
    public final k a(WebView paramWebView, j paramj, Bundle paramBundle)
    {
      GMTrace.i(19417412927488L, 144671);
      if ((paramj != null) && (paramj.getUrl() != null) && (paramj.getUrl().toString().startsWith("weixin://fts")))
      {
        paramBundle = Mo(paramj.getUrl().toString());
        if (paramBundle != null)
        {
          GMTrace.o(19417412927488L, 144671);
          return paramBundle;
        }
      }
      paramWebView = super.a(paramWebView, paramj);
      GMTrace.o(19417412927488L, 144671);
      return paramWebView;
    }
    
    public final void a(WebView paramWebView, String paramString)
    {
      GMTrace.i(19417144492032L, 144669);
      super.a(paramWebView, paramString);
      w.i("MicroMsg.FTS.BaseSOSWebViewUI", "scene %d, onPageFinished %s", new Object[] { Integer.valueOf(BaseSOSWebViewUI.f(BaseSOSWebViewUI.this)), paramString });
      BaseSOSWebViewUI.this.lg(false);
      if ((BaseSOSWebViewUI.this.rOl != null) && (!BaseSOSWebViewUI.n(BaseSOSWebViewUI.this)))
      {
        BaseSOSWebViewUI.bEQ();
        BaseSOSWebViewUI.this.rOl.wjB.clearFocus();
        BaseSOSWebViewUI.this.aLo();
      }
      BaseSOSWebViewUI.o(BaseSOSWebViewUI.this);
      BaseSOSWebViewUI.this.bEM();
      GMTrace.o(19417144492032L, 144669);
    }
    
    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(19417278709760L, 144670);
      super.b(paramWebView, paramString, paramBitmap);
      w.i("MicroMsg.FTS.BaseSOSWebViewUI", "onPageStarted %s", new Object[] { paramString });
      BaseSOSWebViewUI.this.lg(false);
      if ((BaseSOSWebViewUI.this.rOl != null) && (!BaseSOSWebViewUI.n(BaseSOSWebViewUI.this)))
      {
        BaseSOSWebViewUI.bER();
        BaseSOSWebViewUI.this.rOl.wjB.clearFocus();
        BaseSOSWebViewUI.this.aLo();
      }
      GMTrace.o(19417278709760L, 144670);
    }
    
    public final k e(WebView paramWebView, String paramString)
    {
      GMTrace.i(19417681362944L, 144673);
      if (paramString.startsWith("weixin://fts"))
      {
        k localk = Mo(paramString);
        if (localk != null)
        {
          GMTrace.o(19417681362944L, 144673);
          return localk;
        }
      }
      paramWebView = super.e(paramWebView, paramString);
      GMTrace.o(19417681362944L, 144673);
      return paramWebView;
    }
  }
  
  protected final class c
  {
    List<a.b> qfY;
    String rOA;
    String rOB;
    Map<String, Object> rOC;
    int type;
    
    protected c()
    {
      GMTrace.i(16206253785088L, 120746);
      this.rOA = "";
      this.rOB = "";
      this.rOC = new HashMap();
      GMTrace.o(16206253785088L, 120746);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(16899085697024L, 125908);
      if (this == paramObject)
      {
        GMTrace.o(16899085697024L, 125908);
        return true;
      }
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((((c)paramObject).type == this.type) && (((c)paramObject).rOB.equals(this.rOB)))
        {
          GMTrace.o(16899085697024L, 125908);
          return true;
        }
        GMTrace.o(16899085697024L, 125908);
        return false;
      }
      GMTrace.o(16899085697024L, 125908);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\fts\BaseSOSWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */