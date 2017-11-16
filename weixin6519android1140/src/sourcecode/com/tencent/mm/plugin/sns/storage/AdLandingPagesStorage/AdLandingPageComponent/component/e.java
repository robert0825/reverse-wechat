package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e
  extends a
{
  private List<i> pDW;
  private com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e pGJ;
  private h pGK;
  
  public e(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e parame, ViewGroup paramViewGroup)
  {
    super(paramContext, parame, paramViewGroup);
    GMTrace.i(8220164751360L, 61245);
    this.pGJ = parame;
    this.pDW = new ArrayList();
    GMTrace.o(8220164751360L, 61245);
  }
  
  public final void O(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8220835840000L, 61250);
    super.O(paramInt1, paramInt2, paramInt3);
    Iterator localIterator = this.pDW.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).O(paramInt1, paramInt2, paramInt3);
    }
    GMTrace.o(8220835840000L, 61250);
  }
  
  protected final void bkI()
  {
    GMTrace.i(8220298969088L, 61246);
    if (this.pGK == null)
    {
      this.pGK = new h(this.pGJ.pDW, this.context, 0, (FrameLayout)this.hqF);
      this.pGK.layout();
      GMTrace.o(8220298969088L, 61246);
      return;
    }
    this.pGK.bx(this.pGJ.pDW);
    GMTrace.o(8220298969088L, 61246);
  }
  
  protected final View bkJ()
  {
    GMTrace.i(8220433186816L, 61247);
    FrameLayout localFrameLayout = new FrameLayout(this.context);
    GMTrace.o(8220433186816L, 61247);
    return localFrameLayout;
  }
  
  public final void bkl()
  {
    GMTrace.i(8220970057728L, 61251);
    super.bkl();
    Iterator localIterator = this.pDW.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).bkl();
    }
    GMTrace.o(8220970057728L, 61251);
  }
  
  public final void bkm()
  {
    GMTrace.i(8220567404544L, 61248);
    super.bkm();
    Iterator localIterator = this.pDW.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).bkm();
    }
    GMTrace.o(8220567404544L, 61248);
  }
  
  public final void bkn()
  {
    GMTrace.i(8220701622272L, 61249);
    super.bkn();
    Iterator localIterator = this.pDW.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).bkn();
    }
    GMTrace.o(8220701622272L, 61249);
  }
  
  public final boolean q(JSONArray paramJSONArray)
  {
    GMTrace.i(8221104275456L, 61252);
    Object localObject = new JSONObject();
    if (super.L((JSONObject)localObject)) {
      paramJSONArray.put(localObject);
    }
    localObject = this.pDW.iterator();
    while (((Iterator)localObject).hasNext())
    {
      i locali = (i)((Iterator)localObject).next();
      JSONObject localJSONObject = new JSONObject();
      if ((locali != null) && (locali.L(localJSONObject))) {
        paramJSONArray.put(localJSONObject);
      }
    }
    GMTrace.o(8221104275456L, 61252);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */