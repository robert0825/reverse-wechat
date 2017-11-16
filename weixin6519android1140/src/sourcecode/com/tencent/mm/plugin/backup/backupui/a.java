package com.tencent.mm.plugin.backup.backupui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.a.b.a;
import com.tencent.mm.plugin.backup.a.e;
import com.tencent.mm.plugin.backup.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;
import java.lang.ref.WeakReference;

public final class a
  extends com.tencent.mm.pluginsdk.ui.b.b
{
  public static String TAG;
  private View jcL;
  private b.a jcM;
  
  static
  {
    GMTrace.i(14863136980992L, 110739);
    TAG = "MicroMsg.BackupChatBanner";
    GMTrace.o(14863136980992L, 110739);
  }
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14861794803712L, 110729);
    this.jcL = null;
    this.jcM = new a(this);
    w.i(TAG, "BackupChatBanner");
    com.tencent.mm.plugin.backup.backuppcmodel.b.afh().aei().iVu = -100;
    com.tencent.mm.plugin.backup.c.b.aeH().aei().iVu = -100;
    w.i(TAG, "initialize");
    if (this.view != null)
    {
      this.jcL = this.view.findViewById(R.h.bge);
      this.jcL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14861660585984L, 110728);
          int i = e.ael();
          w.i(a.TAG, "backupbanner onclick, backupMode[%d]", new Object[] { Integer.valueOf(i) });
          switch (i)
          {
          }
          for (;;)
          {
            GMTrace.o(14861660585984L, 110728);
            return;
            i = com.tencent.mm.plugin.backup.backuppcmodel.b.afh().aei().iVu;
            w.i(a.TAG, "backupbanner onclick, backupPcState[%d]", new Object[] { Integer.valueOf(i) });
            switch (i)
            {
            default: 
              w.i(a.TAG, "click backup banner, BackupPcState[%d]", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.backuppcmodel.b.afh().aei().iVu) });
              GMTrace.o(14861660585984L, 110728);
              return;
            case -4: 
            case 12: 
            case 14: 
            case 15: 
            case 22: 
            case 23: 
              w.i(a.TAG, "click backup banner skipToBackupPcUI,BackupPcState[%d]", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.backuppcmodel.b.afh().aei().iVu) });
              a.this.dg(false);
              GMTrace.o(14861660585984L, 110728);
              return;
            }
            w.i(a.TAG, "click backup banner skipToBackupPcUI,BackupPcState[%d]", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.backuppcmodel.b.afh().aei().iVu) });
            a.this.dg(true);
            GMTrace.o(14861660585984L, 110728);
            return;
            i = com.tencent.mm.plugin.backup.c.b.aeH().aei().iVu;
            w.i(a.TAG, "backupbanner onclick, backupMoveState[%d]", new Object[] { Integer.valueOf(i) });
            switch (i)
            {
            default: 
              w.i(a.TAG, "click backup banner,backupMoveState[%d]", new Object[] { Integer.valueOf(i) });
            }
          }
          w.i(a.TAG, "click backup banner skipToBackupMoveRecoverUI, backupMoveState[%d]", new Object[] { Integer.valueOf(i) });
          a.this.dh(false);
          GMTrace.o(14861660585984L, 110728);
          return;
          w.i(a.TAG, "click backup banner skipToBackupMoveRecoverUI, backupMoveState[%d]", new Object[] { Integer.valueOf(i) });
          a.this.dh(true);
          GMTrace.o(14861660585984L, 110728);
        }
      });
    }
    abd();
    com.tencent.mm.plugin.backup.backuppcmodel.b.afh().afj().jaB = this.jcM;
    com.tencent.mm.plugin.backup.backuppcmodel.b.afh().afk().jaB = this.jcM;
    com.tencent.mm.plugin.backup.c.b.aeH().aeK().iXF = this.jcM;
    GMTrace.o(14861794803712L, 110729);
  }
  
  public final boolean abd()
  {
    GMTrace.i(14862331674624L, 110733);
    int i = e.ael();
    w.d(TAG, "refreshAndReturnIsVisible, backupMode[%d]", new Object[] { Integer.valueOf(i) });
    TextView localTextView;
    Context localContext;
    int j;
    int k;
    switch (i)
    {
    default: 
      this.jcL.setVisibility(8);
      GMTrace.o(14862331674624L, 110733);
      return false;
    case 1: 
      localf = com.tencent.mm.plugin.backup.backuppcmodel.b.afh().aei();
      w.i(TAG, "refreshPcState backupPcState[%d]", new Object[] { Integer.valueOf(localf.iVu) });
      switch (localf.iVu)
      {
      default: 
        this.jcL.setVisibility(8);
        GMTrace.o(14862331674624L, 110733);
        return false;
      case 12: 
      case 22: 
        this.jcL.setVisibility(0);
        if ((1 == com.tencent.mm.plugin.backup.backuppcmodel.b.afh().afi().jas) || (3 == com.tencent.mm.plugin.backup.backuppcmodel.b.afh().afi().jas)) {
          ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cJM);
        }
        for (;;)
        {
          ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cWX));
          GMTrace.o(14862331674624L, 110733);
          return true;
          if ((2 == com.tencent.mm.plugin.backup.backuppcmodel.b.afh().afi().jas) || (4 == com.tencent.mm.plugin.backup.backuppcmodel.b.afh().afi().jas)) {
            ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cJQ);
          }
        }
      case 14: 
        this.jcL.setVisibility(0);
        ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cJM);
        localTextView = (TextView)this.view.findViewById(R.h.bgg);
        localContext = ab.getContext();
        i = R.l.cXy;
        j = localf.iVv;
        k = localf.iVw;
        com.tencent.mm.plugin.backup.backuppcmodel.b.afh().afi();
        localTextView.setText(localContext.getString(i, new Object[] { Integer.valueOf(j), Integer.valueOf(k), com.tencent.mm.plugin.backup.backuppcmodel.c.afn() }));
        GMTrace.o(14862331674624L, 110733);
        return true;
      case 15: 
        this.jcL.setVisibility(0);
        ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cJM);
        ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cWu));
        GMTrace.o(14862331674624L, 110733);
        return true;
      case 23: 
        this.jcL.setVisibility(0);
        ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cJQ);
        localTextView = (TextView)this.view.findViewById(R.h.bgg);
        localContext = ab.getContext();
        i = R.l.cXh;
        j = localf.iVv;
        k = localf.iVw;
        com.tencent.mm.plugin.backup.backuppcmodel.b.afh().afi();
        localTextView.setText(localContext.getString(i, new Object[] { Integer.valueOf(j), Integer.valueOf(k), com.tencent.mm.plugin.backup.backuppcmodel.c.afn() }));
        GMTrace.o(14862331674624L, 110733);
        return true;
      case 25: 
        this.jcL.setVisibility(0);
        ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cJQ);
        ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cXj));
        GMTrace.o(14862331674624L, 110733);
        return true;
      case 24: 
        dg(true);
        GMTrace.o(14862331674624L, 110733);
        return true;
      case -4: 
        this.jcL.setVisibility(0);
        if ((1 == com.tencent.mm.plugin.backup.backuppcmodel.b.afh().afi().jas) || (3 == com.tencent.mm.plugin.backup.backuppcmodel.b.afh().afi().jas))
        {
          ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cJM);
          ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cWE));
        }
        for (;;)
        {
          GMTrace.o(14862331674624L, 110733);
          return true;
          if ((2 == com.tencent.mm.plugin.backup.backuppcmodel.b.afh().afi().jas) || (4 == com.tencent.mm.plugin.backup.backuppcmodel.b.afh().afi().jas))
          {
            ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cJQ);
            ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cWF));
          }
        }
      }
      this.jcL.setVisibility(8);
      if (bg.bx((Context)this.tyb.get())) {
        dg(true);
      }
      GMTrace.o(14862331674624L, 110733);
      return true;
    }
    f localf = com.tencent.mm.plugin.backup.c.b.aeH().aei();
    w.i(TAG, "refreshMoveRecoverState backupMoveState[%d]", new Object[] { Integer.valueOf(localf.iVu) });
    switch (localf.iVu)
    {
    default: 
      this.jcL.setVisibility(8);
      GMTrace.o(14862331674624L, 110733);
      return false;
    case 22: 
      this.jcL.setVisibility(0);
      ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cJF);
      ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cWd));
      GMTrace.o(14862331674624L, 110733);
      return true;
    case 23: 
      this.jcL.setVisibility(0);
      ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cJF);
      localTextView = (TextView)this.view.findViewById(R.h.bgg);
      localContext = ab.getContext();
      i = R.l.cWi;
      j = com.tencent.mm.plugin.backup.c.b.aeH().aei().iVv;
      k = localf.iVw;
      com.tencent.mm.plugin.backup.c.b.aeH().aeK();
      localTextView.setText(localContext.getString(i, new Object[] { Integer.valueOf(j), Integer.valueOf(k), com.tencent.mm.plugin.backup.c.c.aeP() }));
      GMTrace.o(14862331674624L, 110733);
      return true;
    case 25: 
      this.jcL.setVisibility(0);
      ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cJF);
      ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cWk));
      GMTrace.o(14862331674624L, 110733);
      return true;
    case 24: 
      if (bg.bx((Context)this.tyb.get())) {
        dh(true);
      }
      GMTrace.o(14862331674624L, 110733);
      return true;
    case -4: 
      this.jcL.setVisibility(0);
      ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cJF);
      ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cVv));
      GMTrace.o(14862331674624L, 110733);
      return true;
    }
    this.jcL.setVisibility(8);
    if (bg.bx((Context)this.tyb.get())) {
      dh(true);
    }
    GMTrace.o(14862331674624L, 110733);
    return true;
  }
  
  public final void destroy()
  {
    GMTrace.i(14862465892352L, 110734);
    GMTrace.o(14862465892352L, 110734);
  }
  
  public final void dg(boolean paramBoolean)
  {
    GMTrace.i(14862063239168L, 110731);
    w.i(TAG, "jumpToBackupPcUI");
    Intent localIntent = new Intent().setClassName((Context)this.tyb.get(), "com.tencent.mm.plugin.backup.backuppcui.BackupPcUI");
    localIntent.putExtra("isRecoverTransferFinishFromBanner", paramBoolean);
    MMWizardActivity.A((Context)this.tyb.get(), localIntent);
    GMTrace.o(14862063239168L, 110731);
  }
  
  public final void dh(boolean paramBoolean)
  {
    GMTrace.i(14862197456896L, 110732);
    w.i(TAG, "jumpToBackupMoveRecoverUI, isRecoverTransferFinishFromBanner[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
    Intent localIntent = new Intent().setClassName((Context)this.tyb.get(), "com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI");
    localIntent.putExtra("isRecoverTransferFinishFromBanner", paramBoolean);
    MMWizardActivity.A((Context)this.tyb.get(), localIntent);
    GMTrace.o(14862197456896L, 110732);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14861929021440L, 110730);
    int i = R.i.bge;
    GMTrace.o(14861929021440L, 110730);
    return i;
  }
  
  public final int getOrder()
  {
    GMTrace.i(17264963223552L, 128634);
    GMTrace.o(17264963223552L, 128634);
    return 3;
  }
  
  private static final class a
    implements b.a
  {
    private final WeakReference<a> jcO;
    
    a(a parama)
    {
      GMTrace.i(18458695696384L, 137528);
      this.jcO = new WeakReference(parama);
      GMTrace.o(18458695696384L, 137528);
    }
    
    public final void aed()
    {
      GMTrace.i(18458829914112L, 137529);
      a locala = (a)this.jcO.get();
      if (locala != null)
      {
        locala.abd();
        GMTrace.o(18458829914112L, 137529);
        return;
      }
      w.e(a.TAG, "BackupChatBanner WeakReference is null!");
      GMTrace.o(18458829914112L, 137529);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backupui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */