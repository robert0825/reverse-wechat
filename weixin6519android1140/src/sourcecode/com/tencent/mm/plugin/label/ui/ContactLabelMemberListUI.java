package com.tencent.mm.plugin.label.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class ContactLabelMemberListUI
  extends MMActivity
{
  private TextView iYZ;
  private ae mHandler;
  private ListView mvH;
  private a mvI;
  private String mvJ;
  private String mvK;
  private m.b mvs;
  
  public ContactLabelMemberListUI()
  {
    GMTrace.i(7295807258624L, 54358);
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7318087401472L, 54524);
        int i = paramAnonymousMessage.what;
        w.d("MicroMsg.Label.ContactLabelMemberListUI", "handleMessage:%d", new Object[] { Integer.valueOf(i) });
        switch (i)
        {
        default: 
          w.w("MicroMsg.Label.ContactLabelMemberListUI", "[cpan] unknow msg.");
          GMTrace.o(7318087401472L, 54524);
          return;
        }
        ContactLabelMemberListUI.a(ContactLabelMemberListUI.this);
        GMTrace.o(7318087401472L, 54524);
      }
    };
    this.mvs = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(7285338275840L, 54280);
        w.d("MicroMsg.Label.ContactLabelMemberListUI", "event:%d, obj:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousObject });
        if (ContactLabelMemberListUI.b(ContactLabelMemberListUI.this) != null)
        {
          ContactLabelMemberListUI.b(ContactLabelMemberListUI.this).removeMessages(5001);
          ContactLabelMemberListUI.b(ContactLabelMemberListUI.this).sendEmptyMessageDelayed(5001, 300L);
        }
        GMTrace.o(7285338275840L, 54280);
      }
    };
    GMTrace.o(7295807258624L, 54358);
  }
  
  private void aJY()
  {
    GMTrace.i(7296746782720L, 54365);
    if (this.mvI != null)
    {
      this.mvI.mvD = com.tencent.mm.plugin.label.a.a.aJP().AY(this.mvJ);
      this.mvI.a(null, null);
    }
    this.mvK = com.tencent.mm.plugin.label.a.a.aJP().AU(this.mvJ);
    if (!bg.nm(this.mvK)) {
      sq(this.mvK);
    }
    GMTrace.o(7296746782720L, 54365);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7295941476352L, 54359);
    int i = R.i.ctQ;
    GMTrace.o(7295941476352L, 54359);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7296612564992L, 54364);
    w.i("MicroMsg.Label.ContactLabelMemberListUI", "[cpan] onActivity result. requestcode:%d resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default: 
      w.e("MicroMsg.Label.ContactLabelMemberListUI", "[cpan] onActivity result. unknow requestcode:%d", new Object[] { Integer.valueOf(paramInt1) });
      GMTrace.o(7296612564992L, 54364);
      return;
    }
    if (paramInt2 == -1)
    {
      finish();
      GMTrace.o(7296612564992L, 54364);
      return;
    }
    aJY();
    GMTrace.o(7296612564992L, 54364);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7296075694080L, 54360);
    super.onCreate(paramBundle);
    this.mvJ = getIntent().getStringExtra("label_id");
    this.mvK = getIntent().getStringExtra("label_name");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7316476788736L, 54512);
        ContactLabelMemberListUI.this.finish();
        GMTrace.o(7316476788736L, 54512);
        return false;
      }
    });
    a(0, getString(R.l.dGd), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7294465081344L, 54348);
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.setClass(ContactLabelMemberListUI.this, ContactLabelEditUI.class);
        paramAnonymousMenuItem.putExtra("label_id", ContactLabelMemberListUI.c(ContactLabelMemberListUI.this));
        paramAnonymousMenuItem.putExtra("label_name", ContactLabelMemberListUI.d(ContactLabelMemberListUI.this));
        ContactLabelMemberListUI.this.startActivityForResult(paramAnonymousMenuItem, 10001);
        GMTrace.o(7294465081344L, 54348);
        return false;
      }
    });
    sq(this.mvK);
    this.mvH = ((ListView)findViewById(R.h.brp));
    this.iYZ = ((TextView)findViewById(R.h.empty));
    if (bg.nm(this.mvJ))
    {
      w.e("MicroMsg.Label.ContactLabelMemberListUI", "[cpan] inite view");
      finish();
    }
    this.mvI = new a(this.vKB.vKW);
    this.mvH.setAdapter(this.mvI);
    this.mvH.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(7298760048640L, 54380);
        ContactLabelMemberListUI.a(ContactLabelMemberListUI.this, paramAnonymousInt);
        GMTrace.o(7298760048640L, 54380);
      }
    });
    this.mvH.setEmptyView(this.iYZ);
    GMTrace.o(7296075694080L, 54360);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7296478347264L, 54363);
    if (this.mvI != null)
    {
      this.mvI.aJe();
      this.mvI.vKu = null;
    }
    super.onDestroy();
    GMTrace.o(7296478347264L, 54363);
  }
  
  protected void onPause()
  {
    GMTrace.i(7296344129536L, 54362);
    at.AR();
    c.yK().b(this.mvs);
    super.onPause();
    GMTrace.o(7296344129536L, 54362);
  }
  
  protected void onResume()
  {
    GMTrace.i(7296209911808L, 54361);
    at.AR();
    c.yK().a(this.mvs);
    super.onResume();
    aJY();
    GMTrace.o(7296209911808L, 54361);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\ui\ContactLabelMemberListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */