package com.tencent.mm.plugin.address.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ael;
import com.tencent.mm.protocal.c.aem;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b()
  {
    GMTrace.i(15200560349184L, 113253);
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
    GMTrace.o(15200560349184L, 113253);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(15200963002368L, 113256);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(15200963002368L, 113256);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(15200694566912L, 113254);
    w.d("MicroMsg.NetSceneGetUserAutoFillInfo", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      com.tencent.mm.plugin.address.a.a.QN().hui = new com.tencent.mm.plugin.o.a.a();
      w.i("MicroMsg.NetSceneGetUserAutoFillInfo", "return is 0.now we resetList and parse the json ..");
      paramq = (aem)((com.tencent.mm.ad.b)paramq).gtD.gtK;
      w.i("MicroMsg.NetSceneGetUserAutoFillInfo", "resp json is.." + paramq.uuj);
      if (paramq.uuj == null) {}
    }
    for (;;)
    {
      int j;
      try
      {
        paramq = new JSONObject(paramq.uuj).getJSONArray("user_data_list").getJSONObject(0).getJSONArray("group_info_list");
        if ((paramq == null) || (paramq.length() <= 0)) {
          break label883;
        }
        i = 0;
        paramInt1 = paramq.length();
        if (i >= paramInt1) {
          break label883;
        }
        try
        {
          localObject = paramq.getJSONObject(i);
          paramArrayOfByte = new com.tencent.mm.plugin.o.a.b();
          paramArrayOfByte.mhQ = ((JSONObject)localObject).getInt("group_id");
          paramArrayOfByte.mhZ = ((JSONObject)localObject).getString("invoice_url");
          w.i("MicroMsg.NetSceneGetUserAutoFillInfo", "get groupid:" + ((JSONObject)localObject).getInt("group_id") + "get invoiceUrl:" + ((JSONObject)localObject).getString("invoice_url"));
          localObject = ((JSONObject)localObject).getJSONArray("field_list");
          if ((localObject == null) || (((JSONArray)localObject).length() <= 0)) {
            continue;
          }
          j = 0;
          if (j >= ((JSONArray)localObject).length()) {
            continue;
          }
          localJSONObject = ((JSONArray)localObject).getJSONObject(j);
          str = localJSONObject.getString("key");
          paramInt1 = -1;
          switch (str.hashCode())
          {
          case 110371416: 
            if (!str.equals("title")) {
              break label906;
            }
            paramInt1 = 0;
          }
        }
        catch (JSONException paramArrayOfByte)
        {
          String str;
          w.e("MicroMsg.NetSceneGetUserAutoFillInfo", "parse error for no." + i);
          i += 1;
        }
        if (!str.equals("tax_number")) {
          break label906;
        }
        paramInt1 = 1;
      }
      catch (JSONException paramq)
      {
        int i;
        Object localObject;
        JSONObject localJSONObject;
        w.e("MicroMsg.NetSceneGetUserAutoFillInfo", "error parse this json");
      }
      if (str.equals("bank_name"))
      {
        paramInt1 = 2;
        break label906;
        if (str.equals("bank_number"))
        {
          paramInt1 = 3;
          break label906;
          if (str.equals("type"))
          {
            paramInt1 = 4;
            break label906;
            if (str.equals("email"))
            {
              paramInt1 = 5;
              break label906;
              if (str.equals("phone"))
              {
                paramInt1 = 6;
                break label906;
                if (str.equals("company_address_detail"))
                {
                  paramInt1 = 7;
                  break label906;
                  paramArrayOfByte.title = localJSONObject.getString("value");
                  break label952;
                  continue;
                  paramArrayOfByte.mhS = localJSONObject.getString("value");
                  break label952;
                  paramArrayOfByte.mhU = localJSONObject.getString("value");
                  break label952;
                  paramArrayOfByte.mhT = localJSONObject.getString("value");
                  break label952;
                  paramArrayOfByte.type = localJSONObject.getString("value");
                  break label952;
                  paramArrayOfByte.fjd = localJSONObject.getString("value");
                  break label952;
                  paramArrayOfByte.mhW = localJSONObject.getString("value");
                  paramArrayOfByte.mhX = localJSONObject.getString("value");
                  break label952;
                  paramArrayOfByte.mhY = localJSONObject.getString("value");
                  break label952;
                  localObject = com.tencent.mm.plugin.address.a.a.QN();
                  if ((paramArrayOfByte.type != null) && (paramArrayOfByte.type.equals("0")))
                  {
                    paramArrayOfByte.mhR = "";
                    paramArrayOfByte.mhX = "";
                    paramArrayOfByte.fjd = "";
                    ((com.tencent.mm.plugin.address.b.a.a)localObject).hui.mhP.add(paramArrayOfByte);
                    w.i("MicroMsg.InvoiceMgr", "type is error..");
                    continue;
                  }
                  if ((paramArrayOfByte.type == null) || (!paramArrayOfByte.type.equals("1"))) {
                    continue;
                  }
                  paramArrayOfByte.mhR = paramArrayOfByte.title;
                  paramArrayOfByte.title = "";
                  paramArrayOfByte.mhW = "";
                  paramArrayOfByte.mhS = "";
                  paramArrayOfByte.mhT = "";
                  paramArrayOfByte.mhU = "";
                  paramArrayOfByte.mhY = "";
                  ((com.tencent.mm.plugin.address.b.a.a)localObject).hui.mhP.add(paramArrayOfByte);
                  continue;
                  label883:
                  this.fUd.a(paramInt2, paramInt3, paramString, this);
                  GMTrace.o(15200694566912L, 113254);
                  return;
                }
              }
            }
          }
        }
      }
      label906:
      switch (paramInt1)
      {
      }
      label952:
      j += 1;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(15200828784640L, 113255);
    GMTrace.o(15200828784640L, 113255);
    return 1191;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */