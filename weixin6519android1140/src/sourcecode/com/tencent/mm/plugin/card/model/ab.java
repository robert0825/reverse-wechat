package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.yi;
import com.tencent.mm.protocal.c.yj;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jzG;
  public int jzS;
  public String jzT;
  public int jzU;
  public String jzV;
  
  public ab(LinkedList<jn> paramLinkedList, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2)
  {
    GMTrace.i(4909416054784L, 36578);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new yi();
    ((b.a)localObject).gtG = new yj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcardlistfromapp";
    ((b.a)localObject).gtE = 690;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (yi)this.fUa.gtC.gtK;
    ((yi)localObject).tNM = paramLinkedList;
    ((yi)localObject).eTL = paramInt1;
    ((yi)localObject).tQt = paramString1;
    ((yi)localObject).sign = paramString2;
    ((yi)localObject).tNI = paramString3;
    ((yi)localObject).tNH = paramString4;
    ((yi)localObject).upt = paramString5;
    ((yi)localObject).tNJ = paramInt2;
    GMTrace.o(4909416054784L, 36578);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4909684490240L, 36580);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4909684490240L, 36580);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4909818707968L, 36581);
    w.i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3 + " netType = 690");
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.jzG = ((yj)this.fUa.gtD.gtK).jzG;
      if (!TextUtils.isEmpty(this.jzG)) {
        break label111;
      }
      w.e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData json_ret is empty!");
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4909818707968L, 36581);
      return;
      try
      {
        label111:
        paramq = new JSONObject(this.jzG);
        this.jzS = paramq.optInt("accept_button_status", 0);
        this.jzT = paramq.optString("accept_button_wording");
        this.jzU = paramq.optInt("private_status", 0);
        this.jzV = paramq.optString("private_wording");
      }
      catch (JSONException paramq)
      {
        w.printErrStackTrace("MicroMsg.NetSceneGetCardListFromApp", paramq, "", new Object[0]);
        w.e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData:" + paramq.getMessage());
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4909550272512L, 36579);
    GMTrace.o(4909550272512L, 36579);
    return 690;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */