package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.lg;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.aor;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;

public class ModRemarkRoomNameUI
  extends MMActivity
  implements c.a
{
  private r hua;
  private String jNA;
  private boolean jNN;
  private com.tencent.mm.sdk.b.c jNR;
  private String jOU;
  private MMEditText jOV;
  private e.b jOW;
  
  public ModRemarkRoomNameUI()
  {
    GMTrace.i(9081439911936L, 67662);
    this.jOU = "";
    this.hua = null;
    this.jNN = false;
    this.jNR = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(9081439911936L, 67662);
  }
  
  protected final void MP()
  {
    GMTrace.i(9081708347392L, 67664);
    oM(R.l.dSs);
    this.jOV = ((MMEditText)findViewById(R.h.bOh));
    final Object localObject = bg.nl(getIntent().getStringExtra("room_name"));
    if (bg.nm((String)localObject))
    {
      ae localae = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT();
      this.jOV.setHint(com.tencent.mm.pluginsdk.ui.d.h.b(this, localae.fs(this.jNA), this.jOV.getTextSize()));
      this.jOV.setEllipsize(TextUtils.TruncateAt.END);
    }
    for (;;)
    {
      this.jOV.setSelection(this.jOV.getText().length());
      this.jOV.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(9090432499712L, 67729);
          GMTrace.o(9090432499712L, 67729);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(9090298281984L, 67728);
          GMTrace.o(9090298281984L, 67728);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(9090164064256L, 67727);
          if (!localObject.equals(paramAnonymousCharSequence)) {
            ModRemarkRoomNameUI.this.lf(true);
          }
          if (paramAnonymousCharSequence.length() > 0)
          {
            ModRemarkRoomNameUI.e(ModRemarkRoomNameUI.this).setEllipsize(null);
            GMTrace.o(9090164064256L, 67727);
            return;
          }
          ModRemarkRoomNameUI.e(ModRemarkRoomNameUI.this).setEllipsize(TextUtils.TruncateAt.END);
          GMTrace.o(9090164064256L, 67727);
        }
      });
      localObject = com.tencent.mm.ui.tools.a.c.d(this.jOV).eE(1, 32);
      ((com.tencent.mm.ui.tools.a.c)localObject).xkl = false;
      ((com.tencent.mm.ui.tools.a.c)localObject).a(null);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(9090700935168L, 67731);
          ModRemarkRoomNameUI.this.setResult(0);
          ModRemarkRoomNameUI.this.finish();
          GMTrace.o(9090700935168L, 67731);
          return true;
        }
      });
      a(0, getString(R.l.cUp), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(9080500387840L, 67655);
          ModRemarkRoomNameUI.this.aLo();
          paramAnonymousMenuItem = com.tencent.mm.k.b.ud();
          if ((!bg.nm(paramAnonymousMenuItem)) && ("".matches(".*[" + paramAnonymousMenuItem + "].*")))
          {
            com.tencent.mm.ui.base.h.b(ModRemarkRoomNameUI.this.vKB.vKW, ModRemarkRoomNameUI.this.getString(R.l.dDl, new Object[] { paramAnonymousMenuItem }), ModRemarkRoomNameUI.this.getString(R.l.cUG), true);
            GMTrace.o(9080500387840L, 67655);
            return false;
          }
          com.tencent.mm.ui.tools.a.c.d(ModRemarkRoomNameUI.e(ModRemarkRoomNameUI.this)).eE(1, 32).a(ModRemarkRoomNameUI.this);
          GMTrace.o(9080500387840L, 67655);
          return true;
        }
      }, p.b.vLG);
      lf(false);
      GMTrace.o(9081708347392L, 67664);
      return;
      this.jOV.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, (CharSequence)localObject, this.jOV.getTextSize()));
    }
  }
  
  public final void acJ()
  {
    GMTrace.i(9082379436032L, 67669);
    com.tencent.mm.ui.base.h.h(this, R.l.dZr, R.l.dZt);
    GMTrace.o(9082379436032L, 67669);
  }
  
  public final void ack()
  {
    GMTrace.i(9082513653760L, 67670);
    com.tencent.mm.ui.base.h.h(this, R.l.dZs, R.l.dZt);
    GMTrace.o(9082513653760L, 67670);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9082111000576L, 67667);
    int i = R.i.cCx;
    GMTrace.o(9082111000576L, 67667);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9081574129664L, 67663);
    super.onCreate(paramBundle);
    this.jNA = getIntent().getStringExtra("RoomInfo_Id");
    com.tencent.mm.sdk.b.a.vgX.b(this.jNR);
    MP();
    GMTrace.o(9081574129664L, 67663);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9081976782848L, 67666);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.vgX.c(this.jNR);
    GMTrace.o(9081976782848L, 67666);
  }
  
  protected void onPause()
  {
    GMTrace.i(9081842565120L, 67665);
    super.onPause();
    GMTrace.o(9081842565120L, 67665);
  }
  
  public final void sT(String paramString)
  {
    GMTrace.i(9082245218304L, 67668);
    this.jOU = paramString;
    Object localObject = this.vKB.vKW;
    getString(R.l.cUG);
    this.hua = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.diV), false, null);
    localObject = new aor();
    ((aor)localObject).tPF = new azq().Rq(bg.nl(this.jNA));
    ((aor)localObject).uEn = new azq().Rq(bg.nl(paramString));
    this.jOW = new e.a(27, (com.tencent.mm.bm.a)localObject);
    this.jNN = true;
    at.AR();
    com.tencent.mm.y.c.yJ().b(this.jOW);
    GMTrace.o(9082245218304L, 67668);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\ModRemarkRoomNameUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */