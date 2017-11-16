package com.tencent.mm.plugin.subapp.ui.autoadd;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class AutoAddFriendUI
  extends MMActivity
{
  private MMSwitchBtn qsF;
  private TextView qsG;
  private MMSwitchBtn qsH;
  private SparseIntArray qsI;
  private int status;
  
  public AutoAddFriendUI()
  {
    GMTrace.i(5794447753216L, 43172);
    this.qsF = null;
    this.qsG = null;
    this.qsH = null;
    this.qsI = new SparseIntArray();
    GMTrace.o(5794447753216L, 43172);
  }
  
  private static int brG()
  {
    GMTrace.i(5795118841856L, 43177);
    String str2 = g.ut().getValue("AutoAddFriendShow");
    String str1 = str2;
    if (bg.nm(str2)) {
      str1 = "0";
    }
    try
    {
      i = bg.getInt(str1, 0);
      w.d("MicroMsg.AutoAddFriendUI", "getAutoAddDynamicConfig, autoAdd = %d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(5795118841856L, 43177);
      return i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i = 0;
      }
    }
  }
  
  private boolean sJ(int paramInt)
  {
    GMTrace.i(5794716188672L, 43174);
    if ((this.status & paramInt) != 0)
    {
      GMTrace.o(5794716188672L, 43174);
      return true;
    }
    GMTrace.o(5794716188672L, 43174);
    return false;
  }
  
  protected final void MP()
  {
    GMTrace.i(5794984624128L, 43176);
    this.qsF = ((MMSwitchBtn)findViewById(R.h.bPV));
    this.qsG = ((TextView)findViewById(R.h.bfg));
    this.qsH = ((MMSwitchBtn)findViewById(R.h.bff));
    boolean bool = sJ(32);
    this.qsF.mK(bool);
    if (brG() == 1)
    {
      this.qsH.mK(sJ(2097152));
      this.qsH.xrE = new MMSwitchBtn.a()
      {
        public final void cc(boolean paramAnonymousBoolean)
        {
          GMTrace.i(5794313535488L, 43171);
          AutoAddFriendUI.a(AutoAddFriendUI.this, paramAnonymousBoolean, 2097152, 32);
          GMTrace.o(5794313535488L, 43171);
        }
      };
    }
    for (;;)
    {
      this.qsF.xrE = new MMSwitchBtn.a()
      {
        public final void cc(boolean paramAnonymousBoolean)
        {
          GMTrace.i(5794045100032L, 43169);
          AutoAddFriendUI.a(AutoAddFriendUI.this, paramAnonymousBoolean, 32, 4);
          GMTrace.o(5794045100032L, 43169);
        }
      };
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(5793776664576L, 43167);
          AutoAddFriendUI.this.finish();
          GMTrace.o(5793776664576L, 43167);
          return true;
        }
      });
      GMTrace.o(5794984624128L, 43176);
      return;
      this.qsG.setVisibility(8);
      this.qsH.setVisibility(8);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5794850406400L, 43175);
    int i = R.i.cpA;
    GMTrace.o(5794850406400L, 43175);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5794581970944L, 43173);
    super.onCreate(paramBundle);
    oM(R.l.cVe);
    this.status = q.zI();
    MP();
    GMTrace.o(5794581970944L, 43173);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5795521495040L, 43180);
    super.onDestroy();
    GMTrace.o(5795521495040L, 43180);
  }
  
  protected void onPause()
  {
    GMTrace.i(5795387277312L, 43179);
    super.onPause();
    at.AR();
    c.xh().set(7, Integer.valueOf(this.status));
    int i = 0;
    while (i < this.qsI.size())
    {
      int j = this.qsI.keyAt(i);
      int k = this.qsI.valueAt(i);
      uu localuu = new uu();
      localuu.umY = j;
      localuu.umZ = k;
      at.AR();
      c.yJ().b(new e.a(23, localuu));
      w.d("MicroMsg.AutoAddFriendUI", "switch  " + j + " " + k);
      i += 1;
    }
    this.qsI.clear();
    GMTrace.o(5795387277312L, 43179);
  }
  
  protected void onResume()
  {
    GMTrace.i(5795253059584L, 43178);
    super.onResume();
    GMTrace.o(5795253059584L, 43178);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\autoadd\AutoAddFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */