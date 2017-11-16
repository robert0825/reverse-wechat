package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.luckymoney.b.i;
import com.tencent.mm.plugin.luckymoney.b.x;
import com.tencent.mm.plugin.luckymoney.b.y;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LuckyMoneyMyRecordUI
  extends LuckyMoneyBaseUI
{
  private ImageView jXQ;
  private TextView jYW;
  private boolean knj;
  public String mJI;
  private MMLoadMoreListView mNR;
  private d mNS;
  private TextView mNb;
  private boolean mNh;
  private List<com.tencent.mm.plugin.luckymoney.b.h> mNm;
  private Map<String, Integer> mNn;
  public String mNp;
  private TextView mOH;
  private TextView mOI;
  private TextView mOJ;
  private TextView mOK;
  private TextView mOL;
  private TextView mOM;
  private TextView mON;
  private View mOO;
  private String mOP;
  private int mOQ;
  public List<String> mOR;
  private int mType;
  private int vq;
  
  public LuckyMoneyMyRecordUI()
  {
    GMTrace.i(9850104840192L, 73389);
    this.vq = 0;
    this.mNm = new LinkedList();
    this.mNn = new HashMap();
    this.mNh = true;
    this.knj = false;
    this.mOQ = -1;
    this.mOR = new ArrayList();
    this.mNp = "";
    this.mJI = "";
    GMTrace.o(9850104840192L, 73389);
  }
  
  private void aMC()
  {
    GMTrace.i(9850910146560L, 73395);
    this.knj = true;
    if (this.vq == 0) {
      this.mNp = "";
    }
    l(new x(11, this.vq, this.mType, this.mOP, "v1.0", this.mNp));
    GMTrace.o(9850910146560L, 73395);
  }
  
  private void aML()
  {
    GMTrace.i(9850507493376L, 73392);
    this.mON.setVisibility(8);
    this.mOO.findViewById(a.f.szb).setVisibility(8);
    String str;
    if (this.mType == 1)
    {
      sq(getString(a.i.sUK));
      str = getString(a.i.sVd, new Object[] { q.zG() });
      com.tencent.mm.plugin.luckymoney.b.n.a(this.vKB.vKW, this.mOH, str);
      this.mOJ.setText(a.i.sVh);
      this.mNS = new e(this.vKB.vKW);
      this.mON.setVisibility(0);
    }
    for (;;)
    {
      this.mNR.setAdapter(this.mNS);
      a.b.a(this.jXQ, q.zE(), 0.0F, false);
      this.mOM.setText(getString(a.i.sUY, new Object[] { bg.nl(this.mOP) }));
      GMTrace.o(9850507493376L, 73392);
      return;
      sq(getString(a.i.sUJ));
      str = getString(a.i.sUW, new Object[] { q.zG() });
      com.tencent.mm.plugin.luckymoney.b.n.a(this.vKB.vKW, this.mOH, str);
      this.mOJ.setText(a.i.sUX);
      this.mNS = new c(this.vKB.vKW);
      this.mOO.findViewById(a.f.szb).setVisibility(0);
    }
  }
  
  private int aMM()
  {
    GMTrace.i(9851044364288L, 73396);
    if (this.mType == 1)
    {
      GMTrace.o(9851044364288L, 73396);
      return 8;
    }
    GMTrace.o(9851044364288L, 73396);
    return 9;
  }
  
  protected final void MP()
  {
    GMTrace.i(9850373275648L, 73391);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9807020949504L, 73068);
        LuckyMoneyMyRecordUI.this.finish();
        GMTrace.o(9807020949504L, 73068);
        return true;
      }
    });
    a(0, a.e.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9820308504576L, 73167);
        paramAnonymousMenuItem = new f(LuckyMoneyMyRecordUI.this.vKB.vKW, f.xpQ, false);
        paramAnonymousMenuItem.qik = new p.c()
        {
          public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
          {
            GMTrace.i(9836951502848L, 73291);
            paramAnonymous2n.em(1, a.i.sUJ);
            paramAnonymous2n.em(2, a.i.sUK);
            GMTrace.o(9836951502848L, 73291);
          }
        };
        paramAnonymousMenuItem.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(9883927707648L, 73641);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(9883927707648L, 73641);
              return;
              if (LuckyMoneyMyRecordUI.a(LuckyMoneyMyRecordUI.this) != 2)
              {
                LuckyMoneyMyRecordUI.a(LuckyMoneyMyRecordUI.this, 2);
                LuckyMoneyMyRecordUI.b(LuckyMoneyMyRecordUI.this);
                LuckyMoneyMyRecordUI.c(LuckyMoneyMyRecordUI.this);
                LuckyMoneyMyRecordUI.d(LuckyMoneyMyRecordUI.this);
                GMTrace.o(9883927707648L, 73641);
                return;
                if (LuckyMoneyMyRecordUI.a(LuckyMoneyMyRecordUI.this) != 1)
                {
                  LuckyMoneyMyRecordUI.a(LuckyMoneyMyRecordUI.this, 1);
                  LuckyMoneyMyRecordUI.b(LuckyMoneyMyRecordUI.this);
                  LuckyMoneyMyRecordUI.c(LuckyMoneyMyRecordUI.this);
                  LuckyMoneyMyRecordUI.d(LuckyMoneyMyRecordUI.this);
                }
              }
            }
          }
        };
        paramAnonymousMenuItem.bFk();
        GMTrace.o(9820308504576L, 73167);
        return false;
      }
    });
    this.jYW = ((TextView)findViewById(a.f.szh));
    this.mNR = ((MMLoadMoreListView)findViewById(a.f.szj));
    this.mOO = LayoutInflater.from(this).inflate(a.g.sMU, null);
    this.mNR.addHeaderView(this.mOO);
    this.jXQ = ((ImageView)this.mOO.findViewById(a.f.syV));
    this.mOH = ((TextView)this.mOO.findViewById(a.f.syY));
    this.mNb = ((TextView)this.mOO.findViewById(a.f.syU));
    this.mOI = ((TextView)this.mOO.findViewById(a.f.syZ));
    this.mOJ = ((TextView)this.mOO.findViewById(a.f.sza));
    this.mOK = ((TextView)this.mOO.findViewById(a.f.syW));
    this.mOL = ((TextView)this.mOO.findViewById(a.f.syX));
    this.mOM = ((TextView)this.mOO.findViewById(a.f.szd));
    this.mON = ((TextView)this.mOO.findViewById(a.f.szc));
    this.mNR.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        paramAnonymousInt = 3;
        GMTrace.i(9834535583744L, 73273);
        int i = (int)paramAnonymousLong;
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(LuckyMoneyMyRecordUI.e(LuckyMoneyMyRecordUI.this)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
        if ((i >= 0) && (i < LuckyMoneyMyRecordUI.f(LuckyMoneyMyRecordUI.this).getCount()))
        {
          paramAnonymousAdapterView = LuckyMoneyMyRecordUI.f(LuckyMoneyMyRecordUI.this).qe(i);
          if ((paramAnonymousAdapterView != null) && (!bg.nm(paramAnonymousAdapterView.mFr)))
          {
            paramAnonymousView = new Intent();
            if (paramAnonymousAdapterView.mIy != 2) {
              break label203;
            }
            w.d("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go busi detail");
            paramAnonymousView.setClass(LuckyMoneyMyRecordUI.this.vKB.vKW, LuckyMoneyBusiDetailUI.class);
            paramAnonymousView.putExtra("key_sendid", paramAnonymousAdapterView.mFr);
            if (LuckyMoneyMyRecordUI.a(LuckyMoneyMyRecordUI.this) != 1) {
              break label230;
            }
          }
        }
        for (;;)
        {
          paramAnonymousView.putExtra("key_jump_from", paramAnonymousInt);
          LuckyMoneyMyRecordUI.this.startActivity(paramAnonymousView);
          GMTrace.o(9834535583744L, 73273);
          return;
          label203:
          w.d("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go normal detail");
          paramAnonymousView.setClass(LuckyMoneyMyRecordUI.this.vKB.vKW, LuckyMoneyDetailUI.class);
          break;
          label230:
          paramAnonymousInt = 1;
        }
      }
    });
    this.mNR.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9797357273088L, 72996);
        if ((paramAnonymousInt <= 0) || (paramAnonymousInt > LuckyMoneyMyRecordUI.f(LuckyMoneyMyRecordUI.this).getCount()))
        {
          GMTrace.o(9797357273088L, 72996);
          return true;
        }
        com.tencent.mm.ui.base.h.a(LuckyMoneyMyRecordUI.this, LuckyMoneyMyRecordUI.this.getResources().getString(a.i.sUE), null, LuckyMoneyMyRecordUI.this.getResources().getString(a.i.cSt), new h.c()
        {
          public final void hQ(int paramAnonymous2Int)
          {
            GMTrace.i(9808631562240L, 73080);
            switch (paramAnonymous2Int)
            {
            }
            for (;;)
            {
              GMTrace.o(9808631562240L, 73080);
              return;
              com.tencent.mm.plugin.luckymoney.b.h localh = LuckyMoneyMyRecordUI.f(LuckyMoneyMyRecordUI.this).qe(this.mOU);
              if (localh != null)
              {
                LuckyMoneyMyRecordUI.b(LuckyMoneyMyRecordUI.this, this.mOU);
                LuckyMoneyMyRecordUI.a(LuckyMoneyMyRecordUI.this, localh, this.mOU);
              }
            }
          }
        });
        GMTrace.o(9797357273088L, 72996);
        return true;
      }
    });
    this.mNR.wdv = new MMLoadMoreListView.a()
    {
      public final void anO()
      {
        GMTrace.i(9853862936576L, 73417);
        if (!LuckyMoneyMyRecordUI.this.mMW.aMd()) {
          LuckyMoneyMyRecordUI.g(LuckyMoneyMyRecordUI.this);
        }
        if ((LuckyMoneyMyRecordUI.h(LuckyMoneyMyRecordUI.this)) && (!LuckyMoneyMyRecordUI.i(LuckyMoneyMyRecordUI.this))) {
          LuckyMoneyMyRecordUI.d(LuckyMoneyMyRecordUI.this);
        }
        GMTrace.o(9853862936576L, 73417);
      }
    };
    this.jXQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9880840699904L, 73618);
        if (!bg.nm(LuckyMoneyMyRecordUI.this.mJI))
        {
          com.tencent.mm.wallet_core.ui.e.m(LuckyMoneyMyRecordUI.this, LuckyMoneyMyRecordUI.this.mJI, true);
          GMTrace.o(9880840699904L, 73618);
          return;
        }
        w.w("MicroMsg.LuckyMoneyMyRecordUI", "hy: no avatar jump h5");
        GMTrace.o(9880840699904L, 73618);
      }
    });
    aML();
    GMTrace.o(9850373275648L, 73391);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9850641711104L, 73393);
    if ((paramk instanceof x))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (x)paramk;
        paramk = paramString.mJF.mIz;
        this.mNp = paramString.mJv;
        this.mJI = paramString.mJI;
        Object localObject2;
        if (this.vq == 0)
        {
          this.mOR = paramString.mJG;
          this.mOP = paramString.mJH;
          localObject1 = findViewById(a.f.szf);
          localObject2 = (ImageView)findViewById(a.f.sze);
          if (this.mOR.size() > 1)
          {
            ((ImageView)localObject2).setVisibility(0);
            ((View)localObject1).setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(9885001449472L, 73649);
                LuckyMoneyMyRecordUI.this.showDialog(1);
                GMTrace.o(9885001449472L, 73649);
              }
            });
          }
          this.mOM.setText(getString(a.i.sUY, new Object[] { this.mOP }));
        }
        Object localObject1 = paramString.mJF;
        if (localObject1 != null)
        {
          if (this.mType != 1) {
            break label390;
          }
          this.mNb.setText(com.tencent.mm.wallet_core.ui.e.r(((com.tencent.mm.plugin.luckymoney.b.g)localObject1).mIH / 100.0D));
          localObject1 = ((com.tencent.mm.plugin.luckymoney.b.g)localObject1).mIG;
          Object localObject3 = getString(a.i.sVg, new Object[] { localObject1 });
          localObject2 = new ForegroundColorSpan(getResources().getColor(a.c.smm));
          paramInt1 = ((String)localObject3).indexOf((String)localObject1);
          localObject3 = new SpannableString((CharSequence)localObject3);
          ((SpannableString)localObject3).setSpan(localObject2, paramInt1, ((String)localObject1).length() + paramInt1, 33);
          this.mON.setText((CharSequence)localObject3);
        }
        while (paramk != null)
        {
          paramInt1 = 0;
          for (;;)
          {
            if (paramInt1 < paramk.size())
            {
              localObject1 = (com.tencent.mm.plugin.luckymoney.b.h)paramk.get(paramInt1);
              if (!this.mNn.containsKey(((com.tencent.mm.plugin.luckymoney.b.h)localObject1).mFr))
              {
                this.mNm.add(paramk.get(paramInt1));
                this.mNn.put(((com.tencent.mm.plugin.luckymoney.b.h)localObject1).mFr, Integer.valueOf(1));
              }
              paramInt1 += 1;
              continue;
              label390:
              this.mNb.setText(com.tencent.mm.wallet_core.ui.e.r(((com.tencent.mm.plugin.luckymoney.b.g)localObject1).mIF / 100.0D));
              this.mOI.setText(((com.tencent.mm.plugin.luckymoney.b.g)localObject1).mIE);
              this.mOK.setText(((com.tencent.mm.plugin.luckymoney.b.g)localObject1).gRL);
              break;
            }
          }
          this.vq += paramk.size();
          this.mNh = paramString.aMi();
          this.knj = false;
          this.mNS.aS(this.mNm);
        }
        if ((this.mNm == null) || (this.mNm.size() == 0))
        {
          this.jYW.setVisibility(0);
          if (!this.mNh) {
            break label567;
          }
          this.mNR.bZZ();
        }
        for (;;)
        {
          GMTrace.o(9850641711104L, 73393);
          return true;
          this.jYW.setVisibility(8);
          break;
          label567:
          this.mNR.caa();
        }
      }
      this.mJI = null;
    }
    int i;
    do
    {
      do
      {
        GMTrace.o(9850641711104L, 73393);
        return false;
      } while (!(paramk instanceof y));
      i = this.mOQ;
      this.mOQ = -1;
    } while ((paramInt1 != 0) || (paramInt2 != 0));
    paramString = this.mNS.qe(i);
    if (paramString != null)
    {
      Toast.makeText(this, a.i.sUF, 0).show();
      this.mNS.a(paramString);
      this.mNS.notifyDataSetChanged();
    }
    for (;;)
    {
      GMTrace.o(9850641711104L, 73393);
      return true;
      w.e("MicroMsg.LuckyMoneyMyRecordUI", "can't found local record");
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9850775928832L, 73394);
    int i = a.g.sMW;
    GMTrace.o(9850775928832L, 73394);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9850239057920L, 73390);
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("key_type", 2);
    MP();
    aMC();
    com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(aMM()), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    GMTrace.o(9850239057920L, 73390);
  }
  
  final class a
    extends BaseAdapter
  {
    List<String> mOR;
    int mpq;
    
    a()
    {
      GMTrace.i(9816818843648L, 73141);
      GMTrace.o(9816818843648L, 73141);
    }
    
    public final int getCount()
    {
      GMTrace.i(9816953061376L, 73142);
      int i = this.mOR.size();
      GMTrace.o(9816953061376L, 73142);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(9817221496832L, 73144);
      long l = paramInt;
      GMTrace.o(9817221496832L, 73144);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9817355714560L, 73145);
      paramView = (CheckedTextView)LayoutInflater.from(LuckyMoneyMyRecordUI.this.vKB.vKW).inflate(a.g.sPy, paramViewGroup, false);
      paramView.setText(iH(paramInt));
      if (paramInt == this.mpq) {
        paramView.setChecked(true);
      }
      for (;;)
      {
        GMTrace.o(9817355714560L, 73145);
        return paramView;
        paramView.setChecked(false);
      }
    }
    
    public final String iH(int paramInt)
    {
      GMTrace.i(9817087279104L, 73143);
      String str = (String)this.mOR.get(paramInt);
      GMTrace.o(9817087279104L, 73143);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyMyRecordUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */