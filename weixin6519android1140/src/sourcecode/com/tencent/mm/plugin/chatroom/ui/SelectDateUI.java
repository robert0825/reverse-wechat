package com.tencent.mm.plugin.chatroom.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import java.util.HashMap;

public class SelectDateUI
  extends MMActivity
  implements com.tencent.mm.plugin.chatroom.a.a
{
  private String iGc;
  private r ihl;
  private long jOx;
  private DayPickerView jQX;
  private HashMap<String, com.tencent.mm.plugin.chatroom.d.a> jQY;
  private TextView jQZ;
  private ae mHandler;
  
  public SelectDateUI()
  {
    GMTrace.i(9137006051328L, 68076);
    this.jOx = -1L;
    this.ihl = null;
    GMTrace.o(9137006051328L, 68076);
  }
  
  public final void a(com.tencent.mm.plugin.chatroom.d.a parama)
  {
    GMTrace.i(9137542922240L, 68080);
    if (parama == null)
    {
      w.e("MicroMsg.SelectDateUI", "null == calendarDay");
      GMTrace.o(9137542922240L, 68080);
      return;
    }
    w.i("MicroMsg.SelectDateUI", "Day Selected timestamp:%s day:%s month:%s year:%s", new Object[] { Long.valueOf(parama.jMX), Integer.valueOf(parama.jqS), Integer.valueOf(parama.month), Integer.valueOf(parama.year) });
    long l = parama.eDr;
    w.i("MicroMsg.SelectDateUI", "[goToChattingUI] msgLocalId:%s", new Object[] { Long.valueOf(l) });
    parama = new Intent().putExtra("Chat_User", this.iGc).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", l);
    com.tencent.mm.plugin.chatroom.a.hnH.e(parama, this);
    GMTrace.o(9137542922240L, 68080);
  }
  
  public final long ano()
  {
    GMTrace.i(9137408704512L, 68079);
    long l = System.currentTimeMillis();
    GMTrace.o(9137408704512L, 68079);
    return l;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9137274486784L, 68078);
    int i = R.i.cFF;
    GMTrace.o(9137274486784L, 68078);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9137140269056L, 68077);
    super.onCreate(paramBundle);
    oM(R.l.dTH);
    this.jQX = ((DayPickerView)findViewById(R.h.bTi));
    this.jQZ = ((TextView)findViewById(R.h.caE));
    this.jQY = new HashMap();
    this.mHandler = new ae(getMainLooper());
    this.iGc = getIntent().getStringExtra("detail_username");
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9153649049600L, 68200);
        SelectDateUI.a(SelectDateUI.this);
        SelectDateUI.f(SelectDateUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9089358757888L, 67721);
            DayPickerView localDayPickerView = SelectDateUI.c(SelectDateUI.this);
            if (SelectDateUI.b(SelectDateUI.this) == -1L) {}
            for (long l = System.currentTimeMillis() * 1000L;; l = SelectDateUI.b(SelectDateUI.this))
            {
              localDayPickerView.jOx = l;
              SelectDateUI.c(SelectDateUI.this).a(SelectDateUI.this, SelectDateUI.d(SelectDateUI.this).values());
              if (SelectDateUI.d(SelectDateUI.this).size() != 0) {
                break;
              }
              SelectDateUI.e(SelectDateUI.this).setVisibility(0);
              SelectDateUI.c(SelectDateUI.this).setVisibility(8);
              SelectDateUI.e(SelectDateUI.this).setText(SelectDateUI.this.getString(R.l.dgY));
              GMTrace.o(9089358757888L, 67721);
              return;
            }
            SelectDateUI.e(SelectDateUI.this).setVisibility(8);
            SelectDateUI.c(SelectDateUI.this).setVisibility(0);
            GMTrace.o(9089358757888L, 67721);
          }
        });
        GMTrace.o(9153649049600L, 68200);
      }
    }, "prepare_data");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9129355640832L, 68019);
        SelectDateUI.this.finish();
        GMTrace.o(9129355640832L, 68019);
        return true;
      }
    });
    GMTrace.o(9137140269056L, 68077);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\SelectDateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */