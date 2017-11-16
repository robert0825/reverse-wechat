package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class p
  extends a
{
  private h pGK;
  LinearLayout pHT;
  
  public p(Context paramContext, r paramr, ViewGroup paramViewGroup)
  {
    super(paramContext, paramr, paramViewGroup);
    GMTrace.i(8264188166144L, 61573);
    GMTrace.o(8264188166144L, 61573);
  }
  
  public final void O(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(18581102264320L, 138440);
    super.O(paramInt1, paramInt2, paramInt3);
    Iterator localIterator = this.pGK.blp().iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).O(paramInt1, paramInt2, paramInt3);
    }
    GMTrace.o(18581102264320L, 138440);
  }
  
  protected final int aXW()
  {
    GMTrace.i(8264859254784L, 61578);
    int i = i.g.pfj;
    GMTrace.o(8264859254784L, 61578);
    return i;
  }
  
  public final View bkC()
  {
    GMTrace.i(8264725037056L, 61577);
    View localView = this.hqF;
    this.pHT = ((LinearLayout)localView.findViewById(i.f.pck));
    GMTrace.o(8264725037056L, 61577);
    return localView;
  }
  
  protected final void bkI()
  {
    GMTrace.i(8264590819328L, 61576);
    if (((r)this.pGS).pEy == 0) {
      this.pHT.setOrientation(1);
    }
    while (this.pGK == null)
    {
      this.pGK = new h(((r)this.pGS).pEx, this.context, ((r)this.pGS).bgColor, this.pHT);
      this.pGK.layout();
      GMTrace.o(8264590819328L, 61576);
      return;
      if (((r)this.pGS).pEy == 1) {
        this.pHT.setOrientation(0);
      }
    }
    this.pGK.bx(((r)this.pGS).pEx);
    GMTrace.o(8264590819328L, 61576);
  }
  
  public final void bkl()
  {
    GMTrace.i(18581236482048L, 138441);
    super.bkl();
    Iterator localIterator = this.pGK.blp().iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).bkl();
    }
    GMTrace.o(18581236482048L, 138441);
  }
  
  public final void bkm()
  {
    GMTrace.i(8264322383872L, 61574);
    super.bkm();
    Iterator localIterator = this.pGK.blp().iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).bkm();
    }
    GMTrace.o(8264322383872L, 61574);
  }
  
  public final void bkn()
  {
    GMTrace.i(8264456601600L, 61575);
    super.bkn();
    Iterator localIterator = this.pGK.blp().iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).bkn();
    }
    GMTrace.o(8264456601600L, 61575);
  }
  
  public final boolean q(JSONArray paramJSONArray)
  {
    GMTrace.i(18581370699776L, 138442);
    Object localObject = new JSONObject();
    if (super.L((JSONObject)localObject)) {
      paramJSONArray.put(localObject);
    }
    localObject = this.pGK.blp().iterator();
    while (((Iterator)localObject).hasNext())
    {
      i locali = (i)((Iterator)localObject).next();
      JSONObject localJSONObject = new JSONObject();
      if ((locali != null) && (locali.L(localJSONObject))) {
        paramJSONArray.put(localJSONObject);
      }
    }
    GMTrace.o(18581370699776L, 138442);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */