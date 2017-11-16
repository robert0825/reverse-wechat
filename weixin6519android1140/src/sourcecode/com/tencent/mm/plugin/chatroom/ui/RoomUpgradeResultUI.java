package com.tencent.mm.plugin.chatroom.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
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
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.l.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

@Deprecated
public class RoomUpgradeResultUI
  extends MMActivity
{
  private String chatroomName;
  private com.tencent.mm.storage.q jNF;
  private Button jPU;
  private View jPV;
  private ImageView jPW;
  private TextView jPX;
  private TextView jPY;
  private TextView jPZ;
  
  public RoomUpgradeResultUI()
  {
    GMTrace.i(9140764147712L, 68104);
    GMTrace.o(9140764147712L, 68104);
  }
  
  private void goBack()
  {
    GMTrace.i(9141569454080L, 68110);
    Intent localIntent = new Intent(this, RoomUpgradeUI.class);
    localIntent.addFlags(67108864);
    localIntent.putExtra("finish_self", true);
    startActivity(localIntent);
    GMTrace.o(9141569454080L, 68110);
  }
  
  private void uS(String paramString)
  {
    GMTrace.i(9141301018624L, 68108);
    at.AR();
    Object localObject = c.yK().TE(paramString);
    if ((localObject != null) && ((int)((a)localObject).fTq > 0))
    {
      localObject = ((x)localObject).vj();
      a.b.a(this.jPW, paramString);
      this.jPX.setVisibility(0);
      this.jPX.setText((CharSequence)localObject);
      GMTrace.o(9141301018624L, 68108);
      return;
    }
    GMTrace.o(9141301018624L, 68108);
  }
  
  protected final void MP()
  {
    GMTrace.i(9141166800896L, 68107);
    oM(R.l.dTS);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9083990048768L, 67681);
        RoomUpgradeResultUI.a(RoomUpgradeResultUI.this);
        GMTrace.o(9083990048768L, 67681);
        return true;
      }
    });
    this.jPV = findViewById(R.h.cjv);
    this.jPW = ((ImageView)findViewById(R.h.cju));
    this.jPX = ((TextView)findViewById(R.h.cjw));
    this.jPY = ((TextView)findViewById(R.h.cjs));
    this.jPZ = ((TextView)findViewById(R.h.cjt));
    this.jPU = ((Button)findViewById(R.h.bGl));
    this.jPU.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9110430941184L, 67878);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("rawUrl", RoomUpgradeResultUI.this.getString(R.l.deR, new Object[] { v.bPK() }));
        paramAnonymousView.putExtra("geta8key_username", com.tencent.mm.y.q.zE());
        d.b(RoomUpgradeResultUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", 0);
        GMTrace.o(9110430941184L, 67878);
      }
    });
    this.jPU.setVisibility(0);
    final String str = this.jNF.field_roomowner;
    at.AR();
    x localx = c.yK().TE(str);
    if ((localx != null) && ((int)localx.fTq <= 0)) {
      ak.a.gmX.a(str, this.chatroomName, new ak.b.a()
      {
        public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
        {
          GMTrace.i(9136066527232L, 68069);
          if (paramAnonymousBoolean) {
            RoomUpgradeResultUI.b(RoomUpgradeResultUI.this).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(9159286194176L, 68242);
                RoomUpgradeResultUI.a(RoomUpgradeResultUI.this, RoomUpgradeResultUI.3.this.jQb);
                GMTrace.o(9159286194176L, 68242);
              }
            });
          }
          GMTrace.o(9136066527232L, 68069);
        }
      });
    }
    for (;;)
    {
      int i = this.jNF.bSs();
      this.jPY.setVisibility(0);
      this.jPY.setText(getString(R.l.dUa, new Object[] { Integer.valueOf(i) }));
      this.jPU.setText(R.l.dTV);
      this.jPZ.setVisibility(8);
      GMTrace.o(9141166800896L, 68107);
      return;
      uS(str);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9141703671808L, 68111);
    int i = R.i.crO;
    GMTrace.o(9141703671808L, 68111);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9140898365440L, 68105);
    super.onCreate(paramBundle);
    this.chatroomName = getIntent().getStringExtra("chatroom");
    w.i("MicroMsg.RoomUpgradeResultUI", "the roomName is %s", new Object[] { this.chatroomName });
    at.AR();
    this.jNF = c.yT().gC(this.chatroomName);
    if (this.jNF == null) {
      goBack();
    }
    MP();
    GMTrace.o(9140898365440L, 68105);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9141032583168L, 68106);
    super.onDestroy();
    GMTrace.o(9141032583168L, 68106);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(9141435236352L, 68109);
    if (paramInt == 4)
    {
      goBack();
      GMTrace.o(9141435236352L, 68109);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(9141435236352L, 68109);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\RoomUpgradeResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */