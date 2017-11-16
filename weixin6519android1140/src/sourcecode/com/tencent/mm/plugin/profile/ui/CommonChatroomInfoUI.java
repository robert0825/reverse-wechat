package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class CommonChatroomInfoUI
  extends MMBaseSelectContactUI
{
  private x iBi;
  private a nLr;
  private b nLs;
  
  public CommonChatroomInfoUI()
  {
    GMTrace.i(6728468922368L, 50131);
    GMTrace.o(6728468922368L, 50131);
  }
  
  protected final void MP()
  {
    GMTrace.i(6728737357824L, 50133);
    super.MP();
    a locala = this.nLr;
    f localf = new f();
    localf.eQb = locala.iBi.field_username;
    localf.lwY = locala;
    localf.handler = locala.handler;
    localf.lwS = 6;
    localf.lwX = new a.a(locala);
    ((l)h.j(l.class)).search(2, localf);
    GMTrace.o(6728737357824L, 50133);
  }
  
  protected final void PY()
  {
    GMTrace.i(6728603140096L, 50132);
    super.PY();
    String str = getIntent().getStringExtra("Select_Talker_Name");
    at.AR();
    this.iBi = c.yK().TE(str);
    GMTrace.o(6728603140096L, 50132);
  }
  
  protected final boolean PZ()
  {
    GMTrace.i(6728871575552L, 50134);
    GMTrace.o(6728871575552L, 50134);
    return true;
  }
  
  protected final boolean Qa()
  {
    GMTrace.i(6729005793280L, 50135);
    GMTrace.o(6729005793280L, 50135);
    return false;
  }
  
  protected final String Qb()
  {
    GMTrace.i(6729140011008L, 50136);
    if (this.iBi.fja == 1)
    {
      str = getString(R.l.djc);
      GMTrace.o(6729140011008L, 50136);
      return str;
    }
    if (this.iBi.fja == 2)
    {
      str = getString(R.l.djb);
      GMTrace.o(6729140011008L, 50136);
      return str;
    }
    String str = getString(R.l.dje);
    GMTrace.o(6729140011008L, 50136);
    return str;
  }
  
  protected final o Qc()
  {
    GMTrace.i(6729274228736L, 50137);
    if (this.nLr == null) {
      this.nLr = new a(this, this.scene, this.iBi);
    }
    a locala = this.nLr;
    GMTrace.o(6729274228736L, 50137);
    return locala;
  }
  
  protected final m Qd()
  {
    GMTrace.i(6729408446464L, 50138);
    if (this.nLs == null) {
      this.nLs = new b(this, this.scene, this.iBi);
    }
    b localb = this.nLs;
    GMTrace.o(6729408446464L, 50138);
    return localb;
  }
  
  public final void hF(int paramInt)
  {
    GMTrace.i(6729542664192L, 50139);
    e locale = (e)this.nVC.getAdapter().getItem(paramInt);
    d.a(this, ".ui.chatting.En_5b8fbb1e", new Intent().putExtra("Chat_User", locale.iBi.field_username).putExtra("finish_direct", true));
    GMTrace.o(6729542664192L, 50139);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\CommonChatroomInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */