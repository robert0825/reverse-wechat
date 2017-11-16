package com.tencent.mm.plugin.wxcredit.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wxcredit.a.c;
import com.tencent.mm.plugin.wxcredit.a.e;
import com.tencent.mm.plugin.wxcredit.a.l;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.List;

public class WalletWXCreditChangeAmountUI
  extends WalletBaseUI
  implements View.OnClickListener
{
  private List<l> skY;
  private List<l> skZ;
  private l sla;
  private l slb;
  private int slc;
  private boolean sld;
  private boolean sle;
  private TextView slf;
  private TextView slg;
  private TextView slh;
  private TextView sli;
  private TextView slj;
  private TextView slk;
  private EditText sll;
  private EditText slm;
  private EditText sln;
  private EditText slo;
  private BaseAdapter slp;
  private BaseAdapter slq;
  
  public WalletWXCreditChangeAmountUI()
  {
    GMTrace.i(9007351726080L, 67110);
    this.skZ = new ArrayList();
    this.slc = -1;
    this.slp = new BaseAdapter()
    {
      private l yH(int paramAnonymousInt)
      {
        GMTrace.i(8997553831936L, 67037);
        l locall = (l)WalletWXCreditChangeAmountUI.j(WalletWXCreditChangeAmountUI.this).get(paramAnonymousInt);
        GMTrace.o(8997553831936L, 67037);
        return locall;
      }
      
      public final int getCount()
      {
        GMTrace.i(8997419614208L, 67036);
        if (WalletWXCreditChangeAmountUI.j(WalletWXCreditChangeAmountUI.this) != null)
        {
          int i = WalletWXCreditChangeAmountUI.j(WalletWXCreditChangeAmountUI.this).size();
          GMTrace.o(8997419614208L, 67036);
          return i;
        }
        GMTrace.o(8997419614208L, 67036);
        return 0;
      }
      
      public final long getItemId(int paramAnonymousInt)
      {
        GMTrace.i(8997688049664L, 67038);
        long l = paramAnonymousInt;
        GMTrace.o(8997688049664L, 67038);
        return l;
      }
      
      public final View getView(int paramAnonymousInt, View paramAnonymousView, ViewGroup paramAnonymousViewGroup)
      {
        GMTrace.i(8997822267392L, 67039);
        paramAnonymousView = (CheckedTextView)View.inflate(WalletWXCreditChangeAmountUI.this, a.g.sPy, null);
        paramAnonymousViewGroup = yH(paramAnonymousInt);
        paramAnonymousView.setText(paramAnonymousViewGroup.desc);
        if (paramAnonymousViewGroup.skO != 0) {}
        for (boolean bool = true;; bool = false)
        {
          paramAnonymousView.setChecked(bool);
          GMTrace.o(8997822267392L, 67039);
          return paramAnonymousView;
        }
      }
    };
    this.slq = new BaseAdapter()
    {
      public final int getCount()
      {
        GMTrace.i(8995809001472L, 67024);
        GMTrace.o(8995809001472L, 67024);
        return 2;
      }
      
      public final long getItemId(int paramAnonymousInt)
      {
        GMTrace.i(8995943219200L, 67025);
        long l = paramAnonymousInt;
        GMTrace.o(8995943219200L, 67025);
        return l;
      }
      
      public final View getView(int paramAnonymousInt, View paramAnonymousView, ViewGroup paramAnonymousViewGroup)
      {
        boolean bool2 = true;
        boolean bool3 = true;
        boolean bool4 = true;
        boolean bool1 = true;
        GMTrace.i(8996077436928L, 67026);
        paramAnonymousView = (CheckedTextView)View.inflate(WalletWXCreditChangeAmountUI.this, a.g.sPy, null);
        if (paramAnonymousInt == 0)
        {
          paramAnonymousView.setText(a.i.cUW);
          if (!WalletWXCreditChangeAmountUI.l(WalletWXCreditChangeAmountUI.this)) {
            break label146;
          }
          if ((WalletWXCreditChangeAmountUI.c(WalletWXCreditChangeAmountUI.this).skR == null) || (!"Y".equals(WalletWXCreditChangeAmountUI.c(WalletWXCreditChangeAmountUI.this).mIY))) {
            break label123;
          }
          if (paramAnonymousInt != 0) {
            break label117;
          }
        }
        for (;;)
        {
          paramAnonymousView.setChecked(bool1);
          GMTrace.o(8996077436928L, 67026);
          return paramAnonymousView;
          paramAnonymousView.setText(a.i.cTJ);
          break;
          label117:
          bool1 = false;
        }
        label123:
        if (paramAnonymousInt != 0) {}
        for (bool1 = bool2;; bool1 = false)
        {
          paramAnonymousView.setChecked(bool1);
          break;
        }
        label146:
        if ((WalletWXCreditChangeAmountUI.f(WalletWXCreditChangeAmountUI.this).skR != null) && ("Y".equals(WalletWXCreditChangeAmountUI.f(WalletWXCreditChangeAmountUI.this).mIY)))
        {
          if (paramAnonymousInt == 0) {}
          for (bool1 = bool3;; bool1 = false)
          {
            paramAnonymousView.setChecked(bool1);
            break;
          }
        }
        if (paramAnonymousInt != 0) {}
        for (bool1 = bool4;; bool1 = false)
        {
          paramAnonymousView.setChecked(bool1);
          break;
        }
      }
    };
    GMTrace.o(9007351726080L, 67110);
  }
  
  private void ar()
  {
    GMTrace.i(9007888596992L, 67114);
    if (this.sla != null)
    {
      this.slf.setText(this.sla.desc);
      if (this.sla.skR == null) {
        break label309;
      }
      this.slj.setVisibility(0);
      this.sll.setVisibility(8);
      this.slh.setText(this.sla.skR.desc);
      this.slm.setHint(this.sla.skR.jBl);
      if (!"Y".equals(this.sla.mIY)) {
        break label263;
      }
      this.slh.setVisibility(0);
      this.slm.setVisibility(0);
      this.slj.setText(a.i.cUW);
    }
    while (this.slb != null)
    {
      this.slg.setText(this.slb.desc);
      if (this.slb.skR != null)
      {
        this.slk.setVisibility(0);
        this.sln.setVisibility(8);
        this.sli.setText(this.slb.skR.desc);
        this.slo.setHint(this.slb.skR.jBl);
        if ("Y".equals(this.slb.mIY))
        {
          this.sli.setVisibility(0);
          this.slo.setVisibility(0);
          this.slk.setText(a.i.cUW);
          GMTrace.o(9007888596992L, 67114);
          return;
          label263:
          this.slh.setVisibility(8);
          this.slm.setVisibility(8);
          if ("N".equals(this.sla.mIY))
          {
            this.slj.setText(a.i.cTJ);
            continue;
            label309:
            this.slj.setVisibility(8);
            this.sll.setVisibility(0);
            this.sll.setHint(this.sla.jBl);
            this.slh.setVisibility(8);
            this.slm.setVisibility(8);
          }
        }
        else
        {
          this.sli.setVisibility(8);
          this.slo.setVisibility(8);
          if ("N".equals(this.slb.mIY))
          {
            this.slk.setText(a.i.cTJ);
            GMTrace.o(9007888596992L, 67114);
          }
        }
      }
      else
      {
        this.slk.setVisibility(8);
        this.sln.setVisibility(0);
        this.sln.setHint(this.slb.jBl);
        this.sli.setVisibility(8);
        this.slo.setVisibility(8);
      }
    }
    GMTrace.o(9007888596992L, 67114);
  }
  
  protected final void MP()
  {
    GMTrace.i(9007754379264L, 67113);
    oM(a.i.thT);
    this.slf = ((TextView)findViewById(a.f.sLj));
    this.slh = ((TextView)findViewById(a.f.sLk));
    this.slg = ((TextView)findViewById(a.f.sLl));
    this.sli = ((TextView)findViewById(a.f.sLm));
    this.sll = ((EditText)findViewById(a.f.sKY));
    this.slm = ((EditText)findViewById(a.f.sKZ));
    this.sln = ((EditText)findViewById(a.f.sLa));
    this.slo = ((EditText)findViewById(a.f.sLb));
    this.slj = ((TextView)findViewById(a.f.sLd));
    this.slk = ((TextView)findViewById(a.f.sLe));
    this.slj.setOnClickListener(this);
    this.slk.setOnClickListener(this);
    this.slf.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9016210096128L, 67176);
        WalletWXCreditChangeAmountUI.a(WalletWXCreditChangeAmountUI.this, true);
        WalletWXCreditChangeAmountUI.a(WalletWXCreditChangeAmountUI.this);
        WalletWXCreditChangeAmountUI.this.showDialog(1);
        GMTrace.o(9016210096128L, 67176);
      }
    });
    this.slg.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9015941660672L, 67174);
        WalletWXCreditChangeAmountUI.a(WalletWXCreditChangeAmountUI.this, false);
        WalletWXCreditChangeAmountUI.a(WalletWXCreditChangeAmountUI.this);
        WalletWXCreditChangeAmountUI.this.showDialog(1);
        GMTrace.o(9015941660672L, 67174);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9006949072896L, 67107);
        WalletWXCreditChangeAmountUI.this.aLo();
        WalletWXCreditChangeAmountUI.this.showDialog(3);
        GMTrace.o(9006949072896L, 67107);
        return true;
      }
    });
    findViewById(a.f.bQR).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9015136354304L, 67168);
        if (WalletWXCreditChangeAmountUI.b(WalletWXCreditChangeAmountUI.this))
        {
          if (WalletWXCreditChangeAmountUI.c(WalletWXCreditChangeAmountUI.this).skR != null)
          {
            if (WalletWXCreditChangeAmountUI.d(WalletWXCreditChangeAmountUI.this).getVisibility() == 0) {
              WalletWXCreditChangeAmountUI.c(WalletWXCreditChangeAmountUI.this).skR.mIY = WalletWXCreditChangeAmountUI.d(WalletWXCreditChangeAmountUI.this).getText().toString();
            }
            if (WalletWXCreditChangeAmountUI.f(WalletWXCreditChangeAmountUI.this).skR == null) {
              break label237;
            }
            if (WalletWXCreditChangeAmountUI.g(WalletWXCreditChangeAmountUI.this).getVisibility() != 0) {}
          }
          label237:
          for (WalletWXCreditChangeAmountUI.f(WalletWXCreditChangeAmountUI.this).skR.mIY = WalletWXCreditChangeAmountUI.g(WalletWXCreditChangeAmountUI.this).getText().toString();; WalletWXCreditChangeAmountUI.f(WalletWXCreditChangeAmountUI.this).mIY = WalletWXCreditChangeAmountUI.h(WalletWXCreditChangeAmountUI.this).getText().toString())
          {
            paramAnonymousView = new ArrayList();
            paramAnonymousView.add(WalletWXCreditChangeAmountUI.c(WalletWXCreditChangeAmountUI.this));
            paramAnonymousView.add(WalletWXCreditChangeAmountUI.f(WalletWXCreditChangeAmountUI.this));
            String str = WalletWXCreditChangeAmountUI.this.ui.getString("kreq_token");
            WalletWXCreditChangeAmountUI.this.ui.getString("key_bank_type");
            paramAnonymousView = new c(paramAnonymousView, str);
            WalletWXCreditChangeAmountUI.this.r(paramAnonymousView);
            GMTrace.o(9015136354304L, 67168);
            return;
            WalletWXCreditChangeAmountUI.c(WalletWXCreditChangeAmountUI.this).mIY = WalletWXCreditChangeAmountUI.e(WalletWXCreditChangeAmountUI.this).getText().toString();
            break;
          }
        }
        u.makeText(WalletWXCreditChangeAmountUI.this.vKB.vKW, a.i.thQ, 0).show();
        GMTrace.o(9015136354304L, 67168);
      }
    });
    GMTrace.o(9007754379264L, 67113);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9008022814720L, 67115);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof e))
      {
        this.skY = ((e)paramk).skv;
        this.slc = ((e)paramk).skw;
        if ((this.skY != null) && (this.skY.size() >= 2))
        {
          this.sla = ((l)this.skY.get(0));
          this.slb = ((l)this.skY.get(1));
          this.sla.skO = 1;
          this.slb.skO = 2;
        }
        ar();
        GMTrace.o(9008022814720L, 67115);
        return true;
      }
    }
    else if ((paramk instanceof c))
    {
      h.a(this, paramString, null, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9014599483392L, 67164);
          paramAnonymousDialogInterface = a.ad(WalletWXCreditChangeAmountUI.this);
          if (paramAnonymousDialogInterface != null)
          {
            paramAnonymousDialogInterface.b(WalletWXCreditChangeAmountUI.this, WalletWXCreditChangeAmountUI.this.ui);
            GMTrace.o(9014599483392L, 67164);
            return;
          }
          WalletWXCreditChangeAmountUI.this.finish();
          GMTrace.o(9014599483392L, 67164);
        }
      });
      GMTrace.o(9008022814720L, 67115);
      return true;
    }
    GMTrace.o(9008022814720L, 67115);
    return false;
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(9007485943808L, 67111);
    int i = a.g.sQq;
    GMTrace.o(9007485943808L, 67111);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(9008157032448L, 67116);
    if (paramView.getId() == a.f.sLd)
    {
      this.sle = true;
      showDialog(2);
      GMTrace.o(9008157032448L, 67116);
      return;
    }
    if (paramView.getId() == a.f.sLe)
    {
      this.sle = false;
      showDialog(2);
    }
    GMTrace.o(9008157032448L, 67116);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9007620161536L, 67112);
    super.onCreate(paramBundle);
    MP();
    ar();
    GMTrace.o(9007620161536L, 67112);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\ui\WalletWXCreditChangeAmountUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */