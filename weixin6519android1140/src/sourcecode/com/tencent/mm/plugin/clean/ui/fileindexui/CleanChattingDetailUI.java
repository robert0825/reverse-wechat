package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.gridviewheaders.GridHeadersGridView;
import com.tencent.mm.ui.widget.MMAutoAdjustTextView;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashSet;

public class CleanChattingDetailUI
  extends MMActivity
  implements com.tencent.mm.plugin.clean.c.h
{
  private ProgressDialog htG;
  private View iYV;
  CheckBox iYX;
  private long jSM;
  private GridHeadersGridView jUn;
  private b jUo;
  MMAutoAdjustTextView jUp;
  private Button jUq;
  private com.tencent.mm.plugin.clean.b.b jUr;
  private int pos;
  private String username;
  
  public CleanChattingDetailUI()
  {
    GMTrace.i(20526185578496L, 152932);
    GMTrace.o(20526185578496L, 152932);
  }
  
  public final void bR(final int paramInt1, final int paramInt2)
  {
    GMTrace.i(20526856667136L, 152937);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20528735715328L, 152951);
        CleanChattingDetailUI.c(CleanChattingDetailUI.this).setMessage(CleanChattingDetailUI.this.getString(R.l.die, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
        GMTrace.o(20528735715328L, 152951);
      }
    });
    GMTrace.o(20526856667136L, 152937);
  }
  
  public final void be(final long paramLong)
  {
    GMTrace.i(20526990884864L, 152938);
    w.i("MicroMsg.CleanChattingDetailUI", "%s onDeleteEnd [%d] ", new Object[] { hashCode(), Long.valueOf(paramLong) });
    j.aoj().jSK -= paramLong;
    j.aoj().jSJ -= paramLong;
    this.jSM += paramLong;
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20529272586240L, 152955);
        CleanChattingDetailUI.c(CleanChattingDetailUI.this).dismiss();
        Intent localIntent = new Intent();
        localIntent.putExtra("key_pos", CleanChattingDetailUI.d(CleanChattingDetailUI.this));
        localIntent.putExtra("key_delete_size", CleanChattingDetailUI.e(CleanChattingDetailUI.this));
        CleanChattingDetailUI.this.setResult(1000, localIntent);
        com.tencent.mm.ui.base.h.b(CleanChattingDetailUI.this, CleanChattingDetailUI.this.getString(R.l.dhU, new Object[] { bg.aF(paramLong) }), "", true);
        GMTrace.o(20529272586240L, 152955);
      }
    });
    GMTrace.o(20526990884864L, 152938);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20526454013952L, 152934);
    int i = R.i.cts;
    GMTrace.o(20526454013952L, 152934);
    return i;
  }
  
  public final void mk(int paramInt)
  {
    GMTrace.i(20526588231680L, 152935);
    if (paramInt > 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.jUq.setEnabled(bool);
      GMTrace.o(20526588231680L, 152935);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20526319796224L, 152933);
    super.onCreate(paramBundle);
    this.username = getIntent().getStringExtra("key_username");
    this.pos = getIntent().getIntExtra("key_pos", 0);
    if (bg.nm(this.username))
    {
      w.w("MicroMsg.CleanChattingDetailUI", "username is null");
      finish();
      GMTrace.o(20526319796224L, 152933);
      return;
    }
    this.iYV = ((View)findViewById(R.h.bdS));
    this.iYX = ((CheckBox)findViewById(R.h.bdR));
    this.jUp = ((MMAutoAdjustTextView)findViewById(R.h.bte));
    this.jUq = ((Button)findViewById(R.h.aVV));
    mk(0);
    if (s.eb(this.username)) {
      sq(r.F(this.username, this.username));
    }
    for (;;)
    {
      this.jUn = ((GridHeadersGridView)findViewById(R.h.bpi));
      this.jUn.setNumColumns(3);
      this.jUo = new b(this, this.username);
      this.jUn.xdW = this.jUo.jUb;
      this.jUn.setOnItemClickListener(this.jUo.juU);
      this.jUn.setOnScrollListener(this.jUo.jUd);
      this.jUn.setAdapter(this.jUo);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(20525782925312L, 152929);
          CleanChattingDetailUI.this.finish();
          GMTrace.o(20525782925312L, 152929);
          return false;
        }
      });
      this.iYV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20513837547520L, 152840);
          paramAnonymousView = CleanChattingDetailUI.a(CleanChattingDetailUI.this);
          if (paramAnonymousView.iYP.size() == paramAnonymousView.iBZ.size()) {
            paramAnonymousView.iYP.clear();
          }
          for (;;)
          {
            paramAnonymousView.aon();
            CleanChattingDetailUI.a(CleanChattingDetailUI.this).notifyDataSetChanged();
            GMTrace.o(20513837547520L, 152840);
            return;
            int i = 0;
            while (i < paramAnonymousView.iBZ.size())
            {
              paramAnonymousView.iYP.add(Integer.valueOf(i));
              i += 1;
            }
          }
        }
      });
      this.jUq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20522293264384L, 152903);
          com.tencent.mm.ui.base.h.a(CleanChattingDetailUI.this, CleanChattingDetailUI.this.getString(R.l.dip), "", CleanChattingDetailUI.this.getString(R.l.btb), CleanChattingDetailUI.this.getString(R.l.cancel), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(20532896464896L, 152982);
              CleanChattingDetailUI.b(CleanChattingDetailUI.this);
              g.ork.a(714L, 31L, 1L, false);
              GMTrace.o(20532896464896L, 152982);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(20524977618944L, 152923);
              GMTrace.o(20524977618944L, 152923);
            }
          });
          GMTrace.o(20522293264384L, 152903);
        }
      });
      getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.dhT), false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(20510884757504L, 152818);
          GMTrace.o(20510884757504L, 152818);
        }
      });
      this.htG.dismiss();
      if (this.jUo != null) {
        e.post(new b.b(this.jUo), "load_clean_detail");
      }
      g.ork.a(714L, 30L, 1L, false);
      GMTrace.o(20526319796224L, 152933);
      return;
      sq(r.fs(this.username));
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20526722449408L, 152936);
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    if (this.jUo != null) {
      this.jUo.isStop = true;
    }
    super.onDestroy();
    GMTrace.o(20526722449408L, 152936);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\ui\fileindexui\CleanChattingDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */