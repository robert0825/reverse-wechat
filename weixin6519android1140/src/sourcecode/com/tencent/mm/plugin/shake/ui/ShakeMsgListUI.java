package com.tencent.mm.plugin.shake.ui;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.shake.b.f;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;

public class ShakeMsgListUI
  extends MMActivity
{
  private int aCN;
  private int eDj;
  private long iZG;
  private TextView jYW;
  private p.d jqg;
  private int mType;
  private int nuE;
  private int nuF;
  private com.tencent.mm.plugin.shake.b.g oPu;
  private d oPv;
  private ListView oPw;
  
  public ShakeMsgListUI()
  {
    GMTrace.i(6562307375104L, 48893);
    this.oPu = null;
    this.aCN = 0;
    this.nuE = 0;
    this.nuF = 0;
    this.jqg = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(6546603900928L, 48776);
        paramAnonymousMenuItem = ShakeMsgListUI.a(ShakeMsgListUI.this);
        long l = ShakeMsgListUI.i(ShakeMsgListUI.this);
        String str = "svrid = '" + String.valueOf(l) + "'";
        paramAnonymousInt = paramAnonymousMenuItem.fTZ.delete(paramAnonymousMenuItem.getTableName(), str, null);
        w.i("MicroMsg.ShakeMessageStorage", "delBySvrId = " + paramAnonymousInt);
        ShakeMsgListUI.b(ShakeMsgListUI.this).a(null, null);
        GMTrace.o(6546603900928L, 48776);
      }
    };
    GMTrace.o(6562307375104L, 48893);
  }
  
  private void bfQ()
  {
    GMTrace.i(6563246899200L, 48900);
    this.jYW.setText(R.l.ebY);
    this.jYW.setVisibility(0);
    lf(false);
    GMTrace.o(6563246899200L, 48900);
  }
  
  protected final void MP()
  {
    GMTrace.i(6562978463744L, 48898);
    sq(getIntent().getStringExtra("shake_msg_list_title"));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6573044793344L, 48973);
        ShakeMsgListUI.this.aLo();
        ShakeMsgListUI.this.finish();
        GMTrace.o(6573044793344L, 48973);
        return true;
      }
    });
    a(0, getString(R.l.cSl), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6582440034304L, 49043);
        h.a(ShakeMsgListUI.this.vKB.vKW, true, ShakeMsgListUI.this.getString(R.l.ebX), "", ShakeMsgListUI.this.getString(R.l.dUO), ShakeMsgListUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(6573581664256L, 48977);
            paramAnonymous2DialogInterface = ShakeMsgListUI.a(ShakeMsgListUI.this);
            paramAnonymous2DialogInterface.fTZ.delete(paramAnonymous2DialogInterface.getTableName(), null, null);
            ShakeMsgListUI.b(ShakeMsgListUI.this).QF();
            ShakeMsgListUI.c(ShakeMsgListUI.this);
            GMTrace.o(6573581664256L, 48977);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(6566602342400L, 48925);
            GMTrace.o(6566602342400L, 48925);
          }
        });
        GMTrace.o(6582440034304L, 49043);
        return true;
      }
    });
    this.jYW = ((TextView)findViewById(R.h.bwF));
    if (this.nuE == 0) {
      bfQ();
    }
    this.oPw = ((ListView)findViewById(R.h.cdz));
    final Object localObject = getLayoutInflater().inflate(R.i.cEW, null);
    ((View)localObject).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6581366292480L, 49035);
        ShakeMsgListUI.a(ShakeMsgListUI.this, ShakeMsgListUI.d(ShakeMsgListUI.this) + 8);
        ShakeMsgListUI.b(ShakeMsgListUI.this).tS(ShakeMsgListUI.d(ShakeMsgListUI.this));
        if (ShakeMsgListUI.e(ShakeMsgListUI.this) <= ShakeMsgListUI.d(ShakeMsgListUI.this)) {
          ShakeMsgListUI.f(ShakeMsgListUI.this).removeFooterView(localObject);
        }
        GMTrace.o(6581366292480L, 49035);
      }
    });
    if ((this.nuE > 0) && (this.aCN < this.nuE)) {
      this.oPw.addFooterView((View)localObject);
    }
    this.oPv = new d(this);
    this.oPv.oPr = this.aCN;
    this.oPw.setAdapter(this.oPv);
    this.oPw.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6589150920704L, 49093);
        paramAnonymousAdapterView = (f)ShakeMsgListUI.b(ShakeMsgListUI.this).getItem(paramAnonymousInt);
        if (!bg.nm(paramAnonymousAdapterView.field_tag))
        {
          com.tencent.mm.plugin.report.service.g.ork.A(11316, ShakeMsgListUI.g(ShakeMsgListUI.this) + "," + paramAnonymousAdapterView.field_tag);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", paramAnonymousAdapterView.field_tag);
          com.tencent.mm.bj.d.b(ShakeMsgListUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        }
        GMTrace.o(6589150920704L, 49093);
      }
    });
    localObject = new l(this);
    this.oPw.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6581903163392L, 49039);
        if (paramAnonymousInt < ShakeMsgListUI.f(ShakeMsgListUI.this).getHeaderViewsCount())
        {
          w.w("MicroMsg.ShakeMsgListUI", "on header view long click, ignore");
          GMTrace.o(6581903163392L, 49039);
          return true;
        }
        localObject.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, ShakeMsgListUI.this.vKB.vKW, ShakeMsgListUI.h(ShakeMsgListUI.this));
        GMTrace.o(6581903163392L, 49039);
        return true;
      }
    });
    GMTrace.o(6562978463744L, 48898);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6562844246016L, 48897);
    int i = R.i.cGr;
    GMTrace.o(6562844246016L, 48897);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6562441592832L, 48894);
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("shake_msg_type", 0);
    this.oPu = m.bfl();
    this.nuF = this.oPu.ME();
    int i;
    if (this.nuF == 0)
    {
      i = 8;
      this.aCN = i;
      this.nuE = this.oPu.getCount();
      this.eDj = getIntent().getIntExtra("shake_msg_from", 1);
      if (this.eDj != 1) {
        break label199;
      }
      com.tencent.mm.plugin.report.service.g.ork.i(11313, new Object[] { Integer.valueOf(this.nuF), e.bgf() });
    }
    for (;;)
    {
      paramBundle = this.oPu;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("status", Integer.valueOf(1));
      paramBundle.fTZ.update(paramBundle.getTableName(), localContentValues, "status!=? ", new String[] { "1" });
      MP();
      GMTrace.o(6562441592832L, 48894);
      return;
      i = this.nuF;
      break;
      label199:
      com.tencent.mm.plugin.report.service.g.ork.i(11315, new Object[] { Integer.valueOf(this.nuF), e.bgf() });
    }
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(6563112681472L, 48899);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.iZG = ((f)this.oPv.getItem(paramView.position)).field_svrid;
    paramContextMenu.add(paramView.position, 0, 0, R.l.cSt);
    GMTrace.o(6563112681472L, 48899);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6562710028288L, 48896);
    this.oPv.aJe();
    super.onDestroy();
    GMTrace.o(6562710028288L, 48896);
  }
  
  protected void onResume()
  {
    GMTrace.i(6562575810560L, 48895);
    super.onResume();
    if (this.nuE != this.oPu.getCount())
    {
      this.nuE = this.oPu.getCount();
      if (this.nuE == 0) {
        bfQ();
      }
      this.oPv.QF();
    }
    this.oPv.notifyDataSetChanged();
    GMTrace.o(6562575810560L, 48895);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\ShakeMsgListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */