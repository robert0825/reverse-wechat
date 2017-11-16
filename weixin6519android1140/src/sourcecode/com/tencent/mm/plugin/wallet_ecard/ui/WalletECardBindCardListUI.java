package com.tencent.mm.plugin.wallet_ecard.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_ecard.a.b;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.avv;
import com.tencent.mm.protocal.c.en;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WalletECardBindCardListUI
  extends WalletECardBaseUI
{
  private int rfz;
  private ListView rrG;
  private TextView rrH;
  private List<en> rrI;
  private c rrJ;
  
  public WalletECardBindCardListUI()
  {
    GMTrace.i(19582500732928L, 145901);
    this.rrI = new ArrayList();
    GMTrace.o(19582500732928L, 145901);
  }
  
  protected final void MP()
  {
    GMTrace.i(19582769168384L, 145903);
    this.rrG = ((ListView)findViewById(a.f.sqL));
    View localView = LayoutInflater.from(this).inflate(a.g.sMk, this.rrG, false);
    this.rrH = ((TextView)localView.findViewById(a.f.svg));
    this.rrG.addHeaderView(localView, null, false);
    this.rrJ = new c((byte)0);
    this.rrG.setAdapter(this.rrJ);
    this.rrG.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(19585050869760L, 145920);
        w.i("MicroMsg.WalletECardBindCardListUI", "position: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        int i = paramAnonymousAdapterView.getAdapter().getItemViewType(paramAnonymousInt);
        paramAnonymousView = new Bundle();
        WalletECardBindCardListUI.a(WalletECardBindCardListUI.this).getClass();
        if (i == 1)
        {
          w.d("MicroMsg.WalletECardBindCardListUI", "click add item");
          WalletECardBindCardListUI.this.ui.putInt(com.tencent.mm.plugin.wallet_ecard.a.a.rrf, com.tencent.mm.plugin.wallet_ecard.a.a.rrt);
          com.tencent.mm.wallet_core.a.i(WalletECardBindCardListUI.this.vKB.vKW, paramAnonymousView);
          GMTrace.o(19585050869760L, 145920);
          return;
        }
        paramAnonymousAdapterView = (en)paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          w.w("MicroMsg.WalletECardBindCardListUI", "empty item");
          GMTrace.o(19585050869760L, 145920);
          return;
        }
        WalletECardBindCardListUI.this.cmq().j(new Object[] { paramAnonymousAdapterView });
        GMTrace.o(19585050869760L, 145920);
      }
    });
    GMTrace.o(19582769168384L, 145903);
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(19583306039296L, 145907);
    GMTrace.o(19583306039296L, 145907);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(19582903386112L, 145904);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_ecard.a.f))
    {
      paramk = (com.tencent.mm.plugin.wallet_ecard.a.f)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (!bg.nm(paramk.rrD.uLb)) {
          this.rrH.setText(paramk.rrD.uLb);
        }
        if (paramk.rrD.jzH == 0)
        {
          w.i("MicroMsg.WalletECardBindCardListUI", "banklist: %s", new Object[] { Integer.valueOf(paramk.rrD.uLc.size()) });
          w.d("MicroMsg.WalletECardBindCardListUI", "true name: %s", new Object[] { paramk.rrD.ree });
          this.ui.putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrq, paramk.rrD.ree);
          if (paramk.rrD.uLc.size() == 0)
          {
            this.ui.putInt(com.tencent.mm.plugin.wallet_ecard.a.a.rrf, com.tencent.mm.plugin.wallet_ecard.a.a.rrt);
            com.tencent.mm.wallet_core.a.i(this.vKB.vKW, null);
          }
        }
      }
      for (;;)
      {
        GMTrace.o(19582903386112L, 145904);
        return true;
        this.rrI.clear();
        this.rrI.addAll(paramk.rrD.uLc);
        this.rrJ.notifyDataSetChanged();
        continue;
        if (!b.a(this, paramk.rrD.tUn))
        {
          paramString = b.c(this.vKB.vKW, new String[] { paramk.rrD.jzI, paramString });
          h.b(this.vKB.vKW, paramString, "", false);
          continue;
          w.w("MicroMsg.WalletECardBindCardListUI", "net error: %s", new Object[] { paramk });
          paramString = b.c(this.vKB.vKW, new String[] { paramString });
          h.b(this.vKB.vKW, paramString, "", false);
        }
      }
    }
    GMTrace.o(19582903386112L, 145904);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19583037603840L, 145905);
    int i = a.g.sMj;
    GMTrace.o(19583037603840L, 145905);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19582634950656L, 145902);
    super.onCreate(paramBundle);
    this.xEL.hN(1988);
    this.rfz = this.ui.getInt(com.tencent.mm.plugin.wallet_ecard.a.a.rrd, 2);
    w.i("MicroMsg.WalletECardBindCardListUI", "openScene: %d", new Object[] { Integer.valueOf(this.rfz) });
    oM(a.i.sTe);
    MP();
    w.i("MicroMsg.WalletECardBindCardListUI", "load Data");
    r(new com.tencent.mm.plugin.wallet_ecard.a.f("WEB_DEBIT", this.rfz));
    GMTrace.o(19582634950656L, 145902);
  }
  
  public void onDestroy()
  {
    GMTrace.i(19583171821568L, 145906);
    super.onDestroy();
    this.xEL.hO(1988);
    GMTrace.o(19583171821568L, 145906);
  }
  
  private final class a
  {
    TextView iIH;
    
    public a(View paramView)
    {
      GMTrace.i(19586258829312L, 145929);
      this.iIH = ((TextView)paramView.findViewById(a.f.svf));
      GMTrace.o(19586258829312L, 145929);
    }
  }
  
  private static abstract interface b
  {
    public abstract void a(View paramView, en paramen);
  }
  
  private final class c
    extends BaseAdapter
  {
    public final int rrL;
    public final int rrM;
    
    private c()
    {
      GMTrace.i(19586795700224L, 145933);
      this.rrL = 0;
      this.rrM = 1;
      GMTrace.o(19586795700224L, 145933);
    }
    
    public final int getCount()
    {
      GMTrace.i(19586929917952L, 145934);
      int i = WalletECardBindCardListUI.b(WalletECardBindCardListUI.this).size();
      GMTrace.o(19586929917952L, 145934);
      return i + 1;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(19587064135680L, 145935);
      if (paramInt < WalletECardBindCardListUI.b(WalletECardBindCardListUI.this).size())
      {
        Object localObject = WalletECardBindCardListUI.b(WalletECardBindCardListUI.this).get(paramInt);
        GMTrace.o(19587064135680L, 145935);
        return localObject;
      }
      GMTrace.o(19587064135680L, 145935);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(19587198353408L, 145936);
      long l = paramInt;
      GMTrace.o(19587198353408L, 145936);
      return l;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(19587332571136L, 145937);
      if (paramInt >= WalletECardBindCardListUI.b(WalletECardBindCardListUI.this).size())
      {
        GMTrace.o(19587332571136L, 145937);
        return 1;
      }
      GMTrace.o(19587332571136L, 145937);
      return 0;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(19587735224320L, 145940);
      View localView;
      if (getItemViewType(paramInt) == 1)
      {
        localView = paramView;
        if (paramView == null)
        {
          localView = LayoutInflater.from(WalletECardBindCardListUI.this.vKB.vKW).inflate(a.g.sMm, paramViewGroup, false);
          localView.setTag(new WalletECardBindCardListUI.a(WalletECardBindCardListUI.this, localView));
        }
        ((WalletECardBindCardListUI.a)localView.getTag()).iIH.setText(a.i.sTd);
      }
      for (;;)
      {
        GMTrace.o(19587735224320L, 145940);
        return localView;
        localView = paramView;
        if (paramView == null)
        {
          localView = LayoutInflater.from(WalletECardBindCardListUI.this.vKB.vKW).inflate(a.g.sMl, paramViewGroup, false);
          localView.setTag(new WalletECardBindCardListUI.d(WalletECardBindCardListUI.this, localView));
        }
        ((WalletECardBindCardListUI.b)localView.getTag()).a(localView, (en)getItem(paramInt));
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(19587466788864L, 145938);
      GMTrace.o(19587466788864L, 145938);
      return 2;
    }
    
    public final boolean isEnabled(int paramInt)
    {
      GMTrace.i(19587601006592L, 145939);
      en localen = (en)getItem(paramInt);
      if (localen != null)
      {
        if (localen.tTr)
        {
          GMTrace.o(19587601006592L, 145939);
          return false;
        }
        GMTrace.o(19587601006592L, 145939);
        return true;
      }
      boolean bool = super.isEnabled(paramInt);
      GMTrace.o(19587601006592L, 145939);
      return bool;
    }
  }
  
  private final class d
    implements WalletECardBindCardListUI.b
  {
    TextView izE;
    TextView rmR;
    CdnImageView rrN;
    
    public d(View paramView)
    {
      GMTrace.i(19585185087488L, 145921);
      this.rrN = ((CdnImageView)paramView.findViewById(a.f.sqK));
      this.izE = ((TextView)paramView.findViewById(a.f.sqN));
      this.rmR = ((TextView)paramView.findViewById(a.f.sqM));
      GMTrace.o(19585185087488L, 145921);
    }
    
    public final void a(View paramView, en paramen)
    {
      GMTrace.i(19585319305216L, 145922);
      if (paramen != null)
      {
        this.rrN.twF = true;
        this.rrN.setUrl(paramen.tTq);
        this.izE.setText(String.format("%s %s(%s)", new Object[] { paramen.mhU, paramen.jHS, paramen.tTo }));
        this.rmR.setText(String.format("%s", new Object[] { paramen.rcs }));
        if (paramen.tTr)
        {
          w.i("MicroMsg.WalletECardBindCardListUI", "disable card: %s", new Object[] { paramen.mhU });
          paramView.setEnabled(false);
          this.izE.setTextColor(WalletECardBindCardListUI.this.getResources().getColor(a.c.smb));
          this.rmR.setTextColor(WalletECardBindCardListUI.this.getResources().getColor(a.c.smb));
          GMTrace.o(19585319305216L, 145922);
          return;
        }
        paramView.setEnabled(true);
        this.izE.setTextColor(WalletECardBindCardListUI.this.getResources().getColor(a.c.black));
        this.rmR.setTextColor(WalletECardBindCardListUI.this.getResources().getColor(a.c.aOB));
      }
      GMTrace.o(19585319305216L, 145922);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\ui\WalletECardBindCardListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */