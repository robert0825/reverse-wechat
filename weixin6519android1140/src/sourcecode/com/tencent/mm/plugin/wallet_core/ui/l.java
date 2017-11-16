package com.tencent.mm.plugin.wallet_core.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.lc;
import com.tencent.mm.g.a.lc.b;
import com.tencent.mm.g.a.mu;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class l
  extends com.tencent.mm.ui.base.k
  implements c
{
  private static HashMap<String, Boolean> rpb;
  public DialogInterface.OnCancelListener Fj;
  public ImageView gDc;
  private boolean isPaused;
  public View jBw;
  private Animation llN;
  private int llO;
  protected MyKeyboardWindow mKeyboard;
  protected View mLL;
  protected boolean oND;
  protected PayInfo oek;
  public TextView okD;
  public TextView ovy;
  protected com.tencent.mm.plugin.wallet_core.e.a qWf;
  public FavorPayInfo qYW;
  protected a qZB;
  public TextView qZM;
  public TextView roA;
  public EditHintPasswdView roB;
  public c roC;
  public View roD;
  public View roE;
  public TextView roF;
  public ImageView roG;
  public TextView roH;
  public TextView roI;
  public View roJ;
  public TextView roK;
  public a roL;
  public DialogInterface.OnClickListener roM;
  public boolean roN;
  protected boolean roO;
  public Bankcard roP;
  public TextView roQ;
  public View roR;
  public TextView roS;
  public ImageView roT;
  protected int roU;
  protected boolean roV;
  private int roW;
  private Animation roX;
  private String roY;
  private long roZ;
  public Button rot;
  public ImageView rou;
  public TextView rov;
  public TextView rox;
  public FavourLayout roy;
  public ImageView roz;
  boolean rpa;
  
  static
  {
    GMTrace.i(18039936385024L, 134408);
    rpb = new HashMap();
    GMTrace.o(18039936385024L, 134408);
  }
  
  public l(Context paramContext)
  {
    super(paramContext, a.j.tio);
    GMTrace.i(7007104925696L, 52207);
    this.qZB = null;
    this.qYW = new FavorPayInfo();
    this.roN = false;
    this.roO = true;
    this.roP = null;
    this.qWf = new com.tencent.mm.plugin.wallet_core.e.a();
    this.roU = 0;
    this.roV = false;
    this.roW = 0;
    this.llO = 0;
    this.roX = null;
    this.roY = "";
    this.roZ = -1L;
    this.rpa = false;
    this.isPaused = false;
    cm(paramContext);
    GMTrace.o(7007104925696L, 52207);
  }
  
  private void KD(String paramString)
  {
    GMTrace.i(7008983973888L, 52221);
    if (!TextUtils.isEmpty(paramString))
    {
      this.roH.setVisibility(0);
      this.roH.setText(paramString);
      GMTrace.o(7008983973888L, 52221);
      return;
    }
    w.i("MicroMsg.WalletPwdDialog", "ChargeFee is null");
    this.roH.setVisibility(8);
    GMTrace.o(7008983973888L, 52221);
  }
  
  public static l a(Context paramContext, Orders paramOrders, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard, PayInfo paramPayInfo, c paramc, View.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(7010460368896L, 52232);
    paramContext = a(paramContext, true, paramOrders, paramFavorPayInfo, paramBankcard, paramPayInfo, null, paramc, paramOnClickListener, paramOnCancelListener);
    GMTrace.o(7010460368896L, 52232);
    return paramContext;
  }
  
  public static l a(Context paramContext, String paramString1, double paramDouble, String paramString2, Bankcard paramBankcard, c paramc, View.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(7010997239808L, 52236);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(7010997239808L, 52236);
      return null;
    }
    l locall = new l(paramContext);
    locall.bzP();
    locall.a(paramOnCancelListener);
    locall.setOnCancelListener(paramOnCancelListener);
    locall.setCancelable(true);
    locall.KB(paramString1);
    locall.KC(com.tencent.mm.wallet_core.ui.e.d(paramDouble, paramString2));
    locall.roO = true;
    if (paramBankcard == null)
    {
      paramString1 = "";
      locall.f(paramBankcard);
      if (TextUtils.isEmpty(paramString1)) {
        break label177;
      }
    }
    label177:
    for (boolean bool = true;; bool = false)
    {
      locall.iZ(bool);
      if (paramBankcard != null) {
        locall.a(paramString1, paramOnClickListener, false);
      }
      locall.roC = paramc;
      locall.show();
      com.tencent.mm.ui.base.h.a(paramContext, locall);
      GMTrace.o(7010997239808L, 52236);
      return locall;
      paramString1 = paramBankcard.field_desc;
      break;
    }
  }
  
  public static l a(Context paramContext, String paramString1, String paramString2, c paramc, DialogInterface.OnCancelListener paramOnCancelListener, a parama)
  {
    GMTrace.i(7010728804352L, 52234);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(7010728804352L, 52234);
      return null;
    }
    paramContext = a(paramContext, paramString1, paramString2, "", paramc, paramOnCancelListener, parama);
    GMTrace.o(7010728804352L, 52234);
    return paramContext;
  }
  
  public static l a(Context paramContext, String paramString1, String paramString2, String paramString3, c paramc, DialogInterface.OnCancelListener paramOnCancelListener, a parama)
  {
    GMTrace.i(7010863022080L, 52235);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(7010863022080L, 52235);
      return null;
    }
    l locall = new l(paramContext);
    locall.bzP();
    locall.a(paramOnCancelListener);
    locall.setOnCancelListener(paramOnCancelListener);
    locall.setCancelable(true);
    locall.KB(paramString1);
    locall.KC(paramString2);
    locall.iZ(false);
    locall.roO = false;
    locall.roL = parama;
    locall.KD(paramString3);
    locall.roC = paramc;
    locall.show();
    com.tencent.mm.ui.base.h.a(paramContext, locall);
    GMTrace.o(7010863022080L, 52235);
    return locall;
  }
  
  public static l a(Context paramContext, boolean paramBoolean, Orders paramOrders, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard, PayInfo paramPayInfo, String paramString, c paramc, final View.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(7010594586624L, 52233);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(7010594586624L, 52233);
      return null;
    }
    if ((paramOrders == null) || (paramOrders.rhv == null) || (paramOrders.rhv.size() <= 0))
    {
      GMTrace.o(7010594586624L, 52233);
      return null;
    }
    Object localObject8 = b.rks.a(paramOrders);
    boolean bool1;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (localObject8 != null) {
      if ((paramFavorPayInfo != null) && (paramBankcard != null))
      {
        bool1 = false;
        if (paramBankcard.field_bankcardType.equalsIgnoreCase("CFT")) {
          bool1 = true;
        }
        localObject3 = ((a)localObject8).aC(paramFavorPayInfo.rgo, bool1);
        localObject4 = new HashMap();
        if ((((a)localObject8).rkm.qXB != null) && (((a)localObject8).rkm.qXB.qXL != null))
        {
          localObject5 = ((a)localObject8).rkm.qXB.qXL;
          if (!((a)localObject8).rko.containsKey(localObject3)) {
            break label2445;
          }
        }
      }
    }
    label544:
    label550:
    label661:
    label815:
    label837:
    label919:
    label1126:
    label1255:
    label1302:
    label1434:
    label1663:
    label1691:
    label1717:
    label1728:
    label2217:
    label2223:
    label2345:
    label2397:
    label2402:
    label2416:
    label2442:
    label2445:
    for (double d = ((com.tencent.mm.plugin.wallet.a.h)((a)localObject8).rko.get(localObject3)).qXO;; d = 0.0D)
    {
      int i = 0;
      Object localObject6;
      Object localObject7;
      Object localObject9;
      while (i < ((List)localObject5).size())
      {
        localObject6 = (com.tencent.mm.plugin.wallet.a.h)((List)localObject5).get(i);
        localObject2 = null;
        if ((((String)localObject3).equals("0")) && (!localObject6.equals("0")))
        {
          localObject1 = ((com.tencent.mm.plugin.wallet.a.h)localObject6).qXN;
          localObject1 = a.Kv((String)localObject1);
          if ((localObject1 == null) || (localObject1.length <= 0)) {
            break label550;
          }
          localObject1 = (com.tencent.mm.plugin.wallet.a.q)((a)localObject8).rkn.get(localObject1[0]);
          if (localObject1 == null) {
            break label550;
          }
          if (((com.tencent.mm.plugin.wallet.a.q)localObject1).qYq == 0) {
            break label544;
          }
        }
        for (int j = 1;; j = 0)
        {
          if ((j == 0) || (((com.tencent.mm.plugin.wallet.a.q)localObject1).qYt.size() <= 0)) {
            break label550;
          }
          localObject2 = ((com.tencent.mm.plugin.wallet.a.q)localObject1).qYt.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject7 = com.tencent.mm.platformtools.n.a((com.tencent.mm.bm.b)((Iterator)localObject2).next());
            localObject9 = (a.a)((Map)localObject4).get(localObject7);
            if ((localObject9 == null) || (((com.tencent.mm.plugin.wallet.a.h)localObject6).qXO > ((a.a)localObject9).rkp.qXO))
            {
              localObject9 = new a.a();
              ((a.a)localObject9).rkp = ((com.tencent.mm.plugin.wallet.a.h)localObject6);
              ((a.a)localObject9).nEp = ((com.tencent.mm.plugin.wallet.a.q)localObject1).nEp;
              ((a.a)localObject9).rkq = (((com.tencent.mm.plugin.wallet.a.h)localObject6).qXO - d);
              ((a.a)localObject9).rkr = ((com.tencent.mm.plugin.wallet.a.q)localObject1).qYr;
              ((Map)localObject4).put(localObject7, localObject9);
            }
          }
          localObject1 = localObject2;
          if (!((com.tencent.mm.plugin.wallet.a.h)localObject6).qXN.startsWith((String)localObject3)) {
            break;
          }
          localObject1 = localObject2;
          if (((String)localObject3).equals(((com.tencent.mm.plugin.wallet.a.h)localObject6).qXN)) {
            break;
          }
          localObject1 = ((com.tencent.mm.plugin.wallet.a.h)localObject6).qXN.replace((String)localObject3 + "-", "");
          break;
        }
        i += 1;
        continue;
        w.w("MicroMsg.FavorLogicHelper", "favorComposeList null or favorComposeList.favorComposeInfo null");
      }
      final Object localObject1 = ((a)localObject8).aB((String)localObject3, true);
      Object localObject2 = (a.a)((Map)localObject4).get(paramBankcard.field_bindSerial);
      localObject1 = (a.a)((Map)localObject1).get(paramBankcard.field_bankcardType);
      if ((localObject2 != null) && (((a.a)localObject2).rkp != null) && (!bg.nm(((a.a)localObject2).rkp.qXN)))
      {
        paramFavorPayInfo.rgo = ((a.a)localObject2).rkp.qXN;
        localObject1 = ((a)localObject8).bzs();
        localObject5 = paramFavorPayInfo;
        localObject2 = "";
        if ((paramPayInfo.ePL != 32) && (paramPayInfo.ePL != 33)) {
          break label1728;
        }
        localObject4 = paramPayInfo.tIC.getString("extinfo_key_5", "");
        localObject6 = paramPayInfo.tIC.getString("extinfo_key_1", "");
        localObject3 = paramContext.getString(a.i.tff);
        paramFavorPayInfo = (FavorPayInfo)localObject2;
        if (!bg.nm((String)localObject4))
        {
          localObject3 = localObject4;
          paramFavorPayInfo = (FavorPayInfo)localObject4;
        }
        if (bg.nm((String)localObject6)) {
          break label1717;
        }
        com.tencent.mm.kernel.h.xz();
        localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC((String)localObject6);
        if (localObject2 == null) {
          break label1691;
        }
        paramFavorPayInfo = ((x)localObject2).vk();
        localObject2 = new StringBuilder().append(com.tencent.mm.wallet_core.ui.e.XE(paramFavorPayInfo));
        if (!bg.nm(paramString)) {
          break label1663;
        }
        paramFavorPayInfo = "";
        paramFavorPayInfo = bg.i((String)localObject3, new Object[] { paramFavorPayInfo });
        if ((!bg.nm(paramFavorPayInfo)) || (paramOrders == null) || (paramOrders.rhv == null)) {
          break label2223;
        }
        localObject2 = (Orders.Commodity)paramOrders.rhv.get(0);
        if (localObject2 == null) {
          break label2442;
        }
        paramFavorPayInfo = ((Orders.Commodity)localObject2).nEg;
        if ((paramPayInfo == null) || ((paramPayInfo.ePL != 31) && (paramPayInfo.ePL != 32) && (paramPayInfo.ePL != 33))) {
          break label2217;
        }
        i = 1;
        paramString = paramFavorPayInfo;
        if (i != 0)
        {
          paramString = paramFavorPayInfo;
          if (!bg.nm(paramFavorPayInfo)) {
            paramString = paramFavorPayInfo + "\n";
          }
          paramString = paramString + ((Orders.Commodity)localObject2).desc;
        }
        paramFavorPayInfo = paramString;
        if (bg.nm(paramString)) {
          paramFavorPayInfo = ((Orders.Commodity)localObject2).desc;
        }
      }
      for (;;)
      {
        localObject6 = paramFavorPayInfo;
        localObject7 = null;
        localObject3 = null;
        Object localObject10;
        boolean bool2;
        if ((localObject8 != null) && (localObject5 != null))
        {
          localObject7 = ((a)localObject8).Ku(((FavorPayInfo)localObject5).rgo);
          if ((localObject7 != null) && (((com.tencent.mm.plugin.wallet.a.h)localObject7).qXG > 0.0D))
          {
            bool1 = true;
            localObject1 = com.tencent.mm.wallet_core.ui.e.d(paramOrders.rhd, paramOrders.nEr);
            paramFavorPayInfo = com.tencent.mm.wallet_core.ui.e.d(((com.tencent.mm.plugin.wallet.a.h)localObject7).qXF, paramOrders.nEr);
            paramString = ((com.tencent.mm.plugin.wallet.a.h)localObject7).qXI;
            if (rpb.containsKey(paramPayInfo.eHG)) {
              break label2416;
            }
            com.tencent.mm.plugin.report.service.g.ork.i(14530, new Object[] { Integer.valueOf(3) });
            localObject4 = null;
            localObject2 = paramFavorPayInfo;
            paramFavorPayInfo = (FavorPayInfo)localObject4;
            localObject4 = localObject3;
            if (localObject7 != null)
            {
              localObject4 = localObject3;
              if (((com.tencent.mm.plugin.wallet.a.h)localObject7).qXH != 0)
              {
                localObject3 = ((com.tencent.mm.plugin.wallet.a.h)localObject7).qXJ;
                localObject4 = localObject3;
                if (!bg.nm(paramString)) {
                  localObject4 = "," + (String)localObject3;
                }
              }
            }
            if (bg.nm(paramString))
            {
              localObject7 = localObject4;
              localObject3 = paramFavorPayInfo;
              localObject8 = paramString;
              localObject9 = localObject1;
              localObject10 = localObject2;
              bool2 = bool1;
              if (bg.nm((String)localObject4)) {}
            }
            else
            {
              if (!bg.nm(paramFavorPayInfo)) {
                break label2345;
              }
              localObject3 = null;
              bool2 = bool1;
              localObject10 = localObject2;
              localObject9 = localObject1;
              localObject8 = paramString;
              localObject7 = localObject4;
            }
          }
        }
        for (;;)
        {
          if (paramOrders.oml > 0.0D) {}
          for (paramFavorPayInfo = paramContext.getResources().getString(a.i.taT, new Object[] { com.tencent.mm.wallet_core.ui.e.d(paramOrders.oml, paramOrders.nEr) });; paramFavorPayInfo = null)
          {
            if (paramBankcard == null)
            {
              paramString = "";
              localObject1 = new l(paramContext);
              ((l)localObject1).a(paramContext, paramOrders, (FavorPayInfo)localObject5, paramBankcard);
              ((l)localObject1).iZ(paramBoolean);
              ((l)localObject1).roO = paramBoolean;
              ((l)localObject1).bzP();
              ((l)localObject1).a(new b(paramOnCancelListener));
              ((l)localObject1).setOnCancelListener(new b(paramOnCancelListener));
              ((l)localObject1).setCancelable(true);
              ((l)localObject1).KB((String)localObject6);
              ((l)localObject1).KC((String)localObject10);
              ((l)localObject1).KE((String)localObject9);
              ((l)localObject1).a(paramString, new View.OnClickListener()
              {
                public final void onClick(View paramAnonymousView)
                {
                  GMTrace.i(18038191554560L, 134395);
                  l.bzT().put(this.nBM.eHG, Boolean.valueOf(true));
                  paramOnClickListener.onClick(paramAnonymousView);
                  if (localObject1.rpa) {
                    com.tencent.mm.plugin.report.service.g.ork.i(14530, new Object[] { Integer.valueOf(2) });
                  }
                  GMTrace.o(18038191554560L, 134395);
                }
              }, bool2);
              ((l)localObject1).f(paramBankcard);
              if (paramOrders.rht != 1) {
                break label2397;
              }
              paramBoolean = true;
              ((l)localObject1).oek = paramPayInfo;
              ((l)localObject1).roV = paramBoolean;
              if (!com.tencent.mm.y.q.zR()) {
                ((l)localObject1).bzK();
              }
              ((l)localObject1).ee((String)localObject8, (String)localObject3);
              paramString = paramOrders.nEr;
              ((l)localObject1).KF((String)localObject7);
              ((l)localObject1).KD(paramFavorPayInfo);
              ((l)localObject1).roC = paramc;
              ((l)localObject1).ao(a(paramBankcard, paramOrders));
              if (!a(paramBankcard, paramOrders, paramPayInfo.eHG)) {
                break label2402;
              }
              ((l)localObject1).iY(true);
              com.tencent.mm.plugin.report.service.g.ork.i(14530, new Object[] { Integer.valueOf(1) });
            }
            for (;;)
            {
              ((l)localObject1).show();
              com.tencent.mm.ui.base.h.a(paramContext, (Dialog)localObject1);
              GMTrace.o(7010594586624L, 52233);
              return (l)localObject1;
              if ((localObject1 != null) && (((a.a)localObject1).rkp != null) && (!bg.nm(((a.a)localObject1).rkp.qXN)))
              {
                paramFavorPayInfo.rgo = ((a.a)localObject1).rkp.qXN;
                break;
              }
              paramFavorPayInfo.rgo = ((String)localObject3);
              break;
              if (paramOrders.rhw == null) {
                break;
              }
              paramFavorPayInfo = ((a)localObject8).Kx(((a)localObject8).Ky(paramOrders.rhw.qXz));
              break;
              w.d("MicroMsg.WalletPwdDialog", "getFavorLogicHelper null");
              localObject1 = null;
              localObject5 = paramFavorPayInfo;
              break label661;
              paramFavorPayInfo = "(" + paramString + ")";
              break label815;
              w.e("MicroMsg.WalletPwdDialog", "can not found contact for user::" + (String)localObject6);
              break label837;
              w.e("MicroMsg.WalletPwdDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
              break label837;
              if (paramPayInfo.ePL == 31)
              {
                paramFavorPayInfo = paramPayInfo.tIC.getString("extinfo_key_1", "");
                if (!bg.nm(paramFavorPayInfo))
                {
                  com.tencent.mm.kernel.h.xz();
                  localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC(paramFavorPayInfo);
                  if (localObject3 != null)
                  {
                    paramFavorPayInfo = ((x)localObject3).vj();
                    i = a.i.tff;
                    localObject2 = new StringBuilder().append(paramFavorPayInfo);
                    if (bg.nm(paramString)) {}
                    for (paramFavorPayInfo = "";; paramFavorPayInfo = "(" + paramString + ")")
                    {
                      paramFavorPayInfo = paramContext.getString(i, new Object[] { paramFavorPayInfo });
                      break;
                    }
                  }
                  w.e("MicroMsg.WalletPwdDialog", "can not found contact for user::" + paramFavorPayInfo);
                  paramFavorPayInfo = (FavorPayInfo)localObject2;
                  break label837;
                }
                w.e("MicroMsg.WalletPwdDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                paramFavorPayInfo = (FavorPayInfo)localObject2;
                break label837;
              }
              if (paramPayInfo.ePL == 42)
              {
                paramFavorPayInfo = paramPayInfo.tIC.getString("extinfo_key_1", "");
                if (!bg.nm(paramFavorPayInfo))
                {
                  com.tencent.mm.kernel.h.xz();
                  localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC(paramFavorPayInfo);
                  if (localObject3 != null)
                  {
                    paramFavorPayInfo = ((x)localObject3).vj();
                    i = a.i.tfb;
                    localObject2 = new StringBuilder().append(paramFavorPayInfo);
                    if (bg.nm(paramString)) {}
                    for (paramFavorPayInfo = "";; paramFavorPayInfo = "(" + paramString + ")")
                    {
                      paramFavorPayInfo = paramContext.getString(i, new Object[] { paramFavorPayInfo });
                      break;
                    }
                  }
                  w.e("MicroMsg.WalletPwdDialog", "can not found contact for user::" + paramFavorPayInfo);
                  paramFavorPayInfo = (FavorPayInfo)localObject2;
                  break label837;
                }
                w.e("MicroMsg.WalletPwdDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                paramFavorPayInfo = (FavorPayInfo)localObject2;
                break label837;
              }
              if (paramPayInfo.ePL == 48)
              {
                paramFavorPayInfo = paramContext.getString(a.i.sWQ);
                break label837;
              }
              paramFavorPayInfo = (FavorPayInfo)localObject2;
              if (paramPayInfo.ePL != 49) {
                break label837;
              }
              paramFavorPayInfo = paramPayInfo.tIC.getString("extinfo_key_1", "");
              if (!bg.nm(paramFavorPayInfo))
              {
                paramFavorPayInfo = paramContext.getString(a.i.tff, new Object[] { paramFavorPayInfo });
                break label837;
              }
              w.e("MicroMsg.WalletPwdDialog", "userName is null, scene is %s", new Object[] { Integer.valueOf(paramPayInfo.ePL) });
              paramFavorPayInfo = (FavorPayInfo)localObject2;
              break label837;
              i = 0;
              break label919;
              paramString = new StringBuilder("orders null?:");
              if (paramOrders == null) {}
              for (bool1 = true;; bool1 = false)
              {
                w.w("MicroMsg.WalletPwdDialog", bool1);
                localObject6 = paramFavorPayInfo;
                break;
              }
              if ((localObject1 != null) && (((List)localObject1).size() > 0))
              {
                localObject2 = com.tencent.mm.wallet_core.ui.e.d(((com.tencent.mm.plugin.wallet.a.h)localObject7).qXF, paramOrders.nEr);
                bool1 = true;
                paramFavorPayInfo = paramContext.getString(a.i.tfd);
                paramString = null;
                localObject1 = null;
                break label1126;
              }
              localObject2 = com.tencent.mm.wallet_core.ui.e.d(paramOrders.rhd, paramOrders.nEr);
              bool1 = false;
              localObject1 = null;
              paramFavorPayInfo = null;
              paramString = null;
              break label1126;
              localObject3 = "," + paramFavorPayInfo;
              localObject7 = localObject4;
              localObject8 = paramString;
              localObject9 = localObject1;
              localObject10 = localObject2;
              bool2 = bool1;
              break label1255;
              paramString = paramBankcard.field_desc;
              break label1302;
              paramBoolean = false;
              break label1434;
              ((l)localObject1).iY(false);
            }
          }
          localObject2 = paramFavorPayInfo;
          paramFavorPayInfo = null;
          break label1126;
          localObject3 = null;
          localObject8 = null;
          localObject9 = null;
          localObject10 = null;
          bool2 = false;
        }
      }
    }
  }
  
  private static LinkedList<String> a(Bankcard paramBankcard, Orders paramOrders)
  {
    GMTrace.i(18039533731840L, 134405);
    LinkedList localLinkedList = new LinkedList();
    if ((paramOrders != null) && (paramOrders.rhw != null) && (paramOrders.rhw.qXK != null))
    {
      paramOrders = paramOrders.rhw.qXK.qXo.iterator();
      while (paramOrders.hasNext())
      {
        com.tencent.mm.plugin.wallet.a.b localb = (com.tencent.mm.plugin.wallet.a.b)paramOrders.next();
        if (localb.nDu.equals(paramBankcard.field_bindSerial))
        {
          paramBankcard = localb.qXq.iterator();
          while (paramBankcard.hasNext())
          {
            paramOrders = (com.tencent.mm.plugin.wallet.a.c)paramBankcard.next();
            if (paramOrders.qXs != 0) {
              localLinkedList.add(paramOrders.qXr);
            }
          }
          GMTrace.o(18039533731840L, 134405);
          return localLinkedList;
        }
      }
    }
    GMTrace.o(18039533731840L, 134405);
    return localLinkedList;
  }
  
  private static boolean a(Bankcard paramBankcard, Orders paramOrders, String paramString)
  {
    GMTrace.i(18039667949568L, 134406);
    if (rpb.containsKey(paramString))
    {
      GMTrace.o(18039667949568L, 134406);
      return false;
    }
    int j;
    if ((paramOrders.rhw != null) && (paramOrders.rhw.qXK != null)) {
      if (paramOrders.rhw.qXK.qXo.size() > 0)
      {
        paramString = paramOrders.rhw.qXK.qXo.iterator();
        int i = 0;
        j = i;
        if (!paramString.hasNext()) {
          break label133;
        }
        com.tencent.mm.plugin.wallet.a.b localb = (com.tencent.mm.plugin.wallet.a.b)paramString.next();
        if ((localb.nDu == null) || (!localb.nDu.equals(paramBankcard.field_bindSerial))) {
          break label230;
        }
        i = 1;
      }
    }
    label133:
    label230:
    for (;;)
    {
      break;
      j = 0;
      if (j != 0)
      {
        GMTrace.o(18039667949568L, 134406);
        return false;
      }
      if (paramOrders.rhw.qXK.qXo.size() > 0)
      {
        GMTrace.o(18039667949568L, 134406);
        return true;
      }
      if ((paramOrders.rhw.qXK.qXp != null) && (paramOrders.rhw.qXK.qXp.qXU.size() > 0))
      {
        GMTrace.o(18039667949568L, 134406);
        return true;
      }
      GMTrace.o(18039667949568L, 134406);
      return false;
    }
  }
  
  private void ao(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(18039265296384L, 134403);
    if (this.roy != null)
    {
      if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
      {
        this.roy.ap(paramLinkedList);
        this.roy.setVisibility(0);
        GMTrace.o(18039265296384L, 134403);
        return;
      }
      this.roy.setVisibility(8);
    }
    GMTrace.o(18039265296384L, 134403);
  }
  
  private void bzK()
  {
    GMTrace.i(7007641796608L, 52211);
    w.v("MicroMsg.WalletPwdDialog", "alvinluo updateFingerprintMode");
    this.roW = 0;
    this.roQ.setVisibility(8);
    this.roR.setVisibility(8);
    this.roZ = bg.Pw();
    Object localObject = com.tencent.mm.plugin.wallet_core.model.n.byx();
    com.tencent.mm.pluginsdk.k localk = (com.tencent.mm.pluginsdk.k)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.k.class);
    if ((localObject != null) && (localk.azt())) {}
    for (boolean bool1 = localk.azM();; bool1 = true)
    {
      w.i("MicroMsg.WalletPwdDialog", "hy: soter key status: %b", new Object[] { Boolean.valueOf(bool1) });
      if (((this.oek != null) && ((this.oek.tIF == 100000) || (this.oek.tIF == 100102))) || (!bool1))
      {
        if (!this.mLL.isShown()) {
          this.mLL.setVisibility(0);
        }
        if (this.oek != null)
        {
          this.oek.tID = 0;
          this.oek.eJR = "";
          this.oek.eJS = "";
        }
        this.roR.setVisibility(0);
        this.roS.setVisibility(0);
        localObject = this.roS;
        int i;
        if ((this.oek != null) && (this.oek.tIF == 100102))
        {
          i = a.i.tbN;
          ((TextView)localObject).setText(i);
          this.roS.setTextColor(getContext().getResources().getColor(a.c.smX));
          if (bool1) {
            break label418;
          }
          this.roE.setVisibility(0);
          this.roF.setVisibility(0);
        }
        for (;;)
        {
          if ((this.oek != null) && (this.oek.tIF == 100102))
          {
            com.tencent.mm.kernel.h.xy().xh().a(w.a.vrE, Boolean.valueOf(true));
            localk.eD(false);
            com.tencent.mm.kernel.h.xy().xh().a(w.a.vrC, Boolean.valueOf(false));
          }
          com.tencent.mm.plugin.report.service.g.ork.i(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(7007641796608L, 52211);
          return;
          i = a.i.tbK;
          break;
          label418:
          this.roE.setVisibility(8);
          this.roF.setVisibility(8);
        }
      }
      if ((this.oek != null) && (this.oek.tIF == 100001)) {
        this.oek.tID = 1;
      }
      if ((localk != null) && (localk.azA()) && (!localk.azv())) {}
      for (bool1 = true;; bool1 = false)
      {
        w.v("MicroMsg.WalletPwdDialog", "alvinluo isDeviceSupportFp: %b", new Object[] { Boolean.valueOf(bool1) });
        boolean bool2;
        if ((localk != null) && (localk.azt()))
        {
          bool2 = true;
          if ((!bool2) || (!bool1) || (!this.roV) || (bzR())) {
            break label787;
          }
          this.roQ.setVisibility(0);
          this.roQ.setText(getContext().getString(a.i.tfi));
          this.roU = 1;
          this.roR.setVisibility(0);
          this.roT.setVisibility(0);
          this.roB.setVisibility(8);
          this.mLL.setVisibility(8);
          this.rov.setText(a.i.tfc);
          if (this.oek != null) {
            this.oek.tID = 1;
          }
          bzM();
          com.tencent.mm.plugin.report.service.g.ork.i(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        }
        for (;;)
        {
          w.i("MicroMsg.WalletPwdDialog", "isOpenTouch:" + bool2 + ",  isDeviceSupport:" + bool1 + ", use_pay_touch:" + this.roV + ", isForcePwdMode:" + bzR());
          this.roQ.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(6984690565120L, 52040);
              if (l.this.roU == 0) {
                l.a(l.this);
              }
              for (;;)
              {
                if (l.this.roU == 1)
                {
                  l.bzS();
                  if (l.c(l.this)) {
                    l.d(l.this);
                  }
                }
                GMTrace.o(6984690565120L, 52040);
                return;
                if (l.this.roU == 1) {
                  l.b(l.this);
                }
              }
            }
          });
          GMTrace.o(7007641796608L, 52211);
          return;
          bool2 = false;
          break;
          label787:
          if ((bool2) && (bool1) && (this.roV) && (bzR()))
          {
            this.roQ.setText(getContext().getString(a.i.tbL));
            this.roQ.setVisibility(0);
            this.roU = 0;
            this.roR.setVisibility(8);
            this.roB.setVisibility(0);
            if (!this.mLL.isShown()) {
              this.mLL.setVisibility(0);
            }
            this.rov.setText(a.i.tfg);
            if (this.oek != null) {
              this.oek.tID = 0;
            }
            com.tencent.mm.plugin.report.service.g.ork.i(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
            com.tencent.mm.wallet_core.ui.e.EQ(8);
          }
          else
          {
            if (this.oek != null) {
              this.oek.tID = 0;
            }
            this.roQ.setVisibility(8);
            com.tencent.mm.plugin.report.service.g.ork.i(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          }
        }
      }
    }
  }
  
  private void bzL()
  {
    GMTrace.i(16594411454464L, 123638);
    this.roQ.setText(getContext().getString(a.i.tbL));
    this.roU = 0;
    this.roZ = bg.Pw();
    this.roR.setVisibility(8);
    this.roB.setVisibility(0);
    if (!this.mLL.isShown()) {
      this.mLL.setVisibility(0);
    }
    this.rov.setText(a.i.tfg);
    ja(true);
    this.oek.tID = 0;
    com.tencent.mm.plugin.report.service.g.ork.i(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    com.tencent.mm.wallet_core.ui.e.EQ(29);
    bzN();
    GMTrace.o(16594411454464L, 123638);
  }
  
  private void bzM()
  {
    GMTrace.i(7007776014336L, 52212);
    com.tencent.mm.plugin.soter.c.a.bqz();
    final lc locallc = new lc();
    locallc.ePm.eJQ = this.oek.eHG;
    locallc.ePm.ePo = 1;
    locallc.ePm.ePq = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6931942998016L, 51647);
        w.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback");
        Object localObject = locallc.ePn;
        if (localObject == null)
        {
          l.this.oek.tID = 0;
          w.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback, result == null");
          GMTrace.o(6931942998016L, 51647);
          return;
        }
        int i = ((lc.b)localObject).errCode;
        w.v("MicroMsg.WalletPwdDialog", "alvinluo errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(i), ((lc.b)localObject).eAR });
        if (i == 0)
        {
          w.i("MicroMsg.WalletPwdDialog", "hy: payInfo soterAuthReq: %s", new Object[] { ((lc.b)localObject).ePr });
          l.this.oek.tID = 1;
          l.this.oek.eJR = ((lc.b)localObject).eJR;
          l.this.oek.eJS = ((lc.b)localObject).eJS;
          l.this.oek.ePr = ((lc.b)localObject).ePr;
          l.this.oek.eJP = ((lc.b)localObject).eJP;
          localObject = l.this.oek;
          ((PayInfo)localObject).tIE += 1;
          l.this.roS.setText("");
          l.this.bzQ();
          com.tencent.mm.plugin.report.service.g.ork.i(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2) });
          com.tencent.mm.plugin.soter.c.a.vL(0);
          GMTrace.o(6931942998016L, 51647);
          return;
        }
        w.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
        l.this.oek.tID = 0;
        l.this.roR.setVisibility(0);
        l.this.roS.setTextColor(l.this.getContext().getResources().getColor(a.c.aOL));
        l.this.roS.setText(a.i.tbJ);
        int j = (int)(System.currentTimeMillis() / 1000L);
        int k = j - l.e(l.this);
        if (k > 1)
        {
          l.a(l.this, j);
          l.f(l.this);
          PayInfo localPayInfo = l.this.oek;
          localPayInfo.tIE += 1;
        }
        com.tencent.mm.plugin.report.service.g.ork.i(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2) });
        boolean bool1;
        if ((i == 2) || (i == 10308))
        {
          bool1 = true;
          if (((lc.b)localObject).ePs != 2) {
            break label699;
          }
        }
        label699:
        for (boolean bool2 = true;; bool2 = false)
        {
          w.v("MicroMsg.WalletPwdDialog", "alvinluo shouldDirectlyFail: %b, mIdentifyFail: %d, errCode: %d, isSoter: %b", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(l.g(l.this)), Integer.valueOf(i), Boolean.valueOf(bool2) });
          if (((!bool2) && ((l.g(l.this) >= 3) || (k <= 1))) || (bool1)) {
            break label705;
          }
          w.v("MicroMsg.WalletPwdDialog", "alvinluo fingerprint pay");
          if (l.h(l.this) == null) {
            l.a(l.this, com.tencent.mm.ui.c.a.fg(l.this.getContext()));
          }
          l.this.roT.setVisibility(8);
          l.this.roS.setVisibility(4);
          l.h(l.this).reset();
          l.h(l.this).setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymous2Animation)
            {
              GMTrace.i(7003749482496L, 52182);
              w.i("MicroMsg.WalletPwdDialog", "hy: on flash end");
              com.tencent.mm.sdk.platformtools.af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(6945633206272L, 51749);
                  l.this.roS.setVisibility(8);
                  l.this.roT.setVisibility(0);
                  GMTrace.o(6945633206272L, 51749);
                }
              });
              GMTrace.o(7003749482496L, 52182);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymous2Animation)
            {
              GMTrace.i(7003883700224L, 52183);
              GMTrace.o(7003883700224L, 52183);
            }
            
            public final void onAnimationStart(Animation paramAnonymous2Animation)
            {
              GMTrace.i(7003615264768L, 52181);
              w.i("MicroMsg.WalletPwdDialog", "hy: on flash start");
              com.tencent.mm.sdk.platformtools.af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(6919326531584L, 51553);
                  l.this.roS.setVisibility(0);
                  GMTrace.o(6919326531584L, 51553);
                }
              });
              GMTrace.o(7003615264768L, 52181);
            }
          });
          l.this.roS.startAnimation(l.h(l.this));
          com.tencent.mm.plugin.soter.c.a.vL(1);
          GMTrace.o(6931942998016L, 51647);
          return;
          bool1 = false;
          break;
        }
        label705:
        if ((l.g(l.this) >= 3) || (bool1))
        {
          w.v("MicroMsg.WalletPwdDialog", "alvinluo change to pwd pay");
          l.bzS();
          l.this.roU = 0;
          l.i(l.this);
          l.this.roQ.setVisibility(8);
          l.this.roR.setVisibility(8);
          l.this.roS.setVisibility(0);
          l.this.roS.setText(a.i.tbK);
          l.this.roS.setTextColor(l.this.getContext().getResources().getColor(a.c.smX));
          l.this.rov.setText(a.i.tfg);
          l.this.roB.setVisibility(0);
          if (!l.this.mLL.isShown()) {
            l.this.mLL.setVisibility(0);
          }
          com.tencent.mm.plugin.soter.c.a.vL(2);
          l.jb(true);
        }
        GMTrace.o(6931942998016L, 51647);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.a(locallc, Looper.getMainLooper());
    GMTrace.o(7007776014336L, 52212);
  }
  
  private static void bzN()
  {
    GMTrace.i(7007910232064L, 52213);
    w.i("MicroMsg.WalletPwdDialog", "hy: send release FPManager");
    mu localmu = new mu();
    com.tencent.mm.sdk.b.a.vgX.m(localmu);
    GMTrace.o(7007910232064L, 52213);
  }
  
  private static boolean bzR()
  {
    GMTrace.i(7011534110720L, 52240);
    com.tencent.mm.kernel.h.xz();
    Object localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vry, Boolean.valueOf(false));
    if (localObject != null) {}
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      GMTrace.o(7011534110720L, 52240);
      return bool;
    }
  }
  
  private void f(Bankcard paramBankcard)
  {
    GMTrace.i(7009386627072L, 52224);
    if (paramBankcard == null)
    {
      w.e("MicroMsg.WalletPwdDialog", "setBankcardText bankcard == null");
      GMTrace.o(7009386627072L, 52224);
      return;
    }
    if (paramBankcard.byd())
    {
      this.roz.setImageResource(a.e.soT);
      GMTrace.o(7009386627072L, 52224);
      return;
    }
    if (paramBankcard.bye())
    {
      this.qWf.a(paramBankcard, this.roz);
      GMTrace.o(7009386627072L, 52224);
      return;
    }
    this.qWf.a(getContext(), paramBankcard, this.roz);
    GMTrace.o(7009386627072L, 52224);
  }
  
  private void iY(boolean paramBoolean)
  {
    GMTrace.i(18039131078656L, 134402);
    View localView = this.jBw.findViewById(a.f.sqj);
    if (localView != null)
    {
      if (paramBoolean)
      {
        localView.setVisibility(0);
        this.rpa = true;
        GMTrace.o(18039131078656L, 134402);
        return;
      }
      localView.setVisibility(8);
      this.rpa = false;
    }
    GMTrace.o(18039131078656L, 134402);
  }
  
  private static void ja(boolean paramBoolean)
  {
    GMTrace.i(7011399892992L, 52239);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vry, Boolean.valueOf(paramBoolean));
    GMTrace.o(7011399892992L, 52239);
  }
  
  public final void KB(String paramString)
  {
    GMTrace.i(7008715538432L, 52219);
    this.ovy.setText(paramString);
    GMTrace.o(7008715538432L, 52219);
  }
  
  public final void KC(String paramString)
  {
    GMTrace.i(7008849756160L, 52220);
    if (!TextUtils.isEmpty(paramString))
    {
      this.okD.setVisibility(0);
      this.okD.setText(paramString);
      GMTrace.o(7008849756160L, 52220);
      return;
    }
    this.okD.setVisibility(8);
    GMTrace.o(7008849756160L, 52220);
  }
  
  public final void KE(String paramString)
  {
    GMTrace.i(7009252409344L, 52223);
    if (!TextUtils.isEmpty(paramString))
    {
      this.qZM.setVisibility(0);
      this.qZM.setText(paramString);
      GMTrace.o(7009252409344L, 52223);
      return;
    }
    this.qZM.setVisibility(8);
    GMTrace.o(7009252409344L, 52223);
  }
  
  public final void KF(String paramString)
  {
    GMTrace.i(7010326151168L, 52231);
    if (!bg.nm(paramString))
    {
      this.roI.setText(paramString);
      this.roI.setVisibility(0);
      GMTrace.o(7010326151168L, 52231);
      return;
    }
    this.roI.setVisibility(8);
    GMTrace.o(7010326151168L, 52231);
  }
  
  public final void a(final Context paramContext, final Orders paramOrders, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard)
  {
    GMTrace.i(7009655062528L, 52226);
    this.qZB = b.rks.a(paramOrders);
    if ((paramOrders != null) && (paramOrders.rhw != null) && (paramOrders.rhw.qXA != null) && (paramOrders.rhw.qXA.size() > 0) && (this.qZB != null))
    {
      if (paramFavorPayInfo == null) {}
      for (this.qYW = this.qZB.Kx(paramOrders.rhw.qXz);; this.qYW = paramFavorPayInfo)
      {
        this.roA.setVisibility(0);
        if (this.roE != null) {
          this.roE.setTag(this.qYW);
        }
        this.roP = paramBankcard;
        this.roJ.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6951270350848L, 51791);
            l.this.roG.setVisibility(8);
            h.a(paramContext, paramOrders, l.this.qYW.rgo, new h.b()
            {
              public final void a(FavorPayInfo paramAnonymous2FavorPayInfo)
              {
                Object localObject2 = null;
                GMTrace.i(6917447483392L, 51539);
                l.this.qYW = paramAnonymous2FavorPayInfo;
                l.this.roN = false;
                int i = l.this.qYW.rgp;
                String str1 = l.this.qYW.rgq;
                paramAnonymous2FavorPayInfo = com.tencent.mm.plugin.wallet_core.model.n.byx().iL(true);
                if (i != 0) {}
                for (i = 1; i == 0; i = 0)
                {
                  l.this.qYW.rgs = "";
                  if (!a.a(l.this.qYW, l.this.roP)) {
                    break label386;
                  }
                  l.this.roN = true;
                  if (paramAnonymous2FavorPayInfo.size() != 0) {
                    break label357;
                  }
                  l.this.qYW.rgs = l.6.this.val$context.getString(a.i.tbG);
                  label167:
                  l.this.dismiss();
                  if (l.this.roC == null) {
                    break label386;
                  }
                  l.this.roC.a(l.this.roB.getText(), l.this.qYW, l.this.roN);
                  GMTrace.o(6917447483392L, 51539);
                  return;
                }
                Object localObject1 = new ArrayList();
                int j = 0;
                label263:
                if (j < paramAnonymous2FavorPayInfo.size()) {
                  if (bg.nm(str1))
                  {
                    if (((Bankcard)paramAnonymous2FavorPayInfo.get(j)).field_bankcardType.equals("CFT")) {
                      break label721;
                    }
                    i = 1;
                  }
                }
                for (;;)
                {
                  if (i != 0) {
                    ((List)localObject1).add((Bankcard)paramAnonymous2FavorPayInfo.get(j));
                  }
                  j += 1;
                  break label263;
                  if (((Bankcard)paramAnonymous2FavorPayInfo.get(j)).field_bankcardType.equals(str1))
                  {
                    i = 1;
                    continue;
                    paramAnonymous2FavorPayInfo = (FavorPayInfo)localObject1;
                    break;
                    label357:
                    l.this.qYW.rgs = l.6.this.val$context.getString(a.i.tbH);
                    break label167;
                    label386:
                    if (l.this.roE != null) {
                      l.this.roE.setTag(l.this.qYW);
                    }
                    localObject1 = l.this.qZB.Ku(l.this.qYW.rgo);
                    String str3;
                    String str2;
                    String str4;
                    if ((localObject1 != null) && (((com.tencent.mm.plugin.wallet.a.h)localObject1).qXG > 0.0D))
                    {
                      str3 = com.tencent.mm.wallet_core.ui.e.s(((com.tencent.mm.plugin.wallet.a.h)localObject1).qXF);
                      str2 = com.tencent.mm.wallet_core.ui.e.s(l.6.this.rpg.rhw.qXw);
                      str1 = ((com.tencent.mm.plugin.wallet.a.h)localObject1).qXI;
                      paramAnonymous2FavorPayInfo = null;
                      if ((localObject1 == null) || (((com.tencent.mm.plugin.wallet.a.h)localObject1).qXH == 0)) {
                        break label715;
                      }
                      str4 = ((com.tencent.mm.plugin.wallet.a.h)localObject1).qXJ;
                      localObject1 = str4;
                      if (bg.nm(str1)) {}
                    }
                    label715:
                    for (localObject1 = "," + str4;; localObject1 = null)
                    {
                      if ((!bg.nm(str1)) || (!bg.nm((String)localObject1))) {
                        if (bg.nm(paramAnonymous2FavorPayInfo)) {
                          paramAnonymous2FavorPayInfo = (FavorPayInfo)localObject2;
                        }
                      }
                      for (;;)
                      {
                        l.this.KC(str3);
                        l.this.KE(str2);
                        l.this.ee(str1, paramAnonymous2FavorPayInfo);
                        paramAnonymous2FavorPayInfo = l.this;
                        str1 = l.6.this.rpg.nEr;
                        paramAnonymous2FavorPayInfo.KF((String)localObject1);
                        GMTrace.o(6917447483392L, 51539);
                        return;
                        str3 = com.tencent.mm.wallet_core.ui.e.s(l.6.this.rpg.rhw.qXw);
                        paramAnonymous2FavorPayInfo = l.6.this.val$context.getString(a.i.tfd);
                        str1 = null;
                        str2 = null;
                        break;
                        paramAnonymous2FavorPayInfo = "," + paramAnonymous2FavorPayInfo;
                      }
                    }
                  }
                  label721:
                  i = 0;
                }
              }
            });
            GMTrace.o(6951270350848L, 51791);
          }
        });
        Assert.assertNotNull(this.qZB);
        this.roG.setVisibility(8);
        GMTrace.o(7009655062528L, 52226);
        return;
      }
    }
    this.roA.setVisibility(8);
    GMTrace.o(7009655062528L, 52226);
  }
  
  public final void a(final DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(7010057715712L, 52229);
    if (this.rou == null)
    {
      GMTrace.o(7010057715712L, 52229);
      return;
    }
    this.Fj = paramOnCancelListener;
    this.rou.setVisibility(0);
    this.rou.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6936774836224L, 51683);
        if (paramOnCancelListener != null) {
          paramOnCancelListener.onCancel(null);
        }
        if (l.this.roL != null) {
          l.this.roL.aVA();
        }
        l.this.cancel();
        if (l.this.roQ.isShown())
        {
          com.tencent.mm.plugin.report.service.g.ork.i(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(6936774836224L, 51683);
          return;
        }
        com.tencent.mm.plugin.report.service.g.ork.i(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        GMTrace.o(6936774836224L, 51683);
      }
    });
    GMTrace.o(7010057715712L, 52229);
  }
  
  public final void a(String paramString, View.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    GMTrace.i(7009520844800L, 52225);
    if (!TextUtils.isEmpty(paramString))
    {
      this.roE.setOnClickListener(paramOnClickListener);
      this.rox.setText(paramString);
      if (!this.roO)
      {
        this.roE.setVisibility(8);
        this.roF.setVisibility(8);
      }
      while (!paramBoolean)
      {
        this.roD.setVisibility(8);
        GMTrace.o(7009520844800L, 52225);
        return;
        this.roE.setVisibility(0);
        this.roF.setVisibility(0);
      }
      this.roD.setVisibility(0);
      GMTrace.o(7009520844800L, 52225);
      return;
    }
    this.roE.setVisibility(8);
    this.roF.setVisibility(8);
    GMTrace.o(7009520844800L, 52225);
  }
  
  public final void baC()
  {
    GMTrace.i(18039399514112L, 134404);
    if (this.roB != null) {
      this.roB.baC();
    }
    GMTrace.o(18039399514112L, 134404);
  }
  
  public int bzO()
  {
    GMTrace.i(7008044449792L, 52214);
    int i = a.g.sPr;
    GMTrace.o(7008044449792L, 52214);
    return i;
  }
  
  public final void bzP()
  {
    GMTrace.i(7009789280256L, 52227);
    if (this.rot == null)
    {
      GMTrace.o(7009789280256L, 52227);
      return;
    }
    this.roM = null;
    this.rot.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7019855609856L, 52302);
        l.this.bzQ();
        GMTrace.o(7019855609856L, 52302);
      }
    });
    GMTrace.o(7009789280256L, 52227);
  }
  
  public void bzQ()
  {
    GMTrace.i(7009923497984L, 52228);
    ja(false);
    if (this.roM != null) {
      this.roM.onClick(this, 0);
    }
    dismiss();
    if (this.roC != null) {
      this.roC.a(this.roB.getText(), this.qYW, this.roN);
    }
    if (this.roZ < 0L)
    {
      w.e("MicroMsg.WalletPwdDialog", "hy: not set update mode time yet. abandon");
      GMTrace.o(7009923497984L, 52228);
      return;
    }
    if (this.roU == 0)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(686L, 0L, 1L, false);
      com.tencent.mm.plugin.report.service.g.ork.a(686L, 1L, bg.aI(this.roZ), false);
      GMTrace.o(7009923497984L, 52228);
      return;
    }
    if (this.roU == 1)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(686L, 2L, 1L, false);
      com.tencent.mm.plugin.report.service.g.ork.a(686L, 3L, bg.aI(this.roZ), false);
    }
    GMTrace.o(7009923497984L, 52228);
  }
  
  public final void bzt()
  {
    GMTrace.i(7011131457536L, 52237);
    this.isPaused = false;
    if (com.tencent.mm.y.q.zR())
    {
      GMTrace.o(7011131457536L, 52237);
      return;
    }
    GMTrace.o(7011131457536L, 52237);
  }
  
  public final void bzu()
  {
    GMTrace.i(7011265675264L, 52238);
    this.isPaused = true;
    if (com.tencent.mm.y.q.zR())
    {
      GMTrace.o(7011265675264L, 52238);
      return;
    }
    if (this.roU == 1) {
      bzL();
    }
    GMTrace.o(7011265675264L, 52238);
  }
  
  public void cm(Context paramContext)
  {
    GMTrace.i(7007239143424L, 52208);
    w.v("MicroMsg.WalletPwdDialog", "alvinluo WalletPwdDialog initView");
    dq(paramContext);
    dr(paramContext);
    bzK();
    GMTrace.o(7007239143424L, 52208);
  }
  
  public void dismiss()
  {
    GMTrace.i(7008581320704L, 52218);
    try
    {
      super.dismiss();
      bzN();
      this.qWf.destory();
      if (this.llN != null) {
        this.llN.cancel();
      }
      GMTrace.o(7008581320704L, 52218);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.WalletPwdDialog", "dismiss exception, e = " + localException.getMessage());
      }
    }
  }
  
  public final void dq(Context paramContext)
  {
    GMTrace.i(7007373361152L, 52209);
    this.jBw = View.inflate(paramContext, bzO(), null);
    this.rot = ((Button)this.jBw.findViewById(a.f.bNq));
    this.rou = ((ImageView)this.jBw.findViewById(a.f.sKE));
    this.mKeyboard = ((MyKeyboardWindow)this.jBw.findViewById(a.f.sHx));
    this.mLL = this.jBw.findViewById(a.f.sHw);
    this.ovy = ((TextView)this.jBw.findViewById(a.f.content));
    this.rov = ((TextView)this.jBw.findViewById(a.f.sKI));
    this.okD = ((TextView)this.jBw.findViewById(a.f.eCT));
    this.qZM = ((TextView)this.jBw.findViewById(a.f.sDB));
    this.qZM.getPaint().setFlags(16);
    this.rox = ((TextView)this.jBw.findViewById(a.f.sqH));
    this.roy = ((FavourLayout)this.jBw.findViewById(a.f.svC));
    this.roz = ((ImageView)this.jBw.findViewById(a.f.sqA));
    this.roD = this.jBw.findViewById(a.f.svz);
    this.roA = ((TextView)this.jBw.findViewById(a.f.sCC));
    this.gDc = ((ImageView)this.jBw.findViewById(a.f.ssY));
    this.roE = this.jBw.findViewById(a.f.sqy);
    this.roF = ((TextView)this.jBw.findViewById(a.f.sHd));
    a.b.a(this.gDc, com.tencent.mm.wallet_core.ui.e.getUsername());
    this.roB = ((EditHintPasswdView)this.jBw.findViewById(a.f.swd));
    this.roG = ((ImageView)this.jBw.findViewById(a.f.svV));
    this.roQ = ((TextView)this.jBw.findViewById(a.f.sKz));
    this.roR = this.jBw.findViewById(a.f.svK);
    this.roS = ((TextView)this.jBw.findViewById(a.f.svL));
    this.roT = ((ImageView)this.jBw.findViewById(a.f.svJ));
    this.roH = ((TextView)this.jBw.findViewById(a.f.ssW));
    this.roI = ((TextView)this.jBw.findViewById(a.f.sFr));
    this.roJ = this.jBw.findViewById(a.f.svy);
    this.roK = ((TextView)this.jBw.findViewById(a.f.svB));
    this.roy.setVisibility(8);
    GMTrace.o(7007373361152L, 52209);
  }
  
  @TargetApi(14)
  public void dr(Context paramContext)
  {
    GMTrace.i(7007507578880L, 52210);
    setCanceledOnTouchOutside(true);
    getWindow().setSoftInputMode(2);
    this.rot.setEnabled(false);
    this.rot.setTextColor(paramContext.getResources().getColorStateList(a.c.smM));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.roB);
    this.roB.xFp = new EditHintPasswdView.a()
    {
      public final void gR(boolean paramAnonymousBoolean)
      {
        GMTrace.i(6920400273408L, 51561);
        if (paramAnonymousBoolean)
        {
          l.this.bzQ();
          com.tencent.mm.plugin.report.service.g.ork.i(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        }
        GMTrace.o(6920400273408L, 51561);
      }
    };
    this.roB.requestFocus();
    Object localObject = (TextView)this.jBw.findViewById(a.f.sKI);
    if (localObject != null) {
      if (!com.tencent.mm.y.q.zR()) {
        break label212;
      }
    }
    label212:
    for (paramContext = paramContext.getString(a.i.tfh);; paramContext = paramContext.getString(a.i.tfg))
    {
      ((TextView)localObject).setText(paramContext);
      paramContext = (EditText)this.jBw.findViewById(a.f.sJj);
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText(paramContext);
      this.mKeyboard.setInputEditText(paramContext);
      if (Build.VERSION.SDK_INT >= 14)
      {
        localObject = new com.tencent.mm.ui.a.c();
        this.mKeyboard.setSecureAccessibility((View.AccessibilityDelegate)localObject);
        paramContext.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
      }
      paramContext.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6946572730368L, 51756);
          if (!l.this.mLL.isShown()) {
            l.this.mLL.setVisibility(0);
          }
          GMTrace.o(6946572730368L, 51756);
        }
      });
      this.jBw.findViewById(a.f.hAy).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6960799809536L, 51862);
          if (l.this.mLL.isShown()) {
            l.this.mLL.setVisibility(8);
          }
          GMTrace.o(6960799809536L, 51862);
        }
      });
      GMTrace.o(7007507578880L, 52210);
      return;
    }
  }
  
  public final void ee(String paramString1, String paramString2)
  {
    GMTrace.i(7009118191616L, 52222);
    if (!TextUtils.isEmpty(paramString2))
    {
      this.roA.setVisibility(0);
      this.roA.setText(paramString2);
    }
    while (!TextUtils.isEmpty(paramString1))
    {
      this.roK.setText(paramString1);
      this.roK.setVisibility(0);
      GMTrace.o(7009118191616L, 52222);
      return;
      this.roA.setVisibility(8);
    }
    this.roK.setVisibility(8);
    GMTrace.o(7009118191616L, 52222);
  }
  
  public final void iZ(boolean paramBoolean)
  {
    GMTrace.i(7010191933440L, 52230);
    if (paramBoolean)
    {
      this.roE.setVisibility(0);
      GMTrace.o(7010191933440L, 52230);
      return;
    }
    this.roE.setVisibility(8);
    GMTrace.o(7010191933440L, 52230);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7008312885248L, 52216);
    super.onCreate(paramBundle);
    setContentView(this.jBw);
    com.tencent.d.b.f.f.cpS().cpT();
    GMTrace.o(7008312885248L, 52216);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7008178667520L, 52215);
    if (paramInt == 4)
    {
      if (this.Fj != null) {
        this.Fj.onCancel(this);
      }
      if (this.roL != null) {
        this.roL.aVA();
      }
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(7008178667520L, 52215);
    return bool;
  }
  
  public void setCancelable(boolean paramBoolean)
  {
    GMTrace.i(7008447102976L, 52217);
    super.setCancelable(paramBoolean);
    this.oND = paramBoolean;
    setCanceledOnTouchOutside(this.oND);
    GMTrace.o(7008447102976L, 52217);
  }
  
  public static abstract interface a
  {
    public abstract void aVA();
  }
  
  private static final class b
    implements DialogInterface.OnCancelListener
  {
    private DialogInterface.OnCancelListener rpl;
    
    public b(DialogInterface.OnCancelListener paramOnCancelListener)
    {
      GMTrace.i(6946706948096L, 51757);
      this.rpl = null;
      this.rpl = paramOnCancelListener;
      GMTrace.o(6946706948096L, 51757);
    }
    
    public final void onCancel(DialogInterface paramDialogInterface)
    {
      GMTrace.i(6946841165824L, 51758);
      l.jb(false);
      if (this.rpl != null) {
        this.rpl.onCancel(paramDialogInterface);
      }
      GMTrace.o(6946841165824L, 51758);
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(String paramString, FavorPayInfo paramFavorPayInfo, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */