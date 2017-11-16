package com.tencent.mm.plugin.backup.backupui;

import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.DatePicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.preference.CheckPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.widget.g;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@a(3)
public class BackupSelectExtUI
  extends MMPreference
{
  private long endTime;
  private f htU;
  private int iVq;
  private long iXm;
  private int iZd;
  private int iZe;
  private SimpleDateFormat iZf;
  private CheckPreference jcP;
  private CheckPreference jcQ;
  private Preference jcR;
  private Preference jcS;
  private boolean jcT;
  private long startTime;
  
  public BackupSelectExtUI()
  {
    GMTrace.i(18459501002752L, 137534);
    this.iZd = 0;
    this.jcT = false;
    this.iZe = 0;
    this.startTime = 0L;
    this.endTime = 0L;
    this.iXm = 0L;
    this.iZf = new SimpleDateFormat("yyyy.MM.dd");
    GMTrace.o(18459501002752L, 137534);
  }
  
  private void ar()
  {
    GMTrace.i(18460306309120L, 137540);
    this.htU.removeAll();
    this.htU.addPreferencesFromResource(R.o.eoo);
    this.jcP = ((CheckPreference)this.htU.VG("backup_select_ext_time"));
    this.jcS = this.htU.VG("backup_select_begin_time");
    this.jcR = this.htU.VG("backup_select_end_time");
    this.jcQ = ((CheckPreference)this.htU.VG("backup_select_ext_content"));
    if (!this.jcT)
    {
      this.htU.c(this.htU.VG("backup_select_ext_content_title"));
      this.htU.c(this.jcQ);
    }
    if (this.iVq == 1)
    {
      this.htU.VG("backup_select_ext_time_title").setTitle(R.l.cXp);
      this.jcP.setTitle(R.l.cXo);
      if (this.jcT)
      {
        this.htU.VG("backup_select_ext_content_title").setTitle(R.l.cXn);
        this.jcQ.setTitle(R.l.cXl);
      }
    }
    label206:
    switch (this.iZd)
    {
    default: 
    case 0: 
      for (;;)
      {
        if (this.jcT) {}
        switch (this.iZe)
        {
        default: 
          label264:
          this.htU.notifyDataSetChanged();
          GMTrace.o(18460306309120L, 137540);
          return;
          if (this.iVq != 2) {
            break label206;
          }
          this.htU.VG("backup_select_ext_time_title").setTitle(R.l.cWq);
          this.jcP.setTitle(R.l.cWp);
          if (!this.jcT) {
            break label206;
          }
          this.htU.VG("backup_select_ext_content_title").setTitle(R.l.cWo);
          this.jcQ.setTitle(R.l.cWm);
          break label206;
          this.jcS.setEnabled(false);
          this.jcR.setEnabled(false);
          this.jcP.sdM = false;
          this.htU.c(this.jcS);
          this.htU.c(this.jcR);
          lf(true);
        }
      }
    }
    if ((this.startTime == 0L) || (this.endTime == 0L))
    {
      this.jcS.setSummary(R.l.cXC);
      this.jcR.setSummary(R.l.cXC);
    }
    label589:
    for (;;)
    {
      BackupSelectExtUI localBackupSelectExtUI = this;
      boolean bool = false;
      for (;;)
      {
        localBackupSelectExtUI.lf(bool);
        this.jcS.setEnabled(true);
        this.jcR.setEnabled(true);
        this.jcP.sdM = true;
        break;
        this.jcS.setSummary(this.iZf.format(new Date(this.startTime)));
        this.jcR.setSummary(this.iZf.format(new Date(this.endTime - 86400000L)));
        if ((this.startTime == 0L) || (this.endTime == 0L)) {
          break label589;
        }
        bool = true;
        localBackupSelectExtUI = this;
      }
      this.jcQ.sdM = false;
      break label264;
      this.jcQ.sdM = true;
      break label264;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(18460172091392L, 137539);
    this.iVq = getIntent().getIntExtra("BACKUP_MODE", 0);
    oM(R.l.cXB);
    this.iZd = getIntent().getIntExtra("BACKUP_SELECT_TIME_MODE", 0);
    this.jcT = getIntent().getBooleanExtra("BACKUP_SELECT_SUPPORT_CONTENT_TYPE", false);
    this.iZe = getIntent().getIntExtra("BACKUP_SELECT_CONTENT_TYPE", 0);
    this.startTime = getIntent().getLongExtra("BACKUP_SELECT_TIME_START_TIME", 0L);
    this.endTime = getIntent().getLongExtra("BACKUP_SELECT_TIME_END_TIME", 0L);
    this.iXm = getIntent().getLongExtra("BACKUP_SELECT_TIME_MIN_CONVERSATION_TIME", 0L);
    ar();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18459366785024L, 137533);
        BackupSelectExtUI.this.finish();
        GMTrace.o(18459366785024L, 137533);
        return true;
      }
    });
    a(0, getString(R.l.cXM), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18462051139584L, 137553);
        if ((BackupSelectExtUI.g(BackupSelectExtUI.this) == 1) && (BackupSelectExtUI.d(BackupSelectExtUI.this) >= BackupSelectExtUI.e(BackupSelectExtUI.this)))
        {
          if (BackupSelectExtUI.h(BackupSelectExtUI.this) == 1) {
            com.tencent.mm.ui.base.h.b(BackupSelectExtUI.this.vKB.vKW, BackupSelectExtUI.this.getString(R.l.cWx), "", true);
          }
          for (;;)
          {
            GMTrace.o(18462051139584L, 137553);
            return true;
            if (BackupSelectExtUI.h(BackupSelectExtUI.this) == 2) {
              com.tencent.mm.ui.base.h.b(BackupSelectExtUI.this.vKB.vKW, BackupSelectExtUI.this.getString(R.l.cVp), "", true);
            }
          }
        }
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("BACKUP_SELECT_TIME_MODE", BackupSelectExtUI.g(BackupSelectExtUI.this));
        paramAnonymousMenuItem.putExtra("BACKUP_SELECT_CONTENT_TYPE", BackupSelectExtUI.i(BackupSelectExtUI.this));
        paramAnonymousMenuItem.putExtra("BACKUP_SELECT_TIME_START_TIME", BackupSelectExtUI.d(BackupSelectExtUI.this));
        paramAnonymousMenuItem.putExtra("BACKUP_SELECT_TIME_END_TIME", BackupSelectExtUI.e(BackupSelectExtUI.this));
        BackupSelectExtUI.this.setResult(-1, paramAnonymousMenuItem);
        BackupSelectExtUI.this.finish();
        GMTrace.o(18462051139584L, 137553);
        return true;
      }
    }, p.b.vLG);
    GMTrace.o(18460172091392L, 137539);
  }
  
  public final int QI()
  {
    GMTrace.i(18459769438208L, 137536);
    int i = R.o.eoo;
    GMTrace.o(18459769438208L, 137536);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(18459903655936L, 137537);
    int i;
    if (paramPreference.hiu.equals("backup_select_ext_time"))
    {
      if (this.iZd == 0)
      {
        i = 1;
        this.iZd = i;
        switch (this.iZd)
        {
        }
      }
      for (;;)
      {
        GMTrace.o(18459903655936L, 137537);
        return true;
        i = 0;
        break;
        this.jcP.sdM = false;
        paramf.c(this.jcS);
        paramf.c(this.jcR);
        lf(true);
        paramf.notifyDataSetChanged();
        continue;
        ar();
      }
    }
    if (paramPreference.hiu.equals("backup_select_ext_content"))
    {
      if (this.jcT)
      {
        if (this.iZe != 0) {
          break label199;
        }
        i = 1;
        this.iZe = i;
        switch (this.iZe)
        {
        }
      }
      for (;;)
      {
        GMTrace.o(18459903655936L, 137537);
        return true;
        label199:
        i = 0;
        break;
        this.jcQ.sdM = false;
        paramf.notifyDataSetChanged();
        continue;
        this.jcQ.sdM = true;
        paramf.notifyDataSetChanged();
      }
    }
    if (paramPreference.hiu.equals("backup_select_begin_time"))
    {
      showDialog(1);
      GMTrace.o(18459903655936L, 137537);
      return true;
    }
    if (paramPreference.hiu.equals("backup_select_end_time"))
    {
      showDialog(2);
      GMTrace.o(18459903655936L, 137537);
      return true;
    }
    GMTrace.o(18459903655936L, 137537);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18459635220480L, 137535);
    super.onCreate(paramBundle);
    this.htU = this.wky;
    MP();
    GMTrace.o(18459635220480L, 137535);
  }
  
  protected Dialog onCreateDialog(final int paramInt)
  {
    GMTrace.i(18460037873664L, 137538);
    Object localObject = Calendar.getInstance();
    switch (paramInt)
    {
    default: 
      int i = ((Calendar)localObject).get(1);
      int j = ((Calendar)localObject).get(2);
      localObject = new g(this.vKB.vKW, new DatePickerDialog.OnDateSetListener()
      {
        public final void onDateSet(DatePicker paramAnonymousDatePicker, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(18459098349568L, 137531);
          paramAnonymousDatePicker = new StringBuffer().append(String.format("%02d", new Object[] { Integer.valueOf(paramAnonymousInt1) })).append(String.format("%02d", new Object[] { Integer.valueOf(paramAnonymousInt2 + 1) })).append(String.format("%02d", new Object[] { Integer.valueOf(paramAnonymousInt3) }));
          switch (paramInt)
          {
          default: 
            GMTrace.o(18459098349568L, 137531);
            return;
          case 1: 
            l = com.tencent.mm.plugin.backup.a.h.tj("000000");
            BackupSelectExtUI.a(BackupSelectExtUI.this, l / 1000L * 1000L);
            BackupSelectExtUI.b(BackupSelectExtUI.this).setSummary(BackupSelectExtUI.a(BackupSelectExtUI.this).format(new Date(l)));
            BackupSelectExtUI.c(BackupSelectExtUI.this).notifyDataSetChanged();
            paramAnonymousDatePicker = BackupSelectExtUI.this;
            if ((BackupSelectExtUI.d(BackupSelectExtUI.this) != 0L) && (BackupSelectExtUI.e(BackupSelectExtUI.this) != 0L)) {}
            for (bool = true;; bool = false)
            {
              paramAnonymousDatePicker.lf(bool);
              GMTrace.o(18459098349568L, 137531);
              return;
            }
          }
          long l = com.tencent.mm.plugin.backup.a.h.tj("000000");
          BackupSelectExtUI.b(BackupSelectExtUI.this, l / 1000L * 1000L + 86400000L);
          BackupSelectExtUI.f(BackupSelectExtUI.this).setSummary(BackupSelectExtUI.a(BackupSelectExtUI.this).format(new Date(l)));
          BackupSelectExtUI.c(BackupSelectExtUI.this).notifyDataSetChanged();
          paramAnonymousDatePicker = BackupSelectExtUI.this;
          if ((BackupSelectExtUI.d(BackupSelectExtUI.this) != 0L) && (BackupSelectExtUI.e(BackupSelectExtUI.this) != 0L)) {}
          for (boolean bool = true;; bool = false)
          {
            paramAnonymousDatePicker.lf(bool);
            break;
          }
        }
      }, i, j, ((Calendar)localObject).get(5), ((Calendar)localObject).getTimeInMillis(), 1);
      ((g)localObject).setCanceledOnTouchOutside(false);
      l = System.currentTimeMillis() / 86400000L * 86400000L + 57600000L - 1L;
      if (l > this.iXm)
      {
        ((g)localObject).getDatePicker().setMaxDate(l);
        l = this.iXm;
        ((g)localObject).getDatePicker().setMinDate(l);
      }
      GMTrace.o(18460037873664L, 137538);
      return (Dialog)localObject;
    case 1: 
      if (this.startTime == 0L) {}
      for (l = System.currentTimeMillis();; l = this.startTime)
      {
        ((Calendar)localObject).setTimeInMillis(l);
        break;
      }
    }
    if (this.endTime == 0L) {}
    for (long l = System.currentTimeMillis();; l = this.endTime - 86400000L)
    {
      ((Calendar)localObject).setTimeInMillis(l);
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backupui\BackupSelectExtUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */