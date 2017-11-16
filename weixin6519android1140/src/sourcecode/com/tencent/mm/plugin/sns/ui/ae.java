package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.bgp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.a.d.i;

public final class ae
  implements z
{
  private String appName;
  private String eSd;
  private MMActivity ezR;
  private int pPL;
  private b pPR;
  private boolean pTk;
  private boolean pTl;
  private WXMediaMessage pTm;
  private String pUm;
  private boolean pUn;
  
  public ae(MMActivity paramMMActivity, boolean paramBoolean)
  {
    GMTrace.i(8639595151360L, 64370);
    this.eSd = "";
    this.appName = "";
    this.pTk = false;
    this.pTl = false;
    this.pTm = null;
    this.pUm = "";
    this.pUn = false;
    this.pPR = null;
    this.ezR = paramMMActivity;
    this.pUn = paramBoolean;
    GMTrace.o(8639595151360L, 64370);
  }
  
  public final void G(Bundle paramBundle)
  {
    GMTrace.i(8639729369088L, 64371);
    this.pPR = b.q(this.ezR.getIntent());
    this.pUm = this.ezR.getIntent().getStringExtra("Kdescription");
    this.eSd = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.pTk = this.ezR.getIntent().getBooleanExtra("KThrid_app", false);
    this.pTl = this.ezR.getIntent().getBooleanExtra("KSnsAction", false);
    this.pPL = this.ezR.getIntent().getIntExtra("Ksnsupload_source", 0);
    paramBundle = this.ezR.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (paramBundle != null) {
      this.pTm = new SendMessageToWX.Req(paramBundle).message;
    }
    GMTrace.o(8639729369088L, 64371);
  }
  
  public final void H(Bundle paramBundle)
  {
    GMTrace.i(8639863586816L, 64372);
    GMTrace.o(8639863586816L, 64372);
  }
  
  public final boolean a(int paramInt1, int paramInt2, i parami, String paramString1, List<String> paramList1, amc paramamc, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8640266240000L, 64375);
    if (this.ezR.isFinishing())
    {
      GMTrace.o(8640266240000L, 64375);
      return false;
    }
    paramString2 = new aw(2);
    paramPInt.value = paramString2.iZe;
    if (paramInt3 > a.poV) {
      paramString2.uA(2);
    }
    paramPInt = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      List localList = s.At();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        String str = (String)paramList1.next();
        if (!localList.contains(str))
        {
          bgp localbgp = new bgp();
          localbgp.jhi = str;
          paramPInt.add(localbgp);
        }
      }
    }
    if (paramBoolean) {
      paramString2.uF(1);
    }
    for (;;)
    {
      if (parami != null) {
        paramString2.dH(parami.token, parami.uDu);
      }
      paramString2.uE(this.pPL);
      if (this.pTk) {
        paramString2.uE(5);
      }
      if ((this.pTl) && (this.pTm != null))
      {
        paramString2.HJ(this.pTm.mediaTagName);
        paramString2.U(this.eSd, this.pTm.messageExt, this.pTm.messageAction);
      }
      paramString2.d(null, null, null, paramInt4, paramInt5);
      paramString2.HI(paramString1).a(paramamc).ak(paramPInt).uC(paramInt1).uD(paramInt2).bv(paramList2);
      paramInt1 = paramString2.commit();
      if (this.pPR != null)
      {
        this.pPR.hc(paramInt1);
        e.pBV.b(this.pPR);
      }
      this.ezR.setResult(-1);
      com.tencent.mm.plugin.sns.model.ae.biZ().bhR();
      this.ezR.finish();
      GMTrace.o(8640266240000L, 64375);
      return true;
      paramString2.uF(0);
    }
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8640400457728L, 64376);
    GMTrace.o(8640400457728L, 64376);
    return false;
  }
  
  public final boolean bmT()
  {
    GMTrace.i(8639997804544L, 64373);
    boolean bool = this.pUn;
    GMTrace.o(8639997804544L, 64373);
    return bool;
  }
  
  public final View bmU()
  {
    GMTrace.i(8640132022272L, 64374);
    GMTrace.o(8640132022272L, 64374);
    return null;
  }
  
  public final boolean bmV()
  {
    GMTrace.i(8640534675456L, 64377);
    GMTrace.o(8640534675456L, 64377);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */