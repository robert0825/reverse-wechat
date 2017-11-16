package com.tencent.mm.plugin.nearby.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.bc.h;
import com.tencent.mm.bc.i;
import com.tencent.mm.bc.l;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.MMActivity;

public class NearbyFriendShowSayHiUI
  extends MMActivity
{
  ImageView hqG;
  String ntR;
  View ntS;
  
  public NearbyFriendShowSayHiUI()
  {
    GMTrace.i(6694377619456L, 49877);
    this.ntR = "";
    this.ntS = null;
    GMTrace.o(6694377619456L, 49877);
  }
  
  protected final void MP()
  {
    GMTrace.i(6695048708096L, 49882);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6707799392256L, 49977);
        NearbyFriendShowSayHiUI.this.aLo();
        NearbyFriendShowSayHiUI.this.finish();
        GMTrace.o(6707799392256L, 49977);
        return true;
      }
    });
    ((Button)findViewById(R.h.bPH)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6687800950784L, 49828);
        NearbyFriendShowSayHiUI.this.startActivity(new Intent(NearbyFriendShowSayHiUI.this, NearbyFriendsUI.class));
        GMTrace.o(6687800950784L, 49828);
      }
    });
    this.ntS = findViewById(R.h.bFw);
    this.ntS.setVisibility(0);
    this.ntS.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6693438095360L, 49870);
        paramAnonymousView = new Intent(NearbyFriendShowSayHiUI.this, NearbySayHiListUI.class);
        paramAnonymousView.putExtra("k_say_hi_type", 2);
        paramAnonymousView.putExtra("show_clear_header", true);
        NearbyFriendShowSayHiUI.this.startActivityForResult(paramAnonymousView, 2009);
        GMTrace.o(6693438095360L, 49870);
      }
    });
    GMTrace.o(6695048708096L, 49882);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6694914490368L, 49881);
    int i = R.i.cCS;
    GMTrace.o(6694914490368L, 49881);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6695182925824L, 49883);
    if ((paramInt1 == 2009) && (paramInt2 == -1)) {
      finish();
    }
    GMTrace.o(6695182925824L, 49883);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6694511837184L, 49878);
    super.onCreate(paramBundle);
    oM(R.l.dKU);
    MP();
    GMTrace.o(6694511837184L, 49878);
  }
  
  public void onPause()
  {
    GMTrace.i(6694780272640L, 49880);
    super.onPause();
    GMTrace.o(6694780272640L, 49880);
  }
  
  protected void onResume()
  {
    GMTrace.i(6694646054912L, 49879);
    super.onResume();
    Object localObject = (TextView)findViewById(R.h.bZr);
    int i = l.MM().ME();
    if (i == 0)
    {
      this.ntS.setVisibility(4);
      GMTrace.o(6694646054912L, 49879);
      return;
    }
    ((TextView)localObject).setText(getResources().getQuantityString(R.j.cIC, i, new Object[] { Integer.valueOf(i) }));
    this.hqG = ((ImageView)findViewById(R.h.bMx));
    localObject = l.MM().MF();
    if (localObject != null)
    {
      this.ntR = ((h)localObject).field_sayhiuser;
      a.b.a(this.hqG, this.ntR);
    }
    GMTrace.o(6694646054912L, 49879);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\ui\NearbyFriendShowSayHiUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */