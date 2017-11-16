package com.tencent.mm.plugin.wallet_index.c;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.g.a.gt.a;
import com.tencent.mm.g.a.lj;
import com.tencent.mm.g.a.lj.a;
import com.tencent.mm.g.a.ss;
import com.tencent.mm.kernel.b;
import com.tencent.mm.modelsimple.l;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.j;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d
  extends c<ss>
  implements e
{
  public int rsf;
  public int rsg;
  public gt rsh;
  public lj rsi;
  public long rsj;
  public c rsk;
  public c<lj> rsl;
  
  public d()
  {
    GMTrace.i(7567463940096L, 56382);
    this.rsg = 0;
    this.rsk = new c()
    {
      private boolean a(gt paramAnonymousgt)
      {
        int i = 0;
        GMTrace.i(7564913803264L, 56363);
        d.this.rsh = paramAnonymousgt;
        paramAnonymousgt = d.this.rsh.eJT.result;
        if (d.this.rsh.eJT.eJV != null) {
          d.this.rsg = d.this.rsh.eJT.eJV.getInt("pay_channel", 0);
        }
        switch (d.this.rsh.eJT.actionCode)
        {
        default: 
          GMTrace.o(7564913803264L, 56363);
          return false;
        case 12: 
          d locald = d.this;
          w.d("MicroMsg.WalletGetA8KeyRedirectListener", "startBind reqKey = " + paramAnonymousgt);
          String[] arrayOfString = paramAnonymousgt.replace("http://p.weixin.qq.com?", "").split("&");
          int j = arrayOfString.length;
          String str1 = null;
          paramAnonymousgt = null;
          Object localObject1 = null;
          if (i < j)
          {
            String str2 = arrayOfString[i];
            Object localObject3;
            Object localObject2;
            if (str2.startsWith("errcode="))
            {
              localObject3 = str2.replace("errcode=", "");
              localObject2 = paramAnonymousgt;
            }
            for (;;)
            {
              i += 1;
              paramAnonymousgt = (gt)localObject2;
              localObject1 = localObject3;
              break;
              if (str2.startsWith("errmsg="))
              {
                localObject2 = str2.replace("errmsg=", "");
                localObject3 = localObject1;
              }
              else
              {
                localObject2 = paramAnonymousgt;
                localObject3 = localObject1;
                if (str2.startsWith("importkey="))
                {
                  str1 = str2.replace("importkey=", "");
                  localObject2 = paramAnonymousgt;
                  localObject3 = localObject1;
                }
              }
            }
          }
          if (("0".equals(localObject1)) && (!bg.nm(str1)))
          {
            paramAnonymousgt = locald.rsh.eJT.context;
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("key_import_key", str1);
            ((Intent)localObject1).putExtra("key_bind_scene", 2);
            ((Intent)localObject1).putExtra("key_custom_bind_tips", null);
            com.tencent.mm.bj.d.b(paramAnonymousgt, "wallet", ".bind.ui.WalletBindUI", (Intent)localObject1);
            if (locald.rsh.eDO != null)
            {
              locald.rsh.eJU.ret = 1;
              locald.rsh.eDO.run();
            }
          }
          for (;;)
          {
            GMTrace.o(7564913803264L, 56363);
            return true;
            localObject1 = paramAnonymousgt;
            if (bg.nm(paramAnonymousgt)) {
              localObject1 = locald.rsh.eJT.context.getString(a.i.tgK);
            }
            com.tencent.mm.ui.base.h.a(locald.rsh.eJT.context, (String)localObject1, "", new d.6(locald));
          }
        }
        a.vgX.b(d.this);
        w.d("MicroMsg.WalletGetA8KeyRedirectListener", "ReqKey = " + paramAnonymousgt);
        if (paramAnonymousgt != null)
        {
          if (paramAnonymousgt.startsWith("weixin://wxpay"))
          {
            d.this.rsf = 4;
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(233, d.this);
            paramAnonymousgt = new l(paramAnonymousgt, d.this.rsh.eJT.username, 4, (int)System.currentTimeMillis(), new byte[0]);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousgt, 0);
            d.this.rsj = System.currentTimeMillis();
          }
          for (;;)
          {
            GMTrace.o(7564913803264L, 56363);
            return true;
            d.this.rsf = 1;
            d.this.ce(paramAnonymousgt, d.this.rsg);
          }
        }
        GMTrace.o(7564913803264L, 56363);
        return true;
      }
    };
    this.rsl = new c()
    {
      private boolean a(lj paramAnonymouslj)
      {
        GMTrace.i(7568403464192L, 56389);
        d.this.rsi = paramAnonymouslj;
        String str = paramAnonymouslj.ePF.url;
        int i = paramAnonymouslj.ePF.scene;
        int j = paramAnonymouslj.ePF.ePH;
        int k = paramAnonymouslj.ePF.eDi;
        if (paramAnonymouslj.ePF.aEe == null) {}
        for (paramAnonymouslj = "";; paramAnonymouslj = paramAnonymouslj.ePF.aEe)
        {
          d.this.rsf = 1;
          w.d("MicroMsg.WalletGetA8KeyRedirectListener", "auth native, url: %s, a8key_scene: %d, channel: %d, sourceType: %d, source: %s", new Object[] { str, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramAnonymouslj });
          paramAnonymouslj = new j(str, i, d.this.rsf, j, k, paramAnonymouslj);
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(385, d.this);
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymouslj, 0);
          GMTrace.o(7568403464192L, 56389);
          return false;
        }
      }
    };
    this.vhf = ss.class.getName().hashCode();
    GMTrace.o(7567463940096L, 56382);
  }
  
  private void g(int paramInt1, int paramInt2, long paramLong)
  {
    GMTrace.i(7567866593280L, 56385);
    int i = 132;
    if (this.rsf == 1) {
      i = 163;
    }
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(i);
    localIDKey1.SetValue(1L);
    localIDKey1.SetKey(26);
    localArrayList.add(localIDKey1);
    IDKey localIDKey2;
    IDKey localIDKey3;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      localIDKey1 = new IDKey();
      localIDKey1.SetID(i);
      localIDKey1.SetValue(1L);
      localIDKey2 = new IDKey();
      localIDKey2.SetID(i);
      localIDKey2.SetValue(1L);
      localIDKey1.SetKey(8);
      if (paramInt2 < 0) {
        localIDKey2.SetKey(9);
      }
    }
    else if ((this.rsf == 4) && (paramLong > 0L))
    {
      localIDKey1 = new IDKey();
      localIDKey1.SetID(i);
      localIDKey1.SetValue(1L);
      localIDKey2 = new IDKey();
      localIDKey2.SetID(i);
      localIDKey2.SetValue(1L);
      localIDKey3 = new IDKey();
      localIDKey3.SetID(i);
      localIDKey3.SetValue((int)paramLong);
      localIDKey1.SetKey(0);
      if (paramLong > 1000L) {
        break label306;
      }
      localIDKey2.SetKey(1);
      localIDKey3.SetKey(4);
    }
    for (;;)
    {
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      localArrayList.add(localIDKey3);
      com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
      GMTrace.o(7567866593280L, 56385);
      return;
      if (paramInt2 <= 0) {
        break;
      }
      localIDKey2.SetKey(10);
      break;
      label306:
      if ((paramLong > 1000L) && (paramLong <= 3000L))
      {
        localIDKey2.SetKey(2);
        localIDKey3.SetKey(5);
      }
      else if (paramLong > 3000L)
      {
        localIDKey2.SetKey(3);
        localIDKey3.SetKey(6);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7567598157824L, 56383);
    if ((paramk instanceof l))
    {
      long l = System.currentTimeMillis() - this.rsj;
      com.tencent.mm.plugin.report.service.g.ork.i(11170, new Object[] { Integer.valueOf(233), Integer.valueOf(0), Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(am.getNetType(ab.getContext())), "" });
      g(paramInt1, paramInt2, l);
      w.d("MicroMsg.WalletGetA8KeyRedirectListener", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.b(233, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        paramk = paramString;
        if (bg.nm(paramString)) {
          paramk = this.rsh.eJT.context.getString(a.i.tgK);
        }
        com.tencent.mm.ui.base.h.a(this.rsh.eJT.context, paramk, "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7566792851456L, 56377);
            if (d.this.rsh.eDO != null)
            {
              d.this.rsh.eJU.ret = 1;
              d.this.rsh.eDO.run();
            }
            GMTrace.o(7566792851456L, 56377);
          }
        });
        GMTrace.o(7567598157824L, 56383);
        return;
      }
      ce(((l)paramk).Lc(), this.rsg);
      GMTrace.o(7567598157824L, 56383);
      return;
    }
    if ((paramk instanceof j))
    {
      w.d("MicroMsg.WalletGetA8KeyRedirectListener", "native auth, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.b(385, this);
      if ((paramInt1 != 0) || (paramInt2 != 0) || (!"0".equals(((j)paramk).xEk)))
      {
        if (!bg.nm(paramString)) {}
        for (;;)
        {
          com.tencent.mm.ui.base.h.a(this.rsi.ePF.context, paramString, "", new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7563303190528L, 56351);
              if (d.this.rsi.eDO != null)
              {
                d.this.rsi.ePG.ret = 1;
                d.this.rsi.eDO.run();
              }
              GMTrace.o(7563303190528L, 56351);
            }
          });
          GMTrace.o(7567598157824L, 56383);
          return;
          if (!bg.nm(((j)paramk).jWP)) {
            paramString = ((j)paramk).jWP;
          } else {
            paramString = this.rsi.ePF.context.getString(a.i.tgK);
          }
        }
      }
      paramString = (j)paramk;
      paramk = new PayInfo();
      paramk.ePL = this.rsf;
      paramk.eHG = paramString.eHG;
      paramk.appId = paramString.appId;
      paramk.rse = paramString.rse;
      paramk.eEa = paramString.eEa;
      paramk.ePH = paramString.ePH;
      w.d("MicroMsg.WalletGetA8KeyRedirectListener", "startPay native, payInfo: %s", new Object[] { paramk.toString() });
      com.tencent.mm.pluginsdk.wallet.g.a(this.rsi.ePF.context, paramk, 0);
      if (this.rsi.eDO != null)
      {
        this.rsi.ePG.ret = 1;
        this.rsi.eDO.run();
      }
      GMTrace.o(7567598157824L, 56383);
      return;
    }
    w.i("MicroMsg.WalletGetA8KeyRedirectListener", "other scene");
    GMTrace.o(7567598157824L, 56383);
  }
  
  public final void ce(String paramString, int paramInt)
  {
    GMTrace.i(7567732375552L, 56384);
    w.d("MicroMsg.WalletGetA8KeyRedirectListener", "startPay reqKey = " + paramString);
    PayInfo localPayInfo = new PayInfo();
    localPayInfo.ePL = this.rsf;
    String[] arrayOfString = paramString.replace("http://p.qq.com?", "").split("&");
    int j = arrayOfString.length;
    paramString = null;
    Object localObject1 = null;
    int i = 0;
    String str1;
    if (i < j)
    {
      String str2 = arrayOfString[i];
      Object localObject2;
      if (str2.startsWith("errcode="))
      {
        localObject2 = str2.replace("errcode=", "");
        str1 = paramString;
      }
      for (;;)
      {
        i += 1;
        paramString = str1;
        localObject1 = localObject2;
        break;
        if (str2.startsWith("errmsg="))
        {
          str1 = str2.replace("errmsg=", "");
          localObject2 = localObject1;
        }
        else if (str2.startsWith("reqkey="))
        {
          localPayInfo.eHG = str2.replace("reqkey=", "");
          str1 = paramString;
          localObject2 = localObject1;
        }
        else if (str2.startsWith("uuid="))
        {
          localPayInfo.lOv = str2.replace("uuid=", "");
          str1 = paramString;
          localObject2 = localObject1;
        }
        else if (str2.startsWith("appid="))
        {
          localPayInfo.appId = str2.replace("appid=", "");
          str1 = paramString;
          localObject2 = localObject1;
        }
        else if (str2.startsWith("appsource="))
        {
          localPayInfo.rse = str2.replace("appsource=", "");
          str1 = paramString;
          localObject2 = localObject1;
        }
        else
        {
          str1 = paramString;
          localObject2 = localObject1;
          if (str2.startsWith("productid="))
          {
            localPayInfo.eEa = str2.replace("productid=", "");
            str1 = paramString;
            localObject2 = localObject1;
          }
        }
      }
    }
    localPayInfo.ePH = paramInt;
    if ("0".equals(localObject1))
    {
      com.tencent.mm.pluginsdk.wallet.g.a(this.rsh.eJT.context, localPayInfo, 0);
      if (this.rsh.eDO != null)
      {
        this.rsh.eJU.ret = 1;
        this.rsh.eDO.run();
      }
    }
    for (;;)
    {
      if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (Pattern.compile("[0-9]*").matcher((CharSequence)localObject1).matches())) {
        g(0, Integer.valueOf((String)localObject1).intValue(), 0L);
      }
      GMTrace.o(7567732375552L, 56384);
      return;
      str1 = paramString;
      if (bg.nm(paramString)) {
        str1 = this.rsh.eJT.context.getString(a.i.tgK);
      }
      com.tencent.mm.ui.base.h.a(this.rsh.eJT.context, str1, "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7565316456448L, 56366);
          if (d.this.rsh.eDO != null)
          {
            d.this.rsh.eJU.ret = 1;
            d.this.rsh.eDO.run();
          }
          GMTrace.o(7565316456448L, 56366);
        }
      });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */