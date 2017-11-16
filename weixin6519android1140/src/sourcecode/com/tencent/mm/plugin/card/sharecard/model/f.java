package com.tencent.mm.plugin.card.sharecard.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ann;
import com.tencent.mm.protocal.c.ano;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jAZ;
  public String jxs;
  public int jxt;
  public String jxu;
  public int jxv;
  public String jxw;
  
  public f(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5060947869696L, 37707);
    this.jxt = 0;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ann();
    ((b.a)localObject).gtG = new ano();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/marksharecard";
    ((b.a)localObject).gtE = 907;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ann)this.fUa.gtC.gtK;
    ((ann)localObject).eTJ = paramString;
    ((ann)localObject).uCr = paramInt2;
    ((ann)localObject).uCq = paramInt1;
    ((ann)localObject).scene = paramInt3;
    this.jAZ = paramString;
    GMTrace.o(5060947869696L, 37707);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5061350522880L, 37710);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5061350522880L, 37710);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5061082087424L, 37708);
    w.i("MicroMsg.NetSceneMarkShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(907), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ano)this.fUa.gtD.gtK;
      w.i("MicroMsg.NetSceneMarkShareCard", "json_ret:" + paramq.jzG);
      paramq = paramq.jzG;
      if (!TextUtils.isEmpty(paramq)) {
        break label135;
      }
      w.e("MicroMsg.NetSceneMarkShareCard", "parseJson json_ret is empty!");
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5061082087424L, 37708);
      return;
      try
      {
        label135:
        paramq = new JSONObject(paramq);
        this.jxs = paramq.optString("mark_user");
        this.jxt = paramq.optInt("mark_succ", 0);
        this.jxu = paramq.optString("mark_card_id");
        this.jxv = paramq.optInt("expire_time", 0);
        this.jxw = paramq.optString("pay_qrcode_wording");
      }
      catch (JSONException paramq)
      {
        w.printErrStackTrace("MicroMsg.NetSceneMarkShareCard", paramq, "", new Object[0]);
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(15361084751872L, 114449);
    GMTrace.o(15361084751872L, 114449);
    return 907;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */