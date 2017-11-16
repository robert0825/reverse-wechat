package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.d;
import com.tencent.mm.af.e;
import com.tencent.mm.af.x;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bai;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.ui.e.a;

public final class c
{
  public static void a(Intent paramIntent, bai parambai, int paramInt)
  {
    GMTrace.i(1137495244800L, 8475);
    String str = n.a(parambai.ufy);
    paramIntent.putExtra("Contact_User", str);
    paramIntent.putExtra("Contact_Nick", n.a(parambai.uxT));
    paramIntent.putExtra("Contact_PyInitial", n.a(parambai.ufo));
    paramIntent.putExtra("Contact_QuanPin", n.a(parambai.ufp));
    paramIntent.putExtra("Contact_Alias", parambai.gCC);
    paramIntent.putExtra("Contact_Sex", parambai.gCx);
    paramIntent.putExtra("Contact_VUser_Info", parambai.uAw);
    paramIntent.putExtra("Contact_VUser_Info_Flag", parambai.uAv);
    paramIntent.putExtra("Contact_KWeibo_flag", parambai.uAz);
    paramIntent.putExtra("Contact_KWeibo", parambai.uAx);
    paramIntent.putExtra("Contact_KWeiboNick", parambai.uAy);
    paramIntent.putExtra("Contact_Scene", paramInt);
    paramIntent.putExtra("Contact_KHideExpose", true);
    paramIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.ai(parambai.gCG, parambai.gCy, parambai.gCz));
    paramIntent.putExtra("Contact_Signature", parambai.gCA);
    paramIntent.putExtra("Contact_BrandList", parambai.gCH);
    paramIntent.putExtra("Contact_KSnsIFlag", parambai.uAB.gCI);
    paramIntent.putExtra("Contact_KSnsBgId", parambai.uAB.gCK);
    paramIntent.putExtra("Contact_KSnsBgUrl", parambai.uAB.gCJ);
    paramIntent.putExtra(e.a.vGE, parambai.uoe);
    w.i("MicroMsg.BuildContactInfoIntent", "[tomys] anti, content: %s", new Object[] { parambai.uoe });
    paramIntent = new d();
    paramIntent.field_username = str;
    paramIntent.field_brandList = parambai.gCH;
    parambai = parambai.uAC;
    if (parambai != null)
    {
      paramIntent.field_brandFlag = parambai.gCL;
      paramIntent.field_brandInfo = parambai.gCN;
      paramIntent.field_extInfo = parambai.gCM;
      paramIntent.field_brandIconURL = parambai.gCO;
    }
    if (!x.FG().e(paramIntent)) {
      x.FG().d(paramIntent);
    }
    GMTrace.o(1137495244800L, 8475);
  }
  
  public static void a(Intent paramIntent, bak parambak, int paramInt)
  {
    GMTrace.i(1137361027072L, 8474);
    String str = n.a(parambak.ufy);
    paramIntent.putExtra("Contact_User", str);
    paramIntent.putExtra("Contact_Nick", n.a(parambak.uxT));
    paramIntent.putExtra("Contact_PyInitial", n.a(parambak.ufo));
    paramIntent.putExtra("Contact_QuanPin", n.a(parambak.ufp));
    paramIntent.putExtra("Contact_Alias", parambak.gCC);
    paramIntent.putExtra("Contact_Sex", parambak.gCx);
    paramIntent.putExtra("Contact_VUser_Info", parambak.uAw);
    paramIntent.putExtra("Contact_VUser_Info_Flag", parambak.uAv);
    paramIntent.putExtra("Contact_KWeibo_flag", parambak.uAz);
    paramIntent.putExtra("Contact_KWeibo", parambak.uAx);
    paramIntent.putExtra("Contact_KWeiboNick", parambak.uAy);
    paramIntent.putExtra("Contact_Scene", paramInt);
    paramIntent.putExtra("Contact_KHideExpose", true);
    paramIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.ai(parambak.gCG, parambak.gCy, parambak.gCz));
    paramIntent.putExtra("Contact_Signature", parambak.gCA);
    paramIntent.putExtra("Contact_BrandList", parambak.gCH);
    paramIntent.putExtra("Contact_KSnsIFlag", parambak.uAB.gCI);
    paramIntent.putExtra("Contact_KSnsBgId", parambak.uAB.gCK);
    paramIntent.putExtra("Contact_KSnsBgUrl", parambak.uAB.gCJ);
    paramIntent.putExtra("Contact_BIZ_KF_WORKER_ID", parambak.uOh);
    paramIntent.putExtra(e.a.vGE, parambak.uoe);
    w.i("MicroMsg.BuildContactInfoIntent", "[tomys] anti, content: %s", new Object[] { parambak.uoe });
    paramIntent = new d();
    paramIntent.field_username = str;
    paramIntent.field_brandList = parambak.gCH;
    paramIntent.field_kfWorkerId = parambak.uOh;
    parambak = parambak.uAC;
    if (parambak != null)
    {
      paramIntent.field_brandFlag = parambak.gCL;
      paramIntent.field_brandInfo = parambak.gCN;
      paramIntent.field_extInfo = parambak.gCM;
      paramIntent.field_brandIconURL = parambak.gCO;
    }
    if (!x.FG().e(paramIntent)) {
      x.FG().d(paramIntent);
    }
    GMTrace.o(1137361027072L, 8474);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */