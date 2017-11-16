package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.ipcall.a.c.a.a;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.g.a;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;

@com.tencent.mm.ui.base.a(3)
public class IPCallTalkUI
  extends MMActivity
  implements j.a
{
  private String lTY;
  private String mpH;
  private String mpI;
  private String mpJ;
  private String mpK;
  private int mpL;
  private int mpM;
  private j mty;
  
  public IPCallTalkUI()
  {
    GMTrace.i(11659494031360L, 86870);
    GMTrace.o(11659494031360L, 86870);
  }
  
  private void init()
  {
    GMTrace.i(11659896684544L, 86873);
    this.mty = new j(this);
    this.mty.muj = this;
    j localj = this.mty;
    Object localObject2 = this.lTY;
    Object localObject3 = this.mpH;
    Object localObject4 = this.mpI;
    String str1 = this.mpJ;
    Object localObject1 = this.mpK;
    int i = this.mpL;
    int j = this.mpM;
    localj.mup = localj.muh.getIntent().getBooleanExtra("IPCallTalkUI_isFromMiniNotification", false);
    w.i("MicroMsg.TalkUIController", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername: %s, isFromMinimize: %b", new Object[] { localObject2, localObject3, localObject4, str1, localObject1, Boolean.valueOf(localj.mup) });
    localj.mtX = ((ImageView)localj.muh.findViewById(R.h.cgx));
    localj.hqg = ((ImageView)localj.muh.findViewById(R.h.cgw));
    localj.mtV = ((EditText)localj.muh.findViewById(R.h.cgB));
    localj.hql = ((TextView)localj.muh.findViewById(R.h.cgE));
    localj.mtW = ((TextView)localj.muh.findViewById(R.h.cgC));
    localj.mtY = ((IPCallFuncButton)localj.muh.findViewById(R.h.cgA));
    localj.mtZ = ((IPCallFuncButton)localj.muh.findViewById(R.h.cgy));
    localj.mua = ((IPCallFuncButton)localj.muh.findViewById(R.h.cgD));
    localj.mub = ((ImageButton)localj.muh.findViewById(R.h.cgz));
    localj.mue = ((ImageButton)localj.muh.findViewById(R.h.bIt));
    localj.muc = ((TextView)localj.muh.findViewById(R.h.cmC));
    localj.mud = localj.muh.findViewById(R.h.cmD);
    localj.mnl = ((DialPad)localj.muh.findViewById(R.h.buk));
    if (localj.mup)
    {
      localj.lTY = i.aIo().miY.eCQ;
      localj.mug = i.aIo().miY.mkh;
      localj.mpK = i.aIo().miY.eTy;
      localj.mpI = i.aIo().miY.eVo;
      localj.mpH = i.aIo().miY.mkg;
      localj.muf = i.aIo().miY.mkj;
      w.i("MicroMsg.TalkUIController", "restoreParam nickname:%s,fianlPhoneNumber:%s,toUserName:%s,contactId:%s,phoneNumber:%s,phoneType:%d", new Object[] { localj.lTY, localj.mug, localj.mpK, localj.mpI, localj.mpH, Integer.valueOf(localj.muf) });
      localj.aJx();
      localj.aJy();
      i.aIs();
      w.i("MicroMsg.TalkUIController", f.stateToString(i.aIs().miI));
      localj.pC(i.aIs().miI);
      localObject1 = i.aIo().miY.mkh;
      localObject2 = i.aIo().miY.mki;
      if (!bg.nm((String)localObject2))
      {
        localj.AF((String)localObject2);
        localj.mtW.setText(com.tencent.mm.plugin.ipcall.b.a.AP((String)localObject2));
      }
      for (;;)
      {
        if (i.aIs().aIj())
        {
          localObject1 = localj.mua;
          i.aIr();
          ((IPCallFuncButton)localObject1).setChecked(com.tencent.mm.plugin.ipcall.a.b.a.sm());
          localj.mtY.setChecked(i.aIr().mkt.jGN);
        }
        GMTrace.o(11659896684544L, 86873);
        return;
        if (!bg.nm((String)localObject1))
        {
          localj.AF((String)localObject1);
          localj.mtW.setText(com.tencent.mm.plugin.ipcall.b.a.AP((String)localObject1));
        }
      }
    }
    if (i.aIs().aIi())
    {
      h.a(localj.muh, R.l.dDe, R.l.cUG, false, new j.1(localj));
      GMTrace.o(11659896684544L, 86873);
      return;
    }
    localj.aJx();
    localj.lTY = ((String)localObject2);
    localj.mpH = ((String)localObject3);
    localj.mpI = ((String)localObject4);
    localj.mpJ = str1;
    localj.mpL = i;
    localj.mpM = j;
    if (!bg.nm(localj.mpH)) {
      localj.mpH = com.tencent.mm.plugin.ipcall.b.c.AT(localj.mpH);
    }
    if (bg.nm(localj.mpJ))
    {
      if (com.tencent.mm.plugin.ipcall.b.a.AN(localj.mpH))
      {
        localObject2 = com.tencent.mm.plugin.ipcall.b.a.AL(localj.mpH);
        if (bg.nm((String)localObject2)) {
          localj.mpH = com.tencent.mm.plugin.ipcall.b.a.AO(localj.mpH);
        }
      }
      else
      {
        localj.mpJ = com.tencent.mm.plugin.ipcall.b.c.aJG();
      }
    }
    else
    {
      w.i("MicroMsg.TalkUIController", "final mCountryCode: %s", new Object[] { localj.mpJ });
      localObject2 = com.tencent.mm.plugin.ipcall.a.c.aIa();
      localObject3 = localj.mpJ;
      if (!((com.tencent.mm.plugin.ipcall.a.c)localObject2).isInit) {
        ((com.tencent.mm.plugin.ipcall.a.c)localObject2).fg(false);
      }
      if (!bg.nm((String)localObject3))
      {
        localObject3 = ((String)localObject3).replace("+", "");
        i.aIw().w(bg.getInt((String)localObject3, 0), bg.Pv());
        ((com.tencent.mm.plugin.ipcall.a.c)localObject2).aIc();
      }
      if (bg.nm(localj.lTY)) {
        localj.lTY = com.tencent.mm.plugin.ipcall.b.a.ai(localj.muh, localj.mpH);
      }
      localj.mpK = ((String)localObject1);
      if ((bg.nm(localj.mpJ)) || (com.tencent.mm.plugin.ipcall.b.a.AN(localj.mpH))) {
        break label1229;
      }
      localj.mug = (localj.mpJ + localj.mpH);
      if (localj.mug.startsWith("+")) {}
    }
    label1229:
    for (localj.mug = ("+" + localj.mug);; localj.mug = localj.mpH)
    {
      w.i("MicroMsg.TalkUIController", "final call mPhoneNumber: %s", new Object[] { localj.mug });
      if (!com.tencent.mm.plugin.ipcall.a.c.aIa().pk(bg.getInt(localj.mpJ, -1))) {
        break label1242;
      }
      com.tencent.mm.plugin.report.service.g.ork.A(12058, localj.mpJ);
      h.a(localj.muh, localj.muh.getString(R.l.dbH), localj.muh.getString(R.l.dbI), false, new j.6(localj));
      GMTrace.o(11659896684544L, 86873);
      return;
      localj.mpH = com.tencent.mm.plugin.ipcall.b.a.AQ(localj.mpH);
      localj.mpJ = ((String)localObject2);
      break;
    }
    label1242:
    if (!am.isNetworkConnected(localj.muh))
    {
      Toast.makeText(localj.muh, R.l.eiM, 1).show();
      localj.muh.finish();
      GMTrace.o(11659896684544L, 86873);
      return;
    }
    long l1 = localj.muh.getSharedPreferences("IPCall_LastInputPref", 0).getLong("IPCall_LastInvite", -1L);
    long l2 = System.currentTimeMillis();
    if ((l1 > l2) && (l1 != -1L))
    {
      w.i("MicroMsg.TalkUIController", "onDisasterHappen");
      h.a(localj.muh, localj.muh.getString(R.l.dEg, new Object[] { String.valueOf((l1 - l2) / 1000L + 1L) }), localj.muh.getString(R.l.dEb), localj.muh.getString(R.l.dEc), false, new j.5(localj));
      GMTrace.o(11659896684544L, 86873);
      return;
    }
    localj.aJy();
    String str2;
    String str3;
    int k;
    if ((!localj.mup) || (!i.aIs().aIi()))
    {
      localj.muf = com.tencent.mm.plugin.ipcall.b.a.cH(localj.mpI, localj.mpH);
      localj.pC(1);
      localObject2 = localj.mui;
      localObject3 = localj.lTY;
      localObject4 = localj.mpH;
      str1 = localj.mpK;
      str2 = localj.mug;
      str3 = localj.mpI;
      i = localj.muf;
      j = localj.mpL;
      k = localj.mpM;
      if (!i.aIs().aIi()) {
        break label1626;
      }
      w.i("MicroMsg.IPCallManager", "startIPCall, already start!");
      w.i("MicroMsg.TalkUIController", "startLaunchTalk, callNumber: %s", new Object[] { localj.mug });
      localObject1 = i.aIq();
      localObject2 = localj.mpJ;
      w.d("MicroMsg.IPCallReportHelper", "setCountryCode: %s", new Object[] { localObject2 });
      if (!bg.nm((String)localObject2)) {
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).countryCode = ((String)localObject2);
      }
    }
    localj.mur = false;
    GMTrace.o(11659896684544L, 86873);
    return;
    label1626:
    w.i("MicroMsg.IPCallManager", "startIPCall");
    i.aIo().miP = ((g.a)localObject2);
    i.aIp().mkT = ((a.a)localObject2);
    i.aIs().miI = -1;
    ((com.tencent.mm.plugin.ipcall.c)localObject2).art();
    ((com.tencent.mm.plugin.ipcall.c)localObject2).mij = ((TelephonyManager)ab.getContext().getSystemService("phone"));
    ((com.tencent.mm.plugin.ipcall.c)localObject2).mij.listen(((com.tencent.mm.plugin.ipcall.c)localObject2).mik, 32);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.ipcall.c)localObject2).mil);
    w.d("MicroMsg.IPCallRecordStorageLogic", "recordStartCall, phoneNumber: %s, contactId: %s", new Object[] { str2, str3 });
    localObject1 = new k();
    ((k)localObject1).field_phonenumber = str2;
    if (!bg.nm(str3))
    {
      com.tencent.mm.plugin.ipcall.a.g.c localc = i.aIu().Ak(str3);
      if ((localc != null) && (localc.vmr != -1L))
      {
        ((k)localObject1).field_addressId = localc.vmr;
        label1791:
        if (i == -1) {
          break label2406;
        }
        ((k)localObject1).field_phoneType = i;
        label1802:
        ((k)localObject1).field_calltime = bg.Pv();
        ((k)localObject1).field_status = 1;
        if (!i.aIv().b((com.tencent.mm.sdk.e.c)localObject1)) {
          break label2415;
        }
      }
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.ipcall.c)localObject2).mih = ((k)localObject1);
      com.tencent.mm.plugin.ipcall.c.ghS.postDelayed(((com.tencent.mm.plugin.ipcall.c)localObject2).mio, 1754L);
      ((com.tencent.mm.plugin.ipcall.c)localObject2).mii = false;
      localObject1 = i.aIq();
      w.d("MicroMsg.IPCallReportHelper", "reset");
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mkV = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mkW = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mkX = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mkY = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mkZ = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mla = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlb = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlc = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mld = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mle = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mjF = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mjG = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlf = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).htr = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlg = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlh = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlj = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mli = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mir = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlk = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mll = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlq = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlp = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlm = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mln = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).countryCode = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlr = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mls = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlt = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlu = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).mlv = 0;
      i.aIs().miI = -1;
      w.d("MicroMsg.IPCallManager", "startIPCall, username: %s, phoneNumber: %s", new Object[] { str1, str2 });
      localObject1 = i.aIo();
      w.d("MicroMsg.IPCallSvrLogic", "startIPCall, toUsername: %s, toPhoneNumber: %s", new Object[] { str1, str2 });
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).eQN = false;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miZ = false;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miK = 0;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miL = 0;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miM = 0;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miN = false;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miO = false;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).mja = false;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY = new com.tencent.mm.plugin.ipcall.a.a.c();
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY.eCQ = ((String)localObject3);
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY.mkg = ((String)localObject4);
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY.eVo = str3;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY.mkh = str2;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY.eTy = str1;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY.mjI = ((int)System.currentTimeMillis());
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY.mjJ = j;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY.mjK = k;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY.mkj = i;
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miQ.a(((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY);
      ((com.tencent.mm.plugin.ipcall.a.g)localObject1).miV.a(((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY);
      w.i("MicroMsg.IPCallSvrLogic", "startIPCallInternal, inviteId: %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.g)localObject1).miY.mjI) });
      i.aIs().pl(1);
      localObject1 = i.aIp();
      if (!((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mkS) {
        break label2421;
      }
      w.d("MicroMsg.IPCallEngineManager", "already start engine");
      com.tencent.mm.plugin.ipcall.c.ghS.removeCallbacks(((com.tencent.mm.plugin.ipcall.c)localObject2).mim);
      com.tencent.mm.plugin.ipcall.c.ghS.postDelayed(((com.tencent.mm.plugin.ipcall.c)localObject2).mim, 60000L);
      break;
      ((k)localObject1).field_addressId = -1L;
      break label1791;
      ((k)localObject1).field_addressId = -1L;
      break label1791;
      label2406:
      ((k)localObject1).field_phoneType = -1;
      break label1802;
      label2415:
      localObject1 = null;
    }
    label2421:
    ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).aIL();
    w.i("MicroMsg.IPCallEngineManager", "start engine");
    if (((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mkO.ndo)
    {
      ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mkO.iB(false);
      ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mkO.reset();
    }
    ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mkO.qJp = 1;
    l1 = System.currentTimeMillis();
    localObject3 = ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mkO;
    ((v2protocal)localObject3).netType = com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext());
    if (((v2protocal)localObject3).netType == 5) {
      ((v2protocal)localObject3).netType = 4;
    }
    ((v2protocal)localObject3).qKi = new int[((v2protocal)localObject3).defaultWidth * ((v2protocal)localObject3).defaultHeight];
    at.AR();
    ((v2protocal)localObject3).qJn = com.tencent.mm.y.c.ww();
    i = com.tencent.mm.compatible.d.l.sK();
    if ((i & 0x400) != 0)
    {
      com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec_v7a.so");
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v7a.so... ");
    }
    for (;;)
    {
      j = Build.VERSION.SDK_INT;
      k = OpenGlRender.bvY();
      localObject4 = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay();
      int m = ((Display)localObject4).getWidth();
      int n = ((Display)localObject4).getHeight();
      i = ((v2protocal)localObject3).init(((v2protocal)localObject3).netType, 65538, ((v2protocal)localObject3).defaultWidth << 16 | ((v2protocal)localObject3).defaultHeight, m << 16 | n, ((v2protocal)localObject3).qJn, i | j << 16 | k << 24, com.tencent.mm.compatible.util.e.ghu + "app_lib/", 4);
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "protocal init ret :" + i + ",uin= " + ((v2protocal)localObject3).qJn);
      ((v2protocal)localObject3).ndo = true;
      if (i < 0) {
        ((v2protocal)localObject3).reset();
      }
      w.d("MicroMsg.IPCallEngineManager", "protocal init finish, ret: %d, used %dms", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l1) });
      if ((((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mkO.field_capInfo != null) && (((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mkO.exchangeCabInfo(((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mkO.field_capInfo, ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mkO.field_capInfo.length) < 0))
      {
        w.e("MicroMsg.IPCallEngineManager", "exchangeCabInfo failed");
        i.aIq().mle = 24;
      }
      if (i < 0) {
        w.e("MicroMsg.IPCallEngineManager", "engine init failed!");
      }
      ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mkO.qJp = 1;
      ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).mkS = true;
      break;
      if ((i & 0x200) != 0)
      {
        com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec.so");
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec.so... ");
      }
      else
      {
        com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec_v5.so");
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v5.so... ");
      }
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(11659628249088L, 86871);
    GMTrace.o(11659628249088L, 86871);
    return 1;
  }
  
  public final void fy(boolean paramBoolean)
  {
    GMTrace.i(11660299337728L, 86876);
    if (!paramBoolean)
    {
      GMTrace.o(11660299337728L, 86876);
      return;
    }
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11659091378176L, 86867);
        Intent localIntent = new Intent();
        IPCallTalkUI.this.setResult(-1, localIntent);
        IPCallTalkUI.this.finish();
        GMTrace.o(11659091378176L, 86867);
      }
    }, 3000L);
    GMTrace.o(11660299337728L, 86876);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11660165120000L, 86875);
    int i = R.i.cAk;
    GMTrace.o(11660165120000L, 86875);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(11660433555456L, 86877);
    GMTrace.o(11660433555456L, 86877);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11659762466816L, 86872);
    super.onCreate(paramBundle);
    cN().cO().hide();
    getWindow().addFlags(6946944);
    this.lTY = getIntent().getStringExtra("IPCallTalkUI_nickname");
    this.mpH = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
    this.mpI = getIntent().getStringExtra("IPCallTalkUI_contactId");
    this.mpJ = getIntent().getStringExtra("IPCallTalkUI_countryCode");
    this.mpK = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
    this.mpL = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
    this.mpM = getIntent().getIntExtra("IPCallTalkUI_countryType", 0);
    w.i("MicroMsg.IPCallTalkUI", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername:%s, mDialScene:%d ,mCountryType:%d", new Object[] { this.lTY, this.mpH, this.mpI, this.mpJ, this.mpK, Integer.valueOf(this.mpL), Integer.valueOf(this.mpM) });
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 80, null, null);
    w.i("MicroMsg.IPCallTalkUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW() });
    if (!bool)
    {
      GMTrace.o(11659762466816L, 86872);
      return;
    }
    init();
    GMTrace.o(11659762466816L, 86872);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11660030902272L, 86874);
    super.onDestroy();
    dp(true);
    if (this.mty != null)
    {
      j localj = this.mty;
      w.i("MicroMsg.TalkUIController", "onDestroy");
      localj.mui.mig = null;
      i.aIr().ezR = null;
      i.aIr().mky = null;
      i.aIr().a(null);
      Object localObject = i.aIr();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mku.mkL = null;
      localObject = ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mku;
      ((com.tencent.mm.plugin.ipcall.a.b.d)localObject).jrf.bQD();
      ((com.tencent.mm.plugin.ipcall.a.b.d)localObject).jrj.bQE();
      localj.muh = null;
      localj.muj = null;
    }
    GMTrace.o(11660030902272L, 86874);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11660567773184L, 86878);
    if (this.mty != null)
    {
      int i;
      if (i.aIs().aIj()) {
        if (paramInt == 25)
        {
          i = i.aIr().aII();
          if (i == -1) {
            break label97;
          }
          at.AS().ei(i);
          i = 1;
        }
      }
      while (i != 0)
      {
        GMTrace.o(11660567773184L, 86878);
        return true;
        if (paramInt == 24)
        {
          i = i.aIr().aII();
          if (i != -1)
          {
            at.AS().eh(i);
            i = 1;
            continue;
          }
        }
        label97:
        i = 0;
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11660567773184L, 86878);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(11660701990912L, 86879);
    w.d("MicroMsg.IPCallTalkUI", "onPause");
    super.onPause();
    if (this.mty != null) {
      w.d("MicroMsg.TalkUIController", "onPause");
    }
    GMTrace.o(11660701990912L, 86879);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(11660970426368L, 86881);
    w.i("MicroMsg.IPCallTalkUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11660970426368L, 86881);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        init();
        GMTrace.o(11660970426368L, 86881);
        return;
      }
      h.a(this, getString(R.l.dNr), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11692243156992L, 87114);
          paramAnonymousDialogInterface.dismiss();
          IPCallTalkUI.this.finish();
          IPCallTalkUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(11692243156992L, 87114);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11631576743936L, 86662);
          paramAnonymousDialogInterface.dismiss();
          IPCallTalkUI.this.finish();
          GMTrace.o(11631576743936L, 86662);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(11660836208640L, 86880);
    w.d("MicroMsg.IPCallTalkUI", "onResume");
    super.onResume();
    if (this.mty != null)
    {
      w.d("MicroMsg.TalkUIController", "onResume");
      at.getNotification().cancel(42);
    }
    GMTrace.o(11660836208640L, 86880);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallTalkUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */