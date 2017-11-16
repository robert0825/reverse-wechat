package com.tencent.mm.plugin.webwx.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.jj;
import com.tencent.mm.g.a.jj.a;
import com.tencent.mm.g.a.jk;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.protocal.c.sj;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

@com.tencent.mm.ui.base.a(3)
public class ExtDeviceWXLoginUI
  extends MMActivity
  implements e
{
  private boolean eNg;
  private String eTj;
  private int gUu;
  private ProgressDialog msk;
  private boolean rZB;
  private String rZJ;
  private int rZK;
  private int rZL;
  private boolean rZM;
  private Button rZN;
  private TextView rZO;
  private int type;
  
  public ExtDeviceWXLoginUI()
  {
    GMTrace.i(7666248187904L, 57118);
    this.type = 0;
    this.eTj = null;
    this.rZJ = null;
    this.msk = null;
    this.rZM = false;
    this.rZB = false;
    this.eNg = false;
    this.gUu = 0;
    GMTrace.o(7666248187904L, 57118);
  }
  
  protected final void MP()
  {
    GMTrace.i(7666650841088L, 57121);
    this.eTj = getIntent().getStringExtra("intent.key.login.url");
    this.type = getIntent().getIntExtra("intent.key.type", 0);
    Object localObject2 = getIntent().getStringExtra("intent.key.title.string");
    this.gUu = getIntent().getIntExtra("intent.key.icon.type", 0);
    String str1 = getIntent().getStringExtra("intent.key.ok.string");
    String str2 = getIntent().getStringExtra("intent.key.cancel.string");
    Object localObject1 = getIntent().getStringExtra("intent.key.content.string");
    this.rZJ = getIntent().getStringExtra("intent.key.ok.session.list");
    this.rZK = getIntent().getIntExtra("intent.key.login.client.version", 0);
    this.rZL = getIntent().getIntExtra("intent.key.function.control", 0);
    w.i("MicroMsg.ExtDeviceWXLoginUI", "type:%s title:%s ok:%s content:%s", new Object[] { Integer.valueOf(this.type), localObject2, str1, localObject1 });
    sq("");
    if (!bg.nm((String)localObject2)) {
      ((TextView)findViewById(R.h.cfS)).setText((CharSequence)localObject2);
    }
    localObject2 = new jj();
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
    int i = ((jj)localObject2).eMZ.eNa;
    int j = ((jj)localObject2).eMZ.eNb;
    int k = ((jj)localObject2).eMZ.eNc;
    switch (this.gUu)
    {
    default: 
      at.AR();
      c.xh().a(w.a.vvP, Integer.valueOf(0));
      if (!bg.nm((String)localObject1))
      {
        ((CheckBox)findViewById(R.h.cfK)).setVisibility(8);
        ((TextView)findViewById(R.h.cfJ)).setVisibility(0);
        ((TextView)findViewById(R.h.cfJ)).setText((CharSequence)localObject1);
        label349:
        localObject1 = (ImageView)findViewById(R.h.cfN);
        if (this.gUu == 1) {
          break label911;
        }
        if (this.gUu != 2) {
          break label873;
        }
        ((ImageView)localObject1).setImageResource(R.k.cLA);
        label385:
        this.rZO = ((TextView)findViewById(R.h.coa));
        this.rZO.setText(str2);
        this.rZO.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7672287985664L, 57163);
            ExtDeviceWXLoginUI.a(ExtDeviceWXLoginUI.this);
            GMTrace.o(7672287985664L, 57163);
          }
        });
        this.rZN = ((Button)findViewById(R.h.cnX));
        if (bg.nm(str1)) {
          break label978;
        }
        this.rZN.setText(str1);
        if (this.type != 0) {
          break label922;
        }
        this.rZN.setEnabled(true);
      }
      break;
    }
    for (;;)
    {
      this.rZN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7662087438336L, 57087);
          if (ExtDeviceWXLoginUI.b(ExtDeviceWXLoginUI.this) == 0)
          {
            if (ExtDeviceWXLoginUI.c(ExtDeviceWXLoginUI.this))
            {
              boolean bool = ((CheckBox)ExtDeviceWXLoginUI.this.findViewById(R.h.cfK)).isChecked();
              ExtDeviceWXLoginUI.a(ExtDeviceWXLoginUI.this, false);
              if (bool)
              {
                at.AR();
                c.xh().a(w.a.vvO, Boolean.valueOf(true));
                paramAnonymousView = ExtDeviceWXLoginUI.this;
                if ((!ExtDeviceWXLoginUI.c(ExtDeviceWXLoginUI.this)) || (!bool)) {
                  break label166;
                }
              }
              label166:
              for (bool = true;; bool = false)
              {
                ExtDeviceWXLoginUI.b(paramAnonymousView, bool);
                GMTrace.o(7662087438336L, 57087);
                return;
                at.AR();
                if (((Boolean)c.xh().get(w.a.vvO, Boolean.valueOf(true))).booleanValue()) {
                  ExtDeviceWXLoginUI.a(ExtDeviceWXLoginUI.this, true);
                }
                at.AR();
                c.xh().a(w.a.vvO, Boolean.valueOf(false));
                break;
              }
            }
            ExtDeviceWXLoginUI.b(ExtDeviceWXLoginUI.this, false);
            GMTrace.o(7662087438336L, 57087);
            return;
          }
          if (ExtDeviceWXLoginUI.b(ExtDeviceWXLoginUI.this) == -2)
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("BaseScanUI_select_scan_mode", 1);
            paramAnonymousView.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
            paramAnonymousView.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
            paramAnonymousView.putExtra("from_album", false);
            paramAnonymousView.putExtra("show_intro", false);
            paramAnonymousView.setFlags(65536);
            com.tencent.mm.bj.d.b(ExtDeviceWXLoginUI.this, "scanner", ".ui.BaseScanUI", paramAnonymousView);
            ExtDeviceWXLoginUI.this.finish();
          }
          GMTrace.o(7662087438336L, 57087);
        }
      });
      this.vKB.hqF.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7666113970176L, 57117);
          ExtDeviceWXLoginUI.d(ExtDeviceWXLoginUI.this);
          GMTrace.o(7666113970176L, 57117);
        }
      });
      ((TextView)findViewById(R.h.cnZ)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7671751114752L, 57159);
          ExtDeviceWXLoginUI.this.finish();
          GMTrace.o(7671751114752L, 57159);
        }
      });
      at.wS().a(972, this);
      at.wS().a(973, this);
      GMTrace.o(7666650841088L, 57121);
      return;
      at.AR();
      c.xh().a(w.a.vvP, Integer.valueOf(3));
      break;
      at.AR();
      c.xh().a(w.a.vvP, Integer.valueOf(4));
      break;
      if (i < 0) {
        break label349;
      }
      if ((this.rZL & 0x1) > 0) {}
      for (boolean bool = true;; bool = false)
      {
        w.i("MicroMsg.ExtDeviceWXLoginUI", "msgsynchronize needCheckedSync[%b], iconType[%d]", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.gUu) });
        if ((this.gUu != 1) || (this.rZK < j)) {
          break label759;
        }
        this.rZB = true;
        ((TextView)findViewById(R.h.cfJ)).setVisibility(8);
        ((CheckBox)findViewById(R.h.cfK)).setVisibility(0);
        ((CheckBox)findViewById(R.h.cfK)).setText(R.l.ekv);
        if (bool)
        {
          at.AR();
          if (((Boolean)c.xh().get(w.a.vvO, Boolean.valueOf(true))).booleanValue()) {
            break;
          }
        }
        ((CheckBox)findViewById(R.h.cfK)).setChecked(false);
        break;
      }
      label759:
      if ((this.gUu != 2) || (this.rZK < k)) {
        break label349;
      }
      this.rZB = true;
      ((TextView)findViewById(R.h.cfJ)).setVisibility(8);
      ((CheckBox)findViewById(R.h.cfK)).setVisibility(0);
      ((CheckBox)findViewById(R.h.cfK)).setText(R.l.eku);
      if (bool)
      {
        at.AR();
        if (((Boolean)c.xh().get(w.a.vvO, Boolean.valueOf(true))).booleanValue()) {
          break label349;
        }
      }
      ((CheckBox)findViewById(R.h.cfK)).setChecked(false);
      break label349;
      label873:
      if (this.gUu == 3)
      {
        ((ImageView)localObject1).setImageResource(R.k.cLz);
        break label385;
      }
      if (this.gUu == 5)
      {
        ((ImageView)localObject1).setImageResource(R.k.cLG);
        break label385;
      }
      label911:
      ((ImageView)localObject1).setImageResource(R.k.cLE);
      break label385;
      label922:
      if (this.type == -1)
      {
        this.rZN.setEnabled(false);
        if (this.gUu == 5) {
          this.rZO.setVisibility(8);
        }
      }
      else if (this.type == -2)
      {
        this.rZN.setEnabled(true);
        continue;
        label978:
        this.rZN.setVisibility(4);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7667321929728L, 57126);
    if (this.msk != null)
    {
      this.msk.dismiss();
      this.msk = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.i("MicroMsg.ExtDeviceWXLoginUI", "onSceneEnd type[%d], [%d, %d]", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      at.wS().b(972, this);
      if (paramk.getType() == 972)
      {
        paramString = (com.tencent.mm.plugin.webwx.a.d)paramk;
        if ((paramString.rZB) || (this.eNg))
        {
          paramString = ((sj)paramString.gMj.gtD.gtK).uiw.toByteArray();
          paramk = new jk();
          paramk.eNd.eNe = paramString;
          paramk.eNd.eNf = this.gUu;
          paramk.eNd.eNg = this.eNg;
          com.tencent.mm.sdk.b.a.vgX.m(paramk);
        }
      }
      for (;;)
      {
        this.type = 0;
        finish();
        GMTrace.o(7667321929728L, 57126);
        return;
        paramk.getType();
      }
    }
    if (paramInt2 == -1)
    {
      this.type = -1;
      if (!bg.nm(paramString))
      {
        ((CheckBox)findViewById(R.h.cfK)).setVisibility(8);
        ((TextView)findViewById(R.h.cfJ)).setVisibility(0);
        ((TextView)findViewById(R.h.cfJ)).setText(paramString);
      }
      if (this.type != -1) {
        break label351;
      }
      if (this.rZN != null) {
        this.rZN.setEnabled(false);
      }
    }
    for (;;)
    {
      w.i("MicroMsg.ExtDeviceWXLoginUI", "[oneliang][onSceneEnd]errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      GMTrace.o(7667321929728L, 57126);
      return;
      if (paramInt2 != -2) {
        break;
      }
      this.type = -2;
      break;
      label351:
      if (this.type == -2)
      {
        if (this.rZN != null)
        {
          this.rZN.setEnabled(true);
          this.rZN.setText(R.l.ekw);
        }
        if (this.rZO != null) {
          this.rZO.setVisibility(4);
        }
      }
    }
  }
  
  public void finish()
  {
    GMTrace.i(7667053494272L, 57124);
    super.finish();
    overridePendingTransition(R.a.aLj, R.a.aLE);
    GMTrace.o(7667053494272L, 57124);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7666919276544L, 57123);
    int i = R.i.cuq;
    GMTrace.o(7666919276544L, 57123);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7666382405632L, 57119);
    super.onCreate(paramBundle);
    cN().cO().hide();
    MP();
    overridePendingTransition(R.a.aLG, R.a.aLj);
    GMTrace.o(7666382405632L, 57119);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7667187712000L, 57125);
    super.onDestroy();
    at.wS().b(972, this);
    at.wS().b(973, this);
    GMTrace.o(7667187712000L, 57125);
  }
  
  protected void onPause()
  {
    GMTrace.i(7666785058816L, 57122);
    super.onPause();
    uu localuu;
    if ((this.rZM) && (at.AU()))
    {
      localuu = new uu();
      localuu.umY = 27;
      if (!q.fo(q.zK())) {
        break label93;
      }
    }
    label93:
    for (int i = 1;; i = 2)
    {
      localuu.umZ = i;
      at.AR();
      c.yJ().b(new e.a(23, localuu));
      this.rZM = false;
      GMTrace.o(7666785058816L, 57122);
      return;
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(7666516623360L, 57120);
    super.onResume();
    GMTrace.o(7666516623360L, 57120);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webwx\ui\ExtDeviceWXLoginUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */