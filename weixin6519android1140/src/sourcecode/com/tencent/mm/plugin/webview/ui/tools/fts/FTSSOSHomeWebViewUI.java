package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateInterpolator;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.az.e;
import com.tencent.mm.az.k;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.29;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.d.d.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.KeyboardLinearLayout.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.b;
import com.tencent.mm.ui.fts.widget.FTSMainUIEducationLayout;
import com.tencent.mm.ui.fts.widget.FTSMainUIEducationLayoutWithAll;
import com.tencent.mm.ui.fts.widget.FTSMainUIHotWordLayout;
import com.tencent.mm.ui.fts.widget.FTSMainUIHotWordLayout.a;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class FTSSOSHomeWebViewUI
  extends BaseSOSWebViewUI
{
  private FTSMainUIEducationLayout oDf;
  private View.OnClickListener oDx;
  private View oUu;
  private View rOJ;
  private ListView rOK;
  private a rOL;
  private b rOM;
  private c rON;
  private d rOO;
  private float rOP;
  private FTSMainUIHotWordLayout rOQ;
  private FTSMainUIEducationLayoutWithAll rOR;
  private View rOS;
  private TextView rOT;
  private View rOU;
  private View rOV;
  private View rOW;
  private View rOX;
  private b rOY;
  private int rOZ;
  private boolean rPa;
  private int rPb;
  private String rPc;
  boolean rPd;
  private int rPe;
  private int rPf;
  private String rPg;
  private View.OnClickListener rPh;
  private a.a rPi;
  private a.a rPj;
  private a.a rPk;
  private String rPl;
  int rPm;
  private View.OnClickListener rPn;
  private AdapterView.OnItemClickListener rPo;
  private View.OnClickListener rPp;
  private boolean rPq;
  private TextView titleView;
  
  public FTSSOSHomeWebViewUI()
  {
    GMTrace.i(16223165218816L, 120872);
    this.rOP = Float.MAX_VALUE;
    this.rPb = 0;
    this.rPc = "";
    this.rPe = 0;
    this.rPf = 0;
    this.rPg = "";
    this.oDx = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(20446460248064L, 152338);
        FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this);
        if (!FTSSOSHomeWebViewUI.this.rOs)
        {
          GMTrace.o(20446460248064L, 152338);
          return;
        }
        FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).An(1);
        String str = ((TextView)paramAnonymousView).getText().toString();
        final int i = e.a((JSONObject)paramAnonymousView.getTag(), str, FTSSOSHomeWebViewUI.this);
        if (i != 0)
        {
          FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this, str);
          if ((FTSSOSHomeWebViewUI.this.rOo != i) && (!FTSSOSHomeWebViewUI.this.bEP().qfY.isEmpty()))
          {
            paramAnonymousView = FTSSOSHomeWebViewUI.this.bET();
            FTSSOSHomeWebViewUI.this.bEP().clearText();
            FTSSOSHomeWebViewUI.this.bEP().s(paramAnonymousView, null);
            FTSSOSHomeWebViewUI.this.bEP().chC();
          }
          FTSSOSHomeWebViewUI.this.rOo = i;
          FTSSOSHomeWebViewUI.this.bEK();
          FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this, i);
        }
        label340:
        for (;;)
        {
          try
          {
            FTSSOSHomeWebViewUI.e(FTSSOSHomeWebViewUI.this, 0);
            paramAnonymousView = new Bundle();
            paramAnonymousView.putInt("type", i);
            if (i == 0)
            {
              bool = true;
              paramAnonymousView.putBoolean("isHomePage", bool);
              if ((FTSSOSHomeWebViewUI.this.scene != 20) || (FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).bFa())) {
                break label340;
              }
              if (i == 0) {
                continue;
              }
              paramAnonymousView.putInt("scene", 22);
              paramAnonymousView = FTSSOSHomeWebViewUI.e(FTSSOSHomeWebViewUI.this).n(4, paramAnonymousView);
              FTSSOSHomeWebViewUI.i(FTSSOSHomeWebViewUI.this).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(20429280378880L, 152210);
                  boolean bool = false;
                  HashMap localHashMap;
                  if (FTSSOSHomeWebViewUI.f(FTSSOSHomeWebViewUI.this) != null)
                  {
                    localHashMap = new HashMap();
                    localHashMap.put("isHomePage", "0");
                    if (i != 0) {
                      break label239;
                    }
                    localHashMap.put("isHomePage", "1");
                  }
                  for (;;)
                  {
                    if (!bg.nm(FTSSOSHomeWebViewUI.this.bET())) {
                      localHashMap.put("query", FTSSOSHomeWebViewUI.this.bET());
                    }
                    bool = FTSSOSHomeWebViewUI.g(FTSSOSHomeWebViewUI.this).a(paramAnonymousView.getString("scene", "0"), paramAnonymousView.getString("type", "0"), paramAnonymousView.getString("isSug", "0"), paramAnonymousView.getString("isLocalSug", "0"), FTSSOSHomeWebViewUI.this.eDA, localHashMap, null);
                    if (bool)
                    {
                      FTSSOSHomeWebViewUI.this.bEP().Jd(FTSSOSHomeWebViewUI.f(FTSSOSHomeWebViewUI.this, i));
                      k.b(i, 22, FTSSOSHomeWebViewUI.h(FTSSOSHomeWebViewUI.this));
                      FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).An(7);
                    }
                    GMTrace.o(20429280378880L, 152210);
                    return;
                    label239:
                    if (i == 1) {
                      localHashMap.put("isMostSearchBiz", paramAnonymousView.getString("isMostSearchBiz", "0"));
                    } else {
                      localHashMap.put("isHomePage", "0");
                    }
                  }
                }
              });
              GMTrace.o(20446460248064L, 152338);
              return;
              FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this, "");
              break;
            }
            boolean bool = false;
            continue;
            paramAnonymousView.putInt("scene", 20);
            continue;
            paramAnonymousView.putInt("scene", FTSSOSHomeWebViewUI.this.scene);
          }
          catch (Exception paramAnonymousView)
          {
            GMTrace.o(20446460248064L, 152338);
            return;
          }
        }
      }
    };
    this.rPh = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(20427535548416L, 152197);
        Object localObject = (FTSMainUIHotWordLayout.a)paramAnonymousView.getTag();
        switch (((FTSMainUIHotWordLayout.a)localObject).eSe)
        {
        }
        try
        {
          final HashMap localHashMap = new HashMap();
          localHashMap.put("isclick", Integer.valueOf(1));
          localHashMap.put("scene", Integer.valueOf(20));
          localHashMap.put("recommendid", FTSSOSHomeWebViewUI.l(FTSSOSHomeWebViewUI.this).chH());
          localHashMap.put("businesstype", Integer.valueOf(0));
          if (((FTSMainUIHotWordLayout.a)localObject).xdr != null) {}
          for (paramAnonymousView = Uri.encode(((FTSMainUIHotWordLayout.a)localObject).xdr);; paramAnonymousView = "")
          {
            localHashMap.put("docid", paramAnonymousView);
            localHashMap.put("docpos", Integer.valueOf(((FTSMainUIHotWordLayout.a)localObject).xds + 1));
            localHashMap.put("ishomepage", Integer.valueOf(1));
            localHashMap.put("typepos", Integer.valueOf(1));
            localHashMap.put("jumpurl", Uri.encode(((FTSMainUIHotWordLayout.a)localObject).jumpUrl));
            paramAnonymousView = e.o(localHashMap);
            localObject = new Bundle();
            ((Bundle)localObject).putString("logString", paramAnonymousView);
            FTSSOSHomeWebViewUI.p(FTSSOSHomeWebViewUI.this).d(131, (Bundle)localObject);
            GMTrace.o(20427535548416L, 152197);
            return;
            if (!FTSSOSHomeWebViewUI.this.rOs)
            {
              GMTrace.o(20427535548416L, 152197);
              return;
            }
            FTSSOSHomeWebViewUI.j(FTSSOSHomeWebViewUI.this);
            FTSSOSHomeWebViewUI.e(FTSSOSHomeWebViewUI.this, 0);
            FTSSOSHomeWebViewUI.this.bEP().clearText();
            FTSSOSHomeWebViewUI.this.bEP().s(((FTSMainUIHotWordLayout.a)localObject).xdr, null);
            FTSSOSHomeWebViewUI.this.bEP().chC();
            FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).An(13);
            try
            {
              paramAnonymousView = new Bundle();
              paramAnonymousView.putInt("type", 0);
              paramAnonymousView.putBoolean("isHomePage", true);
              paramAnonymousView.putInt("scene", 20);
              paramAnonymousView = FTSSOSHomeWebViewUI.k(FTSSOSHomeWebViewUI.this).n(4, paramAnonymousView);
              localHashMap = new HashMap();
              localHashMap.put("sceneActionType", "2");
              localHashMap.put("recommendId", FTSSOSHomeWebViewUI.l(FTSSOSHomeWebViewUI.this).chH());
              FTSSOSHomeWebViewUI.o(FTSSOSHomeWebViewUI.this).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(20426596024320L, 152190);
                  boolean bool = false;
                  if (FTSSOSHomeWebViewUI.m(FTSSOSHomeWebViewUI.this) != null) {
                    bool = FTSSOSHomeWebViewUI.n(FTSSOSHomeWebViewUI.this).a(paramAnonymousView.getString("type", "0"), paramAnonymousView.getString("isMostSearchBiz", "0"), paramAnonymousView.getString("isSug", "0"), paramAnonymousView.getString("scene", "0"), paramAnonymousView.getString("isLocalSug", "0"), FTSSOSHomeWebViewUI.this.bET(), FTSSOSHomeWebViewUI.this.bEV(), FTSSOSHomeWebViewUI.this.bEW(), FTSSOSHomeWebViewUI.this.bEN(), FTSSOSHomeWebViewUI.this.rPm, localHashMap);
                  }
                  if (bool)
                  {
                    FTSSOSHomeWebViewUI.this.bEP().Jd(FTSSOSHomeWebViewUI.f(FTSSOSHomeWebViewUI.this, 0));
                    FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).An(7);
                  }
                  GMTrace.o(20426596024320L, 152190);
                }
              });
            }
            catch (Exception paramAnonymousView) {}
            break;
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("rawUrl", ((FTSMainUIHotWordLayout.a)localObject).jumpUrl);
            paramAnonymousView.putExtra("convertActivityFromTranslucent", false);
            com.tencent.mm.bj.d.b(ab.getContext(), "webview", ".ui.tools.WebViewUI", paramAnonymousView);
            break;
          }
          return;
        }
        catch (Exception paramAnonymousView)
        {
          w.w("MicroMsg.FTS.FTSSOSHomeWebViewUI", "onHotwordCellClickListener cgi report fail for %s", new Object[] { paramAnonymousView.toString() });
          GMTrace.o(20427535548416L, 152197);
        }
      }
    };
    this.rPi = new a.a()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(18125164642304L, 135043);
        FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).An(4);
        FTSSOSHomeWebViewUI.q(FTSSOSHomeWebViewUI.this);
        GMTrace.o(18125164642304L, 135043);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(19410567823360L, 144620);
        FTSSOSHomeWebViewUI.r(FTSSOSHomeWebViewUI.this);
        GMTrace.o(19410567823360L, 144620);
      }
    };
    this.rPj = new a.a()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(20430354120704L, 152218);
        FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).An(9);
        FTSSOSHomeWebViewUI.q(FTSSOSHomeWebViewUI.this);
        GMTrace.o(20430354120704L, 152218);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(20430488338432L, 152219);
        FTSSOSHomeWebViewUI.r(FTSSOSHomeWebViewUI.this);
        GMTrace.o(20430488338432L, 152219);
      }
    };
    this.rPk = new a.a()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(20436125483008L, 152261);
        FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).An(3);
        FTSSOSHomeWebViewUI.q(FTSSOSHomeWebViewUI.this);
        GMTrace.o(20436125483008L, 152261);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(20436259700736L, 152262);
        FTSSOSHomeWebViewUI.r(FTSSOSHomeWebViewUI.this);
        GMTrace.o(20436259700736L, 152262);
      }
    };
    this.rPn = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19411238912000L, 144625);
        paramAnonymousView = (FTSSOSHomeWebViewUI.c)paramAnonymousView.getTag();
        Bundle localBundle;
        if (paramAnonymousView.type == 1)
        {
          localBundle = new Bundle();
          localBundle.putString("history", paramAnonymousView.content);
        }
        try
        {
          FTSSOSHomeWebViewUI.t(FTSSOSHomeWebViewUI.this).g(5, localBundle);
          af.t(new FTSSOSHomeWebViewUI.a.2(FTSSOSHomeWebViewUI.u(FTSSOSHomeWebViewUI.this), paramAnonymousView));
          GMTrace.o(19411238912000L, 144625);
          return;
          if (paramAnonymousView.type == 2)
          {
            FTSSOSHomeWebViewUI.u(FTSSOSHomeWebViewUI.this).clear();
            FTSSOSHomeWebViewUI.this.bEP().s(paramAnonymousView.content, null);
            FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this, paramAnonymousView, 2);
            FTSSOSHomeWebViewUI.e(FTSSOSHomeWebViewUI.this, 2);
            FTSSOSHomeWebViewUI.v(FTSSOSHomeWebViewUI.this);
          }
          GMTrace.o(19411238912000L, 144625);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    };
    this.rPo = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20430622556160L, 152220);
        paramAnonymousAdapterView = FTSSOSHomeWebViewUI.u(FTSSOSHomeWebViewUI.this).yd(paramAnonymousInt);
        FTSSOSHomeWebViewUI.this.bEP().s(paramAnonymousAdapterView.content, null);
        if (paramAnonymousAdapterView.type == 2)
        {
          FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this, paramAnonymousAdapterView, 1);
          FTSSOSHomeWebViewUI.e(FTSSOSHomeWebViewUI.this, 1);
        }
        FTSSOSHomeWebViewUI.this.aaM();
        GMTrace.o(20430622556160L, 152220);
      }
    };
    this.rPp = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20429414596608L, 152211);
        FTSSOSHomeWebViewUI.w(FTSSOSHomeWebViewUI.this);
        GMTrace.o(20429414596608L, 152211);
      }
    };
    GMTrace.o(16223165218816L, 120872);
  }
  
  private void bEY()
  {
    GMTrace.i(16223702089728L, 120876);
    try
    {
      this.rOL.clear();
      w.i("MicroMsg.FTS.FTSSOSHomeWebViewUI", "start to update history");
      Bundle localBundle = new Bundle();
      localBundle.putInt("webview_id", hashCode());
      localBundle.putString("query", bEV());
      localBundle.putInt("count", 6);
      localBundle.putInt("scene", this.scene);
      this.ioh.g(3, localBundle);
      GMTrace.o(16223702089728L, 120876);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      GMTrace.o(16223702089728L, 120876);
    }
  }
  
  private void bEZ()
  {
    GMTrace.i(16901233180672L, 125924);
    if ((this.rOR.getVisibility() == 0) && (!this.rPq))
    {
      this.rPq = true;
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.rOR, View.TRANSLATION_Y, new float[] { 0.0F, -this.rOR.getHeight() });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.rOU, View.ALPHA, new float[] { 1.0F, 0.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.setInterpolator(new AccelerateInterpolator());
      localAnimatorSet.playTogether(new Animator[] { localObjectAnimator2, localObjectAnimator1 });
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20433709563904L, 152243);
          FTSSOSHomeWebViewUI.x(FTSSOSHomeWebViewUI.this).setVisibility(8);
          FTSSOSHomeWebViewUI.y(FTSSOSHomeWebViewUI.this).setVisibility(8);
          FTSSOSHomeWebViewUI.z(FTSSOSHomeWebViewUI.this);
          GMTrace.o(20433709563904L, 152243);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20433575346176L, 152242);
          FTSSOSHomeWebViewUI.x(FTSSOSHomeWebViewUI.this).setVisibility(8);
          FTSSOSHomeWebViewUI.y(FTSSOSHomeWebViewUI.this).setVisibility(8);
          FTSSOSHomeWebViewUI.z(FTSSOSHomeWebViewUI.this);
          GMTrace.o(20433575346176L, 152242);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20433843781632L, 152244);
          GMTrace.o(20433843781632L, 152244);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20433441128448L, 152241);
          GMTrace.o(20433441128448L, 152241);
        }
      });
      localAnimatorSet.start();
    }
    GMTrace.o(16901233180672L, 125924);
  }
  
  private void yb(int paramInt)
  {
    GMTrace.i(16900964745216L, 125922);
    this.rOR.DL(paramInt);
    this.rOT.setText(this.rOR.DM(paramInt));
    bEP().v(e.a(paramInt, this.vKB.vKW));
    GMTrace.o(16900964745216L, 125922);
  }
  
  private String yc(int paramInt)
  {
    GMTrace.i(17780761952256L, 132477);
    int i = -1;
    switch (paramInt)
    {
    default: 
      paramInt = i;
    }
    while (paramInt < 0)
    {
      str = getString(R.l.dWo, new Object[] { this.rPg });
      GMTrace.o(17780761952256L, 132477);
      return str;
      paramInt = R.l.dWq;
      continue;
      paramInt = R.l.dyw;
      continue;
      paramInt = R.l.dWp;
      continue;
      paramInt = R.l.dyv;
      continue;
      paramInt = R.l.cRT;
      continue;
      paramInt = R.l.dyr;
      continue;
      paramInt = R.l.dys;
      continue;
      paramInt = R.l.dyt;
      continue;
      paramInt = R.l.dyu;
    }
    String str = getString(R.l.dWo, new Object[] { getString(paramInt) });
    GMTrace.o(17780761952256L, 132477);
    return str;
  }
  
  public final void a(String paramString1, String paramString2, List<com.tencent.mm.ui.fts.widget.a.b> paramList, FTSEditTextView.b paramb)
  {
    GMTrace.i(16900830527488L, 125921);
    if (paramb == FTSEditTextView.b.xda) {
      this.rPm = 0;
    }
    if (this.rOY.bFa())
    {
      super.a(paramString1, paramString2, paramList, paramb);
      GMTrace.o(16900830527488L, 125921);
      return;
    }
    if (bET().length() == 0)
    {
      this.oDf.setVisibility(0);
      this.rOQ.setVisibility(0);
      this.rOJ.setVisibility(0);
      this.rOL.clear();
      GMTrace.o(16900830527488L, 125921);
      return;
    }
    this.oDf.setVisibility(8);
    this.rOQ.setVisibility(8);
    this.rOJ.setVisibility(4);
    if (paramb != FTSEditTextView.b.xdc) {
      bEY();
    }
    GMTrace.o(16900830527488L, 125921);
  }
  
  protected final int aaH()
  {
    GMTrace.i(16223433654272L, 120874);
    if ((com.tencent.mm.compatible.util.d.et(23)) && (!h.tE()))
    {
      i = getResources().getColor(R.e.aOY);
      GMTrace.o(16223433654272L, 120874);
      return i;
    }
    int i = super.aaH();
    GMTrace.o(16223433654272L, 120874);
    return i;
  }
  
  public final boolean aaM()
  {
    GMTrace.i(16223970525184L, 120878);
    if (!this.rOs)
    {
      GMTrace.o(16223970525184L, 120878);
      return true;
    }
    this.rOY.An(0);
    super.aaM();
    GMTrace.o(16223970525184L, 120878);
    return true;
  }
  
  protected final void aaO()
  {
    GMTrace.i(16223299436544L, 120873);
    super.aaO();
    this.rOY = new b("sos_home_webview_ui", getMainLooper());
    this.rOX = findViewById(R.h.chM);
    this.rOW = findViewById(R.h.bZW);
    this.rOU = findViewById(R.h.bMR);
    this.rOS = findViewById(R.h.bvr);
    this.rOT = ((TextView)findViewById(R.h.bvq));
    this.rOS.setOnClickListener(this.rPp);
    this.rOV = findViewById(R.h.chN);
    this.titleView = ((TextView)findViewById(R.h.chT));
    this.rOJ = findViewById(R.h.cnO);
    this.rOJ.setVisibility(4);
    ((WebViewKeyboardLinearLayout)this.rOJ).vJe = new KeyboardLinearLayout.a()
    {
      public final void oD(int paramAnonymousInt)
      {
        GMTrace.i(18125701513216L, 135047);
        if (paramAnonymousInt == -2) {
          FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).An(12);
        }
        FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this, paramAnonymousInt);
        GMTrace.o(18125701513216L, 135047);
      }
    };
    this.oDf = ((FTSMainUIEducationLayout)findViewById(R.h.caq));
    this.oDf.i(this.oDx);
    this.oDf.xdi = false;
    this.oDf.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18122882940928L, 135026);
        if ((FTSSOSHomeWebViewUI.this.rOk.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
          FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this, ((RelativeLayout.LayoutParams)FTSSOSHomeWebViewUI.this.rOk.getLayoutParams()).topMargin);
        }
        if ((FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this).getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
          FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.this, ((RelativeLayout.LayoutParams)FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this).getLayoutParams()).topMargin);
        }
        FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.this);
        GMTrace.o(18122882940928L, 135026);
      }
    });
    this.rOR = ((FTSMainUIEducationLayoutWithAll)findViewById(R.h.car));
    this.rOR.i(this.oDx);
    this.rOR.xdi = true;
    this.rOQ = ((FTSMainUIHotWordLayout)findViewById(R.h.cau));
    this.rOQ.i(this.rPh);
    this.rOM = new b(this, this.rOk, this.titleView, bEP().iub, this.nta, this.rOm, bEP().wjB, this.rOW, this.rOX);
    this.rOM.a(this.rPi);
    this.rON = new c(this, this.rOk, this.titleView, bEP().iub, this.nta, this.rOm, bEP().wjB, this.rOW, this.rOX);
    this.rON.a(this.rPk);
    this.rOO = new d(this, this.rOk, this.titleView, bEP().iub, this.nta, this.rOm, bEP().wjB, this.rOW, this.rOX);
    this.rOO.a(this.rPj);
    this.rOK = ((ListView)findViewById(R.h.cfy));
    this.rOL = new a((byte)0);
    this.rOK.setAdapter(this.rOL);
    this.rOK.setOnItemClickListener(this.rPo);
    this.oUu = findViewById(R.h.cfx);
    for (;;)
    {
      try
      {
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("key", "educationTab");
        localObject2 = this.ioh.n(2, (Bundle)localObject1);
        localObject1 = ((Bundle)localObject2).getString("result");
        localObject2 = ((Bundle)localObject2).getString("result_1");
        if (localObject2 == null)
        {
          localObject1 = new JSONObject((String)localObject1);
          this.oDf.Z((JSONObject)localObject1);
        }
      }
      catch (Exception localException3)
      {
        final Object localObject1;
        Object localObject2;
        boolean bool;
        continue;
      }
      try
      {
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("key", "tabSlice");
        localObject1 = new JSONObject(this.ioh.n(2, (Bundle)localObject1).getString("result"));
        this.rOR.Z((JSONObject)localObject1);
        this.rOK.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(16221420388352L, 120859);
            FTSSOSHomeWebViewUI.this.aLo();
            GMTrace.o(16221420388352L, 120859);
            return false;
          }
        });
        findViewById(R.h.brU).setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(18125298860032L, 135044);
            FTSSOSHomeWebViewUI.this.bEP().wjB.clearFocus();
            FTSSOSHomeWebViewUI.this.aLo();
            GMTrace.o(18125298860032L, 135044);
            return false;
          }
        });
        this.rOU.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(16898414608384L, 125903);
            FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this);
            GMTrace.o(16898414608384L, 125903);
          }
        });
        localObject1 = getIntent().getStringExtra("title");
        this.titleView.setText((CharSequence)localObject1);
        this.rOZ = (((RelativeLayout.LayoutParams)this.titleView.getLayoutParams()).leftMargin - (int)getResources().getDimension(R.f.aSS));
        bEP().chI();
        if ((getIntent() != null) && (getIntent().getBooleanExtra("ftsInitToSearch", false)))
        {
          bool = true;
          this.rPd = bool;
          if (!this.rPd) {
            continue;
          }
          localObject1 = this.rOY;
          ((b)localObject1).c(((b)localObject1).rPC);
          this.rOY.start();
        }
        try
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putString("key", "searchID");
          this.rPc = this.ioh.n(6, (Bundle)localObject1).getString("result");
          localObject2 = this.rPc;
          String str = this.eDA;
          localObject1 = this.oDf;
          if (((FTSMainUIEducationLayout)localObject1).xdg != null) {
            continue;
          }
          localObject1 = "";
          k.m((String)localObject2, str, (String)localObject1);
        }
        catch (Exception localException1)
        {
          continue;
        }
        k.gR(this.scene);
        localObject1 = (AbsoluteLayout)this.nXD.getView();
        ((AbsoluteLayout)localObject1).setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(20425924935680L, 152185);
            FTSSOSHomeWebViewUI.this.bEP().wjB.clearFocus();
            FTSSOSHomeWebViewUI.this.aLo();
            paramAnonymousView = FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this);
            d.c localc = paramAnonymousView.vlJ;
            if (localc != null) {
              localc.sendMessage(Message.obtain(paramAnonymousView.vlJ, 15, paramAnonymousMotionEvent));
            }
            boolean bool = localObject1.onTouchEvent(paramAnonymousMotionEvent);
            GMTrace.o(20425924935680L, 152185);
            return bool;
          }
        });
        this.rOk.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
        {
          public final boolean onPreDraw()
          {
            GMTrace.i(20429011943424L, 152208);
            FTSSOSHomeWebViewUI.this.rOk.getViewTreeObserver().removeOnPreDrawListener(this);
            FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this, FTSSOSHomeWebViewUI.this.rOk.getX());
            GMTrace.o(20429011943424L, 152208);
            return true;
          }
        });
        GMTrace.o(16223299436544L, 120873);
        return;
        localObject1 = localObject2;
        continue;
        bool = false;
        continue;
        localObject1 = this.rOY;
        ((b)localObject1).c(((b)localObject1).rPA);
        continue;
        localObject1 = ((FTSMainUIEducationLayout)localObject1).xdg;
      }
      catch (Exception localException2) {}
    }
  }
  
  protected final boolean bDD()
  {
    GMTrace.i(20439346708480L, 152285);
    GMTrace.o(20439346708480L, 152285);
    return true;
  }
  
  protected final void bEJ()
  {
    GMTrace.i(16901098962944L, 125923);
    super.bEJ();
    this.rOY.An(11);
    GMTrace.o(16901098962944L, 125923);
  }
  
  protected final void bEK()
  {
    GMTrace.i(16900696309760L, 125920);
    super.bEK();
    yb(this.rOo);
    bEP().Jd(yc(this.rOo));
    GMTrace.o(16900696309760L, 125920);
  }
  
  protected final void bEL()
  {
    GMTrace.i(16224104742912L, 120879);
    if (this.rPb > 0)
    {
      GMTrace.o(16224104742912L, 120879);
      return;
    }
    super.bEL();
    bEP().Jd(getHint());
    this.rOY.An(2);
    this.rOk.setBackgroundResource(R.g.baB);
    this.oUu.setVisibility(8);
    this.rPl = null;
    this.rPm = 0;
    GMTrace.o(16224104742912L, 120879);
  }
  
  protected final void bEM()
  {
    GMTrace.i(19412312653824L, 144633);
    super.bEM();
    this.rOJ.setVisibility(0);
    if ((this.nXD.getView() != null) && ((this.nXD.getView() instanceof AbsoluteLayout)))
    {
      ((ViewGroup)this.oDf.getParent()).removeView(this.oDf);
      AbsoluteLayout.LayoutParams localLayoutParams = new AbsoluteLayout.LayoutParams(-1, -2, 0, this.rPf - this.rOX.getHeight());
      ((AbsoluteLayout)this.nXD.getView()).addView(this.oDf, localLayoutParams);
    }
    GMTrace.o(19412312653824L, 144633);
  }
  
  public final String bEN()
  {
    GMTrace.i(16263833190400L, 121175);
    if (this.rPm == 0)
    {
      GMTrace.o(16263833190400L, 121175);
      return "";
    }
    String str = this.rPl;
    GMTrace.o(16263833190400L, 121175);
    return str;
  }
  
  public final int bEO()
  {
    GMTrace.i(16263967408128L, 121176);
    int i = this.rPm;
    GMTrace.o(16263967408128L, 121176);
    return i;
  }
  
  protected final boolean bEX()
  {
    GMTrace.i(20439212490752L, 152284);
    if ((this.rOY.bFa()) && (!this.rOM.nhg) && (!this.rON.nhg) && (!this.rOO.nhg))
    {
      GMTrace.o(20439212490752L, 152284);
      return true;
    }
    GMTrace.o(20439212490752L, 152284);
    return false;
  }
  
  protected final void g(int paramInt, Bundle paramBundle)
  {
    int i = 0;
    GMTrace.i(16224507396096L, 120882);
    super.g(paramInt, paramBundle);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16224507396096L, 120882);
      return;
      ArrayList localArrayList = new ArrayList();
      String str;
      Object localObject;
      if (bEP().wjB.hasFocus())
      {
        str = paramBundle.getString("query");
        if (bEV().equals(str))
        {
          paramBundle = paramBundle.getStringArrayList("result").iterator();
          paramInt = i;
          while (paramBundle.hasNext())
          {
            localObject = (String)paramBundle.next();
            if (e.ah((String)localObject, str))
            {
              paramInt += 1;
              if (paramInt > 2) {
                break;
              }
              c localc = new c();
              localc.type = 1;
              localc.icon = R.k.cOR;
              localc.content = ((String)localObject);
              localc.rPF = R.g.baA;
              localArrayList.add(localc);
            }
          }
        }
      }
      af.t(new FTSSOSHomeWebViewUI.a.1(this.rOL, localArrayList));
      GMTrace.o(16224507396096L, 120882);
      return;
      localArrayList = new ArrayList();
      if (bEP().wjB.hasFocus())
      {
        str = paramBundle.getString("query");
        if (bEV().equals(str))
        {
          this.rPl = paramBundle.getString("suggestionId");
          paramBundle = paramBundle.getStringArrayList("result").iterator();
          while (paramBundle.hasNext())
          {
            str = (String)paramBundle.next();
            localObject = new c();
            ((c)localObject).type = 2;
            ((c)localObject).icon = 0;
            ((c)localObject).content = str;
            ((c)localObject).rPF = R.g.baC;
            localArrayList.add(localObject);
          }
        }
      }
      af.t(new FTSSOSHomeWebViewUI.a.3(this.rOL, localArrayList));
      GMTrace.o(16224507396096L, 120882);
      return;
      this.rOY.An(8);
      GMTrace.o(16224507396096L, 120882);
      return;
      this.rOY.An(10);
      GMTrace.o(16224507396096L, 120882);
      return;
      GMTrace.o(16224507396096L, 120882);
      return;
      paramBundle.getString("fts_key_new_query", "");
      this.rOY.An(13);
    }
  }
  
  protected final String getHint()
  {
    GMTrace.i(16224373178368L, 120881);
    String str = yc(bEU());
    GMTrace.o(16224373178368L, 120881);
    return str;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(16224238960640L, 120880);
    int i = R.i.cGM;
    GMTrace.o(16224238960640L, 120880);
    return i;
  }
  
  public final void he(boolean paramBoolean)
  {
    GMTrace.i(16223567872000L, 120875);
    if (this.rOY.bFa()) {
      super.he(paramBoolean);
    }
    this.rOY.An(5);
    GMTrace.o(16223567872000L, 120875);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(16901367398400L, 125925);
    if (this.rOR.getVisibility() == 0) {
      bEZ();
    }
    for (;;)
    {
      bEP().chC();
      GMTrace.o(16901367398400L, 125925);
      return;
      super.onBackPressed();
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20438944055296L, 152282);
    super.onDestroy();
    k.KE();
    k.KF();
    GMTrace.o(20438944055296L, 152282);
  }
  
  protected void onPause()
  {
    GMTrace.i(20438809837568L, 152281);
    super.onPause();
    k.KD();
    GMTrace.o(20438809837568L, 152281);
  }
  
  protected void onResume()
  {
    GMTrace.i(20438675619840L, 152280);
    super.onResume();
    k.KC();
    GMTrace.o(20438675619840L, 152280);
  }
  
  public final void onWebViewScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20439480926208L, 152286);
    super.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = Math.min(paramInt2, Math.max(com.tencent.mm.br.a.fromDPToPix(this, this.nXD.getContentHeight()) - this.nXD.getHeight(), 0));
    this.rOM.ye(this.rPe - paramInt1);
    this.rON.ye(this.rPe - paramInt1);
    this.rOO.ye(this.rPe - paramInt1);
    if (!this.rOY.bFa()) {
      this.rOk.setTranslationY(-paramInt1);
    }
    GMTrace.o(20439480926208L, 152286);
  }
  
  private final class a
    extends BaseAdapter
  {
    private List<FTSSOSHomeWebViewUI.c> rPv;
    
    private a()
    {
      GMTrace.i(16208938139648L, 120766);
      this.rPv = new ArrayList();
      GMTrace.o(16208938139648L, 120766);
    }
    
    public final void clear()
    {
      GMTrace.i(16209340792832L, 120769);
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16210682970112L, 120779);
          FTSSOSHomeWebViewUI.a.a(FTSSOSHomeWebViewUI.a.this).clear();
          FTSSOSHomeWebViewUI.a.this.notifyDataSetChanged();
          GMTrace.o(16210682970112L, 120779);
        }
      });
      GMTrace.o(16209340792832L, 120769);
    }
    
    public final int getCount()
    {
      GMTrace.i(16209475010560L, 120770);
      if (this.rPv.size() > 6)
      {
        GMTrace.o(16209475010560L, 120770);
        return 6;
      }
      int i = this.rPv.size();
      GMTrace.o(16209475010560L, 120770);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(16209743446016L, 120772);
      GMTrace.o(16209743446016L, 120772);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(16209877663744L, 120773);
      FTSSOSHomeWebViewUI.c localc;
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramView = LayoutInflater.from(FTSSOSHomeWebViewUI.this.vKB.vKW).inflate(R.i.cGO, null);
        paramViewGroup.iub = ((ImageView)paramView.findViewById(R.h.bGr));
        paramViewGroup.jRv = ((TextView)paramView.findViewById(R.h.brW));
        paramViewGroup.rPz = ((ImageView)paramView.findViewById(R.h.cgs));
        paramView.setTag(paramViewGroup);
        localc = yd(paramInt);
        localc.position = paramInt;
        if (localc.icon == 0) {
          break label214;
        }
        paramViewGroup.iub.setVisibility(0);
        paramViewGroup.iub.setImageResource(localc.icon);
        label130:
        if (localc.rPF == 0) {
          break label225;
        }
        paramViewGroup.rPz.setVisibility(0);
        paramViewGroup.rPz.setImageResource(localc.rPF);
        paramViewGroup.rPz.setTag(localc);
        paramViewGroup.rPz.setOnClickListener(FTSSOSHomeWebViewUI.s(FTSSOSHomeWebViewUI.this));
      }
      for (;;)
      {
        paramViewGroup.jRv.setText(localc.content);
        GMTrace.o(16209877663744L, 120773);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label214:
        paramViewGroup.iub.setVisibility(4);
        break label130;
        label225:
        paramViewGroup.rPz.setVisibility(4);
      }
    }
    
    public final FTSSOSHomeWebViewUI.c yd(int paramInt)
    {
      GMTrace.i(16209609228288L, 120771);
      FTSSOSHomeWebViewUI.c localc = (FTSSOSHomeWebViewUI.c)this.rPv.get(paramInt);
      GMTrace.o(16209609228288L, 120771);
      return localc;
    }
    
    private final class a
    {
      ImageView iub;
      TextView jRv;
      ImageView rPz;
      
      public a()
      {
        GMTrace.i(16221151952896L, 120857);
        GMTrace.o(16221151952896L, 120857);
      }
    }
  }
  
  private final class b
    extends com.tencent.mm.sdk.d.d
  {
    com.tencent.mm.sdk.d.c rPA;
    com.tencent.mm.sdk.d.c rPB;
    com.tencent.mm.sdk.d.c rPC;
    com.tencent.mm.sdk.d.c rPD;
    
    protected b(String paramString, Looper paramLooper)
    {
      super(paramLooper);
      GMTrace.i(16899219914752L, 125909);
      this.rPA = new a();
      this.rPB = new d();
      this.rPC = new b();
      this.rPD = new c();
      b(this.rPA);
      b(this.rPB);
      b(this.rPC);
      b(this.rPD);
      c(this.rPA);
      GMTrace.o(16899219914752L, 125909);
    }
    
    public final boolean bFa()
    {
      GMTrace.i(18126238384128L, 135051);
      com.tencent.mm.sdk.d.a locala = bRf();
      if ((locala == this.rPB) || (locala == this.rPC) || (locala == this.rPD))
      {
        GMTrace.o(18126238384128L, 135051);
        return true;
      }
      GMTrace.o(18126238384128L, 135051);
      return false;
    }
    
    private final class a
      extends com.tencent.mm.sdk.d.b
    {
      public a()
      {
        GMTrace.i(16896938213376L, 125892);
        GMTrace.o(16896938213376L, 125892);
      }
      
      public final void enter()
      {
        GMTrace.i(16897072431104L, 125893);
        super.enter();
        FTSSOSHomeWebViewUI.A(FTSSOSHomeWebViewUI.this);
        GMTrace.o(16897072431104L, 125893);
      }
      
      public final void exit()
      {
        GMTrace.i(16897206648832L, 125894);
        super.exit();
        FTSSOSHomeWebViewUI.B(FTSSOSHomeWebViewUI.this).setBackgroundColor(FTSSOSHomeWebViewUI.this.getResources().getColor(R.e.transparent));
        GMTrace.o(16897206648832L, 125894);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(16897340866560L, 125895);
        switch (paramMessage.what)
        {
        }
        for (;;)
        {
          boolean bool = super.f(paramMessage);
          GMTrace.o(16897340866560L, 125895);
          return bool;
          if ((FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this) != null) && (FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this).getVisibility() == 0))
          {
            Object localObject = (MotionEvent)paramMessage.obj;
            FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this).I((MotionEvent)localObject);
            continue;
            if (FTSSOSHomeWebViewUI.this.bET().length() > 0)
            {
              FTSSOSHomeWebViewUI.this.bEP().chC();
              FTSSOSHomeWebViewUI.this.bEP().wjB.clearFocus();
              FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this, 0);
              FTSSOSHomeWebViewUI.C(FTSSOSHomeWebViewUI.this).yg(a.b.rQf);
              FTSSOSHomeWebViewUI.g(FTSSOSHomeWebViewUI.this, a.b.rQf);
              FTSSOSHomeWebViewUI.this.rOk.setBackgroundResource(R.e.white);
              FTSSOSHomeWebViewUI.u(FTSSOSHomeWebViewUI.this).clear();
              continue;
              FTSSOSHomeWebViewUI.this.bEP().chC();
              FTSSOSHomeWebViewUI.this.bEP().wjB.clearFocus();
              FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this, 0);
              FTSSOSHomeWebViewUI.C(FTSSOSHomeWebViewUI.this).P(a.b.rQf, false);
              FTSSOSHomeWebViewUI.g(FTSSOSHomeWebViewUI.this, a.b.rQf);
              FTSSOSHomeWebViewUI.this.rOk.setBackgroundResource(R.e.white);
              FTSSOSHomeWebViewUI.u(FTSSOSHomeWebViewUI.this).clear();
              FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.rPC);
              FTSSOSHomeWebViewUI.this.rOr = true;
              continue;
              FTSSOSHomeWebViewUI.this.bEP().chC();
              FTSSOSHomeWebViewUI.D(FTSSOSHomeWebViewUI.this).yg(a.b.rQf);
              FTSSOSHomeWebViewUI.g(FTSSOSHomeWebViewUI.this, a.b.rQf);
              FTSSOSHomeWebViewUI.this.rOk.setBackgroundResource(R.e.white);
              FTSSOSHomeWebViewUI.u(FTSSOSHomeWebViewUI.this).clear();
              FTSSOSHomeWebViewUI.E(FTSSOSHomeWebViewUI.this);
              continue;
              FTSSOSHomeWebViewUI.this.rOr = true;
              FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.rPB);
              continue;
              FTSSOSHomeWebViewUI.this.rOr = true;
              FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.rPC);
              continue;
              if ((FTSSOSHomeWebViewUI.this.bEP().wjB.hasFocus()) && (FTSSOSHomeWebViewUI.this.bET().length() > 0)) {
                FTSSOSHomeWebViewUI.v(FTSSOSHomeWebViewUI.this);
              }
              if ((FTSSOSHomeWebViewUI.this.bEP().wjB.hasFocus()) && (FTSSOSHomeWebViewUI.this.bET().length() == 0))
              {
                FTSSOSHomeWebViewUI.this.bEP().chC();
                FTSSOSHomeWebViewUI.D(FTSSOSHomeWebViewUI.this).yg(a.b.rQf);
                FTSSOSHomeWebViewUI.g(FTSSOSHomeWebViewUI.this, a.b.rQf);
                FTSSOSHomeWebViewUI.this.rOk.setBackgroundResource(R.e.white);
                FTSSOSHomeWebViewUI.u(FTSSOSHomeWebViewUI.this).clear();
                localObject = FTSSOSHomeWebViewUI.F(FTSSOSHomeWebViewUI.this);
                if (!((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject).rSa)
                {
                  w.e("MicroMsg.JsApiHandler", "onFocusSearchInput fail, not ready");
                }
                else
                {
                  w.i("MicroMsg.JsApiHandler", "onFocusSearchInput success, ready");
                  af.t(new d.29((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject, i.a.a("onFocusSearchInput", null, ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject).rSc, ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject).rSd)));
                }
              }
            }
          }
        }
      }
      
      public final String getName()
      {
        GMTrace.i(16897475084288L, 125896);
        GMTrace.o(16897475084288L, 125896);
        return "InitSate";
      }
    }
    
    private final class b
      extends com.tencent.mm.sdk.d.b
    {
      public b()
      {
        GMTrace.i(16895730253824L, 125883);
        GMTrace.o(16895730253824L, 125883);
      }
      
      public final void enter()
      {
        GMTrace.i(16895864471552L, 125884);
        super.enter();
        FTSSOSHomeWebViewUI.g(FTSSOSHomeWebViewUI.this, a.b.rQf);
        FTSSOSHomeWebViewUI.this.rOk.setBackgroundResource(R.e.white);
        FTSSOSHomeWebViewUI.this.rOl.wjB.clearFocus();
        FTSSOSHomeWebViewUI.G(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.this.rOk.setPadding(FTSSOSHomeWebViewUI.H(FTSSOSHomeWebViewUI.this), 0, 0, 0);
        FTSSOSHomeWebViewUI.this.bEP().chC();
        FTSSOSHomeWebViewUI.this.rOm.setVisibility(0);
        FTSSOSHomeWebViewUI.this.nta.setVisibility(8);
        FTSSOSHomeWebViewUI.I(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.u(FTSSOSHomeWebViewUI.this).clear();
        FTSSOSHomeWebViewUI.B(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.l(FTSSOSHomeWebViewUI.this).setVisibility(8);
        if (!FTSSOSHomeWebViewUI.J(FTSSOSHomeWebViewUI.this)) {
          FTSSOSHomeWebViewUI.K(FTSSOSHomeWebViewUI.this).setVisibility(0);
        }
        FTSSOSHomeWebViewUI.this.bEP().iub.setVisibility(8);
        FTSSOSHomeWebViewUI.L(FTSSOSHomeWebViewUI.this).setVisibility(0);
        if ((com.tencent.mm.compatible.util.d.et(23)) && (!h.tE())) {
          FTSSOSHomeWebViewUI.h(FTSSOSHomeWebViewUI.this, FTSSOSHomeWebViewUI.this.getResources().getColor(R.e.white));
        }
        FTSSOSHomeWebViewUI.M(FTSSOSHomeWebViewUI.this).setAlpha(0.0F);
        FTSSOSHomeWebViewUI.N(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.this.nta.setAlpha(1.0F);
        FTSSOSHomeWebViewUI.this.rOk.setPadding(com.tencent.mm.br.a.fromDPToPix(FTSSOSHomeWebViewUI.this.vKB.vKW, 64) - (int)FTSSOSHomeWebViewUI.this.vKB.vKW.getResources().getDimension(R.f.aSS), 0, 0, 0);
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)FTSSOSHomeWebViewUI.this.rOk.getLayoutParams();
        localLayoutParams.leftMargin = 0;
        localLayoutParams.rightMargin = 0;
        if (FTSSOSHomeWebViewUI.this.rPd) {
          localLayoutParams.topMargin = 0;
        }
        localLayoutParams.width = -1;
        FTSSOSHomeWebViewUI.this.rOk.setLayoutParams(localLayoutParams);
        FTSSOSHomeWebViewUI.this.rOk.setY(0.0F);
        FTSSOSHomeWebViewUI.this.rOk.setX(0.0F);
        if (FTSSOSHomeWebViewUI.this.rPd)
        {
          FTSSOSHomeWebViewUI.this.rOk.setTranslationX(0.0F);
          FTSSOSHomeWebViewUI.this.rOk.setTranslationY(0.0F);
        }
        GMTrace.o(16895864471552L, 125884);
      }
      
      public final void exit()
      {
        GMTrace.i(16895998689280L, 125885);
        super.exit();
        GMTrace.o(16895998689280L, 125885);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(16896132907008L, 125886);
        switch (paramMessage.what)
        {
        }
        for (;;)
        {
          boolean bool = super.f(paramMessage);
          GMTrace.o(16896132907008L, 125886);
          return bool;
          if (!FTSSOSHomeWebViewUI.this.rPd)
          {
            FTSSOSHomeWebViewUI.O(FTSSOSHomeWebViewUI.this);
            FTSSOSHomeWebViewUI.K(FTSSOSHomeWebViewUI.this).setVisibility(8);
            FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this, 0);
            FTSSOSHomeWebViewUI.C(FTSSOSHomeWebViewUI.this).yg(a.b.rQe);
            FTSSOSHomeWebViewUI.g(FTSSOSHomeWebViewUI.this, a.b.rQe);
          }
          else
          {
            FTSSOSHomeWebViewUI.this.finish();
            continue;
            FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.rPA);
            continue;
            if (FTSSOSHomeWebViewUI.this.bEP().wjB.hasFocus()) {
              FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.rPB);
            }
          }
        }
      }
      
      public final String getName()
      {
        GMTrace.i(16896267124736L, 125887);
        GMTrace.o(16896267124736L, 125887);
        return "SearchNoFocusState";
      }
    }
    
    private final class c
      extends com.tencent.mm.sdk.d.b
    {
      public c()
      {
        GMTrace.i(16899891003392L, 125914);
        GMTrace.o(16899891003392L, 125914);
      }
      
      public final void enter()
      {
        GMTrace.i(16900025221120L, 125915);
        super.enter();
        FTSSOSHomeWebViewUI.this.rOk.setPadding(FTSSOSHomeWebViewUI.H(FTSSOSHomeWebViewUI.this), 0, 0, 0);
        FTSSOSHomeWebViewUI.this.bEP().chC();
        FTSSOSHomeWebViewUI.this.rOm.setVisibility(0);
        FTSSOSHomeWebViewUI.this.nta.setVisibility(8);
        FTSSOSHomeWebViewUI.I(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.B(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.l(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.K(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.this.bEP().chB();
        FTSSOSHomeWebViewUI.L(FTSSOSHomeWebViewUI.this).setVisibility(0);
        GMTrace.o(16900025221120L, 125915);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(16900159438848L, 125916);
        switch (paramMessage.what)
        {
        }
        for (;;)
        {
          boolean bool = super.f(paramMessage);
          GMTrace.o(16900159438848L, 125916);
          return bool;
          if (FTSSOSHomeWebViewUI.this.bEP().wjB.hasFocus())
          {
            FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.rPB);
            continue;
            if (FTSSOSHomeWebViewUI.this.bET().length() > 0)
            {
              FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.rPC);
              continue;
              if (FTSSOSHomeWebViewUI.this.bET().length() > 0)
              {
                FTSSOSHomeWebViewUI.this.bEP().chC();
                FTSSOSHomeWebViewUI.this.bEP().wjB.clearFocus();
                FTSSOSHomeWebViewUI.u(FTSSOSHomeWebViewUI.this).clear();
                FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.rPC);
                continue;
                if (!FTSSOSHomeWebViewUI.this.rPd)
                {
                  FTSSOSHomeWebViewUI.O(FTSSOSHomeWebViewUI.this);
                  FTSSOSHomeWebViewUI.K(FTSSOSHomeWebViewUI.this).setVisibility(8);
                  FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this, 0);
                  FTSSOSHomeWebViewUI.P(FTSSOSHomeWebViewUI.this).yg(a.b.rQe);
                  FTSSOSHomeWebViewUI.g(FTSSOSHomeWebViewUI.this, a.b.rQe);
                }
                else
                {
                  FTSSOSHomeWebViewUI.this.finish();
                  continue;
                  FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.rPA);
                }
              }
            }
          }
        }
      }
      
      public final String getName()
      {
        GMTrace.i(16900293656576L, 125917);
        GMTrace.o(16900293656576L, 125917);
        return "SearchWithFocusNoResultState";
      }
    }
    
    private final class d
      extends com.tencent.mm.sdk.d.b
    {
      public d()
      {
        GMTrace.i(16907541413888L, 125971);
        GMTrace.o(16907541413888L, 125971);
      }
      
      public final void enter()
      {
        GMTrace.i(16907675631616L, 125972);
        super.enter();
        FTSSOSHomeWebViewUI.G(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.this.rOk.setPadding(0, 0, 0, 0);
        FTSSOSHomeWebViewUI.K(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this);
        FTSSOSHomeWebViewUI.this.bEP().chB();
        FTSSOSHomeWebViewUI.B(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.l(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.L(FTSSOSHomeWebViewUI.this).setVisibility(0);
        if (!FTSSOSHomeWebViewUI.this.bEP().wjB.hasFocus())
        {
          FTSSOSHomeWebViewUI.this.bEP().chz();
          FTSSOSHomeWebViewUI.this.aLs();
        }
        if ((com.tencent.mm.compatible.util.d.et(23)) && (!h.tE())) {
          FTSSOSHomeWebViewUI.i(FTSSOSHomeWebViewUI.this, FTSSOSHomeWebViewUI.this.getResources().getColor(R.e.white));
        }
        if (!TextUtils.isEmpty(FTSSOSHomeWebViewUI.this.bEV())) {
          FTSSOSHomeWebViewUI.this.bEP().xcQ.setVisibility(0);
        }
        GMTrace.o(16907675631616L, 125972);
      }
      
      public final void exit()
      {
        GMTrace.i(16907809849344L, 125973);
        super.exit();
        GMTrace.o(16907809849344L, 125973);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(16907944067072L, 125974);
        switch (paramMessage.what)
        {
        }
        for (;;)
        {
          boolean bool = super.f(paramMessage);
          GMTrace.o(16907944067072L, 125974);
          return bool;
          if (!FTSSOSHomeWebViewUI.this.rPd)
          {
            FTSSOSHomeWebViewUI.O(FTSSOSHomeWebViewUI.this);
            FTSSOSHomeWebViewUI.K(FTSSOSHomeWebViewUI.this).setVisibility(8);
            FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this, 0);
            FTSSOSHomeWebViewUI.D(FTSSOSHomeWebViewUI.this).yg(a.b.rQe);
            FTSSOSHomeWebViewUI.g(FTSSOSHomeWebViewUI.this, a.b.rQe);
          }
          else
          {
            FTSSOSHomeWebViewUI.this.finish();
            continue;
            FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.rPA);
            continue;
            if (!FTSSOSHomeWebViewUI.this.bEP().wjB.hasFocus())
            {
              FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.rPD);
              continue;
              if (FTSSOSHomeWebViewUI.this.bET().length() > 0) {
                FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.rPC);
              }
            }
          }
        }
      }
      
      public final String getName()
      {
        GMTrace.i(16908078284800L, 125975);
        GMTrace.o(16908078284800L, 125975);
        return "SearchWithFocusState";
      }
    }
  }
  
  private final class c
  {
    String content;
    int icon;
    int position;
    int rPF;
    int type;
    
    public c()
    {
      GMTrace.i(16222091476992L, 120864);
      GMTrace.o(16222091476992L, 120864);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(16222225694720L, 120865);
      paramObject = (c)paramObject;
      boolean bool = this.content.equals(((c)paramObject).content);
      GMTrace.o(16222225694720L, 120865);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\fts\FTSSOSHomeWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */