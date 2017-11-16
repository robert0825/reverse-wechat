package com.tencent.mm.plugin.nearby.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bk;
import com.tencent.mm.y.c;

public class NearbyFriendsIntroUI
  extends MMActivity
{
  private Button jgH;
  private View ntL;
  private CheckBox ntM;
  private i ntO;
  
  public NearbyFriendsIntroUI()
  {
    GMTrace.i(6685787684864L, 49813);
    this.ntO = null;
    GMTrace.o(6685787684864L, 49813);
  }
  
  protected final void MP()
  {
    GMTrace.i(6686190338048L, 49816);
    this.ntL = View.inflate(this, R.i.cAI, null);
    this.ntM = ((CheckBox)this.ntL.findViewById(R.h.bJR));
    this.ntM.setChecked(false);
    this.jgH = ((Button)findViewById(R.h.bPH));
    this.jgH.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6702028029952L, 49934);
        if (NearbyFriendsIntroUI.a(NearbyFriendsIntroUI.this) == null)
        {
          NearbyFriendsIntroUI.a(NearbyFriendsIntroUI.this, h.a(NearbyFriendsIntroUI.this.vKB.vKW, NearbyFriendsIntroUI.this.getString(R.l.cUG), NearbyFriendsIntroUI.b(NearbyFriendsIntroUI.this), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              boolean bool = true;
              GMTrace.i(6708067827712L, 49979);
              at.AR();
              c.xh().set(4103, Boolean.valueOf(true));
              at.AR();
              paramAnonymous2DialogInterface = c.xh();
              if (!NearbyFriendsIntroUI.c(NearbyFriendsIntroUI.this).isChecked())
              {
                paramAnonymous2DialogInterface.set(4104, Boolean.valueOf(bool));
                paramAnonymous2DialogInterface = bk.BF();
                if (paramAnonymous2DialogInterface != null) {
                  break label120;
                }
                NearbyFriendsIntroUI.this.startActivity(new Intent(NearbyFriendsIntroUI.this, NearbyPersonalInfoUI.class));
              }
              for (;;)
              {
                NearbyFriendsIntroUI.this.finish();
                GMTrace.o(6708067827712L, 49979);
                return;
                bool = false;
                break;
                label120:
                String str = bg.nl(paramAnonymous2DialogInterface.getProvince());
                bg.nl(paramAnonymous2DialogInterface.getCity());
                paramAnonymous2Int = bg.a(Integer.valueOf(paramAnonymous2DialogInterface.fja), 0);
                if ((str.equals("")) || (paramAnonymous2Int == 0)) {
                  NearbyFriendsIntroUI.this.startActivity(new Intent(NearbyFriendsIntroUI.this, NearbyPersonalInfoUI.class));
                } else {
                  NearbyFriendsIntroUI.this.startActivity(new Intent(NearbyFriendsIntroUI.this, NearbyFriendsUI.class));
                }
              }
            }
          }, null));
          GMTrace.o(6702028029952L, 49934);
          return;
        }
        NearbyFriendsIntroUI.a(NearbyFriendsIntroUI.this).show();
        GMTrace.o(6702028029952L, 49934);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6685653467136L, 49812);
        NearbyFriendsIntroUI.this.aLo();
        NearbyFriendsIntroUI.this.finish();
        GMTrace.o(6685653467136L, 49812);
        return true;
      }
    });
    GMTrace.o(6686190338048L, 49816);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6686056120320L, 49815);
    int i = R.i.cCQ;
    GMTrace.o(6686056120320L, 49815);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6685921902592L, 49814);
    super.onCreate(paramBundle);
    oM(R.l.dKU);
    MP();
    GMTrace.o(6685921902592L, 49814);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\ui\NearbyFriendsIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */