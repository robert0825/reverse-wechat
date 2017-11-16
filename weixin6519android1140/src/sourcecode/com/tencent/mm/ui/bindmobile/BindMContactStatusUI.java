package com.tencent.mm.ui.bindmobile;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.modelfriend.m;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class BindMContactStatusUI
  extends MMWizardActivity
{
  private Button jgH;
  private ImageView vUG;
  private TextView vUH;
  private TextView wnj;
  
  public BindMContactStatusUI()
  {
    GMTrace.i(3146734632960L, 23445);
    GMTrace.o(3146734632960L, 23445);
  }
  
  protected final void MP()
  {
    GMTrace.i(3147137286144L, 23448);
    this.vUG = ((ImageView)findViewById(R.h.bgO));
    this.wnj = ((TextView)findViewById(R.h.bgM));
    this.vUH = ((TextView)findViewById(R.h.bgK));
    this.jgH = ((Button)findViewById(R.h.bgN));
    if (m.Ho() == m.a.gDm)
    {
      this.vUG.setImageResource(R.k.cMX);
      at.AR();
      String str2 = (String)c.xh().get(6, null);
      String str1;
      if (str2 != null)
      {
        str1 = str2;
        if (!str2.equals("")) {}
      }
      else
      {
        at.AR();
        str1 = (String)c.xh().get(4097, null);
      }
      this.vUH.setText(getString(R.l.cZG));
      this.wnj.setText(getString(R.l.daa, new Object[] { str1 }));
    }
    for (;;)
    {
      this.jgH.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(3100832169984L, 23103);
          BindMContactStatusUI.a(BindMContactStatusUI.this);
          GMTrace.o(3100832169984L, 23103);
        }
      });
      GMTrace.o(3147137286144L, 23448);
      return;
      this.vUG.setImageResource(R.k.cMY);
      this.vUH.setText(R.l.cZQ);
      this.wnj.setText(R.l.cZQ);
      this.vUH.setVisibility(8);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(3147003068416L, 23447);
    int i = R.i.cqe;
    GMTrace.o(3147003068416L, 23447);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3146868850688L, 23446);
    super.onCreate(paramBundle);
    oM(R.l.cZJ);
    MP();
    GMTrace.o(3146868850688L, 23446);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(3147271503872L, 23449);
    if (paramInt == 4)
    {
      Bh(1);
      GMTrace.o(3147271503872L, 23449);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(3147271503872L, 23449);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindmobile\BindMContactStatusUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */