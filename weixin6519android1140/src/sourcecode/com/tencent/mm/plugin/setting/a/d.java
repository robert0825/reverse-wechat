package com.tencent.mm.plugin.setting.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ael;
import com.tencent.mm.protocal.c.aem;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public d()
  {
    GMTrace.i(15005810425856L, 111802);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ael();
    ((b.a)localObject).gtG = new aem();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo";
    ((b.a)localObject).gtE = 1191;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ael)this.fUa.gtC.gtK;
    ((ael)localObject).cfz = 2;
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add("invoice_info.title");
    localLinkedList.add("invoice_info.tax_number");
    localLinkedList.add("invoice_info.bank_number");
    localLinkedList.add("invoice_info.bank_name");
    localLinkedList.add("invoice_info.type");
    localLinkedList.add("invoice_info.email");
    localLinkedList.add("invoice_info.company_address");
    localLinkedList.add("invoice_info.company_address_detail");
    localLinkedList.add("invoice_info.company_address_postcode");
    localLinkedList.add("invoice_info.phone");
    ((ael)localObject).uui = localLinkedList;
    ((ael)localObject).uuh = false;
    GMTrace.o(15005810425856L, 111802);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(15006213079040L, 111805);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(15006213079040L, 111805);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(15005944643584L, 111803);
    w.d("MicroMsg.NetSceneGetUserAutoFillInfo", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      w.i("MicroMsg.NetSceneGetUserAutoFillInfo", "return is 0.now we parse the json and resetList..");
      paramq = (aem)((b)paramq).gtD.gtK;
      if (paramq.uuj == null) {}
    }
    try
    {
      boolean bool = new JSONObject(paramq.uuj).getBoolean("has_invoice_info");
      w.i("MicroMsg.NetSceneGetUserAutoFillInfo", "has_invoice_info is .." + bool);
      at.AR();
      c.xh().a(w.a.vxd, Boolean.valueOf(bool));
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(15005944643584L, 111803);
      return;
    }
    catch (JSONException paramq)
    {
      for (;;)
      {
        w.e("MicroMsg.NetSceneGetUserAutoFillInfo", "error parse this json");
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(15006078861312L, 111804);
    GMTrace.o(15006078861312L, 111804);
    return 1191;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */