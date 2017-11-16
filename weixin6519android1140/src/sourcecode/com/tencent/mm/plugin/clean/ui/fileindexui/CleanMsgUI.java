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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.plugin.clean.ui.PieView;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CleanMsgUI
  extends MMActivity
{
  private ProgressDialog htG;
  private View jUD;
  private PieView jUE;
  private TextView jUF;
  private Button jUG;
  private Button jUH;
  private TextView jUI;
  private TextView jUJ;
  private TextView jUK;
  private TextView jUL;
  private View jUM;
  private TextView jUN;
  private TextView jUO;
  private TextView jUP;
  private TextView jUQ;
  private TextView jUR;
  private TextView jUS;
  private LinearLayout jUT;
  
  public CleanMsgUI()
  {
    GMTrace.i(20513971765248L, 152841);
    GMTrace.o(20513971765248L, 152841);
  }
  
  private void b(long paramLong1, long paramLong2, long paramLong3)
  {
    GMTrace.i(20514374418432L, 152844);
    long l = paramLong1;
    if (paramLong1 <= 0L)
    {
      l = 1L;
      g.ork.a(714L, 61L, 1L, false);
    }
    int j = (int)(360L * paramLong2 / l);
    if ((paramLong2 > 0L) && (j < 5)) {
      j = 5;
    }
    for (;;)
    {
      int i = 0;
      if (paramLong3 > 0L)
      {
        int k = (int)(360L * paramLong3 / l);
        i = k;
        if (k < 5) {
          i = 5;
        }
      }
      paramLong1 = l - paramLong2 - paramLong3;
      w.i("MicroMsg.CleanMsgUI", "update acc[%d %d] otherAcc[%d %d] other[%d %d] wechat[%d] stack[%s]", new Object[] { Long.valueOf(paramLong2), Integer.valueOf((int)(100L * paramLong2 / l)), Long.valueOf(paramLong3), Integer.valueOf((int)(100L * paramLong3 / l)), Long.valueOf(paramLong1), Integer.valueOf((int)(100L * paramLong1 / l)), Long.valueOf(l), bg.bQW() });
      this.jUE.jTS = j;
      this.jUE.jTU = i;
      this.jUE.eOh = 1;
      this.jUD.setVisibility(0);
      this.jUI.setText(bg.aF(paramLong2));
      this.jUJ.setText(bg.aF(paramLong3));
      this.jUK.setText(bg.aF(paramLong1));
      if (paramLong3 > 0L)
      {
        this.jUM.setVisibility(0);
        this.jUH.setEnabled(true);
      }
      TextView localTextView;
      StringBuffer localStringBuffer;
      for (;;)
      {
        this.jUP.setText(getString(R.l.dhR));
        this.jUQ.setText(getString(R.l.dib));
        this.jUR.setText(getString(R.l.did));
        if (((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyZ, Integer.valueOf(0))).intValue() <= 0) {
          break label509;
        }
        this.jUT.setVisibility(0);
        this.jUS.setVisibility(0);
        localTextView = this.jUS;
        HashMap localHashMap = j.aoj().jTv;
        localStringBuffer = new StringBuffer();
        if (localHashMap.isEmpty()) {
          break;
        }
        Iterator localIterator = localHashMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localStringBuffer.append(str).append(" : ").append(bg.aF(((Long)localHashMap.get(str)).longValue())).append("\n");
        }
        this.jUH.setEnabled(false);
        this.jUM.setVisibility(0);
      }
      localTextView.setText(localStringBuffer.toString());
      label509:
      GMTrace.o(20514374418432L, 152844);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20514240200704L, 152843);
    int i = R.i.ctw;
    GMTrace.o(20514240200704L, 152843);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20514642853888L, 152846);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    b(j.aoj().jSJ, j.aoj().jSK, j.aoj().jSL);
    GMTrace.o(20514642853888L, 152846);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20514105982976L, 152842);
    super.onCreate(paramBundle);
    g.ork.a(714L, 10L, 1L, false);
    this.jUF = ((TextView)findViewById(R.h.bTQ));
    this.jUE = ((PieView)findViewById(R.h.bTk));
    this.jUG = ((Button)findViewById(R.h.bph));
    this.jUH = ((Button)findViewById(R.h.bpl));
    this.jUD = findViewById(R.h.bdT);
    this.jUI = ((TextView)findViewById(R.h.coi));
    this.jUI.setTextSize(1, 16.0F);
    this.jUJ = ((TextView)findViewById(R.h.bSB));
    this.jUJ.setTextSize(1, 16.0F);
    this.jUK = ((TextView)findViewById(R.h.bSE));
    this.jUK.setTextSize(1, 16.0F);
    this.jUL = ((TextView)findViewById(R.h.bBg));
    this.jUL.setTextSize(1, 16.0F);
    this.jUN = ((TextView)findViewById(R.h.bpk));
    this.jUO = ((TextView)findViewById(R.h.bpm));
    this.jUS = ((TextView)findViewById(R.h.bsW));
    this.jUT = ((LinearLayout)findViewById(R.h.bsX));
    this.jUP = ((TextView)findViewById(R.h.com));
    this.jUQ = ((TextView)findViewById(R.h.bSC));
    this.jUR = ((TextView)findViewById(R.h.bSG));
    this.jUM = ((View)findViewById(R.h.bSA));
    oM(R.l.dia);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20521353740288L, 152896);
        CleanMsgUI.this.finish();
        GMTrace.o(20521353740288L, 152896);
        return false;
      }
    });
    this.jUH.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20520414216192L, 152889);
        com.tencent.mm.ui.base.h.a(CleanMsgUI.this, CleanMsgUI.this.getString(R.l.dic, new Object[] { bg.eL(j.aoj().jSL) }), "", CleanMsgUI.this.getString(R.l.cTM), CleanMsgUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(20511958499328L, 152826);
            CleanMsgUI.a(CleanMsgUI.this, j.aoj().jTk);
            GMTrace.o(20511958499328L, 152826);
          }
        }, null, R.e.aOL);
        GMTrace.o(20520414216192L, 152889);
      }
    });
    this.jUG.setEnabled(true);
    this.jUG.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20511690063872L, 152824);
        CleanMsgUI.this.startActivityForResult(new Intent(CleanMsgUI.this, CleanChattingUI.class), 0);
        g.ork.a(714L, 12L, 1L, false);
        GMTrace.o(20511690063872L, 152824);
      }
    });
    getString(R.l.cUG);
    this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.dhT), false, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(20511153192960L, 152820);
        GMTrace.o(20511153192960L, 152820);
      }
    });
    this.htG.dismiss();
    b(j.aoj().jSJ, j.aoj().jSK, j.aoj().jSL);
    GMTrace.o(20514105982976L, 152842);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20514508636160L, 152845);
    super.onDestroy();
    GMTrace.o(20514508636160L, 152845);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\ui\fileindexui\CleanMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */