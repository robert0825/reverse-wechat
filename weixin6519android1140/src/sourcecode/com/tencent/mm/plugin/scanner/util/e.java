package com.tencent.mm.plugin.scanner.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.af.d.b;
import com.tencent.mm.g.a.lj;
import com.tencent.mm.g.a.lj.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.modelsimple.l;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.plugin.ab.a.c.a;
import com.tencent.mm.plugin.scanner.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.akh;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  implements com.tencent.mm.ad.e, c.a
{
  public String aEe;
  public String appId;
  public int eDi;
  public String eDl;
  public String imagePath;
  private ProgressDialog jvl;
  private Activity mActivity;
  private int oAt;
  private String oAu;
  private Bundle oAv;
  public a oAw;
  private Map<com.tencent.mm.ad.k, Integer> oAx;
  public int oAy;
  
  public e()
  {
    GMTrace.i(6165962424320L, 45940);
    this.jvl = null;
    this.oAw = null;
    this.oAx = new HashMap();
    onResume();
    GMTrace.o(6165962424320L, 45940);
  }
  
  private void a(Activity paramActivity, int paramInt, final String paramString, boolean paramBoolean)
  {
    int i = 2;
    GMTrace.i(6166767730688L, 45946);
    w.i("MicroMsg.QBarStringHandler", "start search contact %s", new Object[] { paramString });
    if (paramInt == 2) {}
    for (paramInt = i;; paramInt = 1)
    {
      paramString = new com.tencent.mm.modelsimple.ab(paramString, paramInt, 5, paramBoolean);
      this.oAx.put(paramString, Integer.valueOf(1));
      at.wS().a(paramString, 0);
      paramActivity.getString(R.l.cUG);
      this.jvl = h.a(paramActivity, paramActivity.getString(R.l.dVv), new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(6162338545664L, 45913);
          at.wS().c(paramString);
          if (e.this.oAw != null) {
            e.this.oAw.l(1, null);
          }
          GMTrace.o(6162338545664L, 45913);
        }
      });
      GMTrace.o(6166767730688L, 45946);
      return;
    }
  }
  
  private static int sY(int paramInt)
  {
    GMTrace.i(6166230859776L, 45942);
    if ((paramInt == 30) || (paramInt == 37) || (paramInt == 38) || (paramInt == 40))
    {
      GMTrace.o(6166230859776L, 45942);
      return 13;
    }
    if ((paramInt == 4) || (paramInt == 47))
    {
      GMTrace.o(6166230859776L, 45942);
      return 12;
    }
    if (paramInt == 34)
    {
      GMTrace.o(6166230859776L, 45942);
      return 24;
    }
    GMTrace.o(6166230859776L, 45942);
    return 0;
  }
  
  private static int tA(int paramInt)
  {
    GMTrace.i(6166901948416L, 45947);
    if (paramInt == 1) {
      paramInt = 34;
    }
    for (;;)
    {
      GMTrace.o(6166901948416L, 45947);
      return paramInt;
      if (paramInt == 0) {
        paramInt = 4;
      } else if (paramInt == 3) {
        paramInt = 42;
      } else {
        paramInt = 30;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6167036166144L, 45948);
    w.i("MicroMsg.QBarStringHandler", "onSceneEnd: errType = [%s] errCode = [%s] errMsg = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    boolean bool;
    if (paramk == null)
    {
      if (paramk == null) {}
      for (bool = true;; bool = false)
      {
        w.e("MicroMsg.QBarStringHandler", "onSceneEnd() scene is null [%s]", new Object[] { Boolean.valueOf(bool) });
        if (this.oAw != null) {
          this.oAw.l(2, null);
        }
        GMTrace.o(6167036166144L, 45948);
        return;
      }
    }
    if (!this.oAx.containsKey(paramk))
    {
      if ((paramk instanceof z)) {
        w.e("MicroMsg.QBarStringHandler", "emotion scan scene");
      }
    }
    else
    {
      this.oAx.remove(paramk);
      if (this.jvl != null)
      {
        this.jvl.dismiss();
        this.jvl = null;
      }
      if ((paramInt1 != 4) || (paramInt2 != -4)) {
        break label220;
      }
      h.a(this.mActivity, R.l.dOZ, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6169586302976L, 45967);
          if (e.this.oAw != null) {
            e.this.oAw.l(1, null);
          }
          GMTrace.o(6169586302976L, 45967);
        }
      });
      GMTrace.o(6167036166144L, 45948);
      return;
    }
    w.e("MicroMsg.QBarStringHandler", "not my scene, don't care it");
    GMTrace.o(6167036166144L, 45948);
    return;
    label220:
    int i;
    switch (paramInt1)
    {
    default: 
      i = 0;
    }
    while (i != 0)
    {
      if (this.oAw != null) {
        this.oAw.l(1, null);
      }
      GMTrace.o(6167036166144L, 45948);
      return;
      if (at.wS().DO())
      {
        at.wS().getNetworkServerIp();
        new StringBuilder().append(paramInt2);
      }
      for (;;)
      {
        i = 1;
        break;
        if (com.tencent.mm.network.ab.bv(this.mActivity)) {
          com.tencent.mm.pluginsdk.ui.k.dU(this.mActivity);
        } else {
          Toast.makeText(this.mActivity, this.mActivity.getString(R.l.dwH, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2) }), 1).show();
        }
      }
      Toast.makeText(this.mActivity, this.mActivity.getString(R.l.dwI, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt2) }), 1).show();
      i = 1;
    }
    if ((paramInt1 == 4) && (paramInt2 == 63532))
    {
      h.h(this.mActivity, R.l.dOU, R.l.cUG);
      if (this.oAw != null) {
        this.oAw.l(1, null);
      }
      GMTrace.o(6167036166144L, 45948);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      Toast.makeText(this.mActivity, this.mActivity.getString(R.l.dxd, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      if (this.oAw != null) {
        this.oAw.l(1, null);
      }
      GMTrace.o(6167036166144L, 45948);
      return;
    }
    Object localObject1;
    if (paramk.getType() == 106)
    {
      paramString = (com.tencent.mm.modelsimple.ab)paramk;
      if (!paramString.gVh)
      {
        paramString = paramString.LK();
        if ((com.tencent.mm.storage.x.At(paramString.uAv)) && (paramString.uAC != null) && (!bg.nm(paramString.uAC.gCM)) && (com.tencent.mm.modelappbrand.a.ho(paramString.uAC.gCM))) {
          if (this.oAy > 0)
          {
            paramInt1 = this.oAy;
            w.i("MicroMsg.QBarStringHandler", "getA8Key text:%s, mQBarStringSource: %s, sceneValue: %s", new Object[] { this.oAu, Integer.valueOf(this.oAt), Integer.valueOf(paramInt1) });
            paramString = new l(this.oAu, null, 43, 0, new byte[0]);
            this.oAx.put(paramString, Integer.valueOf(1));
            at.wS().a(paramString, 0);
            if (this.jvl != null) {
              this.jvl.dismiss();
            }
            localObject1 = this.mActivity;
            this.mActivity.getString(R.l.cUG);
            this.jvl = h.a((Context)localObject1, this.mActivity.getString(R.l.dPe), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(6177907802112L, 46029);
                at.wS().c(paramString);
                if (e.this.oAw != null) {
                  e.this.oAw.l(1, null);
                }
                GMTrace.o(6177907802112L, 46029);
              }
            });
          }
        }
      }
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        if (paramInt1 == 0) {
          break label801;
        }
        GMTrace.o(6167036166144L, 45948);
        return;
        paramInt1 = tA(this.oAt);
        break;
      }
      label801:
      paramString = ((com.tencent.mm.modelsimple.ab)paramk).LK();
      localObject1 = com.tencent.mm.platformtools.n.a(paramString.ufy);
      w.d("MicroMsg.QBarStringHandler", "handle search contact result, username:" + paramString.ufy);
      com.tencent.mm.ac.n.Dh().f((String)localObject1, com.tencent.mm.platformtools.n.a(paramString.tQa));
      if ((this.jvl != null) && (this.jvl.isShowing()))
      {
        w.d("MicroMsg.QBarStringHandler", "tip dialog dismiss");
        this.jvl.dismiss();
      }
      com.tencent.mm.storage.x localx;
      Object localObject2;
      if (bg.nl((String)localObject1).length() > 0)
      {
        at.AR();
        localx = com.tencent.mm.y.c.yK().TE((String)localObject1);
        if ((localx != null) && (com.tencent.mm.l.a.eE(localx.field_type)) && (localx.bSA()))
        {
          localObject2 = com.tencent.mm.af.x.FG().iC((String)localObject1);
          ((com.tencent.mm.af.d)localObject2).bq(false);
          d.b localb = ((com.tencent.mm.af.d)localObject2).gvL;
          if (localb.gvP != null) {
            localb.gwf = localb.gvP.optInt("ScanQRCodeType", 0);
          }
          if (localb.gwf == 1)
          {
            paramInt1 = 1;
            if ((paramInt1 == 0) || (((com.tencent.mm.af.d)localObject2).EF())) {
              break label1130;
            }
            paramString = new Intent();
            paramString.putExtra("Chat_User", (String)localObject1);
            paramString.putExtra("finish_direct", true);
            b.hnH.e(paramString, this.mActivity);
            paramInt1 = 1;
          }
        }
      }
      for (;;)
      {
        if (paramInt1 == 0) {
          break label1399;
        }
        if (this.oAw == null) {
          break label1417;
        }
        paramString = new Bundle();
        paramString.putString("geta8key_fullurl", com.tencent.mm.platformtools.n.a(((com.tencent.mm.modelsimple.ab)paramk).LK().ufy));
        paramString.putInt("geta8key_action_code", 4);
        this.oAw.l(3, paramString);
        GMTrace.o(6167036166144L, 45948);
        return;
        paramInt1 = 0;
        break;
        label1130:
        switch (this.oAt)
        {
        default: 
          paramInt1 = 30;
          label1163:
          localObject2 = new Intent();
          com.tencent.mm.pluginsdk.ui.tools.c.a((Intent)localObject2, paramString, paramInt1);
          if ((localx != null) && (!com.tencent.mm.l.a.eE(localx.field_type))) {
            ((Intent)localObject2).putExtra("Contact_IsLBSFriend", true);
          }
          if ((paramString.uAv & 0x8) > 0) {
            com.tencent.mm.plugin.report.service.g.ork.A(10298, (String)localObject1 + "," + paramInt1);
          }
          if (this.mActivity != null)
          {
            b.hnH.d((Intent)localObject2, this.mActivity);
            localObject1 = com.tencent.mm.plugin.report.service.g.ork;
            if (!com.tencent.mm.storage.x.At(paramString.uAv)) {
              break label1368;
            }
          }
          break;
        }
        label1368:
        for (paramInt1 = 0;; paramInt1 = 1)
        {
          ((com.tencent.mm.plugin.report.service.g)localObject1).i(14268, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(this.eDi), Integer.valueOf(this.oAt), this.imagePath, this.oAu, bg.nl(this.eDl) });
          paramInt1 = 1;
          break;
          paramInt1 = 30;
          break label1163;
          paramInt1 = 45;
          break label1163;
        }
        if (this.mActivity != null) {
          Toast.makeText(this.mActivity, R.l.dVO, 0).show();
        }
        paramInt1 = 0;
      }
      label1399:
      if (this.oAw != null) {
        this.oAw.l(1, null);
      }
      label1417:
      GMTrace.o(6167036166144L, 45948);
      return;
    }
    if (paramk.getType() == 233)
    {
      paramString = ((l)paramk).Lc();
      localObject1 = new Bundle();
      ((Bundle)localObject1).putString("geta8key_fullurl", paramString);
      ((Bundle)localObject1).putInt("geta8key_action_code", ((l)paramk).Le());
      if (this.oAw != null) {
        this.oAw.l(4, (Bundle)localObject1);
      }
      if (this.oAy > 0) {}
      for (paramInt1 = this.oAy;; paramInt1 = tA(this.oAt))
      {
        w.i("MicroMsg.QBarStringHandler", "handleGetA8KeyRedirect, sceneValue: %s", new Object[] { Integer.valueOf(paramInt1) });
        bool = com.tencent.mm.plugin.ab.a.c.a(this, (l)paramk, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6168109907968L, 45956);
            if (e.this.oAw != null) {
              e.this.oAw.l(1, null);
            }
            GMTrace.o(6168109907968L, 45956);
          }
        }, this.oAu, paramInt1, this.oAt, new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6171599568896L, 45982);
            if (e.this.oAw != null) {
              e.this.oAw.l(3, null);
            }
            GMTrace.o(6171599568896L, 45982);
          }
        }, this.oAv);
        if ((bool) || (((l)paramk).Le() != 4)) {
          break;
        }
        a(this.mActivity, this.oAt, paramString, true);
        GMTrace.o(6167036166144L, 45948);
        return;
      }
      w.i("MicroMsg.QBarStringHandler", "scene geta8key, redirect result = [%s]", new Object[] { Boolean.valueOf(bool) });
      if ((!bool) && (this.oAw != null)) {
        this.oAw.l(1, null);
      }
      GMTrace.o(6167036166144L, 45948);
      return;
    }
    if (paramk.getType() == 666) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if ((paramk instanceof z))
        {
          paramString = ((z)paramk).LI().tRS;
          w.d("MicroMsg.QBarStringHandler", "[oneliang]NetSceneScanEmoji productId:%s", new Object[] { paramString });
          paramk = new Intent();
          paramk.putExtra("extra_id", paramString);
          paramk.putExtra("preceding_scence", 11);
          paramk.putExtra("download_entrance_scene", 14);
          com.tencent.mm.bj.d.b(this.mActivity, "emoji", ".ui.EmojiStoreDetailUI", paramk);
          w.i("MicroMsg.QBarStringHandler", "[oneliang]NetSceneScanEmoji onSceneEnd.");
          if (this.oAw != null) {
            this.oAw.l(3, null);
          }
          GMTrace.o(6167036166144L, 45948);
        }
      }
      else {
        w.i("MicroMsg.QBarStringHandler", "jump emotion detail failed.");
      }
    }
    GMTrace.o(6167036166144L, 45948);
  }
  
  public final void a(final Activity paramActivity, final String paramString, int paramInt1, int paramInt2, int paramInt3, a parama, Bundle paramBundle)
  {
    GMTrace.i(16139144921088L, 120246);
    w.i("MicroMsg.QBarStringHandler", "deal QBarString %s, source:%d, codeType: %s, codeVersion: %s", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mActivity = paramActivity;
    this.oAt = paramInt1;
    this.oAu = paramString;
    this.oAw = parama;
    this.oAv = paramBundle;
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.QBarStringHandler", "qbarstring is null or nil");
      GMTrace.o(16139144921088L, 120246);
      return;
    }
    if (at.wS().DN() == 0)
    {
      Toast.makeText(paramActivity, paramActivity.getString(R.l.dwI), 0).show();
      if (this.oAw != null) {
        this.oAw.l(0, null);
      }
      GMTrace.o(16139144921088L, 120246);
      return;
    }
    parama = "";
    if (paramString.startsWith("weixin://qr/")) {
      parama = paramString.substring(12) + "@qr";
    }
    while (!bg.nm(parama))
    {
      a(paramActivity, paramInt1, parama, false);
      GMTrace.o(16139144921088L, 120246);
      return;
      if (paramString.startsWith("http://weixin.qq.com/r/")) {
        parama = paramString.substring(23) + "@qr";
      }
    }
    w.d("MicroMsg.QBarStringHandler", "qbarString: %s, auth native: %s, remittance: %s", new Object[] { paramString, Boolean.valueOf(true), Boolean.valueOf(true) });
    if (paramString.startsWith("weixin://wxpay/bizpayurl"))
    {
      w.i("MicroMsg.QBarStringHandler", "do native pay");
      paramInt1 = tA(this.oAt);
      paramInt2 = sY(paramInt1);
      paramActivity = new lj();
      paramActivity.ePF.url = paramString;
      paramActivity.ePF.ePH = paramInt2;
      paramActivity.ePF.scene = paramInt1;
      paramActivity.ePF.context = this.mActivity;
      if (paramInt2 == 13)
      {
        w.d("MicroMsg.QBarStringHandler", "add source and sourceType");
        paramActivity.ePF.aEe = this.aEe;
        paramActivity.ePF.eDi = this.eDi;
      }
      paramActivity.eDO = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6172404875264L, 45988);
          if ((e.this.getContext() == null) || (paramActivity.ePG == null))
          {
            GMTrace.o(6172404875264L, 45988);
            return;
          }
          if (paramActivity.ePG.ret == 1)
          {
            e.this.gL(true);
            GMTrace.o(6172404875264L, 45988);
            return;
          }
          if (paramActivity.ePG.ret == 2) {
            e.this.gL(false);
          }
          GMTrace.o(6172404875264L, 45988);
        }
      };
      com.tencent.mm.sdk.b.a.vgX.a(paramActivity, Looper.myLooper());
      new ae(Looper.getMainLooper()).postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6177639366656L, 46027);
          if (e.this.oAw != null) {
            e.this.oAw.l(3, null);
          }
          GMTrace.o(6177639366656L, 46027);
        }
      }, 200L);
      GMTrace.o(16139144921088L, 120246);
      return;
    }
    if ((paramString.startsWith("https://wx.tenpay.com/f2f")) || (paramString.startsWith("wxp://f2f")))
    {
      if (this.oAw != null) {
        this.oAw.l(5, null);
      }
      paramInt1 = sY(tA(this.oAt));
      com.tencent.mm.pluginsdk.wallet.g.a(this.mActivity, 1, paramString, paramInt1, null);
      if (this.oAw != null) {
        this.oAw.l(3, null);
      }
      GMTrace.o(16139144921088L, 120246);
      return;
    }
    if (paramString.startsWith("wxp://wbf2f"))
    {
      if (this.oAw != null) {
        this.oAw.l(5, null);
      }
      paramInt1 = sY(tA(this.oAt));
      com.tencent.mm.pluginsdk.wallet.g.a(this.mActivity, 6, paramString, paramInt1, null);
      if (this.oAw != null) {
        this.oAw.l(3, null);
      }
      GMTrace.o(16139144921088L, 120246);
      return;
    }
    if ((paramInt2 == 22) && (paramString.startsWith("m")))
    {
      w.d("MicroMsg.QBarStringHandler", "go to reward");
      if (this.oAw != null) {
        this.oAw.l(5, null);
      }
      paramInt2 = sY(tA(this.oAt));
      paramActivity = "";
      if (paramBundle != null) {
        paramActivity = paramBundle.getString("stat_url", "");
      }
      paramInt1 = 1;
      if (this.oAy == 37) {
        paramInt1 = 2;
      }
      for (;;)
      {
        parama = this.mActivity;
        paramBundle = new Intent();
        paramBundle.putExtra("key_qrcode_url", paramString);
        paramBundle.putExtra("key_channel", paramInt2);
        paramBundle.putExtra("key_web_url", paramActivity);
        paramBundle.putExtra("key_scene", paramInt1);
        com.tencent.mm.bj.d.b(parama, "collect", ".reward.ui.QrRewardSelectMoneyUI", paramBundle);
        if (this.oAw != null) {
          this.oAw.l(3, null);
        }
        GMTrace.o(16139144921088L, 120246);
        return;
        if (this.oAy == 38) {
          paramInt1 = 3;
        } else if (this.oAy == 40) {
          paramInt1 = 4;
        }
      }
    }
    if (paramString.startsWith("wxhb://f2f"))
    {
      w.i("MicroMsg.QBarStringHandler", "scan f2f hb url");
      if (paramInt2 != 19)
      {
        GMTrace.o(16139144921088L, 120246);
        return;
      }
      if (this.oAw != null) {
        this.oAw.l(5, null);
      }
      paramActivity = new Intent();
      paramActivity.putExtra("key_share_url", paramString);
      com.tencent.mm.bj.d.b(this.mActivity, "luckymoney", ".f2f.ui.LuckyMoneyF2FReceiveUI", paramActivity, 1);
      GMTrace.o(16139144921088L, 120246);
      return;
    }
    parama = this.appId;
    if (this.oAy > 0) {}
    for (paramInt1 = this.oAy;; paramInt1 = tA(this.oAt))
    {
      w.i("MicroMsg.QBarStringHandler", "getA8Key text:%s, mQBarStringSource: %s, sceneValue: %s", new Object[] { paramString, Integer.valueOf(this.oAt), Integer.valueOf(paramInt1) });
      paramString = new l(paramString, paramInt1, paramInt2, paramInt3, parama, (int)System.currentTimeMillis(), new byte[0]);
      this.oAx.put(paramString, Integer.valueOf(1));
      at.wS().a(paramString, 0);
      if (this.jvl != null) {
        this.jvl.dismiss();
      }
      paramActivity.getString(R.l.cUG);
      this.jvl = h.a(paramActivity, paramActivity.getString(R.l.dPe), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(6162606981120L, 45915);
          at.wS().c(paramString);
          if (e.this.oAw != null) {
            e.this.oAw.l(1, null);
          }
          GMTrace.o(6162606981120L, 45915);
        }
      });
      GMTrace.o(16139144921088L, 120246);
      return;
    }
  }
  
  public final void bdq()
  {
    GMTrace.i(6166365077504L, 45943);
    w.i("MicroMsg.QBarStringHandler", "cancel Deal");
    this.oAu = null;
    this.mActivity = null;
    onPause();
    GMTrace.o(6166365077504L, 45943);
  }
  
  public final void gL(boolean paramBoolean)
  {
    GMTrace.i(6167304601600L, 45950);
    if (paramBoolean)
    {
      if (this.oAw != null)
      {
        this.oAw.l(1, null);
        GMTrace.o(6167304601600L, 45950);
      }
    }
    else if (this.oAw != null) {
      this.oAw.l(3, null);
    }
    GMTrace.o(6167304601600L, 45950);
  }
  
  public final Context getContext()
  {
    GMTrace.i(15373701218304L, 114543);
    Activity localActivity = this.mActivity;
    GMTrace.o(15373701218304L, 114543);
    return localActivity;
  }
  
  public final void onPause()
  {
    GMTrace.i(6166633512960L, 45945);
    w.i("MicroMsg.QBarStringHandler", "onPause");
    at.wS().b(106, this);
    at.wS().b(233, this);
    at.wS().b(666, this);
    GMTrace.o(6166633512960L, 45945);
  }
  
  public final void onResume()
  {
    GMTrace.i(6166499295232L, 45944);
    w.i("MicroMsg.QBarStringHandler", "onResume");
    at.wS().a(106, this);
    at.wS().a(233, this);
    at.wS().a(666, this);
    GMTrace.o(6166499295232L, 45944);
  }
  
  public static abstract interface a
  {
    public abstract void l(int paramInt, Bundle paramBundle);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */