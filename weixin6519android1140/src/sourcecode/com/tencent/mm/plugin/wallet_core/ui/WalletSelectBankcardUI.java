package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MaxListView;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

@a(19)
public class WalletSelectBankcardUI
  extends WalletBaseUI
{
  private int gRb;
  private TextView jXV;
  private TextView rpm;
  private MaxListView rpn;
  private a rpo;
  private String rpp;
  private boolean rpq;
  private String rpr;
  private List<Bankcard> rps;
  
  public WalletSelectBankcardUI()
  {
    GMTrace.i(6925366329344L, 51598);
    this.rpo = null;
    this.gRb = 0;
    this.rpp = null;
    this.rpq = true;
    this.rpr = null;
    this.rps = null;
    GMTrace.o(6925366329344L, 51598);
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(6925903200256L, 51602);
    GMTrace.o(6925903200256L, 51602);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6925634764800L, 51600);
    GMTrace.o(6925634764800L, 51600);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6925768982528L, 51601);
    int i = a.g.sQi;
    GMTrace.o(6925768982528L, 51601);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6925500547072L, 51599);
    super.onCreate(paramBundle);
    oM(a.i.sZJ);
    this.gRb = this.ui.getInt("key_scene", 0);
    this.rpp = this.ui.getString("key_top_tips");
    this.rpq = this.ui.getBoolean("key_is_show_new_bankcard", true);
    this.rpr = this.ui.getString("bottom_tips");
    this.rps = this.ui.getParcelableArrayList("key_showing_bankcards");
    if (this.rps == null) {
      this.rps = n.byx().bzc();
    }
    this.rpm = ((TextView)findViewById(a.f.sHR));
    this.rpn = ((MaxListView)findViewById(a.f.sqB));
    this.jXV = ((TextView)findViewById(a.f.sqY));
    if (!bg.nm(this.rpp))
    {
      this.rpm.setVisibility(0);
      this.rpm.setText(this.rpp);
      if (bg.nm(this.rpr)) {
        break label353;
      }
      this.jXV.setVisibility(0);
      this.jXV.setText(this.rpr);
    }
    for (;;)
    {
      if (this.gRb == 0)
      {
        this.jXV.setVisibility(0);
        paramBundle = new f(this);
        paramBundle.rmz = new f.a()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7022405746688L, 52321);
            w.i("MicroMsg.WalletSelectBankcardUI", "hy: user clicked the phone.go to dial");
            e.bq(WalletSelectBankcardUI.this, WalletSelectBankcardUI.this.getString(a.i.sZM));
            GMTrace.o(7022405746688L, 52321);
          }
        };
        String str = getString(a.i.tgc);
        SpannableString localSpannableString = new SpannableString(str);
        localSpannableString.setSpan(paramBundle, str.length() - 14, str.length(), 33);
        this.jXV.setText(localSpannableString);
        this.jXV.setMovementMethod(LinkMovementMethod.getInstance());
      }
      this.rpo = new a((byte)0);
      this.rpn.setAdapter(this.rpo);
      this.rpn.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(final AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(6918252789760L, 51545);
          paramAnonymousAdapterView = (Bankcard)paramAnonymousAdapterView.getItemAtPosition(paramAnonymousInt);
          if (paramAnonymousAdapterView != null)
          {
            h.a(WalletSelectBankcardUI.this, true, WalletSelectBankcardUI.this.getString(a.i.tge, new Object[] { paramAnonymousAdapterView.field_desc, paramAnonymousAdapterView.field_mobile }), WalletSelectBankcardUI.this.getString(a.i.tgg), WalletSelectBankcardUI.this.getString(a.i.tgd), WalletSelectBankcardUI.this.getString(a.i.tgf), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(6970731921408L, 51936);
                WalletSelectBankcardUI.this.ui.putBoolean("key_balance_change_phone_need_confirm_phone", false);
                WalletSelectBankcardUI.a(WalletSelectBankcardUI.this, paramAnonymousAdapterView);
                g.ork.i(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0) });
                GMTrace.o(6970731921408L, 51936);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(6928990208000L, 51625);
                WalletSelectBankcardUI.this.ui.putBoolean("key_balance_change_phone_need_confirm_phone", true);
                WalletSelectBankcardUI.a(WalletSelectBankcardUI.this, paramAnonymousAdapterView);
                GMTrace.o(6928990208000L, 51625);
              }
            });
            GMTrace.o(6918252789760L, 51545);
            return;
          }
          WalletSelectBankcardUI.this.ui.putBoolean("key_balance_change_phone_need_confirm_phone", false);
          WalletSelectBankcardUI.a(WalletSelectBankcardUI.this, null);
          GMTrace.o(6918252789760L, 51545);
        }
      });
      GMTrace.o(6925500547072L, 51599);
      return;
      this.rpm.setVisibility(8);
      break;
      label353:
      this.jXV.setVisibility(8);
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(6986301177856L, 52052);
      GMTrace.o(6986301177856L, 52052);
    }
    
    public final int getCount()
    {
      GMTrace.i(6986435395584L, 52053);
      if (WalletSelectBankcardUI.a(WalletSelectBankcardUI.this))
      {
        if (WalletSelectBankcardUI.b(WalletSelectBankcardUI.this) == null)
        {
          GMTrace.o(6986435395584L, 52053);
          return 1;
        }
        i = WalletSelectBankcardUI.b(WalletSelectBankcardUI.this).size();
        GMTrace.o(6986435395584L, 52053);
        return i + 1;
      }
      if (WalletSelectBankcardUI.b(WalletSelectBankcardUI.this) == null)
      {
        GMTrace.o(6986435395584L, 52053);
        return 0;
      }
      int i = WalletSelectBankcardUI.b(WalletSelectBankcardUI.this).size();
      GMTrace.o(6986435395584L, 52053);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(6986569613312L, 52054);
      if ((WalletSelectBankcardUI.b(WalletSelectBankcardUI.this) == null) || (WalletSelectBankcardUI.b(WalletSelectBankcardUI.this).size() <= paramInt))
      {
        GMTrace.o(6986569613312L, 52054);
        return null;
      }
      Object localObject = WalletSelectBankcardUI.b(WalletSelectBankcardUI.this).get(paramInt);
      GMTrace.o(6986569613312L, 52054);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6986703831040L, 52055);
      long l = paramInt;
      GMTrace.o(6986703831040L, 52055);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6986838048768L, 52056);
      Bankcard localBankcard = (Bankcard)getItem(paramInt);
      View localView;
      if (paramView == null)
      {
        localView = LayoutInflater.from(WalletSelectBankcardUI.this).inflate(a.g.sQh, paramViewGroup, false);
        paramView = new a();
        paramView.rpw = ((TextView)localView.findViewById(a.f.sqq));
        localView.setTag(paramView);
        paramViewGroup = paramView;
        if (localBankcard == null) {
          break label113;
        }
        paramViewGroup.rpw.setText(localBankcard.field_desc);
      }
      for (;;)
      {
        GMTrace.o(6986838048768L, 52056);
        return localView;
        paramViewGroup = (a)paramView.getTag();
        localView = paramView;
        break;
        label113:
        paramViewGroup.rpw.setText(a.i.tgi);
      }
    }
    
    final class a
    {
      TextView rpw;
      
      a()
      {
        GMTrace.i(7020526698496L, 52307);
        GMTrace.o(7020526698496L, 52307);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletSelectBankcardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */