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
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.bgp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.a.d.i;

public final class be
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
  
  public be(MMActivity paramMMActivity)
  {
    GMTrace.i(8719052046336L, 64962);
    this.eSd = "";
    this.appName = "";
    this.pTk = false;
    this.pTl = false;
    this.pTm = null;
    this.pUm = "";
    this.pPR = null;
    this.ezR = paramMMActivity;
    GMTrace.o(8719052046336L, 64962);
  }
  
  public final void G(Bundle paramBundle)
  {
    GMTrace.i(8719186264064L, 64963);
    this.pPR = b.q(this.ezR.getIntent());
    this.pUm = this.ezR.getIntent().getStringExtra("Kdescription");
    this.eSd = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.pTk = this.ezR.getIntent().getBooleanExtra("KThrid_app", false);
    this.pTl = this.ezR.getIntent().getBooleanExtra("KSnsAction", false);
    this.pPL = this.ezR.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.pTm = new SendMessageToWX.Req(this.ezR.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
    GMTrace.o(8719186264064L, 64963);
  }
  
  public final void H(Bundle paramBundle)
  {
    GMTrace.i(8719320481792L, 64964);
    GMTrace.o(8719320481792L, 64964);
  }
  
  public final boolean a(int paramInt1, int paramInt2, i parami, String paramString1, List<String> paramList1, amc paramamc, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8719723134976L, 64967);
    ae.biZ();
    paramString1 = av.a(this.pTm, paramString1, this.eSd, this.appName);
    if (paramString1 == null)
    {
      w.e("MicroMsg.TextWidget", "packHelper == null, %s, %s", new Object[] { this.eSd, this.appName });
      GMTrace.o(8719723134976L, 64967);
      return false;
    }
    paramPInt.value = paramString1.iZe;
    if (paramInt3 > a.poV) {
      paramString1.uA(4);
    }
    paramString1.uE(this.pPL);
    if (this.pTk) {
      paramString1.uE(5);
    }
    paramPInt = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      paramString2 = s.At();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        String str = (String)paramList1.next();
        if (!paramString2.contains(str))
        {
          bgp localbgp = new bgp();
          localbgp.jhi = str;
          paramPInt.add(localbgp);
        }
      }
    }
    paramString1.ak(paramPInt);
    if (parami != null) {
      paramString1.dH(parami.token, parami.uDu);
    }
    paramString1.a(paramamc);
    if (paramBoolean) {
      paramString1.uF(1);
    }
    for (;;)
    {
      paramString1.bv(paramList2);
      paramString1.d(null, null, null, paramInt4, paramInt5);
      if ((this.pTl) && (this.pTm != null))
      {
        paramString1.HJ(this.pTm.mediaTagName);
        paramString1.U(this.eSd, this.pTm.messageExt, this.pTm.messageAction);
      }
      paramInt1 = paramString1.commit();
      if (this.pPR != null)
      {
        this.pPR.hc(paramInt1);
        e.pBV.b(this.pPR);
      }
      ae.biZ().bhR();
      this.ezR.finish();
      GMTrace.o(8719723134976L, 64967);
      return false;
      paramString1.uF(0);
    }
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8719857352704L, 64968);
    GMTrace.o(8719857352704L, 64968);
    return false;
  }
  
  public final boolean bmT()
  {
    GMTrace.i(8719454699520L, 64965);
    GMTrace.o(8719454699520L, 64965);
    return true;
  }
  
  public final View bmU()
  {
    GMTrace.i(8719588917248L, 64966);
    GMTrace.o(8719588917248L, 64966);
    return null;
  }
  
  public final boolean bmV()
  {
    GMTrace.i(8719991570432L, 64969);
    GMTrace.o(8719991570432L, 64969);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */