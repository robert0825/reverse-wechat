package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.HandlerThread;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.t;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.av.a.c;
import com.tencent.mm.g.a.lp;
import com.tencent.mm.g.a.pu;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.plugin.setting.b.a.1;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.arw;
import com.tencent.mm.protocal.c.arx;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.RealAlphabetScrollBar;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UnfamiliarContactDetailUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  public static final String jRE;
  private r ihl;
  private ArrayList<b> ikk;
  private View nXz;
  private boolean oFV;
  private boolean oFW;
  private boolean oFX;
  private RecyclerView oKH;
  private TextView oKI;
  private View oKJ;
  private View oKK;
  private View oKL;
  private TextView oKM;
  private a oKN;
  private RealAlphabetScrollBar oKO;
  HashMap<String, Integer> oKP;
  private HashMap<Integer, String> oKQ;
  private HashSet<Integer> oKR;
  private d oKS;
  private int oKT;
  private HashSet<String> oKU;
  private com.tencent.mm.plugin.setting.b.a oKV;
  private boolean oKW;
  
  static
  {
    GMTrace.i(18383802204160L, 136970);
    jRE = new String(Character.toChars(123));
    GMTrace.o(18383802204160L, 136970);
  }
  
  public UnfamiliarContactDetailUI()
  {
    GMTrace.i(18379775672320L, 136940);
    this.oKP = new HashMap();
    this.oKQ = new HashMap();
    this.ikk = new ArrayList();
    this.oKR = new HashSet();
    this.oKT = -1;
    this.oKU = new HashSet();
    this.ihl = null;
    GMTrace.o(18379775672320L, 136940);
  }
  
  private void bq(List<b> paramList)
  {
    GMTrace.i(18380849414144L, 136948);
    this.oKP.clear();
    this.oKQ.clear();
    Iterator localIterator = paramList.iterator();
    int i = 0;
    Object localObject;
    for (paramList = null; localIterator.hasNext(); paramList = (List<b>)localObject)
    {
      localObject = (b)localIterator.next();
      if (jRE.equalsIgnoreCase(((b)localObject).oLd)) {
        ((b)localObject).oLd = "#";
      }
      localObject = ((b)localObject).oLd;
      if (!((String)localObject).equalsIgnoreCase(paramList))
      {
        this.oKP.put(((String)localObject).toUpperCase(), Integer.valueOf(i));
        this.oKQ.put(Integer.valueOf(i), ((String)localObject).toUpperCase());
      }
      i += 1;
    }
    GMTrace.o(18380849414144L, 136948);
  }
  
  private void du(boolean paramBoolean)
  {
    GMTrace.i(18380983631872L, 136949);
    w.i("MicroMsg.UnfamiliarContactUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.ihl = r.b(this, getString(R.l.eeX), true, 0, null);
      GMTrace.o(18380983631872L, 136949);
      return;
    }
    if ((this.ihl != null) && (this.ihl.isShowing()))
    {
      this.ihl.dismiss();
      this.ihl = null;
    }
    GMTrace.o(18380983631872L, 136949);
  }
  
  protected final void MP()
  {
    int j = 0;
    GMTrace.i(18380446760960L, 136945);
    super.MP();
    oM(R.l.ebe);
    a(1, getString(R.l.eeZ), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18387291865088L, 136996);
        paramAnonymousMenuItem = UnfamiliarContactDetailUI.this;
        boolean bool;
        if (!UnfamiliarContactDetailUI.a(UnfamiliarContactDetailUI.this))
        {
          bool = true;
          UnfamiliarContactDetailUI.a(paramAnonymousMenuItem, bool);
          UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this).clear();
          UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this, UnfamiliarContactDetailUI.a(UnfamiliarContactDetailUI.this));
          if (!UnfamiliarContactDetailUI.a(UnfamiliarContactDetailUI.this)) {
            break label143;
          }
          UnfamiliarContactDetailUI.c(UnfamiliarContactDetailUI.this).setEnabled(false);
          UnfamiliarContactDetailUI.d(UnfamiliarContactDetailUI.this).setEnabled(false);
          UnfamiliarContactDetailUI.this.aH(1, UnfamiliarContactDetailUI.this.getString(R.l.eeV));
        }
        for (;;)
        {
          if (UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.this) != null) {
            UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.this).TS.notifyChanged();
          }
          GMTrace.o(18387291865088L, 136996);
          return true;
          bool = false;
          break;
          label143:
          UnfamiliarContactDetailUI.this.aH(1, UnfamiliarContactDetailUI.this.getString(R.l.eeZ));
        }
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18376822882304L, 136918);
        UnfamiliarContactDetailUI.this.finish();
        GMTrace.o(18376822882304L, 136918);
        return true;
      }
    });
    View localView = findViewById(R.h.ccW);
    if (this.oFV)
    {
      i = 0;
      localView.setVisibility(i);
      localView = findViewById(R.h.ccY);
      if (!this.oFX) {
        break label357;
      }
      i = 0;
      label93:
      localView.setVisibility(i);
      localView = findViewById(R.h.ccX);
      if (!this.oFW) {
        break label363;
      }
    }
    label357:
    label363:
    for (int i = j;; i = 8)
    {
      localView.setVisibility(i);
      this.oKH = ((RecyclerView)findViewById(R.h.cji));
      this.nXz = findViewById(R.h.bottom_bar);
      this.oKI = ((TextView)findViewById(R.h.bMM));
      this.oKS = new d(this.oKR, new g()
      {
        public final void beS()
        {
          GMTrace.i(18384473292800L, 136975);
          UnfamiliarContactDetailUI.c(UnfamiliarContactDetailUI.this, true);
          GMTrace.o(18384473292800L, 136975);
        }
        
        public final void cU(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(19533242826752L, 145534);
          UnfamiliarContactDetailUI.f.oLv += paramAnonymousInt1;
          UnfamiliarContactDetailUI.c(UnfamiliarContactDetailUI.this, false);
          UnfamiliarContactDetailUI.g(UnfamiliarContactDetailUI.this).setText(UnfamiliarContactDetailUI.this.getString(R.l.eeY) + "(" + UnfamiliarContactDetailUI.f(UnfamiliarContactDetailUI.this).size() + ")");
          if (UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.this) != null) {
            UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.this).TS.notifyChanged();
          }
          if (paramAnonymousInt2 < paramAnonymousInt1)
          {
            w.w("MicroMsg.UnfamiliarContactUI", "[onDelSuccess] realDeleteCount:%s count:%s", new Object[] { Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt1) });
            com.tencent.mm.ui.base.h.b(UnfamiliarContactDetailUI.this.vKB.vKW, UnfamiliarContactDetailUI.this.getString(R.l.eeW, new Object[] { Integer.valueOf(paramAnonymousInt1 - paramAnonymousInt2) }), "", true);
          }
          GMTrace.o(19533242826752L, 145534);
        }
      });
      this.oKJ = findViewById(R.h.cjf);
      this.oKJ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18377628188672L, 136924);
          com.tencent.mm.ui.base.h.a(UnfamiliarContactDetailUI.this.vKB.vKW, true, UnfamiliarContactDetailUI.this.vKB.vKW.getString(R.l.efb), UnfamiliarContactDetailUI.this.vKB.vKW.getString(R.l.bqx), UnfamiliarContactDetailUI.this.vKB.vKW.getString(R.l.cSt), UnfamiliarContactDetailUI.this.vKB.vKW.getString(R.l.cSk), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(18376017575936L, 136912);
              if (UnfamiliarContactDetailUI.h(UnfamiliarContactDetailUI.this) != null)
              {
                com.tencent.mm.kernel.h.xz();
                com.tencent.mm.kernel.h.xx().fYr.a(681, UnfamiliarContactDetailUI.h(UnfamiliarContactDetailUI.this));
                paramAnonymous2DialogInterface = UnfamiliarContactDetailUI.h(UnfamiliarContactDetailUI.this);
                paramAnonymous2DialogInterface.index = 0;
                paramAnonymous2DialogInterface.mVd = 0;
                paramAnonymous2DialogInterface.oLo = 0;
                paramAnonymous2DialogInterface.oLp.clear();
                paramAnonymous2DialogInterface.oLq.clear();
                com.tencent.mm.sdk.f.e.remove(paramAnonymous2DialogInterface);
                if (paramAnonymous2DialogInterface.oLm != null) {
                  paramAnonymous2DialogInterface.oLm.beS();
                }
                com.tencent.mm.sdk.f.e.post(paramAnonymous2DialogInterface, "delete_contact_task");
              }
              UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this, false);
              GMTrace.o(18376017575936L, 136912);
            }
          }, null, R.e.aMJ, 0);
          GMTrace.o(18377628188672L, 136924);
        }
      });
      this.oKK = findViewById(R.h.cjg);
      this.oKK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18385547034624L, 136983);
          paramAnonymousView = new f(UnfamiliarContactDetailUI.this, f.xpQ, false);
          paramAnonymousView.qik = new p.c()
          {
            public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
            {
              GMTrace.i(18386352340992L, 136989);
              paramAnonymous2n.a(0, UnfamiliarContactDetailUI.this.getString(R.l.dLH), UnfamiliarContactDetailUI.this.getString(R.l.dXP), UnfamiliarContactDetailUI.this.getResources().getDrawable(R.k.cLv), false);
              paramAnonymous2n.a(1, UnfamiliarContactDetailUI.this.getString(R.l.dLI), UnfamiliarContactDetailUI.this.getString(R.l.dXP), UnfamiliarContactDetailUI.this.getResources().getDrawable(R.k.cLw), false);
              GMTrace.o(18386352340992L, 136989);
            }
          };
          paramAnonymousView.qil = new p.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(18377359753216L, 136922);
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.b(681, UnfamiliarContactDetailUI.h(UnfamiliarContactDetailUI.this));
              UnfamiliarContactDetailUI.a(UnfamiliarContactDetailUI.this, UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this), paramAnonymous2Int);
              UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this, false);
              if (UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.this) != null) {
                UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.this).TS.notifyChanged();
              }
              GMTrace.o(18377359753216L, 136922);
            }
          };
          paramAnonymousView.bFk();
          GMTrace.o(18385547034624L, 136983);
        }
      });
      this.oKL = findViewById(R.h.cjh);
      this.oKL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18384741728256L, 136977);
          paramAnonymousView = (CheckBox)UnfamiliarContactDetailUI.i(UnfamiliarContactDetailUI.this).findViewById(R.h.checkbox);
          if (!paramAnonymousView.isChecked()) {}
          for (boolean bool = true;; bool = false)
          {
            paramAnonymousView.setChecked(bool);
            if (!paramAnonymousView.isChecked()) {
              break;
            }
            int i = 0;
            while (i < UnfamiliarContactDetailUI.f(UnfamiliarContactDetailUI.this).size())
            {
              UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this).add(Integer.valueOf(i));
              i += 1;
            }
          }
          UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this).clear();
          if (UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this).size() > 0)
          {
            UnfamiliarContactDetailUI.d(UnfamiliarContactDetailUI.this).setEnabled(true);
            UnfamiliarContactDetailUI.c(UnfamiliarContactDetailUI.this).setEnabled(true);
          }
          for (;;)
          {
            UnfamiliarContactDetailUI.j(UnfamiliarContactDetailUI.this).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(18377091317760L, 136920);
                UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.this).TS.notifyChanged();
                GMTrace.o(18377091317760L, 136920);
              }
            });
            GMTrace.o(18384741728256L, 136977);
            return;
            UnfamiliarContactDetailUI.d(UnfamiliarContactDetailUI.this).setEnabled(false);
            UnfamiliarContactDetailUI.c(UnfamiliarContactDetailUI.this).setEnabled(false);
          }
        }
      });
      this.oKM = ((TextView)findViewById(R.h.chy));
      this.oKH.a(new LinearLayoutManager());
      this.oKN = new a();
      this.oKH.a(this.oKN);
      this.oKO = ((RealAlphabetScrollBar)findViewById(R.h.cjj));
      this.oKO.wiZ = new VerticalScrollBar.a()
      {
        public final void uW(String paramAnonymousString)
        {
          GMTrace.i(18386620776448L, 136991);
          UnfamiliarContactDetailUI localUnfamiliarContactDetailUI = UnfamiliarContactDetailUI.this;
          if ((localUnfamiliarContactDetailUI.oKP != null) && (localUnfamiliarContactDetailUI.oKP.containsKey(paramAnonymousString))) {}
          for (int i = ((Integer)localUnfamiliarContactDetailUI.oKP.get(paramAnonymousString)).intValue();; i = -1)
          {
            w.i("MicroMsg.UnfamiliarContactUI", "[onScollBarTouch] showHead:%s pos:%s", new Object[] { paramAnonymousString, Integer.valueOf(i) });
            if (i != -1) {
              UnfamiliarContactDetailUI.j(UnfamiliarContactDetailUI.this).aX(i);
            }
            GMTrace.o(18386620776448L, 136991);
            return;
          }
        }
      };
      GMTrace.o(18380446760960L, 136945);
      return;
      i = 8;
      break;
      i = 8;
      break label93;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(18380715196416L, 136947);
    w.i("MicroMsg.UnfamiliarContactUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " " + paramk.getType());
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      Toast.makeText(this, getString(R.l.efa), 1).show();
    }
    if (paramk.getType() == 291)
    {
      du(false);
      this.oKU.clear();
      this.oKN.TS.notifyChanged();
    }
    GMTrace.o(18380715196416L, 136947);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18379909890048L, 136941);
    int i = R.i.cGl;
    GMTrace.o(18379909890048L, 136941);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18380044107776L, 136942);
    super.onCreate(paramBundle);
    at.wS().a(291, this);
    this.oFV = getIntent().getBooleanExtra("half_year_not_chat", false);
    this.oFW = getIntent().getBooleanExtra("half_year_not_response", false);
    this.oFX = getIntent().getBooleanExtra("has_not_same_chatroom", false);
    MP();
    paramBundle = new h()
    {
      long start;
      
      public final void a(UnfamiliarContactDetailUI.e paramAnonymouse)
      {
        GMTrace.i(18387828736000L, 137000);
        w.i("MicroMsg.UnfamiliarContactUI", "[onLoading] type:%s", new Object[] { paramAnonymouse.name() });
        UnfamiliarContactDetailUI.this.findViewById(R.h.chu).setVisibility(0);
        UnfamiliarContactDetailUI.this.findViewById(R.h.bUv).setVisibility(0);
        if (paramAnonymouse == UnfamiliarContactDetailUI.e.oLt)
        {
          UnfamiliarContactDetailUI.k(UnfamiliarContactDetailUI.this).setText(UnfamiliarContactDetailUI.this.getString(R.l.bKJ));
          GMTrace.o(18387828736000L, 137000);
          return;
        }
        if (paramAnonymouse == UnfamiliarContactDetailUI.e.oLs) {
          UnfamiliarContactDetailUI.k(UnfamiliarContactDetailUI.this).setText(UnfamiliarContactDetailUI.this.getString(R.l.efd));
        }
        GMTrace.o(18387828736000L, 137000);
      }
      
      public final void e(HashSet paramAnonymousHashSet)
      {
        GMTrace.i(18387962953728L, 137001);
        if (paramAnonymousHashSet == null) {}
        for (int i = 0;; i = paramAnonymousHashSet.size())
        {
          w.i("MicroMsg.UnfamiliarContactUI", "[onResult] size:%s", new Object[] { Integer.valueOf(i) });
          if (paramAnonymousHashSet != null) {
            UnfamiliarContactDetailUI.a(UnfamiliarContactDetailUI.this, paramAnonymousHashSet);
          }
          GMTrace.o(18387962953728L, 137001);
          return;
        }
      }
      
      public final void onError()
      {
        GMTrace.i(18387694518272L, 136999);
        w.e("MicroMsg.UnfamiliarContactUI", "[onError]");
        UnfamiliarContactDetailUI.this.findViewById(R.h.chu).setVisibility(0);
        UnfamiliarContactDetailUI.this.findViewById(R.h.bUv).setVisibility(8);
        UnfamiliarContactDetailUI.k(UnfamiliarContactDetailUI.this).setText(UnfamiliarContactDetailUI.this.getString(R.l.efc));
        GMTrace.o(18387694518272L, 136999);
      }
      
      public final void onSuccess()
      {
        GMTrace.i(18387560300544L, 136998);
        w.i("MicroMsg.UnfamiliarContactUI", "[onSuccess] size:%s cost:%sms", new Object[] { Integer.valueOf(UnfamiliarContactDetailUI.f(UnfamiliarContactDetailUI.this).size()), Long.valueOf(System.currentTimeMillis() - this.start) });
        UnfamiliarContactDetailUI.g(UnfamiliarContactDetailUI.this).setText(UnfamiliarContactDetailUI.this.getString(R.l.eeY) + "(" + UnfamiliarContactDetailUI.f(UnfamiliarContactDetailUI.this).size() + ")");
        if (UnfamiliarContactDetailUI.f(UnfamiliarContactDetailUI.this).size() == 0)
        {
          UnfamiliarContactDetailUI.this.findViewById(R.h.chu).setVisibility(0);
          UnfamiliarContactDetailUI.this.findViewById(R.h.bUv).setVisibility(8);
          UnfamiliarContactDetailUI.this.findViewById(R.h.bKj).setVisibility(8);
          UnfamiliarContactDetailUI.k(UnfamiliarContactDetailUI.this).setText(UnfamiliarContactDetailUI.this.getString(R.l.dGz));
          GMTrace.o(18387560300544L, 136998);
          return;
        }
        UnfamiliarContactDetailUI.this.findViewById(R.h.chu).setVisibility(8);
        UnfamiliarContactDetailUI.this.findViewById(R.h.bKj).setVisibility(0);
        if (UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.this) != null) {
          UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.this).TS.notifyChanged();
        }
        GMTrace.o(18387560300544L, 136998);
      }
    };
    this.oKV = new com.tencent.mm.plugin.setting.b.a(this.oFV, this.oFW, this.oFX, paramBundle);
    paramBundle = this.oKV;
    paramBundle.lJd = System.currentTimeMillis();
    paramBundle.oGe.a(e.oLt);
    paramBundle.fZz.A(new a.1(paramBundle));
    GMTrace.o(18380044107776L, 136942);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(18380312543232L, 136944);
    super.onDestroy();
    int i;
    int j;
    if (this.oFV)
    {
      i = 1;
      if (!this.oFX) {
        break label357;
      }
      j = 2;
      label31:
      if (!this.oFW) {
        break label362;
      }
    }
    label357:
    label362:
    for (int k = 4;; k = 0)
    {
      i = k | j | i;
      com.tencent.mm.plugin.report.service.g.ork.i(14434, new Object[] { Integer.valueOf(i), Integer.valueOf(f.oLw), Integer.valueOf(f.oLv), Integer.valueOf(f.oLA), Integer.valueOf(f.oLx), Integer.valueOf(f.oLz), Integer.valueOf(f.oLy) });
      w.i("MicroMsg.UnfamiliarContactUI", "[%s:%s:%s:%s:%s:%s:%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(f.oLw), Integer.valueOf(f.oLv), Integer.valueOf(f.oLA), Integer.valueOf(f.oLx), Integer.valueOf(f.oLz), Integer.valueOf(f.oLy) });
      f.oLv = 0;
      f.oLw = 0;
      f.oLx = 0;
      f.oLy = 0;
      f.oLz = 0;
      f.oLA = 0;
      at.wS().b(291, this);
      at.wS().b(681, this.oKS);
      com.tencent.mm.plugin.setting.b.a locala = this.oKV;
      w.i("MicroMsg.UnfamiliarContactEngine", "[onDestroy] [%s:%s:%s]", new Object[] { Boolean.valueOf(locala.oFW), Boolean.valueOf(locala.oFV), Boolean.valueOf(locala.oFX) });
      if (locala.oGd != null)
      {
        com.tencent.mm.plugin.setting.b.a.a locala1 = locala.oGd;
        at.wS().b(292, locala1);
      }
      locala.fZz.ngv.quit();
      com.tencent.mm.sdk.f.e.L(locala.mRunnable);
      GMTrace.o(18380312543232L, 136944);
      return;
      i = 0;
      break;
      j = 0;
      break label31;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(18380580978688L, 136946);
    if (paramInt == 4)
    {
      onBackPressed();
      GMTrace.o(18380580978688L, 136946);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(18380580978688L, 136946);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(18380178325504L, 136943);
    super.onResume();
    int i;
    if (-1 != this.oKT)
    {
      if (-1 != this.oKT) {
        break label82;
      }
      i = 0;
    }
    for (;;)
    {
      if (i != 0) {
        f.oLw += 1;
      }
      this.oKT = -1;
      this.oKU.clear();
      if (this.oKN != null) {
        this.oKN.TS.notifyChanged();
      }
      GMTrace.o(18380178325504L, 136943);
      return;
      label82:
      b localb = (b)this.ikk.get(this.oKT);
      x localx1 = localb.iBi;
      x localx2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(localx1.field_username);
      if ((!com.tencent.mm.l.a.eE(localx2.field_type)) && (com.tencent.mm.l.a.eE(localx1.field_type)))
      {
        this.ikk.remove(this.oKT);
        i = 1;
      }
      else
      {
        localb.iBi = localx2;
        i = 0;
      }
    }
  }
  
  final class a
    extends RecyclerView.a
  {
    a()
    {
      GMTrace.i(18389170913280L, 137010);
      GMTrace.o(18389170913280L, 137010);
    }
    
    public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(18389305131008L, 137011);
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(R.i.cHi, paramViewGroup, false);
      paramViewGroup = new UnfamiliarContactDetailUI.c(UnfamiliarContactDetailUI.this, paramViewGroup);
      GMTrace.o(18389305131008L, 137011);
      return paramViewGroup;
    }
    
    public final void a(RecyclerView.t paramt, int paramInt)
    {
      GMTrace.i(18389439348736L, 137012);
      if ((paramt instanceof UnfamiliarContactDetailUI.c))
      {
        paramt = (UnfamiliarContactDetailUI.c)paramt;
        paramt.oLi.setTag(Integer.valueOf(paramInt));
        paramt.UU.setTag(Integer.valueOf(paramInt));
        Object localObject = (UnfamiliarContactDetailUI.b)UnfamiliarContactDetailUI.f(UnfamiliarContactDetailUI.this).get(paramInt);
        a.b.a((ImageView)paramt.jRj.view, ((UnfamiliarContactDetailUI.b)localObject).iBi.field_username);
        paramt.oLe.setText(com.tencent.mm.pluginsdk.ui.d.h.b(UnfamiliarContactDetailUI.this.vKB.vKW, ((UnfamiliarContactDetailUI.b)localObject).fMz, paramt.oLe.getTextSize()));
        ImageView localImageView = paramt.oLh;
        int i;
        if (((UnfamiliarContactDetailUI.b)localObject).iBi.ve())
        {
          i = 0;
          localImageView.setVisibility(i);
          localImageView = paramt.oLg;
          localObject = ((UnfamiliarContactDetailUI.b)localObject).iBi.field_username;
          if ((com.tencent.mm.plugin.sns.b.n.poR != null) && (UnfamiliarContactDetailUI.n(UnfamiliarContactDetailUI.this).size() == 0))
          {
            List localList = com.tencent.mm.plugin.sns.b.n.poR.dr(5L);
            UnfamiliarContactDetailUI.n(UnfamiliarContactDetailUI.this).addAll(localList);
          }
          if (!UnfamiliarContactDetailUI.n(UnfamiliarContactDetailUI.this).contains(localObject)) {
            break label356;
          }
          i = 0;
          label214:
          localImageView.setVisibility(i);
          if (!UnfamiliarContactDetailUI.m(UnfamiliarContactDetailUI.this).containsKey(Integer.valueOf(paramInt))) {
            break label362;
          }
          paramt.oLf.setVisibility(0);
          paramt.oLf.setText((CharSequence)UnfamiliarContactDetailUI.m(UnfamiliarContactDetailUI.this).get(Integer.valueOf(paramInt)));
          label269:
          if (!UnfamiliarContactDetailUI.a(UnfamiliarContactDetailUI.this)) {
            break label385;
          }
          paramt.oLj.setPadding(paramt.oLj.getPaddingLeft(), paramt.oLj.getPaddingTop(), 0, paramt.oLj.getPaddingBottom());
          if (!UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this).contains(Integer.valueOf(paramInt))) {
            break label374;
          }
          paramt.lCA.setChecked(true);
        }
        for (;;)
        {
          paramt.oLi.setVisibility(0);
          GMTrace.o(18389439348736L, 137012);
          return;
          i = 8;
          break;
          label356:
          i = 8;
          break label214;
          label362:
          paramt.oLf.setVisibility(8);
          break label269;
          label374:
          paramt.lCA.setChecked(false);
        }
        label385:
        paramt.oLj.setPadding(paramt.oLj.getPaddingLeft(), paramt.oLj.getPaddingTop(), (int)UnfamiliarContactDetailUI.this.getResources().getDimension(R.f.aQt), paramt.oLj.getPaddingBottom());
        paramt.oLi.setVisibility(8);
      }
      GMTrace.o(18389439348736L, 137012);
    }
    
    public final int getItemCount()
    {
      GMTrace.i(18389573566464L, 137013);
      int i = UnfamiliarContactDetailUI.f(UnfamiliarContactDetailUI.this).size();
      GMTrace.o(18389573566464L, 137013);
      return i;
    }
    
    public final UnfamiliarContactDetailUI.b tL(int paramInt)
    {
      GMTrace.i(18389707784192L, 137014);
      if (UnfamiliarContactDetailUI.f(UnfamiliarContactDetailUI.this).size() > paramInt)
      {
        localb = (UnfamiliarContactDetailUI.b)UnfamiliarContactDetailUI.f(UnfamiliarContactDetailUI.this).get(paramInt);
        GMTrace.o(18389707784192L, 137014);
        return localb;
      }
      UnfamiliarContactDetailUI.b localb = new UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this, new x());
      GMTrace.o(18389707784192L, 137014);
      return localb;
    }
  }
  
  final class b
  {
    String fMz;
    x iBi;
    String oLd;
    
    public b(x paramx)
    {
      GMTrace.i(18386754994176L, 136992);
      this.iBi = paramx;
      GMTrace.o(18386754994176L, 136992);
    }
  }
  
  final class c
    extends RecyclerView.t
  {
    View UU;
    MaskLayout jRj;
    CheckBox lCA;
    TextView oLe;
    TextView oLf;
    ImageView oLg;
    ImageView oLh;
    LinearLayout oLi;
    LinearLayout oLj;
    
    public c(View paramView)
    {
      super();
      GMTrace.i(18379641454592L, 136939);
      this.UU = paramView;
      this.jRj = ((MaskLayout)paramView.findViewById(R.h.bqj));
      this.oLe = ((TextView)paramView.findViewById(R.h.brr));
      this.oLf = ((TextView)paramView.findViewById(R.h.bqi));
      this.oLg = ((ImageView)paramView.findViewById(R.h.bry));
      this.oLh = ((ImageView)paramView.findViewById(R.h.brz));
      this.oLi = ((LinearLayout)paramView.findViewById(R.h.bpd));
      this.lCA = ((CheckBox)paramView.findViewById(R.h.checkbox));
      this.oLj = ((LinearLayout)paramView.findViewById(R.h.bIF));
      this.oLi.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18379507236864L, 136938);
          int i = ((Integer)paramAnonymousView.getTag()).intValue();
          paramAnonymousView = UnfamiliarContactDetailUI.c.this.lCA;
          boolean bool;
          if (!UnfamiliarContactDetailUI.c.this.lCA.isChecked())
          {
            bool = true;
            paramAnonymousView.setChecked(bool);
            if (!UnfamiliarContactDetailUI.c.this.lCA.isChecked()) {
              break label136;
            }
            UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this).add(Integer.valueOf(i));
          }
          for (;;)
          {
            if (UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this).size() != 0) {
              break label157;
            }
            UnfamiliarContactDetailUI.d(UnfamiliarContactDetailUI.this).setEnabled(false);
            UnfamiliarContactDetailUI.c(UnfamiliarContactDetailUI.this).setEnabled(false);
            GMTrace.o(18379507236864L, 136938);
            return;
            bool = false;
            break;
            label136:
            UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this).remove(Integer.valueOf(i));
          }
          label157:
          UnfamiliarContactDetailUI.d(UnfamiliarContactDetailUI.this).setEnabled(true);
          UnfamiliarContactDetailUI.c(UnfamiliarContactDetailUI.this).setEnabled(true);
          GMTrace.o(18379507236864L, 136938);
        }
      });
      paramView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18389036695552L, 137009);
          int i = ((Integer)paramAnonymousView.getTag()).intValue();
          paramAnonymousView = UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.this).tL(i);
          w.i("MicroMsg.UnfamiliarContactUI", "position:%s", new Object[] { Integer.valueOf(i), paramAnonymousView.fMz });
          UnfamiliarContactDetailUI.c localc = UnfamiliarContactDetailUI.c.this;
          if (paramAnonymousView == null)
          {
            GMTrace.o(18389036695552L, 137009);
            return;
          }
          if (UnfamiliarContactDetailUI.a(localc.oKX)) {
            UnfamiliarContactDetailUI.f.oLz += 1;
          }
          for (;;)
          {
            Object localObject = paramAnonymousView.fMz;
            String str1 = paramAnonymousView.iBi.field_username;
            String str2 = paramAnonymousView.iBi.field_nickname;
            paramAnonymousView = (View)localObject;
            if (bg.nm((String)localObject))
            {
              at.AR();
              bb localbb = com.tencent.mm.y.c.yL().CC(str1);
              paramAnonymousView = (View)localObject;
              if (localbb != null)
              {
                paramAnonymousView = (View)localObject;
                if (!bg.nm(localbb.field_encryptUsername)) {
                  paramAnonymousView = localbb.field_conRemark;
                }
              }
            }
            if (!bg.nm(str1))
            {
              localObject = new Intent();
              ((Intent)localObject).putExtra("Contact_User", str1);
              ((Intent)localObject).putExtra("Contact_RemarkName", paramAnonymousView);
              ((Intent)localObject).putExtra("Contact_Nick", str2);
              com.tencent.mm.plugin.setting.a.hnH.d((Intent)localObject, localc.oKX);
              UnfamiliarContactDetailUI.a(localc.oKX, i);
            }
            GMTrace.o(18389036695552L, 137009);
            return;
            UnfamiliarContactDetailUI.f.oLA += 1;
          }
        }
      });
      GMTrace.o(18379641454592L, 136939);
    }
  }
  
  final class d
    implements com.tencent.mm.ad.e, Runnable
  {
    int index;
    int mVd;
    UnfamiliarContactDetailUI.g oLm;
    Collection<Integer> oLn;
    int oLo;
    LinkedList<String> oLp;
    LinkedList<e.b> oLq;
    
    d(UnfamiliarContactDetailUI.g paramg)
    {
      GMTrace.i(18376420229120L, 136915);
      this.mVd = 0;
      this.oLo = 0;
      this.index = 0;
      this.oLp = new LinkedList();
      this.oLq = new LinkedList();
      this.oLn = paramg;
      UnfamiliarContactDetailUI.g localg;
      this.oLm = localg;
      GMTrace.o(18376420229120L, 136915);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
    {
      GMTrace.i(19532840173568L, 145531);
      if (paramk.getType() == 681)
      {
        if ((((com.tencent.mm.av.a)paramk).gPi == null) || ((a.c)((com.tencent.mm.av.a)paramk).gPi.gPl == null))
        {
          w.e("MicroMsg.UnfamiliarContactUI", "[onSceneEnd] rr is null!");
          GMTrace.o(19532840173568L, 145531);
          return;
        }
        Object localObject = ((a.c)((com.tencent.mm.av.a)paramk).gPi.gPl).gPn;
        if ((((arw)localObject).tST != 0) || (((arw)localObject).uHQ == null) || (((arw)localObject).uHQ.uqm == null))
        {
          w.e("MicroMsg.UnfamiliarContactUI", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", new Object[] { Integer.valueOf(((arw)localObject).tST) });
          GMTrace.o(19532840173568L, 145531);
          return;
        }
        paramString = ((com.tencent.mm.av.a)paramk).gPj;
        paramk = ((arw)localObject).uHQ.uqm;
        w.i("MicroMsg.UnfamiliarContactUI", "[onSceneEnd] list size:%s, result:%s", new Object[] { Integer.valueOf(paramString.size()), Integer.valueOf(paramk.size()) });
        paramInt1 = 0;
        if (paramInt1 < paramString.size())
        {
          localObject = (e.b)paramString.get(paramInt1);
          if ((((e.b)localObject).getCmdId() != 4) || (!(localObject instanceof com.tencent.mm.av.c))) {
            w.w("MicroMsg.UnfamiliarContactUI", "cmdId:%s operation:%s", new Object[] { Integer.valueOf(((e.b)localObject).getCmdId()), localObject.toString() });
          }
          for (;;)
          {
            paramInt1 += 1;
            break;
            this.mVd -= 1;
            localObject = (com.tencent.mm.av.c)localObject;
            if (((Integer)paramk.get(paramInt1)).intValue() == 0)
            {
              this.oLo += 1;
              localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(((com.tencent.mm.av.c)localObject).username);
              if (localObject != null)
              {
                ((x)localObject).uB();
                bc.a(((com.tencent.mm.g.b.af)localObject).field_username, null);
                at.AR();
                com.tencent.mm.y.c.yK().a(((com.tencent.mm.g.b.af)localObject).field_username, (x)localObject);
                at.AR();
                com.tencent.mm.y.c.yP().TN(((com.tencent.mm.g.b.af)localObject).field_username);
                this.oLp.add(((com.tencent.mm.g.b.af)localObject).field_username);
              }
            }
            else
            {
              w.e("MicroMsg.UnfamiliarContactUI", "delete contact fail! ret:%s", new Object[] { paramk.get(paramInt1), ((com.tencent.mm.av.c)localObject).username });
            }
          }
        }
        if (this.mVd <= 0)
        {
          paramString = this.oLp.iterator();
          while (paramString.hasNext())
          {
            paramk = (String)paramString.next();
            localObject = UnfamiliarContactDetailUI.f(UnfamiliarContactDetailUI.this).iterator();
            while (((Iterator)localObject).hasNext()) {
              if (((UnfamiliarContactDetailUI.b)((Iterator)localObject).next()).iBi.field_username.equals(paramk)) {
                ((Iterator)localObject).remove();
              }
            }
          }
          UnfamiliarContactDetailUI.a(UnfamiliarContactDetailUI.this, UnfamiliarContactDetailUI.f(UnfamiliarContactDetailUI.this));
          UnfamiliarContactDetailUI.this.runOnUiThread(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18388768260096L, 137007);
              if (UnfamiliarContactDetailUI.d.this.oLm != null)
              {
                UnfamiliarContactDetailUI.d.this.oLm.cU(UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this).size(), UnfamiliarContactDetailUI.d.this.oLo);
                UnfamiliarContactDetailUI.b(UnfamiliarContactDetailUI.this).clear();
              }
              GMTrace.o(18388768260096L, 137007);
            }
          });
        }
      }
      GMTrace.o(19532840173568L, 145531);
    }
    
    public final void run()
    {
      GMTrace.i(18376554446848L, 136916);
      this.mVd = this.oLn.size();
      Iterator localIterator = this.oLn.iterator();
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        this.index += 1;
        int j = this.oLn.size();
        int k = this.index;
        if (UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.this) != null)
        {
          x localx = UnfamiliarContactDetailUI.e(UnfamiliarContactDetailUI.this).tL(i).iBi;
          this.oLq.add(new com.tencent.mm.av.c(localx.field_username));
          if ((this.oLq.size() % 20 == 0) || (k == j))
          {
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.av.a(this.oLq), 0);
            this.oLq.clear();
          }
        }
      }
      GMTrace.o(18376554446848L, 136916);
    }
  }
  
  public static enum e
  {
    static
    {
      GMTrace.i(18385278599168L, 136981);
      oLs = new e("OVER_ONE_MIN", 0);
      oLt = new e("NORMAL", 1);
      oLu = new e[] { oLs, oLt };
      GMTrace.o(18385278599168L, 136981);
    }
    
    private e()
    {
      GMTrace.i(18385144381440L, 136980);
      GMTrace.o(18385144381440L, 136980);
    }
  }
  
  static final class f
  {
    static int oLA;
    static int oLv;
    static int oLw;
    static int oLx;
    static int oLy;
    static int oLz;
  }
  
  static abstract interface g
  {
    public abstract void beS();
    
    public abstract void cU(int paramInt1, int paramInt2);
  }
  
  public static abstract interface h
  {
    public abstract void a(UnfamiliarContactDetailUI.e parame);
    
    public abstract void e(HashSet paramHashSet);
    
    public abstract void onError();
    
    public abstract void onSuccess();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\UnfamiliarContactDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */