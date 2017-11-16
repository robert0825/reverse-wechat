package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.bakoldlogic.a.c;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;

public class BakConnErrorUI
  extends MMWizardActivity
{
  private int jgu;
  
  public BakConnErrorUI()
  {
    GMTrace.i(14768379265024L, 110033);
    GMTrace.o(14768379265024L, 110033);
  }
  
  protected final void MP()
  {
    GMTrace.i(14768781918208L, 110036);
    oM(R.l.cYc);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14774553280512L, 110079);
        BakConnErrorUI.a(BakConnErrorUI.this);
        GMTrace.o(14774553280512L, 110079);
        return true;
      }
    });
    GMTrace.o(14768781918208L, 110036);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14768513482752L, 110034);
    int i = R.i.cpR;
    GMTrace.o(14768513482752L, 110034);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14768647700480L, 110035);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      GMTrace.o(14768647700480L, 110035);
      return;
    }
    this.jgu = getIntent().getIntExtra("cmd", -1);
    w.i("MicroMsg.BakFinishUI", "BakConnErrorUI onCreate nowCmd:%d", new Object[] { Integer.valueOf(this.jgu) });
    MP();
    a.agk().agl().jfR = c.jdg;
    GMTrace.o(14768647700480L, 110035);
  }
  
  public void onDestroy()
  {
    GMTrace.i(14768916135936L, 110037);
    super.onDestroy();
    a.agk().agl().jfK = null;
    w.i("MicroMsg.BakFinishUI", "BakConnErrorUI onDestroy nowCmd:%d", new Object[] { Integer.valueOf(this.jgu) });
    GMTrace.o(14768916135936L, 110037);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(14769050353664L, 110038);
    if (paramInt == 4)
    {
      Bh(1);
      GMTrace.o(14769050353664L, 110038);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(14769050353664L, 110038);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcui\BakConnErrorUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */