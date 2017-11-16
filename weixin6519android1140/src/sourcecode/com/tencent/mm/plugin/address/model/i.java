package com.tencent.mm.plugin.address.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ags;
import com.tencent.mm.protocal.c.azv;
import com.tencent.mm.protocal.c.azw;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.LinkedList;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public azw huo;
  
  public i(com.tencent.mm.plugin.o.a.b paramb)
  {
    GMTrace.i(15201097220096L, 113257);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new azv();
    ((b.a)localObject).gtG = new azw();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/saveinfo";
    ((b.a)localObject).gtE = 1180;
    this.fUa = ((b.a)localObject).DA();
    localObject = (azv)this.fUa.gtC.gtK;
    ((azv)localObject).cfz = 2;
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder("{\"user_uin\":");
    at.AR();
    localStringBuilder1.append(c.ww() + " ,\"user_data_list\": [");
    if (paramb.type.equals("0")) {
      localStringBuilder1.append("{\"group_key\": \"invoice_info\",\"group_info\": {\"group_id\": " + paramb.mhQ + ",\"field_list\": [{\"key\": \"type\",\"value\": \"" + paramb.type + "\"},{\"key\": \"title\",\"value\": \"" + paramb.title + "\"},{\"key\": \"tax_number\",\"value\": \"" + paramb.mhS + "\"},{\"key\": \"bank_number\",\"value\": \"" + paramb.mhT + "\"},{\"key\": \"phone\",\"value\": \"" + paramb.mhW + "\"},{\"key\": \"company_address_detail\",\"value\": \"" + paramb.mhY + "\"},{\"key\": \"bank_name\",\"value\": \"" + paramb.mhU + "\"}]}}");
    }
    for (;;)
    {
      localStringBuilder1.append("]}");
      ((azv)localObject).uuj = localStringBuilder1.toString();
      GMTrace.o(15201097220096L, 113257);
      return;
      localStringBuilder1.append("{\"group_key\": \"invoice_info\",\"group_info\": {\"group_id\": " + paramb.mhQ + ",\"field_list\": [{\"key\": \"type\",\"value\": \"" + paramb.type + "\"},{\"key\": \"title\",\"value\": \"" + paramb.mhR + "\"},{\"key\": \"phone\",\"value\": \"" + paramb.mhX + "\"},{\"key\": \"email\",\"value\": \"" + paramb.fjd + "\"}]}}");
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(15201499873280L, 113260);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(15201499873280L, 113260);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(15201231437824L, 113258);
    w.d("MicroMsg.NetSceneSaveUserAutoFillInfo", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.huo = ((azw)((com.tencent.mm.ad.b)paramq).gtD.gtK);
      if ((this.huo != null) && (this.huo.uNV != null) && (this.huo.uNV.size() > 0) && (this.huo.uNV.get(0) != null)) {
        w.i("MicroMsg.NetSceneSaveUserAutoFillInfo", "resp groupId is.." + ((ags)this.huo.uNV.get(0)).ufO);
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(15201231437824L, 113258);
  }
  
  public final int getType()
  {
    GMTrace.i(15201365655552L, 113259);
    GMTrace.o(15201365655552L, 113259);
    return 1180;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */