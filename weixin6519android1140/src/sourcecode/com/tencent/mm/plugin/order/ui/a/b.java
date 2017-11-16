package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.a;
import com.tencent.mm.plugin.order.model.a.a;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.List;

public final class b
  implements a.a
{
  public b()
  {
    GMTrace.i(6646193455104L, 49518);
    GMTrace.o(6646193455104L, 49518);
  }
  
  public final List<Preference> a(final Context paramContext, final com.tencent.mm.ui.base.preference.f paramf, final MallTransactionObject paramMallTransactionObject)
  {
    GMTrace.i(6646327672832L, 49519);
    ArrayList localArrayList = new ArrayList();
    if (paramMallTransactionObject.ewG == 2) {}
    final Object localObject1;
    for (int i = 1;; i = 0)
    {
      if ((!bg.nm(paramMallTransactionObject.nEt)) && (!bg.nm(paramMallTransactionObject.hQJ)))
      {
        localObject1 = new d(paramContext);
        ((d)localObject1).kEt = paramMallTransactionObject.hQJ;
        ((d)localObject1).mName = paramMallTransactionObject.nEt;
        ((d)localObject1).mOnClickListener = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6648743591936L, 49537);
            if (!bg.nm(paramMallTransactionObject.nEs)) {
              e.P(paramContext, paramMallTransactionObject.nEs);
            }
            GMTrace.o(6648743591936L, 49537);
          }
        };
        localArrayList.add(localObject1);
        localArrayList.add(new PreferenceSmallCategory(paramContext));
      }
      w.i("MicroMsg.FetchOrderPrefFactory", "getOrderPrefList() chargeFee is " + paramMallTransactionObject.nEI + " and fetchTotalFee is " + paramMallTransactionObject.nES);
      if (TextUtils.isEmpty(paramMallTransactionObject.nEI)) {
        break;
      }
      localObject1 = new i(paramContext);
      ((i)localObject1).nGY = e.d(paramMallTransactionObject.nES, paramMallTransactionObject.nEr);
      ((i)localObject1).setTitle(paramContext.getString(a.i.tcT));
      if (!bg.nm(paramMallTransactionObject.nET)) {
        ((i)localObject1).EC(paramMallTransactionObject.nET);
      }
      localArrayList.add(localObject1);
      localObject1 = new h(paramContext);
      ((h)localObject1).nGV = false;
      ((h)localObject1).nGW = true;
      localArrayList.add(localObject1);
      localObject1 = new f(paramContext);
      ((f)localObject1).setTitle(a.i.tdc);
      ((f)localObject1).setContent(e.d(paramMallTransactionObject.jWS, paramMallTransactionObject.nEr));
      localArrayList.add(localObject1);
      localObject1 = new f(paramContext);
      ((f)localObject1).setTitle(a.i.tcU);
      ((f)localObject1).setContent(paramMallTransactionObject.nEI);
      localArrayList.add(localObject1);
      if (!bg.nm(paramMallTransactionObject.desc))
      {
        if (i == 0) {
          break label1157;
        }
        paramf = new f(paramContext);
        paramf.setTitle(a.i.tdi);
        paramf.setContent(paramMallTransactionObject.desc);
        localArrayList.add(paramf);
      }
      if (!bg.nm(paramMallTransactionObject.nEg))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.tdj);
        paramf.setContent(paramMallTransactionObject.nEg);
        localArrayList.add(paramf);
      }
      if (!bg.nm(paramMallTransactionObject.nEl))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.tdv);
        paramf.setContent(paramMallTransactionObject.nEl);
        if (!bg.nm(paramMallTransactionObject.nEm)) {
          paramf.EB(paramMallTransactionObject.nEm);
        }
        localArrayList.add(paramf);
      }
      paramf = new f(paramContext);
      paramf.setTitle(a.i.tdf);
      paramf.setContent(e.EO(paramMallTransactionObject.gGY));
      localArrayList.add(paramf);
      if (paramMallTransactionObject.nEE <= 0) {
        break label1300;
      }
      paramf = new f(paramContext);
      paramf.setTitle(a.i.tdd);
      paramf.setContent(e.EO(paramMallTransactionObject.nEE));
      localArrayList.add(paramf);
      label574:
      if (!bg.nm(paramMallTransactionObject.nEp))
      {
        localObject2 = new f(paramContext);
        ((f)localObject2).setTitle(a.i.tde);
        localObject1 = paramMallTransactionObject.nEp;
        paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
        if (!bg.nm(paramMallTransactionObject.nEq)) {
          paramf = (String)localObject1 + "(" + paramMallTransactionObject.nEq + ")";
        }
        ((f)localObject2).setContent(paramf);
        localArrayList.add(localObject2);
      }
      if (!bg.nm(paramMallTransactionObject.nEo))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.tdh);
        paramf.setContent(paramMallTransactionObject.nEo);
        localArrayList.add(paramf);
      }
      if ((bg.nm(paramMallTransactionObject.nEB)) && (bg.nm(paramMallTransactionObject.nEs)) && (bg.nm(paramMallTransactionObject.nDU))) {
        break label1357;
      }
      paramf = new h(paramContext);
      paramf.nGV = true;
      localArrayList.add(paramf);
      localArrayList.add(a.a(paramContext, paramMallTransactionObject));
      label779:
      GMTrace.o(6646327672832L, 49519);
      return localArrayList;
    }
    Object localObject2 = new i(paramContext);
    ((i)localObject2).nGY = e.d(paramMallTransactionObject.jWS, paramMallTransactionObject.nEr);
    label836:
    boolean bool2;
    if (i != 0)
    {
      localObject1 = paramContext.getString(a.i.tcS);
      ((i)localObject2).setTitle((CharSequence)localObject1);
      if (!bg.nm(paramMallTransactionObject.nEj)) {
        ((i)localObject2).EC(paramMallTransactionObject.nEj);
      }
      localArrayList.add(localObject2);
      if ((paramMallTransactionObject.jWS == paramMallTransactionObject.nEx) || (paramMallTransactionObject.nEx <= 0.0D)) {
        break label1388;
      }
      localObject1 = new h(paramContext);
      ((h)localObject1).nGV = false;
      ((h)localObject1).nGW = true;
      localArrayList.add(localObject1);
      localObject1 = new f(paramContext);
      ((f)localObject1).setContent(e.d(paramMallTransactionObject.nEx, paramMallTransactionObject.nEr));
      ((f)localObject1).setTitle(a.i.tdk);
      localArrayList.add(localObject1);
      bool2 = true;
      bool1 = bool2;
      if (!bg.nm(paramMallTransactionObject.nEw))
      {
        localObject1 = new g(paramContext);
        ((g)localObject1).setTitle(a.i.tcZ);
        ((g)localObject1).iAA = paramf;
        localObject2 = paramMallTransactionObject.nEw.split("\n");
        if (localObject2.length != 1) {
          break label1100;
        }
        ((g)localObject1).nGO = localObject2[0];
        label1038:
        localArrayList.add(localObject1);
      }
    }
    label1100:
    label1157:
    label1300:
    label1357:
    label1388:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localObject1 = new h(paramContext);
      ((h)localObject1).nGV = bool1;
      ((h)localObject1).nGW = true;
      localArrayList.add(localObject1);
      break;
      localObject1 = paramContext.getString(a.i.tdc);
      break label836;
      ((g)localObject1).nGO = paramContext.getString(a.i.tda, new Object[] { Integer.valueOf(localObject2.length), e.d(paramMallTransactionObject.nEx - paramMallTransactionObject.jWS, paramMallTransactionObject.nEr) });
      ((g)localObject1).a((String[])localObject2, TextUtils.TruncateAt.MIDDLE);
      break label1038;
      localObject1 = new f(paramContext);
      ((f)localObject1).setTitle(a.i.sJU);
      if (!bg.nm(paramMallTransactionObject.nEh))
      {
        localObject2 = paramContext.getString(a.i.tcV);
        String str = paramMallTransactionObject.desc + " " + (String)localObject2;
        i = paramMallTransactionObject.desc.length();
        int j = paramMallTransactionObject.desc.length();
        ((f)localObject1).a(str, i + 1, ((String)localObject2).length() + (j + 1), new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6640824745984L, 49478);
            paramAnonymousView = paramMallTransactionObject.desc + "\n" + paramMallTransactionObject.nEh;
            localObject1.setContent(paramAnonymousView);
            paramf.notifyDataSetChanged();
            GMTrace.o(6640824745984L, 49478);
          }
        });
      }
      for (;;)
      {
        localArrayList.add(localObject1);
        break;
        ((f)localObject1).setContent(paramMallTransactionObject.desc);
      }
      if (paramMallTransactionObject.nED > 0)
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.tdg);
        paramf.setContent(e.EO(paramMallTransactionObject.nED));
        localArrayList.add(paramf);
        break label574;
      }
      w.e("MicroMsg.FetchOrderPrefFactory", "hy: is fetch but no arrive time or fetch time");
      break label574;
      paramContext = new h(paramContext);
      paramContext.nGV = true;
      paramContext.iSM = false;
      localArrayList.add(paramContext);
      break label779;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\ui\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */