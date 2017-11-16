package com.tencent.mm.plugin.brandservice.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.ah;
import com.tencent.mm.g.a.ah.a;
import com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI;
import com.tencent.mm.protocal.c.all;
import com.tencent.mm.protocal.c.in;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;

public final class c
{
  public static all CO()
  {
    GMTrace.i(10841302761472L, 80774);
    try
    {
      at.AR();
      Object localObject = (String)com.tencent.mm.y.c.xh().get(67591, null);
      if (localObject != null)
      {
        all localall = new all();
        localObject = ((String)localObject).split(",");
        localall.ujb = Integer.valueOf(localObject[0]).intValue();
        localall.uje = Integer.valueOf(localObject[1]).intValue();
        localall.tYz = (Integer.valueOf(localObject[2]).intValue() / 1000000.0F);
        localall.tYy = (Integer.valueOf(localObject[3]).intValue() / 1000000.0F);
        w.i("MicroMsg.BrandService.BrandServiceLogic", "lbs location is not null, %f, %f", new Object[] { Float.valueOf(localall.tYz), Float.valueOf(localall.tYy) });
        GMTrace.o(10841302761472L, 80774);
        return localall;
      }
      w.i("MicroMsg.BrandService.BrandServiceLogic", "lbs location is null, lbsContent is null!");
      GMTrace.o(10841302761472L, 80774);
      return null;
    }
    catch (Exception localException)
    {
      w.i("MicroMsg.BrandService.BrandServiceLogic", "lbs location is null, reason %s", new Object[] { localException.getMessage() });
      GMTrace.o(10841302761472L, 80774);
    }
    return null;
  }
  
  private static final class a
    implements e
  {
    private Context context;
    private String eBj;
    private long eBk;
    private boolean eBl;
    private int fromScene;
    private ah jsV;
    private int offset;
    private String title;
    
    public a(Context paramContext, String paramString1, long paramLong, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean, ah paramah)
    {
      GMTrace.i(10845195075584L, 80803);
      this.context = paramContext;
      this.eBj = paramString1;
      this.eBk = paramLong;
      this.offset = paramInt1;
      this.fromScene = paramInt2;
      this.title = paramString2;
      this.eBl = paramBoolean;
      this.jsV = paramah;
      GMTrace.o(10845195075584L, 80803);
    }
    
    private void dr(boolean paramBoolean)
    {
      GMTrace.i(10845463511040L, 80805);
      at.wS().b(1071, this);
      if ((this.jsV != null) && (this.jsV.eBh.eBm != null))
      {
        this.jsV.eBi.eBn = paramBoolean;
        this.jsV.eBh.eBm.run();
      }
      GMTrace.o(10845463511040L, 80805);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(10845329293312L, 80804);
      w.i("MicroMsg.BrandService.BrandServiceLogic", "errType (%d) , errCode (%d) , errMsg (errMsg)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        dr(false);
        GMTrace.o(10845329293312L, 80804);
        return;
      }
      if (paramk == null)
      {
        w.e("MicroMsg.BrandService.BrandServiceLogic", "scene is null.");
        dr(false);
        GMTrace.o(10845329293312L, 80804);
        return;
      }
      if (paramk.getType() != 1071)
      {
        w.i("MicroMsg.BrandService.BrandServiceLogic", "The NetScene is not a instanceof BizSearchDetailPage.");
        GMTrace.o(10845329293312L, 80804);
        return;
      }
      w.i("MicroMsg.BrandService.BrandServiceLogic", "BizSearchDetailPage.");
      paramString = ((h)paramk).aif();
      if ((paramString == null) || (paramString.lSa == null))
      {
        w.e("MicroMsg.BrandService.BrandServiceLogic", "response or BusinessContent or itemList is null.");
        dr(false);
        GMTrace.o(10845329293312L, 80804);
        return;
      }
      w.d("MicroMsg.BrandService.BrandServiceLogic", "searchId : %s.", new Object[] { paramString.tXx });
      paramk = new Intent(this.context, BizSearchDetailPageUI.class);
      paramk.putExtra("addContactScene", 35);
      paramk.putExtra("fromScene", this.fromScene);
      paramk.putExtra("keyword", this.eBj);
      paramk.putExtra("businessType", this.eBk);
      paramk.putExtra("offset", this.offset);
      paramk.putExtra("title", this.title);
      paramk.putExtra("showEditText", this.eBl);
      try
      {
        paramk.putExtra("result", paramString.toByteArray());
        if (!(this.context instanceof Activity)) {
          paramk.addFlags(268435456);
        }
        dr(true);
        GMTrace.o(10845329293312L, 80804);
        return;
      }
      catch (Exception paramString)
      {
        paramString = paramString;
        dr(false);
        w.printErrStackTrace("MicroMsg.BrandService.BrandServiceLogic", paramString, "", new Object[0]);
        GMTrace.o(10845329293312L, 80804);
        return;
      }
      finally {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */