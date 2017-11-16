package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.ro;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.aff;
import com.tencent.mm.protocal.c.auv;
import com.tencent.mm.protocal.c.bqi;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public class IPCallDialUI
  extends MMActivity
  implements e, b.a
{
  private TextView hrh;
  private String lTY;
  private DialPad mnl;
  private TextView mnm;
  private EditText mnn;
  private View mno;
  private ImageButton mnp;
  private View mnq;
  private TextView mnr;
  private TextView mns;
  private b mpG;
  private String mpH;
  private String mpI;
  private String mpJ;
  private String mpK;
  private int mpL;
  private int mpM;
  private int mpN;
  private LinkedList<bqi> mpO;
  com.tencent.mm.plugin.ipcall.a.d.b mpP;
  com.tencent.mm.plugin.ipcall.a.d.c mpQ;
  private com.tencent.mm.sdk.b.c mpR;
  
  public IPCallDialUI()
  {
    GMTrace.i(11717073436672L, 87299);
    this.mpL = 0;
    this.mpM = 0;
    this.mpN = -1;
    this.mpR = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(11717073436672L, 87299);
  }
  
  private void aJm()
  {
    GMTrace.i(11718818267136L, 87312);
    w.i("MicroMsg.IPCallDialUI", "modifyCountryCodeByUsder");
    this.mpN = 2;
    if (this.mpM == 1)
    {
      this.mpM = 2;
      GMTrace.o(11718818267136L, 87312);
      return;
    }
    this.mpM = 4;
    GMTrace.o(11718818267136L, 87312);
  }
  
  private void init()
  {
    GMTrace.i(11717744525312L, 87304);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 80, null, null);
    w.i("MicroMsg.IPCallDialUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW() });
    if (!bool)
    {
      GMTrace.o(11717744525312L, 87304);
      return;
    }
    oM(R.l.dEf);
    setVolumeControlStream(1);
    this.mnl = ((DialPad)findViewById(R.h.buk));
    this.mnm = ((TextView)findViewById(R.h.bsi));
    this.mnq = findViewById(R.h.bsg);
    this.mnn = ((EditText)findViewById(R.h.bTd));
    this.mno = findViewById(R.h.bTc);
    this.hrh = ((TextView)findViewById(R.h.bum));
    this.mnp = ((ImageButton)findViewById(R.h.btT));
    this.mnr = ((TextView)findViewById(R.h.bsk));
    this.mns = ((TextView)findViewById(R.h.btW));
    this.mpG = new b(this, this.mnn, this.mnm, this.mno, this.mnl, this.mnp, this.hrh, this.mnq, this.mnr, this.mns);
    this.mpG.mnk = this;
    if (!bg.nm(this.mpH)) {
      this.mpG.bi(this.mpH, -1);
    }
    if (!bg.nm(this.mpJ)) {
      this.mpG.Ar(this.mpJ);
    }
    if ((!bg.nm(this.mpH)) && (!bg.nm(this.mpJ))) {
      this.mpG.aJc();
    }
    this.mpG.X(this.mpO);
    GMTrace.o(11717744525312L, 87304);
  }
  
  public final void As(String paramString)
  {
    GMTrace.i(11718549831680L, 87310);
    w.i("MicroMsg.IPCallDialUI", "onModifyCountryCodeByUser:countryCode:%s,mCountryCode:%s", new Object[] { paramString, this.mpJ });
    if ((this.mpN != 2) && (this.mpN != -1) && (!this.mpJ.equals(paramString))) {
      aJm();
    }
    GMTrace.o(11718549831680L, 87310);
  }
  
  public final void At(String paramString)
  {
    GMTrace.i(11718684049408L, 87311);
    w.i("MicroMsg.IPCallDialUI", "onModifyPhoneNumberByUser:phoneNumber:%s,mPhoneNumber:%s", new Object[] { paramString, this.mpH });
    if ((this.mpN != 2) && (this.mpN != -1) && (!this.mpH.equals(paramString))) {
      aJm();
    }
    GMTrace.o(11718684049408L, 87311);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11717207654400L, 87300);
    GMTrace.o(11717207654400L, 87300);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11718415613952L, 87309);
    if ((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.b))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramk == this.mpP))
      {
        if (this.mpP.mlz != null) {
          w.i("MicroMsg.IPCallDialUI", "Response Result:%d,PureNumber:%s,CountryCode:%s", new Object[] { Integer.valueOf(this.mpP.mlz.ucS), this.mpP.mlz.uKi, this.mpP.mlz.muE });
        }
        if (this.mpN != 2)
        {
          this.mpN = 1;
          this.mpM = 1;
          paramString = this.mpP;
          if ((paramString.mlz != null) && (paramString.mlz.ucS == 2)) {}
          for (paramInt1 = 1; paramInt1 != 0; paramInt1 = 0)
          {
            w.i("MicroMsg.IPCallDialUI", "check error show error dialog");
            GMTrace.o(11718415613952L, 87309);
            return;
          }
          paramString = this.mpP;
          if ((paramString.mlz != null) && ((paramString.mlz.ucS == 1) || (paramString.mlz.ucS == 0)))
          {
            paramInt1 = 1;
            if (paramInt1 != 0)
            {
              if ((this.mpP.mlz == null) || (bg.nm(this.mpP.mlz.muE))) {
                break label415;
              }
              if (this.mpG != null)
              {
                w.i("MicroMsg.IPCallDialUI", "response country code:%s, old country code:%s", new Object[] { this.mpP.mlz.muE, this.mpJ });
                this.mpJ = this.mpP.mlz.muE;
                this.mpG.Ar(this.mpP.mlz.muE);
              }
            }
          }
          for (;;)
          {
            if ((this.mpP.mlz == null) || (bg.nm(this.mpP.mlz.uKi)) || (this.mpG == null)) {
              break label493;
            }
            w.i("MicroMsg.IPCallDialUI", "response number:%s, old number:%s", new Object[] { this.mpP.mlz.uKi, this.mpH });
            this.mpH = this.mpP.mlz.uKi;
            this.mpG.bi(this.mpP.mlz.uKi, -1);
            GMTrace.o(11718415613952L, 87309);
            return;
            paramInt1 = 0;
            break;
            label415:
            w.i("MicroMsg.IPCallDialUI", "response country code is empty, ignore");
          }
        }
        w.i("MicroMsg.IPCallDialUI", "NetSceneIPCallCheckNumber onSceneEnd, mCheckNumberStatus = userModify, ignore");
        GMTrace.o(11718415613952L, 87309);
      }
    }
    else if ((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.c)) {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label503;
      }
    }
    label493:
    label503:
    for (this.mpO = ((com.tencent.mm.plugin.ipcall.a.d.c)paramk).mlB.uuS;; this.mpO = null)
    {
      if (this.mpG != null) {
        this.mpG.X(this.mpO);
      }
      GMTrace.o(11718415613952L, 87309);
      return;
    }
  }
  
  public final void g(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(11718012960768L, 87306);
    w.i("MicroMsg.IPCallDialUI", "onDial, countryCode: %s, phoneNumber: %s, contactId: %s, nickname: %s", new Object[] { paramString1, paramString2, paramString3, paramString4 });
    if (!com.tencent.mm.plugin.ipcall.b.c.cJ(this))
    {
      GMTrace.o(11718012960768L, 87306);
      return;
    }
    if (com.tencent.mm.plugin.ipcall.a.c.aIa().pk(bg.getInt(paramString1, -1)))
    {
      h.b(this, getString(R.l.dbH), getString(R.l.dbI), true);
      g.ork.A(12058, paramString1);
      GMTrace.o(11718012960768L, 87306);
      return;
    }
    g.ork.i(12059, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    Intent localIntent = new Intent(this, IPCallTalkUI.class);
    localIntent.putExtra("IPCallTalkUI_contactId", paramString3);
    localIntent.putExtra("IPCallTalkUI_countryCode", paramString1);
    localIntent.putExtra("IPCallTalkUI_nickname", paramString4);
    localIntent.putExtra("IPCallTalkUI_phoneNumber", paramString2);
    localIntent.putExtra("IPCallTalkUI_dialScene", this.mpL);
    localIntent.putExtra("IPCallTalkUI_countryType", this.mpM);
    startActivityForResult(localIntent, 1001);
    GMTrace.o(11718012960768L, 87306);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11717610307584L, 87303);
    int i = R.i.cAi;
    GMTrace.o(11717610307584L, 87303);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11717878743040L, 87305);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    b localb = this.mpG;
    w.d("MicroMsg.DialPadController", "onActivityResult");
    if ((paramInt1 == 100) && (paramInt2 == 100))
    {
      String str = bg.aq(paramIntent.getStringExtra("country_name"), "");
      paramIntent = bg.aq(paramIntent.getStringExtra("couttry_code"), "");
      w.d("MicroMsg.DialPadController", "onActivityResult, countryName: %s, countryCode: %s", new Object[] { paramIntent, str });
      if ((!bg.nm(paramIntent)) && (!bg.nm(str)))
      {
        localb.mnu = str;
        localb.mnv = ("+" + paramIntent);
        localb.mnm.setText(localb.mnv);
        localb.mnw = localb.cE(paramIntent.replace("+", ""), localb.mnw);
        localb.bi(localb.mnw, -1);
        localb.mnA = false;
      }
      GMTrace.o(11717878743040L, 87305);
      return;
    }
    if ((paramInt1 == 1001) && (paramInt2 == -1))
    {
      paramIntent.getBooleanExtra("IPCallTalkUI_TalkIsOverdue", false);
      localb.ezR.setResult(-1, paramIntent);
      localb.ezR.finish();
    }
    GMTrace.o(11717878743040L, 87305);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11717341872128L, 87301);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.vgX.b(this.mpR);
    at.wS().a(807, this);
    at.wS().a(746, this);
    getWindow().addFlags(131072);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11635200622592L, 86689);
        IPCallDialUI.this.finish();
        GMTrace.o(11635200622592L, 86689);
        return true;
      }
    }, R.k.aTr);
    this.lTY = getIntent().getStringExtra("IPCallTalkUI_nickname");
    this.mpH = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
    this.mpI = getIntent().getStringExtra("IPCallTalkUI_contactId");
    this.mpJ = getIntent().getStringExtra("IPCallTalkUI_countryCode");
    this.mpK = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
    this.mpL = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
    w.i("MicroMsg.IPCallDialUI", "onCreate nickName:%s, phoneNumber:%s, contactId:%s, countryCode:%s, toUserName:%s, dialScene:%d", new Object[] { this.lTY, this.mpH, this.mpI, this.mpJ, this.mpK, Integer.valueOf(this.mpL) });
    if (!bg.nm(this.mpH)) {
      this.mpH = com.tencent.mm.plugin.ipcall.b.c.AT(this.mpH);
    }
    if (bg.nm(this.mpJ))
    {
      if (com.tencent.mm.plugin.ipcall.b.a.AN(this.mpH))
      {
        if (bg.nm(com.tencent.mm.plugin.ipcall.b.a.AL(this.mpH))) {
          this.mpH = com.tencent.mm.plugin.ipcall.b.a.AO(this.mpH);
        }
      }
      else {
        this.mpJ = com.tencent.mm.plugin.ipcall.b.c.aJG();
      }
    }
    else
    {
      if (this.mpL == 1) {
        break label477;
      }
      this.mpN = 0;
      this.mpM = 3;
      this.mpP = new com.tencent.mm.plugin.ipcall.a.d.b(this.mpH, this.mpJ, "", bg.bQT(), this.mpL);
      at.wS().a(this.mpP, 0);
    }
    for (;;)
    {
      init();
      GMTrace.o(11717341872128L, 87301);
      return;
      w.i("MicroMsg.IPCallDialUI", "country code exist, directly go to talk ui.");
      this.mpM = 4;
      paramBundle = new Intent(this, IPCallTalkUI.class);
      paramBundle.putExtra("IPCallTalkUI_contactId", this.mpI);
      paramBundle.putExtra("IPCallTalkUI_countryCode", this.mpJ);
      paramBundle.putExtra("IPCallTalkUI_nickname", this.lTY);
      paramBundle.putExtra("IPCallTalkUI_phoneNumber", this.mpH);
      paramBundle.putExtra("IPCallTalkUI_dialScene", this.mpL);
      paramBundle.putExtra("IPCallTalkUI_countryType", this.mpM);
      startActivityForResult(paramBundle, 1001);
      finish();
      GMTrace.o(11717341872128L, 87301);
      return;
      label477:
      this.mpN = -1;
      this.mpM = 4;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11718147178496L, 87307);
    super.onDestroy();
    if (this.mpG != null) {
      this.mpG.mnk = null;
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.mpR);
    at.wS().b(807, this);
    at.wS().b(746, this);
    GMTrace.o(11718147178496L, 87307);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(11718281396224L, 87308);
    w.i("MicroMsg.IPCallDialUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11718281396224L, 87308);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        init();
        GMTrace.o(11718281396224L, 87308);
        return;
      }
      h.a(this, getString(R.l.dNr), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11663252127744L, 86898);
          paramAnonymousDialogInterface.dismiss();
          IPCallDialUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(11663252127744L, 86898);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11699490914304L, 87168);
          paramAnonymousDialogInterface.dismiss();
          IPCallDialUI.this.finish();
          GMTrace.o(11699490914304L, 87168);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(11717476089856L, 87302);
    w.d("MicroMsg.IPCallDialUI", "onResume");
    super.onResume();
    GMTrace.o(11717476089856L, 87302);
  }
  
  public void onStart()
  {
    GMTrace.i(15075872079872L, 112324);
    super.onStart();
    this.mpQ = new com.tencent.mm.plugin.ipcall.a.d.c();
    at.wS().a(this.mpQ, 0);
    GMTrace.o(15075872079872L, 112324);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallDialUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */