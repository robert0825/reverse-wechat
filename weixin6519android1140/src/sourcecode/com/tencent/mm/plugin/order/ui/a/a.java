package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.Uri.Builder;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.HelpCenter;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.a.a;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements a.a
{
  public com.tencent.mm.wallet_core.ui.c nGy;
  
  public a()
  {
    GMTrace.i(6641764270080L, 49485);
    GMTrace.o(6641764270080L, 49485);
  }
  
  public static void a(Context paramContext, String paramString, MallTransactionObject paramMallTransactionObject)
  {
    GMTrace.i(16033112915968L, 119456);
    Intent localIntent = new Intent();
    Uri localUri = Uri.parse(paramString);
    paramMallTransactionObject = paramMallTransactionObject.eRP;
    String str1 = p.getDeviceID(paramContext);
    String str2 = com.tencent.mm.protocal.d.DEVICE_TYPE;
    String str3 = Build.MODEL;
    String str4 = p.to();
    paramString = (WifiManager)ab.getContext().getSystemService("wifi");
    if (paramString != null)
    {
      paramString = paramString.getConnectionInfo();
      if (paramString == null) {}
    }
    for (paramString = bg.aq(paramString.getBSSID(), "");; paramString = "bssid")
    {
      paramString = localUri.buildUpon().appendQueryParameter("trans_id", paramMallTransactionObject).appendQueryParameter("deviceid", str1).appendQueryParameter("bssid", paramString).appendQueryParameter("deviceType", str2).appendQueryParameter("deviceName", str3).appendQueryParameter("ostype", str4).build().toString();
      w.i("MicroMsg.DefaultOrderPrefFactory", "new url %s", new Object[] { paramString });
      localIntent.putExtra("rawUrl", paramString);
      localIntent.putExtra("geta8key_username", q.zE());
      com.tencent.mm.bj.d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
      GMTrace.o(16033112915968L, 119456);
      return;
    }
  }
  
  public final List<Preference> a(final Context paramContext, final com.tencent.mm.ui.base.preference.f paramf, final MallTransactionObject paramMallTransactionObject)
  {
    GMTrace.i(6641898487808L, 49486);
    ArrayList localArrayList = new ArrayList();
    int i;
    final Object localObject1;
    final Object localObject2;
    label157:
    label361:
    label671:
    int j;
    if (paramMallTransactionObject.ewG == 2)
    {
      i = 1;
      if ((!bg.nm(paramMallTransactionObject.nEt)) && (!bg.nm(paramMallTransactionObject.hQJ)))
      {
        localObject1 = new d(paramContext);
        ((d)localObject1).kEt = paramMallTransactionObject.hQJ;
        ((d)localObject1).mName = paramMallTransactionObject.nEt;
        ((d)localObject1).mOnClickListener = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6649280462848L, 49541);
            if (!bg.nm(paramMallTransactionObject.nEs)) {
              e.P(paramContext, paramMallTransactionObject.nEs);
            }
            GMTrace.o(6649280462848L, 49541);
          }
        };
        localArrayList.add(localObject1);
        localArrayList.add(new PreferenceSmallCategory(paramContext));
      }
      localObject2 = new i(paramContext);
      ((i)localObject2).nGY = e.d(paramMallTransactionObject.jWS, paramMallTransactionObject.nEr);
      if (i == 0) {
        break label1571;
      }
      localObject1 = paramContext.getString(a.i.tcS);
      ((i)localObject2).setTitle((CharSequence)localObject1);
      if (!bg.nm(paramMallTransactionObject.nEj)) {
        ((i)localObject2).EC(paramMallTransactionObject.nEj);
      }
      localArrayList.add(localObject2);
      boolean bool = false;
      if (paramMallTransactionObject.jWS != paramMallTransactionObject.nEx)
      {
        localObject1 = new h(paramContext);
        ((h)localObject1).nGV = false;
        ((h)localObject1).nGW = true;
        localArrayList.add(localObject1);
        localObject1 = new f(paramContext);
        ((f)localObject1).setContent(e.d(paramMallTransactionObject.nEx, paramMallTransactionObject.nEr));
        ((f)localObject1).setTitle(a.i.tdk);
        localArrayList.add(localObject1);
        bool = true;
      }
      if ((paramMallTransactionObject.jWS != paramMallTransactionObject.nEx) && (!bg.nm(paramMallTransactionObject.nEw)))
      {
        localObject1 = new g(paramContext);
        ((g)localObject1).setTitle(a.i.tcZ);
        ((g)localObject1).iAA = paramf;
        localObject2 = paramMallTransactionObject.nEw.split("\n");
        if (localObject2.length != 1) {
          break label1604;
        }
        ((g)localObject1).nGO = localObject2[0];
        localArrayList.add(localObject1);
      }
      localObject1 = new h(paramContext);
      ((h)localObject1).nGV = bool;
      ((h)localObject1).nGW = true;
      localArrayList.add(localObject1);
      if ((i == 0) && (!bg.nm(paramMallTransactionObject.nEG)))
      {
        com.tencent.mm.kernel.h.xz();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramMallTransactionObject.nEG);
        if ((localObject1 != null) && ((int)((com.tencent.mm.l.a)localObject1).fTq > 0))
        {
          localObject1 = ((com.tencent.mm.l.a)localObject1).vk();
          localObject2 = new f(paramContext);
          ((f)localObject2).setTitle(a.i.sKm);
          ((f)localObject2).setContent((String)localObject1);
          localArrayList.add(localObject2);
        }
      }
      if ((paramMallTransactionObject.nEc == 31) && (i != 0) && (!bg.nm(paramMallTransactionObject.nEN)))
      {
        com.tencent.mm.kernel.h.xz();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramMallTransactionObject.nEN);
        if ((localObject1 != null) && ((int)((com.tencent.mm.l.a)localObject1).fTq > 0))
        {
          localObject1 = ((com.tencent.mm.l.a)localObject1).vk();
          localObject2 = new f(paramContext);
          ((f)localObject2).setTitle(a.i.tdi);
          ((f)localObject2).setContent((String)localObject1);
          localArrayList.add(localObject2);
        }
      }
      if (!bg.nm(paramMallTransactionObject.desc))
      {
        if (i == 0) {
          break label1671;
        }
        paramf = new f(paramContext);
        if ((paramMallTransactionObject.nEc != 32) && (paramMallTransactionObject.nEc != 33) && (paramMallTransactionObject.nEc != 31)) {
          break label1661;
        }
        paramf.setTitle(a.i.tcW);
        paramf.setContent(paramMallTransactionObject.desc);
        localArrayList.add(paramf);
      }
      if (!bg.nm(paramMallTransactionObject.nER))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.sKu);
        paramf.setContent(paramMallTransactionObject.nER);
        localArrayList.add(paramf);
      }
      if (!bg.nm(paramMallTransactionObject.nEQ))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.tdD);
        paramf.setContent(paramMallTransactionObject.nEQ);
        localArrayList.add(paramf);
      }
      if (!TextUtils.isEmpty(paramMallTransactionObject.nEI))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.tcU);
        paramf.setContent(paramMallTransactionObject.nEI);
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
        if ((paramMallTransactionObject.nEc != 31) || (q.zE().equals(paramMallTransactionObject.nEG)) || (paramMallTransactionObject.nEH <= 0) || (bg.nm(paramMallTransactionObject.nEG)) || (bg.nm(paramMallTransactionObject.eRP))) {
          break label1834;
        }
        localObject1 = paramContext.getString(a.i.sYq);
        localObject2 = paramMallTransactionObject.nEl + " " + (String)localObject1;
        i = paramMallTransactionObject.nEl.length();
        j = paramMallTransactionObject.nEl.length();
        paramf.a((String)localObject2, i + 1, ((String)localObject1).length() + j + 1, new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6649548898304L, 49543);
            com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(a.i.sXs), paramContext.getString(a.i.cUl), paramContext.getString(a.i.sYp), paramContext.getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(6644314406912L, 49504);
                paramAnonymous2DialogInterface = new Intent();
                paramAnonymous2DialogInterface.putExtra("transaction_id", a.3.this.nDY.eRP);
                paramAnonymous2DialogInterface.putExtra("receiver_name", a.3.this.nDY.nEG);
                paramAnonymous2DialogInterface.putExtra("resend_msg_from_flag", 1);
                com.tencent.mm.bj.d.b(a.3.this.val$context, "remittance", ".ui.RemittanceResendMsgUI", paramAnonymous2DialogInterface);
                GMTrace.o(6644314406912L, 49504);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(6645656584192L, 49514);
                GMTrace.o(6645656584192L, 49514);
              }
            });
            GMTrace.o(6649548898304L, 49543);
          }
        });
        label1022:
        localArrayList.add(paramf);
      }
      paramf = new f(paramContext);
      paramf.setTitle(a.i.tcY);
      paramf.setContent(e.EO(paramMallTransactionObject.gGY));
      localArrayList.add(paramf);
      if (!bg.nm(paramMallTransactionObject.nEp))
      {
        localObject2 = new f(paramContext);
        ((f)localObject2).setTitle(a.i.tdl);
        localObject1 = paramMallTransactionObject.nEp;
        paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
        if (!bg.nm(paramMallTransactionObject.nEq)) {
          paramf = (String)localObject1 + "(" + paramMallTransactionObject.nEq + ")";
        }
        ((f)localObject2).setContent(paramf);
        localArrayList.add(localObject2);
      }
      if (!bg.nm(paramMallTransactionObject.eRP))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.sKs);
        paramf.setContent(paramMallTransactionObject.eRP);
        localArrayList.add(paramf);
      }
      if (!bg.nm(paramMallTransactionObject.nEo))
      {
        paramf = new f(paramContext);
        paramf.setTitle(a.i.tdt);
        if (paramMallTransactionObject.nEc != 8) {
          break label1863;
        }
        paramf.setContent(paramContext.getString(a.i.tdu));
        localObject1 = new c(paramContext);
        localObject2 = com.tencent.mm.bo.a.a.b(paramContext, paramMallTransactionObject.nEo, 5, 0);
        ((c)localObject1).nGG = e.XB(paramMallTransactionObject.nEo);
        ((c)localObject1).gsp = ((Bitmap)localObject2);
        ((c)localObject1).mOnClickListener = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6642301140992L, 49489);
            if (a.this.nGy != null)
            {
              a locala = a.this;
              Bitmap localBitmap = localObject2;
              String str = paramMallTransactionObject.nEo;
              if (locala.nGy != null)
              {
                locala.nGy.ft(str, str);
                locala.nGy.nBT = localBitmap;
                locala.nGy.nBU = localBitmap;
                locala.nGy.cmi();
              }
              a.this.nGy.v(paramAnonymousView, true);
            }
            GMTrace.o(6642301140992L, 49489);
          }
        };
        localArrayList.add(paramf);
        localArrayList.add(localObject1);
      }
      label1330:
      if (paramMallTransactionObject.nDR.size() != 0) {
        break label1883;
      }
      i = 0;
      label1345:
      if ((i != 0) || ((bg.nm(paramMallTransactionObject.nEB)) && (bg.nm(paramMallTransactionObject.nEs)) && (bg.nm(paramMallTransactionObject.nDU)))) {
        break label1889;
      }
      paramf = new h(paramContext);
      paramf.nGV = true;
      localArrayList.add(paramf);
      localArrayList.add(com.tencent.mm.plugin.order.model.a.a(paramContext, paramMallTransactionObject));
      label1416:
      if (i != 0)
      {
        paramf = new j(paramContext);
        if (paramMallTransactionObject.nDS != 1) {
          break label1934;
        }
        if ((!bg.nm(paramMallTransactionObject.nEB)) || (!bg.nm(paramMallTransactionObject.nEs)) || (!bg.nm(paramMallTransactionObject.nDU)))
        {
          if (bg.nm(paramMallTransactionObject.nEC)) {
            break label1920;
          }
          paramf.nGZ = paramMallTransactionObject.nEC;
          label1486:
          paramf.nHa = new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(6647132979200L, 49525);
              paramAnonymousView = new LinkedList();
              LinkedList localLinkedList = new LinkedList();
              if (!bg.nm(paramMallTransactionObject.nEs))
              {
                localLinkedList.add(Integer.valueOf(0));
                paramAnonymousView.add(paramContext.getString(a.i.tdx));
              }
              if (!bg.nm(paramMallTransactionObject.nDU))
              {
                localLinkedList.add(Integer.valueOf(1));
                paramAnonymousView.add(paramContext.getString(a.i.tdy));
              }
              if (!bg.nm(paramMallTransactionObject.nEB))
              {
                localLinkedList.add(Integer.valueOf(2));
                paramAnonymousView.add(paramContext.getString(a.i.tdA));
              }
              if (localLinkedList.size() == 1)
              {
                com.tencent.mm.plugin.order.model.a.a(((Integer)localLinkedList.get(0)).intValue(), paramContext, paramMallTransactionObject);
                GMTrace.o(6647132979200L, 49525);
                return;
              }
              com.tencent.mm.ui.base.h.a(paramContext, null, paramAnonymousView, localLinkedList, null, true, new h.d()
              {
                public final void bT(int paramAnonymous2Int1, int paramAnonymous2Int2)
                {
                  GMTrace.i(6645388148736L, 49512);
                  com.tencent.mm.plugin.order.model.a.a(paramAnonymous2Int2, a.5.this.val$context, a.5.this.nDY);
                  GMTrace.o(6645388148736L, 49512);
                }
              });
              GMTrace.o(6647132979200L, 49525);
            }
          };
        }
      }
    }
    for (;;)
    {
      paramf.nDR = paramMallTransactionObject.nDR;
      paramf.mOnClickListener = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6646596108288L, 49521);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(6646596108288L, 49521);
            return;
          }
          if ((paramAnonymousView.getTag() instanceof MallOrderDetailObject.HelpCenter))
          {
            paramAnonymousView = (MallOrderDetailObject.HelpCenter)paramAnonymousView.getTag();
            a.a(paramContext, paramAnonymousView.url, paramMallTransactionObject);
          }
          GMTrace.o(6646596108288L, 49521);
        }
      };
      paramContext = new h(paramContext);
      paramContext.nGV = true;
      localArrayList.add(paramContext);
      localArrayList.add(paramf);
      GMTrace.o(6641898487808L, 49486);
      return localArrayList;
      i = 0;
      break;
      label1571:
      if (paramMallTransactionObject.nEc == 11)
      {
        localObject1 = paramContext.getString(a.i.tds);
        break label157;
      }
      localObject1 = paramContext.getString(a.i.tcR);
      break label157;
      label1604:
      ((g)localObject1).nGO = paramContext.getString(a.i.tda, new Object[] { Integer.valueOf(localObject2.length), e.d(paramMallTransactionObject.nEx - paramMallTransactionObject.jWS, paramMallTransactionObject.nEr) });
      ((g)localObject1).a((String[])localObject2, TextUtils.TruncateAt.MIDDLE);
      break label361;
      label1661:
      paramf.setTitle(a.i.tdi);
      break label671;
      label1671:
      localObject1 = new f(paramContext);
      if (paramMallTransactionObject.nEc == 31)
      {
        ((f)localObject1).setTitle(a.i.tdo);
        label1698:
        if (bg.nm(paramMallTransactionObject.nEh)) {
          break label1822;
        }
        localObject2 = paramContext.getString(a.i.tcV);
        String str = paramMallTransactionObject.desc + " " + (String)localObject2;
        i = paramMallTransactionObject.desc.length();
        j = paramMallTransactionObject.desc.length();
        ((f)localObject1).a(str, i + 1, ((String)localObject2).length() + (j + 1), new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6646864543744L, 49523);
            paramAnonymousView = paramMallTransactionObject.desc + "\n" + paramMallTransactionObject.nEh;
            localObject1.setContent(paramAnonymousView);
            paramf.notifyDataSetChanged();
            GMTrace.o(6646864543744L, 49523);
          }
        });
      }
      for (;;)
      {
        localArrayList.add(localObject1);
        break;
        ((f)localObject1).setTitle(a.i.sJU);
        break label1698;
        label1822:
        ((f)localObject1).setContent(paramMallTransactionObject.desc);
      }
      label1834:
      paramf.setContent(paramMallTransactionObject.nEl);
      if (bg.nm(paramMallTransactionObject.nEm)) {
        break label1022;
      }
      paramf.EB(paramMallTransactionObject.nEm);
      break label1022;
      label1863:
      paramf.setContent(paramMallTransactionObject.nEo);
      localArrayList.add(paramf);
      break label1330;
      label1883:
      i = 1;
      break label1345;
      label1889:
      paramf = new h(paramContext);
      paramf.nGV = true;
      paramf.iSM = false;
      localArrayList.add(paramf);
      break label1416;
      label1920:
      paramf.nGZ = paramContext.getString(a.i.tdz);
      break label1486;
      label1934:
      if (!bg.nm(paramMallTransactionObject.nEC))
      {
        paramf.nGZ = paramMallTransactionObject.nEC;
        paramf.nHa = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6649012027392L, 49539);
            a.a(paramContext, paramMallTransactionObject.nEB, paramMallTransactionObject);
            GMTrace.o(6649012027392L, 49539);
          }
        };
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\ui\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */