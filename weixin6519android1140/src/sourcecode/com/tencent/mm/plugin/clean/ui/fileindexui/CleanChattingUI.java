package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
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
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CleanChattingUI
  extends MMActivity
  implements com.tencent.mm.plugin.clean.c.h
{
  private List<c> dataList;
  private ProgressDialog htG;
  private View iYV;
  private CheckBox iYX;
  private TextView iYY;
  private Button jUq;
  private a jUv;
  private ListView jUw;
  private TextView jUx;
  private TextView jUy;
  private boolean jUz;
  
  public CleanChattingUI()
  {
    GMTrace.i(20522695917568L, 152906);
    this.jUz = false;
    this.dataList = new ArrayList();
    GMTrace.o(20522695917568L, 152906);
  }
  
  public final void a(HashSet<Integer> paramHashSet)
  {
    GMTrace.i(20522964353024L, 152908);
    if (this.jUv == null)
    {
      w.w("MicroMsg.CleanChattingUI", "on click check box but adapter is null");
      GMTrace.o(20522964353024L, 152908);
      return;
    }
    Object localObject = new HashSet();
    Iterator localIterator = paramHashSet.iterator();
    long l = 0L;
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      c localc = this.jUv.mh(i);
      if (localc != null) {
        l = localc.size + l;
      } else {
        ((HashSet)localObject).add(Integer.valueOf(i));
      }
    }
    localObject = ((HashSet)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramHashSet.remove((Integer)((Iterator)localObject).next());
    }
    if ((paramHashSet.size() != 0) || (l > 0L))
    {
      this.jUx.setText(getString(R.l.dmD, new Object[] { bg.aF(l) }));
      this.jUq.setEnabled(true);
      if (paramHashSet.size() == this.jUv.getCount())
      {
        this.iYX.setChecked(true);
        GMTrace.o(20522964353024L, 152908);
        return;
      }
      this.iYX.setChecked(false);
      GMTrace.o(20522964353024L, 152908);
      return;
    }
    this.jUx.setText("");
    this.jUq.setEnabled(false);
    this.iYX.setChecked(false);
    GMTrace.o(20522964353024L, 152908);
  }
  
  public final void bR(final int paramInt1, final int paramInt2)
  {
    GMTrace.i(20523501223936L, 152912);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20519877345280L, 152885);
        CleanChattingUI.g(CleanChattingUI.this).setMessage(CleanChattingUI.this.getString(R.l.die, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
        GMTrace.o(20519877345280L, 152885);
      }
    });
    GMTrace.o(20523501223936L, 152912);
  }
  
  public final void be(final long paramLong)
  {
    GMTrace.i(20523635441664L, 152913);
    w.i("MicroMsg.CleanChattingUI", "%s onDeleteEnd [%d] ", new Object[] { hashCode(), Long.valueOf(paramLong) });
    j.aoj().jSK -= paramLong;
    j.aoj().jSJ -= paramLong;
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20520145780736L, 152887);
        CleanChattingUI.g(CleanChattingUI.this).dismiss();
        com.tencent.mm.ui.base.h.b(CleanChattingUI.this, CleanChattingUI.this.getString(R.l.dhU, new Object[] { bg.aF(paramLong) }), "", true);
        CleanChattingUI.e(CleanChattingUI.this).setText(CleanChattingUI.this.getString(R.l.cRH, new Object[] { " " }));
        GMTrace.o(20520145780736L, 152887);
      }
    });
    GMTrace.o(20523635441664L, 152913);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20523367006208L, 152911);
    int i = R.i.ctu;
    GMTrace.o(20523367006208L, 152911);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20523769659392L, 152914);
    long l;
    c localc;
    if (paramIntent != null)
    {
      int i = paramIntent.getIntExtra("key_pos", -1);
      l = paramIntent.getLongExtra("key_delete_size", 0L);
      if ((i > 0) && (i < this.dataList.size()))
      {
        localc = (c)this.dataList.get(i);
        if (localc != null)
        {
          if (localc.size != l) {
            break label120;
          }
          this.dataList.remove(i);
        }
      }
    }
    for (;;)
    {
      this.jUv.notifyDataSetChanged();
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(20523769659392L, 152914);
      return;
      label120:
      localc.size -= l;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20522830135296L, 152907);
    super.onCreate(paramBundle);
    w.i("MicroMsg.CleanChattingUI", "Create!!");
    oM(R.l.dia);
    this.jUw = ((ListView)findViewById(R.h.bpj));
    this.jUv = new a(this, this.dataList);
    this.jUw.setAdapter(this.jUv);
    this.jUw.setEmptyView(findViewById(R.h.bwN));
    this.jUy = ((TextView)findViewById(R.h.bwJ));
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
        GMTrace.i(20535178166272L, 152999);
        CleanChattingUI.this.finish();
        GMTrace.o(20535178166272L, 152999);
        return false;
      }
    });
    this.jUw.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20525246054400L, 152925);
        paramAnonymousAdapterView = CleanChattingUI.a(CleanChattingUI.this).mh(paramAnonymousInt);
        if (paramAnonymousAdapterView != null)
        {
          paramAnonymousView = new Intent(CleanChattingUI.this, CleanChattingDetailUI.class);
          paramAnonymousView.putExtra("key_username", paramAnonymousAdapterView.username);
          paramAnonymousView.putExtra("key_pos", paramAnonymousInt);
          CleanChattingUI.this.startActivityForResult(paramAnonymousView, 0);
          g.ork.a(714L, 21L, 1L, false);
        }
        GMTrace.o(20525246054400L, 152925);
      }
    });
    this.jUq.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20513434894336L, 152837);
        com.tencent.mm.ui.base.h.a(CleanChattingUI.this, CleanChattingUI.this.getString(R.l.dio), "", CleanChattingUI.this.getString(R.l.btb), CleanChattingUI.this.getString(R.l.cancel), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(20529809457152L, 152959);
            CleanChattingUI.b(CleanChattingUI.this);
            g.ork.a(714L, 22L, 1L, false);
            GMTrace.o(20529809457152L, 152959);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(20522561699840L, 152905);
            GMTrace.o(20522561699840L, 152905);
          }
        });
        GMTrace.o(20513434894336L, 152837);
      }
    });
    this.iYV.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20512898023424L, 152833);
        paramAnonymousView = CleanChattingUI.a(CleanChattingUI.this);
        if (paramAnonymousView.iYP.size() == paramAnonymousView.getCount()) {
          paramAnonymousView.iYP.clear();
        }
        for (;;)
        {
          paramAnonymousView.notifyDataSetChanged();
          paramAnonymousView.jTW.a(paramAnonymousView.iYP);
          GMTrace.o(20512898023424L, 152833);
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
        GMTrace.i(20513166458880L, 152835);
        GMTrace.o(20513166458880L, 152835);
      }
    });
    this.htG.dismiss();
    g.ork.a(714L, 20L, 1L, false);
    GMTrace.o(20522830135296L, 152907);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20523098570752L, 152909);
    if (this.htG.isShowing()) {
      this.htG.dismiss();
    }
    super.onDestroy();
    GMTrace.o(20523098570752L, 152909);
  }
  
  protected void onResume()
  {
    GMTrace.i(20523232788480L, 152910);
    super.onResume();
    if ((this.jUv != null) && (this.dataList.isEmpty())) {
      com.tencent.mm.kernel.h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20522024828928L, 152901);
          if (!CleanChattingUI.c(CleanChattingUI.this))
          {
            w.i("MicroMsg.CleanChattingUI", "load contact cursor now");
            CleanChattingUI.d(CleanChattingUI.this);
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20528467279872L, 152949);
                CleanChattingUI.e(CleanChattingUI.this).setText(CleanChattingUI.this.getString(R.l.cRH, new Object[] { " " }));
                GMTrace.o(20528467279872L, 152949);
              }
            });
            Cursor localCursor = com.tencent.mm.plugin.i.b.aiA().aiB().aiL();
            if (localCursor != null) {
              while (localCursor.moveToNext())
              {
                c localc = new c();
                localc.username = localCursor.getString(0);
                localc.size = localCursor.getLong(1);
                CleanChattingUI.f(CleanChattingUI.this).add(localc);
              }
            }
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20535446601728L, 153001);
                CleanChattingUI.a(CleanChattingUI.this).notifyDataSetChanged();
                CleanChattingUI.e(CleanChattingUI.this).setText(R.l.dhS);
                GMTrace.o(20535446601728L, 153001);
              }
            });
          }
          GMTrace.o(20522024828928L, 152901);
        }
      });
    }
    GMTrace.o(20523232788480L, 152910);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\ui\fileindexui\CleanChattingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */