package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.af.b;
import com.tencent.mm.af.e;
import com.tencent.mm.af.f;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.List;

public class EnterpriseBizContactListUI
  extends MMActivity
{
  private long fKc;
  private long gXn;
  public String juv;
  private com.tencent.mm.ui.tools.m juw;
  private EnterpriseBizContactListView jux;
  private ae juy;
  private boolean juz;
  
  public EnterpriseBizContactListUI()
  {
    GMTrace.i(10890023796736L, 81137);
    this.juz = false;
    this.gXn = 0L;
    GMTrace.o(10890023796736L, 81137);
  }
  
  protected final void MP()
  {
    GMTrace.i(10890963320832L, 81144);
    at.AR();
    sq(com.tencent.mm.y.c.yK().TE(this.juv).vj());
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10872575492096L, 81007);
        EnterpriseBizContactListUI.this.aLo();
        EnterpriseBizContactListUI.this.finish();
        GMTrace.o(10872575492096L, 81007);
        return true;
      }
    });
    if (!bg.nm(this.juv))
    {
      com.tencent.mm.af.d locald = f.iK(this.juv);
      if ((locald != null) && (locald.EF())) {
        a(1, R.l.cQl, R.k.cIG, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(10888950054912L, 81129);
            if (EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this) != null)
            {
              EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this).dismiss();
              EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this, null);
            }
            EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this, new com.tencent.mm.ui.tools.m(EnterpriseBizContactListUI.this.vKB.vKW));
            EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this).qik = new p.c()
            {
              public final void a(n paramAnonymous2n)
              {
                GMTrace.i(10866669912064L, 80963);
                paramAnonymous2n.Z(2, R.l.dkG, R.k.cNO);
                paramAnonymous2n.Z(3, R.l.dqa, R.k.cIK);
                paramAnonymous2n.Z(4, R.l.cQm, R.k.cIU);
                GMTrace.o(10866669912064L, 80963);
              }
            };
            EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this).qil = new p.d()
            {
              public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
              {
                GMTrace.i(10877273112576L, 81042);
                switch (paramAnonymous2MenuItem.getItemId())
                {
                }
                for (;;)
                {
                  GMTrace.o(10877273112576L, 81042);
                  return;
                  paramAnonymous2MenuItem = new Intent();
                  paramAnonymous2MenuItem.putExtra("Select_Talker_Name", EnterpriseBizContactListUI.this.juv);
                  paramAnonymous2MenuItem.putExtra("Select_block_List", EnterpriseBizContactListUI.this.juv);
                  paramAnonymous2MenuItem.putExtra("Select_Send_Card", true);
                  paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
                  com.tencent.mm.bj.d.a(EnterpriseBizContactListUI.this, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 1);
                  GMTrace.o(10877273112576L, 81042);
                  return;
                  paramAnonymous2MenuItem = new Intent(EnterpriseBizContactListUI.this, EnterpriseBizContactPlainListUI.class);
                  paramAnonymous2MenuItem.putExtra("enterprise_biz_name", EnterpriseBizContactListUI.this.juv);
                  paramAnonymous2MenuItem.putExtra("enterprise_scene", 2);
                  EnterpriseBizContactListUI.this.startActivity(paramAnonymous2MenuItem);
                  GMTrace.o(10877273112576L, 81042);
                  return;
                  paramAnonymous2MenuItem = new Intent();
                  paramAnonymous2MenuItem.putExtra("Contact_User", EnterpriseBizContactListUI.this.juv);
                  com.tencent.mm.plugin.brandservice.a.hnH.d(paramAnonymous2MenuItem, EnterpriseBizContactListUI.this);
                }
              }
            };
            EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this).dK();
            GMTrace.o(10888950054912L, 81129);
            return false;
          }
        });
      }
    }
    this.jux = ((EnterpriseBizContactListView)findViewById(R.h.bwV));
    this.jux.juv = this.juv;
    this.jux.juC = false;
    this.jux.refresh();
    this.jux.aip();
    GMTrace.o(10890963320832L, 81144);
  }
  
  public void finish()
  {
    GMTrace.i(10890829103104L, 81143);
    this.gXn = (System.currentTimeMillis() / 1000L);
    super.finish();
    GMTrace.o(10890829103104L, 81143);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10890158014464L, 81138);
    int i = R.i.cvm;
    GMTrace.o(10890158014464L, 81138);
    return i;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10891097538560L, 81145);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default: 
      GMTrace.o(10891097538560L, 81145);
      return;
    }
    if ((paramInt2 == -1) && (paramIntent != null))
    {
      String str1 = paramIntent.getStringExtra("be_send_card_name");
      String str2 = paramIntent.getStringExtra("received_card_name");
      boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
      paramIntent = paramIntent.getStringExtra("custom_send_text");
      com.tencent.mm.plugin.messenger.a.d.aOe().l(str1, str2, bool);
      com.tencent.mm.plugin.messenger.a.d.aOe().cR(paramIntent, str2);
      com.tencent.mm.ui.snackbar.a.e(this, this.vKB.vKW.getString(R.l.dwg));
      GMTrace.o(10891097538560L, 81145);
      return;
    }
    GMTrace.o(10891097538560L, 81145);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10890292232192L, 81139);
    super.onCreate(paramBundle);
    this.juv = getIntent().getStringExtra("enterprise_biz_name");
    this.fKc = (System.currentTimeMillis() / 1000L);
    if (this.juy == null) {
      this.juy = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(10910290673664L, 81288);
          if ((paramAnonymousMessage != null) && (paramAnonymousMessage.what == 1) && (EnterpriseBizContactListUI.this != null) && (!EnterpriseBizContactListUI.this.isFinishing()))
          {
            com.tencent.mm.af.x.FQ().ip(EnterpriseBizContactListUI.this.juv);
            com.tencent.mm.af.x.FG();
            paramAnonymousMessage = e.iF(EnterpriseBizContactListUI.this.juv);
            int i = 0;
            while (i < paramAnonymousMessage.size())
            {
              String str = (String)paramAnonymousMessage.get(i);
              if ((s.fC(str)) && ((f.iQ(str)) || (f.dL(str)))) {
                com.tencent.mm.af.x.FQ().ip(str);
              }
              i += 1;
            }
          }
          GMTrace.o(10910290673664L, 81288);
        }
      };
    }
    for (;;)
    {
      this.juy.sendEmptyMessageDelayed(1, 500L);
      GMTrace.o(10890292232192L, 81139);
      return;
      this.juy.removeMessages(1);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(10890694885376L, 81142);
    if (this.jux != null) {
      EnterpriseBizContactListView.release();
    }
    if ((this.fKc <= 0L) || (this.gXn <= 0L))
    {
      super.onDestroy();
      GMTrace.o(10890694885376L, 81142);
      return;
    }
    long l = this.gXn - this.fKc;
    b localb = com.tencent.mm.af.x.FN().iq(this.juv);
    int i;
    if (localb != null)
    {
      i = localb.field_qyUin;
      label84:
      if (localb == null) {
        break label206;
      }
    }
    label206:
    for (int j = localb.field_userUin;; j = 0)
    {
      g.ork.i(13465, new Object[] { "", Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(2), Long.valueOf(l) });
      w.d("MicroMsg.BrandService.EnterpriseBizContactListUI", "quit biz enterprise father report: %s,%s,%s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(2), Long.valueOf(l) });
      break;
      i = 0;
      break label84;
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(10890560667648L, 81141);
    super.onPause();
    GMTrace.o(10890560667648L, 81141);
  }
  
  protected void onResume()
  {
    GMTrace.i(10890426449920L, 81140);
    super.onResume();
    if (!s.fC(this.juv))
    {
      w.e("MicroMsg.BrandService.EnterpriseBizContactListUI", "%s !isContact", new Object[] { this.juv });
      finish();
      GMTrace.o(10890426449920L, 81140);
      return;
    }
    MP();
    int k;
    int i;
    b localb;
    int j;
    long l1;
    if (!this.juz)
    {
      k = getIntent().getIntExtra("enterprise_from_scene", 5);
      i = -1;
      if (this.jux != null) {
        i = this.jux.juE;
      }
      localb = com.tencent.mm.af.x.FN().iq(this.juv);
      if (localb == null) {
        break label385;
      }
      j = localb.field_qyUin;
      if (localb == null) {
        break label390;
      }
      l1 = localb.field_wwCorpId;
      label132:
      if (localb == null) {
        break label396;
      }
    }
    label385:
    label390:
    label396:
    for (long l2 = localb.field_wwUserVid;; l2 = 0L)
    {
      g.ork.i(12892, new Object[] { this.juv, Integer.valueOf(k), Integer.valueOf(i), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2) });
      w.d("MicroMsg.BrandService.EnterpriseBizContactListUI", "enter biz enterprise father report: %s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { this.juv, Integer.valueOf(k), Integer.valueOf(i), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2) });
      this.juz = true;
      GMTrace.o(10890426449920L, 81140);
      return;
      j = 0;
      break;
      l1 = 0L;
      break label132;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\EnterpriseBizContactListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */