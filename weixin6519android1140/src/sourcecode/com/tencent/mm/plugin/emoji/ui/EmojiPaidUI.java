package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.emoji.a.a.a;
import com.tencent.mm.plugin.emoji.f.g;
import com.tencent.mm.plugin.emoji.model.e;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.ArrayList;

public class EmojiPaidUI
  extends BaseEmojiStoreUI
{
  private g[] kpj;
  
  public EmojiPaidUI()
  {
    GMTrace.i(11368509997056L, 84702);
    GMTrace.o(11368509997056L, 84702);
  }
  
  protected final void MP()
  {
    GMTrace.i(11368912650240L, 84705);
    oM(R.l.doi);
    if (q.zQ()) {
      a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11416157290496L, 85057);
          EmojiPaidUI.a(EmojiPaidUI.this);
          GMTrace.o(11416157290496L, 85057);
          return true;
        }
      });
    }
    super.MP();
    this.iTN.setVisibility(8);
    this.Ev.setVisibility(8);
    GMTrace.o(11368912650240L, 84705);
  }
  
  protected final void a(g paramg)
  {
    GMTrace.i(11369315303424L, 84708);
    GMTrace.o(11369315303424L, 84708);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(11369986392064L, 84713);
    if ((paramString != null) && (paramString.equals("event_update_group")))
    {
      asp();
      bV(131074, 50);
    }
    GMTrace.o(11369986392064L, 84713);
  }
  
  protected final void a(boolean paramBoolean1, e parame, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(11369583738880L, 84710);
    if ((parame != null) && (paramBoolean1) && (this.kkx != null)) {
      this.kkx.b(parame);
    }
    if ((this.kkx == null) || (parame == null) || (parame.kkn <= 0))
    {
      this.iTN.setVisibility(0);
      this.kng.setText(R.l.doh);
      this.Ev.setVisibility(8);
      GMTrace.o(11369583738880L, 84710);
      return;
    }
    this.iTN.setVisibility(8);
    this.Ev.setVisibility(0);
    GMTrace.o(11369583738880L, 84710);
  }
  
  protected final int arO()
  {
    GMTrace.i(11370120609792L, 84714);
    GMTrace.o(11370120609792L, 84714);
    return 10;
  }
  
  protected final int arP()
  {
    GMTrace.i(11370254827520L, 84715);
    GMTrace.o(11370254827520L, 84715);
    return 6;
  }
  
  protected final a arQ()
  {
    GMTrace.i(11369852174336L, 84712);
    com.tencent.mm.plugin.emoji.a.d locald = new com.tencent.mm.plugin.emoji.a.d(this.vKB.vKW);
    GMTrace.o(11369852174336L, 84712);
    return locald;
  }
  
  protected final void arS()
  {
    GMTrace.i(11369046867968L, 84706);
    GMTrace.o(11369046867968L, 84706);
  }
  
  protected final boolean arU()
  {
    GMTrace.i(11369717956608L, 84711);
    GMTrace.o(11369717956608L, 84711);
    return false;
  }
  
  protected final int arX()
  {
    GMTrace.i(11368778432512L, 84704);
    GMTrace.o(11368778432512L, 84704);
    return 2;
  }
  
  protected final int arZ()
  {
    GMTrace.i(11368644214784L, 84703);
    GMTrace.o(11368644214784L, 84703);
    return 2;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11369449521152L, 84709);
    w.i("MicroMsg.emoji.EmojiPaidUI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    ase();
    String str;
    if (paramIntent != null)
    {
      paramInt1 = paramIntent.getIntExtra("key_err_code", 0);
      w.w("MicroMsg.emoji.EmojiPaidUI", "errCode:" + paramInt1);
      str = paramIntent.getStringExtra("key_err_msg");
      w.w("MicroMsg.emoji.EmojiPaidUI", "errMsg:" + str);
    }
    for (;;)
    {
      if (paramInt2 == -1)
      {
        if ((paramIntent != null) && (paramInt1 == 0))
        {
          paramIntent = paramIntent.getStringArrayListExtra("key_response_product_ids");
          if ((paramIntent != null) && (paramIntent.size() > 0))
          {
            this.knl = null;
            this.kni = -1;
            m(false, false);
            at.AR();
            c.xh().set(208900, Boolean.valueOf(true));
            Toast.makeText(this, R.l.don, 0).show();
            GMTrace.o(11369449521152L, 84709);
            return;
          }
          Toast.makeText(this, str, 0).show();
          GMTrace.o(11369449521152L, 84709);
          return;
        }
        Toast.makeText(this, str, 0).show();
        GMTrace.o(11369449521152L, 84709);
        return;
      }
      Toast.makeText(this, R.l.dom, 0).show();
      GMTrace.o(11369449521152L, 84709);
      return;
      str = "";
      paramInt1 = 0;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11369181085696L, 84707);
    super.onDestroy();
    if ((this.kpj != null) && (this.kpj.length > 0))
    {
      int i = 0;
      while (i < this.kpj.length)
      {
        at.wS().c(this.kpj[i]);
        i += 1;
      }
    }
    GMTrace.o(11369181085696L, 84707);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\EmojiPaidUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */