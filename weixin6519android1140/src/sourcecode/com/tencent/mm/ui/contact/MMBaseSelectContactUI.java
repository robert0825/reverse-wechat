package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.selectcontact.a.d;
import com.tencent.mm.plugin.selectcontact.a.e;
import com.tencent.mm.plugin.selectcontact.a.f;
import com.tencent.mm.plugin.selectcontact.a.h;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.a;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.b;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.AlphabetScrollBar;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.MMTagPanel.a;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.tools.f;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.List;

public abstract class MMBaseSelectContactUI
  extends MMActivity
  implements AdapterView.OnItemClickListener, MultiSelectContactView.a, MultiSelectContactView.b, MultiSelectContactView.c, VerticalScrollBar.a, l, p.b
{
  public com.tencent.mm.ui.tools.p jQL;
  public MultiSelectContactView mUn;
  public ListView nVC;
  private View oUu;
  public int scene;
  private AlphabetScrollBar wSE;
  private o wSF;
  public m wSG;
  private q wSH;
  private View wSI;
  private View wSJ;
  private TextView wSK;
  private LabelContainerView wSL;
  private TextView wSM;
  private MMTagPanel wSN;
  private boolean wSO;
  private List<String> wSP;
  
  public MMBaseSelectContactUI()
  {
    GMTrace.i(1795296329728L, 13376);
    this.wSO = true;
    this.wSP = new ArrayList();
    GMTrace.o(1795296329728L, 13376);
  }
  
  private String cgA()
  {
    GMTrace.i(1796370071552L, 13384);
    String str;
    if (this.jQL != null)
    {
      str = this.jQL.bFU();
      GMTrace.o(1796370071552L, 13384);
      return str;
    }
    if (this.mUn != null)
    {
      str = this.mUn.bFU();
      GMTrace.o(1796370071552L, 13384);
      return str;
    }
    GMTrace.o(1796370071552L, 13384);
    return "";
  }
  
  private void cgB()
  {
    GMTrace.i(1796504289280L, 13385);
    boolean bool;
    if (this.jQL != null) {
      bool = this.jQL.chW();
    }
    while ((bool) && (bg.nm(cgA()))) {
      if ((this.wSP != null) && (this.wSP.size() > 0))
      {
        this.wSL.setVisibility(0);
        this.wSN.a(null, this.wSP);
        GMTrace.o(1796504289280L, 13385);
        return;
        if (this.mUn != null) {
          bool = this.mUn.hasFocus();
        } else {
          bool = false;
        }
      }
      else
      {
        this.wSL.setVisibility(8);
        GMTrace.o(1796504289280L, 13385);
        return;
      }
    }
    if (this.wSL != null) {
      this.wSL.setVisibility(8);
    }
    GMTrace.o(1796504289280L, 13385);
  }
  
  private void cgD()
  {
    GMTrace.i(1799457079296L, 13407);
    w.i("MicroMsg.MMBaseSelectContactUI", "setInitStatus");
    a(this.nVC, 0);
    this.nVC.setAdapter(this.wSF);
    this.wSF.notifyDataSetChanged();
    if ((Qa()) && (this.wSE != null)) {
      this.wSE.setVisibility(0);
    }
    this.wSJ.setVisibility(8);
    GMTrace.o(1799457079296L, 13407);
  }
  
  public void BT(String paramString)
  {
    GMTrace.i(1800262385664L, 13413);
    w.i("MicroMsg.MMBaseSelectContactUI", "select label=%s", new Object[] { paramString });
    GMTrace.o(1800262385664L, 13413);
  }
  
  public final void Bv(String paramString)
  {
    GMTrace.i(1797175377920L, 13390);
    w.i("MicroMsg.MMBaseSelectContactUI", "onSearchTextChange: text=%s", new Object[] { paramString });
    if (aNZ()) {
      cgB();
    }
    if (this.wSG != null)
    {
      if (!bg.nm(paramString))
      {
        this.wSG.a(paramString, aMW(), cgC());
        GMTrace.o(1797175377920L, 13390);
        return;
      }
      this.wSG.Ty();
      this.wSG.notifyDataSetChanged();
      cgD();
    }
    GMTrace.o(1797175377920L, 13390);
  }
  
  public void MP()
  {
    GMTrace.i(1795967418368L, 13381);
    sq(Qb());
    this.nVC = ((ListView)findViewById(a.e.cbx));
    this.wSF = Qc();
    this.wSG = Qd();
    this.oUu = findViewById(a.e.oFp);
    if (cgG())
    {
      this.wSJ = findViewById(a.e.bRi);
      this.wSK = ((TextView)findViewById(a.e.bRh));
      this.wSJ.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(1748051689472L, 13024);
          MMBaseSelectContactUI.a(MMBaseSelectContactUI.this);
          MMBaseSelectContactUI.this.cgE();
          MMBaseSelectContactUI.this.cgF();
          GMTrace.o(1748051689472L, 13024);
          return false;
        }
      });
      if (!PZ()) {
        break label380;
      }
      this.jQL = new com.tencent.mm.ui.tools.p(true, true);
      this.jQL.xiS = this;
      a(this.jQL);
    }
    for (;;)
    {
      a(this.nVC, 0);
      this.nVC.setAdapter(this.wSF);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1777445371904L, 13243);
          MMBaseSelectContactUI.this.aMX();
          GMTrace.o(1777445371904L, 13243);
          return true;
        }
      });
      if (this.wSG != null) {
        this.wSG.a(new m.a()
        {
          public final void r(String paramAnonymousString, int paramAnonymousInt, boolean paramAnonymousBoolean)
          {
            GMTrace.i(1748722778112L, 13029);
            w.i("MicroMsg.MMBaseSelectContactUI", "Callback SearchEnd Count=%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
            if ((paramAnonymousBoolean) && (paramAnonymousInt == 0))
            {
              if (!bg.nm(paramAnonymousString))
              {
                MMBaseSelectContactUI.b(MMBaseSelectContactUI.this);
                GMTrace.o(1748722778112L, 13029);
                return;
              }
              MMBaseSelectContactUI.a(MMBaseSelectContactUI.this);
              GMTrace.o(1748722778112L, 13029);
              return;
            }
            MMBaseSelectContactUI.c(MMBaseSelectContactUI.this);
            GMTrace.o(1748722778112L, 13029);
          }
        });
      }
      this.nVC.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(1829521850368L, 13631);
          if ((!MMBaseSelectContactUI.this.PZ()) && (MMBaseSelectContactUI.d(MMBaseSelectContactUI.this) != null))
          {
            paramAnonymousAbsListView = MMBaseSelectContactUI.e(MMBaseSelectContactUI.this).getChildAt(MMBaseSelectContactUI.e(MMBaseSelectContactUI.this).getFirstVisiblePosition());
            if ((paramAnonymousAbsListView == null) || (paramAnonymousAbsListView.getTop() != 0)) {
              break label88;
            }
            MMBaseSelectContactUI.f(MMBaseSelectContactUI.this).setVisibility(8);
          }
          while (paramAnonymousInt1 < 2)
          {
            GMTrace.o(1829521850368L, 13631);
            return;
            label88:
            MMBaseSelectContactUI.f(MMBaseSelectContactUI.this).setVisibility(0);
          }
          h.xz();
          if (!bg.b((Boolean)h.xy().xh().get(12296, null)))
          {
            h.xz();
            h.xy().xh().set(12296, Boolean.valueOf(true));
            if (MMBaseSelectContactUI.g(MMBaseSelectContactUI.this) != null) {
              MMBaseSelectContactUI.g(MMBaseSelectContactUI.this).dismiss();
            }
            MMBaseSelectContactUI.a(MMBaseSelectContactUI.this, u.a(MMBaseSelectContactUI.this, MMBaseSelectContactUI.this.getString(a.h.oFB), 4000L));
          }
          GMTrace.o(1829521850368L, 13631);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(1829387632640L, 13630);
          if (paramAnonymousInt != 0)
          {
            MMBaseSelectContactUI.this.aLo();
            MMBaseSelectContactUI.this.cgF();
          }
          GMTrace.o(1829387632640L, 13630);
        }
      });
      this.nVC.setOnItemClickListener(this);
      if (Qa())
      {
        this.wSE = ((AlphabetScrollBar)findViewById(a.e.oFn));
        this.wSE.setVisibility(0);
        this.wSE.wiZ = this;
      }
      if (aNZ())
      {
        this.wSL = ((LabelContainerView)findViewById(a.e.cbw));
        this.wSM = ((TextView)this.wSL.findViewById(16908310));
        this.wSM.setText(a.h.oFG);
        this.wSN = ((MMTagPanel)this.wSL.findViewById(a.e.brq));
        this.wSN.mqy = a.d.baL;
        this.wSN.mqz = com.tencent.mm.plugin.selectcontact.a.b.aOE;
        this.wSL.wSz = new LabelContainerView.a()
        {
          public final void ate()
          {
            GMTrace.i(1706444193792L, 12714);
            if (MMBaseSelectContactUI.d(MMBaseSelectContactUI.this) != null) {
              MMBaseSelectContactUI.d(MMBaseSelectContactUI.this).clearFocus();
            }
            if (MMBaseSelectContactUI.h(MMBaseSelectContactUI.this) != null)
            {
              MMBaseSelectContactUI.h(MMBaseSelectContactUI.this).clearFocus();
              MMBaseSelectContactUI.h(MMBaseSelectContactUI.this).cit();
            }
            MMBaseSelectContactUI.i(MMBaseSelectContactUI.this).requestFocus();
            MMBaseSelectContactUI.i(MMBaseSelectContactUI.this).setVisibility(8);
            GMTrace.o(1706444193792L, 12714);
          }
          
          public final void atf()
          {
            GMTrace.i(1706578411520L, 12715);
            MMBaseSelectContactUI.this.aLo();
            GMTrace.o(1706578411520L, 12715);
          }
        };
        this.wSN.wfk = new MMTagPanel.a()
        {
          public final void atg()
          {
            GMTrace.i(1787645919232L, 13319);
            GMTrace.o(1787645919232L, 13319);
          }
          
          public final void j(boolean paramAnonymousBoolean, int paramAnonymousInt)
          {
            GMTrace.i(1787511701504L, 13318);
            GMTrace.o(1787511701504L, 13318);
          }
          
          public final void wv(String paramAnonymousString)
          {
            GMTrace.i(1787109048320L, 13315);
            GMTrace.o(1787109048320L, 13315);
          }
          
          public final void ww(String paramAnonymousString)
          {
            GMTrace.i(1787243266048L, 13316);
            MMBaseSelectContactUI.this.BT(paramAnonymousString);
            GMTrace.o(1787243266048L, 13316);
          }
          
          public final void wx(String paramAnonymousString)
          {
            GMTrace.i(1787377483776L, 13317);
            GMTrace.o(1787377483776L, 13317);
          }
          
          public final void wy(String paramAnonymousString)
          {
            GMTrace.i(1787780136960L, 13320);
            GMTrace.o(1787780136960L, 13320);
          }
          
          public final void wz(String paramAnonymousString)
          {
            GMTrace.i(1787914354688L, 13321);
            GMTrace.o(1787914354688L, 13321);
          }
        };
      }
      GMTrace.o(1795967418368L, 13381);
      return;
      label380:
      this.mUn = ((MultiSelectContactView)findViewById(a.e.oFg));
      this.mUn.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
      this.mUn.ttZ = this;
      this.mUn.tua = this;
      this.mUn.ttY = this;
      this.mUn.setVisibility(0);
      this.wSI = new View(this.vKB.vKW);
      AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, this.mUn.getMeasuredHeight());
      this.wSI.setLayoutParams(localLayoutParams);
      this.wSI.setVisibility(4);
      this.nVC.addHeaderView(this.wSI);
      findViewById(a.e.bST).setVisibility(0);
    }
  }
  
  public void PY()
  {
    GMTrace.i(1795833200640L, 13380);
    this.scene = getIntent().getIntExtra("scene", 0);
    GMTrace.o(1795833200640L, 13380);
  }
  
  public abstract boolean PZ();
  
  public final void QA()
  {
    GMTrace.i(1800665038848L, 13416);
    GMTrace.o(1800665038848L, 13416);
  }
  
  public final void QB()
  {
    GMTrace.i(16857880854528L, 125601);
    GMTrace.o(16857880854528L, 125601);
  }
  
  public abstract boolean Qa();
  
  public abstract String Qb();
  
  public abstract o Qc();
  
  public abstract m Qd();
  
  public final void Qy()
  {
    GMTrace.i(1799188643840L, 13405);
    cgD();
    if (aNZ()) {
      cgB();
    }
    GMTrace.o(1799188643840L, 13405);
  }
  
  public final void Qz()
  {
    GMTrace.i(1799322861568L, 13406);
    GMTrace.o(1799322861568L, 13406);
  }
  
  public void a(ListView paramListView, int paramInt)
  {
    GMTrace.i(1797578031104L, 13393);
    GMTrace.o(1797578031104L, 13393);
  }
  
  public boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    GMTrace.i(1799859732480L, 13410);
    GMTrace.o(1799859732480L, 13410);
    return false;
  }
  
  public int[] aMW()
  {
    GMTrace.i(1797443813376L, 13392);
    GMTrace.o(1797443813376L, 13392);
    return new int[] { 131072, 131075 };
  }
  
  public void aMX()
  {
    GMTrace.i(1797712248832L, 13394);
    aLo();
    finish();
    GMTrace.o(1797712248832L, 13394);
  }
  
  public boolean aNZ()
  {
    GMTrace.i(1800128167936L, 13412);
    GMTrace.o(1800128167936L, 13412);
    return false;
  }
  
  public boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    GMTrace.i(1799725514752L, 13409);
    GMTrace.o(1799725514752L, 13409);
    return false;
  }
  
  public final void bKZ()
  {
    GMTrace.i(1797309595648L, 13391);
    if (aNZ()) {
      cgB();
    }
    GMTrace.o(1797309595648L, 13391);
  }
  
  public final ListView bho()
  {
    GMTrace.i(15328335626240L, 114205);
    ListView localListView = this.nVC;
    GMTrace.o(15328335626240L, 114205);
    return localListView;
  }
  
  public boolean cgC()
  {
    GMTrace.i(1799054426112L, 13404);
    GMTrace.o(1799054426112L, 13404);
    return false;
  }
  
  public final void cgE()
  {
    GMTrace.i(1800396603392L, 13414);
    if (this.jQL != null)
    {
      if (!bg.nm(this.jQL.bFU()))
      {
        com.tencent.mm.ui.tools.p localp = this.jQL;
        if (localp.xiR != null) {
          localp.xiR.mA(true);
        }
        GMTrace.o(1800396603392L, 13414);
      }
    }
    else if ((this.mUn != null) && (!bg.nm(this.mUn.bFU()))) {
      this.mUn.ttU.setText("");
    }
    GMTrace.o(1800396603392L, 13414);
  }
  
  public final void cgF()
  {
    GMTrace.i(1800530821120L, 13415);
    if (this.jQL != null)
    {
      if (this.jQL.chW())
      {
        this.jQL.clearFocus();
        GMTrace.o(1800530821120L, 13415);
      }
    }
    else if ((this.mUn != null) && (this.mUn.hasFocus())) {
      this.mUn.clearFocus();
    }
    GMTrace.o(1800530821120L, 13415);
  }
  
  public boolean cgG()
  {
    GMTrace.i(1800933474304L, 13418);
    if (this.wSG != null)
    {
      GMTrace.o(1800933474304L, 13418);
      return true;
    }
    GMTrace.o(1800933474304L, 13418);
    return false;
  }
  
  public final n cgy()
  {
    GMTrace.i(1795564765184L, 13378);
    if (this.nVC.getHeaderViewsCount() > 0)
    {
      localn = (n)((HeaderViewListAdapter)this.nVC.getAdapter()).getWrappedAdapter();
      GMTrace.o(1795564765184L, 13378);
      return localn;
    }
    n localn = (n)this.nVC.getAdapter();
    GMTrace.o(1795564765184L, 13378);
    return localn;
  }
  
  public o cgz()
  {
    GMTrace.i(17927193493504L, 133568);
    o localo = this.wSF;
    GMTrace.o(17927193493504L, 133568);
    return localo;
  }
  
  public final Activity getActivity()
  {
    GMTrace.i(1799993950208L, 13411);
    GMTrace.o(1799993950208L, 13411);
    return this;
  }
  
  public int getLayoutId()
  {
    GMTrace.i(1797041160192L, 13389);
    int i = a.f.oFq;
    GMTrace.o(1797041160192L, 13389);
    return i;
  }
  
  public void hF(int paramInt)
  {
    GMTrace.i(1796235853824L, 13383);
    GMTrace.o(1796235853824L, 13383);
  }
  
  public final boolean nC(String paramString)
  {
    GMTrace.i(1798785990656L, 13402);
    GMTrace.o(1798785990656L, 13402);
    return false;
  }
  
  public final void nD(String paramString)
  {
    GMTrace.i(1798920208384L, 13403);
    w.i("MicroMsg.MMBaseSelectContactUI", "onSearchChange: searchText=%s", new Object[] { paramString });
    if (aNZ())
    {
      if (this.jQL != null) {
        this.jQL.chX();
      }
      cgB();
    }
    if (!bg.nm(paramString))
    {
      this.wSG.a(paramString, aMW(), cgC());
      GMTrace.o(1798920208384L, 13403);
      return;
    }
    this.wSG.Ty();
    this.wSG.notifyDataSetChanged();
    cgD();
    GMTrace.o(1798920208384L, 13403);
  }
  
  public void nw(String paramString)
  {
    GMTrace.i(1799591297024L, 13408);
    GMTrace.o(1799591297024L, 13408);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1795430547456L, 13377);
    super.onCreate(paramBundle);
    w.i("MicroMsg.MMBaseSelectContactUI", "onCreate!");
    if (!h.xw().wL())
    {
      w.e("MicroMsg.MMBaseSelectContactUI", "onCreate acc not ready finish");
      w.bPN();
      finish();
      GMTrace.o(1795430547456L, 13377);
      return;
    }
    PY();
    w.i("MicroMsg.MMBaseSelectContactUI", "initData done!");
    MP();
    w.i("MicroMsg.MMBaseSelectContactUI", "initView done!");
    GMTrace.o(1795430547456L, 13377);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1796906942464L, 13388);
    super.onDestroy();
    if (this.wSE != null) {
      this.wSE.wiZ = null;
    }
    if (this.wSF != null) {
      this.wSF.finish();
    }
    if (this.wSG != null) {
      this.wSG.finish();
    }
    if (this.wSH != null) {
      this.wSH.dismiss();
    }
    GMTrace.o(1796906942464L, 13388);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(1796101636096L, 13382);
    int i = paramInt - this.nVC.getHeaderViewsCount();
    int j;
    if (i >= 0)
    {
      paramAdapterView = cgy().DC(i);
      paramView = paramAdapterView.PV();
      ActionBarActivity localActionBarActivity = this.vKB.vKW;
      paramView.PX();
      if (paramAdapterView.wUJ)
      {
        i = paramAdapterView.lAd;
        j = paramAdapterView.lAe;
        if (!paramAdapterView.aCH()) {
          break label264;
        }
        i = 15;
        switch (paramAdapterView.lAd)
        {
        default: 
          j = 0;
        }
      }
    }
    for (;;)
    {
      if (paramAdapterView.wUI) {
        j = 1;
      }
      if (paramAdapterView.jHw == 5) {
        j = 7;
      }
      paramAdapterView = String.format("%s,%d,%d,%d,%d", new Object[] { paramAdapterView.eQb, Integer.valueOf(paramAdapterView.scene), Integer.valueOf(j), Integer.valueOf(paramAdapterView.lzY), Integer.valueOf(i) });
      w.v("MicroMsg.SelectContactReportLogic", "reportClick: %s", new Object[] { paramAdapterView });
      g.ork.A(13234, paramAdapterView);
      if (!cgy().DD(paramInt)) {
        hF(paramInt);
      }
      GMTrace.o(1796101636096L, 13382);
      return;
      label264:
      if (i == 131072) {
        switch (j)
        {
        case 8: 
        case 9: 
        case 10: 
        case 12: 
        case 13: 
        case 14: 
        default: 
          i = 0;
          break;
        case 1: 
          i = 1;
          break;
        case 2: 
          i = 2;
          break;
        case 3: 
          i = 3;
          break;
        case 4: 
          i = 4;
          break;
        case 5: 
          i = 5;
          break;
        case 6: 
          i = 6;
          break;
        case 7: 
          i = 7;
          break;
        case 11: 
          i = 8;
          break;
        case 16: 
          i = 10;
          break;
        case 17: 
        case 18: 
          i = 9;
          break;
        case 15: 
          i = 16;
          break;
        }
      }
      if (i == 131075) {
        switch (j)
        {
        default: 
          i = 0;
          break;
        case 1: 
        case 5: 
          i = 12;
          break;
        case 2: 
        case 6: 
          i = 13;
          break;
        case 3: 
        case 7: 
          i = 14;
          break;
        case 29: 
        case 30: 
        case 31: 
        case 32: 
        case 34: 
        case 35: 
        case 36: 
        case 37: 
        case 38: 
          i = 11;
          break;
        }
      }
      if (i == 65536)
      {
        i = 17;
        break;
      }
      i = 0;
      break;
      j = 2;
      continue;
      j = 3;
      continue;
      j = 4;
      continue;
      j = 5;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(1797846466560L, 13395);
    if (paramKeyEvent.getKeyCode() == 4) {
      aMX();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(1797846466560L, 13395);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(1796638507008L, 13386);
    super.onPause();
    if (this.wSH != null) {
      this.wSH.dismiss();
    }
    GMTrace.o(1796638507008L, 13386);
  }
  
  protected void onResume()
  {
    GMTrace.i(1796772724736L, 13387);
    super.onResume();
    if ((aNZ()) && (this.wSO))
    {
      this.wSO = false;
      h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1706846846976L, 12717);
          MMBaseSelectContactUI.a(MMBaseSelectContactUI.this, com.tencent.mm.plugin.label.a.a.aJP().aJK());
          MMBaseSelectContactUI.j(MMBaseSelectContactUI.this);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(1786572177408L, 13311);
              MMBaseSelectContactUI.k(MMBaseSelectContactUI.this);
              GMTrace.o(1786572177408L, 13311);
            }
          });
          GMTrace.o(1706846846976L, 12717);
        }
        
        public final String toString()
        {
          GMTrace.i(1706981064704L, 12718);
          String str = super.toString() + "|updateLabelList";
          GMTrace.o(1706981064704L, 12718);
          return str;
        }
      });
    }
    GMTrace.o(1796772724736L, 13387);
  }
  
  public final void uW(String paramString)
  {
    GMTrace.i(1797980684288L, 13396);
    if (this.wSF != null)
    {
      int i = this.wSF.Wv(paramString);
      if (i == 0)
      {
        this.nVC.setSelection(0);
        GMTrace.o(1797980684288L, 13396);
        return;
      }
      if (i > 0)
      {
        if (PZ())
        {
          this.nVC.setSelection(i);
          GMTrace.o(1797980684288L, 13396);
          return;
        }
        if (this.mUn != null)
        {
          this.nVC.setSelectionFromTop(i, this.mUn.getMeasuredHeight());
          GMTrace.o(1797980684288L, 13396);
        }
      }
      else
      {
        w.i("MicroMsg.MMBaseSelectContactUI", "Select unkown head selectPosition=%d | header=%s", new Object[] { Integer.valueOf(i), paramString });
      }
    }
    GMTrace.o(1797980684288L, 13396);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\MMBaseSelectContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */