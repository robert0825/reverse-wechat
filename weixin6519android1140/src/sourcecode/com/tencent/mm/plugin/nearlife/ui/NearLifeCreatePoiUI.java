package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.alk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public class NearLifeCreatePoiUI
  extends MMActivity
  implements e
{
  private TextWatcher WD;
  private String hSv;
  private r ihl;
  private alk nwj;
  private String nwk;
  private String nwl;
  private Addr nwm;
  private String nwn;
  private EditText nwo;
  private EditText nwp;
  private TextView nwq;
  private TextView nwr;
  private com.tencent.mm.modelgeo.b nws;
  private com.tencent.mm.plugin.nearlife.b.b nwt;
  private View.OnClickListener nwu;
  private View.OnClickListener nwv;
  private View.OnClickListener nww;
  private MenuItem.OnMenuItemClickListener nwx;
  private b.a nwy;
  private MenuItem.OnMenuItemClickListener nwz;
  
  public NearLifeCreatePoiUI()
  {
    GMTrace.i(12563450429440L, 93605);
    this.nwu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12545733689344L, 93473);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("ui_title", R.l.dLB);
        if (NearLifeCreatePoiUI.a(NearLifeCreatePoiUI.this) != null)
        {
          paramAnonymousView.putExtra("extra_province", NearLifeCreatePoiUI.a(NearLifeCreatePoiUI.this).gEz);
          paramAnonymousView.putExtra("extra_city", NearLifeCreatePoiUI.a(NearLifeCreatePoiUI.this).gEA);
        }
        d.b(NearLifeCreatePoiUI.this.vKB.vKW, "address", ".ui.WalletMultiRcptSelectUI", paramAnonymousView, 1);
        GMTrace.o(12545733689344L, 93473);
      }
    };
    this.nwv = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12556471107584L, 93553);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(NearLifeCreatePoiUI.this.vKB.vKW, SelectPoiCategoryUI.class);
        NearLifeCreatePoiUI.this.startActivityForResult(paramAnonymousView, 2);
        GMTrace.o(12556471107584L, 93553);
      }
    };
    this.nww = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12545465253888L, 93471);
        NearLifeCreatePoiUI.this.findViewById(R.h.ciN).setVisibility(8);
        NearLifeCreatePoiUI.this.findViewById(R.h.bKp).setVisibility(0);
        NearLifeCreatePoiUI.this.findViewById(R.h.bKr).setVisibility(0);
        GMTrace.o(12545465253888L, 93471);
      }
    };
    this.nwx = new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12560497639424L, 93583);
        g.ork.i(11138, new Object[] { "2", "0", NearLifeCreatePoiUI.b(NearLifeCreatePoiUI.this) });
        paramAnonymousMenuItem = NearLifeCreatePoiUI.this;
        Object localObject = NearLifeCreatePoiUI.this.vKB.vKW;
        NearLifeCreatePoiUI.this.getString(R.l.dLz);
        NearLifeCreatePoiUI.a(paramAnonymousMenuItem, h.a((Context)localObject, NearLifeCreatePoiUI.this.getString(R.l.dLA), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(12552310358016L, 93522);
            at.wS().c(NearLifeCreatePoiUI.c(NearLifeCreatePoiUI.this));
            GMTrace.o(12552310358016L, 93522);
          }
        }));
        NearLifeCreatePoiUI.a(NearLifeCreatePoiUI.this, NearLifeCreatePoiUI.d(NearLifeCreatePoiUI.this).getText().toString());
        NearLifeCreatePoiUI.b(NearLifeCreatePoiUI.this, NearLifeCreatePoiUI.e(NearLifeCreatePoiUI.this).getText().toString());
        NearLifeCreatePoiUI.c(NearLifeCreatePoiUI.this, NearLifeCreatePoiUI.f(NearLifeCreatePoiUI.this).getText().toString());
        paramAnonymousMenuItem = ((EditText)NearLifeCreatePoiUI.this.findViewById(R.h.bxh)).getText().toString();
        localObject = NearLifeCreatePoiUI.g(NearLifeCreatePoiUI.this);
        NearLifeCreatePoiUI.a(NearLifeCreatePoiUI.this, new com.tencent.mm.plugin.nearlife.b.b(NearLifeCreatePoiUI.h(NearLifeCreatePoiUI.this), NearLifeCreatePoiUI.i(NearLifeCreatePoiUI.this), NearLifeCreatePoiUI.j(NearLifeCreatePoiUI.this), NearLifeCreatePoiUI.k(NearLifeCreatePoiUI.this), ((LinkedList)localObject).size(), (LinkedList)localObject, paramAnonymousMenuItem));
        at.wS().a(NearLifeCreatePoiUI.c(NearLifeCreatePoiUI.this), 0);
        w.d("MicroMsg.NearLifeCreatePoiUI", "do scene start");
        GMTrace.o(12560497639424L, 93583);
        return true;
      }
    };
    this.nwy = new b.a()
    {
      public final void b(Addr paramAnonymousAddr)
      {
        GMTrace.i(12557544849408L, 93561);
        String str1 = bg.nl(paramAnonymousAddr.gEA) + bg.nl(paramAnonymousAddr.gEC);
        String str2 = bg.nl(paramAnonymousAddr.gED) + bg.nl(paramAnonymousAddr.gEE);
        w.d("MicroMsg.NearLifeCreatePoiUI", "get address:" + str1);
        if (bg.nm(NearLifeCreatePoiUI.e(NearLifeCreatePoiUI.this).getText().toString())) {
          NearLifeCreatePoiUI.e(NearLifeCreatePoiUI.this).setText(str1);
        }
        if ((bg.nm(NearLifeCreatePoiUI.f(NearLifeCreatePoiUI.this).getText().toString())) && (!bg.nm(str2))) {
          NearLifeCreatePoiUI.f(NearLifeCreatePoiUI.this).setText(str2);
        }
        NearLifeCreatePoiUI.a(NearLifeCreatePoiUI.this, paramAnonymousAddr);
        GMTrace.o(12557544849408L, 93561);
      }
    };
    this.nwz = new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12560229203968L, 93581);
        NearLifeCreatePoiUI.l(NearLifeCreatePoiUI.this);
        GMTrace.o(12560229203968L, 93581);
        return true;
      }
    };
    this.WD = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(12545196818432L, 93469);
        GMTrace.o(12545196818432L, 93469);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12545062600704L, 93468);
        GMTrace.o(12545062600704L, 93468);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12544928382976L, 93467);
        if ((NearLifeCreatePoiUI.d(NearLifeCreatePoiUI.this).getText().toString().trim().length() == 0) || (NearLifeCreatePoiUI.f(NearLifeCreatePoiUI.this).getText().toString().trim().length() == 0) || (NearLifeCreatePoiUI.e(NearLifeCreatePoiUI.this).getText().toString().trim().length() == 0))
        {
          NearLifeCreatePoiUI.this.Y(0, false);
          GMTrace.o(12544928382976L, 93467);
          return;
        }
        NearLifeCreatePoiUI.this.Y(0, true);
        GMTrace.o(12544928382976L, 93467);
      }
    };
    GMTrace.o(12563450429440L, 93605);
  }
  
  private void aTW()
  {
    GMTrace.i(12564389953536L, 93612);
    h.a(this, R.l.dLw, R.l.dLz, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12568013832192L, 93639);
        g.ork.i(11138, new Object[] { "3", "0", NearLifeCreatePoiUI.b(NearLifeCreatePoiUI.this) });
        NearLifeCreatePoiUI.this.setResult(0, new Intent());
        NearLifeCreatePoiUI.this.finish();
        GMTrace.o(12568013832192L, 93639);
      }
    }, null);
    GMTrace.o(12564389953536L, 93612);
  }
  
  protected final void MP()
  {
    GMTrace.i(12563853082624L, 93608);
    oM(R.l.dLz);
    ((ViewGroup)findViewById(R.h.bKq)).setOnClickListener(this.nwu);
    ((ViewGroup)findViewById(R.h.bKp)).setOnClickListener(this.nwv);
    ((TextView)findViewById(R.h.ciN)).setOnClickListener(this.nww);
    findViewById(R.h.ciN).setVisibility(8);
    findViewById(R.h.bKp).setVisibility(0);
    findViewById(R.h.bKr).setVisibility(0);
    this.nwo = ((EditText)findViewById(R.h.bxg));
    this.nwp = ((EditText)findViewById(R.h.bxf));
    this.nwq = ((TextView)findViewById(R.h.ciR));
    this.nwr = ((TextView)findViewById(R.h.ciQ));
    this.nwo.addTextChangedListener(this.WD);
    this.nwp.addTextChangedListener(this.WD);
    this.nwq.addTextChangedListener(this.WD);
    String str = bg.aq(getIntent().getStringExtra("get_poi_name"), "");
    if (str.length() != 0)
    {
      this.nwo.setText(str);
      this.nwo.setSelection(str.length());
    }
    c.d(this.nwo).Ea(100).a(null);
    c.d(this.nwp).Ea(400).a(null);
    c.d((EditText)findViewById(R.h.bxh)).Ea(100).a(null);
    a(0, getString(R.l.cTh), this.nwx, p.b.vLG);
    Y(0, false);
    a(this.nwz);
    GMTrace.o(12563853082624L, 93608);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12564524171264L, 93613);
    w.i("MicroMsg.NearLifeCreatePoiUI", "errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.ihl.dismiss();
      paramString = (com.tencent.mm.plugin.nearlife.b.b)paramk;
      paramk = new Intent();
      if (this.nwj != null)
      {
        paramk.putExtra("get_lat", this.nwj.tYz);
        paramk.putExtra("get_lng", this.nwj.tYy);
      }
      if (this.nwm != null) {
        paramk.putExtra("get_city", this.nwm.gEA);
      }
      paramk.putExtra("get_poi_address", this.nwl);
      paramk.putExtra("get_poi_classify_id", paramString.nuZ);
      paramk.putExtra("get_poi_name", this.nwk);
      paramk.putExtra("get_poi_classify_type", 1);
      setResult(-1, paramk);
      finish();
      GMTrace.o(12564524171264L, 93613);
      return;
    }
    this.ihl.dismiss();
    Toast.makeText(this.vKB.vKW, getString(R.l.dLx), 1).show();
    this.nwt = null;
    GMTrace.o(12564524171264L, 93613);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12563718864896L, 93607);
    int i = R.i.cCK;
    GMTrace.o(12563718864896L, 93607);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12563987300352L, 93609);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(12563987300352L, 93609);
      return;
      paramIntent = paramIntent.getStringExtra("karea_result");
      if (!bg.nm(paramIntent))
      {
        ((TextView)findViewById(R.h.ciR)).setText(paramIntent.replace(" ", ""));
        GMTrace.o(12563987300352L, 93609);
        return;
        if ((-1 == paramInt2) && (paramIntent != null))
        {
          paramIntent = bg.nl(paramIntent.getStringExtra("poi_category"));
          this.nwr.setText(paramIntent);
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12563584647168L, 93606);
    super.onCreate(paramBundle);
    at.wS().a(650, this);
    this.nwj = new alk();
    this.nwj.tYz = getIntent().getFloatExtra("get_lat", -85.0F);
    this.nwj.tYy = getIntent().getFloatExtra("get_lng", -1000.0F);
    this.nwj.ujb = getIntent().getIntExtra("get_preci", 0);
    this.nwj.ujd = "";
    this.nwj.uje = 0;
    this.nwj.ujc = "";
    this.nws = com.tencent.mm.modelgeo.b.Ip();
    if (this.nws != null) {
      this.nws.a(this.nwj.tYz, this.nwj.tYy, this.nwy);
    }
    this.hSv = getIntent().getStringExtra("search_id");
    w.d("MicroMsg.NearLifeCreatePoiUI", "tofuliutest searchid: %s", new Object[] { this.hSv });
    MP();
    GMTrace.o(12563584647168L, 93606);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12564121518080L, 93610);
    super.onDestroy();
    at.wS().b(650, this);
    GMTrace.o(12564121518080L, 93610);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12564255735808L, 93611);
    if (4 == paramKeyEvent.getKeyCode())
    {
      aTW();
      GMTrace.o(12564255735808L, 93611);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12564255735808L, 93611);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearlife\ui\NearLifeCreatePoiUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */