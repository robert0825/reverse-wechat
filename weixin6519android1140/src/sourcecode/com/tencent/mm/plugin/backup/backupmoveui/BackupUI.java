package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.backup.c.a.1;
import com.tencent.mm.plugin.backup.c.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class BackupUI
  extends MMWizardActivity
{
  private Button iZC;
  private TextView iZp;
  
  public BackupUI()
  {
    GMTrace.i(9577105981440L, 71355);
    GMTrace.o(9577105981440L, 71355);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9577508634624L, 71358);
    int i = R.i.cpJ;
    GMTrace.o(9577508634624L, 71358);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9577240199168L, 71356);
    super.onCreate(paramBundle);
    oM(R.l.cJE);
    this.iZC = ((Button)findViewById(R.h.bfM));
    this.iZp = ((TextView)findViewById(R.h.bfL));
    b.aeH();
    paramBundle = b.aen().edit();
    paramBundle.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
    paramBundle.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
    paramBundle.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
    paramBundle.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
    paramBundle.commit();
    if (!b.aeH().aeL().iXq)
    {
      paramBundle = b.aeH().aeL();
      com.tencent.mm.plugin.backup.g.a.afG().afJ();
      e.post(new a.1(paramBundle), "BakMoveChooseServer.calculateToChoose");
    }
    for (;;)
    {
      this.iZC.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9587843399680L, 71435);
          at.AR();
          if (((Boolean)c.xh().get(w.a.vvU, Boolean.valueOf(false))).booleanValue())
          {
            paramAnonymousView = new Intent().setClassName(ab.getContext(), "com.tencent.mm.ui.LauncherUI");
            paramAnonymousView.addFlags(335544320);
            paramAnonymousView.putExtra("nofification_type", "backup_move_notification");
            ab.getContext().startActivity(paramAnonymousView);
            GMTrace.o(9587843399680L, 71435);
            return;
          }
          final int i = com.tencent.mm.plugin.backup.a.h.aes();
          if (i < 50)
          {
            com.tencent.mm.ui.base.h.a(BackupUI.this, R.l.cVB, R.l.cVA, R.l.cXE, R.l.cVi, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(9594420068352L, 71484);
                w.i("MicroMsg.BackupUI", "low battery, user click sure. battery:%d", new Object[] { Integer.valueOf(i) });
                g.ork.a(485L, 21L, 1L, false);
                paramAnonymous2DialogInterface = new Intent(BackupUI.this, BackupMoveChooseUI.class);
                MMWizardActivity.A(BackupUI.this, paramAnonymous2DialogInterface);
                GMTrace.o(9594420068352L, 71484);
              }
            }, null, R.e.aMR);
            GMTrace.o(9587843399680L, 71435);
            return;
          }
          g.ork.a(485L, 21L, 1L, false);
          paramAnonymousView = new Intent(BackupUI.this, BackupMoveChooseUI.class);
          MMWizardActivity.A(BackupUI.this, paramAnonymousView);
          GMTrace.o(9587843399680L, 71435);
        }
      });
      this.iZp.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9581937819648L, 71391);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("title", BackupUI.this.getString(R.l.cWz));
          paramAnonymousView.putExtra("rawUrl", BackupUI.this.getString(R.l.cXx, new Object[] { v.bPK() }));
          paramAnonymousView.putExtra("showShare", false);
          paramAnonymousView.putExtra("neverGetA8Key", true);
          d.b(BackupUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          GMTrace.o(9581937819648L, 71391);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(9578045505536L, 71362);
          BackupUI.this.finish();
          GMTrace.o(9578045505536L, 71362);
          return true;
        }
      });
      GMTrace.o(9577240199168L, 71356);
      return;
      b.aeH().aeL().aeF();
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(9577374416896L, 71357);
    w.d("MicroMsg.BackupUI", "BackupUI onDestroy.");
    super.onDestroy();
    b.aeH().aeL().cancel();
    b.aeH().aeL().aeE();
    GMTrace.o(9577374416896L, 71357);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backupmoveui\BackupUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */