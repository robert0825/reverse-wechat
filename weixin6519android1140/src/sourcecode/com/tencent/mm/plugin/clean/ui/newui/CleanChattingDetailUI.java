package com.tencent.mm.plugin.clean.ui.newui;

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
import com.tencent.mm.plugin.clean.c.d;
import com.tencent.mm.plugin.clean.c.e;
import com.tencent.mm.sdk.platformtools.bg;
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
  private int index;
  private GridHeadersGridView jUn;
  MMAutoAdjustTextView jUp;
  private Button jUq;
  private e jVA;
  private b jVy;
  private com.tencent.mm.plugin.clean.c.b jVz;
  
  public CleanChattingDetailUI()
  {
    GMTrace.i(20548868374528L, 153101);
    GMTrace.o(20548868374528L, 153101);
  }
  
  public final void bR(int paramInt1, int paramInt2)
  {
    GMTrace.i(20549539463168L, 153106);
    this.htG.setMessage(getString(R.l.die, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
    GMTrace.o(20549539463168L, 153106);
  }
  
  public final void be(long paramLong)
  {
    GMTrace.i(20549673680896L, 153107);
    this.htG.dismiss();
    d.bc(d.aoc() + paramLong);
    d.aZ(d.anZ() - paramLong);
    com.tencent.mm.ui.base.h.a(this, getString(R.l.dhU, new Object[] { bg.aF(paramLong) }), "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20550881640448L, 153116);
        if (CleanChattingDetailUI.c(CleanChattingDetailUI.this).jST.size() == 0) {
          CleanChattingDetailUI.this.finish();
        }
        GMTrace.o(20550881640448L, 153116);
      }
    });
    GMTrace.o(20549673680896L, 153107);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20549136809984L, 153103);
    int i = R.i.cts;
    GMTrace.o(20549136809984L, 153103);
    return i;
  }
  
  public final void mk(int paramInt)
  {
    GMTrace.i(20549271027712L, 153104);
    if (paramInt > 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.jUq.setEnabled(bool);
      GMTrace.o(20549271027712L, 153104);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20549002592256L, 153102);
    super.onCreate(paramBundle);
    d.aof();
    this.index = getIntent().getIntExtra("key_position", -1);
    if (this.index < 0)
    {
      finish();
      GMTrace.o(20549002592256L, 153102);
      return;
    }
    if (d.agb() == null)
    {
      finish();
      GMTrace.o(20549002592256L, 153102);
      return;
    }
    this.iYV = findViewById(R.h.bdS);
    this.iYX = ((CheckBox)findViewById(R.h.bdR));
    this.jUp = ((MMAutoAdjustTextView)findViewById(R.h.bte));
    this.jUq = ((Button)findViewById(R.h.aVV));
    mk(0);
    this.jVz = ((com.tencent.mm.plugin.clean.c.b)d.agb().get(this.index));
    if (s.eb(this.jVz.username)) {
      sq(r.F(this.jVz.username, this.jVz.username));
    }
    for (;;)
    {
      this.jUn = ((GridHeadersGridView)findViewById(R.h.bpi));
      this.jUn.setNumColumns(3);
      this.jVy = new b(this, this.jVz.jST);
      this.jUn.xdW = this.jVy.jUb;
      this.jUn.setOnItemClickListener(this.jVy.juU);
      this.jUn.setOnScrollListener(this.jVy.jUd);
      this.jUn.setAdapter(this.jVy);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(20548063068160L, 153095);
          CleanChattingDetailUI.this.finish();
          GMTrace.o(20548063068160L, 153095);
          return false;
        }
      });
      this.iYV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20538667827200L, 153025);
          paramAnonymousView = CleanChattingDetailUI.a(CleanChattingDetailUI.this);
          if (paramAnonymousView.iYP.size() == paramAnonymousView.iBZ.size()) {
            paramAnonymousView.iYP.clear();
          }
          for (;;)
          {
            paramAnonymousView.aon();
            CleanChattingDetailUI.a(CleanChattingDetailUI.this).notifyDataSetChanged();
            GMTrace.o(20538667827200L, 153025);
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
          GMTrace.i(20545378713600L, 153075);
          com.tencent.mm.ui.base.h.a(CleanChattingDetailUI.this, CleanChattingDetailUI.this.getString(R.l.dip), "", CleanChattingDetailUI.this.getString(R.l.btb), CleanChattingDetailUI.this.getString(R.l.cancel), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(20553968648192L, 153139);
              CleanChattingDetailUI.b(CleanChattingDetailUI.this);
              GMTrace.o(20553968648192L, 153139);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(20547257761792L, 153089);
              GMTrace.o(20547257761792L, 153089);
            }
          });
          GMTrace.o(20545378713600L, 153075);
        }
      });
      getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.dhT), false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(20536654561280L, 153010);
          GMTrace.o(20536654561280L, 153010);
        }
      });
      this.htG.dismiss();
      GMTrace.o(20549002592256L, 153102);
      return;
      sq(r.fs(this.jVz.username));
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20549405245440L, 153105);
    if (this.htG.isShowing()) {
      this.htG.dismiss();
    }
    if (this.jVA != null) {
      this.jVA.aoh();
    }
    d.aog();
    d.aoe();
    super.onDestroy();
    GMTrace.o(20549405245440L, 153105);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\clean\ui\newui\CleanChattingDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */