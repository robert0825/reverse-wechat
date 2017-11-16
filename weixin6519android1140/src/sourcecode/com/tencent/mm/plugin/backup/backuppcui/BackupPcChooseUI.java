package com.tencent.mm.plugin.backup.backuppcui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.a.d;
import com.tencent.mm.plugin.backup.b.b.a;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.e;
import com.tencent.mm.plugin.backup.backupui.BackupSelectExtUI;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.at;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public class BackupPcChooseUI
  extends MMWizardActivity
{
  private static long endTime;
  private static int iZd;
  private static int iZe;
  private static long startTime;
  private View iYV;
  private TextView iYW;
  private CheckBox iYX;
  private TextView iYY;
  private TextView iYZ;
  private RelativeLayout iZa;
  private TextView iZb;
  private ProgressBar iZc;
  private SimpleDateFormat iZf;
  private a jaS;
  private ListView jaT;
  private b.a jaU;
  
  static
  {
    GMTrace.i(14845017587712L, 110604);
    iZd = 0;
    iZe = 0;
    GMTrace.o(14845017587712L, 110604);
  }
  
  public BackupPcChooseUI()
  {
    GMTrace.i(9571066183680L, 71310);
    this.jaS = new a(this);
    this.iZf = new SimpleDateFormat("yyyy.MM.dd");
    this.jaU = new b.a()
    {
      public final void u(LinkedList<d> paramAnonymousLinkedList)
      {
        GMTrace.i(18445408141312L, 137429);
        if (paramAnonymousLinkedList == null)
        {
          GMTrace.o(18445408141312L, 137429);
          return;
        }
        if (paramAnonymousLinkedList.size() == 0)
        {
          BackupPcChooseUI.b(BackupPcChooseUI.this).setVisibility(8);
          BackupPcChooseUI.c(BackupPcChooseUI.this).setVisibility(0);
          switch (BackupPcChooseUI.aeX())
          {
          }
          for (;;)
          {
            GMTrace.o(18445408141312L, 137429);
            return;
            BackupPcChooseUI.c(BackupPcChooseUI.this).setText(R.l.cWw);
            GMTrace.o(18445408141312L, 137429);
            return;
            BackupPcChooseUI.c(BackupPcChooseUI.this).setText(R.l.cXA);
          }
        }
        BackupPcChooseUI.d(BackupPcChooseUI.this).setClickable(true);
        BackupPcChooseUI.b(BackupPcChooseUI.this).setVisibility(4);
        BackupPcChooseUI.a(BackupPcChooseUI.this).notifyDataSetChanged();
        GMTrace.o(18445408141312L, 137429);
      }
    };
    GMTrace.o(9571066183680L, 71310);
  }
  
  private void dd(boolean paramBoolean)
  {
    GMTrace.i(18442723786752L, 137409);
    if (paramBoolean)
    {
      b.afh();
      localObject = b.aen();
      iZd = ((SharedPreferences)localObject).getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
      iZe = ((SharedPreferences)localObject).getInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
      startTime = ((SharedPreferences)localObject).getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
      endTime = ((SharedPreferences)localObject).getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
    }
    if (b.afh().afj().jaH) {}
    TextView localTextView;
    StringBuilder localStringBuilder;
    switch (iZd)
    {
    default: 
      if ((b.afh().afj().jaI) && (iZe == 1))
      {
        localTextView = this.iZb;
        localStringBuilder = new StringBuilder().append(this.iZb.getText());
        if (iZd != 1) {
          break label279;
        }
      }
      break;
    }
    label279:
    for (Object localObject = ";";; localObject = "")
    {
      localTextView.setText((String)localObject + this.vKB.vKW.getResources().getString(R.l.cXm));
      GMTrace.o(18442723786752L, 137409);
      return;
      this.iZb.setText("");
      break;
      this.iZb.setText(this.iZf.format(new Date(startTime)) + "~" + this.iZf.format(new Date(endTime - 86400000L)));
      break;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(9571334619136L, 71312);
    oM(R.l.cXr);
    this.jaT = ((ListView)findViewById(R.h.bfz));
    this.jaT.setAdapter(this.jaS);
    this.jaT.setEmptyView(findViewById(R.h.bfB));
    this.iYV = findViewById(R.h.bfG);
    this.iYW = ((TextView)findViewById(R.h.bfI));
    this.iYX = ((CheckBox)findViewById(R.h.bfF));
    this.iYY = ((TextView)findViewById(R.h.bfH));
    this.iYZ = ((TextView)findViewById(R.h.bfA));
    this.iZc = ((ProgressBar)findViewById(R.h.bfE));
    this.iZa = ((RelativeLayout)findViewById(R.h.bfD));
    this.iZb = ((TextView)findViewById(R.h.bfC));
    if (!v.bPG())
    {
      this.iYW.setTextSize(1, 14.0F);
      this.iYY.setTextSize(1, 14.0F);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9560462983168L, 71231);
        BackupPcChooseUI.this.finish();
        GMTrace.o(9560462983168L, 71231);
        return false;
      }
    });
    a(0, getString(R.l.cXM), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14840454184960L, 110570);
        final Object localObject = BackupPcChooseUI.a(BackupPcChooseUI.this);
        paramAnonymousMenuItem = new LinkedList();
        if (((a)localObject).iYP.size() <= 0) {}
        for (;;)
        {
          localObject = com.tencent.mm.plugin.backup.a.h.t(paramAnonymousMenuItem);
          at.AR();
          boolean bool = ((Boolean)com.tencent.mm.y.c.xh().get(w.a.vvW, Boolean.valueOf(false))).booleanValue();
          w.i("MicroMsg.BackupPcChooseUI", "initView OnMenuItemClickListener startbackup choose records finish, selectedConversation size[%d], hasMove[%b]", new Object[] { Integer.valueOf(paramAnonymousMenuItem.size()), Boolean.valueOf(bool) });
          if (!bool) {
            break;
          }
          com.tencent.mm.ui.base.h.a(BackupPcChooseUI.this, R.l.cWT, 0, R.l.cXE, 0, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(9566771216384L, 71278);
              b.afh().afl().z(paramAnonymousMenuItem);
              b.afh().afi();
              com.tencent.mm.plugin.backup.backuppcmodel.c.kA(2);
              b.afh().aei().iVu = 12;
              b.afh().afj().A(localObject);
              b.afh().afj().aQ(paramAnonymousMenuItem.size());
              g.ork.a(400L, 8L, 1L, false);
              g.ork.i(13735, new Object[] { Integer.valueOf(10), Integer.valueOf(b.afh().afi().jaw) });
              if ((BackupPcChooseUI.aeX() == 1) && (BackupPcChooseUI.aeY() == 1))
              {
                g.ork.a(400L, 32L, 1L, false);
                g.ork.a(400L, 35L, 1L, false);
                g.ork.i(13735, new Object[] { Integer.valueOf(13), Integer.valueOf(b.afh().afi().jaw) });
              }
              for (;;)
              {
                BackupPcChooseUI.this.finish();
                GMTrace.o(9566771216384L, 71278);
                return;
                if (BackupPcChooseUI.aeX() == 1)
                {
                  g.ork.a(400L, 32L, 1L, false);
                  g.ork.i(13735, new Object[] { Integer.valueOf(11), Integer.valueOf(b.afh().afi().jaw) });
                }
                else if (BackupPcChooseUI.aeY() == 1)
                {
                  g.ork.a(400L, 35L, 1L, false);
                  g.ork.i(13735, new Object[] { Integer.valueOf(12), Integer.valueOf(b.afh().afi().jaw) });
                }
              }
            }
          }, null, R.e.aMR);
          GMTrace.o(14840454184960L, 110570);
          return true;
          LinkedList localLinkedList = b.afh().afl().aeC();
          if (localLinkedList != null)
          {
            int i = 0;
            while (i < ((a)localObject).getCount())
            {
              if (((a)localObject).iYP.contains(Integer.valueOf(i))) {
                paramAnonymousMenuItem.add(localLinkedList.get(i));
              }
              i += 1;
            }
          }
          w.i("MicroMsg.BackupPcChooseAdapter", "finishSelected usernameSize:%d", new Object[] { Integer.valueOf(paramAnonymousMenuItem.size()) });
        }
        b.afh().afl().z(paramAnonymousMenuItem);
        b.afh().afi();
        com.tencent.mm.plugin.backup.backuppcmodel.c.kA(2);
        b.afh().aei().iVu = 12;
        b.afh().afj().A((LinkedList)localObject);
        b.afh().afj().aQ(paramAnonymousMenuItem.size());
        g.ork.a(400L, 8L, 1L, false);
        g.ork.i(13735, new Object[] { Integer.valueOf(10), Integer.valueOf(b.afh().afi().jaw) });
        if ((BackupPcChooseUI.aeX() == 1) && (BackupPcChooseUI.aeY() == 1))
        {
          g.ork.a(400L, 32L, 1L, false);
          g.ork.a(400L, 35L, 1L, false);
          g.ork.i(13735, new Object[] { Integer.valueOf(13), Integer.valueOf(b.afh().afi().jaw) });
        }
        for (;;)
        {
          BackupPcChooseUI.this.finish();
          break;
          if (BackupPcChooseUI.aeX() == 1)
          {
            g.ork.a(400L, 32L, 1L, false);
            g.ork.i(13735, new Object[] { Integer.valueOf(11), Integer.valueOf(b.afh().afi().jaw) });
          }
          else if (BackupPcChooseUI.aeY() == 1)
          {
            g.ork.a(400L, 35L, 1L, false);
            g.ork.i(13735, new Object[] { Integer.valueOf(12), Integer.valueOf(b.afh().afi().jaw) });
          }
        }
      }
    }, p.b.vLG);
    lf(false);
    if ((!b.afh().afj().jaH) && (!b.afh().afj().jaI)) {
      this.iZa.setVisibility(8);
    }
    for (;;)
    {
      this.iYV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          int i = 0;
          GMTrace.i(14839648878592L, 110564);
          if (b.afh().afl().iXq)
          {
            paramAnonymousView = BackupPcChooseUI.a(BackupPcChooseUI.this);
            if (paramAnonymousView.iYP.size() != paramAnonymousView.getCount()) {
              break label79;
            }
            paramAnonymousView.iYP.clear();
          }
          for (a.iYQ = false;; a.iYQ = true)
          {
            paramAnonymousView.notifyDataSetChanged();
            paramAnonymousView.jaQ.a(paramAnonymousView.iYP);
            GMTrace.o(14839648878592L, 110564);
            return;
            label79:
            while (i < paramAnonymousView.getCount())
            {
              paramAnonymousView.iYP.add(Integer.valueOf(i));
              i += 1;
            }
          }
        }
      });
      if (b.afh().afl().iXq) {
        break;
      }
      this.iYX.setClickable(false);
      this.iZc.setVisibility(0);
      GMTrace.o(9571334619136L, 71312);
      return;
      this.iZa.setVisibility(0);
      dd(true);
      this.iZa.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9572139925504L, 71318);
          paramAnonymousView = new Intent(BackupPcChooseUI.this, BackupSelectExtUI.class);
          paramAnonymousView.putExtra("BACKUP_MODE", 1);
          paramAnonymousView.putExtra("BACKUP_SELECT_TIME_MODE", BackupPcChooseUI.aeX());
          paramAnonymousView.putExtra("BACKUP_SELECT_SUPPORT_CONTENT_TYPE", b.afh().afj().jaI);
          paramAnonymousView.putExtra("BACKUP_SELECT_CONTENT_TYPE", BackupPcChooseUI.aeY());
          paramAnonymousView.putExtra("BACKUP_SELECT_TIME_START_TIME", BackupPcChooseUI.aeZ());
          paramAnonymousView.putExtra("BACKUP_SELECT_TIME_END_TIME", BackupPcChooseUI.afa());
          paramAnonymousView.putExtra("BACKUP_SELECT_TIME_MIN_CONVERSATION_TIME", b.afh().afl().iXm);
          BackupPcChooseUI.this.startActivityForResult(paramAnonymousView, 0);
          GMTrace.o(9572139925504L, 71318);
        }
      });
    }
    if (b.afh().afl().aeC().size() == 0) {
      switch (iZd)
      {
      }
    }
    for (;;)
    {
      this.iYZ.setVisibility(0);
      GMTrace.o(9571334619136L, 71312);
      return;
      this.iYZ.setText(R.l.cWw);
      continue;
      this.iYZ.setText(R.l.cXA);
    }
  }
  
  public final void a(HashSet<Integer> paramHashSet)
  {
    GMTrace.i(9571468836864L, 71313);
    Object localObject = new HashSet();
    int i = b.afh().afl().aeC().size();
    Iterator localIterator = paramHashSet.iterator();
    while (localIterator.hasNext())
    {
      int j = ((Integer)localIterator.next()).intValue();
      if (j >= i) {
        ((HashSet)localObject).add(Integer.valueOf(j));
      }
    }
    localObject = ((HashSet)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramHashSet.remove(Integer.valueOf(((Integer)((Iterator)localObject).next()).intValue()));
    }
    if (paramHashSet.size() != 0)
    {
      lf(true);
      if ((b.afh().afl().iXq) && (paramHashSet.size() == this.jaS.getCount())) {
        this.iYX.setChecked(true);
      }
      for (;;)
      {
        this.iYW.setText(getString(R.l.cVj, new Object[] { Integer.valueOf(paramHashSet.size()) }));
        GMTrace.o(9571468836864L, 71313);
        return;
        this.iYX.setChecked(false);
      }
    }
    lf(false);
    this.iYX.setChecked(false);
    this.iYW.setText("");
    GMTrace.o(9571468836864L, 71313);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9571603054592L, 71314);
    int i = R.i.cpF;
    GMTrace.o(9571603054592L, 71314);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(14844480716800L, 110600);
    if (paramInt2 != -1)
    {
      w.e("MicroMsg.BackupPcChooseUI", "onActivityResult result error! resultCode[%d]", new Object[] { Integer.valueOf(paramInt2) });
      GMTrace.o(14844480716800L, 110600);
      return;
    }
    paramInt1 = iZd;
    long l1 = startTime;
    long l2 = endTime;
    iZd = paramIntent.getIntExtra("BACKUP_SELECT_TIME_MODE", iZd);
    startTime = paramIntent.getLongExtra("BACKUP_SELECT_TIME_START_TIME", 0L);
    endTime = paramIntent.getLongExtra("BACKUP_SELECT_TIME_END_TIME", 0L);
    iZe = paramIntent.getIntExtra("BACKUP_SELECT_CONTENT_TYPE", iZe);
    w.i("MicroMsg.BackupPcChooseUI", "onActivityResult timeMode/preTimeMode[%d/%d], startTime/preStartTime[%d/%d], endTime/preEndTime[%d/%d], contentType[%d]", new Object[] { Integer.valueOf(iZd), Integer.valueOf(paramInt1), Long.valueOf(startTime), Long.valueOf(l1), Long.valueOf(endTime), Long.valueOf(l2), Integer.valueOf(iZe) });
    b.afh().afj();
    e.d(iZd, startTime, endTime, iZe);
    dd(false);
    if ((paramInt1 == iZd) && ((iZd == 0) || ((iZd == 1) && (startTime == l1) && (endTime == l2))))
    {
      GMTrace.o(14844480716800L, 110600);
      return;
    }
    b.afh().afl().a(iZd, startTime, endTime, b.afh().afl().aeB());
    paramIntent = this.jaS;
    paramIntent.iYP.clear();
    paramIntent.jaQ.a(paramIntent.iYP);
    if ((b.afh().afl().aeC() == null) || (b.afh().afl().aeC().size() == 0)) {
      switch (iZd)
      {
      default: 
        this.iYZ.setVisibility(0);
      }
    }
    for (;;)
    {
      this.jaS.notifyDataSetChanged();
      GMTrace.o(14844480716800L, 110600);
      return;
      this.iYZ.setText(R.l.cWw);
      break;
      this.iYZ.setText(R.l.cXA);
      break;
      this.iYZ.setVisibility(4);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9571200401408L, 71311);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      GMTrace.o(9571200401408L, 71311);
      return;
    }
    MP();
    GMTrace.o(9571200401408L, 71311);
  }
  
  public void onStart()
  {
    GMTrace.i(18442455351296L, 137407);
    super.onStart();
    b.afh().afl().jak = this.jaU;
    GMTrace.o(18442455351296L, 137407);
  }
  
  public void onStop()
  {
    GMTrace.i(18442589569024L, 137408);
    super.onStop();
    b.afh().afl().jak = null;
    GMTrace.o(18442589569024L, 137408);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backuppcui\BackupPcChooseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */