package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a.c;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e.1;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class BakMoveChooseUI
  extends MMActivity
  implements a.c
{
  public static boolean iYQ;
  public static boolean jeV;
  private ListView iYU;
  private View iYV;
  private CheckBox iYX;
  private TextView iYY;
  private TextView iYZ;
  private ProgressBar iZc;
  private a jeQ;
  private TextView jeR;
  private Button jeS;
  private TextView jeT;
  private View jeU;
  
  static
  {
    GMTrace.i(14807302406144L, 110323);
    iYQ = false;
    jeV = false;
    GMTrace.o(14807302406144L, 110323);
  }
  
  public BakMoveChooseUI()
  {
    GMTrace.i(14806228664320L, 110315);
    GMTrace.o(14806228664320L, 110315);
  }
  
  public final void a(long paramLong1, long paramLong2, ArrayList<com.tencent.mm.plugin.backup.bakoldlogic.a.a> paramArrayList, boolean paramBoolean)
  {
    GMTrace.i(14806765535232L, 110319);
    this.jeT.setVisibility(0);
    this.jeT.setText("加载中...(" + paramLong1 + "/" + paramLong2 + ")");
    if (paramBoolean)
    {
      this.iZc.setVisibility(4);
      this.jeQ.notifyDataSetChanged();
    }
    GMTrace.o(14806765535232L, 110319);
  }
  
  public final void a(ArrayList<com.tencent.mm.plugin.backup.bakoldlogic.a.a> paramArrayList, PLong paramPLong, PInt paramPInt)
  {
    GMTrace.i(14806899752960L, 110320);
    if (paramArrayList == null)
    {
      GMTrace.o(14806899752960L, 110320);
      return;
    }
    if (paramArrayList.size() == 0)
    {
      this.iZc.setVisibility(8);
      this.iYZ.setVisibility(0);
      GMTrace.o(14806899752960L, 110320);
      return;
    }
    this.jeQ.notifyDataSetChanged();
    this.iYX.setClickable(true);
    this.iZc.setVisibility(4);
    this.iYZ.setVisibility(0);
    this.jeT.setVisibility(8);
    this.iYU.removeFooterView(this.jeU);
    GMTrace.o(14806899752960L, 110320);
  }
  
  public final void a(HashSet<Integer> paramHashSet)
  {
    GMTrace.i(14806497099776L, 110317);
    Object localObject = new HashSet();
    Iterator localIterator = paramHashSet.iterator();
    long l = 0L;
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if (i < com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e.agb().size()) {
        l = ((com.tencent.mm.plugin.backup.bakoldlogic.a.a)com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e.agb().get(i)).iVk + l;
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
      this.jeR.setVisibility(0);
      this.jeR.setText(getString(R.l.cXN, new Object[] { bg.aF(l) }));
      this.jeS.setEnabled(true);
      if ((com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e.age()) && (paramHashSet.size() == this.jeQ.getCount()))
      {
        this.iYX.setChecked(true);
        GMTrace.o(14806497099776L, 110317);
        return;
      }
      this.iYX.setChecked(false);
      GMTrace.o(14806497099776L, 110317);
      return;
    }
    this.jeR.setVisibility(8);
    this.jeR.setText("");
    this.jeS.setEnabled(false);
    this.iYX.setChecked(false);
    GMTrace.o(14806497099776L, 110317);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14806631317504L, 110318);
    int i = R.i.cpM;
    GMTrace.o(14806631317504L, 110318);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14806362882048L, 110316);
    super.onCreate(paramBundle);
    oM(R.l.cXD);
    this.iYU = ((ListView)findViewById(R.h.bfV));
    this.jeU = com.tencent.mm.ui.v.fb(this).inflate(R.i.cpK, null);
    this.iYU.addFooterView(this.jeU);
    this.jeQ = new a(this);
    this.iYU.setAdapter(this.jeQ);
    this.iYU.setEmptyView(findViewById(R.h.bwN));
    this.iYV = findViewById(R.h.bdS);
    this.jeR = ((TextView)findViewById(R.h.bpf));
    this.iYX = ((CheckBox)findViewById(R.h.bdR));
    this.iYY = ((TextView)findViewById(R.h.bdQ));
    this.iYZ = ((TextView)findViewById(R.h.bwM));
    this.iZc = ((ProgressBar)findViewById(R.h.bKF));
    this.jeS = ((Button)findViewById(R.h.bpe));
    this.jeT = ((TextView)findViewById(R.h.bKE));
    ((TextView)findViewById(R.h.bpg)).setVisibility(8);
    paramBundle = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afX();
    if (paramBundle.jec != null) {
      paramBundle.jec.stopTimer();
    }
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afX();
    if (!com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e.age())
    {
      paramBundle = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afX();
      com.tencent.mm.plugin.backup.g.a.afG().afJ();
      com.tencent.mm.sdk.f.e.post(new e.1(paramBundle), "BakMoveChooseServer.calculateToChoose");
    }
    if (!com.tencent.mm.sdk.platformtools.v.bPG())
    {
      this.jeR.setTextSize(1, 14.0F);
      this.iYY.setTextSize(1, 14.0F);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14803946962944L, 110298);
        if (!BakMoveChooseUI.jeV) {
          BakMoveChooseUI.this.finish();
        }
        GMTrace.o(14803946962944L, 110298);
        return false;
      }
    });
    this.jeS.setEnabled(false);
    this.jeS.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(14794551721984L, 110228);
        PLong localPLong = new PLong();
        PInt localPInt = new PInt();
        Object localObject = BakMoveChooseUI.a(BakMoveChooseUI.this);
        if (((a)localObject).iYP.size() <= 0) {
          paramAnonymousView = null;
        }
        for (;;)
        {
          localObject = new Intent(BakMoveChooseUI.this, BakMoveWaitUI.class);
          ((Intent)localObject).putStringArrayListExtra("selected_records_username", paramAnonymousView);
          ((Intent)localObject).putExtra("selected_records_addupsize", localPLong.value);
          ((Intent)localObject).putExtra("selected_records_count", localPInt.value);
          if (BakMoveChooseUI.iYQ) {
            g.ork.a(103L, 13L, 1L, false);
          }
          g.ork.a(103L, 12L, 1L, false);
          BakMoveChooseUI.this.startActivity((Intent)localObject);
          GMTrace.o(14794551721984L, 110228);
          return;
          paramAnonymousView = new ArrayList();
          localPLong.value = 0L;
          localPInt.value = 0;
          ArrayList localArrayList = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e.agb();
          if (localArrayList != null)
          {
            int i = 0;
            while (i < ((a)localObject).getCount())
            {
              if (((a)localObject).iYP.contains(Integer.valueOf(i)))
              {
                paramAnonymousView.add(((com.tencent.mm.plugin.backup.bakoldlogic.a.a)localArrayList.get(i)).iVh);
                localPLong.value += ((com.tencent.mm.plugin.backup.bakoldlogic.a.a)localArrayList.get(i)).iVk;
                localPInt.value = ((int)(localPInt.value + ((com.tencent.mm.plugin.backup.bakoldlogic.a.a)localArrayList.get(i)).iVl));
              }
              i += 1;
            }
          }
          w.i("MicroMsg.BakMoveChooseAdapter", "finishSelected usernameSize:%d, addupSize:%d, convMsgCount:%d", new Object[] { Integer.valueOf(paramAnonymousView.size()), Long.valueOf(localPLong.value), Integer.valueOf(localPInt.value) });
        }
      }
    });
    this.iYV.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        int i = 0;
        GMTrace.i(14796833423360L, 110245);
        if (com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e.age())
        {
          paramAnonymousView = BakMoveChooseUI.a(BakMoveChooseUI.this);
          if (paramAnonymousView.iYP.size() != paramAnonymousView.getCount()) {
            break label73;
          }
          paramAnonymousView.iYP.clear();
        }
        for (BakMoveChooseUI.iYQ = false;; BakMoveChooseUI.iYQ = true)
        {
          paramAnonymousView.notifyDataSetChanged();
          paramAnonymousView.jeO.a(paramAnonymousView.iYP);
          GMTrace.o(14796833423360L, 110245);
          return;
          label73:
          while (i < paramAnonymousView.getCount())
          {
            paramAnonymousView.iYP.add(Integer.valueOf(i));
            i += 1;
          }
        }
      }
    });
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afX().jdZ = this;
    if (!com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e.age())
    {
      this.iYX.setClickable(false);
      this.jeR.setVisibility(8);
      if (com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e.agb().size() == 0)
      {
        this.iZc.setVisibility(0);
        this.jeT.setVisibility(8);
        GMTrace.o(14806362882048L, 110316);
        return;
      }
      this.iZc.setVisibility(4);
      this.jeT.setVisibility(0);
      GMTrace.o(14806362882048L, 110316);
      return;
    }
    if (com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e.agb().size() == 0) {
      this.iYZ.setVisibility(0);
    }
    this.iYU.removeFooterView(this.jeU);
    this.jeT.setVisibility(8);
    this.jeR.setVisibility(0);
    GMTrace.o(14806362882048L, 110316);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(14807033970688L, 110321);
    if (paramInt == 4)
    {
      if (!jeV) {
        finish();
      }
      GMTrace.o(14807033970688L, 110321);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(14807033970688L, 110321);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmoveui\BakMoveChooseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */