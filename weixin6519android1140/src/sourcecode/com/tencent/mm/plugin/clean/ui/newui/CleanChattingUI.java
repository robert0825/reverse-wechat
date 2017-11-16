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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.clean.c.b;
import com.tencent.mm.plugin.clean.c.d;
import com.tencent.mm.plugin.clean.c.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CleanChattingUI
  extends MMActivity
  implements com.tencent.mm.plugin.clean.c.h
{
  private ProgressDialog htG;
  private View iYV;
  private CheckBox iYX;
  private TextView iYY;
  private Button jUq;
  private ListView jUw;
  private TextView jUx;
  private e jVA;
  private a jVD;
  
  public CleanChattingUI()
  {
    GMTrace.i(20545781366784L, 153078);
    GMTrace.o(20545781366784L, 153078);
  }
  
  public final void a(HashSet<Integer> paramHashSet)
  {
    GMTrace.i(20546049802240L, 153080);
    Object localObject = new HashSet();
    Iterator localIterator = paramHashSet.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      int j = ((Integer)localIterator.next()).intValue();
      if (j < d.agb().size())
      {
        long l = i;
        i = (int)(((b)d.agb().get(j)).eJe + l);
      }
      else
      {
        ((HashSet)localObject).add(Integer.valueOf(j));
      }
    }
    localObject = ((HashSet)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramHashSet.remove((Integer)((Iterator)localObject).next());
    }
    if ((paramHashSet.size() != 0) || (i > 0))
    {
      this.jUx.setText(getString(R.l.dmD, new Object[] { bg.aF(i) }));
      this.jUq.setEnabled(true);
      if (paramHashSet.size() == this.jVD.getCount())
      {
        this.iYX.setChecked(true);
        GMTrace.o(20546049802240L, 153080);
        return;
      }
      this.iYX.setChecked(false);
      GMTrace.o(20546049802240L, 153080);
      return;
    }
    this.jUx.setText("");
    this.jUq.setEnabled(false);
    this.iYX.setChecked(false);
    GMTrace.o(20546049802240L, 153080);
  }
  
  public final void bR(int paramInt1, int paramInt2)
  {
    GMTrace.i(20546452455424L, 153083);
    this.htG.setMessage(getString(R.l.die, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
    GMTrace.o(20546452455424L, 153083);
  }
  
  public final void be(long paramLong)
  {
    GMTrace.i(20546586673152L, 153084);
    this.htG.dismiss();
    d.bc(d.aoc() + paramLong);
    d.aZ(d.anZ() - paramLong);
    com.tencent.mm.ui.base.h.a(this, getString(R.l.dhU, new Object[] { bg.aF(paramLong) }), "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20545110278144L, 153073);
        if ((d.agb() != null) && (d.agb().size() == 0)) {
          CleanChattingUI.this.finish();
        }
        GMTrace.o(20545110278144L, 153073);
      }
    });
    GMTrace.o(20546586673152L, 153084);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20546318237696L, 153082);
    int i = R.i.ctu;
    GMTrace.o(20546318237696L, 153082);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20546720890880L, 153085);
    this.jVD.notifyDataSetChanged();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(20546720890880L, 153085);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20545915584512L, 153079);
    super.onCreate(paramBundle);
    d.aof();
    w.i("MicroMsg.CleanChattingUI", "Create!!");
    oM(R.l.dig);
    this.jUw = ((ListView)findViewById(R.h.bpj));
    this.jVD = new a(this);
    this.jUw.setAdapter(this.jVD);
    this.jUw.setEmptyView(findViewById(R.h.bwN));
    this.iYV = findViewById(R.h.bdS);
    this.jUx = ((TextView)findViewById(R.h.bte));
    this.iYX = ((CheckBox)findViewById(R.h.bdR));
    this.iYY = ((TextView)findViewById(R.h.bdQ));
    if (!v.bPG())
    {
      this.jUx.setTextSize(1, 14.0F);
      this.iYY.setTextSize(1, 14.0F);
    }
    this.jUq = ((Button)findViewById(R.h.aVV));
    this.jUq.setEnabled(false);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20555981914112L, 153154);
        CleanChattingUI.this.finish();
        GMTrace.o(20555981914112L, 153154);
        return false;
      }
    });
    this.jUw.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20547526197248L, 153091);
        paramAnonymousAdapterView = new Intent(CleanChattingUI.this, CleanChattingDetailUI.class);
        paramAnonymousAdapterView.putExtra("key_position", paramAnonymousInt);
        CleanChattingUI.this.startActivityForResult(paramAnonymousAdapterView, 0);
        GMTrace.o(20547526197248L, 153091);
      }
    });
    this.jUq.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20538399391744L, 153023);
        com.tencent.mm.ui.base.h.a(CleanChattingUI.this, CleanChattingUI.this.getString(R.l.dio), "", CleanChattingUI.this.getString(R.l.btb), CleanChattingUI.this.getString(R.l.cancel), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(20551418511360L, 153120);
            CleanChattingUI.a(CleanChattingUI.this);
            GMTrace.o(20551418511360L, 153120);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(20545647149056L, 153077);
            GMTrace.o(20545647149056L, 153077);
          }
        });
        GMTrace.o(20538399391744L, 153023);
      }
    });
    this.iYV.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20537862520832L, 153019);
        paramAnonymousView = CleanChattingUI.b(CleanChattingUI.this);
        if (paramAnonymousView.iYP.size() == paramAnonymousView.getCount()) {
          paramAnonymousView.iYP.clear();
        }
        for (;;)
        {
          paramAnonymousView.notifyDataSetChanged();
          paramAnonymousView.jVu.a(paramAnonymousView.iYP);
          GMTrace.o(20537862520832L, 153019);
          return;
          int i = 0;
          while (i < paramAnonymousView.getCount())
          {
            paramAnonymousView.iYP.add(Integer.valueOf(i));
            i += 1;
          }
        }
      }
    });
    getString(R.l.cUG);
    this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.dhT), false, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(20538130956288L, 153021);
        GMTrace.o(20538130956288L, 153021);
      }
    });
    this.htG.dismiss();
    GMTrace.o(20545915584512L, 153079);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20546184019968L, 153081);
    if (this.htG.isShowing()) {
      this.htG.dismiss();
    }
    if (this.jVA != null) {
      this.jVA.aoh();
    }
    d.aog();
    d.aoe();
    super.onDestroy();
    GMTrace.o(20546184019968L, 153081);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\ui\newui\CleanChattingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */