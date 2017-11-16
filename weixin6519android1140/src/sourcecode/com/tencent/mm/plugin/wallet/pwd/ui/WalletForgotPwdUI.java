package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.ob;
import com.tencent.mm.g.a.sl;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.c.l;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.ui.f.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletForgotPwdUI
  extends WalletBaseUI
  implements WalletFormView.a
{
  private ListView hvF;
  private ArrayList<Bankcard> qWC;
  c qWZ;
  private Button qXb;
  private List<ElementQuery> raR;
  private Bankcard raS;
  private a raT;
  private LinearLayout raU;
  private WalletFormView raV;
  private WalletFormView raW;
  private int raX;
  private boolean raY;
  c raZ;
  
  public WalletForgotPwdUI()
  {
    GMTrace.i(7750134267904L, 57743);
    this.qWC = new ArrayList();
    this.raR = new LinkedList();
    this.raX = 1;
    this.raY = false;
    this.raZ = new c() {};
    this.qWZ = new c() {};
    GMTrace.o(7750134267904L, 57743);
  }
  
  private boolean QS()
  {
    GMTrace.i(7751610662912L, 57754);
    if ((this.hvF.getVisibility() == 0) || ((this.raW.QW()) && (this.raV.QW())))
    {
      this.qXb.setEnabled(true);
      this.qXb.setClickable(true);
      GMTrace.o(7751610662912L, 57754);
      return true;
    }
    this.qXb.setEnabled(false);
    this.qXb.setClickable(false);
    GMTrace.o(7751610662912L, 57754);
    return false;
  }
  
  private void bxO()
  {
    GMTrace.i(7750939574272L, 57749);
    this.ui.remove("elemt_query");
    this.ui.remove("key_bankcard");
    this.ui.remove("bank_name");
    this.ui.remove("key_card_id");
    GMTrace.o(7750939574272L, 57749);
  }
  
  private void bxP()
  {
    GMTrace.i(7751073792000L, 57750);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("key_is_reset_with_new_card", this.ui.getBoolean("key_is_reset_with_new_card", false));
    bxO();
    if ((this.raS == null) && (!this.raY))
    {
      l(new l(null, this.raV.getText(), null));
      GMTrace.o(7751073792000L, 57750);
      return;
    }
    if (this.raY)
    {
      localObject = n.byt().bzr();
      if (!bg.nm(((com.tencent.mm.plugin.wallet_core.model.ae)localObject).field_find_passwd_url))
      {
        w.i("MicroMsg.WalletForgotPwdUI", "hy: not support bind new bankcard. start to url");
        e.m(this, ((com.tencent.mm.plugin.wallet_core.model.ae)localObject).field_find_passwd_url, false);
        GMTrace.o(7751073792000L, 57750);
        return;
      }
      localBundle.putBoolean("key_is_force_bind", true);
      localBundle.putBoolean("key_is_reset_with_new_card", true);
      if (cmp() != null) {
        cmp().a(this, 0, localBundle);
      }
      GMTrace.o(7751073792000L, 57750);
      return;
    }
    b localb = com.tencent.mm.wallet_core.a.ad(this);
    localBundle.putParcelable("key_bankcard", this.raS);
    Object localObject = new ElementQuery();
    Iterator localIterator = this.raR.iterator();
    while (localIterator.hasNext())
    {
      ElementQuery localElementQuery = (ElementQuery)localIterator.next();
      w.i("MicroMsg.WalletForgotPwdUI", "helios:::" + localElementQuery.nDt);
      if ((!bg.nm(localElementQuery.nDt)) && (!bg.nm(this.raS.field_bankcardType)) && (localElementQuery.nDt.trim().equals(this.raS.field_bankcardType.trim()))) {
        localObject = localElementQuery;
      }
    }
    for (;;)
    {
      localBundle.putParcelable("elemt_query", (Parcelable)localObject);
      if (localb != null) {
        localb.a(this, 0, localBundle);
      }
      GMTrace.o(7751073792000L, 57750);
      return;
    }
  }
  
  private void update()
  {
    GMTrace.i(7750671138816L, 57747);
    p.bxd();
    this.qWC = p.bxe().bzc();
    if ((this.qWC == null) || (this.qWC.size() == 0) || (this.ui.getBoolean("key_is_force_bind", false)))
    {
      w.i("MicroMsg.WalletForgotPwdUI", "No bound bankcard process %s", new Object[] { Boolean.valueOf(this.ui.getBoolean("key_is_force_bind", false)) });
      this.qWC = new ArrayList();
      this.raU.setVisibility(0);
      this.hvF.setVisibility(8);
      oM(a.i.tbx);
      ((TextView)findViewById(a.f.sJE)).setText(getString(a.i.tdG));
      WalletFormView localWalletFormView = this.raW;
      p.bxd();
      localWalletFormView.setText(e.Xz(p.bxe().apc()));
      GMTrace.o(7750671138816L, 57747);
      return;
    }
    w.i("MicroMsg.WalletForgotPwdUI", "domestic process!");
    if (com.tencent.mm.wallet_core.a.ad(this) != null) {
      r(new l());
    }
    this.raU.setVisibility(8);
    this.qXb.setVisibility(8);
    findViewById(a.f.sCB).setVisibility(0);
    this.raT = new a(this);
    this.hvF.setAdapter(this.raT);
    this.raT.gpU = this.qWC;
    this.raT.notifyDataSetChanged();
    GMTrace.o(7750671138816L, 57747);
  }
  
  public void MP()
  {
    GMTrace.i(7750805356544L, 57748);
    this.hvF = ((ListView)findViewById(a.f.sHf));
    this.raU = ((LinearLayout)findViewById(a.f.svQ));
    this.raW = ((WalletFormView)findViewById(a.f.sCF));
    this.raV = ((WalletFormView)findViewById(a.f.ssO));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.raV);
    if (this.ui.getBoolean("key_is_paymanager", false)) {
      com.tencent.mm.wallet_core.ui.formview.a.d(this, this.raW);
    }
    for (;;)
    {
      this.raW.xFu = this;
      this.raV.xFu = this;
      this.qXb = ((Button)findViewById(a.f.bQR));
      this.qXb.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7766911483904L, 57868);
          g.ork.i(11353, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
          WalletForgotPwdUI.a(WalletForgotPwdUI.this);
          GMTrace.o(7766911483904L, 57868);
        }
      });
      this.raY = false;
      p.bxd();
      this.qWC = p.bxe().bzc();
      update();
      findViewById(a.f.sCB).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7757784678400L, 57800);
          e.m(WalletForgotPwdUI.this, "https://kf.qq.com/touch/scene_product.html?scene_id=kf3258", false);
          GMTrace.o(7757784678400L, 57800);
        }
      });
      QS();
      a(this.raV, 0, false, false);
      this.raV.j(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7766106177536L, 57862);
          g.ork.i(11353, new Object[] { Integer.valueOf(2), Integer.valueOf(0) });
          paramAnonymousView = WalletForgotPwdUI.this;
          p.bxd();
          e.e(paramAnonymousView, p.bxe().apc());
          GMTrace.o(7766106177536L, 57862);
        }
      });
      this.raV.ogf.setImageResource(a.h.sQZ);
      this.raV.ogf.setVisibility(0);
      GMTrace.o(7750805356544L, 57748);
      return;
      com.tencent.mm.wallet_core.ui.formview.a.e(this, this.raW);
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(7752013316096L, 57757);
    GMTrace.o(7752013316096L, 57757);
    return 1;
  }
  
  public final boolean aNg()
  {
    GMTrace.i(7752147533824L, 57758);
    if ((this.qWC == null) || (this.qWC.size() == 0))
    {
      if (bg.nm(n.byt().bzr().field_find_passwd_url))
      {
        GMTrace.o(7752147533824L, 57758);
        return false;
      }
      GMTrace.o(7752147533824L, 57758);
      return true;
    }
    GMTrace.o(7752147533824L, 57758);
    return false;
  }
  
  protected final boolean aNj()
  {
    GMTrace.i(7752281751552L, 57759);
    if (aNg()) {}
    for (int i = 4;; i = 0)
    {
      sv(i);
      GMTrace.o(7752281751552L, 57759);
      return true;
    }
  }
  
  public final boolean aNk()
  {
    GMTrace.i(7751476445184L, 57753);
    GMTrace.o(7751476445184L, 57753);
    return true;
  }
  
  protected boolean bxq()
  {
    GMTrace.i(7751879098368L, 57756);
    GMTrace.o(7751879098368L, 57756);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7751342227456L, 57752);
    w.i("MicroMsg.WalletForgotPwdUI", " errCode: %s errMsg :  scene: ", new Object[] { Integer.valueOf(paramInt2), paramString, paramk });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paramk instanceof l)) {
        break label343;
      }
      paramString = (l)paramk;
      paramk = new Bundle();
      if (bg.nm(paramString.jwL))
      {
        this.raR = paramString.rcu;
        w.i("MicroMsg.WalletForgotPwdUI", "scene case 1 mCardId is null");
        GMTrace.o(7751342227456L, 57752);
        return true;
      }
      if (paramString.rcv != null)
      {
        if (paramString.rcv.isError())
        {
          w.i("MicroMsg.WalletForgotPwdUI", "scene case 2 mTargetElement is error");
          h.h(this, a.i.sZK, a.i.cUG);
          GMTrace.o(7751342227456L, 57752);
          return true;
        }
        if (this.qWC == null) {}
        for (paramInt1 = 0;; paramInt1 = this.qWC.size())
        {
          w.i("MicroMsg.WalletForgotPwdUI", "scene case 3 bankcards size %d", new Object[] { Integer.valueOf(paramInt1) });
          if ((this.qWC != null) && (this.qWC.size() != 0)) {
            break;
          }
          bxO();
          paramk.putString("bank_name", paramString.rcv.mhU);
          paramk.putParcelable("elemt_query", paramString.rcv);
          paramk.putString("key_card_id", this.raV.getText());
          paramk.putBoolean("key_is_reset_with_new_card", true);
          com.tencent.mm.wallet_core.a.i(this, paramk);
          GMTrace.o(7751342227456L, 57752);
          return true;
        }
      }
      paramk.putString("bank_name", "");
      paramk.putParcelable("elemt_query", new ElementQuery());
      paramk.putString("key_card_id", this.raV.getText());
      paramk.putBoolean("key_is_reset_with_new_card", true);
      com.tencent.mm.wallet_core.a.i(this, paramk);
    }
    label343:
    boolean bool;
    do
    {
      do
      {
        GMTrace.o(7751342227456L, 57752);
        return false;
      } while (!(paramk instanceof o));
      if (this.raT != null) {
        break;
      }
      bool = true;
      w.i("MicroMsg.WalletForgotPwdUI", "scene case queryBound adapter is null ? %s", new Object[] { Boolean.valueOf(bool) });
    } while (this.raT == null);
    paramString = null;
    if (n.byx() != null) {
      paramString = n.byx().bzc();
    }
    paramk = com.tencent.mm.wallet_core.a.ad(this);
    ArrayList localArrayList;
    if (paramk != null)
    {
      paramk.clz();
      paramk = new ArrayList();
      localArrayList = new ArrayList();
      paramString = paramString.iterator();
      for (;;)
      {
        if (!paramString.hasNext()) {
          break label510;
        }
        Bankcard localBankcard = (Bankcard)paramString.next();
        if (localBankcard.field_bankcardTag == 1)
        {
          paramk.add(localBankcard);
          continue;
          bool = false;
          break;
        }
        if (localBankcard.field_bankcardTag == 2) {
          localArrayList.add(localBankcard);
        }
      }
      label510:
      if (paramk.size() > 0) {
        this.qWC = paramk;
      }
    }
    else
    {
      label524:
      if (this.qWC != null) {
        break label598;
      }
    }
    label598:
    for (paramInt1 = 0;; paramInt1 = this.qWC.size())
    {
      w.i("MicroMsg.WalletForgotPwdUI", "scene case queryBound adapter update bankcardsize:  %d", new Object[] { Integer.valueOf(paramInt1) });
      this.raT.gpU = this.qWC;
      new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7750000050176L, 57742);
          WalletForgotPwdUI.b(WalletForgotPwdUI.this).notifyDataSetChanged();
          WalletForgotPwdUI.c(WalletForgotPwdUI.this);
          GMTrace.o(7750000050176L, 57742);
        }
      });
      break;
      this.qWC = localArrayList;
      break label524;
    }
  }
  
  public final void gR(boolean paramBoolean)
  {
    GMTrace.i(7751744880640L, 57755);
    QS();
    GMTrace.o(7751744880640L, 57755);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7751208009728L, 57751);
    int i = a.g.sPq;
    GMTrace.o(7751208009728L, 57751);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7752415969280L, 57760);
    if ((paramInt2 == -1) && (1 == paramInt1))
    {
      paramIntent = paramIntent.getStringExtra("key_bankcard_id");
      this.raV.XF(paramIntent);
      bxP();
    }
    GMTrace.o(7752415969280L, 57760);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7750268485632L, 57744);
    super.onCreate(paramBundle);
    oM(a.i.tdU);
    if (!this.ui.getBoolean("key_is_force_bind", false))
    {
      l(new o(null, 6));
      sv(4);
    }
    MP();
    com.tencent.mm.sdk.b.a.vgX.b(this.raZ);
    com.tencent.mm.sdk.b.a.vgX.b(this.qWZ);
    GMTrace.o(7750268485632L, 57744);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7750402703360L, 57745);
    com.tencent.mm.sdk.b.a.vgX.c(this.raZ);
    com.tencent.mm.sdk.b.a.vgX.c(this.qWZ);
    super.onDestroy();
    GMTrace.o(7750402703360L, 57745);
  }
  
  public void onResume()
  {
    GMTrace.i(7750536921088L, 57746);
    super.onResume();
    update();
    GMTrace.o(7750536921088L, 57746);
  }
  
  public final class a
    extends BaseAdapter
  {
    private Context context;
    List<Bankcard> gpU;
    
    public a(Context paramContext)
    {
      GMTrace.i(7762348081152L, 57834);
      this.gpU = new ArrayList();
      this.context = paramContext;
      GMTrace.o(7762348081152L, 57834);
    }
    
    private Bankcard wL(int paramInt)
    {
      GMTrace.i(7762750734336L, 57837);
      if ((paramInt >= 0) && (paramInt <= this.gpU.size() - 1))
      {
        Bankcard localBankcard = (Bankcard)this.gpU.get(paramInt);
        GMTrace.o(7762750734336L, 57837);
        return localBankcard;
      }
      GMTrace.o(7762750734336L, 57837);
      return null;
    }
    
    public final int getCount()
    {
      GMTrace.i(7762616516608L, 57836);
      int i = this.gpU.size();
      GMTrace.o(7762616516608L, 57836);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(7762884952064L, 57838);
      long l = paramInt;
      GMTrace.o(7762884952064L, 57838);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, final ViewGroup paramViewGroup)
    {
      GMTrace.i(7762482298880L, 57835);
      if (paramView == null) {}
      for (paramView = (WalletFormView)View.inflate(this.context, a.g.sOO, null);; paramView = (WalletFormView)paramView)
      {
        paramViewGroup = wL(paramInt);
        if (paramViewGroup != null) {
          paramView.setText(((Bankcard)this.gpU.get(paramInt)).field_desc);
        }
        paramView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7754831888384L, 57778);
            WalletForgotPwdUI.a(WalletForgotPwdUI.this, paramViewGroup);
            WalletForgotPwdUI.a(WalletForgotPwdUI.this, false);
            WalletForgotPwdUI.a(WalletForgotPwdUI.this);
            GMTrace.o(7754831888384L, 57778);
          }
        });
        GMTrace.o(7762482298880L, 57835);
        return paramView;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\ui\WalletForgotPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */