package com.tencent.mm.plugin.backup.backupmoveui;

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
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.b.b.b;
import com.tencent.mm.plugin.backup.backupui.BackupSelectExtUI;
import com.tencent.mm.plugin.backup.c.a.2;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class BackupMoveChooseUI
  extends MMWizardActivity
  implements b.b
{
  private static long endTime;
  private static int iZd;
  private static int iZe;
  private static long startTime;
  private a iYT;
  private ListView iYU;
  private View iYV;
  private TextView iYW;
  private CheckBox iYX;
  private TextView iYY;
  private TextView iYZ;
  private RelativeLayout iZa;
  private TextView iZb;
  private ProgressBar iZc;
  private SimpleDateFormat iZf;
  
  static
  {
    GMTrace.i(9593077891072L, 71474);
    iZd = 0;
    iZe = 0;
    GMTrace.o(9593077891072L, 71474);
  }
  
  public BackupMoveChooseUI()
  {
    GMTrace.i(9591869931520L, 71465);
    this.iYT = new a(this);
    this.iZf = new SimpleDateFormat("yyyy.MM.dd");
    GMTrace.o(9591869931520L, 71465);
  }
  
  private void db(boolean paramBoolean)
  {
    GMTrace.i(18454132293632L, 137494);
    if (paramBoolean)
    {
      com.tencent.mm.plugin.backup.c.b.aeH();
      localObject = com.tencent.mm.plugin.backup.c.b.aen();
      iZd = ((SharedPreferences)localObject).getInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
      iZe = ((SharedPreferences)localObject).getInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
      startTime = ((SharedPreferences)localObject).getLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
      endTime = ((SharedPreferences)localObject).getLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
    }
    TextView localTextView;
    StringBuilder localStringBuilder;
    switch (iZd)
    {
    default: 
      if (iZe == 1)
      {
        localTextView = this.iZb;
        localStringBuilder = new StringBuilder().append(this.iZb.getText());
        if (iZd != 1) {
          break label255;
        }
      }
      break;
    }
    label255:
    for (Object localObject = ";";; localObject = "")
    {
      localTextView.setText((String)localObject + this.vKB.vKW.getResources().getString(R.l.cWn));
      GMTrace.o(18454132293632L, 137494);
      return;
      this.iZb.setText("");
      break;
      this.iZb.setText(this.iZf.format(new Date(startTime)) + "~" + this.iZf.format(new Date(endTime - 86400000L)));
      break;
    }
  }
  
  public final void MP()
  {
    GMTrace.i(9592138366976L, 71467);
    oM(R.l.cXD);
    this.iYU = ((ListView)findViewById(R.h.bfz));
    this.iYU.setAdapter(this.iYT);
    this.iYU.setEmptyView(findViewById(R.h.bfB));
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
        GMTrace.i(9589185576960L, 71445);
        BackupMoveChooseUI.this.finish();
        GMTrace.o(9589185576960L, 71445);
        return false;
      }
    });
    a(0, getString(R.l.cXM), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18456682430464L, 137513);
        Object localObject1 = new PLong();
        Object localObject2 = new PInt();
        a locala = BackupMoveChooseUI.a(BackupMoveChooseUI.this);
        paramAnonymousMenuItem = new LinkedList();
        if (locala.iYP.size() <= 0)
        {
          localObject1 = h.t(paramAnonymousMenuItem);
          localObject2 = com.tencent.mm.plugin.backup.c.b.aeH().aeL();
          if (paramAnonymousMenuItem.size() != 0) {
            break label562;
          }
          ((com.tencent.mm.plugin.backup.c.a)localObject2).iXp = new LinkedList();
          label85:
          paramAnonymousMenuItem = com.tencent.mm.plugin.backup.c.b.aeH().aeJ();
          paramAnonymousMenuItem.iYn = ((LinkedList)localObject1);
          com.tencent.mm.plugin.backup.c.b.aeH();
          if (com.tencent.mm.plugin.backup.c.b.aen().getInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0) != 1) {
            break label615;
          }
          com.tencent.mm.plugin.backup.c.d.iYu = true;
          label120:
          com.tencent.mm.plugin.backup.c.b.aeH();
          paramAnonymousMenuItem.iYq = com.tencent.mm.plugin.backup.c.b.aen().getLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
          com.tencent.mm.plugin.backup.c.b.aeH();
          paramAnonymousMenuItem.iYr = com.tencent.mm.plugin.backup.c.b.aen().getLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
          com.tencent.mm.plugin.backup.c.b.aeH();
          if (com.tencent.mm.plugin.backup.c.b.aen().getInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0) != 1) {
            break label622;
          }
        }
        label562:
        label615:
        label622:
        for (com.tencent.mm.plugin.backup.c.d.iWT = true;; com.tencent.mm.plugin.backup.c.d.iWT = false)
        {
          w.i("MicroMsg.BackupMoveServer", "setBakupChooseData users size[%d], selectStartTime[%d], selectEndTime[%d], isQuickBackup[%b]", new Object[] { Integer.valueOf(((LinkedList)localObject1).size()), Long.valueOf(paramAnonymousMenuItem.iYq), Long.valueOf(paramAnonymousMenuItem.iYr), Boolean.valueOf(com.tencent.mm.plugin.backup.c.d.iWT) });
          at.AR();
          c.xh().a(w.a.vvT, Boolean.valueOf(true));
          paramAnonymousMenuItem = com.tencent.mm.plugin.backup.c.b.aeH().aeL();
          if (paramAnonymousMenuItem.iXk != null) {
            paramAnonymousMenuItem.iXk.cancel();
          }
          e.post(new a.2(paramAnonymousMenuItem), "BakMoveChooseServer.calculateChooseConvSize");
          BackupMoveChooseUI.a(BackupMoveChooseUI.this);
          if (a.Hj()) {
            g.ork.a(485L, 22L, 1L, false);
          }
          if (BackupMoveChooseUI.aeX() == 1) {
            g.ork.a(485L, 26L, 1L, false);
          }
          if (BackupMoveChooseUI.aeY() == 1) {
            g.ork.a(485L, 27L, 1L, false);
          }
          paramAnonymousMenuItem = new Intent(BackupMoveChooseUI.this, BackupMoveQRCodeUI.class);
          MMWizardActivity.A(BackupMoveChooseUI.this, paramAnonymousMenuItem);
          g.ork.a(485L, 23L, 1L, false);
          GMTrace.o(18456682430464L, 137513);
          return true;
          ((PLong)localObject1).value = 0L;
          ((PInt)localObject2).value = 0;
          LinkedList localLinkedList = com.tencent.mm.plugin.backup.c.b.aeH().aeL().aeC();
          if (localLinkedList != null)
          {
            int i = 0;
            while (i < locala.getCount())
            {
              if (locala.iYP.contains(Integer.valueOf(i)))
              {
                paramAnonymousMenuItem.add(localLinkedList.get(i));
                ((PLong)localObject1).value += ((com.tencent.mm.plugin.backup.a.d)localLinkedList.get(i)).iVk;
                ((PInt)localObject2).value = ((int)(((PInt)localObject2).value + ((com.tencent.mm.plugin.backup.a.d)localLinkedList.get(i)).iVl));
              }
              i += 1;
            }
          }
          w.i("MicroMsg.BackupMoveChooseAdapter", "finishSelected usernameSize:%d, convSize:%d, convMsgCount:%d", new Object[] { Integer.valueOf(paramAnonymousMenuItem.size()), Long.valueOf(((PLong)localObject1).value), Integer.valueOf(((PInt)localObject2).value) });
          break;
          ((com.tencent.mm.plugin.backup.c.a)localObject2).iXp = new LinkedList(paramAnonymousMenuItem.subList(paramAnonymousMenuItem.size() * 3 / 4, paramAnonymousMenuItem.size()));
          ((com.tencent.mm.plugin.backup.c.a)localObject2).iXp.addAll(paramAnonymousMenuItem.subList(0, paramAnonymousMenuItem.size() * 3 / 4));
          break label85;
          com.tencent.mm.plugin.backup.c.d.iYu = false;
          break label120;
        }
      }
    }, p.b.vLG);
    lf(false);
    db(true);
    this.iZa.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9585561698304L, 71418);
        paramAnonymousView = new Intent(BackupMoveChooseUI.this, BackupSelectExtUI.class);
        paramAnonymousView.putExtra("BACKUP_MODE", 2);
        paramAnonymousView.putExtra("BACKUP_SELECT_TIME_MODE", BackupMoveChooseUI.aeX());
        paramAnonymousView.putExtra("BACKUP_SELECT_SUPPORT_CONTENT_TYPE", true);
        paramAnonymousView.putExtra("BACKUP_SELECT_CONTENT_TYPE", BackupMoveChooseUI.aeY());
        paramAnonymousView.putExtra("BACKUP_SELECT_TIME_START_TIME", BackupMoveChooseUI.aeZ());
        paramAnonymousView.putExtra("BACKUP_SELECT_TIME_END_TIME", BackupMoveChooseUI.afa());
        paramAnonymousView.putExtra("BACKUP_SELECT_TIME_MIN_CONVERSATION_TIME", com.tencent.mm.plugin.backup.c.b.aeH().aeL().iXm);
        BackupMoveChooseUI.this.startActivityForResult(paramAnonymousView, 0);
        GMTrace.o(9585561698304L, 71418);
      }
    });
    this.iYV.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        int i = 0;
        GMTrace.i(18456950865920L, 137515);
        if (com.tencent.mm.plugin.backup.c.b.aeH().aeL().iXq)
        {
          paramAnonymousView = BackupMoveChooseUI.a(BackupMoveChooseUI.this);
          if (paramAnonymousView.iYP.size() != paramAnonymousView.getCount()) {
            break label79;
          }
          paramAnonymousView.iYP.clear();
        }
        for (a.iYQ = false;; a.iYQ = true)
        {
          paramAnonymousView.notifyDataSetChanged();
          paramAnonymousView.iYO.a(paramAnonymousView.iYP);
          GMTrace.o(18456950865920L, 137515);
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
    if (com.tencent.mm.plugin.backup.c.b.aeH().aeL().iXq)
    {
      if ((com.tencent.mm.plugin.backup.c.b.aeH().aeL().aeC() == null) || (com.tencent.mm.plugin.backup.c.b.aeH().aeL().aeC().size() == 0)) {
        switch (iZd)
        {
        }
      }
      for (;;)
      {
        this.iYZ.setVisibility(0);
        this.iZc.setVisibility(4);
        GMTrace.o(9592138366976L, 71467);
        return;
        this.iYZ.setText(R.l.cVo);
        continue;
        this.iYZ.setText(R.l.cXA);
      }
    }
    if (!com.tencent.mm.plugin.backup.c.b.aeH().aeL().iXq)
    {
      this.iYX.setClickable(false);
      this.iYX.setVisibility(4);
      this.iYY.setVisibility(4);
      this.iZc.setVisibility(0);
      GMTrace.o(9592138366976L, 71467);
      return;
    }
    this.iZc.setVisibility(4);
    GMTrace.o(9592138366976L, 71467);
  }
  
  public final void a(HashSet<Integer> paramHashSet)
  {
    GMTrace.i(9592272584704L, 71468);
    Object localObject = com.tencent.mm.plugin.backup.c.b.aeH().aeL().aeC();
    if (localObject == null)
    {
      w.e("MicroMsg.BackupMoveChooseUI", "onClickCheckBox convInfo is null.");
      GMTrace.o(9592272584704L, 71468);
      return;
    }
    HashSet localHashSet = new HashSet();
    Iterator localIterator = paramHashSet.iterator();
    long l = 0L;
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if (i < ((LinkedList)localObject).size()) {
        l = ((com.tencent.mm.plugin.backup.a.d)((LinkedList)localObject).get(i)).iVk + l;
      } else {
        localHashSet.add(Integer.valueOf(i));
      }
    }
    localObject = localHashSet.iterator();
    while (((Iterator)localObject).hasNext()) {
      paramHashSet.remove((Integer)((Iterator)localObject).next());
    }
    if ((paramHashSet.size() != 0) || (l > 0L))
    {
      lf(true);
      if (paramHashSet.size() == this.iYT.getCount()) {
        this.iYX.setChecked(true);
      }
      for (;;)
      {
        this.iYW.setText(getString(R.l.cVj, new Object[] { Integer.valueOf(paramHashSet.size()) }));
        GMTrace.o(9592272584704L, 71468);
        return;
        this.iYX.setChecked(false);
      }
    }
    lf(false);
    this.iYX.setChecked(false);
    this.iYW.setText("");
    GMTrace.o(9592272584704L, 71468);
  }
  
  public final void a(LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList, com.tencent.mm.plugin.backup.a.d paramd, int paramInt)
  {
    GMTrace.i(18454400729088L, 137496);
    GMTrace.o(18454400729088L, 137496);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9592406802432L, 71469);
    int i = R.i.cpF;
    GMTrace.o(9592406802432L, 71469);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(18454266511360L, 137495);
    if (paramInt2 != -1)
    {
      w.e("MicroMsg.BackupMoveChooseUI", "onActivityResult result error! resultCode:%d", new Object[] { Integer.valueOf(paramInt2) });
      GMTrace.o(18454266511360L, 137495);
      return;
    }
    paramInt1 = iZd;
    long l1 = startTime;
    long l2 = endTime;
    iZd = paramIntent.getIntExtra("BACKUP_SELECT_TIME_MODE", iZd);
    startTime = paramIntent.getLongExtra("BACKUP_SELECT_TIME_START_TIME", 0L);
    endTime = paramIntent.getLongExtra("BACKUP_SELECT_TIME_END_TIME", 0L);
    iZe = paramIntent.getIntExtra("BACKUP_SELECT_CONTENT_TYPE", iZe);
    w.i("MicroMsg.BackupMoveChooseUI", "onActivityResult timeMode/preTimeMode[%d/%d], startTime/preStartTime[%d/%d], endTime/preEndTime[%d/%d], contentType[%d]", new Object[] { Integer.valueOf(iZd), Integer.valueOf(paramInt1), Long.valueOf(startTime), Long.valueOf(l1), Long.valueOf(endTime), Long.valueOf(l2), Integer.valueOf(iZe) });
    com.tencent.mm.plugin.backup.c.b.aeH().aeJ();
    com.tencent.mm.plugin.backup.c.d.c(iZd, startTime, endTime, iZe);
    db(false);
    if ((paramInt1 == iZd) && ((iZd == 0) || ((iZd == 1) && (startTime == l1) && (endTime == l2))))
    {
      GMTrace.o(18454266511360L, 137495);
      return;
    }
    com.tencent.mm.plugin.backup.c.b.aeH().aeL().a(iZd, startTime, endTime, com.tencent.mm.plugin.backup.c.b.aeH().aeL().aeB());
    paramIntent = this.iYT;
    paramIntent.iYP.clear();
    paramIntent.iYO.a(paramIntent.iYP);
    if ((com.tencent.mm.plugin.backup.c.b.aeH().aeL().aeC() == null) || (com.tencent.mm.plugin.backup.c.b.aeH().aeL().aeC().size() == 0)) {
      switch (iZd)
      {
      default: 
        this.iYZ.setVisibility(0);
      }
    }
    for (;;)
    {
      this.iYT.notifyDataSetChanged();
      GMTrace.o(18454266511360L, 137495);
      return;
      this.iYZ.setText(R.l.cVo);
      break;
      this.iYZ.setText(R.l.cXA);
      break;
      this.iYZ.setVisibility(4);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9592004149248L, 71466);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(9592004149248L, 71466);
  }
  
  public void onStart()
  {
    GMTrace.i(18453863858176L, 137492);
    super.onStart();
    com.tencent.mm.plugin.backup.c.b.aeH().aeL().iXl = this;
    GMTrace.o(18453863858176L, 137492);
  }
  
  public void onStop()
  {
    GMTrace.i(18453998075904L, 137493);
    super.onStop();
    com.tencent.mm.plugin.backup.c.b.aeH().aeL().iXl = null;
    GMTrace.o(18453998075904L, 137493);
  }
  
  public final void u(LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList)
  {
    GMTrace.i(9592541020160L, 71470);
    if (paramLinkedList == null)
    {
      GMTrace.o(9592541020160L, 71470);
      return;
    }
    if (paramLinkedList.size() == 0)
    {
      this.iZc.setVisibility(8);
      this.iYZ.setVisibility(0);
      switch (iZd)
      {
      }
      for (;;)
      {
        GMTrace.o(9592541020160L, 71470);
        return;
        this.iYZ.setText(R.l.cVo);
        GMTrace.o(9592541020160L, 71470);
        return;
        this.iYZ.setText(R.l.cXA);
      }
    }
    this.iYX.setClickable(true);
    this.iYX.setVisibility(0);
    this.iYY.setVisibility(0);
    this.iZc.setVisibility(8);
    this.iYT.notifyDataSetChanged();
    GMTrace.o(9592541020160L, 71470);
  }
  
  public final void v(LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList)
  {
    GMTrace.i(9592809455616L, 71472);
    GMTrace.o(9592809455616L, 71472);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backupmoveui\BackupMoveChooseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */