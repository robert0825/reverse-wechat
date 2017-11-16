package com.tencent.mm.plugin.shake.ui;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
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
import com.tencent.mm.bc.j;
import com.tencent.mm.bc.k;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class ShakeSayHiListUI
  extends MMActivity
{
  private int aCN;
  private ListView htD;
  private long iZG;
  private p.d jqg;
  private int nuE;
  private int nuF;
  private k oOO;
  private int oQW;
  private b oQX;
  
  public ShakeSayHiListUI()
  {
    GMTrace.i(6583379558400L, 49050);
    this.oQW = 0;
    this.oOO = null;
    this.aCN = 0;
    this.nuE = 0;
    this.nuF = 0;
    this.jqg = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(6570628874240L, 48955);
        com.tencent.mm.bc.l.MN().lQ(String.valueOf(ShakeSayHiListUI.g(ShakeSayHiListUI.this)));
        ShakeSayHiListUI.b(ShakeSayHiListUI.this).a(null, null);
        GMTrace.o(6570628874240L, 48955);
      }
    };
    GMTrace.o(6583379558400L, 49050);
  }
  
  protected final void MP()
  {
    GMTrace.i(6584319082496L, 49057);
    final Object localObject = getLayoutInflater().inflate(R.i.cEW, null);
    this.htD = ((ListView)findViewById(R.h.bZs));
    ((View)localObject).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6589956227072L, 49099);
        ShakeSayHiListUI.a(ShakeSayHiListUI.this, ShakeSayHiListUI.a(ShakeSayHiListUI.this) + 8);
        w.d("MicroMsg.SayHiListUI", "dkfooter more btn:" + ShakeSayHiListUI.a(ShakeSayHiListUI.this));
        ShakeSayHiListUI.b(ShakeSayHiListUI.this).tS(ShakeSayHiListUI.a(ShakeSayHiListUI.this));
        if (ShakeSayHiListUI.c(ShakeSayHiListUI.this) <= ShakeSayHiListUI.a(ShakeSayHiListUI.this))
        {
          ShakeSayHiListUI.d(ShakeSayHiListUI.this).removeFooterView(localObject);
          w.d("MicroMsg.SayHiListUI", "dkfooter REMOVE more btn: " + ShakeSayHiListUI.a(ShakeSayHiListUI.this));
        }
        GMTrace.o(6589956227072L, 49099);
      }
    });
    a(0, getString(R.l.cSl), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6542980022272L, 48749);
        h.a(ShakeSayHiListUI.this.vKB.vKW, true, ShakeSayHiListUI.this.getString(R.l.dUP), "", ShakeSayHiListUI.this.getString(R.l.dUO), ShakeSayHiListUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(6588882485248L, 49091);
            ShakeSayHiListUI.e(ShakeSayHiListUI.this).MH();
            ShakeSayHiListUI.b(ShakeSayHiListUI.this).QF();
            paramAnonymous2DialogInterface = (TextView)ShakeSayHiListUI.this.findViewById(R.h.bwF);
            paramAnonymous2DialogInterface.setText(R.l.dUS);
            paramAnonymous2DialogInterface.setVisibility(0);
            ShakeSayHiListUI.this.lf(false);
            GMTrace.o(6588882485248L, 49091);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(6589419356160L, 49095);
            GMTrace.o(6589419356160L, 49095);
          }
        });
        GMTrace.o(6542980022272L, 48749);
        return true;
      }
    });
    if (this.nuE == 0)
    {
      TextView localTextView = (TextView)findViewById(R.h.bwF);
      localTextView.setText(R.l.dUS);
      localTextView.setVisibility(0);
      lf(false);
    }
    if ((this.nuE > 0) && (this.aCN < this.nuE)) {
      this.htD.addFooterView((View)localObject);
    }
    this.oQX = new b(this, this.oOO, this.aCN);
    this.oQX.a(new MMSlideDelView.c()
    {
      public final int cf(View paramAnonymousView)
      {
        GMTrace.i(6589687791616L, 49097);
        int i = ShakeSayHiListUI.d(ShakeSayHiListUI.this).getPositionForView(paramAnonymousView);
        GMTrace.o(6589687791616L, 49097);
        return i;
      }
    });
    this.oQX.a(new MMSlideDelView.f()
    {
      public final void t(View paramAnonymousView, int paramAnonymousInt)
      {
        GMTrace.i(6567944519680L, 48935);
        ShakeSayHiListUI.d(ShakeSayHiListUI.this).performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
        GMTrace.o(6567944519680L, 48935);
      }
    });
    this.oQX.a(new MMSlideDelView.e()
    {
      public final void aV(Object paramAnonymousObject)
      {
        GMTrace.i(6576534454272L, 48999);
        if (paramAnonymousObject == null)
        {
          w.e("MicroMsg.SayHiListUI", "onItemDel object null");
          GMTrace.o(6576534454272L, 48999);
          return;
        }
        com.tencent.mm.bc.l.MN().lQ(paramAnonymousObject.toString());
        ShakeSayHiListUI.b(ShakeSayHiListUI.this).a(null, null);
        GMTrace.o(6576534454272L, 48999);
      }
    });
    this.htD.setAdapter(this.oQX);
    this.htD.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6588077178880L, 49085);
        paramAnonymousAdapterView = (j)ShakeSayHiListUI.b(ShakeSayHiListUI.this).getItem(paramAnonymousInt);
        if ((paramAnonymousAdapterView == null) || (paramAnonymousAdapterView.field_content == null))
        {
          GMTrace.o(6588077178880L, 49085);
          return;
        }
        paramAnonymousView = au.d.Uk(paramAnonymousAdapterView.field_content);
        Intent localIntent = new Intent();
        localIntent.putExtra("Contact_User", paramAnonymousView.rAP);
        localIntent.putExtra("Contact_Encryptusername", paramAnonymousView.vBE);
        localIntent.putExtra("Contact_Alias", paramAnonymousView.fsF);
        localIntent.putExtra("Contact_Nick", paramAnonymousView.eCQ);
        localIntent.putExtra("Contact_QuanPin", paramAnonymousView.gDZ);
        localIntent.putExtra("Contact_PyInitial", paramAnonymousView.gDY);
        localIntent.putExtra("Contact_Sex", paramAnonymousView.fja);
        localIntent.putExtra("Contact_Signature", paramAnonymousView.signature);
        localIntent.putExtra("Contact_Scene", paramAnonymousView.scene);
        localIntent.putExtra("Contact_FMessageCard", true);
        localIntent.putExtra("Contact_City", paramAnonymousView.getCity());
        localIntent.putExtra("Contact_Province", paramAnonymousView.getProvince());
        if (bg.nm(paramAnonymousAdapterView.field_sayhicontent)) {}
        for (paramAnonymousAdapterView = ShakeSayHiListUI.this.getString(R.l.dfB);; paramAnonymousAdapterView = paramAnonymousAdapterView.field_sayhicontent)
        {
          localIntent.putExtra("Contact_Content", paramAnonymousAdapterView);
          localIntent.putExtra("Contact_verify_Scene", paramAnonymousView.scene);
          localIntent.putExtra("Contact_Uin", paramAnonymousView.nNL);
          localIntent.putExtra("Contact_QQNick", paramAnonymousView.gEa);
          localIntent.putExtra("Contact_Mobile_MD5", paramAnonymousView.vBs);
          localIntent.putExtra("User_From_Fmessage", true);
          localIntent.putExtra("Contact_from_msgType", 37);
          localIntent.putExtra("Verify_ticket", paramAnonymousView.nLA);
          localIntent.putExtra("Contact_ShowFMessageList", true);
          localIntent.putExtra("Contact_Source_FMessage", paramAnonymousView.scene);
          at.AR();
          paramAnonymousAdapterView = c.yK().TE(paramAnonymousView.rAP);
          if ((paramAnonymousAdapterView != null) && ((int)paramAnonymousAdapterView.fTq >= 0) && (!com.tencent.mm.l.a.eE(paramAnonymousAdapterView.field_type)))
          {
            paramAnonymousInt = paramAnonymousView.eHJ;
            if ((paramAnonymousInt == 0) || (paramAnonymousInt == 2) || (paramAnonymousInt == 5)) {
              localIntent.putExtra("User_Verify", true);
            }
            localIntent.putExtra("Contact_IsLBSFriend", true);
            localIntent.putExtra("Sns_from_Scene", 18);
          }
          com.tencent.mm.plugin.shake.a.hnH.d(localIntent, ShakeSayHiListUI.this);
          GMTrace.o(6588077178880L, 49085);
          return;
        }
      }
    });
    localObject = new com.tencent.mm.ui.tools.l(this);
    this.htD.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6533182128128L, 48676);
        if (paramAnonymousInt < ShakeSayHiListUI.d(ShakeSayHiListUI.this).getHeaderViewsCount())
        {
          w.w("MicroMsg.SayHiListUI", "on header view long click, ignore");
          GMTrace.o(6533182128128L, 48676);
          return true;
        }
        localObject.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, ShakeSayHiListUI.this, ShakeSayHiListUI.f(ShakeSayHiListUI.this));
        GMTrace.o(6533182128128L, 48676);
        return true;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6587808743424L, 49083);
        ShakeSayHiListUI.this.aLo();
        ShakeSayHiListUI.this.finish();
        GMTrace.o(6587808743424L, 49083);
        return true;
      }
    });
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6582976905216L, 49047);
        BackwardSupportUtil.c.a(ShakeSayHiListUI.d(ShakeSayHiListUI.this));
        GMTrace.o(6582976905216L, 49047);
      }
    };
    GMTrace.o(6584319082496L, 49057);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6584050647040L, 49055);
    int i = R.i.cAJ;
    GMTrace.o(6584050647040L, 49055);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6583513776128L, 49051);
    super.onCreate(paramBundle);
    this.oQW = getIntent().getIntExtra("IntentSayHiType", 1);
    if (this.oQW == 1)
    {
      this.oOO = com.tencent.mm.bc.l.MN();
      oM(R.l.dUR);
      this.nuF = this.oOO.ME();
      if (this.nuF != 0) {
        break label168;
      }
    }
    label168:
    for (int i = 8;; i = this.nuF)
    {
      this.aCN = i;
      this.nuE = this.oOO.getCount();
      paramBundle = this.oOO;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("status", Integer.valueOf(4));
      if (paramBundle.fTZ.update(paramBundle.getTableName(), localContentValues, "status!=? ", new String[] { "4" }) != 0) {
        paramBundle.doNotify();
      }
      MP();
      GMTrace.o(6583513776128L, 49051);
      return;
      oM(R.l.dUQ);
      break;
    }
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(6584453300224L, 49058);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.iZG = ((j)this.oQX.getItem(paramView.position)).field_svrid;
    paramContextMenu.add(paramView.position, 0, 0, R.l.cSt);
    GMTrace.o(6584453300224L, 49058);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6583782211584L, 49053);
    this.oQX.aJe();
    super.onDestroy();
    GMTrace.o(6583782211584L, 49053);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6584184864768L, 49056);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(6584184864768L, 49056);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(6583916429312L, 49054);
    super.onPause();
    if (this.oQX.jpT != null) {
      this.oQX.jpT.aJp();
    }
    GMTrace.o(6583916429312L, 49054);
  }
  
  protected void onResume()
  {
    GMTrace.i(6583647993856L, 49052);
    super.onResume();
    if (this.nuE != this.oOO.getCount())
    {
      this.nuE = this.oOO.getCount();
      if (this.nuE == 0)
      {
        TextView localTextView = (TextView)findViewById(R.h.bwF);
        localTextView.setText(R.l.dUS);
        localTextView.setVisibility(0);
        lf(false);
      }
      this.oQX.QF();
    }
    this.oQX.notifyDataSetChanged();
    GMTrace.o(6583647993856L, 49052);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\ShakeSayHiListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */