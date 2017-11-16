package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.a;
import com.tencent.mm.plugin.wallet_core.ui.a.a;
import com.tencent.mm.plugin.wallet_core.ui.l;
import com.tencent.mm.plugin.wallet_core.ui.l.a;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import java.util.List;
import java.util.Map;

public class b
  extends l
{
  private b ruK;
  private int ruL;
  private boolean ruM;
  private a ruN;
  
  public b(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(7976425357312L, 59429);
    this.ruL = 0;
    this.ruM = false;
    GMTrace.o(7976425357312L, 59429);
  }
  
  public static b a(Context paramContext, Orders paramOrders, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard, b paramb, View.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener, boolean paramBoolean)
  {
    GMTrace.i(7976828010496L, 59432);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(7976828010496L, 59432);
      return null;
    }
    Object localObject2 = com.tencent.mm.plugin.wallet_core.ui.b.rks.a(paramOrders);
    Object localObject1;
    Object localObject3;
    label166:
    Object localObject4;
    label202:
    String str;
    boolean bool;
    if (localObject2 != null) {
      if (paramFavorPayInfo != null)
      {
        localObject1 = paramFavorPayInfo;
        if (paramBankcard != null)
        {
          localObject1 = paramFavorPayInfo;
          if (!paramBankcard.field_bankcardType.equals(paramFavorPayInfo.rgq))
          {
            localObject1 = ((a)localObject2).aC(paramFavorPayInfo.rgo, false);
            localObject3 = (a.a)((a)localObject2).aB((String)localObject1, true).get(paramBankcard.field_bankcardType);
            if ((localObject3 == null) || (((a.a)localObject3).rkp == null) || (bg.nm(((a.a)localObject3).rkp.qXN))) {
              break label479;
            }
            paramFavorPayInfo.rgo = ((a.a)localObject3).rkp.qXN;
            localObject1 = paramFavorPayInfo;
          }
        }
        paramFavorPayInfo = ((a)localObject2).bzs();
        localObject3 = localObject1;
        localObject1 = paramFavorPayInfo;
        paramFavorPayInfo = (Orders.Commodity)paramOrders.rhv.get(0);
        localObject4 = new StringBuilder();
        if (!bg.nm(paramFavorPayInfo.nEg)) {
          break label541;
        }
        paramFavorPayInfo = "";
        str = paramFavorPayInfo + ((Orders.Commodity)paramOrders.rhv.get(0)).desc;
        if ((localObject2 == null) || (localObject3 == null)) {
          break label649;
        }
        paramFavorPayInfo = ((a)localObject2).Ku(((FavorPayInfo)localObject3).rgo);
        if ((paramFavorPayInfo == null) || (paramFavorPayInfo.qXO <= 0.0D)) {
          break label568;
        }
        localObject2 = e.d(paramOrders.rhd, paramOrders.nEr);
        localObject1 = e.d(paramFavorPayInfo.qXy, paramOrders.nEr);
        paramFavorPayInfo = paramContext.getString(a.i.tez, new Object[] { e.r(paramFavorPayInfo.qXO) });
        bool = true;
      }
    }
    for (;;)
    {
      label317:
      label325:
      b localb;
      if (paramBankcard == null)
      {
        localObject4 = "";
        localb = new b(paramContext);
        localb.roP = paramBankcard;
        localb.a(paramContext, paramOrders, (FavorPayInfo)localObject3, paramBankcard);
        localb.bzP();
        localb.a(paramOnCancelListener);
        localb.setOnCancelListener(paramOnCancelListener);
        localb.setCancelable(true);
        localb.KB(str);
        localb.KC((String)localObject1);
        localb.KE((String)localObject2);
        localb.a((String)localObject4, paramOnClickListener, bool);
        if (TextUtils.isEmpty(paramFavorPayInfo)) {
          break label636;
        }
        localb.roA.setVisibility(0);
        localb.roA.setText(paramFavorPayInfo);
      }
      for (;;)
      {
        localb.ruM = paramBoolean;
        localb.roB.xFo = -10;
        localb.ruK = paramb;
        localb.show();
        com.tencent.mm.ui.base.h.a(paramContext, localb);
        GMTrace.o(7976828010496L, 59432);
        return localb;
        label479:
        paramFavorPayInfo.rgo = ((String)localObject1);
        localObject1 = paramFavorPayInfo;
        break;
        localObject1 = paramFavorPayInfo;
        if (paramOrders.rhw == null) {
          break;
        }
        localObject1 = ((a)localObject2).Kx(((a)localObject2).Ky(paramOrders.rhw.qXz));
        break;
        w.d("MicroMsg.WalletPayUPwdDialog", "getFavorLogicHelper null");
        localObject1 = null;
        localObject3 = paramFavorPayInfo;
        break label166;
        label541:
        paramFavorPayInfo = paramFavorPayInfo.nEg + "\n";
        break label202;
        label568:
        if ((localObject1 != null) && (((List)localObject1).size() > 0))
        {
          paramFavorPayInfo = paramContext.getString(a.i.tfd);
          bool = true;
          localObject2 = null;
          localObject1 = null;
          break label317;
        }
        localObject1 = e.d(paramOrders.rhd, paramOrders.nEr);
        paramFavorPayInfo = null;
        localObject2 = null;
        bool = false;
        break label317;
        localObject4 = paramBankcard.field_desc;
        break label325;
        label636:
        localb.roA.setVisibility(8);
      }
      label649:
      localObject2 = null;
      localObject1 = null;
      paramFavorPayInfo = null;
      bool = false;
    }
  }
  
  protected final void bzQ()
  {
    GMTrace.i(7976962228224L, 59433);
    if (this.roM != null) {
      this.roM.onClick(this, 0);
    }
    dismiss();
    if (this.ruK != null)
    {
      if (this.ruM)
      {
        if (this.ruL == 0)
        {
          Context localContext = getContext();
          final Object localObject = new a(this.roB.getText(), this.roP, this.qYW, this.roN, this.Fj, this.roL, this.ruK);
          b local1;
          if ((!(localContext instanceof Activity)) || (!((Activity)localContext).isFinishing()))
          {
            local1 = new b(localContext)
            {
              public final int bzO()
              {
                GMTrace.i(7986089033728L, 59501);
                int j = 3;
                int i = j;
                if (localObject.ruQ != null)
                {
                  i = j;
                  if (localObject.ruQ.field_bankcardClientType == 1)
                  {
                    w.d("MicroMsg.WalletPayUPwdDialog", "hy: the bankcard can be assembled to BankcardPayU");
                    i = new com.tencent.mm.plugin.wallet_core.model.a.b(localObject.ruQ).rkk;
                  }
                }
                if (i == 4)
                {
                  w.d("MicroMsg.WalletPayUPwdDialog", "hy: is 4 digits cvv");
                  i = a.g.sNI;
                  GMTrace.o(7986089033728L, 59501);
                  return i;
                }
                i = a.g.sNJ;
                GMTrace.o(7986089033728L, 59501);
                return i;
              }
            };
            local1.ruL = 1;
            local1.ruM = true;
            local1.ruN = ((a)localObject);
            if (local1.ruN != null)
            {
              local1.bzP();
              local1.a(local1.ruN.ruU);
              local1.setOnCancelListener(local1.ruN.ruU);
              local1.setCancelable(true);
              if (local1.ruN.ruQ != null) {
                break label263;
              }
            }
          }
          label263:
          for (localObject = "";; localObject = local1.ruN.ruQ.field_desc)
          {
            local1.KC((String)localObject);
            local1.iZ(false);
            local1.roL = local1.ruN.roL;
            local1.ruK = local1.ruN.ruT;
            local1.roB.xFo = 30;
            local1.show();
            com.tencent.mm.ui.base.h.a(localContext, local1);
            GMTrace.o(7976962228224L, 59433);
            return;
            GMTrace.o(7976962228224L, 59433);
            return;
          }
        }
        if (this.ruL == 1)
        {
          this.ruK.a(this.ruN.ruP, this.roB.getText(), this.ruN.ruR);
          GMTrace.o(7976962228224L, 59433);
          return;
        }
        w.e("MicroMsg.WalletPayUPwdDialog", "hy: error dialog state");
        GMTrace.o(7976962228224L, 59433);
        return;
      }
      this.ruK.a(this.roB.getText(), "", this.qYW);
    }
    GMTrace.o(7976962228224L, 59433);
  }
  
  protected final void cm(Context paramContext)
  {
    GMTrace.i(7976693792768L, 59431);
    dq(paramContext);
    super.dr(paramContext);
    if (this.roQ != null) {
      this.roQ.setVisibility(8);
    }
    GMTrace.o(7976693792768L, 59431);
  }
  
  protected final void dr(Context paramContext)
  {
    GMTrace.i(15397323538432L, 114719);
    super.dr(paramContext);
    GMTrace.o(15397323538432L, 114719);
  }
  
  private final class a
  {
    public l.a roL;
    public String ruP;
    public Bankcard ruQ;
    public FavorPayInfo ruR;
    public boolean ruS;
    public b.b ruT;
    public DialogInterface.OnCancelListener ruU;
    
    public a(String paramString, Bankcard paramBankcard, FavorPayInfo paramFavorPayInfo, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener, l.a parama, b.b paramb)
    {
      GMTrace.i(7982062501888L, 59471);
      this.ruP = paramString;
      this.ruQ = paramBankcard;
      this.ruR = paramFavorPayInfo;
      this.ruS = paramBoolean;
      this.ruU = paramOnCancelListener;
      this.roL = parama;
      this.ruT = paramb;
      GMTrace.o(7982062501888L, 59471);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(String paramString1, String paramString2, FavorPayInfo paramFavorPayInfo);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pay\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */